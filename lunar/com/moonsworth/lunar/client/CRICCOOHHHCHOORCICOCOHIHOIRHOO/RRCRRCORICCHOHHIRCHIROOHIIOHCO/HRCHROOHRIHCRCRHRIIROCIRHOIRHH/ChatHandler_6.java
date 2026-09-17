package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.transform.ComponentTransform;
import com.lunarclient.adventure.transform.ComponentTransformer;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Nullable
   private List<ComponentTransformer> RHOOIROORRIRROHRICOICHHICIOCHR = null;
   private Pattern IHIOHOOHHIRRCOIIIICCOHORCCRCOI = Pattern.compile("");

   protected boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      boolean var3 = var2.OIHOROHIIHRHIHIOHHOIHIRIIIIRIH().get()
         != com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF;
      boolean var4 = var2.IIOOHRRCIHOHCIHCOOIRRHHICORIRO().get();
      boolean var5 = var2.HIIOHOCIOOCCICOHHROOHCORCHCHIO().get();
      boolean var6 = var2.HRHICCORIRCIOICHHOIRROCHHROOHC().get();
      boolean var7 = var2.ORICHHOCIHIHCCRRIOCRCORIHRCCHI().get();
      boolean var8 = var2.IORRCIOIOIHHIRIOCCOCRRROHHCHRI().get();
      if (var3 || var4 || var5 || var6 || var7 || var8) {
         NamedTextColor var9 = var2.OIHOROHIIHRHIHIOHHOIHIRIIIIRIH().get().getColor().getAdventureColor();
         Component var10 = var1.OIOORCCOCHRRIRRORRICOCOCROICII();
         String var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName();
         TextComponent.Builder var12 = Component.text().content(var11).color(var9);
         if (var4) {
            var12.decorate(TextDecoration.BOLD);
         }

         if (var5) {
            var12.decorate(TextDecoration.ITALIC);
         }

         if (var6) {
            var12.decorate(TextDecoration.UNDERLINED);
         }

         if (var7) {
            var12.decorate(TextDecoration.STRIKETHROUGH);
         }

         if (var8) {
            var12.decorate(TextDecoration.OBFUSCATED);
         }

         Component var13 = ComponentTransformer.replaceLiteral(var11, var12.build()).transform(var10);
         if (!var13.equals(var10)) {
            var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var13);
         }
      }

      Component var14 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.OIOORCCOCHRRIRRORRICOCOCROICII(), var1);
      if (var14 != null) {
         var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var14);
      }

      if (var1.OIOOHRIICIIHRORHORHHOOHCOIICIH() && var2.HCICHOOIHOCHCRRICHCROICRRHCCHR().get()) {
         var1.setCancelled(true);
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Component var1,
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (this.RHOOIROORRIRROHRICOICHHICIOCHR == null) {
         return null;
      }

      Component var3 = var1;

      for (ComponentTransformer var5 : this.RHOOIROORRIRROHRICOICHHICIOCHR) {
         var3 = var5.transform(var3);
      }

      if (var1.equals(var3)) {
         return null;
      }

      var2.ORIRHOHRHHROCHHRRIOOCRIHRIIIOC = true;
      return var3;
   }

   @Contract("null -> null; !null -> !null")
   private List<Pattern> OHIIIOHIRIRCCRRIOIICCHHIORRHOH(@Nullable List<Pattern> var1) {
      if (var1 == null) {
         return null;
      }

      ArrayList var2 = new ArrayList();

      for (Pattern var4 : var1) {
         if (!var4.toString().isEmpty() && !var4.toString().contains("()")) {
            var2.add(var4);
         }
      }

      return var2;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      List var2 = this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
         switch (var1) {
            case NORMAL -> {
               ArrayList var7 = Lists.newArrayList(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHRIHOIIOIRRCHRHRIHIRICOIHRHRO().HHCIRRCCORCIRIHCCIIRRCIOOIOHCR()
               );
               Pattern var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHRIHOIIOIRRCHRHRIHIRICOIHRHRO().IRRIRCCIRORIICCIRHHCOCCRRCRORI();
               if (var9 != null) {
                  var7.add(var9);
               }

               var7.add(this.IHIOHOOHHIRRCOIIIICCOHORCCRCOI);
               yield var7;
            }
            case HIGH -> {
               ArrayList var3 = Lists.newArrayList(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHRIHOIIOIRRCHRHRIHIRICOIHRHRO().OIIHIIHCCCHOOICHROHOIOROORCIII()
               );
               Pattern var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHRIHOIIOIRRCHRHRIHIRICOIHRHRO().ORCIRORHHRHCCOCCHHIIHCCOHRHHHO();
               if (var4 != null) {
                  var3.add(var4);
               }

               var3.add(this.IHIOHOOHHIRRCOIIIICCOHORCCRCOI);
               yield var3;
            }
            case CUSTOM -> List.of(this.IHIOHOOHHIRRCOIIIICCOHORCCRCOI);
            case OFF -> null;
         }
      );
      if (var2 == null) {
         this.RHOOIROORRIRROHRICOICHHICIOCHR = null;
      } else {
         ComponentTransform var8 = ComponentTransform.builder().textFunctor(var0 -> Strings.repeat("*", var0.length())).build();
         Builder var10 = new Builder();

         for (Pattern var6 : var2) {
            var10.add(ComponentTransformer.of(ComponentPattern.pattern(var6), var8));
         }

         this.RHOOIROORRIRROHRICOICHHICIOCHR = var10.build();
      }
   }

   protected void CRRRICCRROCOHHOHIICIHORCOORRRH(File var1) {
      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         String var2 = "(";
         String var3 = ")";
         this.IHIOHOOHHIRRCOIIIICCOHORCCRCOI = Pattern.compile(var2 + this.IHICORCROOROHCIHIHCOIHRRHICICO(Files.readAllLines(var1.toPath())) + var3, 2);
      } catch (IOException var4) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "Loading ChatMod");
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.OCOHIIOORCROOOCORRCRHRRRIOHORH().get());
   }

   private String IHICORCROOROHCIHIHCOIHRRHICICO(List<String> var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.size(); var3++) {
         String var4 = (String)var1.get(var3);
         if (!var4.isBlank()) {
            var2.append('(');
            var2.append(Pattern.quote(var4));
            var2.append(")");
            if (var3 != var1.size() - 1) {
               var2.append('|');
            }
         }
      }

      return var2.toString();
   }
}
