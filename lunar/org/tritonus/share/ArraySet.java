package org.tritonus.share;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class ArraySet<E> extends ArrayList<E> implements Set<E> {
   private static final long serialVersionUID = 1L;

   public ArraySet() {
   }

   public ArraySet(Collection<E> var1) {
      this();
      this.addAll(var1);
   }

   @Override
   public boolean add(E var1) {
      if (!this.contains(var1)) {
         super.add((E)var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void add(int var1, E var2) {
      throw new UnsupportedOperationException("ArraySet.add(int index, Object element) unsupported");
   }

   @Override
   public E set(int var1, E var2) {
      throw new UnsupportedOperationException("ArraySet.set(int index, Object element) unsupported");
   }
}
