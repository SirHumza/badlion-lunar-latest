package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
   private final ConstructorConstructor constructorConstructor;
   private final FieldNamingStrategy fieldNamingPolicy;
   private final Excluder excluder;
   private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
   private final List<ReflectionAccessFilter> reflectionFilters;

   public ReflectiveTypeAdapterFactory(
      ConstructorConstructor var1, FieldNamingStrategy var2, Excluder var3, JsonAdapterAnnotationTypeAdapterFactory var4, List<ReflectionAccessFilter> var5
   ) {
      this.constructorConstructor = var1;
      this.fieldNamingPolicy = var2;
      this.excluder = var3;
      this.jsonAdapterFactory = var4;
      this.reflectionFilters = var5;
   }

   private boolean includeField(Field var1, boolean var2) {
      return !this.excluder.excludeField(var1, var2);
   }

   private List<String> getFieldNames(Field var1) {
      SerializedName var2 = var1.getAnnotation(SerializedName.class);
      if (var2 == null) {
         String var6 = this.fieldNamingPolicy.translateName(var1);
         return Collections.singletonList(var6);
      }

      String var3 = var2.value();
      String[] var4 = var2.alternate();
      if (var4.length == 0) {
         return Collections.singletonList(var3);
      }

      ArrayList var5 = new ArrayList(var4.length + 1);
      var5.add(var3);
      Collections.addAll(var5, var4);
      return var5;
   }

   @Override
   public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
      Class var3 = var2.getRawType();
      if (!Object.class.isAssignableFrom(var3)) {
         return null;
      }

      if (ReflectionHelper.isAnonymousOrNonStaticLocal(var3)) {
         return new TypeAdapter<T>() {
            @Override
            public T read(JsonReader var1) {
               var1.skipValue();
               return null;
            }

            @Override
            public void write(JsonWriter var1, T var2x) {
               var1.nullValue();
            }

            @Override
            public String toString() {
               return "AnonymousOrNonStaticLocalClassAdapter";
            }
         };
      }

      ReflectionAccessFilter.FilterResult var4 = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, var3);
      if (var4 == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
         throw new JsonIOException(
            "ReflectionAccessFilter does not permit using reflection for " + var3 + ". Register a TypeAdapter for this type or adjust the access filter."
         );
      }

      boolean var5 = var4 == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
      if (ReflectionHelper.isRecord(var3)) {
         return new ReflectiveTypeAdapterFactory.RecordAdapter<>(var3, this.getBoundFields(var1, var2, var3, var5, true), var5);
      }

      ObjectConstructor var6 = this.constructorConstructor.get(var2);
      return new ReflectiveTypeAdapterFactory.FieldReflectionAdapter<>(var6, this.getBoundFields(var1, var2, var3, var5, false));
   }

   private static <M extends AccessibleObject & Member> void checkAccessible(Object var0, M var1) {
      if (!ReflectionAccessFilterHelper.canAccess(var1, Modifier.isStatic(((Member)var1).getModifiers()) ? null : var0)) {
         String var2 = ReflectionHelper.getAccessibleObjectDescription(var1, true);
         throw new JsonIOException(
            var2
               + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."
         );
      }
   }

   private ReflectiveTypeAdapterFactory.BoundField createBoundField(
      Gson var1, Field var2, final Method var3, String var4, TypeToken<?> var5, boolean var6, final boolean var7
   ) {
      final boolean var8 = Primitives.isPrimitive(var5.getRawType());
      int var9 = var2.getModifiers();
      final boolean var10 = Modifier.isStatic(var9) && Modifier.isFinal(var9);
      JsonAdapter var11 = var2.getAnnotation(JsonAdapter.class);
      TypeAdapter var12 = null;
      if (var11 != null) {
         var12 = this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, var1, var5, var11, false);
      }

      boolean var13 = var12 != null;
      if (var12 == null) {
         var12 = var1.getAdapter(var5);
      }

      final TypeAdapter var14 = var12;
      final TypeAdapter var15;
      if (var6) {
         var15 = var13 ? var14 : new TypeAdapterRuntimeTypeWrapper(var1, var14, var5.getType());
      } else {
         var15 = var14;
      }

      return new ReflectiveTypeAdapterFactory.BoundField(var4, var2) {
         @Override
         void write(JsonWriter var1, Object var2x) {
            if (var7) {
               if (var3 == null) {
                  ReflectiveTypeAdapterFactory.checkAccessible(var2x, this.field);
               } else {
                  ReflectiveTypeAdapterFactory.checkAccessible(var2x, var3);
               }
            }

            Object var3x;
            if (var3 != null) {
               try {
                  var3x = var3.invoke(var2x);
               } catch (InvocationTargetException var6x) {
                  String var5x = ReflectionHelper.getAccessibleObjectDescription(var3, false);
                  throw new JsonIOException("Accessor " + var5x + " threw exception", var6x.getCause());
               }
            } else {
               var3x = this.field.get(var2x);
            }

            if (var3x != var2x) {
               var1.name(this.serializedName);
               var15.write(var1, var3x);
            }
         }

         @Override
         void readIntoArray(JsonReader var1, int var2x, Object[] var3x) {
            Object var4x = var14.read(var1);
            if (var4x == null && var8) {
               throw new JsonParseException(
                  "null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + var1.getPath()
               );
            }

            var3x[var2x] = var4x;
         }

         @Override
         void readIntoField(JsonReader var1, Object var2x) {
            Object var3x = var14.read(var1);
            if (var3x != null || !var8) {
               if (var7) {
                  ReflectiveTypeAdapterFactory.checkAccessible(var2x, this.field);
               } else if (var10) {
                  String var4x = ReflectionHelper.getAccessibleObjectDescription(this.field, false);
                  throw new JsonIOException("Cannot set value of 'static final' " + var4x);
               }

               this.field.set(var2x, var3x);
            }
         }
      };
   }

   private static IllegalArgumentException createDuplicateFieldException(Class<?> var0, String var1, Field var2, Field var3) {
      throw new IllegalArgumentException(
         "Class "
            + var0.getName()
            + " declares multiple JSON fields named '"
            + var1
            + "'; conflict is caused by fields "
            + ReflectionHelper.fieldToString(var2)
            + " and "
            + ReflectionHelper.fieldToString(var3)
            + "\nSee "
            + TroubleshootingGuide.createUrl("duplicate-fields")
      );
   }

   private ReflectiveTypeAdapterFactory.FieldsData getBoundFields(Gson var1, TypeToken<?> var2, Class<?> var3, boolean var4, boolean var5) {
      if (var3.isInterface()) {
         return ReflectiveTypeAdapterFactory.FieldsData.EMPTY;
      }

      LinkedHashMap var6 = new LinkedHashMap();
      LinkedHashMap var7 = new LinkedHashMap();
      Class var8 = var3;

      while (var3 != Object.class) {
         Field[] var9 = var3.getDeclaredFields();
         if (var3 != var8 && var9.length > 0) {
            ReflectionAccessFilter.FilterResult var10 = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, var3);
            if (var10 == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
               throw new JsonIOException(
                  "ReflectionAccessFilter does not permit using reflection for "
                     + var3
                     + " (supertype of "
                     + var8
                     + "). Register a TypeAdapter for this type or adjust the access filter."
               );
            }

            var4 = var10 == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
         }

         for (Field var13 : var9) {
            boolean var14 = this.includeField(var13, true);
            boolean var15 = this.includeField(var13, false);
            if (var14 || var15) {
               Method var16 = null;
               if (var5) {
                  if (Modifier.isStatic(var13.getModifiers())) {
                     var15 = false;
                  } else {
                     var16 = ReflectionHelper.getAccessor(var3, var13);
                     if (!var4) {
                        ReflectionHelper.makeAccessible(var16);
                     }

                     if (var16.getAnnotation(SerializedName.class) != null && var13.getAnnotation(SerializedName.class) == null) {
                        String var25 = ReflectionHelper.getAccessibleObjectDescription(var16, false);
                        throw new JsonIOException("@SerializedName on " + var25 + " is not supported");
                     }
                  }
               }

               if (!var4 && var16 == null) {
                  ReflectionHelper.makeAccessible(var13);
               }

               Type var17 = $Gson$Types.resolve(var2.getType(), var3, var13.getGenericType());
               List var18 = this.getFieldNames(var13);
               String var19 = (String)var18.get(0);
               ReflectiveTypeAdapterFactory.BoundField var20 = this.createBoundField(var1, var13, var16, var19, TypeToken.get(var17), var14, var4);
               if (var15) {
                  for (String var22 : var18) {
                     ReflectiveTypeAdapterFactory.BoundField var23 = var6.put(var22, var20);
                     if (var23 != null) {
                        throw createDuplicateFieldException(var8, var22, var23.field, var13);
                     }
                  }
               }

               if (var14) {
                  ReflectiveTypeAdapterFactory.BoundField var26 = var7.put(var19, var20);
                  if (var26 != null) {
                     throw createDuplicateFieldException(var8, var19, var26.field, var13);
                  }
               }
            }
         }

         var2 = TypeToken.get($Gson$Types.resolve(var2.getType(), var3, var3.getGenericSuperclass()));
         var3 = var2.getRawType();
      }

      return new ReflectiveTypeAdapterFactory.FieldsData(var6, new ArrayList<>(var7.values()));
   }

   public abstract static class Adapter<T, A> extends TypeAdapter<T> {
      private final ReflectiveTypeAdapterFactory.FieldsData fieldsData;

      Adapter(ReflectiveTypeAdapterFactory.FieldsData var1) {
         this.fieldsData = var1;
      }

      @Override
      public void write(JsonWriter var1, T var2) {
         if (var2 == null) {
            var1.nullValue();
         } else {
            var1.beginObject();

            try {
               for (ReflectiveTypeAdapterFactory.BoundField var4 : this.fieldsData.serializedFields) {
                  var4.write(var1, var2);
               }
            } catch (IllegalAccessException var5) {
               throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(var5);
            }

            var1.endObject();
         }
      }

      @Override
      public T read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         Object var2 = this.createAccumulator();
         Map var3 = this.fieldsData.deserializedFields;

         try {
            var1.beginObject();

            while (var1.hasNext()) {
               String var4 = var1.nextName();
               ReflectiveTypeAdapterFactory.BoundField var5 = (ReflectiveTypeAdapterFactory.BoundField)var3.get(var4);
               if (var5 == null) {
                  var1.skipValue();
               } else {
                  this.readField((A)var2, var1, var5);
               }
            }
         } catch (IllegalStateException var6) {
            throw new JsonSyntaxException(var6);
         } catch (IllegalAccessException var7) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(var7);
         }

         var1.endObject();
         return this.finalize((A)var2);
      }

      abstract A createAccumulator();

      abstract void readField(A var1, JsonReader var2, ReflectiveTypeAdapterFactory.BoundField var3);

      abstract T finalize(A var1);
   }

   abstract static class BoundField {
      final String serializedName;
      final Field field;
      final String fieldName;

      protected BoundField(String var1, Field var2) {
         this.serializedName = var1;
         this.field = var2;
         this.fieldName = var2.getName();
      }

      abstract void write(JsonWriter var1, Object var2);

      abstract void readIntoArray(JsonReader var1, int var2, Object[] var3);

      abstract void readIntoField(JsonReader var1, Object var2);
   }

   private static final class FieldReflectionAdapter<T> extends ReflectiveTypeAdapterFactory.Adapter<T, T> {
      private final ObjectConstructor<T> constructor;

      FieldReflectionAdapter(ObjectConstructor<T> var1, ReflectiveTypeAdapterFactory.FieldsData var2) {
         super(var2);
         this.constructor = var1;
      }

      @Override
      T createAccumulator() {
         return this.constructor.construct();
      }

      @Override
      void readField(T var1, JsonReader var2, ReflectiveTypeAdapterFactory.BoundField var3) {
         var3.readIntoField(var2, var1);
      }

      @Override
      T finalize(T var1) {
         return (T)var1;
      }
   }

   private static class FieldsData {
      public static final ReflectiveTypeAdapterFactory.FieldsData EMPTY = new ReflectiveTypeAdapterFactory.FieldsData(
         Collections.emptyMap(), Collections.emptyList()
      );
      public final Map<String, ReflectiveTypeAdapterFactory.BoundField> deserializedFields;
      public final List<ReflectiveTypeAdapterFactory.BoundField> serializedFields;

      public FieldsData(Map<String, ReflectiveTypeAdapterFactory.BoundField> var1, List<ReflectiveTypeAdapterFactory.BoundField> var2) {
         this.deserializedFields = var1;
         this.serializedFields = var2;
      }
   }

   private static final class RecordAdapter<T> extends ReflectiveTypeAdapterFactory.Adapter<T, Object[]> {
      static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
      private final Constructor<T> constructor;
      private final Object[] constructorArgsDefaults;
      private final Map<String, Integer> componentIndices = new HashMap<>();

      RecordAdapter(Class<T> var1, ReflectiveTypeAdapterFactory.FieldsData var2, boolean var3) {
         super(var2);
         this.constructor = ReflectionHelper.getCanonicalRecordConstructor(var1);
         if (var3) {
            ReflectiveTypeAdapterFactory.checkAccessible(null, this.constructor);
         } else {
            ReflectionHelper.makeAccessible(this.constructor);
         }

         String[] var4 = ReflectionHelper.getRecordComponentNames(var1);

         for (int var5 = 0; var5 < var4.length; var5++) {
            this.componentIndices.put(var4[var5], var5);
         }

         Class[] var7 = this.constructor.getParameterTypes();
         this.constructorArgsDefaults = new Object[var7.length];

         for (int var6 = 0; var6 < var7.length; var6++) {
            this.constructorArgsDefaults[var6] = PRIMITIVE_DEFAULTS.get(var7[var6]);
         }
      }

      private static Map<Class<?>, Object> primitiveDefaults() {
         HashMap var0 = new HashMap();
         var0.put(byte.class, (byte)0);
         var0.put(short.class, (short)0);
         var0.put(int.class, 0);
         var0.put(long.class, 0L);
         var0.put(float.class, 0.0F);
         var0.put(double.class, 0.0);
         var0.put(char.class, '\u0000');
         var0.put(boolean.class, false);
         return var0;
      }

      Object[] createAccumulator() {
         return (Object[])this.constructorArgsDefaults.clone();
      }

      void readField(Object[] var1, JsonReader var2, ReflectiveTypeAdapterFactory.BoundField var3) {
         Integer var4 = this.componentIndices.get(var3.fieldName);
         if (var4 == null) {
            throw new IllegalStateException(
               "Could not find the index in the constructor '"
                  + ReflectionHelper.constructorToString(this.constructor)
                  + "' for field with name '"
                  + var3.fieldName
                  + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."
            );
         }

         var3.readIntoArray(var2, var4, var1);
      }

      T finalize(Object[] var1) {
         try {
            return this.constructor.newInstance(var1);
         } catch (IllegalAccessException var3) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(var3);
         } catch (InstantiationException | IllegalArgumentException var4) {
            throw new RuntimeException(
               "Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(var1), var4
            );
         } catch (InvocationTargetException var5) {
            throw new RuntimeException(
               "Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(var1),
               var5.getCause()
            );
         }
      }
   }
}
