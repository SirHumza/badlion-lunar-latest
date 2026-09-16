package com.lunarclient.dfu.serialization;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class JsonOps implements DynamicOps<JsonElement> {
   public static final JsonOps INSTANCE = new JsonOps(false);
   public static final JsonOps COMPRESSED = new JsonOps(true);
   private final boolean compressed;

   protected JsonOps(boolean var1) {
      this.compressed = var1;
   }

   public JsonElement empty() {
      return JsonNull.INSTANCE;
   }

   public JsonElement emptyMap() {
      return new JsonObject();
   }

   public JsonElement emptyList() {
      return new JsonArray();
   }

   public <U> U convertTo(DynamicOps<U> var1, JsonElement var2) {
      if (var2 instanceof JsonObject) {
         return this.convertMap(var1, var2);
      }

      if (var2 instanceof JsonArray) {
         return this.convertList(var1, var2);
      }

      if (var2 instanceof JsonNull) {
         return (U)var1.empty();
      }

      JsonPrimitive var3 = var2.getAsJsonPrimitive();
      if (var3.isString()) {
         return (U)var1.createString(var3.getAsString());
      }

      if (var3.isBoolean()) {
         return (U)var1.createBoolean(var3.getAsBoolean());
      }

      BigDecimal var4 = var3.getAsBigDecimal();

      try {
         long var5 = var4.longValueExact();
         if ((byte)var5 == var5) {
            return (U)var1.createByte((byte)var5);
         } else if ((short)var5 == var5) {
            return (U)var1.createShort((short)var5);
         } else {
            return (U)((int)var5 == var5 ? var1.createInt((int)var5) : var1.createLong(var5));
         }
      } catch (ArithmeticException var8) {
         double var6 = var4.doubleValue();
         return (U)((float)var6 == var6 ? var1.createFloat((float)var6) : var1.createDouble(var6));
      }
   }

   public DataResult<Number> getNumberValue(JsonElement var1) {
      if (var1 instanceof JsonPrimitive) {
         if (var1.getAsJsonPrimitive().isNumber()) {
            return DataResult.success(var1.getAsNumber());
         }

         if (this.compressed && var1.getAsJsonPrimitive().isString()) {
            try {
               return DataResult.success(Integer.parseInt(var1.getAsString()));
            } catch (NumberFormatException var3) {
               return DataResult.error(() -> "Not a number: " + var3 + " " + var1);
            }
         }
      }

      return DataResult.error(() -> "Not a number: " + var1);
   }

   public JsonElement createNumeric(Number var1) {
      return new JsonPrimitive(var1);
   }

   public DataResult<Boolean> getBooleanValue(JsonElement var1) {
      return var1 instanceof JsonPrimitive && var1.getAsJsonPrimitive().isBoolean()
         ? DataResult.success(var1.getAsBoolean())
         : DataResult.error(() -> "Not a boolean: " + var1);
   }

   public JsonElement createBoolean(boolean var1) {
      return new JsonPrimitive(var1);
   }

   public DataResult<String> getStringValue(JsonElement var1) {
      return !(var1 instanceof JsonPrimitive) || !var1.getAsJsonPrimitive().isString() && (!var1.getAsJsonPrimitive().isNumber() || !this.compressed)
         ? DataResult.error(() -> "Not a string: " + var1)
         : DataResult.success(var1.getAsString());
   }

   public JsonElement createString(String var1) {
      return new JsonPrimitive(var1);
   }

   public DataResult<JsonElement> mergeToList(JsonElement var1, JsonElement var2) {
      if (!(var1 instanceof JsonArray) && var1 != this.empty()) {
         return DataResult.error(() -> "mergeToList called with not a list: " + var1, var1);
      }

      JsonArray var3 = new JsonArray();
      if (var1 != this.empty()) {
         var3.addAll(var1.getAsJsonArray());
      }

      var3.add(var2);
      return DataResult.success(var3);
   }

   public DataResult<JsonElement> mergeToList(JsonElement var1, List<JsonElement> var2) {
      if (!(var1 instanceof JsonArray) && var1 != this.empty()) {
         return DataResult.error(() -> "mergeToList called with not a list: " + var1, var1);
      }

      if (var2.isEmpty()) {
         return var1 == this.empty() ? DataResult.success(this.emptyList()) : DataResult.success(var1);
      }

      JsonArray var3 = new JsonArray();
      if (var1 != this.empty()) {
         var3.addAll(var1.getAsJsonArray());
      }

      var2.forEach(var3::add);
      return DataResult.success(var3);
   }

   public DataResult<JsonElement> mergeToMap(JsonElement var1, JsonElement var2, JsonElement var3) {
      if (!(var1 instanceof JsonObject) && var1 != this.empty()) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + var1, var1);
      }

      if (var2 instanceof JsonPrimitive && (var2.getAsJsonPrimitive().isString() || this.compressed)) {
         JsonObject var4 = new JsonObject();
         if (var1 != this.empty()) {
            var1.getAsJsonObject().entrySet().forEach(var1x -> var4.add(var1x.getKey(), var1x.getValue()));
         }

         var4.add(var2.getAsString(), var3);
         return DataResult.success(var4);
      } else {
         return DataResult.error(() -> "key is not a string: " + var2, var1);
      }
   }

   public DataResult<JsonElement> mergeToMap(JsonElement var1, MapLike<JsonElement> var2) {
      if (!(var1 instanceof JsonObject) && var1 != this.empty()) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + var1, var1);
      }

      Iterator var3 = var2.entries().iterator();
      if (!var3.hasNext()) {
         return var1 == this.empty() ? DataResult.success(this.emptyMap()) : DataResult.success(var1);
      }

      JsonObject var4 = new JsonObject();
      if (var1 != this.empty()) {
         var1.getAsJsonObject().entrySet().forEach(var1x -> var4.add(var1x.getKey(), var1x.getValue()));
      }

      ArrayList var5 = Lists.newArrayList();
      var3.forEachRemaining(var3x -> {
         JsonElement var4x = (JsonElement)var3x.getFirst();
         if (var4x instanceof JsonPrimitive && (var4x.getAsJsonPrimitive().isString() || this.compressed)) {
            var4.add(var4x.getAsString(), (JsonElement)var3x.getSecond());
         } else {
            var5.add(var4x);
         }
      });
      return !var5.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + var5, var4) : DataResult.success(var4);
   }

   public DataResult<Stream<Pair<JsonElement, JsonElement>>> getMapValues(JsonElement var1) {
      return !(var1 instanceof JsonObject)
         ? DataResult.error(() -> "Not a JSON object: " + var1)
         : DataResult.success(
            var1.getAsJsonObject()
               .entrySet()
               .stream()
               .map(var0 -> Pair.of(new JsonPrimitive(var0.getKey()), var0.getValue() instanceof JsonNull ? null : var0.getValue()))
         );
   }

   public DataResult<Consumer<BiConsumer<JsonElement, JsonElement>>> getMapEntries(JsonElement var1) {
      return !(var1 instanceof JsonObject) ? DataResult.error(() -> "Not a JSON object: " + var1) : DataResult.success(var2 -> {
         for (Entry var4 : var1.getAsJsonObject().entrySet()) {
            var2.accept(this.createString((String)var4.getKey()), var4.getValue() instanceof JsonNull ? null : (JsonElement)var4.getValue());
         }
      });
   }

   public DataResult<MapLike<JsonElement>> getMap(JsonElement var1) {
      if (!(var1 instanceof JsonObject)) {
         return DataResult.error(() -> "Not a JSON object: " + var1);
      }

      final JsonObject var2 = var1.getAsJsonObject();
      return DataResult.success(new MapLike<JsonElement>() {
         @Nullable
         public JsonElement get(JsonElement var1) {
            JsonElement var2x = var2.get(var1.getAsString());
            return var2x instanceof JsonNull ? null : var2x;
         }

         @Nullable
         public JsonElement get(String var1) {
            JsonElement var2x = var2.get(var1);
            return var2x instanceof JsonNull ? null : var2x;
         }

         @Override
         public Stream<Pair<JsonElement, JsonElement>> entries() {
            return var2.entrySet().stream().map(var0 -> Pair.of(new JsonPrimitive(var0.getKey()), var0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + var2 + "]";
         }
      });
   }

   public JsonElement createMap(Stream<Pair<JsonElement, JsonElement>> var1) {
      JsonObject var2 = new JsonObject();
      var1.forEach(var1x -> var2.add(((JsonElement)var1x.getFirst()).getAsString(), (JsonElement)var1x.getSecond()));
      return var2;
   }

   public DataResult<Stream<JsonElement>> getStream(JsonElement var1) {
      return var1 instanceof JsonArray
         ? DataResult.success(
            StreamSupport.stream(var1.getAsJsonArray().spliterator(), false).map(var0 -> (JsonElement)(var0 instanceof JsonNull ? null : var0))
         )
         : DataResult.error(() -> "Not a json array: " + var1);
   }

   public DataResult<Consumer<Consumer<JsonElement>>> getList(JsonElement var1) {
      return var1 instanceof JsonArray ? DataResult.success(var1x -> {
         for (JsonElement var3 : var1.getAsJsonArray()) {
            var1x.accept(var3 instanceof JsonNull ? null : var3);
         }
      }) : DataResult.error(() -> "Not a json array: " + var1);
   }

   public JsonElement createList(Stream<JsonElement> var1) {
      JsonArray var2 = new JsonArray();
      var1.forEach(var2::add);
      return var2;
   }

   public JsonElement remove(JsonElement var1, String var2) {
      if (var1 instanceof JsonObject) {
         JsonObject var3 = new JsonObject();
         var1.getAsJsonObject()
            .entrySet()
            .stream()
            .filter(var1x -> !Objects.equals(var1x.getKey(), var2))
            .forEach(var1x -> var3.add(var1x.getKey(), var1x.getValue()));
         return var3;
      } else {
         return var1;
      }
   }

   @Override
   public String toString() {
      return "JSON";
   }

   @Override
   public ListBuilder<JsonElement> listBuilder() {
      return new JsonOps.ArrayBuilder();
   }

   @Override
   public boolean compressMaps() {
      return this.compressed;
   }

   @Override
   public RecordBuilder<JsonElement> mapBuilder() {
      return new JsonOps.JsonRecordBuilder();
   }

   private static final class ArrayBuilder implements ListBuilder<JsonElement> {
      private DataResult<JsonArray> builder = DataResult.success(new JsonArray(), Lifecycle.stable());

      @Override
      public DynamicOps<JsonElement> ops() {
         return JsonOps.INSTANCE;
      }

      public ListBuilder<JsonElement> add(JsonElement var1) {
         this.builder = this.builder.map(var1x -> {
            var1x.add(var1);
            return (JsonArray)var1x;
         });
         return this;
      }

      @Override
      public ListBuilder<JsonElement> add(DataResult<JsonElement> var1) {
         this.builder = this.builder.apply2stable((var0, var1x) -> {
            var0.add(var1x);
            return var0;
         }, var1);
         return this;
      }

      @Override
      public ListBuilder<JsonElement> withErrorsFrom(DataResult<?> var1) {
         this.builder = this.builder.flatMap(var1x -> var1.map(var1xx -> var1x));
         return this;
      }

      @Override
      public ListBuilder<JsonElement> mapError(UnaryOperator<String> var1) {
         this.builder = this.builder.mapError(var1);
         return this;
      }

      public DataResult<JsonElement> build(JsonElement var1) {
         DataResult var2 = this.builder.flatMap(var2x -> {
            if (!(var1 instanceof JsonArray) && var1 != this.ops().empty()) {
               return DataResult.error(() -> "Cannot append a list to not a list: " + var1, var1);
            }

            JsonArray var3 = new JsonArray();
            if (var1 != this.ops().empty()) {
               var3.addAll(var1.getAsJsonArray());
            }

            var3.addAll(var2x);
            return DataResult.success(var3, Lifecycle.stable());
         });
         this.builder = DataResult.success(new JsonArray(), Lifecycle.stable());
         return var2;
      }
   }

   private class JsonRecordBuilder extends RecordBuilder.AbstractStringBuilder<JsonElement, JsonObject> {
      protected JsonRecordBuilder() {
         super(JsonOps.this);
      }

      protected JsonObject initBuilder() {
         return new JsonObject();
      }

      protected JsonObject append(String var1, JsonElement var2, JsonObject var3) {
         var3.add(var1, var2);
         return var3;
      }

      protected DataResult<JsonElement> build(JsonObject var1, JsonElement var2) {
         if (var2 == null || var2 instanceof JsonNull) {
            return DataResult.success(var1);
         }

         if (!(var2 instanceof JsonObject)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + var2, var2);
         }

         JsonObject var3 = new JsonObject();

         for (Entry var5 : var2.getAsJsonObject().entrySet()) {
            var3.add((String)var5.getKey(), (JsonElement)var5.getValue());
         }

         for (Entry var7 : var1.entrySet()) {
            var3.add((String)var7.getKey(), (JsonElement)var7.getValue());
         }

         return DataResult.success(var3);
      }
   }
}
