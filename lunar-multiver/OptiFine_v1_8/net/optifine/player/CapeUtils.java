package net.optifine.player;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.regex.Pattern;

public class CapeUtils {
   private static final Pattern PATTERN_USERNAME = Pattern.compile("[a-zA-Z0-9_]+");

   public static void downloadCape(bet player) {
      String username = player.getNameClear();
      if (username != null && !username.isEmpty() && !username.contains("\u0000") && PATTERN_USERNAME.matcher(username).matches()) {
         String ofCapeUrl = "http://s.optifine.net/capes/" + username + ".png";
         jy rl = new jy("capeof/" + username);
         bmj textureManager = ave.A().P();
         bmk tex = textureManager.b(rl);
         if (tex != null && tex instanceof bma) {
            bma tdid = (bma)tex;
            if (tdid.imageFound != null) {
               if (tdid.imageFound) {
                  player.setLocationOfCape(rl);
                  if (tdid.getImageBuffer() instanceof CapeImageBuffer) {
                     CapeImageBuffer cib = (CapeImageBuffer)tdid.getImageBuffer();
                     player.setElytraOfCape(cib.isElytraOfCape());
                  }
               }

               return;
            }
         }

         CapeImageBuffer cib = new CapeImageBuffer(player, rl);
         bma textureCape = new bma(null, ofCapeUrl, null, cib);
         textureCape.pipeline = true;
         textureManager.a(rl, textureCape);
      }
   }

   public static BufferedImage parseCape(BufferedImage img) {
      int imageWidth = 64;
      int imageHeight = 32;
      BufferedImage srcImg = img;
      int srcWidth = srcImg.getWidth();

      for (int srcHeight = srcImg.getHeight(); imageWidth < srcWidth || imageHeight < srcHeight; imageHeight *= 2) {
         imageWidth *= 2;
      }

      BufferedImage imgNew = new BufferedImage(imageWidth, imageHeight, 2);
      Graphics g = imgNew.getGraphics();
      g.drawImage(img, 0, 0, (ImageObserver)null);
      g.dispose();
      return imgNew;
   }

   public static boolean isElytraCape(BufferedImage imageRaw, BufferedImage imageFixed) {
      return imageRaw.getWidth() > imageFixed.getHeight();
   }

   public static void reloadCape(bet player) {
      String nameClear = player.getNameClear();
      jy rl = new jy("capeof/" + nameClear);
      bmj textureManager = Config.getTextureManager();
      bmk tex = textureManager.b(rl);
      if (tex instanceof bme) {
         bme simpleTex = (bme)tex;
         simpleTex.c();
         textureManager.c(rl);
      }

      player.setLocationOfCape(null);
      player.setElytraOfCape(false);
      downloadCape(player);
   }
}
