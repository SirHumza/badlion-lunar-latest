package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(AbstractTexture.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRRCCOICORICIHCHRHIHIHROIRHOCR {
   @Shadow
   public int getGlTextureId() {
      throw new AssertionError();
   }

   @Shadow
   public abstract void setBlurMipmap$v1_8(boolean var1, boolean var2);

   public void bridge$allocate(
      boolean var1,
      boolean var2,
      int var3,
      int var4,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
      boolean var6,
      boolean var7
   ) {
      if (var5
         != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RGBA8
         )
       {
         throw new UnsupportedOperationException("Added support for more diverse texture formats");
      }

      TextureUtil.bindTexture(this.getGlTextureId());
      GL11.glTexImage2D(3553, 0, 32856, var3, var4, 0, 6408, 5121, (ByteBuffer)null);
      this.bridge$setFilter(var1, var2);
   }

   public void bridge$upload(int var1, int var2, int var3, int var4, int[] var5) {
      ByteBuffer var6 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HCIIROHROIOOHIIOOHCIHHIRCCCHRH(var5.length * 4);
      var6.asIntBuffer().put(var5);
      var6.limit(var5.length * 4);
      this.lunar$upload(var1, var2, var3, var4, var6, 6408, 0, 0, var3 * 4);
   }

   public void bridge$uploadBgra(int var1, int var2, int var3, int var4, ByteBuffer var5, int var6, int var7, int var8) {
      this.lunar$upload(var1, var2, var3, var4, var5.duplicate(), 32993, var6, var7, var8);
   }

   @Unique
   private void lunar$upload(int var1, int var2, int var3, int var4, ByteBuffer var5, int var6, int var7, int var8, int var9) {
      int var10 = GL11.glGetInteger(32873);
      int var11 = GL11.glGetInteger(3315);
      int var12 = GL11.glGetInteger(3316);
      int var13 = GL11.glGetInteger(3314);
      int var14 = GL11.glGetInteger(3317);

      try {
         GL11.glPixelStorei(3315, var8);
         GL11.glPixelStorei(3316, var7);
         GL11.glPixelStorei(3314, var9 / 4);
         GL11.glPixelStorei(3317, 4);
         TextureUtil.bindTexture(this.getGlTextureId());
         GL11.glTexSubImage2D(3553, 0, var1, var2, var3, var4, var6, 5121, var5);
      } finally {
         GL11.glPixelStorei(3315, var11);
         GL11.glPixelStorei(3316, var12);
         GL11.glPixelStorei(3314, var13);
         GL11.glPixelStorei(3317, var14);
         TextureUtil.bindTexture(var10);
      }
   }

   public void bridge$setFilter(boolean var1, boolean var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         TextureUtil.bindTexture(this.getGlTextureId());
         this.setBlurMipmap$v1_8(var1, var2);
      } else {
         GL11.glBindTexture(3553, this.getGlTextureId());
         int var3;
         short var4;
         if (var1) {
            var3 = var2 ? 9987 : 9729;
            var4 = 9729;
         } else {
            var3 = var2 ? 9986 : 9728;
            var4 = 9728;
         }

         GL11.glTexParameteri(3553, 10241, var3);
         GL11.glTexParameteri(3553, 10240, var4);
      }
   }
}
