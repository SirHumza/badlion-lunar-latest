package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<T> extends ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> {
   private final T OHORHCRCHCIHHORCHROIRICCHCICIR;
   private static final long CCRIOCCOHIIOROHIHIOOIIOCHRHROC = 0L;

   ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(T var1) {
      this.OHORHCRCHCIHHORCHROIRICCHCICIR = (T)var1;
   }

   @Override
   public boolean isPresent() {
      return true;
   }

   @Override
   public T get() {
      return this.OHORHCRCHCIHHORCHROIRICCHCICIR;
   }

   @Override
   public T or(T var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "use Optional.orNull() instead of Optional.or(null)");
      return this.OHORHCRCHCIHHORCHROIRICCHCICIR;
   }

   @Override
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR<? extends T> var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return this;
   }

   @Override
   public T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<? extends T> var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return this.OHORHCRCHCIHHORCHROIRICCHCICIR;
   }

   @Override
   public T orNull() {
      return this.OHORHCRCHCIHHORCHROIRICCHCICIR;
   }

   @Override
   public Set<T> asSet() {
      return Collections.singleton(this.OHORHCRCHCIHHORCHROIRICCHCICIR);
   }

   @Override
   public <V> ORHIOICIOCRRHOOCOHRORIHICHRCRR<V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<? super T, V> var1) {
      return (ORHIOICIOCRRHOOCOHRORIHICHRCRR<V>)(new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<>(
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1.apply(this.OHORHCRCHCIHHORCHROIRICCHCICIR), "the Function passed to Optional.transform() must not return null."
         )
      ));
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 instanceof ROOCOCCCIRHHHIRIOIHHHHRHIICHHR) {
         ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var2 = (ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)var1;
         return this.OHORHCRCHCIHHORCHROIRICCHCICIR.equals(var2.OHORHCRCHCIHHORCHROIRICCHCICIR);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 1502476572 + this.OHORHCRCHCIHHORCHROIRICCHCICIR.hashCode();
   }

   @Override
   public String toString() {
      return "Optional.of(" + this.OHORHCRCHCIHHORCHROIRICCHCICIR + ")";
   }
}
