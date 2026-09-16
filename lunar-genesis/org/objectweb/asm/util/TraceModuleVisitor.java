package org.objectweb.asm.util;

import org.objectweb.asm.ModuleVisitor;

public final class TraceModuleVisitor extends ModuleVisitor {
   public final Printer p;

   public TraceModuleVisitor(Printer var1) {
      this(null, var1);
   }

   public TraceModuleVisitor(ModuleVisitor var1, Printer var2) {
      super(589824, var1);
      this.p = var2;
   }

   @Override
   public void visitMainClass(String var1) {
      this.p.visitMainClass(var1);
      super.visitMainClass(var1);
   }

   @Override
   public void visitPackage(String var1) {
      this.p.visitPackage(var1);
      super.visitPackage(var1);
   }

   @Override
   public void visitRequire(String var1, int var2, String var3) {
      this.p.visitRequire(var1, var2, var3);
      super.visitRequire(var1, var2, var3);
   }

   @Override
   public void visitExport(String var1, int var2, String... var3) {
      this.p.visitExport(var1, var2, var3);
      super.visitExport(var1, var2, var3);
   }

   @Override
   public void visitOpen(String var1, int var2, String... var3) {
      this.p.visitOpen(var1, var2, var3);
      super.visitOpen(var1, var2, var3);
   }

   @Override
   public void visitUse(String var1) {
      this.p.visitUse(var1);
      super.visitUse(var1);
   }

   @Override
   public void visitProvide(String var1, String... var2) {
      this.p.visitProvide(var1, var2);
      super.visitProvide(var1, var2);
   }

   @Override
   public void visitEnd() {
      this.p.visitModuleEnd();
      super.visitEnd();
   }
}
