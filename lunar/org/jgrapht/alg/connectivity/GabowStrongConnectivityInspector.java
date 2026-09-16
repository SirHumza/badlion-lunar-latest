package org.jgrapht.alg.connectivity;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;

public class GabowStrongConnectivityInspector<V, E> extends AbstractStrongConnectivityInspector<V, E> {
   private Deque<GabowStrongConnectivityInspector.VertexNumber<V>> stackS = new ArrayDeque<>();
   private Deque<GabowStrongConnectivityInspector.VertexNumber<V>> stackB = new ArrayDeque<>();
   private Map<V, GabowStrongConnectivityInspector.VertexNumber<V>> vertexToVertexNumber;
   private int c;

   public GabowStrongConnectivityInspector(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public List<Set<V>> stronglyConnectedSets() {
      if (this.stronglyConnectedSets == null) {
         this.stronglyConnectedSets = new ArrayList<>();
         this.createVertexNumber();

         for (GabowStrongConnectivityInspector.VertexNumber var2 : this.vertexToVertexNumber.values()) {
            if (var2.number == 0) {
               this.dfsVisit(var2);
            }
         }

         this.vertexToVertexNumber = null;
         this.stackS = null;
         this.stackB = null;
      }

      return this.stronglyConnectedSets;
   }

   private void createVertexNumber() {
      this.c = this.graph.vertexSet().size();
      this.vertexToVertexNumber = CollectionUtil.newHashMapWithExpectedSize(this.c);

      for (Object var2 : this.graph.vertexSet()) {
         this.vertexToVertexNumber.put((V)var2, new GabowStrongConnectivityInspector.VertexNumber<>((V)var2));
      }

      this.stackS = new ArrayDeque<>(this.c);
      this.stackB = new ArrayDeque<>(this.c);
   }

   private void dfsVisit(GabowStrongConnectivityInspector.VertexNumber<V> var1) {
      this.stackS.push(var1);
      var1.number = this.stackS.size();
      this.stackB.push(var1);

      for (Object var3 : this.graph.outgoingEdgesOf(var1.vertex)) {
         GabowStrongConnectivityInspector.VertexNumber var4 = this.vertexToVertexNumber.get(this.graph.getEdgeTarget((E)var3));
         if (var4.number == 0) {
            this.dfsVisit(var4);
         } else {
            while (var4.number < this.stackB.peek().number) {
               this.stackB.pop();
            }
         }
      }

      if (var1 == this.stackB.peek()) {
         this.stackB.pop();
         this.c++;
         Set var5 = this.createSCCVertexSetAndNumberVertices(var1);
         this.stronglyConnectedSets.add(var5);
      }
   }

   private Set<V> createSCCVertexSetAndNumberVertices(GabowStrongConnectivityInspector.VertexNumber<V> var1) {
      int var2 = this.stackS.size() - var1.number + 1;
      Set var3;
      if (var2 == 1) {
         GabowStrongConnectivityInspector.VertexNumber var4 = this.stackS.pop();
         var3 = Collections.singleton(var4.vertex);
         var4.number = this.c;
      } else {
         var3 = CollectionUtil.newHashSetWithExpectedSize(var2);

         for (int var6 = 0; var6 < var2; var6++) {
            GabowStrongConnectivityInspector.VertexNumber var5 = this.stackS.pop();
            var3.add(var5.vertex);
            var5.number = this.c;
         }
      }

      return var3;
   }

   private static final class VertexNumber<V> {
      private final V vertex;
      private int number = 0;

      private VertexNumber(V var1) {
         this.vertex = (V)var1;
      }
   }
}
