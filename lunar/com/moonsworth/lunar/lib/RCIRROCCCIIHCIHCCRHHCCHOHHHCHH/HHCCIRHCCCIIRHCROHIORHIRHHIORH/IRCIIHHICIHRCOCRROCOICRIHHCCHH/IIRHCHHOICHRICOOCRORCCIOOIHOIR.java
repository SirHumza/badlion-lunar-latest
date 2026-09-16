package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public enum IIRHCHHOICHRICOOCRORCCIOOIHOIR implements HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   READ_NULL_PROPERTIES(true),
   WRITE_NULL_PROPERTIES(true),
   STRIP_TRAILING_BIGDECIMAL_ZEROES(true);

   private static final int FEATURE_INDEX = 1;
   private final boolean _enabledByDefault;
   private final int _mask;

   IIRHCHHOICHRICOOCRORCCIOOIHOIR(boolean var3) {
      this._enabledByDefault = var3;
      this._mask = 1 << this.ordinal();
   }

   @Override
   public boolean enabledByDefault() {
      return this._enabledByDefault;
   }

   @Override
   public boolean enabledIn(int var1) {
      return (var1 & this._mask) != 0;
   }

   @Override
   public int getMask() {
      return this._mask;
   }

   @Override
   public int featureIndex() {
      return 1;
   }
}
