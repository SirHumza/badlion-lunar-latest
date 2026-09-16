package com.lunarclient.apollo.option;

import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import org.jetbrains.annotations.Nullable;

public interface Options extends Iterable<Option<?, ?, ?>> {
   static Options empty() {
      return EmptyOptions.EMPTY;
   }

   @Nullable
   <T, C extends Option<T, ?, ?>> T get(C var1);

   @Nullable
   <T, C extends Option<T, ?, ?>> T get(ApolloPlayer var1, C var2);

   <T, C extends Option<T, ?, ?>> Optional<T> getDirect(C var1);

   <T, C extends Option<T, ?, ?>> Optional<T> getDirect(ApolloPlayer var1, C var2);

   <T> void set(Option<?, ?, ?> var1, @Nullable T var2);

   <T> void set(ApolloPlayer var1, Option<?, ?, ?> var2, @Nullable T var3);

   <T> void add(Option<?, ?, ?> var1, T var2);

   <T> void add(ApolloPlayer var1, Option<?, ?, ?> var2, T var3);

   <T> void remove(Option<?, ?, ?> var1, @Nullable T var2);

   <T> void remove(ApolloPlayer var1, Option<?, ?, ?> var2, @Nullable T var3);

   <T> void replace(Option<?, ?, ?> var1, BiFunction<Option<?, ?, ?>, T, T> var2);

   <T> void replace(ApolloPlayer var1, Option<?, ?, ?> var2, BiFunction<Option<?, ?, ?>, T, T> var3);

   <T, C extends Option<T, ?, ?>> void register(C var1);

   Map<String, Option<?, ?, ?>> getRegistry();
}
