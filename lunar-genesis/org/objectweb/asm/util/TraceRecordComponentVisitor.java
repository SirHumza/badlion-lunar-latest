package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

public final class TraceRecordComponentVisitor extends RecordComponentVisitor {
   public final Printer printer;

   public TraceRecordComponentVisitor(Printer var1) {
      this(null, var1);
   }

   public TraceRecordComponentVisitor(RecordComponentVisitor var1, Printer var2) {
      super(589824, var1);
      this.printer = var2;
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      Printer var3 = this.printer.visitRecordComponentAnnotation(var1, var2);
      return new TraceAnnotationVisitor(super.visitAnnotation(var1, var2), var3);
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      Printer var5 = this.printer.visitRecordComponentTypeAnnotation(var1, var2, var3, var4);
      return new TraceAnnotationVisitor(super.visitTypeAnnotation(var1, var2, var3, var4), var5);
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.printer.visitRecordComponentAttribute(var1);
      super.visitAttribute(var1);
   }

   @Override
   public void visitEnd() {
      this.printer.visitRecordComponentEnd();
      super.visitEnd();
   }
}
