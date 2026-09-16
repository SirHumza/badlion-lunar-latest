package com.typesafe.config.impl;

import java.util.Collection;

final class ConfigNodeArray extends ConfigNodeComplexValue {
   ConfigNodeArray(Collection<AbstractConfigNode> var1) {
      super(var1);
   }

   protected ConfigNodeArray newNode(Collection<AbstractConfigNode> var1) {
      return new ConfigNodeArray(var1);
   }
}
