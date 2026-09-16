package org.jgrapht.graph;

import java.util.Map;

public class UniformIntrusiveEdgesSpecifics<V, E> extends BaseIntrusiveEdgesSpecifics<V, E, IntrusiveEdge> implements IntrusiveEdgesSpecifics<V, E> {
   private static final long serialVersionUID = -5736320893697031114L;

   public UniformIntrusiveEdgesSpecifics(Map<E, IntrusiveEdge> var1) {
      super(var1);
   }

   @Override
   public boolean add(E var1, V var2, V var3) {
      if (var1 instanceof IntrusiveEdge) {
         return this.addIntrusiveEdge((E)var1, (V)var2, (V)var3, (IntrusiveEdge)var1);
      } else {
         int var4 = this.edgeMap.size();
         IntrusiveEdge var5 = this.edgeMap.computeIfAbsent((E)var1, var0 -> new IntrusiveEdge());
         if (var4 < this.edgeMap.size()) {
            var5.source = var2;
            var5.target = var3;
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   protected IntrusiveEdge getIntrusiveEdge(E var1) {
      return var1 instanceof IntrusiveEdge ? (IntrusiveEdge)var1 : this.edgeMap.get(var1);
   }
}
