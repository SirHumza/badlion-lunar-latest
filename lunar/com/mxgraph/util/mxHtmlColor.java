package com.mxgraph.util;

import java.awt.Color;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class mxHtmlColor {
   private static final Logger log = Logger.getLogger(mxHtmlColor.class.getName());
   protected static HashMap<String, Color> htmlColors = new HashMap<>();
   protected static final Pattern rgbRegex = Pattern.compile("rgba?\\([^)]*\\)", 2);

   public static String hexString(Color var0) {
      int var1 = var0.getRed();
      int var2 = var0.getGreen();
      int var3 = var0.getBlue();
      return String.format("#%02X%02X%02X", var1, var2, var3);
   }

   public static String getHexColorString(Color var0) {
      return Integer.toHexString(var0.getRGB() & 16777215 | var0.getAlpha() << 24);
   }

   public static Color parseColor(String var0) {
      return parseColor(var0, 1.0);
   }

   public static Color parseColor(String var0, double var1) {
      if (var0 == null || var0.equals(mxConstants.NONE)) {
         return null;
      }

      if (rgbRegex.matcher(var0).matches()) {
         return parseRgb(var0);
      }

      if (!var0.startsWith("#")) {
         Color var3 = htmlColors.get(var0);
         if (var3 != null) {
            return var3;
         }
      } else if (var0.length() == 4) {
         var0 = new String(new char[]{'#', var0.charAt(1), var0.charAt(1), var0.charAt(2), var0.charAt(2), var0.charAt(3), var0.charAt(3)});
      }

      int var8 = 0;

      try {
         String var4 = var0;
         if (var4.startsWith("#")) {
            var4 = var4.substring(1);
         }

         var8 = (int)(Long.parseLong(var4, 16) | (int)(var1 * 255.0) << 24);
      } catch (NumberFormatException var7) {
         try {
            var8 = Long.decode(var0).intValue();
         } catch (NumberFormatException var6) {
            log.log(Level.SEVERE, "Failed to parse color value", var6);
         }
      }

      return var1 < 1.0 ? new Color(var8, true) : new Color(var8);
   }

   protected static Color parseRgb(String var0) {
      String[] var1 = var0.split("[,()]");
      String var2 = var1[1].trim();
      String var3 = var1[2].trim();
      String var4 = var1[3].trim();
      String var5 = "1.0";
      if (var1.length >= 5) {
         var5 = var1[4].trim();
      }

      return new Color(parseValue(var2, 255), parseValue(var3, 255), parseValue(var4, 255), parseAlpha(var5));
   }

   protected static float parseValue(String var0, int var1) {
      return var0.endsWith("%") ? (float)(parsePercent(var0) * var1 / var1) : Integer.parseInt(var0) / var1;
   }

   protected static double parsePercent(String var0) {
      return Integer.parseInt(var0.substring(0, var0.length() - 1)) / 100.0;
   }

   protected static float parseAlpha(String var0) {
      return Float.parseFloat(var0);
   }

   static {
      htmlColors.put("aliceblue", parseColor("#F0F8FF"));
      htmlColors.put("antiquewhite", parseColor("#FAEBD7"));
      htmlColors.put("aqua", parseColor("#00FFFF"));
      htmlColors.put("aquamarine", parseColor("#7FFFD4"));
      htmlColors.put("azure", parseColor("#F0FFFF"));
      htmlColors.put("beige", parseColor("#F5F5DC"));
      htmlColors.put("bisque", parseColor("#FFE4C4"));
      htmlColors.put("black", parseColor("#000000"));
      htmlColors.put("blanchedalmond", parseColor("#FFEBCD"));
      htmlColors.put("blue", parseColor("#0000FF"));
      htmlColors.put("blueviolet", parseColor("#8A2BE2"));
      htmlColors.put("brown", parseColor("#A52A2A"));
      htmlColors.put("burlywood", parseColor("#DEB887"));
      htmlColors.put("cadetblue", parseColor("#5F9EA0"));
      htmlColors.put("chartreuse", parseColor("#7FFF00"));
      htmlColors.put("chocolate", parseColor("#D2691E"));
      htmlColors.put("coral", parseColor("#FF7F50"));
      htmlColors.put("cornflowerblue", parseColor("#6495ED"));
      htmlColors.put("cornsilk", parseColor("#FFF8DC"));
      htmlColors.put("crimson", parseColor("#DC143C"));
      htmlColors.put("cyan", parseColor("#00FFFF"));
      htmlColors.put("darkblue", parseColor("#00008B"));
      htmlColors.put("darkcyan", parseColor("#008B8B"));
      htmlColors.put("darkgoldenrod", parseColor("#B8860B"));
      htmlColors.put("darkgray", parseColor("#A9A9A9"));
      htmlColors.put("darkgrey", parseColor("#A9A9A9"));
      htmlColors.put("darkgreen", parseColor("#006400"));
      htmlColors.put("darkkhaki", parseColor("#BDB76B"));
      htmlColors.put("darkmagenta", parseColor("#8B008B"));
      htmlColors.put("darkolivegreen", parseColor("#556B2F"));
      htmlColors.put("darkorange", parseColor("#FF8C00"));
      htmlColors.put("darkorchid", parseColor("#9932CC"));
      htmlColors.put("darkred", parseColor("#8B0000"));
      htmlColors.put("darksalmon", parseColor("#E9967A"));
      htmlColors.put("darkseagreen", parseColor("#8FBC8F"));
      htmlColors.put("darkslateblue", parseColor("#483D8B"));
      htmlColors.put("darkslategray", parseColor("#2F4F4F"));
      htmlColors.put("darkslategrey", parseColor("#2F4F4F"));
      htmlColors.put("darkturquoise", parseColor("#00CED1"));
      htmlColors.put("darkviolet", parseColor("#9400D3"));
      htmlColors.put("deeppink", parseColor("#FF1493"));
      htmlColors.put("deepskyblue", parseColor("#00BFFF"));
      htmlColors.put("dimgray", parseColor("#696969"));
      htmlColors.put("dimgrey", parseColor("#696969"));
      htmlColors.put("dodgerblue", parseColor("#1E90FF"));
      htmlColors.put("firebrick", parseColor("#B22222"));
      htmlColors.put("floralwhite", parseColor("#FFFAF0"));
      htmlColors.put("forestgreen", parseColor("#228B22"));
      htmlColors.put("fuchsia", parseColor("#FF00FF"));
      htmlColors.put("gainsboro", parseColor("#DCDCDC"));
      htmlColors.put("ghostwhite", parseColor("#F8F8FF"));
      htmlColors.put("gold", parseColor("#FFD700"));
      htmlColors.put("goldenrod", parseColor("#DAA520"));
      htmlColors.put("gray", parseColor("#808080"));
      htmlColors.put("grey", parseColor("#808080"));
      htmlColors.put("green", parseColor("#008000"));
      htmlColors.put("greenyellow", parseColor("#ADFF2F"));
      htmlColors.put("honeydew", parseColor("#F0FFF0"));
      htmlColors.put("hotpink", parseColor("#FF69B4"));
      htmlColors.put("indianred ", parseColor("#CD5C5C"));
      htmlColors.put("indigo ", parseColor("#4B0082"));
      htmlColors.put("ivory", parseColor("#FFFFF0"));
      htmlColors.put("khaki", parseColor("#F0E68C"));
      htmlColors.put("lavender", parseColor("#E6E6FA"));
      htmlColors.put("lavenderblush", parseColor("#FFF0F5"));
      htmlColors.put("lawngreen", parseColor("#7CFC00"));
      htmlColors.put("lemonchiffon", parseColor("#FFFACD"));
      htmlColors.put("lightblue", parseColor("#ADD8E6"));
      htmlColors.put("lightcoral", parseColor("#F08080"));
      htmlColors.put("lightcyan", parseColor("#E0FFFF"));
      htmlColors.put("lightgoldenrodyellow", parseColor("#FAFAD2"));
      htmlColors.put("lightgray", parseColor("#D3D3D3"));
      htmlColors.put("lightgrey", parseColor("#D3D3D3"));
      htmlColors.put("lightgreen", parseColor("#90EE90"));
      htmlColors.put("lightpink", parseColor("#FFB6C1"));
      htmlColors.put("lightsalmon", parseColor("#FFA07A"));
      htmlColors.put("lightseagreen", parseColor("#20B2AA"));
      htmlColors.put("lightskyblue", parseColor("#87CEFA"));
      htmlColors.put("lightslategray", parseColor("#778899"));
      htmlColors.put("lightslategrey", parseColor("#778899"));
      htmlColors.put("lightsteelblue", parseColor("#B0C4DE"));
      htmlColors.put("lightyellow", parseColor("#FFFFE0"));
      htmlColors.put("lime", parseColor("#00FF00"));
      htmlColors.put("limegreen", parseColor("#32CD32"));
      htmlColors.put("linen", parseColor("#FAF0E6"));
      htmlColors.put("magenta", parseColor("#FF00FF"));
      htmlColors.put("maroon", parseColor("#800000"));
      htmlColors.put("mediumaquamarine", parseColor("#66CDAA"));
      htmlColors.put("mediumblue", parseColor("#0000CD"));
      htmlColors.put("mediumorchid", parseColor("#BA55D3"));
      htmlColors.put("mediumpurple", parseColor("#9370DB"));
      htmlColors.put("mediumseagreen", parseColor("#3CB371"));
      htmlColors.put("mediumslateblue", parseColor("#7B68EE"));
      htmlColors.put("mediumspringgreen", parseColor("#00FA9A"));
      htmlColors.put("mediumturquoise", parseColor("#48D1CC"));
      htmlColors.put("mediumvioletred", parseColor("#C71585"));
      htmlColors.put("midnightblue", parseColor("#191970"));
      htmlColors.put("mintcream", parseColor("#F5FFFA"));
      htmlColors.put("mistyrose", parseColor("#FFE4E1"));
      htmlColors.put("moccasin", parseColor("#FFE4B5"));
      htmlColors.put("navajowhite", parseColor("#FFDEAD"));
      htmlColors.put("navy", parseColor("#000080"));
      htmlColors.put("oldlace", parseColor("#FDF5E6"));
      htmlColors.put("olive", parseColor("#808000"));
      htmlColors.put("olivedrab", parseColor("#6B8E23"));
      htmlColors.put("orange", parseColor("#FFA500"));
      htmlColors.put("orangered", parseColor("#FF4500"));
      htmlColors.put("orchid", parseColor("#DA70D6"));
      htmlColors.put("palegoldenrod", parseColor("#EEE8AA"));
      htmlColors.put("palegreen", parseColor("#98FB98"));
      htmlColors.put("paleturquoise", parseColor("#AFEEEE"));
      htmlColors.put("palevioletred", parseColor("#DB7093"));
      htmlColors.put("papayawhip", parseColor("#FFEFD5"));
      htmlColors.put("peachpuff", parseColor("#FFDAB9"));
      htmlColors.put("peru", parseColor("#CD853F"));
      htmlColors.put("pink", parseColor("#FFC0CB"));
      htmlColors.put("plum", parseColor("#DDA0DD"));
      htmlColors.put("powderblue", parseColor("#B0E0E6"));
      htmlColors.put("purple", parseColor("#800080"));
      htmlColors.put("red", parseColor("#FF0000"));
      htmlColors.put("rosybrown", parseColor("#BC8F8F"));
      htmlColors.put("royalblue", parseColor("#4169E1"));
      htmlColors.put("saddlebrown", parseColor("#8B4513"));
      htmlColors.put("salmon", parseColor("#FA8072"));
      htmlColors.put("sandybrown", parseColor("#F4A460"));
      htmlColors.put("seagreen", parseColor("#2E8B57"));
      htmlColors.put("seashell", parseColor("#FFF5EE"));
      htmlColors.put("sienna", parseColor("#A0522D"));
      htmlColors.put("silver", parseColor("#C0C0C0"));
      htmlColors.put("skyblue", parseColor("#87CEEB"));
      htmlColors.put("slateblue", parseColor("#6A5ACD"));
      htmlColors.put("slategray", parseColor("#708090"));
      htmlColors.put("slategrey", parseColor("#708090"));
      htmlColors.put("snow", parseColor("#FFFAFA"));
      htmlColors.put("springgreen", parseColor("#00FF7F"));
      htmlColors.put("steelblue", parseColor("#4682B4"));
      htmlColors.put("tan", parseColor("#D2B48C"));
      htmlColors.put("teal", parseColor("#008080"));
      htmlColors.put("thistle", parseColor("#D8BFD8"));
      htmlColors.put("tomato", parseColor("#FF6347"));
      htmlColors.put("turquoise", parseColor("#40E0D0"));
      htmlColors.put("violet", parseColor("#EE82EE"));
      htmlColors.put("wheat", parseColor("#F5DEB3"));
      htmlColors.put("white", parseColor("#FFFFFF"));
      htmlColors.put("whitesmoke", parseColor("#F5F5F5"));
      htmlColors.put("yellow", parseColor("#FFFF00"));
      htmlColors.put("yellowgreen", parseColor("#9ACD32"));
   }
}
