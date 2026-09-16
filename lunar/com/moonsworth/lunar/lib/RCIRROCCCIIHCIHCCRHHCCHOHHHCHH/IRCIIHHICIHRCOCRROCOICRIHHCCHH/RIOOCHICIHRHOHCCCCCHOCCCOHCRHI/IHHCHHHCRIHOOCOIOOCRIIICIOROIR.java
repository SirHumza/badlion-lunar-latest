package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.Writer;

public final class IHHCHHHCRIHOOCOIOOCRIIICIOROIR extends Writer {
   private final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI CHICRIHIRIOOIOICHIIROCRHHIIOHO;

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO = new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
         var1
      );
   }

   @Override
   public Writer append(char var1) {
      this.write(var1);
      return this;
   }

   @Override
   public Writer append(CharSequence var1) {
      String var2 = var1.toString();
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var2, 0, var2.length());
      return this;
   }

   @Override
   public Writer append(CharSequence var1, int var2, int var3) {
      String var4 = var1.subSequence(var2, var3).toString();
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var4, 0, var4.length());
      return this;
   }

   @Override
   public void close() {
   }

   @Override
   public void flush() {
   }

   @Override
   public void write(char[] var1) {
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1, 0, var1.length);
   }

   @Override
   public void write(char[] var1, int var2, int var3) {
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1, var2, var3);
   }

   @Override
   public void write(int var1) {
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.IOHIHIIHCCCCCIHRORIOIOORCIOHII((char)var1);
   }

   @Override
   public void write(String var1) {
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, 0, var1.length());
   }

   @Override
   public void write(String var1, int var2, int var3) {
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var2, var3);
   }

   public String HIRIOHHOIHCIOHIIOHIIRIRHHHOICC() {
      String var1 = this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.ICHCCOIRHIIHRORHOIROIORCHIIICI();
      this.CHICRIHIRIOOIOICHIIROCRHHIIOHO.RRIRRRHIHRRRRCCOCCROIOIIOOIOCO();
      return var1;
   }
}
