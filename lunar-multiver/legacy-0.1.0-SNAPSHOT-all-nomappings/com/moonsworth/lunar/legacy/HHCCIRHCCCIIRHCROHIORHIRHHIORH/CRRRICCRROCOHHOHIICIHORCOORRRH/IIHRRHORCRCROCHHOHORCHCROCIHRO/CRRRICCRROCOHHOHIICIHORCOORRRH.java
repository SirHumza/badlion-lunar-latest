package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Shader.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH,
   com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public ShaderManager manager;

   @Shadow
   public abstract ShaderManager getShaderManager();

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH bridge$getShaderUniforms() {
      return (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.getShaderManager();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "loadShader", at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glColorMask (ZZZZ)V"))
   private void lunar$writeAlpha(boolean var1, boolean var2, boolean var3, boolean var4) {
      GL11.glColorMask(true, true, true, true);
   }

   @Override
   public void lunar$setupState() {
      OpenGlHelper.glUseProgram(this.manager.program);
      ShaderManager.currentProgram = this.manager.program;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         for (int var1 = 0; var1 < this.manager.shaderSamplerLocations$v1_8.size(); var1++) {
            if (this.manager.shaderSamplers$v1_8.get(this.manager.samplerNames$v1_8.get(var1)) != null) {
               int var2 = com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHCCORHIOOICOHHOOROOIHICHCRIIH(
                  var1
               );
               GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit + var2);
               GlStateManager.enableTexture2D();
               Object var3 = this.manager.shaderSamplers$v1_8.get(this.manager.samplerNames$v1_8.get(var1));
               int var4 = -1;
               if (var3 instanceof Framebuffer) {
                  var4 = ((Framebuffer)var3).framebufferTexture;
               } else if (var3 instanceof ITextureObject) {
                  var4 = ((ITextureObject)var3).getGlTextureId();
               } else if (var3 instanceof Integer) {
                  var4 = (Integer)var3;
               }

               if (var4 != -1) {
                  GlStateManager.bindTexture(var4);
                  OpenGlHelper.glUniform1i((Integer)this.manager.shaderSamplerLocations$v1_8.get(var1), var2);
               }
            }
         }

         for (ShaderUniform var8 : this.manager.shaderUniforms$v1_8) {
            var8.upload();
         }
      } else {
         for (int var6 = 0; var6 < this.manager.shaderSamplerLocations$v1_7.size(); var6++) {
            if (this.manager.shaderSamplers$v1_7.get(this.manager.samplerNames$v1_7.get(var6)) != null) {
               int var9 = com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHCCORHIOOICOHHOOROOIHICHCRIIH(
                  var6
               );
               GL13.glActiveTexture(33984 + var9);
               GL11.glEnable(3553);
               Object var11 = this.manager.shaderSamplers$v1_7.get(this.manager.samplerNames$v1_7.get(var6));
               int var12 = -1;
               if (var11 instanceof Framebuffer) {
                  var12 = ((Framebuffer)var11).framebufferTexture;
               } else if (var11 instanceof ITextureObject) {
                  var12 = ((ITextureObject)var11).getGlTextureId();
               } else if (var11 instanceof Integer) {
                  var12 = (Integer)var11;
               }

               if (var12 != -1) {
                  GL11.glBindTexture(3553, var12);
                  OpenGlHelper.glUniform1i((Integer)this.manager.shaderSamplerLocations$v1_7.get(var6), var9);
               }
            }
         }

         for (Object var10 : this.manager.shaderUniforms$v1_7) {
            ((ShaderUniform)var10).upload();
         }
      }
   }

   @Override
   public void lunar$clearState() {
      OpenGlHelper.glUseProgram(0);
      ShaderManager.currentProgram = -1;
   }
}
