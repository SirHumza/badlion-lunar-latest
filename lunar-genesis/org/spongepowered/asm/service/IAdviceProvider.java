package org.spongepowered.asm.service;

public interface IAdviceProvider {
   IAdviceProvider GENERIC = new IAdviceProvider() {
      @Override
      public String higherCompatibilityNeeded(int var1, String var2) {
         return "Increase your compatibility version to at least " + var2;
      }
   };

   String higherCompatibilityNeeded(int var1, String var2);
}
