package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockProperties;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_8;
import net.minecraft.client.renderer.entity.Render_v1_7;
import net.minecraft.client.renderer.entity.Render_v1_8;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderManager.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public static double renderPosX$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public static double renderPosY$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public static double renderPosZ$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public double renderPosX$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public double renderPosY$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public double renderPosZ$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public float playerViewY;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public float playerViewX;
   @Shadow
   public TextureManager renderEngine;
   @Shadow
   public Entity pointedEntity;
   @Shadow
   public GameSettings options;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public boolean renderShadow$v1_8;
   @Shadow
   public double viewerPosX;
   @Shadow
   public double viewerPosY;
   @Shadow
   public double viewerPosZ;
   @Unique
   private HashMap<String, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> skinMap_v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public boolean debugBoundingBox$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public static boolean debugBoundingBox$v1_7;
   @Final
   @Shadow
   public Map<String, RenderPlayer_v1_8> skinMap$v1_8;
   @Final
   @Shadow
   public RenderPlayer_v1_8 playerRenderer$v1_8;
   @Shadow
   public Map entityRenderMap;
   @Shadow
   public World world;
   @Unique
   private Entity lunar$lastRenderedEntity;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void setDebugBoundingBox$v1_8(boolean var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Shadow
   public abstract boolean renderEntityWithPosYaw$v1_7(Entity var1, double var2, double var4, double var6, float var8, float var9);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Shadow
   public abstract void renderEntity$v1_12(Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10);

   @Shadow
   public abstract boolean isRenderShadow$v1_8();

   public double bridge$renderPosX() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.renderPosX$v1_8 : renderPosX$v1_7;
   }

   public double bridge$renderPosY() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.renderPosY$v1_8 : renderPosY$v1_7;
   }

   public double bridge$renderPosZ() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.renderPosZ$v1_8 : renderPosZ$v1_7;
   }

   public double bridge$playerViewX() {
      return this.playerViewX;
   }

   public double bridge$playerViewY() {
      return this.playerViewY;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$defaultPlayerRenderer() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.playerRenderer$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.entityRenderMap
            .get(EntityPlayer.class);
   }

   public void bridge$setTextureManager(HICRRICCHCCROOHHCHOCOCCHOIHHOC var1) {
      this.renderEngine = (TextureManager)var1;
   }

   public void bridge$setLivingEntity(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      this.pointedEntity = (EntityLivingBase)var1;
   }

   public void bridge$setOptions(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.options = (GameSettings)var1;
   }

   public void bridge$setRenderShadow(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.renderShadow$v1_8 = var1;
      }
   }

   public void bridge$setPlayerViewY(float var1) {
      this.playerViewY = var1;
   }

   public void bridge$renderEntityWithPosYaw(
      @Nullable OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      double var3,
      double var5,
      double var7,
      float var9,
      float var10,
      int var11
   ) {
      if (var11
         != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .OCCCCRRCROIRIHRROHCHCHORCOCICC()) {
         int var12 = var11 % 65536;
         int var13 = var11 / 65536;
         OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, var12, var13);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.renderEntity$v1_12((Entity)var2, var3, var5, var7, var9, var10, false);
      } else {
         this.renderEntityWithPosYaw$v1_7((Entity)var2, var3, var5, var7, var9, var10);
      }
   }

   public void bridge$renderShadow(
      @NotNull OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2,
      double var3,
      double var5,
      double var7,
      float var9,
      double var10,
      double var12
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 || this.isRenderShadow$v1_8()) {
         float var14 = (float)((1.0 - var10 / 256.0) * var12);
         if (var14 > 0.0F) {
            this.lunar$renderShadow((World)var2, var3, var5, var7, var9, var14);
         }
      }
   }

   @Unique
   private void lunar$renderShadow(World var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = Math.min(var9 / 0.5F, var8);
      int var11 = (int)Math.floor(var2 - var8);
      int var12 = (int)Math.floor(var2 + var8);
      int var13 = (int)Math.floor(var4 - var10);
      int var14 = (int)Math.floor(var4);
      int var15 = (int)Math.floor(var6 - var8);
      int var16 = (int)Math.floor(var6 + var8);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableBlend();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            GlStateManager.blendFunc$v1_12(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
         }

         this.renderEngine.bindTexture(Render_v1_8.SHADOW_TEXTURES);
         GlStateManager.depthMask(false);
         Tessellator var17 = Tessellator.getInstance$v1_8();
         BufferBuilder var18 = var17.buffer$v1_8;
         var18.begin$v1_8(7, DefaultVertexFormats.POSITION_TEX_COLOR);
         MutableBlockPos var19 = new MutableBlockPos();

         for (int var20 = var15; var20 <= var16; var20++) {
            for (int var21 = var11; var21 <= var12; var21++) {
               for (int var22 = var13; var22 <= var14; var22++) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                     var19.setPos$v1_12(var21, var22, var20);
                  } else {
                     var19.set$v1_8(var21, var22, var20);
                  }

                  if (this.world.getLightFromNeighbors$v1_8(var19) > 3) {
                     this.lunar$renderShadowSingle$v1_12(
                        (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1,
                        var18,
                        var19,
                        var2,
                        var4,
                        var6,
                        var8,
                        var9
                     );
                  }
               }
            }
         }

         var17.draw$v1_8();
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.disableBlend();
         GlStateManager.depthMask(true);
      } else {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         this.renderEngine.bindTexture(Render_v1_7.shadowTextures);
         GL11.glDepthMask(false);
         Tessellator var23 = Tessellator.INSTANCE;
         var23.startDrawingQuads$v1_7();

         for (int var24 = var15; var24 <= var16; var24++) {
            for (int var25 = var11; var25 <= var12; var25++) {
               for (int var26 = var13; var26 <= var14; var26++) {
                  Block var27 = this.world.getBlock$v1_7(var25, var26 - 1, var24);
                  if (var27.getMaterial$v1_7() != Material.AIR && this.world.getBlockLightValue$v1_7(var25, var26, var24) > 3) {
                     this.lunar$renderShadowSingle$v1_7(var27, var23, var25, var26, var24, var2, var4, var6, var8, var9);
                  }
               }
            }
         }

         var23.draw$v1_7();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glDepthMask(true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private void lunar$renderShadowSingle$v1_12(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      BufferBuilder var2,
      BlockPos var3,
      double var4,
      double var6,
      double var8,
      float var10,
      float var11
   ) {
      BlockPos var12 = var3.down();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(
         (RORCHCIIICOHIRROOORHOCCCCIOCCI)var12
      );
      if (var13.bridge$getRenderShape()
            != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INVISIBLE
         && var13.bridge$isCollisionShapeFullBlock(
            var1, (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var12
         )) {
         double var14 = (var11 - (var6 - var3.getY$v1_8()) / 2.0) * 0.5 * ((World)var1).getLightBrightness$v1_8(var3);
         if (!(var14 < 0.0)) {
            if (var14 > 1.0) {
               var14 = 1.0;
            }

            AxisAlignedBB var16;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               var16 = ((IBlockProperties)var13).getBoundingBox((IBlockAccess)var1, var3);
            } else {
               var16 = (AxisAlignedBB)var13.bridge$getBlock()
                  .bridge$getAABB(var1, (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3);
            }

            if (var16 == null) {
               return;
            }

            double var17 = var3.getX$v1_8() + var16.minX;
            double var19 = var3.getX$v1_8() + var16.maxX;
            double var21 = var3.getY$v1_8() + var16.minY + 0.015625;
            double var23 = var3.getZ$v1_8() + var16.minZ;
            double var25 = var3.getZ$v1_8() + var16.maxZ;
            float var27 = (float)((var4 - var17) / 2.0 / var10 + 0.5);
            float var28 = (float)((var4 - var19) / 2.0 / var10 + 0.5);
            float var29 = (float)((var8 - var23) / 2.0 / var10 + 0.5);
            float var30 = (float)((var8 - var25) / 2.0 / var10 + 0.5);
            var2.pos$v1_8(var17 - var4, var21 - var6, var23 - var8).tex$v1_8(var27, var29).color$v1_8(1.0F, 1.0F, 1.0F, (float)var14).endVertex$v1_8();
            var2.pos$v1_8(var17 - var4, var21 - var6, var25 - var8).tex$v1_8(var27, var30).color$v1_8(1.0F, 1.0F, 1.0F, (float)var14).endVertex$v1_8();
            var2.pos$v1_8(var19 - var4, var21 - var6, var25 - var8).tex$v1_8(var28, var30).color$v1_8(1.0F, 1.0F, 1.0F, (float)var14).endVertex$v1_8();
            var2.pos$v1_8(var19 - var4, var21 - var6, var23 - var8).tex$v1_8(var28, var29).color$v1_8(1.0F, 1.0F, 1.0F, (float)var14).endVertex$v1_8();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private void lunar$renderShadowSingle$v1_7(
      Block var1, Tessellator var2, int var3, int var4, int var5, double var6, double var8, double var10, float var12, float var13
   ) {
      if (var1.renderAsNormalBlock$v1_7()) {
         double var14 = (var13 - (var8 - var4) / 2.0) * 0.5 * this.world.getLightBrightness$v1_7(var3, var4, var5);
         if (!(var14 < 0.0)) {
            if (var14 > 1.0) {
               var14 = 1.0;
            }

            var2.setColorRGBA_F$v1_7(1.0F, 1.0F, 1.0F, (float)var14);
            double var16 = var3 + var1.getBlockBoundsMinX$v1_7();
            double var18 = var3 + var1.getBlockBoundsMaxX$v1_7();
            double var20 = var4 + var1.getBlockBoundsMaxY$v1_7() + 0.015625;
            double var22 = var5 + var1.getBlockBoundsMinZ$v1_7();
            double var24 = var5 + var1.getBlockBoundsMaxZ$v1_7();
            float var26 = (float)((var6 - var16) / 2.0 / var12 + 0.5);
            float var27 = (float)((var6 - var18) / 2.0 / var12 + 0.5);
            float var28 = (float)((var10 - var22) / 2.0 / var12 + 0.5);
            float var29 = (float)((var10 - var24) / 2.0 / var12 + 0.5);
            var2.addVertexWithUV$v1_7(var16 - var6, var20 - var8 - 1.0, var22 - var10, var26, var28);
            var2.addVertexWithUV$v1_7(var16 - var6, var20 - var8 - 1.0, var24 - var10, var26, var29);
            var2.addVertexWithUV$v1_7(var18 - var6, var20 - var8 - 1.0, var24 - var10, var27, var29);
            var2.addVertexWithUV$v1_7(var18 - var6, var20 - var8 - 1.0, var22 - var10, var27, var28);
         }
      }
   }

   public Map<String, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getSkinMap() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.skinMap$v1_8;
      }

      if (this.skinMap_v1_7 == null) {
         this.skinMap_v1_7 = new HashMap<>();
         this.skinMap_v1_7.put("default", this.bridge$defaultPlayerRenderer());
         this.skinMap_v1_7.put("slim", this.bridge$defaultPlayerRenderer());
      }

      return this.skinMap_v1_7;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "doRenderEntity$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_8;doRender(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   private void impl$doRender(CallbackInfoReturnable<Boolean> var1) {
      GlStateManager.enableDepth();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderEntity$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_8;doRender(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   private void impl$doRender(CallbackInfo var1) {
      GlStateManager.enableDepth();
   }

   public double bridge$viewerPosX() {
      return this.viewerPosX;
   }

   public double bridge$viewerPosY() {
      return this.viewerPosY;
   }

   public double bridge$viewerPosZ() {
      return this.viewerPosZ;
   }

   public void bridge$setDebugBoundingBox(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.setDebugBoundingBox$v1_8(var1);
      } else {
         debugBoundingBox$v1_7 = var1;
      }
   }

   public void bridge$prepare(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
   }

   @Inject(method = {"cacheActiveRenderInfo$v1_7", "cacheActiveRenderInfo$v1_8"}, at = @At("RETURN"))
   public void impl$cacheActiveRenderInfo_return(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (Minecraft.getMinecraft().player$v1_8 == null) {
            return;
         }
      } else if (Minecraft.getMinecraft().thePlayer$v1_7 == null) {
         return;
      }

      if (Minecraft.getMinecraft().gameSettings.thirdPersonView == 2) {
         this.playerViewX = -this.playerViewX;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderDebugBoundingBox",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderGlobal;drawOutlinedBoundingBox$v1_7(Lnet/minecraft/util/math/AxisAlignedBB;I)V",
         ordinal = 0
      )
   )
   private void impl$onDrawOutlinedBoundingBox(AxisAlignedBB var1, int var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      Entity var4 = this.lunar$lastRenderedEntity;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 && var4 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()) {
         float var5 = 1.62F;
         ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
            .bridge$setMaxY(var1.maxY - var5);
         ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
            .bridge$setMinY(var1.minY - var5);
      }

      if (var3.isEnabled() && var4 != null) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var8 = var3.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var4
            )
            .HICRRICCHCCROOHHCHOCOCCHOIHHOC(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var4
            );
         IHIRRIIORRHORHRORIHOROIRCORCOO var6 = var3.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var4
            )
            .RIRRHRRHCHIRCICORIRRICORIICRIH();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.OHCIORCRRHCRRHOIHHHOCRHICIROOO()
            .get();
         GL11.glLineWidth((Float)var6.get());
         GL11.glEnable(2852);
         GL11.glLineStipple(var7.getFactor(), (short)var7.getPattern());
         if (var8.IOHCRRIIHCIHORROOCHCCORIHRHCII(0.0F) / 255.0F < 0.95F) {
            GL11.glEnable(6406);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 769);
         }

         RenderGlobal.drawOutlinedBoundingBox$v1_7(var1, var8.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F));
         GL11.glLineWidth(1.0F);
         GL11.glDisable(2852);
      } else {
         RenderGlobal.drawOutlinedBoundingBox$v1_7(var1, var2);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(
      method = "renderDebugBoundingBox",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderGlobal;drawOutlinedBoundingBox$v1_8(Lnet/minecraft/util/math/AxisAlignedBB;IIII)V",
         ordinal = 0
      )
   )
   private void impl$onDrawOutlinedBoundingBox(AxisAlignedBB var1, int var2, int var3, int var4, int var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      if (var6.isEnabled() && this.lunar$lastRenderedEntity != null) {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var7 = var6.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.lunar$lastRenderedEntity
            )
            .HICRRICCHCCROOHHCHOCOCCHOIHHOC(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.lunar$lastRenderedEntity
            );
         IHIRRIIORRHORHRORIHOROIRCORCOO var8 = var6.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.lunar$lastRenderedEntity
            )
            .RIRRHRRHCHIRCICORIRRICORIICRIH();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var6.OHCIORCRRHCRRHOIHHHOCRHICIROOO()
            .get();
         GL11.glLineWidth((Float)var8.get());
         GL11.glEnable(2852);
         GL11.glLineStipple(var9.getFactor(), (short)var9.getPattern());
         if (var7.getAlpha() / 255.0F < 0.95F) {
            GlStateManager.enableAlpha();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(770, 769);
         }

         int var10 = var7.OCOHORHCROHICRRIHCIHHRRCIHICRI(0.0F);
         RenderGlobal.drawOutlinedBoundingBox$v1_8(
            var1,
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var10),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var10),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHCOIHIICIIHOOIICCHHCRORHORHCI(var10),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var10)
         );
         GL11.glLineWidth(1.0F);
         GL11.glDisable(2852);
      } else {
         RenderGlobal.drawOutlinedBoundingBox$v1_8(var1, var2, var3, var4, var5);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "renderDebugBoundingBox",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;drawBoundingBox$v1_12(DDDDDDFFFF)V", ordinal = 0, opcode = 184)
   )
   private void impl$onDrawOutlinedBoundingBox(
      double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      if (var17.isEnabled() && this.lunar$lastRenderedEntity != null) {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var18 = var17.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.lunar$lastRenderedEntity
            )
            .HICRRICCHCCROOHHCHOCOCCHOIHHOC(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.lunar$lastRenderedEntity
            );
         IHIRRIIORRHORHRORIHOROIRCORCOO var19 = var17.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.lunar$lastRenderedEntity
            )
            .RIRRHRRHCHIRCICORIRRICORIICRIH();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var20 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var17.OHCIORCRRHCRRHOIHHHOCRHICIROOO()
            .get();
         GL11.glLineWidth((Float)var19.get());
         GL11.glEnable(2852);
         GL11.glLineStipple(var20.getFactor(), (short)var20.getPattern());
         if (var18.IOHCRRIIHCIHORROOCHCCORIHRHCII(0.0F) / 255.0F < 0.95F) {
            GlStateManager.enableAlpha();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(770, 769);
         }

         int var21 = var18.OCOHORHCROHICRRIHCIHHRRCIHICRI(0.0F);
         RenderGlobal.drawBoundingBox$v1_12(
            var1,
            var3,
            var5,
            var7,
            var9,
            var11,
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var21),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var21),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var21),
            1.0F
         );
         GL11.glLineWidth(1.0F);
         GL11.glDisable(2852);
      } else {
         RenderGlobal.drawBoundingBox$v1_12(var1, var3, var5, var7, var9, var11, var13, var14, var15, var16);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderDebugBoundingBox",
      at = {
            @At(
               value = "INVOKE",
               target = "Lnet/minecraft/client/renderer/RenderGlobal;drawOutlinedBoundingBox$v1_8(Lnet/minecraft/util/math/AxisAlignedBB;IIII)V",
               ordinal = 1
            ),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;drawBoundingBox$v1_12(DDDDDDFFFF)V", ordinal = 2, opcode = 184)
      },
      require = 1,
      cancellable = true
   )
   public void impl$onRenderDebugBoundingBox(Entity var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      if (var11.isEnabled()
         && !(Boolean)var11.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
            )
            .CIOHCIHHHIIIOHOICOCIRCIIRHIRRO()
            .get()) {
         var10.cancel();
         GlStateManager.enableTexture2D();
         GlStateManager.enableLighting();
         GlStateManager.enableCull();
         GlStateManager.disableBlend();
         GlStateManager.depthMask(true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderDebugBoundingBox",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;getInstance$v1_8()Lnet/minecraft/client/renderer/Tessellator;"),
      cancellable = true
   )
   public void impl$disableLookVector(Entity var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      if (var11.isEnabled()
         && !(Boolean)var11.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
            )
            .CIOHCIHHHIIIOHOICOCIRCIIRHIRRO()
            .get()) {
         var10.cancel();
         GlStateManager.enableTexture2D();
         GlStateManager.enableLighting();
         GlStateManager.enableCull();
         GlStateManager.disableBlend();
         GlStateManager.depthMask(true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderDebugBoundingBox",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getLook$v1_8(F)Lnet/minecraft/util/math/Vec3d;"),
      cancellable = true
   )
   public void impl$onRenderDebugBoundingBox$getLook(Entity var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      if (var11.isEnabled()
         && !(Boolean)var11.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
            )
            .CIOHCIHHHIIIOHOICOCIRCIIRHIRRO()
            .get()) {
         var10.cancel();
         GlStateManager.enableTexture2D();
         GlStateManager.enableLighting();
         GlStateManager.enableCull();
         GlStateManager.disableBlend();
         GlStateManager.depthMask(true);
      }
   }

   @Inject(method = "renderDebugBoundingBox", at = @At("HEAD"), cancellable = true)
   public void impl$onRenderDebugBoundingBox$head(Entity var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHOCOHCOOOHCOIIROCCCHIIRRROCIC();
      if (var1
         == com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIRHHRHCRRCIOHIHRORHCOIRIIOHHC()
         )
       {
         var10.cancel();
      } else {
         if (var11.isEnabled()) {
            if (!var11.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
               )
               .RICRIRRCOHRCOCRRHHCRHRROOIOHHR(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
               )) {
               var10.cancel();
            } else {
               this.lunar$lastRenderedEntity = var1;
            }
         }
      }
   }

   @Inject(method = "renderDebugBoundingBox", at = @At("TAIL"))
   public void impl$onRenderDebugBoundingBox$tail(Entity var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      this.lunar$lastRenderedEntity = null;
   }

   public boolean bridge$showDebugBoundingBox() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.debugBoundingBox$v1_8 : debugBoundingBox$v1_7;
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getCamera() {
      return Optional.empty();
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getCameraPos() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.IHRHHIOIIICOROOORIOHCIROIRCOHH();
      return (CRHROHHHCIHHCOHCOORCRIHHIICROR)(
         new Vec3d(
            var1.bridge$renderPosX(),
            var1.bridge$renderPosY() + IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getEyeHeight(),
            var1.bridge$renderPosZ()
         )
      );
   }

   public int bridge$getPackedLightCoords(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1, float var2
   ) {
      if (var1.bridge$isOnFire()) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .OCCCCRRCROIRIHRROHCHCHORCOCICC();
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
            ? ((Entity)var1).getBrightnessForRender$v1_12()
            : ((Entity)var1).getBrightnessForRender$v1_7(var2);
      }
   }
}
