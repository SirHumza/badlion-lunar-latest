package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final int IHIROIRIHORHCHRRRCOOCIHOCHOROR;
   private final int IOIRHIORIOHIHHRORCICRCCIIICRHH;
   private final int IHIHHOCCHOIRHIOHCORIIRROCOIRHC;

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, int var2, int var3, int var4, int var5) {
      super(var1, var2);
      this.IHIROIRIHORHCHRRRCOOCIHOCHOROR = var3;
      this.IOIRHIORIOHIHHRORCICRCCIIICRHH = var4;
      this.IHIHHOCCHOIRHIOHCORIIRROCOIRHC = var5;
   }

   @Override
   public boolean CHRCCRRRRHRCCIICIHRCCOOIRIICRO(int var1) {
      return false;
   }

   @Override
   public boolean RRCROCCRIOIROHCCRCCIORICOCIOHC(int var1, int var2) {
      return false;
   }

   @Override
   public boolean IIIIRHIHROIRCROHHROIHIIHRCRRHO(int var1, int var2, int var3) {
      return this.IHIROIRIHORHCHRRRCOOCIHOCHOROR == var1 && this.IOIRHIORIOHIHHRORCICRCCIIICRHH == var2 && this.IHIHHOCCHOIRHIOHCORIIRROCOIRHC == var3;
   }

   @Override
   public boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int[] var1, int var2) {
      return var2 == 3
         && var1[0] == this.IHIROIRIHORHCHRRRCOOCIHOCHOROR
         && var1[1] == this.IOIRHIORIOHIHHRORCICRCCIIICRHH
         && var1[2] == this.IHIHHOCCHOIRHIOHCORIIRROCOIRHC;
   }
}
