package org.jgrapht.generate.netgen;

public class NetworkGeneratorConfig {
   private final int nodeNum;
   private final int arcNum;
   private final int sourceNum;
   private final int sinkNum;
   private final int transshipSourceNum;
   private final int transshipSinkNum;
   private final int totalSupply;
   private final int minCap;
   private final int maxCap;
   private final int minCost;
   private final int maxCost;
   private final int percentCapacitated;
   private final int percentWithInfCost;

   NetworkGeneratorConfig(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      this.nodeNum = var1;
      this.arcNum = var2;
      this.sourceNum = var3;
      this.sinkNum = var4;
      this.transshipSourceNum = var5;
      this.transshipSinkNum = var6;
      this.totalSupply = var7;
      this.minCap = var8;
      this.maxCap = var9;
      this.minCost = var10;
      this.maxCost = var11;
      this.percentCapacitated = var12;
      this.percentWithInfCost = var13;
   }

   public long getMaxSource2TSourceArcNum() {
      return (long)this.getPureSourceNum() * this.transshipSourceNum + (long)this.transshipSourceNum * (this.transshipSourceNum - 1);
   }

   public long getMaxSource2TNodeArcNum() {
      return (long)this.sourceNum * this.getTransshipNodeNum();
   }

   public long getMaxSource2SinkArcNum() {
      return (long)this.sourceNum * this.sinkNum;
   }

   public long getMaxTNode2TSourceArcNum() {
      return (long)this.getTransshipNodeNum() * this.transshipSourceNum;
   }

   public long getMaxTNode2TNodeArcNum() {
      return (long)this.getTransshipNodeNum() * (this.getTransshipNodeNum() - 1);
   }

   public long getMaxTNode2SinkArcNum() {
      return (long)this.getTransshipNodeNum() * this.sinkNum;
   }

   public long getMaxTSink2TSourceArcNum() {
      return (long)this.transshipSinkNum * this.transshipSourceNum;
   }

   public long getMaxTSink2TNodeArcNum() {
      return (long)this.transshipSinkNum * this.getTransshipNodeNum();
   }

   public long getMaxTSink2SinkArcNum() {
      return (long)this.transshipSinkNum * (this.transshipSinkNum - 1) + this.getPureSinkNum() * this.transshipSinkNum;
   }

   public long getMaxSource2AllArcNum() {
      return this.getMaxSource2TSourceArcNum() + this.getMaxSource2TNodeArcNum() + this.getMaxSource2SinkArcNum();
   }

   public long getMaxTransshipNode2AllArcNum() {
      return this.getMaxTNode2TSourceArcNum() + this.getMaxTNode2TNodeArcNum() + this.getMaxTNode2SinkArcNum();
   }

   public long getMaxSink2ALlArcNum() {
      return this.getMaxTSink2TSourceArcNum() + this.getMaxTSink2TNodeArcNum() + this.getMaxTSink2SinkArcNum();
   }

   public long getMinimumArcNum() {
      return this.getTransshipNodeNum() + Math.max(this.getSourceNum(), this.getSinkNum());
   }

   public long getMaximumArcNum() {
      return this.getMaxSource2AllArcNum() + this.getMaxTransshipNode2AllArcNum() + this.getMaxSink2ALlArcNum();
   }

   public static long getMinimumArcNum(long var0, long var2, long var4) {
      return var2 + Math.max(var0, var4);
   }

   public static long getMaximumArcNum(long var0, long var2, long var4) {
      return getMaximumArcNum(var0, 0L, var2, 0L, var4);
   }

   public static long getMaximumArcNum(long var0, long var2, long var4, long var6, long var8) {
      long var10 = var0 - var2;
      long var12 = var10 * var2 + var2 * (var2 - 1L) + var0 * (var4 + var8);
      long var14 = var4 * (var2 + (var4 - 1L) + var8);
      long var16 = var6 * (var2 + var4 + (var8 - 1L));
      return var12 + var14 + var16;
   }

   public int getPureSourceNum() {
      return this.sourceNum - this.transshipSourceNum;
   }

   public int getPureSinkNum() {
      return this.sinkNum - this.transshipSinkNum;
   }

   public boolean isCostWeighted() {
      return this.minCost != this.maxCost;
   }

   public int getTransshipNodeNum() {
      return this.nodeNum - this.sourceNum - this.sinkNum;
   }

   private boolean transportationProblemCondition() {
      return this.sourceNum + this.sinkNum == this.nodeNum && this.transshipSourceNum == 0 && this.transshipSinkNum == 0;
   }

   private boolean assignmentProblemCondition() {
      return this.sourceNum == this.sinkNum && this.totalSupply == this.sourceNum && this.minCap == 1 && this.maxCap == 1;
   }

   public boolean isMaxFlowProblem() {
      return !this.isCostWeighted();
   }

   public boolean isAssignmentProblem() {
      return this.transportationProblemCondition() && this.assignmentProblemCondition();
   }

   public int getNodeNum() {
      return this.nodeNum;
   }

   public int getArcNum() {
      return this.arcNum;
   }

   public int getSourceNum() {
      return this.sourceNum;
   }

   public int getSinkNum() {
      return this.sinkNum;
   }

   public int getTransshipSourceNum() {
      return this.transshipSourceNum;
   }

   public int getTransshipSinkNum() {
      return this.transshipSinkNum;
   }

   public int getTotalSupply() {
      return this.totalSupply;
   }

   public int getMinCap() {
      return this.minCap;
   }

   public int getMaxCap() {
      return this.maxCap;
   }

   public int getMinCost() {
      return this.minCost;
   }

   public int getMaxCost() {
      return this.maxCost;
   }

   public int getPercentCapacitated() {
      return this.percentCapacitated;
   }

   public int getPercentWithInfCost() {
      return this.percentWithInfCost;
   }
}
