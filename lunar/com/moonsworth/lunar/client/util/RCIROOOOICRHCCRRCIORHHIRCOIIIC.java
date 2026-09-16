package com.moonsworth.lunar.client.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class RCIROOOOICRHCCRRCIORHHIRCOIIIC<T> implements Iterator<T> {
   private final Iterator<T> ORICHRIHHIHHIHIHRCOORRCHOCHIII;
   private final Predicate<T> OCRRHRRHOOHCOHHOIHIIORHHROHICR;
   private T nextElement;

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC(Collection<T> var1, Predicate<T> var2) {
      this(var1.iterator(), var2);
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC(Iterator<T> var1, Predicate<T> var2) {
      this.ORICHRIHHIHHIHIHRCOORRCHOCHIII = var1;
      this.OCRRHRRHOOHCOHHOIHIIORHHROHICR = var2;
   }

   @Override
   public final boolean hasNext() {
      return this.nextElement != null || this.RHOOHOHOCOHRIOHRRROCIOORHOICII();
   }

   @Override
   public final T next() {
      if (this.nextElement == null && !this.RHOOHOHOCOHRIOHRRROCIOORHOICII()) {
         throw new NoSuchElementException();
      }

      Object var1 = this.nextElement;
      this.nextElement = null;
      return (T)var1;
   }

   private boolean RHOOHOHOCOHRIOHRRROCIOORHOICII() {
      while (this.ORICHRIHHIHHIHIHRCOORRCHOCHIII.hasNext()) {
         Object var1 = this.ORICHRIHHIHHIHIHRCOORRCHOCHIII.next();
         if (this.OCRRHRRHOOHCOHHOIHIIORHHROHICR.test((T)var1)) {
            this.nextElement = (T)var1;
            return true;
         }
      }

      return false;
   }

   @Override
   public final void remove() {
      if (this.nextElement != null) {
         throw new IllegalStateException("remove() cannot be called");
      }

      this.ORICHRIHHIHHIHIHRCOORRCHOCHIII.remove();
   }
}
