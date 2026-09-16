package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderItem.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Shadow
   public float zLevel;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   @Final
   public ItemModelMesher itemModelMesher$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Final
   @Shadow
   public TextureManager textureManager$v1_8;
   @Final
   @Shadow
   public static ResourceLocation RES_ITEM_GLINT;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 0)
   @Shadow
   public static boolean renderInFrame$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 0)
   @Shadow
   public RenderBlocks renderBlocksRi$v1_7;
   private boolean renderItemGui = false;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderModel$v1_8(IBakedModel var1, int var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderItemAndEffectIntoGUI$v1_8(ItemStack var1, int var2, int var3);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderItemOverlays$v1_8(FontRenderer var1, ItemStack var2, int var3, int var4);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderItem$v1_8(ItemStack var1, IBakedModel var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderItem$v1_8(ItemStack var1, TransformType var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderModel$v1_8(IBakedModel var1, ItemStack var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void renderEffect$v1_8(IBakedModel var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract boolean shouldRenderItemIn3D$v1_8(ItemStack var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 0)
   @Shadow
   public abstract void renderItemAndEffectIntoGUI$v1_7(FontRenderer var1, TextureManager var2, ItemStack var3, int var4, int var5);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 0)
   @Shadow
   public abstract void renderItemOverlayIntoGUI$v1_7(FontRenderer var1, TextureManager var2, ItemStack var3, int var4, int var5);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 0)
   @Shadow
   public abstract void renderDroppedItem$v1_7(EntityItem var1, IIcon var2, int var3, float var4, float var5, float var6, float var7);

   @Shadow
   public abstract IBakedModel getItemModelWithOverrides$v1_12(ItemStack var1, World var2, EntityLivingBase var3);

   public void bridge$renderModel(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.renderModel$v1_8((IBakedModel)var1, var2);
      } else {
         Tessellator var3 = Tessellator.INSTANCE;
         ItemRenderer.renderItemIn2D$v1_7(var3, 0.0F, 0.0F, 1.0F, 1.0F, 255, 255, var2);
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getItemModelShaper() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.itemModelMesher$v1_8;
      } else {
         throw new RuntimeException("bridge$getItemModelShaper() cannot be called in 1.7!");
      }
   }

   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "optifine")
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getModel(
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2,
      Object var3
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getItemModelWithOverrides$v1_12(
            (ItemStack)var1, (World)var2, (EntityLivingBase)var3
         );
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.itemModelMesher$v1_8
            .getItemModel((ItemStack)var1);
      } else {
         throw new UnsupportedOperationException("unavailable function in 1.7.10");
      }
   }

   public void bridge$renderItem(
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.renderItem$v1_8((ItemStack)var1, (IBakedModel)var2);
      } else {
         throw new UnsupportedOperationException("unavailable function in 1.7.10");
      }
   }

   public void bridge$setZLevel(float var1) {
      this.zLevel = var1;
   }

   public float bridge$getZLevel() {
      return this.zLevel;
   }

   public boolean bridge$shouldRenderItemIn3D(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      ItemStack var2 = (ItemStack)var1;
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.shouldRenderItemIn3D$v1_8(var2)
         : var2.getItemSpriteNumber$v1_7() == 0 && RenderBlocks.renderItemIn3d(Block.getBlockFromItem(var2.getItem()).getRenderType$v1_7());
   }

   public void bridge$renderItemAndEffectIntoGUI(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2, int var3, int var4) {
      this.bridge$renderItemAndEffectIntoGUI(var1, var2, var3, var4, false);
   }

   public void bridge$renderItemAndEffectIntoGUI(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2, int var3, int var4, boolean var5) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.renderItemAndEffectIntoGUI$v1_8((ItemStack)var2, var3, var4);
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         if (var5) {
            this.renderItemOverlays$v1_8(Minecraft.getMinecraft().fontRenderer, (ItemStack)var2, var3, var4);
         }
      } else {
         this.renderItemAndEffectIntoGUI$v1_7(Minecraft.getMinecraft().fontRenderer, Minecraft.getMinecraft().getTextureManager(), (ItemStack)var2, var3, var4);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var5) {
            this.renderItemOverlayIntoGUI$v1_7(Minecraft.getMinecraft().fontRenderer, Minecraft.getMinecraft().getTextureManager(), (ItemStack)var2, var3, var4);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void bridge$renderItemInWorld(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2) {
      this.renderItem$v1_8((ItemStack)var2, TransformType.FIXED);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void bridge$renderDroppedItem(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO var2,
      int var3,
      float var4,
      float var5,
      float var6,
      float var7
   ) {
      ItemStack var8 = ((EntityItem)var1).getEntityItem$v1_7();
      Block var9 = Block.getBlockFromItem(var8.getItem());
      if (var8.getItemSpriteNumber$v1_7() == 0 && RenderBlocks.renderItemIn3d(var9.getRenderType$v1_7())) {
         this.renderBlocksRi$v1_7.renderBlockAsItem(var9, ((IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1.bridge$getItemState()).bridge$getItemDamage(), 1.0F);
      } else {
         renderInFrame$v1_7 = true;
         this.renderDroppedItem$v1_7((EntityItem)var1, (IIcon)var2, var3, var4, var5, var6, var7);
         renderInFrame$v1_7 = false;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderItem$v1_8(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", shift = Shift.BEFORE),
      cancellable = true
   )
   public void impl$renderItem(ItemStack var1, IBakedModel var2, CallbackInfo var3) {
      if (!var2.isBuiltInRenderer()) {
         GlStateManager.translate(-0.5F, -0.5F, -0.5F);
         Optional var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR();
         if (var4.isPresent()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4.get();
            if (var5.getConfig().hasCustomItems()) {
               Optional var6 = var5.getCustomItems();
               if (var6.isPresent()) {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var7 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var6.get();
                  RCIROOOOICRHCCRRCIORHHIRCOIIIC var8 = this.bridge$getModelLocation();
                  Optional var9 = var7.getCustomItemModel(
                     (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1,
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2,
                     var8,
                     false
                  );
                  if (var9.isPresent()) {
                     var2 = (IBakedModel)var9.get();
                  }
               }
            }
         }

         boolean var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
               .isEnabled()
            && this.renderItemGui
            && var1.getItem() != null
            && var1.getItem() instanceof ItemPotion
            && var1.hasEffect();
         if (!var10
            || !(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
               .IHOCHRIHHIRHIIRROCCIHRRCORIIII()
               .get()) {
            this.renderModel$v1_8(var2, var1);
         }

         if (var10) {
            GlStateManager.pushMatrix();
            this.renderPotion_v1_8(
               var2,
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
                  .HCHRIROHHHCORIOCROOCHRCIOROOCI((IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1)
            );
            GlStateManager.popMatrix();
         }

         if (var10
            && (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
               .IHOCHRIHHIRHIIRROCCIHRRCORIIII()
               .get()) {
            this.renderModel$v1_8(var2, var1);
         }

         IBakedModel var11 = var2;
         boolean var12 = var4.<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH>flatMap(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH::getCustomItems
            )
            .map(
               var3x -> var3x.renderCustomEffect(
                  this,
                  (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var11
               )
            )
            .orElse(false);
         if (!var10 && var1.hasEffect() && !var12) {
            this.textureManager$v1_8.bindTexture(RES_ITEM_GLINT);
            ORHIOICIOCRRHOOCOHRORIHICHRCRR var13 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  ORHIOICIOCRRHOOCOHRORIHICHRCRR.class,
                  () -> {
                     com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3x = this.renderItemGui
                        ? com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GUI
                        : com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ITEM;
                     return new ORHIOICIOCRRHOOCOHRORIHICHRCRR(
                        var3x,
                        var2xx -> this.renderModel$v1_8(var11, var2xx),
                        (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var11,
                        null,
                        (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1,
                        OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
                     );
                  }
               );
            this.textureManager$v1_8.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            if (var13 != null && var13.isCancelled()) {
               GlStateManager.popMatrix();
               var3.cancel();
               return;
            }

            this.renderEffect$v1_8(var2);
         }

         GlStateManager.popMatrix();
         var3.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "renderItemIntoGUI$v1_8(Lnet/minecraft/item/ItemStack;II)V", at = @At("HEAD"))
   public void impl$renderItemIntoGui$HEAD(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      this.renderItemGui = true;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "renderItemIntoGUI$v1_8(Lnet/minecraft/item/ItemStack;II)V", at = @At("TAIL"))
   public void impl$renderItemIntoGui$TAIL(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      this.renderItemGui = false;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   private void renderPotion_v1_8(IBakedModel var1, int var2) {
      double var3 = 1.25;
      double var5 = -0.1;
      double var7 = -0.1;
      GlStateManager.depthMask(false);
      GlStateManager.disableLighting();
      GlStateManager.blendFunc(768, 1);
      if ((Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
         .IHIOICOHCIHICROOOORHIHROICCRIR()
         .get()) {
         GlStateManager.scale(var3, var3, var3);
         GlStateManager.translate(var7, var5, 0.0);
      }

      this.textureManager$v1_8.bindTexture(RES_ITEM_GLINT);
      GlStateManager.matrixMode(5890);
      GlStateManager.pushMatrix();
      GlStateManager.scale(8.0F, 8.0F, 8.0F);
      float var9 = (float)(Minecraft.getSystemTime() % 3000L) / 3000.0F / 8.0F;
      GlStateManager.translate(var9, 0.0F, 0.0F);
      GlStateManager.rotate(-50.0F, 0.0F, 0.0F, 1.0F);
      this.renderModel$v1_8(var1, var2);
      GlStateManager.popMatrix();
      GlStateManager.pushMatrix();
      GlStateManager.scale(8.0F, 8.0F, 8.0F);
      float var10 = (float)(Minecraft.getSystemTime() % 4873L) / 4873.0F / 8.0F;
      GlStateManager.translate(-var10, 0.0F, 0.0F);
      GlStateManager.rotate(10.0F, 0.0F, 0.0F, 1.0F);
      this.renderModel$v1_8(var1, var2);
      GlStateManager.popMatrix();
      GlStateManager.matrixMode(5888);
      GlStateManager.blendFunc(770, 771);
      GlStateManager.enableLighting();
      GlStateManager.depthMask(true);
      this.textureManager$v1_8.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
   }
}
