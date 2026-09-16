package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class TypeInsnNode extends AbstractInsnNode {
   public String desc;

   public TypeInsnNode(int var1, String var2) {
      super(var1);
      this.desc = var2;
   }

   public void setOpcode(int var1) {
      this.opcode = var1;
   }

   @Override
   public int getType() {
      return 3;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitTypeInsn(this.opcode, this.desc);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new TypeInsnNode(this.opcode, this.desc).cloneAnnotations(this);
   }
}
