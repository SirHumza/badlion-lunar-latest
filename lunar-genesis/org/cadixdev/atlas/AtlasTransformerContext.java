package org.cadixdev.atlas;

import org.cadixdev.bombe.analysis.InheritanceProvider;

public class AtlasTransformerContext {
   private final InheritanceProvider inheritanceProvider;

   AtlasTransformerContext(InheritanceProvider var1) {
      this.inheritanceProvider = var1;
   }

   public InheritanceProvider inheritanceProvider() {
      return this.inheritanceProvider;
   }
}
