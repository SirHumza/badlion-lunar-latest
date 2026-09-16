package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.key.InvalidKeyException;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import java.util.UUID;

final class ShowEntitySerializer extends TypeAdapter<HoverEvent.ShowEntity> {
   private final Gson gson;
   private final boolean emitKeyAsTypeAndUuidAsId;

   static TypeAdapter<HoverEvent.ShowEntity> create(Gson var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return new ShowEntitySerializer(var0, var1.value(JSONOptions.EMIT_HOVER_SHOW_ENTITY_KEY_AS_TYPE_AND_UUID_AS_ID)).nullSafe();
   }

   private ShowEntitySerializer(Gson var1, boolean var2) {
      this.gson = var1;
      this.emitKeyAsTypeAndUuidAsId = var2;
   }

   public HoverEvent.ShowEntity read(JsonReader var1) {
      var1.beginObject();
      Key var2 = null;
      UUID var3 = null;
      Component var4 = null;

      while (var1.hasNext()) {
         String var5 = var1.nextName();
         switch (var5) {
            case "id":
               if (var1.peek() == JsonToken.BEGIN_ARRAY) {
                  var3 = this.gson.fromJson(var1, UUID.class);
               } else {
                  String var8 = var1.nextString();
                  if (var8.contains(":")) {
                     var2 = Key.key(var8);
                  }

                  try {
                     var3 = UUID.fromString(var8);
                  } catch (IllegalArgumentException var12) {
                     try {
                        var2 = Key.key(var8);
                     } catch (InvalidKeyException var11) {
                     }
                  }
               }
               break;
            case "type":
               var2 = this.gson.fromJson(var1, Key.class);
               break;
            case "uuid":
               var3 = this.gson.fromJson(var1, UUID.class);
               break;
            case "name":
               var4 = this.gson.fromJson(var1, SerializerFactory.COMPONENT_TYPE);
               break;
            default:
               var1.skipValue();
         }
      }

      if (var2 != null && var3 != null) {
         var1.endObject();
         return HoverEvent.ShowEntity.showEntity(var2, var3, var4);
      } else {
         throw new JsonParseException("A show entity hover event needs type and id fields to be deserialized");
      }
   }

   public void write(JsonWriter var1, HoverEvent.ShowEntity var2) {
      var1.beginObject();
      var1.name(this.emitKeyAsTypeAndUuidAsId ? "type" : "id");
      this.gson.toJson(var2.type(), SerializerFactory.KEY_TYPE, var1);
      var1.name(this.emitKeyAsTypeAndUuidAsId ? "id" : "uuid");
      this.gson.toJson(var2.id(), SerializerFactory.UUID_TYPE, var1);
      Component var3 = var2.name();
      if (var3 != null) {
         var1.name("name");
         this.gson.toJson(var3, SerializerFactory.COMPONENT_TYPE, var1);
      }

      var1.endObject();
   }
}
