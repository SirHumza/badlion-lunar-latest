package com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import java.util.function.Supplier;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final String id;
   private final boolean dynamic;
   private Supplier<Object> replacement;

   public static String getReplacement(String var0) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
         if (var4.id.equals(var0)) {
            return var4.replacement.get().toString();
         }
      }

      return null;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH getVariable(String var0) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
         if (var4.id.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public boolean isDynamic() {
      return this.dynamic;
   }

   @Generated
   public Supplier<Object> getReplacement() {
      return this.replacement;
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, boolean var4) {
      this.id = var3;
      this.dynamic = var4;
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, boolean var4, Supplier<Object> var5) {
      this.id = var3;
      this.dynamic = var4;
      this.replacement = var5;
   }
}
