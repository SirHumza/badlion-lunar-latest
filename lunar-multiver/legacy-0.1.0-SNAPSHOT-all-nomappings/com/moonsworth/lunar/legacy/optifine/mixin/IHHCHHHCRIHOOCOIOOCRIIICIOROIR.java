package com.moonsworth.lunar.legacy.optifine.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiVideoSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(GuiVideoSettings.class)
public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   @WrapOperation(
      method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;I)V",
      slice = @Slice(from = @At(value = "INVOKE", target = "net/optifine/Config.isAnisotropicFiltering ()Z")),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V", ordinal = 0)
   )
   private void lunar$onOpenScreen(Minecraft var1, GuiScreen var2, Operation<Void> var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH();
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = Objects.requireNonNull(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
      );
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var8 = var7.bridge$getCurrentScreen();
      boolean var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
         .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.DISABLE_SHADERS))
         .isPresent();
      if (var9) {
         var7.bridge$displayScreen(
            var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               () -> var7.bridge$displayScreen(var8), "", var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.apollo", "disabledShadersServerRule", new Object[0])
            )
         );
      } else if (var4.isEnabled()) {
         String var10 = "gui.lightingMod.mod_enabled_cannot_enable_shaders";
         var7.bridge$displayScreen(
            var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, "header", new Object[0]),
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, "warning", new Object[0]),
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, "confirmButton", new Object[0]),
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, "denyButton", new Object[0]),
               () -> {
                  ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                     ))
                     .setEnabled(false);
                  var3.call(new Object[]{var1, var2});
               },
               () -> var7.bridge$displayScreen(var8)
            )
         );
      } else {
         var3.call(new Object[]{var1, var2});
      }
   }
}
