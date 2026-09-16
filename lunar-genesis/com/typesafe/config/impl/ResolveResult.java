package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;

final class ResolveResult<V extends AbstractConfigValue> {
   public final ResolveContext context;
   public final V value;

   private ResolveResult(ResolveContext var1, V var2) {
      this.context = var1;
      this.value = (V)var2;
   }

   static <V extends AbstractConfigValue> ResolveResult<V> make(ResolveContext var0, V var1) {
      return new ResolveResult<>(var0, (V)var1);
   }

   ResolveResult<AbstractConfigObject> asObjectResult() {
      if (!(this.value instanceof AbstractConfigObject)) {
         throw new ConfigException.BugOrBroken("Expecting a resolve result to be an object, but it was " + this.value);
      }

      ResolveResult var1 = this;
      return var1;
   }

   ResolveResult<AbstractConfigValue> asValueResult() {
      ResolveResult var1 = this;
      return var1;
   }

   ResolveResult<V> popTrace() {
      return make(this.context.popTrace(), this.value);
   }

   @Override
   public String toString() {
      return "ResolveResult(" + this.value + ")";
   }
}
