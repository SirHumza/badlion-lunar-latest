package net.minecraft.client.renderer;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class BatModClient {
   private static final IntBuffer BatModClient = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.ButtonAction(
      16
   );
   private static final FloatBuffer Button = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.Spinner(
      16
   );
   private static final FloatBuffer CustomSpinner = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.Spinner(
      16
   );
   private static final FloatBuffer ButtonAction = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.Spinner(
      3
   );
   private static qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD Spinner = new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
      0.0, 0.0, 0.0
   );
   private static float Checkbox;
   private static float ProgressBar;
   private static float BatModProgressBar;
   private static float ColorChooser;
   private static float IntegerSpinner;

   public static void BatModClient(float var0, float var1, boolean var2) {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         2982, Button
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         2983, CustomSpinner
      );
      GL11.glGetInteger(2978, BatModClient);
      float var3 = (
            BatModClient.get(0)
               + BatModClient.get(2)
         )
         / 2;
      float var4 = (
            BatModClient.get(1)
               + BatModClient.get(3)
         )
         / 2;
      GLU.gluUnProject(
         var3,
         var4,
         0.0F,
         Button,
         CustomSpinner,
         BatModClient,
         ButtonAction
      );
      Spinner = new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
         ButtonAction.get(0),
         ButtonAction.get(1),
         ButtonAction.get(2)
      );
      int var5 = var2 ? 1 : 0;
      Checkbox = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
            var0 * (float) Math.PI / 180.0F
         )
         * (1 - var5 * 2);
      BatModProgressBar = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var0 * (float) Math.PI / 180.0F
         )
         * (1 - var5 * 2);
      ColorChooser = -BatModProgressBar
         * u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var1 * (float) Math.PI / 180.0F
         )
         * (1 - var5 * 2);
      IntegerSpinner = Checkbox
         * u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var1 * (float) Math.PI / 180.0F
         )
         * (1 - var5 * 2);
      ProgressBar = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
         var1 * (float) Math.PI / 180.0F
      );
   }

   public static qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var0, double var1
   ) {
      double var3 = var0.ExitCode
         + (
               var0.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  - var0.ExitCode
            )
            * var1;
      double var5 = var0.BatModJson
         + (
               var0.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                  - var0.BatModJson
            )
            * var1;
      double var7 = var0.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         + (
               var0.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                  - var0.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
            )
            * var1;
      double var9 = var3
         + Spinner.BatModClient;
      double var11 = var5
         + Spinner.Button;
      double var13 = var7
         + Spinner.CustomSpinner;
      return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(var9, var11, var13);
   }

   public static c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var0,
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1,
      float var2
   ) {
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var3 = BatModClient(
         var1, var2
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         var3
      );
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var5 = var0.Button(
         var4
      );
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var6 = var5.CustomSpinner();
      if (var6.Checkbox()
         .BatModClient()) {
         float var7 = 0.0F;
         if (var5.CustomSpinner() instanceof txYR4Al4L20QyazFUZSsCA6sPoZt00sa4aJsLT7jfVAhuDqyiyxfZHd7cqNEwGSg0TSADKZUJPl8sQPhSc8joxCQHFuE8PgT4CKb
            )
          {
            var7 = txYR4Al4L20QyazFUZSsCA6sPoZt00sa4aJsLT7jfVAhuDqyiyxfZHd7cqNEwGSg0TSADKZUJPl8sQPhSc8joxCQHFuE8PgT4CKb.Spinner(
                  (Integer)var5.BatModClient(
                     txYR4Al4L20QyazFUZSsCA6sPoZt00sa4aJsLT7jfVAhuDqyiyxfZHd7cqNEwGSg0TSADKZUJPl8sQPhSc8joxCQHFuE8PgT4CKb.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ
                  )
               )
               - 0.11111111F;
         }

         float var8 = var4.ColorChooser() + 1 - var7;
         if (var3.Button >= var8) {
            var6 = var0.Button(
                  var4.BatModClient()
               )
               .CustomSpinner();
         }
      }

      return var6;
   }

   public static qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient() {
      return Spinner;
   }

   public static float Button() {
      return Checkbox;
   }

   public static float CustomSpinner() {
      return ProgressBar;
   }

   public static float ButtonAction() {
      return BatModProgressBar;
   }

   public static float Spinner() {
      return ColorChooser;
   }

   public static float Checkbox() {
      return IntegerSpinner;
   }
}
