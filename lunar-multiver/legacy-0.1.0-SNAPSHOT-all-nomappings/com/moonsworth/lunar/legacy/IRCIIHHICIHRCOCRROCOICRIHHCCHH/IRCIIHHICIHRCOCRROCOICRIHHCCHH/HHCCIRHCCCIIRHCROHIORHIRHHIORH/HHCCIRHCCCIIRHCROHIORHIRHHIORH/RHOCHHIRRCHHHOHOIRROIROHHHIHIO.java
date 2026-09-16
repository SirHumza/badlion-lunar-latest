package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.collect.ImmutableSet;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHIHIIHCCCCCIHRORIOIOORCIOHII;
import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiControls;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.client.gui.GuiCustomizeSkin;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenAddServer;
import net.minecraft.client.gui.GuiScreenOptionsSounds;
import net.minecraft.client.gui.GuiScreenServerList;
import net.minecraft.client.gui.GuiVideoSettings;
import net.minecraft.client.gui.GuiWorldEdit;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.ScreenChatOptions;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.advancements.GuiScreenAdvancements;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.gui.stream.GuiStreamOptions;
import net.minecraft.client.gui.stream.GuiStreamUnavailable;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent.Action;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GuiScreen.class)
public abstract class RHOCHHIRRCHHHOHOIRROIROHHHIHIO implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Shadow
   public Minecraft mc;
   @Shadow
   public int width;
   @Shadow
   public int height;
   @Unique
   private static boolean lunar$lazyInit = true;
   @Unique
   private static final Set<Class<?>> LUNAR$HIDE_BRAND_ON = ImmutableSet.of(
      GuiMultiplayer.class,
      GuiScreenServerList.class,
      GuiScreenAddServer.class,
      GuiChat.class,
      GuiControls.class,
      GuiWorldSelection.class,
      new Class[]{
         GuiWorldEdit.class, GuiConnecting.class, GuiCreateWorld.class, GuiLanguage.class, GuiYesNo.class, GuiDownloadTerrain.class, GuiMainMenu.class
      }
   );

   @Shadow
   public abstract void initGui();

   @Shadow
   public static boolean isShiftKeyDown() {
      return false;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapMethod(method = "sendChatMessage$v1_8(Ljava/lang/String;Z)V")
   private void lunar$wrapSendChat(String var1, boolean var2, Operation<Void> var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var1
            )
         );
      boolean var5 = var4 != null && var4.isCancelled();
      if (!var5) {
         String var6 = var4 == null ? var1 : var4.getMessage();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORRICCOCRHRHRHOOIROHRHIHROOROH(
            var6
         );
         var3.call(new Object[]{var6, var2});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(method = "keyTyped", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;setIngameFocus()V"))
   private boolean lunar$shouldWrapKeyTyped(Minecraft var1) {
      return var1.currentScreen == null;
   }

   @Inject(method = "handleMouseInput", at = @At("HEAD"))
   private void lunar$webosr$handleMouseInput(CallbackInfo var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = null;
      if (this instanceof RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3) {
         var2 = var3.RRIOOIOROCIRHRORIRHIRHIHOCHICH();
      }

      if (var2 instanceof com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH
         || this.lunar$forwardInput()) {
         int var5 = Mouse.getEventButton();
         if (var5 != -1) {
            boolean var6 = Mouse.getEventButtonState();
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
               .RCIROOOOICRHCCRRCIORHHIRCOIIIC(
                  var5,
                  var6 ? 1 : 0,
                  com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHOOOHOIIRRCRCIHRORHIOOCIHHOHC()
               );
         }
      }
   }

   @Unique
   private boolean lunar$forwardInput() {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() == null) {
         return false;
      }

      if (this instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR
         && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().HOOCOOIRHCHIICICHOICHCOIRICIHI()) {
         return true;
      }

      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
      if (var1 == null) {
         return false;
      }

      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = var1.HHOCRICRHROCOORCHIOOOCRHCCCCCR();
      return var2.HRRRROHOHORHOHHCHOIHOIRCCROROI() != null && var2.HRRRROHOHORHOHHCHOIHOIRCCROROI().isInstance(this);
   }

   @Inject(method = "keyTyped", at = @At("HEAD"), cancellable = true)
   private void lunar$fixConfirmGuiCallback(char var1, int var2, CallbackInfo var3) {
      if (this instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
         )
       {
         if (var2 == 1) {
            var4.bridge$getYesNoCallback().accept(false, var4.bridge$getParentButtonClickedId());
            if (this.mc.currentScreen == null) {
               this.mc.setIngameFocus();
            }

            var3.cancel();
         }
      }
   }

   @WrapMethod(method = "setWorldAndResolution")
   private void lunar$wrapSetWorldAndResolution(Minecraft var1, int var2, int var3, Operation<Void> var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRHCOOHHRHIRCRHHROCRHCHIOIROHH()
         && (
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() == null
               || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() == null
               || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                  .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         )) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI())
         );
      }

      var4.call(new Object[]{var1, var2, var3});
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this
            )
         );
   }

   @Inject(
      method = "setWorldAndResolution(Lnet/minecraft/client/Minecraft;II)V",
      at = @At(value = "INVOKE", target = "Ljava/util/List;clear()V", shift = Shift.BEFORE, ordinal = 0)
   )
   private void lunar$setWorldAndResolution$pre(Minecraft var1, int var2, int var3, CallbackInfo var4) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this
            )
         );
   }

   @WrapMethod(method = "handleMouseInput")
   private void lunar$onMouseScroll(Operation<Void> var1) {
      int var2 = Mouse.getEventDWheel();
      if (var2 != 0) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  var2 / 120.0
               )
            );
         if (var3 != null && var3.isCancelled()) {
            return;
         }
      }

      var1.call(new Object[0]);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Redirect(method = "handleKeyboardInput", at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;getEventKeyState()Z"))
   private boolean lunar$fixChineseCharacters() {
      return Keyboard.getEventKeyState() || Keyboard.getEventKey() == 0 && Character.isDefined(Keyboard.getEventCharacter());
   }

   @WrapOperation(
      method = "mouseClicked",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V")
   )
   private void lunar$onMouseClicked(GuiScreen var1, GuiButton var2, Operation<Void> var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var1,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)var2
            )
         );
      if (var4 == null || !var4.isCancelled()) {
         var3.call(new Object[]{var1, var2});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @WrapOperation(
      method = "drawScreen",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiButton;drawButton$v1_7(Lnet/minecraft/client/Minecraft;II)V")
   )
   private void lunar$tintButton$v1_7(GuiButton var1, Minecraft var2, int var3, int var4, Operation<Void> var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IIHRRHORCRCROCHHOHORCHCROCIHRO(
         () -> var5.call(new Object[]{var1, var2, var3, var4})
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapOperation(
      method = "drawScreen",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiButton;drawButton$v1_12(Lnet/minecraft/client/Minecraft;IIF)V")
   )
   private void lunar$tintButton$v1_12(GuiButton var1, Minecraft var2, int var3, int var4, float var5, Operation<Void> var6) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IIHRRHORCRCROCHHOHORCHCROCIHRO(
         () -> var6.call(new Object[]{var1, var2, var3, var4, var5})
      );
   }

   @Inject(method = "drawScreen", at = @At("HEAD"))
   private void lunar$renderLunarClientBrand(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOOCCIROOCRIHROCOCHCRCHOIRRCHO();
      var var3 = (RHOCHHIRRCHHHOHOIRROIROHHHIHIO & GuiScreen)this;
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         && var2.isEnabled()
         && var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var3)) {
         var2.OHORCIOICOROIOOHIOROHIRHIIRORI();
      }

      if (!LUNAR$HIDE_BRAND_ON.contains(this.getClass()) && !(var3 instanceof GuiChat)) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
               .IRCRHHCRHIIIHROOCORCHHHRIIROIR(),
            this.width,
            this.height
         );
      }
   }

   @Inject(
      method = "mouseClicked",
      at = @At(value = "INVOKE", target = "net/minecraft/client/gui/GuiScreen.actionPerformed (Lnet/minecraft/client/gui/GuiButton;)V", shift = Shift.AFTER),
      cancellable = true
   )
   private void lunar$preventMultipleButtonClicksFromOneMouseClick(int var1, int var2, int var3, CallbackInfo var4) {
      var4.cancel();
   }

   @WrapOperation(method = "handleMouseInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;mouseClicked(III)V"))
   private void lunar$mouseClickedEvent(GuiScreen var1, int var2, int var3, int var4, Operation<Void> var5) {
      if (var1 == Minecraft.getMinecraft().currentScreen) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                  this,
                  new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3),
                  var4,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLICK
               )
            );
         if (var6 != null && var6.isCancelled()) {
            return;
         }
      }

      var5.call(new Object[]{var1, var2, var3, var4});
   }

   @WrapOperation(method = "handleMouseInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;mouseReleased(III)V"))
   private void lunar$mouseReleasedEvent(GuiScreen var1, int var2, int var3, int var4, Operation<Void> var5) {
      if (var1 == Minecraft.getMinecraft().currentScreen) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                  this,
                  new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3),
                  var4,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RELEASE
               )
            );
         if (var6 != null && var6.isCancelled()) {
            return;
         }
      }

      var5.call(new Object[]{var1, var2, var3, var4});
   }

   @WrapOperation(method = "handleMouseInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;mouseClickMove(IIIJ)V"))
   private void lunar$mouseDragEvent(GuiScreen var1, int var2, int var3, int var4, long var5, Operation<Void> var7) {
      if (var1 == Minecraft.getMinecraft().currentScreen) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var8 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
               () -> {
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     this,
                     new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3),
                     var4,
                     com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.DRAG
                  );
                  var6.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var5);
                  return var6;
               }
            );
         if (var8 != null && var8.isCancelled()) {
            return;
         }
      }

      var7.call(new Object[]{var1, var2, var3, var4, var5});
   }

   @Inject(method = "handleMouseInput", at = @At("HEAD"))
   private void lunar$mouseScrolledEvent(CallbackInfo var1) {
      int var2 = Mouse.getEventDWheel();
      if (var2 != 0 && this == Minecraft.getMinecraft().currentScreen) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
               () -> {
                  int var2x = Mouse.getEventX() * this.width / this.mc.displayWidth;
                  int var3 = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 = new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     this,
                     new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2x, var3),
                     -1,
                     com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.SCROLL
                  );
                  var4.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var2);
                  return var4;
               }
            );
      }
   }

   @WrapOperation(method = "handleKeyboardInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;keyTyped(CI)V"))
   private void lunar$keyTypedEvent(GuiScreen var1, char var2, int var3, Operation<Void> var4) {
      if (var1 == Minecraft.getMinecraft().currentScreen) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCRORCHHCCCORRHCHOOHOOCRHCRCI(var3),
                  var2,
                  var3,
                  -1,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRESS
               )
            );
         if (var5 != null && var5.isCancelled()) {
            return;
         }
      }

      var4.call(new Object[]{var1, var2, var3});
   }

   @Inject(method = "isShiftKeyDown", at = @At("HEAD"), cancellable = true)
   private static void lunar$isShiftKeyDown(CallbackInfoReturnable<Boolean> var0) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var1.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1.HOROHROIORRIRIIIOOCCIROCRCROHI()
               .COICHIOIHHOHRHRHCIOICORCRORIIR()
               .get())
            .HHOHIHRCICOIICIIOHHHRHROHCHICI();
         var0.setReturnValue(var2.ICROCROOIRCCCHHROIHIIOORCROHOC());
      }
   }

   @Inject(method = "isCtrlKeyDown", at = @At("HEAD"), cancellable = true)
   private static void lunar$isCtrlKeyDown(CallbackInfoReturnable<Boolean> var0) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var1.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1.HOROHROIORRIRIIIOOCCIROCRCROHI()
               .COICHIOIHHOHRHRHCIOICORCRORIIR()
               .get())
            .HHOHIHRCICOIICIIOHHHRHROHCHICI();
         var0.setReturnValue(var2.ORCIOCHCIHOOCCCIOHCIRIOIOOIOHO());
      }
   }

   @Redirect(method = "drawWorldBackground", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawGradientRect(IIIIII)V"))
   private void lunar$menuBlurGradient(GuiScreen var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOOCCIROOCRIHROCOCHCRCHOIRRCHO();
      var var9 = (RHOCHHIRRCHHHOHOIRROIROHHHIHIO & GuiScreen)this;
      if (var8.isEnabled()) {
         Optional var10 = var8.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var9);
         if (var10.isPresent()) {
            var6 = var7 = (Integer)var10.get();
         }
      }

      var1.drawGradientRect(var2, var3, var4, var5, var6, var7);
   }

   @Inject(method = "drawWorldBackground", at = @At("HEAD"), cancellable = true)
   private void lunar$fixNullMinecraftCheck(int var1, CallbackInfo var2) {
      if (this.mc == null) {
         var2.cancel();
      }
   }

   @Inject(method = "<init>", at = @At("TAIL"))
   private void lunar$blurMenus(CallbackInfo var1) {
      if (lunar$lazyInit && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOOCCIROOCRIHROCOCHCRCHOIRRCHO();
         Set var3 = var2.HRHCIIOICICCOHROCRCIHIROICRCIO().ROOIOHOHIOCHIICIORIOICHIHHHCIO();
         var3.add(GuiIngameMenu.class);
         var3.add(GuiVideoSettings.class);
         var3.add(GuiOptions.class);
         var3.add(GuiScreenOptionsSounds.class);
         var3.add(ScreenChatOptions.class);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            var3.add(GuiCustomizeSkin.class);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5) {
            var3.add(GuiStreamOptions.class);
            var3.add(GuiStreamUnavailable.class);
            var3.add(GuiAchievements.class);
         } else {
            var3.add(GuiScreenAdvancements.class);
         }

         Set var4 = var2.RIIRIHOIIHRHCHHROOCIORHHRIORIO().ROOIOHOHIOCHIICIORIOICHIHHHCIO();
         var4.add(GuiInventory.class);
         var4.add(GuiContainer.class);
         lunar$lazyInit = false;
      }
   }

   @WrapMethod(method = {"drawHoveringText$v1_7", "drawHoveringText$v1_8"})
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$wrapTooltipRender$v1_8(
      List<String> var1,
      int var2,
      int var3,
      Operation<Void> var4,
      @Share("context") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI> var5,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var6,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var7
   ) {
      if (!com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var2, var3, var5, var6, var7
      )) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI)var5.get())
            .push();
         var4.call(new Object[]{var1, var2, var3});
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI)var5.get())
            .pop();
      }
   }

   @ModifyExpressionValue(method = {"drawHoveringText$v1_7", "drawHoveringText$v1_8"}, at = @At(value = "INVOKE", target = "Ljava/util/List;size()I"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private int lunar$cancelLoopIter$v1_8(
      int var1,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      return var2.get() != null
            && ((com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get())
               .isModified()
         ? 0
         : var1;
   }

   @Inject(method = {"drawHoveringText$v1_7", "drawHoveringText$v1_8"}, at = @At(value = "CONSTANT", args = "intValue=12", ordinal = 0))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private static void lunar$updateWidth(
      List<String> var0,
      int var1,
      int var2,
      CallbackInfo var3,
      @Local(ordinal = 2) LocalIntRef var4,
      @Share("actualW") LocalIntRef var5,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var6
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var4, var5, var6
      );
   }

   @Inject(
      method = {"drawHoveringText$v1_7", "drawHoveringText$v1_8"},
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/GuiScreen;width:I", opcode = 180)
   )
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$updateHeight(
      List<String> var1,
      int var2,
      int var3,
      CallbackInfo var4,
      @Local(ordinal = 6) LocalIntRef var5,
      @Share("actualH") LocalIntRef var6,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var7
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var5, var6, var7
      );
   }

   @Inject(
      method = {"drawHoveringText$v1_7", "drawHoveringText$v1_8"},
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/RenderItem;zLevel:F", opcode = 181, ordinal = 0)
   )
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$modifyPosition(
      List<String> var1,
      int var2,
      int var3,
      CallbackInfo var4,
      @Local(ordinal = 2) LocalIntRef var5,
      @Local(ordinal = 5) LocalIntRef var6,
      @Local(ordinal = 6) LocalIntRef var7,
      @Local(ordinal = 3) LocalIntRef var8,
      @Local(ordinal = 4) LocalIntRef var9,
      @Share("actualW") LocalIntRef var10,
      @Share("actualH") LocalIntRef var11,
      @Share("context") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI> var12,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var13
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var5, var6, var7, var10, var11, var8, var9, var12, var13
      );
   }

   @Inject(
      method = {"drawHoveringText$v1_7", "drawHoveringText$v1_8"},
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/GuiScreen;zLevel:F", ordinal = 1, opcode = 181)
   )
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$renderComponents(
      List<String> var1,
      int var2,
      int var3,
      CallbackInfo var4,
      @Local(ordinal = 3) int var5,
      @Local(ordinal = 4) int var6,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var7,
      @Share("context") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI> var8,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var9
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var5, var6, var7, var8, var9
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "handleComponentClick$v1_8",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;chatLinksPrompt:Z", opcode = 180, shift = Shift.BEFORE),
      cancellable = true
   )
   private static void lunar$maliciousUrlWarning$v1_8(ITextComponent var0, CallbackInfoReturnable<Boolean> var1) {
      URI var2 = lunar$getClickEventValue$v1_8(var0);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHOIROCHCHORIOOOIHCIIIRHIORIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var2)) {
         var1.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "handleComponentClick$v1_8", at = @At("HEAD"), cancellable = true)
   private static void lunar$preventRewindSystemClickEvent$v1_8(ITextComponent var0, CallbackInfoReturnable<Boolean> var1) {
      if (var0 != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         && !isShiftKeyDown()) {
         ClickEvent var2;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
            var2 = var0.getChatStyle$v1_8().getChatClickEvent$v1_7();
         } else {
            var2 = var0.getStyle$v1_12().getClickEvent$v1_12();
         }

         if (var2 != null && (var2.getAction() == Action.OPEN_FILE || var2.getAction() == Action.OPEN_URL)) {
            var1.setReturnValue(true);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private static URI lunar$getClickEventValue$v1_8(ITextComponent var0) {
      Style var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1 = var0.getStyle$v1_12();
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var1 = var0.getChatStyle$v1_8();
      } else {
         var1 = null;
      }

      if (var1 == null) {
         return null;
      }

      ClickEvent var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var1.getClickEvent$v1_12() : var1.getChatClickEvent$v1_7();
      if (var2 != null && var2.getAction() == Action.OPEN_URL) {
         try {
            return new URI(var2.getValue());
         } catch (Exception var4) {
         }
      }

      return null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "openWebLink$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$openFileWithDefaultApp$v1_8(URI var1, CallbackInfo var2) {
      if ("file".equals(var1.getScheme())) {
         com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHOHROICIIOHIIHCOHOHROCHHHIHCH().openFile(new File(var1));
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "handleInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;handleMouseInput()V", shift = Shift.AFTER))
   private void lunar$overwriteGuiScroll(CallbackInfo var1) {
      int var2 = Mouse.getEventDWheel();
      if (var2 != 0) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
            .RHCIHRRRCROICORRHICOCIORCCOOCI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var2 / 120.0);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(method = "handleMouseInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;mouseClicked(III)V"))
   private boolean lunar$overwriteGuiClick(GuiScreen var1, int var2, int var3, int var4) {
      return !com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var2, var3, var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(method = "handleMouseInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;mouseReleased(III)V"))
   private boolean lunar$overwriteGuiRelease(GuiScreen var1, int var2, int var3, int var4) {
      return !com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var2, var3, var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(method = "handleMouseInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;mouseClickMove(IIIJ)V"))
   private boolean lunar$overwriteGuiDrag(GuiScreen var1, int var2, int var3, int var4, long var5) {
      return !com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var2, var3, var4, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(method = "handleInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;handleKeyboardInput()V"))
   private boolean lunar$overwriteGuiKeyboard(GuiScreen var1) {
      IOHIHIIHCCCCCIHRORIOIOORCIOHII var2 = new IOHIHIIHCCCCCIHRORIOIOORCIOHII(
         Keyboard.getEventCharacter(), Keyboard.getEventKey(), Keyboard.getEventKeyState()
      );
      return !com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var2);
   }

   @WrapMethod(method = "setWorldAndResolution")
   private void lunar$inventoryScale(Minecraft var1, int var2, int var3, Operation<Void> var4) {
      int var5 = this.bridge$getInventoryScale();
      if (var5 <= 0) {
         var4.call(new Object[]{var1, var2, var3});
      } else {
         int var6 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH()
            .IOCIOIHIOOCRHHORHHCOOHIIHICOCH();
         float var7 = (float)var5 / var6;
         var4.call(new Object[]{var1, Math.round(var2 / var7), Math.round(var3 / var7)});
      }
   }
}
