package com.batmod.installer.utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

public class Spinner {
   public static BufferedImage Logger(String var0) {
      URL var1 = Spinner.class.getClassLoader().getResource(var0);
      if (var1 == null) {
         throw new NullPointerException("Resource not found or missing permission");
      } else {
         return ImageIO.read(var1);
      }
   }

   public static BufferedImage Logger(
      BufferedImage var0, int var1, int var2
   ) {
      Image var3 = var0.getScaledInstance(var1, var2, 4);
      BufferedImage var4 = new BufferedImage(var1, var2, 2);
      Graphics2D var5 = var4.createGraphics();
      var5.drawImage(var3, 0, 0, null);
      var5.dispose();
      return var4;
   }
}
