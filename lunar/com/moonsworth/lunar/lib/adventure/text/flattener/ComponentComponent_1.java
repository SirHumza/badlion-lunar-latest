package com.moonsworth.lunar.lib.adventure.text.flattener;

import com.moonsworth.lunar.lib.adventure.internal.properties.AdventureProperties;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.ObjectComponent;
import com.moonsworth.lunar.lib.adventure.text.ScoreComponent;
import com.moonsworth.lunar.lib.adventure.text.SelectorComponent;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.object.ObjectContents;
import com.moonsworth.lunar.lib.adventure.text.object.PlayerHeadObjectContents;
import com.moonsworth.lunar.lib.adventure.text.object.SpriteObjectContents;
import com.moonsworth.lunar.lib.adventure.util.InheritanceAwareMap;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

final class ComponentFlattenerImpl implements ComponentFlattener {
   static final ComponentFlattener BASIC = new ComponentFlattenerImpl.BuilderImpl()
      .mapper(KeybindComponent.class, var0 -> var0.keybind())
      .mapper(ScoreComponent.class, var0 -> {
         String var1 = var0.value();
         return var1 != null ? var1 : "";
      })
      .mapper(SelectorComponent.class, SelectorComponent::pattern)
      .mapper(TextComponent.class, TextComponent::content)
      .mapper(TranslatableComponent.class, var0 -> {
         String var1 = var0.fallback();
         return var1 != null ? var1 : var0.key();
      })
      .mapper(ObjectComponent.class, var0 -> {
         ObjectContents var1 = var0.contents();
         if (var1 instanceof SpriteObjectContents) {
            SpriteObjectContents var4 = (SpriteObjectContents)var1;
            Key var3 = var4.atlas();
            return "[" + var4.sprite().asMinimalString() + (!var3.equals(SpriteObjectContents.DEFAULT_ATLAS) ? "@" + var3.asMinimalString() : "") + "]";
         } else if (var1 instanceof PlayerHeadObjectContents) {
            PlayerHeadObjectContents var2 = (PlayerHeadObjectContents)var1;
            return "[" + (var2.name() != null ? var2.name() : "unknown player") + " head]";
         } else {
            return "";
         }
      })
      .build();
   static final ComponentFlattener TEXT_ONLY = new ComponentFlattenerImpl.BuilderImpl().mapper(TextComponent.class, TextComponent::content).build();
   private static final int MAX_DEPTH = 512;
   private final InheritanceAwareMap<Component, ComponentFlattenerImpl.Handler> flatteners;
   private final Function<Component, String> unknownHandler;
   private final int maxNestedDepth;

   ComponentFlattenerImpl(InheritanceAwareMap<Component, ComponentFlattenerImpl.Handler> var1, @Nullable Function<Component, String> var2, int var3) {
      this.flatteners = var1;
      this.unknownHandler = var2;
      this.maxNestedDepth = var3;
   }

   @Override
   public void flatten(@NotNull Component var1, @NotNull FlattenerListener var2) {
      this.flatten0(var1, var2, 0, 0);
   }

   private void flatten0(@NotNull Component var1, @NotNull FlattenerListener var2, int var3, int var4) {
      Objects.requireNonNull(var1, "input");
      Objects.requireNonNull(var2, "listener");
      if (var1 != Component.empty()) {
         if (this.maxNestedDepth != -1 && var4 > this.maxNestedDepth) {
            throw new IllegalStateException("Exceeded maximum nesting depth of " + this.maxNestedDepth + " while attempting to flatten components!");
         }

         ArrayDeque var5 = new ArrayDeque();
         ArrayDeque var6 = new ArrayDeque();
         var5.push(new ComponentFlattenerImpl.StackEntry(var1, var3, 1));

         while (!var5.isEmpty()) {
            ComponentFlattenerImpl.StackEntry var7 = (ComponentFlattenerImpl.StackEntry)var5.pop();
            int var8 = var7.depth;
            if (var8 > 512) {
               throw new IllegalStateException("Exceeded maximum depth of 512 while attempting to flatten components!");
            }

            Component var9 = var7.component;
            ComponentFlattenerImpl.Handler var10 = this.flattener(var9);
            Style var11 = var9.style();
            var2.pushStyle(var11);
            var6.push(var11);
            if (var10 != null) {
               var10.handle(this, var9, var2, var8, var4);
            }

            if (!var9.children().isEmpty() && var2.shouldContinue()) {
               List var15 = var9.children();

               for (int var16 = var15.size() - 1; var16 >= 0; var16--) {
                  if (var16 == var15.size() - 1) {
                     var5.push(new ComponentFlattenerImpl.StackEntry((Component)var15.get(var16), var8 + 1, var7.stylesToPop + 1));
                  } else {
                     var5.push(new ComponentFlattenerImpl.StackEntry((Component)var15.get(var16), var8 + 1, 1));
                  }
               }
            } else {
               for (int var12 = var7.stylesToPop; var12 > 0; var12--) {
                  Style var13 = (Style)var6.pop();
                  var2.popStyle(var13);
               }
            }
         }

         while (!var6.isEmpty()) {
            Style var14 = (Style)var6.pop();
            var2.popStyle(var14);
         }
      }
   }

   @Nullable
   private <T extends Component> ComponentFlattenerImpl.Handler flattener(T var1) {
      ComponentFlattenerImpl.Handler var2 = this.flatteners.get((Class<? extends Component>)var1.getClass());
      return var2 == null && this.unknownHandler != null ? (var1x, var2x, var3, var4, var5) -> var3.component(this.unknownHandler.apply(var2x)) : var2;
   }

   public ComponentFlattener.@NotNull Builder toBuilder() {
      return new ComponentFlattenerImpl.BuilderImpl(this.flatteners, this.unknownHandler, this.maxNestedDepth);
   }

   static final class BuilderImpl implements ComponentFlattener.Builder {
      private final InheritanceAwareMap.Builder<Component, ComponentFlattenerImpl.Handler> flatteners;
      @Nullable
      private Function<Component, String> unknownHandler;
      private int maxNestedDepth = AdventureProperties.DEFAULT_FLATTENER_NESTING_LIMIT.valueOr(-1);

      BuilderImpl() {
         this.flatteners = InheritanceAwareMap.<Component, ComponentFlattenerImpl.Handler>builder().strict(true);
      }

      BuilderImpl(InheritanceAwareMap<Component, ComponentFlattenerImpl.Handler> var1, @Nullable Function<Component, String> var2, int var3) {
         this.flatteners = InheritanceAwareMap.<Component, ComponentFlattenerImpl.Handler>builder(var1).strict(true);
         this.unknownHandler = var2;
         this.maxNestedDepth = var3;
      }

      @NotNull
      public ComponentFlattener build() {
         return new ComponentFlattenerImpl(this.flatteners.build(), this.unknownHandler, this.maxNestedDepth);
      }

      @Override
      public <T extends Component> ComponentFlattener.@NotNull Builder mapper(@NotNull Class<T> var1, @NotNull Function<T, String> var2) {
         this.flatteners.put(var1, (var1x, var2x, var3, var4, var5) -> var3.component((String)var2.apply(var2x)));
         return this;
      }

      @Override
      public <T extends Component> ComponentFlattener.@NotNull Builder complexMapper(@NotNull Class<T> var1, @NotNull BiConsumer<T, Consumer<Component>> var2) {
         this.flatteners.put(var1, (var1x, var2x, var3, var4, var5) -> var2.accept(var2x, var4x -> var1x.flatten0(var4x, var3, var4, var5 + 1)));
         return this;
      }

      @Override
      public ComponentFlattener.@NotNull Builder unknownMapper(@Nullable Function<Component, String> var1) {
         this.unknownHandler = var1;
         return this;
      }

      @NotNull
      @Override
      public ComponentFlattener.Builder nestingLimit(@Range(from = 1L, to = 2147483647L) int var1) {
         if (var1 != -1 && var1 < 1) {
            throw new IllegalArgumentException("limit must be positive or ComponentFlattener.NO_NESTING_LIMIT");
         }

         this.maxNestedDepth = var1;
         return this;
      }
   }

   @FunctionalInterface
   interface Handler {
      void handle(ComponentFlattenerImpl var1, Component var2, FlattenerListener var3, int var4, int var5);
   }

   private static final class StackEntry {
      final Component component;
      final int depth;
      final int stylesToPop;

      StackEntry(Component var1, int var2, int var3) {
         this.component = var1;
         this.depth = var2;
         this.stylesToPop = var3;
      }
   }
}
