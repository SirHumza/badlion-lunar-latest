package com.lunarclient.apollo.option;

import com.google.protobuf.Value;
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.event.option.ApolloUpdateOptionEvent;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.network.NetworkOptions;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiFunction;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public class OptionsImpl implements Options {
   protected final Map<String, Option<?, ?, ?>> registry = new HashMap<>();
   protected final Map<String, Object> options = Collections.synchronizedMap(new HashMap<>());
   protected final Map<UUID, Map<String, Object>> playerOptions = Collections.synchronizedMap(new HashMap<>());
   private final ApolloModule module;

   public OptionsImpl(@Nullable ApolloModule var1, Collection<Option<?, ?, ?>> var2) {
      this.module = var1;

      for (Option var4 : var2) {
         this.registry.put(var4.getKey(), var4);
      }
   }

   @Override
   public <T, C extends Option<T, ?, ?>> T get(@NonNull C var1) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var1 = this.registry.get(var1.getKey());
      Object var2 = this.options.get(var1.getKey());
      return (T)(var2 == null ? var1.getDefaultValue() : var2);
   }

   @Nullable
   @Override
   public <T, C extends Option<T, ?, ?>> T get(@NonNull ApolloPlayer var1, @NonNull C var2) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var2 = this.registry.get(var2.getKey());
      Object var3 = this.playerOptions.getOrDefault(var1.getUniqueId(), Collections.emptyMap()).get(var2.getKey());
      return (T)(var3 == null ? this.get((C)var2) : var3);
   }

   @Override
   public <T, C extends Option<T, ?, ?>> Optional<T> getDirect(@NonNull C var1) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var1 = this.registry.get(var1.getKey());
      Object var2 = this.options.get(var1.getKey());
      return var2 == null ? Optional.empty() : Optional.of((T)var2);
   }

   @Override
   public <T, C extends Option<T, ?, ?>> Optional<T> getDirect(@NonNull ApolloPlayer var1, @NonNull C var2) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var2 = this.registry.get(var2.getKey());
      Object var3 = this.playerOptions.getOrDefault(var1.getUniqueId(), Collections.emptyMap()).get(var2.getKey());
      return var3 == null ? this.getDirect((C)var2) : Optional.of((T)var3);
   }

   @Override
   public <T> void set(@NonNull Option<?, ?, ?> var1, @Nullable T var2) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var1 = this.registry.get(var1.getKey());
      Object var3 = var2 == null ? var1.getDefaultValue() : var2;
      if (!this.postEvent(var1, null, var3)) {
         Object var4;
         if (Objects.equals(var3, var1.getDefaultValue())) {
            var4 = this.options.remove(var1.getKey());
         } else {
            var4 = this.options.put(var1.getKey(), var2);
         }

         if (!Objects.equals(var4, var2)) {
            this.postPacket(var1, null, var3);
         }
      }
   }

   @Override
   public <T> void set(@NonNull ApolloPlayer var1, @NonNull Option<?, ?, ?> var2, @Nullable T var3) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var2 = this.registry.get(var2.getKey());
      Object var4 = this.get(var2);
      Object var5 = var3 == null ? var4 : var3;
      if (!this.postEvent(var2, var1, var5)) {
         Object var6;
         if (Objects.equals(var3, var4)) {
            var6 = this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).remove(var2.getKey());
         } else {
            var6 = this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).put(var2.getKey(), var3);
         }

         if (!Objects.equals(var6, var3)) {
            this.postPacket(var2, var1, var5);
         }
      }
   }

   @Override
   public <T> void add(@NonNull Option<?, ?, ?> var1, @NonNull T var2) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("value is marked non-null but is null");
      }

      var1 = this.registry.get(var1.getKey());
      if (!this.postEvent(var1, null, var2)) {
         Object var3 = this.options.put(var1.getKey(), var2);
         if (!Objects.equals(var3, var2)) {
            this.postPacket(var1, null, var2);
         }
      }
   }

   @Override
   public <T> void add(@NonNull ApolloPlayer var1, @NonNull Option<?, ?, ?> var2, @NonNull T var3) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("value is marked non-null but is null");
      }

      var2 = this.registry.get(var2.getKey());
      if (!this.postEvent(var2, var1, var3)) {
         Object var4 = this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).put(var2.getKey(), var3);
         if (!Objects.equals(var4, var3)) {
            this.postPacket(var2, var1, var3);
         }
      }
   }

   @Override
   public <T> void remove(@NonNull Option<?, ?, ?> var1, @Nullable T var2) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var1 = this.registry.get(var1.getKey());
      if (!this.postEvent(var1, null, var1.getDefaultValue())) {
         if (this.options.remove(var1.getKey(), var2)) {
            this.postPacket(var1, null, var1.getDefaultValue());
         }
      }
   }

   @Override
   public <T> void remove(@NonNull ApolloPlayer var1, @NonNull Option<?, ?, ?> var2, @Nullable T var3) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var2 = this.registry.get(var2.getKey());
      if (!this.postEvent(var2, var1, this.get(var2))) {
         if (this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).remove(var2.getKey(), var3)) {
            this.postPacket(var2, var1, var2.getDefaultValue());
         }
      }
   }

   @Override
   public <T> void replace(@NonNull Option<?, ?, ?> var1, @NonNull BiFunction<Option<?, ?, ?>, T, T> var2) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("remappingFunction is marked non-null but is null");
      }

      Option var3 = this.registry.get(var1.getKey());
      this.options.replaceAll((var3x, var4) -> {
         Object var5 = var2.apply(var3, var4);
         if (var5 == null) {
            var5 = var3.getDefaultValue();
         }

         if (this.postEvent(var3, null, var5)) {
            return null;
         }

         if (!Objects.equals(var4, var5)) {
            this.postPacket(var3, null, var5);
         }

         return var5;
      });
   }

   @Override
   public <T> void replace(@NonNull ApolloPlayer var1, @NonNull Option<?, ?, ?> var2, @NonNull BiFunction<Option<?, ?, ?>, T, T> var3) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("remappingFunction is marked non-null but is null");
      }

      Option var4 = this.registry.get(var2.getKey());
      this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).replaceAll((var4x, var5) -> {
         Object var6 = var3.apply(var4, var5);
         if (var6 == null) {
            var6 = var4.getDefaultValue();
         }

         if (this.postEvent(var4, var1, var6)) {
            return null;
         }

         if (!Objects.equals(var5, var6)) {
            this.postPacket(var4, var1, var6);
         }

         return var6;
      });
   }

   @Override
   public <T, C extends Option<T, ?, ?>> void register(C var1) {
      this.registry.put(var1.getKey(), var1);
   }

   @NonNull
   @Override
   public Iterator<Option<?, ?, ?>> iterator() {
      return this.registry.values().iterator();
   }

   protected boolean postEvent(Option<?, ?, ?> var1, @Nullable ApolloPlayer var2, @Nullable Object var3) {
      EventBus.EventResult var4 = EventBus.getBus().post(new ApolloUpdateOptionEvent(this, var2, var1, var3));

      for (Throwable var6 : var4.getThrowing()) {
         var6.printStackTrace();
      }

      return ((ApolloUpdateOptionEvent)var4.getEvent()).isCancelled();
   }

   protected void postPacket(Option<?, ?, ?> var1, @Nullable ApolloPlayer var2, @Nullable Object var3) {
      if (var1.isNotify()) {
         Recipients var4 = var2 == null ? Recipients.ofEveryone() : var2;
         Value var5 = NetworkOptions.wrapValue(Value.newBuilder(), var1.getTypeToken().getType(), var3);
         NetworkOptions.sendOption(this.module, var1, var5, var4);
      }
   }

   @Generated
   @Override
   public Map<String, Option<?, ?, ?>> getRegistry() {
      return this.registry;
   }

   @Generated
   public Map<UUID, Map<String, Object>> getPlayerOptions() {
      return this.playerOptions;
   }
}
