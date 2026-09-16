package net.optifine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorRaw;
import net.optifine.util.IntegratedServerUtils;
import net.optifine.util.PropertiesOrdered;
import net.optifine.util.ResUtils;
import net.optifine.util.StrUtils;

public class RandomEntities {
   private static Map<String, RandomEntityProperties> mapProperties = new HashMap<>();
   private static boolean active = false;
   private static bfr renderGlobal;
   private static RandomEntity randomEntity = new RandomEntity();
   private static bhc tileEntityRendererDispatcher;
   private static RandomTileEntity randomTileEntity = new RandomTileEntity();
   private static boolean working = false;
   public static final String SUFFIX_PNG = ".png";
   public static final String SUFFIX_PROPERTIES = ".properties";
   public static final String PREFIX_TEXTURES_ENTITY = "textures/entity/";
   public static final String PREFIX_TEXTURES_PAINTING = "textures/painting/";
   public static final String PREFIX_TEXTURES = "textures/";
   public static final String PREFIX_OPTIFINE_RANDOM = "optifine/random/";
   public static final String PREFIX_MCPATCHER_MOB = "mcpatcher/mob/";
   private static final String[] DEPENDANT_SUFFIXES = new String[]{
      "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"
   };
   private static final String PREFIX_DYNAMIC_TEXTURE_HORSE = "horse/";
   private static final String[] HORSE_TEXTURES = (String[])ReflectorRaw.getFieldValue(null, tp.class, String[].class, 2);
   private static final String[] HORSE_TEXTURES_ABBR = (String[])ReflectorRaw.getFieldValue(null, tp.class, String[].class, 3);

   public static void entityLoaded(pk entity, adm world) {
      if (world != null) {
         pz edm = entity.H();
         edm.spawnPosition = entity.c();
         edm.spawnBiome = world.b(edm.spawnPosition);
         UUID uuid = entity.aK();
         if (entity instanceof wi) {
            updateEntityVillager(uuid, (wi)entity);
         }
      }
   }

   public static void entityUnloaded(pk entity, adm world) {
   }

   private static void updateEntityVillager(UUID uuid, wi ev) {
      pk se = IntegratedServerUtils.getEntity(uuid);
      if (se instanceof wi) {
         wi sev = (wi)se;
         int profSev = sev.cl();
         ev.r(profSev);
         int careerId = Reflector.getFieldValueInt(sev, Reflector.EntityVillager_careerId, 0);
         Reflector.setFieldValueInt(ev, Reflector.EntityVillager_careerId, careerId);
         int careerLevel = Reflector.getFieldValueInt(sev, Reflector.EntityVillager_careerLevel, 0);
         Reflector.setFieldValueInt(ev, Reflector.EntityVillager_careerLevel, careerLevel);
      }
   }

   public static void worldChanged(adm oldWorld, adm newWorld) {
      if (newWorld != null) {
         List entityList = newWorld.E();

         for (int e = 0; e < entityList.size(); e++) {
            pk entity = (pk)entityList.get(e);
            entityLoaded(entity, newWorld);
         }
      }

      randomEntity.setEntity(null);
      randomTileEntity.setTileEntity(null);
   }

   public static jy getTextureLocation(jy loc) {
      if (!active) {
         return loc;
      }

      if (working) {
         return loc;
      }

      try {
         working = true;
         IRandomEntity re = getRandomEntityRendered();
         if (re == null) {
            return loc;
         }

         String name = loc.a();
         if (name.startsWith("horse/")) {
            name = getHorseTexturePath(name, "horse/".length());
         }

         if (!name.startsWith("textures/entity/") && !name.startsWith("textures/painting/")) {
            return loc;
         }

         RandomEntityProperties props = mapProperties.get(name);
         return props == null ? loc : props.getTextureLocation(loc, re);
      } finally {
         working = false;
      }
   }

   private static String getHorseTexturePath(String path, int pos) {
      if (HORSE_TEXTURES != null && HORSE_TEXTURES_ABBR != null) {
         for (int i = 0; i < HORSE_TEXTURES_ABBR.length; i++) {
            String abbr = HORSE_TEXTURES_ABBR[i];
            if (path.startsWith(abbr, pos)) {
               return HORSE_TEXTURES[i];
            }
         }

         return path;
      } else {
         return path;
      }
   }

   private static IRandomEntity getRandomEntityRendered() {
      if (renderGlobal.renderedEntity != null) {
         randomEntity.setEntity(renderGlobal.renderedEntity);
         return randomEntity;
      }

      if (tileEntityRendererDispatcher.tileEntityRendered != null) {
         akw te = tileEntityRendererDispatcher.tileEntityRendered;
         if (te.z() != null) {
            randomTileEntity.setTileEntity(te);
            return randomTileEntity;
         }
      }

      return null;
   }

   private static RandomEntityProperties makeProperties(jy loc, boolean mcpatcher) {
      String path = loc.a();
      jy locProps = getLocationProperties(loc, mcpatcher);
      if (locProps != null) {
         RandomEntityProperties props = parseProperties(locProps, loc);
         if (props != null) {
            return props;
         }
      }

      jy[] variants = getLocationsVariants(loc, mcpatcher);
      return variants == null ? null : new RandomEntityProperties(path, variants);
   }

   private static RandomEntityProperties parseProperties(jy propLoc, jy resLoc) {
      try {
         String path = propLoc.a();
         dbg(resLoc.a() + ", properties: " + path);
         InputStream in = Config.getResourceStream(propLoc);
         if (in == null) {
            warn("Properties not found: " + path);
            return null;
         } else {
            Properties props = new PropertiesOrdered();
            props.load(in);
            in.close();
            RandomEntityProperties rmp = new RandomEntityProperties(props, path, resLoc);
            return !rmp.isValid(path) ? null : rmp;
         }
      } catch (FileNotFoundException e) {
         warn("File not found: " + resLoc.a());
         return null;
      } catch (IOException e) {
         e.printStackTrace();
         return null;
      }
   }

   private static jy getLocationProperties(jy loc, boolean mcpatcher) {
      jy locMcp = getLocationRandom(loc, mcpatcher);
      if (locMcp == null) {
         return null;
      }

      String domain = locMcp.b();
      String path = locMcp.a();
      String pathBase = StrUtils.removeSuffix(path, ".png");
      String pathProps = pathBase + ".properties";
      jy locProps = new jy(domain, pathProps);
      if (Config.hasResource(locProps)) {
         return locProps;
      }

      String pathParent = getParentTexturePath(pathBase);
      if (pathParent == null) {
         return null;
      }

      jy locParentProps = new jy(domain, pathParent + ".properties");
      return Config.hasResource(locParentProps) ? locParentProps : null;
   }

   protected static jy getLocationRandom(jy loc, boolean mcpatcher) {
      String domain = loc.b();
      String path = loc.a();
      String prefixTextures = "textures/";
      String prefixRandom = "optifine/random/";
      if (mcpatcher) {
         prefixTextures = "textures/entity/";
         prefixRandom = "mcpatcher/mob/";
      }

      if (!path.startsWith(prefixTextures)) {
         return null;
      }

      String pathRandom = StrUtils.replacePrefix(path, prefixTextures, prefixRandom);
      return new jy(domain, pathRandom);
   }

   private static String getPathBase(String pathRandom) {
      if (pathRandom.startsWith("optifine/random/")) {
         return StrUtils.replacePrefix(pathRandom, "optifine/random/", "textures/");
      } else {
         return pathRandom.startsWith("mcpatcher/mob/") ? StrUtils.replacePrefix(pathRandom, "mcpatcher/mob/", "textures/entity/") : null;
      }
   }

   protected static jy getLocationIndexed(jy loc, int index) {
      if (loc == null) {
         return null;
      }

      String path = loc.a();
      int pos = path.lastIndexOf(46);
      if (pos < 0) {
         return null;
      }

      String prefix = path.substring(0, pos);
      String suffix = path.substring(pos);
      String pathNew = prefix + index + suffix;
      return new jy(loc.b(), pathNew);
   }

   private static String getParentTexturePath(String path) {
      for (int i = 0; i < DEPENDANT_SUFFIXES.length; i++) {
         String suffix = DEPENDANT_SUFFIXES[i];
         if (path.endsWith(suffix)) {
            return StrUtils.removeSuffix(path, suffix);
         }
      }

      return null;
   }

   private static jy[] getLocationsVariants(jy loc, boolean mcpatcher) {
      List list = new ArrayList();
      list.add(loc);
      jy locRandom = getLocationRandom(loc, mcpatcher);
      if (locRandom == null) {
         return null;
      }

      for (int i = 1; i < list.size() + 10; i++) {
         int index = i + 1;
         jy locIndex = getLocationIndexed(locRandom, index);
         if (Config.hasResource(locIndex)) {
            list.add(locIndex);
         }
      }

      if (list.size() <= 1) {
         return null;
      }

      jy[] locs = list.toArray(new jy[list.size()]);
      dbg(loc.a() + ", variants: " + locs.length);
      return locs;
   }

   public static void update() {
      mapProperties.clear();
      active = false;
      if (Config.isRandomEntities()) {
         initialize();
      }
   }

   private static void initialize() {
      renderGlobal = Config.getRenderGlobal();
      tileEntityRendererDispatcher = bhc.a;
      String[] prefixes = new String[]{"optifine/random/", "mcpatcher/mob/"};
      String[] suffixes = new String[]{".png", ".properties"};
      String[] pathsRandom = ResUtils.collectFiles(prefixes, suffixes);
      Set basePathsChecked = new HashSet();

      for (int i = 0; i < pathsRandom.length; i++) {
         String path = pathsRandom[i];
         path = StrUtils.removeSuffix(path, suffixes);
         path = StrUtils.trimTrailing(path, "0123456789");
         path = path + ".png";
         String pathBase = getPathBase(path);
         if (!basePathsChecked.contains(pathBase)) {
            basePathsChecked.add(pathBase);
            jy locBase = new jy(pathBase);
            if (Config.hasResource(locBase)) {
               RandomEntityProperties props = mapProperties.get(pathBase);
               if (props == null) {
                  props = makeProperties(locBase, false);
                  if (props == null) {
                     props = makeProperties(locBase, true);
                  }

                  if (props != null) {
                     mapProperties.put(pathBase, props);
                  }
               }
            }
         }
      }

      active = !mapProperties.isEmpty();
   }

   public static void dbg(String str) {
      Config.dbg("RandomEntities: " + str);
   }

   public static void warn(String str) {
      Config.warn("RandomEntities: " + str);
   }
}
