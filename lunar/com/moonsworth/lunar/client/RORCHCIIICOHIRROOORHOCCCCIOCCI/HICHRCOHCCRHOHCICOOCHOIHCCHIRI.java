package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> {
   void onChange(@NotNull HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, @Nullable T var2, @Nullable T var3);

   default void invoke(@NotNull HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, @Nullable Object var2, @Nullable Object var3) {
      this.onChange(var1, (T)var2, (T)var3);
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      TRAIT_REMOVED,
      TRAIT_REMOVED_CONDITIONALLY,
      TRAIT_SET;
   }
}
