import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class MLRKgsmXoWQauSRVcQFQUG65BxcO5SBAH4N0Baqufbh5WE9QqTEQqyHBRX3LfenmV6jgaQyUljJNJwaAyF6UCObGihLOC7L3DcBJ {
   private String CustomSpinner = null;
   private String ButtonAction = null;
   p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient = null;
   private int Spinner = -1;
   private int Checkbox = 0;
   private int ProgressBar = 0;
   private int BatModProgressBar = 0;
   private int ColorChooser = 0;
   private yiKDDqJjaUuoEq0IF7Vi9XbbMFfiCAaCs368m1IfLjKEqQznA7tanHx7n3UbhOq0eM2bA1UpFHVzUMgWwSdk0DSMEnvjvTct9z3S[] IntegerSpinner = null;
   private int TextField = 0;
   byte[] Button = null;
   private ByteBuffer ColorTextPane = null;

   public MLRKgsmXoWQauSRVcQFQUG65BxcO5SBAH4N0Baqufbh5WE9QqTEQqyHBRX3LfenmV6jgaQyUljJNJwaAyF6UCObGihLOC7L3DcBJ(
      String var1,
      byte[] var2,
      String var3,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var4,
      int var5,
      int var6,
      int var7,
      int var8,
      Properties var9,
      int var10
   ) {
      this.CustomSpinner = var1;
      this.ButtonAction = var3;
      this.BatModClient = var4;
      this.Checkbox = var5;
      this.ProgressBar = var6;
      this.BatModProgressBar = var7;
      this.ColorChooser = var8;
      int var11 = var7 * var8 * 4;
      if (var2.length % var11 != 0) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8
         );
      }

      this.Button = var2;
      int var12 = var2.length / var11;
      if (var9.get("tile.0") != null) {
         for (int var13 = 0; var9.get("tile." + var13) != null; var13++) {
            var12 = var13 + 1;
         }
      }

      String var21 = (String)var9.get("duration");
      int var14 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var21, var10
      );
      this.IntegerSpinner = new yiKDDqJjaUuoEq0IF7Vi9XbbMFfiCAaCs368m1IfLjKEqQznA7tanHx7n3UbhOq0eM2bA1UpFHVzUMgWwSdk0DSMEnvjvTct9z3S[var12];

      for (int var15 = 0; var15 < this.IntegerSpinner.length; var15++) {
         String var16 = (String)var9.get("tile." + var15);
         int var17 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var16, var15
         );
         String var18 = (String)var9.get("duration." + var15);
         int var19 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var18, var14
         );
         yiKDDqJjaUuoEq0IF7Vi9XbbMFfiCAaCs368m1IfLjKEqQznA7tanHx7n3UbhOq0eM2bA1UpFHVzUMgWwSdk0DSMEnvjvTct9z3S var20 = new yiKDDqJjaUuoEq0IF7Vi9XbbMFfiCAaCs368m1IfLjKEqQznA7tanHx7n3UbhOq0eM2bA1UpFHVzUMgWwSdk0DSMEnvjvTct9z3S(
            var17, var19
         );
         this.IntegerSpinner[var15] = var20;
      }
   }

   public boolean BatModClient() {
      if (this.IntegerSpinner.length <= 0) {
         return false;
      }

      if (this.TextField
         >= this.IntegerSpinner.length) {
         this.TextField = 0;
      }

      yiKDDqJjaUuoEq0IF7Vi9XbbMFfiCAaCs368m1IfLjKEqQznA7tanHx7n3UbhOq0eM2bA1UpFHVzUMgWwSdk0DSMEnvjvTct9z3S var1 = this.IntegerSpinner[this.TextField];
      var1.CustomSpinner++;
      if (var1.CustomSpinner
         < var1.Button) {
         return false;
      }

      var1.CustomSpinner = 0;
      this.TextField++;
      if (this.TextField
         >= this.IntegerSpinner.length) {
         this.TextField = 0;
      }

      return true;
   }

   public int Button() {
      if (this.IntegerSpinner.length <= 0) {
         return 0;
      }

      if (this.TextField
         >= this.IntegerSpinner.length) {
         this.TextField = 0;
      }

      yiKDDqJjaUuoEq0IF7Vi9XbbMFfiCAaCs368m1IfLjKEqQznA7tanHx7n3UbhOq0eM2bA1UpFHVzUMgWwSdk0DSMEnvjvTct9z3S var1 = this.IntegerSpinner[this.TextField];
      return var1.BatModClient;
   }

   public int CustomSpinner() {
      return this.IntegerSpinner.length;
   }

   public boolean ButtonAction() {
      if (this.Spinner < 0) {
         sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc var1 = uBMlMKyXwmX0EK0kfsijZNTp4hBUYFfRWKJefXsPH5ivKSSRJfU3L3LDkO7zU6NlrKIEe3qCdknVdKZ4HcZJIorv59e9TNi5jaQf.BatModClient(
            this.BatModClient
         );
         if (var1 == null) {
            return false;
         }

         this.Spinner = var1.c_();
      }

      if (this.ColorTextPane == null) {
         this.ColorTextPane = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.CustomSpinner(
            this.Button.length
         );
         this.ColorTextPane
            .put(this.Button);
         this.Button = null;
      }

      if (!this.BatModClient()) {
         return false;
      }

      int var4 = this.BatModProgressBar
         * this.ColorChooser
         * 4;
      int var2 = this.Button();
      int var3 = var4 * var2;
      if (var3 + var4 > this.ColorTextPane.capacity()) {
         return false;
      }

      ((Buffer)this.ColorTextPane).position(var3);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         this.Spinner
      );
      GL11.glTexSubImage2D(
         3553,
         0,
         this.Checkbox,
         this.ProgressBar,
         this.BatModProgressBar,
         this.ColorChooser,
         6408,
         5121,
         this.ColorTextPane
      );
      return true;
   }

   public String Spinner() {
      return this.CustomSpinner;
   }

   public String Checkbox() {
      return this.ButtonAction;
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD ProgressBar() {
      return this.BatModClient;
   }
}
