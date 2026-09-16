package org.jgrapht.alg.clique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public class CliqueMinimalSeparatorDecomposition<V, E> {
   private Graph<V, E> graph;
   private Graph<V, E> chordalGraph;
   private Set<E> fillEdges;
   private LinkedList<V> meo;
   private List<V> generators;
   private Set<Set<V>> separators;
   private Set<Set<V>> atoms;
   private Map<Set<V>, Integer> fullComponentCount = new HashMap<>();

   public CliqueMinimalSeparatorDecomposition(Graph<V, E> var1) {
      this.graph = GraphTests.requireUndirected(var1);
      this.fillEdges = new HashSet<>();
   }

   private void computeMinimalTriangulation() {
      this.chordalGraph = GraphTypeBuilder.<V, E>undirected()
         .edgeSupplier(this.graph.getEdgeSupplier())
         .vertexSupplier(this.graph.getVertexSupplier())
         .allowingMultipleEdges(false)
         .allowingSelfLoops(false)
         .buildGraph();

      for (Object var2 : this.graph.vertexSet()) {
         this.chordalGraph.addVertex((V)var2);
      }

      Graph var15 = copyAsSimpleGraph(this.graph);
      int var16 = -1;
      this.generators = new ArrayList();
      this.meo = new LinkedList();
      HashMap var3 = new HashMap();

      for (Object var5 : var15.vertexSet()) {
         var3.put(var5, 0);
      }

      int var17 = 1;

      for (int var18 = this.graph.vertexSet().size(); var17 <= var18; var17++) {
         Object var6 = this.getMaxLabelVertex(var3);
         LinkedList var7 = new LinkedList<>(Graphs.neighborListOf(var15, var6));
         if ((Integer)var3.get(var6) <= var16) {
            this.generators.add((V)var6);
         }

         var16 = (Integer)var3.get(var6);
         HashSet var8 = new HashSet();
         var8.add(var6);
         HashMap var9 = new HashMap();

         for (Object var11 : var7) {
            var8.add(var11);
            this.addToReach((Integer)var3.get(var11), (V)var11, var9);
         }

         for (int var19 = 0; var19 < this.graph.vertexSet().size(); var19++) {
            if (var9.containsKey(var19)) {
               while (((HashSet)var9.get(var19)).size() > 0) {
                  Object var21 = ((HashSet)var9.get(var19)).iterator().next();
                  ((HashSet)var9.get(var19)).remove(var21);

                  for (Object var13 : Graphs.neighborListOf(var15, var21)) {
                     if (!var8.contains(var13)) {
                        var8.add(var13);
                        if ((Integer)var3.get(var13) > var19) {
                           var7.add(var13);
                           Object var14 = this.graph.getEdgeSupplier().get();
                           this.fillEdges.add((E)var14);
                           this.addToReach((Integer)var3.get(var13), (V)var13, var9);
                        } else {
                           this.addToReach(var19, (V)var13, var9);
                        }
                     }
                  }
               }
            }
         }

         for (Object var22 : var7) {
            this.chordalGraph.addEdge((V)var6, (V)var22);
            var3.put(var22, (Integer)var3.get(var22) + 1);
         }

         this.meo.addLast((V)var6);
         var15.removeVertex(var6);
         var3.remove(var6);
      }
   }

   private V getMaxLabelVertex(Map<V, Integer> var1) {
      Iterator var2 = var1.entrySet().iterator();
      Entry var3 = (Entry)var2.next();

      while (var2.hasNext()) {
         Entry var4 = (Entry)var2.next();
         if ((Integer)var4.getValue() > (Integer)var3.getValue()) {
            var3 = var4;
         }
      }

      return (V)var3.getKey();
   }

   private void addToReach(Integer var1, V var2, HashMap<Integer, HashSet<V>> var3) {
      if (var3.containsKey(var1)) {
         ((HashSet)var3.get(var1)).add(var2);
      } else {
         HashSet var4 = new HashSet();
         var4.add(var2);
         var3.put(var1, var4);
      }
   }

   private void computeAtoms() {
      if (this.chordalGraph == null) {
         this.computeMinimalTriangulation();
      }

      this.separators = new HashSet<>();
      Graph var1 = copyAsSimpleGraph(this.graph);
      Graph var2 = copyAsSimpleGraph(this.chordalGraph);
      this.atoms = new HashSet<>();
      Iterator var3 = this.meo.descendingIterator();

      while (var3.hasNext()) {
         Object var4 = var3.next();
         if (this.generators.contains(var4)) {
            HashSet var5 = new HashSet<>(Graphs.neighborListOf(var2, var4));
            if (isClique(this.graph, var5)) {
               if (var5.size() > 0) {
                  if (this.separators.contains(var5)) {
                     this.fullComponentCount.put(var5, this.fullComponentCount.get(var5) + 1);
                  } else {
                     this.fullComponentCount.put(var5, 2);
                     this.separators.add(var5);
                  }
               }

               Graph var6 = copyAsSimpleGraph(var1);
               var6.removeAllVertices(var5);
               ConnectivityInspector var7 = new ConnectivityInspector(var6);
               if (var7.isConnected()) {
                  throw new RuntimeException("separator did not separate the graph");
               }

               for (Set var9 : var7.connectedSets()) {
                  if (var9.contains(var4)) {
                     var1.removeAllVertices(var9);
                     var9.addAll(var5);
                     this.atoms.add((Set<V>)(new HashSet<>(var9)));
                     assert var9.size() > 0;
                     break;
                  }
               }
            }
         }

         var2.removeVertex(var4);
      }

      if (var1.vertexSet().size() > 0) {
         this.atoms.add((Set<V>)(new HashSet<>(var1.vertexSet())));
      }
   }

   private static <V, E> boolean isClique(Graph<V, E> var0, Set<V> var1) {
      for (Object var3 : var1) {
         for (Object var5 : var1) {
            if (!var3.equals(var5) && var0.getEdge(var3, var5) == null) {
               return false;
            }
         }
      }

      return true;
   }

   private static <V, E> Graph<V, E> copyAsSimpleGraph(Graph<V, E> var0) {
      Graph var1 = GraphTypeBuilder.undirected()
         .edgeSupplier(var0.getEdgeSupplier())
         .vertexSupplier(var0.getVertexSupplier())
         .allowingMultipleEdges(false)
         .allowingSelfLoops(false)
         .buildGraph();
      if (var0.getType().isSimple()) {
         Graphs.addGraph(var1, var0);
      } else {
         Graphs.addAllVertices(var1, var0.vertexSet());

         for (Object var3 : var0.edgeSet()) {
            Object var4 = var0.getEdgeSource(var3);
            Object var5 = var0.getEdgeTarget(var3);
            if (!var4.equals(var5) && !var1.containsEdge(var3)) {
               var1.addEdge(var4, var5);
            }
         }
      }

      return var1;
   }

   public boolean isChordal() {
      if (this.chordalGraph == null) {
         this.computeMinimalTriangulation();
      }

      return this.chordalGraph.edgeSet().size() == this.graph.edgeSet().size();
   }

   public Set<E> getFillEdges() {
      if (this.fillEdges == null) {
         this.computeMinimalTriangulation();
      }

      return this.fillEdges;
   }

   public Graph<V, E> getMinimalTriangulation() {
      if (this.chordalGraph == null) {
         this.computeMinimalTriangulation();
      }

      return this.chordalGraph;
   }

   public List<V> getGenerators() {
      if (this.generators == null) {
         this.computeMinimalTriangulation();
      }

      return this.generators;
   }

   public LinkedList<V> getMeo() {
      if (this.meo == null) {
         this.computeMinimalTriangulation();
      }

      return this.meo;
   }

   public Map<Set<V>, Integer> getFullComponentCount() {
      if (this.fullComponentCount == null) {
         this.computeAtoms();
      }

      return this.fullComponentCount;
   }

   public Set<Set<V>> getAtoms() {
      if (this.atoms == null) {
         this.computeAtoms();
      }

      return this.atoms;
   }

   public Set<Set<V>> getSeparators() {
      if (this.separators == null) {
         this.computeAtoms();
      }

      return this.separators;
   }

   public Graph<V, E> getGraph() {
      return this.graph;
   }
}
