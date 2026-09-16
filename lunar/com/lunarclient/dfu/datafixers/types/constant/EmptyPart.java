package com.lunarclient.dfu.datafixers.types.constant;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;

public final class EmptyPart extends Type<Unit> {
   @Override
   public String toString() {
      return "EmptyPart";
   }

   @Override
   public Optional<Unit> point(DynamicOps<?> var1) {
      return Optional.of(Unit.INSTANCE);
   }

   @Override
   public boolean equals(Object var1, boolean var2, boolean var3) {
      return this == var1;
   }

   @Override
   public TypeTemplate buildTemplate() {
      return DSL.constType(this);
   }

   @Override
   protected Codec<Unit> buildCodec() {
      return Codec.EMPTY.codec();
   }
}
