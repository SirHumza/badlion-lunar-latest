package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;

public final class TraceAnnotationVisitor extends AnnotationVisitor {
   private final Printer printer;

   public TraceAnnotationVisitor(Printer var1) {
      this(null, var1);
   }

   public TraceAnnotationVisitor(AnnotationVisitor var1, Printer var2) {
      super(589824, var1);
      this.printer = var2;
   }

   @Override
   public void visit(String var1, Object var2) {
      this.printer.visit(var1, var2);
      super.visit(var1, var2);
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      this.printer.visitEnum(var1, var2, var3);
      super.visitEnum(var1, var2, var3);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, String var2) {
      Printer var3 = this.printer.visitAnnotation(var1, var2);
      return new TraceAnnotationVisitor(super.visitAnnotation(var1, var2), var3);
   }

   @Override
   public AnnotationVisitor visitArray(String var1) {
      Printer var2 = this.printer.visitArray(var1);
      return new TraceAnnotationVisitor(super.visitArray(var1), var2);
   }

   @Override
   public void visitEnd() {
      this.printer.visitAnnotationEnd();
      super.visitEnd();
   }
}
