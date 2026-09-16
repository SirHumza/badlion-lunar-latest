package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.item.EnumDyeColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(BlockShulkerBox.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Final
   @Shadow
   public EnumDyeColor color;

   public int bridge$getColor() {
      if (this.color == null) {
         return -6986091;
      }

      int var1 = this.color.getColorValue$v1_12();
      return var1 | 0xFF000000;
   }
}
