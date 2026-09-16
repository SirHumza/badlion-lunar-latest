package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent.Action;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiChat.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH extends GuiScreen {
   @Redirect(method = "drawScreen", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiChat;drawRect(IIIII)V"))
   private void lunar$applyChatAlpha(int var1, int var2, int var3, int var4, int var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      drawRect(
         var1,
         var2,
         var3,
         var4,
         com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, var6.OHRHRRCOOCHHHCRROOCOOCRIOHCRCO())
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @ModifyExpressionValue(
      method = "drawScreen",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;getChatComponent$v1_8(II)Lnet/minecraft/util/text/ITextComponent;")
   )
   private ITextComponent lunar$onComponentHover$v1_12(ITextComponent var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (var2.isEnabled() && (Boolean)var2.CRORCRRHRRIRIIIRHIOOIOOHCIIIRR().get() && var1 != null) {
         Style var3 = var1.getStyle$v1_12();
         if (var3 != null) {
            ClickEvent var4 = var3.getClickEvent$v1_12();
            if (var4 != null && var4.getAction() == Action.OPEN_URL) {
               if (var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().CROORRIIIHICOIHOOCRRHRCOIHHHCO(var4.getValue())) {
                  return null;
               }

               return var1;
            }
         }

         return var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().CROORRIIIHICOIHOOCRRHRCOIHHHCO(null) ? null : var1;
      } else {
         var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().OIHRHIRRHRRIRHROORRROCOHOIHCRC();
         return var1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1, max = 1)
   @ModifyExpressionValue(
      method = "drawScreen",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;getChatComponent$v1_8(II)Lnet/minecraft/util/text/ITextComponent;")
   )
   private ITextComponent lunar$onComponentHover$v1_8(ITextComponent var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (var2.isEnabled() && (Boolean)var2.CRORCRRHRRIRIIIRHIOOIOOHCIIIRR().get() && var1 != null) {
         Style var3 = var1.getChatStyle$v1_8();
         if (var3 != null) {
            ClickEvent var4 = var3.getChatClickEvent$v1_7();
            if (var4 != null && var4.getAction() == Action.OPEN_URL) {
               if (var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().CROORRIIIHICOIHOOCRRHRCOIHHHCO(var4.getValue())) {
                  return null;
               }

               return var1;
            }
         }

         return var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().CROORRIIIHICOIHOOCRRHRCOIHHHCO(null) ? null : var1;
      } else {
         var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().OIHRHIRRHRRIRHROORRROCOHOIHCRC();
         return var1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyExpressionValue(
      method = "drawScreen",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;getChatComponent$v1_7(II)Lnet/minecraft/util/IChatComponent;")
   )
   private IChatComponent lunar$onComponentHover(IChatComponent var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (var2.isEnabled() && (Boolean)var2.CRORCRRHRRIRIIIRHIOOIOOHCIIIRR().get() && var1 != null) {
         Style var3 = var1.getChatStyle();
         if (var3 != null) {
            ClickEvent var4 = var3.getChatClickEvent$v1_7();
            if (var4 != null && var4.getAction() == Action.OPEN_URL) {
               if (var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().CROORRIIIHICOIHOOCRRHRCOIHHHCO(var4.getValue())) {
                  return null;
               }

               return var1;
            }
         }

         return var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().CROORRIIIHICOIHOOCRRHRCOIHHHCO(null) ? null : var1;
      } else {
         var2.ORIRRRHCRIIORRCRRRIROIROHHOOIC().OIHRHIRRHRRIRHROORRROCOHOIHCRC();
         return var1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapMethod(method = "submitChatMessage$v1_7")
   private void lunar$wrapChatMessage(String var1, Operation<Void> var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var1
            )
         );
      boolean var4 = var3 != null && var3.isCancelled();
      if (!var4) {
         String var5 = var3 == null ? var1 : var3.getMessage();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORRICCOCRHRHRHOOIROHRHIHROOROH(
            var5
         );
         var2.call(new Object[]{var5});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "mouseClicked(III)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/IChatComponent;getChatStyle()Lnet/minecraft/util/ChatStyle;")
   )
   private Style lunar$mouseClick(IChatComponent var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1
               ),
               var1.getUnformattedTextForChat()
            )
         );
      return var2 != null && var2.isCancelled() ? new Style() : var1.getChatStyle();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean handleComponentClick$v1_8(ITextComponent var1) {
      if (var1 == null) {
         return super.handleComponentClick$v1_8(null);
      }

      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> {
               String var1x = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var1.getUnformattedComponentText$v1_12() : var1.getUnformattedTextForChat$v1_8();
               return new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1
                  ),
                  var1x
               );
            }
         );
      return var2 != null && var2.isCancelled() ? false : super.handleComponentClick$v1_8(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "openLink$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$openFileWithDefaultApp$v1_7(URI var1, CallbackInfo var2) {
      if ("file".equals(var1.getScheme())) {
         com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHOHROICIIOHIIHCOHOHROCHHHIHCH().openFile(new File(var1));
         var2.cancel();
      }
   }

   @WrapWithCondition(
      method = "keyTyped",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V")
   )
   private boolean lunar$dontOverrideCustomScreen(Minecraft var1, GuiScreen var2) {
      return var2 != null || !(var1.currentScreen instanceof RIRHOCHIORCCIIOIIRHOCCCRHHCHHH);
   }

   @ModifyArg(method = "initGui", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiTextField;setMaxStringLength(I)V"))
   private int apollo$setMaxStringLength(int var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      var1 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft.getMinecraft().isSingleplayer(), var1);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
         .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.OVERRIDE_MAX_CHAT_LENGTH))
         .map(var0 -> ((Number)var0.getOptions().get(ServerRuleModule.MAX_CHAT_LENGTH)).intValue())
         .orElse(var1);
   }

   @Inject(method = "initGui", at = @At("TAIL"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      absent = "optifine",
      available = @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   )
   private void apollo$handleChatOpen(CallbackInfo var1) {
      this.apollo$sendChatPacket(true);
   }

   @Inject(method = "onGuiClosed", at = @At("TAIL"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      absent = "optifine",
      available = @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   )
   private void apollo$handleChatClose(CallbackInfo var1) {
      this.apollo$sendChatPacket(false);
   }

   @Unique
   private void apollo$sendChatPacket(boolean var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(PacketEnrichmentModule.class)
         .filter(
            var1x -> (Boolean)var1x.getOptions().get(var1 ? PacketEnrichmentModule.PLAYER_CHAT_OPEN_PACKET : PacketEnrichmentModule.PLAYER_CHAT_CLOSE_PACKET)
         )
         .ifPresent(
            var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR)var1x)
               .RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var1)
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true)
   private void lunar$preventRewindSystemClickEvent$v1_7(int var1, int var2, int var3, CallbackInfo var4) {
      if (var3 == 0
         && this.mc.gameSettings.chatLinks
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         && !isShiftKeyDown()) {
         IChatComponent var5 = this.mc.ingameGUI.getChatGUI().getChatComponent$v1_7(Mouse.getX(), Mouse.getY());
         if (var5 != null) {
            ClickEvent var6 = var5.getChatStyle().getChatClickEvent$v1_7();
            if (var6 != null && (var6.getAction() == Action.OPEN_FILE || var6.getAction() == Action.OPEN_URL)) {
               var4.cancel();
            }
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "mouseClicked",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;chatLinksPrompt:Z", opcode = 180, shift = Shift.BEFORE),
      cancellable = true
   )
   private void lunar$maliciousUrlWarning$v1_7(int var1, int var2, int var3, CallbackInfo var4) {
      URI var5 = this.lunar$getClickEventValue();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHOIROCHCHORIOOOIHCIIIRHIORIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(), var5)) {
         var4.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private URI lunar$getClickEventValue() {
      IChatComponent var1 = this.mc.ingameGUI.getChatGUI().getChatComponent$v1_7(Mouse.getX(), Mouse.getY());
      if (var1 == null) {
         return null;
      }

      Style var2 = var1.getChatStyle();
      if (var2 == null) {
         return null;
      }

      ClickEvent var3 = var2.getChatClickEvent$v1_7();
      if (var3 != null && var3.getAction() == Action.OPEN_URL) {
         try {
            return new URI(var3.getValue());
         } catch (Exception var5) {
         }
      }

      return null;
   }
}
