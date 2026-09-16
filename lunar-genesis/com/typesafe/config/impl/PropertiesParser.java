package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

final class PropertiesParser {
   static AbstractConfigObject parse(Reader var0, ConfigOrigin var1) {
      Properties var2 = new Properties();
      var2.load(var0);
      return fromProperties(var1, var2);
   }

   static String lastElement(String var0) {
      int var1 = var0.lastIndexOf(46);
      return var1 < 0 ? var0 : var0.substring(var1 + 1);
   }

   static String exceptLastElement(String var0) {
      int var1 = var0.lastIndexOf(46);
      return var1 < 0 ? null : var0.substring(0, var1);
   }

   static Path pathFromPropertyKey(String var0) {
      String var1 = lastElement(var0);
      String var2 = exceptLastElement(var0);
      Path var3 = new Path(var1, null);

      while (var2 != null) {
         var1 = lastElement(var2);
         var2 = exceptLastElement(var2);
         var3 = new Path(var1, var3);
      }

      return var3;
   }

   static AbstractConfigObject fromProperties(ConfigOrigin var0, Properties var1) {
      return fromEntrySet(var0, var1.entrySet());
   }

   private static <K, V> AbstractConfigObject fromEntrySet(ConfigOrigin var0, Set<Entry<K, V>> var1) {
      Map var2 = getPathMap(var1);
      return fromPathMap(var0, var2, true);
   }

   private static <K, V> Map<Path, Object> getPathMap(Set<Entry<K, V>> var0) {
      HashMap var1 = new HashMap();

      for (Entry var3 : var0) {
         Object var4 = var3.getKey();
         if (var4 instanceof String) {
            Path var5 = pathFromPropertyKey((String)var4);
            var1.put(var5, var3.getValue());
         }
      }

      return var1;
   }

   static AbstractConfigObject fromStringMap(ConfigOrigin var0, Map<String, String> var1) {
      return fromEntrySet(var0, var1.entrySet());
   }

   static AbstractConfigObject fromPathMap(ConfigOrigin var0, Map<?, ?> var1) {
      HashMap var2 = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         Object var5 = var4.getKey();
         if (!(var5 instanceof String)) {
            throw new ConfigException.BugOrBroken("Map has a non-string as a key, expecting a path expression as a String");
         }

         Path var6 = Path.newPath((String)var5);
         var2.put(var6, var4.getValue());
      }

      return fromPathMap(var0, var2, false);
   }

   private static AbstractConfigObject fromPathMap(ConfigOrigin var0, Map<Path, Object> var1, boolean var2) {
      HashSet var3 = new HashSet();
      HashSet var4 = new HashSet();

      for (Path var6 : var1.keySet()) {
         var4.add(var6);

         for (Path var7 = var6.parent(); var7 != null; var7 = var7.parent()) {
            var3.add(var7);
         }
      }

      if (var2) {
         var4.removeAll(var3);
      } else {
         for (Path var16 : var4) {
            if (var3.contains(var16)) {
               throw new ConfigException.BugOrBroken(
                  "In the map, path '"
                     + var16.render()
                     + "' occurs as both the parent object of a value and as a value. Because Map has no defined ordering, this is a broken situation."
               );
            }
         }
      }

      HashMap var15 = new HashMap();
      HashMap var17 = new HashMap();

      for (Path var8 : var3) {
         HashMap var9 = new HashMap();
         var17.put(var8, var9);
      }

      for (Path var21 : var4) {
         Path var23 = var21.parent();
         Map var10 = var23 != null ? (Map)var17.get(var23) : var15;
         String var11 = var21.last();
         Object var12 = var1.get(var21);
         AbstractConfigValue var13;
         if (var2) {
            if (var12 instanceof String) {
               var13 = new ConfigString.Quoted(var0, (String)var12);
            } else {
               var13 = null;
            }
         } else {
            var13 = ConfigImpl.fromAnyRef(var1.get(var21), var0, FromMapMode.KEYS_ARE_PATHS);
         }

         if (var13 != null) {
            var10.put(var11, var13);
         }
      }

      ArrayList var20 = new ArrayList();
      var20.addAll(var3);
      Collections.sort(var20, new Comparator<Path>() {
         public int compare(Path var1, Path var2x) {
            return var2x.length() - var1.length();
         }
      });

      for (Path var24 : var20) {
         Map var25 = (Map)var17.get(var24);
         Path var26 = var24.parent();
         Map var27 = var26 != null ? (Map)var17.get(var26) : var15;
         SimpleConfigObject var28 = new SimpleConfigObject(var0, var25, ResolveStatus.RESOLVED, false);
         var27.put(var24.last(), var28);
      }

      return new SimpleConfigObject(var0, var15, ResolveStatus.RESOLVED, false);
   }
}
