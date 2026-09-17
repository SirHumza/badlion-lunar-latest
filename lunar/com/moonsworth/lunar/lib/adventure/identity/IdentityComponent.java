package com.moonsworth.lunar.lib.adventure.identity;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.util.UUID;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class IdentityImpl implements Identity, Examinable {
   private final UUID uuid;

   IdentityImpl(UUID var1) {
      this.uuid = var1;
   }

   @NotNull
   @Override
   public UUID uuid() {
      return this.uuid;
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Identity)) {
         return false;
      }

      Identity var2 = (Identity)var1;
      return this.uuid.equals(var2.uuid());
   }

   @Override
   public int hashCode() {
      return this.uuid.hashCode();
   }
}
