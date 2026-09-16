package org.jgrapht.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrefetchIterator<E> implements Enumeration<E>, Iterator<E> {
   private PrefetchIterator.NextElementFunctor<E> innerEnum;
   private E getNextLastResult;
   private boolean isGetNextLastResultUpToDate = false;
   private boolean endOfEnumerationReached = false;
   private boolean flagIsEnumerationStartedEmpty = true;
   private int innerFunctorUsageCounter = 0;

   public PrefetchIterator(PrefetchIterator.NextElementFunctor<E> var1) {
      this.innerEnum = var1;
   }

   private E getNextElementFromInnerFunctor() {
      this.innerFunctorUsageCounter++;
      Object var1 = this.innerEnum.nextElement();
      this.flagIsEnumerationStartedEmpty = false;
      return (E)var1;
   }

   @Override
   public E nextElement() {
      Object var1;
      if (this.isGetNextLastResultUpToDate) {
         var1 = this.getNextLastResult;
      } else {
         var1 = this.getNextElementFromInnerFunctor();
      }

      this.isGetNextLastResultUpToDate = false;
      return (E)var1;
   }

   @Override
   public boolean hasMoreElements() {
      if (this.endOfEnumerationReached) {
         return false;
      }

      if (this.isGetNextLastResultUpToDate) {
         return true;
      }

      try {
         this.getNextLastResult = this.getNextElementFromInnerFunctor();
         this.isGetNextLastResultUpToDate = true;
         return true;
      } catch (NoSuchElementException var2) {
         this.endOfEnumerationReached = true;
         return false;
      }
   }

   public boolean isEnumerationStartedEmpty() {
      return this.innerFunctorUsageCounter == 0 ? !this.hasMoreElements() : this.flagIsEnumerationStartedEmpty;
   }

   @Override
   public boolean hasNext() {
      return this.hasMoreElements();
   }

   @Override
   public E next() {
      return this.nextElement();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   public interface NextElementFunctor<EE> {
      EE nextElement();
   }
}
