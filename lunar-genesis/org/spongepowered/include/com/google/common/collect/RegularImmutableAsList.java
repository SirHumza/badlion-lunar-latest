package org.spongepowered.include.com.google.common.collect;

import java.util.function.Consumer;

class RegularImmutableAsList<E> extends ImmutableAsList<E> {
   private final ImmutableCollection<E> delegate;
   private final ImmutableList<? extends E> delegateList;

   RegularImmutableAsList(ImmutableCollection<E> var1, ImmutableList<? extends E> var2) {
      this.delegate = var1;
      this.delegateList = var2;
   }

   RegularImmutableAsList(ImmutableCollection<E> var1, Object[] var2) {
      this(var1, ImmutableList.asImmutableList(var2));
   }

   @Override
   ImmutableCollection<E> delegateCollection() {
      return this.delegate;
   }

   @Override
   public UnmodifiableListIterator<E> listIterator(int var1) {
      return (UnmodifiableListIterator<E>)this.delegateList.listIterator(var1);
   }

   @Override
   public void forEach(Consumer<? super E> var1) {
      this.delegateList.forEach(var1);
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      return this.delegateList.copyIntoArray(var1, var2);
   }

   @Override
   public E get(int var1) {
      return (E)this.delegateList.get(var1);
   }
}
