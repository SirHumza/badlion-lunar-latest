package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.internal.properties.AdventureProperties;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.util.Nag;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

class TextComponentImpl extends AbstractComponent implements TextComponent {
   private static final boolean WARN_WHEN_LEGACY_FORMATTING_DETECTED = Boolean.TRUE
      .equals(AdventureProperties.TEXT_WARN_WHEN_LEGACY_FORMATTING_DETECTED.value());
   @VisibleForTesting
   static final char SECTION_CHAR = '§';
   static final TextComponent EMPTY = createDirect("");
   static final TextComponent NEWLINE = createDirect("\n");
   static final TextComponent SPACE = createDirect(" ");
   private final String content;

   static TextComponent create(@NotNull List<? extends ComponentLike> var0, @NotNull Style var1, @NotNull String var2) {
      List var3 = ComponentLike.asComponents(var0, IS_NOT_EMPTY);
      return var3.isEmpty() && var1.isEmpty() && var2.isEmpty()
         ? Component.empty()
         : new TextComponentImpl(var3, Objects.requireNonNull(var1, "style"), Objects.requireNonNull(var2, "content"));
   }

   TextComponent create0(@NotNull List<? extends ComponentLike> var1, @NotNull Style var2, @NotNull String var3) {
      return create(var1, var2, var3);
   }

   @NotNull
   private static TextComponent createDirect(@NotNull String var0) {
      return new TextComponentImpl(Collections.emptyList(), Style.empty(), var0);
   }

   TextComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, @NotNull String var3) {
      super(var1, var2);
      this.content = var3;
      if (WARN_WHEN_LEGACY_FORMATTING_DETECTED) {
         LegacyFormattingDetected var4 = this.warnWhenLegacyFormattingDetected();
         if (var4 != null) {
            Nag.print(var4);
         }
      }
   }

   @VisibleForTesting
   @Nullable
   final LegacyFormattingDetected warnWhenLegacyFormattingDetected() {
      return this.content.indexOf(167) != -1 ? new LegacyFormattingDetected(this) : null;
   }

   @NotNull
   @Override
   public String content() {
      return this.content;
   }

   @NotNull
   @Override
   public TextComponent content(@NotNull String var1) {
      return Objects.equals(this.content, var1) ? this : this.create0(this.children, this.style, var1);
   }

   @NotNull
   public TextComponent children(@NotNull List<? extends ComponentLike> var1) {
      return this.create0(var1, this.style, this.content);
   }

   @NotNull
   public TextComponent style(@NotNull Style var1) {
      return this.create0(this.children, var1, this.content);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof TextComponentImpl)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      TextComponentImpl var2 = (TextComponentImpl)var1;
      return Objects.equals(this.content, var2.content);
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.content.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   public TextComponent.Builder toBuilder() {
      return new TextComponentImpl.BuilderImpl(this);
   }

   static class BuilderImpl extends AbstractComponentBuilder<TextComponent, TextComponent.Builder> implements TextComponent.Builder {
      private String content = "";

      BuilderImpl() {
      }

      BuilderImpl(@NotNull TextComponent var1) {
         super(var1);
         this.content = var1.content();
      }

      @NotNull
      @Override
      public TextComponent.Builder content(@NotNull String var1) {
         this.content = Objects.requireNonNull(var1, "content");
         return this;
      }

      @NotNull
      @Override
      public String content() {
         return this.content;
      }

      @NotNull
      public TextComponent build() {
         return this.isEmpty() ? Component.empty() : TextComponentImpl.create(this.children, this.buildStyle(), this.content);
      }

      private boolean isEmpty() {
         return this.content.isEmpty() && this.children.isEmpty() && !this.hasStyle();
      }
   }
}
