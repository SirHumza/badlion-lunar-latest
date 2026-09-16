package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.TypeAdapter;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;

final class TextDecorationSerializer {
   static final TypeAdapter<TextDecoration> INSTANCE = IndexedSerializer.strict("text decoration", TextDecoration.NAMES);

   private TextDecorationSerializer() {
   }
}
