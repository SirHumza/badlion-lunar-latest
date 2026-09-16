package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import java.util.Optional;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CORCOCICIRIOHROHROIIOOHICCHCRR {
   @Nullable
   <T> T IHCRORHRORIICHRHRCHRRIRRHHOCOO(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1);

   default boolean ICICIOCHHHIHOCHCOHORIHRCOHHOCR(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
      return this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1) != null;
   }

   default <T> Optional<T> IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      return Optional.ofNullable(this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1));
   }

   @NotNull
   default <T> T RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      Object var2 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1);
      if (var2 == null) {
         throw new RuntimeException("Trait ID " + var1.getId() + " hasn't been set!");
      } else {
         return (T)var2;
      }
   }

   @Contract("_,!null->!null; _,_->_")
   default <T> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, T var2) {
      Object var3 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1);
      return (T)(var3 != null ? var3 : var2);
   }
}
