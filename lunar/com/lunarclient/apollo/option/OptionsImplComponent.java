package com.lunarclient.apollo.option;

import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public class StatusOptionsImpl extends OptionsImpl {
   public StatusOptionsImpl(Collection<Option<?, ?, ?>> var1) {
      super(null, var1);
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
      Object var6;
      if (Objects.equals(var3, var4)) {
         var6 = this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).remove(var2.getKey());
      } else {
         var6 = this.playerOptions.computeIfAbsent(var1.getUniqueId(), var0 -> Collections.synchronizedMap(new HashMap<>())).put(var2.getKey(), var3);
      }

      if (!Objects.equals(var6, var3)) {
         this.postEvent(var2, var1, var5);
      }
   }

   @Override
   protected boolean postEvent(Option<?, ?, ?> var1, @Nullable ApolloPlayer var2, @Nullable Object var3) {
      return false;
   }

   @Override
   protected void postPacket(Option<?, ?, ?> var1, @Nullable ApolloPlayer var2, @Nullable Object var3) {
   }
}
