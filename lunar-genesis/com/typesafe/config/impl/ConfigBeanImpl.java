package com.typesafe.config.impl;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigMemorySize;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import com.typesafe.config.Optional;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ConfigBeanImpl {
   public static <T> T createInternal(Config var0, Class<T> var1) {
      if (((SimpleConfig)var0).root().resolveStatus() != ResolveStatus.RESOLVED) {
         throw new ConfigException.NotResolved("need to Config#resolve() a config before using it to initialize a bean, see the API docs for Config#resolve()");
      }

      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();

      for (Entry var5 : var0.root().entrySet()) {
         String var6 = (String)var5.getKey();
         String var7 = ConfigImplUtil.toCamelCase(var6);
         if (!var3.containsKey(var7) || var6.equals(var7)) {
            var2.put(var7, (AbstractConfigValue)var5.getValue());
            var3.put(var7, var6);
         }
      }

      BeanInfo var19 = null;

      try {
         var19 = Introspector.getBeanInfo(var1);
      } catch (IntrospectionException var18) {
         throw new ConfigException.BadBean("Could not get bean information for class " + var1.getName(), var18);
      }

      try {
         ArrayList var21 = new ArrayList();

         for (PropertyDescriptor var9 : var19.getPropertyDescriptors()) {
            if (var9.getReadMethod() != null && var9.getWriteMethod() != null) {
               var21.add(var9);
            }
         }

         ArrayList var23 = new ArrayList();

         for (PropertyDescriptor var27 : var21) {
            Method var29 = var27.getWriteMethod();
            Class var10 = var29.getParameterTypes()[0];
            ConfigValueType var11 = getValueTypeOrNull(var10);
            if (var11 != null) {
               String var12 = (String)var3.get(var27.getName());
               if (var12 == null) {
                  var12 = var27.getName();
               }

               Path var13 = Path.newKey(var12);
               AbstractConfigValue var14 = (AbstractConfigValue)var2.get(var27.getName());
               if (var14 != null) {
                  SimpleConfig.checkValid(var13, var11, var14, var23);
               } else if (!isOptionalProperty(var1, var27)) {
                  SimpleConfig.addMissing(var23, var11, var13, var0.origin());
               }
            }
         }

         if (!var23.isEmpty()) {
            throw new ConfigException.ValidationFailed(var23);
         }

         Object var26 = var1.newInstance();

         for (PropertyDescriptor var30 : var21) {
            Method var31 = var30.getWriteMethod();
            Type var32 = var31.getGenericParameterTypes()[0];
            Class var33 = var31.getParameterTypes()[0];
            String var34 = (String)var3.get(var30.getName());
            if (var34 == null) {
               if (!isOptionalProperty(var1, var30)) {
                  throw new ConfigException.Missing(var30.getName());
               }
            } else {
               Object var35 = getValue(var1, var32, var33, var0, var34);
               var31.invoke(var26, var35);
            }
         }

         return (T)var26;
      } catch (InstantiationException var15) {
         throw new ConfigException.BadBean(var1.getName() + " needs a public no-args constructor to be used as a bean", var15);
      } catch (IllegalAccessException var16) {
         throw new ConfigException.BadBean(var1.getName() + " getters and setters are not accessible, they must be for use as a bean", var16);
      } catch (InvocationTargetException var17) {
         throw new ConfigException.BadBean("Calling bean method on " + var1.getName() + " caused an exception", var17);
      }
   }

   private static Object getValue(Class<?> var0, Type var1, Class<?> var2, Config var3, String var4) {
      if (var2 == Boolean.class || var2 == boolean.class) {
         return var3.getBoolean(var4);
      }

      if (var2 == Integer.class || var2 == int.class) {
         return var3.getInt(var4);
      }

      if (var2 == Double.class || var2 == double.class) {
         return var3.getDouble(var4);
      }

      if (var2 == Long.class || var2 == long.class) {
         return var3.getLong(var4);
      }

      if (var2 == String.class) {
         return var3.getString(var4);
      }

      if (var2 == Duration.class) {
         return var3.getDuration(var4);
      }

      if (var2 == ConfigMemorySize.class) {
         return var3.getMemorySize(var4);
      }

      if (var2 == Object.class) {
         return var3.getAnyRef(var4);
      }

      if (var2 == List.class) {
         return getListValue(var0, var1, var2, var3, var4);
      }

      if (var2 == Set.class) {
         return getSetValue(var0, var1, var2, var3, var4);
      }

      if (var2 == Map.class) {
         Type[] var5 = ((ParameterizedType)var1).getActualTypeArguments();
         if (var5[0] == String.class && var5[1] == Object.class) {
            return var3.getObject(var4).unwrapped();
         } else {
            throw new ConfigException.BadBean(
               "Bean property '"
                  + var4
                  + "' of class "
                  + var0.getName()
                  + " has unsupported Map<"
                  + var5[0]
                  + ","
                  + var5[1]
                  + ">, only Map<String,Object> is supported right now"
            );
         }
      } else if (var2 == Config.class) {
         return var3.getConfig(var4);
      } else if (var2 == ConfigObject.class) {
         return var3.getObject(var4);
      } else if (var2 == ConfigValue.class) {
         return var3.getValue(var4);
      } else if (var2 == ConfigList.class) {
         return var3.getList(var4);
      } else if (var2.isEnum()) {
         return var3.getEnum(var2, var4);
      } else if (hasAtLeastOneBeanProperty(var2)) {
         return createInternal(var3.getConfig(var4), var2);
      } else {
         throw new ConfigException.BadBean("Bean property " + var4 + " of class " + var0.getName() + " has unsupported type " + var1);
      }
   }

   private static Object getSetValue(Class<?> var0, Type var1, Class<?> var2, Config var3, String var4) {
      return new HashSet((List)getListValue(var0, var1, var2, var3, var4));
   }

   private static Object getListValue(Class<?> var0, Type var1, Class<?> var2, Config var3, String var4) {
      Type var5 = ((ParameterizedType)var1).getActualTypeArguments()[0];
      if (var5 == Boolean.class) {
         return var3.getBooleanList(var4);
      }

      if (var5 == Integer.class) {
         return var3.getIntList(var4);
      }

      if (var5 == Double.class) {
         return var3.getDoubleList(var4);
      }

      if (var5 == Long.class) {
         return var3.getLongList(var4);
      }

      if (var5 == String.class) {
         return var3.getStringList(var4);
      }

      if (var5 == Duration.class) {
         return var3.getDurationList(var4);
      }

      if (var5 == ConfigMemorySize.class) {
         return var3.getMemorySizeList(var4);
      }

      if (var5 == Object.class) {
         return var3.getAnyRefList(var4);
      }

      if (var5 == Config.class) {
         return var3.getConfigList(var4);
      }

      if (var5 == ConfigObject.class) {
         return var3.getObjectList(var4);
      }

      if (var5 == ConfigValue.class) {
         return var3.getList(var4);
      }

      if (((Class)var5).isEnum()) {
         return var3.getEnumList((Class)var5, var4);
      }

      if (!hasAtLeastOneBeanProperty((Class<?>)var5)) {
         throw new ConfigException.BadBean("Bean property '" + var4 + "' of class " + var0.getName() + " has unsupported list element type " + var5);
      }

      ArrayList var6 = new ArrayList();

      for (Config var9 : var3.getConfigList(var4)) {
         var6.add(createInternal(var9, (Class)var5));
      }

      return var6;
   }

   private static ConfigValueType getValueTypeOrNull(Class<?> var0) {
      if (var0 == Boolean.class || var0 == boolean.class) {
         return ConfigValueType.BOOLEAN;
      } else if (var0 == Integer.class || var0 == int.class) {
         return ConfigValueType.NUMBER;
      } else if (var0 == Double.class || var0 == double.class) {
         return ConfigValueType.NUMBER;
      } else if (var0 == Long.class || var0 == long.class) {
         return ConfigValueType.NUMBER;
      } else if (var0 == String.class) {
         return ConfigValueType.STRING;
      } else if (var0 == Duration.class) {
         return null;
      } else if (var0 == ConfigMemorySize.class) {
         return null;
      } else if (var0 == List.class) {
         return ConfigValueType.LIST;
      } else if (var0 == Map.class) {
         return ConfigValueType.OBJECT;
      } else if (var0 == Config.class) {
         return ConfigValueType.OBJECT;
      } else if (var0 == ConfigObject.class) {
         return ConfigValueType.OBJECT;
      } else {
         return var0 == ConfigList.class ? ConfigValueType.LIST : null;
      }
   }

   private static boolean hasAtLeastOneBeanProperty(Class<?> var0) {
      BeanInfo var1 = null;

      try {
         var1 = Introspector.getBeanInfo(var0);
      } catch (IntrospectionException var6) {
         return false;
      }

      for (PropertyDescriptor var5 : var1.getPropertyDescriptors()) {
         if (var5.getReadMethod() != null && var5.getWriteMethod() != null) {
            return true;
         }
      }

      return false;
   }

   private static boolean isOptionalProperty(Class var0, PropertyDescriptor var1) {
      Field var2 = getField(var0, var1.getName());
      return var2 != null ? var2.getAnnotationsByType(Optional.class).length > 0 : var1.getReadMethod().getAnnotationsByType(Optional.class).length > 0;
   }

   private static Field getField(Class var0, String var1) {
      try {
         Field var2 = var0.getDeclaredField(var1);
         var2.setAccessible(true);
         return var2;
      } catch (NoSuchFieldException var3) {
         var0 = var0.getSuperclass();
         return var0 == null ? null : getField(var0, var1);
      }
   }
}
