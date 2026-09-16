package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use Optional.of(value) or Optional.absent()")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
public abstract class ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> implements Serializable {
   private static final long HOIHOOORCHCIIOIOROIIHOCCCHIIII = 0L;

   public static <T> ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> IHIRCRORCOOROROHHRRIIOOOOCCHRH() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHCRHROCRHHOOCCRRHRORCOHRROICR();
   }

   public static <T> ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> COIRRRCIORROCHIROCHROCHICCICIC(T var0) {
      return new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<>(IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull((T)var0));
   }

   public static <T> ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> HIHCCHCCOCOHRICOICHRCOIHIIRIHO(@Nullable T var0) {
      return var0 == null ? IHIRCRORCOOROROHHRRIIOOOOCCHRH() : new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<>((T)var0);
   }

   public static <T> @Nullable ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@Nullable Optional<T> var0) {
      return var0 == null ? null : HIHCCHCCOCOHRICOICHRCOIHIIRIHO((T)var0.orElse(null));
   }

   public static <T> @Nullable Optional<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> var0) {
      return var0 == null ? null : var0.toJavaUtil();
   }

   public Optional<T> toJavaUtil() {
      return Optional.ofNullable(this.orNull());
   }

   ORHIOICIOCRRHOOCOHRORIHICHRCRR() {
   }

   public abstract boolean isPresent();

   public abstract T get();

   public abstract T or(T var1);

   public abstract ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR<? extends T> var1);

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public abstract T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<? extends T> var1);

   public abstract @Nullable T orNull();

   public abstract Set<T> asSet();

   public abstract <V> ORHIOICIOCRRHOOCOHRORIHICHRCRR<V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<? super T, V> var1);

   @Override
   public abstract boolean equals(@Nullable Object var1);

   @Override
   public abstract int hashCode();

   @Override
   public abstract String toString();

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Iterable<T> presentInstances(final Iterable<? extends ORHIOICIOCRRHOOCOHRORIHICHRCRR<? extends T>> var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      return new Iterable<T>() {
         @Override
         public Iterator<T> iterator() {
            return new IRCIIHHICIHRCOCRROCOICRIHHCCHH<T>() {
               private final Iterator<? extends ORHIOICIOCRRHOOCOHRORIHICHRCRR<? extends T>> HCCIHIROCOORRCOOOOCHOIIORRIROO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var0.iterator()
               );

               @Override
               protected T computeNext() {
                  while (this.HCCIHIROCOORRCOOOOCHOIIORRIROO.hasNext()) {
                     ORHIOICIOCRRHOOCOHRORIHICHRCRR var1 = this.HCCIHIROCOORRCOOOOCHOIIORRIROO.next();
                     if (var1.isPresent()) {
                        return (T)var1.get();
                     }
                  }

                  return (T)this.CHICCRIOOROHRIHIRHHHCHICHCHIIH();
               }
            };
         }
      };
   }
}
