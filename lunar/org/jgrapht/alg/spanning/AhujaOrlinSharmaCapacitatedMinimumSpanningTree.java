package org.jgrapht.alg.spanning;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.alg.cycle.AhujaOrlinSharmaCyclicExchangeLocalAugmentation;
import org.jgrapht.alg.interfaces.CapacitatedSpanningTreeAlgorithm;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.traverse.DepthFirstIterator;

public class AhujaOrlinSharmaCapacitatedMinimumSpanningTree<V, E> extends AbstractCapacitatedMinimumSpanningTree<V, E> {
   private final int lengthBound;
   private final boolean bestImprovement;
   private final int numberOfOperationsParameter;
   private CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> initialSolution;
   private final boolean useVertexOperation;
   private final boolean useSubtreeOperation;
   private final boolean useTabuSearch;
   private final int tabuTime;
   private final int upperLimitTabuExchanges;
   private boolean isAlgorithmExecuted;

   public AhujaOrlinSharmaCapacitatedMinimumSpanningTree(Graph<V, E> var1, V var2, double var3, Map<V, Double> var5, int var6, int var7) {
      this(var1, (V)var2, var3, var5, var6, false, var7, true, true, true, 10, 50);
   }

   public AhujaOrlinSharmaCapacitatedMinimumSpanningTree(
      CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> var1, Graph<V, E> var2, V var3, double var4, Map<V, Double> var6, int var7
   ) {
      this(var1, var2, (V)var3, var4, var6, var7, false, true, true, true, 10, 50);
   }

   public AhujaOrlinSharmaCapacitatedMinimumSpanningTree(
      Graph<V, E> var1,
      V var2,
      double var3,
      Map<V, Double> var5,
      int var6,
      boolean var7,
      int var8,
      boolean var9,
      boolean var10,
      boolean var11,
      int var12,
      int var13
   ) {
      super(var1, (V)var2, var3, var5);
      this.lengthBound = var6;
      this.bestImprovement = var7;
      this.numberOfOperationsParameter = var8;
      if (!var10 && !var9) {
         throw new IllegalArgumentException(
            "At least one of the options has to be enabled, otherwise it is not possible to excute the local search: useVertexOperation and useSubtreeOperation."
         );
      }

      this.useVertexOperation = var9;
      this.useSubtreeOperation = var10;
      this.useTabuSearch = var11;
      this.tabuTime = var12;
      this.upperLimitTabuExchanges = var13;
      this.isAlgorithmExecuted = false;
   }

   public AhujaOrlinSharmaCapacitatedMinimumSpanningTree(
      CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> var1,
      Graph<V, E> var2,
      V var3,
      double var4,
      Map<V, Double> var6,
      int var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      int var12,
      int var13
   ) {
      this(var2, (V)var3, var4, var6, var7, var8, 0, var9, var10, var11, var12, var13);
      if (!var1.isCapacitatedSpanningTree(var2, var3, var4, var6)) {
         throw new IllegalArgumentException("The initial solution is not a valid capacitated spanning tree.");
      }

      this.initialSolution = var1;
   }

   @Override
   public CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> getCapacitatedSpanningTree() {
      if (this.isAlgorithmExecuted) {
         return this.bestSolution.calculateResultingSpanningTree();
      }

      this.bestSolution = this.getInitialSolution();
      Map var1 = new HashMap();
      Map var2 = new HashMap();
      Pair var3 = Pair.of(this.bestSolution.getLabels(), new HashSet());
      AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraph var4 = new AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraph(
         this.bestSolution
      );
      HashSet var5 = new HashSet();
      HashMap var6 = new HashMap();
      int var7 = 0;
      int var8 = 0;
      AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation var9 = this.bestSolution;
      double var10 = 0.0;

      while (true) {
         var1 = this.calculateSpanningTrees(var9, var1, (Set<Integer>)var3.getFirst());
         if (this.useSubtreeOperation) {
            var2 = this.calculateSubtreesOfVertices(var9, var2, var1, (Set<Integer>)var3.getFirst());
         }

         var4.updateImprovementGraph(var9, var2, var1, (Set<Integer>)var3.getFirst(), var5);
         AhujaOrlinSharmaCyclicExchangeLocalAugmentation var14 = new AhujaOrlinSharmaCyclicExchangeLocalAugmentation<>(
            var4.improvementGraph, this.lengthBound, var4.cycleAugmentationLabels, this.bestImprovement
         );
         GraphWalk var15 = var14.getLocalAugmentationCycle();
         double var12 = var15.getWeight();
         var10 += var12;
         if (this.useTabuSearch) {
            if (var12 < 0.0) {
               var3 = this.executeNeighborhoodOperation(var9, var4.improvementGraphVertexMapping, var4.pathExchangeVertexMapping, var2, var15);
               if (var10 < 0.0) {
                  this.bestSolution = var9;
                  var10 = 0.0;
               }
            } else {
               if (this.upperLimitTabuExchanges <= var8) {
                  break;
               }

               if (var9 == this.bestSolution) {
                  var9 = var9.clone();
               }

               var3 = this.executeNeighborhoodOperation(var9, var4.improvementGraphVertexMapping, var4.pathExchangeVertexMapping, var2, var15);
               var5.addAll((Collection<? extends E>)var3.getSecond());
               var6.put(var7, (Set)var3.getSecond());
               var8++;
            }

            Set var16 = (Set)var6.remove(var7 - this.tabuTime - 1);
            if (var16 != null) {
               var5.removeAll(var16);
            }

            var7++;
         } else {
            if (!(var12 < 0.0)) {
               break;
            }

            var3 = this.executeNeighborhoodOperation(var9, var4.improvementGraphVertexMapping, var4.pathExchangeVertexMapping, var2, var15);
         }
      }

      this.isAlgorithmExecuted = true;
      return this.bestSolution.calculateResultingSpanningTree();
   }

   private AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation getInitialSolution() {
      return this.initialSolution != null
         ? new AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation(
            this.initialSolution.getLabels(), this.initialSolution.getPartition()
         )
         : new EsauWilliamsCapacitatedMinimumSpanningTree<>(this.graph, this.root, this.capacity, this.demands, this.numberOfOperationsParameter).getSolution();
   }

   private Pair<Set<Integer>, Set<V>> executeNeighborhoodOperation(
      AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
      Map<Integer, V> var2,
      Map<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, Integer> var3,
      Map<V, Pair<Set<V>, Double>> var4,
      GraphWalk<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, DefaultWeightedEdge> var5
   ) {
      HashSet var6 = new HashSet();
      HashSet var7 = new HashSet();
      Iterator var8 = var5.getVertexList().iterator();
      if (var8.hasNext()) {
         Pair var9 = (Pair)var8.next();
         Integer var10;
         switch ((AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType)var9.getSecond()) {
            case SINGLE:
               var10 = var1.getLabel((V)var2.get(var9.getFirst()));
               break;
            case SUBTREE:
               var10 = var1.getLabel((V)var2.get(var9.getFirst()));
               break;
            default:
               var10 = -1;
         }

         while (var8.hasNext()) {
            Pair var11 = (Pair)var8.next();
            switch ((AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType)var9.getSecond()) {
               case SINGLE:
                  Object var20 = var2.get(var9.getFirst());
                  Integer var22 = var1.getLabel((V)var20);
                  Integer var23;
                  if (var8.hasNext()) {
                     switch ((AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType)var11.getSecond()) {
                        case SINGLE:
                           var23 = var1.getLabel((V)var2.get(var11.getFirst()));
                           break;
                        case SUBTREE:
                           var23 = var1.getLabel((V)var2.get(var11.getFirst()));
                           break;
                        case PSEUDO:
                           var23 = (Integer)var3.get(var11);
                           break;
                        default:
                           throw new IllegalStateException("This is a bug. There are invalid types of vertices in the cycle.");
                     }
                  } else {
                     var23 = var10;
                  }

                  var6.add(var20);
                  var7.add(var22);
                  var1.moveVertex((Integer)var20, var22, var23);
                  break;
               case SUBTREE:
                  Object var19 = var2.get(var9.getFirst());
                  Integer var13 = var1.getLabel((V)var19);
                  Integer var14;
                  if (var8.hasNext()) {
                     switch ((AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType)var11.getSecond()) {
                        case SINGLE:
                           var14 = var1.getLabel((V)var2.get(var11.getFirst()));
                           break;
                        case SUBTREE:
                           var14 = var1.getLabel((V)var2.get(var11.getFirst()));
                           break;
                        case PSEUDO:
                           var14 = (Integer)var3.get(var11);
                           break;
                        default:
                           throw new IllegalStateException("This is a bug. There are invalid types of vertices in the cycle.");
                     }
                  } else {
                     var14 = var10;
                  }

                  var6.add(var19);
                  var7.add(var13);
                  Set var15 = (Set)((Pair)var4.get(var19)).getFirst();
                  var1.moveVertices(var15, var13, var14);
                  break;
               case PSEUDO:
                  Integer var12 = (Integer)var3.get(var9);
                  var7.add(var12);
               case ORIGIN:
                  break;
               default:
                  throw new IllegalStateException("This is a bug. There are invalid types of vertices in the cycle.");
            }

            var9 = var11;
         }
      }

      HashSet var16 = new HashSet();
      Iterator var17 = var7.iterator();

      while (var17.hasNext()) {
         int var18 = (Integer)var17.next();
         Set var21 = var1.getPartitionSet(var18);
         if (var21.isEmpty()) {
            var17.remove();
         } else {
            var16.addAll(var1.partitionSubtreesOfSubset(var21, var18));
         }
      }

      var7.addAll(var16);
      var1.cleanUp();
      return Pair.of(var7, var6);
   }

   private Map<Integer, SpanningTreeAlgorithm.SpanningTree<E>> calculateSpanningTrees(
      AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
      Map<Integer, SpanningTreeAlgorithm.SpanningTree<E>> var2,
      Set<Integer> var3
   ) {
      for (Integer var5 : var3) {
         Set var6 = var1.getPartitionSet(var5);
         var1.getPartitionSet(var5).add(this.root);
         var2.put(var5, new PrimMinimumSpanningTree<>(new AsSubgraph<>(this.graph, var6)).getSpanningTree());
         var1.getPartitionSet(var5).remove(this.root);
      }

      return var2;
   }

   private Map<V, Pair<Set<V>, Double>> calculateSubtreesOfVertices(
      AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
      Map<V, Pair<Set<V>, Double>> var2,
      Map<Integer, SpanningTreeAlgorithm.SpanningTree<E>> var3,
      Set<Integer> var4
   ) {
      for (Integer var6 : var4) {
         HashSet var7 = new HashSet<>(var1.getPartitionSet(var6));
         var7.add(this.root);

         for (Object var9 : var1.getPartitionSet(var6)) {
            Pair var10 = this.subtree(var1, var7, (V)var9, var3);
            var2.put(var9, var10);
         }
      }

      return var2;
   }

   private Pair<Set<V>, Double> subtree(
      AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
      Set<V> var2,
      V var3,
      Map<Integer, SpanningTreeAlgorithm.SpanningTree<E>> var4
   ) {
      SpanningTreeAlgorithm.SpanningTree var5 = (SpanningTreeAlgorithm.SpanningTree)var4.get(var1.getLabel((V)var3));
      AsSubgraph var6 = new AsSubgraph<>(this.graph, var2, var5.getEdges());
      HashSet var7 = new HashSet();
      double var8 = 0.0;
      DepthFirstIterator var10 = new DepthFirstIterator<>(var6, (V)var3);
      HashSet var11 = new HashSet();
      double var12 = 0.0;
      boolean var14 = true;

      while (var10.hasNext()) {
         Object var15 = var10.next();
         if (var6.containsEdge(var15, var3)) {
            var14 = true;
            var7.addAll(var11);
            var8 += var12;
            var11 = new HashSet();
            var12 = 0.0;
         }

         if (var15.equals(this.root)) {
            var14 = false;
            var11 = new HashSet();
            var12 = 0.0;
         }

         if (var14) {
            var11.add(var15);
            var12 += this.demands.get(var15);
         }
      }

      return Pair.of(var7, var8);
   }

   private class ImprovementGraph {
      Graph<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, DefaultWeightedEdge> improvementGraph;
      AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation capacitatedSpanningTreeSolutionRepresentation;
      Map<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, Integer> cycleAugmentationLabels;
      Map<Integer, V> improvementGraphVertexMapping;
      Map<V, Integer> initialVertexMapping;
      Map<Integer, Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>> pseudoVertexMapping;
      Map<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, Integer> pathExchangeVertexMapping;
      Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> origin;
      final Integer originVertexLabel = -1;

      public ImprovementGraph(AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var2) {
         this.capacitatedSpanningTreeSolutionRepresentation = var2;
         this.improvementGraphVertexMapping = new HashMap<>();
         this.initialVertexMapping = new HashMap<>();
         this.pseudoVertexMapping = new HashMap<>();
         this.pathExchangeVertexMapping = new HashMap<>();
         this.cycleAugmentationLabels = this.getImprovementGraphLabelMap();
         this.improvementGraph = this.createImprovementGraph();
      }

      public Graph<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, DefaultWeightedEdge> createImprovementGraph() {
         DefaultDirectedWeightedGraph var1 = new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);
         int var2 = 0;

         for (Object var4 : AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.vertexSet()) {
            if (!var4.equals(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root)) {
               if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
                  Pair var5 = new Pair<>(var2, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SINGLE);
                  var1.addVertex(var5);
               }

               if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation) {
                  Pair var10 = new Pair<>(var2, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SUBTREE);
                  var1.addVertex(var10);
               }

               this.improvementGraphVertexMapping.put(var2, (V)var4);
               this.initialVertexMapping.put((V)var4, var2);
               var2++;
            }
         }

         Pair var7 = new Pair<>(var2, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.ORIGIN);
         var1.addVertex(var7);
         this.origin = var7;
         this.pathExchangeVertexMapping.put(var7, this.originVertexLabel);

         for (Integer var11 : this.capacitatedSpanningTreeSolutionRepresentation.getLabels()) {
            Pair var6 = new Pair<>((Integer)var7.getFirst() + var11 + 1, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.PSEUDO);
            this.pseudoVertexMapping.put(var11, var6);
            this.pathExchangeVertexMapping.put(var6, var11);
            var1.addVertex(var6);
         }

         for (Pair var12 : this.pseudoVertexMapping.values()) {
            var1.setEdgeWeight((DefaultWeightedEdge)var1.addEdge(var12, var7), 0.0);
         }

         return var1;
      }

      public void updateImprovementGraph(
         AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
         Map<V, Pair<Set<V>, Double>> var2,
         Map<Integer, SpanningTreeAlgorithm.SpanningTree<E>> var3,
         Set<Integer> var4,
         Set<V> var5
      ) {
         this.capacitatedSpanningTreeSolutionRepresentation = var1;
         this.cycleAugmentationLabels = this.getImprovementGraphLabelMap();
         this.updatePseudoNodesOfNewLabels(var1);

         for (Object var7 : AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.vertexSet()) {
            if (!var7.equals(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root)) {
               Pair var8 = Pair.of(this.initialVertexMapping.get(var7), AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SINGLE);
               Pair var9 = Pair.of(this.initialVertexMapping.get(var7), AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SUBTREE);
               if (!this.updateTabuVertices(var5, (Pair)var7, var8, var9)) {
                  this.updateOriginNodeConnections(var1, var2, var3, var4, (Pair)var7, var8, var9);

                  for (Integer var11 : var1.getLabels()) {
                     if (!var11.equals(var1.getLabel((V)var7)) && (var4.contains(var1.getLabel((V)var7)) || var4.contains(var11))) {
                        Pair var12 = this.pseudoVertexMapping.get(var11);
                        HashSet var13 = new HashSet<>(var1.getPartitionSet(var11));
                        var13.add(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root);
                        double var14 = ((SpanningTreeAlgorithm.SpanningTree)var3.get(var11)).getWeight();
                        this.updateSingleNode(var1, var2, var5, var11, var14, var13, var12, (Pair)var7, var8);
                        this.updateSubtreeNode(var1, var2, var5, var11, var14, var13, var12, (Pair)var7, var9);
                     }
                  }
               }
            }
         }
      }

      private void updatePseudoNodesOfNewLabels(AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1) {
         if (!var1.getLabels().equals(this.pseudoVertexMapping.keySet())) {
            for (Integer var3 : var1.getLabels()) {
               if (!this.pseudoVertexMapping.keySet().contains(var3)) {
                  Pair var4 = new Pair<>(this.origin.getFirst() + var3 + 1, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.PSEUDO);
                  this.pseudoVertexMapping.put(var3, var4);
                  this.pathExchangeVertexMapping.put(var4, var3);
                  this.improvementGraph.addVertex(var4);
                  DefaultWeightedEdge var5 = this.improvementGraph.addEdge(var4, this.origin);
                  this.improvementGraph.setEdgeWeight(var5, 0.0);
               }
            }

            if (var1.getLabels().size() != this.pseudoVertexMapping.keySet().size()) {
               Iterator var6 = this.pseudoVertexMapping.keySet().iterator();

               while (var6.hasNext()) {
                  int var7 = (Integer)var6.next();
                  if (!var1.getLabels().contains(var7)) {
                     Pair var8 = new Pair<>(this.origin.getFirst() + var7 + 1, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.PSEUDO);
                     var6.remove();
                     this.pathExchangeVertexMapping.remove(var8);
                     this.improvementGraph.removeVertex(var8);
                  }
               }
            }
         }
      }

      private boolean updateTabuVertices(
         Set<V> var1,
         V var2,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var3,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var4
      ) {
         if (var1.contains(var2)) {
            if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
               this.improvementGraph.removeVertex(var3);
               this.improvementGraph.addVertex(var3);
            }

            if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation) {
               this.improvementGraph.removeVertex(var4);
               this.improvementGraph.addVertex(var4);
            }

            return true;
         } else {
            return false;
         }
      }

      private void updateOriginNodeConnections(
         AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
         Map<V, Pair<Set<V>, Double>> var2,
         Map<Integer, SpanningTreeAlgorithm.SpanningTree<E>> var3,
         Set<Integer> var4,
         V var5,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var6,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var7
      ) {
         if (var4.contains(var1.getLabel((V)var5))) {
            double var10 = ((SpanningTreeAlgorithm.SpanningTree)var3.get(var1.getLabel((V)var5))).getWeight();
            Set var13 = var1.getPartitionSet(var1.getLabel((V)var5));
            var13.add(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root);
            if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
               var13.remove(var5);
               SpanningTreeAlgorithm.SpanningTree var12 = new PrimMinimumSpanningTree<>(
                     new AsSubgraph<>(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var13)
                  )
                  .getSpanningTree();
               double var8;
               if (var12.getEdges().size() == var13.size() - 1) {
                  var8 = var12.getWeight();
               } else {
                  var8 = Double.NaN;
               }

               this.updateImprovementGraphEdge(this.origin, var6, 0.0, var8 - var10);
               var13.add(var5);
            }

            if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation) {
               if (((Set)((Pair)var2.get(var5)).getFirst()).size() <= 1 && AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
                  this.improvementGraph.removeVertex(var7);
                  this.improvementGraph.addVertex(var7);
               } else {
                  var13.removeAll((Collection<?>)((Pair)var2.get(var5)).getFirst());
                  SpanningTreeAlgorithm.SpanningTree var15 = new PrimMinimumSpanningTree<>(
                        new AsSubgraph<>(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var13)
                     )
                     .getSpanningTree();
                  double var14;
                  if (var15.getEdges().size() == var13.size() - 1) {
                     var14 = var15.getWeight();
                  } else {
                     var14 = Double.NaN;
                  }

                  this.updateImprovementGraphEdge(this.origin, var7, 0.0, var14 - var10);
                  var13.addAll((Collection<? extends E>)((Pair)var2.get(var5)).getFirst());
               }
            }

            var13.remove(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root);
         }
      }

      private void updateSingleNode(
         AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
         Map<V, Pair<Set<V>, Double>> var2,
         Set<V> var3,
         int var4,
         double var5,
         Set<V> var7,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var8,
         V var9,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var10
      ) {
         var7.add(var9);
         if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
            for (Object var17 : var1.getPartitionSet(var4)) {
               if (var17.equals(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root)) {
                  throw new IllegalStateException("The root is in the partition. This is a bug.");
               }

               if (!var3.contains(var17)) {
                  var7.remove(var17);
                  SpanningTreeAlgorithm.SpanningTree var15 = new PrimMinimumSpanningTree<>(
                        new AsSubgraph<>(
                           AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var7, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.edgeSet()
                        )
                     )
                     .getSpanningTree();
                  double var11;
                  double var13;
                  if (var15.getEdges().size() == var7.size() - 1) {
                     var11 = this.calculateMaximumDemandOfSubtrees(
                        var7,
                        var15,
                        var1.getPartitionWeight(var4)
                           + AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.demands.get(var9)
                           - AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.demands.get(var17)
                     );
                     var13 = var15.getWeight();
                  } else {
                     var11 = Double.NaN;
                     var13 = Double.NaN;
                  }

                  this.updateImprovementGraphEdge(
                     var10,
                     Pair.of(this.initialVertexMapping.get(var17), AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SINGLE),
                     var11,
                     var13 - var5
                  );
                  var7.add(var17);
                  if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation && ((Set)((Pair)var2.get(var17)).getFirst()).size() > 1) {
                     var7.removeAll((Collection<?>)((Pair)var2.get(var17)).getFirst());
                     var15 = new PrimMinimumSpanningTree<>(
                           new AsSubgraph<>(
                              AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph,
                              var7,
                              AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.edgeSet()
                           )
                        )
                        .getSpanningTree();
                     if (var15.getEdges().size() == var7.size() - 1) {
                        var11 = this.calculateMaximumDemandOfSubtrees(
                           var7,
                           var15,
                           var1.getPartitionWeight(var4)
                              + AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.demands.get(var9)
                              - (Double)((Pair)var2.get(var17)).getSecond()
                        );
                        var13 = var15.getWeight();
                     } else {
                        var11 = Double.NaN;
                        var13 = Double.NaN;
                     }

                     this.updateImprovementGraphEdge(
                        var10,
                        Pair.of(this.initialVertexMapping.get(var17), AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SUBTREE),
                        var11,
                        var13 - var5
                     );
                     var7.addAll((Collection<? extends E>)((Pair)var2.get(var17)).getFirst());
                  }
               }
            }

            SpanningTreeAlgorithm.SpanningTree var23 = new PrimMinimumSpanningTree<>(
                  new AsSubgraph<>(
                     AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var7, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.edgeSet()
                  )
               )
               .getSpanningTree();
            double var19;
            double var21;
            if (var23.getEdges().size() == var7.size() - 1) {
               var19 = this.calculateMaximumDemandOfSubtrees(
                  var7, var23, var1.getPartitionWeight(var4) + AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.demands.get(var9)
               );
               var21 = var23.getWeight();
            } else {
               var19 = Double.NaN;
               var21 = Double.NaN;
            }

            this.updateImprovementGraphEdge(var10, var8, var19, var21 - var5);
            var7.remove(var9);
         }
      }

      private void updateSubtreeNode(
         AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation var1,
         Map<V, Pair<Set<V>, Double>> var2,
         Set<V> var3,
         int var4,
         double var5,
         Set<V> var7,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var8,
         V var9,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var10
      ) {
         if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation
            && (((Set)((Pair)var2.get(var9)).getFirst()).size() > 1 || !AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation)) {
            var7.addAll((Collection<? extends E>)((Pair)var2.get(var9)).getFirst());

            for (Object var17 : var1.getPartitionSet(var4)) {
               if (var17.equals(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root)) {
                  throw new IllegalStateException("The root is in the partition. This is a bug.");
               }

               if (!var3.contains(var17)) {
                  if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
                     var7.remove(var17);
                     SpanningTreeAlgorithm.SpanningTree var15 = new PrimMinimumSpanningTree<>(
                           new AsSubgraph<>(
                              AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph,
                              var7,
                              AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.edgeSet()
                           )
                        )
                        .getSpanningTree();
                     double var11;
                     double var13;
                     if (var15.getEdges().size() == var7.size() - 1) {
                        var11 = this.calculateMaximumDemandOfSubtrees(
                           var7,
                           var15,
                           var1.getPartitionWeight(var4)
                              + (Double)((Pair)var2.get(var9)).getSecond()
                              - AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.demands.get(var17)
                        );
                        var13 = var15.getWeight();
                     } else {
                        var11 = Double.NaN;
                        var13 = Double.NaN;
                     }

                     this.updateImprovementGraphEdge(
                        var10,
                        Pair.of(this.initialVertexMapping.get(var17), AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SINGLE),
                        var11,
                        var13 - var5
                     );
                     var7.add(var17);
                  }

                  var7.removeAll((Collection<?>)((Pair)var2.get(var17)).getFirst());
                  SpanningTreeAlgorithm.SpanningTree var22 = new PrimMinimumSpanningTree<>(
                        new AsSubgraph<>(
                           AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var7, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.edgeSet()
                        )
                     )
                     .getSpanningTree();
                  double var18;
                  double var20;
                  if (var22.getEdges().size() == var7.size() - 1) {
                     var18 = this.calculateMaximumDemandOfSubtrees(
                        var7,
                        var22,
                        var1.getPartitionWeight(var1.getLabel((V)var17))
                           + (Double)((Pair)var2.get(var9)).getSecond()
                           - (Double)((Pair)var2.get(var17)).getSecond()
                     );
                     var20 = var22.getWeight();
                  } else {
                     var18 = Double.NaN;
                     var20 = Double.NaN;
                  }

                  this.updateImprovementGraphEdge(
                     var10,
                     Pair.of(this.initialVertexMapping.get(var17), AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SUBTREE),
                     var18,
                     var20 - var5
                  );
                  var7.addAll((Collection<? extends E>)((Pair)var2.get(var17)).getFirst());
               }
            }

            SpanningTreeAlgorithm.SpanningTree var23 = new PrimMinimumSpanningTree<>(
                  new AsSubgraph<>(
                     AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var7, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph.edgeSet()
                  )
               )
               .getSpanningTree();
            double var19;
            double var21;
            if (var23.getEdges().size() == var7.size() - 1) {
               var19 = this.calculateMaximumDemandOfSubtrees(var7, var23, var1.getPartitionWeight(var4) + (Double)((Pair)var2.get(var9)).getSecond());
               var21 = var23.getWeight();
            } else {
               var19 = Double.NaN;
               var21 = Double.NaN;
            }

            this.updateImprovementGraphEdge(var10, var8, var19, var21 - var5);
         }
      }

      public void updateImprovementGraphEdge(
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var1,
         Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var2,
         double var3,
         double var5
      ) {
         if (!Double.isNaN(var3) && var3 <= AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.capacity && !Double.isNaN(var5)) {
            DefaultWeightedEdge var7 = this.improvementGraph.getEdge(var1, var2);
            if (var7 == null) {
               var7 = this.improvementGraph.addEdge(var1, var2);
            }

            this.improvementGraph.setEdgeWeight(var7, var5);
         } else {
            this.improvementGraph.removeEdge(var1, var2);
         }
      }

      public double calculateMaximumDemandOfSubtrees(Set<V> var1, SpanningTreeAlgorithm.SpanningTree<E> var2, double var3) {
         AsSubgraph var5 = new AsSubgraph<>(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.graph, var1, var2.getEdges());
         int var6 = var5.degreeOf(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root);
         if (var6 == 1) {
            return var3;
         }

         double var7 = 0.0;
         DepthFirstIterator var9 = new DepthFirstIterator<>(var5, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root);
         if (var9.hasNext()) {
            var9.next();
         }

         int var10 = 0;
         double var11 = 0.0;
         double var13 = 0.0;

         while (var9.hasNext()) {
            Object var15 = var9.next();
            if (var5.containsEdge(AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.root, var15)) {
               var11 += var13;
               if (var7 < var13) {
                  var7 = var13;
               }

               if (var7 >= 0.5 * var3 || var11 + var7 >= var3) {
                  return var7;
               }

               if (var10 + 1 == var6) {
                  return Math.max(var7, var3 - var11);
               }

               var10++;
               var13 = 0.0;
            }

            var13 += AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.demands.get(var15);
         }

         return var7;
      }

      private Map<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, Integer> getImprovementGraphLabelMap() {
         return new AbstractMap<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, Integer>() {
            @Override
            public int size() {
               return ImprovementGraph.this.improvementGraphVertexMapping.size()
                  + ImprovementGraph.this.pathExchangeVertexMapping.size()
                  + (ImprovementGraph.this.origin == null ? 0 : 1);
            }

            @Override
            public boolean isEmpty() {
               return ImprovementGraph.this.improvementGraphVertexMapping.isEmpty()
                  && ImprovementGraph.this.pathExchangeVertexMapping.isEmpty()
                  && ImprovementGraph.this.origin == null;
            }

            @Override
            public boolean containsKey(Object var1) {
               return !(var1 instanceof Pair)
                  ? false
                  : ImprovementGraph.this.improvementGraphVertexMapping.containsKey(((Pair)var1).getFirst())
                     || ImprovementGraph.this.pathExchangeVertexMapping.containsKey(var1)
                     || var1.equals(ImprovementGraph.this.origin);
            }

            @Override
            public boolean containsValue(Object var1) {
               return ImprovementGraph.this.improvementGraphVertexMapping.containsValue(var1)
                  || ImprovementGraph.this.pathExchangeVertexMapping.containsValue(var1)
                  || var1.equals(ImprovementGraph.this.originVertexLabel);
            }

            public Integer get(Object var1) {
               if (var1 instanceof Pair) {
                  if (ImprovementGraph.this.improvementGraphVertexMapping.containsKey(((Pair)var1).getFirst())) {
                     return ImprovementGraph.this.capacitatedSpanningTreeSolutionRepresentation
                        .getLabel(ImprovementGraph.this.improvementGraphVertexMapping.get(((Pair)var1).getFirst()));
                  }

                  if (var1.equals(ImprovementGraph.this.origin)) {
                     return ImprovementGraph.this.originVertexLabel;
                  }
               }

               return ImprovementGraph.this.pathExchangeVertexMapping.get(var1);
            }

            public Integer put(Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType> var1, Integer var2) {
               throw new IllegalStateException();
            }

            public Integer remove(Object var1) {
               throw new IllegalStateException();
            }

            @Override
            public void putAll(Map<? extends Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, ? extends Integer> var1) {
               throw new IllegalStateException();
            }

            @Override
            public void clear() {
               throw new IllegalStateException();
            }

            @Override
            public Set<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>> keySet() {
               HashSet var1 = new HashSet();

               for (Integer var3 : ImprovementGraph.this.improvementGraphVertexMapping.keySet()) {
                  if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
                     var1.add(Pair.of(var3, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SINGLE));
                  }

                  if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation) {
                     var1.add(Pair.of(var3, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SUBTREE));
                  }
               }

               var1.addAll(ImprovementGraph.this.pathExchangeVertexMapping.keySet());
               var1.add(ImprovementGraph.this.origin);
               return var1;
            }

            @Override
            public Collection<Integer> values() {
               return ImprovementGraph.this.capacitatedSpanningTreeSolutionRepresentation.getLabels();
            }

            @Override
            public Set<Entry<Pair<Integer, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType>, Integer>> entrySet() {
               HashSet var1 = new HashSet();

               for (Integer var3 : ImprovementGraph.this.improvementGraphVertexMapping.keySet()) {
                  Integer var4 = ImprovementGraph.this.capacitatedSpanningTreeSolutionRepresentation
                     .getLabel(ImprovementGraph.this.improvementGraphVertexMapping.get(var3));
                  if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useVertexOperation) {
                     var1.add(new SimpleEntry<>(Pair.of(var3, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SINGLE), var4));
                  }

                  if (AhujaOrlinSharmaCapacitatedMinimumSpanningTree.this.useSubtreeOperation) {
                     var1.add(new SimpleEntry<>(Pair.of(var3, AhujaOrlinSharmaCapacitatedMinimumSpanningTree.ImprovementGraphVertexType.SUBTREE), var4));
                  }
               }

               for (Pair var6 : ImprovementGraph.this.pathExchangeVertexMapping.keySet()) {
                  var1.add(new SimpleEntry<>(var6, ImprovementGraph.this.pathExchangeVertexMapping.get(var6)));
               }

               var1.add(new SimpleEntry<>(ImprovementGraph.this.origin, ImprovementGraph.this.originVertexLabel));
               return var1;
            }
         };
      }
   }

   private enum ImprovementGraphVertexType {
      SINGLE,
      SUBTREE,
      PSEUDO,
      ORIGIN;
   }
}
