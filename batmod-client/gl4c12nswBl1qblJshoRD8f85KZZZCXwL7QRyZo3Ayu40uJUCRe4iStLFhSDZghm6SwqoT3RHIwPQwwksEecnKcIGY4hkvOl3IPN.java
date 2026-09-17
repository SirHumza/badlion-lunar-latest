import com.google.common.collect.Maps;
import java.util.Map;

public enum gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN {
   BatModClient(0, "cod", 2, 0.1F, 5, 0.6F),
   Button(1, "salmon", 2, 0.1F, 6, 0.8F),
   CustomSpinner(2, "clownfish", 1, 0.1F),
   ButtonAction(3, "pufferfish", 1, 0.1F);

   private static final Map Spinner = Maps.newHashMap();
   private final int Checkbox;
   private final String ProgressBar;
   private final int BatModProgressBar;
   private final float ColorChooser;
   private final int IntegerSpinner;
   private final float TextField;
   private boolean ColorTextPane = false;

   gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN(
      int var3, String var4, int var5, float var6, int var7, float var8
   ) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
      this.ColorChooser = var6;
      this.IntegerSpinner = var7;
      this.TextField = var8;
      this.ColorTextPane = true;
   }

   gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN(int var3, String var4, int var5, float var6) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
      this.ColorChooser = var6;
      this.IntegerSpinner = 0;
      this.TextField = 0.0F;
      this.ColorTextPane = false;
   }

   public int BatModClient() {
      return this.Checkbox;
   }

   public String Button() {
      return this.ProgressBar;
   }

   public int CustomSpinner() {
      return this.BatModProgressBar;
   }

   public float ButtonAction() {
      return this.ColorChooser;
   }

   public int Spinner() {
      return this.IntegerSpinner;
   }

   public float Checkbox() {
      return this.TextField;
   }

   public boolean ProgressBar() {
      return this.ColorTextPane;
   }

   public static gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN BatModClient(
      int var0
   ) {
      gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN var1 = (gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN)Spinner.get(
         var0
      );
      return var1 == null ? BatModClient : var1;
   }

   public static gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN BatModClient(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var0
   ) {
      return var0.BatModClient() instanceof XdaPaiWMdDFiZIelunLy9QuEmxswjW5FuqFpcDDtcHs4OYsSO9mqYf7gg6yad9lCo9uisZdaxky2s5gq99GtpMh3aAtOzJmlueQ7
         ? BatModClient(
            var0.BatModProgressBar()
         )
         : BatModClient;
   }

   static {
      for (gl4c12nswBl1qblJshoRD8f85KZZZCXwL7QRyZo3Ayu40uJUCRe4iStLFhSDZghm6SwqoT3RHIwPQwwksEecnKcIGY4hkvOl3IPN var3 : values()) {
         Spinner.put(
            var3.BatModClient(), var3
         );
      }
   }
}
