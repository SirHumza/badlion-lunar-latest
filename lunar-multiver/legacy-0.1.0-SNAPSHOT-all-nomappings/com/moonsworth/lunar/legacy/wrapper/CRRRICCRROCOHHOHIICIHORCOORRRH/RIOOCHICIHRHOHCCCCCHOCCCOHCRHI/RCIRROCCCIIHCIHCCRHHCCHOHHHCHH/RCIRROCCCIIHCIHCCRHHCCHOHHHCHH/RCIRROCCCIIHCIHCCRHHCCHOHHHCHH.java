package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.block.model.SimpleBakedModel.Builder;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final float HICHHHHRICHOORIHORIHHHOHOHCRCC = 3.0E-4F;
   private static final float OCIHHICHIHIHOCIRRRCHCHHHIIRRCR = 4.5E-4F;
   private static final float COHCIOHCROCHCRIRIIORHCRORICHRO = 0.5F;
   private static final float COCIRCIIRIHIRIICOHCRHICIOIRRCR = 0.5F;

   public static IBakedModel RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ModelBakery var0, TextureMap var1, ModelBlock var2) {
      TextureAtlasSprite var3;
      if (var2.isTexturePresent("particle")) {
         var3 = var1.getAtlasSprite(new ResourceLocation(var2.resolveTextureName("particle")).toString());
      } else {
         var3 = null;
      }

      Builder var4;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var4 = new Builder(false, false, var2.getAllTransforms(), var2.createOverrides$v1_12());
      } else {
         ModelBlock var5 = new ModelBlock(Collections.emptyList(), Collections.emptyMap(), false, false, var2.getAllTransforms());
         var4 = new Builder(var5);
      }

      for (int var11 = 0; var11 < ItemModelGenerator.LAYERS.size(); var11++) {
         String var6 = (String)ItemModelGenerator.LAYERS.get(var11);
         if (!var2.isTexturePresent(var6)) {
            break;
         }

         String var7 = var2.resolveTextureName(var6);
         TextureAtlasSprite var8 = var1.getAtlasSprite(new ResourceLocation(var7).toString());
         if (var11 == 0 & var3 == null) {
            var3 = var8;
         }

         UnmodifiableIterator var9 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var11, var8).iterator();

         while (var9.hasNext()) {
            BakedQuad var10 = (BakedQuad)var9.next();
            var4.addGeneralQuad(var10);
         }
      }

      if (var3 == null) {
         var3 = var1.getAtlasSprite(new ResourceLocation("missingno").toString());
      }

      var4.setTexture(var3);
      return var4.makeBakedModel();
   }

   public static ImmutableList<BakedQuad> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ModelBakery var0, int var1, TextureAtlasSprite var2) {
      FaceBakery var3 = var0.faceBakery;
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var3
      );
      com.google.common.collect.ImmutableList.Builder var5 = ImmutableList.builder();
      int var6 = var2.getIconWidth();
      int var7 = var2.getIconHeight();
      BitSet var8 = new BitSet((var6 + 1) * (var7 + 1) * 4);

      for (int var9 = 0; var9 < var2.getFrameCount(); var9++) {
         int[] var10 = var2.getFrameTextureData(var9)[0];
         boolean[] var12 = new boolean[var6];
         Arrays.fill(var12, true);

         for (int var13 = 0; var13 < var7; var13++) {
            boolean var11 = true;

            for (int var14 = 0; var14 < var6; var14++) {
               boolean var15 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var6, var7, var14, var13);
               if (var11 && !var15) {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4,
                     var5,
                     var8,
                     com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WEST,
                     var1,
                     var2,
                     var6,
                     var7,
                     var14,
                     var13
                  );
               }

               if (!var11 && var15) {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4,
                     var5,
                     var8,
                     com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.EAST,
                     var1,
                     var2,
                     var6,
                     var7,
                     var14,
                     var13
                  );
               }

               if (var12[var14] && !var15) {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4,
                     var5,
                     var8,
                     com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.UP,
                     var1,
                     var2,
                     var6,
                     var7,
                     var14,
                     var13
                  );
               }

               if (!var12[var14] && var15) {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4,
                     var5,
                     var8,
                     com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN,
                     var1,
                     var2,
                     var6,
                     var7,
                     var14,
                     var13
                  );
               }

               var11 = var15;
               var12[var14] = var15;
            }

            if (!var11) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var4,
                  var5,
                  var8,
                  com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.EAST,
                  var1,
                  var2,
                  var6,
                  var7,
                  var6,
                  var13
               );
            }
         }

         for (int var16 = 0; var16 < var6; var16++) {
            if (!var12[var16]) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var4,
                  var5,
                  var8,
                  com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN,
                  var1,
                  var2,
                  var6,
                  var7,
                  var16,
                  var7
               );
            }
         }
      }

      var5.add(
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EnumFacing.NORTH,
            var2,
            var1,
            0.0F,
            0.0F,
            0.46875F,
            var2.getMinU(),
            var2.getMaxV(),
            0.0F,
            1.0F,
            0.46875F,
            var2.getMinU(),
            var2.getMinV(),
            1.0F,
            1.0F,
            0.46875F,
            var2.getMaxU(),
            var2.getMinV(),
            1.0F,
            0.0F,
            0.46875F,
            var2.getMaxU(),
            var2.getMaxV()
         )
      );
      var5.add(
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EnumFacing.SOUTH,
            var2,
            var1,
            0.0F,
            0.0F,
            0.53125F,
            var2.getMinU(),
            var2.getMaxV(),
            1.0F,
            0.0F,
            0.53125F,
            var2.getMaxU(),
            var2.getMaxV(),
            1.0F,
            1.0F,
            0.53125F,
            var2.getMaxU(),
            var2.getMinV(),
            0.0F,
            1.0F,
            0.53125F,
            var2.getMinU(),
            var2.getMinV()
         )
      );
      return var5.build();
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var0, int var1, int var2, int var3, int var4) {
      return (var0[var3 + (var2 - 1 - var4) * var1] >> 24 & 0xFF) == 0;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      com.google.common.collect.ImmutableList.Builder<BakedQuad> var1,
      BitSet var2,
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      int var4,
      TextureAtlasSprite var5,
      int var6,
      int var7,
      int var8,
      int var9
   ) {
      int var10 = var3.ordinal();
      int var11 = (var7 + 1) * ((var6 + 1) * var10 + var8) + var9;
      if (!var2.get(var11)) {
         var2.set(var11);
         var1.add(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3, var4, var5, var8, var9));
      }
   }

   private static BakedQuad RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      TextureAtlasSprite var3,
      int var4,
      int var5
   ) {
      float var6 = (float)var4 / var3.getIconWidth();
      float var7 = (float)var5 / var3.getIconHeight();
      float var8;
      float var9;
      if (var1
            != com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WEST
         && var1
            != com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.EAST
         )
       {
         var8 = (var4 + 1.0F) / var3.getIconWidth();
         var9 = var7;
      } else {
         var8 = var6;
         var9 = (var5 + 1.0F) / var3.getIconHeight();
      }

      float var10 = 16.0F * (var6 - var1.getFacing().getDirectionVec$v1_8().getX$v1_8() * 0.5F / var3.getIconWidth());
      float var11 = 16.0F * (var8 - var1.getFacing().getDirectionVec$v1_8().getX$v1_8() * 0.5F / var3.getIconWidth());
      float var12 = 16.0F * (1.0F - var7 - var1.getFacing().getDirectionVec$v1_8().getY$v1_8() * 0.5F / var3.getIconHeight());
      float var13 = 16.0F * (1.0F - var9 - var1.getFacing().getDirectionVec$v1_8().getY$v1_8() * 0.5F / var3.getIconHeight());
      switch (var1) {
         case WEST:
         case EAST:
            var7 -= 4.5E-4F;
            var9 += 4.5E-4F;
            var12 -= 0.5F / var3.getIconHeight();
            var13 += 0.5F / var3.getIconHeight();
            break;
         case DOWN:
         case UP:
            var6 -= 4.5E-4F;
            var8 += 4.5E-4F;
            var10 += 0.5F / var3.getIconWidth();
            var11 -= 0.5F / var3.getIconWidth();
      }

      switch (var1) {
         case WEST:
            var6 += 3.0E-4F;
            var8 += 3.0E-4F;
            break;
         case EAST:
            var6 -= 3.0E-4F;
            var8 -= 3.0E-4F;
            break;
         case DOWN:
            var7 -= 3.0E-4F;
            var9 -= 3.0E-4F;
            break;
         case UP:
            var7 += 3.0E-4F;
            var9 += 3.0E-4F;
      }

      float var14;
      float var15;
      if (var1
            != com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WEST
         && var1
            != com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN
         )
       {
         var14 = 0.4683F;
         var15 = 0.5317F;
      } else {
         var14 = 0.5317F;
         var15 = 0.4683F;
      }

      return var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getFacing().getOpposite$v1_8(),
         var3,
         var2,
         var6,
         var7,
         var14,
         var3.getInterpolatedU(var10),
         var3.getInterpolatedV(var12),
         var8,
         var9,
         var14,
         var3.getInterpolatedU(var11),
         var3.getInterpolatedV(var13),
         var8,
         var9,
         var15,
         var3.getInterpolatedU(var11),
         var3.getInterpolatedV(var13),
         var6,
         var7,
         var15,
         var3.getInterpolatedU(var10),
         var3.getInterpolatedV(var12)
      );
   }

   private enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      DOWN(EnumFacing.DOWN),
      UP(EnumFacing.UP),
      WEST(EnumFacing.WEST),
      EAST(EnumFacing.EAST);

      private final EnumFacing enumFacing;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(EnumFacing var3) {
         this.enumFacing = var3;
      }

      EnumFacing getFacing() {
         return this.enumFacing;
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final FaceBakery RICRHRIORCHRRHCOROOCHCCICRCHIC;
      private final int OIHCICOIHIICIOCHHHRRRRHRHOCRRH;
      private final int IOICCORHCOORHHOHCRCIOHROHHCIII;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FaceBakery var1) {
         boolean var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
            .map(HHCCIRHCCCIIRHCROHIORHIRHHIORH::getConfig)
            .<Boolean>map(CRRRICCRROCOHHOHIICIHORCOORRRH::hasShaders)
            .orElse(false);
         this.RICRHRIORCHRRHCOROOCHCCICRCHIC = var1;
         this.OIHCICOIHIICIOCHHHRRRRHRHOCRRH = var2 ? 56 : 28;
         this.IOICCORHCOORHHOHCRCIOHROHHCIII = this.OIHCICOIHIICIOCHHHRRRRHRHOCRRH / 4;
      }

      private BakedQuad RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         EnumFacing var1,
         TextureAtlasSprite var2,
         int var3,
         float var4,
         float var5,
         float var6,
         float var7,
         float var8,
         float var9,
         float var10,
         float var11,
         float var12,
         float var13,
         float var14,
         float var15,
         float var16,
         float var17,
         float var18,
         float var19,
         float var20,
         float var21,
         float var22,
         float var23
      ) {
         int[] var24 = new int[this.OIHCICOIHIICIOCHHHRRRRHRHOCRRH];
         int var25 = this.RICRHRIORCHRRHCOROOCHCCICRCHIC.getFaceShadeColor(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24, 0, var4, var5, var6, var25, var7, var8);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24, 1, var9, var10, var11, var25, var12, var13);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24, 2, var14, var15, var16, var25, var17, var18);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24, 3, var19, var20, var21, var25, var22, var23);
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? new BakedQuad(var24, var3, var1, var2) : new BakedQuad(var24, var3, var1);
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var1, int var2, float var3, float var4, float var5, int var6, float var7, float var8) {
         int var9 = var2 * this.IOICCORHCOORHHOHCRCIOHROHHCIII;
         var1[var9] = Float.floatToRawIntBits(var3);
         var1[var9 + 1] = Float.floatToRawIntBits(var4);
         var1[var9 + 2] = Float.floatToRawIntBits(var5);
         var1[var9 + 3] = var6;
         var1[var9 + 4] = Float.floatToRawIntBits(var7);
         var1[var9 + 5] = Float.floatToRawIntBits(var8);
      }
   }
}
