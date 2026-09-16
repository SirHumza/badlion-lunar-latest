package org.jgrapht.alg.isomorphism;

import java.util.Comparator;
import org.jgrapht.Graph;

class VF2GraphMappingIterator<V, E> extends VF2MappingIterator<V, E> {
   public VF2GraphMappingIterator(GraphOrdering<V, E> var1, GraphOrdering<V, E> var2, Comparator<V> var3, Comparator<E> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   protected IsomorphicGraphMapping<V, E> match() {
      VF2State var1;
      if (this.stateStack.isEmpty()) {
         Graph var2 = this.ordering1.getGraph();
         Graph var3 = this.ordering2.getGraph();
         if (var2.vertexSet().size() != var3.vertexSet().size() || var2.edgeSet().size() != var3.edgeSet().size()) {
            return null;
         }

         var1 = new VF2GraphIsomorphismState<>(this.ordering1, this.ordering2, this.vertexComparator, this.edgeComparator);
         if (var3.vertexSet().isEmpty()) {
            return this.hadOneMapping != null ? null : var1.getCurrentMapping();
         }
      } else {
         this.stateStack.pop().backtrack();
         var1 = this.stateStack.pop();
      }

      while (true) {
         while (!var1.nextPair()) {
            if (this.stateStack.isEmpty()) {
               return null;
            }

            var1.backtrack();
            var1 = this.stateStack.pop();
         }

         if (var1.isFeasiblePair()) {
            this.stateStack.push(var1);
            var1 = new VF2GraphIsomorphismState(var1);
            var1.addPair();
            if (var1.isGoal()) {
               this.stateStack.push(var1);
               return var1.getCurrentMapping();
            }

            var1.resetAddVertexes();
         }
      }
   }
}
