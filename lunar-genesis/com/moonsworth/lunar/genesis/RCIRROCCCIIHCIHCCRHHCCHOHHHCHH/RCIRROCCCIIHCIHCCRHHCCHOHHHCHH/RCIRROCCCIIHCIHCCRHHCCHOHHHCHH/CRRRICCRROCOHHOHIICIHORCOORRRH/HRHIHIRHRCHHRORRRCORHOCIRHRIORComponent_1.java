package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class IHHCCRIROCRCRROCCRIHCCHOOOOIRC<B>
   extends HRHIHIRHRCHHRORRRCORHOCIRHRIOR<Class<? extends B>, B>
   implements RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<B>,
   Serializable {
   private final Map<Class<? extends B>, B> IICCHROCIIHIHHCORHRHOIOHRORIOC;

   public static <B> IHHCCRIROCRCRROCCRIHCCHOOOOIRC<B> RRRHOCICHOIIRHOIORIRORCCRIOIHI() {
      return new IHHCCRIROCRCRROCCRIHCCHOOOOIRC<>(new HashMap<>());
   }

   public static <B> IHHCCRIROCRCRROCCRIHCCHOOOOIRC<B> CCHHCIRHICHHHHRRIHIORCCORCCIHR(Map<Class<? extends B>, B> var0) {
      return new IHHCCRIROCRCRROCCRIHCCHOOOOIRC<>(var0);
   }

   private IHHCCRIROCRCRROCCRIHCCHOOOOIRC(Map<Class<? extends B>, B> var1) {
      this.IICCHROCIIHIHHCORHRHOIOHRORIOC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @Override
   protected Map<Class<? extends B>, B> delegate() {
      return this.IICCHROCIIHIHHCORHRHOIOHRORIOC;
   }

   private static <B> Entry<Class<? extends B>, B> checkedEntry(final Entry<Class<? extends B>, B> var0) {
      return new OCOROCROIRCHIHIHHOOIRIIIRRCRHI<Class<? extends B>, B>() {
         @Override
         protected Entry<Class<? extends B>, B> delegate() {
            return var0;
         }

         @Override
         public B setValue(B var1) {
            return super.setValue(IHHCCRIROCRCRROCCRIHCCHOOOOIRC.cast((Class<B>)this.getKey(), var1));
         }
      };
   }

   @Override
   public Set<Entry<Class<? extends B>, B>> entrySet() {
      return new HOHCCHOIOHOHHOROHOIIHOOHORRHRO<Entry<Class<? extends B>, B>>() {
         @Override
         protected Set<Entry<Class<? extends B>, B>> delegate() {
            return IHHCCRIROCRCRROCCRIHCCHOOOOIRC.this.delegate().entrySet();
         }

         @Override
         public Spliterator<Entry<Class<? extends B>, B>> spliterator() {
            return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(
               this.delegate().spliterator(), var0 -> IHHCCRIROCRCRROCCRIHCCHOOOOIRC.checkedEntry((Entry<Class<? extends B>, B>)var0)
            );
         }

         @Override
         public Iterator<Entry<Class<? extends B>, B>> iterator() {
            return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<Entry<Class<? extends B>, B>, Entry<Class<? extends B>, B>>(this.delegate().iterator()) {
               Entry<Class<? extends B>, B> transform(Entry<Class<? extends B>, B> var1) {
                  return IHHCCRIROCRCRROCCRIHCCHOOOOIRC.checkedEntry(var1);
               }
            };
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

   @CanIgnoreReturnValue
   public B put(Class<? extends B> var1, B var2) {
      return super.put(var1, cast(var1, var2));
   }

   @Override
   public void putAll(Map<? extends Class<? extends B>, ? extends B> var1) {
      LinkedHashMap var2 = new LinkedHashMap(var1);

      for (Entry var4 : var2.entrySet()) {
         cast((Class)var4.getKey(), var4.getValue());
      }

      super.putAll(var2);
   }

   @CanIgnoreReturnValue
   @Override
   public <T extends B> T putInstance(Class<T> var1, T var2) {
      return cast(var1, this.put(var1, (B)var2));
   }

   @Override
   public <T extends B> T getInstance(Class<T> var1) {
      return cast(var1, this.get(var1));
   }

   @CanIgnoreReturnValue
   private static <B, T extends B> T cast(Class<T> var0, B var1) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.<T>wrap(
            var0
         )
         .cast(var1);
   }

   private Object writeReplace() {
      return new IHHCCRIROCRCRROCCRIHCCHOOOOIRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(this.delegate());
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B> implements Serializable {
      private final Map<Class<? extends B>, B> IHHCOCHOCORHOORRCHCCHRICRRRROR;
      private static final long RIIHCHIOHCIIOHOIRRRHOOHRCIRRIC = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<Class<? extends B>, B> var1) {
         this.IHHCOCHOCORHOORRCHCCHRICRRRROR = var1;
      }

      Object readResolve() {
         return IHHCCRIROCRCRROCCRIHCCHOOOOIRC.CCHHCIRHICHHHHRRIHIORCCORCCIHR(this.IHHCOCHOCORHOORRCHCCHRICRRRROR);
      }
   }
}
