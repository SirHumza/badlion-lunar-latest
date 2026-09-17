package com.lunarclient.dfu.datafixers.types.families;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Lists;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.View;
import com.lunarclient.dfu.datafixers.functions.Functions;
import com.lunarclient.dfu.datafixers.functions.PointFree;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import com.lunarclient.dfu.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public final class RecursiveTypeFamily implements TypeFamily {
   private static final Interner<TypeTemplate> TEMPLATE_INTERNER = Interners.newWeakInterner();
   private final String name;
   private final TypeTemplate template;
   private final int size;
   private final Int2ObjectMap<RecursivePoint.RecursivePointType<?>> types = Int2ObjectMaps.synchronize(new Int2ObjectOpenHashMap());
   private final int hashCode;

   public RecursiveTypeFamily(String var1, TypeTemplate var2) {
      this.name = var1;
      this.template = (TypeTemplate)TEMPLATE_INTERNER.intern(var2);
      this.size = var2.size();
      this.hashCode = Objects.hashCode(var2);
   }

   public <A> RecursivePoint.RecursivePointType<A> buildMuType(Type<A> var1, @Nullable RecursiveTypeFamily var2) {
      if (var2 == null) {
         TypeTemplate var3 = var1.template();
         if (Objects.equals(this.template, var3)) {
            var2 = this;
         } else {
            var2 = new RecursiveTypeFamily("ruled " + this.name, var3);
         }
      }

      RecursivePoint.RecursivePointType var7 = null;

      for (int var4 = 0; var4 < var2.size; var4++) {
         RecursivePoint.RecursivePointType var5 = var2.apply(var4);
         Type var6 = var5.unfold();
         if (var1.equals(var6, true, false)) {
            var7 = var5;
            break;
         }
      }

      if (var7 == null) {
         throw new IllegalStateException("Couldn't determine the new type properly");
      } else {
         return var7;
      }
   }

   public String name() {
      return this.name;
   }

   public TypeTemplate template() {
      return this.template;
   }

   public int size() {
      return this.size;
   }

   public IntFunction<RewriteResult<?, ?>> fold(Algebra var1, RecursiveTypeFamily var2) {
      return var3 -> {
         RewriteResult var4 = var1.apply(var3);
         return RewriteResult.create(View.create(foldUnchecked(this, var2, var1, var3)), var4.recData());
      };
   }

   private static <A, B> PointFree<Function<A, B>> foldUnchecked(RecursiveTypeFamily var0, RecursiveTypeFamily var1, Algebra var2, int var3) {
      RecursivePoint.RecursivePointType var4 = var0.apply(var3);
      RecursivePoint.RecursivePointType var5 = var1.apply(var3);
      return Functions.fold(var4, var5, var2, var3);
   }

   public RecursivePoint.RecursivePointType<?> apply(int var1) {
      if (var1 < 0) {
         throw new IndexOutOfBoundsException();
      } else {
         return (RecursivePoint.RecursivePointType<?>)this.types
            .computeIfAbsent(var1, var1x -> new RecursivePoint.RecursivePointType<>(this, var1x, () -> this.template.apply(this).apply(var1x)));
      }
   }

   public <A, B> Either<TypedOptic<?, ?, A, B>, Type.FieldNotFoundException> findType(
      int var1, Type<A> var2, Type<B> var3, Type.TypeMatcher<A, B> var4, boolean var5
   ) {
      return this.apply(var1).unfold().findType(var2, var3, var4, false).flatMap(var6 -> {
         TypeTemplate var7 = var6.tType().template();
         ArrayList var8 = Lists.newArrayList();
         RecursiveTypeFamily var9 = new RecursiveTypeFamily(this.name, var7);
         RecursivePoint.RecursivePointType var10 = this.apply(var1);
         RecursivePoint.RecursivePointType var11 = var9.apply(var1);
         if (var5) {
            FamilyOptic var12 = var1xx -> ((FamilyOptic)var8.get(0)).apply(var1xx);
            var8.add(this.template.applyO(var12, var2, var3));
            TypedOptic var13 = ((FamilyOptic)var8.get(0)).apply(var1);
            return Either.left(var13.castOuterUnchecked(var10, var11));
         } else {
            return this.mkSimpleOptic(var10, var11, var2, var3, var4);
         }
      });
   }

   private <S, T, A, B> Either<TypedOptic<?, ?, A, B>, Type.FieldNotFoundException> mkSimpleOptic(
      RecursivePoint.RecursivePointType<S> var1, RecursivePoint.RecursivePointType<T> var2, Type<A> var3, Type<B> var4, Type.TypeMatcher<A, B> var5
   ) {
      return var1.unfold().findType(var3, var4, var5, false).mapLeft(var2x -> var2x.castOuterUnchecked(var1, var2));
   }

   public Optional<RewriteResult<?, ?>> everywhere(int var1, TypeRewriteRule var2, PointFreeRule var3) {
      Type var4 = this.apply(var1).unfold();
      RewriteResult var5 = DataFixUtils.orElse(var4.everywhere(var2, var3, false, false), RewriteResult.nop(var4));
      RecursivePoint.RecursivePointType var6 = this.buildMuType(var5.view().newType(), null);
      RecursiveTypeFamily var7 = var6.family();
      ArrayList var8 = Lists.newArrayList();
      boolean var9 = false;

      for (int var10 = 0; var10 < this.size; var10++) {
         RecursivePoint.RecursivePointType var11 = this.apply(var10);
         Type var12 = var11.unfold();
         boolean var13 = true;
         RewriteResult var14 = DataFixUtils.orElse(var12.everywhere(var2, var3, false, true), RewriteResult.nop(var12));
         if (!var14.view().isNop()) {
            var13 = false;
         }

         RecursivePoint.RecursivePointType var15 = this.buildMuType(var14.view().newType(), var7);
         boolean var16 = this.cap2(var8, var11, var2, var3, var13, var14, var15);
         var9 = var9 || !var16;
      }

      if (!var9) {
         return Optional.empty();
      }

      ListAlgebra var17 = new ListAlgebra("everywhere", var8);
      RewriteResult var18 = this.fold(var17, var7).apply(var1);
      return Optional.of(RewriteResult.create(View.create(var18.view().function()), var18.recData()));
   }

   private <A, B> boolean cap2(
      List<RewriteResult<?, ?>> var1,
      RecursivePoint.RecursivePointType<A> var2,
      TypeRewriteRule var3,
      PointFreeRule var4,
      boolean var5,
      RewriteResult<?, ?> var6,
      RecursivePoint.RecursivePointType<B> var7
   ) {
      RewriteResult var8 = RewriteResult.create(var7.in(), new BitSet()).compose(var6);
      Optional var9 = var3.rewrite(var8.view().newType());
      if (var9.isPresent() && !((RewriteResult)var9.get()).view().isNop()) {
         var5 = false;
         var6 = ((RewriteResult)var9.get()).compose(var8);
      }

      var6 = RewriteResult.create(var6.view().rewriteOrNop(var4), var6.recData());
      var1.add(var6);
      return var5;
   }

   @Override
   public String toString() {
      return "Mu[" + this.name + ", " + this.size + ", " + this.template + "]";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof RecursiveTypeFamily var2) ? false : this.template == var2.template;
      }
   }

   @Override
   public int hashCode() {
      return this.hashCode;
   }
}
