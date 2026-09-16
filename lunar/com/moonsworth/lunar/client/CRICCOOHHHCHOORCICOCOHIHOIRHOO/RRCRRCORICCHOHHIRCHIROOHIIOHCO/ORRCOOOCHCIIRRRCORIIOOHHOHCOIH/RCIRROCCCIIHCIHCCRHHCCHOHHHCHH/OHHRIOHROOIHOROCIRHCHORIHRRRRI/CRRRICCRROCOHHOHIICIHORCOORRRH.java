package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.util.COOCCHICCCIIICRHIOCOCIOOORCOCC;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Pattern CCCHOHHCRHHHRCOHROROCRRCCIHCCR = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d+)$");
   private static final Pattern ICHHICCCROCHIROIRHIIIIHCCOHOCC = Pattern.compile("^[✧✯](\\d{1,3}(,\\d{3})*|\\d+)[✧✯]$");
   private static final Pattern HCCOOCCIHRCCOHOCHIIRRCCRRHCORC = Pattern.compile("[✧❤✯, ]");
   private static final List<NamedTextColor> CHHHCOCCIHRHRRORCHICRHRHRCCHOH = List.of(
      NamedTextColor.YELLOW, NamedTextColor.WHITE, NamedTextColor.RED, NamedTextColor.GOLD
   );
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI IORROIRCROHOHIROIICRIRIICRIHRR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "truncateDamageSplash"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI RORIIRROIICRICIHHCIOCHIHRCRIHC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("hideNonCrits")
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI RHOOCOHCIHOCIHOOORICIOHHROCHIH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hideAllDamageSplash"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final RIROICHCRROROHCCROOCCCCOCHCCRI<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OCRORIIRCCIOOCHRRCCROCHOIHOCIR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "damageSplashCustomColor",
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();

   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCICHOCCRIHORROHIOCRROCCIICO,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1)
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.ORRCRCCOHRCIOOCOICRICOOHOCROCH,
         OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GENERAL
         )
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.ORHOIHCRRCOIICCIOICHCIIROHCOIR,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this,
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI::RRRCCHIOCICOIOIRRCOOIRHHCORCIH
         )
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
         this::CRICCOOHHHCHOORCICOCOHIHOIRHOO
      );
   }

   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.OCOIORCRROIOOCHORHHHROCHCCIHRR;
      if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
         )
       {
         if (var3.bridge$isMarker()) {
            Component var4 = var2.bridge$getCustomName();
            if (var4 != null) {
               String var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(
                  var4
               );
               Matcher var6 = CCCHOHHCRHHHRCOHROROCRRCCIHCCR.matcher(var5);
               boolean var7 = var6.find();
               if (!var7 || !this.RORIIRROIICRICIHHCIOCHIHRCRIHC.get() && !this.RHOOCOHCIHOCIHOOORICIOHHROCHIH.get()) {
                  if (var7 && this.IORROIRCROHOHIROIICRIRIICRIHRR.get()) {
                     int var12 = Integer.parseInt(var5.replaceAll(HCCOOCCIHRCCOHOCHIIRRCCRRHCORC.pattern(), ""));
                     Component var13 = Component.text(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var12, false))
                        .style(
                           Style.empty()
                              .color(
                                 this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR.get()
                                       != com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF
                                    ? this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR.get().getColor().getAdventureColor()
                                    : var4.color()
                              )
                        );
                     var2.bridge$setCustomName(var13);
                  } else {
                     var6 = ICHHICCCROCHIROIRHIIIIHCCOHOCC.matcher(var5);
                     boolean var8 = var6.find();
                     if (var8 && this.RHOOCOHCIHOCIHOOORICIOHHROCHIH.get()) {
                        var2.bridge$setCustomNameVisible(false);
                     } else if (var8 && this.IORROIRCROHOHIROIICRIRIICRIHRR.get()) {
                        int var9 = Integer.parseInt(var5.replaceAll(HCCOOCCIHRCCOHOCHIIRRCCRRHCORC.pattern(), ""));
                        Component var10 = this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR.get()
                              != com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF
                           ? Component.text(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9, true))
                              .style(Style.empty().color(this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR.get().getColor().getAdventureColor()))
                           : this.HOCRIORCCCIHIIHHHORIHOOCHOCORH(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9, true));
                        var2.bridge$setCustomName(var10);
                     } else {
                        if ((var7 || var8)
                           && this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR.get()
                              != com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OFF
                           )
                         {
                           var2.bridge$setCustomName(
                              Component.text(var5).style(Style.empty().color(this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR.get().getColor().getAdventureColor()))
                           );
                        }
                     }
                  }
               } else {
                  var2.bridge$setCustomNameVisible(false);
               }
            }
         }
      }
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, boolean var2) {
      String var3 = COOCCHICCCIIICRHIOCOCIOOORCOCC.RRHHORICORICIRHICOHHROHIIHICCH(var1);
      return var2 ? "✧" + var3 + "✧ " : var3;
   }

   private Component HOCRIORCCCIHIIHHHORIHOOCHOCORH(String var1) {
      Component var2 = Component.empty();
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         if (var1.charAt(var4) == ' ') {
            var2 = var2.append(Component.text(' '));
         } else {
            var2 = var2.append(Component.text(var1.charAt(var4)).color(CHHHCOCCIHRHRRORCHICRHRHRCCHOH.get(var3 % CHHHCOCCIHRHRRORCHICRHRHRCCHOH.size())));
            var3++;
         }
      }

      return var2;
   }

   @Override
   public String getId() {
      return "SKYBLOCK_DAMAGE_SPLASH";
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
         this.IORROIRCROHOHIROIICRIRIICRIHRR, this.RORIIRROIICRICIHHCIOCHIHRCRIHC, this.RHOOCOHCIHOCIHOOORICIOHHROCHIH, this.OCRORIIRCCIOOCHRRCCROCHOIHOCIR
      );
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCOCHOCIRORHHORHCROHOIOCRCHIO
         )
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }
}
