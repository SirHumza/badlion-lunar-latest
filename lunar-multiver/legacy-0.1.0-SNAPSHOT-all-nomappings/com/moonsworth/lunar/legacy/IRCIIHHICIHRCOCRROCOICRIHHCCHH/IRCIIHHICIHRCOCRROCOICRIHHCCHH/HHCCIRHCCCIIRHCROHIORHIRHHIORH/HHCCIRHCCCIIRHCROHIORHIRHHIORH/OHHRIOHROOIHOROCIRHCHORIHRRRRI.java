package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.collect.Ordering;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextReplacementConfig;
import com.moonsworth.lunar.lib.adventure.text.TextComponent.Builder;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(GuiPlayerTabOverlay.class)
public class OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Unique
   private static final Predicate<NetworkPlayerInfo> IS_REAL_PLAYER = var0 -> {
      GameProfile var1 = var0.getGameProfile();
      return var1.getId().version() != 2 || var1.getName().startsWith("!");
   };
   @Unique
   private static final UUID EMPTY_UUID = UUID.randomUUID();
   @Shadow
   public ITextComponent header;
   @Shadow
   public ITextComponent footer;
   @Final
   @Shadow
   public static Ordering<NetworkPlayerInfo> ENTRY_ORDERING;
   @Unique
   private UUID lunar$modifyingPlayerEntry = null;

   @ModifyConstant(method = "renderPlayerlist", constant = {@Constant(intValue = 9, ordinal = 0), @Constant(intValue = 9, ordinal = 3)})
   private int lunar$offsetText(int var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      return var2.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
               .CCOHIRRICRIROORHCRCRRIOICHHROI()
               .get()
         ? 18
         : var1;
   }

   @Inject(method = "drawPing(IIILnet/minecraft/client/network/NetworkPlayerInfo;)V", at = @At("HEAD"), cancellable = true)
   private void lunar$drawPing(int var1, int var2, int var3, NetworkPlayerInfo var4, CallbackInfo var5, @Local(ordinal = 0, argsOnly = true) LocalIntRef var6) {
      int var7 = var2 + var1 - 2;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      boolean var9 = var8.OCRHCRHICOCOOOHIROIHCIHIRICRCI(var4.getResponseTime());
      byte var10 = 0;
      if (var8.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC()) {
         var10 = 10;
         int var11 = var9 && var8.RRRHCICCIICCROCROIICICRCCORROO().get() ? 0 : 9;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR var12 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         if (var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12.IRCRHHCRHIIIHROOCORCHHHRIIROIR(), var7 - var11, var3, this.lunar$modifyingPlayerEntry)) {
            var12.HHCCIRHCCCIIRHCROHIORHIRHHIORH(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }

      this.lunar$modifyingPlayerEntry = null;
      if (var9) {
         var5.cancel();
      } else if (var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
         var4.getResponseTime(),
         var7 + var10,
         var3
      )) {
         var5.cancel();
      } else {
         if (var10 != 0) {
            var6.set(var6.get() + var10);
         }
      }
   }

   @Redirect(method = "renderPlayerlist", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;isIntegratedServerRunning()Z"))
   private boolean lunar$isRunningIntegrated(Minecraft var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      return var2.isEnabled() && !var2.IOCIIIIIOIICROIICIIORHIHICOCCR().get() ? false : var1.isIntegratedServerRunning();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @ModifyExpressionValue(method = "renderPlayerlist", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager_v1_12;isEncrypted()Z"))
   private boolean lunar$changeIsEncrypted$v1_12(boolean var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      return var2.isEnabled() && !var2.IOCIIIIIOIICROIICIIORHIHICOCCR().get() ? false : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @ModifyExpressionValue(method = "renderPlayerlist", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager_v1_8;getIsencrypted()Z"))
   private boolean lunar$changeIsEncrypted$v1_8(boolean var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      return var2.isEnabled() && !var2.IOCIIIIIOIICROIICIIORHIHICOCCR().get() ? false : var1;
   }

   @Redirect(
      method = "renderPlayerlist",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;",
         ordinal = 1
      )
   )
   private String lunar$onGetPlayerName(GuiPlayerTabOverlay var1, NetworkPlayerInfo var2) {
      this.lunar$modifyingPlayerEntry = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
         .bridge$getProfileTextureId();
      String var3 = var1.getPlayerName(var2);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2,
               Component.text(var3)
            )
         );
      return var4 != null && var4.isChanged()
         ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContentForRendering(
            var4.getComponent()
         )
         : var3;
   }

   @Redirect(
      method = "renderPlayerlist",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow$v1_8(Ljava/lang/String;FFI)I")
   )
   private int lunar$onDrawString(FontRenderer var1, String var2, float var3, float var4, int var5) {
      float var6 = 0.0F;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR var8 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      boolean var9 = var7.isEnabled() ? (Boolean)var7.RHIHOCHHRCRROIHOORHHIRIRROIHIH().get() : true;
      var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OROIIHCOORRIOOHICOOROCOORICCOR()
         .HOORIORICHOORIIRRRCOHCIRIICOCI(var2);
      if (this.lunar$modifyingPlayerEntry != null) {
         if (!var7.IOCHHOOHRRHHOIIRHHHHHOHHIOOORC()
            && var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8.IRCRHHCRHIIIHROOCORCHHHRIIROIR(), var3, var4, this.lunar$modifyingPlayerEntry)) {
            var6 = 9.0F;
         }

         int var13;
         if (var7.isEnabled()
            && (Boolean)var7.HIIIRIHHICIIICOCCHHOOOCCOROOCO().get()
            && this.lunar$modifyingPlayerEntry.equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID())) {
            Component var11 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
                     new TextComponentString(var2)
                  )
               )
               .replaceText(
                  (TextReplacementConfig)TextReplacementConfig.builder()
                     .match(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName())
                     .replacement(
                        var1x -> ((Builder)var1x.color(TextColor.color(var7.IRRHHIHORCOICCCRORIIOIROOCRHRI().CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F))))
                           .content(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName())
                     )
                     .build()
               );
            var13 = (int)IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$drawString(var8, var11, var3 + var6, var4, var5, var9);
         } else {
            var13 = var1.drawString$v1_8(var2, var3 + var6, var4, var5, var9);
         }

         if (var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8.IRCRHHCRHIIIHROOCORCHHHRIIROIR(), var13, var4, this.lunar$modifyingPlayerEntry)) {
            var13 += 8;
         }

         return var13;
      } else {
         int var10 = var1.drawString$v1_8(var2, var3 + var6, var4, var5, var9);
         if (var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8.IRCRHHCRHIIIHROOCORCHHHRIIROIR(), var10, var4, this.lunar$modifyingPlayerEntry)) {
            var10 += 8;
         }

         return var10;
      }
   }

   @Redirect(
      method = "renderPlayerlist",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;",
         ordinal = 0
      )
   )
   private String lunar$onGetPlayerName$0(GuiPlayerTabOverlay var1, NetworkPlayerInfo var2, @Share("additionWeight") LocalBooleanRef var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .OIHICOHORRHOORRHROCOORROROIHIO()
         && ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
               .bridge$getProfileTextureId()
            != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HOOCCHIIOIRIIRRIRHRROHOHHRHROI()
            .IOCCCRIHOCHRCHRHCRHROIRIRHHHIR(
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
                  .bridge$getProfileTextureId()
            )) {
         var3.set(true);
         this.lunar$modifyingPlayerEntry = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
            .bridge$getProfileTextureId();
      }

      return var1.getPlayerName(var2);
   }

   @Redirect(
      method = "renderPlayerlist",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;getStringWidth(Ljava/lang/String;)I", ordinal = 0)
   )
   private int lunar$onGetStringWidth(FontRenderer var1, String var2, @Share("additionWeight") LocalBooleanRef var3) {
      int var4 = var3.get()
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HOOCCHIIOIRIIRRIRHRROHOHHRHROI()
            .CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(this.lunar$modifyingPlayerEntry)
         : 0;
      var3.set(false);
      this.lunar$modifyingPlayerEntry = null;
      return var1.getStringWidth(var2) + var4;
   }

   @ModifyArg(
      method = "renderPlayerlist",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawRect(IIIII)V", ordinal = 0),
      index = 4
   )
   private int lunar$overrideHeaderColor(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().COCHICOCRHIHCRHHOORIRHIROROIOC().isEnabled()
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .COCHICOCRHIHCRHHOORIRHIROROIOC()
            .CICOCHRIIRIRRROOHRICIRRRHOIHCR()
            .CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F)
         : var1;
   }

   @ModifyArg(
      method = "renderPlayerlist",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawRect(IIIII)V", ordinal = 1),
      index = 4
   )
   private int lunar$overrideBackgroundColor(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().COCHICOCRHIHCRHHOORIRHIROROIOC().isEnabled()
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .COCHICOCRHIHCRHHOORIRHIROROIOC()
            .ICCIIRRIHRRCORCORHIOORIRRRRCIH()
            .CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F)
         : var1;
   }

   @ModifyArg(
      method = "renderPlayerlist",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawRect(IIIII)V", ordinal = 3),
      index = 4
   )
   private int lunar$overrideFooterColor(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().COCHICOCRHIHCRHHOORIRHIROROIOC().isEnabled()
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .COCHICOCRHIHCRHHOORIRHIROROIOC()
            .ORIIIHOCOHHOOCOOIHRHOCHIIIROCH()
            .CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F)
         : var1;
   }

   @Redirect(
      method = "renderPlayerlist",
      at = @At(value = "INVOKE", target = "Lcom/google/common/collect/Ordering;sortedCopy(Ljava/lang/Iterable;)Ljava/util/List;")
   )
   private List<NetworkPlayerInfo> lunar$render$getPlayerInfo(
      Ordering var1, Iterable<NetworkPlayerInfo> var2, @Share("index") LocalIntRef var3, @Share("list") LocalRef<List<NetworkPlayerInfo>> var4
   ) {
      List var5 = ENTRY_ORDERING.sortedCopy(var2);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC()
         .IORIRRCRCICIHHOOIIOCRIRCICHIOH()) {
         UUID var6 = Minecraft.getMinecraft().player$v1_8.getUniqueID();
         NetworkPlayerInfo var7 = var5.stream().filter(var1x -> var1x.gameProfile != null && var1x.gameProfile.getId().equals(var6)).findFirst().orElse(null);
         if (var7 != null) {
            var5.remove(var7);
            var5.add(0, var7);
         }
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC()
         .IICHCCICHIOOHHCCICIRRIOHCCOCCR()) {
         var5.removeIf(IS_REAL_PLAYER.negate());
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC.CRRRICCRROCOHHOHIICIHORCOORRRH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOHCCHIIRCOHRROCRRRRHCIIHRRORC();
      if (var8.isEnabled() && (Boolean)var8.OOCIIHROHCHOIRIRIOHOHIORCRRIOO().get()) {
         Optional var9 = var5.stream().filter(var0 -> var0.displayName != null && var0.displayName.getUnformattedText().isEmpty()).findAny();
         var5.replaceAll(
            var2x -> var2x != null
                  && var8.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)var2x
                  )
               ? var9.orElse(var2x)
               : var2x
         );
      }

      ArrayList var10 = new ArrayList(var5);
      List var11 = var10.subList(0, Math.min(var10.size(), 80));
      this.lunar$queueTabLogoUpdates(var11);
      var4.set(var11);
      var3.set(0);
      return var5;
   }

   @Redirect(method = "renderPlayerlist", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawRect(IIIII)V", ordinal = 2))
   private void lunar$render$fill$2(
      int var1, int var2, int var3, int var4, int var5, @Share("index") LocalIntRef var6, @Share("list") LocalRef<List<NetworkPlayerInfo>> var7
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      if (!var8.isEnabled()) {
         Gui.drawRect(var1, var2, var3, var4, var5);
      } else {
         int var9 = var6.get();
         int var10 = var8.ORHHCHCCIOOIHIHCCHICIICCOCOICO().CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(var9);
         List var11 = (List)var7.get();
         if (var11 != null && (Boolean)var8.ICIOCCRHOHCIRRIIIIHOOHIOOIOIHC().get() && var9 < var11.size()) {
            NetworkPlayerInfo var12 = (NetworkPlayerInfo)var11.get(var9);
            if (var12 != null) {
               var10 = var8.HICROROICOCOHOOHHCRCROOCCRCIHR(var12.getResponseTime());
               var10 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var10, 0.1254902F);
            }
         }

         Gui.drawRect(var1, var2, var3, var4, var10);
         var6.set(++var9);
      }
   }

   @Inject(method = "renderPlayerlist", at = @At("HEAD"))
   private void lunar$render$head(
      int var1,
      Scoreboard var2,
      ScoreObjective var3,
      CallbackInfo var4,
      @Share("header") LocalRef<ITextComponent> var5,
      @Share("footer") LocalRef<ITextComponent> var6
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      if (var7.isEnabled()) {
         if ((Boolean)var7.CHICICRCIHRHRHROHOIRICIIROOCIC().get()) {
            var5.set(this.header);
            this.header = null;
         }

         if ((Boolean)var7.HRHIRCCOICIHRIHCHRHIHIRRROOICC().get()) {
            var6.set(this.footer);
            this.footer = null;
         }
      }
   }

   @Inject(method = "renderPlayerlist", at = @At("RETURN"))
   private void lunar$render$return(
      int var1,
      Scoreboard var2,
      ScoreObjective var3,
      CallbackInfo var4,
      @Share("header") LocalRef<ITextComponent> var5,
      @Share("footer") LocalRef<ITextComponent> var6
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      if (var7.isEnabled()) {
         if ((Boolean)var7.CHICICRCIHRHRHROHOIRICIIROOCIC().get()) {
            this.header = (ITextComponent)var5.get();
         }

         if ((Boolean)var7.HRHIRCCOICIHRIHCHRHIHIRRROOICC().get()) {
            this.footer = (ITextComponent)var6.get();
         }
      }
   }

   @Unique
   private void lunar$queueTabLogoUpdates(List<NetworkPlayerInfo> var1) {
      Set var2 = var1.stream().filter(IS_REAL_PLAYER).map(var0 -> var0.getGameProfile().getId()).collect(Collectors.toSet());
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRROIRCCCRHRROHRIORCCIIOORRRHH();
      if (var3 != null && var3.isEnabled() && var3.OIIIHICHIRHRICCHIIIROHOIOOIRHR()) {
         Set var4 = var1.stream().map(var0 -> var0.getGameProfile().getId()).collect(Collectors.toSet());
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4);
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOOCCHIIOIRIIRRIRHRROHOHHRHROI()
         .OHHRIOHROOIHOROCIRHCHORIHRRRRI(var2);
   }

   @WrapOperation(method = "renderPlayerlist", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;isIntegratedServerRunning()Z"))
   private boolean lunar$rewindRenderPlayerHead(Minecraft var1, Operation<Boolean> var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      return var3.HRIICOIOIIIIRIHHOICRHOIIRCIRIC() || (Boolean)var2.call(new Object[]{var1});
   }
}
