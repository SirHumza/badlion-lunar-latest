package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public enum CIOHHCORHRCCRICCCORIHCRHCCCRRR implements HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   READ_ENUM_KEYS_USING_INDEX(false),
   WRITE_ENUMS_TO_LOWERCASE(false);

   private static final int FEATURE_INDEX = 0;
   private final boolean _enabledByDefault;
   private final int _mask;

   CIOHHCORHRCCRICCCORIHCRHCCCRRR(boolean var3) {
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
      return 0;
   }
}
