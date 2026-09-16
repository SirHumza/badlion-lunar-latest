package org.jgrapht.alg.lca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LowestCommonAncestorAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.UnionFind;

public class TarjanLCAFinder<V, E> implements LowestCommonAncestorAlgorithm<V> {
   private Graph<V, E> graph;
   private Set<V> roots;
   private UnionFind<V> unionFind;
   private Map<V, V> ancestors;
   private Set<V> blackNodes;
   private HashMap<V, Set<Integer>> queryOccurs;
   private List<V> lowestCommonAncestors;
   private List<Pair<V, V>> queries;

   public TarjanLCAFinder(Graph<V, E> var1, V var2) {
      this(var1, Collections.singleton(Objects.requireNonNull((V)var2, "root cannot be null")));
   }

   public TarjanLCAFinder(Graph<V, E> var1, Set<V> var2) {
      this.graph = Objects.requireNonNull(var1, "graph cannot be null");
      this.roots = Objects.requireNonNull(var2, "roots cannot be null");
      if (this.roots.isEmpty()) {
         throw new IllegalArgumentException("roots cannot be empty");
      }

      if (!var1.vertexSet().containsAll(var2)) {
         throw new IllegalArgumentException("at least one root is not a valid vertex");
      }
   }

   @Override
   public V getLCA(V var1, V var2) {
      return this.getBatchLCA(Collections.singletonList(Pair.of((V)var1, (V)var2))).get(0);
   }

   @Override
   public List<V> getBatchLCA(List<Pair<V, V>> var1) {
      return this.computeTarjan(var1);
   }

   private void initialize() {
      this.unionFind = new UnionFind<>(Collections.emptySet());
      this.ancestors = new HashMap<>();
      this.blackNodes = new HashSet();
   }

   private void clear() {
      this.unionFind = null;
      this.ancestors = null;
      this.blackNodes = null;
      this.queryOccurs = null;
      this.queries = null;
      this.lowestCommonAncestors = null;
   }

   private List<V> computeTarjan(List<Pair<V, V>> var1) {
      this.initialize();
      this.queries = var1;
      this.lowestCommonAncestors = new ArrayList(var1.size());
      this.queryOccurs = new HashMap<>();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         Object var3 = this.queries.get(var2).getFirst();
         Object var4 = this.queries.get(var2).getSecond();
         if (!this.graph.containsVertex((V)var3)) {
            throw new IllegalArgumentException("invalid vertex: " + var3);
         }

         if (!this.graph.containsVertex((V)var4)) {
            throw new IllegalArgumentException("invalid vertex: " + var4);
         }

         if (var3.equals(var4)) {
            this.lowestCommonAncestors.add((V)var3);
         } else {
            this.queryOccurs.computeIfAbsent((V)var3, var0 -> new HashSet<>()).add(var2);
            this.queryOccurs.computeIfAbsent((V)var4, var0 -> new HashSet<>()).add(var2);
            this.lowestCommonAncestors.add(null);
         }
      }

      HashSet var5 = new HashSet();

      for (Object var8 : this.roots) {
         if (var5.contains(var8)) {
            throw new IllegalArgumentException("multiple roots in the same tree");
         }

         this.blackNodes.clear();
         this.computeTarjanOLCA((V)var8, null, var5);
      }

      List var7 = this.lowestCommonAncestors;
      this.clear();
      return var7;
   }

   private void computeTarjanOLCA(V var1, V var2, Set<V> var3) {
      var3.add(var1);
      this.unionFind.addElement((V)var1);
      this.ancestors.put((V)var1, (V)var1);

      for (Object var5 : this.graph.outgoingEdgesOf((V)var1)) {
         Object var6 = Graphs.getOppositeVertex(this.graph, (E)var5, (V)var1);
         if (!var6.equals(var2)) {
            this.computeTarjanOLCA((V)var6, (V)var1, var3);
            this.unionFind.union((V)var1, (V)var6);
            this.ancestors.put(this.unionFind.find((V)var1), (V)var1);
         }
      }

      this.blackNodes.add((V)var1);

      for (int var9 : this.queryOccurs.computeIfAbsent((V)var1, var0 -> new HashSet<>())) {
         Pair var10 = this.queries.get(var9);
         Object var7;
         if (var10.getFirst().equals(var1)) {
            var7 = var10.getSecond();
         } else {
            var7 = var10.getFirst();
         }

         if (this.blackNodes.contains(var7)) {
            this.lowestCommonAncestors.set(var9, this.ancestors.get(this.unionFind.find((V)var7)));
         }
      }
   }

   @Override
   public Set<V> getLCASet(V var1, V var2) {
      throw new UnsupportedOperationException();
   }
}
