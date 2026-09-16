package org.jgrapht.graph;

import java.util.Set;
import org.jgrapht.Graph;

public class ParanoidGraph<V, E> extends GraphDelegator<V, E> {
   private static final long serialVersionUID = 5075284167422166539L;

   public ParanoidGraph(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      verifyAdd(this.edgeSet(), (E)var3);
      return super.addEdge((V)var1, (V)var2, (E)var3);
   }

   @Override
   public boolean addVertex(V var1) {
      verifyAdd(this.vertexSet(), (V)var1);
      return super.addVertex((V)var1);
   }

   private static <T> void verifyAdd(Set<T> var0, T var1) {
      for (Object var3 : var0) {
         if (var3 != var1 && var3.equals(var1) && var3.hashCode() != var1.hashCode()) {
            throw new IllegalArgumentException(
               "ParanoidGraph detected objects o1 (hashCode="
                  + var3.hashCode()
                  + ") and o2 (hashCode="
                  + var1.hashCode()
                  + ") where o1.equals(o2) but o1.hashCode() != o2.hashCode()"
            );
         }
      }
   }
}
