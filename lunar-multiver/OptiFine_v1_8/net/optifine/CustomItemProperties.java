package net.optifine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import net.optifine.config.IParserInt;
import net.optifine.config.NbtTagValue;
import net.optifine.config.ParserEnchantmentId;
import net.optifine.config.RangeInt;
import net.optifine.config.RangeListInt;
import net.optifine.reflect.Reflector;
import net.optifine.render.Blender;
import net.optifine.util.StrUtils;
import net.optifine.util.TextureUtils;
import org.lwjgl.opengl.GL11;
import yj.a;

public class CustomItemProperties {
   public String name = null;
   public String basePath = null;
   public int type = 1;
   public int[] items = null;
   public String texture = null;
   public Map<String, String> mapTextures = null;
   public String model = null;
   public Map<String, String> mapModels = null;
   public RangeListInt damage = null;
   public boolean damagePercent = false;
   public int damageMask = 0;
   public RangeListInt stackSize = null;
   public RangeListInt enchantmentIds = null;
   public RangeListInt enchantmentLevels = null;
   public NbtTagValue[] nbtTagValues = null;
   public int hand = 0;
   public int blend = 1;
   public float speed = 0.0F;
   public float rotation = 0.0F;
   public int layer = 0;
   public float duration = 1.0F;
   public int weight = 0;
   public jy textureLocation = null;
   public Map mapTextureLocations = null;
   public bmi sprite = null;
   public Map mapSprites = null;
   public boq bakedModelTexture = null;
   public Map<String, boq> mapBakedModelsTexture = null;
   public boq bakedModelFull = null;
   public Map<String, boq> mapBakedModelsFull = null;
   private int textureWidth = 0;
   private int textureHeight = 0;
   public static final int TYPE_UNKNOWN = 0;
   public static final int TYPE_ITEM = 1;
   public static final int TYPE_ENCHANTMENT = 2;
   public static final int TYPE_ARMOR = 3;
   public static final int HAND_ANY = 0;
   public static final int HAND_MAIN = 1;
   public static final int HAND_OFF = 2;
   public static final String INVENTORY = "inventory";

   public CustomItemProperties(Properties props, String path) {
      this.name = parseName(path);
      this.basePath = parseBasePath(path);
      this.type = this.parseType(props.getProperty("type"));
      this.items = this.parseItems(props.getProperty("items"), props.getProperty("matchItems"));
      this.mapModels = parseModels(props, this.basePath);
      this.model = parseModel(props.getProperty("model"), path, this.basePath, this.type, this.mapModels);
      this.mapTextures = parseTextures(props, this.basePath);
      boolean textureFromPath = this.mapModels == null && this.model == null;
      this.texture = parseTexture(
         props.getProperty("texture"),
         props.getProperty("tile"),
         props.getProperty("source"),
         path,
         this.basePath,
         this.type,
         this.mapTextures,
         textureFromPath
      );
      String damageStr = props.getProperty("damage");
      if (damageStr != null) {
         this.damagePercent = damageStr.contains("%");
         damageStr = damageStr.replace("%", "");
         this.damage = this.parseRangeListInt(damageStr);
         this.damageMask = this.parseInt(props.getProperty("damageMask"), 0);
      }

      this.stackSize = this.parseRangeListInt(props.getProperty("stackSize"));
      this.enchantmentIds = this.parseRangeListInt(props.getProperty("enchantmentIDs"), new ParserEnchantmentId());
      this.enchantmentLevels = this.parseRangeListInt(props.getProperty("enchantmentLevels"));
      this.nbtTagValues = this.parseNbtTagValues(props);
      this.hand = this.parseHand(props.getProperty("hand"));
      this.blend = Blender.parseBlend(props.getProperty("blend"));
      this.speed = this.parseFloat(props.getProperty("speed"), 0.0F);
      this.rotation = this.parseFloat(props.getProperty("rotation"), 0.0F);
      this.layer = this.parseInt(props.getProperty("layer"), 0);
      this.weight = this.parseInt(props.getProperty("weight"), 0);
      this.duration = this.parseFloat(props.getProperty("duration"), 1.0F);
   }

   private static String parseName(String path) {
      String str = path;
      int pos = str.lastIndexOf(47);
      if (pos >= 0) {
         str = str.substring(pos + 1);
      }

      int pos2 = str.lastIndexOf(46);
      if (pos2 >= 0) {
         str = str.substring(0, pos2);
      }

      return str;
   }

   private static String parseBasePath(String path) {
      int pos = path.lastIndexOf(47);
      return pos < 0 ? "" : path.substring(0, pos);
   }

   private int parseType(String str) {
      if (str == null) {
         return 1;
      }

      if (str.equals("item")) {
         return 1;
      }

      if (str.equals("enchantment")) {
         return 2;
      }

      if (str.equals("armor")) {
         return 3;
      }

      Config.warn("Unknown method: " + str);
      return 0;
   }

   private int[] parseItems(String str, String str2) {
      if (str == null) {
         str = str2;
      }

      if (str == null) {
         return null;
      }

      str = str.trim();
      Set setItemIds = new TreeSet();
      String[] tokens = Config.tokenize(str, " ");

      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         int val = Config.parseInt(token, -1);
         if (val >= 0) {
            setItemIds.add(new Integer(val));
         } else {
            if (token.contains("-")) {
               String[] parts = Config.tokenize(token, "-");
               if (parts.length == 2) {
                  int val1 = Config.parseInt(parts[0], -1);
                  int val2 = Config.parseInt(parts[1], -1);
                  if (val1 >= 0 && val2 >= 0) {
                     int min = Math.min(val1, val2);
                     int max = Math.max(val1, val2);

                     for (int x = min; x <= max; x++) {
                        setItemIds.add(new Integer(x));
                     }
                     continue;
                  }
               }
            }

            zw item = zw.d(token);
            if (item == null) {
               Config.warn("Item not found: " + token);
            } else {
               int id = zw.b(item);
               if (id <= 0) {
                  Config.warn("Item not found: " + token);
               } else {
                  setItemIds.add(new Integer(id));
               }
            }
         }
      }

      Integer[] integers = setItemIds.toArray(new Integer[setItemIds.size()]);
      int[] ints = new int[integers.length];

      for (int i = 0; i < ints.length; i++) {
         ints[i] = integers[i];
      }

      return ints;
   }

   private static String parseTexture(
      String texStr, String texStr2, String texStr3, String path, String basePath, int type, Map<String, String> mapTexs, boolean textureFromPath
   ) {
      if (texStr == null) {
         texStr = texStr2;
      }

      if (texStr == null) {
         texStr = texStr3;
      }

      if (texStr != null) {
         String png = ".png";
         if (texStr.endsWith(png)) {
            texStr = texStr.substring(0, texStr.length() - png.length());
         }

         return fixTextureName(texStr, basePath);
      } else {
         if (type == 3) {
            return null;
         }

         if (mapTexs != null) {
            String bowStandbyTex = mapTexs.get("texture.bow_standby");
            if (bowStandbyTex != null) {
               return bowStandbyTex;
            }
         }

         if (!textureFromPath) {
            return null;
         }

         String str = path;
         int pos = str.lastIndexOf(47);
         if (pos >= 0) {
            str = str.substring(pos + 1);
         }

         int pos2 = str.lastIndexOf(46);
         if (pos2 >= 0) {
            str = str.substring(0, pos2);
         }

         return fixTextureName(str, basePath);
      }
   }

   private static Map parseTextures(Properties props, String basePath) {
      String prefix = "texture.";
      Map mapProps = getMatchingProperties(props, prefix);
      if (mapProps.size() <= 0) {
         return null;
      }

      Set keySet = mapProps.keySet();
      Map mapTex = new LinkedHashMap();

      for (String key : keySet) {
         String val = (String)mapProps.get(key);
         val = fixTextureName(val, basePath);
         mapTex.put(key, val);
      }

      return mapTex;
   }

   private static String fixTextureName(String iconName, String basePath) {
      iconName = TextureUtils.fixResourcePath(iconName, basePath);
      if (!iconName.startsWith(basePath) && !iconName.startsWith("textures/") && !iconName.startsWith("mcpatcher/")) {
         iconName = basePath + "/" + iconName;
      }

      if (iconName.endsWith(".png")) {
         iconName = iconName.substring(0, iconName.length() - 4);
      }

      if (iconName.startsWith("/")) {
         iconName = iconName.substring(1);
      }

      return iconName;
   }

   private static String parseModel(String modelStr, String path, String basePath, int type, Map<String, String> mapModelNames) {
      if (modelStr != null) {
         String json = ".json";
         if (modelStr.endsWith(json)) {
            modelStr = modelStr.substring(0, modelStr.length() - json.length());
         }

         return fixModelName(modelStr, basePath);
      } else {
         if (type == 3) {
            return null;
         }

         if (mapModelNames != null) {
            String bowStandbyModel = mapModelNames.get("model.bow_standby");
            if (bowStandbyModel != null) {
               return bowStandbyModel;
            }
         }

         return modelStr;
      }
   }

   private static Map parseModels(Properties props, String basePath) {
      String prefix = "model.";
      Map mapProps = getMatchingProperties(props, prefix);
      if (mapProps.size() <= 0) {
         return null;
      }

      Set keySet = mapProps.keySet();
      Map mapTex = new LinkedHashMap();

      for (String key : keySet) {
         String val = (String)mapProps.get(key);
         val = fixModelName(val, basePath);
         mapTex.put(key, val);
      }

      return mapTex;
   }

   private static String fixModelName(String modelName, String basePath) {
      modelName = TextureUtils.fixResourcePath(modelName, basePath);
      boolean isVanilla = modelName.startsWith("block/") || modelName.startsWith("item/");
      if (!modelName.startsWith(basePath) && !isVanilla && !modelName.startsWith("mcpatcher/")) {
         modelName = basePath + "/" + modelName;
      }

      String json = ".json";
      if (modelName.endsWith(json)) {
         modelName = modelName.substring(0, modelName.length() - json.length());
      }

      if (modelName.startsWith("/")) {
         modelName = modelName.substring(1);
      }

      return modelName;
   }

   private int parseInt(String str, int defVal) {
      if (str == null) {
         return defVal;
      } else {
         str = str.trim();
         int val = Config.parseInt(str, Integer.MIN_VALUE);
         if (val == Integer.MIN_VALUE) {
            Config.warn("Invalid integer: " + str);
            return defVal;
         } else {
            return val;
         }
      }
   }

   private float parseFloat(String str, float defVal) {
      if (str == null) {
         return defVal;
      } else {
         str = str.trim();
         float val = Config.parseFloat(str, Float.MIN_VALUE);
         if (val == Float.MIN_VALUE) {
            Config.warn("Invalid float: " + str);
            return defVal;
         } else {
            return val;
         }
      }
   }

   private RangeListInt parseRangeListInt(String str) {
      return this.parseRangeListInt(str, null);
   }

   private RangeListInt parseRangeListInt(String str, IParserInt parser) {
      if (str == null) {
         return null;
      }

      String[] tokens = Config.tokenize(str, " ");
      RangeListInt rangeList = new RangeListInt();

      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         if (parser != null) {
            int val = parser.parse(token, Integer.MIN_VALUE);
            if (val != Integer.MIN_VALUE) {
               rangeList.addRange(new RangeInt(val, val));
               continue;
            }
         }

         RangeInt range = this.parseRangeInt(token);
         if (range == null) {
            Config.warn("Invalid range list: " + str);
            return null;
         }

         rangeList.addRange(range);
      }

      return rangeList;
   }

   private RangeInt parseRangeInt(String str) {
      if (str == null) {
         return null;
      }

      str = str.trim();
      int countMinus = str.length() - str.replace("-", "").length();
      if (countMinus > 1) {
         Config.warn("Invalid range: " + str);
         return null;
      }

      String[] tokens = Config.tokenize(str, "- ");
      int[] vals = new int[tokens.length];

      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         int val = Config.parseInt(token, -1);
         if (val < 0) {
            Config.warn("Invalid range: " + str);
            return null;
         }

         vals[i] = val;
      }

      if (vals.length == 1) {
         int val = vals[0];
         if (str.startsWith("-")) {
            return new RangeInt(0, val);
         } else {
            return str.endsWith("-") ? new RangeInt(val, 65535) : new RangeInt(val, val);
         }
      } else if (vals.length == 2) {
         int min = Math.min(vals[0], vals[1]);
         int max = Math.max(vals[0], vals[1]);
         return new RangeInt(min, max);
      } else {
         Config.warn("Invalid range: " + str);
         return null;
      }
   }

   private NbtTagValue[] parseNbtTagValues(Properties props) {
      String PREFIX_NBT = "nbt.";
      Map mapNbt = getMatchingProperties(props, PREFIX_NBT);
      if (mapNbt.size() <= 0) {
         return null;
      }

      List listNbts = new ArrayList();

      for (String key : mapNbt.keySet()) {
         String val = (String)mapNbt.get(key);
         String id = key.substring(PREFIX_NBT.length());
         NbtTagValue nbt = new NbtTagValue(id, val);
         listNbts.add(nbt);
      }

      NbtTagValue[] nbts = listNbts.toArray(new NbtTagValue[listNbts.size()]);
      return nbts;
   }

   private static Map getMatchingProperties(Properties props, String keyPrefix) {
      Map map = new LinkedHashMap();

      for (String key : props.keySet()) {
         String val = props.getProperty(key);
         if (key.startsWith(keyPrefix)) {
            map.put(key, val);
         }
      }

      return map;
   }

   private int parseHand(String str) {
      if (str == null) {
         return 0;
      }

      str = str.toLowerCase();
      if (str.equals("any")) {
         return 0;
      }

      if (str.equals("main")) {
         return 1;
      }

      if (str.equals("off")) {
         return 2;
      }

      Config.warn("Invalid hand: " + str);
      return 0;
   }

   public boolean isValid(String path) {
      if (this.name == null || this.name.length() <= 0) {
         Config.warn("No name found: " + path);
         return false;
      }

      if (this.basePath == null) {
         Config.warn("No base path found: " + path);
         return false;
      }

      if (this.type == 0) {
         Config.warn("No type defined: " + path);
         return false;
      }

      if (this.type == 1 || this.type == 3) {
         if (this.items == null) {
            this.items = this.detectItems();
         }

         if (this.items == null) {
            Config.warn("No items defined: " + path);
            return false;
         }
      }

      if (this.texture == null && this.mapTextures == null && this.model == null && this.mapModels == null) {
         Config.warn("No texture or model specified: " + path);
         return false;
      } else if (this.type == 2 && this.enchantmentIds == null) {
         Config.warn("No enchantmentIDs specified: " + path);
         return false;
      } else {
         return true;
      }
   }

   private int[] detectItems() {
      zw item = zw.d(this.name);
      if (item == null) {
         return null;
      }

      int id = zw.b(item);
      return id <= 0 ? null : new int[]{id};
   }

   public void updateIcons(bmh textureMap) {
      if (this.texture != null) {
         this.textureLocation = this.getTextureLocation(this.texture);
         if (this.type == 1) {
            jy spriteLocation = this.getSpriteLocation(this.textureLocation);
            this.sprite = textureMap.a(spriteLocation);
         }
      }

      if (this.mapTextures != null) {
         this.mapTextureLocations = new HashMap();
         this.mapSprites = new HashMap();

         for (String key : this.mapTextures.keySet()) {
            String val = this.mapTextures.get(key);
            jy locTex = this.getTextureLocation(val);
            this.mapTextureLocations.put(key, locTex);
            if (this.type == 1) {
               jy locSprite = this.getSpriteLocation(locTex);
               bmi icon = textureMap.a(locSprite);
               this.mapSprites.put(key, icon);
            }
         }
      }
   }

   private jy getTextureLocation(String texName) {
      if (texName == null) {
         return null;
      }

      jy resLoc = new jy(texName);
      String domain = resLoc.b();
      String path = resLoc.a();
      if (!path.contains("/")) {
         path = "textures/items/" + path;
      }

      String filePath = path + ".png";
      jy locFile = new jy(domain, filePath);
      boolean exists = Config.hasResource(locFile);
      if (!exists) {
         Config.warn("File not found: " + filePath);
      }

      return locFile;
   }

   private jy getSpriteLocation(jy resLoc) {
      String pathTex = resLoc.a();
      pathTex = StrUtils.removePrefix(pathTex, "textures/");
      pathTex = StrUtils.removeSuffix(pathTex, ".png");
      return new jy(resLoc.b(), pathTex);
   }

   public void updateModelTexture(bmh textureMap, bgp itemModelGenerator) {
      if (this.texture != null || this.mapTextures != null) {
         String[] textures = this.getModelTextures();
         boolean useTint = this.isUseTint();
         this.bakedModelTexture = makeBakedModel(textureMap, itemModelGenerator, textures, useTint);
         if (this.type == 1 && this.mapTextures != null) {
            for (String key : this.mapTextures.keySet()) {
               String tex = this.mapTextures.get(key);
               String path = StrUtils.removePrefix(key, "texture.");
               if (path.startsWith("bow") || path.startsWith("fishing_rod") || path.startsWith("shield")) {
                  String[] texNames = new String[]{tex};
                  boq modelTex = makeBakedModel(textureMap, itemModelGenerator, texNames, useTint);
                  if (this.mapBakedModelsTexture == null) {
                     this.mapBakedModelsTexture = new HashMap<>();
                  }

                  String location = path;
                  this.mapBakedModelsTexture.put(location, modelTex);
               }
            }
         }
      }
   }

   private boolean isUseTint() {
      return true;
   }

   private static boq makeBakedModel(bmh textureMap, bgp itemModelGenerator, String[] textures, boolean useTint) {
      String[] spriteNames = new String[textures.length];

      for (int i = 0; i < spriteNames.length; i++) {
         String texture = textures[i];
         spriteNames[i] = StrUtils.removePrefix(texture, "textures/");
      }

      bgl modelBlockBase = makeModelBlock(spriteNames);
      bgl modelBlock = itemModelGenerator.a(textureMap, modelBlockBase);
      return bakeModel(textureMap, modelBlock, useTint);
   }

   private String[] getModelTextures() {
      if (this.type == 1 && this.items.length == 1) {
         zw item = zw.b(this.items[0]);
         if (item == zy.bz && this.damage != null && this.damage.getCountRanges() > 0) {
            RangeInt range = this.damage.getRange(0);
            int valDamage = range.getMin();
            boolean splash = (valDamage & 16384) != 0;
            String texOverlay = this.getMapTexture(this.mapTextures, "texture.potion_overlay", "items/potion_overlay");
            String texMain = null;
            if (splash) {
               texMain = this.getMapTexture(this.mapTextures, "texture.potion_bottle_splash", "items/potion_bottle_splash");
            } else {
               texMain = this.getMapTexture(this.mapTextures, "texture.potion_bottle_drinkable", "items/potion_bottle_drinkable");
            }

            return new String[]{texOverlay, texMain};
         }

         if (item instanceof yj) {
            yj itemArmor = (yj)item;
            if (itemArmor.x_() == a.a) {
               String material = "leather";
               String type = "helmet";
               if (itemArmor.b == 0) {
                  type = "helmet";
               }

               if (itemArmor.b == 1) {
                  type = "chestplate";
               }

               if (itemArmor.b == 2) {
                  type = "leggings";
               }

               if (itemArmor.b == 3) {
                  type = "boots";
               }

               String key = material + "_" + type;
               String texMain = this.getMapTexture(this.mapTextures, "texture." + key, "items/" + key);
               String texOverlay = this.getMapTexture(this.mapTextures, "texture." + key + "_overlay", "items/" + key + "_overlay");
               return new String[]{texMain, texOverlay};
            }
         }
      }

      return new String[]{this.texture};
   }

   private String getMapTexture(Map<String, String> map, String key, String def) {
      if (map == null) {
         return def;
      }

      String str = map.get(key);
      return str == null ? def : str;
   }

   private static bgl makeModelBlock(String[] modelTextures) {
      StringBuffer sb = new StringBuffer();
      sb.append("{\"parent\": \"builtin/generated\",\"textures\": {");

      for (int i = 0; i < modelTextures.length; i++) {
         String modelTexture = modelTextures[i];
         if (i > 0) {
            sb.append(", ");
         }

         sb.append("\"layer" + i + "\": \"" + modelTexture + "\"");
      }

      sb.append("}}");
      String modelStr = sb.toString();
      return bgl.a(modelStr);
   }

   private static boq bakeModel(bmh textureMap, bgl modelBlockIn, boolean useTint) {
      bor modelRotationIn = bor.a;
      boolean uvLocked = false;
      String spriteParticleName = modelBlockIn.c("particle");
      bmi var4 = textureMap.a(new jy(spriteParticleName).toString());
      bow.a var5 = new bow.a(modelBlockIn).a(var4);

      for (bgh var7 : modelBlockIn.a()) {
         for (cq var9 : var7.c.keySet()) {
            bgi var10 = (bgi)var7.c.get(var9);
            if (!useTint) {
               var10 = new bgi(var10.b, -1, var10.d, var10.e);
            }

            String spriteName = modelBlockIn.c(var10.d);
            bmi var11 = textureMap.a(new jy(spriteName).toString());
            bgg quad = makeBakedQuad(var7, var10, var11, var9, modelRotationIn, uvLocked);
            if (var10.b == null) {
               var5.a(quad);
            } else {
               var5.a(modelRotationIn.a(var10.b), quad);
            }
         }
      }

      return var5.b();
   }

   private static bgg makeBakedQuad(bgh blockPart, bgi blockPartFace, bmi textureAtlasSprite, cq enumFacing, bor modelRotation, boolean uvLocked) {
      bgo faceBakery = new bgo();
      return faceBakery.a(blockPart.a, blockPart.b, blockPartFace, textureAtlasSprite, enumFacing, modelRotation, blockPart.d, uvLocked, blockPart.e);
   }

   @Override
   public String toString() {
      return "" + this.basePath + "/" + this.name + ", type: " + this.type + ", items: [" + Config.arrayToString(this.items) + "], textture: " + this.texture;
   }

   public float getTextureWidth(bmj textureManager) {
      if (this.textureWidth <= 0) {
         if (this.textureLocation != null) {
            bmk tex = textureManager.b(this.textureLocation);
            int texId = tex.b();
            int prevTexId = bfl.getBoundTexture();
            bfl.i(texId);
            this.textureWidth = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            bfl.i(prevTexId);
         }

         if (this.textureWidth <= 0) {
            this.textureWidth = 16;
         }
      }

      return this.textureWidth;
   }

   public float getTextureHeight(bmj textureManager) {
      if (this.textureHeight <= 0) {
         if (this.textureLocation != null) {
            bmk tex = textureManager.b(this.textureLocation);
            int texId = tex.b();
            int prevTexId = bfl.getBoundTexture();
            bfl.i(texId);
            this.textureHeight = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            bfl.i(prevTexId);
         }

         if (this.textureHeight <= 0) {
            this.textureHeight = 16;
         }
      }

      return this.textureHeight;
   }

   public boq getBakedModel(jy modelLocation, boolean fullModel) {
      boq bakedModel;
      Map<String, boq> mapBakedModels;
      if (fullModel) {
         bakedModel = this.bakedModelFull;
         mapBakedModels = this.mapBakedModelsFull;
      } else {
         bakedModel = this.bakedModelTexture;
         mapBakedModels = this.mapBakedModelsTexture;
      }

      if (modelLocation != null && mapBakedModels != null) {
         String modelPath = modelLocation.a();
         boq customModel = mapBakedModels.get(modelPath);
         if (customModel != null) {
            return customModel;
         }
      }

      return bakedModel;
   }

   public void loadModels(bot modelBakery) {
      if (this.model != null) {
         loadItemModel(modelBakery, this.model);
      }

      if (this.type == 1 && this.mapModels != null) {
         for (String key : this.mapModels.keySet()) {
            String mod = this.mapModels.get(key);
            String path = StrUtils.removePrefix(key, "model.");
            if (path.startsWith("bow") || path.startsWith("fishing_rod") || path.startsWith("shield")) {
               loadItemModel(modelBakery, mod);
            }
         }
      }
   }

   public void updateModelsFull() {
      bou modelManager = Config.getModelManager();
      boq missingModel = modelManager.a();
      if (this.model != null) {
         jy locItem = getModelLocation(this.model);
         bov mrl = new bov(locItem, "inventory");
         this.bakedModelFull = modelManager.a(mrl);
         if (this.bakedModelFull == missingModel) {
            Config.warn("Custom Items: Model not found " + mrl.a());
            this.bakedModelFull = null;
         }
      }

      if (this.type == 1 && this.mapModels != null) {
         for (String key : this.mapModels.keySet()) {
            String mod = this.mapModels.get(key);
            String path = StrUtils.removePrefix(key, "model.");
            if (path.startsWith("bow") || path.startsWith("fishing_rod") || path.startsWith("shield")) {
               jy locItem = getModelLocation(mod);
               bov mrl = new bov(locItem, "inventory");
               boq bm = modelManager.a(mrl);
               if (bm == missingModel) {
                  Config.warn("Custom Items: Model not found " + mrl.a());
               } else {
                  if (this.mapBakedModelsFull == null) {
                     this.mapBakedModelsFull = new HashMap<>();
                  }

                  String location = path;
                  this.mapBakedModelsFull.put(location, bm);
               }
            }
         }
      }
   }

   private static void loadItemModel(bot modelBakery, String model) {
      jy locItem = getModelLocation(model);
      bov mrl = new bov(locItem, "inventory");
      if (Reflector.ModelLoader.exists()) {
         try {
            Object vanillaLoader = Reflector.ModelLoader_VanillaLoader_INSTANCE.getValue();
            checkNull(vanillaLoader, "vanillaLoader is null");
            Object iModel = Reflector.call(vanillaLoader, Reflector.ModelLoader_VanillaLoader_loadModel, mrl);
            checkNull(iModel, "iModel is null");
            Map stateModels = (Map)Reflector.getFieldValue(modelBakery, Reflector.ModelLoader_stateModels);
            checkNull(stateModels, "stateModels is null");
            stateModels.put(mrl, iModel);
            Set registryTextures = (Set)Reflector.getFieldValue(modelBakery, Reflector.ModelLoader_textures);
            checkNull(registryTextures, "registryTextures is null");
            Collection modelTextures = (Collection)Reflector.call(iModel, Reflector.IModel_getTextures);
            checkNull(modelTextures, "modelTextures is null");
            registryTextures.addAll(modelTextures);
         } catch (Exception e) {
            Config.warn("Error registering model with ModelLoader: " + mrl + ", " + e.getClass().getName() + ": " + e.getMessage());
         }
      } else {
         modelBakery.loadItemModel(locItem.toString(), mrl, locItem);
      }
   }

   private static void checkNull(Object obj, String msg) throws NullPointerException {
      if (obj == null) {
         throw new NullPointerException(msg);
      }
   }

   private static jy getModelLocation(String modelName) {
      return Reflector.ModelLoader.exists() && !modelName.startsWith("mcpatcher/") && !modelName.startsWith("optifine/")
         ? new jy("models/" + modelName)
         : new jy(modelName);
   }
}
