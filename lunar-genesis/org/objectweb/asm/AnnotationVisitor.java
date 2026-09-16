package org.objectweb.asm;

public abstract class AnnotationVisitor {
   protected final int api;
   protected AnnotationVisitor av;

   protected AnnotationVisitor(int var1) {
      this(var1, null);
   }

   protected AnnotationVisitor(int var1, AnnotationVisitor var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException(stringConcat$0(var1));
      }

      if (var1 == 17432576) {
         Constants.checkAsmExperimental(this);
      }

      this.api = var1;
      this.av = var2;
   }

   public AnnotationVisitor getDelegate() {
      return this.av;
   }

   public void visit(String var1, Object var2) {
      if (this.av != null) {
         this.av.visit(var1, var2);
      }
   }

   public void visitEnum(String var1, String var2, String var3) {
      if (this.av != null) {
         this.av.visitEnum(var1, var2, var3);
      }
   }

   public AnnotationVisitor visitAnnotation(String var1, String var2) {
      return this.av != null ? this.av.visitAnnotation(var1, var2) : null;
   }

   public AnnotationVisitor visitArray(String var1) {
      return this.av != null ? this.av.visitArray(var1) : null;
   }

   public void visitEnd() {
      if (this.av != null) {
         this.av.visitEnd();
      }
   }
}
