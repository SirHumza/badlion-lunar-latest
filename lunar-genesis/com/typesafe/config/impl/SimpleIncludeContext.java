package com.typesafe.config.impl;

import com.typesafe.config.ConfigIncludeContext;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigParseable;

class SimpleIncludeContext implements ConfigIncludeContext {
   private final Parseable parseable;
   private final ConfigParseOptions options;

   SimpleIncludeContext(Parseable var1) {
      this.parseable = var1;
      this.options = SimpleIncluder.clearForInclude(var1.options());
   }

   private SimpleIncludeContext(Parseable var1, ConfigParseOptions var2) {
      this.parseable = var1;
      this.options = var2;
   }

   SimpleIncludeContext withParseable(Parseable var1) {
      return var1 == this.parseable ? this : new SimpleIncludeContext(var1);
   }

   @Override
   public ConfigParseable relativeTo(String var1) {
      if (ConfigImpl.traceLoadsEnabled()) {
         ConfigImpl.trace("Looking for '" + var1 + "' relative to " + this.parseable);
      }

      return this.parseable != null ? this.parseable.relativeTo(var1) : null;
   }

   @Override
   public ConfigParseOptions parseOptions() {
      return this.options;
   }

   @Override
   public ConfigIncludeContext setParseOptions(ConfigParseOptions var1) {
      return new SimpleIncludeContext(this.parseable, var1.setSyntax(null).setOriginDescription(null));
   }
}
