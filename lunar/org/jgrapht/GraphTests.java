package org.jgrapht;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.alg.connectivity.BiconnectivityInspector;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.alg.cycle.BergeGraphInspector;
import org.jgrapht.alg.cycle.ChordalityInspector;
import org.jgrapht.alg.cycle.HierholzerEulerianCycle;
import org.jgrapht.alg.cycle.WeakChordalityInspector;
import org.jgrapht.alg.interfaces.PartitioningAlgorithm;
import org.jgrapht.alg.partition.BipartitePartitioning;
import org.jgrapht.alg.planar.BoyerMyrvoldPlanarityInspector;

public abstract class GraphTests {
   private static final String GRAPH_CANNOT_BE_NULL = "Graph cannot be null";
   private static final String GRAPH_MUST_BE_DIRECTED_OR_UNDIRECTED = "Graph must be directed or undirected";
   private static final String GRAPH_MUST_BE_UNDIRECTED = "Graph must be undirected";
   private static final String GRAPH_MUST_BE_DIRECTED = "Graph must be directed";
   private static final String GRAPH_MUST_BE_WEIGHTED = "Graph must be weighted";

   public static <V, E> boolean isEmpty(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return var0.edgeSet().isEmpty();
   }

   public static <V, E> boolean isSimple(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      GraphType var1 = var0.getType();
      if (var1.isSimple()) {
         return true;
      }

      for (Object var3 : var0.vertexSet()) {
         HashSet var4 = new HashSet();

         for (Object var6 : var0.outgoingEdgesOf(var3)) {
            Object var7 = Graphs.getOppositeVertex(var0, var6, var3);
            if (var7.equals(var3) || !var4.add(var7)) {
               return false;
            }
         }
      }

      return true;
   }

   public static <V, E> boolean hasSelfLoops(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      if (!var0.getType().isAllowingSelfLoops()) {
         return false;
      }

      for (Object var2 : var0.edgeSet()) {
         if (var0.getEdgeSource(var2).equals(var0.getEdgeTarget(var2))) {
            return true;
         }
      }

      return false;
   }

   public static <V, E> boolean hasMultipleEdges(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      if (!var0.getType().isAllowingMultipleEdges()) {
         return false;
      }

      for (Object var2 : var0.vertexSet()) {
         HashSet var3 = new HashSet();

         for (Object var5 : var0.outgoingEdgesOf(var2)) {
            Object var6 = Graphs.getOppositeVertex(var0, var5, var2);
            if (!var3.add(var6)) {
               return true;
            }
         }
      }

      return false;
   }

   public static <V, E> boolean isComplete(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      int var1 = var0.vertexSet().size();
      int var2;
      if (var0.getType().isDirected()) {
         var2 = Math.multiplyExact(var1, var1 - 1);
      } else {
         if (!var0.getType().isUndirected()) {
            throw new IllegalArgumentException("Graph must be directed or undirected");
         }

         if (var1 % 2 == 0) {
            var2 = Math.multiplyExact(var1 / 2, var1 - 1);
         } else {
            var2 = Math.multiplyExact(var1, (var1 - 1) / 2);
         }
      }

      return var0.edgeSet().size() == var2 && isSimple(var0);
   }

   public static <V, E> boolean isConnected(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new ConnectivityInspector(var0).isConnected();
   }

   public static <V, E> boolean isBiconnected(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new BiconnectivityInspector(var0).isBiconnected();
   }

   public static <V, E> boolean isWeaklyConnected(Graph<V, E> var0) {
      return isConnected(var0);
   }

   public static <V, E> boolean isStronglyConnected(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return var0.getType().isUndirected() ? isConnected(var0) : new KosarajuStrongConnectivityInspector(var0).isStronglyConnected();
   }

   public static <V, E> boolean isTree(Graph<V, E> var0) {
      if (!var0.getType().isUndirected()) {
         throw new IllegalArgumentException("Graph must be undirected");
      } else {
         return var0.edgeSet().size() == var0.vertexSet().size() - 1 && isConnected(var0);
      }
   }

   public static <V, E> boolean isForest(Graph<V, E> var0) {
      if (!var0.getType().isUndirected()) {
         throw new IllegalArgumentException("Graph must be undirected");
      }

      if (var0.vertexSet().isEmpty()) {
         return false;
      }

      int var1 = new ConnectivityInspector(var0).connectedSets().size();
      return var0.edgeSet().size() + var1 == var0.vertexSet().size();
   }

   public static <V, E> boolean isOverfull(Graph<V, E> var0) {
      int var1 = var0.vertexSet().stream().mapToInt(var0::degreeOf).max().getAsInt();
      return var0.edgeSet().size() > var1 * Math.floor(var0.vertexSet().size() / 2.0);
   }

   public static <V, E> boolean isSplit(Graph<V, E> var0) {
      requireUndirected(var0);
      if (isSimple(var0) && !var0.vertexSet().isEmpty()) {
         ArrayList var1 = new ArrayList(var0.vertexSet().size());
         var1.addAll(var0.vertexSet().stream().map(var0::degreeOf).collect(Collectors.toList()));
         Collections.sort(var1, Collections.reverseOrder());
         int var2 = 1;

         while (var2 < var1.size() && var1.get(var2) >= var2) {
            var2++;
         }

         var2--;
         int var3 = 0;

         for (int var4 = 0; var4 <= var2; var4++) {
            var3 += var1.get(var4);
         }

         int var7 = var2 * (var2 + 1);

         for (int var5 = var2 + 1; var5 < var1.size(); var5++) {
            var7 += var1.get(var5);
         }

         return var3 == var7;
      } else {
         return false;
      }
   }

   public static <V, E> boolean isBipartite(Graph<V, E> var0) {
      return new BipartitePartitioning(var0).isBipartite();
   }

   public static <V, E> boolean isBipartitePartition(Graph<V, E> var0, Set<? extends V> var1, Set<? extends V> var2) {
      return new BipartitePartitioning<V, E>(var0).isValidPartitioning(new PartitioningAlgorithm.PartitioningImpl<>(Arrays.asList(var1, var2)));
   }

   public static <V, E> boolean isCubic(Graph<V, E> var0) {
      for (Object var2 : var0.vertexSet()) {
         if (var0.degreeOf(var2) != 3) {
            return false;
         }
      }

      return true;
   }

   public static <V, E> boolean isEulerian(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new HierholzerEulerianCycle().isEulerian(var0);
   }

   public static <V, E> boolean isChordal(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new ChordalityInspector(var0).isChordal();
   }

   public static <V, E> boolean isWeaklyChordal(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new WeakChordalityInspector(var0).isWeaklyChordal();
   }

   public static <V, E> boolean hasOreProperty(Graph<V, E> var0) {
      requireUndirected(var0);
      int var1 = var0.vertexSet().size();
      if (var0.getType().isSimple() && var1 >= 3) {
         ArrayList var2 = new ArrayList<>(var0.vertexSet());

         for (int var3 = 0; var3 < var2.size(); var3++) {
            for (int var4 = var3 + 1; var4 < var2.size(); var4++) {
               Object var5 = var2.get(var3);
               Object var6 = var2.get(var4);
               if (!var5.equals(var6) && !var0.containsEdge(var5, var6) && var0.degreeOf(var5) + var0.degreeOf(var6) < var1) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static <V, E> boolean isTriangleFree(Graph<V, E> var0) {
      return GraphMetrics.getNumberOfTriangles(var0) == 0L;
   }

   public static <V, E> boolean isPerfect(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new BergeGraphInspector().isBerge(var0);
   }

   public static <V, E> boolean isPlanar(Graph<V, E> var0) {
      Objects.requireNonNull(var0, "Graph cannot be null");
      return new BoyerMyrvoldPlanarityInspector(var0).isPlanar();
   }

   public static <V, E> boolean isKuratowskiSubdivision(Graph<V, E> var0) {
      return isK33Subdivision(var0) || isK5Subdivision(var0);
   }

   public static <V, E> boolean isK33Subdivision(Graph<V, E> var0) {
      ArrayList var1 = new ArrayList();

      for (Object var3 : var0.vertexSet()) {
         int var4 = var0.degreeOf(var3);
         if (var4 == 3) {
            var1.add(var3);
         } else if (var4 != 2) {
            return false;
         }
      }

      if (var1.size() != 6) {
         return false;
      }

      Object var5 = var1.remove(var1.size() - 1);
      Set var6 = reachableWithDegree(var0, var5, 3);
      if (var6.size() != 3) {
         return false;
      }

      var1.removeAll(var6);
      return var6.equals(reachableWithDegree(var0, var1.get(0), 3)) && var6.equals(reachableWithDegree(var0, var1.get(1), 3));
   }

   public static <V, E> boolean isK5Subdivision(Graph<V, E> var0) {
      HashSet var1 = new HashSet();

      for (Object var3 : var0.vertexSet()) {
         int var4 = var0.degreeOf(var3);
         if (var4 == 4) {
            var1.add(var3);
         } else if (var4 != 2) {
            return false;
         }
      }

      if (var1.size() != 5) {
         return false;
      }

      for (Object var6 : var1) {
         Set var7 = reachableWithDegree(var0, var6, 4);
         if (var7.size() != 4 || !var1.containsAll(var7) || var7.contains(var6)) {
            return false;
         }
      }

      return true;
   }

   private static <V, E> Set<V> reachableWithDegree(Graph<V, E> var0, V var1, int var2) {
      HashSet var3 = new HashSet();
      HashSet var4 = new HashSet();
      ArrayDeque var5 = new ArrayDeque();
      var5.add(var1);

      while (!var5.isEmpty()) {
         Object var6 = var5.poll();
         var3.add(var6);

         for (Object var8 : var0.edgesOf(var6)) {
            Object var9 = Graphs.getOppositeVertex(var0, var8, var6);
            if (!var3.contains(var9)) {
               if (var0.degreeOf(var9) == var2) {
                  var4.add(var9);
               } else {
                  var5.add(var9);
               }
            }
         }
      }

      return var4;
   }

   public static <V, E> Graph<V, E> requireDirected(Graph<V, E> var0, String var1) {
      if (var0 == null) {
         throw new NullPointerException("Graph cannot be null");
      } else if (!var0.getType().isDirected()) {
         throw new IllegalArgumentException(var1);
      } else {
         return var0;
      }
   }

   public static <V, E> Graph<V, E> requireDirected(Graph<V, E> var0) {
      return requireDirected(var0, "Graph must be directed");
   }

   public static <V, E> Graph<V, E> requireUndirected(Graph<V, E> var0, String var1) {
      if (var0 == null) {
         throw new NullPointerException("Graph cannot be null");
      } else if (!var0.getType().isUndirected()) {
         throw new IllegalArgumentException(var1);
      } else {
         return var0;
      }
   }

   public static <V, E> Graph<V, E> requireUndirected(Graph<V, E> var0) {
      return requireUndirected(var0, "Graph must be undirected");
   }

   public static <V, E> Graph<V, E> requireDirectedOrUndirected(Graph<V, E> var0, String var1) {
      if (var0 == null) {
         throw new NullPointerException("Graph cannot be null");
      } else if (!var0.getType().isDirected() && !var0.getType().isUndirected()) {
         throw new IllegalArgumentException(var1);
      } else {
         return var0;
      }
   }

   public static <V, E> Graph<V, E> requireDirectedOrUndirected(Graph<V, E> var0) {
      return requireDirectedOrUndirected(var0, "Graph must be directed or undirected");
   }

   public static <V, E> Graph<V, E> requireWeighted(Graph<V, E> var0) {
      if (var0 == null) {
         throw new NullPointerException("Graph cannot be null");
      } else if (!var0.getType().isWeighted()) {
         throw new IllegalArgumentException("Graph must be weighted");
      } else {
         return var0;
      }
   }
}
