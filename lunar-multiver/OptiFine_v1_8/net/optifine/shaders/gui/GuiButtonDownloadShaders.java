package net.optifine.shaders.gui;

public class GuiButtonDownloadShaders extends avs {
   public GuiButtonDownloadShaders(int buttonID, int xPos, int yPos) {
      super(buttonID, xPos, yPos, 22, 20, "");
   }

   public void a(ave mc, int mouseX, int mouseY) {
      if (this.m) {
         super.a(mc, mouseX, mouseY);
         jy locTexture = new jy("optifine/textures/icons.png");
         mc.P().a(locTexture);
         bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.h + 3, this.i + 2, 0, 0, 16, 16);
      }
   }
}
