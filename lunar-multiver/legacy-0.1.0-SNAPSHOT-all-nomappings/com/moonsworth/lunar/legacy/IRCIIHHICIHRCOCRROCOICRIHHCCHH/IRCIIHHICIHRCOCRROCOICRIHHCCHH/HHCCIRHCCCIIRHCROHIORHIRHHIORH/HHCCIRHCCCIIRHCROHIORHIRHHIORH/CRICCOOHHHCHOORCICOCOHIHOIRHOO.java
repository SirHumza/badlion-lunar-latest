package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiKeyBindingList.KeyEntry;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding_v1_7;
import net.minecraft.client.settings.KeyBinding_v1_8;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyEntry.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @Final
   @Shadow
   public GuiButton btnChangeKeyBinding;
   @Final
   @Shadow
   public KeyBinding_v1_8 keybinding$v1_8;
   @Final
   @Shadow
   public KeyBinding_v1_7 field_148282_b$v1_7;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "drawEntry$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiButton;drawButton$v1_12(Lnet/minecraft/client/Minecraft;IIF)V", ordinal = 1)
   )
   private void lunar$onDrawEntry$v1_12(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9, CallbackInfo var10) {
      this.lunar$onDrawEntry();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "drawEntry$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiButton;drawButton$v1_7(Lnet/minecraft/client/Minecraft;II)V", ordinal = 1)
   )
   private void lunar$onDrawEntry$v1_8(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, CallbackInfo var9) {
      this.lunar$onDrawEntry();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "drawEntry$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiButton;drawButton$v1_7(Lnet/minecraft/client/Minecraft;II)V", ordinal = 1)
   )
   private void lunar$onDrawEntry$v1_7(int var1, int var2, int var3, int var4, int var5, Tessellator var6, int var7, int var8, boolean var9, CallbackInfo var10) {
      this.lunar$onDrawEntry();
   }

   @Unique
   private void lunar$onDrawEntry() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
            >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keybinding$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.field_148282_b$v1_7;
      int var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.keybinding$v1_8.keyCode : this.field_148282_b$v1_7.keyCode;
      boolean var3 = this.btnChangeKeyBinding.displayString.startsWith("§c");
      if (var3) {
         boolean var4 = var2 == 0;
         boolean var5 = var1.bridge$getClashesWith().isEmpty();
         if (var4 || var5) {
            this.btnChangeKeyBinding.displayString = GameSettings.getKeyDisplayString(var2);
         }
      }

      if (!var3 && !this.btnChangeKeyBinding.displayString.startsWith("§f>")) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCRORCHHCCCORRHCHOOHOOCRHCRCI(
            var2
         );
         if (var6 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_NONE) {
            return;
         }

         if (!var1.bridge$getClashesWith().isEmpty()) {
            this.btnChangeKeyBinding.displayString = "§c" + this.btnChangeKeyBinding.displayString;
         }
      }
   }
}
