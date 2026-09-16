package com.lunarclient.dfu.datafixers.optics;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;
import java.util.List;

public final class ListTraversal<A, B> implements Traversal<List<A>, List<B>, A, B> {
   static final ListTraversal<?, ?> INSTANCE = new ListTraversal();

   private ListTraversal() {
   }

   @Override
   public <F extends K1> FunctionType<List<A>, App<F, List<B>>> wander(Applicative<F, ?> var1, FunctionType<A, App<F, B>> var2) {
      return var2x -> {
         App var3 = var1.point(ImmutableList.builder());

         for (Object var5 : var2x) {
            var3 = var1.ap2(var1.point(Builder::add), var3, (App<F, B>)var2.apply(var5));
         }

         return var1.map(Builder::build, var3);
      };
   }

   @Override
   public String toString() {
      return "ListTraversal";
   }
}
