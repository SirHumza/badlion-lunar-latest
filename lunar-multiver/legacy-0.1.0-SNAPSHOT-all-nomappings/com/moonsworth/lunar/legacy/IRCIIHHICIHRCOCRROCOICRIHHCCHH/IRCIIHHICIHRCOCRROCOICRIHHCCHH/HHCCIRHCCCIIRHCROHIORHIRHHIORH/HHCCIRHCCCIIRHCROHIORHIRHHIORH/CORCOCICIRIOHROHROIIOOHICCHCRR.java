package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.gui.GuiKeyBindingList;
import net.minecraft.client.gui.GuiKeyBindingList.CategoryEntry;
import net.minecraft.client.gui.GuiKeyBindingList.KeyEntry;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(GuiKeyBindingList.class)
public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   @Final
   @Shadow
   public IGuiListEntry[] listEntries;
   @Unique
   private List<String> lunar$cachedDisabledMods;
   @Unique
   private IGuiListEntry[] lunar$cachedListEntries;

   @Overwrite
   public IGuiListEntry getListEntry(int var1) {
      return this.lunar$getCachedKeyBindingList()[var1];
   }

   @Overwrite
   public int getSize() {
      return this.lunar$getCachedKeyBindingList().length;
   }

   @Unique
   private IGuiListEntry[] lunar$getCachedKeyBindingList() {
      List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().OOOROCHORHORHOIOIRRHRIRHICOIIR();
      if (!var1.equals(this.lunar$cachedDisabledMods)) {
         this.lunar$cachedDisabledMods = var1;
         IGuiListEntry[] var2 = Arrays.copyOf(this.listEntries, this.listEntries.length);
         Collections.reverse(Arrays.asList(var2));
         MutableBoolean var3 = new MutableBoolean(false);
         this.lunar$cachedListEntries = Arrays.stream(var2)
            .filter(
               var2x -> {
                  if (var2x == null) {
                     return false;
                  }

                  if (var2x instanceof KeyEntry var3x) {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
                           >= 1
                        ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3x.keybinding$v1_8
                        : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3x.field_148282_b$v1_7;
                     RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var5 = (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RIOCOIRRIORHRHHICHOIIOORICOHRI
                        .inverse()
                        .get(var4);
                     if (var5 != null && var5.isHidden()) {
                        return false;
                     }

                     String var6 = var4.bridge$getCategory();
                     if (var1.contains(var6)) {
                        return false;
                     }

                     var3.setValue(true);
                  } else if (var2x instanceof CategoryEntry) {
                     if (!var3.getValue()) {
                        return false;
                     }

                     var3.setValue(false);
                  }

                  return true;
               }
            )
            .toArray(IGuiListEntry[]::new);
         Collections.reverse(Arrays.asList(this.lunar$cachedListEntries));
      }

      return this.lunar$cachedListEntries;
   }
}
