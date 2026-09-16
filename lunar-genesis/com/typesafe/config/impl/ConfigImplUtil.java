package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigSyntax;
import java.io.DataOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class ConfigImplUtil {
   static boolean equalsHandlingNull(Object var0, Object var1) {
      if (var0 == null && var1 != null) {
         return false;
      } else if (var0 != null && var1 == null) {
         return false;
      } else {
         return var0 == var1 ? true : var0.equals(var1);
      }
   }

   static boolean isC0Control(int var0) {
      return var0 >= 0 && var0 <= 31;
   }

   public static String renderJsonString(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append('"');

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         switch (var3) {
            case '\b':
               var1.append("\\b");
               break;
            case '\t':
               var1.append("\\t");
               break;
            case '\n':
               var1.append("\\n");
               break;
            case '\f':
               var1.append("\\f");
               break;
            case '\r':
               var1.append("\\r");
               break;
            case '"':
               var1.append("\\\"");
               break;
            case '\\':
               var1.append("\\\\");
               break;
            default:
               if (isC0Control(var3)) {
                  var1.append(String.format("\\u%04x", Integer.valueOf(var3)));
               } else {
                  var1.append(var3);
               }
         }
      }

      var1.append('"');
      return var1.toString();
   }

   static String renderStringUnquotedIfPossible(String var0) {
      if (var0.length() == 0) {
         return renderJsonString(var0);
      }

      int var1 = var0.codePointAt(0);
      if (!Character.isDigit(var1) && var1 != 45) {
         if (!var0.startsWith("include") && !var0.startsWith("true") && !var0.startsWith("false") && !var0.startsWith("null") && !var0.contains("//")) {
            for (int var2 = 0; var2 < var0.length(); var2++) {
               char var3 = var0.charAt(var2);
               if (!Character.isLetter(var3) && !Character.isDigit(var3) && var3 != '-') {
                  return renderJsonString(var0);
               }
            }

            return var0;
         } else {
            return renderJsonString(var0);
         }
      } else {
         return renderJsonString(var0);
      }
   }

   static boolean isWhitespace(int var0) {
      switch (var0) {
         case 10:
         case 32:
         case 160:
         case 8199:
         case 8239:
         case 65279:
            return true;
         default:
            return Character.isWhitespace(var0);
      }
   }

   public static String unicodeTrim(String var0) {
      int var1 = var0.length();
      if (var1 == 0) {
         return var0;
      }

      int var2 = 0;

      while (var2 < var1) {
         char var3 = var0.charAt(var2);
         if (var3 != ' ' && var3 != '\n') {
            int var4 = var0.codePointAt(var2);
            if (!isWhitespace(var4)) {
               break;
            }

            var2 += Character.charCount(var4);
         } else {
            var2++;
         }
      }

      int var7 = var1;

      while (var7 > var2) {
         char var8 = var0.charAt(var7 - 1);
         if (var8 != ' ' && var8 != '\n') {
            int var5;
            byte var6;
            if (Character.isLowSurrogate(var8)) {
               var5 = var0.codePointAt(var7 - 2);
               var6 = 2;
            } else {
               var5 = var0.codePointAt(var7 - 1);
               var6 = 1;
            }

            if (!isWhitespace(var5)) {
               break;
            }

            var7 -= var6;
         } else {
            var7--;
         }
      }

      return var0.substring(var2, var7);
   }

   public static ConfigException extractInitializerError(ExceptionInInitializerError var0) {
      Throwable var1 = var0.getCause();
      if (var1 != null && var1 instanceof ConfigException) {
         return (ConfigException)var1;
      } else {
         throw var0;
      }
   }

   static File urlToFile(URL var0) {
      try {
         return new File(var0.toURI());
      } catch (URISyntaxException var2) {
         return new File(var0.getPath());
      } catch (IllegalArgumentException var3) {
         return new File(var0.getPath());
      }
   }

   public static String joinPath(String... var0) {
      return new Path(var0).render();
   }

   public static String joinPath(List<String> var0) {
      return joinPath(var0.toArray(new String[0]));
   }

   public static List<String> splitPath(String var0) {
      Path var1 = Path.newPath(var0);
      ArrayList var2 = new ArrayList();

      while (var1 != null) {
         var2.add(var1.first());
         var1 = var1.remainder();
      }

      return var2;
   }

   public static ConfigOrigin readOrigin(ObjectInputStream var0) {
      return SerializedConfigValue.readOrigin(var0, null);
   }

   public static void writeOrigin(ObjectOutputStream var0, ConfigOrigin var1) {
      SerializedConfigValue.writeOrigin(new DataOutputStream(var0), (SimpleConfigOrigin)var1, null);
   }

   static String toCamelCase(String var0) {
      String[] var1 = var0.split("-+");
      StringBuilder var2 = new StringBuilder(var0.length());

      for (String var6 : var1) {
         if (var2.length() == 0) {
            var2.append(var6);
         } else {
            var2.append(var6.substring(0, 1).toUpperCase());
            var2.append(var6.substring(1));
         }
      }

      return var2.toString();
   }

   private static char underscoreMappings(int var0) {
      switch (var0) {
         case 1:
            return '.';
         case 2:
            return '-';
         case 3:
            return '_';
         default:
            return '\u0000';
      }
   }

   static String envVariableAsProperty(String var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = var0.substring(var1.length(), var0.length());
      int var4 = 0;

      for (char var8 : var3.toCharArray()) {
         if (var8 == '_') {
            var4++;
         } else {
            if (var4 > 0 && var4 < 4) {
               var2.append(underscoreMappings(var4));
            } else if (var4 > 3) {
               throw new ConfigException.BadPath(var0, "Environment variable contains an un-mapped number of underscores.");
            }

            var4 = 0;
            var2.append(var8);
         }
      }

      if (var4 > 0 && var4 < 4) {
         var2.append(underscoreMappings(var4));
      } else if (var4 > 3) {
         throw new ConfigException.BadPath(var0, "Environment variable contains an un-mapped number of underscores.");
      }

      return var2.toString();
   }

   public static ConfigSyntax syntaxFromExtension(String var0) {
      if (var0 == null) {
         return null;
      } else if (var0.endsWith(".json")) {
         return ConfigSyntax.JSON;
      } else if (var0.endsWith(".conf")) {
         return ConfigSyntax.CONF;
      } else {
         return var0.endsWith(".properties") ? ConfigSyntax.PROPERTIES : null;
      }
   }
}
