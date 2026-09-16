package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PreviousSessionFinalizer implements Runnable {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final IHub hub;

   PreviousSessionFinalizer(@NotNull SentryOptions var1, @NotNull IHub var2) {
      this.options = var1;
      this.hub = var2;
   }

   @Override
   public void run() {
      String var1 = this.options.getCacheDirPath();
      if (var1 == null) {
         this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not finalizing the previous session.");
      } else if (!this.options.isEnableAutoSessionTracking()) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.");
      } else {
         IEnvelopeCache var2 = this.options.getEnvelopeDiskCache();
         if (var2 instanceof EnvelopeCache && !((EnvelopeCache)var2).waitPreviousSessionFlush()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.");
         } else {
            File var3 = EnvelopeCache.getPreviousSessionFile(var1);
            ISerializer var4 = this.options.getSerializer();
            if (var3.exists()) {
               this.options.getLogger().log(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.");

               try {
                  BufferedReader var5 = new BufferedReader(new InputStreamReader(new FileInputStream(var3), UTF_8));

                  try {
                     Session var6 = var4.deserialize(var5, Session.class);
                     if (var6 == null) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", var3.getAbsolutePath());
                     } else {
                        Date var7 = null;
                        File var8 = new File(this.options.getCacheDirPath(), ".sentry-native/last_crash");
                        if (var8.exists()) {
                           this.options.getLogger().log(SentryLevel.INFO, "Crash marker file exists, last Session is gonna be Crashed.");
                           var7 = this.getTimestampFromCrashMarkerFile(var8);
                           if (!var8.delete()) {
                              this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", var8.getAbsolutePath());
                           }

                           var6.update(Session.State.Crashed, null, true);
                        }

                        if (var6.getAbnormalMechanism() == null) {
                           var6.end(var7);
                        }

                        SentryEnvelope var9 = SentryEnvelope.from(var4, var6, this.options.getSdkVersion());
                        this.hub.captureEnvelope(var9);
                     }
                  } catch (Throwable var11) {
                     try {
                        var5.close();
                     } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                     }

                     throw var11;
                  }

                  var5.close();
               } catch (Throwable var12) {
                  this.options.getLogger().log(SentryLevel.ERROR, "Error processing previous session.", var12);
               }

               if (!var3.delete()) {
                  this.options.getLogger().log(SentryLevel.WARNING, "Failed to delete the previous session file.");
               }
            }
         }
      }
   }

   @Nullable
   private Date getTimestampFromCrashMarkerFile(@NotNull File var1) {
      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1), UTF_8));

         Date var4;
         try {
            String var3 = var2.readLine();
            this.options.getLogger().log(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", var3);
            var4 = DateUtils.getDateTime(var3);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var4;
      } catch (IOException var7) {
         this.options.getLogger().log(SentryLevel.ERROR, "Error reading the crash marker file.", var7);
      } catch (IllegalArgumentException var8) {
         this.options.getLogger().log(SentryLevel.ERROR, var8, "Error converting the crash timestamp.");
      }

      return null;
   }
}
