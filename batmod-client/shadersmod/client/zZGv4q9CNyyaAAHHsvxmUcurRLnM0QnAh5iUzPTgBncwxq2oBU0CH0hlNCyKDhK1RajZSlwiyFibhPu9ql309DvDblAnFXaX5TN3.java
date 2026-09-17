package shadersmod.client;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 {
   public static final int BatModClient = 1048576;
   public static ByteBuffer Button = BufferUtils.createByteBuffer(
      4194304
   );
   public static IntBuffer CustomSpinner = Button.asIntBuffer();
   public static int[] ButtonAction = new int[1048576];
   public static final int Spinner = 0;
   public static final int Checkbox = -8421377;
   public static final int ProgressBar = 0;
   public static Map BatModProgressBar = new HashMap();
   public static seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs ColorChooser = null;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD IntegerSpinner = null;
   public static shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF TextField = null;
   public static shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF ColorTextPane = null;
   public static int BatModInstallerMain = 0;
   public static String aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = null;
   public static nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = null;
   static p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = null;
   static int iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = 0;

   public static IntBuffer BatModClient(int var0) {
      if (CustomSpinner.capacity() < var0) {
         int var1 = CustomSpinner(var0);
         Button = BufferUtils.createByteBuffer(var1 * 4);
         CustomSpinner = Button.asIntBuffer();
      }

      return CustomSpinner;
   }

   public static int[] Button(int var0) {
      if (ButtonAction == null) {
         ButtonAction = new int[1048576];
      }

      if (ButtonAction.length < var0) {
         ButtonAction = new int[CustomSpinner(
            var0
         )];
      }

      return ButtonAction;
   }

   public static int CustomSpinner(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   public static int ButtonAction(int var0) {
      int var1 = 0;
      if ((var0 & -65536) != 0) {
         var1 += 16;
         var0 >>= 16;
      }

      if ((var0 & 0xFF00) != 0) {
         var1 += 8;
         var0 >>= 8;
      }

      if ((var0 & 240) != 0) {
         var1 += 4;
         var0 >>= 4;
      }

      if ((var0 & 6) != 0) {
         var1 += 2;
         var0 >>= 2;
      }

      if ((var0 & 2) != 0) {
         var1++;
      }

      return var1;
   }

   public static IntBuffer BatModClient(int var0, int var1) {
      int[] var2 = Button(var0);
      IntBuffer var3 = BatModClient(var0);
      Arrays.fill(ButtonAction, 0, var0, var1);
      CustomSpinner.put(
         ButtonAction, 0, var0
      );
      return CustomSpinner;
   }

   public static int[] Spinner(int var0) {
      int[] var1 = new int[var0 * 3];
      Arrays.fill(var1, 0, var0, 0);
      Arrays.fill(var1, var0, var0 * 2, -8421377);
      Arrays.fill(var1, var0 * 2, var0 * 3, 0);
      return var1;
   }

   public static int[] Button(int var0, int var1) {
      int[] var2 = new int[var0 * 3];
      Arrays.fill(var2, 0, var0, var1);
      Arrays.fill(var2, var0, var0 * 2, -8421377);
      Arrays.fill(var2, var0 * 2, var0 * 3, 0);
      return var2;
   }

   public static shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF BatModClient(
      EPkh1adl9hBFwxgqii9HWFOypKPyfEcyzBW80EIl03krX18hlp7IM9KqB4GSwwsvir3BFo13OlFiLjVoP0g75Jf282qqQTeRPC3 var0
   ) {
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var1 = var0.BatModProgressBar;
      if (var1 == null) {
         int var2 = var0.c_();
         var1 = (shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF)BatModProgressBar.get(
            var2
         );
         if (var1 == null) {
            var1 = new shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF(
               var2, GL11.glGenTextures(), GL11.glGenTextures()
            );
            BatModProgressBar.put(var2, var1);
         }

         var0.BatModProgressBar = var1;
      }

      return var1;
   }

   public static void BatModClient(
      EPkh1adl9hBFwxgqii9HWFOypKPyfEcyzBW80EIl03krX18hlp7IM9KqB4GSwwsvir3BFo13OlFiLjVoP0g75Jf282qqQTeRPC3 var0, int var1
   ) {
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var2 = var0.BatModProgressBar;
      if (var2 != null) {
         var0.BatModProgressBar = null;
         BatModProgressBar.remove(
            var2.BatModClient
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModProgressBar(
            var2.Button
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModProgressBar(
            var2.CustomSpinner
         );
         if (var2.BatModClient != var1) {
            DniCLcCFIMbGh2IZprq023oekn6DsvFn5aeZnKiykOqPyCIqPLCPUEotfXR55QwK84TLQCo0tr4ieGZI2uGJGefmqtVtqXgrweb3.Button(
               "Error : MultiTexID.base mismatch: "
                  + var2.BatModClient
                  + ", texid: "
                  + var1
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModProgressBar(
               var2.BatModClient
            );
         }
      }
   }

   public static void CustomSpinner(int var0, int var1) {
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         && net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            == 33984) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33986
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var0
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33987
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var1
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33984
         );
      }
   }

   public static void BatModClient(
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var0
   ) {
      CustomSpinner(
         var0.Button,
         var0.CustomSpinner
      );
   }

   public static void BatModClient(int var0, int var1, int var2) {
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         && net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            == 33984) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33986
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var1
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33987
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var2
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33984
         );
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0
      );
   }

   public static void Button(
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var0
   ) {
      ColorTextPane = var0;
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         && net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            == 33984) {
         if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
               33986
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
               var0.Button
            );
         }

         if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
               33987
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
               var0.CustomSpinner
            );
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
            33984
         );
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.BatModClient
      );
   }

   public static void BatModClient(
      sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc var0
   ) {
      int var1 = var0.c_();
      if (var0 instanceof seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs) {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = ((seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs)var0)
            .ColorChooser;
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = ((seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs)var0)
            .IntegerSpinner;
         Button(
            var0.Checkbox()
         );
      } else {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = 0;
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = 0;
         Button(
            var0.Checkbox()
         );
      }
   }

   public static void BatModClient(
      falnvbnON9Yos1uc5Fb8Ya024Nj6kT8CIeZPcJ2aRWmnl3ydNppGk0tR5f0fVfO8Hx5dYDe9saJ4vN81axRqHk1dN0O0Np0uRlke var0,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs var2 = (seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs)var0.Button(
         var1
      );
      shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = var2.ColorChooser;
      shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = var2.IntegerSpinner;
      Button(
         TextField = var2.Checkbox()
      );
   }

   public static void Checkbox(int var0) {
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var1 = (shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF)BatModProgressBar.get(
         var0
      );
      Button(var1);
   }

   public static void BatModClient(
      int var0, int var1, int var2, BhjSlK0ArxpCQDTeSBA76jzHei68lMR4upvCrnY0dVqfYTLRBOobfFnsAOhBBUlN1b6AnVCkVe2AvZ7NP0t7rbDkQOcLB3gBafgr var3
   ) {
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var4 = var3.Checkbox();
      int[] var5 = var3.CustomSpinner();
      int var6 = var1 * var2;
      Arrays.fill(var5, var6, var6 * 2, -8421377);
      Arrays.fill(var5, var6 * 2, var6 * 3, 0);
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         var4.BatModClient, var1, var2
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         false, false
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         false
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         var4.Button, var1, var2
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         false, false
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         false
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         var4.CustomSpinner, var1, var2
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         false, false
      );
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         false
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var4.BatModClient
      );
   }

   public static void BatModClient(
      int var0, int[] var1, int var2, int var3, BhjSlK0ArxpCQDTeSBA76jzHei68lMR4upvCrnY0dVqfYTLRBOobfFnsAOhBBUlN1b6AnVCkVe2AvZ7NP0t7rbDkQOcLB3gBafgr var4
   ) {
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var5 = var4.Checkbox();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var5.BatModClient
      );
      BatModClient(var1, var2, var3, 0, 0, 0);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var5.Button
      );
      BatModClient(var1, var2, var3, 0, 0, 1);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var5.CustomSpinner
      );
      BatModClient(var1, var2, var3, 0, 0, 2);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var5.BatModClient
      );
   }

   public static void BatModClient(
      int[] var0, int var1, int var2, int var3, int var4, int var5
   ) {
      int var6 = var1 * var2;
      IntBuffer var7 = BatModClient(var6);
      ((Buffer)var7).clear();
      int var8 = var5 * var6;
      if (var0.length >= var8 + var6) {
         ((Buffer)var7.put(var0, var8, var6)).position(0).limit(var6);
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, 32993, 33639, var7);
         ((Buffer)var7).clear();
      }
   }

   public static sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc BatModClient() {
      BhjSlK0ArxpCQDTeSBA76jzHei68lMR4upvCrnY0dVqfYTLRBOobfFnsAOhBBUlN1b6AnVCkVe2AvZ7NP0t7rbDkQOcLB3gBafgr var0 = new BhjSlK0ArxpCQDTeSBA76jzHei68lMR4upvCrnY0dVqfYTLRBOobfFnsAOhBBUlN1b6AnVCkVe2AvZ7NP0t7rbDkQOcLB3gBafgr(
         1, 1
      );
      var0.CustomSpinner()[0] = -1;
      var0.Button();
      return var0;
   }

   public static void BatModClient(
      int var0,
      int var1,
      int var2,
      int var3,
      N0MPYYfm9IADXGbhW8ham7uCgCaWqcHTNiP8SnbTcSdxCHFOz5gWWImlgBStvgfivME14G0xCApTOSop3PlDNPJPV4w28u6OWixI var4,
      seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs var5
   ) {
      DniCLcCFIMbGh2IZprq023oekn6DsvFn5aeZnKiykOqPyCIqPLCPUEotfXR55QwK84TLQCo0tr4ieGZI2uGJGefmqtVtqXgrweb3.CustomSpinner(
         "allocateTextureMap " + var1 + " " + var2 + " " + var3 + " "
      );
      ColorChooser = var5;
      var5.ColorChooser = var2;
      var5.IntegerSpinner = var3;
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var6 = BatModClient(
         var5
      );
      TextField = var6;
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         var6.BatModClient, var1, var2, var3
      );
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
         )
       {
         oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
            var6.Button, var1, var2, var3
         );
      }

      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
         )
       {
         oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
            var6.CustomSpinner, var1, var2, var3
         );
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0
      );
   }

   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD BatModClient(
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var0
   ) {
      IntegerSpinner = var0;
      return var0;
   }

   public static String BatModClient(String var0) {
      aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = var0;
      return var0;
   }

   public static void BatModClient(
      int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6
   ) {
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         var0, var1, var2, var3, var4, var5, var6
      );
      boolean var7 = false;
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
         )
       {
         int[][] var8 = BatModClient(
            aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA + "_n",
            var1,
            var2,
            var0.length,
            var7,
            -8421377
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            TextField.Button
         );
         oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
            var8, var1, var2, var3, var4, var5, var6
         );
      }

      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
         )
       {
         int[][] var9 = BatModClient(
            aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA + "_s", var1, var2, var0.length, var7, 0
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            TextField.CustomSpinner
         );
         oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
            var9, var1, var2, var3, var4, var5, var6
         );
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         TextField.BatModClient
      );
   }

   public static int[][] BatModClient(
      String var0, int var1, int var2, int var3, boolean var4, int var5
   ) {
      int[][] var6 = new int[var3][];
      int[] var7;
      var6[0] = var7 = new int[var1 * var2];
      boolean var8 = false;
      BufferedImage var9 = BatModClient(
         ColorChooser.BatModClient(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(var0), 0
         )
      );
      if (var9 != null) {
         int var10 = var9.getWidth();
         int var11 = var9.getHeight();
         if (var10 + (var4 ? 16 : 0) == var1) {
            var8 = true;
            var9.getRGB(0, 0, var10, var10, var7, 0, var10);
         }
      }

      if (!var8) {
         Arrays.fill(var7, var5);
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         TextField.CustomSpinner
      );
      return BatModClient(var6.length - 1, var1, var6);
   }

   public static BufferedImage BatModClient(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var0
   ) {
      try {
         if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
            var0
         )) {
            return null;
         }

         InputStream var1 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var0
         );
         if (var1 == null) {
            return null;
         }

         BufferedImage var2 = ImageIO.read(var1);
         var1.close();
         return var2;
      } catch (IOException var3) {
         return null;
      }
   }

   public static int[][] BatModClient(int var0, int var1, int[][] var2) {
      for (int var3 = 1; var3 <= var0; var3++) {
         if (var2[var3] == null) {
            int var4 = var1 >> var3;
            int var5 = var4 * 2;
            int[] var6 = var2[var3 - 1];
            int[] var7 = var2[var3] = new int[var4 * var4];

            for (int var8 = 0; var8 < var4; var8++) {
               for (int var9 = 0; var9 < var4; var9++) {
                  int var10 = var8 * 2 * var5 + var9 * 2;
                  var7[var8 * var4 + var9] = Button(
                     var6[var10], var6[var10 + 1], var6[var10 + var5], var6[var10 + var5 + 1]
                  );
               }
            }
         }
      }

      return var2;
   }

   public static void Button(
      int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6
   ) {
      oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         var0, var1, var2, var3, var4, var5, var6
      );
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
         || shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
         )
       {
         if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
               TextField.Button
            );
            BatModClient(var0, var1, var2, var3, var4, 1);
         }

         if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
               TextField.CustomSpinner
            );
            BatModClient(var0, var1, var2, var3, var4, 2);
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            TextField.BatModClient
         );
      }
   }

   public static void BatModClient(
      int[][] var0, int var1, int var2, int var3, int var4, int var5
   ) {
      int var6 = var1 * var2;
      IntBuffer var7 = BatModClient(var6);
      int var8 = var0.length;
      int var9 = 0;
      int var10 = var1;
      int var11 = var2;
      int var12 = var3;
      int var13 = var4;

      while (var10 > 0 && var11 > 0 && var9 < var8) {
         int var14 = var10 * var11;
         int[] var15 = var0[var9];
         ((Buffer)var7).clear();
         if (var15.length >= var14 * (var5 + 1)) {
            ((Buffer)var7.put(var15, var14 * var5, var14)).position(0).limit(var14);
            GL11.glTexSubImage2D(3553, var9, var12, var13, var10, var11, 32993, 33639, var7);
         }

         var10 >>= 1;
         var11 >>= 1;
         var12 >>= 1;
         var13 >>= 1;
         var9++;
      }

      ((Buffer)var7).clear();
   }

   public static int BatModClient(
      int var0, int var1, int var2, int var3
   ) {
      int var4 = var0 >>> 24 & 0xFF;
      int var5 = var1 >>> 24 & 0xFF;
      int var6 = var2 >>> 24 & 0xFF;
      int var7 = var3 >>> 24 & 0xFF;
      int var8 = var4 + var5 + var6 + var7;
      int var9 = (var8 + 2) / 4;
      int var10;
      if (var8 != 0) {
         var10 = var8;
      } else {
         var10 = 4;
         var4 = 1;
         var5 = 1;
         var6 = 1;
         var7 = 1;
      }

      int var11 = (var10 + 1) / 2;
      return var9 << 24
         | ((var0 >>> 16 & 0xFF) * var4 + (var1 >>> 16 & 0xFF) * var5 + (var2 >>> 16 & 0xFF) * var6 + (var3 >>> 16 & 0xFF) * var7 + var11) / var10 << 16
         | ((var0 >>> 8 & 0xFF) * var4 + (var1 >>> 8 & 0xFF) * var5 + (var2 >>> 8 & 0xFF) * var6 + (var3 >>> 8 & 0xFF) * var7 + var11) / var10 << 8
         | ((var0 >>> 0 & 0xFF) * var4 + (var1 >>> 0 & 0xFF) * var5 + (var2 >>> 0 & 0xFF) * var6 + (var3 >>> 0 & 0xFF) * var7 + var11) / var10 << 0;
   }

   public static int Button(
      int var0, int var1, int var2, int var3
   ) {
      return ((var0 >>> 24 & 0xFF) + (var1 >>> 24 & 0xFF) + (var2 >>> 24 & 0xFF) + (var3 >>> 24 & 0xFF) + 2) / 4 << 24
         | ((var0 >>> 16 & 0xFF) + (var1 >>> 16 & 0xFF) + (var2 >>> 16 & 0xFF) + (var3 >>> 16 & 0xFF) + 2) / 4 << 16
         | ((var0 >>> 8 & 0xFF) + (var1 >>> 8 & 0xFF) + (var2 >>> 8 & 0xFF) + (var3 >>> 8 & 0xFF) + 2) / 4 << 8
         | ((var0 >>> 0 & 0xFF) + (var1 >>> 0 & 0xFF) + (var2 >>> 0 & 0xFF) + (var3 >>> 0 & 0xFF) + 2) / 4 << 0;
   }

   public static void BatModClient(
      int[] var0, int var1, int var2, int var3
   ) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;

      while (var5 > 1 && var6 > 1) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for (int var11 = 0; var11 < var9; var11++) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for (int var14 = 0; var14 < var8; var14++) {
               var0[var12 + var14] = BatModClient(
                  var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]
               );
            }
         }

         var10++;
         var5 = var8;
         var6 = var9;
         var4 = var7;
      }

      while (var10 > 0) {
         var5 = var2 >> --var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for (int var20 = 0; var20 < var6; var20++) {
            for (int var21 = 0; var21 < var5; var21++) {
               if (var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               var19++;
            }
         }

         var7 = var4;
         var8 = var5;
      }
   }

   public static void Button(
      int[] var0, int var1, int var2, int var3
   ) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;

      while (var5 > 1 && var6 > 1) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for (int var11 = 0; var11 < var9; var11++) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for (int var14 = 0; var14 < var8; var14++) {
               var0[var12 + var14] = Button(
                  var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]
               );
            }
         }

         var10++;
         var5 = var8;
         var6 = var9;
         var4 = var7;
      }

      while (var10 > 0) {
         var5 = var2 >> --var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for (int var20 = 0; var20 < var6; var20++) {
            for (int var21 = 0; var21 < var5; var21++) {
               if (var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               var19++;
            }
         }

         var7 = var4;
         var8 = var5;
      }
   }

   public static boolean BatModClient(int[] var0, int var1, int var2) {
      int var3 = var1 * var2;
      if (var0[0] >>> 24 == 255 && var0[var3 - 1] == 0) {
         return true;
      }

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var0[var4] >>> 24;
         if (var5 != 0 && var5 != 255) {
            return true;
         }
      }

      return false;
   }

   public static void BatModClient(
      int[] var0, int var1, int var2, int var3, int var4
   ) {
      int var5 = 0;
      int var6 = var1;
      int var7 = var2;
      int var8 = var3;

      for (int var9 = var4; var6 > 0 && var7 > 0; var9 /= 2) {
         GL11.glCopyTexSubImage2D(3553, var5, var8, var9, 0, 0, var6, var7);
         var5++;
         var6 /= 2;
         var7 /= 2;
         var8 /= 2;
      }
   }

   public static void BatModClient(
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var0,
      int[] var1,
      int var2,
      int var3,
      boolean var4,
      boolean var5
   ) {
      int var6 = var4 ? 9729 : 9728;
      int var7 = var5 ? 10496 : 10497;
      int var8 = var2 * var3;
      IntBuffer var9 = BatModClient(var8);
      ((Buffer)var9).clear();
      ((Buffer)var9.put(var1, 0, var8)).position(0).limit(var8);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.BatModClient
      );
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, 32993, 33639, var9);
      GL11.glTexParameteri(3553, 10241, var6);
      GL11.glTexParameteri(3553, 10240, var6);
      GL11.glTexParameteri(3553, 10242, var7);
      GL11.glTexParameteri(3553, 10243, var7);
      ((Buffer)var9.put(var1, var8, var8)).position(0).limit(var8);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.Button
      );
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, 32993, 33639, var9);
      GL11.glTexParameteri(3553, 10241, var6);
      GL11.glTexParameteri(3553, 10240, var6);
      GL11.glTexParameteri(3553, 10242, var7);
      GL11.glTexParameteri(3553, 10243, var7);
      ((Buffer)var9.put(var1, var8 * 2, var8)).position(0).limit(var8);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.CustomSpinner
      );
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, 32993, 33639, var9);
      GL11.glTexParameteri(3553, 10241, var6);
      GL11.glTexParameteri(3553, 10240, var6);
      GL11.glTexParameteri(3553, 10242, var7);
      GL11.glTexParameteri(3553, 10243, var7);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.BatModClient
      );
   }

   public static void BatModClient(
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var0,
      int[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      boolean var6,
      boolean var7
   ) {
      int var8 = var2 * var3;
      IntBuffer var9 = BatModClient(var8);
      ((Buffer)var9).clear();
      var9.put(var1, 0, var8);
      ((Buffer)var9).position(0).limit(var8);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.BatModClient
      );
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      if (var1.length == var8 * 3) {
         ((Buffer)var9).clear();
         ((Buffer)var9.put(var1, var8, var8)).position(0);
         ((Buffer)var9).position(0).limit(var8);
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.Button
      );
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      if (var1.length == var8 * 3) {
         ((Buffer)var9).clear();
         var9.put(var1, var8 * 2, var8);
         ((Buffer)var9).position(0).limit(var8);
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         var0.CustomSpinner
      );
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ProgressBar(
         33984
      );
   }

   public static p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var0, String var1
   ) {
      String var2 = var0.Button();
      String[] var3 = var2.split(".png");
      String var4 = var3[0];
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var0.CustomSpinner(), var4 + "_" + var1 + ".png"
      );
   }

   public static void BatModClient(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var0,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1,
      int var2,
      int var3,
      int[] var4
   ) {
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87
         )
       {
         BatModClient(
            var0,
            BatModClient(var1, "n"),
            var2,
            var3,
            var4,
            var2 * var3,
            -8421377
         );
      }

      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
         )
       {
         BatModClient(
            var0,
            BatModClient(var1, "s"),
            var2,
            var3,
            var4,
            var2 * var3 * 2,
            0
         );
      }
   }

   public static void BatModClient(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var0,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1,
      int var2,
      int var3,
      int[] var4,
      int var5,
      int var6
   ) {
      boolean var7 = false;

      try {
         DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m var8 = var0.BatModClient(
            var1
         );
         BufferedImage var9 = ImageIO.read(var8.Button());
         if (var9 != null && var9.getWidth() == var2 && var9.getHeight() == var3) {
            var9.getRGB(0, 0, var2, var3, var4, var5, var2);
            var7 = true;
         }
      } catch (IOException var10) {
      }

      if (!var7) {
         Arrays.fill(var4, var5, var5 + var2 * var3, var6);
      }
   }

   public static int BatModClient(
      int var0,
      BufferedImage var1,
      boolean var2,
      boolean var3,
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var4,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5,
      shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var6
   ) {
      int var7 = var1.getWidth();
      int var8 = var1.getHeight();
      int var9 = var7 * var8;
      int[] var10 = Button(var9 * 3);
      var1.getRGB(0, 0, var7, var8, var10, 0, var7);
      BatModClient(var4, var5, var7, var8, var10);
      BatModClient(var6, var10, var7, var8, var2, var3);
      return var0;
   }

   public static void CustomSpinner(
      int[] var0, int var1, int var2, int var3
   ) {
   }

   public static int Button(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      return ((var0 >>> 24 & 0xFF) * var2 + (var1 >>> 24 & 0xFF) * var3) / 255 << 24
         | ((var0 >>> 16 & 0xFF) * var2 + (var1 >>> 16 & 0xFF) * var3) / 255 << 16
         | ((var0 >>> 8 & 0xFF) * var2 + (var1 >>> 8 & 0xFF) * var3) / 255 << 8
         | ((var0 >>> 0 & 0xFF) * var2 + (var1 >>> 0 & 0xFF) * var3) / 255 << 0;
   }

   public static void BatModClient(
      mYhqYF0b653r1drnMbDMebEMn2H2JejufJlN9Vz5eklGKKSbJ7LQYvzznvdW6ei2f4G3paSP4p1YzoksCuXWrNIg5hFKeJfDIhi6 var0,
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var1,
      List var2
   ) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int[] var6 = null;

      for (Object var8 : var2) {
         if (var8 != null) {
            try {
               p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var9 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                  (String)var8
               );
               InputStream var10 = var1.BatModClient(var9)
                  .Button();
               BufferedImage var11 = ImageIO.read(var10);
               if (var5 == 0) {
                  var3 = var11.getWidth();
                  var4 = var11.getHeight();
                  var5 = var3 * var4;
                  var6 = Button(var5, 0);
               }

               int[] var12 = Button(var5 * 3);
               var11.getRGB(0, 0, var3, var4, var12, 0, var3);
               BatModClient(var1, var9, var3, var4, var12);

               for (int var13 = 0; var13 < var5; var13++) {
                  int var14 = var12[var13] >>> 24 & 0xFF;
                  var6[var5 * 0 + var13] = Button(
                     var12[var5 * 0 + var13], var6[var5 * 0 + var13], var14
                  );
                  var6[var5 * 1 + var13] = Button(
                     var12[var5 * 1 + var13], var6[var5 * 1 + var13], var14
                  );
                  var6[var5 * 2 + var13] = Button(
                     var12[var5 * 2 + var13], var6[var5 * 2 + var13], var14
                  );
               }
            } catch (IOException var15) {
               var15.printStackTrace();
            }
         }
      }

      BatModClient(
         var0.Checkbox(), var6, var3, var4, false, false
      );
   }

   static void Button() {
      falnvbnON9Yos1uc5Fb8Ya024Nj6kT8CIeZPcJ2aRWmnl3ydNppGk0tR5f0fVfO8Hx5dYDe9saJ4vN81axRqHk1dN0O0Np0uRlke var0 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt();
      sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc var1 = var0.Button(
         seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.Button
      );
      if (var1 != null) {
         shadersmod.client.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var2 = var1.Checkbox();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var2.BatModClient
         );
         GL11.glTexParameteri(
            3553,
            10241,
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.MykRe6qTpuK4jON2utrfM6s84uSojw5EnqRTkG0BoUd3ijtw5q6TCFcB51VRt26zQNVEf2GBgaQ67gOT7WMdbTbTLkZsLZpyfudM[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd]
         );
         GL11.glTexParameteri(
            3553,
            10240,
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.lnzPjQSErJQ4iahgz4RPvwCjSQw60dL384yvifbAEFLyFvKk2HAFMhMT3ZEmtWJQTHJIhG5hUr59C5xnyML45Iuozv3fvU0ZCxIZ[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.kwTceg0Lmk5JOtoX6vCsrlwiEUv9uulgwvySV4b7AkyFej7hggXLV46koFdtzItzq3zxZAbUHqk2OtOxeQXyLygkTQHysD0WhqHJ]
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var2.Button
         );
         GL11.glTexParameteri(
            3553,
            10241,
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.MykRe6qTpuK4jON2utrfM6s84uSojw5EnqRTkG0BoUd3ijtw5q6TCFcB51VRt26zQNVEf2GBgaQ67gOT7WMdbTbTLkZsLZpyfudM[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh]
         );
         GL11.glTexParameteri(
            3553,
            10240,
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.lnzPjQSErJQ4iahgz4RPvwCjSQw60dL384yvifbAEFLyFvKk2HAFMhMT3ZEmtWJQTHJIhG5hUr59C5xnyML45Iuozv3fvU0ZCxIZ[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh]
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            var2.CustomSpinner
         );
         GL11.glTexParameteri(
            3553,
            10241,
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.MykRe6qTpuK4jON2utrfM6s84uSojw5EnqRTkG0BoUd3ijtw5q6TCFcB51VRt26zQNVEf2GBgaQ67gOT7WMdbTbTLkZsLZpyfudM[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1]
         );
         GL11.glTexParameteri(
            3553,
            10240,
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.lnzPjQSErJQ4iahgz4RPvwCjSQw60dL384yvifbAEFLyFvKk2HAFMhMT3ZEmtWJQTHJIhG5hUr59C5xnyML45Iuozv3fvU0ZCxIZ[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn]
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            0
         );
      }
   }

   public static DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m BatModClient(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var0,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = var0;
      G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = var1;
      return var0.BatModClient(var1);
   }

   public static int[] BatModClient(
      BufferedImage var0, int var1, int var2, int var3, int var4, int[] var5, int var6, int var7
   ) {
      iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = var3 * var4;
      var0.getRGB(var1, var2, var3, var4, var5, var6, var7);
      BatModClient(
         LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN,
         G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
         var3,
         var4,
         var5
      );
      return var5;
   }

   public static int[][] BatModClient(
      int[][] var0, int var1, int var2, int var3
   ) {
      int var4 = var0.length;
      int[][] var5 = new int[var4][];

      for (int var6 = 0; var6 < var4; var6++) {
         int[] var7 = var0[var6];
         if (var7 != null) {
            int var8 = (var1 >> var6) * (var2 >> var6);
            int[] var9 = new int[var8 * 3];
            var5[var6] = var9;
            int var10 = var7.length / 3;
            int var11 = var8 * var3;
            int var12 = 0;
            System.arraycopy(var7, var11, var9, var12, var8);
            var11 += var10;
            var12 += var8;
            System.arraycopy(var7, var11, var9, var12, var8);
            var11 += var10;
            var12 += var8;
            System.arraycopy(var7, var11, var9, var12, var8);
         }
      }

      return var5;
   }

   public static int[][] BatModClient(
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var0, int[][] var1, int var2, int var3
   ) {
      boolean var4 = true;
      return var1;
   }

   public static void BatModClient(
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var0, int[] var1
   ) {
   }
}
