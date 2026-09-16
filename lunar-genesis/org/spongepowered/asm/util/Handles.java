package org.spongepowered.asm.util;

import org.objectweb.asm.Handle;

public final class Handles {
   private static final int[] H_OPCODES = new int[]{0, 180, 178, 181, 179, 182, 184, 183, 183, 185};

   private Handles() {
   }

   public static boolean isField(Handle var0) {
      switch (var0.getTag()) {
         case 1:
         case 2:
         case 3:
         case 4:
            return true;
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
            return false;
         default:
            throw new IllegalArgumentException("Invalid tag " + var0.getTag() + " for method handle " + var0 + ".");
      }
   }

   public static int opcodeFromTag(int var0) {
      return var0 >= 0 && var0 < H_OPCODES.length ? H_OPCODES[var0] : 0;
   }

   public static int tagFromOpcode(int var0) {
      for (int var1 = 1; var1 < H_OPCODES.length; var1++) {
         if (H_OPCODES[var1] == var0) {
            return var1;
         }
      }

      return 0;
   }
}
