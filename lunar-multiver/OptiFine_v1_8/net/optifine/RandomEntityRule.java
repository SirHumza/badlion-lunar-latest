package net.optifine;

import java.util.Properties;
import net.optifine.config.ConnectedParser;
import net.optifine.config.Matches;
import net.optifine.config.NbtTagValue;
import net.optifine.config.RangeInt;
import net.optifine.config.RangeListInt;
import net.optifine.config.VillagerProfession;
import net.optifine.config.Weather;
import net.optifine.reflect.Reflector;
import net.optifine.util.ArrayUtils;
import net.optifine.util.MathUtils;

public class RandomEntityRule {
   private String pathProps = null;
   private jy baseResLoc = null;
   private int index;
   private int[] textures = null;
   private jy[] resourceLocations = null;
   private int[] weights = null;
   private ady[] biomes = null;
   private RangeListInt heights = null;
   private RangeListInt healthRange = null;
   private boolean healthPercent = false;
   private NbtTagValue nbtName = null;
   public int[] sumWeights = null;
   public int sumAllWeights = 1;
   private VillagerProfession[] professions = null;
   private zd[] collarColors = null;
   private Boolean baby = null;
   private RangeListInt moonPhases = null;
   private RangeListInt dayTimes = null;
   private Weather[] weatherList = null;

   public RandomEntityRule(Properties props, String pathProps, jy baseResLoc, int index, String valTextures, ConnectedParser cp) {
      this.pathProps = pathProps;
      this.baseResLoc = baseResLoc;
      this.index = index;
      this.textures = cp.parseIntList(valTextures);
      this.weights = cp.parseIntList(props.getProperty("weights." + index));
      this.biomes = cp.parseBiomes(props.getProperty("biomes." + index));
      this.heights = cp.parseRangeListInt(props.getProperty("heights." + index));
      if (this.heights == null) {
         this.heights = this.parseMinMaxHeight(props, index);
      }

      String healthStr = props.getProperty("health." + index);
      if (healthStr != null) {
         this.healthPercent = healthStr.contains("%");
         healthStr = healthStr.replace("%", "");
         this.healthRange = cp.parseRangeListInt(healthStr);
      }

      this.nbtName = cp.parseNbtTagValue("name", props.getProperty("name." + index));
      this.professions = cp.parseProfessions(props.getProperty("professions." + index));
      this.collarColors = cp.parseDyeColors(props.getProperty("collarColors." + index), "collar color", ConnectedParser.DYE_COLORS_INVALID);
      this.baby = cp.parseBooleanObject(props.getProperty("baby." + index));
      this.moonPhases = cp.parseRangeListInt(props.getProperty("moonPhase." + index));
      this.dayTimes = cp.parseRangeListInt(props.getProperty("dayTime." + index));
      this.weatherList = cp.parseWeather(props.getProperty("weather." + index), "weather." + index, null);
   }

   private RangeListInt parseMinMaxHeight(Properties props, int index) {
      String minHeightStr = props.getProperty("minHeight." + index);
      String maxHeightStr = props.getProperty("maxHeight." + index);
      if (minHeightStr == null && maxHeightStr == null) {
         return null;
      }

      int minHeight = 0;
      if (minHeightStr != null) {
         minHeight = Config.parseInt(minHeightStr, -1);
         if (minHeight < 0) {
            Config.warn("Invalid minHeight: " + minHeightStr);
            return null;
         }
      }

      int maxHeight = 256;
      if (maxHeightStr != null) {
         maxHeight = Config.parseInt(maxHeightStr, -1);
         if (maxHeight < 0) {
            Config.warn("Invalid maxHeight: " + maxHeightStr);
            return null;
         }
      }

      if (maxHeight < 0) {
         Config.warn("Invalid minHeight, maxHeight: " + minHeightStr + ", " + maxHeightStr);
         return null;
      } else {
         RangeListInt list = new RangeListInt();
         list.addRange(new RangeInt(minHeight, maxHeight));
         return list;
      }
   }

   public boolean isValid(String path) {
      if (this.textures == null || this.textures.length == 0) {
         Config.warn("Invalid skins for rule: " + this.index);
         return false;
      }

      if (this.resourceLocations != null) {
         return true;
      }

      this.resourceLocations = new jy[this.textures.length];
      boolean mcpatcher = this.pathProps.startsWith("mcpatcher/mob/");
      jy locMcp = RandomEntities.getLocationRandom(this.baseResLoc, mcpatcher);
      if (locMcp == null) {
         Config.warn("Invalid path: " + this.baseResLoc.a());
         return false;
      }

      for (int i = 0; i < this.resourceLocations.length; i++) {
         int index = this.textures[i];
         if (index <= 1) {
            this.resourceLocations[i] = this.baseResLoc;
         } else {
            jy locNew = RandomEntities.getLocationIndexed(locMcp, index);
            if (locNew == null) {
               Config.warn("Invalid path: " + this.baseResLoc.a());
               return false;
            }

            if (!Config.hasResource(locNew)) {
               Config.warn("Texture not found: " + locNew.a());
               return false;
            }

            this.resourceLocations[i] = locNew;
         }
      }

      if (this.weights != null) {
         if (this.weights.length > this.resourceLocations.length) {
            Config.warn("More weights defined than skins, trimming weights: " + path);
            int[] weights2 = new int[this.resourceLocations.length];
            System.arraycopy(this.weights, 0, weights2, 0, weights2.length);
            this.weights = weights2;
         }

         if (this.weights.length < this.resourceLocations.length) {
            Config.warn("Less weights defined than skins, expanding weights: " + path);
            int[] weights2 = new int[this.resourceLocations.length];
            System.arraycopy(this.weights, 0, weights2, 0, this.weights.length);
            int avgWeight = MathUtils.getAverage(this.weights);

            for (int i = this.weights.length; i < weights2.length; i++) {
               weights2[i] = avgWeight;
            }

            this.weights = weights2;
         }

         this.sumWeights = new int[this.weights.length];
         int sum = 0;

         for (int i = 0; i < this.weights.length; i++) {
            if (this.weights[i] < 0) {
               Config.warn("Invalid weight: " + this.weights[i]);
               return false;
            }

            sum += this.weights[i];
            this.sumWeights[i] = sum;
         }

         this.sumAllWeights = sum;
         if (this.sumAllWeights <= 0) {
            Config.warn("Invalid sum of all weights: " + sum);
            this.sumAllWeights = 1;
         }
      }

      if (this.professions == ConnectedParser.PROFESSIONS_INVALID) {
         Config.warn("Invalid professions or careers: " + path);
         return false;
      } else if (this.collarColors == ConnectedParser.DYE_COLORS_INVALID) {
         Config.warn("Invalid collar colors: " + path);
         return false;
      } else {
         return true;
      }
   }

   public boolean matches(IRandomEntity randomEntity) {
      if (this.biomes != null && !Matches.biome(randomEntity.getSpawnBiome(), this.biomes)) {
         return false;
      }

      if (this.heights != null) {
         cj pos = randomEntity.getSpawnPosition();
         if (pos != null && !this.heights.isInRange(pos.o())) {
            return false;
         }
      }

      if (this.healthRange != null) {
         int health = randomEntity.getHealth();
         if (this.healthPercent) {
            int healthMax = randomEntity.getMaxHealth();
            if (healthMax > 0) {
               health = (int)((double)(health * 100) / healthMax);
            }
         }

         if (!this.healthRange.isInRange(health)) {
            return false;
         }
      }

      if (this.nbtName != null) {
         String name = randomEntity.getName();
         if (!this.nbtName.matchesValue(name)) {
            return false;
         }
      }

      if (this.professions != null && randomEntity instanceof RandomEntity) {
         RandomEntity rme = (RandomEntity)randomEntity;
         pk entity = rme.getEntity();
         if (entity instanceof wi) {
            wi entityVillager = (wi)entity;
            int profInt = entityVillager.cl();
            int careerInt = Reflector.getFieldValueInt(entityVillager, Reflector.EntityVillager_careerId, -1);
            if (profInt < 0 || careerInt < 0) {
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
      }

      if (this.collarColors != null && randomEntity instanceof RandomEntity) {
         RandomEntity rme = (RandomEntity)randomEntity;
         pk entity = rme.getEntity();
         if (entity instanceof ua) {
            ua entityWolf = (ua)entity;
            if (!entityWolf.cl()) {
               return false;
            }

            zd col = entityWolf.cw();
            if (!Config.equalsOne(col, this.collarColors)) {
               return false;
            }
         }
      }

      if (this.baby != null && randomEntity instanceof RandomEntity) {
         RandomEntity rme = (RandomEntity)randomEntity;
         pk entity = rme.getEntity();
         if (entity instanceof ps) {
            ps livingEntity = (ps)entity;
            if (livingEntity.j_() != this.baby) {
               return false;
            }
         }
      }

      if (this.moonPhases != null) {
         adm world = Config.getMinecraft().f;
         if (world != null) {
            int moonPhase = world.x();
            if (!this.moonPhases.isInRange(moonPhase)) {
               return false;
            }
         }
      }

      if (this.dayTimes != null) {
         adm world = Config.getMinecraft().f;
         if (world != null) {
            int dayTime = (int)world.P().g();
            if (!this.dayTimes.isInRange(dayTime)) {
               return false;
            }
         }
      }

      if (this.weatherList != null) {
         adm world = Config.getMinecraft().f;
         if (world != null) {
            Weather weather = Weather.getWeather(world, 0.0F);
            if (!ArrayUtils.contains(this.weatherList, weather)) {
               return false;
            }
         }
      }

      return true;
   }

   public jy getTextureLocation(jy loc, int randomId) {
      if (this.resourceLocations != null && this.resourceLocations.length != 0) {
         int index = 0;
         if (this.weights == null) {
            index = randomId % this.resourceLocations.length;
         } else {
            int randWeight = randomId % this.sumAllWeights;

            for (int i = 0; i < this.sumWeights.length; i++) {
               if (this.sumWeights[i] > randWeight) {
                  index = i;
                  break;
               }
            }
         }

         return this.resourceLocations[index];
      } else {
         return loc;
      }
   }
}
