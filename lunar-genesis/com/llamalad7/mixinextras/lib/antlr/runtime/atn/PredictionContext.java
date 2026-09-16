package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.ParserRuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.Recognizer;
import com.llamalad7.mixinextras.lib.antlr.runtime.RuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.DoubleKeyMap;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class PredictionContext {
   private static final AtomicInteger globalNodeCount = new AtomicInteger();
   public final int id = globalNodeCount.getAndIncrement();
   public final int cachedHashCode;

   protected PredictionContext(int var1) {
      this.cachedHashCode = var1;
   }

   public static PredictionContext fromRuleContext(ATN var0, RuleContext var1) {
      if (var1 == null) {
         var1 = ParserRuleContext.EMPTY;
      }

      if (var1.parent != null && var1 != ParserRuleContext.EMPTY) {
         EmptyPredictionContext var2 = EmptyPredictionContext.Instance;
         PredictionContext var5 = fromRuleContext(var0, var1.parent);
         ATNState var3 = var0.states.get(var1.invokingState);
         RuleTransition var4 = (RuleTransition)var3.transition(0);
         return SingletonPredictionContext.create(var5, var4.followState.stateNumber);
      } else {
         return EmptyPredictionContext.Instance;
      }
   }

   public abstract int size();

   public abstract PredictionContext getParent(int var1);

   public abstract int getReturnState(int var1);

   public boolean isEmpty() {
      return this == EmptyPredictionContext.Instance;
   }

   public boolean hasEmptyPath() {
      return this.getReturnState(this.size() - 1) == Integer.MAX_VALUE;
   }

   @Override
   public final int hashCode() {
      return this.cachedHashCode;
   }

   @Override
   public abstract boolean equals(Object var1);

   protected static int calculateEmptyHashCode() {
      int var0 = MurmurHash.initialize(1);
      return MurmurHash.finish(var0, 0);
   }

   protected static int calculateHashCode(PredictionContext var0, int var1) {
      int var2 = MurmurHash.initialize(1);
      var2 = MurmurHash.update(var2, var0);
      var2 = MurmurHash.update(var2, var1);
      return MurmurHash.finish(var2, 2);
   }

   protected static int calculateHashCode(PredictionContext[] var0, int[] var1) {
      int var2 = MurmurHash.initialize(1);

      for (PredictionContext var6 : var0) {
         var2 = MurmurHash.update(var2, var6);
      }

      for (int var10 : var1) {
         var2 = MurmurHash.update(var2, var10);
      }

      return MurmurHash.finish(var2, 2 * var0.length);
   }

   public static PredictionContext merge(
      PredictionContext var0, PredictionContext var1, boolean var2, DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext> var3
   ) {
      assert var0 != null && var1 != null;
      if (var0 == var1 || var0.equals(var1)) {
         return var0;
      }

      if (var0 instanceof SingletonPredictionContext && var1 instanceof SingletonPredictionContext) {
         return mergeSingletons((SingletonPredictionContext)var0, (SingletonPredictionContext)var1, var2, var3);
      }

      if (var2) {
         if (var0 instanceof EmptyPredictionContext) {
            return var0;
         }

         if (var1 instanceof EmptyPredictionContext) {
            return var1;
         }
      }

      if (var0 instanceof SingletonPredictionContext) {
         var0 = new ArrayPredictionContext((SingletonPredictionContext)var0);
      }

      if (var1 instanceof SingletonPredictionContext) {
         var1 = new ArrayPredictionContext((SingletonPredictionContext)var1);
      }

      return mergeArrays((ArrayPredictionContext)var0, (ArrayPredictionContext)var1, var2, var3);
   }

   public static PredictionContext mergeSingletons(
      SingletonPredictionContext var0,
      SingletonPredictionContext var1,
      boolean var2,
      DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext> var3
   ) {
      if (var3 != null) {
         PredictionContext var4 = (PredictionContext)var3.get(var0, var1);
         if (var4 != null) {
            return var4;
         }

         var4 = (PredictionContext)var3.get(var1, var0);
         if (var4 != null) {
            return var4;
         }
      }

      PredictionContext var10 = mergeRoot(var0, var1, var2);
      if (var10 != null) {
         if (var3 != null) {
            var3.put(var0, var1, var10);
         }

         return var10;
      } else if (var0.returnState == var1.returnState) {
         PredictionContext var11 = merge(var0.parent, var1.parent, var2, var3);
         if (var11 == var0.parent) {
            return var0;
         }

         if (var11 == var1.parent) {
            return var1;
         }

         SingletonPredictionContext var13 = SingletonPredictionContext.create(var11, var0.returnState);
         if (var3 != null) {
            var3.put(var0, var1, var13);
         }

         return var13;
      } else {
         PredictionContext var5 = null;
         if (var0 == var1 || var0.parent != null && var0.parent.equals(var1.parent)) {
            var5 = var0.parent;
         }

         if (var5 != null) {
            int[] var12 = new int[]{var0.returnState, var1.returnState};
            if (var0.returnState > var1.returnState) {
               var12[0] = var1.returnState;
               var12[1] = var0.returnState;
            }

            PredictionContext[] var14 = new PredictionContext[]{var5, var5};
            ArrayPredictionContext var15 = new ArrayPredictionContext(var14, var12);
            if (var3 != null) {
               var3.put(var0, var1, var15);
            }

            return var15;
         } else {
            int[] var6 = new int[]{var0.returnState, var1.returnState};
            PredictionContext[] var7 = new PredictionContext[]{var0.parent, var1.parent};
            if (var0.returnState > var1.returnState) {
               var6[0] = var1.returnState;
               var6[1] = var0.returnState;
               var7 = new PredictionContext[]{var1.parent, var0.parent};
            }

            ArrayPredictionContext var8 = new ArrayPredictionContext(var7, var6);
            if (var3 != null) {
               var3.put(var0, var1, var8);
            }

            return var8;
         }
      }
   }

   public static PredictionContext mergeRoot(SingletonPredictionContext var0, SingletonPredictionContext var1, boolean var2) {
      if (var2) {
         if (var0 == EmptyPredictionContext.Instance) {
            return EmptyPredictionContext.Instance;
         }

         if (var1 == EmptyPredictionContext.Instance) {
            return EmptyPredictionContext.Instance;
         }
      } else {
         if (var0 == EmptyPredictionContext.Instance && var1 == EmptyPredictionContext.Instance) {
            return EmptyPredictionContext.Instance;
         }

         if (var0 == EmptyPredictionContext.Instance) {
            int[] var6 = new int[]{var1.returnState, Integer.MAX_VALUE};
            PredictionContext[] var7 = new PredictionContext[]{var1.parent, null};
            return new ArrayPredictionContext(var7, var6);
         }

         if (var1 == EmptyPredictionContext.Instance) {
            int[] var3 = new int[]{var0.returnState, Integer.MAX_VALUE};
            PredictionContext[] var4 = new PredictionContext[]{var0.parent, null};
            return new ArrayPredictionContext(var4, var3);
         }
      }

      return null;
   }

   public static PredictionContext mergeArrays(
      ArrayPredictionContext var0, ArrayPredictionContext var1, boolean var2, DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext> var3
   ) {
      if (var3 != null) {
         PredictionContext var4 = (PredictionContext)var3.get(var0, var1);
         if (var4 != null) {
            if (ParserATNSimulator.trace_atn_sim) {
               System.out.println("mergeArrays a=" + var0 + ",b=" + var1 + " -> previous");
            }

            return var4;
         }

         var4 = (PredictionContext)var3.get(var1, var0);
         if (var4 != null) {
            if (ParserATNSimulator.trace_atn_sim) {
               System.out.println("mergeArrays a=" + var0 + ",b=" + var1 + " -> previous");
            }

            return var4;
         }
      }

      int var16 = 0;
      int var5 = 0;
      int var6 = 0;
      int[] var7 = new int[var0.returnStates.length + var1.returnStates.length];
      PredictionContext[] var8 = new PredictionContext[var0.returnStates.length + var1.returnStates.length];

      while (var16 < var0.returnStates.length && var5 < var1.returnStates.length) {
         PredictionContext var9 = var0.parents[var16];
         PredictionContext var10 = var1.parents[var5];
         if (var0.returnStates[var16] == var1.returnStates[var5]) {
            int var11 = var0.returnStates[var16];
            boolean var12 = var11 == Integer.MAX_VALUE && var9 == null && var10 == null;
            boolean var13 = var9 != null && var10 != null && var9.equals(var10);
            if (!var12 && !var13) {
               PredictionContext var14 = merge(var9, var10, var2, var3);
               var8[var6] = var14;
               var7[var6] = var11;
            } else {
               var8[var6] = var9;
               var7[var6] = var11;
            }

            var16++;
            var5++;
         } else if (var0.returnStates[var16] < var1.returnStates[var5]) {
            var8[var6] = var9;
            var7[var6] = var0.returnStates[var16];
            var16++;
         } else {
            var8[var6] = var10;
            var7[var6] = var1.returnStates[var5];
            var5++;
         }

         var6++;
      }

      if (var16 < var0.returnStates.length) {
         for (int var17 = var16; var17 < var0.returnStates.length; var17++) {
            var8[var6] = var0.parents[var17];
            var7[var6] = var0.returnStates[var17];
            var6++;
         }
      } else {
         for (int var18 = var5; var18 < var1.returnStates.length; var18++) {
            var8[var6] = var1.parents[var18];
            var7[var6] = var1.returnStates[var18];
            var6++;
         }
      }

      if (var6 < var8.length) {
         if (var6 == 1) {
            SingletonPredictionContext var20 = SingletonPredictionContext.create(var8[0], var7[0]);
            if (var3 != null) {
               var3.put(var0, var1, var20);
            }

            return var20;
         }

         var8 = Arrays.copyOf(var8, var6);
         var7 = Arrays.copyOf(var7, var6);
      }

      ArrayPredictionContext var19 = new ArrayPredictionContext(var8, var7);
      if (var19.equals(var0)) {
         if (var3 != null) {
            var3.put(var0, var1, var0);
         }

         if (ParserATNSimulator.trace_atn_sim) {
            System.out.println("mergeArrays a=" + var0 + ",b=" + var1 + " -> a");
         }

         return var0;
      } else if (var19.equals(var1)) {
         if (var3 != null) {
            var3.put(var0, var1, var1);
         }

         if (ParserATNSimulator.trace_atn_sim) {
            System.out.println("mergeArrays a=" + var0 + ",b=" + var1 + " -> b");
         }

         return var1;
      } else {
         combineCommonParents(var8);
         if (var3 != null) {
            var3.put(var0, var1, var19);
         }

         if (ParserATNSimulator.trace_atn_sim) {
            System.out.println("mergeArrays a=" + var0 + ",b=" + var1 + " -> " + var19);
         }

         return var19;
      }
   }

   protected static void combineCommonParents(PredictionContext[] var0) {
      HashMap var1 = new HashMap();

      for (int var2 = 0; var2 < var0.length; var2++) {
         PredictionContext var3 = var0[var2];
         if (!var1.containsKey(var3)) {
            var1.put(var3, var3);
         }
      }

      for (int var4 = 0; var4 < var0.length; var4++) {
         var0[var4] = (PredictionContext)var1.get(var0[var4]);
      }
   }

   public static PredictionContext getCachedContext(
      PredictionContext var0, PredictionContextCache var1, IdentityHashMap<PredictionContext, PredictionContext> var2
   ) {
      if (var0.isEmpty()) {
         return var0;
      }

      PredictionContext var3 = (PredictionContext)var2.get(var0);
      if (var3 != null) {
         return var3;
      }

      var3 = var1.get(var0);
      if (var3 != null) {
         var2.put(var0, var3);
         return var3;
      }

      boolean var4 = false;
      PredictionContext[] var5 = new PredictionContext[var0.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         PredictionContext var7 = getCachedContext(var0.getParent(var6), var1, var2);
         if (var4 || var7 != var0.getParent(var6)) {
            if (!var4) {
               var5 = new PredictionContext[var0.size()];

               for (int var8 = 0; var8 < var0.size(); var8++) {
                  var5[var8] = var0.getParent(var8);
               }

               var4 = true;
            }

            var5[var6] = var7;
         }
      }

      if (!var4) {
         var1.add(var0);
         var2.put(var0, var0);
         return var0;
      }

      PredictionContext var10;
      if (var5.length == 0) {
         var10 = EmptyPredictionContext.Instance;
      } else if (var5.length == 1) {
         var10 = SingletonPredictionContext.create(var5[0], var0.getReturnState(0));
      } else {
         ArrayPredictionContext var11 = (ArrayPredictionContext)var0;
         var10 = new ArrayPredictionContext(var5, var11.returnStates);
      }

      var1.add(var10);
      var2.put(var10, var10);
      var2.put(var0, var10);
      return var10;
   }

   public String toString(Recognizer<?, ?> var1) {
      return this.toString();
   }
}
