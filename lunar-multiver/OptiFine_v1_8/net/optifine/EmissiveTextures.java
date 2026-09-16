package net.optifine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import net.optifine.util.PropertiesOrdered;

public class EmissiveTextures {
   private static String suffixEmissive = null;
   private static String suffixEmissivePng = null;
   private static boolean active = false;
   private static boolean render = false;
   private static boolean hasEmissive = false;
   private static boolean renderEmissive = false;
   private static float lightMapX;
   private static float lightMapY;
   private static final String SUFFIX_PNG = ".png";
   private static final jy LOCATION_EMPTY = new jy("mcpatcher/ctm/default/empty.png");

   public static boolean isActive() {
      return active;
   }

   public static String getSuffixEmissive() {
      return suffixEmissive;
   }

   public static void beginRender() {
      render = true;
      hasEmissive = false;
   }

   public static bmk getEmissiveTexture(bmk texture, Map<jy, bmk> mapTextures) {
      if (!render) {
         return texture;
      }

      if (!(texture instanceof bme)) {
         return texture;
      }

      bme simpleTexture = (bme)texture;
      jy locationEmissive = simpleTexture.locationEmissive;
      if (!renderEmissive) {
         if (locationEmissive != null) {
            hasEmissive = true;
         }

         return texture;
      } else {
         if (locationEmissive == null) {
            locationEmissive = LOCATION_EMPTY;
         }

         bmk textureEmissive = mapTextures.get(locationEmissive);
         if (textureEmissive == null) {
            textureEmissive = new bme(locationEmissive);
            bmj textureManager = Config.getTextureManager();
            textureManager.a(locationEmissive, textureEmissive);
         }

         return textureEmissive;
      }
   }

   public static boolean hasEmissive() {
      return hasEmissive;
   }

   public static void beginRenderEmissive() {
      lightMapX = bqs.lastBrightnessX;
      lightMapY = bqs.lastBrightnessY;
      bqs.a(bqs.r, 240.0F, lightMapY);
      renderEmissive = true;
   }

   public static void endRenderEmissive() {
      renderEmissive = false;
      bqs.a(bqs.r, lightMapX, lightMapY);
   }

   public static void endRender() {
      render = false;
      hasEmissive = false;
   }

   public static void update() {
      active = false;
      suffixEmissive = null;
      suffixEmissivePng = null;
      if (Config.isEmissiveTextures()) {
         try {
            String fileName = "optifine/emissive.properties";
            jy loc = new jy(fileName);
            InputStream in = Config.getResourceStream(loc);
            if (in == null) {
               return;
            }

            dbg("Loading " + fileName);
            Properties props = new PropertiesOrdered();
            props.load(in);
            in.close();
            suffixEmissive = props.getProperty("suffix.emissive");
            if (suffixEmissive != null) {
               suffixEmissivePng = suffixEmissive + ".png";
            }

            active = suffixEmissive != null;
         } catch (FileNotFoundException e) {
            return;
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

   private static void dbg(String str) {
      Config.dbg("EmissiveTextures: " + str);
   }

   private static void warn(String str) {
      Config.warn("EmissiveTextures: " + str);
   }

   public static boolean isEmissive(jy loc) {
      return suffixEmissivePng == null ? false : loc.a().endsWith(suffixEmissivePng);
   }

   public static void loadTexture(jy loc, bme tex) {
      if (loc != null && tex != null) {
         tex.isEmissive = false;
         tex.locationEmissive = null;
         if (suffixEmissivePng != null) {
            String path = loc.a();
            if (path.endsWith(".png")) {
               if (path.endsWith(suffixEmissivePng)) {
                  tex.isEmissive = true;
               } else {
                  String pathEmPng = path.substring(0, path.length() - ".png".length()) + suffixEmissivePng;
                  jy locEmPng = new jy(loc.b(), pathEmPng);
                  if (Config.hasResource(locEmPng)) {
                     tex.locationEmissive = locEmPng;
                  }
               }
            }
         }
      }
   }
}
