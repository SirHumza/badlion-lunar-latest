package io.sentry.cache;

import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.SentryCrashLastRunState;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.SessionEnd;
import io.sentry.hints.SessionStart;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public class EnvelopeCache extends CacheStrategy implements IEnvelopeCache {
   public static final String SUFFIX_ENVELOPE_FILE = ".envelope";
   public static final String PREFIX_CURRENT_SESSION_FILE = "session";
   public static final String PREFIX_PREVIOUS_SESSION_FILE = "previous_session";
   static final String SUFFIX_SESSION_FILE = ".json";
   public static final String CRASH_MARKER_FILE = "last_crash";
   public static final String NATIVE_CRASH_MARKER_FILE = ".sentry-native/last_crash";
   public static final String STARTUP_CRASH_MARKER_FILE = "startup_crash";
   private final CountDownLatch previousSessionLatch;
   @NotNull
   private final Map<SentryEnvelope, String> fileNameMap = new WeakHashMap<>();

   @NotNull
   public static IEnvelopeCache create(@NotNull SentryOptions var0) {
      String var1 = var0.getCacheDirPath();
      int var2 = var0.getMaxCacheItems();
      if (var1 == null) {
         var0.getLogger().log(SentryLevel.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache");
         return NoOpEnvelopeCache.getInstance();
      } else {
         return new EnvelopeCache(var0, var1, var2);
      }
   }

   public EnvelopeCache(@NotNull SentryOptions var1, @NotNull String var2, int var3) {
      super(var1, var2, var3);
      this.previousSessionLatch = new CountDownLatch(1);
   }

   @Override
   public void store(@NotNull SentryEnvelope var1, @NotNull Hint var2) {
      Objects.requireNonNull(var1, "Envelope is required.");
      this.rotateCacheIfNeeded(this.allEnvelopeFiles());
      File var3 = getCurrentSessionFile(this.directory.getAbsolutePath());
      File var4 = getPreviousSessionFile(this.directory.getAbsolutePath());
      if (HintUtils.hasType(var2, SessionEnd.class) && !var3.delete()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Current envelope doesn't exist.");
      }

      if (HintUtils.hasType(var2, AbnormalExit.class)) {
         this.tryEndPreviousSession(var2);
      }

      if (HintUtils.hasType(var2, SessionStart.class)) {
         if (var3.exists()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.");

            try {
               BufferedReader var5 = new BufferedReader(new InputStreamReader(new FileInputStream(var3), UTF_8));

               try {
                  Session var6 = this.serializer.getValue().deserialize(var5, Session.class);
                  if (var6 != null) {
                     this.writeSessionToDisk(var4, var6);
                  }
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
               this.options.getLogger().log(SentryLevel.ERROR, "Error processing session.", var10);
            }
         }

         this.updateCurrentSession(var3, var1);
         boolean var11 = false;
         File var13 = new File(this.options.getCacheDirPath(), ".sentry-native/last_crash");
         if (var13.exists()) {
            var11 = true;
         }

         if (!var11) {
            File var7 = new File(this.options.getCacheDirPath(), "last_crash");
            if (var7.exists()) {
               this.options.getLogger().log(SentryLevel.INFO, "Crash marker file exists, crashedLastRun will return true.");
               var11 = true;
               if (!var7.delete()) {
                  this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", var7.getAbsolutePath());
               }
            }
         }

         SentryCrashLastRunState.getInstance().setCrashedLastRun(var11);
         this.flushPreviousSession();
      }

      File var12 = this.getEnvelopeFile(var1);
      if (var12.exists()) {
         this.options.getLogger().log(SentryLevel.WARNING, "Not adding Envelope to offline storage because it already exists: %s", var12.getAbsolutePath());
      } else {
         this.options.getLogger().log(SentryLevel.DEBUG, "Adding Envelope to offline storage: %s", var12.getAbsolutePath());
         this.writeEnvelopeToDisk(var12, var1);
         if (HintUtils.hasType(var2, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            this.writeCrashMarkerFile();
         }
      }
   }

   private void tryEndPreviousSession(@NotNull Hint var1) {
      Object var2 = HintUtils.getSentrySdkHint(var1);
      if (var2 instanceof AbnormalExit) {
         File var3 = getPreviousSessionFile(this.directory.getAbsolutePath());
         if (var3.exists()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Previous session is not ended, we'd need to end it.");

            try {
               BufferedReader var4 = new BufferedReader(new InputStreamReader(new FileInputStream(var3), UTF_8));

               label71: {
                  try {
                     Session var5 = this.serializer.getValue().deserialize(var4, Session.class);
                     if (var5 != null) {
                        AbnormalExit var6 = (AbnormalExit)var2;
                        Long var7 = var6.timestamp();
                        Date var8 = null;
                        if (var7 != null) {
                           var8 = DateUtils.getDateTime(var7);
                           Date var9 = var5.getStarted();
                           if (var9 == null || var8.before(var9)) {
                              this.options
                                 .getLogger()
                                 .log(SentryLevel.WARNING, "Abnormal exit happened before previous session start, not ending the session.");
                              break label71;
                           }
                        }

                        String var13 = var6.mechanism();
                        var5.update(Session.State.Abnormal, null, true, var13);
                        var5.end(var8);
                        this.writeSessionToDisk(var3, var5);
                     }
                  } catch (Throwable var11) {
                     try {
                        var4.close();
                     } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                     }

                     throw var11;
                  }

                  var4.close();
                  return;
               }

               var4.close();
               return;
            } catch (Throwable var12) {
               this.options.getLogger().log(SentryLevel.ERROR, "Error processing previous session.", var12);
            }
         } else {
            this.options.getLogger().log(SentryLevel.DEBUG, "No previous session file to end.");
         }
      }
   }

   private void writeCrashMarkerFile() {
      File var1 = new File(this.options.getCacheDirPath(), "last_crash");

      try {
         FileOutputStream var2 = new FileOutputStream(var1);

         try {
            String var3 = DateUtils.getTimestamp(DateUtils.getCurrentDateTime());
            var2.write(var3.getBytes(UTF_8));
            var2.flush();
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
      } catch (Throwable var7) {
         this.options.getLogger().log(SentryLevel.ERROR, "Error writing the crash marker file to the disk", var7);
      }
   }

   private void updateCurrentSession(@NotNull File var1, @NotNull SentryEnvelope var2) {
      Iterable var3 = var2.getItems();
      if (var3.iterator().hasNext()) {
         SentryEnvelopeItem var4 = (SentryEnvelopeItem)var3.iterator().next();
         if (SentryItemType.Session.equals(var4.getHeader().getType())) {
            try {
               BufferedReader var5 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(var4.getData()), UTF_8));

               try {
                  Session var6 = this.serializer.getValue().deserialize(var5, Session.class);
                  if (var6 == null) {
                     this.options.getLogger().log(SentryLevel.ERROR, "Item of type %s returned null by the parser.", var4.getHeader().getType());
                  } else {
                     this.writeSessionToDisk(var1, var6);
                  }
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
               this.options.getLogger().log(SentryLevel.ERROR, "Item failed to process.", var10);
            }
         } else {
            this.options.getLogger().log(SentryLevel.INFO, "Current envelope has a different envelope type %s", var4.getHeader().getType());
         }
      } else {
         this.options.getLogger().log(SentryLevel.INFO, "Current envelope %s is empty", var1.getAbsolutePath());
      }
   }

   private void writeEnvelopeToDisk(@NotNull File var1, @NotNull SentryEnvelope var2) {
      if (var1.exists()) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Overwriting envelope to offline storage: %s", var1.getAbsolutePath());
         if (!var1.delete()) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", var1.getAbsolutePath());
         }
      }

      try {
         FileOutputStream var3 = new FileOutputStream(var1);

         try {
            this.serializer.getValue().serialize(var2, var3);
         } catch (Throwable var7) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         var3.close();
      } catch (Throwable var8) {
         this.options.getLogger().log(SentryLevel.ERROR, var8, "Error writing Envelope %s to offline storage", var1.getAbsolutePath());
      }
   }

   private void writeSessionToDisk(@NotNull File var1, @NotNull Session var2) {
      if (var1.exists()) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", var2.getSessionId());
         if (!var1.delete()) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", var1.getAbsolutePath());
         }
      }

      try {
         FileOutputStream var3 = new FileOutputStream(var1);

         try {
            BufferedWriter var4 = new BufferedWriter(new OutputStreamWriter(var3, UTF_8));

            try {
               this.serializer.getValue().serialize(var2, var4);
            } catch (Throwable var9) {
               try {
                  var4.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }

               throw var9;
            }

            var4.close();
         } catch (Throwable var10) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var10.addSuppressed(var7);
            }

            throw var10;
         }

         var3.close();
      } catch (Throwable var11) {
         this.options.getLogger().log(SentryLevel.ERROR, var11, "Error writing Session to offline storage: %s", var2.getSessionId());
      }
   }

   @Override
   public void discard(@NotNull SentryEnvelope var1) {
      Objects.requireNonNull(var1, "Envelope is required.");
      File var2 = this.getEnvelopeFile(var1);
      if (var2.exists()) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Discarding envelope from cache: %s", var2.getAbsolutePath());
         if (!var2.delete()) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete envelope: %s", var2.getAbsolutePath());
         }
      } else {
         this.options.getLogger().log(SentryLevel.DEBUG, "Envelope was not cached: %s", var2.getAbsolutePath());
      }
   }

   @NotNull
   private synchronized File getEnvelopeFile(@NotNull SentryEnvelope var1) {
      String var2;
      if (this.fileNameMap.containsKey(var1)) {
         var2 = this.fileNameMap.get(var1);
      } else {
         var2 = UUID.randomUUID() + ".envelope";
         this.fileNameMap.put(var1, var2);
      }

      return new File(this.directory.getAbsolutePath(), var2);
   }

   @NotNull
   public static File getCurrentSessionFile(@NotNull String var0) {
      return new File(var0, "session.json");
   }

   @NotNull
   public static File getPreviousSessionFile(@NotNull String var0) {
      return new File(var0, "previous_session.json");
   }

   @NotNull
   @Override
   public Iterator<SentryEnvelope> iterator() {
      File[] var1 = this.allEnvelopeFiles();
      ArrayList var2 = new ArrayList(var1.length);

      for (File var6 : var1) {
         try {
            BufferedInputStream var7 = new BufferedInputStream(new FileInputStream(var6));

            try {
               var2.add(this.serializer.getValue().deserializeEnvelope(var7));
            } catch (Throwable var11) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }

               throw var11;
            }

            var7.close();
         } catch (FileNotFoundException var12) {
            this.options
               .getLogger()
               .log(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", var6.getAbsolutePath());
         } catch (IOException var13) {
            this.options.getLogger().log(SentryLevel.ERROR, String.format("Error while reading cached envelope from file %s", var6.getAbsolutePath()), var13);
         }
      }

      return var2.iterator();
   }

   @NotNull
   private File[] allEnvelopeFiles() {
      if (this.isDirectoryValid()) {
         File[] var1 = this.directory.listFiles((var0, var1x) -> var1x.endsWith(".envelope"));
         if (var1 != null) {
            return var1;
         }
      }

      return new File[0];
   }

   public boolean waitPreviousSessionFlush() {
      try {
         return this.previousSessionLatch.await(this.options.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
         this.options.getLogger().log(SentryLevel.DEBUG, "Timed out waiting for previous session to flush.");
         return false;
      }
   }

   public void flushPreviousSession() {
      this.previousSessionLatch.countDown();
   }
}
