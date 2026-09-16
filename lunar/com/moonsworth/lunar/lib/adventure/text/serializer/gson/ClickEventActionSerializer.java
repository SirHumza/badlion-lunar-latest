package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.TypeAdapter;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;

final class ClickEventActionSerializer {
   static final TypeAdapter<ClickEvent.Action> INSTANCE = IndexedSerializer.lenient("click action", ClickEvent.Action.NAMES);

   private ClickEventActionSerializer() {
   }
}
