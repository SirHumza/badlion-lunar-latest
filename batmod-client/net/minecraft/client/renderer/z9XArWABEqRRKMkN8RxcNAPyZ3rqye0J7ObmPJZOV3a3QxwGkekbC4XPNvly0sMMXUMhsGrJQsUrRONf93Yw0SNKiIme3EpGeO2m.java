package net.minecraft.client.renderer;

import java.awt.Color;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m {
   private static net.minecraft.client.renderer.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl Button = new net.minecraft.client.renderer.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ CustomSpinner = new net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ(
      2896
   );
   private static net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ[] ButtonAction = new net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ[8];
   private static net.minecraft.client.renderer.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV Spinner = new net.minecraft.client.renderer.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj Checkbox = new net.minecraft.client.renderer.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 ProgressBar = new net.minecraft.client.renderer.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.GsonTypeAdapter BatModProgressBar = new net.minecraft.client.renderer.GsonTypeAdapter(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i ColorChooser = new net.minecraft.client.renderer.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 IntegerSpinner = new net.minecraft.client.renderer.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP TextField = new net.minecraft.client.renderer.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV ColorTextPane = new net.minecraft.client.renderer.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o BatModInstallerMain = new net.minecraft.client.renderer.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = new net.minecraft.client.renderer.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = new net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ(
      2977
   );
   private static int G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = 0;
   private static net.minecraft.client.renderer.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf[] iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = new net.minecraft.client.renderer.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf[32];
   private static int bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = 7425;
   private static net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = new net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ(
      32826
   );
   private static net.minecraft.client.renderer.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu Downloader = new net.minecraft.client.renderer.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu(
      (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
   );
   private static net.minecraft.client.renderer.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt InstallationLogger = new net.minecraft.client.renderer.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt();
   private static final String RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = "CL_00002558";
   public static boolean BatModClient = true;

   public static boolean BatModClient() {
      return net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.BatModClient(
         Button.BatModClient
      );
   }

   public static boolean Button() {
      return net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.BatModClient(
         CustomSpinner
      );
   }

   public static boolean CustomSpinner() {
      return net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.BatModClient(
         Checkbox.BatModClient
      );
   }

   public static boolean ButtonAction() {
      return net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.BatModClient(
         ProgressBar.BatModClient
      );
   }

   public static boolean Spinner() {
      return net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.BatModClient(
         ColorChooser.BatModClient
      );
   }

   public static boolean Checkbox() {
      return net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.BatModClient(
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
            .BatModClient
      );
   }

   public static void ProgressBar() {
      GL11.glPushAttrib(8256);
   }

   public static void BatModProgressBar() {
      GL11.glPopAttrib();
   }

   public static void ColorChooser() {
      Button.BatModClient
         .BatModClient();
   }

   public static void IntegerSpinner() {
      Button.BatModClient
         .Button();
   }

   public static void BatModClient(int var0, float var1) {
      if (var0
            != Button.Button
         || var1
            != Button.CustomSpinner
         )
       {
         Button.Button = var0;
         Button.CustomSpinner = var1;
         GL11.glAlphaFunc(var0, var1);
      }
   }

   public static void TextField() {
      CustomSpinner.Button();
   }

   public static void ColorTextPane() {
      CustomSpinner.BatModClient();
   }

   public static void BatModClient(int var0) {
      ButtonAction[var0]
         .Button();
   }

   public static void Button(int var0) {
      ButtonAction[var0]
         .BatModClient();
   }

   public static void BatModInstallerMain() {
      Spinner.BatModClient
         .Button();
   }

   public static void aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      Spinner.BatModClient
         .BatModClient();
   }

   public static void BatModClient(int var0, int var1) {
      if (var0
            != Spinner.Button
         || var1
            != Spinner.CustomSpinner
         )
       {
         Spinner.Button = var0;
         Spinner.CustomSpinner = var1;
         GL11.glColorMaterial(var0, var1);
      }
   }

   public static void LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      ProgressBar.BatModClient
         .BatModClient();
   }

   public static void G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr() {
      ProgressBar.BatModClient
         .Button();
   }

   public static void CustomSpinner(int var0) {
      if (var0
         != ProgressBar.CustomSpinner
         )
       {
         ProgressBar.CustomSpinner = var0;
         GL11.glDepthFunc(var0);
      }
   }

   public static void BatModClient(boolean var0) {
      if (var0
         != ProgressBar.Button
         )
       {
         ProgressBar.Button = var0;
         GL11.glDepthMask(var0);
      }
   }

   public static void iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF() {
      Checkbox.BatModClient
         .BatModClient();
   }

   public static void bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ() {
      Checkbox.BatModClient
         .Button();
   }

   public static void Button(int var0, int var1) {
      if (var0
            != Checkbox.Button
         || var1
            != Checkbox.CustomSpinner
         )
       {
         Checkbox.Button = var0;
         Checkbox.CustomSpinner = var1;
         GL11.glBlendFunc(var0, var1);
      }
   }

   public static void BatModClient(
      int var0, int var1, int var2, int var3
   ) {
      if (var0
            != Checkbox.Button
         || var1
            != Checkbox.CustomSpinner
         || var2
            != Checkbox.ButtonAction
         || var3
            != Checkbox.Spinner
         )
       {
         Checkbox.Button = var0;
         Checkbox.CustomSpinner = var1;
         Checkbox.ButtonAction = var2;
         Checkbox.Spinner = var3;
         net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.CustomSpinner(
            var0, var1, var2, var3
         );
      }
   }

   public static void RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB() {
      BatModProgressBar.BatModClient
         .Button();
   }

   public static void Downloader() {
      BatModProgressBar.BatModClient
         .BatModClient();
   }

   public static void ButtonAction(int var0) {
      if (var0
         != BatModProgressBar.Button
         )
       {
         BatModProgressBar.Button = var0;
         GL11.glFogi(2917, var0);
      }
   }

   public static void BatModClient(float var0) {
      if (var0
         != BatModProgressBar.CustomSpinner
         )
       {
         BatModProgressBar.CustomSpinner = var0;
         GL11.glFogf(2914, var0);
      }
   }

   public static void Button(float var0) {
      if (var0
         != BatModProgressBar.ButtonAction
         )
       {
         BatModProgressBar.ButtonAction = var0;
         GL11.glFogf(2915, var0);
      }
   }

   public static void CustomSpinner(float var0) {
      if (var0
         != BatModProgressBar.Spinner
         )
       {
         BatModProgressBar.Spinner = var0;
         GL11.glFogf(2916, var0);
      }
   }

   public static void InstallationLogger() {
      ColorChooser.BatModClient
         .Button();
   }

   public static void RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM() {
      ColorChooser.BatModClient
         .BatModClient();
   }

   public static void Spinner(int var0) {
      if (var0
         != ColorChooser.Button
         )
       {
         ColorChooser.Button = var0;
         GL11.glCullFace(var0);
      }
   }

   public static void K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY() {
      IntegerSpinner.BatModClient
         .Button();
   }

   public static void ExitCode() {
      IntegerSpinner.BatModClient
         .BatModClient();
   }

   public static void BatModClient(float var0, float var1) {
      if (var0
            != IntegerSpinner.CustomSpinner
         || var1
            != IntegerSpinner.ButtonAction
         )
       {
         IntegerSpinner.CustomSpinner = var0;
         IntegerSpinner.ButtonAction = var1;
         GL11.glPolygonOffset(var0, var1);
      }
   }

   public static void BatModJson() {
      TextField.BatModClient
         .Button();
   }

   public static void z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP() {
      TextField.BatModClient
         .BatModClient();
   }

   public static void Checkbox(int var0) {
      if (var0
         != TextField.Button
         )
       {
         TextField.Button = var0;
         GL11.glLogicOp(var0);
      }
   }

   public static void BatModClient(
      net.minecraft.client.renderer.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var0
   ) {
      CustomSpinner(var0)
         .BatModClient
         .Button();
   }

   public static void Button(
      net.minecraft.client.renderer.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var0
   ) {
      CustomSpinner(var0)
         .BatModClient
         .BatModClient();
   }

   public static void BatModClient(
      net.minecraft.client.renderer.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var0, int var1
   ) {
      net.minecraft.client.renderer.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP var2 = CustomSpinner(
         var0
      );
      if (var1 != var2.CustomSpinner) {
         var2.CustomSpinner = var1;
         GL11.glTexGeni(var2.Button, 9472, var1);
      }
   }

   public static void BatModClient(
      net.minecraft.client.renderer.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var0,
      int var1,
      FloatBuffer var2
   ) {
      GL11.glTexGen(
         CustomSpinner(var0).Button,
         var1,
         var2
      );
   }

   private static net.minecraft.client.renderer.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP CustomSpinner(
      net.minecraft.client.renderer.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var0
   ) {
      switch (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient[var0.ordinal()]) {
         case 1:
            return ColorTextPane.BatModClient;
         case 2:
            return ColorTextPane.Button;
         case 3:
            return ColorTextPane.CustomSpinner;
         case 4:
            return ColorTextPane.ButtonAction;
         default:
            return ColorTextPane.BatModClient;
      }
   }

   public static void ProgressBar(int var0) {
      if (G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         != var0
            - net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         )
       {
         G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = var0
            - net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
         net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.TextField(
            var0
         );
      }
   }

   public static void LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8() {
      iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
         .BatModClient
         .Button();
   }

   public static void xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa() {
      iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
         .BatModClient
         .BatModClient();
   }

   public static int o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4() {
      return GL11.glGenTextures();
   }

   public static void BatModProgressBar(int var0) {
      if (var0 != 0) {
         GL11.glDeleteTextures(var0);

         for (net.minecraft.client.renderer.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf var4 : iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF) {
            if (var4.Button == var0) {
               var4.Button = 0;
            }
         }
      }
   }

   public static void ColorChooser(int var0) {
      if (var0
         != iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
            .Button) {
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
            .Button = var0;
         GL11.glBindTexture(3553, var0);
      }
   }

   public static void K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL() {
      GL11.glBindTexture(
         3553,
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
            .Button
      );
   }

   public static void sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr() {
      LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.Button();
   }

   public static void GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj() {
      LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.BatModClient();
   }

   public static void IntegerSpinner(int var0) {
      if (var0 != bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ) {
         bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = var0;
         GL11.glShadeModel(var0);
      }
   }

   public static void OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF() {
      RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.Button();
   }

   public static void f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb() {
      RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.BatModClient();
   }

   public static void Button(
      int var0, int var1, int var2, int var3
   ) {
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void BatModClient(
      boolean var0, boolean var1, boolean var2, boolean var3
   ) {
      if (var0
            != Downloader.BatModClient
         || var1
            != Downloader.Button
         || var2
            != Downloader.CustomSpinner
         || var3
            != Downloader.ButtonAction
         )
       {
         Downloader.BatModClient = var0;
         Downloader.Button = var1;
         Downloader.CustomSpinner = var2;
         Downloader.ButtonAction = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }
   }

   public static void BatModClient(double var0) {
      if (var0
         != BatModInstallerMain.BatModClient
         )
       {
         BatModInstallerMain.BatModClient = var0;
         GL11.glClearDepth(var0);
      }
   }

   public static void BatModClient(
      float var0, float var1, float var2, float var3
   ) {
      if (var0
            != BatModInstallerMain.Button
               .BatModClient
         || var1
            != BatModInstallerMain.Button
               .Button
         || var2
            != BatModInstallerMain.Button
               .CustomSpinner
         || var3
            != BatModInstallerMain.Button
               .ButtonAction) {
         BatModInstallerMain.Button
            .BatModClient = var0;
         BatModInstallerMain.Button
            .Button = var1;
         BatModInstallerMain.Button
            .CustomSpinner = var2;
         BatModInstallerMain.Button
            .ButtonAction = var3;
         GL11.glClearColor(var0, var1, var2, var3);
      }
   }

   public static void TextField(int var0) {
      if (BatModClient) {
         GL11.glClear(var0);
      }
   }

   public static void ColorTextPane(int var0) {
      GL11.glMatrixMode(var0);
   }

   public static void fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee() {
      GL11.glLoadIdentity();
   }

   public static void z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m() {
      GL11.glPushMatrix();
   }

   public static void N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl() {
      GL11.glPopMatrix();
   }

   public static void BatModClient(int var0, FloatBuffer var1) {
      GL11.glGetFloat(var0, var1);
   }

   public static void BatModClient(
      double var0, double var2, double var4, double var6, double var8, double var10
   ) {
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   public static void Button(
      float var0, float var1, float var2, float var3
   ) {
      GL11.glRotatef(var0, var1, var2, var3);
   }

   public static void ButtonAction(float var0) {
      GL11.glScalef(var0, var0, var0);
   }

   public static void Button(double var0) {
      GL11.glScaled(var0, var0, var0);
   }

   public static void BatModClient(float var0, float var1, float var2) {
      GL11.glScalef(var0, var1, var2);
   }

   public static void BatModClient(
      double var0, double var2, double var4
   ) {
      GL11.glScaled(var0, var2, var4);
   }

   public static void Button(float var0, float var1, float var2) {
      GL11.glTranslatef(var0, var1, var2);
   }

   public static void Button(
      double var0, double var2, double var4
   ) {
      GL11.glTranslated(var0, var2, var4);
   }

   public static void BatModClient(FloatBuffer var0) {
      GL11.glMultMatrix(var0);
   }

   public static void CustomSpinner(
      float var0, float var1, float var2, float var3
   ) {
      if (var0
            != InstallationLogger.BatModClient
         || var1
            != InstallationLogger.Button
         || var2
            != InstallationLogger.CustomSpinner
         || var3
            != InstallationLogger.ButtonAction
         )
       {
         InstallationLogger.BatModClient = var0;
         InstallationLogger.Button = var1;
         InstallationLogger.CustomSpinner = var2;
         InstallationLogger.ButtonAction = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }
   }

   public static void CustomSpinner(float var0, float var1, float var2) {
      CustomSpinner(var0, var1, var2, 1.0F);
   }

   public static void BatModClient(Color var0) {
      CustomSpinner(
         var0.getRed() / 256.0F, var0.getGreen() / 256.0F, var0.getBlue() / 256.0F, var0.getAlpha() / 256.0F
      );
   }

   public static void EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj() {
      InstallationLogger.BatModClient = InstallationLogger.Button = InstallationLogger.CustomSpinner = InstallationLogger.ButtonAction = -1.0F;
   }

   public static void BatModInstallerMain(int var0) {
      GL11.glCallList(var0);
   }

   public static int KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ() {
      return net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         + G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
   }

   public static int WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o() {
      return iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr]
         .Button;
   }

   public static void OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt() {
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModInstallerMain()
         )
       {
         int var0 = GL11.glGetInteger(34016);
         int var1 = GL11.glGetInteger(32873);
         int var2 = KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ();
         int var3 = WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o();
         if (var3 > 0 && (var0 != var2 || var1 != var3)) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               "checkTexture: act: " + var2 + ", glAct: " + var0 + ", tex: " + var3 + ", glTex: " + var1
            );
         }
      }
   }

   public static void BatModClient(IntBuffer var0) {
      ((Buffer)var0).rewind();

      while (var0.position() < var0.limit()) {
         int var1 = var0.get();
         BatModProgressBar(var1);
      }

      ((Buffer)var0).rewind();
   }

   static {
      for (int var0 = 0; var0 < 8; var0++) {
         ButtonAction[var0] = new net.minecraft.client.renderer.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ(
            16384 + var0
         );
      }

      for (int var1 = 0; var1 < iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.length; var1++) {
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF[var1] = new net.minecraft.client.renderer.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf(
            (net.minecraft.client.renderer.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv)null
         );
      }
   }
}
