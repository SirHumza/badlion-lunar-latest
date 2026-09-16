package com.eliotlash.molang.variables;

public record RuntimeVariable() {
   private final VariableFlavor flavor;
   private final String name;

   public RuntimeVariable(VariableFlavor var1, String var2) {
      this.flavor = var1;
      this.name = var2;
   }
}
