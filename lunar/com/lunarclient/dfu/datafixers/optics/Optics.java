package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cocartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.GetterP;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class Optics {
   public static <S, T, A, B> Adapter<S, T, A, B> toAdapter(Optic<? super Profunctor.Mu, S, T, A, B> var0) {
      Function var1 = var0.eval(new Adapter.Instance());
      return Adapter.unbox((App2<Adapter.Mu<A, B>, S, T>)var1.apply(adapter(Function.identity(), Function.identity())));
   }

   public static <S, T, A, B> Lens<S, T, A, B> toLens(Optic<? super Cartesian.Mu, S, T, A, B> var0) {
      Function var1 = var0.eval(new Lens.Instance());
      return Lens.unbox((App2<Lens.Mu<A, B>, S, T>)var1.apply(lens((Function<Object, A>)Function.identity(), (var0x, var1x) -> (T)var0x)));
   }

   public static <S, T, A, B> Prism<S, T, A, B> toPrism(Optic<? super Cocartesian.Mu, S, T, A, B> var0) {
      Function var1 = var0.eval(new Prism.Instance());
      return Prism.unbox((App2<Prism.Mu<A, B>, S, T>)var1.apply(prism(Either::right, Function.identity())));
   }

   public static <S, T, A, B> Affine<S, T, A, B> toAffine(Optic<? super AffineP.Mu, S, T, A, B> var0) {
      Function var1 = var0.eval(new Affine.Instance());
      return Affine.unbox((App2<Affine.Mu<A, B>, S, T>)var1.apply(affine(Either::right, (var0x, var1x) -> (T)var0x)));
   }

   public static <S, T, A, B> Getter<S, T, A, B> toGetter(Optic<? super GetterP.Mu, S, T, A, B> var0) {
      Function var1 = var0.eval(new Getter.Instance());
      return Getter.unbox((App2<Getter.Mu<A, B>, S, T>)var1.apply(getter(Function.identity())));
   }

   public static <S, T, A, B> Traversal<S, T, A, B> toTraversal(Optic<? super TraversalP.Mu, S, T, A, B> var0) {
      Function var1 = var0.eval(new Traversal.Instance());
      return Traversal.unbox((App2<Traversal.Mu<A, B>, S, T>)var1.apply(new Traversal<A, B, A, B>() {
         @Override
         public <F extends K1> FunctionType<A, App<F, B>> wander(Applicative<F, ?> var1, FunctionType<A, App<F, B>> var2) {
            return var2;
         }
      }));
   }

   static <S, T, A, B, F> Lens<S, T, Pair<F, A>, B> merge(Lens<S, ?, F, ?> var0, Lens<S, T, A, B> var1) {
      return lens(var2 -> (Pair<F, A>)Pair.of((F)var0.view(var2), var1.view(var2)), var1::update);
   }

   public static <S, T> Adapter<S, T, S, T> id() {
      return IdAdapter.INSTANCE;
   }

   public static boolean isId(Optic<?, ?, ?, ?, ?> var0) {
      return var0 == IdAdapter.INSTANCE;
   }

   public static <S, T, A, B> Adapter<S, T, A, B> adapter(final Function<S, A> var0, final Function<B, T> var1) {
      return new Adapter<S, T, A, B>() {
         @Override
         public A from(S var1x) {
            return (A)var0.apply(var1x);
         }

         @Override
         public T to(B var1x) {
            return (T)var1.apply(var1x);
         }
      };
   }

   public static <S, T, A, B> Lens<S, T, A, B> lens(final Function<S, A> var0, final BiFunction<B, S, T> var1) {
      return new Lens<S, T, A, B>() {
         @Override
         public A view(S var1x) {
            return (A)var0.apply(var1x);
         }

         @Override
         public T update(B var1x, S var2) {
            return (T)var1.apply(var1x, var2);
         }
      };
   }

   public static <S, T, A, B> Prism<S, T, A, B> prism(final Function<S, Either<T, A>> var0, final Function<B, T> var1) {
      return new Prism<S, T, A, B>() {
         @Override
         public Either<T, A> match(S var1x) {
            return (Either<T, A>)var0.apply(var1x);
         }

         @Override
         public T build(B var1x) {
            return (T)var1.apply(var1x);
         }
      };
   }

   public static <S, T, A, B> Affine<S, T, A, B> affine(final Function<S, Either<T, A>> var0, final BiFunction<B, S, T> var1) {
      return new Affine<S, T, A, B>() {
         @Override
         public Either<T, A> preview(S var1x) {
            return (Either<T, A>)var0.apply(var1x);
         }

         @Override
         public T set(B var1x, S var2) {
            return (T)var1.apply(var1x, var2);
         }
      };
   }

   public static <S, T, A, B> Getter<S, T, A, B> getter(Function<S, A> var0) {
      return var0::apply;
   }

   public static <R, A, B> Forget<R, A, B> forget(Function<A, R> var0) {
      return var0::apply;
   }

   public static <R, A, B> ForgetOpt<R, A, B> forgetOpt(Function<A, Optional<R>> var0) {
      return var0::apply;
   }

   public static <R, A, B> ForgetE<R, A, B> forgetE(Function<A, Either<B, R>> var0) {
      return var0::apply;
   }

   public static <R, A, B> ReForget<R, A, B> reForget(Function<R, B> var0) {
      return (ReForget<R, A, B>)(var0::apply);
   }

   public static <S, T, A, B> Grate<S, T, A, B> grate(FunctionType<FunctionType<FunctionType<S, A>, B>, T> var0) {
      return (Grate<S, T, A, B>)(var0::apply);
   }

   public static <R, A, B> ReForgetEP<R, A, B> reForgetEP(final String var0, final Function<Either<A, Pair<A, R>>, B> var1) {
      return new ReForgetEP<R, A, B>() {
         @Override
         public B run(Either<A, Pair<A, R>> var1x) {
            return (B)var1.apply(var1x);
         }

         @Override
         public String toString() {
            return "ReForgetEP_" + var0;
         }
      };
   }

   public static <R, A, B> ReForgetE<R, A, B> reForgetE(final String var0, final Function<Either<A, R>, B> var1) {
      return new ReForgetE<R, A, B>() {
         @Override
         public B run(Either<A, R> var1x) {
            return (B)var1.apply(var1x);
         }

         @Override
         public String toString() {
            return "ReForgetE_" + var0;
         }
      };
   }

   public static <R, A, B> ReForgetP<R, A, B> reForgetP(final String var0, final BiFunction<A, R, B> var1) {
      return new ReForgetP<R, A, B>() {
         @Override
         public B run(A var1x, R var2) {
            return (B)var1.apply(var1x, var2);
         }

         @Override
         public String toString() {
            return "ReForgetP_" + var0;
         }
      };
   }

   public static <R, A, B> ReForgetC<R, A, B> reForgetC(final String var0, final Either<Function<R, B>, BiFunction<A, R, B>> var1) {
      return new ReForgetC<R, A, B>() {
         @Override
         public Either<Function<R, B>, BiFunction<A, R, B>> impl() {
            return var1;
         }

         @Override
         public String toString() {
            return "ReForgetC_" + var0;
         }
      };
   }

   public static <I, J, X> PStore<I, J, X> pStore(final Function<J, X> var0, final Supplier<I> var1) {
      return new PStore<I, J, X>() {
         @Override
         public X peek(J var1x) {
            return (X)var0.apply(var1x);
         }

         @Override
         public I pos() {
            return (I)var1.get();
         }
      };
   }

   public static <A, B> Function<A, B> getFunc(App2<FunctionType.Mu, A, B> var0) {
      return FunctionType.unbox(var0);
   }

   public static <F, G, F2> Proj1<F, G, F2> proj1() {
      return (Proj1<F, G, F2>)Proj1.INSTANCE;
   }

   public static boolean isProj1(Optic<?, ?, ?, ?, ?> var0) {
      return var0 == Proj1.INSTANCE;
   }

   public static <F, G, G2> Proj2<F, G, G2> proj2() {
      return (Proj2<F, G, G2>)Proj2.INSTANCE;
   }

   public static boolean isProj2(Optic<?, ?, ?, ?, ?> var0) {
      return var0 == Proj2.INSTANCE;
   }

   public static <F, G, F2> Inj1<F, G, F2> inj1() {
      return (Inj1<F, G, F2>)Inj1.INSTANCE;
   }

   public static boolean isInj1(Optic<?, ?, ?, ?, ?> var0) {
      return var0 == Inj1.INSTANCE;
   }

   public static <F, G, G2> Inj2<F, G, G2> inj2() {
      return (Inj2<F, G, G2>)Inj2.INSTANCE;
   }

   public static boolean isInj2(Optic<?, ?, ?, ?, ?> var0) {
      return var0 == Inj2.INSTANCE;
   }

   public static <F, G, F2, G2, A, B> Lens<Either<F, G>, Either<F2, G2>, A, B> eitherLens(Lens<F, F2, A, B> var0, Lens<G, G2, A, B> var1) {
      return lens(
         var2 -> var2.map(var0::view, var1::view), (var2, var3) -> var3.mapBoth(var2x -> (F2)var0.update(var2, var2x), var2x -> (G2)var1.update(var2, var2x))
      );
   }

   public static <F, G, F2, G2, A, B> Affine<Either<F, G>, Either<F2, G2>, A, B> eitherAffine(Affine<F, F2, A, B> var0, Affine<G, G2, A, B> var1) {
      return affine(
         var2 -> var2.map(var1xx -> var0.preview(var1xx).mapLeft(Either::left), var1xx -> var1.preview(var1xx).mapLeft(Either::right)),
         (var2, var3) -> var3.mapBoth(var2x -> (F2)var0.set(var2, var2x), var2x -> (G2)var1.set(var2, var2x))
      );
   }

   public static <F, G, F2, G2, A, B> Traversal<Either<F, G>, Either<F2, G2>, A, B> eitherTraversal(
      final Traversal<F, F2, A, B> var0, final Traversal<G, G2, A, B> var1
   ) {
      return new Traversal<Either<F, G>, Either<F2, G2>, A, B>() {
         @Override
         public <FT extends K1> FunctionType<Either<F, G>, App<FT, Either<F2, G2>>> wander(Applicative<FT, ?> var1x, FunctionType<A, App<FT, B>> var2) {
            return var4 -> var4.map(
               var3x -> var1x.ap(Either::left, (App<F, A>)var0.wander(var1x, var2).apply(var3x)),
               var3x -> var1x.ap(Either::right, (App<F, A>)var1.wander(var1x, var2).apply(var3x))
            );
         }
      };
   }

   public static <A, B> ListTraversal<A, B> listTraversal() {
      return (ListTraversal<A, B>)ListTraversal.INSTANCE;
   }
}
