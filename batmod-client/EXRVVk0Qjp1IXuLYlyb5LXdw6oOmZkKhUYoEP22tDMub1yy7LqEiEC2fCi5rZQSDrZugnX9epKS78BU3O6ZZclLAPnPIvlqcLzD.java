import java.util.IdentityHashMap;
import java.util.Map;

public class EXRVVk0Qjp1IXuLYlyb5LXdw6oOmZkKhUYoEP22tDMub1yy7LqEiEC2fCi5rZQSDrZugnX9epKS78BU3O6ZZclLAPnPIvlqcLzD {
   public int BatModClient = 1;
   public boolean Button = false;
   private Map[] CustomSpinner = new Map[8];

   public EXRVVk0Qjp1IXuLYlyb5LXdw6oOmZkKhUYoEP22tDMub1yy7LqEiEC2fCi5rZQSDrZugnX9epKS78BU3O6ZZclLAPnPIvlqcLzD(String var1) {
      if (var1.equals("4")) {
         this.BatModClient = 4;
      } else if (var1.equals("2")) {
         this.BatModClient = 2;
      } else if (var1.equals("F")) {
         this.Button = true;
      } else if (var1.equals("4F")) {
         this.BatModClient = 4;
         this.Button = true;
      } else if (var1.equals("2F")) {
         this.BatModClient = 2;
         this.Button = true;
      } else {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "NaturalTextures: Unknown type: " + var1
         );
      }
   }

   public boolean BatModClient() {
      return this.BatModClient != 2
            && this.BatModClient != 4
         ? this.Button
         : true;
   }

   public synchronized AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk BatModClient(
      AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk var1, int var2, boolean var3
   ) {
      int var4 = var2;
      if (var3) {
         var4 = var2 | 4;
      }

      if (var4 > 0 && var4 < this.CustomSpinner.length) {
         Map var5 = this.CustomSpinner[var4];
         if (var5 == null) {
            var5 = new IdentityHashMap(1);
            this.CustomSpinner[var4] = var5;
         }

         AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk var6 = (AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk)var5.get(
            var1
         );
         if (var6 == null) {
            var6 = this.Button(var1, var2, var3);
            var5.put(var1, var6);
         }

         return var6;
      } else {
         return var1;
      }
   }

   private AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk Button(
      AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk var1, int var2, boolean var3
   ) {
      int[] var4 = var1.Button();
      int var5 = var1.ButtonAction();
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var6 = var1.Spinner();
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var7 = var1.BatModClient();
      if (!this.BatModClient(var1)) {
         return var1;
      }

      var4 = this.BatModClient(var4, var2, var3);
      return new AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk(var4, var5, var6, var7);
   }

   private int[] BatModClient(int[] var1, int var2, boolean var3) {
      int[] var4 = (int[])var1.clone();
      int var5 = 4 - var2;
      if (var3) {
         var5 += 3;
      }

      var5 %= 4;
      int var6 = var4.length / 4;

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var7 * var6;
         int var9 = var5 * var6;
         var4[var9 + 4] = var1[var8 + 4];
         var4[var9 + 4 + 1] = var1[var8 + 4 + 1];
         if (var3) {
            if (--var5 < 0) {
               var5 = 3;
            }
         } else if (++var5 > 3) {
            var5 = 0;
         }
      }

      return var4;
   }

   private boolean BatModClient(
      AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk var1
   ) {
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var2 = var1.BatModClient();
      float var3 = var2.Spinner();
      float var4 = var2.Checkbox();
      float var5 = var4 - var3;
      float var6 = var5 / 256.0F;
      float var7 = var2.ProgressBar();
      float var8 = var2.BatModProgressBar();
      float var9 = var8 - var7;
      float var10 = var9 / 256.0F;
      int[] var11 = var1.Button();
      int var12 = var11.length / 4;

      for (int var13 = 0; var13 < 4; var13++) {
         int var14 = var13 * var12;
         float var15 = Float.intBitsToFloat(var11[var14 + 4]);
         float var16 = Float.intBitsToFloat(var11[var14 + 4 + 1]);
         if (!this.BatModClient(var15, var3, var6)
            && !this.BatModClient(var15, var4, var6)) {
            return false;
         }

         if (!this.BatModClient(var16, var7, var10)
            && !this.BatModClient(var16, var8, var10)) {
            return false;
         }
      }

      return true;
   }

   private boolean BatModClient(float var1, float var2, float var3) {
      float var4 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Spinner(
         var1 - var2
      );
      return var4 < var3;
   }
}
