package com.typesafe.config.impl;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;

final class ConfigDouble extends ConfigNumber implements Serializable {
   private static final long serialVersionUID = 2L;
   private final double value;

   ConfigDouble(ConfigOrigin var1, double var2, String var4) {
      super(var1, var4);
      this.value = var2;
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.NUMBER;
   }

   public Double unwrapped() {
      return this.value;
   }

   @Override
   String transformToString() {
      String var1 = super.transformToString();
      return var1 == null ? Double.toString(this.value) : var1;
   }

   @Override
   protected long longValue() {
      return (long)this.value;
   }

   @Override
   protected double doubleValue() {
      return this.value;
   }

   protected ConfigDouble newCopy(ConfigOrigin var1) {
      return new ConfigDouble(var1, this.value, this.originalText);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }
}
