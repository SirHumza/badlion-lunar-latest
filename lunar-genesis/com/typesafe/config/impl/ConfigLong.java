package com.typesafe.config.impl;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;

final class ConfigLong extends ConfigNumber implements Serializable {
   private static final long serialVersionUID = 2L;
   private final long value;

   ConfigLong(ConfigOrigin var1, long var2, String var4) {
      super(var1, var4);
      this.value = var2;
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.NUMBER;
   }

   public Long unwrapped() {
      return this.value;
   }

   @Override
   String transformToString() {
      String var1 = super.transformToString();
      return var1 == null ? Long.toString(this.value) : var1;
   }

   @Override
   protected long longValue() {
      return this.value;
   }

   @Override
   protected double doubleValue() {
      return this.value;
   }

   protected ConfigLong newCopy(ConfigOrigin var1) {
      return new ConfigLong(var1, this.value, this.originalText);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }
}
