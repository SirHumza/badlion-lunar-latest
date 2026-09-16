package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class MethodInsnNode extends AbstractInsnNode {
   public String owner;
   public String name;
   public String desc;
   public boolean itf;

   public MethodInsnNode(int var1, String var2, String var3, String var4) {
      this(var1, var2, var3, var4, var1 == 185);
   }

   public MethodInsnNode(int var1, String var2, String var3, String var4, boolean var5) {
      super(var1);
      this.owner = var2;
      this.name = var3;
      this.desc = var4;
      this.itf = var5;
   }

   public void setOpcode(int var1) {
      this.opcode = var1;
   }

   @Override
   public int getType() {
      return 5;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitMethodInsn(this.opcode, this.owner, this.name, this.desc, this.itf);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new MethodInsnNode(this.opcode, this.owner, this.name, this.desc, this.itf).cloneAnnotations(this);
   }
}
