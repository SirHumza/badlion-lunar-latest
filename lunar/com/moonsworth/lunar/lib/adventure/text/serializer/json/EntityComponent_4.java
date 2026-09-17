package com.moonsworth.lunar.lib.adventure.text.serializer.json;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.util.Codec;
import org.jetbrains.annotations.NotNull;

public interface LegacyHoverEventSerializer {
   HoverEvent.@NotNull ShowItem deserializeShowItem(@NotNull Component var1);

   @NotNull
   Component serializeShowItem(HoverEvent.@NotNull ShowItem var1);

   HoverEvent.@NotNull ShowEntity deserializeShowEntity(@NotNull Component var1, Codec.Decoder<Component, String, ? extends RuntimeException> var2);

   @NotNull
   Component serializeShowEntity(HoverEvent.@NotNull ShowEntity var1, Codec.Encoder<Component, String, ? extends RuntimeException> var2);
}
