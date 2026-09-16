package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.Functor;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import java.util.function.Function;

public class ProfunctorFunctorWrapper<P extends K2, F extends K1, G extends K1, A, B> implements App2<ProfunctorFunctorWrapper.Mu<P, F, G>, A, B> {
   private final App2<P, App<F, A>, App<G, B>> value;

   public static <P extends K2, F extends K1, G extends K1, A, B> ProfunctorFunctorWrapper<P, F, G, A, B> unbox(
      App2<ProfunctorFunctorWrapper.Mu<P, F, G>, A, B> var0
   ) {
      return (ProfunctorFunctorWrapper<P, F, G, A, B>)var0;
   }

   public ProfunctorFunctorWrapper(App2<P, App<F, A>, App<G, B>> var1) {
      this.value = var1;
   }

   public App2<P, App<F, A>, App<G, B>> value() {
      return this.value;
   }

   public static final class Instance<P extends K2, F extends K1, G extends K1>
      implements App<ProfunctorFunctorWrapper.Instance.Mu, ProfunctorFunctorWrapper.Mu<P, F, G>>,
      Profunctor<ProfunctorFunctorWrapper.Mu<P, F, G>, ProfunctorFunctorWrapper.Instance.Mu> {
      private final Profunctor<P, ? extends Profunctor.Mu> profunctor;
      private final Functor<F, ?> fFunctor;
      private final Functor<G, ?> gFunctor;

      public Instance(App<? extends Profunctor.Mu, P> var1, Functor<F, ?> var2, Functor<G, ?> var3) {
         this.profunctor = Profunctor.unbox(var1);
         this.fFunctor = var2;
         this.gFunctor = var3;
      }

      @Override
      public <A, B, C, D> FunctionType<App2<ProfunctorFunctorWrapper.Mu<P, F, G>, A, B>, App2<ProfunctorFunctorWrapper.Mu<P, F, G>, C, D>> dimap(
         Function<C, A> var1, Function<B, D> var2
      ) {
         return var3 -> {
            App2 var4 = ProfunctorFunctorWrapper.unbox(var3).value();
            App2 var5 = this.profunctor.dimap(var4, var2xx -> this.fFunctor.map(var1, var2xx), var2xx -> this.gFunctor.map(var2, var2xx));
            return new ProfunctorFunctorWrapper<>(var5);
         };
      }

      public static final class Mu implements Profunctor.Mu {
      }
   }

   public static final class Mu<P extends K2, F extends K1, G extends K1> implements K2 {
   }
}
