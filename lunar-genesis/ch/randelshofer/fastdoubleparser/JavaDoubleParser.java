package ch.randelshofer.fastdoubleparser;

public class JavaDoubleParser {
   private static final JavaDoubleBitsFromByteArray BYTE_ARRAY_PARSER = new JavaDoubleBitsFromByteArray();
   private static final JavaDoubleBitsFromCharArray CHAR_ARRAY_PARSER = new JavaDoubleBitsFromCharArray();
   private static final JavaDoubleBitsFromCharSequence CHAR_SEQUENCE_PARSER = new JavaDoubleBitsFromCharSequence();

   private JavaDoubleParser() {
   }

   public static double parseDouble(CharSequence var0) {
      return parseDouble(var0, 0, var0.length());
   }

   public static double parseDouble(CharSequence var0, int var1, int var2) {
      long var3 = CHAR_SEQUENCE_PARSER.parseFloatingPointLiteral(var0, var1, var2);
      return Double.longBitsToDouble(var3);
   }

   public static double parseDouble(byte[] var0) {
      return parseDouble(var0, 0, var0.length);
   }

   public static double parseDouble(byte[] var0, int var1, int var2) {
      long var3 = BYTE_ARRAY_PARSER.parseFloatingPointLiteral(var0, var1, var2);
      return Double.longBitsToDouble(var3);
   }

   public static double parseDouble(char[] var0) {
      return parseDouble(var0, 0, var0.length);
   }

   public static double parseDouble(char[] var0, int var1, int var2) {
      long var3 = CHAR_ARRAY_PARSER.parseFloatingPointLiteral(var0, var1, var2);
      return Double.longBitsToDouble(var3);
   }
}
