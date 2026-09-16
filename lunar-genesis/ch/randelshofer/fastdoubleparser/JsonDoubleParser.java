package ch.randelshofer.fastdoubleparser;

public class JsonDoubleParser {
   private static final JsonDoubleBitsFromByteArray BYTE_ARRAY_PARSER = new JsonDoubleBitsFromByteArray();
   private static final JsonDoubleBitsFromCharArray CHAR_ARRAY_PARSER = new JsonDoubleBitsFromCharArray();
   private static final JsonDoubleBitsFromCharSequence CHAR_SEQUENCE_PARSER = new JsonDoubleBitsFromCharSequence();

   private JsonDoubleParser() {
   }

   public static double parseDouble(CharSequence var0) {
      return parseDouble(var0, 0, var0.length());
   }

   public static double parseDouble(CharSequence var0, int var1, int var2) {
      long var3 = CHAR_SEQUENCE_PARSER.parseNumber(var0, var1, var2);
      return Double.longBitsToDouble(var3);
   }

   public static double parseDouble(byte[] var0) {
      return parseDouble(var0, 0, var0.length);
   }

   public static double parseDouble(byte[] var0, int var1, int var2) {
      long var3 = BYTE_ARRAY_PARSER.parseNumber(var0, var1, var2);
      return Double.longBitsToDouble(var3);
   }

   public static double parseDouble(char[] var0) {
      return parseDouble(var0, 0, var0.length);
   }

   public static double parseDouble(char[] var0, int var1, int var2) {
      long var3 = CHAR_ARRAY_PARSER.parseNumber(var0, var1, var2);
      return Double.longBitsToDouble(var3);
   }
}
