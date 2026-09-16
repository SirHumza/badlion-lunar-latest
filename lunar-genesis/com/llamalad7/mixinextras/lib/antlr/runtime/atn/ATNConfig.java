package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Recognizer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import java.util.Objects;

public class ATNConfig {
   public final ATNState state;
   public final int alt;
   public PredictionContext context;
   public int reachesIntoOuterContext;
   public final SemanticContext semanticContext;

   public ATNConfig(ATNState var1, int var2, PredictionContext var3) {
      this(var1, var2, var3, SemanticContext.Empty.Instance);
   }

   public ATNConfig(ATNState var1, int var2, PredictionContext var3, SemanticContext var4) {
      this.state = var1;
      this.alt = var2;
      this.context = var3;
      this.semanticContext = var4;
   }

   public ATNConfig(ATNConfig var1, ATNState var2) {
      this(var1, var2, var1.context, var1.semanticContext);
   }

   public ATNConfig(ATNConfig var1, ATNState var2, SemanticContext var3) {
      this(var1, var2, var1.context, var3);
   }

   public ATNConfig(ATNConfig var1, SemanticContext var2) {
      this(var1, var1.state, var1.context, var2);
   }

   public ATNConfig(ATNConfig var1, ATNState var2, PredictionContext var3) {
      this(var1, var2, var3, var1.semanticContext);
   }

   public ATNConfig(ATNConfig var1, ATNState var2, PredictionContext var3, SemanticContext var4) {
      this.state = var2;
      this.alt = var1.alt;
      this.context = var3;
      this.semanticContext = var4;
      this.reachesIntoOuterContext = var1.reachesIntoOuterContext;
   }

   public final int getOuterContextDepth() {
      return this.reachesIntoOuterContext & -1073741825;
   }

   public final boolean isPrecedenceFilterSuppressed() {
      return (this.reachesIntoOuterContext & 1073741824) != 0;
   }

   public final void setPrecedenceFilterSuppressed(boolean var1) {
      if (var1) {
         this.reachesIntoOuterContext |= 1073741824;
      } else {
         this.reachesIntoOuterContext &= -1073741825;
      }
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ATNConfig) ? false : this.equals((ATNConfig)var1);
   }

   public boolean equals(ATNConfig var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 == null
            ? false
            : this.state.stateNumber == var1.state.stateNumber
               && this.alt == var1.alt
               && Objects.equals(this.context, var1.context)
               && this.semanticContext.equals(var1.semanticContext)
               && this.isPrecedenceFilterSuppressed() == var1.isPrecedenceFilterSuppressed();
      }
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize(7);
      var1 = MurmurHash.update(var1, this.state.stateNumber);
      var1 = MurmurHash.update(var1, this.alt);
      var1 = MurmurHash.update(var1, this.context);
      var1 = MurmurHash.update(var1, this.semanticContext);
      return MurmurHash.finish(var1, 4);
   }

   @Override
   public String toString() {
      return this.toString(null, true);
   }

   public String toString(Recognizer<?, ?> var1, boolean var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append('(');
      var3.append(this.state);
      if (var2) {
         var3.append(",");
         var3.append(this.alt);
      }

      if (this.context != null) {
         var3.append(",[");
         var3.append(this.context.toString());
         var3.append("]");
      }

      if (this.semanticContext != null && this.semanticContext != SemanticContext.Empty.Instance) {
         var3.append(",");
         var3.append(this.semanticContext);
      }

      if (this.getOuterContextDepth() > 0) {
         var3.append(",up=").append(this.getOuterContextDepth());
      }

      var3.append(')');
      return var3.toString();
   }
}
