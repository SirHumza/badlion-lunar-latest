package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.TypePath;

public final class TraceFieldVisitor extends FieldVisitor {
   public final Printer p;

   public TraceFieldVisitor(Printer var1) {
      this(null, var1);
   }

   public TraceFieldVisitor(FieldVisitor var1, Printer var2) {
      super(589824, var1);
      this.p = var2;
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      Printer var3 = this.p.visitFieldAnnotation(var1, var2);
      return new TraceAnnotationVisitor(super.visitAnnotation(var1, var2), var3);
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      Printer var5 = this.p.visitFieldTypeAnnotation(var1, var2, var3, var4);
      return new TraceAnnotationVisitor(super.visitTypeAnnotation(var1, var2, var3, var4), var5);
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.p.visitFieldAttribute(var1);
      super.visitAttribute(var1);
   }

   @Override
   public void visitEnd() {
      this.p.visitFieldEnd();
      super.visitEnd();
   }
}
