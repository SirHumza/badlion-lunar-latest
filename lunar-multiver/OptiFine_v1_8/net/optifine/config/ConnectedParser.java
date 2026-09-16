package net.optifine.config;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.optifine.ConnectedProperties;
import net.optifine.util.EntityUtils;

public class ConnectedParser {
   private String context = null;
   public static final VillagerProfession[] PROFESSIONS_INVALID = new VillagerProfession[0];
   public static final zd[] DYE_COLORS_INVALID = new zd[0];
   private static final INameGetter<Enum> NAME_GETTER_ENUM = new INameGetter<Enum>() {
      public String getName(Enum en) {
         return en.name();
      }
   };
   private static final INameGetter<zd> NAME_GETTER_DYE_COLOR = new INameGetter<zd>() {
      public String getName(zd col) {
         return col.l();
      }
   };

   public ConnectedParser(String context) {
      this.context = context;
   }

   public String parseName(String path) {
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

   public String parseBasePath(String path) {
      int pos = path.lastIndexOf(47);
      return pos < 0 ? "" : path.substring(0, pos);
   }

   public MatchBlock[] parseMatchBlocks(String propMatchBlocks) {
      if (propMatchBlocks == null) {
         return null;
      }

      List list = new ArrayList();
      String[] blockStrs = Config.tokenize(propMatchBlocks, " ");

      for (int i = 0; i < blockStrs.length; i++) {
         String blockStr = blockStrs[i];
         MatchBlock[] mbs = this.parseMatchBlock(blockStr);
         if (mbs != null) {
            list.addAll(Arrays.asList(mbs));
         }
      }

      return list.toArray(new MatchBlock[list.size()]);
   }

   public alz parseBlockState(String str, alz def) {
      MatchBlock[] mbs = this.parseMatchBlock(str);
      if (mbs == null) {
         return def;
      }

      if (mbs.length != 1) {
         return def;
      }

      MatchBlock mb = mbs[0];
      int blockId = mb.getBlockId();
      afh block = afh.c(blockId);
      return block.Q();
   }

   public MatchBlock[] parseMatchBlock(String blockStr) {
      if (blockStr == null) {
         return null;
      }

      blockStr = blockStr.trim();
      if (blockStr.length() <= 0) {
         return null;
      }

      String[] parts = Config.tokenize(blockStr, ":");
      String domain = "minecraft";
      int blockIndex = 0;
      byte var16;
      if (parts.length > 1 && this.isFullBlockName(parts)) {
         domain = parts[0];
         var16 = 1;
      } else {
         domain = "minecraft";
         var16 = 0;
      }

      String blockPart = parts[var16];
      String[] params = Arrays.copyOfRange(parts, var16 + 1, parts.length);
      afh[] blocks = this.parseBlockPart(domain, blockPart);
      if (blocks == null) {
         return null;
      }

      MatchBlock[] datas = new MatchBlock[blocks.length];

      for (int i = 0; i < blocks.length; i++) {
         afh block = blocks[i];
         int blockId = afh.a(block);
         int[] metadatas = null;
         if (params.length > 0) {
            metadatas = this.parseBlockMetadatas(block, params);
            if (metadatas == null) {
               return null;
            }
         }

         MatchBlock bd = new MatchBlock(blockId, metadatas);
         datas[i] = bd;
      }

      return datas;
   }

   public boolean isFullBlockName(String[] parts) {
      if (parts.length < 2) {
         return false;
      } else {
         String part1 = parts[1];
         if (part1.length() < 1) {
            return false;
         } else {
            return this.startsWithDigit(part1) ? false : !part1.contains("=");
         }
      }
   }

   public boolean startsWithDigit(String str) {
      if (str == null) {
         return false;
      }

      if (str.length() < 1) {
         return false;
      }

      char ch = str.charAt(0);
      return Character.isDigit(ch);
   }

   public afh[] parseBlockPart(String domain, String blockPart) {
      if (this.startsWithDigit(blockPart)) {
         int[] ids = this.parseIntList(blockPart);
         if (ids == null) {
            return null;
         }

         afh[] blocks = new afh[ids.length];

         for (int i = 0; i < ids.length; i++) {
            int id = ids[i];
            afh block = afh.c(id);
            if (block == null) {
               this.warn("Block not found for id: " + id);
               return null;
            }

            blocks[i] = block;
         }

         return blocks;
      } else {
         String fullName = domain + ":" + blockPart;
         afh block = afh.b(fullName);
         if (block == null) {
            this.warn("Block not found for name: " + fullName);
            return null;
         } else {
            return new afh[]{block};
         }
      }
   }

   public int[] parseBlockMetadatas(afh block, String[] params) {
      if (params.length <= 0) {
         return null;
      }

      String param0 = params[0];
      if (this.startsWithDigit(param0)) {
         return this.parseIntList(param0);
      }

      alz stateDefault = block.Q();
      Collection properties = stateDefault.a();
      Map<amo, List<Comparable>> mapPropValues = new HashMap<>();

      for (int i = 0; i < params.length; i++) {
         String param = params[i];
         if (param.length() > 0) {
            String[] parts = Config.tokenize(param, "=");
            if (parts.length != 2) {
               this.warn("Invalid block property: " + param);
               return null;
            }

            String key = parts[0];
            String valStr = parts[1];
            amo prop = ConnectedProperties.getProperty(key, properties);
            if (prop == null) {
               this.warn("Property not found: " + key + ", block: " + block);
               return null;
            }

            List<Comparable> list = mapPropValues.get(key);
            if (list == null) {
               list = new ArrayList<>();
               mapPropValues.put(prop, list);
            }

            String[] vals = Config.tokenize(valStr, ",");

            for (int v = 0; v < vals.length; v++) {
               String val = vals[v];
               Comparable propVal = parsePropertyValue(prop, val);
               if (propVal == null) {
                  this.warn("Property value not found: " + val + ", property: " + key + ", block: " + block);
                  return null;
               }

               list.add(propVal);
            }
         }
      }

      if (mapPropValues.isEmpty()) {
         return null;
      }

      List<Integer> listMetadatas = new ArrayList<>();

      for (int i = 0; i < 16; i++) {
         int md = i;

         try {
            alz bs = this.getStateFromMeta(block, md);
            if (this.matchState(bs, mapPropValues)) {
               listMetadatas.add(md);
            }
         } catch (IllegalArgumentException e) {
         }
      }

      if (listMetadatas.size() == 16) {
         return null;
      }

      int[] metadatas = new int[listMetadatas.size()];

      for (int i = 0; i < metadatas.length; i++) {
         metadatas[i] = listMetadatas.get(i);
      }

      return metadatas;
   }

   private alz getStateFromMeta(afh block, int md) {
      try {
         alz bs = block.a(md);
         if (block == afi.cF && md > 7) {
            alz bsLow = block.a(md & 7);
            bs = bs.a(agi.a, bsLow.b(agi.a));
         }

         return bs;
      } catch (IllegalArgumentException e) {
         return block.Q();
      }
   }

   public static Comparable parsePropertyValue(amo prop, String valStr) {
      Class valueClass = prop.b();
      Comparable valueObj = parseValue(valStr, valueClass);
      if (valueObj == null) {
         Collection propertyValues = prop.c();
         valueObj = getPropertyValue(valStr, propertyValues);
      }

      return valueObj;
   }

   public static Comparable getPropertyValue(String value, Collection propertyValues) {
      for (Comparable obj : propertyValues) {
         if (getValueName(obj).equals(value)) {
            return obj;
         }
      }

      return null;
   }

   private static Object getValueName(Comparable obj) {
      if (obj instanceof nw) {
         nw iss = (nw)obj;
         return iss.l();
      } else {
         return obj.toString();
      }
   }

   public static Comparable parseValue(String str, Class cls) {
      if (cls == String.class) {
         return str;
      } else if (cls == Boolean.class) {
         return Boolean.valueOf(str);
      } else if (cls == Float.class) {
         return Float.valueOf(str);
      } else if (cls == Double.class) {
         return Double.valueOf(str);
      } else if (cls == Integer.class) {
         return Integer.valueOf(str);
      } else {
         return cls == Long.class ? Long.valueOf(str) : null;
      }
   }

   public boolean matchState(alz bs, Map<amo, List<Comparable>> mapPropValues) {
      for (amo prop : mapPropValues.keySet()) {
         List<Comparable> vals = mapPropValues.get(prop);
         Comparable bsVal = bs.b(prop);
         if (bsVal == null) {
            return false;
         }

         if (!vals.contains(bsVal)) {
            return false;
         }
      }

      return true;
   }

   public ady[] parseBiomes(String str) {
      if (str == null) {
         return null;
      }

      str = str.trim();
      boolean negative = false;
      if (str.startsWith("!")) {
         negative = true;
         str = str.substring(1);
      }

      String[] biomeNames = Config.tokenize(str, " ");
      List list = new ArrayList();

      for (int i = 0; i < biomeNames.length; i++) {
         String biomeName = biomeNames[i];
         ady biome = this.findBiome(biomeName);
         if (biome == null) {
            this.warn("Biome not found: " + biomeName);
         } else {
            list.add(biome);
         }
      }

      if (negative) {
         List<ady> listAllBiomes = new ArrayList<>(Arrays.asList(ady.n()));
         listAllBiomes.removeAll(list);
         list = listAllBiomes;
      }

      return list.toArray(new ady[list.size()]);
   }

   public ady findBiome(String biomeName) {
      biomeName = biomeName.toLowerCase();
      if (biomeName.equals("nether")) {
         return ady.x;
      }

      ady[] biomeList = ady.n();

      for (int i = 0; i < biomeList.length; i++) {
         ady biome = biomeList[i];
         if (biome != null) {
            String name = biome.ah.replace(" ", "").toLowerCase();
            if (name.equals(biomeName)) {
               return biome;
            }
         }
      }

      return null;
   }

   public int parseInt(String str, int defVal) {
      if (str == null) {
         return defVal;
      } else {
         str = str.trim();
         int num = Config.parseInt(str, -1);
         if (num < 0) {
            this.warn("Invalid number: " + str);
            return defVal;
         } else {
            return num;
         }
      }
   }

   public int[] parseIntList(String str) {
      if (str == null) {
         return null;
      }

      List<Integer> list = new ArrayList<>();
      String[] intStrs = Config.tokenize(str, " ,");

      for (int i = 0; i < intStrs.length; i++) {
         String intStr = intStrs[i];
         if (intStr.contains("-")) {
            String[] subStrs = Config.tokenize(intStr, "-");
            if (subStrs.length != 2) {
               this.warn("Invalid interval: " + intStr + ", when parsing: " + str);
            } else {
               int min = Config.parseInt(subStrs[0], -1);
               int max = Config.parseInt(subStrs[1], -1);
               if (min >= 0 && max >= 0 && min <= max) {
                  for (int n = min; n <= max; n++) {
                     list.add(n);
                  }
               } else {
                  this.warn("Invalid interval: " + intStr + ", when parsing: " + str);
               }
            }
         } else {
            int val = Config.parseInt(intStr, -1);
            if (val < 0) {
               this.warn("Invalid number: " + intStr + ", when parsing: " + str);
            } else {
               list.add(val);
            }
         }
      }

      int[] ints = new int[list.size()];

      for (int i = 0; i < ints.length; i++) {
         ints[i] = list.get(i);
      }

      return ints;
   }

   public boolean[] parseFaces(String str, boolean[] defVal) {
      if (str == null) {
         return defVal;
      }

      EnumSet setFaces = EnumSet.allOf(cq.class);
      String[] faceStrs = Config.tokenize(str, " ,");

      for (int i = 0; i < faceStrs.length; i++) {
         String faceStr = faceStrs[i];
         if (faceStr.equals("sides")) {
            setFaces.add(cq.c);
            setFaces.add(cq.d);
            setFaces.add(cq.e);
            setFaces.add(cq.f);
         } else if (faceStr.equals("all")) {
            setFaces.addAll(Arrays.asList(cq.n));
         } else {
            cq face = this.parseFace(faceStr);
            if (face != null) {
               setFaces.add(face);
            }
         }
      }

      boolean[] faces = new boolean[cq.n.length];

      for (int i = 0; i < faces.length; i++) {
         faces[i] = setFaces.contains(cq.n[i]);
      }

      return faces;
   }

   public cq parseFace(String str) {
      str = str.toLowerCase();
      if (str.equals("bottom") || str.equals("down")) {
         return cq.a;
      }

      if (str.equals("top") || str.equals("up")) {
         return cq.b;
      }

      if (str.equals("north")) {
         return cq.c;
      }

      if (str.equals("south")) {
         return cq.d;
      }

      if (str.equals("east")) {
         return cq.f;
      }

      if (str.equals("west")) {
         return cq.e;
      }

      Config.warn("Unknown face: " + str);
      return null;
   }

   public void dbg(String str) {
      Config.dbg("" + this.context + ": " + str);
   }

   public void warn(String str) {
      Config.warn("" + this.context + ": " + str);
   }

   public RangeListInt parseRangeListInt(String str) {
      if (str == null) {
         return null;
      }

      RangeListInt list = new RangeListInt();
      String[] parts = Config.tokenize(str, " ,");

      for (int i = 0; i < parts.length; i++) {
         String part = parts[i];
         RangeInt ri = this.parseRangeInt(part);
         if (ri == null) {
            return null;
         }

         list.addRange(ri);
      }

      return list;
   }

   private RangeInt parseRangeInt(String str) {
      if (str == null) {
         return null;
      }

      if (str.indexOf(45) >= 0) {
         String[] parts = Config.tokenize(str, "-");
         if (parts.length != 2) {
            this.warn("Invalid range: " + str);
            return null;
         }

         int min = Config.parseInt(parts[0], -1);
         int max = Config.parseInt(parts[1], -1);
         if (min >= 0 && max >= 0) {
            return new RangeInt(min, max);
         }

         this.warn("Invalid range: " + str);
         return null;
      } else {
         int val = Config.parseInt(str, -1);
         if (val < 0) {
            this.warn("Invalid integer: " + str);
            return null;
         } else {
            return new RangeInt(val, val);
         }
      }
   }

   public boolean parseBoolean(String str, boolean defVal) {
      if (str == null) {
         return defVal;
      }

      String strLower = str.toLowerCase().trim();
      if (strLower.equals("true")) {
         return true;
      }

      if (strLower.equals("false")) {
         return false;
      }

      this.warn("Invalid boolean: " + str);
      return defVal;
   }

   public Boolean parseBooleanObject(String str) {
      if (str == null) {
         return null;
      }

      String strLower = str.toLowerCase().trim();
      if (strLower.equals("true")) {
         return Boolean.TRUE;
      }

      if (strLower.equals("false")) {
         return Boolean.FALSE;
      }

      this.warn("Invalid boolean: " + str);
      return null;
   }

   public static int parseColor(String str, int defVal) {
      if (str == null) {
         return defVal;
      }

      str = str.trim();

      try {
         return Integer.parseInt(str, 16) & 16777215;
      } catch (NumberFormatException e) {
         return defVal;
      }
   }

   public static int parseColor4(String str, int defVal) {
      if (str == null) {
         return defVal;
      }

      str = str.trim();

      try {
         return (int)(Long.parseLong(str, 16) & -1L);
      } catch (NumberFormatException e) {
         return defVal;
      }
   }

   public adf parseBlockRenderLayer(String str, adf def) {
      if (str == null) {
         return def;
      }

      str = str.toLowerCase().trim();
      adf[] layers = adf.values();

      for (int i = 0; i < layers.length; i++) {
         adf layer = layers[i];
         if (str.equals(layer.name().toLowerCase())) {
            return layer;
         }
      }

      return def;
   }

   public <T> T parseObject(String str, T[] objs, INameGetter nameGetter, String property) {
      if (str == null) {
         return null;
      }

      String strLower = str.toLowerCase().trim();

      for (int i = 0; i < objs.length; i++) {
         T obj = objs[i];
         String name = nameGetter.getName(obj);
         if (name != null && name.toLowerCase().equals(strLower)) {
            return obj;
         }
      }

      this.warn("Invalid " + property + ": " + str);
      return null;
   }

   public <T> T[] parseObjects(String str, T[] objs, INameGetter nameGetter, String property, T[] errValue) {
      if (str == null) {
         return null;
      }

      str = str.toLowerCase().trim();
      String[] parts = Config.tokenize(str, " ");
      T[] arr = (T[])Array.newInstance(objs.getClass().getComponentType(), parts.length);

      for (int i = 0; i < parts.length; i++) {
         String part = parts[i];
         T obj = this.parseObject(part, objs, nameGetter, property);
         if (obj == null) {
            return errValue;
         }

         arr[i] = obj;
      }

      return arr;
   }

   public Enum parseEnum(String str, Enum[] enums, String property) {
      return this.parseObject(str, enums, NAME_GETTER_ENUM, property);
   }

   public Enum[] parseEnums(String str, Enum[] enums, String property, Enum[] errValue) {
      return this.parseObjects(str, enums, NAME_GETTER_ENUM, property, errValue);
   }

   public zd[] parseDyeColors(String str, String property, zd[] errValue) {
      return this.parseObjects(str, zd.values(), NAME_GETTER_DYE_COLOR, property, errValue);
   }

   public Weather[] parseWeather(String str, String property, Weather[] errValue) {
      return this.parseObjects(str, Weather.values(), NAME_GETTER_ENUM, property, errValue);
   }

   public NbtTagValue parseNbtTagValue(String path, String value) {
      return path != null && value != null ? new NbtTagValue(path, value) : null;
   }

   public VillagerProfession[] parseProfessions(String profStr) {
      if (profStr == null) {
         return null;
      }

      List<VillagerProfession> list = new ArrayList<>();
      String[] tokens = Config.tokenize(profStr, " ");

      for (int i = 0; i < tokens.length; i++) {
         String str = tokens[i];
         VillagerProfession prof = this.parseProfession(str);
         if (prof == null) {
            this.warn("Invalid profession: " + str);
            return PROFESSIONS_INVALID;
         }

         list.add(prof);
      }

      return list.isEmpty() ? null : list.toArray(new VillagerProfession[list.size()]);
   }

   private VillagerProfession parseProfession(String str) {
      str = str.toLowerCase();
      String[] parts = Config.tokenize(str, ":");
      if (parts.length > 2) {
         return null;
      }

      String profStr = parts[0];
      String carStr = null;
      if (parts.length > 1) {
         carStr = parts[1];
      }

      int prof = parseProfessionId(profStr);
      if (prof < 0) {
         return null;
      }

      int[] cars = null;
      if (carStr != null) {
         cars = parseCareerIds(prof, carStr);
         if (cars == null) {
            return null;
         }
      }

      return new VillagerProfession(prof, cars);
   }

   private static int parseProfessionId(String str) {
      int id = Config.parseInt(str, -1);
      if (id >= 0) {
         return id;
      } else if (str.equals("farmer")) {
         return 0;
      } else if (str.equals("librarian")) {
         return 1;
      } else if (str.equals("priest")) {
         return 2;
      } else if (str.equals("blacksmith")) {
         return 3;
      } else if (str.equals("butcher")) {
         return 4;
      } else {
         return str.equals("nitwit") ? 5 : -1;
      }
   }

   private static int[] parseCareerIds(int prof, String str) {
      Set<Integer> set = new HashSet<>();
      String[] parts = Config.tokenize(str, ",");

      for (int i = 0; i < parts.length; i++) {
         String part = parts[i];
         int id = parseCareerId(prof, part);
         if (id < 0) {
            return null;
         }

         set.add(id);
      }

      Integer[] integerArr = set.toArray(new Integer[set.size()]);
      int[] arr = new int[integerArr.length];

      for (int i = 0; i < arr.length; i++) {
         arr[i] = integerArr[i];
      }

      return arr;
   }

   private static int parseCareerId(int prof, String str) {
      int id = Config.parseInt(str, -1);
      if (id >= 0) {
         return id;
      }

      if (prof == 0) {
         if (str.equals("farmer")) {
            return 1;
         }

         if (str.equals("fisherman")) {
            return 2;
         }

         if (str.equals("shepherd")) {
            return 3;
         }

         if (str.equals("fletcher")) {
            return 4;
         }
      }

      if (prof == 1) {
         if (str.equals("librarian")) {
            return 1;
         }

         if (str.equals("cartographer")) {
            return 2;
         }
      }

      if (prof == 2 && str.equals("cleric")) {
         return 1;
      }

      if (prof == 3) {
         if (str.equals("armor")) {
            return 1;
         }

         if (str.equals("weapon")) {
            return 2;
         }

         if (str.equals("tool")) {
            return 3;
         }
      }

      if (prof == 4) {
         if (str.equals("butcher")) {
            return 1;
         }

         if (str.equals("leather")) {
            return 2;
         }
      }

      return prof == 5 && str.equals("nitwit") ? 1 : -1;
   }

   public int[] parseItems(String str) {
      str = str.trim();
      Set<Integer> setIds = new TreeSet<>();
      String[] tokens = Config.tokenize(str, " ");

      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         jy loc = new jy(token);
         zw item = (zw)zw.e.a(loc);
         if (item == null) {
            this.warn("Item not found: " + token);
         } else {
            int id = zw.b(item);
            if (id < 0) {
               this.warn("Item has no ID: " + item + ", name: " + token);
            } else {
               setIds.add(new Integer(id));
            }
         }
      }

      Integer[] integers = setIds.toArray(new Integer[setIds.size()]);
      return Config.toPrimitive(integers);
   }

   public int[] parseEntities(String str) {
      str = str.trim();
      Set<Integer> setIds = new TreeSet<>();
      String[] tokens = Config.tokenize(str, " ");

      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         int id = EntityUtils.getEntityIdByName(token);
         if (id < 0) {
            this.warn("Entity not found: " + token);
         } else {
            setIds.add(new Integer(id));
         }
      }

      Integer[] integers = setIds.toArray(new Integer[setIds.size()]);
      return Config.toPrimitive(integers);
   }
}
