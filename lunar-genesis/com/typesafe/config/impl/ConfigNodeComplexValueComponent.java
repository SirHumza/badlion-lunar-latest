package com.typesafe.config.impl;

import java.util.Collection;

final class ConfigNodeConcatenation extends ConfigNodeComplexValue {
   ConfigNodeConcatenation(Collection<AbstractConfigNode> var1) {
      super(var1);
   }

   protected ConfigNodeConcatenation newNode(Collection<AbstractConfigNode> var1) {
      return new ConfigNodeConcatenation(var1);
   }
}
