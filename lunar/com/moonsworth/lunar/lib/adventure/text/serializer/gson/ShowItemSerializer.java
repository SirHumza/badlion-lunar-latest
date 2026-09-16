package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import com.moonsworth.lunar.lib.adventure.text.event.DataComponentValue;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class ShowItemSerializer extends TypeAdapter<HoverEvent.ShowItem> {
   private static final String LEGACY_SHOW_ITEM_TAG = "tag";
   private static final String DATA_COMPONENT_REMOVAL_PREFIX = "!";
   private final Gson gson;
   private final boolean emitDefaultQuantity;
   private final JSONOptions.ShowItemHoverDataMode itemDataMode;

   static TypeAdapter<HoverEvent.ShowItem> create(Gson var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return new ShowItemSerializer(var0, var1.value(JSONOptions.EMIT_DEFAULT_ITEM_HOVER_QUANTITY), var1.value(JSONOptions.SHOW_ITEM_HOVER_DATA_MODE))
         .nullSafe();
   }

   private ShowItemSerializer(Gson var1, boolean var2, JSONOptions.ShowItemHoverDataMode var3) {
      this.gson = var1;
      this.emitDefaultQuantity = var2;
      this.itemDataMode = var3;
   }

   public HoverEvent.ShowItem read(JsonReader var1) {
      var1.beginObject();
      Key var2 = null;
      int var3 = 1;
      BinaryTagHolder var4 = null;
      HashMap var5 = null;

      while (var1.hasNext()) {
         String var6 = var1.nextName();
         if (var6.equals("id")) {
            var2 = this.gson.fromJson(var1, SerializerFactory.KEY_TYPE);
         } else if (var6.equals("count")) {
            var3 = var1.nextInt();
         } else if (var6.equals("tag")) {
            JsonToken var11 = var1.peek();
            if (var11 == JsonToken.STRING || var11 == JsonToken.NUMBER) {
               var4 = BinaryTagHolder.binaryTagHolder(var1.nextString());
            } else if (var11 == JsonToken.BOOLEAN) {
               var4 = BinaryTagHolder.binaryTagHolder(String.valueOf(var1.nextBoolean()));
            } else {
               if (var11 != JsonToken.NULL) {
                  throw new JsonParseException("Expected tag to be a string");
               }

               var1.nextNull();
            }
         } else if (!var6.equals("components")) {
            var1.skipValue();
         } else {
            var1.beginObject();

            while (var1.peek() != JsonToken.END_OBJECT) {
               String var7 = var1.nextName();
               Key var8;
               boolean var9;
               if (var7.startsWith("!")) {
                  var8 = Key.key(var7.substring(1));
                  var9 = true;
               } else {
                  var8 = Key.key(var7);
                  var9 = false;
               }

               JsonElement var10 = this.gson.fromJson(var1, JsonElement.class);
               if (var5 == null) {
                  var5 = new HashMap();
               }

               var5.put(var8, var9 ? DataComponentValue.removed() : GsonDataComponentValue.gsonDataComponentValue(var10));
            }

            var1.endObject();
         }
      }

      if (var2 == null) {
         throw new JsonParseException("Not sure how to deserialize show_item hover event");
      }

      var1.endObject();
      return var5 != null ? HoverEvent.ShowItem.showItem(var2, var3, var5) : HoverEvent.ShowItem.showItem(var2, var3, var4);
   }

   public void write(JsonWriter var1, HoverEvent.ShowItem var2) {
      var1.beginObject();
      var1.name("id");
      this.gson.toJson(var2.item(), SerializerFactory.KEY_TYPE, var1);
      int var3 = var2.count();
      if (var3 != 1 || this.emitDefaultQuantity) {
         var1.name("count");
         var1.value(var3);
      }

      Map var4 = var2.dataComponents();
      if (!var4.isEmpty() && this.itemDataMode != JSONOptions.ShowItemHoverDataMode.EMIT_LEGACY_NBT) {
         var1.name("components");
         var1.beginObject();

         for (Entry var6 : var2.dataComponentsAs(GsonDataComponentValue.class).entrySet()) {
            JsonElement var7 = ((GsonDataComponentValue)var6.getValue()).element();
            if (var7 instanceof JsonNull) {
               var1.name("!" + ((Key)var6.getKey()).asString());
               var1.beginObject().endObject();
            } else {
               var1.name(((Key)var6.getKey()).asString());
               this.gson.toJson(var7, var1);
            }
         }

         var1.endObject();
      } else if (this.itemDataMode != JSONOptions.ShowItemHoverDataMode.EMIT_DATA_COMPONENTS) {
         maybeWriteLegacy(var1, var2);
      }

      var1.endObject();
   }

   private static void maybeWriteLegacy(JsonWriter var0, HoverEvent.ShowItem var1) {
      BinaryTagHolder var2 = var1.nbt();
      if (var2 != null) {
         var0.name("tag");
         var0.value(var2.string());
      }
   }
}
