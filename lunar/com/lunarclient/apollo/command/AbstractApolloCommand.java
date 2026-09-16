package com.lunarclient.apollo.command;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.function.BiConsumer;
import lombok.Generated;
import lombok.NonNull;

public abstract class AbstractApolloCommand<T> {
   protected final BiConsumer<T, Component> textConsumer;
   protected String usage;

   protected void sendCommandUsage(@NonNull T var1) {
      if (var1 == null) {
         throw new NullPointerException("sender is marked non-null but is null");
      }

      this.textConsumer.accept((T)var1, Component.text("Usage: ", NamedTextColor.RED).append(Component.text(this.usage, NamedTextColor.RED)));
   }

   @Generated
   public void setUsage(String var1) {
      this.usage = var1;
   }

   @Generated
   public AbstractApolloCommand(BiConsumer<T, Component> var1) {
      this.textConsumer = var1;
   }
}
