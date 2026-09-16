package com.lunarclient.apollo.event.option;

import com.lunarclient.apollo.event.EventCancellable;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.player.ApolloPlayer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class ApolloUpdateOptionEvent implements EventCancellable {
   private final Options container;
   @Nullable
   private final ApolloPlayer player;
   private final Option<?, ?, ?> option;
   @Nullable
   private final Object value;
   private boolean cancelled;

   @Generated
   public Options getContainer() {
      return this.container;
   }

   @Nullable
   @Generated
   public ApolloPlayer getPlayer() {
      return this.player;
   }

   @Generated
   public Option<?, ?, ?> getOption() {
      return this.option;
   }

   @Nullable
   @Generated
   public Object getValue() {
      return this.value;
   }

   @Generated
   @Override
   public boolean isCancelled() {
      return this.cancelled;
   }

   @Generated
   public ApolloUpdateOptionEvent(Options var1, @Nullable ApolloPlayer var2, Option<?, ?, ?> var3, @Nullable Object var4) {
      this.container = var1;
      this.player = var2;
      this.option = var3;
      this.value = var4;
   }

   @Generated
   @Override
   public void setCancelled(boolean var1) {
      this.cancelled = var1;
   }
}
