package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.traverse.DepthFirstIterator;

public class CycleDetector<V, E> {
   private Graph<V, E> graph;

   public CycleDetector(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1);
   }

   public boolean detectCycles() {
      try {
         this.execute(null, null);
         return false;
      } catch (CycleDetector.CycleDetectedException var2) {
         return true;
      }
   }

   public boolean detectCyclesContainingVertex(V var1) {
      try {
         this.execute(null, (V)var1);
         return false;
      } catch (CycleDetector.CycleDetectedException var3) {
         return true;
      }
   }

   public Set<V> findCycles() {
      KosarajuStrongConnectivityInspector var1 = new KosarajuStrongConnectivityInspector<>(this.graph);
      List var2 = var1.stronglyConnectedSets();
      LinkedHashSet var3 = new LinkedHashSet();

      for (Set var5 : var2) {
         if (var5.size() > 1) {
            var3.addAll(var5);
         } else {
            Object var6 = var5.iterator().next();
            if (this.graph.containsEdge((V)var6, (V)var6)) {
               var3.add(var6);
            }
         }
      }

      return var3;
   }

   public Set<V> findCyclesContainingVertex(V var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      this.execute(var2, (V)var1);
      return var2;
   }

   private void execute(Set<V> var1, V var2) {
      CycleDetector.ProbeIterator var3 = new CycleDetector.ProbeIterator<>(this.graph, var1, (V)var2);

      while (var3.hasNext()) {
         var3.next();
      }
   }

   private static class CycleDetectedException extends RuntimeException {
      private static final long serialVersionUID = 3834305137802950712L;
   }

   private static class ProbeIterator<V, E> extends DepthFirstIterator<V, E> {
      private List<V> path = new ArrayList();
      private Set<V> cycleSet;
      private V root;

      ProbeIterator(Graph<V, E> var1, Set<V> var2, V var3) {
         super(var1, (V)var3);
         this.cycleSet = var2;
         this.root = (V)var3;
      }

      @Override
      protected void encounterVertexAgain(V var1, E var2) {
         super.encounterVertexAgain((V)var1, (E)var2);
         int var3;
         if (this.root != null) {
            if (var1.equals(this.root)) {
               var3 = 0;
            } else {
               if (this.cycleSet == null || !this.cycleSet.contains(var1)) {
                  return;
               }

               var3 = 0;
            }
         } else {
            var3 = this.path.indexOf(var1);
         }

         if (var3 > -1) {
            if (this.cycleSet == null) {
               throw new CycleDetector.CycleDetectedException();
            }

            while (var3 < this.path.size()) {
               this.cycleSet.add(this.path.get(var3));
               var3++;
            }
         }
      }

      @Override
      protected V provideNextVertex() {
         Object var1 = super.provideNextVertex();

         for (int var2 = this.path.size() - 1; var2 >= 0 && !this.graph.containsEdge(this.path.get(var2), (V)var1); var2--) {
            this.path.remove(var2);
         }

         this.path.add((V)var1);
         return (V)var1;
      }
   }
}
