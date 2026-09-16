package ch.randelshofer.fastdoubleparser;

import java.math.BigInteger;

public class JavaBigIntegerParser {
   private static final JavaBigIntegerFromByteArray BYTE_ARRAY_PARSER = new JavaBigIntegerFromByteArray();
   private static final JavaBigIntegerFromCharArray CHAR_ARRAY_PARSER = new JavaBigIntegerFromCharArray();
   private static final JavaBigIntegerFromCharSequence CHAR_SEQUENCE_PARSER = new JavaBigIntegerFromCharSequence();

   private JavaBigIntegerParser() {
   }

   public static BigInteger parseBigInteger(CharSequence var0) {
      return CHAR_SEQUENCE_PARSER.parseBigIntegerLiteral(var0, 0, var0.length(), 10);
   }

   public static BigInteger parseBigInteger(CharSequence var0, int var1) {
      return CHAR_SEQUENCE_PARSER.parseBigIntegerLiteral(var0, 0, var0.length(), var1);
   }

   public static BigInteger parseBigInteger(CharSequence var0, int var1, int var2) {
      return CHAR_SEQUENCE_PARSER.parseBigIntegerLiteral(var0, var1, var2, 10);
   }

   public static BigInteger parseBigInteger(CharSequence var0, int var1, int var2, int var3) {
      return CHAR_SEQUENCE_PARSER.parseBigIntegerLiteral(var0, var1, var2, var3);
   }

   public static BigInteger parseBigInteger(byte[] var0) {
      return BYTE_ARRAY_PARSER.parseBigIntegerLiteral(var0, 0, var0.length, 10);
   }

   public static BigInteger parseBigInteger(byte[] var0, int var1) {
      return BYTE_ARRAY_PARSER.parseBigIntegerLiteral(var0, 0, var0.length, var1);
   }

   public static BigInteger parseBigInteger(byte[] var0, int var1, int var2) {
      return BYTE_ARRAY_PARSER.parseBigIntegerLiteral(var0, var1, var2, 10);
   }

   public static BigInteger parseBigInteger(byte[] var0, int var1, int var2, int var3) {
      return BYTE_ARRAY_PARSER.parseBigIntegerLiteral(var0, var1, var2, var3);
   }

   public static BigInteger parseBigInteger(char[] var0) {
      return CHAR_ARRAY_PARSER.parseBigIntegerLiteral(var0, 0, var0.length, 10);
   }

   public static BigInteger parseBigInteger(char[] var0, int var1) {
      return CHAR_ARRAY_PARSER.parseBigIntegerLiteral(var0, 0, var0.length, var1);
   }

   public static BigInteger parseBigInteger(char[] var0, int var1, int var2) {
      return CHAR_ARRAY_PARSER.parseBigIntegerLiteral(var0, var1, var2, 10);
   }

   public static BigInteger parseBigInteger(char[] var0, int var1, int var2, int var3) {
      return CHAR_ARRAY_PARSER.parseBigIntegerLiteral(var0, var1, var2, var3);
   }
}
