package io.sentry;

import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class EnvelopeSender extends DirectoryProcessor implements IEnvelopeSender {
   @NotNull
   private final IHub hub;
   @NotNull
   private final ISerializer serializer;
   @NotNull
   private final ILogger logger;

   public EnvelopeSender(@NotNull IHub var1, @NotNull ISerializer var2, @NotNull ILogger var3, long var4, int var6) {
      super(var1, var3, var4, var6);
      this.hub = Objects.requireNonNull(var1, "Hub is required.");
      this.serializer = Objects.requireNonNull(var2, "Serializer is required.");
      this.logger = Objects.requireNonNull(var3, "Logger is required.");
   }

   @Override
   protected void processFile(@NotNull File var1, @NotNull Hint var2) {
      if (!var1.isFile()) {
         this.logger.log(SentryLevel.DEBUG, "'%s' is not a file.", var1.getAbsolutePath());
      } else if (!this.isRelevantFileName(var1.getName())) {
         this.logger.log(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", var1.getAbsolutePath());
      } else if (!var1.getParentFile().canWrite()) {
         this.logger.log(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", var1.getAbsolutePath());
      } else {
         try {
            BufferedInputStream var3 = new BufferedInputStream(new FileInputStream(var1));

            try {
               SentryEnvelope var4 = this.serializer.deserializeEnvelope(var3);
               if (var4 == null) {
                  this.logger.log(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", var1.getAbsolutePath());
               } else {
                  this.hub.captureEnvelope(var4, var2);
               }

               HintUtils.runIfHasTypeLogIfNot(var2, Flushable.class, this.logger, var1x -> {
                  if (!var1x.waitFlush()) {
                     this.logger.log(SentryLevel.WARNING, "Timed out waiting for envelope submission.");
                  }
               });
            } catch (Throwable var14) {
               try {
                  var3.close();
               } catch (Throwable var13) {
                  var14.addSuppressed(var13);
               }

               throw var14;
            }

            var3.close();
         } catch (FileNotFoundException var15) {
            this.logger.log(SentryLevel.ERROR, var15, "File '%s' cannot be found.", var1.getAbsolutePath());
         } catch (IOException var16) {
            this.logger.log(SentryLevel.ERROR, var16, "I/O on file '%s' failed.", var1.getAbsolutePath());
         } catch (Throwable var17) {
            this.logger.log(SentryLevel.ERROR, var17, "Failed to capture cached envelope %s", var1.getAbsolutePath());
            HintUtils.runIfHasTypeLogIfNot(var2, Retryable.class, this.logger, var3x -> {
               var3x.setRetry(false);
               this.logger.log(SentryLevel.INFO, var17, "File '%s' won't retry.", var1.getAbsolutePath());
            });
         } finally {
            HintUtils.runIfHasTypeLogIfNot(var2, Retryable.class, this.logger, var2x -> {
               if (!var2x.isRetry()) {
                  this.safeDelete(var1, "after trying to capture it");
                  this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", var1.getAbsolutePath());
               } else {
                  this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", var1.getAbsolutePath());
               }
            });
         }
      }
   }

   @Override
   protected boolean isRelevantFileName(@NotNull String var1) {
      return var1.endsWith(".envelope");
   }

   @Override
   public void processEnvelopeFile(@NotNull String var1, @NotNull Hint var2) {
      Objects.requireNonNull(var1, "Path is required.");
      this.processFile(new File(var1), var2);
   }

   private void safeDelete(@NotNull File var1, @NotNull String var2) {
      try {
         if (!var1.delete()) {
            this.logger.log(SentryLevel.ERROR, "Failed to delete '%s' %s", var1.getAbsolutePath(), var2);
         }
      } catch (Throwable var4) {
         this.logger.log(SentryLevel.ERROR, var4, "Failed to delete '%s' %s", var1.getAbsolutePath(), var2);
      }
   }
}
