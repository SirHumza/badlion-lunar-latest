package com.moonsworth.lunar.lib.adventure.text.serializer.ansi;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.flattener.FlattenerListener;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.util.Services;
import java.util.Optional;
import java.util.function.Consumer;
import net.kyori.ansi.ANSIComponentRenderer;
import net.kyori.ansi.ColorLevel;
import net.kyori.ansi.StyleOps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

final class ANSIComponentSerializerImpl implements ANSIComponentSerializer {
   private static final Optional<ANSIComponentSerializer.Provider> SERVICE = Services.service(ANSIComponentSerializer.Provider.class);
   static final Consumer<ANSIComponentSerializer.Builder> BUILDER = SERVICE.map(ANSIComponentSerializer.Provider::builder).orElseGet(() -> var0 -> {});
   final ColorLevel colorLevel;
   final ComponentFlattener flattener;

   ANSIComponentSerializerImpl(ColorLevel var1, ComponentFlattener var2) {
      this.colorLevel = var1;
      this.flattener = var2;
   }

   @NotNull
   public String serialize(@NotNull Component var1) {
      ANSIComponentRenderer.ToString var2 = ANSIComponentRenderer.toString(ANSIComponentSerializerImpl.ComponentStyleOps.INSTANCE, this.colorLevel);
      this.flattener.flatten(var1, new ANSIComponentSerializerImpl.ANSIFlattenerListener(var2));
      var2.complete();
      return var2.asString();
   }

   static StyleOps.State mapState(TextDecoration.State var0) {
      switch (var0) {
         case NOT_SET:
            return StyleOps.State.UNSET;
         case FALSE:
            return StyleOps.State.FALSE;
         case TRUE:
            return StyleOps.State.TRUE;
         default:
            throw new IllegalStateException("Decoration state is not valid");
      }
   }

   static class ANSIFlattenerListener implements FlattenerListener {
      private final ANSIComponentRenderer<Style> renderer;

      ANSIFlattenerListener(ANSIComponentRenderer<Style> var1) {
         this.renderer = var1;
      }

      @Override
      public void pushStyle(@NotNull Style var1) {
         this.renderer.pushStyle(var1);
      }

      @Override
      public void component(@NotNull String var1) {
         this.renderer.text(var1);
      }

      @Override
      public void popStyle(@NotNull Style var1) {
         this.renderer.popStyle(var1);
      }
   }

   static final class BuilderImpl implements ANSIComponentSerializer.Builder {
      private ColorLevel colorLevel = ColorLevel.compute();
      private ComponentFlattener flattener = ComponentFlattener.basic();

      BuilderImpl() {
         ANSIComponentSerializerImpl.BUILDER.accept(this);
      }

      @NotNull
      @Override
      public ANSIComponentSerializer.Builder colorLevel(@NotNull ColorLevel var1) {
         this.colorLevel = var1;
         return this;
      }

      @NotNull
      @Override
      public ANSIComponentSerializer.Builder flattener(@NotNull ComponentFlattener var1) {
         this.flattener = var1;
         return this;
      }

      @NotNull
      @Override
      public ANSIComponentSerializer build() {
         return new ANSIComponentSerializerImpl(this.colorLevel, this.flattener);
      }
   }

   static class ComponentStyleOps implements StyleOps<Style> {
      static final ANSIComponentSerializerImpl.ComponentStyleOps INSTANCE = new ANSIComponentSerializerImpl.ComponentStyleOps();

      public StyleOps.State bold(@NotNull Style var1) {
         return ANSIComponentSerializerImpl.mapState(var1.decoration(TextDecoration.BOLD));
      }

      public StyleOps.State italics(@NotNull Style var1) {
         return ANSIComponentSerializerImpl.mapState(var1.decoration(TextDecoration.ITALIC));
      }

      public StyleOps.State underlined(@NotNull Style var1) {
         return ANSIComponentSerializerImpl.mapState(var1.decoration(TextDecoration.UNDERLINED));
      }

      public StyleOps.State strikethrough(@NotNull Style var1) {
         return ANSIComponentSerializerImpl.mapState(var1.decoration(TextDecoration.STRIKETHROUGH));
      }

      public StyleOps.State obfuscated(@NotNull Style var1) {
         return ANSIComponentSerializerImpl.mapState(var1.decoration(TextDecoration.OBFUSCATED));
      }

      public @Range(from = -1L, to = 16777215L) int color(@NotNull Style var1) {
         TextColor var2 = var1.color();
         return var2 == null ? -1 : var2.value();
      }

      @Nullable
      public String font(@NotNull Style var1) {
         Key var2 = var1.font();
         return var2 == null ? null : var2.asString();
      }
   }

   static final class Instances {
      static final ANSIComponentSerializer INSTANCE = ANSIComponentSerializerImpl.SERVICE
         .map(ANSIComponentSerializer.Provider::ansi)
         .orElseGet(() -> new ANSIComponentSerializerImpl(ColorLevel.compute(), ComponentFlattener.basic()));
   }
}
