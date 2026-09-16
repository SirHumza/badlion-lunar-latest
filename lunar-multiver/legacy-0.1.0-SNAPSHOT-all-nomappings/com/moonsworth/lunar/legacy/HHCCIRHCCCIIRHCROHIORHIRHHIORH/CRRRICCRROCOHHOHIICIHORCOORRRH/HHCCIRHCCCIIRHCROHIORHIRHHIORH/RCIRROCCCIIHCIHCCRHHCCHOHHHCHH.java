package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.gui.ChatLine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ChatLine.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   @Unique
   private int impl$id;
   @Unique
   private boolean impl$isAddedByApollo;

   public int bridge$getLunarID() {
      return this.impl$id;
   }

   public void bridge$setLunarID(int var1) {
      this.impl$id = var1;
   }

   public boolean bridge$isAddedByApollo() {
      return this.impl$isAddedByApollo;
   }

   public void bridge$setAddedByApollo(boolean var1) {
      this.impl$isAddedByApollo = var1;
   }
}
