package com.lunarclient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

public class SafeList<T> implements List<T> {
   private final List<BetterJson> innerList;
   private final List<T> valueCache;
   private final Function<BetterJson, T> mapper;

   public SafeList(List<BetterJson> var1, Function<BetterJson, T> var2) {
      this.innerList = var1;
      this.valueCache = new ArrayList<>();
      this.mapper = var2;
   }

   @Override
   public T get(int var1) {
      while (this.valueCache.size() <= var1) {
         this.valueCache.add(null);
      }

      Object var2 = this.valueCache.get(var1);
      if (var2 == null) {
         BetterJson var3 = this.innerList.size() > var1 ? this.innerList.get(var1) : new BetterJson(null);
         var2 = this.mapper.apply(var3);
         this.valueCache.set(var1, (T)var2);
      }

      return (T)var2;
   }

   public T find(Predicate<T> var1) {
      for (Object var3 : this) {
         if (var1.test(var3)) {
            return (T)var3;
         }
      }

      return this.mapper.apply(new BetterJson(null));
   }

   @Override
   public int size() {
      return this.innerList.size();
   }

   @Override
   public boolean isEmpty() {
      return this.innerList.isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      return this.valueCache.contains(var1);
   }

   @NotNull
   @Override
   public Iterator<T> iterator() {
      return new Iterator<T>() {
         private int i = 0;

         @Override
         public boolean hasNext() {
            return this.i < SafeList.this.innerList.size();
         }

         @Override
         public T next() {
            return (T)SafeList.this.get(this.i++);
         }
      };
   }

   @NotNull
   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.innerList.size()];

      for (int var2 = 0; var2 < this.innerList.size(); var2++) {
         var1[var2] = this.innerList.get(var2);
      }

      return var1;
   }

   @NotNull
   @Override
   public <T1> T1[] toArray(@NotNull T1[] var1) {
      Object[] var2 = var1;
      if (var1.length < this.innerList.size()) {
         var2 = new Object[this.innerList.size()];
      }

      for (int var3 = 0; var3 < this.innerList.size(); var3++) {
         var2[var3] = this.mapper.apply(this.innerList.get(var3));
      }

      return (T1[])var2;
   }

   @Override
   public boolean add(T var1) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public boolean containsAll(@NotNull Collection<?> var1) {
      return this.valueCache.containsAll(var1);
   }

   @Override
   public boolean addAll(@NotNull Collection<? extends T> var1) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public boolean addAll(int var1, @NotNull Collection<? extends T> var2) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public boolean removeAll(@NotNull Collection<?> var1) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public boolean retainAll(@NotNull Collection<?> var1) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public T set(int var1, T var2) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public void add(int var1, T var2) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public T remove(int var1) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public int indexOf(Object var1) {
      return this.valueCache.indexOf(var1);
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.valueCache.lastIndexOf(var1);
   }

   @NotNull
   @Override
   public ListIterator<T> listIterator() {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < this.innerList.size(); var2++) {
         var1.add(this.get(var2));
      }

      return new ImmutableListIterator<>(var1.listIterator());
   }

   @NotNull
   @Override
   public ListIterator<T> listIterator(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < this.innerList.size(); var3++) {
         var2.add(this.get(var3));
      }

      return new ImmutableListIterator<>(var2.listIterator(var1));
   }

   @NotNull
   @Override
   public List<T> subList(int var1, int var2) {
      ArrayList var3 = new ArrayList();

      for (int var4 = var1; var4 < var2; var4++) {
         var3.add(this.get(var4));
      }

      return new ImmutableList<>(var3);
   }
}
