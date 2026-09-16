package org.jgrapht.graph;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import org.jgrapht.Graph;
import org.jgrapht.util.TypeUtil;

class MaskEdgeSet<V, E> extends AbstractSet<E> implements Serializable {
   private static final long serialVersionUID = 4208908842850100708L;
   private final Graph<V, E> graph;
   private final Set<E> edgeSet;
   private final Predicate<V> vertexMask;
   private final Predicate<E> edgeMask;

   public MaskEdgeSet(Graph<V, E> var1, Set<E> var2, Predicate<V> var3, Predicate<E> var4) {
      this.graph = var1;
      this.edgeSet = var2;
      this.vertexMask = var3;
      this.edgeMask = var4;
   }

   @Override
   public boolean contains(Object var1) {
      if (!this.edgeSet.contains(var1)) {
         return false;
      }

      Object var2 = TypeUtil.uncheckedCast(var1);
      return !this.edgeMask.test((E)var2)
         && !this.vertexMask.test(this.graph.getEdgeSource((E)var2))
         && !this.vertexMask.test(this.graph.getEdgeTarget((E)var2));
   }

   @Override
   public Iterator<E> iterator() {
      return this.edgeSet
         .stream()
         .filter(
            var1 -> !this.edgeMask.test((E)var1)
               && !this.vertexMask.test(this.graph.getEdgeSource((E)var1))
               && !this.vertexMask.test(this.graph.getEdgeTarget((E)var1))
         )
         .iterator();
   }

   @Override
   public int size() {
      return (int)this.edgeSet
         .stream()
         .filter(
            var1 -> !this.edgeMask.test((E)var1)
               && !this.vertexMask.test(this.graph.getEdgeSource((E)var1))
               && !this.vertexMask.test(this.graph.getEdgeTarget((E)var1))
         )
         .count();
   }

   @Override
   public boolean isEmpty() {
      return !this.iterator().hasNext();
   }
}
