package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Collections2 {
   static final Joiner STANDARD_JOINER = Joiner.on(", ").useForNull("null");

   static boolean safeContains(Collection<?> var0, @Nullable Object var1) {
      Preconditions.checkNotNull(var0);

      try {
         return var0.contains(var1);
      } catch (ClassCastException var3) {
         return false;
      } catch (NullPointerException var4) {
         return false;
      }
   }

   static StringBuilder newStringBuilderForCollection(int var0) {
      CollectPreconditions.checkNonnegative(var0, "size");
      return new StringBuilder((int)Math.min(var0 * 8L, 1073741824L));
   }
}
