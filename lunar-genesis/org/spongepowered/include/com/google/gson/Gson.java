package org.spongepowered.include.com.google.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongepowered.include.com.google.gson.internal.ConstructorConstructor;
import org.spongepowered.include.com.google.gson.internal.Excluder;
import org.spongepowered.include.com.google.gson.internal.Primitives;
import org.spongepowered.include.com.google.gson.internal.Streams;
import org.spongepowered.include.com.google.gson.internal.bind.ArrayTypeAdapter;
import org.spongepowered.include.com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import org.spongepowered.include.com.google.gson.internal.bind.DateTypeAdapter;
import org.spongepowered.include.com.google.gson.internal.bind.MapTypeAdapterFactory;
import org.spongepowered.include.com.google.gson.internal.bind.ObjectTypeAdapter;
import org.spongepowered.include.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import org.spongepowered.include.com.google.gson.internal.bind.SqlDateTypeAdapter;
import org.spongepowered.include.com.google.gson.internal.bind.TimeTypeAdapter;
import org.spongepowered.include.com.google.gson.internal.bind.TypeAdapters;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;
import org.spongepowered.include.com.google.gson.stream.MalformedJsonException;

public final class Gson {
   private final ThreadLocal<Map<TypeToken<?>, Gson.FutureTypeAdapter<?>>> calls = new ThreadLocal<>();
   private final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache = Collections.synchronizedMap(new HashMap<>());
   private final List<TypeAdapterFactory> factories;
   private final ConstructorConstructor constructorConstructor;
   private final boolean serializeNulls;
   private final boolean htmlSafe;
   private final boolean generateNonExecutableJson;
   private final boolean prettyPrinting;
   final JsonDeserializationContext deserializationContext = new JsonDeserializationContext() {};
   final JsonSerializationContext serializationContext = new JsonSerializationContext() {};

   public Gson() {
      this(
         Excluder.DEFAULT,
         FieldNamingPolicy.IDENTITY,
         Collections.emptyMap(),
         false,
         false,
         false,
         true,
         false,
         false,
         LongSerializationPolicy.DEFAULT,
         Collections.emptyList()
      );
   }

   Gson(
      Excluder var1,
      FieldNamingStrategy var2,
      Map<Type, InstanceCreator<?>> var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      LongSerializationPolicy var10,
      List<TypeAdapterFactory> var11
   ) {
      this.constructorConstructor = new ConstructorConstructor(var3);
      this.serializeNulls = var4;
      this.generateNonExecutableJson = var6;
      this.htmlSafe = var7;
      this.prettyPrinting = var8;
      ArrayList var12 = new ArrayList();
      var12.add(TypeAdapters.JSON_ELEMENT_FACTORY);
      var12.add(ObjectTypeAdapter.FACTORY);
      var12.add(var1);
      var12.addAll(var11);
      var12.add(TypeAdapters.STRING_FACTORY);
      var12.add(TypeAdapters.INTEGER_FACTORY);
      var12.add(TypeAdapters.BOOLEAN_FACTORY);
      var12.add(TypeAdapters.BYTE_FACTORY);
      var12.add(TypeAdapters.SHORT_FACTORY);
      var12.add(TypeAdapters.newFactory(long.class, Long.class, this.longAdapter(var10)));
      var12.add(TypeAdapters.newFactory(double.class, Double.class, this.doubleAdapter(var9)));
      var12.add(TypeAdapters.newFactory(float.class, Float.class, this.floatAdapter(var9)));
      var12.add(TypeAdapters.NUMBER_FACTORY);
      var12.add(TypeAdapters.CHARACTER_FACTORY);
      var12.add(TypeAdapters.STRING_BUILDER_FACTORY);
      var12.add(TypeAdapters.STRING_BUFFER_FACTORY);
      var12.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
      var12.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
      var12.add(TypeAdapters.URL_FACTORY);
      var12.add(TypeAdapters.URI_FACTORY);
      var12.add(TypeAdapters.UUID_FACTORY);
      var12.add(TypeAdapters.LOCALE_FACTORY);
      var12.add(TypeAdapters.INET_ADDRESS_FACTORY);
      var12.add(TypeAdapters.BIT_SET_FACTORY);
      var12.add(DateTypeAdapter.FACTORY);
      var12.add(TypeAdapters.CALENDAR_FACTORY);
      var12.add(TimeTypeAdapter.FACTORY);
      var12.add(SqlDateTypeAdapter.FACTORY);
      var12.add(TypeAdapters.TIMESTAMP_FACTORY);
      var12.add(ArrayTypeAdapter.FACTORY);
      var12.add(TypeAdapters.ENUM_FACTORY);
      var12.add(TypeAdapters.CLASS_FACTORY);
      var12.add(new CollectionTypeAdapterFactory(this.constructorConstructor));
      var12.add(new MapTypeAdapterFactory(this.constructorConstructor, var5));
      var12.add(new ReflectiveTypeAdapterFactory(this.constructorConstructor, var2, var1));
      this.factories = Collections.unmodifiableList(var12);
   }

   private TypeAdapter<Number> doubleAdapter(boolean var1) {
      return var1 ? TypeAdapters.DOUBLE : new TypeAdapter<Number>() {
         public Double read(JsonReader var1) {
            if (var1.peek() == JsonToken.NULL) {
               var1.nextNull();
               return null;
            } else {
               return var1.nextDouble();
            }
         }

         public void write(JsonWriter var1, Number var2) {
            if (var2 == null) {
               var1.nullValue();
            } else {
               double var3 = var2.doubleValue();
               Gson.this.checkValidFloatingPoint(var3);
               var1.value(var2);
            }
         }
      };
   }

   private TypeAdapter<Number> floatAdapter(boolean var1) {
      return var1 ? TypeAdapters.FLOAT : new TypeAdapter<Number>() {
         public Float read(JsonReader var1) {
            if (var1.peek() == JsonToken.NULL) {
               var1.nextNull();
               return null;
            } else {
               return (float)var1.nextDouble();
            }
         }

         public void write(JsonWriter var1, Number var2) {
            if (var2 == null) {
               var1.nullValue();
            } else {
               float var3 = var2.floatValue();
               Gson.this.checkValidFloatingPoint(var3);
               var1.value(var2);
            }
         }
      };
   }

   private void checkValidFloatingPoint(double var1) {
      if (Double.isNaN(var1) || Double.isInfinite(var1)) {
         throw new IllegalArgumentException(
            var1
               + " is not a valid double value as per JSON specification. To override this"
               + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
         );
      }
   }

   private TypeAdapter<Number> longAdapter(LongSerializationPolicy var1) {
      return var1 == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new TypeAdapter<Number>() {
         public Number read(JsonReader var1) {
            if (var1.peek() == JsonToken.NULL) {
               var1.nextNull();
               return null;
            } else {
               return var1.nextLong();
            }
         }

         public void write(JsonWriter var1, Number var2) {
            if (var2 == null) {
               var1.nullValue();
            } else {
               var1.value(var2.toString());
            }
         }
      };
   }

   public <T> TypeAdapter<T> getAdapter(TypeToken<T> var1) {
      TypeAdapter var2 = this.typeTokenCache.get(var1);
      if (var2 != null) {
         return var2;
      }

      Map var3 = this.calls.get();
      boolean var4 = false;
      if (var3 == null) {
         var3 = new HashMap();
         this.calls.set(var3);
         var4 = true;
      }

      Gson.FutureTypeAdapter var5 = (Gson.FutureTypeAdapter)var3.get(var1);
      if (var5 != null) {
         return var5;
      }

      try {
         Gson.FutureTypeAdapter var6 = new Gson.FutureTypeAdapter();
         var3.put(var1, var6);

         for (TypeAdapterFactory var8 : this.factories) {
            TypeAdapter var9 = var8.create(this, var1);
            if (var9 != null) {
               var6.setDelegate(var9);
               this.typeTokenCache.put(var1, var9);
               return var9;
            }
         }

         throw new IllegalArgumentException("GSON cannot handle " + var1);
      } finally {
         var3.remove(var1);
         if (var4) {
            this.calls.remove();
         }
      }
   }

   public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory var1, TypeToken<T> var2) {
      boolean var3 = false;

      for (TypeAdapterFactory var5 : this.factories) {
         if (!var3) {
            if (var5 == var1) {
               var3 = true;
            }
         } else {
            TypeAdapter var6 = var5.create(this, var2);
            if (var6 != null) {
               return var6;
            }
         }
      }

      throw new IllegalArgumentException("GSON cannot serialize " + var2);
   }

   public <T> TypeAdapter<T> getAdapter(Class<T> var1) {
      return this.getAdapter(TypeToken.get(var1));
   }

   public void toJson(Object var1, Appendable var2) {
      if (var1 != null) {
         this.toJson(var1, var1.getClass(), var2);
      } else {
         this.toJson(JsonNull.INSTANCE, var2);
      }
   }

   public void toJson(Object var1, Type var2, Appendable var3) {
      try {
         JsonWriter var4 = this.newJsonWriter(Streams.writerForAppendable(var3));
         this.toJson(var1, var2, var4);
      } catch (IOException var5) {
         throw new JsonIOException(var5);
      }
   }

   public void toJson(Object var1, Type var2, JsonWriter var3) {
      TypeAdapter var4 = this.getAdapter(TypeToken.get(var2));
      boolean var5 = var3.isLenient();
      var3.setLenient(true);
      boolean var6 = var3.isHtmlSafe();
      var3.setHtmlSafe(this.htmlSafe);
      boolean var7 = var3.getSerializeNulls();
      var3.setSerializeNulls(this.serializeNulls);

      try {
         var4.write(var3, var1);
      } catch (IOException var12) {
         throw new JsonIOException(var12);
      } finally {
         var3.setLenient(var5);
         var3.setHtmlSafe(var6);
         var3.setSerializeNulls(var7);
      }
   }

   public String toJson(JsonElement var1) {
      StringWriter var2 = new StringWriter();
      this.toJson(var1, var2);
      return var2.toString();
   }

   public void toJson(JsonElement var1, Appendable var2) {
      try {
         JsonWriter var3 = this.newJsonWriter(Streams.writerForAppendable(var2));
         this.toJson(var1, var3);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }

   private JsonWriter newJsonWriter(Writer var1) {
      if (this.generateNonExecutableJson) {
         var1.write(")]}'\n");
      }

      JsonWriter var2 = new JsonWriter(var1);
      if (this.prettyPrinting) {
         var2.setIndent("  ");
      }

      var2.setSerializeNulls(this.serializeNulls);
      return var2;
   }

   public void toJson(JsonElement var1, JsonWriter var2) {
      boolean var3 = var2.isLenient();
      var2.setLenient(true);
      boolean var4 = var2.isHtmlSafe();
      var2.setHtmlSafe(this.htmlSafe);
      boolean var5 = var2.getSerializeNulls();
      var2.setSerializeNulls(this.serializeNulls);

      try {
         Streams.write(var1, var2);
      } catch (IOException var10) {
         throw new JsonIOException(var10);
      } finally {
         var2.setLenient(var3);
         var2.setHtmlSafe(var4);
         var2.setSerializeNulls(var5);
      }
   }

   public <T> T fromJson(Reader var1, Class<T> var2) {
      JsonReader var3 = new JsonReader(var1);
      Object var4 = this.fromJson(var3, var2);
      assertFullConsumption(var4, var3);
      return Primitives.<T>wrap(var2).cast(var4);
   }

   private static void assertFullConsumption(Object var0, JsonReader var1) {
      try {
         if (var0 != null && var1.peek() != JsonToken.END_DOCUMENT) {
            throw new JsonIOException("JSON document was not fully consumed.");
         }
      } catch (MalformedJsonException var3) {
         throw new JsonSyntaxException(var3);
      } catch (IOException var4) {
         throw new JsonIOException(var4);
      }
   }

   public <T> T fromJson(JsonReader var1, Type var2) {
      boolean var3 = true;
      boolean var4 = var1.isLenient();
      var1.setLenient(true);

      try {
         var1.peek();
         var3 = false;
         TypeToken var5 = TypeToken.get(var2);
         TypeAdapter var6 = this.getAdapter(var5);
         return (T)var6.read(var1);
      } catch (EOFException var14) {
         if (var3) {
            return null;
         } else {
            throw new JsonSyntaxException(var14);
         }
      } catch (IllegalStateException var15) {
         throw new JsonSyntaxException(var15);
      } catch (IOException var16) {
         throw new JsonSyntaxException(var16);
      } finally {
         var1.setLenient(var4);
      }
   }

   @Override
   public String toString() {
      return "{serializeNulls:" + this.serializeNulls + "factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
   }

   static class FutureTypeAdapter<T> extends TypeAdapter<T> {
      private TypeAdapter<T> delegate;

      public void setDelegate(TypeAdapter<T> var1) {
         if (this.delegate != null) {
            throw new AssertionError();
         }

         this.delegate = var1;
      }

      @Override
      public T read(JsonReader var1) {
         if (this.delegate == null) {
            throw new IllegalStateException();
         } else {
            return this.delegate.read(var1);
         }
      }

      @Override
      public void write(JsonWriter var1, T var2) {
         if (this.delegate == null) {
            throw new IllegalStateException();
         }

         this.delegate.write(var1, (T)var2);
      }
   }
}
