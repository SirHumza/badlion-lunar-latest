package com.lunarclient.apollo.world;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.Generated;
import lombok.NonNull;

public final class ApolloWorldManagerImpl implements ApolloWorldManager {
   private final Map<String, ApolloWorld> worlds = new HashMap<>();

   @Override
   public Optional<ApolloWorld> getWorld(@NonNull String var1) {
      if (var1 == null) {
         throw new NullPointerException("world is marked non-null but is null");
      } else {
         return Optional.ofNullable(this.worlds.get(var1));
      }
   }

   @Override
   public Collection<ApolloWorld> getWorlds() {
      return Collections.unmodifiableCollection(this.worlds.values());
   }

   public void addWorld(@NonNull ApolloWorld var1) {
      if (var1 == null) {
         throw new NullPointerException("world is marked non-null but is null");
      }

      this.worlds.putIfAbsent(var1.getName(), var1);
   }

   public void removeWorld(@NonNull String var1) {
      if (var1 == null) {
         throw new NullPointerException("world is marked non-null but is null");
      }

      this.worlds.remove(var1);
   }
}
