package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.AbstractEqualityComparator;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Array2DHashSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.DoubleKeyMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ATNConfigSet implements Set<ATNConfig> {
   protected boolean readonly = false;
   public ATNConfigSet.AbstractConfigHashSet configLookup;
   public final ArrayList<ATNConfig> configs = new ArrayList<>(7);
   public int uniqueAlt;
   protected BitSet conflictingAlts;
   public boolean hasSemanticContext;
   public boolean dipsIntoOuterContext;
   public final boolean fullCtx;
   private int cachedHashCode = -1;

   public ATNConfigSet(boolean var1) {
      this.configLookup = new ATNConfigSet.ConfigHashSet();
      this.fullCtx = var1;
   }

   public ATNConfigSet() {
      this(true);
   }

   public boolean add(ATNConfig var1) {
      return this.add(var1, null);
   }

   public boolean add(ATNConfig var1, DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext> var2) {
      if (this.readonly) {
         throw new IllegalStateException("This set is readonly");
      }

      if (var1.semanticContext != SemanticContext.Empty.Instance) {
         this.hasSemanticContext = true;
      }

      if (var1.getOuterContextDepth() > 0) {
         this.dipsIntoOuterContext = true;
      }

      ATNConfig var3 = this.configLookup.getOrAdd(var1);
      if (var3 == var1) {
         this.cachedHashCode = -1;
         this.configs.add(var1);
         return true;
      }

      boolean var4 = !this.fullCtx;
      PredictionContext var5 = PredictionContext.merge(var3.context, var1.context, var4, var2);
      var3.reachesIntoOuterContext = Math.max(var3.reachesIntoOuterContext, var1.reachesIntoOuterContext);
      if (var1.isPrecedenceFilterSuppressed()) {
         var3.setPrecedenceFilterSuppressed(true);
      }

      var3.context = var5;
      return true;
   }

   public List<ATNConfig> elements() {
      return this.configs;
   }

   public BitSet getAlts() {
      BitSet var1 = new BitSet();

      for (ATNConfig var3 : this.configs) {
         var1.set(var3.alt);
      }

      return var1;
   }

   public void optimizeConfigs(ATNSimulator var1) {
      if (this.readonly) {
         throw new IllegalStateException("This set is readonly");
      }

      if (!this.configLookup.isEmpty()) {
         for (ATNConfig var3 : this.configs) {
            var3.context = var1.getCachedContext(var3.context);
         }
      }
   }

   @Override
   public boolean addAll(Collection<? extends ATNConfig> var1) {
      for (ATNConfig var3 : var1) {
         this.add(var3);
      }

      return false;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ATNConfigSet)) {
         return false;
      }

      ATNConfigSet var2 = (ATNConfigSet)var1;
      return this.configs != null
         && this.configs.equals(var2.configs)
         && this.fullCtx == var2.fullCtx
         && this.uniqueAlt == var2.uniqueAlt
         && this.conflictingAlts == var2.conflictingAlts
         && this.hasSemanticContext == var2.hasSemanticContext
         && this.dipsIntoOuterContext == var2.dipsIntoOuterContext;
   }

   @Override
   public int hashCode() {
      if (this.isReadonly()) {
         if (this.cachedHashCode == -1) {
            this.cachedHashCode = this.configs.hashCode();
         }

         return this.cachedHashCode;
      } else {
         return this.configs.hashCode();
      }
   }

   @Override
   public int size() {
      return this.configs.size();
   }

   @Override
   public boolean isEmpty() {
      return this.configs.isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      if (this.configLookup == null) {
         throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
      } else {
         return this.configLookup.contains(var1);
      }
   }

   @Override
   public Iterator<ATNConfig> iterator() {
      return this.configs.iterator();
   }

   @Override
   public void clear() {
      if (this.readonly) {
         throw new IllegalStateException("This set is readonly");
      }

      this.configs.clear();
      this.cachedHashCode = -1;
      this.configLookup.clear();
   }

   public boolean isReadonly() {
      return this.readonly;
   }

   public void setReadonly(boolean var1) {
      this.readonly = var1;
      this.configLookup = null;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.elements().toString());
      if (this.hasSemanticContext) {
         var1.append(",hasSemanticContext=").append(this.hasSemanticContext);
      }

      if (this.uniqueAlt != 0) {
         var1.append(",uniqueAlt=").append(this.uniqueAlt);
      }

      if (this.conflictingAlts != null) {
         var1.append(",conflictingAlts=").append(this.conflictingAlts);
      }

      if (this.dipsIntoOuterContext) {
         var1.append(",dipsIntoOuterContext");
      }

      return var1.toString();
   }

   public ATNConfig[] toArray() {
      return this.configLookup.toArray();
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      return (T[])this.configLookup.toArray(var1);
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   public abstract static class AbstractConfigHashSet extends Array2DHashSet<ATNConfig> {
      public AbstractConfigHashSet(AbstractEqualityComparator<? super ATNConfig> var1) {
         this(var1, 16, 2);
      }

      public AbstractConfigHashSet(AbstractEqualityComparator<? super ATNConfig> var1, int var2, int var3) {
         super(var1, var2, var3);
      }

      protected final ATNConfig asElementType(Object var1) {
         return !(var1 instanceof ATNConfig) ? null : (ATNConfig)var1;
      }

      protected final ATNConfig[][] createBuckets(int var1) {
         return new ATNConfig[var1][];
      }

      protected final ATNConfig[] createBucket(int var1) {
         return new ATNConfig[var1];
      }
   }

   public static final class ConfigEqualityComparator extends AbstractEqualityComparator<ATNConfig> {
      public static final ATNConfigSet.ConfigEqualityComparator INSTANCE = new ATNConfigSet.ConfigEqualityComparator();

      private ConfigEqualityComparator() {
      }

      public int hashCode(ATNConfig var1) {
         int var2 = 7;
         var2 = 31 * var2 + var1.state.stateNumber;
         var2 = 31 * var2 + var1.alt;
         return 31 * var2 + var1.semanticContext.hashCode();
      }

      public boolean equals(ATNConfig var1, ATNConfig var2) {
         if (var1 == var2) {
            return true;
         } else {
            return var1 != null && var2 != null
               ? var1.state.stateNumber == var2.state.stateNumber && var1.alt == var2.alt && var1.semanticContext.equals(var2.semanticContext)
               : false;
         }
      }
   }

   public static class ConfigHashSet extends ATNConfigSet.AbstractConfigHashSet {
      public ConfigHashSet() {
         super(ATNConfigSet.ConfigEqualityComparator.INSTANCE);
      }
   }
}
