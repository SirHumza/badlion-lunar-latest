package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public int x;
   public int y;
   public int z;
   public int hash;
   public int HOOCRHOOOCHCRHIRRHHICHORCOIOHR = -1;
   public float RHIROICHORCRHOORIORROCROHIOHCC;
   public float HHIHRIHOHHRCOCIIORIIRRCOROHIHC;
   public float CIIOHIICORHCRHRIOOCIOIHIIIRHHI;
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHROHRCOCORRRRHOHOCCICOOOHOHRI;
   public boolean closed;
   public float OIRCRIHOIIRCCOORCHRRCIIROICCRH;
   public float OCRIOCCRHHIHCCCOHRIORIHCCROROC;
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OICHHHIIRORHORCICHHRIOHHOIRHOI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BLOCKED;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
      this.hash = RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var1, var2, var3);
   }

   public static int RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? 32768 : 0);
   }

   public float HRCHROOHRIHCRCRHRIIROCIRHOIRHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      float var2 = var1.x - this.x;
      float var3 = var1.y - this.y;
      float var4 = var1.z - this.z;
      return (float)Math.sqrt(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public float OOROOCCIRCCRHOIOIORIHCHHOOCCOR(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      float var2 = var1.x - this.x;
      float var3 = var1.y - this.y;
      float var4 = var1.z - this.z;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public float CORCOCICIRIOHROHROIIOOHICCHCRR(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      float var2 = Math.abs(var1.x - this.x);
      float var3 = Math.abs(var1.y - this.y);
      float var4 = Math.abs(var1.z - this.z);
      return var2 + var3 + var4;
   }

   public float IOHIHIIHCCCCCIHRORIOIOORCIOHII(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      float var2 = Math.abs(var1.bridge$getX() - this.x);
      float var3 = Math.abs(var1.bridge$getY() - this.y);
      float var4 = Math.abs(var1.bridge$getZ() - this.z);
      return (float)Math.sqrt(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public float RCIROOOOICRHCCRRCIORHHIRCOIIIC(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      float var2 = Math.abs(var1.bridge$getX() - this.x);
      float var3 = Math.abs(var1.bridge$getY() - this.y);
      float var4 = Math.abs(var1.bridge$getZ() - this.z);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public float OOCCRCRCOHIIORCCORCRCIRRROIOOR(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      float var2 = Math.abs(var1.bridge$getX() - this.x);
      float var3 = Math.abs(var1.bridge$getY() - this.y);
      float var4 = Math.abs(var1.bridge$getZ() - this.z);
      return var2 + var3 + var4;
   }

   public float CRICCOOHHHCHOORCICOCOHIHOIRHOO(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      float var2 = var1.x - this.x;
      float var3 = var1.z - this.z;
      return (float)Math.sqrt(var2 * var2 + var3 * var3);
   }

   public float HICHRCOHCCRHOHCICOOCHOIHCCHIRI(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      float var2 = var1.x - this.x;
      float var3 = var1.z - this.z;
      return var2 * var2 + var3 * var3;
   }

   public float OHIIIOHIRIRCCRRIOIICCHHIORRHOH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      float var2 = var1.bridge$getX() - this.x;
      float var3 = var1.bridge$getZ() - this.z;
      return (float)Math.sqrt(var2 * var2 + var3 * var3);
   }

   public float IHICORCROOROHCIHIHCOIHRRHICICO(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      float var2 = var1.bridge$getX() - this.x;
      float var3 = var1.bridge$getZ() - this.z;
      return var2 * var2 + var3 * var3;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH ICOORIRHIICCHRORRORHHOICHICHOO() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.x, this.y, this.z);
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR OOIHCRCRHOCIRRIROCHROOCOHCCRCC() {
      return CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(this.x, this.y, this.z);
   }

   public boolean HIIRIHHHRIHIHIHOCOOHOICOOOHROH() {
      return this.HOOCRHOOOCHCRHIRRHHICHORCOIOHR >= 0;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIHCOHRCICCCRHRCROOCIOIRRHHHIH(int var1, int var2, int var3) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3);
      var4.HOOCRHOOOCHCRHIRRHHICHORCOIOHR = this.HOOCRHOOOCHCRHIRRHHICHORCOIOHR;
      var4.RHIROICHORCRHOORIORROCROHIOHCC = this.RHIROICHORCRHOORIORROCROHIOHCC;
      var4.HHIHRIHOHHRCOCIIORIIRRCOROHIHC = this.HHIHRIHOHHRCOCIIORIIRRCOROHIHC;
      var4.CIIOHIICORHCRHRIOOCIOIHIIIRHHI = this.CIIOHIICORHCRHRIOOCIOIHIIIRHHI;
      var4.CHROHRCOCORRRRHOHOCCICOOOHOHRI = this.CHROHRCOCORRRRHOHOCCICOOOHOHRI;
      var4.closed = this.closed;
      var4.OIRCRIHOIIRCCOORCHRRCIIROICCRH = this.OIRCRIHOIIRCCOORCHRRCIIROICCRH;
      var4.OCRIOCCRHHIHCCCOHRIORIHCCROROC = this.OCRIOCCRHHIHCCCOHRIORIHCCROROC;
      var4.OICHHHIIRORHORCICHHRIOHHOIRHOI = this.OICHHHIIRORHORCICHHRIOHHOIRHOI;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)
         ? false
         : this.hash == var2.hash && this.x == var2.x && this.y == var2.y && this.z == var2.z;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.x + ", y=" + this.y + ", z=" + this.z + "}";
   }

   @Override
   public int hashCode() {
      return this.hash;
   }
}
