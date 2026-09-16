package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.generate.ComplementGraphGenerator;
import org.jgrapht.graph.AsUndirectedGraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.util.CollectionUtil;
import org.jgrapht.util.VertexToIntegerMapping;

public class WeakChordalityInspector<V, E> {
   private final int n;
   private final int m;
   private Graph<V, E> graph;
   private Map<V, Integer> vertices;
   private List<V> indices;
   private Boolean weaklyChordal = null;
   private GraphPath<V, E> certificate;

   public WeakChordalityInspector(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
      if (var1.getType().isDirected()) {
         this.graph = new AsUndirectedGraph<>(var1);
      }

      this.n = var1.vertexSet().size();
      this.m = var1.edgeSet().size();
      this.initMappings();
   }

   private void initMappings() {
      VertexToIntegerMapping var1 = new VertexToIntegerMapping<>(this.graph.vertexSet());
      this.vertices = var1.getVertexMap();
      this.indices = var1.getIndexList();
   }

   public boolean isWeaklyChordal() {
      return this.lazyComputeWeakChordality();
   }

   public GraphPath<V, E> getCertificate() {
      this.lazyComputeWeakChordality();
      return this.certificate;
   }

   private boolean lazyComputeWeakChordality() {
      if (this.weaklyChordal == null) {
         List var1 = this.computeGlobalSeparatorList();
         if (var1.size() > 0) {
            this.sortSeparatorsList(var1);
            int var3 = 1;
            List var4 = (List)((Pair)var1.get(0)).getFirst();
            List var5 = this.computeCoConnectedComponents(this.graph, var4);

            for (Pair var7 : var1) {
               if (this.unequalSeparators(var4, (List<Pair<Integer, Integer>>)var7.getFirst())) {
                  var4 = (List)var7.getFirst();
                  if (this.n + this.m < ++var3) {
                     return this.weaklyChordal = false;
                  }

                  var5 = this.computeCoConnectedComponents(this.graph, var4);
               }

               Pair var2;
               if ((var2 = this.checkLabels(var5, (List<Pair<Integer, Integer>>)var7.getFirst())) != null) {
                  Object var8 = var7.getSecond();
                  Object var9 = this.graph.getEdgeSource((E)var8);
                  Object var10 = this.graph.getEdgeTarget((E)var8);
                  Object var11 = this.indices.get((Integer)var2.getFirst());
                  Object var12 = this.indices.get((Integer)var2.getSecond());
                  if (!this.graph.containsEdge((V)var9, (V)var11)) {
                     Object var13 = var11;
                     var11 = var12;
                     var12 = var13;
                  }

                  if (this.graph.containsEdge((V)var11, (V)var12)) {
                     this.findAntiHole((V)var9, (V)var12);
                  } else {
                     this.findHole((V)var11, (V)var9, (V)var10, (V)var12);
                  }

                  return this.weaklyChordal = false;
               }
            }

            return this.weaklyChordal = true;
         } else {
            return this.weaklyChordal = true;
         }
      } else {
         return this.weaklyChordal;
      }
   }

   private List<Pair<List<Pair<Integer, Integer>>, E>> computeGlobalSeparatorList() {
      ArrayList var1 = new ArrayList();

      for (Object var3 : this.graph.edgeSet()) {
         Object var4 = this.graph.getEdgeSource((E)var3);
         Object var5 = this.graph.getEdgeTarget((E)var3);
         if (var4 != var5) {
            List var6 = this.findSeparators(this.graph, (E)var3);
            var1.addAll(this.reformatSeparatorList(var6, (E)var3));
         }
      }

      return var1;
   }

   private List<Pair<List<Pair<Integer, Integer>>, E>> reformatSeparatorList(List<Set<V>> var1, E var2) {
      List var3 = this.getLabeling((E)var2);
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList(this.n);

      for (int var6 = 0; var6 < this.n; var6++) {
         var5.add(new ArrayList());
      }

      for (Set var7 : var1) {
         ArrayList var8 = new ArrayList(var7.size());
         var4.add(new Pair<>(var8, var2));

         for (Object var10 : var7) {
            int var11 = this.vertices.get(var10);
            ((List)var5.get(var11)).add(var8);
         }
      }

      for (int var13 = 0; var13 < this.n; var13++) {
         for (List var16 : (List)var5.get(var13)) {
            var16.add(new Pair<>(var13, (Integer)var3.get(var13)));
         }
      }

      return var4;
   }

   private List<Integer> getLabeling(E var1) {
      Object var2 = this.graph.getEdgeSource((E)var1);
      Object var3 = this.graph.getEdgeTarget((E)var1);
      ArrayList var4 = new ArrayList<>(Collections.nCopies(this.n, null));

      for (Object var6 : this.graph.edgesOf((V)var2)) {
         var4.set(this.vertices.get(Graphs.getOppositeVertex(this.graph, (E)var6, (V)var2)), 1);
      }

      for (Object var9 : this.graph.edgesOf((V)var3)) {
         Integer var7 = this.vertices.get(Graphs.getOppositeVertex(this.graph, (E)var9, (V)var3));
         if (var4.get(var7) != null) {
            var4.set(var7, 3);
         } else {
            var4.set(var7, 2);
         }
      }

      return var4;
   }

   private void sortSeparatorsList(List<Pair<List<Pair<Integer, Integer>>, E>> var1) {
      ArrayDeque var2 = new ArrayDeque();
      int var3 = 0;

      for (Pair var5 : var1) {
         if (((List)var5.getFirst()).size() > var3) {
            var3 = ((List)var5.getFirst()).size();
         }

         var2.add(var5);
      }

      var1.clear();
      ArrayList var8 = new ArrayList(this.n);

      for (int var9 = 0; var9 < this.n; var9++) {
         var8.add(new LinkedList());
      }

      for (int var10 = 0; var10 < var3; var10++) {
         while (!var2.isEmpty()) {
            Pair var6 = (Pair)var2.remove();
            if (var10 >= ((List)var6.getFirst()).size()) {
               var1.add(var6);
            } else {
               ((Queue)var8.get((Integer)((Pair)((List)var6.getFirst()).get(((List)var6.getFirst()).size() - var10 - 1)).getFirst())).add(var6);
            }
         }

         for (Queue var7 : var8) {
            var2.addAll(var7);
            var7.clear();
         }
      }

      var1.addAll(var2);
   }

   private boolean unequalSeparators(List<Pair<Integer, Integer>> var1, List<Pair<Integer, Integer>> var2) {
      if (var1.size() == var2.size()) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            if (!((Integer)((Pair)var2.get(var3)).getFirst()).equals(((Pair)var1.get(var3)).getFirst())) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private List<List<Integer>> computeCoConnectedComponents(Graph<V, E> var1, List<Pair<Integer, Integer>> var2) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList(var2.size());

      for (int var5 = 0; var5 < var2.size(); var5++) {
         var4.add(new HashSet());
      }

      ArrayList var14 = new ArrayList<>(Collections.nCopies(this.n, -1));
      HashSet var6 = CollectionUtil.newHashSetWithExpectedSize(var2.size());
      var2.forEach(var2x -> {
         var6.add((Integer)var2x.getFirst());
         var14.set((Integer)var2x.getFirst(), 0);
      });
      var4.set(0, var6);

      label38:
      for (int var7 = 0; var6.size() > 0; var7 = 0) {
         ArrayList var8 = new ArrayList();

         while (true) {
            while (((Set)var4.get(var7)).isEmpty()) {
               if (++var7 == var8.size()) {
                  this.reload(var4, var14, var7);
                  var3.add(var8);
                  continue label38;
               }
            }

            Integer var9 = (Integer)((Set)var4.get(var7)).iterator().next();
            ((Set)var4.get(var7)).remove(var9);
            var8.add(var9);
            var14.set(var9, -1);

            for (Object var11 : var1.edgesOf(this.indices.get(var9))) {
               Integer var12 = this.vertices.get(Graphs.getOppositeVertex(var1, var11, this.indices.get(var9)));
               Integer var13 = (Integer)var14.get(var12);
               if (var13 != -1) {
                  this.putToNextBucket(var12, var13, var4, var14);
               }
            }
         }
      }

      return var3;
   }

   private void putToNextBucket(Integer var1, Integer var2, List<Set<Integer>> var3, List<Integer> var4) {
      ((Set)var3.get(var2)).remove(var1);
      ((Set)var3.get(var2 + 1)).add(var1);
      var4.set(var1, var2 + 1);
   }

   private void reload(List<Set<Integer>> var1, List<Integer> var2, int var3) {
      if (var3 != 0 && var3 < var1.size()) {
         Set var4 = (Set)var1.get(var3);

         for (Integer var6 : var4) {
            var2.set(var6, 0);
            ((Set)var1.get(0)).add(var6);
         }

         var4.clear();
      }
   }

   private Pair<Integer, Integer> checkLabels(List<List<Integer>> var1, List<Pair<Integer, Integer>> var2) {
      ArrayList var3 = new ArrayList<>(Collections.nCopies(this.n, null));

      for (Pair var5 : var2) {
         var3.set((Integer)var5.getFirst(), (Integer)var5.getSecond());
      }

      for (List var11 : var1) {
         int var6 = 0;
         Integer var7 = null;

         for (Integer var9 : var11) {
            if ((Integer)var3.get(var9) != 3) {
               if (var6 != 0) {
                  if (var6 != (Integer)var3.get(var9)) {
                     return new Pair<>(var7, var9);
                  }
               } else {
                  var6 = (Integer)var3.get(var9);
                  var7 = var9;
               }
            }
         }
      }

      return null;
   }

   private void findHole(V var1, V var2, V var3, V var4) {
      this.certificate = this.findHole(this.graph, (V)var1, (V)var2, (V)var3, (V)var4);
   }

   private void findAntiHole(V var1, V var2) {
      ComplementGraphGenerator var3 = new ComplementGraphGenerator<>(this.graph, false);
      Graph var4 = Pseudograph.<V, E>createBuilder(this.graph.getEdgeSupplier()).build();
      var3.generateGraph(var4);
      Object var5 = var4.getEdge(var1, var2);
      Object var6 = this.graph.getEdgeSource((E)var5);
      Object var7 = this.graph.getEdgeTarget((E)var5);
      List var8 = this.findSeparators(var4, (E)var5);
      List var9 = this.reformatSeparatorList(var8, (E)var5);
      this.sortSeparatorsList(var9);
      List var10 = (List)((Pair)var9.get(0)).getFirst();
      List var11 = this.computeCoConnectedComponents(var4, var10);

      for (Pair var14 : var9) {
         if (this.unequalSeparators((List<Pair<Integer, Integer>>)var14.getFirst(), var10)) {
            var10 = (List)var14.getFirst();
            var11 = this.computeCoConnectedComponents(var4, (List<Pair<Integer, Integer>>)var14.getFirst());
         }

         Pair var12;
         if ((var12 = this.checkLabels(var11, (List<Pair<Integer, Integer>>)var14.getFirst())) != null) {
            Object var15 = this.indices.get((Integer)var12.getFirst());
            Object var16 = this.indices.get((Integer)var12.getSecond());
            if (!var4.containsEdge(var15, var6)) {
               Object var17 = var15;
               var15 = var16;
               var16 = var17;
            }

            this.certificate = this.findHole(var4, (V)var15, (V)var6, (V)var7, (V)var16);
            return;
         }
      }
   }

   private GraphPath<V, E> findHole(Graph<V, E> var1, V var2, V var3, V var4, V var5) {
      HashSet var6 = CollectionUtil.newHashSetWithExpectedSize(var1.vertexSet().size());
      var6.add(var4);
      var6.add(var3);
      List var7 = this.findCycle(var6, var1, (V)var5, (V)var4, (V)var3, (V)var2);
      var7 = this.minimizeCycle(var1, var7, (V)var4, (V)var5, (V)var3, (V)var2);
      return new GraphWalk<>(var1, var7, 0.0);
   }

   private List<V> findCycle(Set<V> var1, Graph<V, E> var2, V var3, V var4, V var5, V var6) {
      ArrayList var7 = new ArrayList<>(Arrays.asList(var3, var4, var5));
      ArrayDeque var8 = new ArrayDeque();
      var8.add(var6);

      while (!var8.isEmpty()) {
         Object var9 = var8.removeLast();
         if (var1.add(var9)) {
            while (!var2.containsEdge(var7.get(var7.size() - 1), var9)) {
               var7.remove(var7.size() - 1);
            }

            var7.add(var9);
            if (var3.equals(var9)) {
               break;
            }

            for (Object var11 : Graphs.neighborListOf(var2, var9)) {
               if (!var1.contains(var11) && !var2.containsEdge(var5, var11) && (!var2.containsEdge(var4, var11) || var11.equals(var3))) {
                  var8.add(var11);
               }
            }
         }
      }

      return var7;
   }

   private List<V> minimizeCycle(Graph<V, E> var1, List<V> var2, V var3, V var4, V var5, V var6) {
      ArrayList var7 = new ArrayList<>(Arrays.asList(var4, var3, var5));
      HashSet var8 = new HashSet<>(var2);
      var8.remove(var3);
      var8.remove(var5);
      var8.remove(var6);
      int var9 = 3;

      while (var9 < var2.size() - 1) {
         Object var10 = var2.get(var9);
         var7.add(var10);
         var8.remove(var10);
         HashSet var11 = new HashSet();

         for (Object var13 : Graphs.neighborListOf(var1, var10)) {
            if (var8.contains(var13)) {
               var11.add(var13);
            }
         }

         for (Object var15 : var11) {
            if (var8.contains(var15)) {
               while (true) {
                  var8.remove(var2.get(var9));
                  var9++;
                  if (var9 >= var2.size() || var2.get(var9).equals(var15)) {
                     break;
                  }
               }
            }
         }
      }

      var7.add(var4);
      return var7;
   }

   private List<Set<V>> findSeparators(Graph<V, E> var1, E var2) {
      ArrayList var3 = new ArrayList();
      Object var4 = var1.getEdgeSource(var2);
      Object var5 = var1.getEdgeTarget(var2);
      Set var6 = this.neighborhoodSetOf(var1, (E)var2);
      HashMap var7 = CollectionUtil.newHashMapWithExpectedSize(var1.vertexSet().size());

      for (Object var9 : var1.vertexSet()) {
         if (var6.contains(var9)) {
            var7.put(var9, (byte)1);
         } else {
            var7.put(var9, (byte)0);
         }
      }

      var7.put(var4, (byte)2);
      var7.put(var5, (byte)2);

      for (Object var12 : var1.vertexSet()) {
         if ((Byte)var7.get(var12) == 0) {
            Set var10 = this.getSeparator(var1, (V)var12, var7);
            if (!var10.isEmpty()) {
               var3.add(var10);
            }
         }
      }

      return var3;
   }

   private Set<V> getSeparator(Graph<V, E> var1, V var2, Map<V, Byte> var3) {
      ArrayDeque var4 = new ArrayDeque();
      HashSet var5 = new HashSet();
      var4.add(var2);

      while (!var4.isEmpty()) {
         Object var6 = var4.removeLast();
         if ((Byte)var3.get(var6) == 0) {
            var3.put(var6, (byte)2);

            for (Object var8 : var1.edgesOf(var6)) {
               Object var9 = Graphs.getOppositeVertex(var1, var8, var6);
               if ((Byte)var3.get(var9) == 0) {
                  var4.add(var9);
               } else if ((Byte)var3.get(var9) == 1) {
                  var5.add(var9);
               }
            }
         }
      }

      return var5;
   }

   private Set<V> neighborhoodSetOf(Graph<V, E> var1, E var2) {
      HashSet var3 = new HashSet();
      Object var4 = var1.getEdgeSource(var2);
      Object var5 = var1.getEdgeTarget(var2);

      for (Object var7 : var1.edgesOf(var4)) {
         var3.add(Graphs.getOppositeVertex(var1, var7, var4));
      }

      for (Object var9 : var1.edgesOf(var5)) {
         var3.add(Graphs.getOppositeVertex(var1, var9, var5));
      }

      var3.remove(var4);
      var3.remove(var5);
      return var3;
   }
}
