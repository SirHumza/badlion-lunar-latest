package com.lunarclient.apollo.common.button.content;

import com.lunarclient.apollo.player.ApolloPlayer;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import java.util.function.Function;
import lombok.Generated;

public final class LiveComponentPart extends ApolloButtonContentPart {
   private final Function<ApolloPlayer, Component> resolver;
   private final Duration updateInterval;

   @Override
   public boolean isLive() {
      return true;
   }

   @Generated
   public Function<ApolloPlayer, Component> getResolver() {
      return this.resolver;
   }

   @Generated
   public Duration getUpdateInterval() {
      return this.updateInterval;
   }

   @Generated
   LiveComponentPart(Function<ApolloPlayer, Component> var1, Duration var2) {
      this.resolver = var1;
      this.updateInterval = var2;
   }
}
