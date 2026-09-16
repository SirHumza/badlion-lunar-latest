package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> extends ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> {
   static final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Object> HROCCHIOHICCHRCHCHORHCRRCCCIIO = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>();
   private static final long COIHICHIOIHIHOOIIOORICCHOORROH = 0L;

   static <T> ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> CHCRHROCRHHOOCCRRHRORCOHRROICR() {
      return (ORHIOICIOCRRHOOCOHRORIHICHRCRR<T>)HROCCHIOHICCHRCHCHORHCRRCCCIIO;
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   @Override
   public boolean isPresent() {
      return false;
   }

   @Override
   public T get() {
      throw new IllegalStateException("Optional.get() cannot be called on an absent value");
   }

   @Override
   public T or(T var1) {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull((T)var1, "use Optional.orNull() instead of Optional.or(null)");
   }

   @Override
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR<? extends T> var1) {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
   }

   @Override
   public T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<? extends T> var1) {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull((T)var1.get(), "use Optional.orNull() instead of a Supplier that returns null");
   }

   @Override
   public @Nullable T orNull() {
      return null;
   }

   @Override
   public Set<T> asSet() {
      return Collections.emptySet();
   }

   @Override
   public <V> ORHIOICIOCRRHOOCOHRORIHICHRCRR<V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<? super T, V> var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return var1 == this;
   }

   @Override
   public int hashCode() {
      return 2040732332;
   }

   @Override
   public String toString() {
      return "Optional.absent()";
   }

   private Object readResolve() {
      return HROCCHIOHICCHRCHCHORHCRRCCCIIO;
   }
}
