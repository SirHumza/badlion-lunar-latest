package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public enum ORHIOICIOCRRHOOCOHRORIHICHRCRR
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   CAN_WRITE_BINARY_NATIVELY(false),
   CAN_WRITE_FORMATTED_NUMBERS(false);

   private final boolean _defaultState;
   private final int _mask;

   ORHIOICIOCRRHOOCOHRORIHICHRCRR(boolean var3) {
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
