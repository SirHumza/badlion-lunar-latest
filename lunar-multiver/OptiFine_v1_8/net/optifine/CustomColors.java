package net.optifine;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import net.optifine.config.ConnectedParser;
import net.optifine.config.MatchBlock;
import net.optifine.reflect.Reflector;
import net.optifine.render.RenderEnv;
import net.optifine.util.EntityUtils;
import net.optifine.util.PropertiesOrdered;
import net.optifine.util.ResUtils;
import net.optifine.util.StrUtils;
import net.optifine.util.TextureUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class CustomColors {
   private static String paletteFormatDefault = "vanilla";
   private static CustomColormap waterColors = null;
   private static CustomColormap foliagePineColors = null;
   private static CustomColormap foliageBirchColors = null;
   private static CustomColormap swampFoliageColors = null;
   private static CustomColormap swampGrassColors = null;
   private static CustomColormap[] colorsBlockColormaps = null;
   private static CustomColormap[][] blockColormaps = (CustomColormap[][])null;
   private static CustomColormap skyColors = null;
   private static CustomColorFader skyColorFader = new CustomColorFader();
   private static CustomColormap fogColors = null;
   private static CustomColorFader fogColorFader = new CustomColorFader();
   private static CustomColormap underwaterColors = null;
   private static CustomColorFader underwaterColorFader = new CustomColorFader();
   private static CustomColormap underlavaColors = null;
   private static CustomColorFader underlavaColorFader = new CustomColorFader();
   private static LightMapPack[] lightMapPacks = null;
   private static int lightmapMinDimensionId = 0;
   private static CustomColormap redstoneColors = null;
   private static CustomColormap xpOrbColors = null;
   private static int xpOrbTime = -1;
   private static CustomColormap durabilityColors = null;
   private static CustomColormap stemColors = null;
   private static CustomColormap stemMelonColors = null;
   private static CustomColormap stemPumpkinColors = null;
   private static CustomColormap myceliumParticleColors = null;
   private static boolean useDefaultGrassFoliageColors = true;
   private static int particleWaterColor = -1;
   private static int particlePortalColor = -1;
   private static int lilyPadColor = -1;
   private static int expBarTextColor = -1;
   private static int bossTextColor = -1;
   private static int signTextColor = -1;
   private static aui fogColorNether = null;
   private static aui fogColorEnd = null;
   private static aui skyColorEnd = null;
   private static int[] spawnEggPrimaryColors = null;
   private static int[] spawnEggSecondaryColors = null;
   private static float[][] wolfCollarColors = (float[][])null;
   private static float[][] sheepColors = (float[][])null;
   private static int[] textColors = null;
   private static int[] mapColorsOriginal = null;
   private static int[] potionColors = null;
   private static final alz BLOCK_STATE_DIRT = afi.d.Q();
   private static final alz BLOCK_STATE_WATER = afi.j.Q();
   public static Random random = new Random();
   private static final CustomColors.IColorizer COLORIZER_GRASS = new CustomColors.IColorizer() {
      @Override
      public int getColor(alz blockState, adq blockAccess, cj blockPos) {
         ady biome = CustomColors.getColorBiome(blockAccess, blockPos);
         return CustomColors.swampGrassColors != null && biome == ady.v ? CustomColors.swampGrassColors.getColor(biome, blockPos) : biome.b(blockPos);
      }

      @Override
      public boolean isColorConstant() {
         return false;
      }
   };
   private static final CustomColors.IColorizer COLORIZER_FOLIAGE = new CustomColors.IColorizer() {
      @Override
      public int getColor(alz blockState, adq blockAccess, cj blockPos) {
         ady biome = CustomColors.getColorBiome(blockAccess, blockPos);
         return CustomColors.swampFoliageColors != null && biome == ady.v ? CustomColors.swampFoliageColors.getColor(biome, blockPos) : biome.c(blockPos);
      }

      @Override
      public boolean isColorConstant() {
         return false;
      }
   };
   private static final CustomColors.IColorizer COLORIZER_FOLIAGE_PINE = new CustomColors.IColorizer() {
      @Override
      public int getColor(alz blockState, adq blockAccess, cj blockPos) {
         return CustomColors.foliagePineColors != null ? CustomColors.foliagePineColors.getColor(blockAccess, blockPos) : adj.a();
      }

      @Override
      public boolean isColorConstant() {
         return CustomColors.foliagePineColors == null;
      }
   };
   private static final CustomColors.IColorizer COLORIZER_FOLIAGE_BIRCH = new CustomColors.IColorizer() {
      @Override
      public int getColor(alz blockState, adq blockAccess, cj blockPos) {
         return CustomColors.foliageBirchColors != null ? CustomColors.foliageBirchColors.getColor(blockAccess, blockPos) : adj.b();
      }

      @Override
      public boolean isColorConstant() {
         return CustomColors.foliageBirchColors == null;
      }
   };
   private static final CustomColors.IColorizer COLORIZER_WATER = new CustomColors.IColorizer() {
      @Override
      public int getColor(alz blockState, adq blockAccess, cj blockPos) {
         ady biome = CustomColors.getColorBiome(blockAccess, blockPos);
         if (CustomColors.waterColors != null) {
            return CustomColors.waterColors.getColor(biome, blockPos);
         } else {
            return Reflector.ForgeBiome_getWaterColorMultiplier.exists() ? Reflector.callInt(biome, Reflector.ForgeBiome_getWaterColorMultiplier) : biome.ar;
         }
      }

      @Override
      public boolean isColorConstant() {
         return false;
      }
   };

   public static void update() {
      paletteFormatDefault = "vanilla";
      waterColors = null;
      foliageBirchColors = null;
      foliagePineColors = null;
      swampGrassColors = null;
      swampFoliageColors = null;
      skyColors = null;
      fogColors = null;
      underwaterColors = null;
      underlavaColors = null;
      redstoneColors = null;
      xpOrbColors = null;
      xpOrbTime = -1;
      durabilityColors = null;
      stemColors = null;
      myceliumParticleColors = null;
      lightMapPacks = null;
      particleWaterColor = -1;
      particlePortalColor = -1;
      lilyPadColor = -1;
      expBarTextColor = -1;
      bossTextColor = -1;
      signTextColor = -1;
      fogColorNether = null;
      fogColorEnd = null;
      skyColorEnd = null;
      colorsBlockColormaps = null;
      blockColormaps = (CustomColormap[][])null;
      useDefaultGrassFoliageColors = true;
      spawnEggPrimaryColors = null;
      spawnEggSecondaryColors = null;
      wolfCollarColors = (float[][])null;
      sheepColors = (float[][])null;
      textColors = null;
      setMapColors(mapColorsOriginal);
      potionColors = null;
      paletteFormatDefault = getValidProperty("mcpatcher/color.properties", "palette.format", CustomColormap.FORMAT_STRINGS, "vanilla");
      String mcpColormap = "mcpatcher/colormap/";
      String[] waterPaths = new String[]{"water.png", "watercolorX.png"};
      waterColors = getCustomColors(mcpColormap, waterPaths, 256, 256);
      updateUseDefaultGrassFoliageColors();
      if (Config.isCustomColors()) {
         String[] pinePaths = new String[]{"pine.png", "pinecolor.png"};
         foliagePineColors = getCustomColors(mcpColormap, pinePaths, 256, 256);
         String[] birchPaths = new String[]{"birch.png", "birchcolor.png"};
         foliageBirchColors = getCustomColors(mcpColormap, birchPaths, 256, 256);
         String[] swampGrassPaths = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         swampGrassColors = getCustomColors(mcpColormap, swampGrassPaths, 256, 256);
         String[] swampFoliagePaths = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         swampFoliageColors = getCustomColors(mcpColormap, swampFoliagePaths, 256, 256);
         String[] sky0Paths = new String[]{"sky0.png", "skycolor0.png"};
         skyColors = getCustomColors(mcpColormap, sky0Paths, 256, 256);
         String[] fog0Paths = new String[]{"fog0.png", "fogcolor0.png"};
         fogColors = getCustomColors(mcpColormap, fog0Paths, 256, 256);
         String[] underwaterPaths = new String[]{"underwater.png", "underwatercolor.png"};
         underwaterColors = getCustomColors(mcpColormap, underwaterPaths, 256, 256);
         String[] underlavaPaths = new String[]{"underlava.png", "underlavacolor.png"};
         underlavaColors = getCustomColors(mcpColormap, underlavaPaths, 256, 256);
         String[] redstonePaths = new String[]{"redstone.png", "redstonecolor.png"};
         redstoneColors = getCustomColors(mcpColormap, redstonePaths, 16, 1);
         xpOrbColors = getCustomColors(mcpColormap + "xporb.png", -1, -1);
         durabilityColors = getCustomColors(mcpColormap + "durability.png", -1, -1);
         String[] stemPaths = new String[]{"stem.png", "stemcolor.png"};
         stemColors = getCustomColors(mcpColormap, stemPaths, 8, 1);
         stemPumpkinColors = getCustomColors(mcpColormap + "pumpkinstem.png", 8, 1);
         stemMelonColors = getCustomColors(mcpColormap + "melonstem.png", 8, 1);
         String[] myceliumPaths = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         myceliumParticleColors = getCustomColors(mcpColormap, myceliumPaths, -1, -1);
         Pair<LightMapPack[], Integer> lightMaps = parseLightMapPacks();
         lightMapPacks = (LightMapPack[])lightMaps.getLeft();
         lightmapMinDimensionId = (Integer)lightMaps.getRight();
         readColorProperties("mcpatcher/color.properties");
         blockColormaps = readBlockColormaps(new String[]{mcpColormap + "custom/", mcpColormap + "blocks/"}, colorsBlockColormaps, 256, 256);
         updateUseDefaultGrassFoliageColors();
      }
   }

   private static String getValidProperty(String fileName, String key, String[] validValues, String valDef) {
      try {
         jy loc = new jy(fileName);
         InputStream in = Config.getResourceStream(loc);
         if (in == null) {
            return valDef;
         } else {
            Properties props = new PropertiesOrdered();
            props.load(in);
            in.close();
            String val = props.getProperty(key);
            if (val == null) {
               return valDef;
            } else {
               List<String> listValidValues = Arrays.asList(validValues);
               if (!listValidValues.contains(val)) {
                  warn("Invalid value: " + key + "=" + val);
                  warn("Expected values: " + Config.arrayToString(validValues));
                  return valDef;
               } else {
                  dbg("" + key + "=" + val);
                  return val;
               }
            }
         }
      } catch (FileNotFoundException e) {
         return valDef;
      } catch (IOException e) {
         e.printStackTrace();
         return valDef;
      }
   }

   private static Pair<LightMapPack[], Integer> parseLightMapPacks() {
      String lightmapPrefix = "mcpatcher/lightmap/world";
      String lightmapSuffix = ".png";
      String[] pathsLightmap = ResUtils.collectFiles(lightmapPrefix, lightmapSuffix);
      Map<Integer, String> mapLightmaps = new HashMap<>();

      for (int i = 0; i < pathsLightmap.length; i++) {
         String path = pathsLightmap[i];
         String dimIdStr = StrUtils.removePrefixSuffix(path, lightmapPrefix, lightmapSuffix);
         int dimId = Config.parseInt(dimIdStr, Integer.MIN_VALUE);
         if (dimId == Integer.MIN_VALUE) {
            warn("Invalid dimension ID: " + dimIdStr + ", path: " + path);
         } else {
            mapLightmaps.put(dimId, path);
         }
      }

      Set<Integer> setDimIds = mapLightmaps.keySet();
      Integer[] dimIds = setDimIds.toArray(new Integer[setDimIds.size()]);
      Arrays.sort(dimIds);
      if (dimIds.length <= 0) {
         return new ImmutablePair(null, 0);
      }

      int minDimId = dimIds[0];
      int maxDimId = dimIds[dimIds.length - 1];
      int countDim = maxDimId - minDimId + 1;
      CustomColormap[] colormaps = new CustomColormap[countDim];

      for (int i = 0; i < dimIds.length; i++) {
         Integer dimId = dimIds[i];
         String path = mapLightmaps.get(dimId);
         CustomColormap colors = getCustomColors(path, -1, -1);
         if (colors != null) {
            if (colors.getWidth() < 16) {
               warn("Invalid lightmap width: " + colors.getWidth() + ", path: " + path);
            } else {
               int lightmapIndex = dimId - minDimId;
               colormaps[lightmapIndex] = colors;
            }
         }
      }

      LightMapPack[] lmps = new LightMapPack[colormaps.length];

      for (int i = 0; i < colormaps.length; i++) {
         CustomColormap cm = colormaps[i];
         if (cm != null) {
            String name = cm.name;
            String basePath = cm.basePath;
            CustomColormap cmRain = getCustomColors(basePath + "/" + name + "_rain.png", -1, -1);
            CustomColormap cmThunder = getCustomColors(basePath + "/" + name + "_thunder.png", -1, -1);
            LightMap lm = new LightMap(cm);
            LightMap lmRain = cmRain != null ? new LightMap(cmRain) : null;
            LightMap lmThunder = cmThunder != null ? new LightMap(cmThunder) : null;
            LightMapPack lmp = new LightMapPack(lm, lmRain, lmThunder);
            lmps[i] = lmp;
         }
      }

      return new ImmutablePair(lmps, minDimId);
   }

   private static int getTextureHeight(String path, int defHeight) {
      try {
         InputStream in = Config.getResourceStream(new jy(path));
         if (in == null) {
            return defHeight;
         }

         BufferedImage bi = ImageIO.read(in);
         in.close();
         return bi == null ? defHeight : bi.getHeight();
      } catch (IOException e) {
         return defHeight;
      }
   }

   private static void readColorProperties(String fileName) {
      try {
         jy loc = new jy(fileName);
         InputStream in = Config.getResourceStream(loc);
         if (in == null) {
            return;
         }

         dbg("Loading " + fileName);
         Properties props = new PropertiesOrdered();
         props.load(in);
         in.close();
         particleWaterColor = readColor(props, new String[]{"particle.water", "drop.water"});
         particlePortalColor = readColor(props, "particle.portal");
         lilyPadColor = readColor(props, "lilypad");
         expBarTextColor = readColor(props, "text.xpbar");
         bossTextColor = readColor(props, "text.boss");
         signTextColor = readColor(props, "text.sign");
         fogColorNether = readColorVec3(props, "fog.nether");
         fogColorEnd = readColorVec3(props, "fog.end");
         skyColorEnd = readColorVec3(props, "sky.end");
         colorsBlockColormaps = readCustomColormaps(props, fileName);
         spawnEggPrimaryColors = readSpawnEggColors(props, fileName, "egg.shell.", "Spawn egg shell");
         spawnEggSecondaryColors = readSpawnEggColors(props, fileName, "egg.spots.", "Spawn egg spot");
         wolfCollarColors = readDyeColors(props, fileName, "collar.", "Wolf collar");
         sheepColors = readDyeColors(props, fileName, "sheep.", "Sheep");
         textColors = readTextColors(props, fileName, "text.code.", "Text");
         int[] mapColors = readMapColors(props, fileName, "map.", "Map");
         if (mapColors != null) {
            if (mapColorsOriginal == null) {
               mapColorsOriginal = getMapColors();
            }

            setMapColors(mapColors);
         }

         potionColors = readPotionColors(props, fileName, "potion.", "Potion");
         xpOrbTime = Config.parseInt(props.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException e) {
         return;
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static CustomColormap[] readCustomColormaps(Properties props, String fileName) {
      List list = new ArrayList();
      String palettePrefix = "palette.block.";
      Map map = new HashMap();

      for (String key : props.keySet()) {
         String value = props.getProperty(key);
         if (key.startsWith(palettePrefix)) {
            map.put(key, value);
         }
      }

      String[] propNames = map.keySet().toArray(new String[map.size()]);

      for (int i = 0; i < propNames.length; i++) {
         String name = propNames[i];
         String value = props.getProperty(name);
         dbg("Block palette: " + name + " = " + value);
         String path = name.substring(palettePrefix.length());
         String basePath = TextureUtils.getBasePath(fileName);
         path = TextureUtils.fixResourcePath(path, basePath);
         CustomColormap colors = getCustomColors(path, 256, 256);
         if (colors == null) {
            warn("Colormap not found: " + path);
         } else {
            ConnectedParser cp = new ConnectedParser("CustomColors");
            MatchBlock[] mbs = cp.parseMatchBlocks(value);
            if (mbs != null && mbs.length > 0) {
               for (int m = 0; m < mbs.length; m++) {
                  MatchBlock mb = mbs[m];
                  colors.addMatchBlock(mb);
               }

               list.add(colors);
            } else {
               warn("Invalid match blocks: " + value);
            }
         }
      }

      return list.size() <= 0 ? null : list.toArray(new CustomColormap[list.size()]);
   }

   private static CustomColormap[][] readBlockColormaps(String[] basePaths, CustomColormap[] basePalettes, int width, int height) {
      String[] paths = ResUtils.collectFiles(basePaths, new String[]{".properties"});
      Arrays.sort(paths);
      List blockList = new ArrayList();

      for (int i = 0; i < paths.length; i++) {
         String path = paths[i];
         dbg("Block colormap: " + path);

         try {
            jy locFile = new jy("minecraft", path);
            InputStream in = Config.getResourceStream(locFile);
            if (in == null) {
               warn("File not found: " + path);
            } else {
               Properties props = new PropertiesOrdered();
               props.load(in);
               in.close();
               CustomColormap cm = new CustomColormap(props, path, width, height, paletteFormatDefault);
               if (cm.isValid(path) && cm.isValidMatchBlocks(path)) {
                  addToBlockList(cm, blockList);
               }
            }
         } catch (FileNotFoundException e) {
            warn("File not found: " + path);
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      if (basePalettes != null) {
         for (int i = 0; i < basePalettes.length; i++) {
            CustomColormap cm = basePalettes[i];
            addToBlockList(cm, blockList);
         }
      }

      return blockList.size() <= 0 ? (CustomColormap[][])null : blockListToArray(blockList);
   }

   private static void addToBlockList(CustomColormap cm, List blockList) {
      int[] ids = cm.getMatchBlockIds();
      if (ids != null && ids.length > 0) {
         for (int i = 0; i < ids.length; i++) {
            int blockId = ids[i];
            if (blockId < 0) {
               warn("Invalid block ID: " + blockId);
            } else {
               addToList(cm, blockList, blockId);
            }
         }
      } else {
         warn("No match blocks: " + Config.arrayToString(ids));
      }
   }

   private static void addToList(CustomColormap cm, List list, int id) {
      while (id >= list.size()) {
         list.add(null);
      }

      List subList = (List)list.get(id);
      if (subList == null) {
         subList = new ArrayList();
         list.set(id, subList);
      }

      subList.add(cm);
   }

   private static CustomColormap[][] blockListToArray(List list) {
      CustomColormap[][] colArr = new CustomColormap[list.size()][];

      for (int i = 0; i < list.size(); i++) {
         List subList = (List)list.get(i);
         if (subList != null) {
            CustomColormap[] subArr = subList.toArray(new CustomColormap[subList.size()]);
            colArr[i] = subArr;
         }
      }

      return colArr;
   }

   private static int readColor(Properties props, String[] names) {
      for (int i = 0; i < names.length; i++) {
         String name = names[i];
         int col = readColor(props, name);
         if (col >= 0) {
            return col;
         }
      }

      return -1;
   }

   private static int readColor(Properties props, String name) {
      String str = props.getProperty(name);
      if (str == null) {
         return -1;
      } else {
         str = str.trim();
         int color = parseColor(str);
         if (color < 0) {
            warn("Invalid color: " + name + " = " + str);
            return color;
         } else {
            dbg(name + " = " + str);
            return color;
         }
      }
   }

   private static int parseColor(String str) {
      if (str == null) {
         return -1;
      }

      str = str.trim();

      try {
         return Integer.parseInt(str, 16) & 16777215;
      } catch (NumberFormatException e) {
         return -1;
      }
   }

   private static aui readColorVec3(Properties props, String name) {
      int col = readColor(props, name);
      if (col < 0) {
         return null;
      }

      int red = col >> 16 & 0xFF;
      int green = col >> 8 & 0xFF;
      int blue = col & 0xFF;
      float redF = red / 255.0F;
      float greenF = green / 255.0F;
      float blueF = blue / 255.0F;
      return new aui(redF, greenF, blueF);
   }

   private static CustomColormap getCustomColors(String basePath, String[] paths, int width, int height) {
      for (int i = 0; i < paths.length; i++) {
         String path = paths[i];
         path = basePath + path;
         CustomColormap cols = getCustomColors(path, width, height);
         if (cols != null) {
            return cols;
         }
      }

      return null;
   }

   public static CustomColormap getCustomColors(String pathImage, int width, int height) {
      try {
         jy loc = new jy(pathImage);
         if (!Config.hasResource(loc)) {
            return null;
         }

         dbg("Colormap " + pathImage);
         Properties props = new PropertiesOrdered();
         String pathProps = StrUtils.replaceSuffix(pathImage, ".png", ".properties");
         jy locProps = new jy(pathProps);
         if (Config.hasResource(locProps)) {
            InputStream in = Config.getResourceStream(locProps);
            props.load(in);
            in.close();
            dbg("Colormap properties: " + pathProps);
         } else {
            props.put("format", paletteFormatDefault);
            props.put("source", pathImage);
            pathProps = pathImage;
         }

         CustomColormap cm = new CustomColormap(props, pathProps, width, height, paletteFormatDefault);
         return !cm.isValid(pathProps) ? null : cm;
      } catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }

   public static void updateUseDefaultGrassFoliageColors() {
      useDefaultGrassFoliageColors = foliageBirchColors == null
         && foliagePineColors == null
         && swampGrassColors == null
         && swampFoliageColors == null
         && Config.isSwampColors()
         && Config.isSmoothBiomes();
   }

   public static int getColorMultiplier(bgg quad, alz blockState, adq blockAccess, cj blockPos, RenderEnv renderEnv) {
      afh block = blockState.c();
      alz bs = renderEnv.getBlockState();
      if (blockColormaps != null) {
         if (!quad.b()) {
            if (block == afi.c) {
               bs = BLOCK_STATE_DIRT;
            }

            if (block == afi.af) {
               return -1;
            }
         }

         if (block == afi.cF && renderEnv.getMetadata() >= 8) {
            blockPos = blockPos.b();
            bs = blockAccess.p(blockPos);
         }

         CustomColormap cm = getBlockColormap(bs);
         if (cm != null) {
            if (Config.isSmoothBiomes() && !cm.isColorConstant()) {
               return getSmoothColorMultiplier(blockState, blockAccess, blockPos, cm, renderEnv.getColorizerBlockPosM());
            }

            return cm.getColor(blockAccess, blockPos);
         }
      }

      if (!quad.b()) {
         return -1;
      }

      if (block == afi.bx) {
         return getLilypadColorMultiplier(blockAccess, blockPos);
      }

      if (block == afi.af) {
         return getRedstoneColor(renderEnv.getBlockState());
      }

      if (block instanceof ajx) {
         return getStemColorMultiplier(block, blockAccess, blockPos, renderEnv);
      }

      if (useDefaultGrassFoliageColors) {
         return -1;
      }

      int metadata = renderEnv.getMetadata();
      CustomColors.IColorizer colorizer;
      if (block == afi.c || block == afi.H || block == afi.cF) {
         colorizer = COLORIZER_GRASS;
      } else if (block == afi.cF) {
         colorizer = COLORIZER_GRASS;
         if (metadata >= 8) {
            blockPos = blockPos.b();
         }
      } else if (block == afi.t) {
         switch (metadata & 3) {
            case 0:
               colorizer = COLORIZER_FOLIAGE;
               break;
            case 1:
               colorizer = COLORIZER_FOLIAGE_PINE;
               break;
            case 2:
               colorizer = COLORIZER_FOLIAGE_BIRCH;
               break;
            default:
               colorizer = COLORIZER_FOLIAGE;
         }
      } else if (block == afi.u) {
         colorizer = COLORIZER_FOLIAGE;
      } else {
         if (block != afi.bn) {
            return -1;
         }

         colorizer = COLORIZER_FOLIAGE;
      }

      return Config.isSmoothBiomes() && !colorizer.isColorConstant()
         ? getSmoothColorMultiplier(blockState, blockAccess, blockPos, colorizer, renderEnv.getColorizerBlockPosM())
         : colorizer.getColor(bs, blockAccess, blockPos);
   }

   protected static ady getColorBiome(adq blockAccess, cj blockPos) {
      ady biome = blockAccess.b(blockPos);
      if (biome == ady.v && !Config.isSwampColors()) {
         biome = ady.q;
      }

      return biome;
   }

   private static CustomColormap getBlockColormap(alz blockState) {
      if (blockColormaps == null) {
         return null;
      }

      if (!(blockState instanceof aly)) {
         return null;
      }

      aly bs = (aly)blockState;
      int blockId = bs.getBlockId();
      if (blockId >= 0 && blockId < blockColormaps.length) {
         CustomColormap[] cms = blockColormaps[blockId];
         if (cms == null) {
            return null;
         }

         for (int i = 0; i < cms.length; i++) {
            CustomColormap cm = cms[i];
            if (cm.matchesBlock(bs)) {
               return cm;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static int getSmoothColorMultiplier(alz blockState, adq blockAccess, cj blockPos, CustomColors.IColorizer colorizer, BlockPosM blockPosM) {
      int sumRed = 0;
      int sumGreen = 0;
      int sumBlue = 0;
      int x = blockPos.n();
      int y = blockPos.o();
      int z = blockPos.p();
      BlockPosM posM = blockPosM;

      for (int ix = x - 1; ix <= x + 1; ix++) {
         for (int iz = z - 1; iz <= z + 1; iz++) {
            posM.setXyz(ix, y, iz);
            int col = colorizer.getColor(blockState, blockAccess, posM);
            sumRed += col >> 16 & 0xFF;
            sumGreen += col >> 8 & 0xFF;
            sumBlue += col & 0xFF;
         }
      }

      int r = sumRed / 9;
      int g = sumGreen / 9;
      int b = sumBlue / 9;
      return r << 16 | g << 8 | b;
   }

   public static int getFluidColor(adq blockAccess, alz blockState, cj blockPos, RenderEnv renderEnv) {
      afh block = blockState.c();
      CustomColors.IColorizer colorizer = getBlockColormap(blockState);
      if (colorizer == null && blockState.c().t() == arm.h) {
         colorizer = COLORIZER_WATER;
      }

      if (colorizer == null) {
         return block.a(blockAccess, blockPos, 0);
      } else {
         return Config.isSmoothBiomes() && !colorizer.isColorConstant()
            ? getSmoothColorMultiplier(blockState, blockAccess, blockPos, colorizer, renderEnv.getColorizerBlockPosM())
            : colorizer.getColor(blockState, blockAccess, blockPos);
      }
   }

   public static void updatePortalFX(beb fx) {
      if (particlePortalColor >= 0) {
         int col = particlePortalColor;
         int red = col >> 16 & 0xFF;
         int green = col >> 8 & 0xFF;
         int blue = col & 0xFF;
         float redF = red / 255.0F;
         float greenF = green / 255.0F;
         float blueF = blue / 255.0F;
         fx.b(redF, greenF, blueF);
      }
   }

   public static void updateMyceliumFX(beb fx) {
      if (myceliumParticleColors != null) {
         int col = myceliumParticleColors.getColorRandom();
         int red = col >> 16 & 0xFF;
         int green = col >> 8 & 0xFF;
         int blue = col & 0xFF;
         float redF = red / 255.0F;
         float greenF = green / 255.0F;
         float blueF = blue / 255.0F;
         fx.b(redF, greenF, blueF);
      }
   }

   private static int getRedstoneColor(alz blockState) {
      if (redstoneColors == null) {
         return -1;
      }

      int level = getRedstoneLevel(blockState, 15);
      return redstoneColors.getColor(level);
   }

   public static void updateReddustFX(beb fx, adq blockAccess, double x, double y, double z) {
      if (redstoneColors != null) {
         alz state = blockAccess.p(new cj(x, y, z));
         int level = getRedstoneLevel(state, 15);
         int col = redstoneColors.getColor(level);
         int red = col >> 16 & 0xFF;
         int green = col >> 8 & 0xFF;
         int blue = col & 0xFF;
         float redF = red / 255.0F;
         float greenF = green / 255.0F;
         float blueF = blue / 255.0F;
         fx.b(redF, greenF, blueF);
      }
   }

   private static int getRedstoneLevel(alz state, int def) {
      afh block = state.c();
      if (!(block instanceof ajb)) {
         return def;
      }

      Object val = state.b(ajb.P);
      if (!(val instanceof Integer)) {
         return def;
      }

      Integer valInt = (Integer)val;
      return valInt;
   }

   public static float getXpOrbTimer(float timer) {
      if (xpOrbTime <= 0) {
         return timer;
      }

      float kt = 628.0F / xpOrbTime;
      return timer * kt;
   }

   public static int getXpOrbColor(float timer) {
      if (xpOrbColors == null) {
         return -1;
      }

      int index = (int)Math.round((ns.a(timer) + 1.0F) * (xpOrbColors.getLength() - 1) / 2.0);
      return xpOrbColors.getColor(index);
   }

   public static int getDurabilityColor(int dur255) {
      if (durabilityColors == null) {
         return -1;
      }

      int index = dur255 * durabilityColors.getLength() / 255;
      return durabilityColors.getColor(index);
   }

   public static void updateWaterFX(beb fx, adq blockAccess, double x, double y, double z, RenderEnv renderEnv) {
      if (waterColors != null || blockColormaps != null || particleWaterColor >= 0) {
         cj blockPos = new cj(x, y, z);
         renderEnv.reset(BLOCK_STATE_WATER, blockPos);
         int col = getFluidColor(blockAccess, BLOCK_STATE_WATER, blockPos, renderEnv);
         int red = col >> 16 & 0xFF;
         int green = col >> 8 & 0xFF;
         int blue = col & 0xFF;
         float redF = red / 255.0F;
         float greenF = green / 255.0F;
         float blueF = blue / 255.0F;
         if (particleWaterColor >= 0) {
            int redDrop = particleWaterColor >> 16 & 0xFF;
            int greenDrop = particleWaterColor >> 8 & 0xFF;
            int blueDrop = particleWaterColor & 0xFF;
            redF *= redDrop / 255.0F;
            greenF *= greenDrop / 255.0F;
            blueF *= blueDrop / 255.0F;
         }

         fx.b(redF, greenF, blueF);
      }
   }

   private static int getLilypadColorMultiplier(adq blockAccess, cj blockPos) {
      return lilyPadColor < 0 ? afi.bx.d(blockAccess, blockPos) : lilyPadColor;
   }

   private static aui getFogColorNether(aui col) {
      return fogColorNether == null ? col : fogColorNether;
   }

   private static aui getFogColorEnd(aui col) {
      return fogColorEnd == null ? col : fogColorEnd;
   }

   private static aui getSkyColorEnd(aui col) {
      return skyColorEnd == null ? col : skyColorEnd;
   }

   public static aui getSkyColor(aui skyColor3d, adq blockAccess, double x, double y, double z) {
      if (skyColors == null) {
         return skyColor3d;
      }

      int col = skyColors.getColorSmooth(blockAccess, x, y, z, 3);
      int red = col >> 16 & 0xFF;
      int green = col >> 8 & 0xFF;
      int blue = col & 0xFF;
      float redF = red / 255.0F;
      float greenF = green / 255.0F;
      float blueF = blue / 255.0F;
      float cRed = (float)skyColor3d.a / 0.5F;
      float cGreen = (float)skyColor3d.b / 0.66275F;
      float cBlue = (float)skyColor3d.c;
      redF *= cRed;
      greenF *= cGreen;
      blueF *= cBlue;
      return skyColorFader.getColor(redF, greenF, blueF);
   }

   private static aui getFogColor(aui fogColor3d, adq blockAccess, double x, double y, double z) {
      if (fogColors == null) {
         return fogColor3d;
      }

      int col = fogColors.getColorSmooth(blockAccess, x, y, z, 3);
      int red = col >> 16 & 0xFF;
      int green = col >> 8 & 0xFF;
      int blue = col & 0xFF;
      float redF = red / 255.0F;
      float greenF = green / 255.0F;
      float blueF = blue / 255.0F;
      float cRed = (float)fogColor3d.a / 0.753F;
      float cGreen = (float)fogColor3d.b / 0.8471F;
      float cBlue = (float)fogColor3d.c;
      redF *= cRed;
      greenF *= cGreen;
      blueF *= cBlue;
      return fogColorFader.getColor(redF, greenF, blueF);
   }

   public static aui getUnderwaterColor(adq blockAccess, double x, double y, double z) {
      return getUnderFluidColor(blockAccess, x, y, z, underwaterColors, underwaterColorFader);
   }

   public static aui getUnderlavaColor(adq blockAccess, double x, double y, double z) {
      return getUnderFluidColor(blockAccess, x, y, z, underlavaColors, underlavaColorFader);
   }

   public static aui getUnderFluidColor(adq blockAccess, double x, double y, double z, CustomColormap underFluidColors, CustomColorFader underFluidColorFader) {
      if (underFluidColors == null) {
         return null;
      }

      int col = underFluidColors.getColorSmooth(blockAccess, x, y, z, 3);
      int red = col >> 16 & 0xFF;
      int green = col >> 8 & 0xFF;
      int blue = col & 0xFF;
      float redF = red / 255.0F;
      float greenF = green / 255.0F;
      float blueF = blue / 255.0F;
      return underFluidColorFader.getColor(redF, greenF, blueF);
   }

   private static int getStemColorMultiplier(afh blockStem, adq blockAccess, cj blockPos, RenderEnv renderEnv) {
      CustomColormap colors = stemColors;
      if (blockStem == afi.bl && stemPumpkinColors != null) {
         colors = stemPumpkinColors;
      }

      if (blockStem == afi.bm && stemMelonColors != null) {
         colors = stemMelonColors;
      }

      if (colors == null) {
         return -1;
      }

      int level = renderEnv.getMetadata();
      return colors.getColor(level);
   }

   public static boolean updateLightmap(adm world, float torchFlickerX, int[] lmColors, boolean nightvision, float partialTicks) {
      if (world == null) {
         return false;
      } else if (lightMapPacks == null) {
         return false;
      } else {
         int dimensionId = world.t.q();
         int lightMapIndex = dimensionId - lightmapMinDimensionId;
         if (lightMapIndex >= 0 && lightMapIndex < lightMapPacks.length) {
            LightMapPack lightMapPack = lightMapPacks[lightMapIndex];
            return lightMapPack == null ? false : lightMapPack.updateLightmap(world, torchFlickerX, lmColors, nightvision, partialTicks);
         } else {
            return false;
         }
      }
   }

   public static aui getWorldFogColor(aui fogVec, adm world, pk renderViewEntity, float partialTicks) {
      int worldType = world.t.q();
      switch (worldType) {
         case -1:
            fogVec = getFogColorNether(fogVec);
            break;
         case 0:
            ave mc = ave.A();
            fogVec = getFogColor(fogVec, mc.f, renderViewEntity.s, renderViewEntity.t + 1.0, renderViewEntity.u);
            break;
         case 1:
            fogVec = getFogColorEnd(fogVec);
      }

      return fogVec;
   }

   public static aui getWorldSkyColor(aui skyVec, adm world, pk renderViewEntity, float partialTicks) {
      int worldType = world.t.q();
      switch (worldType) {
         case 0:
            ave mc = ave.A();
            skyVec = getSkyColor(skyVec, mc.f, renderViewEntity.s, renderViewEntity.t + 1.0, renderViewEntity.u);
            break;
         case 1:
            skyVec = getSkyColorEnd(skyVec);
      }

      return skyVec;
   }

   private static int[] readSpawnEggColors(Properties props, String fileName, String prefix, String logName) {
      List<Integer> list = new ArrayList<>();
      Set keys = props.keySet();
      int countColors = 0;

      for (String key : keys) {
         String value = props.getProperty(key);
         if (key.startsWith(prefix)) {
            String name = StrUtils.removePrefix(key, prefix);
            int id = EntityUtils.getEntityIdByName(name);
            if (id < 0) {
               warn("Invalid spawn egg name: " + key);
            } else {
               int color = parseColor(value);
               if (color < 0) {
                  warn("Invalid spawn egg color: " + key + " = " + value);
               } else {
                  while (list.size() <= id) {
                     list.add(-1);
                  }

                  list.set(id, color);
                  countColors++;
               }
            }
         }
      }

      if (countColors <= 0) {
         return null;
      }

      dbg(logName + " colors: " + countColors);
      int[] colors = new int[list.size()];

      for (int i = 0; i < colors.length; i++) {
         colors[i] = list.get(i);
      }

      return colors;
   }

   private static int getSpawnEggColor(aax item, zx itemStack, int layer, int color) {
      int id = itemStack.i();
      int[] eggColors = layer == 0 ? spawnEggPrimaryColors : spawnEggSecondaryColors;
      if (eggColors == null) {
         return color;
      } else if (id >= 0 && id < eggColors.length) {
         int eggColor = eggColors[id];
         return eggColor < 0 ? color : eggColor;
      } else {
         return color;
      }
   }

   public static int getColorFromItemStack(zx itemStack, int layer, int color) {
      if (itemStack == null) {
         return color;
      } else {
         zw item = itemStack.b();
         if (item == null) {
            return color;
         } else {
            return item instanceof aax ? getSpawnEggColor((aax)item, itemStack, layer, color) : color;
         }
      }
   }

   private static float[][] readDyeColors(Properties props, String fileName, String prefix, String logName) {
      zd[] dyeValues = zd.values();
      Map<String, zd> mapDyes = new HashMap<>();

      for (int i = 0; i < dyeValues.length; i++) {
         zd dye = dyeValues[i];
         mapDyes.put(dye.l(), dye);
      }

      float[][] colors = new float[dyeValues.length][];
      int countColors = 0;

      for (String key : props.keySet()) {
         String value = props.getProperty(key);
         if (key.startsWith(prefix)) {
            String name = StrUtils.removePrefix(key, prefix);
            if (name.equals("lightBlue")) {
               name = "light_blue";
            }

            zd dye = mapDyes.get(name);
            int color = parseColor(value);
            if (dye != null && color >= 0) {
               float[] rgb = new float[]{(color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F};
               colors[dye.ordinal()] = rgb;
               countColors++;
            } else {
               warn("Invalid color: " + key + " = " + value);
            }
         }
      }

      if (countColors <= 0) {
         return (float[][])null;
      }

      dbg(logName + " colors: " + countColors);
      return colors;
   }

   private static float[] getDyeColors(zd dye, float[][] dyeColors, float[] colors) {
      if (dyeColors == null) {
         return colors;
      }

      if (dye == null) {
         return colors;
      }

      float[] customColors = dyeColors[dye.ordinal()];
      return customColors == null ? colors : customColors;
   }

   public static float[] getWolfCollarColors(zd dye, float[] colors) {
      return getDyeColors(dye, wolfCollarColors, colors);
   }

   public static float[] getSheepColors(zd dye, float[] colors) {
      return getDyeColors(dye, sheepColors, colors);
   }

   private static int[] readTextColors(Properties props, String fileName, String prefix, String logName) {
      int[] colors = new int[32];
      Arrays.fill(colors, -1);
      int countColors = 0;

      for (String key : props.keySet()) {
         String value = props.getProperty(key);
         if (key.startsWith(prefix)) {
            String name = StrUtils.removePrefix(key, prefix);
            int code = Config.parseInt(name, -1);
            int color = parseColor(value);
            if (code >= 0 && code < colors.length && color >= 0) {
               colors[code] = color;
               countColors++;
            } else {
               warn("Invalid color: " + key + " = " + value);
            }
         }
      }

      if (countColors <= 0) {
         return null;
      }

      dbg(logName + " colors: " + countColors);
      return colors;
   }

   public static int getTextColor(int index, int color) {
      if (textColors == null) {
         return color;
      } else if (index >= 0 && index < textColors.length) {
         int customColor = textColors[index];
         return customColor < 0 ? color : customColor;
      } else {
         return color;
      }
   }

   private static int[] readMapColors(Properties props, String fileName, String prefix, String logName) {
      int[] colors = new int[arn.a.length];
      Arrays.fill(colors, -1);
      int countColors = 0;

      for (String key : props.keySet()) {
         String value = props.getProperty(key);
         if (key.startsWith(prefix)) {
            String name = StrUtils.removePrefix(key, prefix);
            int index = getMapColorIndex(name);
            int color = parseColor(value);
            if (index >= 0 && index < colors.length && color >= 0) {
               colors[index] = color;
               countColors++;
            } else {
               warn("Invalid color: " + key + " = " + value);
            }
         }
      }

      if (countColors <= 0) {
         return null;
      }

      dbg(logName + " colors: " + countColors);
      return colors;
   }

   private static int[] readPotionColors(Properties props, String fileName, String prefix, String logName) {
      int[] colors = new int[pe.a.length];
      Arrays.fill(colors, -1);
      int countColors = 0;

      for (String key : props.keySet()) {
         String value = props.getProperty(key);
         if (key.startsWith(prefix)) {
            String name = key;
            int index = getPotionId(name);
            int color = parseColor(value);
            if (index >= 0 && index < colors.length && color >= 0) {
               colors[index] = color;
               countColors++;
            } else {
               warn("Invalid color: " + key + " = " + value);
            }
         }
      }

      if (countColors <= 0) {
         return null;
      }

      dbg(logName + " colors: " + countColors);
      return colors;
   }

   private static int getPotionId(String name) {
      if (name.equals("potion.water")) {
         return 0;
      }

      pe[] potions = pe.a;

      for (int i = 0; i < potions.length; i++) {
         pe potion = potions[i];
         if (potion != null && potion.a().equals(name)) {
            return potion.d();
         }
      }

      return -1;
   }

   public static int getPotionColor(int potionId, int color) {
      if (potionColors == null) {
         return color;
      } else if (potionId >= 0 && potionId < potionColors.length) {
         int potionColor = potionColors[potionId];
         return potionColor < 0 ? color : potionColor;
      } else {
         return color;
      }
   }

   private static int getMapColorIndex(String name) {
      if (name == null) {
         return -1;
      } else if (name.equals("air")) {
         return arn.b.M;
      } else if (name.equals("grass")) {
         return arn.c.M;
      } else if (name.equals("sand")) {
         return arn.d.M;
      } else if (name.equals("cloth")) {
         return arn.e.M;
      } else if (name.equals("tnt")) {
         return arn.f.M;
      } else if (name.equals("ice")) {
         return arn.g.M;
      } else if (name.equals("iron")) {
         return arn.h.M;
      } else if (name.equals("foliage")) {
         return arn.i.M;
      } else if (name.equals("clay")) {
         return arn.k.M;
      } else if (name.equals("dirt")) {
         return arn.l.M;
      } else if (name.equals("stone")) {
         return arn.m.M;
      } else if (name.equals("water")) {
         return arn.n.M;
      } else if (name.equals("wood")) {
         return arn.o.M;
      } else if (name.equals("quartz")) {
         return arn.p.M;
      } else if (name.equals("gold")) {
         return arn.F.M;
      } else if (name.equals("diamond")) {
         return arn.G.M;
      } else if (name.equals("lapis")) {
         return arn.H.M;
      } else if (name.equals("emerald")) {
         return arn.I.M;
      } else if (name.equals("podzol")) {
         return arn.J.M;
      } else if (name.equals("netherrack")) {
         return arn.K.M;
      } else if (name.equals("snow") || name.equals("white")) {
         return arn.j.M;
      } else if (name.equals("adobe") || name.equals("orange")) {
         return arn.q.M;
      } else if (name.equals("magenta")) {
         return arn.r.M;
      } else if (name.equals("light_blue") || name.equals("lightBlue")) {
         return arn.s.M;
      } else if (name.equals("yellow")) {
         return arn.t.M;
      } else if (name.equals("lime")) {
         return arn.u.M;
      } else if (name.equals("pink")) {
         return arn.v.M;
      } else if (name.equals("gray")) {
         return arn.w.M;
      } else if (name.equals("silver")) {
         return arn.x.M;
      } else if (name.equals("cyan")) {
         return arn.y.M;
      } else if (name.equals("purple")) {
         return arn.z.M;
      } else if (name.equals("blue")) {
         return arn.A.M;
      } else if (name.equals("brown")) {
         return arn.B.M;
      } else if (name.equals("green")) {
         return arn.C.M;
      } else if (name.equals("red")) {
         return arn.D.M;
      } else {
         return name.equals("black") ? arn.E.M : -1;
      }
   }

   private static int[] getMapColors() {
      arn[] mapColors = arn.a;
      int[] colors = new int[mapColors.length];
      Arrays.fill(colors, -1);

      for (int i = 0; i < mapColors.length && i < colors.length; i++) {
         arn mapColor = mapColors[i];
         if (mapColor != null) {
            colors[i] = mapColor.L;
         }
      }

      return colors;
   }

   private static void setMapColors(int[] colors) {
      if (colors != null) {
         arn[] mapColors = arn.a;
         boolean changed = false;

         for (int i = 0; i < mapColors.length && i < colors.length; i++) {
            arn mapColor = mapColors[i];
            if (mapColor != null) {
               int color = colors[i];
               if (color >= 0 && mapColor.L != color) {
                  mapColor.L = color;
                  changed = true;
               }
            }
         }

         if (changed) {
            ave.A().P().reloadBannerTextures();
         }
      }
   }

   private static void dbg(String str) {
      Config.dbg("CustomColors: " + str);
   }

   private static void warn(String str) {
      Config.warn("CustomColors: " + str);
   }

   public static int getExpBarTextColor(int color) {
      return expBarTextColor < 0 ? color : expBarTextColor;
   }

   public static int getBossTextColor(int color) {
      return bossTextColor < 0 ? color : bossTextColor;
   }

   public static int getSignTextColor(int color) {
      return signTextColor < 0 ? color : signTextColor;
   }

   public interface IColorizer {
      int getColor(alz var1, adq var2, cj var3);

      boolean isColorConstant();
   }
}
