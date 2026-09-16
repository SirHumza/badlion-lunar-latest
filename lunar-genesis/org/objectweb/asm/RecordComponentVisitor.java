package org.objectweb.asm;

public abstract class RecordComponentVisitor {
   protected final int api;
   protected RecordComponentVisitor delegate;

   protected RecordComponentVisitor(int var1) {
      this(var1, null);
   }

   protected RecordComponentVisitor(int var1, RecordComponentVisitor var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException(stringConcat$0(var1));
      }

      if (var1 == 17432576) {
         Constants.checkAsmExperimental(this);
      }

      this.api = var1;
      this.delegate = var2;
   }

   public RecordComponentVisitor getDelegate() {
      return this.delegate;
   }

   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      return this.delegate != null ? this.delegate.visitAnnotation(var1, var2) : null;
   }

   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.delegate != null ? this.delegate.visitTypeAnnotation(var1, var2, var3, var4) : null;
   }

   public void visitAttribute(Attribute var1) {
      if (this.delegate != null) {
         this.delegate.visitAttribute(var1);
      }
   }

   public void visitEnd() {
      if (this.delegate != null) {
         this.delegate.visitEnd();
      }
   }
}
