package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class OOCHRIIIRIHRRCRIORHCROIIHCRRIC<E> extends HRHRORCIRICHCCCCCHICOOICIRHRIO implements Collection<E> {
   protected OOCHRIIIRIHRRCRIORHCROIIHCRRIC() {
   }

   protected abstract Collection<E> delegate();

   @Override
   public Iterator<E> iterator() {
      return this.delegate().iterator();
   }

   @Override
   public int size() {
      return this.delegate().size();
   }

   @CanIgnoreReturnValue
   @Override
   public boolean removeAll(Collection<?> var1) {
      return this.delegate().removeAll(var1);
   }

   @Override
   public boolean isEmpty() {
      return this.delegate().isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      return this.delegate().contains(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean add(E var1) {
      return this.delegate().add((E)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(Object var1) {
      return this.delegate().remove(var1);
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      return this.delegate().containsAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean addAll(Collection<? extends E> var1) {
      return this.delegate().addAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean retainAll(Collection<?> var1) {
      return this.delegate().retainAll(var1);
   }

   @Override
   public void clear() {
      this.delegate().clear();
   }

   @Override
   public Object[] toArray() {
      return this.delegate().toArray();
   }

   @CanIgnoreReturnValue
   @Override
   public <T> T[] toArray(T[] var1) {
      return (T[])this.delegate().toArray(var1);
   }

   protected boolean standardContains(@Nullable Object var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.contains(this.iterator(), var1);
   }

   protected boolean standardContainsAll(Collection<?> var1) {
      return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.containsAllImpl(this, var1);
   }

   protected boolean standardAddAll(Collection<? extends E> var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(this, var1.iterator());
   }

   protected boolean standardRemove(@Nullable Object var1) {
      Iterator var2 = this.iterator();

      while (var2.hasNext()) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var2.next(), var1
         )) {
            var2.remove();
            return true;
         }
      }

      return false;
   }

   protected boolean standardRemoveAll(Collection<?> var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.removeAll(this.iterator(), var1);
   }

   protected boolean standardRetainAll(Collection<?> var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.retainAll(this.iterator(), var1);
   }

   protected void standardClear() {
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.iterator());
   }

   protected boolean standardIsEmpty() {
      return !this.iterator().hasNext();
   }

   protected String standardToString() {
      return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.toStringImpl(this);
   }

   protected Object[] standardToArray() {
      Object[] var1 = new Object[this.size()];
      return this.toArray(var1);
   }

   protected <T> T[] standardToArray(T[] var1) {
      return (T[])IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(this, var1);
   }
}
