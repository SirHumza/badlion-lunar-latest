package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public enum IHIRRIIORRHORHRORIHOROIRCORCOO
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   DUPLICATE_PROPERTIES(false),
   SCALARS_AS_OBJECTS(false),
   UNTYPED_SCALARS(false),
   EXACT_FLOATS(false);

   private final boolean _defaultState;
   private final int _mask;

   IHIRRIIORRHORHRORIHOROIRCORCOO(boolean var3) {
      this._defaultState = var3;
      this._mask = 1 << this.ordinal();
   }

   @Override
   public boolean enabledByDefault() {
      return this._defaultState;
   }

   @Override
   public boolean enabledIn(int var1) {
      return (var1 & this._mask) != 0;
   }

   @Override
   public int getMask() {
      return this._mask;
   }
}
