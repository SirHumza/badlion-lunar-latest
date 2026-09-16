package org.cadixdev.lorenz.model.jar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.lorenz.model.FieldMapping;

public class CascadingFieldTypeProvider implements FieldTypeProvider {
   private final List<FieldTypeProvider> providers = new ArrayList<>();

   public CascadingFieldTypeProvider add(FieldTypeProvider var1) {
      this.providers.add(var1);
      return this;
   }

   public CascadingFieldTypeProvider remove(FieldTypeProvider var1) {
      this.providers.remove(var1);
      return this;
   }

   @Override
   public Optional<FieldType> provide(FieldMapping var1) {
      for (FieldTypeProvider var3 : this.providers) {
         Optional var4 = var3.provide(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }
}
