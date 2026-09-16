package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;

public final class TraceMethodVisitor extends MethodVisitor {
   public final Printer p;

   public TraceMethodVisitor(Printer var1) {
      this(null, var1);
   }

   public TraceMethodVisitor(MethodVisitor var1, Printer var2) {
      super(589824, var1);
      this.p = var2;
   }

   @Override
   public void visitParameter(String var1, int var2) {
      this.p.visitParameter(var1, var2);
      super.visitParameter(var1, var2);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      Printer var3 = this.p.visitMethodAnnotation(var1, var2);
      return new TraceAnnotationVisitor(super.visitAnnotation(var1, var2), var3);
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      Printer var5 = this.p.visitMethodTypeAnnotation(var1, var2, var3, var4);
      return new TraceAnnotationVisitor(super.visitTypeAnnotation(var1, var2, var3, var4), var5);
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.p.visitMethodAttribute(var1);
      super.visitAttribute(var1);
   }

   @Override
   public AnnotationVisitor visitAnnotationDefault() {
      Printer var1 = this.p.visitAnnotationDefault();
      return new TraceAnnotationVisitor(super.visitAnnotationDefault(), var1);
   }

   @Override
   public void visitAnnotableParameterCount(int var1, boolean var2) {
      this.p.visitAnnotableParameterCount(var1, var2);
      super.visitAnnotableParameterCount(var1, var2);
   }

   @Override
   public AnnotationVisitor visitParameterAnnotation(int var1, String var2, boolean var3) {
      Printer var4 = this.p.visitParameterAnnotation(var1, var2, var3);
      return new TraceAnnotationVisitor(super.visitParameterAnnotation(var1, var2, var3), var4);
   }

   @Override
   public void visitCode() {
      this.p.visitCode();
      super.visitCode();
   }

   @Override
   public void visitFrame(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      this.p.visitFrame(var1, var2, var3, var4, var5);
      super.visitFrame(var1, var2, var3, var4, var5);
   }

   @Override
   public void visitInsn(int var1) {
      this.p.visitInsn(var1);
      super.visitInsn(var1);
   }

   @Override
   public void visitIntInsn(int var1, int var2) {
      this.p.visitIntInsn(var1, var2);
      super.visitIntInsn(var1, var2);
   }

   @Override
   public void visitVarInsn(int var1, int var2) {
      this.p.visitVarInsn(var1, var2);
      super.visitVarInsn(var1, var2);
   }

   @Override
   public void visitTypeInsn(int var1, String var2) {
      this.p.visitTypeInsn(var1, var2);
      super.visitTypeInsn(var1, var2);
   }

   @Override
   public void visitFieldInsn(int var1, String var2, String var3, String var4) {
      this.p.visitFieldInsn(var1, var2, var3, var4);
      super.visitFieldInsn(var1, var2, var3, var4);
   }

   @Override
   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.p.api < 327680) {
         if (var5 != (var1 == 185)) {
            throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM5");
         }

         this.p.visitMethodInsn(var1, var2, var3, var4);
      } else {
         this.p.visitMethodInsn(var1, var2, var3, var4, var5);
      }

      if (this.mv != null) {
         this.mv.visitMethodInsn(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
      this.p.visitInvokeDynamicInsn(var1, var2, var3, var4);
      super.visitInvokeDynamicInsn(var1, var2, var3, var4);
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      this.p.visitJumpInsn(var1, var2);
      super.visitJumpInsn(var1, var2);
   }

   @Override
   public void visitLabel(Label var1) {
      this.p.visitLabel(var1);
      super.visitLabel(var1);
   }

   @Override
   public void visitLdcInsn(Object var1) {
      this.p.visitLdcInsn(var1);
      super.visitLdcInsn(var1);
   }

   @Override
   public void visitIincInsn(int var1, int var2) {
      this.p.visitIincInsn(var1, var2);
      super.visitIincInsn(var1, var2);
   }

   @Override
   public void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4) {
      this.p.visitTableSwitchInsn(var1, var2, var3, var4);
      super.visitTableSwitchInsn(var1, var2, var3, var4);
   }

   @Override
   public void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3) {
      this.p.visitLookupSwitchInsn(var1, var2, var3);
      super.visitLookupSwitchInsn(var1, var2, var3);
   }

   @Override
   public void visitMultiANewArrayInsn(String var1, int var2) {
      this.p.visitMultiANewArrayInsn(var1, var2);
      super.visitMultiANewArrayInsn(var1, var2);
   }

   @Override
   public AnnotationVisitor visitInsnAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      Printer var5 = this.p.visitInsnAnnotation(var1, var2, var3, var4);
      return new TraceAnnotationVisitor(super.visitInsnAnnotation(var1, var2, var3, var4), var5);
   }

   @Override
   public void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4) {
      this.p.visitTryCatchBlock(var1, var2, var3, var4);
      super.visitTryCatchBlock(var1, var2, var3, var4);
   }

   @Override
   public AnnotationVisitor visitTryCatchAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      Printer var5 = this.p.visitTryCatchAnnotation(var1, var2, var3, var4);
      return new TraceAnnotationVisitor(super.visitTryCatchAnnotation(var1, var2, var3, var4), var5);
   }

   @Override
   public void visitLocalVariable(String var1, String var2, String var3, Label var4, Label var5, int var6) {
      this.p.visitLocalVariable(var1, var2, var3, var4, var5, var6);
      super.visitLocalVariable(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public AnnotationVisitor visitLocalVariableAnnotation(int var1, TypePath var2, Label[] var3, Label[] var4, int[] var5, String var6, boolean var7) {
      Printer var8 = this.p.visitLocalVariableAnnotation(var1, var2, var3, var4, var5, var6, var7);
      return new TraceAnnotationVisitor(super.visitLocalVariableAnnotation(var1, var2, var3, var4, var5, var6, var7), var8);
   }

   @Override
   public void visitLineNumber(int var1, Label var2) {
      this.p.visitLineNumber(var1, var2);
      super.visitLineNumber(var1, var2);
   }

   @Override
   public void visitMaxs(int var1, int var2) {
      this.p.visitMaxs(var1, var2);
      super.visitMaxs(var1, var2);
   }

   @Override
   public void visitEnd() {
      this.p.visitMethodEnd();
      super.visitEnd();
   }
}
