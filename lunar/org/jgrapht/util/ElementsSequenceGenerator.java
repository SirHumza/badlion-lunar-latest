package org.jgrapht.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class ElementsSequenceGenerator<T> implements Iterable<T>, Iterator<T> {
   private List<T> elements;
   private Random rng;

   public ElementsSequenceGenerator(Collection<T> var1) {
      this(var1, System.nanoTime());
   }

   public ElementsSequenceGenerator(Collection<T> var1, long var2) {
      this(var1, new Random(var2));
   }

   public ElementsSequenceGenerator(Collection<T> var1, Random var2) {
      this.elements = new ArrayList<>(var1);
      this.rng = var2;
   }

   @Override
   public boolean hasNext() {
      return !this.elements.isEmpty();
   }

   @Override
   public T next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      int var1 = this.rng.nextInt(this.elements.size());
      Object var2 = this.elements.get(var1);
      this.elements.set(var1, this.elements.get(this.elements.size() - 1));
      this.elements.remove(this.elements.size() - 1);
      return (T)var2;
   }

   @Override
   public Iterator<T> iterator() {
      return this;
   }
}
