package org.jgrapht.util;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ArrayUnenforcedSet<E> extends ArrayList<E> implements Set<E> {
   private static final long serialVersionUID = -7413250161201811238L;

   public ArrayUnenforcedSet() {
   }

   public ArrayUnenforcedSet(Collection<? extends E> var1) {
      super(var1);
   }

   public ArrayUnenforcedSet(int var1) {
      super(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return new ArrayUnenforcedSet.SetForEquality().equals(var1);
   }

   @Override
   public int hashCode() {
      return new ArrayUnenforcedSet.SetForEquality().hashCode();
   }

   private class SetForEquality extends AbstractSet<E> {
      @Override
      public Iterator<E> iterator() {
         return ArrayUnenforcedSet.this.iterator();
      }

      @Override
      public int size() {
         return ArrayUnenforcedSet.this.size();
      }
   }
}
