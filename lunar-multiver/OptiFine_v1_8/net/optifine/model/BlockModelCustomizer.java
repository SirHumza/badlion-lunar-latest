package net.optifine.model;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.optifine.BetterGrass;
import net.optifine.ConnectedTextures;
import net.optifine.NaturalTextures;
import net.optifine.SmartLeaves;
import net.optifine.render.RenderEnv;

public class BlockModelCustomizer {
   private static final List<bgg> NO_QUADS = ImmutableList.of();

   public static boq getRenderModel(boq modelIn, alz stateIn, RenderEnv renderEnv) {
      if (renderEnv.isSmartLeaves()) {
         modelIn = SmartLeaves.getLeavesModel(modelIn, stateIn);
      }

      return modelIn;
   }

   public static List<bgg> getRenderQuads(List<bgg> quads, adq worldIn, alz stateIn, cj posIn, cq enumfacing, adf layer, long rand, RenderEnv renderEnv) {
      if (enumfacing != null) {
         if (renderEnv.isSmartLeaves() && SmartLeaves.isSameLeaves(worldIn.p(posIn.a(enumfacing)), stateIn)) {
            return NO_QUADS;
         }

         if (!renderEnv.isBreakingAnimation(quads) && Config.isBetterGrass()) {
            quads = BetterGrass.getFaceQuads(worldIn, stateIn, posIn, enumfacing, quads);
         }
      }

      List<bgg> quadsNew = renderEnv.getListQuadsCustomizer();
      quadsNew.clear();

      for (int i = 0; i < quads.size(); i++) {
         bgg quad = quads.get(i);
         bgg[] quadArr = getRenderQuads(quad, worldIn, stateIn, posIn, enumfacing, rand, renderEnv);
         if (i == 0 && quads.size() == 1 && quadArr.length == 1 && quadArr[0] == quad && quad.getQuadEmissive() == null) {
            return quads;
         }

         for (int q = 0; q < quadArr.length; q++) {
            bgg quadSingle = quadArr[q];
            quadsNew.add(quadSingle);
            if (quadSingle.getQuadEmissive() != null) {
               renderEnv.getListQuadsOverlay(getEmissiveLayer(layer)).addQuad(quadSingle.getQuadEmissive(), stateIn);
               renderEnv.setOverlaysRendered(true);
            }
         }
      }

      return quadsNew;
   }

   private static adf getEmissiveLayer(adf layer) {
      return layer != null && layer != adf.a ? layer : adf.b;
   }

   private static bgg[] getRenderQuads(bgg quad, adq worldIn, alz stateIn, cj posIn, cq enumfacing, long rand, RenderEnv renderEnv) {
      if (renderEnv.isBreakingAnimation(quad)) {
         return renderEnv.getArrayQuadsCtm(quad);
      }

      bgg quadOriginal = quad;
      if (Config.isConnectedTextures()) {
         bgg[] quads = ConnectedTextures.getConnectedTexture(worldIn, stateIn, posIn, quad, renderEnv);
         if (quads.length != 1 || quads[0] != quad) {
            return quads;
         }
      }

      if (Config.isNaturalTextures()) {
         quad = NaturalTextures.getNaturalTexture(posIn, quad);
         if (quad != quadOriginal) {
            return renderEnv.getArrayQuadsCtm(quad);
         }
      }

      return renderEnv.getArrayQuadsCtm(quad);
   }
}
