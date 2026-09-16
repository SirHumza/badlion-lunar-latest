package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.text.BlockNBTComponent;

final class BlockNBTComponentPosSerializer extends TypeAdapter<BlockNBTComponent.Pos> {
   static final TypeAdapter<BlockNBTComponent.Pos> INSTANCE = new BlockNBTComponentPosSerializer().nullSafe();

   private BlockNBTComponentPosSerializer() {
   }

   public BlockNBTComponent.Pos read(JsonReader var1) {
      String var2 = var1.nextString();

      try {
         return BlockNBTComponent.Pos.fromString(var2);
      } catch (IllegalArgumentException var4) {
         throw new JsonParseException("Don't know how to turn " + var2 + " into a Position");
      }
   }

   public void write(JsonWriter var1, BlockNBTComponent.Pos var2) {
      var1.value(var2.asString());
   }
}
