package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.nbt.NBTTagList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiScreenBook.class)
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Shadow
   public int currPage;
   @Shadow
   public int bookTotalPages;
   @Shadow
   public NBTTagList bookPages;

   public String bridge$getPageContents(int var1) {
      return this.bookPages == null ? "" : this.bookPages.getStringTagAt(var1);
   }

   public int bridge$getCurrentPage() {
      return this.currPage;
   }

   public int bridge$getPageCount() {
      return this.bookTotalPages;
   }
}
