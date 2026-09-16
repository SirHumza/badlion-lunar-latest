package org.spongepowered.include.com.google.gson.internal.bind;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.Map.Entry;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.JsonArray;
import org.spongepowered.include.com.google.gson.JsonElement;
import org.spongepowered.include.com.google.gson.JsonIOException;
import org.spongepowered.include.com.google.gson.JsonNull;
import org.spongepowered.include.com.google.gson.JsonObject;
import org.spongepowered.include.com.google.gson.JsonPrimitive;
import org.spongepowered.include.com.google.gson.JsonSyntaxException;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.annotations.SerializedName;
import org.spongepowered.include.com.google.gson.internal.LazilyParsedNumber;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class TypeAdapters {
   public static final TypeAdapter<Class> CLASS = new TypeAdapter<Class>() {
      public void write(JsonWriter var1, Class var2) {
         if (var2 == null) {
            var1.nullValue();
         } else {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + var2.getName() + ". Forgot to register a type adapter?");
         }
      }

      public Class read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
         }
      }
   };
   public static final TypeAdapterFactory CLASS_FACTORY = newFactory(Class.class, CLASS);
   public static final TypeAdapter<BitSet> BIT_SET = new TypeAdapter<BitSet>() {
      public BitSet read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         BitSet var2 = new BitSet();
         var1.beginArray();
         int var3 = 0;

         for (JsonToken var4 = var1.peek(); var4 != JsonToken.END_ARRAY; var4 = var1.peek()) {
            boolean var5;
            switch (var4) {
               case NUMBER:
                  var5 = var1.nextInt() != 0;
                  break;
               case BOOLEAN:
                  var5 = var1.nextBoolean();
                  break;
               case STRING:
                  String var6 = var1.nextString();

                  try {
                     var5 = Integer.parseInt(var6) != 0;
                     break;
                  } catch (NumberFormatException var8) {
                     throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + var6);
                  }
               default:
                  throw new JsonSyntaxException("Invalid bitset value type: " + var4);
            }

            if (var5) {
               var2.set(var3);
            }

            var3++;
         }

         var1.endArray();
         return var2;
      }

      public void write(JsonWriter var1, BitSet var2) {
         if (var2 == null) {
            var1.nullValue();
         } else {
            var1.beginArray();

            for (int var3 = 0; var3 < var2.length(); var3++) {
               int var4 = var2.get(var3) ? 1 : 0;
               var1.value(var4);
            }

            var1.endArray();
         }
      }
   };
   public static final TypeAdapterFactory BIT_SET_FACTORY = newFactory(BitSet.class, BIT_SET);
   public static final TypeAdapter<Boolean> BOOLEAN = new TypeAdapter<Boolean>() {
      public Boolean read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return var1.peek() == JsonToken.STRING ? Boolean.parseBoolean(var1.nextString()) : var1.nextBoolean();
         }
      }

      public void write(JsonWriter var1, Boolean var2) {
         if (var2 == null) {
            var1.nullValue();
         } else {
            var1.value(var2);
         }
      }
   };
   public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() {
      public Boolean read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return Boolean.valueOf(var1.nextString());
         }
      }

      public void write(JsonWriter var1, Boolean var2) {
         var1.value(var2 == null ? "null" : var2.toString());
      }
   };
   public static final TypeAdapterFactory BOOLEAN_FACTORY = newFactory(boolean.class, Boolean.class, BOOLEAN);
   public static final TypeAdapter<Number> BYTE = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            int var2 = var1.nextInt();
            return (byte)var2;
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapterFactory BYTE_FACTORY = newFactory(byte.class, Byte.class, BYTE);
   public static final TypeAdapter<Number> SHORT = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            return (short)var1.nextInt();
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapterFactory SHORT_FACTORY = newFactory(short.class, Short.class, SHORT);
   public static final TypeAdapter<Number> INTEGER = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            return var1.nextInt();
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapterFactory INTEGER_FACTORY = newFactory(int.class, Integer.class, INTEGER);
   public static final TypeAdapter<Number> LONG = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            return var1.nextLong();
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapter<Number> FLOAT = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return (float)var1.nextDouble();
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapter<Number> DOUBLE = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return var1.nextDouble();
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapter<Number> NUMBER = new TypeAdapter<Number>() {
      public Number read(JsonReader var1) {
         JsonToken var2 = var1.peek();
         switch (var2) {
            case NUMBER:
               return new LazilyParsedNumber(var1.nextString());
            case NULL:
               var1.nextNull();
               return null;
            default:
               throw new JsonSyntaxException("Expecting number, got: " + var2);
         }
      }

      public void write(JsonWriter var1, Number var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapterFactory NUMBER_FACTORY = newFactory(Number.class, NUMBER);
   public static final TypeAdapter<Character> CHARACTER = new TypeAdapter<Character>() {
      public Character read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            String var2 = var1.nextString();
            if (var2.length() != 1) {
               throw new JsonSyntaxException("Expecting character, got: " + var2);
            } else {
               return var2.charAt(0);
            }
         }
      }

      public void write(JsonWriter var1, Character var2) {
         var1.value(var2 == null ? null : String.valueOf(var2));
      }
   };
   public static final TypeAdapterFactory CHARACTER_FACTORY = newFactory(char.class, Character.class, CHARACTER);
   public static final TypeAdapter<String> STRING = new TypeAdapter<String>() {
      public String read(JsonReader var1) {
         JsonToken var2 = var1.peek();
         if (var2 == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return var2 == JsonToken.BOOLEAN ? Boolean.toString(var1.nextBoolean()) : var1.nextString();
         }
      }

      public void write(JsonWriter var1, String var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapter<BigDecimal> BIG_DECIMAL = new TypeAdapter<BigDecimal>() {
      public BigDecimal read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            return new BigDecimal(var1.nextString());
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }

      public void write(JsonWriter var1, BigDecimal var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapter<BigInteger> BIG_INTEGER = new TypeAdapter<BigInteger>() {
      public BigInteger read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            return new BigInteger(var1.nextString());
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }

      public void write(JsonWriter var1, BigInteger var2) {
         var1.value(var2);
      }
   };
   public static final TypeAdapterFactory STRING_FACTORY = newFactory(String.class, STRING);
   public static final TypeAdapter<StringBuilder> STRING_BUILDER = new TypeAdapter<StringBuilder>() {
      public StringBuilder read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return new StringBuilder(var1.nextString());
         }
      }

      public void write(JsonWriter var1, StringBuilder var2) {
         var1.value(var2 == null ? null : var2.toString());
      }
   };
   public static final TypeAdapterFactory STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, STRING_BUILDER);
   public static final TypeAdapter<StringBuffer> STRING_BUFFER = new TypeAdapter<StringBuffer>() {
      public StringBuffer read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return new StringBuffer(var1.nextString());
         }
      }

      public void write(JsonWriter var1, StringBuffer var2) {
         var1.value(var2 == null ? null : var2.toString());
      }
   };
   public static final TypeAdapterFactory STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, STRING_BUFFER);
   public static final TypeAdapter<URL> URL = new TypeAdapter<URL>() {
      public URL read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            String var2 = var1.nextString();
            return "null".equals(var2) ? null : new URL(var2);
         }
      }

      public void write(JsonWriter var1, URL var2) {
         var1.value(var2 == null ? null : var2.toExternalForm());
      }
   };
   public static final TypeAdapterFactory URL_FACTORY = newFactory(URL.class, URL);
   public static final TypeAdapter<URI> URI = new TypeAdapter<URI>() {
      public URI read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         try {
            String var2 = var1.nextString();
            return "null".equals(var2) ? null : new URI(var2);
         } catch (URISyntaxException var3) {
            throw new JsonIOException(var3);
         }
      }

      public void write(JsonWriter var1, URI var2) {
         var1.value(var2 == null ? null : var2.toASCIIString());
      }
   };
   public static final TypeAdapterFactory URI_FACTORY = newFactory(URI.class, URI);
   public static final TypeAdapter<InetAddress> INET_ADDRESS = new TypeAdapter<InetAddress>() {
      public InetAddress read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return InetAddress.getByName(var1.nextString());
         }
      }

      public void write(JsonWriter var1, InetAddress var2) {
         var1.value(var2 == null ? null : var2.getHostAddress());
      }
   };
   public static final TypeAdapterFactory INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, INET_ADDRESS);
   public static final TypeAdapter<UUID> UUID = new TypeAdapter<UUID>() {
      public UUID read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return java.util.UUID.fromString(var1.nextString());
         }
      }

      public void write(JsonWriter var1, UUID var2) {
         var1.value(var2 == null ? null : var2.toString());
      }
   };
   public static final TypeAdapterFactory UUID_FACTORY = newFactory(UUID.class, UUID);
   public static final TypeAdapterFactory TIMESTAMP_FACTORY = new TypeAdapterFactory() {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (var2.getRawType() != Timestamp.class) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(Date.class);
         return (TypeAdapter<T>)(new TypeAdapter<Timestamp>() {
            public Timestamp read(JsonReader var1) {
               Date var2x = (Date)var3.read(var1);
               return var2x != null ? new Timestamp(var2x.getTime()) : null;
            }

            public void write(JsonWriter var1, Timestamp var2x) {
               var3.write(var1, var2x);
            }
         });
      }
   };
   public static final TypeAdapter<Calendar> CALENDAR = new TypeAdapter<Calendar>() {
      public Calendar read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         var1.beginObject();
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;

         while (var1.peek() != JsonToken.END_OBJECT) {
            String var8 = var1.nextName();
            int var9 = var1.nextInt();
            if ("year".equals(var8)) {
               var2 = var9;
            } else if ("month".equals(var8)) {
               var3 = var9;
            } else if ("dayOfMonth".equals(var8)) {
               var4 = var9;
            } else if ("hourOfDay".equals(var8)) {
               var5 = var9;
            } else if ("minute".equals(var8)) {
               var6 = var9;
            } else if ("second".equals(var8)) {
               var7 = var9;
            }
         }

         var1.endObject();
         return new GregorianCalendar(var2, var3, var4, var5, var6, var7);
      }

      public void write(JsonWriter var1, Calendar var2) {
         if (var2 == null) {
            var1.nullValue();
         } else {
            var1.beginObject();
            var1.name("year");
            var1.value(var2.get(1));
            var1.name("month");
            var1.value(var2.get(2));
            var1.name("dayOfMonth");
            var1.value(var2.get(5));
            var1.name("hourOfDay");
            var1.value(var2.get(11));
            var1.name("minute");
            var1.value(var2.get(12));
            var1.name("second");
            var1.value(var2.get(13));
            var1.endObject();
         }
      }
   };
   public static final TypeAdapterFactory CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, CALENDAR);
   public static final TypeAdapter<Locale> LOCALE = new TypeAdapter<Locale>() {
      public Locale read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         String var2 = var1.nextString();
         StringTokenizer var3 = new StringTokenizer(var2, "_");
         String var4 = null;
         String var5 = null;
         String var6 = null;
         if (var3.hasMoreElements()) {
            var4 = var3.nextToken();
         }

         if (var3.hasMoreElements()) {
            var5 = var3.nextToken();
         }

         if (var3.hasMoreElements()) {
            var6 = var3.nextToken();
         }

         if (var5 == null && var6 == null) {
            return new Locale(var4);
         } else {
            return var6 == null ? new Locale(var4, var5) : new Locale(var4, var5, var6);
         }
      }

      public void write(JsonWriter var1, Locale var2) {
         var1.value(var2 == null ? null : var2.toString());
      }
   };
   public static final TypeAdapterFactory LOCALE_FACTORY = newFactory(Locale.class, LOCALE);
   public static final TypeAdapter<JsonElement> JSON_ELEMENT = new TypeAdapter<JsonElement>() {
      public JsonElement read(JsonReader var1) {
         switch (var1.peek()) {
            case NUMBER:
               String var2 = var1.nextString();
               return new JsonPrimitive(new LazilyParsedNumber(var2));
            case BOOLEAN:
               return new JsonPrimitive(var1.nextBoolean());
            case STRING:
               return new JsonPrimitive(var1.nextString());
            case NULL:
               var1.nextNull();
               return JsonNull.INSTANCE;
            case BEGIN_ARRAY:
               JsonArray var3 = new JsonArray();
               var1.beginArray();

               while (var1.hasNext()) {
                  var3.add(this.read(var1));
               }

               var1.endArray();
               return var3;
            case BEGIN_OBJECT:
               JsonObject var4 = new JsonObject();
               var1.beginObject();

               while (var1.hasNext()) {
                  var4.add(var1.nextName(), this.read(var1));
               }

               var1.endObject();
               return var4;
            case END_DOCUMENT:
            case NAME:
            case END_OBJECT:
            case END_ARRAY:
            default:
               throw new IllegalArgumentException();
         }
      }

      public void write(JsonWriter var1, JsonElement var2) {
         if (var2 == null || var2.isJsonNull()) {
            var1.nullValue();
         } else if (var2.isJsonPrimitive()) {
            JsonPrimitive var3 = var2.getAsJsonPrimitive();
            if (var3.isNumber()) {
               var1.value(var3.getAsNumber());
            } else if (var3.isBoolean()) {
               var1.value(var3.getAsBoolean());
            } else {
               var1.value(var3.getAsString());
            }
         } else if (var2.isJsonArray()) {
            var1.beginArray();

            for (JsonElement var4 : var2.getAsJsonArray()) {
               this.write(var1, var4);
            }

            var1.endArray();
         } else {
            if (!var2.isJsonObject()) {
               throw new IllegalArgumentException("Couldn't write " + var2.getClass());
            }

            var1.beginObject();

            for (Entry var7 : var2.getAsJsonObject().entrySet()) {
               var1.name((String)var7.getKey());
               this.write(var1, (JsonElement)var7.getValue());
            }

            var1.endObject();
         }
      }
   };
   public static final TypeAdapterFactory JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT);
   public static final TypeAdapterFactory ENUM_FACTORY = newEnumTypeHierarchyFactory();

   public static TypeAdapterFactory newEnumTypeHierarchyFactory() {
      return new TypeAdapterFactory() {
         @Override
         public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
            Class var3 = var2.getRawType();
            if (Enum.class.isAssignableFrom(var3) && var3 != Enum.class) {
               if (!var3.isEnum()) {
                  var3 = var3.getSuperclass();
               }

               return new TypeAdapters.EnumTypeAdapter(var3);
            } else {
               return null;
            }
         }
      };
   }

   public static <TT> TypeAdapterFactory newFactory(final Class<TT> var0, final TypeAdapter<TT> var1) {
      return new TypeAdapterFactory() {
         @Override
         public <T> TypeAdapter<T> create(Gson var1x, TypeToken<T> var2) {
            return var2.getRawType() == var0 ? var1 : null;
         }

         @Override
         public String toString() {
            return "Factory[type=" + var0.getName() + ",adapter=" + var1 + "]";
         }
      };
   }

   public static <TT> TypeAdapterFactory newFactory(final Class<TT> var0, final Class<TT> var1, final TypeAdapter<? super TT> var2) {
      return new TypeAdapterFactory() {
         @Override
         public <T> TypeAdapter<T> create(Gson var1x, TypeToken<T> var2x) {
            Class var3 = var2x.getRawType();
            return var3 != var0 && var3 != var1 ? null : var2;
         }

         @Override
         public String toString() {
            return "Factory[type=" + var1.getName() + "+" + var0.getName() + ",adapter=" + var2 + "]";
         }
      };
   }

   public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> var0, final Class<? extends TT> var1, final TypeAdapter<? super TT> var2) {
      return new TypeAdapterFactory() {
         @Override
         public <T> TypeAdapter<T> create(Gson var1x, TypeToken<T> var2x) {
            Class var3 = var2x.getRawType();
            return var3 != var0 && var3 != var1 ? null : var2;
         }

         @Override
         public String toString() {
            return "Factory[type=" + var0.getName() + "+" + var1.getName() + ",adapter=" + var2 + "]";
         }
      };
   }

   public static <TT> TypeAdapterFactory newTypeHierarchyFactory(final Class<TT> var0, final TypeAdapter<TT> var1) {
      return new TypeAdapterFactory() {
         @Override
         public <T> TypeAdapter<T> create(Gson var1x, TypeToken<T> var2) {
            return var0.isAssignableFrom(var2.getRawType()) ? var1 : null;
         }

         @Override
         public String toString() {
            return "Factory[typeHierarchy=" + var0.getName() + ",adapter=" + var1 + "]";
         }
      };
   }

   private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
      private final Map<String, T> nameToConstant = new HashMap<>();
      private final Map<T, String> constantToName = new HashMap<>();

      public EnumTypeAdapter(Class<T> var1) {
         try {
            for (Enum var5 : (Enum[])var1.getEnumConstants()) {
               String var6 = var5.name();
               SerializedName var7 = var1.getField(var6).getAnnotation(SerializedName.class);
               if (var7 != null) {
                  var6 = var7.value();
               }

               this.nameToConstant.put(var6, (T)var5);
               this.constantToName.put((T)var5, var6);
            }
         } catch (NoSuchFieldException var8) {
            throw new AssertionError();
         }
      }

      public T read(JsonReader var1) {
         if (var1.peek() == JsonToken.NULL) {
            var1.nextNull();
            return null;
         } else {
            return this.nameToConstant.get(var1.nextString());
         }
      }

      public void write(JsonWriter var1, T var2) {
         var1.value(var2 == null ? null : this.constantToName.get(var2));
      }
   }
}
