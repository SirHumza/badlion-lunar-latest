package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.RenderGlobal.ContainerLocalRenderInformation;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderGlobal.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public int renderersLoaded$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public int renderersBeingRendered$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public ViewFrustum viewFrustum$v1_8;
   @Shadow
   public List<ContainerLocalRenderInformation> renderInfos$v1_8;
   @Shadow
   public boolean displayListEntitiesDirty;
   @Shadow
   public int countEntitiesRendered;
   @Shadow
   public Framebuffer entityOutlineFramebuffer$v1_8;
   @Shadow
   public int renderDistanceChunks;
   @Shadow
   public Set<TileEntity> setTileEntities$v1_8;
   @Shadow
   public List tileEntities$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public BufferBuilder[] worldRenderers$v1_7;
   @Unique
   public int bridge$countPlayersRendered;
   @Unique
   private ICamera bridge$lastCamera;
   @Unique
   private final List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> lunar$renderChunks = new ArrayList<>();

   @Shadow
   public abstract void loadRenderers();

   public int bridge$getMaximumRenderCount() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.viewFrustum$v1_8.renderChunks.length : this.renderersLoaded$v1_7;
   }

   public int bridge$getUnculledRenderCount() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return this.renderersBeingRendered$v1_7;
      }

      int var1 = 0;

      for (ContainerLocalRenderInformation var3 : this.renderInfos$v1_8) {
         if (bridge$filterChunks_v1_8(var3)) {
            var1++;
         }
      }

      return var1;
   }

   public int bridge$getRenderedEntityCount() {
      return this.countEntitiesRendered;
   }

   public int bridge$getRenderedBlockEntityCount() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.setTileEntities$v1_8.size() : this.tileEntities$v1_7.size();
   }

   public int bridge$getRenderedPlayersCount() {
      return this.bridge$countPlayersRendered;
   }

   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   private static boolean bridge$filterChunks_v1_8(ContainerLocalRenderInformation var0) {
      RenderChunk var1 = var0.renderChunk;
      CompiledChunk var2 = var1.compiledChunk;
      return var2 != CompiledChunk.DUMMY && !var2.isEmpty();
   }

   public void bridge$setNeedsFullRenderChunkUpdate(boolean var1) {
      this.displayListEntitiesDirty = var1;
   }

   public void bridge$reloadChunks() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         Minecraft.instance.addScheduledTask$v1_8(this::loadRenderers);
      } else {
         Minecraft.instance.addScheduledTask$v1_7(this::loadRenderers);
      }
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> bridge$getRenderChunks() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.renderInfos$v1_8 : this.lunar$renderChunks;
   }

   public boolean bridge$isVisible(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return this.bridge$lastCamera.isBoundingBoxInFrustum((AxisAlignedBB)var1);
   }

   public boolean bridge$isBlockVisible(int var1, int var2, int var3) {
      return this.bridge$lastCamera instanceof Frustum var4
         ? var4.isBoxInFrustum(var1, var2, var3, var1 + 1.0, var2 + 1.0, var3 + 1.0)
         : this.bridge$lastCamera.isBoundingBoxInFrustum(new AxisAlignedBB(var1, var2, var3, var1 + 1.0, var2 + 1.0, var3 + 1.0));
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$entityTarget() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.entityOutlineFramebuffer$v1_8;
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderEntities$v1_7",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/RenderGlobal;countEntitiesRendered:I", opcode = 181, ordinal = 0)
   )
   private void bridge$resetCount(EntityLivingBase var1, ICamera var2, float var3, CallbackInfo var4) {
      this.bridge$countPlayersRendered = 0;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "renderEntities$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderManager;renderEntitySimple$v1_7(Lnet/minecraft/entity/Entity;F)Z")
   )
   private boolean bridge$countRenderedPlayers$v1_7(RenderManager var1, Entity var2, float var3) {
      if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.bridge$countPlayersRendered++;
      }

      return true;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "renderEntities$v1_8",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/RenderGlobal;countEntitiesRendered:I", opcode = 181, ordinal = 0)
   )
   private void bridge$resetCount(Entity var1, ICamera var2, float var3, CallbackInfo var4) {
      this.bridge$countPlayersRendered = 0;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapWithCondition(
      method = "renderEntities$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderManager;renderEntitySimple(Lnet/minecraft/entity/Entity;F)Z")
   )
   private boolean bridge$countRenderedPlayers$v1_8(RenderManager var1, Entity var2, float var3) {
      if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.bridge$countPlayersRendered++;
      }

      return true;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapWithCondition(
      method = "renderEntities$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderManager;renderEntityStatic$v1_12(Lnet/minecraft/entity/Entity;FZ)V")
   )
   private boolean bridge$countRenderedPlayers$v1_12(RenderManager var1, Entity var2, float var3, boolean var4) {
      if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         this.bridge$countPlayersRendered++;
      }

      return true;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderEntities$v1_7", at = @At("HEAD"))
   private void bridge$cacheLastCamera(EntityLivingBase var1, ICamera var2, float var3, CallbackInfo var4) {
      this.bridge$lastCamera = var2;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "setupTerrain$v1_8", at = @At("HEAD"))
   private void bridge$cacheLastCamera(Entity var1, double var2, ICamera var4, int var5, boolean var6, CallbackInfo var7) {
      this.bridge$lastCamera = var4;
   }

   public boolean bridge$isInViewDistance(OHIIIOHIRIRCCRRIOIICCHHIORRHOH var1, OHIIIOHIRIRCCRRIOIICCHHIORRHOH var2) {
      int var3 = this.renderDistanceChunks - 3;
      int var4 = Math.max(0, Math.abs(var2.bridge$getX() - var1.bridge$getX()) - 1);
      int var5 = Math.max(0, Math.abs(var2.bridge$getZ() - var1.bridge$getZ()) - 1);
      long var6 = Math.max(0, Math.max(var4, var5) - 1);
      long var8 = Math.min(var4, var5);
      long var10 = var8 * var8 + var6 * var6;
      return var10 < (long)var3 * var3;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "clipRenderersByFrustum$v1_7", at = @At("RETURN"))
   private void lunar$onClip(CallbackInfo var1) {
      this.lunar$renderChunks.clear();
      BufferBuilder[] var2 = this.worldRenderers$v1_7;
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            BufferBuilder var4 = var2[var3];
            if (var4 != null && var4.isInFrustum$v1_7 && var4.isVisible$v1_7) {
               this.lunar$renderChunks
                  .add(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var4
                  );
            }
         }
      }
   }
}
