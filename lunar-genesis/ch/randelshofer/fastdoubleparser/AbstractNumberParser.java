package ch.randelshofer.fastdoubleparser;

import java.util.Arrays;

abstract class AbstractNumberParser {
   public static final String ILLEGAL_OFFSET_OR_ILLEGAL_LENGTH = "offset < 0 or length > str.length";
   public static final String SYNTAX_ERROR = "illegal syntax";
   public static final String VALUE_EXCEEDS_LIMITS = "value exceeds limits";
   static final byte DECIMAL_POINT_CLASS = -4;
   static final byte OTHER_CLASS = -1;
   static final byte[] CHAR_TO_HEX_MAP = new byte[256];

   protected static byte charAt(byte[] var0, int var1, int var2) {
      return var1 < var2 ? var0[var1] : 0;
   }

   protected static char charAt(char[] var0, int var1, int var2) {
      return var1 < var2 ? var0[var1] : '\u0000';
   }

   protected static char charAt(CharSequence var0, int var1, int var2) {
      return var1 < var2 ? var0.charAt(var1) : '\u0000';
   }

   protected static int lookupHex(byte var0) {
      return CHAR_TO_HEX_MAP[var0 & 0xFF];
   }

   protected static int lookupHex(char var0) {
      return var0 < 128 ? CHAR_TO_HEX_MAP[var0] : -1;
   }

   static {
      Arrays.fill(CHAR_TO_HEX_MAP, (byte)-1);

      for (char var0 = '0'; var0 <= '9'; var0++) {
         CHAR_TO_HEX_MAP[var0] = (byte)(var0 - '0');
      }

      for (char var1 = 'A'; var1 <= 'F'; var1++) {
         CHAR_TO_HEX_MAP[var1] = (byte)(var1 - 'A' + 10);
      }

      for (char var2 = 'a'; var2 <= 'f'; var2++) {
         CHAR_TO_HEX_MAP[var2] = (byte)(var2 - 'a' + 10);
      }

      for (char var3 = '.'; var3 <= '.'; var3++) {
         CHAR_TO_HEX_MAP[var3] = -4;
      }
   }
}
