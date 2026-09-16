package ch.randelshofer.fastdoubleparser;

import java.math.BigDecimal;

public class JavaBigDecimalParser {
   private static final JavaBigDecimalFromByteArray BYTE_ARRAY_PARSER = new JavaBigDecimalFromByteArray();
   private static final JavaBigDecimalFromCharArray CHAR_ARRAY_PARSER = new JavaBigDecimalFromCharArray();
   private static final JavaBigDecimalFromCharSequence CHAR_SEQUENCE_PARSER = new JavaBigDecimalFromCharSequence();

   private JavaBigDecimalParser() {
   }

   public static BigDecimal parseBigDecimal(CharSequence var0) {
      return parseBigDecimal(var0, 0, var0.length());
   }

   public static BigDecimal parseBigDecimal(CharSequence var0, int var1, int var2) {
      return CHAR_SEQUENCE_PARSER.parseBigDecimalString(var0, var1, var2);
   }

   public static BigDecimal parseBigDecimal(byte[] var0) {
      return parseBigDecimal(var0, 0, var0.length);
   }

   public static BigDecimal parseBigDecimal(byte[] var0, int var1, int var2) {
      return BYTE_ARRAY_PARSER.parseBigDecimalString(var0, var1, var2);
   }

   public static BigDecimal parseBigDecimal(char[] var0) {
      return parseBigDecimal(var0, 0, var0.length);
   }

   public static BigDecimal parseBigDecimal(char[] var0, int var1, int var2) {
      return CHAR_ARRAY_PARSER.parseBigDecimalString(var0, var1, var2);
   }
}
