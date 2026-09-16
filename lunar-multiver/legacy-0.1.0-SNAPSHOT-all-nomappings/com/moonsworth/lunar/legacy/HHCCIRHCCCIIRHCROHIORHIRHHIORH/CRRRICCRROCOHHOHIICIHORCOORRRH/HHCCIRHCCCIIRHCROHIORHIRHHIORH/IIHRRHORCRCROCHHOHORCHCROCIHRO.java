package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.collect.ImmutableList;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiControls;
import net.minecraft.client.gui.GuiKeyBindingList;
import net.minecraft.client.gui.GuiKeyBindingList.KeyEntry;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiControls.class)
public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI,
   com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public GuiKeyBindingList keyBindingList;

   @Inject(method = "initGui", at = @At("HEAD"))
   private void onInit(CallbackInfo var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.OIOORROOHCRRCOCOHICICRCIOCIIOH(null);
   }

   @Inject(method = "drawScreen", at = @At("TAIL"))
   private void lunar$onDrawScreen(int var1, int var2, float var3, CallbackInfo var4) {
      for (IGuiListEntry var8 : this.keyBindingList.listEntries) {
         if (var8 instanceof KeyEntry var9) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
                  >= 1
               ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var9.keybinding$v1_8
               : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var9.field_148282_b$v1_7;
            GuiButton var11 = ((KeyEntry)var8).btnChangeKeyBinding;
            if (!var10.bridge$getClashesWith().isEmpty()) {
               boolean var12 = var1 > var11.x && var1 < var11.x + var11.width && var2 > var11.y && var2 < var11.y + var11.height;
               if (var12) {
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
                     ),
                     ImmutableList.of(
                        this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                           "clashesWith",
                           new Object[]{
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RED
                                 + IICCOOCHCHROORHHIIHROHCCRHRCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var10.bridge$getClashesWith())
                           }
                        )
                     ),
                     var1,
                     var2
                  );
               }
            }
         }
      }
   }

   public String getLanguagePath() {
      return "gui.components";
   }
}
