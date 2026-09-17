import java.util.Arrays;

public class nTHwDaCeFv2syM0rKQwZFjVo7hzJHYOvHqZ0j8aqSAv4ibxlcRoI1V6vspUhsupSGgBJZ5kz0QwlyvRTB8jKX70M561Ynjn0vK9o
   extends AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk {
   private final NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD ButtonAction;
   private static final String Spinner = "CL_00002492";

   public nTHwDaCeFv2syM0rKQwZFjVo7hzJHYOvHqZ0j8aqSAv4ibxlcRoI1V6vspUhsupSGgBJZ5kz0QwlyvRTB8jKX70M561Ynjn0vK9o(
      AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk var1,
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var2
   ) {
      super(
         Arrays.copyOf(
            var1.Button(),
            var1.Button().length
         ),
         var1.Button,
         rUj2pIufbwUN7G0b1guaQ9NFaOBlO2vI9BkgLMPtzKEF8H0OTLCvddOEHlWxRhto93PUjvgR1IN7iryQGQXgnc6nndMxjzYy0nEJ.BatModClient(
            var1.Button()
         )
      );
      this.ButtonAction = var2;
      this.ProgressBar();
   }

   private void ProgressBar() {
      for (int var1 = 0; var1 < 4; var1++) {
         this.BatModClient(var1);
      }
   }

   private void BatModClient(int var1) {
      int var2 = this.BatModClient.length / 4;
      int var3 = var2 * var1;
      float var4 = Float.intBitsToFloat(this.BatModClient[var3]);
      float var5 = Float.intBitsToFloat(this.BatModClient[var3 + 1]);
      float var6 = Float.intBitsToFloat(this.BatModClient[var3 + 2]);
      float var7 = 0.0F;
      float var8 = 0.0F;
      switch (HShYT3dTuxFfHHlyIXV0HD7ggZdaqY2t9DwhjSeWLftSIqFTBXDHQMHquTEh5sGInAQc3HyArWFus02NyVSNxSm12Ep8lsJDaayV.BatModClient[this.CustomSpinner
         .ordinal()]) {
         case 1:
            var7 = var4 * 16.0F;
            var8 = (1.0F - var6) * 16.0F;
            break;
         case 2:
            var7 = var4 * 16.0F;
            var8 = var6 * 16.0F;
            break;
         case 3:
            var7 = (1.0F - var4) * 16.0F;
            var8 = (1.0F - var5) * 16.0F;
            break;
         case 4:
            var7 = var4 * 16.0F;
            var8 = (1.0F - var5) * 16.0F;
            break;
         case 5:
            var7 = var6 * 16.0F;
            var8 = (1.0F - var5) * 16.0F;
            break;
         case 6:
            var7 = (1.0F - var6) * 16.0F;
            var8 = (1.0F - var5) * 16.0F;
      }

      this.BatModClient[var3 + 4] = Float.floatToRawIntBits(
         this.ButtonAction
            .BatModClient((double)var7)
      );
      this.BatModClient[var3 + 4 + 1] = Float.floatToRawIntBits(
         this.ButtonAction
            .Button((double)var8)
      );
   }
}
