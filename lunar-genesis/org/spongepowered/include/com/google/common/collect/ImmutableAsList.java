package org.spongepowered.include.com.google.common.collect;

abstract class ImmutableAsList<E> extends ImmutableList<E> {
   abstract ImmutableCollection<E> delegateCollection();

   @Override
   public boolean contains(Object var1) {
      return this.delegateCollection().contains(var1);
   }

   @Override
   public int size() {
      return this.delegateCollection().size();
   }

   @Override
   public boolean isEmpty() {
      return this.delegateCollection().isEmpty();
   }
}
