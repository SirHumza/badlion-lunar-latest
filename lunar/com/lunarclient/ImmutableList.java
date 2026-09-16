package com.lunarclient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

public class ImmutableList<T> extends ImmutableCollection<T> implements List<T> {
   private final List<T> inner;

   public ImmutableList(List<T> var1) {
      super(var1);
      this.inner = var1;
   }

   @Override
   public boolean addAll(int var1, @NotNull Collection<? extends T> var2) {
      throw new UnsupportedOperationException("List is immutable!");
   }

   @Override
   public T get(int var1) {
      return null;
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
      return this.inner.indexOf(var1);
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.inner.lastIndexOf(var1);
   }

   @NotNull
   @Override
   public ListIterator<T> listIterator() {
      return new ImmutableListIterator<>(this.inner.listIterator());
   }

   @NotNull
   @Override
   public ListIterator<T> listIterator(int var1) {
      return new ImmutableListIterator<>(this.inner.listIterator(var1));
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
