public class pKV6xss5YgSMByOZuLlzmU3kwY4XRZPL5yX1ohmxiuaVYNPlxYhYCizYO0QZEPxal3NXjmaKEV02q4pQIXTfcyFcDcoJKF1bMnDn {
   private int BatModClient;
   private int Button;

   public pKV6xss5YgSMByOZuLlzmU3kwY4XRZPL5yX1ohmxiuaVYNPlxYhYCizYO0QZEPxal3NXjmaKEV02q4pQIXTfcyFcDcoJKF1bMnDn(int var1, int var2) {
      this.BatModClient = Math.min(var1, var2);
      this.Button = Math.max(var1, var2);
   }

   public boolean BatModClient(int var1) {
      return var1 < this.BatModClient
         ? false
         : var1 <= this.Button;
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   @Override
   public String toString() {
      return "min: "
         + this.BatModClient
         + ", max: "
         + this.Button;
   }
}
