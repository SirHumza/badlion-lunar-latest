package org.objectweb.asm.util;

import java.io.PrintWriter;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.ModuleVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

public final class TraceClassVisitor extends ClassVisitor {
   private final PrintWriter printWriter;
   public final Printer p;

   public TraceClassVisitor(PrintWriter var1) {
      this(null, var1);
   }

   public TraceClassVisitor(ClassVisitor var1, PrintWriter var2) {
      this(var1, new Textifier(), var2);
   }

   public TraceClassVisitor(ClassVisitor var1, Printer var2, PrintWriter var3) {
      super(589824, var1);
      this.printWriter = var3;
      this.p = var2;
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.p.visit(var1, var2, var3, var4, var5, var6);
      super.visit(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void visitSource(String var1, String var2) {
      this.p.visitSource(var1, var2);
      super.visitSource(var1, var2);
   }

   @Override
   public ModuleVisitor visitModule(String var1, int var2, String var3) {
      Printer var4 = this.p.visitModule(var1, var2, var3);
      return new TraceModuleVisitor(super.visitModule(var1, var2, var3), var4);
   }

   @Override
   public void visitNestHost(String var1) {
      this.p.visitNestHost(var1);
      super.visitNestHost(var1);
   }

   @Override
   public void visitOuterClass(String var1, String var2, String var3) {
      this.p.visitOuterClass(var1, var2, var3);
      super.visitOuterClass(var1, var2, var3);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      Printer var3 = this.p.visitClassAnnotation(var1, var2);
      return new TraceAnnotationVisitor(super.visitAnnotation(var1, var2), var3);
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      Printer var5 = this.p.visitClassTypeAnnotation(var1, var2, var3, var4);
      return new TraceAnnotationVisitor(super.visitTypeAnnotation(var1, var2, var3, var4), var5);
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.p.visitClassAttribute(var1);
      super.visitAttribute(var1);
   }

   @Override
   public void visitNestMember(String var1) {
      this.p.visitNestMember(var1);
      super.visitNestMember(var1);
   }

   @Override
   public void visitPermittedSubclass(String var1) {
      this.p.visitPermittedSubclass(var1);
      super.visitPermittedSubclass(var1);
   }

   @Override
   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      this.p.visitInnerClass(var1, var2, var3, var4);
      super.visitInnerClass(var1, var2, var3, var4);
   }

   @Override
   public RecordComponentVisitor visitRecordComponent(String var1, String var2, String var3) {
      Printer var4 = this.p.visitRecordComponent(var1, var2, var3);
      return new TraceRecordComponentVisitor(super.visitRecordComponent(var1, var2, var3), var4);
   }

   @Override
   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      Printer var6 = this.p.visitField(var1, var2, var3, var4, var5);
      return new TraceFieldVisitor(super.visitField(var1, var2, var3, var4, var5), var6);
   }

   @Override
   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      Printer var6 = this.p.visitMethod(var1, var2, var3, var4, var5);
      return new TraceMethodVisitor(super.visitMethod(var1, var2, var3, var4, var5), var6);
   }

   @Override
   public void visitEnd() {
      this.p.visitClassEnd();
      if (this.printWriter != null) {
         this.p.print(this.printWriter);
         this.printWriter.flush();
      }

      super.visitEnd();
   }
}
