package org.spongepowered.include.com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import org.spongepowered.include.com.google.gson.FieldNamingStrategy;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.JsonSyntaxException;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.annotations.SerializedName;
import org.spongepowered.include.com.google.gson.internal.$Gson$Types;
import org.spongepowered.include.com.google.gson.internal.ConstructorConstructor;
import org.spongepowered.include.com.google.gson.internal.Excluder;
import org.spongepowered.include.com.google.gson.internal.ObjectConstructor;
import org.spongepowered.include.com.google.gson.internal.Primitives;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
   private final ConstructorConstructor constructorConstructor;
   private final FieldNamingStrategy fieldNamingPolicy;
   private final Excluder excluder;

   public ReflectiveTypeAdapterFactory(ConstructorConstructor var1, FieldNamingStrategy var2, Excluder var3) {
      this.constructorConstructor = var1;
      this.fieldNamingPolicy = var2;
      this.excluder = var3;
   }

   public boolean excludeField(Field var1, boolean var2) {
      return !this.excluder.excludeClass(var1.getType(), var2) && !this.excluder.excludeField(var1, var2);
   }

   private String getFieldName(Field var1) {
      SerializedName var2 = var1.getAnnotation(SerializedName.class);
      return var2 == null ? this.fieldNamingPolicy.translateName(var1) : var2.value();
   }

   @Override
   public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
      Class var3 = var2.getRawType();
      if (!Object.class.isAssignableFrom(var3)) {
         return null;
      }

      ObjectConstructor var4 = this.constructorConstructor.get(var2);
      return new ReflectiveTypeAdapterFactory.Adapter<>(var4, this.getBoundFields(var1, var2, var3));
   }

   private ReflectiveTypeAdapterFactory.BoundField createBoundField(
      final Gson var1, final Field var2, String var3, final TypeToken<?> var4, boolean var5, boolean var6
   ) {
      final boolean var7 = Primitives.isPrimitive(var4.getRawType());
      return new ReflectiveTypeAdapterFactory.BoundField(var3, var5, var6) {
         final TypeAdapter<?> typeAdapter = var1.getAdapter(var4);

         @Override
         void write(JsonWriter var1x, Object var2x) {
            Object var3x = var2.get(var2x);
            TypeAdapterRuntimeTypeWrapper var4x = new TypeAdapterRuntimeTypeWrapper<>(var1, this.typeAdapter, var4.getType());
            var4x.write(var1x, var3x);
         }

         @Override
         void read(JsonReader var1x, Object var2x) {
            Object var3x = this.typeAdapter.read(var1x);
            if (var3x != null || !var7) {
               var2.set(var2x, var3x);
            }
         }
      };
   }

   private Map<String, ReflectiveTypeAdapterFactory.BoundField> getBoundFields(Gson var1, TypeToken<?> var2, Class<?> var3) {
      LinkedHashMap var4 = new LinkedHashMap();
      if (var3.isInterface()) {
         return var4;
      }

      Type var5 = var2.getType();

      while (var3 != Object.class) {
         Field[] var6 = var3.getDeclaredFields();

         for (Field var10 : var6) {
            boolean var11 = this.excludeField(var10, true);
            boolean var12 = this.excludeField(var10, false);
            if (var11 || var12) {
               var10.setAccessible(true);
               Type var13 = $Gson$Types.resolve(var2.getType(), var3, var10.getGenericType());
               ReflectiveTypeAdapterFactory.BoundField var14 = this.createBoundField(var1, var10, this.getFieldName(var10), TypeToken.get(var13), var11, var12);
               ReflectiveTypeAdapterFactory.BoundField var15 = var4.put(var14.name, var14);
               if (var15 != null) {
                  throw new IllegalArgumentException(var5 + " declares multiple JSON fields named " + var15.name);
               }
            }
         }

         var2 = TypeToken.get($Gson$Types.resolve(var2.getType(), var3, var3.getGenericSuperclass()));
         var3 = var2.getRawType();
      }

      return var4;
   }

   public static final class Adapter<T> extends TypeAdapter<T> {
      private final ObjectConstructor<T> constructor;
      private final Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields;

      private Adapter(ObjectConstructor<T> var1, Map<String, ReflectiveTypeAdapterFactory.BoundField> var2) {
         this.constructor = var1;
         this.boundFields = var2;
      }

      @Override
      public T read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         Object var2 = this.constructor.construct();

         try {
            var1.beginObject();

            while (var1.hasNext()) {
               String var3 = var1.nextName();
               ReflectiveTypeAdapterFactory.BoundField var4 = this.boundFields.get(var3);
               if (var4 != null && var4.deserialized) {
                  var4.read(var1, var2);
               } else {
                  var1.skipValue();
               }
            }
         } catch (IllegalStateException var5) {
            throw new JsonSyntaxException(var5);
         } catch (IllegalAccessException var6) {
            throw new AssertionError(var6);
         }

         var1.endObject();
         return (T)var2;
      }

      @Override
      public void write(JsonWriter var1, T var2) {
         if (var2 == null) {
            var1.nullValue();
         } else {
            var1.beginObject();

            try {
               for (ReflectiveTypeAdapterFactory.BoundField var4 : this.boundFields.values()) {
                  if (var4.serialized) {
                     var1.name(var4.name);
                     var4.write(var1, var2);
                  }
               }
            } catch (IllegalAccessException var5) {
               throw new AssertionError();
            }

            var1.endObject();
         }
      }
   }

   abstract static class BoundField {
      final String name;
      final boolean serialized;
      final boolean deserialized;

      protected BoundField(String var1, boolean var2, boolean var3) {
         this.name = var1;
         this.serialized = var2;
         this.deserialized = var3;
      }

      abstract void write(JsonWriter var1, Object var2);

      abstract void read(JsonReader var1, Object var2);
   }
}
