public class mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH {
   public final int BatModClient;
   public final int Button;
   private static final String CustomSpinner = "CL_00000133";
   private int ButtonAction = 0;

   public mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH(int var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public static long BatModClient(int var0, int var1) {
      return var0 & 4294967295L | (var1 & 4294967295L) << 32;
   }

   @Override
   public int hashCode() {
      if (this.ButtonAction == 0) {
         int var1 = 1664525 * this.BatModClient + 1013904223;
         int var2 = 1664525 * (this.Button ^ -559038737)
            + 1013904223;
         this.ButtonAction = var1 ^ var2;
      }

      return this.ButtonAction;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH)) {
         return false;
      }

      mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH var2 = (mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH)var1;
      return this.BatModClient
            == var2.BatModClient
         && this.Button
            == var2.Button;
   }

   public int BatModClient() {
      return (this.BatModClient << 4) + 8;
   }

   public int Button() {
      return (this.Button << 4) + 8;
   }

   public int CustomSpinner() {
      return this.BatModClient << 4;
   }

   public int ButtonAction() {
      return this.Button << 4;
   }

   public int Spinner() {
      return (this.BatModClient << 4) + 15;
   }

   public int Checkbox() {
      return (this.Button << 4) + 15;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient(
      int var1, int var2, int var3
   ) {
      return new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         (this.BatModClient << 4) + var1,
         var2,
         (this.Button << 4) + var3
      );
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient(
      int var1
   ) {
      return new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         this.BatModClient(),
         var1,
         this.Button()
      );
   }

   @Override
   public String toString() {
      return "["
         + this.BatModClient
         + ", "
         + this.Button
         + "]";
   }
}
