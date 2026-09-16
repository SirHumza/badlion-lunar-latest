package net.optifine.render;

import org.lwjgl.opengl.GL11;

public class CloudRenderer {
   private ave mc;
   private boolean updated = false;
   private boolean renderFancy = false;
   int cloudTickCounter;
   private aui cloudColor;
   float partialTicks;
   private boolean updateRenderFancy = false;
   private int updateCloudTickCounter = 0;
   private aui updateCloudColor = new aui(-1.0, -1.0, -1.0);
   private double updatePlayerX = 0.0;
   private double updatePlayerY = 0.0;
   private double updatePlayerZ = 0.0;
   private int glListClouds = -1;

   public CloudRenderer(ave mc) {
      this.mc = mc;
      this.glListClouds = avd.a(1);
   }

   public void prepareToRender(boolean renderFancy, int cloudTickCounter, float partialTicks, aui cloudColor) {
      this.renderFancy = renderFancy;
      this.cloudTickCounter = cloudTickCounter;
      this.partialTicks = partialTicks;
      this.cloudColor = cloudColor;
   }

   public boolean shouldUpdateGlList() {
      if (!this.updated) {
         return true;
      }

      if (this.renderFancy != this.updateRenderFancy) {
         return true;
      }

      if (this.cloudTickCounter >= this.updateCloudTickCounter + 20) {
         return true;
      }

      if (Math.abs(this.cloudColor.a - this.updateCloudColor.a) > 0.003) {
         return true;
      }

      if (Math.abs(this.cloudColor.b - this.updateCloudColor.b) > 0.003) {
         return true;
      }

      if (Math.abs(this.cloudColor.c - this.updateCloudColor.c) > 0.003) {
         return true;
      }

      pk rve = this.mc.ac();
      boolean belowCloudsPrev = this.updatePlayerY + rve.aS() < 128.0 + this.mc.t.ofCloudsHeight * 128.0F;
      boolean belowClouds = rve.q + rve.aS() < 128.0 + this.mc.t.ofCloudsHeight * 128.0F;
      return belowClouds != belowCloudsPrev;
   }

   public void startUpdateGlList() {
      GL11.glNewList(this.glListClouds, 4864);
   }

   public void endUpdateGlList() {
      GL11.glEndList();
      this.updateRenderFancy = this.renderFancy;
      this.updateCloudTickCounter = this.cloudTickCounter;
      this.updateCloudColor = this.cloudColor;
      this.updatePlayerX = this.mc.ac().p;
      this.updatePlayerY = this.mc.ac().q;
      this.updatePlayerZ = this.mc.ac().r;
      this.updated = true;
      bfl.G();
   }

   public void renderGlList() {
      pk entityliving = this.mc.ac();
      double exactPlayerX = entityliving.p + (entityliving.s - entityliving.p) * this.partialTicks;
      double exactPlayerY = entityliving.q + (entityliving.t - entityliving.q) * this.partialTicks;
      double exactPlayerZ = entityliving.r + (entityliving.u - entityliving.r) * this.partialTicks;
      double dc = this.cloudTickCounter - this.updateCloudTickCounter + this.partialTicks;
      float cdx = (float)(exactPlayerX - this.updatePlayerX + dc * 0.03);
      float cdy = (float)(exactPlayerY - this.updatePlayerY);
      float cdz = (float)(exactPlayerZ - this.updatePlayerZ);
      bfl.E();
      if (this.renderFancy) {
         bfl.b(-cdx / 12.0F, -cdy, -cdz / 12.0F);
      } else {
         bfl.b(-cdx, -cdy, -cdz);
      }

      bfl.o(this.glListClouds);
      bfl.F();
      bfl.G();
   }

   public void reset() {
      this.updated = false;
   }
}
