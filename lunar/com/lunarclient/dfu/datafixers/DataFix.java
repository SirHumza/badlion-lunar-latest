package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.schemas.Schema;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Dynamic;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.BitSet;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DataFix {
   private static final Logger LOGGER = LoggerFactory.getLogger(DataFix.class);
   private final Schema outputSchema;
   private final boolean changesType;
   @Nullable
   private TypeRewriteRule rule;

   public DataFix(Schema var1, boolean var2) {
      this.outputSchema = var1;
      this.changesType = var2;
   }

   protected <A> TypeRewriteRule fixTypeEverywhere(String var1, Type<A> var2, Function<DynamicOps<?>, Function<A, A>> var3) {
      return this.fixTypeEverywhere(var1, var2, var2, var3, new BitSet());
   }

   protected <A, B> TypeRewriteRule convertUnchecked(String var1, Type<A> var2, Type<B> var3) {
      return this.fixTypeEverywhere(var1, var2, var3, var0 -> (Function<A, B>)Function.identity(), new BitSet());
   }

   protected TypeRewriteRule writeAndRead(String var1, Type<?> var2, Type<?> var3) {
      return this.writeFixAndRead(var1, var2, var3, Function.identity());
   }

   protected <A, B> TypeRewriteRule writeFixAndRead(String var1, Type<A> var2, Type<B> var3, Function<Dynamic<?>, Dynamic<?>> var4) {
      AtomicReference var5 = new AtomicReference();
      RewriteResult var6 = unchecked(var1, var2, var3, var4x -> var5x -> {
         Optional var6x = ((Type)var5.getPlain()).writeDynamic(var4x, var5x).resultOrPartial(LOGGER::error);
         if (var6x.isEmpty()) {
            throw new RuntimeException("Could not write the object in " + var1);
         } else {
            Dynamic var7x = (Dynamic)var4.apply((Dynamic)var6x.get());
            Optional var8 = var3.readTyped(var7x).resultOrPartial(LOGGER::error);
            if (var8.isEmpty()) {
               throw new RuntimeException("Could not read the new object in " + var1);
            } else {
               return (B)((Typed)((Pair)var8.get()).getFirst()).getValue();
            }
         }
      }, new BitSet());
      TypeRewriteRule var7 = this.fixTypeEverywhere(var2, var6);
      var5.setPlain(var2.all(var7, true, false).view().newType());
      return var7;
   }

   protected <A, B> TypeRewriteRule fixTypeEverywhere(String var1, Type<A> var2, Type<B> var3, Function<DynamicOps<?>, Function<A, B>> var4) {
      return this.fixTypeEverywhere(var1, var2, var3, var4, new BitSet());
   }

   protected <A, B> TypeRewriteRule fixTypeEverywhere(String var1, Type<A> var2, Type<B> var3, Function<DynamicOps<?>, Function<A, B>> var4, BitSet var5) {
      return this.fixTypeEverywhere(var2, unchecked(var1, var2, var3, var4, var5));
   }

   protected <A> TypeRewriteRule fixTypeEverywhereTyped(String var1, Type<A> var2, Function<Typed<?>, Typed<?>> var3) {
      return this.fixTypeEverywhereTyped(var1, var2, var3, new BitSet());
   }

   protected <A> TypeRewriteRule fixTypeEverywhereTyped(String var1, Type<A> var2, Function<Typed<?>, Typed<?>> var3, BitSet var4) {
      return this.fixTypeEverywhereTyped(var1, var2, var2, var3, var4);
   }

   protected <A, B> TypeRewriteRule fixTypeEverywhereTyped(String var1, Type<A> var2, Type<B> var3, Function<Typed<?>, Typed<?>> var4) {
      return this.fixTypeEverywhereTyped(var1, var2, var3, var4, new BitSet());
   }

   protected <A, B> TypeRewriteRule fixTypeEverywhereTyped(String var1, Type<A> var2, Type<B> var3, Function<Typed<?>, Typed<?>> var4, BitSet var5) {
      return this.fixTypeEverywhere(var2, checked(var1, var2, var3, var4, var5));
   }

   private static <A, B> RewriteResult<A, B> unchecked(String var0, Type<A> var1, Type<B> var2, Function<DynamicOps<?>, Function<A, B>> var3, BitSet var4) {
      return RewriteResult.create(View.create(var0, var1, var2, new DataFix.NamedFunctionWrapper<>(var0, var3)), var4);
   }

   public static <A, B> RewriteResult<A, B> checked(String var0, Type<A> var1, Type<B> var2, Function<Typed<?>, Typed<?>> var3, BitSet var4) {
      return RewriteResult.create(View.create(var0, var1, var2, new DataFix.NamedFunctionWrapper<>(var0, var3x -> var4x -> {
         Typed var5 = (Typed)var3.apply(new Typed(var1, var3x, var4x));
         if (!var2.equals(var5.type, true, false)) {
            throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", var2, var5.type));
         } else {
            return (B)var5.value;
         }
      })), var4);
   }

   protected <A, B> TypeRewriteRule fixTypeEverywhere(Type<A> var1, RewriteResult<A, B> var2) {
      return TypeRewriteRule.checkOnce(
         TypeRewriteRule.everywhere(TypeRewriteRule.ifSame(var1, var2), DataFixerUpper.OPTIMIZATION_RULE, true, true), this::onFail
      );
   }

   protected void onFail(Type<?> var1) {
      LOGGER.info("Not matched: " + this + " " + var1);
   }

   public final int getVersionKey() {
      return this.getOutputSchema().getVersionKey();
   }

   public TypeRewriteRule getRule() {
      if (this.rule == null) {
         this.rule = this.makeRule();
      }

      return this.rule;
   }

   protected abstract TypeRewriteRule makeRule();

   protected Schema getInputSchema() {
      return this.changesType ? this.outputSchema.getParent() : this.getOutputSchema();
   }

   protected Schema getOutputSchema() {
      return this.outputSchema;
   }

   private static final class NamedFunctionWrapper<A, B> implements Function<DynamicOps<?>, Function<A, B>> {
      private final String name;
      private final Function<DynamicOps<?>, Function<A, B>> delegate;

      public NamedFunctionWrapper(String var1, Function<DynamicOps<?>, Function<A, B>> var2) {
         this.name = var1;
         this.delegate = var2;
      }

      public Function<A, B> apply(DynamicOps<?> var1) {
         return this.delegate.apply(var1);
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            DataFix.NamedFunctionWrapper var2 = (DataFix.NamedFunctionWrapper)var1;
            return Objects.equals(this.name, var2.name);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.name.hashCode();
      }
   }
}
