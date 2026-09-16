package net.optifine;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.optifine.config.ConnectedParser;
import net.optifine.config.Matches;
import net.optifine.config.NbtTagValue;
import net.optifine.config.RangeListInt;
import net.optifine.config.VillagerProfession;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorField;
import net.optifine.util.StrUtils;
import net.optifine.util.TextureUtils;

public class CustomGuiProperties {
   private String fileName = null;
   private String basePath = null;
   private CustomGuiProperties.EnumContainer container = null;
   private Map<jy, jy> textureLocations = null;
   private NbtTagValue nbtName = null;
   private ady[] biomes = null;
   private RangeListInt heights = null;
   private Boolean large = null;
   private Boolean trapped = null;
   private Boolean christmas = null;
   private Boolean ender = null;
   private RangeListInt levels = null;
   private VillagerProfession[] professions = null;
   private CustomGuiProperties.EnumVariant[] variants = null;
   private zd[] colors = null;
   private static final CustomGuiProperties.EnumVariant[] VARIANTS_HORSE = new CustomGuiProperties.EnumVariant[]{
      CustomGuiProperties.EnumVariant.HORSE,
      CustomGuiProperties.EnumVariant.DONKEY,
      CustomGuiProperties.EnumVariant.MULE,
      CustomGuiProperties.EnumVariant.LLAMA
   };
   private static final CustomGuiProperties.EnumVariant[] VARIANTS_DISPENSER = new CustomGuiProperties.EnumVariant[]{
      CustomGuiProperties.EnumVariant.DISPENSER, CustomGuiProperties.EnumVariant.DROPPER
   };
   private static final CustomGuiProperties.EnumVariant[] VARIANTS_INVALID = new CustomGuiProperties.EnumVariant[0];
   private static final zd[] COLORS_INVALID = new zd[0];
   private static final jy ANVIL_GUI_TEXTURE = new jy("textures/gui/container/anvil.png");
   private static final jy BEACON_GUI_TEXTURE = new jy("textures/gui/container/beacon.png");
   private static final jy BREWING_STAND_GUI_TEXTURE = new jy("textures/gui/container/brewing_stand.png");
   private static final jy CHEST_GUI_TEXTURE = new jy("textures/gui/container/generic_54.png");
   private static final jy CRAFTING_TABLE_GUI_TEXTURE = new jy("textures/gui/container/crafting_table.png");
   private static final jy HORSE_GUI_TEXTURE = new jy("textures/gui/container/horse.png");
   private static final jy DISPENSER_GUI_TEXTURE = new jy("textures/gui/container/dispenser.png");
   private static final jy ENCHANTMENT_TABLE_GUI_TEXTURE = new jy("textures/gui/container/enchanting_table.png");
   private static final jy FURNACE_GUI_TEXTURE = new jy("textures/gui/container/furnace.png");
   private static final jy HOPPER_GUI_TEXTURE = new jy("textures/gui/container/hopper.png");
   private static final jy INVENTORY_GUI_TEXTURE = new jy("textures/gui/container/inventory.png");
   private static final jy SHULKER_BOX_GUI_TEXTURE = new jy("textures/gui/container/shulker_box.png");
   private static final jy VILLAGER_GUI_TEXTURE = new jy("textures/gui/container/villager.png");

   public CustomGuiProperties(Properties props, String path) {
      ConnectedParser cp = new ConnectedParser("CustomGuis");
      this.fileName = cp.parseName(path);
      this.basePath = cp.parseBasePath(path);
      this.container = (CustomGuiProperties.EnumContainer)cp.parseEnum(props.getProperty("container"), CustomGuiProperties.EnumContainer.values(), "container");
      this.textureLocations = parseTextureLocations(props, "texture", this.container, "textures/gui/", this.basePath);
      this.nbtName = cp.parseNbtTagValue("name", props.getProperty("name"));
      this.biomes = cp.parseBiomes(props.getProperty("biomes"));
      this.heights = cp.parseRangeListInt(props.getProperty("heights"));
      this.large = cp.parseBooleanObject(props.getProperty("large"));
      this.trapped = cp.parseBooleanObject(props.getProperty("trapped"));
      this.christmas = cp.parseBooleanObject(props.getProperty("christmas"));
      this.ender = cp.parseBooleanObject(props.getProperty("ender"));
      this.levels = cp.parseRangeListInt(props.getProperty("levels"));
      this.professions = cp.parseProfessions(props.getProperty("professions"));
      CustomGuiProperties.EnumVariant[] vars = getContainerVariants(this.container);
      this.variants = (CustomGuiProperties.EnumVariant[])cp.parseEnums(props.getProperty("variants"), vars, "variants", VARIANTS_INVALID);
      this.colors = parseEnumDyeColors(props.getProperty("colors"));
   }

   private static CustomGuiProperties.EnumVariant[] getContainerVariants(CustomGuiProperties.EnumContainer cont) {
      if (cont == CustomGuiProperties.EnumContainer.HORSE) {
         return VARIANTS_HORSE;
      } else {
         return cont == CustomGuiProperties.EnumContainer.DISPENSER ? VARIANTS_DISPENSER : new CustomGuiProperties.EnumVariant[0];
      }
   }

   private static zd[] parseEnumDyeColors(String str) {
      if (str == null) {
         return null;
      }

      str = str.toLowerCase();
      String[] tokens = Config.tokenize(str, " ");
      zd[] cols = new zd[tokens.length];

      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         zd col = parseEnumDyeColor(token);
         if (col == null) {
            warn("Invalid color: " + token);
            return COLORS_INVALID;
         }

         cols[i] = col;
      }

      return cols;
   }

   private static zd parseEnumDyeColor(String str) {
      if (str == null) {
         return null;
      }

      zd[] colors = zd.values();

      for (int i = 0; i < colors.length; i++) {
         zd enumDyeColor = colors[i];
         if (enumDyeColor.l().equals(str)) {
            return enumDyeColor;
         }

         if (enumDyeColor.d().equals(str)) {
            return enumDyeColor;
         }
      }

      return null;
   }

   private static jy parseTextureLocation(String str, String basePath) {
      if (str == null) {
         return null;
      }

      str = str.trim();
      String tex = TextureUtils.fixResourcePath(str, basePath);
      if (!tex.endsWith(".png")) {
         tex = tex + ".png";
      }

      return new jy(basePath + "/" + tex);
   }

   private static Map<jy, jy> parseTextureLocations(
      Properties props, String property, CustomGuiProperties.EnumContainer container, String pathPrefix, String basePath
   ) {
      Map<jy, jy> map = new HashMap<>();
      String propVal = props.getProperty(property);
      if (propVal != null) {
         jy locKey = getGuiTextureLocation(container);
         jy locVal = parseTextureLocation(propVal, basePath);
         if (locKey != null && locVal != null) {
            map.put(locKey, locVal);
         }
      }

      String keyPrefix = property + ".";

      for (String key : props.keySet()) {
         if (key.startsWith(keyPrefix)) {
            String pathRel = key.substring(keyPrefix.length());
            pathRel = pathRel.replace('\\', '/');
            pathRel = StrUtils.removePrefixSuffix(pathRel, "/", ".png");
            String path = pathPrefix + pathRel + ".png";
            String val = props.getProperty(key);
            jy locKey = new jy(path);
            jy locVal = parseTextureLocation(val, basePath);
            map.put(locKey, locVal);
         }
      }

      return map;
   }

   private static jy getGuiTextureLocation(CustomGuiProperties.EnumContainer container) {
      if (container == null) {
         return null;
      }

      switch (container) {
         case ANVIL:
            return ANVIL_GUI_TEXTURE;
         case BEACON:
            return BEACON_GUI_TEXTURE;
         case BREWING_STAND:
            return BREWING_STAND_GUI_TEXTURE;
         case CHEST:
            return CHEST_GUI_TEXTURE;
         case CRAFTING:
            return CRAFTING_TABLE_GUI_TEXTURE;
         case CREATIVE:
            return null;
         case DISPENSER:
            return DISPENSER_GUI_TEXTURE;
         case ENCHANTMENT:
            return ENCHANTMENT_TABLE_GUI_TEXTURE;
         case FURNACE:
            return FURNACE_GUI_TEXTURE;
         case HOPPER:
            return HOPPER_GUI_TEXTURE;
         case HORSE:
            return HORSE_GUI_TEXTURE;
         case INVENTORY:
            return INVENTORY_GUI_TEXTURE;
         case SHULKER_BOX:
            return SHULKER_BOX_GUI_TEXTURE;
         case VILLAGER:
            return VILLAGER_GUI_TEXTURE;
         default:
            return null;
      }
   }

   public boolean isValid(String path) {
      if (this.fileName == null || this.fileName.length() <= 0) {
         warn("No name found: " + path);
         return false;
      } else if (this.basePath == null) {
         warn("No base path found: " + path);
         return false;
      } else if (this.container == null) {
         warn("No container found: " + path);
         return false;
      } else if (this.textureLocations.isEmpty()) {
         warn("No texture found: " + path);
         return false;
      } else if (this.professions == ConnectedParser.PROFESSIONS_INVALID) {
         warn("Invalid professions or careers: " + path);
         return false;
      } else if (this.variants == VARIANTS_INVALID) {
         warn("Invalid variants: " + path);
         return false;
      } else if (this.colors == COLORS_INVALID) {
         warn("Invalid colors: " + path);
         return false;
      } else {
         return true;
      }
   }

   private static void warn(String str) {
      Config.warn("[CustomGuis] " + str);
   }

   private boolean matchesGeneral(CustomGuiProperties.EnumContainer ec, cj pos, adq blockAccess) {
      if (this.container != ec) {
         return false;
      }

      if (this.biomes != null) {
         ady biome = blockAccess.b(pos);
         if (!Matches.biome(biome, this.biomes)) {
            return false;
         }
      }

      return this.heights == null || this.heights.isInRange(pos.o());
   }

   public boolean matchesPos(CustomGuiProperties.EnumContainer ec, cj pos, adq blockAccess, axu screen) {
      if (!this.matchesGeneral(ec, pos, blockAccess)) {
         return false;
      }

      if (this.nbtName != null) {
         String name = getName(screen);
         if (!this.nbtName.matchesValue(name)) {
            return false;
         }
      }

      switch (ec) {
         case BEACON:
            return this.matchesBeacon(pos, blockAccess);
         case CHEST:
            return this.matchesChest(pos, blockAccess);
         case DISPENSER:
            return this.matchesDispenser(pos, blockAccess);
         default:
            return true;
      }
   }

   public static String getName(axu screen) {
      op nameable = getWorldNameable(screen);
      return nameable == null ? null : nameable.f_().c();
   }

   private static op getWorldNameable(axu screen) {
      if (screen instanceof ayn) {
         return getWorldNameable(screen, Reflector.GuiBeacon_tileBeacon);
      } else if (screen instanceof ayp) {
         return getWorldNameable(screen, Reflector.GuiBrewingStand_tileBrewingStand);
      } else if (screen instanceof ayr) {
         return getWorldNameable(screen, Reflector.GuiChest_lowerChestInventory);
      } else if (screen instanceof ayv) {
         return ((ayv)screen).u;
      } else if (screen instanceof ayy) {
         return getWorldNameable(screen, Reflector.GuiEnchantment_nameable);
      } else if (screen instanceof ayz) {
         return getWorldNameable(screen, Reflector.GuiFurnace_tileFurnace);
      } else {
         return screen instanceof aza ? getWorldNameable(screen, Reflector.GuiHopper_hopperInventory) : null;
      }
   }

   private static op getWorldNameable(axu screen, ReflectorField fieldInventory) {
      Object obj = Reflector.getFieldValue(screen, fieldInventory);
      return !(obj instanceof op) ? null : (op)obj;
   }

   private boolean matchesBeacon(cj pos, adq blockAccess) {
      akw te = blockAccess.s(pos);
      if (!(te instanceof akv)) {
         return false;
      }

      akv teb = (akv)te;
      if (this.levels != null) {
         dn nbt = new dn();
         teb.b(nbt);
         int l = nbt.f("Levels");
         if (!this.levels.isInRange(l)) {
            return false;
         }
      }

      return true;
   }

   private boolean matchesChest(cj pos, adq blockAccess) {
      akw te = blockAccess.s(pos);
      if (te instanceof aky) {
         aky tec = (aky)te;
         return this.matchesChest(tec, pos, blockAccess);
      } else if (te instanceof alf) {
         alf teec = (alf)te;
         return this.matchesEnderChest(teec, pos, blockAccess);
      } else {
         return false;
      }
   }

   private boolean matchesChest(aky tec, cj pos, adq blockAccess) {
      boolean isLarge = tec.h != null || tec.g != null || tec.f != null || tec.i != null;
      boolean isTrapped = tec.n() == 1;
      boolean isChristmas = CustomGuis.isChristmas;
      boolean isEnder = false;
      return this.matchesChest(isLarge, isTrapped, isChristmas, isEnder);
   }

   private boolean matchesEnderChest(alf teec, cj pos, adq blockAccess) {
      return this.matchesChest(false, false, false, true);
   }

   private boolean matchesChest(boolean isLarge, boolean isTrapped, boolean isChristmas, boolean isEnder) {
      if (this.large != null && this.large != isLarge) {
         return false;
      } else if (this.trapped != null && this.trapped != isTrapped) {
         return false;
      } else {
         return this.christmas != null && this.christmas != isChristmas ? false : this.ender == null || this.ender == isEnder;
      }
   }

   private boolean matchesDispenser(cj pos, adq blockAccess) {
      akw te = blockAccess.s(pos);
      if (!(te instanceof alc)) {
         return false;
      }

      alc ted = (alc)te;
      if (this.variants != null) {
         CustomGuiProperties.EnumVariant var = this.getDispenserVariant(ted);
         if (!Config.equalsOne(var, this.variants)) {
            return false;
         }
      }

      return true;
   }

   private CustomGuiProperties.EnumVariant getDispenserVariant(alc ted) {
      return ted instanceof ald ? CustomGuiProperties.EnumVariant.DROPPER : CustomGuiProperties.EnumVariant.DISPENSER;
   }

   public boolean matchesEntity(CustomGuiProperties.EnumContainer ec, pk entity, adq blockAccess) {
      if (!this.matchesGeneral(ec, entity.c(), blockAccess)) {
         return false;
      }

      if (this.nbtName != null) {
         String entityName = entity.e_();
         if (!this.nbtName.matchesValue(entityName)) {
            return false;
         }
      }

      switch (ec) {
         case HORSE:
            return this.matchesHorse(entity, blockAccess);
         case VILLAGER:
            return this.matchesVillager(entity, blockAccess);
         default:
            return true;
      }
   }

   private boolean matchesVillager(pk entity, adq blockAccess) {
      if (!(entity instanceof wi)) {
         return false;
      }

      wi entityVillager = (wi)entity;
      if (this.professions != null) {
         int profInt = entityVillager.cl();
         int careerInt = Reflector.getFieldValueInt(entityVillager, Reflector.EntityVillager_careerId, -1);
         if (careerInt < 0) {
            return false;
         }

         boolean matchProfession = false;

         for (int i = 0; i < this.professions.length; i++) {
            VillagerProfession prof = this.professions[i];
            if (prof.matches(profInt, careerInt)) {
               matchProfession = true;
               break;
            }
         }

         if (!matchProfession) {
            return false;
         }
      }

      return true;
   }

   private boolean matchesHorse(pk entity, adq blockAccess) {
      if (!(entity instanceof tp)) {
         return false;
      }

      tp ah = (tp)entity;
      if (this.variants != null) {
         CustomGuiProperties.EnumVariant var = this.getHorseVariant(ah);
         if (!Config.equalsOne(var, this.variants)) {
            return false;
         }
      }

      return true;
   }

   private CustomGuiProperties.EnumVariant getHorseVariant(tp entity) {
      int type = entity.cl();
      switch (type) {
         case 0:
            return CustomGuiProperties.EnumVariant.HORSE;
         case 1:
            return CustomGuiProperties.EnumVariant.DONKEY;
         case 2:
            return CustomGuiProperties.EnumVariant.MULE;
         default:
            return null;
      }
   }

   public CustomGuiProperties.EnumContainer getContainer() {
      return this.container;
   }

   public jy getTextureLocation(jy loc) {
      jy locNew = this.textureLocations.get(loc);
      return locNew == null ? loc : locNew;
   }

   @Override
   public String toString() {
      return "name: " + this.fileName + ", container: " + this.container + ", textures: " + this.textureLocations;
   }

   public enum EnumContainer {
      ANVIL,
      BEACON,
      BREWING_STAND,
      CHEST,
      CRAFTING,
      DISPENSER,
      ENCHANTMENT,
      FURNACE,
      HOPPER,
      HORSE,
      VILLAGER,
      SHULKER_BOX,
      CREATIVE,
      INVENTORY;

      public static final CustomGuiProperties.EnumContainer[] VALUES = values();
   }

   private enum EnumVariant {
      HORSE,
      DONKEY,
      MULE,
      LLAMA,
      DISPENSER,
      DROPPER;
   }
}
