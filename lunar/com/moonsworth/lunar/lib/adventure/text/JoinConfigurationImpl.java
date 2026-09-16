package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class JoinConfigurationImpl implements JoinConfiguration {
   static final Function<ComponentLike, Component> DEFAULT_CONVERTOR = ComponentLike::asComponent;
   static final Predicate<ComponentLike> DEFAULT_PREDICATE = var0 -> true;
   static final JoinConfigurationImpl NULL = new JoinConfigurationImpl();
   static final JoinConfiguration STANDARD_NEW_LINES = JoinConfiguration.separator(Component.newline());
   static final JoinConfiguration STANDARD_SPACES = JoinConfiguration.separator(Component.space());
   static final JoinConfiguration STANDARD_COMMA_SEPARATED = JoinConfiguration.separator(Component.text(","));
   static final JoinConfiguration STANDARD_COMMA_SPACE_SEPARATED = JoinConfiguration.separator(Component.text(", "));
   static final JoinConfiguration STANDARD_ARRAY_LIKE = JoinConfiguration.builder()
      .separator(Component.text(", "))
      .prefix(Component.text("["))
      .suffix(Component.text("]"))
      .build();
   private final Component prefix;
   private final Component suffix;
   private final Component separator;
   private final Component lastSeparator;
   private final Component lastSeparatorIfSerial;
   private final Function<ComponentLike, Component> convertor;
   private final Predicate<ComponentLike> predicate;
   private final Style rootStyle;

   private JoinConfigurationImpl() {
      this.prefix = null;
      this.suffix = null;
      this.separator = null;
      this.lastSeparator = null;
      this.lastSeparatorIfSerial = null;
      this.convertor = DEFAULT_CONVERTOR;
      this.predicate = DEFAULT_PREDICATE;
      this.rootStyle = Style.empty();
   }

   private JoinConfigurationImpl(@NotNull JoinConfigurationImpl.BuilderImpl var1) {
      this.prefix = ComponentLike.unbox(var1.prefix);
      this.suffix = ComponentLike.unbox(var1.suffix);
      this.separator = ComponentLike.unbox(var1.separator);
      this.lastSeparator = ComponentLike.unbox(var1.lastSeparator);
      this.lastSeparatorIfSerial = ComponentLike.unbox(var1.lastSeparatorIfSerial);
      this.convertor = var1.convertor;
      this.predicate = var1.predicate;
      this.rootStyle = var1.rootStyle;
   }

   @Nullable
   @Override
   public Component prefix() {
      return this.prefix;
   }

   @Nullable
   @Override
   public Component suffix() {
      return this.suffix;
   }

   @Nullable
   @Override
   public Component separator() {
      return this.separator;
   }

   @Nullable
   @Override
   public Component lastSeparator() {
      return this.lastSeparator;
   }

   @Nullable
   @Override
   public Component lastSeparatorIfSerial() {
      return this.lastSeparatorIfSerial;
   }

   @NotNull
   @Override
   public Function<ComponentLike, Component> convertor() {
      return this.convertor;
   }

   @NotNull
   @Override
   public Predicate<ComponentLike> predicate() {
      return this.predicate;
   }

   @NotNull
   @Override
   public Style parentStyle() {
      return this.rootStyle;
   }

   public JoinConfiguration.@NotNull Builder toBuilder() {
      return new JoinConfigurationImpl.BuilderImpl(this);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("prefix", this.prefix),
         ExaminableProperty.of("suffix", this.suffix),
         ExaminableProperty.of("separator", this.separator),
         ExaminableProperty.of("lastSeparator", this.lastSeparator),
         ExaminableProperty.of("lastSeparatorIfSerial", this.lastSeparatorIfSerial),
         ExaminableProperty.of("convertor", this.convertor),
         ExaminableProperty.of("predicate", this.predicate),
         ExaminableProperty.of("rootStyle", this.rootStyle)
      );
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Contract(pure = true)
   @NotNull
   static Component join(@NotNull JoinConfiguration var0, @NotNull Iterable<? extends ComponentLike> var1) {
      Objects.requireNonNull(var0, "config");
      Objects.requireNonNull(var1, "components");
      Iterator var2 = var1.iterator();
      if (!var2.hasNext()) {
         return singleElementJoin(var0, null);
      }

      ComponentLike var3 = Objects.requireNonNull((ComponentLike)var2.next(), "Null elements in \"components\" are not allowed");
      int var4 = 0;
      if (!var2.hasNext()) {
         return singleElementJoin(var0, var3);
      }

      Component var5 = var0.prefix();
      Component var6 = var0.suffix();
      Function var7 = var0.convertor();
      Predicate var8 = var0.predicate();
      Style var9 = var0.parentStyle();
      boolean var10 = var9 != Style.empty();
      Component var11 = var0.separator();
      boolean var12 = var11 != null;
      TextComponent.Builder var13 = var10 ? Component.text().style(var9) : Component.text();
      if (var5 != null) {
         var13.append(var5);
      }

      while (var3 != null) {
         if (!var8.test(var3)) {
            if (!var2.hasNext()) {
               break;
            }

            var3 = (ComponentLike)var2.next();
         } else {
            var13.append(Objects.requireNonNull((Component)var7.apply(var3), "Null output from \"convertor\" is not allowed"));
            var4++;
            if (!var2.hasNext()) {
               var3 = null;
            } else {
               var3 = Objects.requireNonNull((ComponentLike)var2.next(), "Null elements in \"components\" are not allowed");
               if (var2.hasNext()) {
                  if (var12) {
                     var13.append(var11);
                  }
               } else {
                  Component var14 = null;
                  if (var4 > 1) {
                     var14 = var0.lastSeparatorIfSerial();
                  }

                  if (var14 == null) {
                     var14 = var0.lastSeparator();
                  }

                  if (var14 == null) {
                     var14 = var0.separator();
                  }

                  if (var14 != null) {
                     var13.append(var14);
                  }
               }
            }
         }
      }

      if (var6 != null) {
         var13.append(var6);
      }

      return var13.build();
   }

   @NotNull
   static Component singleElementJoin(@NotNull JoinConfiguration var0, @Nullable ComponentLike var1) {
      Component var2 = var0.prefix();
      Component var3 = var0.suffix();
      Function var4 = var0.convertor();
      Predicate var5 = var0.predicate();
      Style var6 = var0.parentStyle();
      boolean var7 = var6 != Style.empty();
      if (var2 == null && var3 == null) {
         Component var9;
         if (var1 != null && var5.test(var1)) {
            var9 = (Component)var4.apply(var1);
         } else {
            var9 = Component.empty();
         }

         return var7 ? Component.text().style(var6).append(var9).build() : var9;
      } else {
         TextComponent.Builder var8 = Component.text();
         if (var2 != null) {
            var8.append(var2);
         }

         if (var1 != null && var5.test(var1)) {
            var8.append((Component)var4.apply(var1));
         }

         if (var3 != null) {
            var8.append(var3);
         }

         return var7 ? Component.text().style(var6).append(var8).build() : var8.build();
      }
   }

   static final class BuilderImpl implements JoinConfiguration.Builder {
      private ComponentLike prefix;
      private ComponentLike suffix;
      private ComponentLike separator;
      private ComponentLike lastSeparator;
      private ComponentLike lastSeparatorIfSerial;
      private Function<ComponentLike, Component> convertor;
      private Predicate<ComponentLike> predicate;
      private Style rootStyle;

      BuilderImpl() {
         this(JoinConfigurationImpl.NULL);
      }

      private BuilderImpl(@NotNull JoinConfigurationImpl var1) {
         this.separator = var1.separator;
         this.lastSeparator = var1.lastSeparator;
         this.prefix = var1.prefix;
         this.suffix = var1.suffix;
         this.convertor = var1.convertor;
         this.lastSeparatorIfSerial = var1.lastSeparatorIfSerial;
         this.predicate = var1.predicate;
         this.rootStyle = var1.rootStyle;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder prefix(@Nullable ComponentLike var1) {
         this.prefix = var1;
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder suffix(@Nullable ComponentLike var1) {
         this.suffix = var1;
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder separator(@Nullable ComponentLike var1) {
         this.separator = var1;
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder lastSeparator(@Nullable ComponentLike var1) {
         this.lastSeparator = var1;
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder lastSeparatorIfSerial(@Nullable ComponentLike var1) {
         this.lastSeparatorIfSerial = var1;
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder convertor(@NotNull Function<ComponentLike, Component> var1) {
         this.convertor = Objects.requireNonNull(var1, "convertor");
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder predicate(@NotNull Predicate<ComponentLike> var1) {
         this.predicate = Objects.requireNonNull(var1, "predicate");
         return this;
      }

      @NotNull
      @Override
      public JoinConfiguration.Builder parentStyle(@NotNull Style var1) {
         this.rootStyle = Objects.requireNonNull(var1, "rootStyle");
         return this;
      }

      @NotNull
      public JoinConfiguration build() {
         return new JoinConfigurationImpl(this);
      }
   }
}
