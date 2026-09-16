package org.jgrapht.alg.matching.blossom.v5;

public class BlossomVOptions {
   public static final BlossomVOptions[] ALL_OPTIONS = new BlossomVOptions[]{
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, true, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, true, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, false, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, true, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, true, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.NONE, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, false, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, true, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, true, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, false, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, true, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, true, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.GREEDY, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, true, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, true, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS, false, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, true, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, true, false),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, false, true),
      new BlossomVOptions(BlossomVOptions.InitializationType.FRACTIONAL, BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA, false, true)
   };
   private static final BlossomVOptions.InitializationType DEFAULT_INITIALIZATION_TYPE = BlossomVOptions.InitializationType.FRACTIONAL;
   private static final BlossomVOptions.DualUpdateStrategy DEFAULT_DUAL_UPDATE_TYPE = BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA;
   private static final boolean DEFAULT_UPDATE_DUALS_BEFORE = true;
   private static final boolean DEFAULT_UPDATE_DUALS_AFTER = false;
   BlossomVOptions.DualUpdateStrategy dualUpdateStrategy;
   BlossomVOptions.InitializationType initializationType;
   boolean updateDualsBefore;
   boolean updateDualsAfter;

   public BlossomVOptions(BlossomVOptions.InitializationType var1, BlossomVOptions.DualUpdateStrategy var2, boolean var3, boolean var4) {
      this.dualUpdateStrategy = var2;
      this.initializationType = var1;
      this.updateDualsBefore = var3;
      this.updateDualsAfter = var4;
   }

   public BlossomVOptions(BlossomVOptions.InitializationType var1) {
      this(var1, DEFAULT_DUAL_UPDATE_TYPE, true, false);
   }

   public BlossomVOptions() {
      this(DEFAULT_INITIALIZATION_TYPE, DEFAULT_DUAL_UPDATE_TYPE, true, false);
   }

   @Override
   public String toString() {
      return "BlossomVOptions{initializationType="
         + this.initializationType
         + ", dualUpdateStrategy="
         + this.dualUpdateStrategy
         + ", updateDualsBefore="
         + this.updateDualsBefore
         + ", updateDualsAfter="
         + this.updateDualsAfter
         + "}";
   }

   public boolean isUpdateDualsBefore() {
      return this.updateDualsBefore;
   }

   public boolean isUpdateDualsAfter() {
      return this.updateDualsAfter;
   }

   public BlossomVOptions.DualUpdateStrategy getDualUpdateStrategy() {
      return this.dualUpdateStrategy;
   }

   public BlossomVOptions.InitializationType getInitializationType() {
      return this.initializationType;
   }

   public enum DualUpdateStrategy {
      MULTIPLE_TREE_FIXED_DELTA {
         @Override
         public String toString() {
            return "Multiple tree fixed delta";
         }
      },
      MULTIPLE_TREE_CONNECTED_COMPONENTS {
         @Override
         public String toString() {
            return "Multiple tree connected components";
         }
      };

      @Override
      public abstract String toString();
   }

   public enum InitializationType {
      GREEDY {
         @Override
         public String toString() {
            return "Greedy initialization";
         }
      },
      NONE {
         @Override
         public String toString() {
            return "None";
         }
      },
      FRACTIONAL {
         @Override
         public String toString() {
            return "Fractional matching initializations";
         }
      };

      @Override
      public abstract String toString();
   }
}
