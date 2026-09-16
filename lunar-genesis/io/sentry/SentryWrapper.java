package io.sentry;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public final class SentryWrapper {
   public static <U> Callable<U> wrapCallable(@NotNull Callable<U> var0) {
      IHub var1 = Sentry.getCurrentHub().clone();
      return () -> {
         IHub var2 = Sentry.getCurrentHub();
         Sentry.setCurrentHub(var1);

         try {
            return (U)var0.call();
         } finally {
            Sentry.setCurrentHub(var2);
         }
      };
   }

   public static <U> Supplier<U> wrapSupplier(@NotNull Supplier<U> var0) {
      IHub var1 = Sentry.getCurrentHub().clone();
      return () -> {
         IHub var2 = Sentry.getCurrentHub();
         Sentry.setCurrentHub(var1);

         try {
            return (U)var0.get();
         } finally {
            Sentry.setCurrentHub(var2);
         }
      };
   }
}
