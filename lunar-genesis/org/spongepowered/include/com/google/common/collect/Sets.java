package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Sets {
   public static <E> HashSet<E> newHashSet() {
      return new HashSet<>();
   }

   public static <E> HashSet<E> newHashSet(E... var0) {
      HashSet var1 = newHashSetWithExpectedSize(var0.length);
      Collections.addAll(var1, (E[])var0);
      return var1;
   }

   public static <E> HashSet<E> newHashSetWithExpectedSize(int var0) {
      return new HashSet<>(Maps.capacity(var0));
   }

   static int hashCodeImpl(Set<?> var0) {
      int var1 = 0;

      for (Object var3 : var0) {
         var1 += var3 != null ? var3.hashCode() : 0;
         var1 = ~(~var1);
      }

      return var1;
   }

   static boolean equalsImpl(Set<?> var0, @Nullable Object var1) {
      if (var0 == var1) {
         return true;
      }

      if (var1 instanceof Set) {
         Set var2 = (Set)var1;

         try {
            return var0.size() == var2.size() && var0.containsAll(var2);
         } catch (NullPointerException var4) {
            return false;
         } catch (ClassCastException var5) {
            return false;
         }
      } else {
         return false;
      }
   }

   public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> var0) {
      return !(var0 instanceof ImmutableSortedSet) && !(var0 instanceof Sets.UnmodifiableNavigableSet) ? new Sets.UnmodifiableNavigableSet<>(var0) : var0;
   }

   static boolean removeAllImpl(Set<?> var0, Iterator<?> var1) {
      boolean var2 = false;

      while (var1.hasNext()) {
         var2 |= var0.remove(var1.next());
      }

      return var2;
   }

   static boolean removeAllImpl(Set<?> var0, Collection<?> var1) {
      Preconditions.checkNotNull(var1);
      if (var1 instanceof Multiset) {
         var1 = ((Multiset)var1).elementSet();
      }

      return var1 instanceof Set && var1.size() > var0.size() ? Iterators.removeAll(var0.iterator(), var1) : removeAllImpl(var0, var1.iterator());
   }

   abstract static class ImprovedAbstractSet<E> extends AbstractSet<E> {
      @Override
      public boolean removeAll(Collection<?> var1) {
         return Sets.removeAllImpl(this, var1);
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         return super.retainAll(Preconditions.checkNotNull(var1));
      }
   }

   static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements Serializable, NavigableSet<E> {
      private final NavigableSet<E> delegate;
      private transient Sets.UnmodifiableNavigableSet<E> descendingSet;

      UnmodifiableNavigableSet(NavigableSet<E> var1) {
         this.delegate = Preconditions.checkNotNull(var1);
      }

      @Override
      protected SortedSet<E> delegate() {
         return Collections.unmodifiableSortedSet(this.delegate);
      }

      @Override
      public E lower(E var1) {
         return this.delegate.lower((E)var1);
      }

      @Override
      public E floor(E var1) {
         return this.delegate.floor((E)var1);
      }

      @Override
      public E ceiling(E var1) {
         return this.delegate.ceiling((E)var1);
      }

      @Override
      public E higher(E var1) {
         return this.delegate.higher((E)var1);
      }

      @Override
      public E pollFirst() {
         throw new UnsupportedOperationException();
      }

      @Override
      public E pollLast() {
         throw new UnsupportedOperationException();
      }

      @Override
      public NavigableSet<E> descendingSet() {
         Sets.UnmodifiableNavigableSet var1 = this.descendingSet;
         if (var1 == null) {
            var1 = this.descendingSet = new Sets.UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            var1.descendingSet = this;
         }

         return var1;
      }

      @Override
      public Iterator<E> descendingIterator() {
         return Iterators.unmodifiableIterator(this.delegate.descendingIterator());
      }

      @Override
      public NavigableSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
         return Sets.unmodifiableNavigableSet(this.delegate.subSet((E)var1, var2, (E)var3, var4));
      }

      @Override
      public NavigableSet<E> headSet(E var1, boolean var2) {
         return Sets.unmodifiableNavigableSet(this.delegate.headSet((E)var1, var2));
      }

      @Override
      public NavigableSet<E> tailSet(E var1, boolean var2) {
         return Sets.unmodifiableNavigableSet(this.delegate.tailSet((E)var1, var2));
      }
   }
}
