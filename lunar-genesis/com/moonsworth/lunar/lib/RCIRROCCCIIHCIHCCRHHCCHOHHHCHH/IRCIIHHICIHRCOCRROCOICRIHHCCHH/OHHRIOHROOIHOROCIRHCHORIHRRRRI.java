package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public enum OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   NOT_AVAILABLE(null, -1),
   START_OBJECT("{", 1),
   END_OBJECT("}", 2),
   START_ARRAY("[", 3),
   END_ARRAY("]", 4),
   FIELD_NAME(null, 5),
   VALUE_EMBEDDED_OBJECT(null, 12),
   VALUE_STRING(null, 6),
   VALUE_NUMBER_INT(null, 7),
   VALUE_NUMBER_FLOAT(null, 8),
   VALUE_TRUE("true", 9),
   VALUE_FALSE("false", 10),
   VALUE_NULL("null", 11);

   final String _serialized;
   final char[] _serializedChars;
   final byte[] _serializedBytes;
   final int _id;
   final boolean _isStructStart;
   final boolean _isStructEnd;
   final boolean _isNumber;
   final boolean _isBoolean;
   final boolean _isScalar;

   OHHRIOHROOIHOROCIRHCHORIHRRRRI(String var3, int var4) {
      if (var3 == null) {
         this._serialized = null;
         this._serializedChars = null;
         this._serializedBytes = null;
      } else {
         this._serialized = var3;
         this._serializedChars = var3.toCharArray();
         int var5 = this._serializedChars.length;
         this._serializedBytes = new byte[var5];

         for (int var6 = 0; var6 < var5; var6++) {
            this._serializedBytes[var6] = (byte)this._serializedChars[var6];
         }
      }

      this._id = var4;
      this._isBoolean = var4 == 10 || var4 == 9;
      this._isNumber = var4 == 7 || var4 == 8;
      this._isStructStart = var4 == 1 || var4 == 3;
      this._isStructEnd = var4 == 2 || var4 == 4;
      this._isScalar = !this._isStructStart && !this._isStructEnd && var4 != 5 && var4 != -1;
   }

   public final int id() {
      return this._id;
   }

   public final String asString() {
      return this._serialized;
   }

   public final char[] asCharArray() {
      return this._serializedChars;
   }

   public final byte[] asByteArray() {
      return this._serializedBytes;
   }

   public final boolean isNumeric() {
      return this._isNumber;
   }

   public final boolean isStructStart() {
      return this._isStructStart;
   }

   public final boolean isStructEnd() {
      return this._isStructEnd;
   }

   public final boolean isScalarValue() {
      return this._isScalar;
   }

   public final boolean isBoolean() {
      return this._isBoolean;
   }
}
