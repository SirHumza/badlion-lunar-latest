package io.sentry.cache;

import io.sentry.ISerializer;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.clientreport.DiscardReason;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class CacheStrategy {
   protected static final Charset UTF_8 = Charset.forName("UTF-8");
   @NotNull
   protected SentryOptions options;
   @NotNull
   protected final LazyEvaluator<ISerializer> serializer = new LazyEvaluator<>(() -> this.options.getSerializer());
   @NotNull
   protected final File directory;
   private final int maxSize;

   CacheStrategy(@NotNull SentryOptions var1, @NotNull String var2, int var3) {
      Objects.requireNonNull(var2, "Directory is required.");
      this.options = Objects.requireNonNull(var1, "SentryOptions is required.");
      this.directory = new File(var2);
      this.maxSize = var3;
   }

   protected boolean isDirectoryValid() {
      if (this.directory.isDirectory() && this.directory.canWrite() && this.directory.canRead()) {
         return true;
      }

      this.options.getLogger().log(SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", this.directory.getAbsolutePath());
      return false;
   }

   private void sortFilesOldestToNewest(@NotNull File[] var1) {
      if (var1.length > 1) {
         Arrays.sort(var1, (var0, var1x) -> Long.compare(var0.lastModified(), var1x.lastModified()));
      }
   }

   protected void rotateCacheIfNeeded(@NotNull File[] var1) {
      int var2 = var1.length;
      if (var2 >= this.maxSize) {
         this.options.getLogger().log(SentryLevel.WARNING, "Cache folder if full (respecting maxSize). Rotating files");
         int var3 = var2 - this.maxSize + 1;
         this.sortFilesOldestToNewest(var1);
         File[] var4 = Arrays.copyOfRange(var1, var3, var2);

         for (int var5 = 0; var5 < var3; var5++) {
            File var6 = var1[var5];
            this.moveInitFlagIfNecessary(var6, var4);
            if (!var6.delete()) {
               this.options.getLogger().log(SentryLevel.WARNING, "File can't be deleted: %s", var6.getAbsolutePath());
            }
         }
      }
   }

   private void moveInitFlagIfNecessary(@NotNull File var1, @NotNull File[] var2) {
      SentryEnvelope var3 = this.readEnvelope(var1);
      if (var3 != null && this.isValidEnvelope(var3)) {
         this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.CACHE_OVERFLOW, var3);
         Session var4 = this.getFirstSession(var3);
         if (var4 != null && this.isValidSession(var4)) {
            Boolean var5 = var4.getInit();
            if (var5 != null && var5) {
               for (File var9 : var2) {
                  SentryEnvelope var10 = this.readEnvelope(var9);
                  if (var10 != null && this.isValidEnvelope(var10)) {
                     SentryEnvelopeItem var11 = null;
                     Iterator var12 = var10.getItems().iterator();

                     while (var12.hasNext()) {
                        SentryEnvelopeItem var13 = (SentryEnvelopeItem)var12.next();
                        if (this.isSessionType(var13)) {
                           Session var14 = this.readSession(var13);
                           if (var14 != null && this.isValidSession(var14)) {
                              Boolean var15 = var14.getInit();
                              if (var15 != null && var15) {
                                 this.options.getLogger().log(SentryLevel.ERROR, "Session %s has 2 times the init flag.", var4.getSessionId());
                                 return;
                              }

                              if (var4.getSessionId() != null && var4.getSessionId().equals(var14.getSessionId())) {
                                 var14.setInitAsTrue();

                                 try {
                                    var11 = SentryEnvelopeItem.fromSession(this.serializer.getValue(), var14);
                                    var12.remove();
                                 } catch (IOException var17) {
                                    this.options
                                       .getLogger()
                                       .log(SentryLevel.ERROR, var17, "Failed to create new envelope item for the session %s", var4.getSessionId());
                                 }
                                 break;
                              }
                           }
                        }
                     }

                     if (var11 != null) {
                        SentryEnvelope var18 = this.buildNewEnvelope(var10, var11);
                        long var19 = var9.lastModified();
                        if (!var9.delete()) {
                           this.options.getLogger().log(SentryLevel.WARNING, "File can't be deleted: %s", var9.getAbsolutePath());
                        }

                        this.saveNewEnvelope(var18, var9, var19);
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   private SentryEnvelope readEnvelope(@NotNull File var1) {
      try {
         BufferedInputStream var2 = new BufferedInputStream(new FileInputStream(var1));

         SentryEnvelope var3;
         try {
            var3 = this.serializer.getValue().deserializeEnvelope(var2);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var3;
      } catch (IOException var7) {
         this.options.getLogger().log(SentryLevel.ERROR, "Failed to deserialize the envelope.", var7);
         return null;
      }
   }

   @Nullable
   private Session getFirstSession(@NotNull SentryEnvelope var1) {
      for (SentryEnvelopeItem var3 : var1.getItems()) {
         if (this.isSessionType(var3)) {
            return this.readSession(var3);
         }
      }

      return null;
   }

   private boolean isValidSession(@NotNull Session var1) {
      if (!var1.getStatus().equals(Session.State.Ok)) {
         return false;
      }

      UUID var2 = var1.getSessionId();
      return var2 != null;
   }

   private boolean isSessionType(@Nullable SentryEnvelopeItem var1) {
      return var1 == null ? false : var1.getHeader().getType().equals(SentryItemType.Session);
   }

   @Nullable
   private Session readSession(@NotNull SentryEnvelopeItem var1) {
      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(var1.getData()), UTF_8));

         Session var3;
         try {
            var3 = this.serializer.getValue().deserialize(var2, Session.class);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var3;
      } catch (Throwable var7) {
         this.options.getLogger().log(SentryLevel.ERROR, "Failed to deserialize the session.", var7);
         return null;
      }
   }

   private void saveNewEnvelope(@NotNull SentryEnvelope var1, @NotNull File var2, long var3) {
      try {
         FileOutputStream var5 = new FileOutputStream(var2);

         try {
            this.serializer.getValue().serialize(var1, var5);
            var2.setLastModified(var3);
         } catch (Throwable var9) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }

            throw var9;
         }

         var5.close();
      } catch (Throwable var10) {
         this.options.getLogger().log(SentryLevel.ERROR, "Failed to serialize the new envelope to the disk.", var10);
      }
   }

   @NotNull
   private SentryEnvelope buildNewEnvelope(@NotNull SentryEnvelope var1, @NotNull SentryEnvelopeItem var2) {
      ArrayList var3 = new ArrayList();

      for (SentryEnvelopeItem var5 : var1.getItems()) {
         var3.add(var5);
      }

      var3.add(var2);
      return new SentryEnvelope(var1.getHeader(), var3);
   }

   private boolean isValidEnvelope(@NotNull SentryEnvelope var1) {
      return var1.getItems().iterator().hasNext();
   }
}
