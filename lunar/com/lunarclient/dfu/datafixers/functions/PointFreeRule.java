package com.lunarclient.dfu.datafixers.functions;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.types.Func;
import com.lunarclient.dfu.datafixers.types.constant.EmptyPart;
import com.lunarclient.dfu.datafixers.types.families.ListAlgebra;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.templates.Product;
import com.lunarclient.dfu.datafixers.types.templates.Sum;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface PointFreeRule {
   <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1);

   default <A> PointFree<A> rewriteOrNop(PointFree<A> var1) {
      return DataFixUtils.orElse(this.rewrite(var1), var1);
   }

   static PointFreeRule nop() {
      return PointFreeRule.Nop.INSTANCE;
   }

   static PointFreeRule seq(PointFreeRule... var0) {
      return new PointFreeRule.Seq(var0);
   }

   static PointFreeRule choice(PointFreeRule... var0) {
      if (var0.length == 1) {
         return var0[0];
      } else {
         return var0.length == 2 ? new PointFreeRule.Choice2(var0[0], var0[1]) : new PointFreeRule.Choice(var0);
      }
   }

   static PointFreeRule all(PointFreeRule var0) {
      return new PointFreeRule.All(var0);
   }

   static PointFreeRule one(PointFreeRule var0) {
      return new PointFreeRule.One(var0);
   }

   static PointFreeRule once(PointFreeRule var0) {
      return new PointFreeRule.Once(var0);
   }

   static PointFreeRule many(PointFreeRule var0) {
      return new PointFreeRule.Many(var0);
   }

   static PointFreeRule everywhere(PointFreeRule var0, PointFreeRule var1) {
      return new PointFreeRule.Everywhere(var0, var1);
   }

   record All() implements PointFreeRule {
      private final PointFreeRule rule;

      public All(PointFreeRule var1) {
         this.rule = var1;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         return var1.all(this.rule);
      }
   }

   enum AppNest implements PointFreeRule {
      INSTANCE;

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         return var1 instanceof Apply var2 && var2.arg instanceof Apply var3
            ? Optional.of(Functions.app(this.compose(var2.func, var3.func), var3.arg))
            : Optional.empty();
      }

      private <A, B, C> PointFree<Function<A, C>> compose(PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2) {
         return var1 instanceof ProfunctorTransformer var3 && var2 instanceof ProfunctorTransformer var4 ? this.cap(var3, var4) : Functions.comp(var1, var2);
      }

      private <R, X, Y, S, T, A, B> R cap(ProfunctorTransformer<X, Y, ?, ?> var1, ProfunctorTransformer<S, T, A, B> var2) {
         ProfunctorTransformer var3 = var1;
         return (R)Functions.<S, T, A, B>profunctorTransformer(var3.optic.compose((TypedOptic<A, B, A, B>)var2.optic));
      }
   }

   enum BangEta implements PointFreeRule {
      INSTANCE;

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         if (var1 instanceof Bang) {
            return Optional.empty();
         } else {
            return var1.type() instanceof Func var2 && var2.second() instanceof EmptyPart ? Optional.of(Functions.bang(var2.first())) : Optional.empty();
         }
      }
   }

   enum CataFuseDifferent implements PointFreeRule.CompRewrite {
      INSTANCE;

      @Override
      public Optional<? extends PointFree<? extends Function<?, ?>>> doRewrite(
         PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2
      ) {
         if (var1 instanceof Fold var3 && var2 instanceof Fold var4) {
            RecursiveTypeFamily var5 = var3.aType.family();
            if (var3.index == var4.index && Objects.equals(var5, var4.aType.family())) {
               RecursiveTypeFamily var6 = var3.bType.family();
               ArrayList var7 = Lists.newArrayList();
               BitSet var8 = new BitSet(var5.size());
               BitSet var9 = new BitSet(var5.size());

               for (int var10 = 0; var10 < var5.size(); var10++) {
                  RewriteResult var11 = var3.algebra.apply(var10);
                  RewriteResult var12 = var4.algebra.apply(var10);
                  boolean var13 = var11.view().isNop();
                  boolean var14 = var12.view().isNop();
                  if (!var13 && !var14) {
                     return Optional.empty();
                  }

                  var8.set(var10, !var13);
                  var9.set(var10, !var14);
               }

               for (int var15 = 0; var15 < var5.size(); var15++) {
                  RewriteResult var17 = var3.algebra.apply(var15);
                  RewriteResult var18 = var4.algebra.apply(var15);
                  if (var17.recData().intersects(var9) || var18.recData().intersects(var8)) {
                     return Optional.empty();
                  }

                  if (var17.view().isNop()) {
                     var7.add(var18);
                  } else {
                     var7.add(var17);
                  }
               }

               ListAlgebra var16 = new ListAlgebra("FusedDifferent", var7);
               return Optional.of(var5.fold(var16, var6).apply(var3.index).view().function());
            }
         }

         return Optional.empty();
      }
   }

   enum CataFuseSame implements PointFreeRule.CompRewrite {
      INSTANCE;

      @Override
      public Optional<? extends PointFree<? extends Function<?, ?>>> doRewrite(
         PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2
      ) {
         if (var1 instanceof Fold var3 && var2 instanceof Fold var4) {
            RecursiveTypeFamily var5 = var3.aType.family();
            if (var3.index == var4.index && Objects.equals(var5, var4.aType.family())) {
               RecursiveTypeFamily var6 = var3.bType.family();
               ArrayList var7 = Lists.newArrayList();
               boolean var8 = false;

               for (int var9 = 0; var9 < var5.size(); var9++) {
                  RewriteResult var10 = var3.algebra.apply(var9);
                  RewriteResult var11 = var4.algebra.apply(var9);
                  boolean var12 = var10.view().isNop();
                  boolean var13 = var11.view().isNop();
                  if (var12 && var13) {
                     var7.add(var10);
                  } else {
                     if (var8 || var12 || var13) {
                        return Optional.empty();
                     }

                     var7.add(this.getCompose(var10, var11));
                     var8 = true;
                  }
               }

               ListAlgebra var14 = new ListAlgebra("FusedSame", var7);
               return Optional.of(var5.fold(var14, var6).apply(var3.index).view().function());
            }
         }

         return Optional.empty();
      }

      private <B> RewriteResult<?, ?> getCompose(RewriteResult<B, ?> var1, RewriteResult<?, ?> var2) {
         return var1.compose(var2);
      }
   }

   record Choice() implements PointFreeRule {
      private final PointFreeRule[] rules;

      public Choice(PointFreeRule[] var1) {
         this.rules = var1;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         for (PointFreeRule var5 : this.rules) {
            Optional var6 = var5.rewrite(var1);
            if (var6.isPresent()) {
               return var6;
            }
         }

         return Optional.empty();
      }

      @Override
      public boolean equals(Object var1) {
         return var1 == this ? true : var1 instanceof PointFreeRule.Choice var2 && Arrays.equals(this.rules, var2.rules);
      }

      @Override
      public int hashCode() {
         return Arrays.hashCode(this.rules);
      }
   }

   record Choice2() implements PointFreeRule {
      private final PointFreeRule first;
      private final PointFreeRule second;

      public Choice2(PointFreeRule var1, PointFreeRule var2) {
         this.first = var1;
         this.second = var2;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         Optional var2 = this.first.rewrite(var1);
         return var2.isPresent() ? var2 : this.second.rewrite(var1);
      }
   }

   interface CompRewrite extends PointFreeRule {
      static PointFreeRule.CompRewrite together(PointFreeRule.CompRewrite... var0) {
         return (var1, var2) -> {
            for (PointFreeRule.CompRewrite var6 : var0) {
               Optional var7 = var6.doRewrite(var1, var2);
               if (var7.isPresent()) {
                  return var7;
               }
            }

            return Optional.empty();
         };
      }

      @Override
      default <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         return var1 instanceof Comp var2
            ? this.rewrite(var2.functions).map(var0 -> (PointFree<A>)(var0.length == 1 ? var0[0] : new Comp((PointFree<? extends Function<?, ?>>[])var0)))
            : Optional.empty();
      }

      private Optional<PointFree<? extends Function<?, ?>>[]> rewrite(PointFree<? extends Function<?, ?>>[] var1) {
         ArrayDeque var2 = new ArrayDeque(var1.length);
         boolean var3 = false;
         ArrayDeque var4 = new ArrayDeque(var1.length);
         Collections.addAll(var4, var1);

         while (!var4.isEmpty()) {
            PointFree var5 = (PointFree)var4.removeFirst();
            PointFree var6 = (PointFree)var2.peekLast();
            Optional var7 = var6 != null ? this.doRewrite(var6, var5) : Optional.empty();
            if (var7.isPresent()) {
               var2.removeLast();
               addFirst(var4, (PointFree<? extends Function<?, ?>>)var7.get());
               var3 = true;
            } else {
               var2.add(var5);
            }
         }

         return var3 ? Optional.of(var2.toArray(PointFree[]::new)) : Optional.empty();
      }

      private static void addFirst(Deque<PointFree<? extends Function<?, ?>>> var0, PointFree<? extends Function<?, ?>> var1) {
         if (var1 instanceof Comp var2) {
            for (int var3 = var2.functions.length - 1; var3 >= 0; var3--) {
               var0.addFirst(var2.functions[var3]);
            }
         } else {
            var0.addFirst(var1);
         }
      }

      Optional<? extends PointFree<? extends Function<?, ?>>> doRewrite(PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2);
   }

   record Everywhere() implements PointFreeRule {
      private final PointFreeRule topDown;
      private final PointFreeRule bottomUp;

      public Everywhere(PointFreeRule var1, PointFreeRule var2) {
         this.topDown = var1;
         this.bottomUp = var2;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         PointFree var2 = this.topDown.rewriteOrNop(var1);
         PointFree var3 = DataFixUtils.orElse(var2.all(this), var2);
         PointFree var4 = this.bottomUp.rewriteOrNop(var3);
         return Optional.of(var4);
      }
   }

   enum LensAppId implements PointFreeRule {
      INSTANCE;

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         if (var1 instanceof Apply var2) {
            PointFree var3 = var2.func;
            if (var3 instanceof ProfunctorTransformer && Functions.isId(var2.arg)) {
               return Optional.of(Functions.id(((Func)var2.type()).first()));
            }
         }

         return Optional.empty();
      }
   }

   enum LensComp implements PointFreeRule.CompRewrite {
      INSTANCE;

      @Override
      public Optional<? extends PointFree<? extends Function<?, ?>>> doRewrite(
         PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2
      ) {
         if (var1 instanceof Apply var3 && var2 instanceof Apply var4) {
            PointFree var5 = var3.func;
            PointFree var6 = var4.func;
            if (var5 instanceof ProfunctorTransformer var7 && var6 instanceof ProfunctorTransformer var8) {
               List var9 = var7.optic.elements();
               List var10 = var8.optic.elements();
               int var11 = findCommonPrefix(var9, var10);
               if (var11 == 0) {
                  return Optional.empty();
               }

               if (var11 == var9.size() && var11 == var10.size()) {
                  return Optional.of(this.capApp(var7.optic, this.capComp(var3.arg, var4.arg)));
               }

               SetView var12 = Sets.union(var7.optic.bounds(), var8.optic.bounds());
               TypedOptic var13 = new TypedOptic(var12, var9.subList(0, var11));
               PointFree var14 = this.capApp(new TypedOptic(var12, var9.subList(var11, var9.size())), var3.arg);
               PointFree var15 = this.capApp(new TypedOptic(var12, var10.subList(var11, var10.size())), var4.arg);
               return Optional.of(this.capApp(var13, this.capComp(var14, var15)));
            }
         }

         return Optional.empty();
      }

      private static int findCommonPrefix(List<? extends TypedOptic.Element<?, ?, ?, ?>> var0, List<? extends TypedOptic.Element<?, ?, ?, ?>> var1) {
         int var2 = Math.min(var0.size(), var1.size());

         for (int var3 = 0; var3 < var2; var3++) {
            if (!((TypedOptic.Element)var0.get(var3)).optic().equals(((TypedOptic.Element)var1.get(var3)).optic())) {
               return var3;
            }
         }

         return var2;
      }

      private <A, B, C> PointFree<Function<A, C>> capComp(PointFree<?> var1, PointFree<?> var2) {
         return Functions.comp(var1, var2);
      }

      private <R, A, B, S, T> PointFree<R> capApp(TypedOptic<S, T, A, B> var1, PointFree<?> var2) {
         return var1.elements().isEmpty() ? var2 : Functions.app(new ProfunctorTransformer<>(var1), var2);
      }
   }

   record Many() implements PointFreeRule {
      private final PointFreeRule rule;

      public Many(PointFreeRule var1) {
         this.rule = var1;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         Optional var2 = Optional.of(var1);

         while (true) {
            Optional var3 = var2.flatMap(this.rule::rewrite);
            if (var3.isEmpty()) {
               return var2;
            }

            var2 = var3;
         }
      }
   }

   enum Nop implements PointFreeRule, Supplier<PointFreeRule> {
      INSTANCE;

      @Override
      public <A> Optional<PointFree<A>> rewrite(PointFree<A> var1) {
         return Optional.of(var1);
      }

      public PointFreeRule get() {
         return this;
      }
   }

   record Once() implements PointFreeRule {
      private final PointFreeRule rule;

      public Once(PointFreeRule var1) {
         this.rule = var1;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         Optional var2 = this.rule.rewrite(var1);
         return var2.isPresent() ? var2 : var1.one(this);
      }
   }

   record One() implements PointFreeRule {
      private final PointFreeRule rule;

      public One(PointFreeRule var1) {
         this.rule = var1;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         return var1.one(this.rule);
      }
   }

   record Seq() implements PointFreeRule {
      private final PointFreeRule[] rules;

      public Seq(PointFreeRule[] var1) {
         this.rules = var1;
      }

      @Override
      public <A> Optional<? extends PointFree<A>> rewrite(PointFree<A> var1) {
         PointFree var2 = var1;

         for (PointFreeRule var6 : this.rules) {
            var2 = var6.rewriteOrNop(var2);
         }

         return Optional.of(var2);
      }

      @Override
      public boolean equals(Object var1) {
         return var1 == this ? true : var1 instanceof PointFreeRule.Seq var2 && Arrays.equals(this.rules, var2.rules);
      }

      @Override
      public int hashCode() {
         return Arrays.hashCode(this.rules);
      }
   }

   enum SortInj implements PointFreeRule.CompRewrite {
      INSTANCE;

      @Override
      public Optional<? extends PointFree<? extends Function<?, ?>>> doRewrite(
         PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2
      ) {
         if (var1 instanceof Apply var3 && var2 instanceof Apply var4) {
            PointFree var5 = var3.func;
            PointFree var6 = var4.func;
            if (var5 instanceof ProfunctorTransformer var7 && var6 instanceof ProfunctorTransformer var8) {
               if (!Optics.isInj2(var7.optic.outermost())) {
                  return Optional.empty();
               }

               if (!Optics.isInj1(var8.optic.outermost())) {
                  return Optional.empty();
               }

               return Optional.of(this.cap(var3, var4));
            }
         }

         return Optional.empty();
      }

      private <R, A, A2, B, B2> R cap(Apply<?, ?> var1, Apply<?, ?> var2) {
         ProfunctorTransformer var3 = (ProfunctorTransformer)var1.func;
         ProfunctorTransformer var4 = (ProfunctorTransformer)var2.func;
         PointFree var5 = var1.arg;
         PointFree var6 = var2.arg;
         Func var7 = (Func)var1.type;
         Func var8 = (Func)var2.type;
         Sum.SumType var9 = (Sum.SumType)var8.first();
         Sum.SumType var10 = (Sum.SumType)var7.second();
         return (R)(new Comp(
            new Apply<>(var4.castOuterUnchecked(DSL.or(var10.first(), var9.second()), var10), var6),
            new Apply<>(var3.castOuterUnchecked(var9, DSL.or(var10.first(), var9.second())), var5)
         ));
      }
   }

   enum SortProj implements PointFreeRule.CompRewrite {
      INSTANCE;

      @Override
      public Optional<? extends PointFree<? extends Function<?, ?>>> doRewrite(
         PointFree<? extends Function<?, ?>> var1, PointFree<? extends Function<?, ?>> var2
      ) {
         if (var1 instanceof Apply var3 && var2 instanceof Apply var4) {
            PointFree var5 = var3.func;
            PointFree var6 = var4.func;
            if (var5 instanceof ProfunctorTransformer var7 && var6 instanceof ProfunctorTransformer var8) {
               if (!Optics.isProj2(var7.optic.outermost())) {
                  return Optional.empty();
               }

               if (!Optics.isProj1(var8.optic.outermost())) {
                  return Optional.empty();
               }

               return Optional.of(this.cap(var3, var4));
            }
         }

         return Optional.empty();
      }

      private <R, A, A2, B, B2> R cap(Apply<?, ?> var1, Apply<?, ?> var2) {
         ProfunctorTransformer var3 = (ProfunctorTransformer)var1.func;
         ProfunctorTransformer var4 = (ProfunctorTransformer)var2.func;
         PointFree var5 = var1.arg;
         PointFree var6 = var2.arg;
         Func var7 = (Func)var1.type;
         Func var8 = (Func)var2.type;
         Product.ProductType var9 = (Product.ProductType)var8.first();
         Product.ProductType var10 = (Product.ProductType)var7.second();
         return (R)(new Comp(
            new Apply<>(var4.castOuterUnchecked(DSL.and(var10.first(), var9.second()), var10), var6),
            new Apply<>(var3.castOuterUnchecked(var9, DSL.and(var10.first(), var9.second())), var5)
         ));
      }
   }
}
