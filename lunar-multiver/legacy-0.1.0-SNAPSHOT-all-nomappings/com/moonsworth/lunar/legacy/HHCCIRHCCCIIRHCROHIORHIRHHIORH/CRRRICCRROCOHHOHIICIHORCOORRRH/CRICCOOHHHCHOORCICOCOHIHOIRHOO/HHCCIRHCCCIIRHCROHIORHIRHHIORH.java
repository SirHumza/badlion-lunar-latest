package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHCRORHRORIICHRHRCHRRIRRHHOCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.LanguageManager;
import net.minecraft.client.resources.Language_v1_7;
import net.minecraft.client.resources.Language_v1_8;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LanguageManager.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public String currentLanguage;
   @Final
   @Shadow
   public Map<String, Language_v1_8> languageMap$v1_8;
   @Shadow
   public Map languageMap$v1_7;

   @Shadow
   public abstract boolean isCurrentLanguageBidirectional();

   @Shadow
   public abstract boolean isCurrentLocaleUnicode();

   @Shadow
   public abstract void setCurrentLanguage$v1_8(Language_v1_8 var1);

   @Shadow
   public abstract void setCurrentLanguage$v1_7(Language_v1_7 var1);

   @Inject(method = "<init>(Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/String;)V", at = @At("TAIL"))
   private void lunar$onConstruct(CallbackInfo var1) {
      this.lunar$handleLanguageUpdate();
   }

   @Inject(method = {"setCurrentLanguage$v1_7", "setCurrentLanguage$v1_8"}, at = @At("TAIL"))
   private void lunar$onSetLanguage(CallbackInfo var1) {
      this.lunar$handleLanguageUpdate();
   }

   @Unique
   private void lunar$handleLanguageUpdate() {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null
         && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR() != null) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .setLanguage(this.currentLanguage);
      } else {
         IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OORHIHHCIRRIRCOHICHCICHIHOOHCO = this.currentLanguage;
      }
   }

   @Unique
   private String lunar$normalizeCountryCode(String var1) {
      return Arrays.stream(var1.split("_")).reduce("", (var0, var1x) -> !var0.isEmpty() ? var0 + "_" + var1x.toUpperCase() : var1x);
   }

   public List<IHCRORHRORIICHRHRCHRRIRRHHOCOO> bridge$getLanguages() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.languageMap$v1_8
            .values()
            .stream()
            .map(
               var1 -> {
                  String var2 = this.lunar$normalizeCountryCode(var1.languageCode);
                  return new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     var2, var1.region, var1.name, com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.isSupported(var2)
                  );
               }
            )
            .collect(Collectors.toList())
         : this.languageMap$v1_7
            .values()
            .stream()
            .map(
               var1 -> {
                  Language_v1_7 var2 = (Language_v1_7)var1;
                  String var3 = this.lunar$normalizeCountryCode(var2.languageCode);
                  return new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     var3, var2.region, var2.name, com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.isSupported(var3)
                  );
               }
            )
            .collect(Collectors.toList());
   }

   public void bridge$setCurrentLanguage(String var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1 = var1.toLowerCase();
      }

      Minecraft var2 = Minecraft.getMinecraft();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         Language_v1_8 var3 = this.languageMap$v1_8.get(var1);
         this.setCurrentLanguage$v1_8(var3);
         var2.gameSettings.language = var3.languageCode;
      } else {
         Language_v1_7 var4 = (Language_v1_7)this.languageMap$v1_7.get(var1);
         this.setCurrentLanguage$v1_7(var4);
         var2.gameSettings.language = var4.languageCode;
      }

      var2.refreshResources();
      var2.fontRenderer.setUnicodeFlag(this.isCurrentLocaleUnicode() || var2.gameSettings.forceUnicodeFont);
      var2.fontRenderer.setBidiFlag(this.isCurrentLanguageBidirectional());
      var2.gameSettings.saveOptions();
   }
}
