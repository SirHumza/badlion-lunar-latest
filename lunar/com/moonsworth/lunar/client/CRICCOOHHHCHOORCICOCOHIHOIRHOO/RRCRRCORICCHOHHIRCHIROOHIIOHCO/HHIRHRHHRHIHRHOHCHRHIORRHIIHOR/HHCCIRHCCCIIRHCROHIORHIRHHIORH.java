package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHIRHRHHRHIHRHOHCHRHIORRHIIHOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI OORRIIRCRRCRORRCHICCROCOIICRHO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("pingAbove")
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCICHOCCRIHORROHIOCRROCCIICO, CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1)
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.ORRCRCCOHRCIOOCOICRICOOHOCROCH,
         OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GENERAL
         )
      );
      this.handle(
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.class,
         var1x -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null && !var1x.isCancelled()) {
               if (var1x.CCCHCRRRIRRHICOOIOCHCHRCRICHOC() instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2) {
                  if (IIIIRHIHROIRCROHHROIHIIHRCRRHO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var2,
                     com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
                     )
                  )) {
                     return;
                  }

                  int var8 = 0;
                  boolean var4 = false;
                  IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCICHOCCRIHORROHIOCRROCCIICO)
                     .RHHCIICOCRRIHOOCHHHRHICRORCCRI();
                  if (var2.bridge$isSelf()) {
                     var8 = var5.IORRCCHCCIHIOCIHIICHCRCRHHCHCC();
                     var4 = true;
                  } else {
                     Component var6 = var2.bridge$getCustomName();
                     if (var6 != null && var6.hasDecoration(TextDecoration.OBFUSCATED)) {
                        return;
                     }

                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var7 = var5.IRRCCOICORICIHCHRHIHIHROIRHOCR(
                        var2.bridge$getUniqueID()
                     );
                     if (var7 != null) {
                        var8 = Math.max(var7.bridge$getLatency(), 0);
                     }
                  }

                  Component var9 = var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var4, null);
                  if (var5.IOROICHRIHICOICROOORIOICHICOHC.get()) {
                     String var10 = var5.IHORROOIRRHORIRCOHHCHRIOOOROCO.get();
                     if (var10 != null && !var10.trim().isEmpty()) {
                        var9 = Component.text(var10, TextColor.color(var5.RHOHRCCHICIICCOHHCHCHOOCCOCICC.CHRHCORIRCORHHIIROCRORHIROICOC())).append(var9);
                     }
                  }

                  if (this.OORRIIRCRRCRORRCHICCROCOIICRHO.get()) {
                     var1x.getLines().add(var9);
                  } else {
                     var1x.getLines().add(0, var9);
                  }
               }
            }
         }
      );
   }

   @Override
   public String getId() {
      return "PING_NAMETAG";
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.OORRIIRCRRCRORRCHICCROCOIICRHO);
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHHIOIHOHHORIIOHORHROIIRIRIORH() {
      return this.OORRIIRCRRCRORRCHICCROCOIICRHO;
   }
}
