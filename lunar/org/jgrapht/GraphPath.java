package org.jgrapht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public interface GraphPath<V, E> {
   Graph<V, E> getGraph();

   V getStartVertex();

   V getEndVertex();

   default List<E> getEdgeList() {
      List var1 = this.getVertexList();
      if (var1.size() < 2) {
         return Collections.emptyList();
      }

      Graph var2 = this.getGraph();
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();
      Object var5 = var4.next();

      while (var4.hasNext()) {
         Object var6 = var4.next();
         var3.add(var2.getEdge(var5, var6));
         var5 = var6;
      }

      return var3;
   }

   default List<V> getVertexList() {
      List var1 = this.getEdgeList();
      if (var1.isEmpty()) {
         Object var7 = this.getStartVertex();
         return var7 != null && var7.equals(this.getEndVertex()) ? Collections.singletonList((V)var7) : Collections.emptyList();
      }

      Graph var2 = this.getGraph();
      ArrayList var3 = new ArrayList();
      Object var4 = this.getStartVertex();
      var3.add(var4);

      for (Object var6 : var1) {
         var4 = Graphs.getOppositeVertex(var2, var6, var4);
         var3.add(var4);
      }

      return var3;
   }

   double getWeight();

   default int getLength() {
      return this.getEdgeList().size();
   }
}
