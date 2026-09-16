package net.optifine;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import net.optifine.config.Matches;
import net.optifine.model.BlockModelUtils;
import net.optifine.model.ListQuadsOverlay;
import net.optifine.reflect.Reflector;
import net.optifine.render.RenderEnv;
import net.optifine.util.PropertiesOrdered;
import net.optifine.util.ResUtils;
import net.optifine.util.TileEntityUtils;

public class ConnectedTextures {
   private static Map[] spriteQuadMaps = null;
   private static Map[] spriteQuadFullMaps = null;
   private static Map[][] spriteQuadCompactMaps = (Map[][])null;
   private static ConnectedProperties[][] blockProperties = (ConnectedProperties[][])null;
   private static ConnectedProperties[][] tileProperties = (ConnectedProperties[][])null;
   private static boolean multipass = false;
   protected static final int UNKNOWN = -1;
   protected static final int Y_NEG_DOWN = 0;
   protected static final int Y_POS_UP = 1;
   protected static final int Z_NEG_NORTH = 2;
   protected static final int Z_POS_SOUTH = 3;
   protected static final int X_NEG_WEST = 4;
   protected static final int X_POS_EAST = 5;
   private static final int Y_AXIS = 0;
   private static final int Z_AXIS = 1;
   private static final int X_AXIS = 2;
   public static final alz AIR_DEFAULT_STATE = afi.a.Q();
   private static bmi emptySprite = null;
   private static final BlockDir[] SIDES_Y_NEG_DOWN = new BlockDir[]{BlockDir.WEST, BlockDir.EAST, BlockDir.NORTH, BlockDir.SOUTH};
   private static final BlockDir[] SIDES_Y_POS_UP = new BlockDir[]{BlockDir.WEST, BlockDir.EAST, BlockDir.SOUTH, BlockDir.NORTH};
   private static final BlockDir[] SIDES_Z_NEG_NORTH = new BlockDir[]{BlockDir.EAST, BlockDir.WEST, BlockDir.DOWN, BlockDir.UP};
   private static final BlockDir[] SIDES_Z_POS_SOUTH = new BlockDir[]{BlockDir.WEST, BlockDir.EAST, BlockDir.DOWN, BlockDir.UP};
   private static final BlockDir[] SIDES_X_NEG_WEST = new BlockDir[]{BlockDir.NORTH, BlockDir.SOUTH, BlockDir.DOWN, BlockDir.UP};
   private static final BlockDir[] SIDES_X_POS_EAST = new BlockDir[]{BlockDir.SOUTH, BlockDir.NORTH, BlockDir.DOWN, BlockDir.UP};
   private static final BlockDir[] SIDES_Z_NEG_NORTH_Z_AXIS = new BlockDir[]{BlockDir.WEST, BlockDir.EAST, BlockDir.UP, BlockDir.DOWN};
   private static final BlockDir[] SIDES_X_POS_EAST_X_AXIS = new BlockDir[]{BlockDir.NORTH, BlockDir.SOUTH, BlockDir.UP, BlockDir.DOWN};
   private static final BlockDir[] EDGES_Y_NEG_DOWN = new BlockDir[]{BlockDir.NORTH_EAST, BlockDir.NORTH_WEST, BlockDir.SOUTH_EAST, BlockDir.SOUTH_WEST};
   private static final BlockDir[] EDGES_Y_POS_UP = new BlockDir[]{BlockDir.SOUTH_EAST, BlockDir.SOUTH_WEST, BlockDir.NORTH_EAST, BlockDir.NORTH_WEST};
   private static final BlockDir[] EDGES_Z_NEG_NORTH = new BlockDir[]{BlockDir.DOWN_WEST, BlockDir.DOWN_EAST, BlockDir.UP_WEST, BlockDir.UP_EAST};
   private static final BlockDir[] EDGES_Z_POS_SOUTH = new BlockDir[]{BlockDir.DOWN_EAST, BlockDir.DOWN_WEST, BlockDir.UP_EAST, BlockDir.UP_WEST};
   private static final BlockDir[] EDGES_X_NEG_WEST = new BlockDir[]{BlockDir.DOWN_SOUTH, BlockDir.DOWN_NORTH, BlockDir.UP_SOUTH, BlockDir.UP_NORTH};
   private static final BlockDir[] EDGES_X_POS_EAST = new BlockDir[]{BlockDir.DOWN_NORTH, BlockDir.DOWN_SOUTH, BlockDir.UP_NORTH, BlockDir.UP_SOUTH};
   private static final BlockDir[] EDGES_Z_NEG_NORTH_Z_AXIS = new BlockDir[]{BlockDir.UP_EAST, BlockDir.UP_WEST, BlockDir.DOWN_EAST, BlockDir.DOWN_WEST};
   private static final BlockDir[] EDGES_X_POS_EAST_X_AXIS = new BlockDir[]{BlockDir.UP_SOUTH, BlockDir.UP_NORTH, BlockDir.DOWN_SOUTH, BlockDir.DOWN_NORTH};
   public static final bmi SPRITE_DEFAULT = new bmi("<default>");

   public static bgg[] getConnectedTexture(adq blockAccess, alz blockState, cj blockPos, bgg quad, RenderEnv renderEnv) {
      bmi spriteIn = quad.getSprite();
      if (spriteIn == null) {
         return renderEnv.getArrayQuadsCtm(quad);
      } else {
         afh block = blockState.c();
         if (skipConnectedTexture(blockAccess, blockState, blockPos, quad, renderEnv)) {
            quad = getQuad(emptySprite, quad);
            return renderEnv.getArrayQuadsCtm(quad);
         } else {
            cq side = quad.d();
            return getConnectedTextureMultiPass(blockAccess, blockState, blockPos, side, quad, renderEnv);
         }
      }
   }

   private static boolean skipConnectedTexture(adq blockAccess, alz blockState, cj blockPos, bgg quad, RenderEnv renderEnv) {
      afh block = blockState.c();
      if (block instanceof akd) {
         bmi spriteIn = quad.getSprite();
         if (spriteIn.i().startsWith("minecraft:blocks/glass_pane_top")) {
            alz stateNeighbour = blockAccess.p(blockPos.a(quad.d()));
            return stateNeighbour == blockState;
         }
      }

      if (block instanceof akd) {
         cq face = quad.d();
         if (face != cq.b && face != cq.a) {
            return false;
         }

         if (!quad.isFaceQuad()) {
            return false;
         }

         cj posNeighbour = blockPos.a(quad.d());
         alz stateNeighbour = blockAccess.p(posNeighbour);
         if (stateNeighbour.c() != block) {
            return false;
         }

         if (block == afi.cH && stateNeighbour.b(ajt.a) != blockState.b(ajt.a)) {
            return false;
         }

         stateNeighbour = stateNeighbour.c().a(stateNeighbour, blockAccess, posNeighbour);
         double midX = quad.getMidX();
         if (midX < 0.4) {
            if ((Boolean)stateNeighbour.b(akd.P)) {
               return true;
            }
         } else if (midX > 0.6) {
            if ((Boolean)stateNeighbour.b(akd.N)) {
               return true;
            }
         } else {
            double midZ = quad.getMidZ();
            if (midZ < 0.4) {
               if ((Boolean)stateNeighbour.b(akd.b)) {
                  return true;
               }
            } else {
               if (!(midZ > 0.6)) {
                  return true;
               }

               if ((Boolean)stateNeighbour.b(akd.O)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   protected static bgg[] getQuads(bmi sprite, bgg quadIn, RenderEnv renderEnv) {
      if (sprite == null) {
         return null;
      }

      if (sprite == SPRITE_DEFAULT) {
         return renderEnv.getArrayQuadsCtm(quadIn);
      }

      bgg quad = getQuad(sprite, quadIn);
      return renderEnv.getArrayQuadsCtm(quad);
   }

   private static synchronized bgg getQuad(bmi sprite, bgg quadIn) {
      if (spriteQuadMaps == null) {
         return quadIn;
      }

      int spriteIndex = sprite.getIndexInMap();
      if (spriteIndex >= 0 && spriteIndex < spriteQuadMaps.length) {
         Map quadMap = spriteQuadMaps[spriteIndex];
         if (quadMap == null) {
            quadMap = new IdentityHashMap(1);
            spriteQuadMaps[spriteIndex] = quadMap;
         }

         bgg quad = (bgg)quadMap.get(quadIn);
         if (quad == null) {
            quad = makeSpriteQuad(quadIn, sprite);
            quadMap.put(quadIn, quad);
         }

         return quad;
      } else {
         return quadIn;
      }
   }

   private static synchronized bgg getQuadFull(bmi sprite, bgg quadIn, int tintIndex) {
      if (spriteQuadFullMaps == null) {
         return null;
      }

      if (sprite == null) {
         return null;
      }

      int spriteIndex = sprite.getIndexInMap();
      if (spriteIndex >= 0 && spriteIndex < spriteQuadFullMaps.length) {
         Map quadMap = spriteQuadFullMaps[spriteIndex];
         if (quadMap == null) {
            quadMap = new EnumMap(cq.class);
            spriteQuadFullMaps[spriteIndex] = quadMap;
         }

         cq face = quadIn.d();
         bgg quad = (bgg)quadMap.get(face);
         if (quad == null) {
            quad = BlockModelUtils.makeBakedQuad(face, sprite, tintIndex);
            quadMap.put(face, quad);
         }

         return quad;
      } else {
         return null;
      }
   }

   private static bgg makeSpriteQuad(bgg quad, bmi sprite) {
      int[] data = (int[])quad.a().clone();
      bmi spriteFrom = quad.getSprite();

      for (int i = 0; i < 4; i++) {
         fixVertex(data, i, spriteFrom, sprite);
      }

      return new bgg(data, quad.c(), quad.d(), sprite);
   }

   private static void fixVertex(int[] data, int vertex, bmi spriteFrom, bmi spriteTo) {
      int mul = data.length / 4;
      int pos = mul * vertex;
      float u = Float.intBitsToFloat(data[pos + 4]);
      float v = Float.intBitsToFloat(data[pos + 4 + 1]);
      double su16 = spriteFrom.getSpriteU16(u);
      double sv16 = spriteFrom.getSpriteV16(v);
      data[pos + 4] = Float.floatToRawIntBits(spriteTo.a(su16));
      data[pos + 4 + 1] = Float.floatToRawIntBits(spriteTo.b(sv16));
   }

   private static bgg[] getConnectedTextureMultiPass(adq blockAccess, alz blockState, cj blockPos, cq side, bgg quad, RenderEnv renderEnv) {
      bgg[] quads = getConnectedTextureSingle(blockAccess, blockState, blockPos, side, quad, true, 0, renderEnv);
      if (!multipass) {
         return quads;
      }

      if (quads.length == 1 && quads[0] == quad) {
         return quads;
      }

      List<bgg> listQuads = renderEnv.getListQuadsCtmMultipass(quads);

      for (int q = 0; q < listQuads.size(); q++) {
         bgg newQuad = listQuads.get(q);
         bgg mpQuad = newQuad;

         for (int i = 0; i < 3; i++) {
            bgg[] newMpQuads = getConnectedTextureSingle(blockAccess, blockState, blockPos, side, mpQuad, false, i + 1, renderEnv);
            if (newMpQuads.length != 1 || newMpQuads[0] == mpQuad) {
               break;
            }

            mpQuad = newMpQuads[0];
         }

         listQuads.set(q, mpQuad);
      }

      for (int i = 0; i < quads.length; i++) {
         quads[i] = listQuads.get(i);
      }

      return quads;
   }

   public static bgg[] getConnectedTextureSingle(
      adq blockAccess, alz blockState, cj blockPos, cq facing, bgg quad, boolean checkBlocks, int pass, RenderEnv renderEnv
   ) {
      afh block = blockState.c();
      if (!(blockState instanceof aly)) {
         return renderEnv.getArrayQuadsCtm(quad);
      }

      aly blockStateBase = (aly)blockState;
      bmi icon = quad.getSprite();
      if (tileProperties != null) {
         int iconId = icon.getIndexInMap();
         if (iconId >= 0 && iconId < tileProperties.length) {
            ConnectedProperties[] cps = tileProperties[iconId];
            if (cps != null) {
               int side = getSide(facing);

               for (int i = 0; i < cps.length; i++) {
                  ConnectedProperties cp = cps[i];
                  if (cp != null && cp.matchesBlockId(blockStateBase.getBlockId())) {
                     bgg[] newQuads = getConnectedTexture(cp, blockAccess, blockStateBase, blockPos, side, quad, pass, renderEnv);
                     if (newQuads != null) {
                        return newQuads;
                     }
                  }
               }
            }
         }
      }

      if (blockProperties != null && checkBlocks) {
         int blockId = renderEnv.getBlockId();
         if (blockId >= 0 && blockId < blockProperties.length) {
            ConnectedProperties[] cps = blockProperties[blockId];
            if (cps != null) {
               int side = getSide(facing);

               for (int i = 0; i < cps.length; i++) {
                  ConnectedProperties cp = cps[i];
                  if (cp != null && cp.matchesIcon(icon)) {
                     bgg[] newQuads = getConnectedTexture(cp, blockAccess, blockStateBase, blockPos, side, quad, pass, renderEnv);
                     if (newQuads != null) {
                        return newQuads;
                     }
                  }
               }
            }
         }
      }

      return renderEnv.getArrayQuadsCtm(quad);
   }

   public static int getSide(cq facing) {
      if (facing == null) {
         return -1;
      }

      switch (facing) {
         case a:
            return 0;
         case b:
            return 1;
         case f:
            return 5;
         case e:
            return 4;
         case c:
            return 2;
         case d:
            return 3;
         default:
            return -1;
      }
   }

   private static cq getFacing(int side) {
      switch (side) {
         case 0:
            return cq.a;
         case 1:
            return cq.b;
         case 2:
            return cq.c;
         case 3:
            return cq.d;
         case 4:
            return cq.e;
         case 5:
            return cq.f;
         default:
            return cq.b;
      }
   }

   private static bgg[] getConnectedTexture(
      ConnectedProperties cp, adq blockAccess, aly blockState, cj blockPos, int side, bgg quad, int pass, RenderEnv renderEnv
   ) {
      int vertAxis = 0;
      int metadata = blockState.getMetadata();
      int metadataCheck = metadata;
      afh block = blockState.c();
      if (block instanceof ajg) {
         vertAxis = getWoodAxis(side, metadata);
         if (cp.getMetadataMax() <= 3) {
            metadataCheck &= 3;
         }
      }

      if (block instanceof aiw) {
         vertAxis = getQuartzAxis(side, metadata);
         if (cp.getMetadataMax() <= 2 && metadataCheck > 2) {
            metadataCheck = 2;
         }
      }

      if (!cp.matchesBlock(blockState.getBlockId(), metadataCheck)) {
         return null;
      }

      if (side >= 0 && cp.faces != 63) {
         int sideCheck = side;
         if (vertAxis != 0) {
            sideCheck = fixSideByAxis(side, vertAxis);
         }

         if ((1 << sideCheck & cp.faces) == 0) {
            return null;
         }
      }

      int y = blockPos.o();
      if (cp.heights != null && !cp.heights.isInRange(y)) {
         return null;
      }

      if (cp.biomes != null) {
         ady blockBiome = blockAccess.b(blockPos);
         if (!cp.matchesBiome(blockBiome)) {
            return null;
         }
      }

      if (cp.nbtName != null) {
         String name = TileEntityUtils.getTileEntityName(blockAccess, blockPos);
         if (!cp.nbtName.matchesValue(name)) {
            return null;
         }
      }

      bmi icon = quad.getSprite();
      switch (cp.method) {
         case 1:
            return getQuads(getConnectedTextureCtm(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata, renderEnv), quad, renderEnv);
         case 2:
            return getQuads(getConnectedTextureHorizontal(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata), quad, renderEnv);
         case 3:
            return getQuads(getConnectedTextureTop(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata), quad, renderEnv);
         case 4:
            return getQuads(getConnectedTextureRandom(cp, blockAccess, blockState, blockPos, side), quad, renderEnv);
         case 5:
            return getQuads(getConnectedTextureRepeat(cp, blockPos, side), quad, renderEnv);
         case 6:
            return getQuads(getConnectedTextureVertical(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata), quad, renderEnv);
         case 7:
            return getQuads(getConnectedTextureFixed(cp), quad, renderEnv);
         case 8:
            return getQuads(getConnectedTextureHorizontalVertical(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata), quad, renderEnv);
         case 9:
            return getQuads(getConnectedTextureVerticalHorizontal(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata), quad, renderEnv);
         case 10:
            if (pass == 0) {
               return getConnectedTextureCtmCompact(cp, blockAccess, blockState, blockPos, vertAxis, side, quad, metadata, renderEnv);
            }
         default:
            return null;
         case 11:
            return getConnectedTextureOverlay(cp, blockAccess, blockState, blockPos, vertAxis, side, quad, metadata, renderEnv);
         case 12:
            return getConnectedTextureOverlayFixed(cp, quad, renderEnv);
         case 13:
            return getConnectedTextureOverlayRandom(cp, blockAccess, blockState, blockPos, side, quad, renderEnv);
         case 14:
            return getConnectedTextureOverlayRepeat(cp, blockPos, side, quad, renderEnv);
         case 15:
            return getConnectedTextureOverlayCtm(cp, blockAccess, blockState, blockPos, vertAxis, side, quad, metadata, renderEnv);
      }
   }

   private static int fixSideByAxis(int side, int vertAxis) {
      switch (vertAxis) {
         case 0:
            return side;
         case 1:
            switch (side) {
               case 0:
                  return 2;
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 0;
               default:
                  return side;
            }
         case 2:
            switch (side) {
               case 0:
                  return 4;
               case 1:
                  return 5;
               case 2:
               case 3:
               default:
                  return side;
               case 4:
                  return 1;
               case 5:
                  return 0;
            }
         default:
            return side;
      }
   }

   private static int getWoodAxis(int side, int metadata) {
      int orient = (metadata & 12) >> 2;
      switch (orient) {
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            return 0;
      }
   }

   private static int getQuartzAxis(int side, int metadata) {
      switch (metadata) {
         case 3:
            return 2;
         case 4:
            return 1;
         default:
            return 0;
      }
   }

   private static bmi getConnectedTextureRandom(ConnectedProperties cp, adq blockAccess, aly blockState, cj blockPos, int side) {
      if (cp.tileIcons.length == 1) {
         return cp.tileIcons[0];
      }

      int face = side / cp.symmetry * cp.symmetry;
      if (cp.linked) {
         cj posDown = blockPos.b();

         for (alz bsDown = blockAccess.p(posDown); bsDown.c() == blockState.c(); bsDown = blockAccess.p(posDown)) {
            blockPos = posDown;
            posDown = blockPos.b();
            if (posDown.o() < 0) {
               break;
            }
         }
      }

      int rand = Config.getRandom(blockPos, face) & 2147483647;

      for (int i = 0; i < cp.randomLoops; i++) {
         rand = Config.intHash(rand);
      }

      int index = 0;
      if (cp.weights == null) {
         index = rand % cp.tileIcons.length;
      } else {
         int randWeight = rand % cp.sumAllWeights;
         int[] sumWeights = cp.sumWeights;

         for (int i = 0; i < sumWeights.length; i++) {
            if (randWeight < sumWeights[i]) {
               index = i;
               break;
            }
         }
      }

      return cp.tileIcons[index];
   }

   private static bmi getConnectedTextureFixed(ConnectedProperties cp) {
      return cp.tileIcons[0];
   }

   private static bmi getConnectedTextureRepeat(ConnectedProperties cp, cj blockPos, int side) {
      if (cp.tileIcons.length == 1) {
         return cp.tileIcons[0];
      }

      int x = blockPos.n();
      int y = blockPos.o();
      int z = blockPos.p();
      int nx = 0;
      int ny = 0;
      switch (side) {
         case 0:
            nx = x;
            ny = -z - 1;
            break;
         case 1:
            nx = x;
            ny = z;
            break;
         case 2:
            nx = -x - 1;
            ny = -y;
            break;
         case 3:
            nx = x;
            ny = -y;
            break;
         case 4:
            nx = z;
            ny = -y;
            break;
         case 5:
            nx = -z - 1;
            ny = -y;
      }

      nx %= cp.width;
      ny %= cp.height;
      if (nx < 0) {
         nx += cp.width;
      }

      if (ny < 0) {
         ny += cp.height;
      }

      int index = ny * cp.width + nx;
      return cp.tileIcons[index];
   }

   private static bmi getConnectedTextureCtm(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata, RenderEnv renderEnv
   ) {
      int index = getConnectedTextureCtmIndex(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata, renderEnv);
      return cp.tileIcons[index];
   }

   private static synchronized bgg[] getConnectedTextureCtmCompact(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bgg quad, int metadata, RenderEnv renderEnv
   ) {
      bmi icon = quad.getSprite();
      int index = getConnectedTextureCtmIndex(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata, renderEnv);
      return ConnectedTexturesCompact.getConnectedTextureCtmCompact(index, cp, side, quad, renderEnv);
   }

   private static bgg[] getConnectedTextureOverlay(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bgg quad, int metadata, RenderEnv renderEnv
   ) {
      if (!quad.isFullQuad()) {
         return null;
      }

      bmi icon = quad.getSprite();
      BlockDir[] dirSides = getSideDirections(side, vertAxis);
      boolean[] sides = renderEnv.getBorderFlags();

      for (int i = 0; i < 4; i++) {
         sides[i] = isNeighbourOverlay(cp, blockAccess, blockState, dirSides[i].offset(blockPos), side, icon, metadata);
      }

      ListQuadsOverlay listQuadsOverlay = renderEnv.getListQuadsOverlay(cp.layer);

      try {
         if (sides[0] && sides[1] && sides[2] && sides[3]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[8], quad, cp.tintIndex), cp.tintBlockState);
            return null;
         }

         if (sides[0] && sides[1] && sides[2]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[5], quad, cp.tintIndex), cp.tintBlockState);
            return null;
         }

         if (sides[0] && sides[2] && sides[3]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[6], quad, cp.tintIndex), cp.tintBlockState);
            return null;
         }

         if (sides[1] && sides[2] && sides[3]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[12], quad, cp.tintIndex), cp.tintBlockState);
            return null;
         }

         if (sides[0] && sides[1] && sides[3]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[13], quad, cp.tintIndex), cp.tintBlockState);
            return null;
         }

         BlockDir[] dirEdges = getEdgeDirections(side, vertAxis);
         boolean[] edges = renderEnv.getBorderFlags2();

         for (int i = 0; i < 4; i++) {
            edges[i] = isNeighbourOverlay(cp, blockAccess, blockState, dirEdges[i].offset(blockPos), side, icon, metadata);
         }

         if (sides[1] && sides[2]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[3], quad, cp.tintIndex), cp.tintBlockState);
            if (edges[3]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[16], quad, cp.tintIndex), cp.tintBlockState);
            }

            return null;
         } else if (sides[0] && sides[2]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[4], quad, cp.tintIndex), cp.tintBlockState);
            if (edges[2]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[14], quad, cp.tintIndex), cp.tintBlockState);
            }

            return null;
         } else if (sides[1] && sides[3]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[10], quad, cp.tintIndex), cp.tintBlockState);
            if (edges[1]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[2], quad, cp.tintIndex), cp.tintBlockState);
            }

            return null;
         } else if (sides[0] && sides[3]) {
            listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[11], quad, cp.tintIndex), cp.tintBlockState);
            if (edges[0]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[0], quad, cp.tintIndex), cp.tintBlockState);
            }

            return null;
         } else {
            boolean[] sidesMatch = renderEnv.getBorderFlags3();

            for (int i = 0; i < 4; i++) {
               sidesMatch[i] = isNeighbourMatching(cp, blockAccess, blockState, dirSides[i].offset(blockPos), side, icon, metadata);
            }

            if (sides[0]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[9], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (sides[1]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[7], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (sides[2]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[1], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (sides[3]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[15], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (edges[0] && (sidesMatch[1] || sidesMatch[2]) && !sides[1] && !sides[2]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[0], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (edges[1] && (sidesMatch[0] || sidesMatch[2]) && !sides[0] && !sides[2]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[2], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (edges[2] && (sidesMatch[1] || sidesMatch[3]) && !sides[1] && !sides[3]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[14], quad, cp.tintIndex), cp.tintBlockState);
            }

            if (edges[3] && (sidesMatch[0] || sidesMatch[3]) && !sides[0] && !sides[3]) {
               listQuadsOverlay.addQuad(getQuadFull(cp.tileIcons[16], quad, cp.tintIndex), cp.tintBlockState);
            }

            return null;
         }
      } finally {
         if (listQuadsOverlay.size() > 0) {
            renderEnv.setOverlaysRendered(true);
         }
      }
   }

   private static bgg[] getConnectedTextureOverlayFixed(ConnectedProperties cp, bgg quad, RenderEnv renderEnv) {
      if (!quad.isFullQuad()) {
         return null;
      }

      ListQuadsOverlay listQuadsOverlay = renderEnv.getListQuadsOverlay(cp.layer);

      try {
         bmi sprite = getConnectedTextureFixed(cp);
         if (sprite != null) {
            listQuadsOverlay.addQuad(getQuadFull(sprite, quad, cp.tintIndex), cp.tintBlockState);
         }

         return null;
      } finally {
         if (listQuadsOverlay.size() > 0) {
            renderEnv.setOverlaysRendered(true);
         }
      }
   }

   private static bgg[] getConnectedTextureOverlayRandom(
      ConnectedProperties cp, adq blockAccess, aly blockState, cj blockPos, int side, bgg quad, RenderEnv renderEnv
   ) {
      if (!quad.isFullQuad()) {
         return null;
      }

      ListQuadsOverlay listQuadsOverlay = renderEnv.getListQuadsOverlay(cp.layer);

      try {
         bmi sprite = getConnectedTextureRandom(cp, blockAccess, blockState, blockPos, side);
         if (sprite != null) {
            listQuadsOverlay.addQuad(getQuadFull(sprite, quad, cp.tintIndex), cp.tintBlockState);
         }

         return null;
      } finally {
         if (listQuadsOverlay.size() > 0) {
            renderEnv.setOverlaysRendered(true);
         }
      }
   }

   private static bgg[] getConnectedTextureOverlayRepeat(ConnectedProperties cp, cj blockPos, int side, bgg quad, RenderEnv renderEnv) {
      if (!quad.isFullQuad()) {
         return null;
      }

      ListQuadsOverlay listQuadsOverlay = renderEnv.getListQuadsOverlay(cp.layer);

      try {
         bmi sprite = getConnectedTextureRepeat(cp, blockPos, side);
         if (sprite != null) {
            listQuadsOverlay.addQuad(getQuadFull(sprite, quad, cp.tintIndex), cp.tintBlockState);
         }

         return null;
      } finally {
         if (listQuadsOverlay.size() > 0) {
            renderEnv.setOverlaysRendered(true);
         }
      }
   }

   private static bgg[] getConnectedTextureOverlayCtm(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bgg quad, int metadata, RenderEnv renderEnv
   ) {
      if (!quad.isFullQuad()) {
         return null;
      }

      ListQuadsOverlay listQuadsOverlay = renderEnv.getListQuadsOverlay(cp.layer);

      try {
         bmi sprite = getConnectedTextureCtm(cp, blockAccess, blockState, blockPos, vertAxis, side, quad.getSprite(), metadata, renderEnv);
         if (sprite != null) {
            listQuadsOverlay.addQuad(getQuadFull(sprite, quad, cp.tintIndex), cp.tintBlockState);
         }

         return null;
      } finally {
         if (listQuadsOverlay.size() > 0) {
            renderEnv.setOverlaysRendered(true);
         }
      }
   }

   private static BlockDir[] getSideDirections(int side, int vertAxis) {
      switch (side) {
         case 0:
            return SIDES_Y_NEG_DOWN;
         case 1:
            return SIDES_Y_POS_UP;
         case 2:
            if (vertAxis == 1) {
               return SIDES_Z_NEG_NORTH_Z_AXIS;
            }

            return SIDES_Z_NEG_NORTH;
         case 3:
            return SIDES_Z_POS_SOUTH;
         case 4:
            return SIDES_X_NEG_WEST;
         case 5:
            if (vertAxis == 2) {
               return SIDES_X_POS_EAST_X_AXIS;
            }

            return SIDES_X_POS_EAST;
         default:
            throw new IllegalArgumentException("Unknown side: " + side);
      }
   }

   private static BlockDir[] getEdgeDirections(int side, int vertAxis) {
      switch (side) {
         case 0:
            return EDGES_Y_NEG_DOWN;
         case 1:
            return EDGES_Y_POS_UP;
         case 2:
            if (vertAxis == 1) {
               return EDGES_Z_NEG_NORTH_Z_AXIS;
            }

            return EDGES_Z_NEG_NORTH;
         case 3:
            return EDGES_Z_POS_SOUTH;
         case 4:
            return EDGES_X_NEG_WEST;
         case 5:
            if (vertAxis == 2) {
               return EDGES_X_POS_EAST_X_AXIS;
            }

            return EDGES_X_POS_EAST;
         default:
            throw new IllegalArgumentException("Unknown side: " + side);
      }
   }

   protected static Map[][] getSpriteQuadCompactMaps() {
      return spriteQuadCompactMaps;
   }

   private static int getConnectedTextureCtmIndex(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata, RenderEnv renderEnv
   ) {
      boolean[] borders = renderEnv.getBorderFlags();
      switch (side) {
         case 0:
            borders[0] = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
            borders[1] = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
            borders[2] = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
            borders[3] = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.b();
               borders[0] = borders[0] && !isNeighbour(cp, blockAccess, blockState, posFront.e(), side, icon, metadata);
               borders[1] = borders[1] && !isNeighbour(cp, blockAccess, blockState, posFront.f(), side, icon, metadata);
               borders[2] = borders[2] && !isNeighbour(cp, blockAccess, blockState, posFront.c(), side, icon, metadata);
               borders[3] = borders[3] && !isNeighbour(cp, blockAccess, blockState, posFront.d(), side, icon, metadata);
            }
            break;
         case 1:
            borders[0] = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
            borders[1] = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
            borders[2] = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            borders[3] = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.a();
               borders[0] = borders[0] && !isNeighbour(cp, blockAccess, blockState, posFront.e(), side, icon, metadata);
               borders[1] = borders[1] && !isNeighbour(cp, blockAccess, blockState, posFront.f(), side, icon, metadata);
               borders[2] = borders[2] && !isNeighbour(cp, blockAccess, blockState, posFront.d(), side, icon, metadata);
               borders[3] = borders[3] && !isNeighbour(cp, blockAccess, blockState, posFront.c(), side, icon, metadata);
            }
            break;
         case 2:
            borders[0] = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
            borders[1] = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
            borders[2] = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
            borders[3] = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.c();
               borders[0] = borders[0] && !isNeighbour(cp, blockAccess, blockState, posFront.f(), side, icon, metadata);
               borders[1] = borders[1] && !isNeighbour(cp, blockAccess, blockState, posFront.e(), side, icon, metadata);
               borders[2] = borders[2] && !isNeighbour(cp, blockAccess, blockState, posFront.b(), side, icon, metadata);
               borders[3] = borders[3] && !isNeighbour(cp, blockAccess, blockState, posFront.a(), side, icon, metadata);
            }

            if (vertAxis == 1) {
               switchValues(0, 1, borders);
               switchValues(2, 3, borders);
            }
            break;
         case 3:
            borders[0] = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
            borders[1] = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
            borders[2] = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
            borders[3] = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.d();
               borders[0] = borders[0] && !isNeighbour(cp, blockAccess, blockState, posFront.e(), side, icon, metadata);
               borders[1] = borders[1] && !isNeighbour(cp, blockAccess, blockState, posFront.f(), side, icon, metadata);
               borders[2] = borders[2] && !isNeighbour(cp, blockAccess, blockState, posFront.b(), side, icon, metadata);
               borders[3] = borders[3] && !isNeighbour(cp, blockAccess, blockState, posFront.a(), side, icon, metadata);
            }
            break;
         case 4:
            borders[0] = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
            borders[1] = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            borders[2] = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
            borders[3] = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.e();
               borders[0] = borders[0] && !isNeighbour(cp, blockAccess, blockState, posFront.c(), side, icon, metadata);
               borders[1] = borders[1] && !isNeighbour(cp, blockAccess, blockState, posFront.d(), side, icon, metadata);
               borders[2] = borders[2] && !isNeighbour(cp, blockAccess, blockState, posFront.b(), side, icon, metadata);
               borders[3] = borders[3] && !isNeighbour(cp, blockAccess, blockState, posFront.a(), side, icon, metadata);
            }
            break;
         case 5:
            borders[0] = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            borders[1] = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
            borders[2] = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
            borders[3] = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.f();
               borders[0] = borders[0] && !isNeighbour(cp, blockAccess, blockState, posFront.d(), side, icon, metadata);
               borders[1] = borders[1] && !isNeighbour(cp, blockAccess, blockState, posFront.c(), side, icon, metadata);
               borders[2] = borders[2] && !isNeighbour(cp, blockAccess, blockState, posFront.b(), side, icon, metadata);
               borders[3] = borders[3] && !isNeighbour(cp, blockAccess, blockState, posFront.a(), side, icon, metadata);
            }

            if (vertAxis == 2) {
               switchValues(0, 1, borders);
               switchValues(2, 3, borders);
            }
      }

      int index = 0;
      if (borders[0] & !borders[1] & !borders[2] & !borders[3]) {
         index = 3;
      } else if (!borders[0] & borders[1] & !borders[2] & !borders[3]) {
         index = 1;
      } else if (!borders[0] & !borders[1] & borders[2] & !borders[3]) {
         index = 12;
      } else if (!borders[0] & !borders[1] & !borders[2] & borders[3]) {
         index = 36;
      } else if (borders[0] & borders[1] & !borders[2] & !borders[3]) {
         index = 2;
      } else if (!borders[0] & !borders[1] & borders[2] & borders[3]) {
         index = 24;
      } else if (borders[0] & !borders[1] & borders[2] & !borders[3]) {
         index = 15;
      } else if (borders[0] & !borders[1] & !borders[2] & borders[3]) {
         index = 39;
      } else if (!borders[0] & borders[1] & borders[2] & !borders[3]) {
         index = 13;
      } else if (!borders[0] & borders[1] & !borders[2] & borders[3]) {
         index = 37;
      } else if (!borders[0] & borders[1] & borders[2] & borders[3]) {
         index = 25;
      } else if (borders[0] & !borders[1] & borders[2] & borders[3]) {
         index = 27;
      } else if (borders[0] & borders[1] & !borders[2] & borders[3]) {
         index = 38;
      } else if (borders[0] & borders[1] & borders[2] & !borders[3]) {
         index = 14;
      } else if (borders[0] & borders[1] & borders[2] & borders[3]) {
         index = 26;
      }

      if (index == 0) {
         return index;
      }

      if (!Config.isConnectedTexturesFancy()) {
         return index;
      }

      boolean[] edges = borders;
      switch (side) {
         case 0:
            edges[0] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().c(), side, icon, metadata);
            edges[1] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().c(), side, icon, metadata);
            edges[2] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().d(), side, icon, metadata);
            edges[3] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().d(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.b();
               edges[0] = edges[0] || isNeighbour(cp, blockAccess, blockState, posFront.f().c(), side, icon, metadata);
               edges[1] = edges[1] || isNeighbour(cp, blockAccess, blockState, posFront.e().c(), side, icon, metadata);
               edges[2] = edges[2] || isNeighbour(cp, blockAccess, blockState, posFront.f().d(), side, icon, metadata);
               edges[3] = edges[3] || isNeighbour(cp, blockAccess, blockState, posFront.e().d(), side, icon, metadata);
            }
            break;
         case 1:
            edges[0] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().d(), side, icon, metadata);
            edges[1] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().d(), side, icon, metadata);
            edges[2] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().c(), side, icon, metadata);
            edges[3] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().c(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.a();
               edges[0] = edges[0] || isNeighbour(cp, blockAccess, blockState, posFront.f().d(), side, icon, metadata);
               edges[1] = edges[1] || isNeighbour(cp, blockAccess, blockState, posFront.e().d(), side, icon, metadata);
               edges[2] = edges[2] || isNeighbour(cp, blockAccess, blockState, posFront.f().c(), side, icon, metadata);
               edges[3] = edges[3] || isNeighbour(cp, blockAccess, blockState, posFront.e().c(), side, icon, metadata);
            }
            break;
         case 2:
            edges[0] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().b(), side, icon, metadata);
            edges[1] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().b(), side, icon, metadata);
            edges[2] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().a(), side, icon, metadata);
            edges[3] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().a(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.c();
               edges[0] = edges[0] || isNeighbour(cp, blockAccess, blockState, posFront.e().b(), side, icon, metadata);
               edges[1] = edges[1] || isNeighbour(cp, blockAccess, blockState, posFront.f().b(), side, icon, metadata);
               edges[2] = edges[2] || isNeighbour(cp, blockAccess, blockState, posFront.e().a(), side, icon, metadata);
               edges[3] = edges[3] || isNeighbour(cp, blockAccess, blockState, posFront.f().a(), side, icon, metadata);
            }

            if (vertAxis == 1) {
               switchValues(0, 3, borders);
               switchValues(1, 2, borders);
            }
            break;
         case 3:
            edges[0] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().b(), side, icon, metadata);
            edges[1] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().b(), side, icon, metadata);
            edges[2] = !isNeighbour(cp, blockAccess, blockState, blockPos.f().a(), side, icon, metadata);
            edges[3] = !isNeighbour(cp, blockAccess, blockState, blockPos.e().a(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.d();
               edges[0] = edges[0] || isNeighbour(cp, blockAccess, blockState, posFront.f().b(), side, icon, metadata);
               edges[1] = edges[1] || isNeighbour(cp, blockAccess, blockState, posFront.e().b(), side, icon, metadata);
               edges[2] = edges[2] || isNeighbour(cp, blockAccess, blockState, posFront.f().a(), side, icon, metadata);
               edges[3] = edges[3] || isNeighbour(cp, blockAccess, blockState, posFront.e().a(), side, icon, metadata);
            }
            break;
         case 4:
            edges[0] = !isNeighbour(cp, blockAccess, blockState, blockPos.b().d(), side, icon, metadata);
            edges[1] = !isNeighbour(cp, blockAccess, blockState, blockPos.b().c(), side, icon, metadata);
            edges[2] = !isNeighbour(cp, blockAccess, blockState, blockPos.a().d(), side, icon, metadata);
            edges[3] = !isNeighbour(cp, blockAccess, blockState, blockPos.a().c(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.e();
               edges[0] = edges[0] || isNeighbour(cp, blockAccess, blockState, posFront.b().d(), side, icon, metadata);
               edges[1] = edges[1] || isNeighbour(cp, blockAccess, blockState, posFront.b().c(), side, icon, metadata);
               edges[2] = edges[2] || isNeighbour(cp, blockAccess, blockState, posFront.a().d(), side, icon, metadata);
               edges[3] = edges[3] || isNeighbour(cp, blockAccess, blockState, posFront.a().c(), side, icon, metadata);
            }
            break;
         case 5:
            edges[0] = !isNeighbour(cp, blockAccess, blockState, blockPos.b().c(), side, icon, metadata);
            edges[1] = !isNeighbour(cp, blockAccess, blockState, blockPos.b().d(), side, icon, metadata);
            edges[2] = !isNeighbour(cp, blockAccess, blockState, blockPos.a().c(), side, icon, metadata);
            edges[3] = !isNeighbour(cp, blockAccess, blockState, blockPos.a().d(), side, icon, metadata);
            if (cp.innerSeams) {
               cj posFront = blockPos.f();
               edges[0] = edges[0] || isNeighbour(cp, blockAccess, blockState, posFront.b().c(), side, icon, metadata);
               edges[1] = edges[1] || isNeighbour(cp, blockAccess, blockState, posFront.b().d(), side, icon, metadata);
               edges[2] = edges[2] || isNeighbour(cp, blockAccess, blockState, posFront.a().c(), side, icon, metadata);
               edges[3] = edges[3] || isNeighbour(cp, blockAccess, blockState, posFront.a().d(), side, icon, metadata);
            }

            if (vertAxis == 2) {
               switchValues(0, 3, borders);
               switchValues(1, 2, borders);
            }
      }

      if (index == 13 && edges[0]) {
         index = 4;
      } else if (index == 15 && edges[1]) {
         index = 5;
      } else if (index == 37 && edges[2]) {
         index = 16;
      } else if (index == 39 && edges[3]) {
         index = 17;
      } else if (index == 14 && edges[0] && edges[1]) {
         index = 7;
      } else if (index == 25 && edges[0] && edges[2]) {
         index = 6;
      } else if (index == 27 && edges[3] && edges[1]) {
         index = 19;
      } else if (index == 38 && edges[3] && edges[2]) {
         index = 18;
      } else if (index == 14 && !edges[0] && edges[1]) {
         index = 31;
      } else if (index == 25 && edges[0] && !edges[2]) {
         index = 30;
      } else if (index == 27 && !edges[3] && edges[1]) {
         index = 41;
      } else if (index == 38 && edges[3] && !edges[2]) {
         index = 40;
      } else if (index == 14 && edges[0] && !edges[1]) {
         index = 29;
      } else if (index == 25 && !edges[0] && edges[2]) {
         index = 28;
      } else if (index == 27 && edges[3] && !edges[1]) {
         index = 43;
      } else if (index == 38 && !edges[3] && edges[2]) {
         index = 42;
      } else if (index == 26 && edges[0] && edges[1] && edges[2] && edges[3]) {
         index = 46;
      } else if (index == 26 && !edges[0] && edges[1] && edges[2] && edges[3]) {
         index = 9;
      } else if (index == 26 && edges[0] && !edges[1] && edges[2] && edges[3]) {
         index = 21;
      } else if (index == 26 && edges[0] && edges[1] && !edges[2] && edges[3]) {
         index = 8;
      } else if (index == 26 && edges[0] && edges[1] && edges[2] && !edges[3]) {
         index = 20;
      } else if (index == 26 && edges[0] && edges[1] && !edges[2] && !edges[3]) {
         index = 11;
      } else if (index == 26 && !edges[0] && !edges[1] && edges[2] && edges[3]) {
         index = 22;
      } else if (index == 26 && !edges[0] && edges[1] && !edges[2] && edges[3]) {
         index = 23;
      } else if (index == 26 && edges[0] && !edges[1] && edges[2] && !edges[3]) {
         index = 10;
      } else if (index == 26 && edges[0] && !edges[1] && !edges[2] && edges[3]) {
         index = 34;
      } else if (index == 26 && !edges[0] && edges[1] && edges[2] && !edges[3]) {
         index = 35;
      } else if (index == 26 && edges[0] && !edges[1] && !edges[2] && !edges[3]) {
         index = 32;
      } else if (index == 26 && !edges[0] && edges[1] && !edges[2] && !edges[3]) {
         index = 33;
      } else if (index == 26 && !edges[0] && !edges[1] && edges[2] && !edges[3]) {
         index = 44;
      } else if (index == 26 && !edges[0] && !edges[1] && !edges[2] && edges[3]) {
         index = 45;
      }

      return index;
   }

   private static void switchValues(int ix1, int ix2, boolean[] arr) {
      boolean prev1 = arr[ix1];
      arr[ix1] = arr[ix2];
      arr[ix2] = prev1;
   }

   private static boolean isNeighbourOverlay(ConnectedProperties cp, adq iblockaccess, alz blockState, cj blockPos, int side, bmi icon, int metadata) {
      alz neighbourState = iblockaccess.p(blockPos);
      if (!isFullCubeModel(neighbourState)) {
         return false;
      }

      if (cp.connectBlocks != null) {
         aly neighbourStateBase = (aly)neighbourState;
         if (!Matches.block(neighbourStateBase.getBlockId(), neighbourStateBase.getMetadata(), cp.connectBlocks)) {
            return false;
         }
      }

      if (cp.connectTileIcons != null) {
         bmi neighbourIcon = getNeighbourIcon(iblockaccess, blockState, blockPos, neighbourState, side);
         if (!Config.isSameOne(neighbourIcon, cp.connectTileIcons)) {
            return false;
         }
      }

      alz neighbourStateAbove = iblockaccess.p(blockPos.a(getFacing(side)));
      if (neighbourStateAbove.c().c()) {
         return false;
      } else {
         return side == 1 && neighbourStateAbove.c() == afi.aH
            ? false
            : !isNeighbour(cp, iblockaccess, blockState, blockPos, neighbourState, side, icon, metadata);
      }
   }

   private static boolean isFullCubeModel(alz state) {
      if (state.c().d()) {
         return true;
      }

      afh block = state.c();
      return block instanceof ahc ? true : block instanceof ajs;
   }

   private static boolean isNeighbourMatching(ConnectedProperties cp, adq iblockaccess, alz blockState, cj blockPos, int side, bmi icon, int metadata) {
      alz neighbourState = iblockaccess.p(blockPos);
      if (neighbourState == AIR_DEFAULT_STATE) {
         return false;
      }

      if (cp.matchBlocks != null && neighbourState instanceof aly) {
         aly neighbourStateBase = (aly)neighbourState;
         if (!cp.matchesBlock(neighbourStateBase.getBlockId(), neighbourStateBase.getMetadata())) {
            return false;
         }
      }

      if (cp.matchTileIcons != null) {
         bmi neighbourIcon = getNeighbourIcon(iblockaccess, blockState, blockPos, neighbourState, side);
         if (neighbourIcon != icon) {
            return false;
         }
      }

      alz neighbourStateAbove = iblockaccess.p(blockPos.a(getFacing(side)));
      return neighbourStateAbove.c().c() ? false : side != 1 || neighbourStateAbove.c() != afi.aH;
   }

   private static boolean isNeighbour(ConnectedProperties cp, adq iblockaccess, alz blockState, cj blockPos, int side, bmi icon, int metadata) {
      alz neighbourState = iblockaccess.p(blockPos);
      return isNeighbour(cp, iblockaccess, blockState, blockPos, neighbourState, side, icon, metadata);
   }

   private static boolean isNeighbour(
      ConnectedProperties cp, adq iblockaccess, alz blockState, cj blockPos, alz neighbourState, int side, bmi icon, int metadata
   ) {
      if (blockState == neighbourState) {
         return true;
      }

      if (cp.connect == 2) {
         if (neighbourState == null) {
            return false;
         }

         if (neighbourState == AIR_DEFAULT_STATE) {
            return false;
         }

         bmi neighbourIcon = getNeighbourIcon(iblockaccess, blockState, blockPos, neighbourState, side);
         return neighbourIcon == icon;
      } else if (cp.connect == 3) {
         if (neighbourState == null) {
            return false;
         } else {
            return neighbourState == AIR_DEFAULT_STATE ? false : neighbourState.c().t() == blockState.c().t();
         }
      } else {
         if (!(neighbourState instanceof aly)) {
            return false;
         }

         aly neighbourStateBase = (aly)neighbourState;
         afh neighbourBlock = neighbourStateBase.c();
         int neighbourMetadata = neighbourStateBase.getMetadata();
         return neighbourBlock == blockState.c() && neighbourMetadata == metadata;
      }
   }

   private static bmi getNeighbourIcon(adq iblockaccess, alz blockState, cj blockPos, alz neighbourState, int side) {
      neighbourState = neighbourState.c().a(neighbourState, iblockaccess, blockPos);
      boq model = ave.A().ae().a().b(neighbourState);
      if (model == null) {
         return null;
      }

      if (Reflector.ForgeBlock_getExtendedState.exists()) {
         neighbourState = (alz)Reflector.call(neighbourState.c(), Reflector.ForgeBlock_getExtendedState, neighbourState, iblockaccess, blockPos);
      }

      cq facing = getFacing(side);
      List quads = model.a(facing);
      if (quads == null) {
         return null;
      }

      if (Config.isBetterGrass()) {
         quads = BetterGrass.getFaceQuads(iblockaccess, neighbourState, blockPos, facing, quads);
      }

      if (quads.size() > 0) {
         bgg quad = (bgg)quads.get(0);
         return quad.getSprite();
      }

      List quadsGeneral = model.a();
      if (quadsGeneral == null) {
         return null;
      }

      for (int i = 0; i < quadsGeneral.size(); i++) {
         bgg quad = (bgg)quadsGeneral.get(i);
         if (quad.d() == facing) {
            return quad.getSprite();
         }
      }

      return null;
   }

   private static bmi getConnectedTextureHorizontal(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata
   ) {
      boolean left;
      boolean right;
      left = false;
      right = false;
      label46:
      switch (vertAxis) {
         case 0:
            switch (side) {
               case 0:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  break label46;
               case 1:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  break label46;
               case 2:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  break label46;
               case 3:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  break label46;
               case 4:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
                  break label46;
               case 5:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
               default:
                  break label46;
            }
         case 1:
            switch (side) {
               case 0:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  break label46;
               case 1:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  break label46;
               case 2:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  break label46;
               case 3:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
                  break label46;
               case 4:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
                  break label46;
               case 5:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
               default:
                  break label46;
            }
         case 2:
            switch (side) {
               case 0:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
                  break;
               case 1:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
                  break;
               case 2:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
                  break;
               case 3:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
                  break;
               case 4:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
                  break;
               case 5:
                  left = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
                  right = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            }
      }

      int index = 3;
      byte var11;
      if (left) {
         if (right) {
            var11 = 1;
         } else {
            var11 = 2;
         }
      } else if (right) {
         var11 = 0;
      } else {
         var11 = 3;
      }

      return cp.tileIcons[var11];
   }

   private static bmi getConnectedTextureVertical(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata
   ) {
      boolean bottom = false;
      boolean top = false;
      switch (vertAxis) {
         case 0:
            if (side == 1) {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
            } else if (side == 0) {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            } else {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            }
            break;
         case 1:
            if (side == 3) {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            } else if (side == 2) {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
            } else {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.c(), side, icon, metadata);
            }
            break;
         case 2:
            if (side == 5) {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
            } else if (side == 4) {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.b(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            } else {
               bottom = isNeighbour(cp, blockAccess, blockState, blockPos.e(), side, icon, metadata);
               top = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
            }
      }

      int index = 3;
      byte var11;
      if (bottom) {
         if (top) {
            var11 = 1;
         } else {
            var11 = 2;
         }
      } else if (top) {
         var11 = 0;
      } else {
         var11 = 3;
      }

      return cp.tileIcons[var11];
   }

   private static bmi getConnectedTextureHorizontalVertical(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata
   ) {
      bmi[] tileIcons = cp.tileIcons;
      bmi iconH = getConnectedTextureHorizontal(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata);
      if (iconH != null && iconH != icon && iconH != tileIcons[3]) {
         return iconH;
      } else {
         bmi iconV = getConnectedTextureVertical(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata);
         if (iconV == tileIcons[0]) {
            return tileIcons[4];
         } else if (iconV == tileIcons[1]) {
            return tileIcons[5];
         } else {
            return iconV == tileIcons[2] ? tileIcons[6] : iconV;
         }
      }
   }

   private static bmi getConnectedTextureVerticalHorizontal(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata
   ) {
      bmi[] tileIcons = cp.tileIcons;
      bmi iconV = getConnectedTextureVertical(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata);
      if (iconV != null && iconV != icon && iconV != tileIcons[3]) {
         return iconV;
      } else {
         bmi iconH = getConnectedTextureHorizontal(cp, blockAccess, blockState, blockPos, vertAxis, side, icon, metadata);
         if (iconH == tileIcons[0]) {
            return tileIcons[4];
         } else if (iconH == tileIcons[1]) {
            return tileIcons[5];
         } else {
            return iconH == tileIcons[2] ? tileIcons[6] : iconH;
         }
      }
   }

   private static bmi getConnectedTextureTop(
      ConnectedProperties cp, adq blockAccess, alz blockState, cj blockPos, int vertAxis, int side, bmi icon, int metadata
   ) {
      boolean top = false;
      switch (vertAxis) {
         case 0:
            if (side == 1 || side == 0) {
               return null;
            }

            top = isNeighbour(cp, blockAccess, blockState, blockPos.a(), side, icon, metadata);
            break;
         case 1:
            if (side == 3 || side == 2) {
               return null;
            }

            top = isNeighbour(cp, blockAccess, blockState, blockPos.d(), side, icon, metadata);
            break;
         case 2:
            if (side == 5 || side == 4) {
               return null;
            }

            top = isNeighbour(cp, blockAccess, blockState, blockPos.f(), side, icon, metadata);
      }

      return top ? cp.tileIcons[0] : null;
   }

   public static void updateIcons(bmh textureMap) {
      blockProperties = (ConnectedProperties[][])null;
      tileProperties = (ConnectedProperties[][])null;
      spriteQuadMaps = null;
      spriteQuadCompactMaps = (Map[][])null;
      if (Config.isConnectedTextures()) {
         bnk[] rps = Config.getResourcePacks();

         for (int i = rps.length - 1; i >= 0; i--) {
            bnk rp = rps[i];
            updateIcons(textureMap, rp);
         }

         updateIcons(textureMap, Config.getDefaultResourcePack());
         jy locEmpty = new jy("mcpatcher/ctm/default/empty");
         emptySprite = textureMap.a(locEmpty);
         spriteQuadMaps = new Map[textureMap.getCountRegisteredSprites() + 1];
         spriteQuadFullMaps = new Map[textureMap.getCountRegisteredSprites() + 1];
         spriteQuadCompactMaps = new Map[textureMap.getCountRegisteredSprites() + 1][];
         if (blockProperties.length <= 0) {
            blockProperties = (ConnectedProperties[][])null;
         }

         if (tileProperties.length <= 0) {
            tileProperties = (ConnectedProperties[][])null;
         }
      }
   }

   private static void updateIconEmpty(bmh textureMap) {
   }

   public static void updateIcons(bmh textureMap, bnk rp) {
      String[] names = ResUtils.collectFiles(rp, "mcpatcher/ctm/", ".properties", getDefaultCtmPaths());
      Arrays.sort(names);
      List tileList = makePropertyList(tileProperties);
      List blockList = makePropertyList(blockProperties);

      for (int i = 0; i < names.length; i++) {
         String name = names[i];
         Config.dbg("ConnectedTextures: " + name);

         try {
            jy locFile = new jy(name);
            InputStream in = rp.a(locFile);
            if (in == null) {
               Config.warn("ConnectedTextures file not found: " + name);
            } else {
               Properties props = new PropertiesOrdered();
               props.load(in);
               in.close();
               ConnectedProperties cp = new ConnectedProperties(props, name);
               if (cp.isValid(name)) {
                  cp.updateIcons(textureMap);
                  addToTileList(cp, tileList);
                  addToBlockList(cp, blockList);
               }
            }
         } catch (FileNotFoundException e) {
            Config.warn("ConnectedTextures file not found: " + name);
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      blockProperties = propertyListToArray(blockList);
      tileProperties = propertyListToArray(tileList);
      multipass = detectMultipass();
      Config.dbg("Multipass connected textures: " + multipass);
   }

   private static List makePropertyList(ConnectedProperties[][] propsArr) {
      List list = new ArrayList();
      if (propsArr != null) {
         for (int i = 0; i < propsArr.length; i++) {
            ConnectedProperties[] props = propsArr[i];
            List propList = null;
            if (props != null) {
               propList = new ArrayList<>(Arrays.asList(props));
            }

            list.add(propList);
         }
      }

      return list;
   }

   private static boolean detectMultipass() {
      List propList = new ArrayList();

      for (int i = 0; i < tileProperties.length; i++) {
         ConnectedProperties[] cps = tileProperties[i];
         if (cps != null) {
            propList.addAll(Arrays.asList(cps));
         }
      }

      for (int i = 0; i < blockProperties.length; i++) {
         ConnectedProperties[] cps = blockProperties[i];
         if (cps != null) {
            propList.addAll(Arrays.asList(cps));
         }
      }

      ConnectedProperties[] props = propList.toArray(new ConnectedProperties[propList.size()]);
      Set matchIconSet = new HashSet();
      Set tileIconSet = new HashSet();

      for (int i = 0; i < props.length; i++) {
         ConnectedProperties cp = props[i];
         if (cp.matchTileIcons != null) {
            matchIconSet.addAll(Arrays.asList(cp.matchTileIcons));
         }

         if (cp.tileIcons != null) {
            tileIconSet.addAll(Arrays.asList(cp.tileIcons));
         }
      }

      matchIconSet.retainAll(tileIconSet);
      return !matchIconSet.isEmpty();
   }

   private static ConnectedProperties[][] propertyListToArray(List list) {
      ConnectedProperties[][] propArr = new ConnectedProperties[list.size()][];

      for (int i = 0; i < list.size(); i++) {
         List subList = (List)list.get(i);
         if (subList != null) {
            ConnectedProperties[] subArr = subList.toArray(new ConnectedProperties[subList.size()]);
            propArr[i] = subArr;
         }
      }

      return propArr;
   }

   private static void addToTileList(ConnectedProperties cp, List tileList) {
      if (cp.matchTileIcons != null) {
         for (int i = 0; i < cp.matchTileIcons.length; i++) {
            bmi icon = cp.matchTileIcons[i];
            if (!(icon instanceof bmi)) {
               Config.warn("TextureAtlasSprite is not TextureAtlasSprite: " + icon + ", name: " + icon.i());
            } else {
               bmi ts = icon;
               int tileId = ts.getIndexInMap();
               if (tileId < 0) {
                  Config.warn("Invalid tile ID: " + tileId + ", icon: " + ts.i());
               } else {
                  addToList(cp, tileList, tileId);
               }
            }
         }
      }
   }

   private static void addToBlockList(ConnectedProperties cp, List blockList) {
      if (cp.matchBlocks != null) {
         for (int i = 0; i < cp.matchBlocks.length; i++) {
            int blockId = cp.matchBlocks[i].getBlockId();
            if (blockId < 0) {
               Config.warn("Invalid block ID: " + blockId);
            } else {
               addToList(cp, blockList, blockId);
            }
         }
      }
   }

   private static void addToList(ConnectedProperties cp, List list, int id) {
      while (id >= list.size()) {
         list.add(null);
      }

      List subList = (List)list.get(id);
      if (subList == null) {
         subList = new ArrayList();
         list.set(id, subList);
      }

      subList.add(cp);
   }

   private static String[] getDefaultCtmPaths() {
      List list = new ArrayList();
      String defPath = "mcpatcher/ctm/default/";
      if (Config.isFromDefaultResourcePack(new jy("textures/blocks/glass.png"))) {
         list.add(defPath + "glass.properties");
         list.add(defPath + "glasspane.properties");
      }

      if (Config.isFromDefaultResourcePack(new jy("textures/blocks/bookshelf.png"))) {
         list.add(defPath + "bookshelf.properties");
      }

      if (Config.isFromDefaultResourcePack(new jy("textures/blocks/sandstone_normal.png"))) {
         list.add(defPath + "sandstone.properties");
      }

      String[] colors = new String[]{
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"
      };

      for (int i = 0; i < colors.length; i++) {
         String color = colors[i];
         if (Config.isFromDefaultResourcePack(new jy("textures/blocks/glass_" + color + ".png"))) {
            list.add(defPath + i + "_glass_" + color + "/glass_" + color + ".properties");
            list.add(defPath + i + "_glass_" + color + "/glass_pane_" + color + ".properties");
         }
      }

      return list.toArray(new String[list.size()]);
   }
}
