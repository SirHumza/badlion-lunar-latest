package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.text.object.PlayerHeadObjectContents;

final class ProfilePropertySerializer extends TypeAdapter<PlayerHeadObjectContents.ProfileProperty> {
   static final TypeAdapter<PlayerHeadObjectContents.ProfileProperty> INSTANCE = new ProfilePropertySerializer().nullSafe();

   private ProfilePropertySerializer() {
   }

   public void write(JsonWriter var1, PlayerHeadObjectContents.ProfileProperty var2) {
      var1.beginObject();
      var1.name("name");
      var1.value(var2.name());
      var1.name("value");
      var1.value(var2.value());
      if (var2.signature() != null) {
         var1.name("signature");
         var1.value(var2.signature());
      }

      var1.endObject();
   }

   public PlayerHeadObjectContents.ProfileProperty read(JsonReader var1) {
      var1.beginObject();
      String var2 = null;
      String var3 = null;
      String var4 = null;

      while (var1.hasNext()) {
         String var5 = var1.nextName();
         if (var5.equals("name")) {
            var2 = var1.nextString();
         } else if (var5.equals("value")) {
            var3 = var1.nextString();
         } else if (var5.equals("signature")) {
            var4 = var1.nextString();
         } else {
            var1.skipValue();
         }
      }

      var1.endObject();
      if (var2 != null && var3 != null) {
         return PlayerHeadObjectContents.property(var2, var3, var4);
      } else {
         throw new JsonParseException("A profile property requires both a name and value");
      }
   }
}
