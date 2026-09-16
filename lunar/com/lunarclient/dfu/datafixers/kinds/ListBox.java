package com.lunarclient.dfu.datafixers.kinds;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class ListBox<T> implements App<ListBox.Mu, T> {
   private final List<T> value;

   public static <T> List<T> unbox(App<ListBox.Mu, T> var0) {
      return ((ListBox)var0).value;
   }

   public static <T> ListBox<T> create(List<T> var0) {
      return new ListBox<>(var0);
   }

   private ListBox(List<T> var1) {
      this.value = var1;
   }

   public static <F extends K1, A, B> App<F, List<B>> traverse(Applicative<F, ?> var0, Function<A, App<F, B>> var1, List<A> var2) {
      return var0.map(ListBox::unbox, ListBox.Instance.INSTANCE.traverse(var0, var1, create(var2)));
   }

   public static <F extends K1, A> App<F, List<A>> flip(Applicative<F, ?> var0, List<App<F, A>> var1) {
      return var0.map(ListBox::unbox, ListBox.Instance.INSTANCE.flip(var0, create(var1)));
   }

   public enum Instance implements Traversable<ListBox.Mu, ListBox.Instance.Mu> {
      INSTANCE;

      @Override
      public <T, R> App<ListBox.Mu, R> map(Function<? super T, ? extends R> var1, App<ListBox.Mu, T> var2) {
         return ListBox.create(ListBox.unbox(var2).stream().<T>map(var1).collect(Collectors.toList()));
      }

      @Override
      public <F extends K1, A, B> App<F, App<ListBox.Mu, B>> traverse(Applicative<F, ?> var1, Function<A, App<F, B>> var2, App<ListBox.Mu, A> var3) {
         List var4 = ListBox.unbox(var3);
         App var5 = var1.point(ImmutableList.builder());

         for (Object var7 : var4) {
            App var8 = (App)var2.apply(var7);
            var5 = var1.ap2(var1.point(Builder::add), var5, var8);
         }

         return var1.map(var0 -> ListBox.create(var0.build()), var5);
      }

      public static final class Mu implements Traversable.Mu {
      }
   }

   public static final class Mu implements K1 {
   }
}
