package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.format.ShadowColor;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;

final class ShadowColorSerializer extends TypeAdapter<ShadowColor> {
   private final boolean emitArray;

   static TypeAdapter<ShadowColor> create(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0) {
      return new ShadowColorSerializer(var0.value(JSONOptions.SHADOW_COLOR_MODE) == JSONOptions.ShadowColorEmitMode.EMIT_ARRAY).nullSafe();
   }

   private ShadowColorSerializer(boolean var1) {
      this.emitArray = var1;
   }

   public void write(JsonWriter var1, ShadowColor var2) {
      if (this.emitArray) {
         var1.beginArray()
            .value((double)componentAsFloat(var2.red()))
            .value((double)componentAsFloat(var2.green()))
            .value((double)componentAsFloat(var2.blue()))
            .value((double)componentAsFloat(var2.alpha()))
            .endArray();
      } else {
         var1.value(var2.value());
      }
   }

   public ShadowColor read(JsonReader var1) {
      if (var1.peek() == JsonToken.BEGIN_ARRAY) {
         var1.beginArray();
         double var2 = var1.nextDouble();
         double var4 = var1.nextDouble();
         double var6 = var1.nextDouble();
         double var8 = var1.nextDouble();
         if (var1.peek() != JsonToken.END_ARRAY) {
            throw new JsonParseException(
               "Failed to parse shadow colour at " + var1.getPath() + ": expected end of 4-element array but got " + var1.peek() + " instead."
            );
         }

         var1.endArray();
         return ShadowColor.shadowColor(componentFromFloat(var2), componentFromFloat(var4), componentFromFloat(var6), componentFromFloat(var8));
      } else {
         return ShadowColor.shadowColor(var1.nextInt());
      }
   }

   static float componentAsFloat(int var0) {
      return var0 / 255.0F;
   }

   static int componentFromFloat(double var0) {
      return (int)((float)var0 * 255.0F);
   }
}
