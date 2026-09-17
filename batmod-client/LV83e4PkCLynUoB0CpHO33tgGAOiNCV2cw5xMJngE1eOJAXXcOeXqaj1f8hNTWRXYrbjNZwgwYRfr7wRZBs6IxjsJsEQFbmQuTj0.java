public class LV83e4PkCLynUoB0CpHO33tgGAOiNCV2cw5xMJngE1eOJAXXcOeXqaj1f8hNTWRXYrbjNZwgwYRfr7wRZBs6IxjsJsEQFbmQuTj0 {
   public static final char[] BatModClient = new char[]{
      '/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'
   };

   public static boolean BatModClient(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String BatModClient(String var0) {
      StringBuilder var1 = new StringBuilder();

      for (char var5 : var0.toCharArray()) {
         if (BatModClient(var5)) {
            var1.append(var5);
         }
      }

      return var1.toString();
   }
}
