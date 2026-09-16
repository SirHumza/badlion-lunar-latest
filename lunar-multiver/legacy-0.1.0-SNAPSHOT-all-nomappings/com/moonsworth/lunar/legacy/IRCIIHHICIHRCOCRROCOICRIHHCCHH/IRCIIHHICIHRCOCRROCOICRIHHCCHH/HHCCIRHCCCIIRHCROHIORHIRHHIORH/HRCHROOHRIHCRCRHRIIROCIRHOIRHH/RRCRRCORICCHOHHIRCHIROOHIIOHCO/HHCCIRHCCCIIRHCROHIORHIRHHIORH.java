package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.block.model.ModelRotation;
import net.minecraft.client.renderer.block.model.SimpleBakedModel;
import net.minecraft.client.renderer.texture.Stitcher;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.EnumFacing;
import org.lwjgl.util.vector.Vector3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(TextureMap.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Unique
   private static final FaceBakery lunar$bakery = new FaceBakery();
   @Shadow
   public int mipmapLevels;
   @Final
   @Shadow
   public Map<String, TextureAtlasSprite> mapUploadedSprites$v1_8;
   @Unique
   private TextureAtlasSprite lunar$barrierSprite = null;

   @Inject(method = "loadTextureAtlas", at = @At("RETURN"))
   private void lunar$onLoad(IResourceManager var1, CallbackInfo var2) {
      if (this == Minecraft.getMinecraft().getTextureMapBlocks()) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               (TextureMap)this
            )
         );
      }
   }

   @WrapOperation(method = "loadTextureAtlas", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/texture/Stitcher;doStitch()V"))
   private void lunar$onLoad(Stitcher var1, Operation<Void> var2) {
      if (this == Minecraft.getMinecraft().getTextureMapBlocks()) {
         TextureAtlasSprite var3 = new TextureAtlasSprite(RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHIHRCRHHOCOCRHIICCHOHICHIRH.toString());
         this.mapUploadedSprites$v1_8.put(var3.getIconName(), var3);
         byte var4 = 64;
         BufferedImage var5 = new BufferedImage(var4, var4, 2);
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var5, var3.iconName, var3.iconName
         );
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
            BufferedImage[] var6 = new BufferedImage[this.mipmapLevels + 1];
            var6[0] = var5;

            try {
               var3.loadSprite$v1_8(var6, null);
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         } else {
            var3.resetSprite();
            var3.width = var5.getWidth();
            var3.height = var5.getHeight();
            int[][] var9 = new int[this.mipmapLevels + 1][];
            var9[0] = new int[var5.getWidth() * var5.getHeight()];
            var5.getRGB(0, 0, var5.getWidth(), var5.getHeight(), var9[0], 0, var5.getWidth());
            var3.framesTextureData$v1_8.add(var9);
         }

         var3.generateMipmaps(this.mipmapLevels);
         var1.addSprite(var3);
         this.lunar$barrierSprite = var3;
      }

      var2.call(new Object[]{var1});
   }

   @Inject(method = "loadTextureAtlas", at = @At("TAIL"))
   private void lunar$onLoadPost(IResourceManager var1, CallbackInfo var2) {
      if (this.lunar$barrierSprite != null) {
         this.lunar$makeBarrierModel(this.lunar$barrierSprite);
         this.lunar$barrierSprite = null;
      }
   }

   @Unique
   private void lunar$makeBarrierModel(TextureAtlasSprite var1) {
      SimpleBakedModel var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 1) {
         HashMap var3 = new HashMap();
         Arrays.stream(EnumFacing.VALUES)
            .map(var2x -> this.lunar$bakeQuad(var2x, var1))
            .forEach(var1x -> var3.put(var1x.getFace(), Collections.singletonList(var1x)));
         var2 = new SimpleBakedModel(Collections.emptyList(), var3, true, true, var1, ItemCameraTransforms.DEFAULT, ItemOverrideList.NONE);
      } else {
         List var4 = Arrays.stream(EnumFacing.VALUES)
            .map(var2x -> this.lunar$bakeQuad(var2x, var1))
            .map(Collections::singletonList)
            .collect(Collectors.toList());
         var2 = new SimpleBakedModel(Collections.emptyList(), var4, true, true, var1, ItemCameraTransforms.DEFAULT);
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO.CHCROHCHROOCIHRCHOHOHIHIHHRHIO = var2;
   }

   @Unique
   private BakedQuad lunar$bakeQuad(EnumFacing var1, TextureAtlasSprite var2) {
      return lunar$bakery.makeBakedQuad(
         new Vector3f(0.0F, 0.0F, 0.0F),
         new Vector3f(16.0F, 16.0F, 16.0F),
         new BlockPartFace(var1, -1, "#" + var1.getName$v1_8(), new BlockFaceUV(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)),
         var2,
         var1,
         ModelRotation.X0_Y0,
         null,
         false,
         true
      );
   }
}
