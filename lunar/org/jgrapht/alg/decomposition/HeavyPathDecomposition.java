package org.jgrapht.alg.decomposition;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.TreeToPathDecompositionAlgorithm;
import org.jgrapht.util.VertexToIntegerMapping;

public class HeavyPathDecomposition<V, E> implements TreeToPathDecompositionAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final Set<V> roots;
   private Map<V, Integer> vertexMap;
   private List<V> indexList;
   private int[] sizeSubtree;
   private int[] parent;
   private int[] depth;
   private int[] component;
   private int[] path;
   private int[] lengthPath;
   private int[] positionInPath;
   private int[] firstNodeInPath;
   private int numberOfPaths;
   private List<List<V>> paths;
   private Set<E> heavyEdges;
   private Set<E> lightEdges;

   public HeavyPathDecomposition(Graph<V, E> var1, V var2) {
      this(var1, Collections.singleton(Objects.requireNonNull((V)var2, "root cannot be null")));
   }

   public HeavyPathDecomposition(Graph<V, E> var1, Set<V> var2) {
      this.graph = Objects.requireNonNull(var1, "input tree/forrest cannot be null");
      this.roots = Objects.requireNonNull(var2, "set of roots cannot be null");
      this.decompose();
   }

   private void allocateArrays() {
      int var1 = this.graph.vertexSet().size();
      this.sizeSubtree = new int[var1];
      this.parent = new int[var1];
      this.depth = new int[var1];
      this.component = new int[var1];
      this.path = new int[var1];
      this.lengthPath = new int[var1];
      this.positionInPath = new int[var1];
      this.heavyEdges = new HashSet<>();
      this.lightEdges = new HashSet<>();
   }

   private void normalizeGraph() {
      VertexToIntegerMapping var1 = Graphs.getVertexToIntegerMapping(this.graph);
      this.vertexMap = var1.getVertexMap();
      this.indexList = var1.getIndexList();
   }

   private void dfsIterative(int var1, int var2) {
      HashSet var3 = new HashSet();
      ArrayDeque var4 = new ArrayDeque();
      var4.push(var1);

      while (!var4.isEmpty()) {
         var1 = (Integer)var4.poll();
         if (!var3.contains(var1)) {
            var3.add(var1);
            var4.push(var1);
            this.component[var1] = var2;
            this.sizeSubtree[var1] = 1;
            Object var12 = this.indexList.get(var1);

            for (Object var14 : this.graph.edgesOf((V)var12)) {
               int var15 = this.vertexMap.get(Graphs.getOppositeVertex(this.graph, (E)var14, (V)var12));
               if (!var3.contains(var15)) {
                  this.parent[var15] = var1;
                  this.depth[var15] = this.depth[var1] + 1;
                  var4.push(var15);
               }
            }
         } else {
            int var5 = -1;
            Object var6 = null;
            Object var7 = this.indexList.get(var1);

            for (Object var9 : this.graph.edgesOf((V)var7)) {
               int var10 = this.vertexMap.get(Graphs.getOppositeVertex(this.graph, (E)var9, (V)var7));
               if (var10 != this.parent[var1]) {
                  this.sizeSubtree[var1] = this.sizeSubtree[var1] + this.sizeSubtree[var10];
                  if (var5 == -1 || this.sizeSubtree[var5] < this.sizeSubtree[var10]) {
                     var5 = var10;
                     var6 = var9;
                  }

                  this.lightEdges.add((E)var9);
               }
            }

            if (var5 == -1) {
               this.path[var1] = this.numberOfPaths++;
            } else {
               this.path[var1] = this.path[var5];
               if (2 * this.sizeSubtree[var5] > this.sizeSubtree[var1]) {
                  this.heavyEdges.add((E)var6);
                  this.lightEdges.remove(var6);
               }
            }

            this.positionInPath[var1] = this.lengthPath[this.path[var1]]++;
         }
      }
   }

   private void decompose() {
      if (this.path == null) {
         this.normalizeGraph();
         this.allocateArrays();
         Arrays.fill(this.parent, -1);
         Arrays.fill(this.path, -1);
         Arrays.fill(this.depth, -1);
         Arrays.fill(this.component, -1);
         Arrays.fill(this.positionInPath, -1);
         int var1 = 0;

         for (Object var3 : this.roots) {
            Integer var4 = this.vertexMap.get(var3);
            if (var4 == null) {
               throw new IllegalArgumentException("root: " + var3 + " not contained in graph");
            }

            if (this.component[var4] != -1) {
               throw new IllegalArgumentException("multiple roots in the same tree");
            }

            this.dfsIterative(var4, var1++);
         }

         this.firstNodeInPath = new int[this.numberOfPaths];

         for (int var6 = 0; var6 < this.graph.vertexSet().size(); var6++) {
            if (this.path[var6] != -1) {
               this.positionInPath[var6] = this.lengthPath[this.path[var6]] - this.positionInPath[var6] - 1;
               if (this.positionInPath[var6] == 0) {
                  this.firstNodeInPath[this.path[var6]] = var6;
               }
            }
         }

         ArrayList var7 = new ArrayList(this.numberOfPaths);

         for (int var8 = 0; var8 < this.numberOfPaths; var8++) {
            ArrayList var11 = new ArrayList(this.lengthPath[var8]);

            for (int var5 = 0; var5 < this.lengthPath[var8]; var5++) {
               var11.add(null);
            }

            var7.add(var11);
         }

         for (int var9 = 0; var9 < this.graph.vertexSet().size(); var9++) {
            if (this.path[var9] != -1) {
               ((List)var7.get(this.path[var9])).set(this.positionInPath[var9], this.indexList.get(var9));
            }
         }

         for (int var10 = 0; var10 < this.numberOfPaths; var10++) {
            var7.set(var10, Collections.unmodifiableList((List)var7.get(var10)));
         }

         this.paths = Collections.unmodifiableList(var7);
         this.heavyEdges = Collections.unmodifiableSet(this.heavyEdges);
      }
   }

   public Set<E> getHeavyEdges() {
      return this.heavyEdges;
   }

   public Set<E> getLightEdges() {
      return this.lightEdges;
   }

   @Override
   public TreeToPathDecompositionAlgorithm.PathDecomposition<V, E> getPathDecomposition() {
      return new TreeToPathDecompositionAlgorithm.PathDecompositionImpl<>(this.graph, this.getHeavyEdges(), this.paths);
   }

   public HeavyPathDecomposition<V, E>.InternalState getInternalState() {
      return new HeavyPathDecomposition.InternalState();
   }

   public class InternalState {
      public V getParent(V var1) {
         int var2 = HeavyPathDecomposition.this.vertexMap.getOrDefault(var1, -1);
         return var2 != -1 && HeavyPathDecomposition.this.parent[var2] != -1
            ? HeavyPathDecomposition.this.indexList.get(HeavyPathDecomposition.this.parent[var2])
            : null;
      }

      public int getDepth(V var1) {
         int var2 = HeavyPathDecomposition.this.vertexMap.getOrDefault(var1, -1);
         return var2 == -1 ? -1 : HeavyPathDecomposition.this.depth[var2];
      }

      public int getSizeSubtree(V var1) {
         int var2 = HeavyPathDecomposition.this.vertexMap.getOrDefault(var1, -1);
         return var2 == -1 ? 0 : HeavyPathDecomposition.this.sizeSubtree[var2];
      }

      public int getComponent(V var1) {
         int var2 = HeavyPathDecomposition.this.vertexMap.getOrDefault(var1, -1);
         return var2 == -1 ? -1 : HeavyPathDecomposition.this.component[var2];
      }

      public Map<V, Integer> getVertexMap() {
         return Collections.unmodifiableMap(HeavyPathDecomposition.this.vertexMap);
      }

      public List<V> getIndexList() {
         return Collections.unmodifiableList(HeavyPathDecomposition.this.indexList);
      }

      public int[] getDepthArray() {
         return HeavyPathDecomposition.this.depth;
      }

      public int[] getSizeSubtreeArray() {
         return HeavyPathDecomposition.this.sizeSubtree;
      }

      public int[] getComponentArray() {
         return HeavyPathDecomposition.this.component;
      }

      public int[] getPathArray() {
         return HeavyPathDecomposition.this.path;
      }

      public int[] getPositionInPathArray() {
         return HeavyPathDecomposition.this.positionInPath;
      }

      public int[] getFirstNodeInPathArray() {
         return HeavyPathDecomposition.this.firstNodeInPath;
      }

      public int[] getParentArray() {
         return HeavyPathDecomposition.this.parent;
      }
   }
}
