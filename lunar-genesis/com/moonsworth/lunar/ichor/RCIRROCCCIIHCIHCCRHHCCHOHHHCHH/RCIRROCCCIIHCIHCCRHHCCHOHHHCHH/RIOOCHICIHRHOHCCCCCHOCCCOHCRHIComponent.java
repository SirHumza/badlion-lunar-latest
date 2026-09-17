package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.reflect.Method;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      Method var3
   ) {
      super(var1, var2, var3);
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      byte[] var3 = var1.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass());
      byte[] var2;
      if (this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getParameterCount() == 1) {
         var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(null, null, var3);
      } else if (this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getParameterCount() == 2) {
         var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(null, null, var1.className(), var3);
      } else {
         var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(null, null, var1.className(), var3, var1.HCRHICROCOCICCOCCCCHRCCCIORRRH());
      }

      if (var2 != null) {
         var1.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var2);
         return true;
      } else {
         return false;
      }
   }
}
