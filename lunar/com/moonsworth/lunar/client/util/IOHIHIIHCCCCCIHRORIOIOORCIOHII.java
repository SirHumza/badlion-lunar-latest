package com.moonsworth.lunar.client.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class IOHIHIIHCCCCCIHRORIOIOORCIOHII<T> implements Iterable<T> {
   private final Iterable<T> HOHOOOCHOORICOCCHCHIIIRCCOIOII;
   private final Predicate<T> RIHRHOCHOHRIRHIROCRIORHRIICROI;

   public IOHIHIIHCCCCCIHRORIOIOORCIOHII(Iterable<T> var1, Predicate<T> var2) {
      this.HOHOOOCHOORICOCCHCHIIIRCCOIOII = var1;
      this.RIHRHOCHOHRIRHIROCRIORHRIICROI = var2;
   }

   @Override
   public Iterator<T> iterator() {
      return new IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(this.HOHOOOCHOORICOCCHCHIIIRCCOIOII, this.RIHRHOCHOHRIRHIROCRIORHRIICROI);
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> implements Iterator<T> {
      private final Iterator<T> ORCRICCIOCORCOCCHRICRHCRCHOOIO;
      private final Predicate<T> CHIIHOHIHORIIRIRHCRHIIORCCIROI;
      private T next;
      private boolean hasNext;
      private boolean OOIOIOHOHIOIOORRHRICCROHCIICRI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterable<T> var1, Predicate<T> var2) {
         this.ORCRICCIOCORCOCCHRICRHCRCHOOIO = var1.iterator();
         this.CHIIHOHIHORIIRIRHCRHIIORCCIROI = var2;
      }

      @Override
      public boolean hasNext() {
         if (this.OOIOIOHOHIOIOORRHRICCROHCIICRI) {
            return this.hasNext;
         }

         while (this.ORCRICCIOCORCOCCHRICRHCRCHOOIO.hasNext()) {
            Object var1 = this.ORCRICCIOCORCOCCHRICRHCRCHOOIO.next();
            if (this.CHIIHOHIHORIIRIRHCRHIIORCCIROI.test((T)var1)) {
               this.next = (T)var1;
               this.hasNext = true;
               this.OOIOIOHOHIOIOORRHRICCROHCIICRI = true;
               return true;
            }
         }

         this.next = null;
         this.hasNext = false;
         this.OOIOIOHOHIOIOORRHRICCROHCIICRI = true;
         return false;
      }

      @Override
      public T next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         Object var1 = this.next;
         this.next = null;
         this.hasNext = false;
         this.OOIOIOHOHIOIOORRHRICCROHCIICRI = false;
         return (T)var1;
      }
   }
}
