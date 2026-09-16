package com.moonsworth.lunar.lib.adventure.text.serializer.legacy;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.serializer.ComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LegacyComponentSerializer
   extends ComponentSerializer<Component, TextComponent, String>,
   Buildable<LegacyComponentSerializer, LegacyComponentSerializer.Builder> {
   char SECTION_CHAR = '§';
   char AMPERSAND_CHAR = '&';
   char HEX_CHAR = '#';

   @NotNull
   static LegacyComponentSerializer legacySection() {
      return LegacyComponentSerializerImpl.Instances.SECTION;
   }

   @NotNull
   static LegacyComponentSerializer legacyAmpersand() {
      return LegacyComponentSerializerImpl.Instances.AMPERSAND;
   }

   @NotNull
   static LegacyComponentSerializer legacy(char var0) {
      if (var0 == 167) {
         return legacySection();
      } else {
         return var0 == '&' ? legacyAmpersand() : builder().character(var0).build();
      }
   }

   @Nullable
   static LegacyFormat parseChar(char var0) {
      return LegacyComponentSerializerImpl.legacyFormat(var0);
   }

   @NotNull
   static LegacyComponentSerializer.Builder builder() {
      return new LegacyComponentSerializerImpl.BuilderImpl();
   }

   @NotNull
   TextComponent deserialize(@NotNull String var1);

   @NotNull
   String serialize(@NotNull Component var1);

   interface Builder extends AbstractBuilder<LegacyComponentSerializer>, Buildable.Builder<LegacyComponentSerializer> {
      @NotNull
      LegacyComponentSerializer.Builder character(char var1);

      @NotNull
      LegacyComponentSerializer.Builder hexCharacter(char var1);

      @NotNull
      LegacyComponentSerializer.Builder extractUrls();

      @NotNull
      LegacyComponentSerializer.Builder extractUrls(@NotNull Pattern var1);

      @NotNull
      LegacyComponentSerializer.Builder extractUrls(@Nullable Style var1);

      @NotNull
      LegacyComponentSerializer.Builder extractUrls(@NotNull Pattern var1, @Nullable Style var2);

      @NotNull
      LegacyComponentSerializer.Builder hexColors();

      @NotNull
      LegacyComponentSerializer.Builder useUnusualXRepeatedCharacterHexFormat();

      @NotNull
      LegacyComponentSerializer.Builder flattener(@NotNull ComponentFlattener var1);

      @NotNull
      LegacyComponentSerializer.Builder formats(@NotNull List<CharacterAndFormat> var1);

      @NotNull
      LegacyComponentSerializer build();
   }

   @PlatformAPI
   @ApiStatus.Internal
   interface Provider {
      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      LegacyComponentSerializer legacyAmpersand();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      LegacyComponentSerializer legacySection();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      Consumer<LegacyComponentSerializer.Builder> legacy();
   }
}
