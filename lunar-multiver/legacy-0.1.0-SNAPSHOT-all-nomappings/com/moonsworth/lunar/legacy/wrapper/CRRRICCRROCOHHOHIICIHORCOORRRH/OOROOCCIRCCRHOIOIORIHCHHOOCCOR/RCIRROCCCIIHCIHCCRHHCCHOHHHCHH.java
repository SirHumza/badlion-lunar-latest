package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import lombok.Generated;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Framebuffer {
   private int OCCHCIOOOORCOIOORCORIIOCRHRHCC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3) {
      super(var1, var2, true);
      this.OCCHCIOOOORCOIOORCORIIOCRHRHCC = var3;
      this.createBindFramebuffer(var1, var2);
   }

   public void createFramebuffer(int var1, int var2) {
      if (this.OCCHCIOOOORCOIOORCORIIOCRHRHCC <= 0) {
         this.OCCHCIOOOORCOIOORCORIIOCRHRHCC = TextureUtil.glGenTextures();
      }

      this.framebufferWidth = var1;
      this.framebufferHeight = var2;
      this.framebufferTextureWidth = var1;
      this.framebufferTextureHeight = var2;
      if (!OpenGlHelper.isFramebufferEnabled()) {
         this.framebufferClear();
      } else {
         this.framebufferTexture = TextureUtil.glGenTextures();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            this.framebufferObject = OpenGlHelper.func_153165_e$v1_7();
            OpenGlHelper.func_153171_g$v1_7(OpenGlHelper.GL_FRAMEBUFFER, this.framebufferObject);
            GL11.glBindTexture(3553, this.framebufferTexture);
         } else {
            this.framebufferObject = OpenGlHelper.glGenFramebuffers$v1_8();
            OpenGlHelper.glBindFramebuffer$v1_8(OpenGlHelper.GL_FRAMEBUFFER, this.framebufferObject);
            GlStateManager.bindTexture(this.framebufferTexture);
         }

         GL11.glTexImage2D(3553, 0, 32856, this.framebufferTextureWidth, this.framebufferTextureHeight, 0, 6408, 5121, (IntBuffer)null);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            OpenGlHelper.func_153188_a$v1_7(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, 3553, this.framebufferTexture, 0);
         } else {
            OpenGlHelper.glFramebufferTexture2D$v1_8(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, 3553, this.framebufferTexture, 0);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            GL11.glBindTexture(3553, this.OCCHCIOOOORCOIOORCORIIOCRHRHCC);
         } else {
            GlStateManager.bindTexture(this.OCCHCIOOOORCOIOORCORIIOCRHRHCC);
         }

         GL11.glTexImage2D(3553, 0, 33190, this.framebufferTextureWidth, this.framebufferTextureHeight, 0, 6402, 5125, (ByteBuffer)null);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexParameteri(3553, 34892, 0);
         GL11.glTexParameteri(3553, 34891, 32841);
         GL11.glTexParameterf(3553, 34893, 515.0F);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            OpenGlHelper.func_153188_a$v1_7(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, 3553, this.OCCHCIOOOORCOIOORCORIIOCRHRHCC, 0);
         } else {
            OpenGlHelper.glFramebufferTexture2D$v1_8(
               OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, 3553, this.OCCHCIOOOORCOIOORCORIIOCRHRHCC, 0
            );
         }

         GL11.glDrawBuffer(OpenGlHelper.GL_COLOR_ATTACHMENT0);
         GL11.glReadBuffer(OpenGlHelper.GL_COLOR_ATTACHMENT0);
         this.framebufferClear();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            OpenGlHelper.func_153171_g$v1_7(OpenGlHelper.GL_FRAMEBUFFER, 0);
            GL11.glBindTexture(3553, 0);
         } else {
            OpenGlHelper.glBindFramebuffer$v1_8(OpenGlHelper.GL_FRAMEBUFFER, 0);
            GlStateManager.bindTexture(0);
         }
      }
   }

   public void deleteFramebuffer() {
      super.deleteFramebuffer();
      if (this.OCCHCIOOOORCOIOORCORIIOCRHRHCC > 0) {
         TextureUtil.deleteTexture(this.OCCHCIOOOORCOIOORCORIIOCRHRHCC);
         this.OCCHCIOOOORCOIOORCORIIOCRHRHCC = 0;
      }
   }

   public void framebufferClear() {
      this.bindFramebuffer(true);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         GL11.glClearColor(this.framebufferColor[0], this.framebufferColor[1], this.framebufferColor[2], this.framebufferColor[3]);
      } else {
         GlStateManager.clearColor(this.framebufferColor[0], this.framebufferColor[1], this.framebufferColor[2], this.framebufferColor[3]);
      }

      short var1 = 16384;
      if (this.OCCHCIOOOORCOIOORCORIIOCRHRHCC > 0) {
         GL11.glClearDepth(1.0);
         var1 |= 256;
      }

      GL11.glClear(var1);
      this.unbindFramebuffer();
   }

   public void createBindFramebuffer(int var1, int var2) {
      if (this.OCCHCIOOOORCOIOORCORIIOCRHRHCC > 0) {
         super.createBindFramebuffer(var1, var2);
      }
   }

   @Generated
   public int ORRRHOOHCCCCCICRHIHHOIHOIOCHOR() {
      return this.OCCHCIOOOORCOIOORCORIIOCRHRHCC;
   }
}
