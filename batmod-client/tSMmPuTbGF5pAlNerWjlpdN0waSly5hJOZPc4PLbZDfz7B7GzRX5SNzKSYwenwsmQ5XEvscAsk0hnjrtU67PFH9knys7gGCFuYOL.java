import java.awt.Dimension;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class tSMmPuTbGF5pAlNerWjlpdN0waSly5hJOZPc4PLbZDfz7B7GzRX5SNzKSYwenwsmQ5XEvscAsk0hnjrtU67PFH9knys7gGCFuYOL {
   private final String BatModClient;
   private final int Button;
   private final int CustomSpinner;
   private final int[] ButtonAction;
   private final boolean Spinner;
   private int[][] Checkbox;
   private IntBuffer[] ProgressBar;
   private Dimension[] BatModProgressBar;

   public tSMmPuTbGF5pAlNerWjlpdN0waSly5hJOZPc4PLbZDfz7B7GzRX5SNzKSYwenwsmQ5XEvscAsk0hnjrtU67PFH9knys7gGCFuYOL(
      String var1, int var2, int var3, int[] var4, boolean var5
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.BatModProgressBar = BatModClient(
         var2, var3, var1
      );
      this.Checkbox = BatModClient(
         var4, var2, var3, this.BatModProgressBar
      );
      if (var5) {
         this.ProgressBar = BatModClient(
            this.BatModProgressBar,
            this.Checkbox
         );
      }
   }

   public static Dimension[] BatModClient(
      int var0, int var1, String var2
   ) {
      int var3 = uBMlMKyXwmX0EK0kfsijZNTp4hBUYFfRWKJefXsPH5ivKSSRJfU3L3LDkO7zU6NlrKIEe3qCdknVdKZ4HcZJIorv59e9TNi5jaQf.BatModClient(
         var0
      );
      int var4 = uBMlMKyXwmX0EK0kfsijZNTp4hBUYFfRWKJefXsPH5ivKSSRJfU3L3LDkO7zU6NlrKIEe3qCdknVdKZ4HcZJIorv59e9TNi5jaQf.BatModClient(
         var1
      );
      if (var3 == var0 && var4 == var1) {
         ArrayList var5 = new ArrayList();
         int var6 = var3;
         int var7 = var4;

         while (true) {
            var6 /= 2;
            var7 /= 2;
            if (var6 <= 0 && var7 <= 0) {
               return var5.toArray(new Dimension[var5.size()]);
            }

            if (var6 <= 0) {
               var6 = 1;
            }

            if (var7 <= 0) {
               var7 = 1;
            }

            int var8 = var6 * var7 * 4;
            Dimension var9 = new Dimension(var6, var7);
            var5.add(var9);
         }
      } else {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Mipmaps not possible (power of 2 dimensions needed), texture: " + var2 + ", dim: " + var0 + "x" + var1
         );
         return new Dimension[0];
      }
   }

   public static int[][] BatModClient(
      int[] var0, int var1, int var2, Dimension[] var3
   ) {
      int[] var4 = var0;
      int var5 = var1;
      boolean var6 = true;
      int[][] var7 = new int[var3.length][];

      for (int var8 = 0; var8 < var3.length; var8++) {
         Dimension var9 = var3[var8];
         int var10 = var9.width;
         int var11 = var9.height;
         int[] var12 = new int[var10 * var11];
         var7[var8] = var12;
         int var13 = var8 + 1;
         if (var6) {
            for (int var14 = 0; var14 < var10; var14++) {
               for (int var15 = 0; var15 < var11; var15++) {
                  int var16 = var4[var14 * 2 + 0 + (var15 * 2 + 0) * var5];
                  int var17 = var4[var14 * 2 + 1 + (var15 * 2 + 0) * var5];
                  int var18 = var4[var14 * 2 + 1 + (var15 * 2 + 1) * var5];
                  int var19 = var4[var14 * 2 + 0 + (var15 * 2 + 1) * var5];
                  int var20 = BatModClient(var16, var17, var18, var19);
                  var12[var14 + var15 * var10] = var20;
               }
            }
         }

         var4 = var12;
         var5 = var10;
         if (var10 <= 1 || var11 <= 1) {
            var6 = false;
         }
      }

      return var7;
   }

   public static int BatModClient(
      int var0, int var1, int var2, int var3
   ) {
      int var4 = BatModClient(var0, var1);
      int var5 = BatModClient(var2, var3);
      return BatModClient(var4, var5);
   }

   private static int BatModClient(int var0, int var1) {
      int var2 = (var0 & 0xFF000000) >> 24 & 0xFF;
      int var3 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var4 = (var2 + var3) / 2;
      if (var2 == 0 && var3 == 0) {
         var2 = 1;
         var3 = 1;
      } else {
         if (var2 == 0) {
            var0 = var1;
            var4 /= 2;
         }

         if (var3 == 0) {
            var1 = var0;
            var4 /= 2;
         }
      }

      int var5 = (var0 >> 16 & 0xFF) * var2;
      int var6 = (var0 >> 8 & 0xFF) * var2;
      int var7 = (var0 & 0xFF) * var2;
      int var8 = (var1 >> 16 & 0xFF) * var3;
      int var9 = (var1 >> 8 & 0xFF) * var3;
      int var10 = (var1 & 0xFF) * var3;
      int var11 = (var5 + var8) / (var2 + var3);
      int var12 = (var6 + var9) / (var2 + var3);
      int var13 = (var7 + var10) / (var2 + var3);
      return var4 << 24 | var11 << 16 | var12 << 8 | var13;
   }

   private int Button(int var1, int var2) {
      int var3 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var4 = (var2 & 0xFF000000) >> 24 & 0xFF;
      return (var3 + var4 >> 1 << 24) + ((var1 & 16711422) + (var2 & 16711422) >> 1);
   }

   public static IntBuffer[] BatModClient(
      Dimension[] var0, int[][] var1
   ) {
      if (var0 == null) {
         return null;
      }

      IntBuffer[] var2 = new IntBuffer[var0.length];

      for (int var3 = 0; var3 < var0.length; var3++) {
         Dimension var4 = var0[var3];
         int var5 = var4.width * var4.height;
         IntBuffer var6 = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.ButtonAction(
            var5
         );
         int[] var7 = var1[var3];
         ((Buffer)var6).clear();
         var6.put(var7);
         ((Buffer)var6).clear();
         var2[var3] = var6;
      }

      return var2;
   }

   public static void Button(int var0, int var1, String var2) {
      Dimension[] var3 = BatModClient(var0, var1, var2);

      for (int var4 = 0; var4 < var3.length; var4++) {
         Dimension var5 = var3[var4];
         int var6 = var5.width;
         int var7 = var5.height;
         int var8 = var4 + 1;
         GL11.glTexImage2D(3553, var8, 6408, var6, var7, 0, 32993, 33639, (IntBuffer)null);
      }
   }
}
