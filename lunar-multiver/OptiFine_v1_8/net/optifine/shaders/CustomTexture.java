package net.optifine.shaders;

public class CustomTexture implements ICustomTexture {
   private int textureUnit = -1;
   private String path = null;
   private bmk texture = null;

   public CustomTexture(int textureUnit, String path, bmk texture) {
      this.textureUnit = textureUnit;
      this.path = path;
      this.texture = texture;
   }

   @Override
   public int getTextureUnit() {
      return this.textureUnit;
   }

   public String getPath() {
      return this.path;
   }

   public bmk getTexture() {
      return this.texture;
   }

   @Override
   public int getTextureId() {
      return this.texture.b();
   }

   @Override
   public void deleteTexture() {
      bml.a(this.texture.b());
   }

   @Override
   public int getTarget() {
      return 3553;
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.textureUnit + ", path: " + this.path + ", glTextureId: " + this.getTextureId();
   }
}
