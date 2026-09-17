package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.TypeAdapter;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;

final class HoverEventActionSerializer {
   static final TypeAdapter<HoverEvent.Action<?>> INSTANCE = IndexedSerializer.lenient("hover action", HoverEvent.Action.NAMES);

   private HoverEventActionSerializer() {
   }
}
