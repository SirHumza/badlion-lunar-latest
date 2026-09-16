package net.optifine;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import net.optifine.config.ConnectedParser;
import net.optifine.config.EntityClassLocator;
import net.optifine.config.IObjectLocator;
import net.optifine.config.ItemLocator;
import net.optifine.reflect.ReflectorForge;
import net.optifine.util.PropertiesOrdered;

public class DynamicLights {
   private static DynamicLightsMap mapDynamicLights = new DynamicLightsMap();
   private static Map<Class, Integer> mapEntityLightLevels = new HashMap<>();
   private static Map<zw, Integer> mapItemLightLevels = new HashMap<>();
   private static long timeUpdateMs = 0L;
   private static final double MAX_DIST = 7.5;
   private static final double MAX_DIST_SQ = 56.25;
   private static final int LIGHT_LEVEL_MAX = 15;
   private static final int LIGHT_LEVEL_FIRE = 15;
   private static final int LIGHT_LEVEL_BLAZE = 10;
   private static final int LIGHT_LEVEL_MAGMA_CUBE = 8;
   private static final int LIGHT_LEVEL_MAGMA_CUBE_CORE = 13;
   private static final int LIGHT_LEVEL_GLOWSTONE_DUST = 8;
   private static final int LIGHT_LEVEL_PRISMARINE_CRYSTALS = 8;
   private static boolean initialized;

   public static void entityAdded(pk entityIn, bfr renderGlobal) {
   }

   public static void entityRemoved(pk entityIn, bfr renderGlobal) {
      synchronized (mapDynamicLights) {
         DynamicLight dynamicLight = mapDynamicLights.remove(entityIn.F());
         if (dynamicLight != null) {
            dynamicLight.updateLitChunks(renderGlobal);
         }
      }
   }

   public static void update(bfr renderGlobal) {
      long timeNowMs = System.currentTimeMillis();
      if (timeNowMs >= timeUpdateMs + 50L) {
         timeUpdateMs = timeNowMs;
         if (!initialized) {
            initialize();
         }

         synchronized (mapDynamicLights) {
            updateMapDynamicLights(renderGlobal);
            if (mapDynamicLights.size() > 0) {
               List<DynamicLight> dynamicLights = mapDynamicLights.valueList();

               for (int i = 0; i < dynamicLights.size(); i++) {
                  DynamicLight dynamicLight = dynamicLights.get(i);
                  dynamicLight.update(renderGlobal);
               }
            }
         }
      }
   }

   private static void initialize() {
      initialized = true;
      mapEntityLightLevels.clear();
      mapItemLightLevels.clear();
      String[] modIds = ReflectorForge.getForgeModIds();

      for (int i = 0; i < modIds.length; i++) {
         String modId = modIds[i];

         try {
            jy loc = new jy(modId, "optifine/dynamic_lights.properties");
            InputStream in = Config.getResourceStream(loc);
            loadModConfiguration(in, loc.toString(), modId);
         } catch (IOException e) {
         }
      }

      if (mapEntityLightLevels.size() > 0) {
         Config.dbg("DynamicLights entities: " + mapEntityLightLevels.size());
      }

      if (mapItemLightLevels.size() > 0) {
         Config.dbg("DynamicLights items: " + mapItemLightLevels.size());
      }
   }

   private static void loadModConfiguration(InputStream in, String path, String modId) {
      if (in != null) {
         try {
            Properties props = new PropertiesOrdered();
            props.load(in);
            in.close();
            Config.dbg("DynamicLights: Parsing " + path);
            ConnectedParser cp = new ConnectedParser("DynamicLights");
            loadModLightLevels(props.getProperty("entities"), mapEntityLightLevels, new EntityClassLocator(), cp, path, modId);
            loadModLightLevels(props.getProperty("items"), mapItemLightLevels, new ItemLocator(), cp, path, modId);
         } catch (IOException e) {
            Config.warn("DynamicLights: Error reading " + path);
         }
      }
   }

   private static void loadModLightLevels(String prop, Map mapLightLevels, IObjectLocator ol, ConnectedParser cp, String path, String modId) {
      if (prop != null) {
         String[] parts = Config.tokenize(prop, " ");

         for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            String[] tokens = Config.tokenize(part, ":");
            if (tokens.length != 2) {
               cp.warn("Invalid entry: " + part + ", in:" + path);
            } else {
               String name = tokens[0];
               String light = tokens[1];
               String nameFull = modId + ":" + name;
               jy loc = new jy(nameFull);
               Object obj = ol.getObject(loc);
               if (obj == null) {
                  cp.warn("Object not found: " + nameFull);
               } else {
                  int lightLevel = cp.parseInt(light, -1);
                  if (lightLevel >= 0 && lightLevel <= 15) {
                     mapLightLevels.put(obj, new Integer(lightLevel));
                  } else {
                     cp.warn("Invalid light level: " + part);
                  }
               }
            }
         }
      }
   }

   private static void updateMapDynamicLights(bfr renderGlobal) {
      adm world = renderGlobal.getWorld();
      if (world != null) {
         for (pk entity : world.E()) {
            int lightLevel = getLightLevel(entity);
            if (lightLevel > 0) {
               int key = entity.F();
               DynamicLight dynamicLight = mapDynamicLights.get(key);
               if (dynamicLight == null) {
                  dynamicLight = new DynamicLight(entity);
                  mapDynamicLights.put(key, dynamicLight);
               }
            } else {
               int key = entity.F();
               DynamicLight dynamicLight = mapDynamicLights.remove(key);
               if (dynamicLight != null) {
                  dynamicLight.updateLitChunks(renderGlobal);
               }
            }
         }
      }
   }

   public static int getCombinedLight(cj pos, int combinedLight) {
      double lightPlayer = getLightLevel(pos);
      return getCombinedLight(lightPlayer, combinedLight);
   }

   public static int getCombinedLight(pk entity, int combinedLight) {
      double lightPlayer = getLightLevel(entity);
      return getCombinedLight(lightPlayer, combinedLight);
   }

   public static int getCombinedLight(double lightPlayer, int combinedLight) {
      if (lightPlayer > 0.0) {
         int lightPlayerFF = (int)(lightPlayer * 16.0);
         int lightBlockFF = combinedLight & 0xFF;
         if (lightPlayerFF > lightBlockFF) {
            combinedLight &= -256;
            combinedLight |= lightPlayerFF;
         }
      }

      return combinedLight;
   }

   public static double getLightLevel(cj pos) {
      double lightLevelMax = 0.0;
      synchronized (mapDynamicLights) {
         List<DynamicLight> dynamicLights = mapDynamicLights.valueList();
         int dynamicLightsSize = dynamicLights.size();

         for (int i = 0; i < dynamicLightsSize; i++) {
            DynamicLight dynamicLight = dynamicLights.get(i);
            int dynamicLightLevel = dynamicLight.getLastLightLevel();
            if (dynamicLightLevel > 0) {
               double px = dynamicLight.getLastPosX();
               double py = dynamicLight.getLastPosY();
               double pz = dynamicLight.getLastPosZ();
               double dx = pos.n() - px;
               double dy = pos.o() - py;
               double dz = pos.p() - pz;
               double distSq = dx * dx + dy * dy + dz * dz;
               if (dynamicLight.isUnderwater() && !Config.isClearWater()) {
                  dynamicLightLevel = Config.limit(dynamicLightLevel - 2, 0, 15);
                  distSq *= 2.0;
               }

               if (!(distSq > 56.25)) {
                  double dist = Math.sqrt(distSq);
                  double light = 1.0 - dist / 7.5;
                  double lightLevel = light * dynamicLightLevel;
                  if (lightLevel > lightLevelMax) {
                     lightLevelMax = lightLevel;
                  }
               }
            }
         }
      }

      return Config.limit(lightLevelMax, 0.0, 15.0);
   }

   public static int getLightLevel(zx itemStack) {
      if (itemStack == null) {
         return 0;
      }

      zw item = itemStack.b();
      if (item instanceof yo) {
         yo itemBlock = (yo)item;
         afh block = itemBlock.d();
         if (block != null) {
            return block.r();
         }
      }

      if (item == zy.ay) {
         return afi.l.r();
      }

      if (item == zy.bv || item == zy.bD) {
         return 10;
      }

      if (item == zy.aT) {
         return 8;
      }

      if (item == zy.cD) {
         return 8;
      }

      if (item == zy.bE) {
         return 8;
      }

      if (item == zy.bZ) {
         return afi.bY.r() / 2;
      }

      if (!mapItemLightLevels.isEmpty()) {
         Integer level = mapItemLightLevels.get(item);
         if (level != null) {
            return level;
         }
      }

      return 0;
   }

   public static int getLightLevel(pk entity) {
      if (entity == Config.getMinecraft().ac() && !Config.isDynamicHandLight()) {
         return 0;
      }

      if (entity instanceof wn) {
         wn player = (wn)entity;
         if (player.v()) {
            return 0;
         }
      }

      if (entity.at()) {
         return 15;
      }

      if (!mapEntityLightLevels.isEmpty()) {
         Integer level = mapEntityLightLevels.get(entity.getClass());
         if (level != null) {
            return level;
         }
      }

      if (entity instanceof ws) {
         return 15;
      }

      if (entity instanceof vj) {
         return 15;
      }

      if (entity instanceof vl) {
         vl entityBlaze = (vl)entity;
         return entityBlaze.n() ? 15 : 10;
      }

      if (entity instanceof vu) {
         vu emc = (vu)entity;
         return emc.b > 0.6 ? 13 : 8;
      }

      if (entity instanceof vn) {
         vn entityCreeper = (vn)entity;
         if (entityCreeper.a(0.0F) > 0.001) {
            return 15;
         }
      }

      if (entity instanceof pr) {
         pr player = (pr)entity;
         zx stackMain = player.bA();
         int levelMain = getLightLevel(stackMain);
         zx stackHead = player.p(4);
         int levelHead = getLightLevel(stackHead);
         return Math.max(levelMain, levelHead);
      } else if (entity instanceof uz) {
         uz entityItem = (uz)entity;
         zx itemStack = getItemStack(entityItem);
         return getLightLevel(itemStack);
      } else {
         return 0;
      }
   }

   public static void removeLights(bfr renderGlobal) {
      synchronized (mapDynamicLights) {
         List<DynamicLight> dynamicLights = mapDynamicLights.valueList();

         for (int i = 0; i < dynamicLights.size(); i++) {
            DynamicLight dynamicLight = dynamicLights.get(i);
            dynamicLight.updateLitChunks(renderGlobal);
         }

         mapDynamicLights.clear();
      }
   }

   public static void clear() {
      synchronized (mapDynamicLights) {
         mapDynamicLights.clear();
      }
   }

   public static int getCount() {
      synchronized (mapDynamicLights) {
         return mapDynamicLights.size();
      }
   }

   public static zx getItemStack(uz entityItem) {
      return entityItem.H().f(10);
   }
}
