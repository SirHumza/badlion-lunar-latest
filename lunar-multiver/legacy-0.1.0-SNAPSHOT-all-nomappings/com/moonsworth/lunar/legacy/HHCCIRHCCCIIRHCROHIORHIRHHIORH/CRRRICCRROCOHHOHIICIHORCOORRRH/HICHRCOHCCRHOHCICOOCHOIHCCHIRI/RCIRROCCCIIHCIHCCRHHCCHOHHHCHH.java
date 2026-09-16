package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding_v1_7;
import net.minecraft.client.settings.KeyBinding_v1_8;
import net.minecraft.client.settings.GameSettings.Options;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.SoundCategory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameSettings.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public int thirdPersonView;
   @Shadow
   public int renderDistanceChunks;
   @Shadow
   public float gammaSetting;
   @Shadow
   public boolean showDebugInfo;
   @Shadow
   public boolean hideGUI;
   @Shadow
   public boolean fancyGraphics;
   @Shadow
   public float chatScale;
   @Shadow
   public boolean enableVsync;
   @Shadow
   public int limitFramerate;
   @Shadow
   public Minecraft mc;
   @Shadow
   public boolean smoothCamera;
   @Shadow
   public File optionsFile;
   @Shadow
   public boolean useVbo$v1_8;
   @Shadow
   public int ambientOcclusion;
   @Shadow
   public boolean entityShadows$v1_8;
   @Shadow
   public boolean clouds$v1_7;
   @Shadow
   public int clouds$v1_8;
   @Shadow
   public int particleSetting;
   @Shadow
   public float fovSetting;
   @Shadow
   public KeyBinding_v1_8 keyBindScreenshot$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindScreenshot$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindForward$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindForward$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindLeft$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindLeft$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindBack$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindBack$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindRight$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindRight$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindJump$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindJump$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindAttack$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindAttack$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindUseItem$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindUseItem$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindSprint$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindSprint$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindSneak$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindSneak$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindPlayerList$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindPlayerList$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindTogglePerspective$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindTogglePerspective$v1_7;
   @Shadow
   public KeyBinding_v1_8[] keyBindings$v1_8;
   @Shadow
   public KeyBinding_v1_7[] keyBindings$v1_7;
   @Shadow
   public boolean forceUnicodeFont;
   @Shadow
   public int guiScale;
   @Shadow
   public KeyBinding_v1_7 keyBindPickBlock$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindPickBlock$v1_8;
   @Shadow
   public List resourcePacks$v1_7;
   @Shadow
   public List<String> resourcePacks$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindStreamCommercials$v1_7;
   @Shadow
   public KeyBinding_v1_8 keyBindStreamToggleMic$v1_8;
   @Shadow
   public KeyBinding_v1_8 keyBindStreamStartStop$v1_8;
   @Shadow
   public KeyBinding_v1_8 keyBindStreamPauseUnpause$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindStreamStartStop$v1_7;
   @Shadow
   public KeyBinding_v1_7 keyBindStreamPauseUnpause$v1_7;
   @Shadow
   public KeyBinding_v1_7 keyBindStreamToggleMic$v1_7;
   @Shadow
   public boolean chatLinks;
   @Shadow
   public boolean chatLinksPrompt;
   @Shadow
   public KeyBinding_v1_8 keyBindDrop$v1_8;
   @Shadow
   public KeyBinding_v1_7 keyBindDrop$v1_7;
   @Shadow
   public boolean showSubtitles$v1_12;
   @Final
   @Shadow
   public Set<EnumPlayerModelParts> setModelParts$v1_8;
   @Shadow
   public boolean advancedItemTooltips;
   @Shadow
   public int attackIndicator$v1_12;
   @Unique
   private boolean lunar$gammaOverridden;
   @Unique
   private float lunar$savedGamma;
   @Unique
   private float originalOptiFineChunkLoading;

   @Shadow
   public abstract void setOptionFloatValue(Options var1, float var2);

   @Shadow
   public abstract Set<EnumPlayerModelParts> getModelParts$v1_8();

   @Shadow
   public abstract void saveOptions();

   @Shadow
   public abstract void loadOptions();

   @Shadow
   public abstract boolean isUsingNativeTransport$v1_8();

   @Shadow
   public abstract float getSoundLevel(SoundCategory var1);

   public void bridge$loadOptions() {
      this.loadOptions();
   }

   public void bridge$saveOptions() {
      this.saveOptions();
   }

   public void bridge$setThirdPersonView(int var1) {
      this.thirdPersonView = var1;
   }

   public int bridge$getThirdPersonView() {
      return this.thirdPersonView;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getScreenshotKey() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCRORCHHCCCORRHCHOOHOOCRHCRCI(
            this.keyBindScreenshot$v1_8.getKeyCode()
         )
         : com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCRORCHHCCCORRHCHOOHOOCRHCRCI(
            this.keyBindScreenshot$v1_7.getKeyCode()
         );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getDropKey() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindDrop$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindDrop$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindForward() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindForward$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindForward$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindLeft() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindLeft$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindLeft$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindBack() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindBack$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindBack$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindRight() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindRight$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindRight$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindJump() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindJump$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindJump$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindAttack() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindAttack$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindAttack$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindUseItem() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindUseItem$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindUseItem$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindPickBlock() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindPickBlock$v1_7
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindPickBlock$v1_8;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindSprint() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindSprint$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindSprint$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindSneak() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindSneak$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindSneak$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindPlayerList() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindPlayerList$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindPlayerList$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$keyBindTogglePerspective() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindTogglePerspective$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.keyBindTogglePerspective$v1_7;
   }

   public int bridge$getRenderDistance() {
      return this.renderDistanceChunks;
   }

   public void bridge$setGamma(float var1) {
      if (this.lunar$gammaOverridden) {
         this.lunar$savedGamma = var1;
      } else {
         this.gammaSetting = var1;
      }
   }

   public void bridge$setGammaOverride(float var1) {
      if (!this.lunar$gammaOverridden) {
         this.lunar$gammaOverridden = true;
         this.lunar$savedGamma = this.gammaSetting;
      }

      this.gammaSetting = var1;
   }

   public void bridge$removeGammaOverride() {
      if (this.lunar$gammaOverridden) {
         this.lunar$gammaOverridden = false;
         this.gammaSetting = this.lunar$savedGamma;
      }
   }

   @Inject(method = "setOptionFloatValue", at = @At("HEAD"), cancellable = true)
   private void impl$setOption(Options var1, float var2, CallbackInfo var3) {
      if (var1 == Options.GAMMA) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HHCRORCOROHHHRRIICHHROOOCHHIIH()
            .CHCHCHHHROIHOHCCCOOOOOIIROICHH();
      }
   }

   @Redirect(
      method = {"setOptionFloatValue()V", "loadOptions()V", "resetSettings()V"},
      at = @At(value = "FIELD", target = "net/minecraft/client/settings/GameSettings.gammaSetting : F", opcode = 181)
   )
   private void impl$redirectGammaSet(GameSettings var1, float var2) {
      if (this.lunar$gammaOverridden) {
         this.lunar$savedGamma = var2;
      } else {
         this.gammaSetting = var2;
      }
   }

   public boolean bridge$showDebugInfo() {
      return this.showDebugInfo;
   }

   public Set<RRCRRCORICCHOHHIRCHIROOHIIOHCO> bridge$getModelParts() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.getModelParts$v1_8() : null;
   }

   public boolean bridge$isHideGui() {
      return this.hideGUI;
   }

   public void bridge$setHideGui(boolean var1) {
      this.hideGUI = var1;
   }

   public int bridge$getGuiScale() {
      return this.guiScale;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] bridge$getKeyBindings() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH[])this.keyBindings$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH[])this.keyBindings$v1_7;
   }

   public void bridge$setKeyBinds(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.keyBindings$v1_8 = (KeyBinding_v1_8[])var1;
      } else {
         this.keyBindings$v1_7 = (KeyBinding_v1_7[])var1;
      }
   }

   public float bridge$getChatScale() {
      return this.chatScale;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$showHat() {
      return this.setModelParts$v1_8.contains(EnumPlayerModelParts.HAT);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$showJacket() {
      return this.setModelParts$v1_8.contains(EnumPlayerModelParts.JACKET);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$showLeftSleeve() {
      return this.setModelParts$v1_8.contains(EnumPlayerModelParts.LEFT_SLEEVE);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$showRightSleeve() {
      return this.setModelParts$v1_8.contains(EnumPlayerModelParts.RIGHT_SLEEVE);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$showLeftPant() {
      return this.setModelParts$v1_8.contains(EnumPlayerModelParts.LEFT_PANTS_LEG);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$showRightPant() {
      return this.setModelParts$v1_8.contains(EnumPlayerModelParts.RIGHT_PANTS_LEG);
   }

   public void bridge$setOptionFloatValue(int var1, float var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.setOptionFloatValue(Options.byOrdinal$v1_12(var1), var2);
      } else {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 && var1 == 25) {
            this.chatScale = var2;
            this.mc.ingameGUI.getChatGUI().refreshChat();
         }

         this.setOptionFloatValue(Options.getEnumOptions$v1_7(var1), var2);
      }
   }

   public void bridge$setKeyBindState(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         KeyBinding_v1_8.setKeyBindState(
            com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1), var2
         );
      } else {
         KeyBinding_v1_7.setKeyBindState(
            com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1), var2
         );
      }
   }

   public void bridge$unpressAllKeys() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         KeyBinding_v1_8.unPressAllKeys();
      } else {
         KeyBinding_v1_7.unPressAllKeys();
      }
   }

   public void bridge$setSmoothCamera(boolean var1) {
      this.smoothCamera = var1;
   }

   public boolean bridge$getSmoothCamera() {
      return this.smoothCamera;
   }

   public void bridge$setFancyGraphics(boolean var1) {
      this.fancyGraphics = var1;
   }

   public boolean bridge$isFancyGraphics() {
      return this.fancyGraphics;
   }

   public boolean bridge$isFabulousGraphics() {
      return false;
   }

   @Unique
   private void impl$swapSavedGamma() {
      float var1 = this.gammaSetting;
      this.gammaSetting = this.lunar$savedGamma;
      this.lunar$savedGamma = var1;
   }

   @Inject(method = "saveOptions", at = @At("HEAD"))
   private void lunar$saveOptions(CallbackInfo var1) {
      if (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IOCICCRHICIIROIOICRCHOCHIHHOOH().isPresent() && !HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRRIHCHHIOHRIHCOHHHRHROOHOIRRH()) {
         this.limitFramerate = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IOCICCRHICIIROIOICRCHOCHIHHOOH().getAsInt();
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HCIIICCOOORRIIRROCIIHIOHRRHIOI(true);
      }

      if (this.lunar$gammaOverridden) {
         this.impl$swapSavedGamma();
      }
   }

   @Inject(method = "loadOptions", at = @At("HEAD"))
   public void impl$beforeLoadOptions(CallbackInfo var1) {
      if (this.lunar$gammaOverridden) {
         this.impl$swapSavedGamma();
      }

      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
         this.optionsFile.getParentFile()
      );
   }

   @Inject(method = "loadOptions", at = @At("RETURN"))
   public void impl$afterLoadOptions(CallbackInfo var1) {
      if (this.lunar$gammaOverridden) {
         this.impl$swapSavedGamma();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(method = "loadOptions", at = @At(target = "Lnet/minecraft/nbt/NBTTagCompound;getString(Ljava/lang/String;)Ljava/lang/String;", value = "INVOKE"))
   public String impl$getString(NBTTagCompound var1, String var2) {
      return com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, new JsonPrimitive(var1.getString(var2))
         )
         .getAsString();
   }

   @Redirect(method = "saveOptions", at = @At(target = "Ljava/io/PrintWriter;println(Ljava/lang/String;)V", value = "INVOKE"))
   public void impl$saveSetting(PrintWriter var1, String var2) {
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HIIHHIORRHCCIRICCOIOCICHOOIICC(
         var2
      );
      var1.println(var2);
   }

   @Inject(method = "saveOptions", at = @At("TAIL"))
   public void impl$saveOptionsOverwrite(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class, RICRIRRCOHRCOCRRHHCRHRROOIOHHR::new);
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
         this.optionsFile.getParentFile()
      );
      if (this.lunar$gammaOverridden) {
         this.impl$swapSavedGamma();
      }
   }

   public int bridge$getFrameRateLimit() {
      return this.limitFramerate;
   }

   public void bridge$setFrameRateLimit(int var1) {
      this.limitFramerate = var1;
   }

   public boolean bridge$getVSync() {
      return this.enableVsync;
   }

   public boolean bridge$getAmbientOcclusion() {
      return this.ambientOcclusion > 0;
   }

   public boolean bridge$getEntityShadows() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.entityShadows$v1_8 : true;
   }

   public double bridge$getEntityScaling() {
      return 100.0;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getPrioritizeChunkUpdates() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.UNSPECIFIED;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getCloudStatus() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return this.clouds$v1_7
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAST
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF;
      } else {
         return this.clouds$v1_8 == 2
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FANCY
            : (
               this.clouds$v1_8 == 1
                  ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAST
                  : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF
            );
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getParticleStatus() {
      return this.particleSetting == 2
         ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ALL
         : (
            this.particleSetting == 1
               ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DECREASED
               : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MINIMAL
         );
   }

   public int bridge$getBiomeBlend() {
      return 0;
   }

   public int bridge$getFov() {
      return (int)Math.round(
         com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
            this.fovSetting
         )
      );
   }

   public void bridge$setVBO(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.useVbo$v1_8 = var1;
      }
   }

   public boolean bridge$isChatLinks() {
      return this.chatLinks;
   }

   public boolean bridge$isChatPromptLinks() {
      return this.chatLinksPrompt;
   }

   public double bridge$getNotificationDisplayTime() {
      return 1.0;
   }

   public boolean bridge$isShowSubtitles() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.showSubtitles$v1_12 : false;
   }

   public void bridge$setShowSubtitles(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.showSubtitles$v1_12 = var1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public boolean bridge$isAttackIndicatorEnabled() {
      return this.attackIndicator$v1_12 != 0;
   }

   public boolean bridge$isAdvancedItemTooltips() {
      return this.advancedItemTooltips;
   }

   public float bridge$getMasterVolume() {
      return this.getSoundLevel(SoundCategory.MASTER);
   }

   public boolean bridge$isStreamKey(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      int var2 = com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return this.keyBindStreamCommercials$v1_7.getKeyCode() == var2
            || this.keyBindStreamToggleMic$v1_7.getKeyCode() == var2
            || this.keyBindStreamStartStop$v1_7.getKeyCode() == var2
            || this.keyBindStreamPauseUnpause$v1_7.getKeyCode() == var2;
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 1
            ? false
            : this.keyBindStreamToggleMic$v1_8.getKeyCode() == var2
               || this.keyBindStreamStartStop$v1_8.getKeyCode() == var2
               || this.keyBindStreamPauseUnpause$v1_8.getKeyCode() == var2;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$isNativeTransport() {
      return this.isUsingNativeTransport$v1_8();
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getTextureFiltering() {
      return CRRRICCRROCOHHOHIICIHORCOORRRH.NONE;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "loadOfOptions",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/settings/GameSettings;updateChunkLoading()V", shift = Shift.BEFORE),
      require = 0,
      expect = 0
   )
   private void impl$onLoadOfOptions(CallbackInfo var1) {
      this.originalOptiFineChunkLoading = this.RCOOCHOHCCOHIIHHOCOCOHRHHHIOIC();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "updateChunkLoading", at = @At("HEAD"), cancellable = true, require = 0, expect = 0)
   private void impl$onUpdateChunkLoading(CallbackInfo var1) {
      if (this.originalOptiFineChunkLoading != 0.0F) {
         this.CCCRICOCIHOHCRIHIOIIIOORIROCCI(0);
         this.originalOptiFineChunkLoading = 0.0F;
      } else {
         this.CCCRICOCIHOHCRIHIOIIIOORIROCCI(0);
         var1.cancel();
      }
   }

   @Redirect(
      method = "loadOptions",
      at = @At(
         target = "Lnet/minecraft/client/settings/GameSettings;dataFix$v1_12(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;",
         value = "INVOKE"
      )
   )
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public NBTTagCompound impl$loadOptions$split$v1_12(GameSettings var1, NBTTagCompound var2) {
      NBTTagCompound var3 = new NBTTagCompound();

      for (String var5 : var2.getKeySet$v1_8()) {
         String var6 = var2.getString(var5);
         if (var5.equalsIgnoreCase("maxFps")) {
            this.limitFramerate = Integer.parseInt(var6);
            if (this.limitFramerate <= 0) {
               this.limitFramerate = (int)Options.FRAMERATE_LIMIT.getValueMax();
            }
         } else if (var5.equalsIgnoreCase("enableVsync")) {
            this.enableVsync = Boolean.parseBoolean(var6);
            this.bridge$updateVSync();
         } else {
            var3.setString(var5, var6);
         }
      }

      return var3;
   }

   @Redirect(method = "loadOptions", at = @At(target = "Ljava/lang/String;split(Ljava/lang/String;)[Ljava/lang/String;", value = "INVOKE"))
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public String[] impl$loadOptions$split(String var1, String var2) {
      if (var2.equals(":")) {
         if (var1.startsWith("maxFps:")) {
            String[] var5 = var1.split(":");
            if (var5.length > 1) {
               this.limitFramerate = Integer.parseInt(var5[1]);
               if (this.limitFramerate <= 0) {
                  this.limitFramerate = (int)Options.FRAMERATE_LIMIT.getValueMax();
               }
            }

            return new String[]{"Invalid", "1"};
         }

         if (var1.startsWith("enableVsync:")) {
            String[] var4 = var1.split(":");
            if (var4.length > 1) {
               this.enableVsync = Boolean.parseBoolean(var4[1]);
               this.bridge$updateVSync();
            }

            return new String[]{"Invalid", "1"};
         }
      }

      String[] var3 = var1.split(var2);
      return var3.length == 1
         ? new String[]{"Invalid", "1"}
         : new String[]{
            var3[0],
            com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var3[0], new JsonPrimitive(var3[1])
               )
               .getAsString()
         };
   }

   public void bridge$setForceUnicode(boolean var1) {
      this.forceUnicodeFont = var1;
      this.mc.fontRenderer.setUnicodeFlag(this.mc.getLanguageManager().isCurrentLocaleUnicode() || this.forceUnicodeFont);
      this.saveOptions();
      this.mc.refreshResources();
   }

   public boolean bridge$isForceUnicode() {
      return this.forceUnicodeFont;
   }
}
