package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Type;

public class CheckAnnotationAdapter extends AnnotationVisitor {
   private final boolean useNamedValue;
   private boolean visitEndCalled;

   public CheckAnnotationAdapter(AnnotationVisitor var1) {
      this(var1, true);
   }

   CheckAnnotationAdapter(AnnotationVisitor var1, boolean var2) {
      super(589824, var1);
      this.useNamedValue = var2;
   }

   @Override
   public void visit(String var1, Object var2) {
      this.checkVisitEndNotCalled();
      this.checkName(var1);
      if (!(var2 instanceof Byte)
         && !(var2 instanceof Boolean)
         && !(var2 instanceof Character)
         && !(var2 instanceof Short)
         && !(var2 instanceof Integer)
         && !(var2 instanceof Long)
         && !(var2 instanceof Float)
         && !(var2 instanceof Double)
         && !(var2 instanceof String)
         && !(var2 instanceof Type)
         && !(var2 instanceof byte[])
         && !(var2 instanceof boolean[])
         && !(var2 instanceof char[])
         && !(var2 instanceof short[])
         && !(var2 instanceof int[])
         && !(var2 instanceof long[])
         && !(var2 instanceof float[])
         && !(var2 instanceof double[])) {
         throw new IllegalArgumentException("Invalid annotation value");
      }

      if (var2 instanceof Type && ((Type)var2).getSort() == 11) {
         throw new IllegalArgumentException("Invalid annotation value");
      }

      super.visit(var1, var2);
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      this.checkVisitEndNotCalled();
      this.checkName(var1);
      CheckMethodAdapter.checkDescriptor(49, var2, false);
      if (var3 == null) {
         throw new IllegalArgumentException("Invalid enum value");
      }

      super.visitEnum(var1, var2, var3);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, String var2) {
      this.checkVisitEndNotCalled();
      this.checkName(var1);
      CheckMethodAdapter.checkDescriptor(49, var2, false);
      return new CheckAnnotationAdapter(super.visitAnnotation(var1, var2));
   }

   @Override
   public AnnotationVisitor visitArray(String var1) {
      this.checkVisitEndNotCalled();
      this.checkName(var1);
      return new CheckAnnotationAdapter(super.visitArray(var1), false);
   }

   @Override
   public void visitEnd() {
      this.checkVisitEndNotCalled();
      this.visitEndCalled = true;
      super.visitEnd();
   }

   private void checkName(String var1) {
      if (this.useNamedValue && var1 == null) {
         throw new IllegalArgumentException("Annotation value name must not be null");
      }
   }

   private void checkVisitEndNotCalled() {
      if (this.visitEndCalled) {
         throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
      }
   }
}
