package org.cadixdev.lorenz.impl;

import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.MappingSetModelFactory;
import org.cadixdev.lorenz.impl.model.FieldMappingImpl;
import org.cadixdev.lorenz.impl.model.InnerClassMappingImpl;
import org.cadixdev.lorenz.impl.model.MethodMappingImpl;
import org.cadixdev.lorenz.impl.model.MethodParameterMappingImpl;
import org.cadixdev.lorenz.impl.model.TopLevelClassMappingImpl;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public class MappingSetModelFactoryImpl implements MappingSetModelFactory {
   @Override
   public TopLevelClassMapping createTopLevelClassMapping(MappingSet var1, String var2, String var3) {
      return new TopLevelClassMappingImpl(var1, var2, var3);
   }

   @Override
   public InnerClassMapping createInnerClassMapping(ClassMapping var1, String var2, String var3) {
      return new InnerClassMappingImpl(var1, var2, var3);
   }

   @Override
   public FieldMapping createFieldMapping(ClassMapping var1, FieldSignature var2, String var3) {
      return new FieldMappingImpl(var1, var2, var3);
   }

   @Override
   public MethodMapping createMethodMapping(ClassMapping var1, MethodSignature var2, String var3) {
      return new MethodMappingImpl(var1, var2, var3);
   }

   @Override
   public MethodParameterMapping createMethodParameterMapping(MethodMapping var1, int var2, String var3) {
      return new MethodParameterMappingImpl(var1, var2, var3);
   }
}
