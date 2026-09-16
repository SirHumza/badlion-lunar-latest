package org.tritonus.share;

import java.util.Collection;

public class StringHashedSet<E> extends ArraySet<E> {
   private static final long serialVersionUID = 1L;

   public StringHashedSet() {
   }

   public StringHashedSet(Collection<E> var1) {
      super(var1);
   }

   @Override
   public boolean add(E var1) {
      return var1 == null ? false : super.add((E)var1);
   }

   @Override
   public boolean contains(Object var1) {
      if (var1 == null) {
         return false;
      }

      String var2 = var1.toString();

      for (Object var4 : this) {
         if (var2.equals(var4.toString())) {
            return true;
         }
      }

      return false;
   }

   public E get(Object var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = var1.toString();

      for (Object var4 : this) {
         if (var2.equals(var4.toString())) {
            return (E)var4;
         }
      }

      return null;
   }
}
