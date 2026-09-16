package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.spongepowered.include.com.google.common.base.Preconditions;

public interface Multiset<E> extends Collection<E> {
   @Override
   int size();

   Set<E> elementSet();

   Set<Multiset.Entry<E>> entrySet();

   @Override
   default void forEach(Consumer<? super E> var1) {
      Preconditions.checkNotNull(var1);
      this.entrySet().forEach(var1x -> {
         Object var2 = var1x.getElement();
         int var3 = var1x.getCount();

         for (int var4 = 0; var4 < var3; var4++) {
            var1.accept(var2);
         }
      });
   }

   @Override
   default Spliterator<E> spliterator() {
      return Multisets.spliteratorImpl(this);
   }

   interface Entry<E> {
      E getElement();

      int getCount();
   }
}
