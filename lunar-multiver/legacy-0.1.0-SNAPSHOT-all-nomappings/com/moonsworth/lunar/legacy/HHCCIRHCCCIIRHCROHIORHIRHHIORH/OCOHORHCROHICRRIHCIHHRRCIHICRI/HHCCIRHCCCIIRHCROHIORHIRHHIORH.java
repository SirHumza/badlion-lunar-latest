package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import net.minecraft.nbt.NBTTagString;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
@Mixin(NBTTagString.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Shadow
   public String data;

   @Override
   public String toString() {
      return quoteAndEscape(this.data);
   }

   private static String quoteAndEscape(String var0) {
      StringBuilder var1 = new StringBuilder("\"");

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == '\\' || var3 == '"') {
            var1.append('\\');
         }

         var1.append(var3);
      }

      return var1.append('"').toString();
   }
}
