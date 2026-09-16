package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.client.util.COOCCHICCCIIICRHIOCOCIOOORCOCC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final String CIOHICCRCCIOHIHIIOIHOIOHIHOIII = "[❤\ue010]";
   private static final String HRHCOORCOHHCHCOCOIROOHHICIOCCH = "[❈\ue008]";
   private static final String HOHIHCCOHCHCCOHOHRHCHOOCICIRCR = "[✎\ue003]";
   private static final String IORHHICCHHHHOHOOHRHCHHCCHCIOIO = "[ʬ\ue017]";
   private static final String HCHORRRCIORCRHCRIIHROIRRRHCCOR = "[♨\ue028]";
   private static final Pattern RCOHCHRHRHCOHIRIOIHRIRHCCRRIHO = Pattern.compile("(?<current>[0-9,]+)/(?<total>[0-9,]+)[❤\ue010]");
   private static final Pattern CCCOHIHHRCOCRRIOOCCRIIHICRHCHI = Pattern.compile("(?<def>[0-9,]+)[❈\ue008]( Defense)?");
   private static final Pattern RCRROHRIIHOCHIHHICRRHRHHIRCOCR = Pattern.compile("(?<stacks>[0-9]+)(?<type>[ѫ⁑ᝐ⚶҉])");
   private static final Pattern RICORHOHCCIRCIOICOIHIRCRCIOIIC = Pattern.compile(
      "(?<current>[0-9,]+)/(?<total>[0-9,]+)[✎\ue003]( (§3(?<overflow>[0-9,]+)[ʬ\ue017]|Mana))?"
   );
   private static final Pattern CROHHOORHORCHCIIHCOORHROCIHRCI = Pattern.compile("(?<current>[0-9,]+)/(?<total>[0-9,]+)[♨\ue028]");
   private int CHRICHRIHHCOCHOOHRHHCCIOIRHIIO;
   private int HHCHICIRIOROHCRIHOOIRHRORCICRC;
   private int OCCHRRHHRROHRIORIIHRHIIHHIHRIC;
   private int COOHCOCROICOICHCCOCOHRORHCICRI;
   private int ICOOCCRIHHOICHOHOHOHCHIIOIHHCC;
   private char RCROIRCCCRRRCCRHOIHRRRHIRORROC;
   private int COOCIRIRHCOOOOOCCOHORIRHHIRROH;
   private int HHIIRHIIRIORCCHHOCCCHORRHCHRIH;
   private int HHIHHIHIRCICCHHIIOIIRRHOHIIHHR;
   private boolean ORRORCCHHRCHIOOCCRORRRRCCCOOHR;
   private int CRHHHCIIOCHHCIIOCRCCRCHOIICIHH;
   private int OIOOORRHIRROHOOCHOCRICIIOOROCO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         this::CRRRICCRROCOHHOHIICIHORCOORRRH,
         200
      );
   }

   @Override
   protected boolean isEnabled() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI.RRRCCHIOCICOIOIRRCOOIRHHCORCIH();
   }

   public NamedTextColor IHOHRROCHIOORCIOCRRROCOORCOOCO() {
      float var1 = (float)this.CHRICHRIHHCOCHOOHRHHCCIOIRHIIO / this.HHCHICIRIOROHCRIHOOIRHRORCICRC;
      if (var1 > 0.5) {
         return NamedTextColor.GREEN;
      } else {
         return var1 > 0.2 ? NamedTextColor.YELLOW : NamedTextColor.RED;
      }
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI.RRRCCHIOCICOIOIRRCOOIRHHCORCIH()
         )
       {
         if (!var1.isCancelled()) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IHIIROIOIHOHCHICOIIIHOHHCOIOCI();
            String var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
               var1.OIOORCCOCHRRIRRORRICOCOCROICII()
            );
            Matcher var4 = RCOHCHRHRHCOHIRIOIHRIRHCCRRIHO.matcher(var3);
            if (var4.find()) {
               boolean var5 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
               String var6 = var5 ? var4.group("current").substring(1) : var4.group("current");
               String var7 = var4.group("total");
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var6.replace(",", ""))
                  .ifPresent(var1x -> this.CHRICHRIHHCOCHOOHRHHCCIOIRHIIO = var1x);
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var7.replace(",", ""))
                  .ifPresent(var1x -> this.HHCHICIRIOROHCRIHOOIRHRORCICRC = var1x);
               if (var2.OOCOCCCHHROOCRHHCOHROCIIRCCHHI().isEnabled()) {
                  var3 = var3.replace(var4.group(0), "");
               }
            } else if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI.HIOIORCICHOHCHCHRRIRHIIIOHICIH()
               == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIFT
               )
             {
               this.CHRICHRIHHCOCHOOHRHHCCIOIRHIIO = 0;
               this.HHCHICIRIOROHCRIHOOIRHRORCICRC = 0;
            }

            var4 = CCCOHIHHRCOCRRIOOCCRIIHICRHCHI.matcher(var3);
            if (var4.find() && var2.RIHOOROIHHIIOOROIRHCRHRROOHCCR().isEnabled()) {
               boolean var12 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
               String var16 = var12 ? var4.group("def").substring(1) : var4.group("def");
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var16.replace(",", ""))
                  .ifPresent(var1x -> this.OCCHRRHHRROHRIORIIHRHIIHHIHRIC = var1x);
               this.COOHCOCROICOICHCCOCOHRORHCICRI = (int)(this.CHRICHRIHHCOCHOOHRHHCCIOIRHIIO * (1.0F + this.OCCHRRHHRROHRIORIIHRHIIHHIHRIC / 100.0F));
               var3 = var3.replace(var4.group(0), "");
            } else if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI.HIOIORCICHOHCHCHRRIRHIIIOHICIH()
               == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIFT
               )
             {
               this.OCCHRRHHRROHRIORIIHRHIIHHIHRIC = 0;
               this.COOHCOCROICOICHCCOCOHRORHCICRI = 0;
            }

            var4 = RCRROHRIIHOCHIHHICRRHRHHIRCOCR.matcher(var3);
            if (var4.find() && var2.OOOIOHIHHIHRIHCIRCIRRCHCCROOHI().isEnabled()) {
               boolean var13 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
               String var17 = var13 ? var4.group("stacks").substring(1) : var4.group("stacks");
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var17.replaceAll(",", ""))
                  .ifPresent(var1x -> this.ICOOCCRIHHOICHOHOHOHCHIIOIHHCC = var1x);
               this.RCROIRCCCRRRCCRHOIHRRRHIRORROC = var4.group("type").charAt(0);
               var3 = var3.replace(var4.group(0), "");
            } else {
               this.ICOOCCRIHHOICHOHOHOHCHIIOIHHCC = 0;
               this.RCROIRCCCRRRCCRHOIHRRRHIRORROC = ' ';
            }

            var4 = RICORHOHCCIRCIOICOIHIRCRCIOIIC.matcher(var3);
            if (var4.find() && var2.OROHIOOCCCOHRCCIRHRHCHCCROHRRI().isEnabled()) {
               boolean var14 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
               String var18 = var14 ? var4.group("current").substring(1) : var4.group("current");
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var18.replaceAll(",", ""))
                  .ifPresent(var1x -> this.COOCIRIRHCOOOOOCCOHORIRHHIRROH = var1x);
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var4.group("total").replaceAll(",", ""))
                  .ifPresent(var1x -> this.HHIIRHIIRIORCCHHOCCCHORRHCHRIH = var1x);
               String var20 = var4.group("overflow");
               this.HHIHHIHIRCICCHHIIOIIRRHOHIIHHR = var20 != null
                  ? COOCCHICCCIIICRHIOCOCIOOORCOCC.IOORROIRICCOCCOOCCIROIIIHRCCCC(var20.replaceAll(",", ""))
                  : 0;
               var3 = var3.replace(var4.group(0), "");
            }

            var4 = CROHHOORHORCHCIIHCOORHROCIHRCI.matcher(var3);
            if (var4.find() && var2.HHOCOOCOIROHOIIRRHIICROOIIRIHO().isEnabled()) {
               this.ORRORCCHHRCHIOOCCRORRRRCCCOOHR = true;
               boolean var15 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
               String var19 = var15 ? var4.group("current").substring(1) : var4.group("current");
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var19.replaceAll(",", ""))
                  .ifPresent(var1x -> this.CRHHHCIIOCHHCIIOCRCCRCHOIICIHH = var1x);
               COOCCHICCCIIICRHIOCOCIOOORCOCC.HCHRCOICHOOIOROORHRIIIOIIHIHOC(var4.group("total").replaceAll(",", ""))
                  .ifPresent(var1x -> this.OIOOORRHIRROHOOCHOCRICIIOOROCO = var1x);
               var3 = var3.replace(var4.group(0), "");
            } else {
               this.ORRORCCHHRCHIOOCCRORRRRCCCOOHR = false;
            }

            var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Component.text(var3));
            var1.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(true);
         }
      }
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Matcher var0, String var1) {
      int var2 = var0.start() - 1;
      boolean var3 = false;
      if (var2 >= 0 && var2 < var1.length()) {
         var3 = var1.charAt(var2) == 167;
      }

      return var3;
   }

   @Generated
   public int HIIRHCRCICRRCIRIRHRICCROIOIIIC() {
      return this.CHRICHRIHHCOCHOOHRHHCCIOIRHIIO;
   }

   @Generated
   public int RCRCIIIRIIHOIHCOOOIHIOOHIRROIO() {
      return this.HHCHICIRIOROHCRIHOOIRHRORCICRC;
   }

   @Generated
   public int IIHRHIIHHCHOHCHHOIIHROHRIIRORH() {
      return this.OCCHRRHHRROHRIORIIHRHIIHHIHRIC;
   }

   @Generated
   public int CRRCIOCOCIRROHRIIRHRHHRIORRHCI() {
      return this.COOHCOCROICOICHCCOCOHRORHCICRI;
   }

   @Generated
   public int CROCCCRRICIICRIHIHHCCCIRICRRIC() {
      return this.ICOOCCRIHHOICHOHOHOHCHIIOIHHCC;
   }

   @Generated
   public char HIOOIICIROCHCRRCRCOHIRHCIIOIRC() {
      return this.RCROIRCCCRRRCCRHOIHRRRHIRORROC;
   }

   @Generated
   public int IHCCHOCRIIORORCHRIOHIRHIHIOIOH() {
      return this.COOCIRIRHCOOOOOCCOHORIRHHIRROH;
   }

   @Generated
   public int RHCHOHHIOHRICRCIIHRHCROIHCHCRR() {
      return this.HHIIRHIIRIORCCHHOCCCHORRHCHRIH;
   }

   @Generated
   public int RHIHIHORHHCRIOICHCHHICRRHOROHR() {
      return this.HHIHHIHIRCICCHHIIOIIRRHOHIIHHR;
   }

   @Generated
   public boolean IHHHIHIOICCCIHRCIIIOIOHICCHOHH() {
      return this.ORRORCCHHRCHIOOCCRORRRRCCCOOHR;
   }

   @Generated
   public int CIRHHIOOOOHCHIIOIHOHRIHCOCCOOO() {
      return this.CRHHHCIIOCHHCIIOCRCCRCHOIICIHH;
   }

   @Generated
   public int RRIOORRHCORROIIIHIRRRHHIHORCHO() {
      return this.OIOOORRHIRROHOOCHOCRICIIOOROCO;
   }
}
