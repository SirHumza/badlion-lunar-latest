package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.MapItemRenderer;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public Minecraft mc;
   @Final
   @Shadow
   public IResourceManager resourceManager;
   @Shadow
   public ShaderGroup shaderGroup;
   @Final
   @Shadow
   public MapItemRenderer mapItemRenderer;
   @Shadow
   public ItemStack itemActivationItem$v1_12;
   @Shadow
   public int itemActivationTicks$v1_12;
   @Shadow
   public float itemActivationOffX$v1_12;
   @Shadow
   public float itemActivationOffY$v1_12;
   @Unique
   private int lunar$renderTargetsWidth;
   @Unique
   private int lunar$renderTargetsHeight;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void loadShader$v1_8(ResourceLocation var1);

   @Shadow
   public abstract boolean isShaderActive();

   @Shadow
   public abstract ShaderGroup getShaderGroup();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void stopUseShader$v1_8();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public abstract void deactivateShader$v1_7();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public abstract void enableLightmap$v1_7(double var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public abstract void disableLightmap$v1_7(double var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void enableLightmap$v1_8();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void disableLightmap$v1_8();

   @Shadow
   public abstract void updateShaderGroupSize(int var1, int var2);

   public void bridge$loadPostEffectShader(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2, RCIROOOOICRHCCRRCIORHHIRCOIIIC var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (ShaderLinkHelper.getStaticShaderLinkHelper() != null) {
            if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().IHOCROCOHHORCOIHOCIOICCHOHRRRH()) {
               this.loadShader$v1_8((ResourceLocation)var2);
               return;
            }

            this.loadShader$v1_8((ResourceLocation)var1);
         }
      } else if (OpenGlHelper.isFramebufferEnabled() && OpenGlHelper.shadersSupported) {
         if (this.shaderGroup != null) {
            this.shaderGroup.deleteShaderGroup();
         }

         try {
            if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().IHOCROCOHHORCOIHOCIOICCHOHRRRH()) {
               this.shaderGroup = new ShaderGroup(this.mc.getTextureManager(), this.resourceManager, this.mc.getFramebuffer(), (ResourceLocation)var2);
            } else {
               this.shaderGroup = new ShaderGroup(this.mc.getTextureManager(), this.resourceManager, this.mc.getFramebuffer(), (ResourceLocation)var1);
            }

            if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
               this.shaderGroup.createBindFramebuffers(this.mc.displayWidth, this.mc.displayHeight);
            } else {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                  .HOROHROIORRIRIIIOOCCIROCRCROHI();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = var4.HIHCRRIHRIROROCRICHHORIOCRCOCO()
                  .HHRRRORIICOCHCOOOORHHOOHHIOHHI()
                  .HOIHRCIOCIHORHIRHCOHRHHCCHOOOR();
               this.shaderGroup.createBindFramebuffers(var5.bridge$framebufferTextureWidth(), var5.bridge$framebufferTextureHeight());
            }
         } catch (Exception var6) {
         }
      }
   }

   public boolean bridge$isShaderActive() {
      return this.isShaderActive();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getShaderGroup() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.getShaderGroup();
   }

   public void bridge$stopUseShader() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.stopUseShader$v1_8();
      } else {
         this.deactivateShader$v1_7();
      }
   }

   public void bridge$enableLightmap() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.enableLightmap$v1_8();
      } else {
         this.enableLightmap$v1_7(0.0);
      }
   }

   public void bridge$disableLightmap() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.disableLightmap$v1_8();
      } else {
         this.disableLightmap$v1_7(0.0);
      }
   }

   public ICICIOCHHHIHOCHCOHORIHRCOHHOCR bridge$getMapItemRenderer() {
      return (ICICIOCHHHIHOCHCOHORIHRCOHHOCR)this.mapItemRenderer;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Nullable
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getItemActivationItem() {
      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.itemActivationItem$v1_12;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public int bridge$getItemActivationTicks() {
      return this.itemActivationTicks$v1_12;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public float bridge$getItemActivationOffsetX() {
      return this.itemActivationOffX$v1_12;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public float bridge$getItemActivationOffsetY() {
      return this.itemActivationOffY$v1_12;
   }

   public void bridge$resize(int var1, int var2) {
      this.updateShaderGroupSize(var1, var2);
   }

   @Inject(method = "updateShaderGroupSize", at = @At("HEAD"))
   private void lunar$setRenderTargetsSize(int var1, int var2, CallbackInfo var3) {
      this.lunar$renderTargetsWidth = var1;
      this.lunar$renderTargetsHeight = var2;
   }

   public int bridge$getRenderTargetsWidth() {
      return this.lunar$renderTargetsWidth;
   }

   public int bridge$getRenderTargetsHeight() {
      return this.lunar$renderTargetsHeight;
   }

   public void bridge$setRenderTargetsWidth(int var1) {
      this.lunar$renderTargetsWidth = var1;
   }

   public void bridge$setRenderTargetsHeight(int var1) {
      this.lunar$renderTargetsHeight = var1;
   }
}
