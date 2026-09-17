package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<Nectar extends Annotation> {
   protected final Nectar ROOCHRCRIHOOOHIHCRRRRHIOIHORHI;
   protected com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH RROIORRRCCCIRIOHCRHCHCCRCIHHIH;
   protected final Method RCIOHHIOOCOHROCCIRICHHIHIRCHRH;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Nectar var1, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2, Method var3) {
      this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI = (Nectar)var1;
      this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH = var2;
      this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH = var3;
   }

   public abstract boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1);

   protected boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, Object... var3) {
      if (var1 == null || com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHHOCIORIIRRHIOORIORHOIHHROOH(var1).matcher(var2).matches()) {
         try {
            this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.invoke(this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.RHIRRIRRHCIRIRICORCOHHHCHOOOCR(), var3);
            return true;
         } catch (Exception var5) {
            System.err.println("Failed to apply " + this.getClass().getName() + " to " + var2);
            var5.printStackTrace();
         }
      }

      return false;
   }

   protected <T> T HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, String var2, Object... var3) {
      if (var1 == null || com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHHOCIORIIRRHIOORIORHOIHHROOH(var1).matcher(var2).matches()) {
         try {
            return (T)this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.invoke(this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.RHIRRIRRHCIRIRICORCOHHHCHOOOCR(), var3);
         } catch (Exception var5) {
            System.err.println("Failed to apply " + this.getClass().getName() + " to " + var2);
            var5.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public String toString() {
      return "@"
         + this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.getClass().getName()
         + "("
         + this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.RHIRRIRRHCIRIRICORCOHHHCHOOOCR().getClass().getName()
         + ","
         + this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getName()
         + ")";
   }

   public String getMethodName() {
      return this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getName();
   }
}
