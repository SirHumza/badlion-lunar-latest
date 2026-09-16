package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractComponentBuilder<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> implements ComponentBuilder<C, B> {
   protected List<Component> children = Collections.emptyList();
   @Nullable
   private Style style;
   private Style.@Nullable Builder styleBuilder;

   protected AbstractComponentBuilder() {
   }

   protected AbstractComponentBuilder(@NotNull C var1) {
      List var2 = var1.children();
      if (!var2.isEmpty()) {
         this.children = new ArrayList<>(var2);
      }

      if (var1.hasStyling()) {
         this.style = var1.style();
      }
   }

   @NotNull
   @Override
   public B append(@NotNull Component var1) {
      if (var1 == Component.empty()) {
         return (B)this;
      }

      this.prepareChildren();
      this.children.add(Objects.requireNonNull(var1, "component"));
      return (B)this;
   }

   @NotNull
   @Override
   public B append(@NotNull Component... var1) {
      return this.append(var1);
   }

   @NotNull
   @Override
   public B append(@NotNull ComponentLike... var1) {
      Objects.requireNonNull(var1, "components");
      boolean var2 = false;
      int var3 = 0;

      for (int var4 = var1.length; var3 < var4; var3++) {
         Component var5 = Objects.requireNonNull(var1[var3], "components[?]").asComponent();
         if (var5 != Component.empty()) {
            if (!var2) {
               this.prepareChildren();
               var2 = true;
            }

            this.children.add(Objects.requireNonNull(var5, "components[?]"));
         }
      }

      return (B)this;
   }

   @NotNull
   @Override
   public B append(@NotNull Iterable<? extends ComponentLike> var1) {
      Objects.requireNonNull(var1, "components");
      boolean var2 = false;

      for (ComponentLike var4 : var1) {
         Component var5 = Objects.requireNonNull(var4, "components[?]").asComponent();
         if (var5 != Component.empty()) {
            if (!var2) {
               this.prepareChildren();
               var2 = true;
            }

            this.children.add(Objects.requireNonNull(var5, "components[?]"));
         }
      }

      return (B)this;
   }

   private void prepareChildren() {
      if (this.children == Collections.emptyList()) {
         this.children = new ArrayList<>();
      }
   }

   @NotNull
   @Override
   public B applyDeep(@NotNull Consumer<? super ComponentBuilder<?, ?>> var1) {
      this.apply(var1);
      if (this.children == Collections.emptyList()) {
         return (B)this;
      }

      ListIterator var2 = this.children.listIterator();

      while (var2.hasNext()) {
         Component var3 = (Component)var2.next();
         if (var3 instanceof BuildableComponent) {
            ComponentBuilder var4 = ((BuildableComponent)var3).toBuilder();
            var4.applyDeep(var1);
            var2.set(var4.build());
         }
      }

      return (B)this;
   }

   @NotNull
   @Override
   public B mapChildren(@NotNull Function<BuildableComponent<?, ?>, ? extends BuildableComponent<?, ?>> var1) {
      if (this.children == Collections.emptyList()) {
         return (B)this;
      }

      ListIterator var2 = this.children.listIterator();

      while (var2.hasNext()) {
         Component var3 = (Component)var2.next();
         if (var3 instanceof BuildableComponent) {
            BuildableComponent var4 = Objects.requireNonNull((BuildableComponent)var1.apply((BuildableComponent)var3), "mappedChild");
            if (var3 != var4) {
               var2.set(var4);
            }
         }
      }

      return (B)this;
   }

   @NotNull
   @Override
   public B mapChildrenDeep(@NotNull Function<BuildableComponent<?, ?>, ? extends BuildableComponent<?, ?>> var1) {
      if (this.children == Collections.emptyList()) {
         return (B)this;
      }

      ListIterator var2 = this.children.listIterator();

      while (var2.hasNext()) {
         Component var3 = (Component)var2.next();
         if (var3 instanceof BuildableComponent) {
            BuildableComponent var4 = Objects.requireNonNull((BuildableComponent)var1.apply((BuildableComponent)var3), "mappedChild");
            if (var4.children().isEmpty()) {
               if (var3 != var4) {
                  var2.set(var4);
               }
            } else {
               ComponentBuilder var5 = var4.toBuilder();
               var5.mapChildrenDeep(var1);
               var2.set(var5.build());
            }
         }
      }

      return (B)this;
   }

   @NotNull
   @Override
   public List<Component> children() {
      return Collections.unmodifiableList(this.children);
   }

   @NotNull
   @Override
   public B style(@NotNull Style var1) {
      this.style = var1;
      this.styleBuilder = null;
      return (B)this;
   }

   @NotNull
   @Override
   public B style(@NotNull Consumer<Style.Builder> var1) {
      var1.accept(this.styleBuilder());
      return (B)this;
   }

   @NotNull
   @Override
   public B font(@Nullable Key var1) {
      this.styleBuilder().font(var1);
      return (B)this;
   }

   @NotNull
   @Override
   public B color(@Nullable TextColor var1) {
      this.styleBuilder().color(var1);
      return (B)this;
   }

   @NotNull
   @Override
   public B colorIfAbsent(@Nullable TextColor var1) {
      this.styleBuilder().colorIfAbsent(var1);
      return (B)this;
   }

   @NotNull
   public B shadowColor(@Nullable ARGBLike var1) {
      this.styleBuilder().shadowColor(var1);
      return (B)this;
   }

   @NotNull
   public B shadowColorIfAbsent(@Nullable ARGBLike var1) {
      this.styleBuilder().shadowColorIfAbsent(var1);
      return (B)this;
   }

   @NotNull
   @Override
   public B decoration(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2) {
      this.styleBuilder().decoration(var1, var2);
      return (B)this;
   }

   @NotNull
   @Override
   public B decorationIfAbsent(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2) {
      this.styleBuilder().decorationIfAbsent(var1, var2);
      return (B)this;
   }

   @NotNull
   @Override
   public B clickEvent(@Nullable ClickEvent var1) {
      this.styleBuilder().clickEvent(var1);
      return (B)this;
   }

   @NotNull
   @Override
   public B hoverEvent(@Nullable HoverEventSource<?> var1) {
      this.styleBuilder().hoverEvent(var1);
      return (B)this;
   }

   @NotNull
   @Override
   public B insertion(@Nullable String var1) {
      this.styleBuilder().insertion(var1);
      return (B)this;
   }

   @NotNull
   @Override
   public B mergeStyle(@NotNull Component var1, @NotNull Set<Style.Merge> var2) {
      Style var3 = Objects.requireNonNull(var1, "that").style();
      if (var3.isEmpty() && var2.isEmpty()) {
         return (B)this;
      }

      this.styleBuilder().merge(var3, var2);
      return (B)this;
   }

   @NotNull
   @Override
   public B resetStyle() {
      this.style = null;
      this.styleBuilder = null;
      return (B)this;
   }

   private Style.@NotNull Builder styleBuilder() {
      if (this.styleBuilder == null) {
         if (this.style != null) {
            this.styleBuilder = this.style.toBuilder();
            this.style = null;
         } else {
            this.styleBuilder = Style.style();
         }
      }

      return this.styleBuilder;
   }

   protected final boolean hasStyle() {
      return this.styleBuilder != null || this.style != null;
   }

   @NotNull
   protected Style buildStyle() {
      if (this.styleBuilder != null) {
         return this.styleBuilder.build();
      } else {
         return this.style != null ? this.style : Style.empty();
      }
   }
}
