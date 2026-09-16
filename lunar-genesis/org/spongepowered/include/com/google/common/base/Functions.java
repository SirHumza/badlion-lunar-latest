package org.spongepowered.include.com.google.common.base;

public final class Functions {
   public static Function<Object, String> toStringFunction() {
      return Functions.ToStringFunction.INSTANCE;
   }

   private enum ToStringFunction implements Function<Object, String> {
      INSTANCE;

      public String apply(Object var1) {
         Preconditions.checkNotNull(var1);
         return var1.toString();
      }

      @Override
      public String toString() {
         return "Functions.toStringFunction()";
      }
   }
}
