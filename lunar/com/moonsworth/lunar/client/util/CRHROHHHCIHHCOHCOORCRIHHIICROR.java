package com.moonsworth.lunar.client.util;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import lombok.Generated;
import org.apache.commons.lang3.Range;

public class CRHROHHHCIHHCOHCOORCRIHHIICROR {
   public static class CRRRICCRROCOHHOHIICIHORCOORRRH implements JsonSerializer<String> {
      public JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Type var2, JsonSerializationContext var3) {
         return var1 != null && !var1.isEmpty() ? new JsonPrimitive(var1) : null;
      }
   }

   public static class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements JsonSerializer<Set<?>> {
      public JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Set<?> var1, Type var2, JsonSerializationContext var3) {
         if (var1 != null && !var1.isEmpty()) {
            JsonArray var4 = new JsonArray();

            for (Object var6 : var1) {
               JsonElement var7 = var3.serialize(var6);
               var4.add(var7);
            }

            return var4;
         } else {
            return null;
         }
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements JsonSerializer<Map<?, ?>> {
      public JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<?, ?> var1, Type var2, JsonSerializationContext var3) {
         if (var1 != null && !var1.isEmpty()) {
            JsonObject var4 = new JsonObject();

            for (Entry var6 : var1.entrySet()) {
               var4.add(var6.getKey().toString(), var3.serialize(var6.getValue()));
            }

            return var4;
         } else {
            return null;
         }
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements JsonSerializer<List<?>> {
      public JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<?> var1, Type var2, JsonSerializationContext var3) {
         if (var1 != null && !var1.isEmpty()) {
            JsonArray var4 = new JsonArray();

            for (Object var6 : var1) {
               JsonElement var7 = var3.serialize(var6);
               var4.add(var7);
            }

            return var4;
         } else {
            return null;
         }
      }
   }

   public static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements ExclusionStrategy {
      @Override
      public boolean shouldSkipClass(Class<?> var1) {
         return false;
      }

      @Override
      public boolean shouldSkipField(FieldAttributes var1) {
         for (Annotation var5 : var1.getDeclaringClass().getAnnotations()) {
            if (var5 instanceof RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO) {
               return var1.getAnnotations().stream().noneMatch(var0 -> var0 instanceof SerializedName);
            }
         }

         return false;
      }
   }

   public static class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements JsonDeserializer<Range<Integer>> {
      public Range<Integer> RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(JsonElement var1, Type var2, JsonDeserializationContext var3) {
         String var4 = var1.getAsString();
         var4 = var4.substring(1, var4.length() - 1);
         String[] var5 = var4.split("\\.\\.");
         if (var5.length != 2) {
            throw new JsonParseException("Invalid range format: " + var4);
         }

         int var6 = Integer.parseInt(var5[0]);
         int var7 = Integer.parseInt(var5[1]);
         return Range.between(var6, var7);
      }
   }
}
