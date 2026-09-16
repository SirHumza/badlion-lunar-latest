package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.TypeReference;

public class CheckFieldAdapter extends FieldVisitor {
   private boolean visitEndCalled;

   public CheckFieldAdapter(FieldVisitor var1) {
      this(589824, var1);
      if (this.getClass() != CheckFieldAdapter.class) {
         throw new IllegalStateException();
      }
   }

   protected CheckFieldAdapter(int var1, FieldVisitor var2) {
      super(var1, var2);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      this.checkVisitEndNotCalled();
      CheckMethodAdapter.checkDescriptor(49, var1, false);
      return new CheckAnnotationAdapter(super.visitAnnotation(var1, var2));
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.checkVisitEndNotCalled();
      int var5 = new TypeReference(var1).getSort();
      if (var5 != 19) {
         throw new IllegalArgumentException(stringConcat$0(Integer.toHexString(var5)));
      }

      CheckClassAdapter.checkTypeRef(var1);
      CheckMethodAdapter.checkDescriptor(49, var3, false);
      return new CheckAnnotationAdapter(super.visitTypeAnnotation(var1, var2, var3, var4));
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.checkVisitEndNotCalled();
      if (var1 == null) {
         throw new IllegalArgumentException("Invalid attribute (must not be null)");
      }

      super.visitAttribute(var1);
   }

   @Override
   public void visitEnd() {
      this.checkVisitEndNotCalled();
      this.visitEndCalled = true;
      super.visitEnd();
   }

   private void checkVisitEndNotCalled() {
      if (this.visitEndCalled) {
         throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
      }
   }
}
