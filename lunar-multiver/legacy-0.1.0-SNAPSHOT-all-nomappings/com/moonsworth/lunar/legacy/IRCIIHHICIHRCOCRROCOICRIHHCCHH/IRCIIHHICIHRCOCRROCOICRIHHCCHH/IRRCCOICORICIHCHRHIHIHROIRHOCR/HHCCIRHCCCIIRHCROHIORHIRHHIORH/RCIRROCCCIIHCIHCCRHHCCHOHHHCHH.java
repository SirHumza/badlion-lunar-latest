package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Item.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @ModifyReturnValue(method = "hasEffect", at = @At("RETURN"))
   private boolean apollo$hasGlintEffect(boolean var1, ItemStack var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var2
      );
      if (var3 == null) {
         return var1;
      } else {
         return var3.bridge$getInteger("glint") == 0 && var3.bridge$getString("glint").isEmpty() ? var1 : true;
      }
   }
}
