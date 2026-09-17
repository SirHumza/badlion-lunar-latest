package com.eliotlash.molang.variables;

public enum VariableFlavor {
   CONTEXT("context", "c"),
   QUERY("query", "q"),
   TEMP("temp", "t"),
   VARIABLE("variable", "v"),
   READOUT("readout", "r"),
   LUNAR("lunar", "l"),
   OPTION("option", "o");

   public final String name;
   public final String alias;

   VariableFlavor(String var3, String var4) {
      this.name = var3;
      this.alias = var4;
   }

   public static VariableFlavor parse(String var0) {
      for (VariableFlavor var4 : values()) {
         if (var4.name.equals(var0) || var4.alias.equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
