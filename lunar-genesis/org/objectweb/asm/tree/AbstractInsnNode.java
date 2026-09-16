package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public abstract class AbstractInsnNode {
   public static final int INSN = 0;
   public static final int INT_INSN = 1;
   public static final int VAR_INSN = 2;
   public static final int TYPE_INSN = 3;
   public static final int FIELD_INSN = 4;
   public static final int METHOD_INSN = 5;
   public static final int INVOKE_DYNAMIC_INSN = 6;
   public static final int JUMP_INSN = 7;
   public static final int LABEL = 8;
   public static final int LDC_INSN = 9;
   public static final int IINC_INSN = 10;
   public static final int TABLESWITCH_INSN = 11;
   public static final int LOOKUPSWITCH_INSN = 12;
   public static final int MULTIANEWARRAY_INSN = 13;
   public static final int FRAME = 14;
   public static final int LINE = 15;
   protected int opcode;
   public List<TypeAnnotationNode> visibleTypeAnnotations;
   public List<TypeAnnotationNode> invisibleTypeAnnotations;
   AbstractInsnNode previousInsn;
   AbstractInsnNode nextInsn;
   int index;

   protected AbstractInsnNode(int var1) {
      this.opcode = var1;
      this.index = -1;
   }

   public int getOpcode() {
      return this.opcode;
   }

   public abstract int getType();

   public AbstractInsnNode getPrevious() {
      return this.previousInsn;
   }

   public AbstractInsnNode getNext() {
      return this.nextInsn;
   }

   public abstract void accept(MethodVisitor var1);

   protected final void acceptAnnotations(MethodVisitor var1) {
      if (this.visibleTypeAnnotations != null) {
         int var2 = 0;

         for (int var3 = this.visibleTypeAnnotations.size(); var2 < var3; var2++) {
            TypeAnnotationNode var4 = this.visibleTypeAnnotations.get(var2);
            var4.accept(var1.visitInsnAnnotation(var4.typeRef, var4.typePath, var4.desc, true));
         }
      }

      if (this.invisibleTypeAnnotations != null) {
         int var5 = 0;

         for (int var6 = this.invisibleTypeAnnotations.size(); var5 < var6; var5++) {
            TypeAnnotationNode var7 = this.invisibleTypeAnnotations.get(var5);
            var7.accept(var1.visitInsnAnnotation(var7.typeRef, var7.typePath, var7.desc, false));
         }
      }
   }

   public abstract AbstractInsnNode clone(Map<LabelNode, LabelNode> var1);

   static LabelNode clone(LabelNode var0, Map<LabelNode, LabelNode> var1) {
      return (LabelNode)var1.get(var0);
   }

   static LabelNode[] clone(List<LabelNode> var0, Map<LabelNode, LabelNode> var1) {
      LabelNode[] var2 = new LabelNode[var0.size()];
      int var3 = 0;

      for (int var4 = var2.length; var3 < var4; var3++) {
         var2[var3] = (LabelNode)var1.get(var0.get(var3));
      }

      return var2;
   }

   protected final AbstractInsnNode cloneAnnotations(AbstractInsnNode var1) {
      if (var1.visibleTypeAnnotations != null) {
         this.visibleTypeAnnotations = new ArrayList<>();
         int var2 = 0;

         for (int var3 = var1.visibleTypeAnnotations.size(); var2 < var3; var2++) {
            TypeAnnotationNode var4 = var1.visibleTypeAnnotations.get(var2);
            TypeAnnotationNode var5 = new TypeAnnotationNode(var4.typeRef, var4.typePath, var4.desc);
            var4.accept(var5);
            this.visibleTypeAnnotations.add(var5);
         }
      }

      if (var1.invisibleTypeAnnotations != null) {
         this.invisibleTypeAnnotations = new ArrayList<>();
         int var6 = 0;

         for (int var7 = var1.invisibleTypeAnnotations.size(); var6 < var7; var6++) {
            TypeAnnotationNode var8 = var1.invisibleTypeAnnotations.get(var6);
            TypeAnnotationNode var9 = new TypeAnnotationNode(var8.typeRef, var8.typePath, var8.desc);
            var8.accept(var9);
            this.invisibleTypeAnnotations.add(var9);
         }
      }

      return this;
   }
}
