package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.function.BiConsumer;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiYesNo.class)
public abstract class ROOCOCCCIRHHHIRIOIHHHHRHIICHHR
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public GuiYesNoCallback parentScreen;
   @Shadow
   public int parentButtonClickedId;

   public BiConsumer<Boolean, Integer> bridge$getYesNoCallback() {
      return (var1, var2) -> this.parentScreen.confirmClicked(var1, var2);
   }

   public int bridge$getParentButtonClickedId() {
      return this.parentButtonClickedId;
   }
}
