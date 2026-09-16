package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class MainThreadChecker implements IMainThreadChecker {
   private static final long mainThreadId = Thread.currentThread().getId();
   private static final MainThreadChecker instance = new MainThreadChecker();

   public static MainThreadChecker getInstance() {
      return instance;
   }

   private MainThreadChecker() {
   }

   @Override
   public boolean isMainThread(long var1) {
      return mainThreadId == var1;
   }

   @Override
   public boolean isMainThread(@NotNull Thread var1) {
      return this.isMainThread(var1.getId());
   }

   @Override
   public boolean isMainThread() {
      return this.isMainThread(Thread.currentThread());
   }

   @Override
   public boolean isMainThread(@NotNull SentryThread var1) {
      Long var2 = var1.getId();
      return var2 != null && this.isMainThread(var2);
   }
}
