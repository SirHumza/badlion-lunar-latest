package com.lunarclient.dfu.datafixers;

import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.Functor;
import com.lunarclient.dfu.datafixers.kinds.IdF;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.kinds.Representable;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.Procompose;
import com.lunarclient.dfu.datafixers.optics.Wander;
import com.lunarclient.dfu.datafixers.optics.profunctors.Mapping;
import com.lunarclient.dfu.datafixers.optics.profunctors.MonoidProfunctor;
import com.lunarclient.dfu.datafixers.optics.profunctors.Monoidal;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nonnull;

public interface FunctionType<A, B> extends App<FunctionType.ReaderMu<A>, B>, App2<FunctionType.Mu, A, B>, Function<A, B> {
   static <A, B> FunctionType<A, B> create(Function<? super A, ? extends B> var0) {
      return var0::apply;
   }

   static <A, B> Function<A, B> unbox(App2<FunctionType.Mu, A, B> var0) {
      return (FunctionType)var0;
   }

   static <A, B> Function<A, B> unbox(App<FunctionType.ReaderMu<A>, B> var0) {
      return (FunctionType)var0;
   }

   @Nonnull
   @Override
   B apply(@Nonnull A var1);

   enum Instance
      implements App<FunctionType.Instance.Mu, FunctionType.Mu>,
      Mapping<FunctionType.Mu, FunctionType.Instance.Mu>,
      MonoidProfunctor<FunctionType.Mu, FunctionType.Instance.Mu>,
      Monoidal<FunctionType.Mu, FunctionType.Instance.Mu>,
      TraversalP<FunctionType.Mu, FunctionType.Instance.Mu> {
      INSTANCE;

      @Override
      public <A, B, C, D> FunctionType<App2<FunctionType.Mu, A, B>, App2<FunctionType.Mu, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> FunctionType.create(var2.compose(Optics.getFunc(var2x)).compose(var1));
      }

      @Override
      public <A, B, C> App2<FunctionType.Mu, Pair<A, C>, Pair<B, C>> first(App2<FunctionType.Mu, A, B> var1) {
         return FunctionType.create(var1x -> Pair.of(Optics.<A, B>getFunc(var1).apply(var1x.getFirst()), var1x.getSecond()));
      }

      @Override
      public <A, B, C> App2<FunctionType.Mu, Pair<C, A>, Pair<C, B>> second(App2<FunctionType.Mu, A, B> var1) {
         return FunctionType.create(var1x -> Pair.of(var1x.getFirst(), Optics.<A, B>getFunc(var1).apply(var1x.getSecond())));
      }

      @Override
      public <S, T, A, B> App2<FunctionType.Mu, S, T> wander(Wander<S, T, A, B> var1, App2<FunctionType.Mu, A, B> var2) {
         return FunctionType.create(
            var2x -> IdF.get(var1.<IdF.Mu>wander(IdF.Instance.INSTANCE, var1xx -> IdF.create(Optics.getFunc(var2).apply(var1xx))).apply((S)var2x))
         );
      }

      @Override
      public <A, B, C> App2<FunctionType.Mu, Either<A, C>, Either<B, C>> left(App2<FunctionType.Mu, A, B> var1) {
         return FunctionType.create(var1x -> var1x.mapLeft(Optics.getFunc(var1)));
      }

      @Override
      public <A, B, C> App2<FunctionType.Mu, Either<C, A>, Either<C, B>> right(App2<FunctionType.Mu, A, B> var1) {
         return FunctionType.create(var1x -> var1x.mapRight(Optics.getFunc(var1)));
      }

      @Override
      public <A, B, C, D> App2<FunctionType.Mu, Pair<A, C>, Pair<B, D>> par(App2<FunctionType.Mu, A, B> var1, Supplier<App2<FunctionType.Mu, C, D>> var2) {
         return FunctionType.create(
            var2x -> Pair.of(
               Optics.<A, B>getFunc(var1).apply(var2x.getFirst()), (D)Optics.getFunc((App2<FunctionType.Mu, A, B>)var2.get()).apply(var2x.getSecond())
            )
         );
      }

      @Override
      public App2<FunctionType.Mu, Void, Void> empty() {
         return FunctionType.create(Function.identity());
      }

      @Override
      public <A, B> App2<FunctionType.Mu, A, B> zero(App2<FunctionType.Mu, A, B> var1) {
         return var1;
      }

      @Override
      public <A, B> App2<FunctionType.Mu, A, B> plus(App2<Procompose.Mu<FunctionType.Mu, FunctionType.Mu>, A, B> var1) {
         Procompose var2 = Procompose.unbox(var1);
         return this.cap(var2);
      }

      private <A, B, C> App2<FunctionType.Mu, A, B> cap(Procompose<FunctionType.Mu, FunctionType.Mu, A, B, C> var1) {
         return FunctionType.create(Optics.getFunc(var1.second()).compose(Optics.getFunc((App2<FunctionType.Mu, ? super A, ? extends A>)var1.first().get())));
      }

      @Override
      public <A, B, F extends K1> App2<FunctionType.Mu, App<F, A>, App<F, B>> mapping(Functor<F, ?> var1, App2<FunctionType.Mu, A, B> var2) {
         return FunctionType.create(var2x -> var1.map(Optics.getFunc(var2), (App<F, A>)var2x));
      }

      public static final class Mu implements Mapping.Mu, MonoidProfunctor.Mu, Monoidal.Mu, TraversalP.Mu {
         public static final TypeToken<FunctionType.Instance.Mu> TYPE_TOKEN = new TypeToken<FunctionType.Instance.Mu>() {};
      }
   }

   final class Mu implements K2 {
   }

   final class ReaderInstance<R> implements Representable<FunctionType.ReaderMu<R>, R, FunctionType.ReaderInstance.Mu<R>> {
      @Override
      public <T, R2> App<FunctionType.ReaderMu<R>, R2> map(Function<? super T, ? extends R2> var1, App<FunctionType.ReaderMu<R>, T> var2) {
         return FunctionType.create(var1.compose(FunctionType.unbox(var2)));
      }

      @Override
      public <B> App<FunctionType.ReaderMu<R>, B> to(App<FunctionType.ReaderMu<R>, B> var1) {
         return var1;
      }

      @Override
      public <B> App<FunctionType.ReaderMu<R>, B> from(App<FunctionType.ReaderMu<R>, B> var1) {
         return var1;
      }

      public static final class Mu<A> implements Representable.Mu {
      }
   }

   final class ReaderMu<A> implements K1 {
   }
}
