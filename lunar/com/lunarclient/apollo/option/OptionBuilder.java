package com.lunarclient.apollo.option;

import io.leangen.geantyref.TypeToken;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public abstract class OptionBuilder<V, M extends OptionBuilder<V, M, I>, I extends Option<V, M, I>> {
   String[] node;
   TypeToken<V> typeToken;
   String comment = null;
   V defaultValue = (V)null;
   boolean notify;

   public M node(@NonNull String... var1) {
      if (var1 == null) {
         throw new NullPointerException("key is marked non-null but is null");
      }

      this.node = var1;
      return (M)this;
   }

   public M type(@NonNull TypeToken<V> var1) {
      if (var1 == null) {
         throw new NullPointerException("typeToken is marked non-null but is null");
      }

      this.typeToken = var1;
      return (M)this;
   }

   public M comment(@Nullable String var1) {
      this.comment = var1;
      return (M)this;
   }

   public M comment(@NonNull String... var1) {
      if (var1 == null) {
         throw new NullPointerException("lines is marked non-null but is null");
      }

      this.comment = String.join("\n", var1);
      return (M)this;
   }

   public M defaultValue(@Nullable V var1) {
      this.defaultValue = (V)var1;
      return (M)this;
   }

   public M notifyClient() {
      this.notify = true;
      return (M)this;
   }

   public abstract I build();

   @Generated
   OptionBuilder() {
   }
}
