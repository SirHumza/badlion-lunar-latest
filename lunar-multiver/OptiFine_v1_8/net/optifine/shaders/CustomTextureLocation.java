package net.optifine.shaders;

public class CustomTextureLocation implements ICustomTexture {
   private int textureUnit = -1;
   private jy location;
   private int variant = 0;
   private bmk texture;
   public static final int VARIANT_BASE = 0;
   public static final int VARIANT_NORMAL = 1;
   public static final int VARIANT_SPECULAR = 2;

   public CustomTextureLocation(int textureUnit, jy location, int variant) {
      this.textureUnit = textureUnit;
      this.location = location;
      this.variant = variant;
   }

   public bmk getTexture() {
      if (this.texture == null) {
         bmj textureManager = ave.A().P();
         this.texture = textureManager.b(this.location);
         if (this.texture == null) {
            this.texture = new bme(this.location);
            textureManager.a(this.location, this.texture);
            this.texture = textureManager.b(this.location);
         }
      }

      return this.texture;
   }

   @Override
   public int getTextureId() {
      bmk tex = this.getTexture();
      if (this.variant != 0 && tex instanceof bly) {
         bly at = (bly)tex;
         MultiTexID mtid = at.multiTex;
         if (mtid != null) {
            if (this.variant == 1) {
               return mtid.norm;
            }

            if (this.variant == 2) {
               return mtid.spec;
            }
         }
      }

      return tex.b();
   }

   @Override
   public int getTextureUnit() {
      return this.textureUnit;
   }

   @Override
   public void deleteTexture() {
   }

   @Override
   public int getTarget() {
      return 3553;
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.textureUnit + ", location: " + this.location + ", glTextureId: " + (this.texture != null ? this.texture.b() : "");
   }
}
