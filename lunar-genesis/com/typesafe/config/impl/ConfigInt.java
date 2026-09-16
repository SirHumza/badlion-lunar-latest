package com.typesafe.config.impl;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;

final class ConfigInt extends ConfigNumber implements Serializable {
   private static final long serialVersionUID = 2L;
   private final int value;

   ConfigInt(ConfigOrigin var1, int var2, String var3) {
      super(var1, var3);
      this.value = var2;
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.NUMBER;
   }

   public Integer unwrapped() {
      return this.value;
   }

   @Override
   String transformToString() {
      String var1 = super.transformToString();
      return var1 == null ? Integer.toString(this.value) : var1;
   }

   @Override
   protected long longValue() {
      return this.value;
   }

   @Override
   protected double doubleValue() {
      return this.value;
   }

   protected ConfigInt newCopy(ConfigOrigin var1) {
      return new ConfigInt(var1, this.value, this.originalText);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }
}
