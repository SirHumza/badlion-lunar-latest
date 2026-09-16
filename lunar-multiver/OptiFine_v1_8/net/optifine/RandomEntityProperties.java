package net.optifine;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import net.optifine.config.ConnectedParser;

public class RandomEntityProperties {
   public String name = null;
   public String basePath = null;
   public jy[] resourceLocations = null;
   public RandomEntityRule[] rules = null;

   public RandomEntityProperties(String path, jy[] variants) {
      ConnectedParser cp = new ConnectedParser("RandomEntities");
      this.name = cp.parseName(path);
      this.basePath = cp.parseBasePath(path);
      this.resourceLocations = variants;
   }

   public RandomEntityProperties(Properties props, String path, jy baseResLoc) {
      ConnectedParser cp = new ConnectedParser("RandomEntities");
      this.name = cp.parseName(path);
      this.basePath = cp.parseBasePath(path);
      this.rules = this.parseRules(props, path, baseResLoc, cp);
   }

   public jy getTextureLocation(jy loc, IRandomEntity randomEntity) {
      if (this.rules != null) {
         for (int i = 0; i < this.rules.length; i++) {
            RandomEntityRule rule = this.rules[i];
            if (rule.matches(randomEntity)) {
               return rule.getTextureLocation(loc, randomEntity.getId());
            }
         }
      }

      if (this.resourceLocations != null) {
         int randomId = randomEntity.getId();
         int index = randomId % this.resourceLocations.length;
         return this.resourceLocations[index];
      } else {
         return loc;
      }
   }

   private RandomEntityRule[] parseRules(Properties props, String pathProps, jy baseResLoc, ConnectedParser cp) {
      List list = new ArrayList();
      int count = props.size();

      for (int i = 0; i < count; i++) {
         int index = i + 1;
         String valTextures = props.getProperty("textures." + index);
         if (valTextures == null) {
            valTextures = props.getProperty("skins." + index);
         }

         if (valTextures != null) {
            RandomEntityRule rule = new RandomEntityRule(props, pathProps, baseResLoc, index, valTextures, cp);
            if (rule.isValid(pathProps)) {
               list.add(rule);
            }
         }
      }

      return list.toArray(new RandomEntityRule[list.size()]);
   }

   public boolean isValid(String path) {
      if (this.resourceLocations == null && this.rules == null) {
         Config.warn("No skins specified: " + path);
         return false;
      }

      if (this.rules != null) {
         for (int i = 0; i < this.rules.length; i++) {
            RandomEntityRule rule = this.rules[i];
            if (!rule.isValid(path)) {
               return false;
            }
         }
      }

      if (this.resourceLocations != null) {
         for (int i = 0; i < this.resourceLocations.length; i++) {
            jy loc = this.resourceLocations[i];
            if (!Config.hasResource(loc)) {
               Config.warn("Texture not found: " + loc.a());
               return false;
            }
         }
      }

      return true;
   }

   public boolean isDefault() {
      return this.rules != null ? false : this.resourceLocations == null;
   }
}
