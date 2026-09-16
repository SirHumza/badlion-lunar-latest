package org.spongepowered.asm.mixin.transformer;

import java.util.Arrays;

public final class MixinHooks {
   private MixinHooks() {
   }

   public static Enum<?>[] concatEnumValues(Enum<?>[] var0, Enum<?>[] var1) {
      Enum[] var2 = Arrays.copyOf(var0, var0.length + var1.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return var2;
   }
}
