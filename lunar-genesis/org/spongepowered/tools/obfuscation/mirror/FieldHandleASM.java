package org.spongepowered.tools.obfuscation.mirror;

import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.util.Bytecode;

public class FieldHandleASM extends FieldHandle {
   private final FieldNode field;

   public FieldHandleASM(TypeHandle var1, FieldNode var2) {
      super(var1, var2.name, var2.desc);
      this.field = var2;
   }

   @Override
   public Bytecode.Visibility getVisibility() {
      return Bytecode.getVisibility(this.field);
   }
}
