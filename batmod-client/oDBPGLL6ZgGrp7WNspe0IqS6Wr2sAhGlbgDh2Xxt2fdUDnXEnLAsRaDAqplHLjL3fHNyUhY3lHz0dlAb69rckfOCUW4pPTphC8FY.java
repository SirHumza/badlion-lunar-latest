import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY {
   private static final Logger CustomSpinner = LogManager.getLogger();
   private static final IntBuffer ButtonAction = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.ButtonAction(
      4194304
   );
   public static final BhjSlK0ArxpCQDTeSBA76jzHei68lMR4upvCrnY0dVqfYTLRBOobfFnsAOhBBUlN1b6AnVCkVe2AvZ7NP0t7rbDkQOcLB3gBafgr BatModClient = new BhjSlK0ArxpCQDTeSBA76jzHei68lMR4upvCrnY0dVqfYTLRBOobfFnsAOhBBUlN1b6AnVCkVe2AvZ7NP0t7rbDkQOcLB3gBafgr(
      16, 16
   );
   public static final int[] Button = BatModClient.CustomSpinner();
   private static final int[] Spinner;
   private static final String Checkbox = "CL_00001067";

   public static int BatModClient() {
      return net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4();
   }

   public static void BatModClient(int var0) {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModProgressBar(
         var0
      );
   }

   public static int BatModClient(int var0, BufferedImage var1) {
      return BatModClient(var0, var1, false, false);
   }

   public static void BatModClient(
      int var0, int[] var1, int var2, int var3
   ) {
      Button(var0);
      BatModClient(0, var1, var2, var3, 0, 0, false, false, false);
   }

   public static int[][] BatModClient(int var0, int var1, int[][] var2) {
      int[][] var3 = new int[var0 + 1][];
      var3[0] = var2[0];
      if (var0 > 0) {
         boolean var4 = false;

         for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[0][var5] >> 24 == 0) {
               var4 = true;
               break;
            }
         }

         for (int var14 = 1; var14 <= var0; var14++) {
            if (var2[var14] != null) {
               var3[var14] = var2[var14];
            } else {
               int[] var6 = var3[var14 - 1];
               int[] var7 = new int[var6.length >> 2];
               int var8 = var1 >> var14;
               int var9 = var7.length / var8;
               int var10 = var8 << 1;

               for (int var11 = 0; var11 < var8; var11++) {
                  for (int var12 = 0; var12 < var9; var12++) {
                     int var13 = 2 * (var11 + var12 * var10);
                     var7[var11 + var12 * var8] = BatModClient(
                        var6[var13 + 0], var6[var13 + 1], var6[var13 + 0 + var10], var6[var13 + 1 + var10], var4
                     );
                  }
               }

               var3[var14] = var7;
            }
         }
      }

      return var3;
   }

   private static int BatModClient(
      int var0, int var1, int var2, int var3, boolean var4
   ) {
      return tSMmPuTbGF5pAlNerWjlpdN0waSly5hJOZPc4PLbZDfz7B7GzRX5SNzKSYwenwsmQ5XEvscAsk0hnjrtU67PFH9knys7gGCFuYOL.BatModClient(
         var0, var1, var2, var3
      );
   }

   private static int BatModClient(
      int var0, int var1, int var2, int var3, int var4
   ) {
      float var5 = (float)Math.pow((var0 >> var4 & 0xFF) / 255.0F, 2.2);
      float var6 = (float)Math.pow((var1 >> var4 & 0xFF) / 255.0F, 2.2);
      float var7 = (float)Math.pow((var2 >> var4 & 0xFF) / 255.0F, 2.2);
      float var8 = (float)Math.pow((var3 >> var4 & 0xFF) / 255.0F, 2.2);
      float var9 = (float)Math.pow((var5 + var6 + var7 + var8) * 0.25, 0.45454545454545453);
      return (int)(var9 * 255.0);
   }

   public static void BatModClient(
      int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6
   ) {
      for (int var7 = 0; var7 < var0.length; var7++) {
         int[] var8 = var0[var7];
         BatModClient(
            var7, var8, var1 >> var7, var2 >> var7, var3 >> var7, var4 >> var7, var5, var6, var0.length > 1
         );
      }
   }

   private static void BatModClient(
      int var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8
   ) {
      int var9 = 4194304 / var2;
      BatModClient(var6, var8);
      BatModClient(var7);
      int var11 = 0;

      while (var11 < var2 * var3) {
         int var12 = var11 / var2;
         int var10 = Math.min(var9, var3 - var12);
         int var13 = var2 * var10;
         Button(var1, var11, var13);
         GL11.glTexSubImage2D(
            3553,
            var0,
            var4,
            var5 + var12,
            var2,
            var10,
            32993,
            33639,
            ButtonAction
         );
         var11 += var2 * var10;
      }
   }

   public static int BatModClient(
      int var0, BufferedImage var1, boolean var2, boolean var3
   ) {
      BatModClient(var0, var1.getWidth(), var1.getHeight());
      return BatModClient(var0, var1, 0, 0, var2, var3);
   }

   public static void BatModClient(int var0, int var1, int var2) {
      BatModClient(var0, 0, var1, var2);
   }

   public static void BatModClient(
      int var0, int var1, int var2, int var3
   ) {
      Class<oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY> var4 = oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.class;
      if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
         .Button()) {
         var4 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
            .BatModClient();
      }

      synchronized (var4) {
         BatModClient(var0);
         Button(var0);
      }

      if (var1 >= 0) {
         GL11.glTexParameteri(3553, 33085, var1);
         GL11.glTexParameterf(3553, 33082, 0.0F);
         GL11.glTexParameterf(3553, 33083, var1);
         GL11.glTexParameterf(3553, 34049, 0.0F);
      }

      for (int var5 = 0; var5 <= var1; var5++) {
         GL11.glTexImage2D(3553, var5, 6408, var2 >> var5, var3 >> var5, 0, 32993, 33639, (IntBuffer)null);
      }
   }

   public static int BatModClient(
      int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5
   ) {
      Button(var0);
      BatModClient(var1, var2, var3, var4, var5);
      return var0;
   }

   private static void BatModClient(
      BufferedImage var0, int var1, int var2, boolean var3, boolean var4
   ) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int var7 = 4194304 / var5;
      int[] var8 = new int[var7 * var5];
      Button(var3);
      BatModClient(var4);

      for (int var9 = 0; var9 < var5 * var6; var9 += var5 * var7) {
         int var10 = var9 / var5;
         int var11 = Math.min(var7, var6 - var10);
         int var12 = var5 * var11;
         var0.getRGB(0, var10, var5, var11, var8, 0, var5);
         BatModClient(var8, var12);
         GL11.glTexSubImage2D(
            3553,
            0,
            var1,
            var2 + var10,
            var5,
            var11,
            32993,
            33639,
            ButtonAction
         );
      }
   }

   public static void BatModClient(boolean var0) {
      if (var0) {
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }
   }

   private static void Button(boolean var0) {
      BatModClient(var0, false);
   }

   public static void BatModClient(boolean var0, boolean var1) {
      if (var0) {
         GL11.glTexParameteri(3553, 10241, var1 ? 9987 : 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      } else {
         int var2 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
         GL11.glTexParameteri(3553, 10241, var1 ? var2 : 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }
   }

   private static void BatModClient(int[] var0, int var1) {
      Button(var0, 0, var1);
   }

   private static void Button(int[] var0, int var1, int var2) {
      int[] var3 = var0;
      if (AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .InstallationLogger
         .Spinner) {
         var3 = BatModClient(var0);
      }

      ((Buffer)ButtonAction).clear();
      ButtonAction.put(var3, var1, var2);
      ((Buffer)ButtonAction).position(0).limit(var2);
   }

   static void Button(int var0) {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0
      );
   }

   public static int[] BatModClient(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var0,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      BufferedImage var2 = BatModClient(
         var0.BatModClient(var1)
            .Button()
      );
      if (var2 == null) {
         return null;
      }

      int var3 = var2.getWidth();
      int var4 = var2.getHeight();
      int[] var5 = new int[var3 * var4];
      var2.getRGB(0, 0, var3, var4, var5, 0, var3);
      return var5;
   }

   public static BufferedImage BatModClient(InputStream var0) {
      if (var0 == null) {
         return null;
      }

      BufferedImage var1;
      try {
         var1 = ImageIO.read(var0);
      } finally {
         IOUtils.closeQuietly(var0);
      }

      return var1;
   }

   public static int[] BatModClient(int[] var0) {
      int[] var1 = new int[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = CustomSpinner(var0[var2]);
      }

      return var1;
   }

   public static int CustomSpinner(int var0) {
      int var1 = var0 >> 24 & 0xFF;
      int var2 = var0 >> 16 & 0xFF;
      int var3 = var0 >> 8 & 0xFF;
      int var4 = var0 & 0xFF;
      int var5 = (var2 * 30 + var3 * 59 + var4 * 11) / 100;
      int var6 = (var2 * 30 + var3 * 70) / 100;
      int var7 = (var2 * 30 + var4 * 70) / 100;
      return var1 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   public static void BatModClient(
      String var0, int var1, int var2, int var3, int var4
   ) {
      Button(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);

      for (int var5 = 0; var5 <= var2; var5++) {
         File var6 = new File(var0 + "_" + var5 + ".png");
         int var7 = var3 >> var5;
         int var8 = var4 >> var5;
         int var9 = var7 * var8;
         IntBuffer var10 = BufferUtils.createIntBuffer(var9);
         int[] var11 = new int[var9];
         GL11.glGetTexImage(3553, var5, 32993, 33639, var10);
         var10.get(var11);
         BufferedImage var12 = new BufferedImage(var7, var8, 2);
         var12.setRGB(0, 0, var7, var8, var11, 0, var7);

         try {
            ImageIO.write(var12, "png", var6);
            CustomSpinner.debug(
               "Exported png to: {}", new Object[]{var6.getAbsolutePath()}
            );
         } catch (Exception var14) {
            CustomSpinner.debug("Unable to write: ", var14);
         }
      }
   }

   public static void BatModClient(int[] var0, int var1, int var2) {
      int[] var3 = new int[var1];
      int var4 = var2 / 2;

      for (int var5 = 0; var5 < var4; var5++) {
         System.arraycopy(var0, var5 * var1, var3, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var5) * var1, var0, var5 * var1, var1);
         System.arraycopy(var3, 0, var0, (var2 - 1 - var5) * var1, var1);
      }
   }

   static {
      int var0 = -16777216;
      int var1 = -524040;
      int[] var2 = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
      int[] var3 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
      int var4 = var2.length;

      for (int var5 = 0; var5 < 16; var5++) {
         System.arraycopy(
            var5 < var4 ? var2 : var3, 0, Button, 16 * var5, var4
         );
         System.arraycopy(
            var5 < var4 ? var3 : var2,
            0,
            Button,
            16 * var5 + var4,
            var4
         );
      }

      BatModClient.Button();
      Spinner = new int[4];
   }
}
