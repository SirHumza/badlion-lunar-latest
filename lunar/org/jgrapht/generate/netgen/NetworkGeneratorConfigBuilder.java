package org.jgrapht.generate.netgen;

public class NetworkGeneratorConfigBuilder {
   int nodeNum = 0;
   int arcNum = 0;
   int sourceNum = 0;
   int sinkNum = 0;
   int tSourceNum = 0;
   int tSinkNum = 0;
   int totalSupply = 0;
   int minCap = 0;
   int maxCap = 0;
   int minCost = 0;
   int maxCost = 0;
   int percentCapacitated = 100;
   int percentWithInfCost = 0;

   public NetworkGeneratorConfig build() {
      if (this.nodeNum <= 0) {
         this.invalidParam("Number of nodes must be positive");
      } else if (this.arcNum <= 0) {
         this.invalidParam("Number of arcs must be positive");
      } else if (this.sourceNum <= 0) {
         this.invalidParam("Number of sources must be positive");
      } else if (this.sinkNum <= 0) {
         this.invalidParam("Number of sinks must be positive");
      } else if (this.sourceNum + this.sinkNum > this.nodeNum) {
         this.invalidParam("Number of sources and sinks must not exceed the number of nodes");
      } else if (this.tSourceNum > this.sourceNum) {
         this.invalidParam("Number of transhipment sources must not exceed the overall number of sources");
      } else if (this.tSinkNum > this.sinkNum) {
         this.invalidParam("Number of transhipment sinks must not exceed the overall number of sinks");
      } else if (this.totalSupply < Math.max(this.sourceNum, this.sinkNum)) {
         this.invalidParam("Total supply must not be less than the number of sources and the number of sinks");
      } else if (this.minCap > this.maxCap) {
         this.invalidParam("Minimum capacity must not exceed the maximum capacity");
      } else if (this.minCap <= 0) {
         this.invalidParam("Minimum capacity must be positive");
      } else if (this.minCost > this.maxCost) {
         this.invalidParam("Minimum cost must not exceed the maximum cost");
      }

      int var1 = this.nodeNum - this.sourceNum - this.sinkNum;
      long var2 = NetworkGeneratorConfig.getMinimumArcNum(this.sourceNum, var1, this.sinkNum);
      long var4 = NetworkGeneratorConfig.getMaximumArcNum(this.sourceNum, this.tSourceNum, var1, this.tSinkNum, this.sinkNum);
      if (this.arcNum < var2) {
         this.invalidParam("Too few arcs to generate a valid problem");
      } else if (this.arcNum > var4) {
         this.invalidParam("Too many arcs to generate a valid problem");
      }

      return new NetworkGeneratorConfig(
         this.nodeNum,
         this.arcNum,
         this.sourceNum,
         this.sinkNum,
         this.tSourceNum,
         this.tSinkNum,
         this.totalSupply,
         this.minCap,
         this.maxCap,
         this.minCost,
         this.maxCost,
         this.percentCapacitated,
         this.percentWithInfCost
      );
   }

   private void invalidParam(String var1) {
      throw new IllegalArgumentException(var1);
   }

   private int checkNodeConstraint(int var1) {
      if (var1 > 100000000) {
         this.invalidParam(String.format("Number of nodes must not exceed %d", 100000000));
      }

      return var1;
   }

   private int checkCapacityCostConstraint(int var1) {
      if (Math.abs(var1) > 2000000000) {
         this.invalidParam(String.format("Arcs capacities and cost must be between -%d and %d", 2000000000, 2000000000));
      }

      return var1;
   }

   public NetworkGeneratorConfigBuilder setParams(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      this.setNodeNum(var1);
      this.setArcNum(var2);
      this.setSourceNum(var3);
      this.setSinkNum(var4);
      this.setTSourceNum(var5);
      this.setTSinkNum(var6);
      this.setTotalSupply(var7);
      this.setMinCap(var8);
      this.setMaxCap(var9);
      this.setMinCost(var10);
      this.setMaxCost(var11);
      this.setPercentCapacitated(var12);
      this.setPercentWithInfCost(var13);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMaximumFlowProblemParams(int var1, int var2, int var3) {
      this.setMaximumFlowProblemParams(var1, var2, var3, 1, 1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMaximumFlowProblemParams(int var1, int var2, int var3, int var4, int var5) {
      this.setMaximumFlowProblemParams(var1, var2, var3, var4, var5, 1, 1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMaximumFlowProblemParams(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.setMaximumFlowProblemParams(var1, var2, var3, var4, var5, var6, var7, 100);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMaximumFlowProblemParams(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.setParams(var1, var2, var6, var7, 0, 0, var3, var4, var5, 1, 1, var8, 0);
      return this;
   }

   public NetworkGeneratorConfigBuilder setBipartiteMatchingProblemParams(int var1, int var2) {
      this.setBipartiteMatchingProblemParams(var1, var2, 1, 1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setBipartiteMatchingProblemParams(int var1, int var2, int var3, int var4) {
      this.setBipartiteMatchingProblemParams(var1, var2, var3, var4, 0);
      return this;
   }

   public NetworkGeneratorConfigBuilder setBipartiteMatchingProblemParams(int var1, int var2, int var3, int var4, int var5) {
      if ((var1 & 1) != 0) {
         this.invalidParam("Assignment problem must have even number of nodes");
      }

      this.setParams(var1, var2, var1 / 2, var1 / 2, 0, 0, var1 / 2, 1, 1, var3, var4, 100, var5);
      return this;
   }

   public NetworkGeneratorConfigBuilder setNodeNum(int var1) {
      if (var1 <= 0) {
         this.invalidParam("Number of nodes must be positive");
      }

      this.nodeNum = this.checkNodeConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setArcNum(int var1) {
      if (var1 > 2000000000) {
         this.invalidParam(String.format("Number of arcs must not exceed %d", var1));
      }

      this.arcNum = var1;
      return this;
   }

   public NetworkGeneratorConfigBuilder setSourceNum(int var1) {
      if (var1 <= 0) {
         this.invalidParam("Number of sources must be positive");
      }

      this.sourceNum = this.checkNodeConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setSinkNum(int var1) {
      if (var1 <= 0) {
         this.invalidParam("Number of sinks must be positive");
      }

      this.sinkNum = this.checkNodeConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setTSourceNum(int var1) {
      if (var1 < 0) {
         this.invalidParam("Number of transshipment sources must be non-negative");
      }

      this.tSourceNum = this.checkNodeConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setTSinkNum(int var1) {
      if (var1 < 0) {
         this.invalidParam("Number of transshipment sinks must be non-negative");
      }

      this.tSinkNum = this.checkNodeConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setTotalSupply(int var1) {
      if (var1 > 200000000) {
         this.invalidParam(String.format("Total supply must not exceed %d", 100000000));
      }

      this.totalSupply = var1;
      return this;
   }

   public NetworkGeneratorConfigBuilder setMinCap(int var1) {
      if (var1 < 0) {
         this.invalidParam("Minimum arc capacity must be non-negative");
      }

      this.minCap = this.checkCapacityCostConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMaxCap(int var1) {
      if (var1 < 0) {
         this.invalidParam("Maximum arc capacity must be non-negative");
      }

      this.maxCap = this.checkCapacityCostConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMinCost(int var1) {
      this.minCost = this.checkCapacityCostConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setMaxCost(int var1) {
      this.maxCost = this.checkCapacityCostConstraint(var1);
      return this;
   }

   public NetworkGeneratorConfigBuilder setPercentCapacitated(int var1) {
      if (var1 < 0 || var1 > 100) {
         this.invalidParam("Percent of capacitated arcs must be between 0 and 100 inclusive");
      }

      this.percentCapacitated = var1;
      return this;
   }

   public NetworkGeneratorConfigBuilder setPercentWithInfCost(int var1) {
      if (var1 < 0 || var1 > 100) {
         this.invalidParam("Percent of arcs with infinite cost must be between 0 and 100 inclusive");
      }

      this.percentWithInfCost = var1;
      return this;
   }
}
