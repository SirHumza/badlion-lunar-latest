package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
      super(true);
   }

   @Override
   public String getId() {
      return "FEATURE_FLAG_DEBUG";
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()) {
         String var6 = var5.getIdentifier();
         String var7 = var6.substring(0, 1).toLowerCase() + var6.substring(1);
         String var8 = var6.substring(0, 1).toUpperCase() + var6.substring(1);
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var9 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
               var7
            )
            .RORIIOHIOCOOHOHIHOHCCOOHRIRHCO(var8)
            .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
            .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
         var9.IOIOHIORIROHRRCOOOHCROHORCOIIH(var2 -> {
            if (this.isEnabled() && var5.isEnabled() != var2) {
               var5.setValue(var2);
               if (var5.getDynamicReset() != null) {
                  var5.getDynamicReset().accept(var2);
               }
            }
         });
         var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var9);
      }
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCCIRORHIRRORROOOOCCHCRIORHOIC
         )
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   @Override
   public void COIHORRCHRRCHOCIRHHRRIOIHRIHCC(boolean var1) {
      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()) {
         if (var1) {
            MutableBoolean var6 = new MutableBoolean();
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var7 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
            );
            if (var7 != null) {
               var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var2 -> {
                     if (var2.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                           com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRRIIIHCRCRHCOIIIIICCCIIICROCR
                        )
                        && var2.get() instanceof Boolean var3
                        && var2.getId().equalsIgnoreCase(var5.getIdentifier())) {
                        var5.setValue(var3);
                        var6.setValue(true);
                        return true;
                     } else {
                        return false;
                     }
                  }
               );
            }

            if (var6.isFalse()) {
               var5.setValue(true);
            }
         } else {
            var5.setValue(true);
         }
      }
   }
}
