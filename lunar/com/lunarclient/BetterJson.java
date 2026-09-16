package com.lunarclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class BetterJson {
   private final JsonElement wrappedElm;

   public BetterJson(JsonElement var1) {
      this.wrappedElm = var1;
   }

   public BetterJson get(String var1) {
      return this.wrappedElm != null && this.wrappedElm.isJsonObject() ? new BetterJson(this.wrappedElm.getAsJsonObject().get(var1)) : new BetterJson(null);
   }

   public BetterJson get(int var1) {
      return this.wrappedElm != null && this.wrappedElm.isJsonArray() ? new BetterJson(this.wrappedElm.getAsJsonArray().get(var1)) : new BetterJson(null);
   }

   public Optional<JsonElement> asJsonElement() {
      return Optional.ofNullable(this.wrappedElm);
   }

   public Optional<JsonObject> asJsonObject() {
      return this.asJsonElement().filter(JsonElement::isJsonObject).map(JsonElement::getAsJsonObject);
   }

   public Optional<JsonArray> asJsonArray() {
      return this.asJsonElement().filter(JsonElement::isJsonArray).map(JsonElement::getAsJsonArray);
   }

   public Optional<JsonPrimitive> asJsonPrimitive() {
      return this.asJsonElement().filter(JsonElement::isJsonPrimitive).map(JsonElement::getAsJsonPrimitive);
   }

   public Optional<Number> asNumber() {
      return this.asJsonElement()
         .filter(JsonElement::isJsonPrimitive)
         .map(JsonElement::getAsJsonPrimitive)
         .filter(JsonPrimitive::isNumber)
         .map(JsonPrimitive::getAsNumber);
   }

   public Optional<Float> asFloat() {
      return this.asNumber().map(Number::floatValue);
   }

   public Optional<Double> asDouble() {
      return this.asNumber().map(Number::doubleValue);
   }

   public Optional<Integer> asInt() {
      return this.asNumber().map(Number::intValue);
   }

   public Optional<Long> asLong() {
      return this.asNumber().map(Number::longValue);
   }

   public Optional<String> asString() {
      return this.asJsonPrimitive().filter(JsonPrimitive::isString).map(JsonPrimitive::getAsString);
   }

   public Optional<Boolean> asBool() {
      return this.asJsonPrimitive().filter(JsonPrimitive::isBoolean).map(JsonPrimitive::getAsBoolean);
   }

   public SafeMap<BetterJson> asMap() {
      return this.asMap(var0 -> var0);
   }

   public <T> SafeMap<T> asMap(Function<BetterJson, T> var1) {
      HashMap var2 = new HashMap();
      JsonObject var3 = this.asJsonObject().orElse(null);
      if (var3 != null) {
         for (Entry var5 : var3.entrySet()) {
            var2.put((String)var5.getKey(), new BetterJson((JsonElement)var5.getValue()));
         }
      }

      return new SafeMap<>(var2, var1);
   }

   public <T> Map<String, T> asMapOpt(Function<BetterJson, Optional<T>> var1) {
      HashMap var2 = new HashMap();
      JsonObject var3 = this.asJsonObject().orElse(null);
      if (var3 != null) {
         for (Entry var5 : var3.entrySet()) {
            Optional var6 = (Optional)var1.apply(new BetterJson((JsonElement)var5.getValue()));
            var6.ifPresent(var2x -> var2.put((String)var5.getKey(), var2x));
         }
      }

      return var2;
   }

   public SafeList<BetterJson> asList() {
      return this.asList(var0 -> var0);
   }

   public <T> SafeList<T> asList(Function<BetterJson, T> var1) {
      ArrayList var2 = new ArrayList();
      JsonArray var3 = this.asJsonArray().orElse(null);
      if (var3 != null) {
         for (JsonElement var5 : var3) {
            var2.add(new BetterJson(var5));
         }
      }

      return new SafeList<>(var2, var1);
   }

   public <T> List<T> asListOpt(Function<BetterJson, Optional<T>> var1) {
      ArrayList var2 = new ArrayList();
      JsonArray var3 = this.asJsonArray().orElse(null);
      if (var3 != null) {
         for (JsonElement var5 : var3) {
            ((Optional)var1.apply(new BetterJson(var5))).ifPresent(var2::add);
         }
      }

      return var2;
   }

   public boolean exists() {
      return this.wrappedElm != null;
   }
}
