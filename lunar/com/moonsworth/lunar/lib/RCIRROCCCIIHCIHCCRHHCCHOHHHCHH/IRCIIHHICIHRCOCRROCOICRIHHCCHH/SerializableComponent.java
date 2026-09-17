package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;

public class OIHCOHRCICCCRHRCROOCIOIRRHHHIH implements Serializable, Comparable<OIHCOHRCICCCRHRCROOCIOIRRHHHIH> {
   private static final long CICCRRRRORRHHCRRRHIIORCRCIHCRH = 1L;
   private static final OIHCOHRCICCCRHRCROOCIOIRRHHHIH CIOIICCRHHOICORHIHRHHIORCOCHCC = new OIHCOHRCICCCRHRCROOCIOIRRHHHIH(0, 0, 0, null, null, null);
   protected final int IOICICHHORRIRRHRCHCICHICRIOCRI;
   protected final int RCHHRCCIOIHORRIHHORRIHHICOHIIC;
   protected final int ORICICCOCCOHCOIOCICCICIHHCORCO;
   protected final String RIIHHHCCIIHIRRIRROHCRORRIROOII;
   protected final String RCIIHHHRRCOHRCOOCHIROCRIOHCHOO;
   protected final String OCRRHROOCHRIHRROIRHIROHIHIIORI;

   @Deprecated
   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, var4, null, null);
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH(int var1, int var2, int var3, String var4, String var5, String var6) {
      this.IOICICHHORRIRRHRCHCICHICRIOCRI = var1;
      this.RCHHRCCIOIHORRIHHORRIHHICOHIIC = var2;
      this.ORICICCOCCOHCOIOCICCICIHHCORCO = var3;
      this.OCRRHROOCHRIHRROIRHIROHIHIIORI = var4;
      this.RIIHHHCCIIHIRRIRROHCRORRIROOII = var5 == null ? "" : var5;
      this.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO = var6 == null ? "" : var6;
   }

   public static OIHCOHRCICCCRHRCROOCIOIRRHHHIH RRCIOHOROHCHCRIICCIOICORCRIIOR() {
      return CIOIICCRHHOICORHIHRHHIORCOCHCC;
   }

   public boolean IOOROHICOCHIOICICIROHOHIHICRCC() {
      return this == CIOIICCRHHOICORHIHRHHIORCOCHCC;
   }

   public boolean isSnapshot() {
      return this.OCRRHROOCHRIHRROIRHIROHIHIIORI != null && this.OCRRHROOCHRIHRROIRHIROHIHIIORI.length() > 0;
   }

   @Deprecated
   public boolean HOHCROCRIHOHOHHRIORRCOCHCRRIIR() {
      return this.IOOROHICOCHIOICICIROHOHIHICRCC();
   }

   public int getMajorVersion() {
      return this.IOICICHHORRIRRHRCHCICHICRIOCRI;
   }

   public int getMinorVersion() {
      return this.RCHHRCCIOIHORRIHHORRIHHICOHIIC;
   }

   public int OHHHIHOICCHRRCROOIHCIHOOOOOCRR() {
      return this.ORICICCOCCOHCOIOCICCICIHHCORCO;
   }

   public String IROCCCOOROHOOOHRHCOIOHCHICHOIO() {
      return this.RIIHHHCCIIHIRRIRROHCRORRIROOII;
   }

   public String ICOOOICRCCHCHOORHIIRIHROORRROH() {
      return this.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO;
   }

   public String CRCIIOIOHCHCIHCCHIHHHOHRHRHIRI() {
      return this.RIIHHHCCIIHIRRIRROHCRORRIROOII + '/' + this.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO + '/' + this.toString();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.IOICICHHORRIRRHRCHCICHICRIOCRI).append('.');
      var1.append(this.RCHHRCCIOIHORRIHHORRIHHICOHIIC).append('.');
      var1.append(this.ORICICCOCCOHCOIOCICCICIHHCORCO);
      if (this.isSnapshot()) {
         var1.append('-').append(this.OCRRHROOCHRIHRROIRHIROHIHIIORI);
      }

      return var1.toString();
   }

   @Override
   public int hashCode() {
      return this.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO.hashCode()
         ^ this.RIIHHHCCIIHIRRIRROHCRORRIROOII.hashCode()
            + this.IOICICHHORRIRRHRCHCICHICRIOCRI
            - this.RCHHRCCIOIHORRIHHORRIHHICOHIIC
            + this.ORICICCOCCOHCOIOCICCICIHHCORCO;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (var1.getClass() != this.getClass()) {
         return false;
      }

      OIHCOHRCICCCRHRCROOCIOIRRHHHIH var2 = (OIHCOHRCICCCRHRCROOCIOIRRHHHIH)var1;
      return var2.IOICICHHORRIRRHRCHCICHICRIOCRI == this.IOICICHHORRIRRHRCHCICHICRIOCRI
         && var2.RCHHRCCIOIHORRIHHORRIHHICOHIIC == this.RCHHRCCIOIHORRIHHORRIHHICOHIIC
         && var2.ORICICCOCCOHCOIOCICCICIHHCORCO == this.ORICICCOCCOHCOIOCICCICIHHCORCO
         && var2.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO.equals(this.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO)
         && var2.RIIHHHCCIIHIRRIRROHCRORRIROOII.equals(this.RIIHHHCCIIHIRRIRROHCRORRIROOII);
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OIHCOHRCICCCRHRCROOCIOIRRHHHIH var1) {
      if (var1 == this) {
         return 0;
      }

      int var2 = this.RIIHHHCCIIHIRRIRROHCRORRIROOII.compareTo(var1.RIIHHHCCIIHIRRIRROHCRORRIROOII);
      if (var2 == 0) {
         var2 = this.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO.compareTo(var1.RCIIHHHRRCOHRCOOCHIROCRIOHCHOO);
         if (var2 == 0) {
            var2 = this.IOICICHHORRIRRHRCHCICHICRIOCRI - var1.IOICICHHORRIRRHRCHCICHICRIOCRI;
            if (var2 == 0) {
               var2 = this.RCHHRCCIOIHORRIHHORRIHHICOHIIC - var1.RCHHRCCIOIHORRIHHORRIHHICOHIIC;
               if (var2 == 0) {
                  var2 = this.ORICICCOCCOHCOIOCICCICIHHCORCO - var1.ORICICCOCCOHCOIOCICCICIHHCORCO;
               }
            }
         }
      }

      return var2;
   }
}
