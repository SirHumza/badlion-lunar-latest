package com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Arrays;
import java.util.Collection;
import org.jetbrains.annotations.Contract;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> extends HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> {
   @Contract("_->this")
   default <B> B HICHRCOHCCRHOHCICOOCHOIHCCHIRI(T... var1) {
      return this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(Arrays.asList((T[])var1));
   }

   @Contract("_->this")
   <B> B IIRHCHHOICHRICOOCRORCCIOOIHOIR(Collection<T> var1);
}
