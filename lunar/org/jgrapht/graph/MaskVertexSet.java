package org.jgrapht.graph;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import org.jgrapht.util.TypeUtil;

class MaskVertexSet<V> extends AbstractSet<V> implements Serializable {
   private static final long serialVersionUID = 3751931017141472763L;
   private final Set<V> vertexSet;
   private final Predicate<V> mask;

   public MaskVertexSet(Set<V> var1, Predicate<V> var2) {
      this.vertexSet = var1;
      this.mask = var2;
   }

   @Override
   public boolean contains(Object var1) {
      if (!this.vertexSet.contains(var1)) {
         return false;
      }

      Object var2 = TypeUtil.uncheckedCast(var1);
      return !this.mask.test((V)var2);
   }

   @Override
   public Iterator<V> iterator() {
      return this.vertexSet.stream().filter(this.mask.negate()).iterator();
   }

   @Override
   public int size() {
      return (int)this.vertexSet.stream().filter(this.mask.negate()).count();
   }

   @Override
   public boolean isEmpty() {
      return !this.iterator().hasNext();
   }
}
