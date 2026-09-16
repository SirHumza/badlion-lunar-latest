package com.lunarclient.adventure.utils;

import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class ComponentType<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> {
   public static final ComponentType<? extends BuildableComponent<?, ?>, ? extends ComponentBuilder<?, ?>> COMPONENT = new ComponentType(null);
   public static final ComponentType<TextComponent, TextComponent.Builder> TEXT = new ComponentType((Class<B>)TextComponent.Builder.class);
   public static final ComponentType<TranslatableComponent, TranslatableComponent.Builder> TRANSLATABLE = new ComponentType(
      (Class<B>)TranslatableComponent.Builder.class
   );
   @Nullable
   private final Class<B> clazz;

   @Nullable
   @Generated
   public Class<B> getClazz() {
      return this.clazz;
   }

   @Generated
   public ComponentType(@Nullable Class<B> var1) {
      this.clazz = var1;
   }
}
