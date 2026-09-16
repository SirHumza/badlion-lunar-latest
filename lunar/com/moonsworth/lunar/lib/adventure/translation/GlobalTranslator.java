package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.renderer.TranslatableComponentRenderer;
import java.util.Locale;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface GlobalTranslator extends Translator, Examinable {
   @NotNull
   static GlobalTranslator translator() {
      return GlobalTranslatorImpl.INSTANCE;
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @NotNull
   static GlobalTranslator get() {
      return GlobalTranslatorImpl.INSTANCE;
   }

   @NotNull
   static TranslatableComponentRenderer<Locale> renderer() {
      return GlobalTranslatorImpl.INSTANCE.renderer;
   }

   @NotNull
   static Component render(@NotNull Component var0, @NotNull Locale var1) {
      return renderer().render(var0, var1);
   }

   @NotNull
   Iterable<? extends Translator> sources();

   boolean addSource(@NotNull Translator var1);

   boolean removeSource(@NotNull Translator var1);
}
