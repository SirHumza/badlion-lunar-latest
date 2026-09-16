package com.lunarclient.apollo.option;

import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

final class EmptyOptions implements Options {
   static final EmptyOptions EMPTY = new EmptyOptions();

   @Nullable
   @Override
   public <T, C extends Option<T, ?, ?>> T get(C var1) {
      return (T)var1.getDefaultValue();
   }

   @Nullable
   @Override
   public <T, C extends Option<T, ?, ?>> T get(ApolloPlayer var1, C var2) {
      return (T)var2.getDefaultValue();
   }

   @Override
   public <T, C extends Option<T, ?, ?>> Optional<T> getDirect(C var1) {
      return Optional.empty();
   }

   @Override
   public <T, C extends Option<T, ?, ?>> Optional<T> getDirect(ApolloPlayer var1, C var2) {
      return Optional.empty();
   }

   @Override
   public <T> void set(Option<?, ?, ?> var1, @Nullable T var2) {
   }

   @Override
   public <T> void set(ApolloPlayer var1, Option<?, ?, ?> var2, @Nullable T var3) {
   }

   @Override
   public <T> void add(Option<?, ?, ?> var1, @Nullable T var2) {
   }

   @Override
   public <T> void add(ApolloPlayer var1, Option<?, ?, ?> var2, T var3) {
   }

   @Override
   public <T> void remove(Option<?, ?, ?> var1, @Nullable T var2) {
   }

   @Override
   public <T> void remove(ApolloPlayer var1, Option<?, ?, ?> var2, @Nullable T var3) {
   }

   @Override
   public <T> void replace(Option<?, ?, ?> var1, BiFunction<Option<?, ?, ?>, T, T> var2) {
   }

   @Override
   public <T> void replace(ApolloPlayer var1, Option<?, ?, ?> var2, BiFunction<Option<?, ?, ?>, T, T> var3) {
   }

   @Override
   public <T, C extends Option<T, ?, ?>> void register(C var1) {
   }

   @Override
   public Map<String, Option<?, ?, ?>> getRegistry() {
      return Collections.emptyMap();
   }

   @NonNull
   @Override
   public Iterator<Option<?, ?, ?>> iterator() {
      return Collections.emptyIterator();
   }
}
