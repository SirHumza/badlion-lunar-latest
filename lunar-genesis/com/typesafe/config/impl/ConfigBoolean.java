package com.typesafe.config.impl;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;

final class ConfigBoolean extends AbstractConfigValue implements Serializable {
   private static final long serialVersionUID = 2L;
   private final boolean value;

   ConfigBoolean(ConfigOrigin var1, boolean var2) {
      super(var1);
      this.value = var2;
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.BOOLEAN;
   }

   public Boolean unwrapped() {
      return this.value;
   }

   @Override
   String transformToString() {
      return this.value ? "true" : "false";
   }

   protected ConfigBoolean newCopy(ConfigOrigin var1) {
      return new ConfigBoolean(var1, this.value);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }
}
