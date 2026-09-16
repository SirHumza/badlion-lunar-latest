package com.typesafe.config.impl;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;

final class ConfigNull extends AbstractConfigValue implements Serializable {
   private static final long serialVersionUID = 2L;

   ConfigNull(ConfigOrigin var1) {
      super(var1);
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.NULL;
   }

   @Override
   public Object unwrapped() {
      return null;
   }

   @Override
   String transformToString() {
      return "null";
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      var1.append("null");
   }

   protected ConfigNull newCopy(ConfigOrigin var1) {
      return new ConfigNull(var1);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }
}
