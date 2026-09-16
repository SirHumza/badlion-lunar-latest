package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.gson.JsonSyntaxException;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.module.beam.BeamModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;
import org.joml.Vector3i;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderGlobal.class)
public abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Final
   @Shadow
   public Minecraft mc;
   @Shadow
   public WorldClient world;
   @Shadow
   public int countEntitiesRendered;
   @Shadow
   public Framebuffer entityOutlineFramebuffer$v1_8;
   @Final
   @Shadow
   public RenderManager renderManager$v1_8;
   @Shadow
   public ShaderGroup entityOutlineShader$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private Framebuffer lunar$entityOutlineFramebuffer;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private ShaderGroup lunar$entityOutlineShader;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Unique
   private boolean lunar$entityOutlinesRendered;
   @Unique
   private int lunar$chunksToWait;

   @Shadow
   public abstract void renderSkyEnd$v1_8();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @ModifyExpressionValue(method = "renderSky$v1_7", at = @At(value = "FIELD", target = "Lnet/minecraft/world/WorldProvider;dimensionId$v1_7:I"))
   private int lunar$skyHook$v1_7(int var1) {
      if (!this.mc.world.provider.isSurfaceWorld()) {
         return var1;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RIHIRICHICORROIIHIRROIRHOHRHHO();
      if (var2.isEnabled()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.COIRRHICRCCCCHHIHHRRCHHIOCHROR()
            .get();
         if (var3
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NETHER
            )
          {
            return 0;
         }

         if (var3
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.END
            )
          {
            return 1;
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(method = "renderSky$v1_7", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/WorldProvider;isSurfaceWorld()Z"))
   private boolean lunar$skyHookNether$v1_7(WorldProvider var1, Operation<Boolean> var2) {
      boolean var3 = (Boolean)var2.call(new Object[]{var1});
      if (!var3) {
         return false;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RIHIRICHICORROIIHIRROIRHOHRHHO();
      return var4.isEnabled()
         ? var4.COIRRHICRCCCCHHIHHRRCHHIOCHROR().get()
            != com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NETHER
         : true;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderSky$v1_8(FI)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/WorldProvider;isSurfaceWorld()Z", shift = Shift.AFTER),
      cancellable = true
   )
   private void lunar$skyHook$v1_8(float var1, int var2, CallbackInfo var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RIHIRICHICORROIIHIRROIRHOHRHHO();
      if (var4.isEnabled()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.COIRRHICRCCCCHHIHHRRCHHIOCHROR()
            .get();
         if (var5
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NETHER
            )
          {
            var3.cancel();
         } else if (var5
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.END
            )
          {
            var3.cancel();
            this.renderSkyEnd$v1_8();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "drawSelectionBox",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;drawOutlinedBoundingBox(Lnet/minecraft/util/AxisAlignedBB;I)V")
   )
   private void lunar$drawSelectionBox(AxisAlignedBB var1, int var2, EntityPlayer var3, RayTraceResult var4, int var5, float var6) {
      if (!lunar$drawSelectionBoundingBox(var1)) {
         RenderGlobal.drawOutlinedBoundingBox$v1_7(var1, var2);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "drawSelectionBoundingBox$v1_8", at = @At("HEAD"), cancellable = true)
   private static void lunar$drawSelectionBoundingBox_v1_8(AxisAlignedBB var0, CallbackInfo var1) {
      if (lunar$drawSelectionBoundingBox(var0)) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "drawSelectionBoundingBox$v1_12", at = @At("HEAD"), cancellable = true)
   private static void lunar$drawSelectionBoundingBox_v1_12(AxisAlignedBB var0, float var1, float var2, float var3, float var4, CallbackInfo var5) {
      if (lunar$drawSelectionBoundingBox(var0)) {
         var5.cancel();
      }
   }

   @Unique
   private static boolean lunar$drawSelectionBoundingBox(AxisAlignedBB var0) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0
            )
         );
      return var1 != null && var1.isCancelled();
   }

   @Unique
   private void lunar$renderBeam(ICamera var1, float var2, World var3) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(BeamModule.class)
         .ifPresent(
            var4 -> {
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var4;
               double var6 = this.mc.gameSettings.renderDistanceChunks * 16;
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                  var8 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)TileEntityRendererDispatcher.instance
                     .getRenderer$v1_12(TileEntityBeacon.class);
               } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  var8 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)TileEntityRendererDispatcher.instance
                     .getSpecialRendererByClass$v1_8(TileEntityBeacon.class);
               } else {
                  var8 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)TileEntityRendererDispatcher.instance
                     .getSpecialRendererByClass$v1_7(TileEntityBeacon.class);
               }

               var5.OHIIIORIOIRCIIOOORHIOCOOOOIIRO()
                  .forEach(
                     (var6x, var7) -> {
                        Vector3d var8x = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
                           .bridge$getPosition();
                        ApolloBlockLocation var9 = var7.getLocation();
                        if (var8x.x() <= var9.getX() + var6
                           && var8x.x() >= var9.getX() - var6
                           && var8x.z() <= var9.getZ() + var6
                           && var8x.z() >= var9.getZ() - var6) {
                           var8.bridge$renderBeacon(
                              (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var3,
                              var9.getX() - var8x.x(),
                              var9.getY() - var8x.y(),
                              var9.getZ() - var8x.z(),
                              var2,
                              1.0,
                              var7.getColor(),
                              1024.0
                           );
                        }
                     }
                  );
            }
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "renderEntities$v1_8", at = @At(value = "INVOKE", target = "Ljava/util/Set;iterator()Ljava/util/Iterator;", ordinal = 0))
   public void apollo$renderBeacon$v1_8(Entity var1, ICamera var2, float var3, CallbackInfo var4) {
      this.lunar$renderBeam(var2, var3, var1.world);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderEntities$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderHelper;enableStandardItemLighting()V", shift = Shift.AFTER)
   )
   public void apollo$renderBeacon$v1_7(EntityLivingBase var1, ICamera var2, float var3, CallbackInfo var4) {
      this.lunar$renderBeam(var2, var3, var1.world);
   }

   @Unique
   private boolean lunar$areOutlinesSupported() {
      return OpenGlHelper.framebufferSupported && OpenGlHelper.shadersSupported;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private boolean lunar$shouldRenderEntityOutlines() {
      return this.lunar$entityOutlineFramebuffer != null && this.lunar$entityOutlineShader != null && this.mc.thePlayer$v1_7 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Nullable
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$entityTarget() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.lunar$entityOutlineFramebuffer;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void bridge$makeEntityOutlineShader() {
      if (this.lunar$areOutlinesSupported()) {
         if (ShaderLinkHelper.getStaticShaderLinkHelper() == null) {
            ShaderLinkHelper.setNewStaticShaderLinkHelper();
         }

         ResourceLocation var1 = new ResourceLocation("shaders/post/lunar_entity_outline_1_7.json");

         try {
            this.lunar$entityOutlineShader = new ShaderGroup(this.mc.getTextureManager(), this.mc.getResourceManager(), this.mc.getFramebuffer(), var1);
            this.lunar$entityOutlineShader.createBindFramebuffers(this.mc.displayWidth, this.mc.displayHeight);
            this.lunar$entityOutlineFramebuffer = this.lunar$entityOutlineShader.getFramebuffer("final");
         } catch (JsonSyntaxException | IOException var3) {
            System.out.printf("Failed to load shader: " + var1 + "%n", var3);
            this.lunar$entityOutlineShader = null;
            this.lunar$entityOutlineFramebuffer = null;
         }
      } else {
         this.lunar$entityOutlineShader = null;
         this.lunar$entityOutlineFramebuffer = null;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void bridge$renderEntityOutlineFramebuffer() {
      if (this.lunar$shouldRenderEntityOutlines()) {
         GL11.glEnable(3042);
         OpenGlHelper.glBlendFunc(770, 771, 0, 1);
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.lunar$entityOutlineFramebuffer)
            .bridge$frameBufferRender(this.mc.displayWidth, this.mc.displayHeight, false);
         GL11.glDisable(3042);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void bridge$bindEntityOutlineFbs(int var1, int var2) {
      if (this.lunar$areOutlinesSupported() && this.lunar$entityOutlineShader != null) {
         this.lunar$entityOutlineShader.createBindFramebuffers(var1, var2);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderEntities$v1_7",
      slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=entities"), to = @At(value = "CONSTANT", args = "stringValue=blockentities")),
      at = @At(value = "INVOKE", target = "Ljava/util/List;size()I", ordinal = 0)
   )
   private int lunar$customEntityRendering(
      List<Entity> var1,
      EntityLivingBase var2,
      ICamera var3,
      float var4,
      @Local(ordinal = 0) double var5,
      @Local(ordinal = 1) double var7,
      @Local(ordinal = 2) double var9
   ) {
      if (!this.lunar$shouldRenderEntityOutlines()) {
         return var1.size();
      }

      ArrayList var11 = new ArrayList();

      for (Entity var13 : var1) {
         boolean var14 = var13.isInRangeToRender3d(var5, var7, var9)
            && (var13.ignoreFrustumCheck || var3.isBoundingBoxInFrustum(var13.boundingBox) || var13.riddenByEntity$v1_7 == this.mc.thePlayer$v1_7);
         if (!var14 && var13 instanceof EntityLiving var15 && var15.getLeashed() && var15.getLeashedToEntity$v1_7() != null) {
            Entity var16 = var15.getLeashedToEntity$v1_7();
            var14 = var3.isBoundingBoxInFrustum(var16.boundingBox);
         }

         if (var14
            && (var13 != this.mc.renderViewEntity$v1_7 || this.mc.gameSettings.thirdPersonView != 0 || this.mc.renderViewEntity$v1_7.isPlayerSleeping())
            && this.world.blockExists$v1_7(MathHelper.floor_double$v1_7(var13.posX), 0, MathHelper.floor_double$v1_7(var13.posZ))) {
            RenderManager.instance$v1_7.renderEntitySimple$v1_7(var13, var4);
            this.countEntitiesRendered++;
            if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var13).bridge$isGlowing()) {
               var11.add(var13);
            }
         }
      }

      if (!var11.isEmpty() || this.lunar$entityOutlinesRendered) {
         if (this.lunar$isRenderEntityOutlines()) {
            this.lunar$entityOutlineFramebuffer.framebufferClear();
            this.lunar$entityOutlinesRendered = !var11.isEmpty();
            if (!var11.isEmpty()) {
               GL11.glDepthFunc(519);
               GL11.glDisable(2912);
               this.lunar$entityOutlineFramebuffer.bindFramebuffer(false);
               RenderHelper.disableStandardItemLighting();
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)RenderManager.instance$v1_7)
                  .bridge$setRenderOutlines(true);

               for (Entity var19 : var11) {
                  RenderManager.instance$v1_7.renderEntitySimple$v1_7(var19, var4);
               }

               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)RenderManager.instance$v1_7)
                  .bridge$setRenderOutlines(false);
               RenderHelper.enableStandardItemLighting();
               GL11.glDepthMask(false);
               this.lunar$entityOutlineShader.loadShaderGroup$v1_7(var4);
               GL11.glEnable(2896);
               GL11.glDepthMask(true);
               GL11.glEnable(2912);
               GL11.glEnable(3042);
               GL11.glEnable(2903);
               GL11.glDepthFunc(515);
               GL11.glEnable(2929);
               GL11.glEnable(3008);
            }

            this.mc.getFramebuffer().bindFramebuffer(false);
         } else {
            this.lunar$entityOutlinesRendered = !var11.isEmpty();
            if (!var11.isEmpty()) {
               GL11.glDisable(2912);
               GL11.glDisable(2929);
               this.mc.entityRenderer.disableLightmap$v1_7(0.0);
               RenderHelper.disableStandardItemLighting();
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)RenderManager.instance$v1_7)
                  .bridge$setRenderOutlines(true);

               for (Entity var20 : var11) {
                  RenderManager.instance$v1_7.renderEntityStatic$v1_7(var20, var4, false);
               }

               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)RenderManager.instance$v1_7)
                  .bridge$setRenderOutlines(false);
               RenderHelper.enableStandardItemLighting();
               this.mc.entityRenderer.enableLightmap$v1_7(0.0);
               GL11.glEnable(2929);
               GL11.glEnable(2912);
            }
         }
      }

      return 0;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @ModifyExpressionValue(
      method = "renderEntities",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;isRenderEntityOutlines()Z")
   )
   private boolean lunar$moveEntityOutlineRendering(boolean var1) {
      return false;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(
      method = "renderEntities$v1_8",
      slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=entities"), to = @At(value = "CONSTANT", args = "stringValue=blockentities")),
      at = @At(value = "INVOKE", target = "Ljava/util/Iterator;hasNext()Z", ordinal = 0)
   )
   private boolean lunar$renderGlowing(
      Iterator var1,
      Entity var2,
      ICamera var3,
      float var4,
      @Local(ordinal = 0) double var5,
      @Local(ordinal = 1) double var7,
      @Local(ordinal = 2) double var9,
      @Local List<Entity> var11
   ) {
      if (var1.hasNext()) {
         return true;
      }

      this.world.profiler.endStartSection("entityOutlines");
      ArrayList var12 = new ArrayList();
      if (this.mc.player$v1_8.isSpectator$v1_8() && this.mc.gameSettings.keyBindSpectatorOutlines$v1_8.isKeyDown()) {
         for (Entity var19 : var11) {
            boolean var15 = this.mc.getRenderViewEntity$v1_8() instanceof EntityLivingBase
               && ((EntityLivingBase)this.mc.getRenderViewEntity$v1_8()).isPlayerSleeping();
            boolean var16 = var19.isInRangeToRender3d(var5, var7, var9)
               && (
                  var19.ignoreFrustumCheck
                     || var3.isBoundingBoxInFrustum(var19.getEntityBoundingBox$v1_8())
                     || var19.riddenByEntity$v1_7 == this.mc.player$v1_8
               )
               && var19 instanceof EntityPlayer;
            if ((var19 != this.mc.getRenderViewEntity$v1_8() || this.mc.gameSettings.thirdPersonView != 0 || var15) && var16) {
               var12.add(var19);
            }
         }
      } else {
         for (Entity var14 : var11) {
            if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var14).bridge$isGlowing()
               && (var14 != this.mc.getRenderViewEntity$v1_8() || this.mc.gameSettings.thirdPersonView != 0)
               && var14.isInRangeToRender3d(var5, var7, var9)
               && (var14.ignoreFrustumCheck || var3.isBoundingBoxInFrustum(var14.getEntityBoundingBox$v1_8()))) {
               var12.add(var14);
            }
         }
      }

      boolean var18 = !var12.isEmpty();
      if (var18 || this.lunar$entityOutlinesRendered) {
         if (this.isRenderEntityOutlines$v1_8()) {
            this.entityOutlineFramebuffer$v1_8.framebufferClear();
            this.lunar$entityOutlinesRendered = var18;
            if (var18) {
               GlStateManager.depthFunc(519);
               GlStateManager.disableFog();
               this.entityOutlineFramebuffer$v1_8.bindFramebuffer(false);
               RenderHelper.disableStandardItemLighting();
               this.renderManager$v1_8.setRenderOutlines$v1_8(true);

               for (Entity var22 : var12) {
                  this.renderManager$v1_8.renderEntitySimple$v1_7(var22, var4);
               }

               this.renderManager$v1_8.setRenderOutlines$v1_8(false);
               RenderHelper.enableStandardItemLighting();
               GlStateManager.depthMask(false);
               this.entityOutlineShader$v1_8.loadShaderGroup$v1_7(var4);
               GlStateManager.enableLighting();
               GlStateManager.depthMask(true);
               GlStateManager.enableFog();
               GlStateManager.enableBlend();
               GlStateManager.enableColorMaterial();
               GlStateManager.depthFunc(515);
               GlStateManager.enableDepth();
               GlStateManager.enableAlpha();
            }

            this.mc.getFramebuffer().bindFramebuffer(false);
         } else {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR var21 = null;
            if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR().isPresent()
               && ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
                     .get())
                  .getConfig()
                  .hasShaders()) {
               var21 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
                     .get())
                  .getShaders();
            }

            this.lunar$entityOutlinesRendered = var18;
            if (var18) {
               if (var21 != null) {
                  var21.beginEntitiesGlowing();
               }

               GlStateManager.disableFog();
               GlStateManager.depthFunc(519);
               GlStateManager.disableDepth();
               this.mc.entityRenderer.disableLightmap$v1_8();
               RenderHelper.disableStandardItemLighting();
               this.renderManager$v1_8.setRenderOutlines$v1_8(true);

               for (Entity var24 : var12) {
                  if (var21 != null) {
                     var21.nextEntity((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2);
                  }

                  this.renderManager$v1_8.renderEntityStatic$v1_7(var24, var4, false);
               }

               this.renderManager$v1_8.setRenderOutlines$v1_8(false);
               RenderHelper.enableStandardItemLighting();
               this.mc.entityRenderer.enableLightmap$v1_8();
               GlStateManager.depthFunc(515);
               GlStateManager.enableDepth();
               GlStateManager.enableFog();
               if (var21 != null) {
                  var21.endEntitiesGlowing();
               }
            }
         }
      }

      return false;
   }

   @Unique
   public boolean lunar$isRenderEntityOutlines() {
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR().isPresent()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH var1 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
               .get())
            .getConfig();
         if (var1.hasFastRender() || var1.hasShaders() || var1.hasAntiAliasing()) {
            return false;
         }
      }

      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.entityOutlineFramebuffer$v1_8 != null && this.entityOutlineShader$v1_8 != null && this.mc.player$v1_8 != null
         : this.lunar$entityOutlineFramebuffer != null && this.lunar$entityOutlineShader != null && this.mc.thePlayer$v1_7 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Overwrite
   public boolean isRenderEntityOutlines$v1_8() {
      return this.lunar$isRenderEntityOutlines();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "updateChunks$v1_8", at = @At(value = "INVOKE", target = "Ljava/util/Set;iterator()Ljava/util/Iterator;"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "optifine")
   private void lunar$beginLazyChunkLoading$v1_8(CallbackInfo var1, @Share("lazyAmt") LocalIntRef var2) {
      var2.set(
         ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
               .IRCHIIRCIIORIOCOCIOIRCOCICRCCO()
               .get())
            .getAmount()
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "updateChunks$v1_8", at = @At(value = "INVOKE", target = "Ljava/util/Iterator;next()Ljava/lang/Object;"), cancellable = true)
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "optifine")
   private void lunar$onUpdateRenderers$v1_8(long var1, CallbackInfo var3, @Share("lazyAmt") LocalIntRef var4) {
      int var5 = var4.get();
      if (var5 != 1) {
         if (this.lunar$chunksToWait <= 0) {
            this.lunar$chunksToWait = var5;
         } else {
            this.lunar$chunksToWait--;
            var3.cancel();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderEntities$v1_7", at = @At(value = "CONSTANT", args = "stringValue=entities", shift = Shift.AFTER, ordinal = 0))
   private void lunar$onEntityRendering$v1_7(EntityLivingBase var1, ICamera var2, float var3, CallbackInfo var4) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3),
               RenderManager.renderPosX$v1_7,
               RenderManager.renderPosY$v1_7,
               RenderManager.renderPosZ$v1_7
            )
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "renderEntities$v1_8", at = @At(value = "CONSTANT", args = "stringValue=entities", shift = Shift.AFTER, ordinal = 0))
   private void lunar$onEntityRendering$v1_8(
      Entity var1,
      ICamera var2,
      float var3,
      CallbackInfo var4,
      @Local(ordinal = 3) double var5,
      @Local(ordinal = 4) double var7,
      @Local(ordinal = 5) double var9
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3), var5, var7, var9
            )
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderEntities$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;preRenderDamagedBlocks$v1_8()V", ordinal = 0)
   )
   private void lunar$drawSubmits$v1_12(Entity var1, ICamera var2, float var3, CallbackInfo var4) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .ORCOCROHCRORRCCHRCCHCRRCCCORRH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.CRRRICCRROCOHHOHIICIHORCOORRRH.RENDERING_OPAQUE);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .ORCOCROHCRORRCCHRCCHCRRCCCORRH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.CRRRICCRROCOHHOHIICIHORCOORRRH.RENDERING_TRANSLUCENT);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .ORCOCROHCRORRCCHRCCHCRRCCCORRH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.CRRRICCRROCOHHOHIICIHORCOORRRH.POST_RENDER);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(method = "destroyBlockPartially$v1_7", at = @At("HEAD"))
   private void lunar$destroyBlockInWorldPartially(int var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
                  new Vector3i(var2, var3, var4)
               ),
               var5
            )
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "sendBlockBreakProgress$v1_8", at = @At("HEAD"))
   private void lunar$sendBlockBreakProgress(int var1, BlockPos var2, int var3, CallbackInfo var4) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1, (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2, var3
            )
         );
   }

   @Inject(method = "loadRenderers", at = @At("RETURN"))
   private void lunar$onChunkReload(CallbackInfo var1) {
      if (this.world != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::new
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "setupTerrain$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/profiler/Profiler;endSection()V", ordinal = 0))
   private void lunar$onApplyFrustum(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderSortedRenderers$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindRenderBlocks$v1_7(int var1, int var2, int var3, double var4, CallbackInfoReturnable<Integer> var6) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var7.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR var8 = var7.HOROHROIORRIRIIIOOCCIROCRCROHI()
            .IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if ((Boolean)var8.CCRIOOOOCRRCHOICOHOCOIRICIIIRC().get() && !(Boolean)var8.IHCOIOHICOIIRRORIRHRHOOOIIHIIO().get()) {
            var6.setReturnValue(0);
         }

         if ((Boolean)var8.IRCOOICRICCRCCROHRROIRHHIHHCCO().get() && (Boolean)var8.OOHIIRRIOHRIICIOHIIRRHHHHCRRIH().get()) {
            var6.setReturnValue(0);
         }
      }
   }
}
