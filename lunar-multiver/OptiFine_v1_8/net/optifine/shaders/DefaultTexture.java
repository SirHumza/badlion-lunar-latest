package net.optifine.shaders;

public class DefaultTexture extends bly {
   public DefaultTexture() {
      this.a(null);
   }

   public void a(bni resourcemanager) {
      int[] aint = ShadersTex.createAIntImage(1, -1);
      ShadersTex.setupTexture(this.getMultiTexID(), aint, 1, 1, false, false);
   }
}
