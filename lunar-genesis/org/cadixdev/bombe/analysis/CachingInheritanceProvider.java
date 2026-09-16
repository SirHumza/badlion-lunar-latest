package org.cadixdev.bombe.analysis;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CachingInheritanceProvider implements InheritanceProvider {
   private final InheritanceProvider provider;
   private final Map<String, Optional<InheritanceProvider.ClassInfo>> cache = new HashMap<>();

   public CachingInheritanceProvider(InheritanceProvider var1) {
      this.provider = var1;
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      return this.cache.computeIfAbsent(var1, this.provider::provide);
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1, Object var2) {
      return this.cache.computeIfAbsent(var1, var2x -> this.provider.provide(var2x, var2));
   }
}
