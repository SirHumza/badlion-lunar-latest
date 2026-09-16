package com.lunarclient.dfu.datafixers;

import com.google.common.collect.ImmutableList;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.types.Type;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface TypeRewriteRule {
   <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1);

   static TypeRewriteRule nop() {
      return TypeRewriteRule.Nop.INSTANCE;
   }

   static TypeRewriteRule seq(List<TypeRewriteRule> var0) {
      return new TypeRewriteRule.Seq(var0);
   }

   static TypeRewriteRule seq(TypeRewriteRule var0, TypeRewriteRule var1) {
      if (Objects.equals(var0, nop())) {
         return var1;
      } else {
         return Objects.equals(var1, nop()) ? var0 : seq(ImmutableList.of(var0, var1));
      }
   }

   static TypeRewriteRule seq(TypeRewriteRule var0, TypeRewriteRule... var1) {
      if (var1.length == 0) {
         return var0;
      }

      int var2 = var1.length - 1;
      TypeRewriteRule var3 = var1[var2];

      while (var2 > 0) {
         var3 = seq(var1[--var2], var3);
      }

      return seq(var0, var3);
   }

   static TypeRewriteRule orElse(TypeRewriteRule var0, TypeRewriteRule var1) {
      return orElse(var0, () -> var1);
   }

   static TypeRewriteRule orElse(TypeRewriteRule var0, Supplier<TypeRewriteRule> var1) {
      return new TypeRewriteRule.OrElse(var0, var1);
   }

   static TypeRewriteRule all(TypeRewriteRule var0, boolean var1, boolean var2) {
      return new TypeRewriteRule.All(var0, var1, var2);
   }

   static TypeRewriteRule one(TypeRewriteRule var0) {
      return new TypeRewriteRule.One(var0);
   }

   static TypeRewriteRule once(TypeRewriteRule var0) {
      return orElse(var0, () -> one(once(var0)));
   }

   static TypeRewriteRule checkOnce(TypeRewriteRule var0, Consumer<Type<?>> var1) {
      return var0;
   }

   static TypeRewriteRule everywhere(TypeRewriteRule var0, PointFreeRule var1, boolean var2, boolean var3) {
      return new TypeRewriteRule.Everywhere(var0, var1, var2, var3);
   }

   static <B> TypeRewriteRule ifSame(Type<B> var0, RewriteResult<B, ?> var1) {
      return new TypeRewriteRule.IfSame(var0, var1);
   }

   class All implements TypeRewriteRule {
      private final TypeRewriteRule rule;
      private final boolean recurse;
      private final boolean checkIndex;
      private final int hashCode;

      public All(TypeRewriteRule var1, boolean var2, boolean var3) {
         this.rule = var1;
         this.recurse = var2;
         this.checkIndex = var3;
         this.hashCode = Objects.hash(var1, var2, var3);
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         return Optional.of(var1.all(this.rule, this.recurse, this.checkIndex));
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return !(var1 instanceof TypeRewriteRule.All var2)
               ? false
               : Objects.equals(this.rule, var2.rule) && this.recurse == var2.recurse && this.checkIndex == var2.checkIndex;
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }
   }

   record CheckOnce() implements TypeRewriteRule {
      private final TypeRewriteRule rule;
      private final Consumer<Type<?>> onFail;

      public CheckOnce(TypeRewriteRule var1, Consumer<Type<?>> var2) {
         this.rule = var1;
         this.onFail = var2;
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         Optional var2 = this.rule.rewrite(var1);
         if (!var2.isPresent() || ((RewriteResult)var2.get()).view().isNop()) {
            this.onFail.accept(var1);
         }

         return var2;
      }
   }

   class Everywhere implements TypeRewriteRule {
      protected final TypeRewriteRule rule;
      protected final PointFreeRule optimizationRule;
      protected final boolean recurse;
      private final boolean checkIndex;
      private final int hashCode;

      public Everywhere(TypeRewriteRule var1, PointFreeRule var2, boolean var3, boolean var4) {
         this.rule = var1;
         this.optimizationRule = var2;
         this.recurse = var3;
         this.checkIndex = var4;
         this.hashCode = Objects.hash(var1, var2, var3, var4);
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         return var1.everywhere(this.rule, this.optimizationRule, this.recurse, this.checkIndex);
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return !(var1 instanceof TypeRewriteRule.Everywhere var2)
               ? false
               : Objects.equals(this.rule, var2.rule)
                  && Objects.equals(this.optimizationRule, var2.optimizationRule)
                  && this.recurse == var2.recurse
                  && this.checkIndex == var2.checkIndex;
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }
   }

   class IfSame<B> implements TypeRewriteRule {
      private final Type<B> targetType;
      private final RewriteResult<B, ?> value;
      private final int hashCode;

      public IfSame(Type<B> var1, RewriteResult<B, ?> var2) {
         this.targetType = var1;
         this.value = var2;
         this.hashCode = Objects.hash(var1, var2);
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         return var1.ifSame(this.targetType, this.value);
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return !(var1 instanceof TypeRewriteRule.IfSame var2)
               ? false
               : Objects.equals(this.targetType, var2.targetType) && Objects.equals(this.value, var2.value);
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }
   }

   enum Nop implements TypeRewriteRule, Supplier<TypeRewriteRule> {
      INSTANCE;

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         return Optional.of(RewriteResult.nop(var1));
      }

      public TypeRewriteRule get() {
         return this;
      }
   }

   record One() implements TypeRewriteRule {
      private final TypeRewriteRule rule;

      public One(TypeRewriteRule var1) {
         this.rule = var1;
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         return var1.one(this.rule);
      }
   }

   final class OrElse implements TypeRewriteRule {
      protected final TypeRewriteRule first;
      protected final Supplier<TypeRewriteRule> second;
      private final int hashCode;

      public OrElse(TypeRewriteRule var1, Supplier<TypeRewriteRule> var2) {
         this.first = var1;
         this.second = var2;
         this.hashCode = Objects.hash(var1, var2);
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         Optional var2 = this.first.rewrite(var1);
         return var2.isPresent() ? var2 : this.second.get().rewrite(var1);
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return !(var1 instanceof TypeRewriteRule.OrElse var2) ? false : Objects.equals(this.first, var2.first) && Objects.equals(this.second, var2.second);
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }
   }

   final class Seq implements TypeRewriteRule {
      protected final List<TypeRewriteRule> rules;
      private final int hashCode;

      public Seq(List<TypeRewriteRule> var1) {
         this.rules = ImmutableList.copyOf(var1);
         this.hashCode = this.rules.hashCode();
      }

      @Override
      public <A> Optional<RewriteResult<A, ?>> rewrite(Type<A> var1) {
         RewriteResult var2 = RewriteResult.nop(var1);

         for (TypeRewriteRule var4 : this.rules) {
            Optional var5 = this.cap1(var4, var2);
            if (!var5.isPresent()) {
               return Optional.empty();
            }

            var2 = (RewriteResult)var5.get();
         }

         return Optional.of(var2);
      }

      protected <A, B> Optional<RewriteResult<A, ?>> cap1(TypeRewriteRule var1, RewriteResult<A, B> var2) {
         return var1.rewrite(var2.view().newType()).map(var1x -> var1x.compose(var2));
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return !(var1 instanceof TypeRewriteRule.Seq var2) ? false : Objects.equals(this.rules, var2.rules);
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }
   }
}
