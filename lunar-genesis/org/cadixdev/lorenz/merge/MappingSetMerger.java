package org.cadixdev.lorenz.merge;

import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.impl.merge.MappingSetMergerImpl;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public interface MappingSetMerger {
   static MappingSetMerger create(MappingSet var0, MappingSet var1) {
      return create(var0, var1, MergeConfig.builder().build());
   }

   static MappingSetMerger create(MappingSet var0, MappingSet var1, MergeConfig var2) {
      return new MappingSetMergerImpl(var0, var1, var2);
   }

   default MappingSet merge() {
      return this.merge(MappingSet.create());
   }

   MappingSet merge(MappingSet var1);

   TopLevelClassMapping mergeTopLevelClass(TopLevelClassMapping var1, TopLevelClassMapping var2, MappingSet var3);

   InnerClassMapping mergeInnerClass(InnerClassMapping var1, InnerClassMapping var2, ClassMapping<?, ?> var3);

   FieldMapping mergeField(FieldMapping var1, FieldMapping var2, ClassMapping<?, ?> var3);

   MethodMapping mergeMethod(MethodMapping var1, MethodMapping var2, ClassMapping<?, ?> var3);

   MethodParameterMapping mergeMethodParameter(MethodParameterMapping var1, MethodParameterMapping var2, MethodMapping var3);
}
