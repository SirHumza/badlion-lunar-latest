package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.OptionsImpl;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OptionsImpl {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Collection<Option<?, ?, ?>> var1) {
      super(null, var1);
   }

   public Optional<Option<?, ?, ?>> OICIRICHOHHIIHIRRRROORCRRRCORH(String var1) {
      return Optional.ofNullable(this.registry.get(var1));
   }

   @Override
   public <T, C extends Option<T, ?, ?>> T get(@NonNull C var1) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var1 = this.registry.getOrDefault(var1.getKey(), var1);
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

      var2 = this.registry.getOrDefault(var2.getKey(), var2);
      Object var3 = this.playerOptions.getOrDefault(var1.getUniqueId(), Collections.emptyMap()).get(var2.getKey());
      return (T)(var3 == null ? this.get((C)var2) : var3);
   }

   @Override
   public <T, C extends Option<T, ?, ?>> Optional<T> getDirect(@NonNull C var1) {
      if (var1 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      }

      var1 = this.registry.getOrDefault(var1.getKey(), var1);
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

      var2 = this.registry.getOrDefault(var2.getKey(), var2);
      Object var3 = this.playerOptions.getOrDefault(var1.getUniqueId(), Collections.emptyMap()).get(var2.getKey());
      return var3 == null ? this.getDirect((C)var2) : Optional.of((T)var3);
   }

   @Override
   protected boolean postEvent(Option<?, ?, ?> var1, @Nullable ApolloPlayer var2, @Nullable Object var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this, var1, var3
            )
         );
      return var4 != null && var4.isCancelled();
   }

   @Override
   protected void postPacket(Option<?, ?, ?> var1, @Nullable ApolloPlayer var2, @Nullable Object var3) {
   }
}
