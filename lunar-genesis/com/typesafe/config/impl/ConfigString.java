package com.typesafe.config.impl;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;

abstract class ConfigString extends AbstractConfigValue implements Serializable {
   private static final long serialVersionUID = 2L;
   protected final String value;

   protected ConfigString(ConfigOrigin var1, String var2) {
      super(var1);
      this.value = var2;
   }

   boolean wasQuoted() {
      return this instanceof ConfigString.Quoted;
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.STRING;
   }

   public String unwrapped() {
      return this.value;
   }

   @Override
   String transformToString() {
      return this.value;
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      String var5;
      if (var4.getJson()) {
         var5 = ConfigImplUtil.renderJsonString(this.value);
      } else {
         var5 = ConfigImplUtil.renderStringUnquotedIfPossible(this.value);
      }

      var1.append(var5);
   }

   static final class Quoted extends ConfigString {
      Quoted(ConfigOrigin var1, String var2) {
         super(var1, var2);
      }

      protected ConfigString.Quoted newCopy(ConfigOrigin var1) {
         return new ConfigString.Quoted(var1, this.value);
      }

      private Object writeReplace() {
         return new SerializedConfigValue(this);
      }
   }

   static final class Unquoted extends ConfigString {
      Unquoted(ConfigOrigin var1, String var2) {
         super(var1, var2);
      }

      protected ConfigString.Unquoted newCopy(ConfigOrigin var1) {
         return new ConfigString.Unquoted(var1, this.value);
      }

      private Object writeReplace() {
         return new SerializedConfigValue(this);
      }
   }
}
