package com.llamalad7.mixinextras.sugar.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SingleIterationList<T> implements List<T> {
   private final List<T> delegate;
   private final int allowedIteration;
   private int iteration;

   public SingleIterationList(List<T> var1, int var2) {
      this.delegate = var1;
      this.allowedIteration = var2;
   }

   @Override
   public Iterator<T> iterator() {
      return this.iteration++ == this.allowedIteration ? this.delegate.iterator() : Collections.emptyIterator();
   }

   @Override
   public int size() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isEmpty() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean contains(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object[] toArray() {
      throw new UnsupportedOperationException();
   }

   @Override
   public <T1> T1[] toArray(T1[] var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean add(T var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean addAll(Collection<? extends T> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean addAll(int var1, Collection<? extends T> var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public T get(int var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public T set(int var1, T var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void add(int var1, T var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public T remove(int var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int indexOf(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int lastIndexOf(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public ListIterator<T> listIterator() {
      throw new UnsupportedOperationException();
   }

   @Override
   public ListIterator<T> listIterator(int var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public List<T> subList(int var1, int var2) {
      throw new UnsupportedOperationException();
   }
}
