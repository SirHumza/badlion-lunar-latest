package com.lunarclient.dfu.datafixers.types.templates;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record Hook() implements TypeTemplate {
   private final TypeTemplate element;
   private final Hook.HookFunction preRead;
   private final Hook.HookFunction postWrite;

   public Hook(TypeTemplate var1, Hook.HookFunction var2, Hook.HookFunction var3) {
      this.element = var1;
      this.preRead = var2;
      this.postWrite = var3;
   }

   @Override
   public int size() {
      return this.element.size();
   }

   @Override
   public TypeFamily apply(TypeFamily var1) {
      return var2 -> DSL.hook(this.element.apply(var1).apply(var2), this.preRead, this.postWrite);
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.element.<A, B>applyO(var1, var2, var3).apply(var4));
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return this.element.findFieldOrType(var1, var2, var3, var4);
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = this.element.hmap(var1, var2).apply(var3);
         return this.cap(var1, var3, var4);
      };
   }

   private <A> RewriteResult<A, ?> cap(TypeFamily var1, int var2, RewriteResult<A, ?> var3) {
      return Hook.HookType.fix((Hook.HookType<A>)this.apply(var1).apply(var2), var3);
   }

   @Override
   public String toString() {
      return "Hook[" + this.element + ", " + this.preRead + ", " + this.postWrite + "]";
   }

   public interface HookFunction {
      Hook.HookFunction IDENTITY = new Hook.HookFunction() {
         @Override
         public <T> T apply(DynamicOps<T> var1, T var2) {
            return (T)var2;
         }
      };

      <T> T apply(DynamicOps<T> var1, T var2);
   }

   public static final class HookType<A> extends Type<A> {
      private final Type<A> delegate;
      private final Hook.HookFunction preRead;
      private final Hook.HookFunction postWrite;

      public HookType(Type<A> var1, Hook.HookFunction var2, Hook.HookFunction var3) {
         this.delegate = var1;
         this.preRead = var2;
         this.postWrite = var3;
      }

      @Override
      protected Codec<A> buildCodec() {
         return new Codec<A>() {
            @Override
            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
               return HookType.this.delegate.codec().<T>decode(var1, HookType.this.preRead.apply(var1, (T)var2)).setLifecycle(Lifecycle.experimental());
            }

            @Override
            public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
               return HookType.this.delegate
                  .codec()
                  .encode((A)var1, var2, var3)
                  .map(var2x -> HookType.this.postWrite.apply(var2, (T)var2x))
                  .setLifecycle(Lifecycle.experimental());
            }
         };
      }

      @Override
      public RewriteResult<A, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         return fix(this, this.delegate.rewriteOrNop(var1));
      }

      @Override
      public Optional<RewriteResult<A, ?>> one(TypeRewriteRule var1) {
         return var1.rewrite(this.delegate).map(var1x -> fix(this, (RewriteResult<A, ?>)var1x));
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return new Hook.HookType((Type<A>)this.delegate.updateMu(var1), this.preRead, this.postWrite);
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.hook(this.delegate.template(), this.preRead, this.postWrite);
      }

      @Override
      public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
         return this.delegate.findChoiceType(var1, var2);
      }

      @Override
      public Optional<Type<?>> findCheckedType(int var1) {
         return this.delegate.findCheckedType(var1);
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return this.delegate.findFieldTypeOpt(var1);
      }

      @Override
      public Optional<A> point(DynamicOps<?> var1) {
         return this.delegate.point(var1);
      }

      @Override
      public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         return this.delegate
            .<FT, FR>findType(var1, var2, var3, var4)
            .mapLeft(var1x -> wrapOptic((TypedOptic<A, ?, FT, FR>)var1x, this.preRead, this.postWrite));
      }

      public static <A, B> RewriteResult<A, ?> fix(Hook.HookType<A> var0, RewriteResult<A, B> var1) {
         return var1.view().isNop()
            ? RewriteResult.nop(var0)
            : opticView(var0, var1, wrapOptic(TypedOptic.adapter(var1.view().type(), var1.view().newType()), var0.preRead, var0.postWrite));
      }

      protected static <A, B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(TypedOptic<A, B, FT, FR> var0, Hook.HookFunction var1, Hook.HookFunction var2) {
         return var0.castOuter(DSL.hook(var0.sType(), var1, var2), DSL.hook(var0.tType(), var1, var2));
      }

      @Override
      public String toString() {
         return "HookType[" + this.delegate + ", " + this.preRead + ", " + this.postWrite + "]";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         return !(var1 instanceof Hook.HookType var4)
            ? false
            : this.delegate.equals(var4.delegate, var2, var3) && Objects.equals(this.preRead, var4.preRead) && Objects.equals(this.postWrite, var4.postWrite);
      }

      @Override
      public int hashCode() {
         int var1 = this.delegate.hashCode();
         var1 = 31 * var1 + this.preRead.hashCode();
         return 31 * var1 + this.postWrite.hashCode();
      }
   }
}
