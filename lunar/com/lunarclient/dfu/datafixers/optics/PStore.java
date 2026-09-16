package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.Functor;
import com.lunarclient.dfu.datafixers.kinds.K1;
import java.util.function.Function;

interface PStore<I, J, X> extends App<PStore.Mu<I, J>, X> {
   static <I, J, X> PStore<I, J, X> unbox(App<PStore.Mu<I, J>, X> var0) {
      return (PStore<I, J, X>)var0;
   }

   X peek(J var1);

   I pos();

   final class Instance<I, J> implements Functor<PStore.Mu<I, J>, PStore.Instance.Mu<I, J>> {
      @Override
      public <T, R> App<PStore.Mu<I, J>, R> map(Function<? super T, ? extends R> var1, App<PStore.Mu<I, J>, T> var2) {
         PStore var3 = PStore.unbox(var2);
         return Optics.pStore(var1.compose(var3::peek)::apply, var3::pos);
      }

      public static final class Mu<I, J> implements Functor.Mu {
      }
   }

   final class Mu<I, J> implements K1 {
   }
}
