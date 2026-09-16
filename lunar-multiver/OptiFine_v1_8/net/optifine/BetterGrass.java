package net.optifine;

import agf.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import net.optifine.model.BlockModelUtils;
import net.optifine.util.PropertiesOrdered;

public class BetterGrass {
   private static boolean betterGrass = true;
   private static boolean betterMycelium = true;
   private static boolean betterPodzol = true;
   private static boolean betterGrassSnow = true;
   private static boolean betterMyceliumSnow = true;
   private static boolean betterPodzolSnow = true;
   private static boolean grassMultilayer = false;
   private static bmi spriteGrass = null;
   private static bmi spriteGrassSide = null;
   private static bmi spriteMycelium = null;
   private static bmi spritePodzol = null;
   private static bmi spriteSnow = null;
   private static boolean spritesLoaded = false;
   private static boq modelCubeGrass = null;
   private static boq modelCubeMycelium = null;
   private static boq modelCubePodzol = null;
   private static boq modelCubeSnow = null;
   private static boolean modelsLoaded = false;
   private static final String TEXTURE_GRASS_DEFAULT = "blocks/grass_top";
   private static final String TEXTURE_GRASS_SIDE_DEFAULT = "blocks/grass_side";
   private static final String TEXTURE_MYCELIUM_DEFAULT = "blocks/mycelium_top";
   private static final String TEXTURE_PODZOL_DEFAULT = "blocks/dirt_podzol_top";
   private static final String TEXTURE_SNOW_DEFAULT = "blocks/snow";

   public static void updateIcons(bmh textureMap) {
      spritesLoaded = false;
      modelsLoaded = false;
      loadProperties(textureMap);
   }

   public static void update() {
      if (spritesLoaded) {
         modelCubeGrass = BlockModelUtils.makeModelCube(spriteGrass, 0);
         if (grassMultilayer) {
            boq modelCubeGrassSide = BlockModelUtils.makeModelCube(spriteGrassSide, -1);
            modelCubeGrass = BlockModelUtils.joinModelsCube(modelCubeGrassSide, modelCubeGrass);
         }

         modelCubeMycelium = BlockModelUtils.makeModelCube(spriteMycelium, -1);
         modelCubePodzol = BlockModelUtils.makeModelCube(spritePodzol, 0);
         modelCubeSnow = BlockModelUtils.makeModelCube(spriteSnow, -1);
         modelsLoaded = true;
      }
   }

   private static void loadProperties(bmh textureMap) {
      betterGrass = true;
      betterMycelium = true;
      betterPodzol = true;
      betterGrassSnow = true;
      betterMyceliumSnow = true;
      betterPodzolSnow = true;
      spriteGrass = textureMap.a(new jy("blocks/grass_top"));
      spriteGrassSide = textureMap.a(new jy("blocks/grass_side"));
      spriteMycelium = textureMap.a(new jy("blocks/mycelium_top"));
      spritePodzol = textureMap.a(new jy("blocks/dirt_podzol_top"));
      spriteSnow = textureMap.a(new jy("blocks/snow"));
      spritesLoaded = true;
      String name = "optifine/bettergrass.properties";

      try {
         jy locFile = new jy(name);
         if (!Config.hasResource(locFile)) {
            return;
         }

         InputStream in = Config.getResourceStream(locFile);
         if (in == null) {
            return;
         }

         boolean defaultConfig = Config.isFromDefaultResourcePack(locFile);
         if (defaultConfig) {
            Config.dbg("BetterGrass: Parsing default configuration " + name);
         } else {
            Config.dbg("BetterGrass: Parsing configuration " + name);
         }

         Properties props = new PropertiesOrdered();
         props.load(in);
         in.close();
         betterGrass = getBoolean(props, "grass", true);
         betterMycelium = getBoolean(props, "mycelium", true);
         betterPodzol = getBoolean(props, "podzol", true);
         betterGrassSnow = getBoolean(props, "grass.snow", true);
         betterMyceliumSnow = getBoolean(props, "mycelium.snow", true);
         betterPodzolSnow = getBoolean(props, "podzol.snow", true);
         grassMultilayer = getBoolean(props, "grass.multilayer", false);
         spriteGrass = registerSprite(props, "texture.grass", "blocks/grass_top", textureMap);
         spriteGrassSide = registerSprite(props, "texture.grass_side", "blocks/grass_side", textureMap);
         spriteMycelium = registerSprite(props, "texture.mycelium", "blocks/mycelium_top", textureMap);
         spritePodzol = registerSprite(props, "texture.podzol", "blocks/dirt_podzol_top", textureMap);
         spriteSnow = registerSprite(props, "texture.snow", "blocks/snow", textureMap);
      } catch (IOException e) {
         Config.warn("Error reading: " + name + ", " + e.getClass().getName() + ": " + e.getMessage());
      }
   }

   private static bmi registerSprite(Properties props, String key, String textureDefault, bmh textureMap) {
      String texture = props.getProperty(key);
      if (texture == null) {
         texture = textureDefault;
      }

      jy locPng = new jy("textures/" + texture + ".png");
      if (!Config.hasResource(locPng)) {
         Config.warn("BetterGrass texture not found: " + locPng);
         texture = textureDefault;
      }

      jy locSprite = new jy(texture);
      return textureMap.a(locSprite);
   }

   public static List getFaceQuads(adq blockAccess, alz blockState, cj blockPos, cq facing, List quads) {
      if (facing == cq.b || facing == cq.a) {
         return quads;
      } else if (!modelsLoaded) {
         return quads;
      } else {
         afh block = blockState.c();
         if (block instanceof aib) {
            return getFaceQuadsMycelium(blockAccess, blockState, blockPos, facing, quads);
         } else if (block instanceof agf) {
            return getFaceQuadsDirt(blockAccess, blockState, blockPos, facing, quads);
         } else {
            return block instanceof ahe ? getFaceQuadsGrass(blockAccess, blockState, blockPos, facing, quads) : quads;
         }
      }
   }

   private static List getFaceQuadsMycelium(adq blockAccess, alz blockState, cj blockPos, cq facing, List quads) {
      afh blockUp = blockAccess.p(blockPos.a()).c();
      boolean snowy = blockUp == afi.aJ || blockUp == afi.aH;
      if (Config.isBetterGrassFancy()) {
         if (snowy) {
            if (betterMyceliumSnow && getBlockAt(blockPos, facing, blockAccess) == afi.aH) {
               return modelCubeSnow.a(facing);
            }
         } else if (betterMycelium && getBlockAt(blockPos.b(), facing, blockAccess) == afi.bw) {
            return modelCubeMycelium.a(facing);
         }
      } else if (snowy) {
         if (betterMyceliumSnow) {
            return modelCubeSnow.a(facing);
         }
      } else if (betterMycelium) {
         return modelCubeMycelium.a(facing);
      }

      return quads;
   }

   private static List getFaceQuadsDirt(adq blockAccess, alz blockState, cj blockPos, cq facing, List quads) {
      afh blockTop = getBlockAt(blockPos, cq.b, blockAccess);
      if (blockState.b(agf.a) != a.c) {
         return quads;
      }

      boolean snowy = blockTop == afi.aJ || blockTop == afi.aH;
      if (Config.isBetterGrassFancy()) {
         if (snowy) {
            if (betterPodzolSnow && getBlockAt(blockPos, facing, blockAccess) == afi.aH) {
               return modelCubeSnow.a(facing);
            }
         } else if (betterPodzol) {
            cj posSide = blockPos.b().a(facing);
            alz stateSide = blockAccess.p(posSide);
            if (stateSide.c() == afi.d && stateSide.b(agf.a) == a.c) {
               return modelCubePodzol.a(facing);
            }
         }
      } else if (snowy) {
         if (betterPodzolSnow) {
            return modelCubeSnow.a(facing);
         }
      } else if (betterPodzol) {
         return modelCubePodzol.a(facing);
      }

      return quads;
   }

   private static List getFaceQuadsGrass(adq blockAccess, alz blockState, cj blockPos, cq facing, List quads) {
      afh blockUp = blockAccess.p(blockPos.a()).c();
      boolean snowy = blockUp == afi.aJ || blockUp == afi.aH;
      if (Config.isBetterGrassFancy()) {
         if (snowy) {
            if (betterGrassSnow && getBlockAt(blockPos, facing, blockAccess) == afi.aH) {
               return modelCubeSnow.a(facing);
            }
         } else if (betterGrass && getBlockAt(blockPos.b(), facing, blockAccess) == afi.c) {
            return modelCubeGrass.a(facing);
         }
      } else if (snowy) {
         if (betterGrassSnow) {
            return modelCubeSnow.a(facing);
         }
      } else if (betterGrass) {
         return modelCubeGrass.a(facing);
      }

      return quads;
   }

   private static afh getBlockAt(cj blockPos, cq facing, adq blockAccess) {
      cj pos = blockPos.a(facing);
      return blockAccess.p(pos).c();
   }

   private static boolean getBoolean(Properties props, String key, boolean def) {
      String str = props.getProperty(key);
      return str == null ? def : Boolean.parseBoolean(str);
   }
}
