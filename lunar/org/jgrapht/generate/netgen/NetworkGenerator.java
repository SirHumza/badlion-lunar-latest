package org.jgrapht.generate.netgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.flow.mincost.MinimumCostFlowProblem;
import org.jgrapht.util.CollectionUtil;
import org.jgrapht.util.ElementsSequenceGenerator;

public class NetworkGenerator<V, E> {
   public static final int MAX_NODE_NUM = 100000000;
   public static final int MAX_SUPPLY = 200000000;
   public static final int MAX_ARC_NUM = 2000000000;
   public static final int CAPACITY_COST_BOUND = 2000000000;
   private final NetworkGeneratorConfig config;
   private final Random rng;
   private Graph<V, E> graph;
   private NetworkInfo<V, E> networkInfo;
   private List<NetworkGenerator<V, E>.Node> nodes;
   private Map<V, NetworkGenerator<V, E>.Node> graphVertexMapping;
   private Map<V, Integer> supplyMap;
   private Map<E, Integer> capacityMap;
   private Map<E, Integer> costMap;
   private long source2TSourceUB;
   private long source2TNodeUB;
   private long source2SinkUB;
   private long tNode2TSourceUB;
   private long tNode2TNodeUB;
   private long tNode2SinkUB;
   private long tSink2TSourceUB;
   private long tSink2TNodeUB;
   private long tSink2SinkUB;

   public NetworkGenerator(NetworkGeneratorConfig var1) {
      this(var1, System.nanoTime());
   }

   public NetworkGenerator(NetworkGeneratorConfig var1, long var2) {
      this(var1, new Random(var2));
   }

   public NetworkGenerator(NetworkGeneratorConfig var1, Random var2) {
      this.config = var1;
      this.rng = var2;
   }

   public BipartiteMatchingProblem<V, E> generateBipartiteMatchingProblem(Graph<V, E> var1) {
      if (!this.config.isAssignmentProblem()) {
         throw new IllegalArgumentException("Input config doesn't specify a bipartite matching problem");
      }

      GraphTests.requireDirected(var1);
      this.generate(var1);
      return new BipartiteMatchingProblem.BipartiteMatchingProblemImpl<>(
         var1,
         new HashSet<>(this.networkInfo.getSources()),
         new HashSet<>(this.networkInfo.getSinks()),
         var1x -> (double)this.costMap.get(var1x).intValue(),
         this.config.isCostWeighted()
      );
   }

   public MaximumFlowProblem<V, E> generateMaxFlowProblem(Graph<V, E> var1) {
      if (!this.config.isMaxFlowProblem()) {
         throw new IllegalArgumentException("Input config doesn't specify a maximum flow problem");
      }

      GraphTests.requireDirected(var1);
      this.generate(var1);
      return new MaximumFlowProblem.MaximumFlowProblemImpl<>(
         var1,
         new HashSet<>(this.networkInfo.getSources()),
         new HashSet<>(this.networkInfo.getSinks()),
         var1x -> (double)this.capacityMap.get(var1x).intValue()
      );
   }

   public MinimumCostFlowProblem<V, E> generateMinimumCostFlowProblem(Graph<V, E> var1) {
      GraphTests.requireDirected(var1);
      this.generate(var1);
      return new MinimumCostFlowProblem.MinimumCostFlowProblemImpl<>(
         var1, var1x -> this.supplyMap.getOrDefault(var1x, 0), var1x -> this.capacityMap.get(var1x), var1x -> this.costMap.get(var1x)
      );
   }

   private void generate(Graph<V, E> var1) {
      this.init(var1);
      this.createSupply();
      this.initChains();
      this.generateChains();
      this.connectChainsToSinks();
      this.addAllRemainingArcs();
      this.networkInfo.vertices = this.nodes.stream().map(var0 -> var0.graphVertex).collect(Collectors.toList());
   }

   private void init(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
      this.nodes = new ArrayList<>();
      this.graphVertexMapping = CollectionUtil.newHashMapWithExpectedSize(this.config.getNodeNum());
      this.supplyMap = new HashMap<>();
      this.capacityMap = CollectionUtil.newHashMapWithExpectedSize(this.config.getArcNum());
      this.costMap = CollectionUtil.newHashMapWithExpectedSize(this.config.getArcNum());
      this.networkInfo = new NetworkInfo<>(this.config);
      this.source2TSourceUB = this.config.getMaxSource2TSourceArcNum();
      this.source2TNodeUB = this.config.getMaxSource2TNodeArcNum();
      this.source2SinkUB = this.config.getMaxSource2SinkArcNum();
      this.tNode2TSourceUB = this.config.getMaxTNode2TSourceArcNum();
      this.tNode2TNodeUB = this.config.getMaxTNode2TNodeArcNum();
      this.tNode2SinkUB = this.config.getMaxTNode2SinkArcNum();
      this.tSink2TSourceUB = this.config.getMaxTSink2TSourceArcNum();
      this.tSink2TNodeUB = this.config.getMaxTSink2TNodeArcNum();
      this.tSink2SinkUB = this.config.getMaxTSink2SinkArcNum();
      this.createNodes(this.config.getPureSourceNum(), NetworkGenerator.NodeType.PURE_SOURCE);
      this.createNodes(this.config.getTransshipSourceNum(), NetworkGenerator.NodeType.TRANSSHIP_SOURCE);
      this.createNodes(this.config.getTransshipNodeNum(), NetworkGenerator.NodeType.TRANSSHIP_NODE);
      this.createNodes(this.config.getTransshipSinkNum(), NetworkGenerator.NodeType.TRANSSHIP_SINK);
      this.createNodes(this.config.getPureSinkNum(), NetworkGenerator.NodeType.PURE_SINK);
   }

   private void createNodes(int var1, NetworkGenerator.NodeType var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         Object var4 = this.graph.addVertex();
         NetworkGenerator.Node var5 = new NetworkGenerator.Node(var4, var2);
         this.nodes.add(var5);
         this.graphVertexMapping.put((V)var4, var5);
      }
   }

   private void createSupply() {
      int var1 = this.config.getTotalSupply() / this.config.getSourceNum();

      for (int var2 = 0; var2 < this.config.getSourceNum(); var2++) {
         int var3 = this.generatePositiveRandom(var1);
         this.nodes.get(var2).supply += var3;
         int var4 = this.generateRandom(this.config.getSourceNum());
         this.nodes.get(var4).supply += var1 - var3;
      }

      int var5 = this.generateRandom(this.config.getSourceNum());
      NetworkGenerator.Node var7 = this.nodes.get(var5);
      var7.supply = var7.supply + this.config.getTotalSupply() % this.config.getSourceNum();
      this.nodes.forEach(var1x -> {
         if (var1x.supply != 0) {
            this.supplyMap.put(var1x.graphVertex, var1x.supply);
         }
      });
   }

   private void initChains() {
      for (NetworkGenerator.Node var2 : this.getSources()) {
         var2.chainNodes.add(var2);
      }
   }

   private void generateChains() {
      int var1 = this.config.getTransshipNodeNum();
      int var2 = 6 * var1 / 10;
      ElementsSequenceGenerator var3 = new ElementsSequenceGenerator<>(this.getTransshipNodes(), this.rng);
      int var4 = 0;

      for (int var5 = 0; var4 < var2; var5++) {
         if (var5 == this.config.getSourceNum()) {
            var5 = 0;
         }

         NetworkGenerator.Node var6 = (NetworkGenerator.Node)var3.next();
         NetworkGenerator.Node var7 = this.nodes.get(var5);
         this.addSkeletonArc(var7, var7.getLastInChain(), var6);
         var4++;
      }

      for (NetworkGenerator.Node var9 : var3) {
         int var10 = this.rng.nextInt(this.config.getSourceNum());
         NetworkGenerator.Node var11 = this.nodes.get(var10);
         this.addSkeletonArc(var11, var11.getLastInChain(), var9);
      }
   }

   private void connectChainsToSinks() {
      int var1 = this.config.getArcNum() - this.graph.edgeSet().size();
      assert var1 >= this.config.getSinkNum();
      int var2 = Math.min(var1, 2 * Math.max(this.config.getSourceNum(), this.config.getSinkNum()));
      int var3 = (int)Math.min(this.source2SinkUB + this.tNode2SinkUB, 2000000000L);
      var2 = Math.min(var3, var2);
      List var4 = this.getSources();
      int var5 = 0;

      for (NetworkGenerator.Node var7 : var4) {
         var5 += Math.min(this.config.getSinkNum(), var7.supply);
      }

      var2 = Math.min(var2, var5);
      Distributor var23 = new Distributor(this.rng);
      var23.addLowerBound(var0 -> 1);
      var23.addUpperBound(var0 -> var0.supply);
      var23.addUpperBound(var1x -> this.config.getSinkNum());
      List var24 = var23.getDistribution(var4, var2);
      List var8 = this.getSinks();
      int var9 = 0;
      int var10 = 0;

      while (var9 < var4.size()) {
         NetworkGenerator.Node var11 = (NetworkGenerator.Node)var4.get(var9);
         int var12 = (Integer)var24.get(var9);
         ArrayList var13 = new ArrayList();

         for (int var14 = 0; var14 < var12; var10++) {
            if (var10 == var8.size()) {
               var10 = 0;
            }

            var13.add((NetworkGenerator.Node)var8.get(var10));
            var14++;
         }

         Distributor var25 = new Distributor(this.rng);
         var25.addLowerBound(var0 -> 1);
         List var15 = var25.getDistribution(var13, var11.supply);

         for (int var16 = 0; var16 < var12; var16++) {
            NetworkGenerator.Node var17 = (NetworkGenerator.Node)var13.get(var16);
            int var18 = (Integer)var15.get(var16);
            int var19 = this.generateRandom(var11.getChainLength());
            NetworkGenerator.Node var20 = var11.chainNodes.get(var19);
            this.addSkeletonArc(var11, var20, var17);
            this.supplyMap.put(var17.graphVertex, this.supplyMap.getOrDefault(var17.graphVertex, 0) - var18);
         }

         var9++;
      }
   }

   private void addAllRemainingArcs() {
      int var1 = this.config.getArcNum() - this.graph.edgeSet().size();
      assert var1 >= 0;
      ArrayList var2 = new ArrayList<>(
         List.of(
            this.source2TSourceUB,
            this.source2TNodeUB,
            this.source2SinkUB,
            this.tNode2TSourceUB,
            this.tNode2TNodeUB,
            this.tNode2SinkUB,
            this.tSink2TSourceUB,
            this.tSink2TNodeUB,
            this.tSink2SinkUB
         )
      );
      long var3 = var2.stream().mapToLong(var0 -> var0).sum();
      if (var3 != 0L) {
         Distributor var5 = new Distributor(this.rng);
         var5.addUpperBound(var1x -> (int)Math.min((Long)var2.get(var1x), 2000000000L));
         var5.addUpperBound(var4 -> {
            double var5x = (double)((Long)var2.get(var4)).longValue() / var3;
            int var7 = (int)(2.0 * var5x * var1);
            return var7 + 1;
         });
         List var6 = var5.getDistribution(IntStream.range(0, var2.size()).boxed().collect(Collectors.toList()), var1);
         this.generateArcs(this.getSources(), this.getTransshipSources(), (Integer)var6.get(0));
         this.generateArcs(this.getSources(), this.getTransshipNodes(), (Integer)var6.get(1));
         this.generateArcs(this.getSources(), this.getSinks(), (Integer)var6.get(2));
         this.generateArcs(this.getTransshipNodes(), this.getTransshipSources(), (Integer)var6.get(3));
         this.generateArcs(this.getTransshipNodes(), this.getTransshipNodes(), (Integer)var6.get(4));
         this.generateArcs(this.getTransshipNodes(), this.getSinks(), (Integer)var6.get(5));
         this.generateArcs(this.getTransshipSinks(), this.getTransshipSources(), (Integer)var6.get(6));
         this.generateArcs(this.getTransshipSinks(), this.getTransshipNodes(), (Integer)var6.get(7));
         this.generateArcs(this.getTransshipSinks(), this.getSinks(), (Integer)var6.get(8));
         assert this.config.getArcNum() - this.graph.edgeSet().size() == 0;
      }
   }

   private void generateArcs(List<NetworkGenerator<V, E>.Node> var1, List<NetworkGenerator<V, E>.Node> var2, int var3) {
      HashSet var4 = new HashSet<>(var2);
      List var5 = var1.stream().map(var2x -> this.getPossibleArcNum((NetworkGenerator<V, E>.Node)var2x, var4)).collect(Collectors.toList());
      long var6 = var5.stream().mapToLong(var0 -> var0.intValue()).sum();
      Distributor var8 = new Distributor(this.rng);
      var8.addUpperBound(var5::get);
      var8.addUpperBound(var4x -> {
         double var5x = (double)((Integer)var5.get(var4x)).intValue() / var6;
         int var7 = (int)(2.0 * var5x * var3);
         return var7 + 1;
      });
      List var9 = var8.getDistribution(IntStream.range(0, var1.size()).boxed().collect(Collectors.toList()), var3);

      for (int var10 = 0; var10 < var1.size(); var10++) {
         NetworkGenerator.Node var11 = (NetworkGenerator.Node)var1.get(var10);
         int var12 = (Integer)var9.get(var10);
         ElementsSequenceGenerator var13 = new ElementsSequenceGenerator<>(var2, this.rng);

         while (var12 > 0 && var13.hasNext()) {
            NetworkGenerator.Node var14 = (NetworkGenerator.Node)var13.next();
            if (this.isValidArc(var11, var14)) {
               var12--;
               this.addArc(var11, var14);
            }
         }

         assert var12 == 0;
      }
   }

   private int getPossibleArcNum(NetworkGenerator<V, E>.Node var1, Set<NetworkGenerator<V, E>.Node> var2) {
      int var3 = var2.size();
      if (var2.contains(var1)) {
         var3--;
      }

      for (Object var5 : this.graph.outgoingEdgesOf(var1.graphVertex)) {
         NetworkGenerator.Node var6 = this.graphVertexMapping.get(Graphs.getOppositeVertex(this.graph, (E)var5, var1.graphVertex));
         if (var2.contains(var6)) {
            var3--;
         }
      }

      return var3;
   }

   public NetworkInfo<V, E> getNetworkInfo() {
      return this.networkInfo;
   }

   private boolean isValidArc(NetworkGenerator<V, E>.Node var1, NetworkGenerator<V, E>.Node var2) {
      return var1 != var2 && !this.graph.containsEdge(var1.graphVertex, var2.graphVertex);
   }

   private void addSkeletonArc(NetworkGenerator<V, E>.Node var1, NetworkGenerator<V, E>.Node var2, NetworkGenerator<V, E>.Node var3) {
      assert this.isValidArc(var2, var3);
      Object var4 = this.graph.addEdge(var2.graphVertex, var3.graphVertex);
      this.capacityMap.put((E)var4, Math.max(this.getCapacity(), var1.supply));
      this.costMap.put((E)var4, this.getCost());
      this.registerSkeletonArc(var2, var3);
      this.networkInfo.registerChainArc((E)var4);
      if (var3.type == NetworkGenerator.NodeType.TRANSSHIP_NODE) {
         var1.chainNodes.add(var3);
      }
   }

   private void addArc(NetworkGenerator<V, E>.Node var1, NetworkGenerator<V, E>.Node var2) {
      assert this.isValidArc(var1, var2);
      Object var3 = this.graph.addEdge(var1.graphVertex, var2.graphVertex);
      this.capacityMap.put((E)var3, this.getCapacity());
      this.costMap.put((E)var3, this.getCost());
   }

   private void registerSkeletonArc(NetworkGenerator<V, E>.Node var1, NetworkGenerator<V, E>.Node var2) {
      switch (var1.type) {
         case TRANSSHIP_NODE:
            switch (var2.type) {
               case TRANSSHIP_NODE:
                  this.tNode2TNodeUB--;
                  return;
               case TRANSSHIP_SINK:
               case PURE_SINK:
                  this.tNode2SinkUB--;
                  return;
               default:
                  throw new RuntimeException();
            }
         case TRANSSHIP_SINK:
         case PURE_SINK:
         default:
            throw new RuntimeException();
         case PURE_SOURCE:
         case TRANSSHIP_SOURCE:
            switch (var2.type) {
               case TRANSSHIP_NODE:
                  this.source2TNodeUB--;
                  break;
               case TRANSSHIP_SINK:
               case PURE_SINK:
                  this.source2SinkUB--;
                  break;
               default:
                  throw new RuntimeException();
            }
      }
   }

   private int getCapacity() {
      int var1 = this.generateBetween(1, 100);
      return var1 <= this.config.getPercentCapacitated() ? this.generateBetween(this.config.getMinCap(), this.config.getMaxCap()) : Integer.MAX_VALUE;
   }

   private int getCost() {
      int var1 = this.generateBetween(1, 100);
      return var1 <= this.config.getPercentWithInfCost() ? Integer.MAX_VALUE : this.generateBetween(this.config.getMinCost(), this.config.getMaxCost());
   }

   private int generatePositiveRandom(int var1) {
      return this.rng.nextInt(var1) + 1;
   }

   private int generateBetween(int var1, int var2) {
      return this.rng.nextInt(var2 - var1 + 1) + var1;
   }

   private int generateRandom(int var1) {
      return this.rng.nextInt(var1);
   }

   private List<NetworkGenerator<V, E>.Node> getTransshipSources() {
      return this.nodes.subList(this.config.getPureSourceNum(), this.config.getSourceNum());
   }

   private List<NetworkGenerator<V, E>.Node> getSources() {
      return this.nodes.subList(0, this.config.getSourceNum());
   }

   private List<NetworkGenerator<V, E>.Node> getTransshipNodes() {
      return this.nodes.subList(this.config.getSourceNum(), this.config.getSourceNum() + this.config.getTransshipNodeNum());
   }

   private List<NetworkGenerator<V, E>.Node> getTransshipSinks() {
      return this.nodes.subList(this.config.getSourceNum() + this.config.getTransshipNodeNum(), this.nodes.size() - this.config.getPureSinkNum());
   }

   private List<NetworkGenerator<V, E>.Node> getSinks() {
      return this.nodes.subList(this.config.getSourceNum() + this.config.getTransshipNodeNum(), this.nodes.size());
   }

   private class Node {
      V graphVertex;
      int supply;
      NetworkGenerator.NodeType type;
      List<NetworkGenerator<V, E>.Node> chainNodes;

      Node(V var2, NetworkGenerator.NodeType var3) {
         this.graphVertex = (V)var2;
         this.type = var3;
         this.chainNodes = new ArrayList<>();
      }

      NetworkGenerator<V, E>.Node getLastInChain() {
         return this.chainNodes.get(this.chainNodes.size() - 1);
      }

      int getChainLength() {
         return this.chainNodes.size();
      }

      @Override
      public String toString() {
         return String.format("{%s}: type = %s, supply = %d", this.graphVertex, this.type, this.supply);
      }
   }

   private enum NodeType {
      PURE_SOURCE {
         @Override
         public String toString() {
            return "Pure source";
         }
      },
      TRANSSHIP_SOURCE {
         @Override
         public String toString() {
            return "Transship source";
         }
      },
      TRANSSHIP_NODE {
         @Override
         public String toString() {
            return "Transship node";
         }
      },
      TRANSSHIP_SINK {
         @Override
         public String toString() {
            return "Transship sink";
         }
      },
      PURE_SINK {
         @Override
         public String toString() {
            return "Pure sink";
         }
      };

      @Override
      public abstract String toString();
   }
}
