package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ItemTool.class)
abstract class RHOCHHIRRCHHHOHOIRROIROHHHIHIO implements IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   @Shadow
   public ToolMaterial toolMaterial;

   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO lunar$getMaterial() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO)this.toolMaterial;
   }
}
