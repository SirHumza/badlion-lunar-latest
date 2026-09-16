package com.lunarclient.apollo.event.modsetting;

import com.lunarclient.apollo.event.Event;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.player.ApolloPlayer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class ApolloUpdateModOptionEvent implements Event {
   private final ApolloPlayer player;
   private final Option<?, ?, ?> option;
   @Nullable
   private final Object value;

   @Generated
   public ApolloUpdateModOptionEvent(ApolloPlayer var1, Option<?, ?, ?> var2, @Nullable Object var3) {
      this.player = var1;
      this.option = var2;
      this.value = var3;
   }

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
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ApolloUpdateModOptionEvent)) {
         return false;
      }

      ApolloUpdateModOptionEvent var2 = (ApolloUpdateModOptionEvent)var1;
      ApolloPlayer var3 = this.getPlayer();
      ApolloPlayer var4 = var2.getPlayer();
      if (var3 == null ? var4 == null : var3.equals(var4)) {
         Option var5 = this.getOption();
         Option var6 = var2.getOption();
         if (var5 == null ? var6 == null : var5.equals(var6)) {
            Object var7 = this.getValue();
            Object var8 = var2.getValue();
            return var7 == null ? var8 == null : var7.equals(var8);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      ApolloPlayer var3 = this.getPlayer();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Option var4 = this.getOption();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      Object var5 = this.getValue();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloUpdateModOptionEvent(player=" + this.getPlayer() + ", option=" + this.getOption() + ", value=" + this.getValue() + ")";
   }
}
