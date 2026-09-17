package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.lang.reflect.Array;
import java.util.List;

public final class HHRIICOIOORCHCOIICOOIHIRHHICRI {
   private static final int CCCHIHOHOHHROOIRIIOCHRHHIIOCRI = 16384;
   private static final int OOCCRCHOHORIICCRRHCRHORHIRRCOC = 262144;
   private RICRIRRCOHRCOCRRHHCRHRROOIOHHR<Object[]> ROHCHIORICIORCOCRRCIOOIIOOOCOR;
   private RICRIRRCOHRCOCRRHHCRHRROOIOHHR<Object[]> HHORORHIRIIIIRIHHRIOHOIIIIOCIC;
   private int _size;
   private Object[] ORIRORCHRROIIOIHOCICOHORHCHHOH;

   public Object[] OCCRHIOIHCHCIRRHRIRRRCRRCOCCOR() {
      this.CIOCHROIOHCRHORIIORIHIIORCRROI();
      return this.ORIRORCHRROIIOIHOCICOHORHCHHOH == null ? (this.ORIRORCHRROIIOIHOCICOHORHCHHOH = new Object[12]) : this.ORIRORCHRROIIOIHOCICOHORHCHHOH;
   }

   public Object[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object[] var1, int var2) {
      this.CIOCHROIOHCRHORIIORIHIIORCRROI();
      if (this.ORIRORCHRROIIOIHOCICOHORHCHHOH == null || this.ORIRORCHRROIIOIHOCICOHORHCHHOH.length < var2) {
         this.ORIRORCHRROIIOIHOCICOHORHCHHOH = new Object[Math.max(12, var2)];
      }

      System.arraycopy(var1, 0, this.ORIRORCHRROIIOIHOCICOHORHCHHOH, 0, var2);
      return this.ORIRORCHRROIIOIHOCICOHORHCHHOH;
   }

   public Object[] OOCCRCRCOHIIORCCORCRCIRRROIOOR(Object[] var1) {
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR var2 = new RICRIRRCOHRCOCRRHHCRHRROOIOHHR<>(var1, null);
      if (this.ROHCHIORICIORCOCRRCIOOIIOOOCOR == null) {
         this.ROHCHIORICIORCOCRRCIOOIIOOOCOR = this.HHORORHIRIIIIRIHHRIOHOIIIIOCIC = var2;
      } else {
         this.HHORORHIRIIIIRIHHRIOHOIIIIOCIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         this.HHORORHIRIIIIRIHHRIOHOIIIIOCIC = var2;
      }

      int var3 = var1.length;
      this._size += var3;
      if (var3 < 16384) {
         var3 += var3;
      } else if (var3 < 262144) {
         var3 += var3 >> 2;
      }

      return new Object[var3];
   }

   public Object[] HHCCIRHCCCIIRHCROHIORHIRHHIORH(Object[] var1, int var2) {
      int var3 = var2 + this._size;
      Object[] var4 = new Object[var3];
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3, var1, var2);
      this.CIOCHROIOHCRHORIIORIHIIORCRROI();
      return var4;
   }

   public <T> T[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object[] var1, int var2, Class<T> var3) {
      int var4 = var2 + this._size;
      Object[] var5 = (Object[])Array.newInstance(var3, var4);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var4, var1, var2);
      this.CIOCHROIOHCRHORIIORIHIIORCRROI();
      return (T[])var5;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object[] var1, int var2, List<Object> var3) {
      for (RICRIRRCOHRCOCRRHHCRHRROOIOHHR var4 = this.ROHCHIORICIORCOCRRCIOOIIOOOCOR; var4 != null; var4 = var4.ICOOCHHOHRCHIHHRORHCROCOROIOCR()) {
         Object[] var5 = (Object[])var4.value();
         int var6 = 0;

         for (int var7 = var5.length; var6 < var7; var6++) {
            var3.add(var5[var6]);
         }
      }

      for (int var8 = 0; var8 < var2; var8++) {
         var3.add(var1[var8]);
      }

      this.CIOCHROIOHCRHORIIORIHIIORCRROI();
   }

   public int CCCOICHCRHIHCHOCCRIIRHOCCCRORO() {
      return this.ORIRORCHRROIIOIHOCICOHORHCHHOH == null ? 0 : this.ORIRORCHRROIIOIHOCICOHORHCHHOH.length;
   }

   public int OHRIIIOHIIHIORRIOCRCIHOHHOORRC() {
      return this._size;
   }

   protected void CIOCHROIOHCRHORIIORIHIIORCRROI() {
      if (this.HHORORHIRIIIIRIHHRIOHOIIIIOCIC != null) {
         this.ORIRORCHRROIIOIHOCICOHORHCHHOH = this.HHORORHIRIIIIRIHHRIOHOIIIIOCIC.value();
      }

      this.ROHCHIORICIORCOCRRCIOOIIOOOCOR = this.HHORORHIRIIIIRIHHRIOHOIIIIOCIC = null;
      this._size = 0;
   }

   protected final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, int var2, Object[] var3, int var4) {
      int var5 = 0;

      for (RICRIRRCOHRCOCRRHHCRHRROOIOHHR var6 = this.ROHCHIORICIORCOCRRCIOOIIOOOCOR; var6 != null; var6 = var6.ICOOCHHOHRCHIHHRORHCROCOROIOCR()) {
         Object[] var7 = (Object[])var6.value();
         int var8 = var7.length;
         System.arraycopy(var7, 0, var1, var5, var8);
         var5 += var8;
      }

      System.arraycopy(var3, 0, var1, var5, var4);
      var5 += var4;
      if (var5 != var2) {
         throw new IllegalStateException("Should have gotten " + var2 + " entries, got " + var5);
      }
   }
}
