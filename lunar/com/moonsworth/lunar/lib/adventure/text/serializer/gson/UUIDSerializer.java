package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import java.util.UUID;

final class UUIDSerializer extends TypeAdapter<UUID> {
   private final boolean emitIntArray;

   static TypeAdapter<UUID> uuidSerializer(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0) {
      return new UUIDSerializer(var0.value(JSONOptions.EMIT_HOVER_SHOW_ENTITY_ID_AS_INT_ARRAY)).nullSafe();
   }

   private UUIDSerializer(boolean var1) {
      this.emitIntArray = var1;
   }

   public void write(JsonWriter var1, UUID var2) {
      if (this.emitIntArray) {
         int var3 = (int)(var2.getMostSignificantBits() >> 32);
         int var4 = (int)(var2.getMostSignificantBits() & 4294967295L);
         int var5 = (int)(var2.getLeastSignificantBits() >> 32);
         int var6 = (int)(var2.getLeastSignificantBits() & 4294967295L);
         var1.beginArray().value(var3).value(var4).value(var5).value(var6).endArray();
      } else {
         var1.value(var2.toString());
      }
   }

   public UUID read(JsonReader var1) {
      if (var1.peek() == JsonToken.BEGIN_ARRAY) {
         var1.beginArray();
         int var2 = var1.nextInt();
         int var3 = var1.nextInt();
         int var4 = var1.nextInt();
         int var5 = var1.nextInt();
         var1.endArray();
         return new UUID((long)var2 << 32 | var3 & 4294967295L, (long)var4 << 32 | var5 & 4294967295L);
      } else {
         return UUID.fromString(var1.nextString());
      }
   }
}
