package org.yaml.snakeyaml.introspector;

import java.beans.FeatureDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.util.PlatformFeatureDetector;

public class PropertyUtils {
   private final Map<Class<?>, Map<String, Property>> propertiesCache = new HashMap<>();
   private final Map<Class<?>, Set<Property>> readableProperties = new HashMap<>();
   private BeanAccess beanAccess = BeanAccess.DEFAULT;
   private boolean allowReadOnlyProperties = false;
   private boolean skipMissingProperties = false;
   private final PlatformFeatureDetector platformFeatureDetector;
   private static final String TRANSIENT = "transient";

   public PropertyUtils() {
      this(new PlatformFeatureDetector());
   }

   PropertyUtils(PlatformFeatureDetector var1) {
      this.platformFeatureDetector = var1;
      if (var1.isRunningOnAndroid()) {
         this.beanAccess = BeanAccess.FIELD;
      }
   }

   protected Map<String, Property> getPropertiesMap(Class<?> var1, BeanAccess var2) {
      if (this.propertiesCache.containsKey(var1)) {
         return this.propertiesCache.get(var1);
      }

      LinkedHashMap var3 = new LinkedHashMap();
      boolean var4 = false;
      if (var2 == BeanAccess.FIELD) {
         for (Class var5 = var1; var5 != null; var5 = var5.getSuperclass()) {
            for (Field var9 : var5.getDeclaredFields()) {
               int var10 = var9.getModifiers();
               if (!Modifier.isStatic(var10) && !Modifier.isTransient(var10) && !var3.containsKey(var9.getName())) {
                  var3.put(var9.getName(), new FieldProperty(var9));
               }
            }
         }
      } else {
         try {
            for (PropertyDescriptor var18 : Introspector.getBeanInfo(var1).getPropertyDescriptors()) {
               Method var20 = var18.getReadMethod();
               if ((var20 == null || !var20.getName().equals("getClass")) && !this.isTransient(var18)) {
                  var3.put(var18.getName(), new MethodProperty(var18));
               }
            }
         } catch (IntrospectionException var11) {
            throw new YAMLException(var11);
         }

         for (Class var13 = var1; var13 != null; var13 = var13.getSuperclass()) {
            for (Field var21 : var13.getDeclaredFields()) {
               int var22 = var21.getModifiers();
               if (!Modifier.isStatic(var22) && !Modifier.isTransient(var22)) {
                  if (Modifier.isPublic(var22)) {
                     var3.put(var21.getName(), new FieldProperty(var21));
                  } else {
                     var4 = true;
                  }
               }
            }
         }
      }

      if (var3.isEmpty() && var4) {
         throw new YAMLException("No JavaBean properties found in " + var1.getName());
      }

      this.propertiesCache.put(var1, var3);
      return var3;
   }

   private boolean isTransient(FeatureDescriptor var1) {
      return Boolean.TRUE.equals(var1.getValue("transient"));
   }

   public Set<Property> getProperties(Class<? extends Object> var1) {
      return this.getProperties(var1, this.beanAccess);
   }

   public Set<Property> getProperties(Class<? extends Object> var1, BeanAccess var2) {
      if (this.readableProperties.containsKey(var1)) {
         return this.readableProperties.get(var1);
      }

      Set var3 = this.createPropertySet(var1, var2);
      this.readableProperties.put(var1, var3);
      return var3;
   }

   protected Set<Property> createPropertySet(Class<? extends Object> var1, BeanAccess var2) {
      TreeSet var3 = new TreeSet();

      for (Property var6 : this.getPropertiesMap(var1, var2).values()) {
         if (var6.isReadable() && (this.allowReadOnlyProperties || var6.isWritable())) {
            var3.add(var6);
         }
      }

      return var3;
   }

   public Property getProperty(Class<? extends Object> var1, String var2) {
      return this.getProperty(var1, var2, this.beanAccess);
   }

   public Property getProperty(Class<? extends Object> var1, String var2, BeanAccess var3) {
      Map var4 = this.getPropertiesMap(var1, var3);
      Property var5 = (Property)var4.get(var2);
      if (var5 == null && this.skipMissingProperties) {
         var5 = new MissingProperty(var2);
      }

      if (var5 == null) {
         throw new YAMLException("Unable to find property '" + var2 + "' on class: " + var1.getName());
      } else {
         return var5;
      }
   }

   public void setBeanAccess(BeanAccess var1) {
      if (this.platformFeatureDetector.isRunningOnAndroid() && var1 != BeanAccess.FIELD) {
         throw new IllegalArgumentException("JVM is Android - only BeanAccess.FIELD is available");
      }

      if (this.beanAccess != var1) {
         this.beanAccess = var1;
         this.propertiesCache.clear();
         this.readableProperties.clear();
      }
   }

   public void setAllowReadOnlyProperties(boolean var1) {
      if (this.allowReadOnlyProperties != var1) {
         this.allowReadOnlyProperties = var1;
         this.readableProperties.clear();
      }
   }

   public boolean isAllowReadOnlyProperties() {
      return this.allowReadOnlyProperties;
   }

   public void setSkipMissingProperties(boolean var1) {
      if (this.skipMissingProperties != var1) {
         this.skipMissingProperties = var1;
         this.readableProperties.clear();
      }
   }

   public boolean isSkipMissingProperties() {
      return this.skipMissingProperties;
   }
}
