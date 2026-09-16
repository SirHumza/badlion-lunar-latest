package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.BlockNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TranslationArgument;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.ShadowColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.object.PlayerHeadObjectContents;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

final class SerializerFactory implements TypeAdapterFactory {
   static final Class<Key> KEY_TYPE = Key.class;
   static final Class<Component> COMPONENT_TYPE = Component.class;
   static final Class<Style> STYLE_TYPE = Style.class;
   static final Class<ClickEvent.Action> CLICK_ACTION_TYPE = ClickEvent.Action.class;
   static final Class<HoverEvent.Action> HOVER_ACTION_TYPE = HoverEvent.Action.class;
   static final Class<HoverEvent.ShowItem> SHOW_ITEM_TYPE = HoverEvent.ShowItem.class;
   static final Class<HoverEvent.ShowEntity> SHOW_ENTITY_TYPE = HoverEvent.ShowEntity.class;
   static final Class<String> STRING_TYPE = String.class;
   static final Class<TextColorWrapper> COLOR_WRAPPER_TYPE = TextColorWrapper.class;
   static final Class<TextColor> COLOR_TYPE = TextColor.class;
   static final Class<ShadowColor> SHADOW_COLOR_TYPE = ShadowColor.class;
   static final Class<TextDecoration> TEXT_DECORATION_TYPE = TextDecoration.class;
   static final Class<BlockNBTComponent.Pos> BLOCK_NBT_POS_TYPE = BlockNBTComponent.Pos.class;
   static final Class<UUID> UUID_TYPE = UUID.class;
   static final Class<TranslationArgument> TRANSLATION_ARGUMENT_TYPE = TranslationArgument.class;
   static final Class<PlayerHeadObjectContents.ProfileProperty> PROFILE_PROPERTY_TYPE = PlayerHeadObjectContents.ProfileProperty.class;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO features;
   private final com.moonsworth.lunar.lib.adventure.text.serializer.json.LegacyHoverEventSerializer legacyHoverSerializer;

   SerializerFactory(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, @Nullable LegacyHoverEventSerializer var2) {
      this.features = var1;
      this.legacyHoverSerializer = var2;
   }

   @Override
   public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
      Class var3 = var2.getRawType();
      if (COMPONENT_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)ComponentSerializerImpl.create(this.features, var1);
      } else if (KEY_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)KeySerializer.INSTANCE;
      } else if (STYLE_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)StyleSerializer.create(this.legacyHoverSerializer, this.features, var1);
      } else if (CLICK_ACTION_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)ClickEventActionSerializer.INSTANCE;
      } else if (HOVER_ACTION_TYPE.isAssignableFrom(var3)) {
         return HoverEventActionSerializer.INSTANCE;
      } else if (SHOW_ITEM_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)ShowItemSerializer.create(var1, this.features);
      } else if (SHOW_ENTITY_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)ShowEntitySerializer.create(var1, this.features);
      } else if (COLOR_WRAPPER_TYPE.isAssignableFrom(var3)) {
         return TextColorWrapper.Serializer.INSTANCE;
      } else if (COLOR_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)(this.features.value(JSONOptions.EMIT_RGB) ? TextColorSerializer.INSTANCE : TextColorSerializer.DOWNSAMPLE_COLOR);
      } else if (SHADOW_COLOR_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)ShadowColorSerializer.create(this.features);
      } else if (TEXT_DECORATION_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)TextDecorationSerializer.INSTANCE;
      } else if (BLOCK_NBT_POS_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)BlockNBTComponentPosSerializer.INSTANCE;
      } else if (UUID_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)UUIDSerializer.uuidSerializer(this.features);
      } else if (TRANSLATION_ARGUMENT_TYPE.isAssignableFrom(var3)) {
         return (TypeAdapter<T>)TranslationArgumentSerializer.create(var1);
      } else {
         return (TypeAdapter<T>)(PROFILE_PROPERTY_TYPE.isAssignableFrom(var3) ? ProfilePropertySerializer.INSTANCE : null);
      }
   }
}
