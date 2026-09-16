package org.cadixdev.lorenz.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.MappingSetModelFactory;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;
import org.cadixdev.lorenz.model.jar.CascadingFieldTypeProvider;

public class MappingSetImpl implements MappingSet {
   private final Map<String, TopLevelClassMapping> topLevelClasses = new ConcurrentHashMap<>();
   private final MappingSetModelFactory modelFactory;
   private CascadingFieldTypeProvider fieldTypeProvider = new CascadingFieldTypeProvider();

   public MappingSetImpl() {
      this(new MappingSetModelFactoryImpl());
   }

   public MappingSetImpl(MappingSetModelFactory var1) {
      this.modelFactory = var1;
   }

   @Override
   public MappingSetModelFactory getModelFactory() {
      return this.modelFactory;
   }

   @Override
   public Collection<TopLevelClassMapping> getTopLevelClassMappings() {
      return Collections.unmodifiableCollection(this.topLevelClasses.values());
   }

   @Override
   public TopLevelClassMapping createTopLevelClassMapping(String var1, String var2) {
      return this.topLevelClasses
         .compute(
            var1.replace('.', '/'),
            (var2x, var3) -> var3 != null ? var3.setDeobfuscatedName(var2) : this.getModelFactory().createTopLevelClassMapping(this, var2x, var2)
         );
   }

   @Override
   public Optional<TopLevelClassMapping> getTopLevelClassMapping(String var1) {
      return Optional.ofNullable(this.topLevelClasses.get(var1.replace('.', '/')));
   }

   @Override
   public boolean hasTopLevelClassMapping(String var1) {
      return this.topLevelClasses.containsKey(var1.replace('.', '/'));
   }

   @Override
   public CascadingFieldTypeProvider getFieldTypeProvider() {
      return this.fieldTypeProvider;
   }

   @Override
   public void removeClassMapping(ClassMapping<?, ?> var1) {
      if (var1 instanceof InnerClassMapping) {
         ((InnerClassMapping)var1).getParent().removeInnerClassMapping(var1);
      } else {
         this.topLevelClasses.values().remove(var1);
      }
   }
}
