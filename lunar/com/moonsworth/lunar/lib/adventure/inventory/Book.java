package com.moonsworth.lunar.lib.adventure.inventory;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

@ApiStatus.NonExtendable
public interface Book extends Buildable<Book, Book.Builder>, Examinable {
   @NotNull
   static Book book(@NotNull Component var0, @NotNull Component var1, @NotNull Collection<Component> var2) {
      return new BookImpl(var0, var1, new ArrayList<>(var2));
   }

   @NotNull
   static Book book(@NotNull Component var0, @NotNull Component var1, @NotNull Component... var2) {
      return book(var0, var1, Arrays.asList(var2));
   }

   @NotNull
   static Book.Builder builder() {
      return new BookImpl.BuilderImpl();
   }

   @NotNull
   Component title();

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   Book title(@NotNull Component var1);

   @NotNull
   Component author();

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   Book author(@NotNull Component var1);

   @NotNull
   @Unmodifiable List<Component> pages();

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   default Book pages(@NotNull Component... var1) {
      return this.pages(Arrays.asList(var1));
   }

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   Book pages(@NotNull List<Component> var1);

   @NotNull
   default Book.Builder toBuilder() {
      return builder().title(this.title()).author(this.author()).pages(this.pages());
   }

   interface Builder extends AbstractBuilder<Book>, Buildable.Builder<Book> {
      @Contract("_ -> this")
      @NotNull
      Book.Builder title(@NotNull Component var1);

      @Contract("_ -> this")
      @NotNull
      Book.Builder author(@NotNull Component var1);

      @Contract("_ -> this")
      @NotNull
      Book.Builder addPage(@NotNull Component var1);

      @Contract("_ -> this")
      @NotNull
      Book.Builder pages(@NotNull Component... var1);

      @Contract("_ -> this")
      @NotNull
      Book.Builder pages(@NotNull Collection<Component> var1);

      @NotNull
      Book build();
   }
}
