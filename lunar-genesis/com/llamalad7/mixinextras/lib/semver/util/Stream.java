package com.llamalad7.mixinextras.lib.semver.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stream<E> implements Iterable<E> {
   private final E[] elements;
   private int offset = 0;

   public Stream(E[] var1) {
      this.elements = (E[])((Object[])var1.clone());
   }

   public E consume() {
      return this.offset >= this.elements.length ? null : this.elements[this.offset++];
   }

   @SafeVarargs
   public final <T extends Stream.ElementType<E>> E consume(T... var1) {
      Object var2 = this.lookahead(1);

      for (Stream.ElementType var6 : var1) {
         if (var6.isMatchedBy(var2)) {
            return this.consume();
         }
      }

      throw new UnexpectedElementException(var2, this.offset, var1);
   }

   public E lookahead(int var1) {
      int var2 = this.offset + var1 - 1;
      return var2 < this.elements.length ? this.elements[var2] : null;
   }

   public int currentOffset() {
      return this.offset;
   }

   @SafeVarargs
   public final <T extends Stream.ElementType<E>> boolean positiveLookahead(T... var1) {
      for (Stream.ElementType var5 : var1) {
         if (var5.isMatchedBy(this.lookahead(1))) {
            return true;
         }
      }

      return false;
   }

   @SafeVarargs
   public final <T extends Stream.ElementType<E>> boolean positiveLookaheadBefore(Stream.ElementType<E> var1, T... var2) {
      for (int var4 = 1; var4 <= this.elements.length; var4++) {
         Object var3 = this.lookahead(var4);
         if (var1.isMatchedBy(var3)) {
            break;
         }

         for (Stream.ElementType var8 : var2) {
            if (var8.isMatchedBy(var3)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public Iterator<E> iterator() {
      return new Iterator<E>() {
         private int index = Stream.this.offset;

         @Override
         public boolean hasNext() {
            return this.index < Stream.this.elements.length;
         }

         @Override
         public E next() {
            if (this.index >= Stream.this.elements.length) {
               throw new NoSuchElementException();
            } else {
               return Stream.this.elements[this.index++];
            }
         }

         @Override
         public void remove() {
            throw new UnsupportedOperationException();
         }
      };
   }

   public interface ElementType<E> {
      boolean isMatchedBy(E var1);
   }
}
