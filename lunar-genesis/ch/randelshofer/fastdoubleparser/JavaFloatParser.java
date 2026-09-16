package ch.randelshofer.fastdoubleparser;

public class JavaFloatParser {
   private static final JavaFloatBitsFromByteArray BYTE_ARRAY_PARSER = new JavaFloatBitsFromByteArray();
   private static final JavaFloatBitsFromCharArray CHAR_ARRAY_PARSER = new JavaFloatBitsFromCharArray();
   private static final JavaFloatBitsFromCharSequence CHAR_SEQUENCE_PARSER = new JavaFloatBitsFromCharSequence();

   private JavaFloatParser() {
   }

   public static float parseFloat(CharSequence var0) {
      return parseFloat(var0, 0, var0.length());
   }

   public static float parseFloat(CharSequence var0, int var1, int var2) {
      long var3 = CHAR_SEQUENCE_PARSER.parseFloatingPointLiteral(var0, var1, var2);
      return Float.intBitsToFloat((int)var3);
   }

   public static float parseFloat(byte[] var0) {
      return parseFloat(var0, 0, var0.length);
   }

   public static float parseFloat(byte[] var0, int var1, int var2) {
      long var3 = BYTE_ARRAY_PARSER.parseFloatingPointLiteral(var0, var1, var2);
      return Float.intBitsToFloat((int)var3);
   }

   public static float parseFloat(char[] var0) {
      return parseFloat(var0, 0, var0.length);
   }

   public static float parseFloat(char[] var0, int var1, int var2) {
      long var3 = CHAR_ARRAY_PARSER.parseFloatingPointLiteral(var0, var1, var2);
      return Float.intBitsToFloat((int)var3);
   }
}
