package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import java.util.UUID;
import net.minecraft.nbt.NBTUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(NBTUtil.class)
public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Redirect(method = "readGameProfileFromNBT", at = @At(value = "INVOKE", target = "Ljava/util/UUID;fromString(Ljava/lang/String;)Ljava/util/UUID;"))
   private static UUID lunar$parseUUID(String var0) {
      return fromString(var0);
   }

   private static UUID fromString(String var0) {
      if (var0 == null) {
         return null;
      }

      String[] var1 = var0.split("-");
      if (var1.length != 5) {
         throw new IllegalArgumentException("Invalid UUID string: " + var0);
      }

      for (int var2 = 0; var2 < 5; var2++) {
         var1[var2] = "0x" + var1[var2];
      }

      long var6 = Long.decode(var1[0]);
      var6 <<= 16;
      var6 |= Long.decode(var1[1]);
      var6 <<= 16;
      var6 |= Long.decode(var1[2]);
      long var4 = Long.decode(var1[3]);
      var4 <<= 48;
      var4 |= Long.decode(var1[4]);
      return new UUID(var6, var4);
   }
}
