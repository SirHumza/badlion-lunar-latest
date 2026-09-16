package org.cadixdev.bombe.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompositeInheritanceProvider implements InheritanceProvider {
   private final ArrayList<InheritanceProvider> providers;

   public CompositeInheritanceProvider(List<InheritanceProvider> var1) {
      this.providers = new ArrayList<>(var1);
   }

   public CompositeInheritanceProvider() {
      this.providers = new ArrayList<>();
   }

   public CompositeInheritanceProvider install(InheritanceProvider var1) {
      this.providers.add(var1);
      return this;
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      for (InheritanceProvider var3 : this.providers) {
         Optional var4 = var3.provide(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1, Object var2) {
      for (InheritanceProvider var4 : this.providers) {
         Optional var5 = var4.provide(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}
