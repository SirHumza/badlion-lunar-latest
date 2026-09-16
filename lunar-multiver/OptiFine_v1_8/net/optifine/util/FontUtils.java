package net.optifine.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FontUtils {
   public static Properties readFontProperties(jy locationFontTexture) {
      String fontFileName = locationFontTexture.a();
      Properties props = new PropertiesOrdered();
      String suffix = ".png";
      if (!fontFileName.endsWith(suffix)) {
         return props;
      }

      String fileName = fontFileName.substring(0, fontFileName.length() - suffix.length()) + ".properties";

      try {
         jy locProp = new jy(locationFontTexture.b(), fileName);
         InputStream in = Config.getResourceStream(Config.getResourceManager(), locProp);
         if (in == null) {
            return props;
         }

         Config.log("Loading " + fileName);
         props.load(in);
         in.close();
      } catch (FileNotFoundException e) {
      } catch (IOException e) {
         e.printStackTrace();
      }

      return props;
   }

   public static void readCustomCharWidths(Properties props, float[] charWidth) {
      for (String key : props.keySet()) {
         String prefix = "width.";
         if (key.startsWith(prefix)) {
            String numStr = key.substring(prefix.length());
            int num = Config.parseInt(numStr, -1);
            if (num >= 0 && num < charWidth.length) {
               String value = props.getProperty(key);
               float width = Config.parseFloat(value, -1.0F);
               if (width >= 0.0F) {
                  charWidth[num] = width;
               }
            }
         }
      }
   }

   public static float readFloat(Properties props, String key, float defOffset) {
      String str = props.getProperty(key);
      if (str == null) {
         return defOffset;
      } else {
         float offset = Config.parseFloat(str, Float.MIN_VALUE);
         if (offset == Float.MIN_VALUE) {
            Config.warn("Invalid value for " + key + ": " + str);
            return defOffset;
         } else {
            return offset;
         }
      }
   }

   public static boolean readBoolean(Properties props, String key, boolean defVal) {
      String str = props.getProperty(key);
      if (str == null) {
         return defVal;
      } else {
         String strLow = str.toLowerCase().trim();
         if (strLow.equals("true") || strLow.equals("on")) {
            return true;
         } else if (!strLow.equals("false") && !strLow.equals("off")) {
            Config.warn("Invalid value for " + key + ": " + str);
            return defVal;
         } else {
            return false;
         }
      }
   }

   public static jy getHdFontLocation(jy fontLoc) {
      if (!Config.isCustomFonts()) {
         return fontLoc;
      }

      if (fontLoc == null) {
         return fontLoc;
      }

      if (!Config.isMinecraftThread()) {
         return fontLoc;
      }

      String fontName = fontLoc.a();
      String texturesStr = "textures/";
      String mcpatcherStr = "mcpatcher/";
      if (!fontName.startsWith(texturesStr)) {
         return fontLoc;
      }

      fontName = fontName.substring(texturesStr.length());
      fontName = mcpatcherStr + fontName;
      jy fontLocHD = new jy(fontLoc.b(), fontName);
      return Config.hasResource(Config.getResourceManager(), fontLocHD) ? fontLocHD : fontLoc;
   }
}
