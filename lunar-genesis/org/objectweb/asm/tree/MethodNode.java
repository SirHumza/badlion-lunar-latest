package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

public class MethodNode extends MethodVisitor {
   public int access;
   public String name;
   public String desc;
   public String signature;
   public List<String> exceptions;
   public List<ParameterNode> parameters;
   public List<AnnotationNode> visibleAnnotations;
   public List<AnnotationNode> invisibleAnnotations;
   public List<TypeAnnotationNode> visibleTypeAnnotations;
   public List<TypeAnnotationNode> invisibleTypeAnnotations;
   public List<Attribute> attrs;
   public Object annotationDefault;
   public int visibleAnnotableParameterCount;
   public List<AnnotationNode>[] visibleParameterAnnotations;
   public int invisibleAnnotableParameterCount;
   public List<AnnotationNode>[] invisibleParameterAnnotations;
   public InsnList instructions;
   public List<TryCatchBlockNode> tryCatchBlocks;
   public int maxStack;
   public int maxLocals;
   public List<LocalVariableNode> localVariables;
   public List<LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
   public List<LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
   private boolean visited;

   public MethodNode() {
      this(589824);
      if (this.getClass() != MethodNode.class) {
         throw new IllegalStateException();
      }
   }

   public MethodNode(int var1) {
      super(var1);
      this.instructions = new InsnList();
   }

   public MethodNode(int var1, String var2, String var3, String var4, String[] var5) {
      this(589824, var1, var2, var3, var4, var5);
      if (this.getClass() != MethodNode.class) {
         throw new IllegalStateException();
      }
   }

   public MethodNode(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      super(var1);
      this.access = var2;
      this.name = var3;
      this.desc = var4;
      this.signature = var5;
      this.exceptions = Util.asArrayList(var6);
      if ((var2 & 1024) == 0) {
         this.localVariables = new ArrayList<>(5);
      }

      this.tryCatchBlocks = new ArrayList<>();
      this.instructions = new InsnList();
   }

   @Override
   public void visitParameter(String var1, int var2) {
      if (this.parameters == null) {
         this.parameters = new ArrayList<>(5);
      }

      this.parameters.add(new ParameterNode(var1, var2));
   }

   @Override
   public AnnotationVisitor visitAnnotationDefault() {
      return new AnnotationNode(new ArrayList<Object>(0) {
         @Override
         public boolean add(Object var1) {
            MethodNode.this.annotationDefault = var1;
            return super.add(var1);
         }
      });
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      AnnotationNode var3 = new AnnotationNode(var1);
      if (var2) {
         this.visibleAnnotations = Util.add(this.visibleAnnotations, var3);
      } else {
         this.invisibleAnnotations = Util.add(this.invisibleAnnotations, var3);
      }

      return var3;
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      TypeAnnotationNode var5 = new TypeAnnotationNode(var1, var2, var3);
      if (var4) {
         this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, var5);
      } else {
         this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, var5);
      }

      return var5;
   }

   @Override
   public void visitAnnotableParameterCount(int var1, boolean var2) {
      if (var2) {
         this.visibleAnnotableParameterCount = var1;
      } else {
         this.invisibleAnnotableParameterCount = var1;
      }
   }

   @Override
   public AnnotationVisitor visitParameterAnnotation(int var1, String var2, boolean var3) {
      AnnotationNode var4 = new AnnotationNode(var2);
      if (var3) {
         if (this.visibleParameterAnnotations == null) {
            int var5 = Type.getArgumentCount(this.desc);
            this.visibleParameterAnnotations = new List[var5];
         }

         this.visibleParameterAnnotations[var1] = Util.add(this.visibleParameterAnnotations[var1], var4);
      } else {
         if (this.invisibleParameterAnnotations == null) {
            int var6 = Type.getArgumentCount(this.desc);
            this.invisibleParameterAnnotations = new List[var6];
         }

         this.invisibleParameterAnnotations[var1] = Util.add(this.invisibleParameterAnnotations[var1], var4);
      }

      return var4;
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.attrs = Util.add(this.attrs, var1);
   }

   @Override
   public void visitCode() {
   }

   @Override
   public void visitFrame(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      this.instructions.add(new FrameNode(var1, var2, var3 == null ? null : this.getLabelNodes(var3), var4, var5 == null ? null : this.getLabelNodes(var5)));
   }

   @Override
   public void visitInsn(int var1) {
      this.instructions.add(new InsnNode(var1));
   }

   @Override
   public void visitIntInsn(int var1, int var2) {
      this.instructions.add(new IntInsnNode(var1, var2));
   }

   @Override
   public void visitVarInsn(int var1, int var2) {
      this.instructions.add(new VarInsnNode(var1, var2));
   }

   @Override
   public void visitTypeInsn(int var1, String var2) {
      this.instructions.add(new TypeInsnNode(var1, var2));
   }

   @Override
   public void visitFieldInsn(int var1, String var2, String var3, String var4) {
      this.instructions.add(new FieldInsnNode(var1, var2, var3, var4));
   }

   @Override
   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.api < 327680 && (var1 & 256) == 0) {
         super.visitMethodInsn(var1, var2, var3, var4, var5);
      } else {
         int var6 = var1 & -257;
         this.instructions.add(new MethodInsnNode(var6, var2, var3, var4, var5));
      }
   }

   @Override
   public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
      this.instructions.add(new InvokeDynamicInsnNode(var1, var2, var3, var4));
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      this.instructions.add(new JumpInsnNode(var1, this.getLabelNode(var2)));
   }

   @Override
   public void visitLabel(Label var1) {
      this.instructions.add(this.getLabelNode(var1));
   }

   @Override
   public void visitLdcInsn(Object var1) {
      this.instructions.add(new LdcInsnNode(var1));
   }

   @Override
   public void visitIincInsn(int var1, int var2) {
      this.instructions.add(new IincInsnNode(var1, var2));
   }

   @Override
   public void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4) {
      this.instructions.add(new TableSwitchInsnNode(var1, var2, this.getLabelNode(var3), this.getLabelNodes(var4)));
   }

   @Override
   public void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3) {
      this.instructions.add(new LookupSwitchInsnNode(this.getLabelNode(var1), var2, this.getLabelNodes(var3)));
   }

   @Override
   public void visitMultiANewArrayInsn(String var1, int var2) {
      this.instructions.add(new MultiANewArrayInsnNode(var1, var2));
   }

   @Override
   public AnnotationVisitor visitInsnAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      AbstractInsnNode var5 = this.instructions.getLast();

      while (var5.getOpcode() == -1) {
         var5 = var5.getPrevious();
      }

      TypeAnnotationNode var6 = new TypeAnnotationNode(var1, var2, var3);
      if (var4) {
         var5.visibleTypeAnnotations = Util.add(var5.visibleTypeAnnotations, var6);
      } else {
         var5.invisibleTypeAnnotations = Util.add(var5.invisibleTypeAnnotations, var6);
      }

      return var6;
   }

   @Override
   public void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4) {
      TryCatchBlockNode var5 = new TryCatchBlockNode(this.getLabelNode(var1), this.getLabelNode(var2), this.getLabelNode(var3), var4);
      this.tryCatchBlocks = Util.add(this.tryCatchBlocks, var5);
   }

   @Override
   public AnnotationVisitor visitTryCatchAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      TryCatchBlockNode var5 = this.tryCatchBlocks.get((var1 & 16776960) >> 8);
      TypeAnnotationNode var6 = new TypeAnnotationNode(var1, var2, var3);
      if (var4) {
         var5.visibleTypeAnnotations = Util.add(var5.visibleTypeAnnotations, var6);
      } else {
         var5.invisibleTypeAnnotations = Util.add(var5.invisibleTypeAnnotations, var6);
      }

      return var6;
   }

   @Override
   public void visitLocalVariable(String var1, String var2, String var3, Label var4, Label var5, int var6) {
      LocalVariableNode var7 = new LocalVariableNode(var1, var2, var3, this.getLabelNode(var4), this.getLabelNode(var5), var6);
      this.localVariables = Util.add(this.localVariables, var7);
   }

   @Override
   public AnnotationVisitor visitLocalVariableAnnotation(int var1, TypePath var2, Label[] var3, Label[] var4, int[] var5, String var6, boolean var7) {
      LocalVariableAnnotationNode var8 = new LocalVariableAnnotationNode(var1, var2, this.getLabelNodes(var3), this.getLabelNodes(var4), var5, var6);
      if (var7) {
         this.visibleLocalVariableAnnotations = Util.add(this.visibleLocalVariableAnnotations, var8);
      } else {
         this.invisibleLocalVariableAnnotations = Util.add(this.invisibleLocalVariableAnnotations, var8);
      }

      return var8;
   }

   @Override
   public void visitLineNumber(int var1, Label var2) {
      this.instructions.add(new LineNumberNode(var1, this.getLabelNode(var2)));
   }

   @Override
   public void visitMaxs(int var1, int var2) {
      this.maxStack = var1;
      this.maxLocals = var2;
   }

   @Override
   public void visitEnd() {
   }

   protected LabelNode getLabelNode(Label var1) {
      if (!(var1.info instanceof LabelNode)) {
         var1.info = new LabelNode();
      }

      return (LabelNode)var1.info;
   }

   private LabelNode[] getLabelNodes(Label[] var1) {
      LabelNode[] var2 = new LabelNode[var1.length];
      int var3 = 0;

      for (int var4 = var1.length; var3 < var4; var3++) {
         var2[var3] = this.getLabelNode(var1[var3]);
      }

      return var2;
   }

   private Object[] getLabelNodes(Object[] var1) {
      Object[] var2 = new Object[var1.length];
      int var3 = 0;

      for (int var4 = var1.length; var3 < var4; var3++) {
         Object var5 = var1[var3];
         if (var5 instanceof Label) {
            var5 = this.getLabelNode((Label)var5);
         }

         var2[var3] = var5;
      }

      return var2;
   }

   public void check(int var1) {
      if (var1 == 262144) {
         if (this.parameters != null && !this.parameters.isEmpty()) {
            throw new UnsupportedClassVersionException();
         }

         if (this.visibleTypeAnnotations != null && !this.visibleTypeAnnotations.isEmpty()) {
            throw new UnsupportedClassVersionException();
         }

         if (this.invisibleTypeAnnotations != null && !this.invisibleTypeAnnotations.isEmpty()) {
            throw new UnsupportedClassVersionException();
         }

         if (this.tryCatchBlocks != null) {
            for (int var2 = this.tryCatchBlocks.size() - 1; var2 >= 0; var2--) {
               TryCatchBlockNode var3 = this.tryCatchBlocks.get(var2);
               if (var3.visibleTypeAnnotations != null && !var3.visibleTypeAnnotations.isEmpty()) {
                  throw new UnsupportedClassVersionException();
               }

               if (var3.invisibleTypeAnnotations != null && !var3.invisibleTypeAnnotations.isEmpty()) {
                  throw new UnsupportedClassVersionException();
               }
            }
         }

         for (int var5 = this.instructions.size() - 1; var5 >= 0; var5--) {
            AbstractInsnNode var7 = this.instructions.get(var5);
            if (var7.visibleTypeAnnotations != null && !var7.visibleTypeAnnotations.isEmpty()) {
               throw new UnsupportedClassVersionException();
            }

            if (var7.invisibleTypeAnnotations != null && !var7.invisibleTypeAnnotations.isEmpty()) {
               throw new UnsupportedClassVersionException();
            }

            if (var7 instanceof MethodInsnNode) {
               boolean var4 = ((MethodInsnNode)var7).itf;
               if (var4 != (var7.opcode == 185)) {
                  throw new UnsupportedClassVersionException();
               }
            } else {
               if (var7 instanceof InvokeDynamicInsnNode) {
                  throw new UnsupportedClassVersionException();
               }

               if (var7 instanceof LdcInsnNode) {
                  Object var9 = ((LdcInsnNode)var7).cst;
                  if (var9 instanceof Handle || var9 instanceof Type && ((Type)var9).getSort() == 11) {
                     throw new UnsupportedClassVersionException();
                  }
               }
            }
         }

         if (this.visibleLocalVariableAnnotations != null && !this.visibleLocalVariableAnnotations.isEmpty()) {
            throw new UnsupportedClassVersionException();
         }

         if (this.invisibleLocalVariableAnnotations != null && !this.invisibleLocalVariableAnnotations.isEmpty()) {
            throw new UnsupportedClassVersionException();
         }
      }

      if (var1 < 458752) {
         for (int var6 = this.instructions.size() - 1; var6 >= 0; var6--) {
            AbstractInsnNode var8 = this.instructions.get(var6);
            if (var8 instanceof LdcInsnNode) {
               Object var10 = ((LdcInsnNode)var8).cst;
               if (var10 instanceof ConstantDynamic) {
                  throw new UnsupportedClassVersionException();
               }
            }
         }
      }
   }

   public void accept(ClassVisitor var1) {
      String[] var2 = this.exceptions == null ? null : this.exceptions.toArray(new String[0]);
      MethodVisitor var3 = var1.visitMethod(this.access, this.name, this.desc, this.signature, var2);
      if (var3 != null) {
         this.accept(var3);
      }
   }

   public void accept(MethodVisitor var1) {
      if (this.parameters != null) {
         int var2 = 0;

         for (int var3 = this.parameters.size(); var2 < var3; var2++) {
            this.parameters.get(var2).accept(var1);
         }
      }

      if (this.annotationDefault != null) {
         AnnotationVisitor var8 = var1.visitAnnotationDefault();
         AnnotationNode.accept(var8, null, this.annotationDefault);
         if (var8 != null) {
            var8.visitEnd();
         }
      }

      if (this.visibleAnnotations != null) {
         int var9 = 0;

         for (int var20 = this.visibleAnnotations.size(); var9 < var20; var9++) {
            AnnotationNode var4 = this.visibleAnnotations.get(var9);
            var4.accept(var1.visitAnnotation(var4.desc, true));
         }
      }

      if (this.invisibleAnnotations != null) {
         int var10 = 0;

         for (int var21 = this.invisibleAnnotations.size(); var10 < var21; var10++) {
            AnnotationNode var31 = this.invisibleAnnotations.get(var10);
            var31.accept(var1.visitAnnotation(var31.desc, false));
         }
      }

      if (this.visibleTypeAnnotations != null) {
         int var11 = 0;

         for (int var22 = this.visibleTypeAnnotations.size(); var11 < var22; var11++) {
            TypeAnnotationNode var32 = this.visibleTypeAnnotations.get(var11);
            var32.accept(var1.visitTypeAnnotation(var32.typeRef, var32.typePath, var32.desc, true));
         }
      }

      if (this.invisibleTypeAnnotations != null) {
         int var12 = 0;

         for (int var23 = this.invisibleTypeAnnotations.size(); var12 < var23; var12++) {
            TypeAnnotationNode var33 = this.invisibleTypeAnnotations.get(var12);
            var33.accept(var1.visitTypeAnnotation(var33.typeRef, var33.typePath, var33.desc, false));
         }
      }

      if (this.visibleAnnotableParameterCount > 0) {
         var1.visitAnnotableParameterCount(this.visibleAnnotableParameterCount, true);
      }

      if (this.visibleParameterAnnotations != null) {
         int var13 = 0;

         for (int var24 = this.visibleParameterAnnotations.length; var13 < var24; var13++) {
            List var34 = this.visibleParameterAnnotations[var13];
            if (var34 != null) {
               int var5 = 0;

               for (int var6 = var34.size(); var5 < var6; var5++) {
                  AnnotationNode var7 = (AnnotationNode)var34.get(var5);
                  var7.accept(var1.visitParameterAnnotation(var13, var7.desc, true));
               }
            }
         }
      }

      if (this.invisibleAnnotableParameterCount > 0) {
         var1.visitAnnotableParameterCount(this.invisibleAnnotableParameterCount, false);
      }

      if (this.invisibleParameterAnnotations != null) {
         int var14 = 0;

         for (int var25 = this.invisibleParameterAnnotations.length; var14 < var25; var14++) {
            List var35 = this.invisibleParameterAnnotations[var14];
            if (var35 != null) {
               int var36 = 0;

               for (int var37 = var35.size(); var36 < var37; var36++) {
                  AnnotationNode var38 = (AnnotationNode)var35.get(var36);
                  var38.accept(var1.visitParameterAnnotation(var14, var38.desc, false));
               }
            }
         }
      }

      if (this.visited) {
         this.instructions.resetLabels();
      }

      if (this.attrs != null) {
         int var15 = 0;

         for (int var26 = this.attrs.size(); var15 < var26; var15++) {
            var1.visitAttribute(this.attrs.get(var15));
         }
      }

      if (this.instructions.size() > 0) {
         var1.visitCode();
         if (this.tryCatchBlocks != null) {
            int var16 = 0;

            for (int var27 = this.tryCatchBlocks.size(); var16 < var27; var16++) {
               this.tryCatchBlocks.get(var16).updateIndex(var16);
               this.tryCatchBlocks.get(var16).accept(var1);
            }
         }

         this.instructions.accept(var1);
         if (this.localVariables != null) {
            int var17 = 0;

            for (int var28 = this.localVariables.size(); var17 < var28; var17++) {
               this.localVariables.get(var17).accept(var1);
            }
         }

         if (this.visibleLocalVariableAnnotations != null) {
            int var18 = 0;

            for (int var29 = this.visibleLocalVariableAnnotations.size(); var18 < var29; var18++) {
               this.visibleLocalVariableAnnotations.get(var18).accept(var1, true);
            }
         }

         if (this.invisibleLocalVariableAnnotations != null) {
            int var19 = 0;

            for (int var30 = this.invisibleLocalVariableAnnotations.size(); var19 < var30; var19++) {
               this.invisibleLocalVariableAnnotations.get(var19).accept(var1, false);
            }
         }

         var1.visitMaxs(this.maxStack, this.maxLocals);
         this.visited = true;
      }

      var1.visitEnd();
   }
}
