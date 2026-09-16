package org.cadixdev.atlas.util;

import java.util.List;
import org.cadixdev.bombe.provider.ClassProvider;

public class CompositeClassProvider implements ClassProvider {
   private final List<ClassProvider> providers;

   public CompositeClassProvider(List<ClassProvider> var1) {
      this.providers = var1;
   }

   @Override
   public byte[] get(String var1) {
      for (ClassProvider var3 : this.providers) {
         byte[] var4 = var3.get(var1);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }
}
