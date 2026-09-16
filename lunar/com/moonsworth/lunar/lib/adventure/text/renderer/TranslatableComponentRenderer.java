package com.moonsworth.lunar.lib.adventure.text.renderer;

import com.moonsworth.lunar.lib.adventure.text.BlockNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.EntityNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.NBTComponent;
import com.moonsworth.lunar.lib.adventure.text.NBTComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.ScoreComponent;
import com.moonsworth.lunar.lib.adventure.text.SelectorComponent;
import com.moonsworth.lunar.lib.adventure.text.StorageNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslationArgument;
import com.moonsworth.lunar.lib.adventure.text.VirtualComponent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.translation.Translator;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import java.text.AttributedCharacterIterator;
import java.text.MessageFormat;
import java.text.MessageFormat.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class TranslatableComponentRenderer<C> extends AbstractComponentRenderer<C> {
   private static final Set<Style.Merge> MERGES;

   @NotNull
   public static TranslatableComponentRenderer<Locale> usingTranslationSource(@NotNull final Translator var0) {
      Objects.requireNonNull(var0, "source");
      return new TranslatableComponentRenderer<Locale>() {
         @Nullable
         protected MessageFormat translate(@NotNull String var1, @NotNull Locale var2) {
            return var0.translate(var1, var2);
         }

         @NotNull
         protected Component renderTranslatableInner(@NotNull TranslatableComponent var1, @NotNull Locale var2) {
            TriState var3 = var0.hasAnyTranslations();
            if (var3 == TriState.FALSE) {
               return var1;
            }

            Component var4;
            if (var0.canTranslate(var1.key(), var2)) {
               var4 = var0.translate(var1, var2);
            } else {
               var4 = null;
            }

            return var4 != null ? this.render(var4, var2) : super.renderTranslatableInner(var1, var2);
         }
      };
   }

   @Nullable
   protected MessageFormat translate(@NotNull String var1, @NotNull C var2) {
      return null;
   }

   @Nullable
   protected MessageFormat translate(@NotNull String var1, @Nullable String var2, @NotNull C var3) {
      return this.translate(var1, (C)var3);
   }

   @NotNull
   @Override
   protected Component renderBlockNbt(@NotNull BlockNBTComponent var1, @NotNull C var2) {
      BlockNBTComponent.Builder var3 = ((BlockNBTComponent.Builder)this.nbt((C)var2, Component.blockNBT(), var1)).pos(var1.pos());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   @NotNull
   @Override
   protected Component renderEntityNbt(@NotNull EntityNBTComponent var1, @NotNull C var2) {
      EntityNBTComponent.Builder var3 = ((EntityNBTComponent.Builder)this.nbt((C)var2, Component.entityNBT(), var1)).selector(var1.selector());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   @NotNull
   @Override
   protected Component renderStorageNbt(@NotNull StorageNBTComponent var1, @NotNull C var2) {
      StorageNBTComponent.Builder var3 = ((StorageNBTComponent.Builder)this.nbt((C)var2, Component.storageNBT(), var1)).storage(var1.storage());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   protected <O extends NBTComponent<O, B>, B extends NBTComponentBuilder<O, B>> B nbt(@NotNull C var1, B var2, O var3) {
      var2.nbtPath(var3.nbtPath()).interpret(var3.interpret());
      Component var4 = var3.separator();
      if (var4 != null) {
         var2.separator(this.render(var4, (C)var1));
      }

      return (B)var2;
   }

   @NotNull
   @Override
   protected Component renderKeybind(@NotNull KeybindComponent var1, @NotNull C var2) {
      KeybindComponent.Builder var3 = Component.keybind().keybind(var1.keybind());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   @NotNull
   @Override
   protected Component renderScore(@NotNull ScoreComponent var1, @NotNull C var2) {
      ScoreComponent.Builder var3 = Component.score().name(var1.name()).objective(var1.objective()).value(var1.value());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   @NotNull
   @Override
   protected Component renderSelector(@NotNull SelectorComponent var1, @NotNull C var2) {
      SelectorComponent.Builder var3 = Component.selector().pattern(var1.pattern());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   @NotNull
   @Override
   protected Component renderText(@NotNull TextComponent var1, @NotNull C var2) {
      TextComponent.Builder var3 = Component.text().content(var1.content());
      return this.mergeStyleAndOptionallyDeepRender(var1, var3, (C)var2);
   }

   @NotNull
   @Override
   protected Component renderTranslatable(@NotNull TranslatableComponent var1, @NotNull C var2) {
      List var3 = var1.arguments();
      List var4 = var1.children();
      if (!var3.isEmpty() || !var4.isEmpty()) {
         TranslatableComponent.Builder var5 = var1.toBuilder();
         if (!var3.isEmpty()) {
            ArrayList var6 = new ArrayList(var3);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               TranslationArgument var8 = (TranslationArgument)var6.get(var7);
               if (var8.value() instanceof Component && !(var8.value() instanceof VirtualComponent)) {
                  var6.set(var7, TranslationArgument.component(this.render((Component)var8.value(), (C)var2)));
               }
            }

            var5.arguments(var6);
         }

         var1 = var5.build();
      }

      return this.renderTranslatableInner(var1, (C)var2);
   }

   @NotNull
   protected Component renderTranslatableInner(@NotNull TranslatableComponent var1, @NotNull C var2) {
      MessageFormat var3 = this.translate(var1.key(), var1.fallback(), (C)var2);
      if (var3 == null) {
         return this.optionallyRenderChildrenAndStyle(var1, (C)var2);
      }

      List var4 = var1.arguments();
      TextComponent.Builder var5 = Component.text();
      this.mergeStyle(var1, var5, (C)var2);
      if (var4.isEmpty()) {
         var5.content(var3.format((Object[])null, new StringBuffer(), null).toString());
         return this.optionallyRenderChildrenAppendAndBuild(var1.children(), var5, (C)var2);
      }

      Object[] var6 = new Object[var4.size()];
      StringBuffer var7 = var3.format(var6, new StringBuffer(), null);
      AttributedCharacterIterator var8 = var3.formatToCharacterIterator(var6);

      while (var8.getIndex() < var8.getEndIndex()) {
         int var9 = var8.getRunLimit();
         Integer var10 = (Integer)var8.getAttribute(Field.ARGUMENT);
         if (var10 != null) {
            TranslationArgument var11 = (TranslationArgument)var4.get(var10);
            var5.append(var11.asComponent());
         } else {
            var5.append(Component.text(var7.substring(var8.getIndex(), var9)));
         }

         var8.setIndex(var9);
      }

      return this.optionallyRenderChildrenAppendAndBuild(var1.children(), var5, (C)var2);
   }

   protected Component optionallyRenderChildrenAndStyle(Component var1, C var2) {
      HoverEvent var3 = var1.hoverEvent();
      if (var3 != null) {
         var1 = var1.hoverEvent(var3.withRenderedValue(this, (C)var2));
      }

      List var4 = var1.children();
      if (var4.isEmpty()) {
         return var1;
      }

      ArrayList var5 = new ArrayList(var4.size());
      var4.forEach(var3x -> var5.add(this.render(var3x, (C)var2)));
      return var1.children(var5);
   }

   protected <O extends BuildableComponent<O, B>, B extends ComponentBuilder<O, B>> O mergeStyleAndOptionallyDeepRender(Component var1, B var2, C var3) {
      this.mergeStyle(var1, (B)var2, (C)var3);
      return this.optionallyRenderChildrenAppendAndBuild(var1.children(), (B)var2, (C)var3);
   }

   protected <O extends BuildableComponent<O, B>, B extends ComponentBuilder<O, B>> O optionallyRenderChildrenAppendAndBuild(
      List<Component> var1, B var2, C var3
   ) {
      if (!var1.isEmpty()) {
         var1.forEach(var3x -> var2.append(this.render(var3x, (C)var3)));
      }

      return (O)var2.build();
   }

   protected <B extends ComponentBuilder<?, ?>> void mergeStyle(Component var1, B var2, C var3) {
      var2.mergeStyle(var1, MERGES);
      var2.clickEvent(var1.clickEvent());
      HoverEvent var4 = var1.hoverEvent();
      if (var4 != null) {
         var2.hoverEvent(var4.withRenderedValue(this, (C)var3));
      }
   }

   static {
      EnumSet var0 = EnumSet.allOf(Style.Merge.class);
      var0.remove(Style.Merge.EVENTS);
      MERGES = Collections.unmodifiableSet(var0);
   }
}
