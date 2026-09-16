package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SystemOutLogger implements ILogger {
   @Override
   public void log(@NotNull SentryLevel var1, @NotNull String var2, @Nullable Object... var3) {
      System.out.println(String.format("%s: %s", var1, String.format(var2, var3)));
   }

   @Override
   public void log(@NotNull SentryLevel var1, @NotNull String var2, @Nullable Throwable var3) {
      if (var3 == null) {
         this.log(var1, var2);
      } else {
         System.out.println(String.format("%s: %s\n%s", var1, String.format(var2, var3.toString()), this.captureStackTrace(var3)));
      }
   }

   @Override
   public void log(@NotNull SentryLevel var1, @Nullable Throwable var2, @NotNull String var3, @Nullable Object... var4) {
      if (var2 == null) {
         this.log(var1, var3, var4);
      } else {
         System.out.println(String.format("%s: %s \n %s\n%s", var1, String.format(var3, var4), var2.toString(), this.captureStackTrace(var2)));
      }
   }

   @Override
   public boolean isEnabled(@Nullable SentryLevel var1) {
      return true;
   }

   @NotNull
   private String captureStackTrace(@NotNull Throwable var1) {
      StringWriter var2 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var2);
      var1.printStackTrace(var3);
      return var2.toString();
   }
}
