package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.AbstractEqualityComparator;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.FlexibleHashMap;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum PredictionMode {
   SLL,
   LL,
   LL_EXACT_AMBIG_DETECTION;

   public static boolean hasSLLConflictTerminatingPrediction(PredictionMode var0, ATNConfigSet var1) {
      if (allConfigsInRuleStopStates(var1)) {
         return true;
      }

      if (var0 == SLL && var1.hasSemanticContext) {
         ATNConfigSet var2 = new ATNConfigSet();

         for (ATNConfig var4 : var1) {
            var4 = new ATNConfig(var4, SemanticContext.Empty.Instance);
            var2.add(var4);
         }

         var1 = var2;
      }

      Collection var5 = getConflictingAltSubsets(var1);
      return hasConflictingAltSet(var5) && !hasStateAssociatedWithOneAlt(var1);
   }

   public static boolean hasConfigInRuleStopState(ATNConfigSet var0) {
      for (ATNConfig var2 : var0) {
         if (var2.state instanceof RuleStopState) {
            return true;
         }
      }

      return false;
   }

   public static boolean allConfigsInRuleStopStates(ATNConfigSet var0) {
      for (ATNConfig var2 : var0) {
         if (!(var2.state instanceof RuleStopState)) {
            return false;
         }
      }

      return true;
   }

   public static int resolvesToJustOneViableAlt(Collection<BitSet> var0) {
      return getSingleViableAlt(var0);
   }

   public static boolean allSubsetsConflict(Collection<BitSet> var0) {
      return !hasNonConflictingAltSet(var0);
   }

   public static boolean hasNonConflictingAltSet(Collection<BitSet> var0) {
      for (BitSet var2 : var0) {
         if (var2.cardinality() == 1) {
            return true;
         }
      }

      return false;
   }

   public static boolean hasConflictingAltSet(Collection<BitSet> var0) {
      for (BitSet var2 : var0) {
         if (var2.cardinality() > 1) {
            return true;
         }
      }

      return false;
   }

   public static boolean allSubsetsEqual(Collection<BitSet> var0) {
      Iterator var1 = var0.iterator();
      BitSet var2 = (BitSet)var1.next();

      while (var1.hasNext()) {
         BitSet var3 = (BitSet)var1.next();
         if (!var3.equals(var2)) {
            return false;
         }
      }

      return true;
   }

   public static int getUniqueAlt(Collection<BitSet> var0) {
      BitSet var1 = getAlts(var0);
      return var1.cardinality() == 1 ? var1.nextSetBit(0) : 0;
   }

   public static BitSet getAlts(Collection<BitSet> var0) {
      BitSet var1 = new BitSet();

      for (BitSet var3 : var0) {
         var1.or(var3);
      }

      return var1;
   }

   public static Collection<BitSet> getConflictingAltSubsets(ATNConfigSet var0) {
      PredictionMode.AltAndContextMap var1 = new PredictionMode.AltAndContextMap();

      for (ATNConfig var3 : var0) {
         BitSet var4 = var1.get(var3);
         if (var4 == null) {
            var4 = new BitSet();
            var1.put(var3, var4);
         }

         var4.set(var3.alt);
      }

      return var1.values();
   }

   public static Map<ATNState, BitSet> getStateToAltMap(ATNConfigSet var0) {
      HashMap var1 = new HashMap();

      for (ATNConfig var3 : var0) {
         BitSet var4 = (BitSet)var1.get(var3.state);
         if (var4 == null) {
            var4 = new BitSet();
            var1.put(var3.state, var4);
         }

         var4.set(var3.alt);
      }

      return var1;
   }

   public static boolean hasStateAssociatedWithOneAlt(ATNConfigSet var0) {
      Map var1 = getStateToAltMap(var0);

      for (BitSet var3 : var1.values()) {
         if (var3.cardinality() == 1) {
            return true;
         }
      }

      return false;
   }

   public static int getSingleViableAlt(Collection<BitSet> var0) {
      BitSet var1 = new BitSet();

      for (BitSet var3 : var0) {
         int var4 = var3.nextSetBit(0);
         var1.set(var4);
         if (var1.cardinality() > 1) {
            return 0;
         }
      }

      return var1.nextSetBit(0);
   }

   private static final class AltAndContextConfigEqualityComparator extends AbstractEqualityComparator<ATNConfig> {
      public static final PredictionMode.AltAndContextConfigEqualityComparator INSTANCE = new PredictionMode.AltAndContextConfigEqualityComparator();

      public int hashCode(ATNConfig var1) {
         int var2 = MurmurHash.initialize(7);
         var2 = MurmurHash.update(var2, var1.state.stateNumber);
         var2 = MurmurHash.update(var2, var1.context);
         return MurmurHash.finish(var2, 2);
      }

      public boolean equals(ATNConfig var1, ATNConfig var2) {
         if (var1 == var2) {
            return true;
         } else {
            return var1 != null && var2 != null ? var1.state.stateNumber == var2.state.stateNumber && var1.context.equals(var2.context) : false;
         }
      }
   }

   static class AltAndContextMap extends FlexibleHashMap<ATNConfig, BitSet> {
      public AltAndContextMap() {
         super(PredictionMode.AltAndContextConfigEqualityComparator.INSTANCE);
      }
   }
}
