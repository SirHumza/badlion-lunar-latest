package org.cadixdev.bombe.analysis;

import java.util.Optional;

public interface InheritanceCompletable {
   Optional<InheritanceProvider.ClassInfo> provideInheritance(InheritanceProvider var1, Object var2);

   boolean isComplete();

   default void complete(InheritanceProvider var1) {
      this.complete(var1, (Object)null);
   }

   default void complete(InheritanceProvider var1, Object var2) {
      if (!this.isComplete()) {
         Optional var3 = this.provideInheritance(var1, var2);
         var3.ifPresent(var2x -> this.complete(var1, var2x));
      }
   }

   void complete(InheritanceProvider var1, InheritanceProvider.ClassInfo var2);
}
