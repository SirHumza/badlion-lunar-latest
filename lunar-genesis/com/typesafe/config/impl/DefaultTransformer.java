package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

final class DefaultTransformer {
   static AbstractConfigValue transform(AbstractConfigValue var0, ConfigValueType var1) {
      if (var0.valueType() == ConfigValueType.STRING) {
         String var2 = (String)var0.unwrapped();
         switch (var1) {
            case NUMBER:
               try {
                  Long var12 = Long.parseLong(var2);
                  return new ConfigLong(var0.origin(), var12, var2);
               } catch (NumberFormatException var10) {
                  try {
                     Double var3 = Double.parseDouble(var2);
                     return new ConfigDouble(var0.origin(), var3, var2);
                  } catch (NumberFormatException var9) {
                     break;
                  }
               }
            case NULL:
               if (var2.equals("null")) {
                  return new ConfigNull(var0.origin());
               }
               break;
            case BOOLEAN:
               if (var2.equals("true") || var2.equals("yes") || var2.equals("on")) {
                  return new ConfigBoolean(var0.origin(), true);
               }

               if (var2.equals("false") || var2.equals("no") || var2.equals("off")) {
                  return new ConfigBoolean(var0.origin(), false);
               }
            case LIST:
            case OBJECT:
            case STRING:
         }
      } else if (var1 == ConfigValueType.STRING) {
         switch (var0.valueType()) {
            case NUMBER:
            case BOOLEAN:
               return new ConfigString.Quoted(var0.origin(), var0.transformToString());
            case NULL:
            case LIST:
            case OBJECT:
            case STRING:
         }
      } else if (var1 == ConfigValueType.LIST && var0.valueType() == ConfigValueType.OBJECT) {
         AbstractConfigObject var11 = (AbstractConfigObject)var0;
         HashMap var13 = new HashMap();

         for (String var5 : var11.keySet()) {
            try {
               int var6 = Integer.parseInt(var5, 10);
               if (var6 >= 0) {
                  var13.put(var6, var11.get(var5));
               }
            } catch (NumberFormatException var8) {
            }
         }

         if (!var13.isEmpty()) {
            ArrayList var14 = new ArrayList(var13.entrySet());
            Collections.sort(var14, new Comparator<Entry<Integer, AbstractConfigValue>>() {
               public int compare(Entry<Integer, AbstractConfigValue> var1, Entry<Integer, AbstractConfigValue> var2) {
                  return Integer.compare((Integer)var1.getKey(), (Integer)var2.getKey());
               }
            });
            ArrayList var15 = new ArrayList();

            for (Entry var7 : var14) {
               var15.add(var7.getValue());
            }

            return new SimpleConfigList(var0.origin(), var15);
         }
      }

      return var0;
   }
}
