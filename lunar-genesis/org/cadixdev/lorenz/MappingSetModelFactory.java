package org.cadixdev.lorenz;

import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public interface MappingSetModelFactory {
   TopLevelClassMapping createTopLevelClassMapping(MappingSet var1, String var2, String var3);

   InnerClassMapping createInnerClassMapping(ClassMapping var1, String var2, String var3);

   FieldMapping createFieldMapping(ClassMapping var1, FieldSignature var2, String var3);

   MethodMapping createMethodMapping(ClassMapping var1, MethodSignature var2, String var3);

   MethodParameterMapping createMethodParameterMapping(MethodMapping var1, int var2, String var3);
}
