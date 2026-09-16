package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import java.beans.ConstructorProperties;
import java.beans.Transient;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final Class<?> ICCHHRHHCCRIIRCCHRHCIRRCHOOROC;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
      Class<ConstructorProperties> var1 = Transient.class;
      var1 = ConstructorProperties.class;
      this.ICCHHRHHCCRIIRCCHRHCIRRCHOOROC = var1;
   }

   @Override
   public Boolean IOHIHIIHCCCCCIHRORIOIOORCIOHII(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      Transient var2 = var1.getAnnotation(Transient.class);
      return var2 != null ? var2.value() : null;
   }

   @Override
   public Boolean RCIROOOOICRHCCRRCIORHHIRCOIIIC(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      ConstructorProperties var2 = var1.getAnnotation(ConstructorProperties.class);
      return var2 != null ? Boolean.TRUE : null;
   }

   @Override
   public IHCRORHRORIICHRHRCHRRIRRHHOCOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2 = var1.CCOCCCRHOORCCROIOIRHRHRCOHHOCR();
      if (var2 != null) {
         ConstructorProperties var3 = var2.getAnnotation(ConstructorProperties.class);
         if (var3 != null) {
            String[] var4 = var3.value();
            int var5 = var1.getIndex();
            if (var5 < var4.length) {
               return IHCRORHRORIICHRHRCHRRIRRHHOCOO.ORCRIORCRRCOIOHOIRRHIRHCCRRIII(var4[var5]);
            }
         }
      }

      return null;
   }
}
