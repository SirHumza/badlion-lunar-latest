package org.jgrapht.alg.lca;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.decomposition.HeavyPathDecomposition;
import org.jgrapht.alg.interfaces.LowestCommonAncestorAlgorithm;

public class HeavyPathLCAFinder<V, E> implements LowestCommonAncestorAlgorithm<V> {
   private final Graph<V, E> graph;
   private final Set<V> roots;
   private int[] parent;
   private int[] depth;
   private int[] path;
   private int[] positionInPath;
   private int[] component;
   private int[] firstNodeInPath;
   private Map<V, Integer> vertexMap;
   private List<V> indexList;

   public HeavyPathLCAFinder(Graph<V, E> var1, V var2) {
      this(var1, Collections.singleton(Objects.requireNonNull((V)var2, "root cannot be null")));
   }

   public HeavyPathLCAFinder(Graph<V, E> var1, Set<V> var2) {
      this.graph = Objects.requireNonNull(var1, "graph cannot be null");
      this.roots = Objects.requireNonNull(var2, "roots cannot be null");
      if (this.roots.isEmpty()) {
         throw new IllegalArgumentException("roots cannot be empty");
      }

      if (!var1.vertexSet().containsAll(var2)) {
         throw new IllegalArgumentException("at least one root is not a valid vertex");
      }

      this.computeHeavyPathDecomposition();
   }

   private void computeHeavyPathDecomposition() {
      HeavyPathDecomposition var1 = new HeavyPathDecomposition<>(this.graph, this.roots);
      HeavyPathDecomposition.InternalState var2 = var1.getInternalState();
      this.vertexMap = var2.getVertexMap();
      this.indexList = var2.getIndexList();
      this.parent = var2.getParentArray();
      this.depth = var2.getDepthArray();
      this.component = var2.getComponentArray();
      this.firstNodeInPath = var2.getFirstNodeInPathArray();
      this.path = var2.getPathArray();
      this.positionInPath = var2.getPositionInPathArray();
   }

   @Override
   public V getLCA(V var1, V var2) {
      int var3 = this.vertexMap.getOrDefault(var1, -1);
      if (var3 == -1) {
         throw new IllegalArgumentException("invalid vertex: " + var1);
      }

      int var4 = this.vertexMap.getOrDefault(var2, -1);
      if (var4 == -1) {
         throw new IllegalArgumentException("invalid vertex: " + var2);
      }

      if (var1.equals(var2)) {
         return (V)var1;
      }

      int var5 = this.component[var3];
      int var6 = this.component[var4];
      if (var5 == var6 && var5 != -1) {
         int var7 = this.path[var3];
         int var8 = this.path[var4];

         while (var7 != var8) {
            int var9 = this.firstNodeInPath[var7];
            int var10 = this.firstNodeInPath[var8];
            if (this.depth[var9] < this.depth[var10]) {
               var4 = this.parent[var10];
               var8 = this.path[var4];
            } else {
               var3 = this.parent[var9];
               var7 = this.path[var3];
            }
         }

         return this.positionInPath[var3] < this.positionInPath[var4] ? this.indexList.get(var3) : this.indexList.get(var4);
      } else {
         return null;
      }
   }

   @Override
   public Set<V> getLCASet(V var1, V var2) {
      throw new UnsupportedOperationException();
   }
}
