package io.sentry;

import java.io.File;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SentryCrashLastRunState {
   private static final SentryCrashLastRunState INSTANCE = new SentryCrashLastRunState();
   private boolean readCrashedLastRun;
   @Nullable
   private Boolean crashedLastRun;
   @NotNull
   private final Object crashedLastRunLock = new Object();

   private SentryCrashLastRunState() {
   }

   public static SentryCrashLastRunState getInstance() {
      return INSTANCE;
   }

   @Nullable
   public Boolean isCrashedLastRun(@Nullable String var1, boolean var2) {
      synchronized (this.crashedLastRunLock) {
         if (this.readCrashedLastRun) {
            return this.crashedLastRun;
         }

         if (var1 == null) {
            return null;
         }

         this.readCrashedLastRun = true;
         File var4 = new File(var1, "last_crash");
         File var5 = new File(var1, ".sentry-native/last_crash");
         boolean var6 = false;

         try {
            if (var4.exists()) {
               var6 = true;
               var4.delete();
            } else if (var5.exists()) {
               var6 = true;
               if (var2) {
                  var5.delete();
               }
            }
         } catch (Throwable var9) {
         }

         this.crashedLastRun = var6;
      }

      return this.crashedLastRun;
   }

   public void setCrashedLastRun(boolean var1) {
      synchronized (this.crashedLastRunLock) {
         if (!this.readCrashedLastRun) {
            this.crashedLastRun = var1;
            this.readCrashedLastRun = true;
         }
      }
   }

   @TestOnly
   public void reset() {
      synchronized (this.crashedLastRunLock) {
         this.readCrashedLastRun = false;
         this.crashedLastRun = null;
      }
   }
}
