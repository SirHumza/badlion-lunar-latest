package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HOHCCHOIOHOHHOROHOIIHOOHORRHRO;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCROCOHHHICRHIHHOOCIIRRRCCIRR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHIHIRHRCHHRORRRCORHOCIRHRIOR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OCOROCROIRCHIHIHHOOIRIIIRRCRHI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROCHRRCORRCOOOOOCOICOCROIIHIHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<B>
   extends HRHIHIRHRCHHRORRRCORHOCIRHRIOR<OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B>, B>
   implements IIHRRHORCRCROCHHOHORCHCROCIHRO<B> {
   private final Map<OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B>, B> ICIIICIIRHHHHCICCOOOCOOHCRCHCR = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMap();

   @Override
   public <T extends B> @Nullable T getInstance(Class<T> var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var1));
   }

   @Override
   public <T extends B> @Nullable T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI<T> var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.OIHRCIOOOCCIOIRCHIRRRHRCHHCIII());
   }

   @CanIgnoreReturnValue
   @Override
   public <T extends B> @Nullable T putInstance(Class<T> var1, @Nullable T var2) {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(OCOHORHCROHICRRIHCIHHRRCIHICRI.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var1), (T)var2);
   }

   @CanIgnoreReturnValue
   @Override
   public <T extends B> @Nullable T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI<T> var1, @Nullable T var2) {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.OIHRCIOOOCCIOIRCHIRRRHRCHHCIII(), (T)var2);
   }

   @Deprecated
   @CanIgnoreReturnValue
   public B IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B> var1, B var2) {
      throw new UnsupportedOperationException("Please use putInstance() instead.");
   }

   @Deprecated
   @Override
   public void putAll(Map<? extends OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B>, ? extends B> var1) {
      throw new UnsupportedOperationException("Please use putInstance() instead.");
   }

   @Override
   public Set<Entry<OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B>, B>> entrySet() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.transformEntries(super.entrySet());
   }

   @Override
   protected Map<OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends B>, B> delegate() {
      return this.ICIIICIIRHHHHCICCOOOCOOHCRCHCR;
   }

   private <T extends B> @Nullable T CRRRICCRROCOHHOHIICIHORCOORRRH(OCOHORHCROHICRRIHCIHHRRCIHICRI<T> var1, @Nullable T var2) {
      return (T)this.ICIIICIIRHHHHCICCOOOCOOHCRCHCR.put(var1, (B)var2);
   }

   private <T extends B> @Nullable T IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI<T> var1) {
      return (T)this.ICIIICIIRHHHHCICCOOOCOOHCRCHCR.get(var1);
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> extends OCOROCROIRCHIHIHHOOIRIIIRRCRHI<K, V> {
      private final Entry<K, V> IICHOIHROROIOROCCICIOCCIOIOHRC;

      static <K, V> Set<Entry<K, V>> transformEntries(final Set<Entry<K, V>> var0) {
         return new HOHCCHOIOHOHHOROHOIIHOOHORRHRO<Entry<K, V>>() {
            @Override
            protected Set<Entry<K, V>> delegate() {
               return var0;
            }

            @Override
            public Iterator<Entry<K, V>> iterator() {
               return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.transformEntries(super.iterator());
            }

            @Override
            public Object[] toArray() {
               return this.standardToArray();
            }

            @Override
            public <T> T[] toArray(T[] var1) {
               return (T[])this.standardToArray((T[])var1);
            }
         };
      }

      private static <K, V> Iterator<Entry<K, V>> transformEntries(Iterator<Entry<K, V>> var0) {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, new IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<K, V>, Entry<K, V>>() {
            public Entry<K, V> apply(Entry<K, V> var1) {
               return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var1);
            }
         });
      }

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Entry<K, V> var1) {
         this.IICHOIHROROIOROCCICIOCCIOIOHRC = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      protected Entry<K, V> delegate() {
         return this.IICHOIHROROIOROCCICIOCCIOIOHRC;
      }

      @Override
      public V setValue(V var1) {
         throw new UnsupportedOperationException();
      }
   }
}
