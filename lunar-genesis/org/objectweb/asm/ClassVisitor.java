package org.objectweb.asm;

public abstract class ClassVisitor {
   protected final int api;
   protected ClassVisitor cv;

   protected ClassVisitor(int var1) {
      this(var1, null);
   }

   protected ClassVisitor(int var1, ClassVisitor var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException(stringConcat$0(var1));
      }

      if (var1 == 17432576) {
         Constants.checkAsmExperimental(this);
      }

      this.api = var1;
      this.cv = var2;
   }

   public ClassVisitor getDelegate() {
      return this.cv;
   }

   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      if (this.api < 524288 && (var2 & 65536) != 0) {
         throw new UnsupportedOperationException("Records requires ASM8");
      }

      if (this.cv != null) {
         this.cv.visit(var1, var2, var3, var4, var5, var6);
      }
   }

   public void visitSource(String var1, String var2) {
      if (this.cv != null) {
         this.cv.visitSource(var1, var2);
      }
   }

   public ModuleVisitor visitModule(String var1, int var2, String var3) {
      if (this.api < 393216) {
         throw new UnsupportedOperationException("Module requires ASM6");
      } else {
         return this.cv != null ? this.cv.visitModule(var1, var2, var3) : null;
      }
   }

   public void visitNestHost(String var1) {
      if (this.api < 458752) {
         throw new UnsupportedOperationException("NestHost requires ASM7");
      }

      if (this.cv != null) {
         this.cv.visitNestHost(var1);
      }
   }

   public void visitOuterClass(String var1, String var2, String var3) {
      if (this.cv != null) {
         this.cv.visitOuterClass(var1, var2, var3);
      }
   }

   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      return this.cv != null ? this.cv.visitAnnotation(var1, var2) : null;
   }

   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      if (this.api < 327680) {
         throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
      } else {
         return this.cv != null ? this.cv.visitTypeAnnotation(var1, var2, var3, var4) : null;
      }
   }

   public void visitAttribute(Attribute var1) {
      if (this.cv != null) {
         this.cv.visitAttribute(var1);
      }
   }

   public void visitNestMember(String var1) {
      if (this.api < 458752) {
         throw new UnsupportedOperationException("NestMember requires ASM7");
      }

      if (this.cv != null) {
         this.cv.visitNestMember(var1);
      }
   }

   public void visitPermittedSubclass(String var1) {
      if (this.api < 589824) {
         throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
      }

      if (this.cv != null) {
         this.cv.visitPermittedSubclass(var1);
      }
   }

   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      if (this.cv != null) {
         this.cv.visitInnerClass(var1, var2, var3, var4);
      }
   }

   public RecordComponentVisitor visitRecordComponent(String var1, String var2, String var3) {
      if (this.api < 524288) {
         throw new UnsupportedOperationException("Record requires ASM8");
      } else {
         return this.cv != null ? this.cv.visitRecordComponent(var1, var2, var3) : null;
      }
   }

   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      return this.cv != null ? this.cv.visitField(var1, var2, var3, var4, var5) : null;
   }

   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      return this.cv != null ? this.cv.visitMethod(var1, var2, var3, var4, var5) : null;
   }

   public void visitEnd() {
      if (this.cv != null) {
         this.cv.visitEnd();
      }
   }
}
