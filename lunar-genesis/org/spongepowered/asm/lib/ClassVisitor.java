package org.spongepowered.asm.lib;

import org.spongepowered.asm.mixin.throwables.CompanionPluginError;

public abstract class ClassVisitor {
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      throw new CompanionPluginError("ClassVisitor.visit");
   }

   public void visitSource(String var1, String var2) {
      throw new CompanionPluginError("ClassVisitor.visitSource");
   }

   public void visitOuterClass(String var1, String var2, String var3) {
      throw new CompanionPluginError("ClassVisitor.visitOuterClass");
   }

   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      throw new CompanionPluginError("ClassVisitor.visitAnnotation");
   }

   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new CompanionPluginError("ClassVisitor.visitTypeAnnotation");
   }

   public void visitAttribute(Attribute var1) {
      throw new CompanionPluginError("ClassVisitor.visitAttribute");
   }

   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      throw new CompanionPluginError("ClassVisitor.visitInnerClass");
   }

   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      throw new CompanionPluginError("ClassVisitor.visitField");
   }

   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      throw new CompanionPluginError("ClassVisitor.visitMethod");
   }

   public void visitEnd() {
      throw new CompanionPluginError("ClassVisitor.visitEnd");
   }
}
