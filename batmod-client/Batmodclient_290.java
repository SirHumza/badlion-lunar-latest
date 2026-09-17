import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL14;

public class FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC {
   private static FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC BatModClient = null;
   private final int Button;
   private final int CustomSpinner;
   private final int ButtonAction;
   private final int Spinner;
   private final int Checkbox;
   private final boolean ProgressBar;
   private final boolean BatModProgressBar;

   private FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC(
      boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7
   ) {
      this.ProgressBar = var1;
      this.Button = var3;
      this.ButtonAction = var4;
      this.CustomSpinner = var5;
      this.Spinner = var6;
      this.BatModProgressBar = var2;
      this.Checkbox = var7;
   }

   public FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   public FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public void BatModClient() {
      if (!this.equals(BatModClient)) {
         if (BatModClient == null
            || this.BatModProgressBar
               != BatModClient.Button()
            )
          {
            BatModClient = this;
            if (this.BatModProgressBar) {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
               return;
            }

            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         }

         GL14.glBlendEquation(this.Checkbox);
         if (this.ProgressBar) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
               this.Button,
               this.ButtonAction,
               this.CustomSpinner,
               this.Spinner
            );
         } else {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
               this.Button,
               this.ButtonAction
            );
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC)) {
         return false;
      }

      FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC var2 = (FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC)var1;
      return this.Checkbox
            != var2.Checkbox
         ? false
         : (
            this.Spinner
                  != var2.Spinner
               ? false
               : (
                  this.ButtonAction
                        != var2.ButtonAction
                     ? false
                     : (
                        this.BatModProgressBar
                              != var2.BatModProgressBar
                           ? false
                           : (
                              this.ProgressBar
                                    != var2.ProgressBar
                                 ? false
                                 : (
                                    this.CustomSpinner
                                          != var2.CustomSpinner
                                       ? false
                                       : this.Button
                                          == var2.Button
                                 )
                           )
                     )
               )
         );
   }

   @Override
   public int hashCode() {
      int var1 = this.Button;
      var1 = 31 * var1 + this.CustomSpinner;
      var1 = 31 * var1 + this.ButtonAction;
      var1 = 31 * var1 + this.Spinner;
      var1 = 31 * var1 + this.Checkbox;
      var1 = 31 * var1 + (this.ProgressBar ? 1 : 0);
      return 31 * var1 + (this.BatModProgressBar ? 1 : 0);
   }

   public boolean Button() {
      return this.BatModProgressBar;
   }

   public static FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC BatModClient(
      JsonObject var0
   ) {
      if (var0 == null) {
         return new FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC();
      }

      int var1 = 32774;
      int var2 = 1;
      int var3 = 0;
      int var4 = 1;
      int var5 = 0;
      boolean var6 = true;
      boolean var7 = false;
      if (QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var0, "func"
      )) {
         var1 = BatModClient(var0.get("func").getAsString());
         if (var1 != 32774) {
            var6 = false;
         }
      }

      if (QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var0, "srcrgb"
      )) {
         var2 = Button(var0.get("srcrgb").getAsString());
         if (var2 != 1) {
            var6 = false;
         }
      }

      if (QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var0, "dstrgb"
      )) {
         var3 = Button(var0.get("dstrgb").getAsString());
         if (var3 != 0) {
            var6 = false;
         }
      }

      if (QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var0, "srcalpha"
      )) {
         var4 = Button(var0.get("srcalpha").getAsString());
         if (var4 != 1) {
            var6 = false;
         }

         var7 = true;
      }

      if (QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var0, "dstalpha"
      )) {
         var5 = Button(var0.get("dstalpha").getAsString());
         if (var5 != 0) {
            var6 = false;
         }

         var7 = true;
      }

      return var6
         ? new FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC()
         : (
            var7
               ? new FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC(var2, var3, var4, var5, var1)
               : new FrCzxREsp0U4uspFqlJsHAmoHTZZKkDNWprCbpCmvnNIfdODXj6ZgXWcRKmkCulA11akzy975d5m60DhIBG2O77Ge84mTrwWr5WC(var2, var3, var1)
         );
   }

   private static int BatModClient(String var0) {
      String var1 = var0.trim().toLowerCase();
      return var1.equals("add")
         ? 32774
         : (
            var1.equals("subtract")
               ? 32778
               : (
                  var1.equals("reversesubtract")
                     ? 32779
                     : (var1.equals("reverse_subtract") ? 32779 : (var1.equals("min") ? 32775 : (var1.equals("max") ? 32776 : 32774)))
               )
         );
   }

   private static int Button(String var0) {
      String var1 = var0.trim().toLowerCase();
      var1 = var1.replaceAll("_", "");
      var1 = var1.replaceAll("one", "1");
      var1 = var1.replaceAll("zero", "0");
      var1 = var1.replaceAll("minus", "-");
      return var1.equals("0")
         ? 0
         : (
            var1.equals("1")
               ? 1
               : (
                  var1.equals("srccolor")
                     ? 768
                     : (
                        var1.equals("1-srccolor")
                           ? 769
                           : (
                              var1.equals("dstcolor")
                                 ? 774
                                 : (
                                    var1.equals("1-dstcolor")
                                       ? 775
                                       : (
                                          var1.equals("srcalpha")
                                             ? 770
                                             : (var1.equals("1-srcalpha") ? 771 : (var1.equals("dstalpha") ? 772 : (var1.equals("1-dstalpha") ? 773 : -1)))
                                       )
                                 )
                           )
                     )
               )
         );
   }
}
