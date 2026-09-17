package com.lunarclient.dfu.datafixers.types.families;

import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.types.Type;
import java.util.function.IntFunction;

public interface TypeFamily {
   Type<?> apply(int var1);

   static <A, B> FamilyOptic<A, B> familyOptic(IntFunction<TypedOptic<?, ?, A, B>> var0) {
      return var0::apply;
   }
}
