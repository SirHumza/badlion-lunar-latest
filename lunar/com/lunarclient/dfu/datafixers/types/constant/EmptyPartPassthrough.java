package com.lunarclient.dfu.datafixers.types.constant;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.Dynamic;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;

public final class EmptyPartPassthrough extends Type<Dynamic<?>> {
   @Override
   public String toString() {
      return "EmptyPartPassthrough";
   }

   @Override
   public Optional<Dynamic<?>> point(DynamicOps<?> var1) {
      return Optional.of(new Dynamic(var1));
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
   public Codec<Dynamic<?>> buildCodec() {
      return Codec.PASSTHROUGH;
   }
}
