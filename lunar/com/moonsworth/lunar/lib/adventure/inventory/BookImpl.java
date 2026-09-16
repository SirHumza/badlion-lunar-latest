package com.moonsworth.lunar.lib.adventure.inventory;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

final class BookImpl implements Book {
   private final Component title;
   private final Component author;
   private final List<Component> pages;

   BookImpl(@NotNull Component var1, @NotNull Component var2, @NotNull List<Component> var3) {
      this.title = Objects.requireNonNull(var1, "title");
      this.author = Objects.requireNonNull(var2, "author");
      this.pages = Collections.unmodifiableList(Objects.requireNonNull(var3, "pages"));
   }

   @NotNull
   @Override
   public Component title() {
      return this.title;
   }

   @NotNull
   @Override
   public Book title(@NotNull Component var1) {
      return new BookImpl(Objects.requireNonNull(var1, "title"), this.author, this.pages);
   }

   @NotNull
   @Override
   public Component author() {
      return this.author;
   }

   @NotNull
   @Override
   public Book author(@NotNull Component var1) {
      return new BookImpl(this.title, Objects.requireNonNull(var1, "author"), this.pages);
   }

   @NotNull
   @Override
   public List<Component> pages() {
      return this.pages;
   }

   @NotNull
   @Override
   public Book pages(@NotNull List<Component> var1) {
      return new BookImpl(this.title, this.author, new ArrayList<>(Objects.requireNonNull(var1, "pages")));
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("title", this.title), ExaminableProperty.of("author", this.author), ExaminableProperty.of("pages", this.pages));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof BookImpl)) {
         return false;
      }

      BookImpl var2 = (BookImpl)var1;
      return this.title.equals(var2.title) && this.author.equals(var2.author) && this.pages.equals(var2.pages);
   }

   @Override
   public int hashCode() {
      int var1 = this.title.hashCode();
      var1 = 31 * var1 + this.author.hashCode();
      return 31 * var1 + this.pages.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class BuilderImpl implements Book.Builder {
      private Component title = Component.empty();
      private Component author = Component.empty();
      private final List<Component> pages = new ArrayList<>();

      @NotNull
      @Override
      public Book.Builder title(@NotNull Component var1) {
         this.title = Objects.requireNonNull(var1, "title");
         return this;
      }

      @NotNull
      @Override
      public Book.Builder author(@NotNull Component var1) {
         this.author = Objects.requireNonNull(var1, "author");
         return this;
      }

      @NotNull
      @Override
      public Book.Builder addPage(@NotNull Component var1) {
         this.pages.add(Objects.requireNonNull(var1, "page"));
         return this;
      }

      @NotNull
      @Override
      public Book.Builder pages(@NotNull Collection<Component> var1) {
         this.pages.addAll(Objects.requireNonNull(var1, "pages"));
         return this;
      }

      @NotNull
      @Override
      public Book.Builder pages(@NotNull Component... var1) {
         Collections.addAll(this.pages, var1);
         return this;
      }

      @NotNull
      @Override
      public Book build() {
         return new BookImpl(this.title, this.author, new ArrayList<>(this.pages));
      }
   }
}
