public class v61stDdjYeVD1HuKAfRxJ2V5BDhBKDJejJIRCXcI7ICKNzkhsT10CbtI1r8rctvo9cyymXJrc6XoAqNGDMv4QgPRTl0HZJhq2din {
   private int BatModClient;
   private int Button;
   private int CustomSpinner;
   private String ButtonAction;

   public v61stDdjYeVD1HuKAfRxJ2V5BDhBKDJejJIRCXcI7ICKNzkhsT10CbtI1r8rctvo9cyymXJrc6XoAqNGDMv4QgPRTl0HZJhq2din(int var1, int var2) {
      this(var1, var2, 0);
   }

   public v61stDdjYeVD1HuKAfRxJ2V5BDhBKDJejJIRCXcI7ICKNzkhsT10CbtI1r8rctvo9cyymXJrc6XoAqNGDMv4QgPRTl0HZJhq2din(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public v61stDdjYeVD1HuKAfRxJ2V5BDhBKDJejJIRCXcI7ICKNzkhsT10CbtI1r8rctvo9cyymXJrc6XoAqNGDMv4QgPRTl0HZJhq2din(int var1, int var2, int var3, String var4) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.Button > 9
         ? this.BatModClient * 100
            + this.Button
         : (
            this.CustomSpinner > 9
               ? this.BatModClient * 100
                  + this.Button * 10
                  + 9
               : this.BatModClient * 100
                  + this.Button * 10
                  + this.CustomSpinner
         );
   }

   @Override
   public String toString() {
      return this.ButtonAction == null
         ? ""
            + this.BatModClient
            + "."
            + this.Button
            + "."
            + this.CustomSpinner
         : ""
            + this.BatModClient
            + "."
            + this.Button
            + "."
            + this.CustomSpinner
            + this.ButtonAction;
   }
}
