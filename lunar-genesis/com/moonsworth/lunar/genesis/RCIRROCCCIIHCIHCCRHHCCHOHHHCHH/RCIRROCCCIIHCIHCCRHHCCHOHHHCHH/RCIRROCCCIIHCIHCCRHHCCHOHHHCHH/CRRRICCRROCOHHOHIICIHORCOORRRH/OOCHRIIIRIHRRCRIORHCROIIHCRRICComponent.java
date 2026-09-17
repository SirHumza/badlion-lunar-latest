package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class COOCCHICCCIIICRHIOCOCIOOORCOCC<E> extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<E> implements List<E> {
   protected COOCCHICCCIIICRHIOCOCIOOORCOCC() {
   }

   protected abstract List<E> delegate();

   @Override
   public void add(int var1, E var2) {
      this.delegate().add(var1, (E)var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean addAll(int var1, Collection<? extends E> var2) {
      return this.delegate().addAll(var1, var2);
   }

   @Override
   public E get(int var1) {
      return this.delegate().get(var1);
   }

   @Override
   public int indexOf(Object var1) {
      return this.delegate().indexOf(var1);
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.delegate().lastIndexOf(var1);
   }

   @Override
   public ListIterator<E> listIterator() {
      return this.delegate().listIterator();
   }

   @Override
   public ListIterator<E> listIterator(int var1) {
      return this.delegate().listIterator(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public E remove(int var1) {
      return this.delegate().remove(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public E set(int var1, E var2) {
      return this.delegate().set(var1, (E)var2);
   }

   @Override
   public List<E> subList(int var1, int var2) {
      return this.delegate().subList(var1, var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return var1 == this || this.delegate().equals(var1);
   }

   @Override
   public int hashCode() {
      return this.delegate().hashCode();
   }

   protected boolean standardAdd(E var1) {
      this.add(this.size(), (E)var1);
      return true;
   }

   protected boolean standardAddAll(int var1, Iterable<? extends E> var2) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.addAllImpl(this, var1, var2);
   }

   protected int standardIndexOf(@Nullable Object var1) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.indexOfImpl(this, var1);
   }

   protected int standardLastIndexOf(@Nullable Object var1) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.lastIndexOfImpl(this, var1);
   }

   protected Iterator<E> standardIterator() {
      return this.listIterator();
   }

   protected ListIterator<E> standardListIterator() {
      return this.listIterator(0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected ListIterator<E> standardListIterator(int var1) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.listIteratorImpl(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected List<E> standardSubList(int var1, int var2) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.subListImpl(this, var1, var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected boolean standardEquals(@Nullable Object var1) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.equalsImpl(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected int standardHashCode() {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.hashCodeImpl(this);
   }
}
