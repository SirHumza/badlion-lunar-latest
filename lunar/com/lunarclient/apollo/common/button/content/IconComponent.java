package com.lunarclient.apollo.common.button.content;

import com.lunarclient.apollo.common.icon.Icon;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import java.util.function.Function;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public abstract class ApolloButtonContentPart {
   public static ComponentPart component(@NonNull Component var0) {
      if (var0 == null) {
         throw new NullPointerException("component is marked non-null but is null");
      } else {
         return new ComponentPart(var0);
      }
   }

   public static IconPart icon(@NonNull Icon var0) {
      if (var0 == null) {
         throw new NullPointerException("icon is marked non-null but is null");
      } else {
         return new IconPart(var0);
      }
   }

   public static LiveComponentPart live(@NonNull Function<ApolloPlayer, Component> var0, @NonNull Duration var1) {
      if (var0 == null) {
         throw new NullPointerException("resolver is marked non-null but is null");
      } else if (var1 == null) {
         throw new NullPointerException("updateInterval is marked non-null but is null");
      } else if (!var1.isNegative() && !var1.isZero()) {
         return new LiveComponentPart(var0, var1);
      } else {
         throw new IllegalArgumentException("LiveComponentPart#updateInterval must be positive");
      }
   }

   public boolean isLive() {
      return false;
   }

   @Generated
   ApolloButtonContentPart() {
   }
}
