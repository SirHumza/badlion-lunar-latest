package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.util.Bytecode;

public abstract class AccessorGeneratorField extends AccessorGenerator {
   protected final FieldNode targetField;
   protected final Type targetType;

   public AccessorGeneratorField(AccessorInfo var1) {
      super(var1, Bytecode.isStatic(var1.getTargetField()));
      this.targetField = var1.getTargetField();
      this.targetType = var1.getTargetFieldType();
      this.checkModifiers();
   }
}
