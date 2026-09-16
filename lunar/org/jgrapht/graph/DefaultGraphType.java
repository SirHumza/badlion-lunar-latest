package org.jgrapht.graph;

import java.io.Serializable;
import org.jgrapht.GraphType;

public class DefaultGraphType implements Serializable, GraphType {
   private static final long serialVersionUID = 4291049312119347474L;
   private final boolean directed;
   private final boolean undirected;
   private final boolean selfLoops;
   private final boolean multipleEdges;
   private final boolean weighted;
   private final boolean allowsCycles;
   private final boolean modifiable;

   private DefaultGraphType(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.directed = var1;
      this.undirected = var2;
      this.selfLoops = var3;
      this.multipleEdges = var4;
      this.weighted = var5;
      this.allowsCycles = var6;
      this.modifiable = var7;
   }

   @Override
   public boolean isDirected() {
      return this.directed && !this.undirected;
   }

   @Override
   public boolean isUndirected() {
      return this.undirected && !this.directed;
   }

   @Override
   public boolean isMixed() {
      return this.undirected && this.directed;
   }

   @Override
   public boolean isAllowingMultipleEdges() {
      return this.multipleEdges;
   }

   @Override
   public boolean isAllowingSelfLoops() {
      return this.selfLoops;
   }

   @Override
   public boolean isWeighted() {
      return this.weighted;
   }

   @Override
   public boolean isAllowingCycles() {
      return this.allowsCycles;
   }

   @Override
   public boolean isModifiable() {
      return this.modifiable;
   }

   @Override
   public boolean isSimple() {
      return !this.isAllowingMultipleEdges() && !this.isAllowingSelfLoops();
   }

   @Override
   public boolean isPseudograph() {
      return this.isAllowingMultipleEdges() && this.isAllowingSelfLoops();
   }

   @Override
   public boolean isMultigraph() {
      return this.isAllowingMultipleEdges() && !this.isAllowingSelfLoops();
   }

   @Override
   public GraphType asDirected() {
      return new DefaultGraphType.Builder(this).directed().build();
   }

   @Override
   public GraphType asUndirected() {
      return new DefaultGraphType.Builder(this).undirected().build();
   }

   @Override
   public GraphType asMixed() {
      return new DefaultGraphType.Builder(this).mixed().build();
   }

   @Override
   public GraphType asUnweighted() {
      return new DefaultGraphType.Builder(this).weighted(false).build();
   }

   @Override
   public GraphType asWeighted() {
      return new DefaultGraphType.Builder(this).weighted(true).build();
   }

   @Override
   public GraphType asModifiable() {
      return new DefaultGraphType.Builder(this).modifiable(true).build();
   }

   @Override
   public GraphType asUnmodifiable() {
      return new DefaultGraphType.Builder(this).modifiable(false).build();
   }

   public static DefaultGraphType simple() {
      return new DefaultGraphType.Builder().undirected().allowSelfLoops(false).allowMultipleEdges(false).weighted(false).build();
   }

   public static DefaultGraphType multigraph() {
      return new DefaultGraphType.Builder().undirected().allowSelfLoops(false).allowMultipleEdges(true).weighted(false).build();
   }

   public static DefaultGraphType pseudograph() {
      return new DefaultGraphType.Builder().undirected().allowSelfLoops(true).allowMultipleEdges(true).weighted(false).build();
   }

   public static DefaultGraphType directedSimple() {
      return new DefaultGraphType.Builder().directed().allowSelfLoops(false).allowMultipleEdges(false).weighted(false).build();
   }

   public static DefaultGraphType directedMultigraph() {
      return new DefaultGraphType.Builder().directed().allowSelfLoops(false).allowMultipleEdges(true).weighted(false).build();
   }

   public static DefaultGraphType directedPseudograph() {
      return new DefaultGraphType.Builder().directed().allowSelfLoops(true).allowMultipleEdges(true).weighted(false).build();
   }

   public static DefaultGraphType mixed() {
      return new DefaultGraphType.Builder().mixed().allowSelfLoops(true).allowMultipleEdges(true).weighted(false).build();
   }

   public static DefaultGraphType dag() {
      return new DefaultGraphType.Builder().directed().allowSelfLoops(false).allowMultipleEdges(true).allowCycles(false).weighted(false).build();
   }

   @Override
   public String toString() {
      return "DefaultGraphType [directed="
         + this.directed
         + ", undirected="
         + this.undirected
         + ", self-loops="
         + this.selfLoops
         + ", multiple-edges="
         + this.multipleEdges
         + ", weighted="
         + this.weighted
         + ", allows-cycles="
         + this.allowsCycles
         + ", modifiable="
         + this.modifiable
         + "]";
   }

   public static class Builder {
      private boolean directed;
      private boolean undirected;
      private boolean allowSelfLoops;
      private boolean allowMultipleEdges;
      private boolean weighted;
      private boolean allowCycles;
      private boolean modifiable;

      public Builder() {
         this.directed = false;
         this.undirected = true;
         this.allowSelfLoops = true;
         this.allowMultipleEdges = true;
         this.weighted = false;
         this.allowCycles = true;
         this.modifiable = true;
      }

      public Builder(GraphType var1) {
         this.directed = var1.isDirected() || var1.isMixed();
         this.undirected = var1.isUndirected() || var1.isMixed();
         this.allowSelfLoops = var1.isAllowingSelfLoops();
         this.allowMultipleEdges = var1.isAllowingMultipleEdges();
         this.weighted = var1.isWeighted();
         this.allowCycles = var1.isAllowingCycles();
         this.modifiable = var1.isModifiable();
      }

      public Builder(boolean var1, boolean var2) {
         if (!var1 && !var2) {
            throw new IllegalArgumentException("At least one of directed or undirected must be true");
         }

         this.directed = var1;
         this.undirected = var2;
         this.allowSelfLoops = true;
         this.allowMultipleEdges = true;
         this.weighted = false;
         this.allowCycles = true;
         this.modifiable = true;
      }

      public DefaultGraphType.Builder directed() {
         this.directed = true;
         this.undirected = false;
         return this;
      }

      public DefaultGraphType.Builder undirected() {
         this.directed = false;
         this.undirected = true;
         return this;
      }

      public DefaultGraphType.Builder mixed() {
         this.directed = true;
         this.undirected = true;
         return this;
      }

      public DefaultGraphType.Builder allowSelfLoops(boolean var1) {
         this.allowSelfLoops = var1;
         return this;
      }

      public DefaultGraphType.Builder allowMultipleEdges(boolean var1) {
         this.allowMultipleEdges = var1;
         return this;
      }

      public DefaultGraphType.Builder weighted(boolean var1) {
         this.weighted = var1;
         return this;
      }

      public DefaultGraphType.Builder allowCycles(boolean var1) {
         this.allowCycles = var1;
         return this;
      }

      public DefaultGraphType.Builder modifiable(boolean var1) {
         this.modifiable = var1;
         return this;
      }

      public DefaultGraphType build() {
         return new DefaultGraphType(
            this.directed, this.undirected, this.allowSelfLoops, this.allowMultipleEdges, this.weighted, this.allowCycles, this.modifiable
         );
      }
   }
}
