package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Recognizer;
import com.llamalad7.mixinextras.lib.antlr.runtime.RuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class SemanticContext {
   public abstract boolean eval(Recognizer<?, ?> var1, RuleContext var2);

   public SemanticContext evalPrecedence(Recognizer<?, ?> var1, RuleContext var2) {
      return this;
   }

   public static SemanticContext and(SemanticContext var0, SemanticContext var1) {
      if (var0 == null || var0 == SemanticContext.Empty.Instance) {
         return var1;
      } else if (var1 != null && var1 != SemanticContext.Empty.Instance) {
         SemanticContext.AND var2 = new SemanticContext.AND(var0, var1);
         return var2.opnds.length == 1 ? var2.opnds[0] : var2;
      } else {
         return var0;
      }
   }

   public static SemanticContext or(SemanticContext var0, SemanticContext var1) {
      if (var0 == null) {
         return var1;
      } else if (var1 == null) {
         return var0;
      } else if (var0 != SemanticContext.Empty.Instance && var1 != SemanticContext.Empty.Instance) {
         SemanticContext.OR var2 = new SemanticContext.OR(var0, var1);
         return var2.opnds.length == 1 ? var2.opnds[0] : var2;
      } else {
         return SemanticContext.Empty.Instance;
      }
   }

   private static List<SemanticContext.PrecedencePredicate> filterPrecedencePredicates(Collection<? extends SemanticContext> var0) {
      ArrayList var1 = null;
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         SemanticContext var3 = (SemanticContext)var2.next();
         if (var3 instanceof SemanticContext.PrecedencePredicate) {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            var1.add((SemanticContext.PrecedencePredicate)var3);
            var2.remove();
         }
      }

      return var1 == null ? Collections.emptyList() : var1;
   }

   public static class AND extends SemanticContext.Operator {
      public final SemanticContext[] opnds;

      public AND(SemanticContext var1, SemanticContext var2) {
         HashSet var3 = new HashSet();
         if (var1 instanceof SemanticContext.AND) {
            var3.addAll(Arrays.asList(((SemanticContext.AND)var1).opnds));
         } else {
            var3.add(var1);
         }

         if (var2 instanceof SemanticContext.AND) {
            var3.addAll(Arrays.asList(((SemanticContext.AND)var2).opnds));
         } else {
            var3.add(var2);
         }

         List var4 = SemanticContext.filterPrecedencePredicates(var3);
         if (!var4.isEmpty()) {
            SemanticContext.PrecedencePredicate var5 = Collections.min(var4);
            var3.add(var5);
         }

         this.opnds = var3.toArray(new SemanticContext[0]);
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof SemanticContext.AND)) {
            return false;
         }

         SemanticContext.AND var2 = (SemanticContext.AND)var1;
         return Arrays.equals(this.opnds, var2.opnds);
      }

      @Override
      public int hashCode() {
         return MurmurHash.hashCode(this.opnds, SemanticContext.AND.class.hashCode());
      }

      @Override
      public boolean eval(Recognizer<?, ?> var1, RuleContext var2) {
         for (SemanticContext var6 : this.opnds) {
            if (!var6.eval(var1, var2)) {
               return false;
            }
         }

         return true;
      }

      @Override
      public SemanticContext evalPrecedence(Recognizer<?, ?> var1, RuleContext var2) {
         boolean var3 = false;
         ArrayList var4 = new ArrayList();

         for (SemanticContext var8 : this.opnds) {
            SemanticContext var9 = var8.evalPrecedence(var1, var2);
            var3 |= var9 != var8;
            if (var9 == null) {
               return null;
            }

            if (var9 != SemanticContext.Empty.Instance) {
               var4.add(var9);
            }
         }

         if (!var3) {
            return this;
         }

         if (var4.isEmpty()) {
            return SemanticContext.Empty.Instance;
         }

         SemanticContext var10 = (SemanticContext)var4.get(0);

         for (int var11 = 1; var11 < var4.size(); var11++) {
            var10 = SemanticContext.and(var10, (SemanticContext)var4.get(var11));
         }

         return var10;
      }

      @Override
      public String toString() {
         return Utils.join(Arrays.asList(this.opnds).iterator(), "&&");
      }
   }

   public static class Empty extends SemanticContext {
      public static final SemanticContext.Empty Instance = new SemanticContext.Empty();

      @Override
      public boolean eval(Recognizer<?, ?> var1, RuleContext var2) {
         return false;
      }
   }

   public static class OR extends SemanticContext.Operator {
      public final SemanticContext[] opnds;

      public OR(SemanticContext var1, SemanticContext var2) {
         HashSet var3 = new HashSet();
         if (var1 instanceof SemanticContext.OR) {
            var3.addAll(Arrays.asList(((SemanticContext.OR)var1).opnds));
         } else {
            var3.add(var1);
         }

         if (var2 instanceof SemanticContext.OR) {
            var3.addAll(Arrays.asList(((SemanticContext.OR)var2).opnds));
         } else {
            var3.add(var2);
         }

         List var4 = SemanticContext.filterPrecedencePredicates(var3);
         if (!var4.isEmpty()) {
            SemanticContext.PrecedencePredicate var5 = Collections.max(var4);
            var3.add(var5);
         }

         this.opnds = var3.toArray(new SemanticContext[0]);
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof SemanticContext.OR)) {
            return false;
         }

         SemanticContext.OR var2 = (SemanticContext.OR)var1;
         return Arrays.equals(this.opnds, var2.opnds);
      }

      @Override
      public int hashCode() {
         return MurmurHash.hashCode(this.opnds, SemanticContext.OR.class.hashCode());
      }

      @Override
      public boolean eval(Recognizer<?, ?> var1, RuleContext var2) {
         for (SemanticContext var6 : this.opnds) {
            if (var6.eval(var1, var2)) {
               return true;
            }
         }

         return false;
      }

      @Override
      public SemanticContext evalPrecedence(Recognizer<?, ?> var1, RuleContext var2) {
         boolean var3 = false;
         ArrayList var4 = new ArrayList();

         for (SemanticContext var8 : this.opnds) {
            SemanticContext var9 = var8.evalPrecedence(var1, var2);
            var3 |= var9 != var8;
            if (var9 == SemanticContext.Empty.Instance) {
               return SemanticContext.Empty.Instance;
            }

            if (var9 != null) {
               var4.add(var9);
            }
         }

         if (!var3) {
            return this;
         }

         if (var4.isEmpty()) {
            return null;
         }

         SemanticContext var10 = (SemanticContext)var4.get(0);

         for (int var11 = 1; var11 < var4.size(); var11++) {
            var10 = SemanticContext.or(var10, (SemanticContext)var4.get(var11));
         }

         return var10;
      }

      @Override
      public String toString() {
         return Utils.join(Arrays.asList(this.opnds).iterator(), "||");
      }
   }

   public abstract static class Operator extends SemanticContext {
   }

   public static class PrecedencePredicate extends SemanticContext implements Comparable<SemanticContext.PrecedencePredicate> {
      public final int precedence;

      protected PrecedencePredicate() {
         this.precedence = 0;
      }

      public PrecedencePredicate(int var1) {
         this.precedence = var1;
      }

      @Override
      public boolean eval(Recognizer<?, ?> var1, RuleContext var2) {
         return var1.precpred(var2, this.precedence);
      }

      @Override
      public SemanticContext evalPrecedence(Recognizer<?, ?> var1, RuleContext var2) {
         return var1.precpred(var2, this.precedence) ? SemanticContext.Empty.Instance : null;
      }

      public int compareTo(SemanticContext.PrecedencePredicate var1) {
         return this.precedence - var1.precedence;
      }

      @Override
      public int hashCode() {
         byte var1 = 1;
         return 31 * var1 + this.precedence;
      }

      @Override
      public boolean equals(Object var1) {
         if (!(var1 instanceof SemanticContext.PrecedencePredicate)) {
            return false;
         }

         if (this == var1) {
            return true;
         }

         SemanticContext.PrecedencePredicate var2 = (SemanticContext.PrecedencePredicate)var1;
         return this.precedence == var2.precedence;
      }

      @Override
      public String toString() {
         return "{" + this.precedence + ">=prec}?";
      }
   }

   public static class Predicate extends SemanticContext {
      public final int ruleIndex;
      public final int predIndex;
      public final boolean isCtxDependent;

      protected Predicate() {
         this.ruleIndex = -1;
         this.predIndex = -1;
         this.isCtxDependent = false;
      }

      public Predicate(int var1, int var2, boolean var3) {
         this.ruleIndex = var1;
         this.predIndex = var2;
         this.isCtxDependent = var3;
      }

      @Override
      public boolean eval(Recognizer<?, ?> var1, RuleContext var2) {
         RuleContext var3 = this.isCtxDependent ? var2 : null;
         return var1.sempred(var3, this.ruleIndex, this.predIndex);
      }

      @Override
      public int hashCode() {
         int var1 = MurmurHash.initialize();
         var1 = MurmurHash.update(var1, this.ruleIndex);
         var1 = MurmurHash.update(var1, this.predIndex);
         var1 = MurmurHash.update(var1, this.isCtxDependent ? 1 : 0);
         return MurmurHash.finish(var1, 3);
      }

      @Override
      public boolean equals(Object var1) {
         if (!(var1 instanceof SemanticContext.Predicate)) {
            return false;
         }

         if (this == var1) {
            return true;
         }

         SemanticContext.Predicate var2 = (SemanticContext.Predicate)var1;
         return this.ruleIndex == var2.ruleIndex && this.predIndex == var2.predIndex && this.isCtxDependent == var2.isCtxDependent;
      }

      @Override
      public String toString() {
         return "{" + this.ruleIndex + ":" + this.predIndex + "}?";
      }
   }
}
