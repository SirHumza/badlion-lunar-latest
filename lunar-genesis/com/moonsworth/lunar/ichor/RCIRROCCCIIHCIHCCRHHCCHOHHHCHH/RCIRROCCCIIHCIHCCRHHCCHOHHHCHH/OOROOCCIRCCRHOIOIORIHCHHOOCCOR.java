package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import java.lang.reflect.Method;

public final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<IIHRRHORCRCROCHHOHORCHCROCIHRO> {
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(IIHRRHORCRCROCHHOHORCHCROCIHRO var1, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2, Method var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      throw new IllegalStateException("Tried to handle resource as class, shouldn't happen.");
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.value(), var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO(), var1);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, String var2, com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      if (var3 != null
         && this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH != null
         && com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHHOCIORIIRRHIOORIORHOIHHROOH(var1).matcher(var2).matches()) {
         try {
            this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.invoke(this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.RHIRRIRRHCIRIRICORCOHHHCHOOOCR(), var3);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }
}
