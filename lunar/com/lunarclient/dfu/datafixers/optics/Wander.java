package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;

public interface Wander<S, T, A, B> {
   <F extends K1> FunctionType<S, App<F, T>> wander(Applicative<F, ?> var1, FunctionType<A, App<F, B>> var2);
}
