package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.gui.recipebook.GuiRecipeBook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiInventory.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Shadow
   public GuiRecipeBook recipeBookGui$v1_12;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Shadow
   public boolean widthTooNarrow$v1_12;

   public boolean bridge$isRecipeBookVisible() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && this.recipeBookGui$v1_12.isVisible();
   }

   public boolean bridge$isWidthTooNarrow() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && this.widthTooNarrow$v1_12;
   }
}
