import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class iFpRhss1SKelpbPBwznCf8QCK9GXR2ceZYToC5SwlCA1FQ4CfACOb8GcK6UXh9imMtGgBGkOmKG9zhSMadfOj8hw9HZRmVKf8Qs1 {
   private static final Logger BatModClient = LogManager.getLogger();
   private static final DateFormat Button = new SimpleDateFormat(
      "yyyy-MM-dd_HH.mm.ss"
   );
   private static IntBuffer CustomSpinner;
   private static int[] ButtonAction;

   public static WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY BatModClient(
      File var0, int var1, int var2, APCKnku8IKcywFvxNIRdlcHeXrfvE2KtW0ZVyADnx7KP5vrbyvp7LqGhEDr6uRUeKT8fzPNNzFUcKHk2wOIBCjyugCRylHYOGOHH var3
   ) {
      return BatModClient(var0, (String)null, var1, var2, var3);
   }

   public static WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY BatModClient(
      File var0, String var1, int var2, int var3, APCKnku8IKcywFvxNIRdlcHeXrfvE2KtW0ZVyADnx7KP5vrbyvp7LqGhEDr6uRUeKT8fzPNNzFUcKHk2wOIBCjyugCRylHYOGOHH var4
   ) {
      try {
         File var5 = new File(var0, "screenshots");
         var5.mkdir();
         File var6 = Button(var0, var1, var2, var3, var4);
         var6.renameTo(new File(var0, "screenshots"));
         E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl var7 = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
            "§b" + var6.getName()
         );
         var7.ProgressBar()
            .BatModClient(
               new sUvC6DSRzZAj19jnp0h772A60sCsZu1kbHJggxsCGGAr6DYaaHfPeSAFxrHmHIDcnU8urP7QoFZS0ZevVFIoxIQODtv2OpKPD14(
                  it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX.Button,
                  var6.getCanonicalPath()
               )
            );
         var7.ProgressBar()
            .ButtonAction(true);
         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var8 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "screenshot.success", var7
         );
         var8.ProgressBar()
            .BatModClient(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
            );
         return var8;
      } catch (Exception var9) {
         BatModClient.warn("Couldn't save screenshot", var9);
         return new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "screenshot.failure", var9.getMessage()
         );
      }
   }

   public static File Button(
      File var0, String var1, int var2, int var3, APCKnku8IKcywFvxNIRdlcHeXrfvE2KtW0ZVyADnx7KP5vrbyvp7LqGhEDr6uRUeKT8fzPNNzFUcKHk2wOIBCjyugCRylHYOGOHH var4
   ) {
      try {
         File var5 = new File(var0, "screenshots");
         var5.mkdir();
         if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorChooser()
            )
          {
            var2 = var4.BatModClient;
            var3 = var4.Button;
         }

         int var6 = var2 * var3;
         if (CustomSpinner == null
            || CustomSpinner.capacity() < var6) {
            CustomSpinner = BufferUtils.createIntBuffer(var6);
            ButtonAction = new int[var6];
         }

         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
         ((Buffer)CustomSpinner).clear();
         if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorChooser()
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
               var4.ProgressBar
            );
            GL11.glGetTexImage(3553, 0, 32993, 33639, CustomSpinner);
         } else {
            GL11.glReadPixels(
               0, 0, var2, var3, 32993, 33639, CustomSpinner
            );
         }

         CustomSpinner.get(
            ButtonAction
         );
         oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
            ButtonAction, var2, var3
         );
         BufferedImage var7 = null;
         if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorChooser()
            )
          {
            var7 = new BufferedImage(
               var4.CustomSpinner,
               var4.ButtonAction,
               1
            );
            int var8 = var4.Button
               - var4.ButtonAction;

            for (int var9 = var8; var9 < var4.Button; var9++) {
               for (int var10 = 0; var10 < var4.CustomSpinner; var10++) {
                  var7.setRGB(
                     var10,
                     var9 - var8,
                     ButtonAction[var9
                           * var4.BatModClient
                        + var10]
                  );
               }
            }
         } else {
            var7 = new BufferedImage(var2, var3, 1);
            var7.setRGB(0, 0, var2, var3, ButtonAction, 0, var2);
         }

         File var13;
         if (var1 == null) {
            var13 = BatModClient(var5);
         } else {
            var13 = new File(var5, var1);
         }

         ImageIO.write(var7, "png", var13);
         return var13;
      } catch (Exception var11) {
         BatModClient.warn("Couldn't save screenshot", var11);
         return null;
      }
   }

   private static File BatModClient(File var0) {
      String var1 = Button.format(new Date()).toString();
      int var2 = 1;

      while (true) {
         File var3 = new File(var0, var1 + (var2 == 1 ? "" : "_" + var2) + ".png");
         if (!var3.exists()) {
            return var3;
         }

         var2++;
      }
   }
}
