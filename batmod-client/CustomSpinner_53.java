import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
   extends UuNRPdngxLJ1piSbtVWTy5d1r0yYnVPdrWVdJIzhO5AWQSs4oLD4MB0wnDcMfN6xGgAGeksJvSQysKaZzGku3I7UiwUCohf4THta {
   public static final String BatModClient = "Roboto-Regular";
   public static final String Button = "batmod/fonts/Roboto-Regular.ttf";
   public static final int CustomSpinner = 32;
   public static final int ButtonAction = 20;
   private final Map BatModInstallerMain = new HashMap();

   public hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae() {
      super(
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
            .InstallationLogger,
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("textures/font/ascii.png"),
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
            .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
         false
      );
      this.BatModClient();
   }

   @Override
   public void BatModClient() {
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "batmod/fonts/Roboto-Regular.ttf"
      );

      Font var2;
      try {
         InputStream var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(),
            var1
         );
         var2 = Font.createFont(0, var3).deriveFont(0, 32.0F);
      } catch (IOException | FontFormatException var18) {
         throw new RuntimeException(
            "Could not load font: " + var1.CustomSpinner(), var18
         );
      }

      for (int var19 = 32; var19 < 128; var19++) {
         char var4 = (char)var19;
         String var5 = String.valueOf(var4);
         BufferedImage var6 = new BufferedImage(1, 1, 6);
         Graphics var7 = var6.getGraphics();
         var7.setFont(var2);
         int var8 = (int)Math.ceil(var7.getFontMetrics().charWidth(var4));
         int var9 = (int)Math.ceil(var7.getFontMetrics().getHeight());
         FontRenderContext var10 = var7.getFontMetrics().getFontRenderContext();
         Rectangle2D var11 = var2.getStringBounds(var5, var10);
         var7.dispose();
         var8 = (int)Math.ceil(var11.getWidth());
         var9 = (int)Math.ceil(var11.getHeight());
         if (var8 < 50) {
            var8 = 50;
         }

         var8 += 40;
         System.out.println(var4 + " " + var8 + " " + var9);
         var6 = new BufferedImage(var8, var9, 6);
         var7 = var6.getGraphics();
         var7.setColor(Color.WHITE);
         var7.setFont(var2);
         FontMetrics var12 = var7.getFontMetrics();
         byte var13 = 0;
         int var14 = var12.getAscent();
         var7.drawString(var5, var13, var14);
         var7.dispose();
         A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX var15 = new A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX(
            var6, var8, var9
         );

         try {
            var15.BatModClient(
               AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                  .vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP()
            );
            this.BatModInstallerMain.put(var4, var15);
         } catch (IOException var17) {
            var17.printStackTrace();
         }
      }
   }

   private A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX CustomSpinner(
      char var1
   ) {
      return this.BatModInstallerMain.containsKey(var1)
         ? (A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX)this.BatModInstallerMain
            .get(var1)
         : (A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX)this.BatModInstallerMain
            .get('?');
   }

   private Color BatModClient(int var1, boolean var2) {
      if ((var1 & -67108864) == 0) {
         var1 |= -16777216;
      }

      if (var2) {
         var1 = (var1 & 16579836) >> 2 | var1 & 0xFF000000;
      }

      float var3 = (var1 >> 16 & 0xFF) / 255.0F;
      float var4 = (var1 >> 8 & 0xFF) / 255.0F;
      float var5 = (var1 & 0xFF) / 255.0F;
      float var6 = (var1 >> 24 & 0xFF) / 255.0F;
      return new Color(var3, var4, var5, var6);
   }

   private int Button(
      String var1, float var2, float var3, int var4, boolean var5
   ) {
      if (var1 == null) {
         return 0;
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
      boolean var6 = net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner();
      boolean var7 = net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button();
      boolean var8 = net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Checkbox();
      if (!var6) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
         0.05F
      );
      var2 *= 20.0F;
      var3 *= 20.0F;
      Color var9 = null;

      for (int var10 = 0; var10 < var1.length(); var10++) {
         char var11 = var1.charAt(var10);
         if (var11 == 167 && var10 + 1 < var1.length()) {
            int var16 = "0123456789abcdefklmnor".indexOf(var1.toLowerCase().charAt(var10 + 1));
            if (var16 < 16) {
               this.CustomSpinner();
               if (var16 < 0) {
                  var16 = 15;
               }

               if (var5) {
                  var16 += 16;
               }

               int var13 = this.ProgressBar[var16];
               if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9()
                  )
                {
                  var13 = lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.BatModClient(
                     var16, var13
                  );
               }

               var9 = this.BatModClient(var13, var5);
            }

            var10++;
         } else {
            if (var9 == null) {
               var9 = this.BatModClient(var4, var5);
            }

            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               var9.getRed() / 256.0F, var9.getGreen() / 256.0F, var9.getBlue() / 256.0F, var9.getAlpha() / 256.0F
            );
            A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX var12 = this.CustomSpinner(
               var11
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
               var12.c_()
            );
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.BatModClient(
               var2, var3, 0, 0, 255, 255
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               1.0F, 1.0F, 1.0F, 1.0F
            );
            var2 += this.BatModClient(var11) * 20;
         }
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
         1.0F
      );
      if (var8) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
      }

      if (var7) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.TextField();
      }

      if (!var6) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         0
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
      return (int)var2;
   }

   @Override
   public int BatModClient(
      String var1, float var2, float var3, int var4
   ) {
      return this.BatModClient(var1, var2, var3, var4, true);
   }

   @Override
   public int BatModClient(String var1, int var2, int var3, int var4) {
      return !this.TextField
         ? 0
         : this.Button(var1, var2, var3, var4, false);
   }

   @Override
   public int BatModClient(
      String var1, float var2, float var3, int var4, boolean var5
   ) {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
      this.CustomSpinner();
      if (var5) {
         int var6 = this.Button(
            var1, var2 + 1.0F, var3 + 1.0F, var4, true
         );
         return Math.max(
            var6, this.Button(var1, var2, var3, var4, false)
         );
      } else {
         return this.Button(var1, var2, var3, var4, false);
      }
   }

   @Override
   public void BatModClient(
      String var1, int var2, int var3, int var4, int var5
   ) {
      var1 = this.CustomSpinner(var1);

      for (Object var7 : this.CustomSpinner(var1, var4)) {
         if (this.BatModProgressBar) {
            int var8 = this.BatModClient(
               this.Button((String)var7)
            );
            var2 = var2 + var4 - var8;
         }

         this.Button((String)var7, var2, var3, var5, false);
         var3 += this.Spinner;
      }
   }

   @Override
   public int BatModClient(char var1) {
      return super.BatModClient(var1);
   }

   @Override
   public int BatModClient(String var1) {
      return super.BatModClient(var1);
   }

   @Override
   public String BatModClient(String var1, int var2, boolean var3) {
      return super.BatModClient(var1, var2, var3);
   }
}
