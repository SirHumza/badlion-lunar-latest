public class cRGPahlSIHGMQRrHVwLlav3gSgGE8J5Plxn6NQJsK5UNlTKUYnWLWJ12aGucpjbwT8ODpKz1vVMBcoI9ZamuVLfxa0zZPGzUGex {
   private static final int BatModClient = 4096;
   private static final Integer[] Button = Button(
      4096
   );

   private static Integer[] Button(int var0) {
      Integer[] var1 = new Integer[var0];

      for (int var2 = 0; var2 < var0; var2++) {
         var1[var2] = new Integer(var2);
      }

      return var1;
   }

   public static Integer BatModClient(int var0) {
      return var0 >= 0 && var0 < 4096
         ? Button[var0]
         : new Integer(var0);
   }
}
