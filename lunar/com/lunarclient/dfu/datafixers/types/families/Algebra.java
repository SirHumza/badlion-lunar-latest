package com.lunarclient.dfu.datafixers.types.families;

import com.lunarclient.dfu.datafixers.RewriteResult;

public interface Algebra {
   RewriteResult<?, ?> apply(int var1);

   String toString(int var1);
}
