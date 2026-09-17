package shadersmod.client;

public class RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
   extends shadersmod.client.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ {
   public static final String[] BatModClient = new String[]{
      "default", "fast", "fancy", "off"
   };
   public static final String[] Button = new String[]{
      "Default", "Fast", "Fancy", "OFF"
   };

   public RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB(String var1, String var2, int var3) {
      super(
         var1,
         BatModClient,
         var2,
         Button,
         var3
      );
   }

   public boolean BatModProgressBar() {
      return this.Button() == 0;
   }

   public boolean ColorChooser() {
      return this.Button() == 1;
   }

   public boolean IntegerSpinner() {
      return this.Button() == 2;
   }

   public boolean TextField() {
      return this.Button() == 3;
   }

   @Override
   public boolean BatModClient(String var1) {
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         (Object)var1, (Object)"none"
      )) {
         var1 = "off";
      }

      return super.BatModClient(var1);
   }
}
