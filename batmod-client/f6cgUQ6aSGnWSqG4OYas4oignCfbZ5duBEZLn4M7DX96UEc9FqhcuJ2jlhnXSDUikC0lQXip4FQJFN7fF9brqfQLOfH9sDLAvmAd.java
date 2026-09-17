public class f6cgUQ6aSGnWSqG4OYas4oignCfbZ5duBEZLn4M7DX96UEc9FqhcuJ2jlhnXSDUikC0lQXip4FQJFN7fF9brqfQLOfH9sDLAvmAd {
   public static String BatModClient(String var0) {
      return Button(
         CustomSpinner(var0)
      );
   }

   public static String Button(String var0) {
      return var0.replaceAll("(?:(?=& )|&)", "§");
   }

   public static String CustomSpinner(String var0) {
      return var0.replace("\\n", "\n");
   }
}
