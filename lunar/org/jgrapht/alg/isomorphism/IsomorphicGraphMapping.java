package org.jgrapht.alg.isomorphism;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;
import org.jgrapht.util.CollectionUtil;

public class IsomorphicGraphMapping<V, E> implements GraphMapping<V, E> {
   public static final int NULL_NODE = -1;
   private final Map<V, V> forwardMapping;
   private final Map<V, V> backwardMapping;
   private final Graph<V, E> graph1;
   private final Graph<V, E> graph2;

   public IsomorphicGraphMapping(GraphOrdering<V, E> var1, GraphOrdering<V, E> var2, int[] var3, int[] var4) {
      this.graph1 = var1.getGraph();
      this.graph2 = var2.getGraph();
      this.forwardMapping = CollectionUtil.newHashMapWithExpectedSize(this.graph1.vertexSet().size());
      this.backwardMapping = CollectionUtil.newHashMapWithExpectedSize(this.graph1.vertexSet().size());

      for (Object var6 : this.graph1.vertexSet()) {
         int var7 = var1.getVertexNumber(var6);
         int var8 = var3[var7];
         if (var8 != -1) {
            this.forwardMapping.put((V)var6, (V)var2.getVertex(var8));
         }
      }

      for (Object var10 : this.graph2.vertexSet()) {
         int var11 = var2.getVertexNumber(var10);
         int var12 = var4[var11];
         if (var12 != -1) {
            this.backwardMapping.put((V)var10, (V)var1.getVertex(var12));
         }
      }
   }

   public IsomorphicGraphMapping(Map<V, V> var1, Map<V, V> var2, Graph<V, E> var3, Graph<V, E> var4) {
      this.forwardMapping = Objects.requireNonNull(var1);
      this.backwardMapping = Objects.requireNonNull(var2);
      this.graph1 = Objects.requireNonNull(var3);
      this.graph2 = Objects.requireNonNull(var4);
   }

   @Override
   public V getVertexCorrespondence(V var1, boolean var2) {
      return var2 ? this.forwardMapping.get(var1) : this.backwardMapping.get(var1);
   }

   @Override
   public E getEdgeCorrespondence(E var1, boolean var2) {
      Graph var3;
      Graph var4;
      if (var2) {
         var3 = this.graph1;
         var4 = this.graph2;
      } else {
         var3 = this.graph2;
         var4 = this.graph1;
      }

      Object var5 = var3.getEdgeSource(var1);
      Object var6 = var3.getEdgeTarget(var1);
      Object var7 = this.getVertexCorrespondence((V)var5, var2);
      if (var7 == null) {
         return null;
      }

      Object var8 = this.getVertexCorrespondence((V)var6, var2);
      return (E)(var8 == null ? null : var4.getEdge(var7, var8));
   }

   public Map<V, V> getForwardMapping() {
      return Collections.unmodifiableMap(this.forwardMapping);
   }

   public Map<V, V> getBackwardMapping() {
      return Collections.unmodifiableMap(this.backwardMapping);
   }

   public Set<V> getMappingDomain() {
      return Collections.unmodifiableSet(this.forwardMapping.keySet());
   }

   public Set<V> getMappingRange() {
      return Collections.unmodifiableSet(this.backwardMapping.keySet());
   }

   public boolean hasVertexCorrespondence(V var1) {
      return this.getVertexCorrespondence((V)var1, true) != null;
   }

   public boolean hasEdgeCorrespondence(E var1) {
      return this.getEdgeCorrespondence((E)var1, true) != null;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         IsomorphicGraphMapping var2 = (IsomorphicGraphMapping)var1;
         return Objects.equals(this.forwardMapping, var2.forwardMapping)
            && Objects.equals(this.backwardMapping, var2.backwardMapping)
            && this.graph1 == var2.graph1
            && this.graph2 == var2.graph2;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.forwardMapping, this.backwardMapping, System.identityHashCode(this.graph1), System.identityHashCode(this.graph2));
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[");
      Set var2 = this.graph1.vertexSet();
      TreeMap var3 = new TreeMap();

      for (Object var5 : var2) {
         var3.put(var5.toString(), var5);
      }

      int var8 = 0;

      for (Entry var6 : var3.entrySet()) {
         Object var7 = this.getVertexCorrespondence((V)var6.getValue(), true);
         var1.append(var8++ == 0 ? "" : " ").append((String)var6.getKey()).append("=").append(var7 == null ? "~~" : var7);
      }

      return var1 + "]";
   }

   public boolean isValidIsomorphism() {
      for (Object var2 : this.graph1.vertexSet()) {
         if (!this.forwardMapping.containsKey(var2) || !this.graph2.containsVertex(this.forwardMapping.get(var2))) {
            return false;
         }
      }

      for (Object var9 : this.graph2.vertexSet()) {
         if (!this.backwardMapping.containsKey(var9) || !this.graph1.containsVertex(this.backwardMapping.get(var9))) {
            return false;
         }
      }

      for (Object var10 : this.graph1.edgeSet()) {
         Object var3 = this.getEdgeCorrespondence((E)var10, true);
         Object var4 = this.graph1.getEdgeSource((E)var3);
         Object var5 = this.graph1.getEdgeTarget((E)var3);
         if (!this.graph2.containsEdge((V)var4, (V)var5)) {
            return false;
         }
      }

      for (Object var11 : this.graph2.edgeSet()) {
         Object var12 = this.getEdgeCorrespondence((E)var11, false);
         Object var13 = this.graph2.getEdgeSource((E)var12);
         Object var14 = this.graph2.getEdgeTarget((E)var12);
         if (!this.graph1.containsEdge((V)var13, (V)var14)) {
            return false;
         }
      }

      return true;
   }

   public boolean isEqualMapping(GraphMapping<V, E> var1) {
      for (Object var3 : this.graph2.vertexSet()) {
         if (!this.getVertexCorrespondence((V)var3, false).equals(var1.getVertexCorrespondence(var3, false))) {
            return false;
         }
      }

      return true;
   }

   public IsomorphicGraphMapping<V, E> compose(IsomorphicGraphMapping<V, E> var1) {
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(this.forwardMapping.size());
      HashMap var3 = CollectionUtil.newHashMapWithExpectedSize(this.forwardMapping.size());

      for (Object var5 : this.graph1.vertexSet()) {
         Object var6 = var1.getVertexCorrespondence(this.forwardMapping.get(var5), true);
         var2.put(var5, var6);
         var3.put(var6, var5);
      }

      return new IsomorphicGraphMapping<>(var2, var3, this.graph1, var1.graph2);
   }

   public static <V, E> IsomorphicGraphMapping<V, E> identity(Graph<V, E> var0) {
      HashMap var1 = CollectionUtil.newHashMapWithExpectedSize(var0.vertexSet().size());
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(var0.vertexSet().size());

      for (Object var4 : var0.vertexSet()) {
         var1.put(var4, var4);
         var2.put(var4, var4);
      }

      return new IsomorphicGraphMapping<>(var1, var2, var0, var0);
   }
}
