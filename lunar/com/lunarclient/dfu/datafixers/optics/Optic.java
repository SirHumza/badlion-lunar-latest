package com.lunarclient.dfu.datafixers.optics;

import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface Optic<Proof extends K1, S, T, A, B> {
   <P extends K2> Function<App2<P, A, B>, App2<P, S, T>> eval(App<? extends Proof, P> var1);

   default <Proof2 extends K1> Optional<Optic<? super Proof2, S, T, A, B>> upCast(Set<TypeToken<? extends K1>> var1, TypeToken<Proof2> var2) {
      return var1.stream().allMatch(var1x -> var1x.isSupertypeOf(var2)) ? Optional.of(this) : Optional.empty();
   }

   record CompositionOptic<Proof extends K1, S, T, A, B>() implements Optic<Proof, S, T, A, B> {
      private final List<? extends Optic<? super Proof, ?, ?, ?, ?>> optics;

      public CompositionOptic(List<? extends Optic<? super Proof, ?, ?, ?, ?>> var1) {
         this.optics = var1;
      }

      @Override
      public <P extends K2> Function<App2<P, A, B>, App2<P, S, T>> eval(App<? extends Proof, P> var1) {
         ArrayList var2 = new ArrayList(this.optics.size());

         for (int var3 = this.optics.size() - 1; var3 >= 0; var3--) {
            var2.add(this.optics.get(var3).eval(var1));
         }

         return var1x -> {
            App2 var2x = var1x;

            for (Function var4 : var2) {
               var2x = applyUnchecked(var4, var2x);
            }

            return var2x;
         };
      }

      private static <P extends K2, T extends App2<P, ?, ?>> App2<P, ?, ?> applyUnchecked(Function<T, ? extends App2<P, ?, ?>> var0, App2<P, ?, ?> var1) {
         return (App2<P, ?, ?>)var0.apply(var1);
      }

      @Override
      public String toString() {
         return "(" + this.optics.stream().map(Object::toString).collect(Collectors.joining(" ◦ ")) + ")";
      }
   }
}
