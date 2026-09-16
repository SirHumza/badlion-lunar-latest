package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.key.Keyed;
import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.StyleBuilderApplicable;
import com.moonsworth.lunar.lib.adventure.text.renderer.ComponentRenderer;
import com.moonsworth.lunar.lib.adventure.util.Index;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public final class HoverEvent<V> implements HoverEventSource<V>, StyleBuilderApplicable, Examinable {
   private final HoverEvent.Action<V> action;
   private final V value;

   @NotNull
   public static HoverEvent<Component> showText(@NotNull ComponentLike var0) {
      return showText(var0.asComponent());
   }

   @NotNull
   public static HoverEvent<Component> showText(@NotNull Component var0) {
      return new HoverEvent<>(HoverEvent.Action.SHOW_TEXT, var0);
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowItem> showItem(@NotNull Key var0, @Range(from = 0L, to = 2147483647L) int var1) {
      return showItem(var0, var1, Collections.emptyMap());
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowItem> showItem(@NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1) {
      return showItem(var0, var1, Collections.emptyMap());
   }

   @Deprecated
   @NotNull
   public static HoverEvent<HoverEvent.ShowItem> showItem(@NotNull Key var0, @Range(from = 0L, to = 2147483647L) int var1, @Nullable BinaryTagHolder var2) {
      return showItem(HoverEvent.ShowItem.showItem(var0, var1, var2));
   }

   @Deprecated
   @NotNull
   public static HoverEvent<HoverEvent.ShowItem> showItem(@NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1, @Nullable BinaryTagHolder var2) {
      return showItem(HoverEvent.ShowItem.showItem(var0, var1, var2));
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowItem> showItem(
      @NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1, @NotNull Map<Key, ? extends DataComponentValue> var2
   ) {
      return showItem(HoverEvent.ShowItem.showItem(var0, var1, var2));
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowItem> showItem(@NotNull HoverEvent.ShowItem var0) {
      return new HoverEvent<>(HoverEvent.Action.SHOW_ITEM, var0);
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowEntity> showEntity(@NotNull Key var0, @NotNull UUID var1) {
      return showEntity(var0, var1, null);
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowEntity> showEntity(@NotNull Keyed var0, @NotNull UUID var1) {
      return showEntity(var0, var1, null);
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowEntity> showEntity(@NotNull Key var0, @NotNull UUID var1, @Nullable Component var2) {
      return showEntity(HoverEvent.ShowEntity.of(var0, var1, var2));
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowEntity> showEntity(@NotNull Keyed var0, @NotNull UUID var1, @Nullable Component var2) {
      return showEntity(HoverEvent.ShowEntity.of(var0, var1, var2));
   }

   @NotNull
   public static HoverEvent<HoverEvent.ShowEntity> showEntity(@NotNull HoverEvent.ShowEntity var0) {
      return new HoverEvent<>(HoverEvent.Action.SHOW_ENTITY, var0);
   }

   @Deprecated
   @NotNull
   public static HoverEvent<String> showAchievement(@NotNull String var0) {
      return new HoverEvent<>(HoverEvent.Action.SHOW_ACHIEVEMENT, var0);
   }

   @NotNull
   public static <V> HoverEvent<V> hoverEvent(@NotNull HoverEvent.Action<V> var0, @NotNull V var1) {
      return new HoverEvent<>(var0, (V)var1);
   }

   private HoverEvent(@NotNull HoverEvent.Action<V> var1, @NotNull V var2) {
      this.action = Objects.requireNonNull(var1, "action");
      this.value = Objects.requireNonNull((V)var2, "value");
   }

   @NotNull
   public HoverEvent.Action<V> action() {
      return this.action;
   }

   @NotNull
   public V value() {
      return this.value;
   }

   @NotNull
   public HoverEvent<V> value(@NotNull V var1) {
      return new HoverEvent<>(this.action, (V)var1);
   }

   @NotNull
   public <C> HoverEvent<V> withRenderedValue(@NotNull ComponentRenderer<C> var1, @NotNull C var2) {
      Object var3 = this.value;
      Object var4 = this.action.renderer.render(var1, var2, (V)var3);
      return var4 != var3 ? new HoverEvent<>(this.action, (V)var4) : this;
   }

   @NotNull
   @Override
   public HoverEvent<V> asHoverEvent() {
      return this;
   }

   @NotNull
   @Override
   public HoverEvent<V> asHoverEvent(@NotNull UnaryOperator<V> var1) {
      return var1 == UnaryOperator.identity() ? this : new HoverEvent<>(this.action, var1.apply(this.value));
   }

   @Override
   public void styleApply(Style.@NotNull Builder var1) {
      var1.hoverEvent(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HoverEvent var2 = (HoverEvent)var1;
         return this.action == var2.action && this.value.equals(var2.value);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.action.hashCode();
      return 31 * var1 + this.value.hashCode();
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("action", this.action), ExaminableProperty.of("value", this.value));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   public static final class Action<V> {
      public static final HoverEvent.Action<Component> SHOW_TEXT = new HoverEvent.Action<>(
         "show_text", Component.class, true, new HoverEvent.Action.Renderer<Component>() {
            @NotNull
            public <C> Component render(@NotNull ComponentRenderer<C> var1, @NotNull C var2, @NotNull Component var3) {
               return var1.render(var3, var2);
            }
         }
      );
      public static final HoverEvent.Action<HoverEvent.ShowItem> SHOW_ITEM = new HoverEvent.Action<>(
         "show_item", HoverEvent.ShowItem.class, true, new HoverEvent.Action.Renderer<HoverEvent.ShowItem>() {
            @NotNull
            public <C> HoverEvent.ShowItem render(@NotNull ComponentRenderer<C> var1, @NotNull C var2, @NotNull HoverEvent.ShowItem var3) {
               return var3;
            }
         }
      );
      public static final HoverEvent.Action<HoverEvent.ShowEntity> SHOW_ENTITY = new HoverEvent.Action<>(
         "show_entity", HoverEvent.ShowEntity.class, true, new HoverEvent.Action.Renderer<HoverEvent.ShowEntity>() {
            @NotNull
            public <C> HoverEvent.ShowEntity render(@NotNull ComponentRenderer<C> var1, @NotNull C var2, @NotNull HoverEvent.ShowEntity var3) {
               return var3.name == null ? var3 : var3.name(var1.render(var3.name, var2));
            }
         }
      );
      @Deprecated
      public static final HoverEvent.Action<String> SHOW_ACHIEVEMENT = new HoverEvent.Action<>(
         "show_achievement", String.class, true, new HoverEvent.Action.Renderer<String>() {
            @NotNull
            public <C> String render(@NotNull ComponentRenderer<C> var1, @NotNull C var2, @NotNull String var3) {
               return var3;
            }
         }
      );
      public static final Index<String, HoverEvent.Action<?>> NAMES = Index.create(var0 -> var0.name, SHOW_TEXT, SHOW_ITEM, SHOW_ENTITY, SHOW_ACHIEVEMENT);
      private final String name;
      private final Class<V> type;
      private final boolean readable;
      private final HoverEvent.Action.Renderer<V> renderer;

      Action(String var1, Class<V> var2, boolean var3, HoverEvent.Action.Renderer<V> var4) {
         this.name = var1;
         this.type = var2;
         this.readable = var3;
         this.renderer = var4;
      }

      @NotNull
      public Class<V> type() {
         return this.type;
      }

      public boolean readable() {
         return this.readable;
      }

      @NotNull
      @Override
      public String toString() {
         return this.name;
      }

      @FunctionalInterface
      interface Renderer<V> {
         @NotNull
         <C> V render(@NotNull ComponentRenderer<C> var1, @NotNull C var2, @NotNull V var3);
      }
   }

   public static final class ShowEntity implements Examinable {
      private final Key type;
      private final UUID id;
      private final Component name;

      @NotNull
      public static HoverEvent.ShowEntity showEntity(@NotNull Key var0, @NotNull UUID var1) {
         return showEntity(var0, var1, null);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowEntity of(@NotNull Key var0, @NotNull UUID var1) {
         return of(var0, var1, null);
      }

      @NotNull
      public static HoverEvent.ShowEntity showEntity(@NotNull Keyed var0, @NotNull UUID var1) {
         return showEntity(var0, var1, null);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowEntity of(@NotNull Keyed var0, @NotNull UUID var1) {
         return of(var0, var1, null);
      }

      @NotNull
      public static HoverEvent.ShowEntity showEntity(@NotNull Key var0, @NotNull UUID var1, @Nullable Component var2) {
         return new HoverEvent.ShowEntity(Objects.requireNonNull(var0, "type"), Objects.requireNonNull(var1, "id"), var2);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowEntity of(@NotNull Key var0, @NotNull UUID var1, @Nullable Component var2) {
         return new HoverEvent.ShowEntity(Objects.requireNonNull(var0, "type"), Objects.requireNonNull(var1, "id"), var2);
      }

      @NotNull
      public static HoverEvent.ShowEntity showEntity(@NotNull Keyed var0, @NotNull UUID var1, @Nullable Component var2) {
         return new HoverEvent.ShowEntity(Objects.requireNonNull(var0, "type").key(), Objects.requireNonNull(var1, "id"), var2);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowEntity of(@NotNull Keyed var0, @NotNull UUID var1, @Nullable Component var2) {
         return new HoverEvent.ShowEntity(Objects.requireNonNull(var0, "type").key(), Objects.requireNonNull(var1, "id"), var2);
      }

      private ShowEntity(@NotNull Key var1, @NotNull UUID var2, @Nullable Component var3) {
         this.type = var1;
         this.id = var2;
         this.name = var3;
      }

      @NotNull
      public Key type() {
         return this.type;
      }

      @NotNull
      public HoverEvent.ShowEntity type(@NotNull Key var1) {
         return Objects.requireNonNull(var1, "type").equals(this.type) ? this : new HoverEvent.ShowEntity(var1, this.id, this.name);
      }

      @NotNull
      public HoverEvent.ShowEntity type(@NotNull Keyed var1) {
         return this.type(Objects.requireNonNull(var1, "type").key());
      }

      @NotNull
      public UUID id() {
         return this.id;
      }

      @NotNull
      public HoverEvent.ShowEntity id(@NotNull UUID var1) {
         return Objects.requireNonNull(var1).equals(this.id) ? this : new HoverEvent.ShowEntity(this.type, var1, this.name);
      }

      @Nullable
      public Component name() {
         return this.name;
      }

      @NotNull
      public HoverEvent.ShowEntity name(@Nullable Component var1) {
         return Objects.equals(var1, this.name) ? this : new HoverEvent.ShowEntity(this.type, this.id, var1);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            HoverEvent.ShowEntity var2 = (HoverEvent.ShowEntity)var1;
            return this.type.equals(var2.type) && this.id.equals(var2.id) && Objects.equals(this.name, var2.name);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.type.hashCode();
         var1 = 31 * var1 + this.id.hashCode();
         return 31 * var1 + Objects.hashCode(this.name);
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("type", this.type), ExaminableProperty.of("id", this.id), ExaminableProperty.of("name", this.name));
      }

      @Override
      public String toString() {
         return Internals.toString(this);
      }
   }

   public static final class ShowItem implements Examinable {
      private final Key item;
      private final int count;
      @Nullable
      private final BinaryTagHolder nbt;
      private final Map<Key, DataComponentValue> dataComponents;

      @NotNull
      public static HoverEvent.ShowItem showItem(@NotNull Key var0, @Range(from = 0L, to = 2147483647L) int var1) {
         return showItem(var0, var1, Collections.emptyMap());
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowItem of(@NotNull Key var0, @Range(from = 0L, to = 2147483647L) int var1) {
         return showItem(var0, var1, Collections.emptyMap());
      }

      @NotNull
      public static HoverEvent.ShowItem showItem(@NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1) {
         return showItem(var0, var1, Collections.emptyMap());
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowItem of(@NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1) {
         return of(var0, var1, null);
      }

      @Deprecated
      @NotNull
      public static HoverEvent.ShowItem showItem(@NotNull Key var0, @Range(from = 0L, to = 2147483647L) int var1, @Nullable BinaryTagHolder var2) {
         return new HoverEvent.ShowItem(Objects.requireNonNull(var0, "item"), var1, var2, Collections.emptyMap());
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowItem of(@NotNull Key var0, @Range(from = 0L, to = 2147483647L) int var1, @Nullable BinaryTagHolder var2) {
         return new HoverEvent.ShowItem(Objects.requireNonNull(var0, "item"), var1, var2, Collections.emptyMap());
      }

      @Deprecated
      @NotNull
      public static HoverEvent.ShowItem showItem(@NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1, @Nullable BinaryTagHolder var2) {
         return new HoverEvent.ShowItem(Objects.requireNonNull(var0, "item").key(), var1, var2, Collections.emptyMap());
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static HoverEvent.ShowItem of(@NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1, @Nullable BinaryTagHolder var2) {
         return new HoverEvent.ShowItem(Objects.requireNonNull(var0, "item").key(), var1, var2, Collections.emptyMap());
      }

      @NotNull
      public static HoverEvent.ShowItem showItem(
         @NotNull Keyed var0, @Range(from = 0L, to = 2147483647L) int var1, @NotNull Map<Key, ? extends DataComponentValue> var2
      ) {
         return new HoverEvent.ShowItem(Objects.requireNonNull(var0, "item").key(), var1, null, var2);
      }

      private ShowItem(
         @NotNull Key var1, @Range(from = 0L, to = 2147483647L) int var2, @Nullable BinaryTagHolder var3, @NotNull Map<Key, ? extends DataComponentValue> var4
      ) {
         this.item = var1;
         this.count = var2;
         this.nbt = var3;
         this.dataComponents = Collections.unmodifiableMap(new HashMap<>(var4));
      }

      @NotNull
      public Key item() {
         return this.item;
      }

      @NotNull
      public HoverEvent.ShowItem item(@NotNull Key var1) {
         return Objects.requireNonNull(var1, "item").equals(this.item) ? this : new HoverEvent.ShowItem(var1, this.count, this.nbt, this.dataComponents);
      }

      public @Range(from = 0L, to = 2147483647L) int count() {
         return this.count;
      }

      @NotNull
      public HoverEvent.ShowItem count(@Range(from = 0L, to = 2147483647L) int var1) {
         return var1 == this.count ? this : new HoverEvent.ShowItem(this.item, var1, this.nbt, this.dataComponents);
      }

      @Deprecated
      @Nullable
      public BinaryTagHolder nbt() {
         return this.nbt;
      }

      @Deprecated
      @NotNull
      public HoverEvent.ShowItem nbt(@Nullable BinaryTagHolder var1) {
         return Objects.equals(var1, this.nbt) ? this : new HoverEvent.ShowItem(this.item, this.count, var1, Collections.emptyMap());
      }

      @NotNull
      public Map<Key, DataComponentValue> dataComponents() {
         return this.dataComponents;
      }

      @NotNull
      public HoverEvent.ShowItem dataComponents(@NotNull Map<Key, DataComponentValue> var1) {
         return Objects.equals(this.dataComponents, var1)
            ? this
            : new HoverEvent.ShowItem(this.item, this.count, null, var1.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap<>(var1)));
      }

      @NotNull
      public <V extends DataComponentValue> Map<Key, V> dataComponentsAs(@NotNull Class<V> var1) {
         if (this.dataComponents.isEmpty()) {
            return Collections.emptyMap();
         }

         HashMap var2 = new HashMap(this.dataComponents.size());

         for (Entry var4 : this.dataComponents.entrySet()) {
            var2.put((Key)var4.getKey(), DataComponentValueConverterRegistry.convert(var1, (Key)var4.getKey(), (DataComponentValue)var4.getValue()));
         }

         return Collections.unmodifiableMap(var2);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            HoverEvent.ShowItem var2 = (HoverEvent.ShowItem)var1;
            return this.item.equals(var2.item)
               && this.count == var2.count
               && Objects.equals(this.nbt, var2.nbt)
               && Objects.equals(this.dataComponents, var2.dataComponents);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.item.hashCode();
         var1 = 31 * var1 + Integer.hashCode(this.count);
         var1 = 31 * var1 + Objects.hashCode(this.nbt);
         return 31 * var1 + Objects.hashCode(this.dataComponents);
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(
            ExaminableProperty.of("item", this.item),
            ExaminableProperty.of("count", this.count),
            ExaminableProperty.of("nbt", this.nbt),
            ExaminableProperty.of("dataComponents", this.dataComponents)
         );
      }

      @Override
      public String toString() {
         return Internals.toString(this);
      }
   }
}
