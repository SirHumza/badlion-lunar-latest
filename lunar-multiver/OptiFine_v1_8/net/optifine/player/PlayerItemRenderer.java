package net.optifine.player;

public class PlayerItemRenderer {
   private int attachTo = 0;
   private bct modelRenderer = null;

   public PlayerItemRenderer(int attachTo, bct modelRenderer) {
      this.attachTo = attachTo;
      this.modelRenderer = modelRenderer;
   }

   public bct getModelRenderer() {
      return this.modelRenderer;
   }

   public void render(bbj modelBiped, float scale) {
      bct attachModel = PlayerItemModel.getAttachModel(modelBiped, this.attachTo);
      if (attachModel != null) {
         attachModel.c(scale);
      }

      this.modelRenderer.a(scale);
   }
}
