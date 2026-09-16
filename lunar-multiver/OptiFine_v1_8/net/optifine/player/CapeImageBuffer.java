package net.optifine.player;

import java.awt.image.BufferedImage;

public class CapeImageBuffer extends bfs {
   private bet player;
   private jy resourceLocation;
   private boolean elytraOfCape;

   public CapeImageBuffer(bet player, jy resourceLocation) {
      this.player = player;
      this.resourceLocation = resourceLocation;
   }

   public BufferedImage a(BufferedImage imageRaw) {
      BufferedImage image = CapeUtils.parseCape(imageRaw);
      this.elytraOfCape = CapeUtils.isElytraCape(imageRaw, image);
      return image;
   }

   public void a() {
      if (this.player != null) {
         this.player.setLocationOfCape(this.resourceLocation);
         this.player.setElytraOfCape(this.elytraOfCape);
      }

      this.cleanup();
   }

   public void cleanup() {
      this.player = null;
   }

   public boolean isElytraOfCape() {
      return this.elytraOfCape;
   }
}
