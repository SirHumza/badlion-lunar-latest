package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROCHRRCORRCOOOOOCOICOCROIIHIHH;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> implements HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V> {
   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   @Override
   public V get(K var1, Callable<? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Iterable<?> var1) {
      LinkedHashMap var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newLinkedHashMap();

      for (Object var4 : var1) {
         if (!var2.containsKey(var4)) {
            Object var5 = var4;
            Object var6 = this.getIfPresent(var4);
            if (var6 != null) {
               var2.put(var5, var6);
            }
         }
      }

      return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var2);
   }

   @Override
   public void put(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      for (Entry var3 : var1.entrySet()) {
         this.put((K)var3.getKey(), (V)var3.getValue());
      }
   }

   @Override
   public void cleanUp() {
   }

   @Override
   public long size() {
      throw new UnsupportedOperationException();
   }

   @Override
   public void invalidate(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void invalidateAll(Iterable<?> var1) {
      for (Object var3 : var1) {
         this.invalidate(var3);
      }
   }

   @Override
   public void invalidateAll() {
      throw new UnsupportedOperationException();
   }

   @Override
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH OIRICHROOIIHRROCOICCOOHCOOHOHC() {
      throw new UnsupportedOperationException();
   }

   @Override
   public ConcurrentMap<K, V> asMap() {
      throw new UnsupportedOperationException();
   }

   public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      void recordHits(int var1);

      void recordMisses(int var1);

      void recordLoadSuccess(long var1);

      void recordLoadException(long var1);

      void recordEviction();

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH HIRHIRIOIHRCRIOOHCCORHRHRHHCCR();
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO HRHRCIOIHIIRCCOIICHOOOORRHOICI = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOOHHHROORRCHIOCICHHOICHIORICC();
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO HOIIRCHOOOOHOCRRCOCCICIHCOCHCI = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOOHHHROORRCHIOCICHHOICHIORICC();
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO ROHIHRIOHROHIOORRRHOHRIOIHRHRO = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOOHHHROORRCHIOCICHHOICHIORICC();
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO OHCCIRIOCCIORCIRHRHHCCIOCICCRH = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOOHHHROORRCHIOCICHHOICHIORICC();
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO RICHRHCOCCCHCOICRICHCIOIOOIHRO = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOOHHHROORRCHIOCICHHOICHIORICC();
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO ROOCCROOOIICCORRCRIHOOIOCIHCIH = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOOHHHROORRCHIOCICHHOICHIORICC();

      @Override
      public void recordHits(int var1) {
         this.HRHRCIOIHIIRCCOIICHOOOORRHOICI.add(var1);
      }

      @Override
      public void recordMisses(int var1) {
         this.HOIIRCHOOOOHOCRRCOCCICIHCOCHCI.add(var1);
      }

      @Override
      public void recordLoadSuccess(long var1) {
         this.ROHIHRIOHROHIOORRRHOHRIOIHRHRO.increment();
         this.RICHRHCOCCCHCOICRICHCIOIOOIHRO.add(var1);
      }

      @Override
      public void recordLoadException(long var1) {
         this.OHCCIRIOCCIORCIRHRHHCCIOCICCRH.increment();
         this.RICHRHCOCCCHCOICRICHCIOIOOIHRO.add(var1);
      }

      @Override
      public void recordEviction() {
         this.ROOCCROOOIICCORRCRIHOOIOCIHCIH.increment();
      }

      @Override
      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH HIRHIRIOIHRCRIOOHCCORHRHRHHCCR() {
         return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
            negativeToMaxValue(this.HRHRCIOIHIIRCCOIICHOOOORRHOICI.sum()),
            negativeToMaxValue(this.HOIIRCHOOOOHOCRRCOCCICIHCOCHCI.sum()),
            negativeToMaxValue(this.ROHIHRIOHROHIOORRRHOHRIOIHRHRO.sum()),
            negativeToMaxValue(this.OHCCIRIOCCIORCIRHRHHCCIOCICCRH.sum()),
            negativeToMaxValue(this.RICHRHCOCCCHCOICRICHCIOIOOIHRO.sum()),
            negativeToMaxValue(this.ROOCCROOOIICCORRCRIHOOIOCIHCIH.sum())
         );
      }

      private static long negativeToMaxValue(long var0) {
         return var0 >= 0L ? var0 : Long.MAX_VALUE;
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = var1.HIRHIRIOIHRCRIOOHCCORHRHRHHCCR();
         this.HRHRCIOIHIIRCCOIICHOOOORRHOICI.add(var2.hitCount());
         this.HOIIRCHOOOOHOCRRCOCCICIHCOCHCI.add(var2.missCount());
         this.ROHIHRIOHROHIOORRRHOHRIOIHRHRO.add(var2.loadSuccessCount());
         this.OHCCIRIOCCIORCIRHRHHCCIOCICCRH.add(var2.loadExceptionCount());
         this.RICHRHCOCCCHCOICRICHCIOIOOIHRO.add(var2.totalLoadTime());
         this.ROOCCROOOIICCORRCRIHOOIOCIHCIH.add(var2.evictionCount());
      }
   }
}
