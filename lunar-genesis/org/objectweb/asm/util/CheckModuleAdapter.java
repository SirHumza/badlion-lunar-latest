package org.objectweb.asm.util;

import java.util.HashSet;
import org.objectweb.asm.ModuleVisitor;

public class CheckModuleAdapter extends ModuleVisitor {
   private final boolean isOpen;
   private final CheckModuleAdapter.NameSet requiredModules = new CheckModuleAdapter.NameSet("Modules requires");
   private final CheckModuleAdapter.NameSet exportedPackages = new CheckModuleAdapter.NameSet("Module exports");
   private final CheckModuleAdapter.NameSet openedPackages = new CheckModuleAdapter.NameSet("Module opens");
   private final CheckModuleAdapter.NameSet usedServices = new CheckModuleAdapter.NameSet("Module uses");
   private final CheckModuleAdapter.NameSet providedServices = new CheckModuleAdapter.NameSet("Module provides");
   int classVersion;
   private boolean visitEndCalled;

   public CheckModuleAdapter(ModuleVisitor var1, boolean var2) {
      this(589824, var1, var2);
      if (this.getClass() != CheckModuleAdapter.class) {
         throw new IllegalStateException();
      }
   }

   protected CheckModuleAdapter(int var1, ModuleVisitor var2, boolean var3) {
      super(var1, var2);
      this.isOpen = var3;
   }

   @Override
   public void visitMainClass(String var1) {
      CheckMethodAdapter.checkInternalName(53, var1, "module main class");
      super.visitMainClass(var1);
   }

   @Override
   public void visitPackage(String var1) {
      CheckMethodAdapter.checkInternalName(53, var1, "module package");
      super.visitPackage(var1);
   }

   @Override
   public void visitRequire(String var1, int var2, String var3) {
      this.checkVisitEndNotCalled();
      CheckClassAdapter.checkFullyQualifiedName(53, var1, "required module");
      this.requiredModules.checkNameNotAlreadyDeclared(var1);
      CheckClassAdapter.checkAccess(var2, 36960);
      if (this.classVersion >= 54 && var1.equals("java.base") && (var2 & 96) != 0) {
         throw new IllegalArgumentException(stringConcat$0(var2));
      }

      super.visitRequire(var1, var2, var3);
   }

   @Override
   public void visitExport(String var1, int var2, String... var3) {
      this.checkVisitEndNotCalled();
      CheckMethodAdapter.checkInternalName(53, var1, "package name");
      this.exportedPackages.checkNameNotAlreadyDeclared(var1);
      CheckClassAdapter.checkAccess(var2, 36864);
      if (var3 != null) {
         for (String var7 : var3) {
            CheckClassAdapter.checkFullyQualifiedName(53, var7, "module export to");
         }
      }

      super.visitExport(var1, var2, var3);
   }

   @Override
   public void visitOpen(String var1, int var2, String... var3) {
      this.checkVisitEndNotCalled();
      if (this.isOpen) {
         throw new UnsupportedOperationException("An open module can not use open directive");
      }

      CheckMethodAdapter.checkInternalName(53, var1, "package name");
      this.openedPackages.checkNameNotAlreadyDeclared(var1);
      CheckClassAdapter.checkAccess(var2, 36864);
      if (var3 != null) {
         for (String var7 : var3) {
            CheckClassAdapter.checkFullyQualifiedName(53, var7, "module open to");
         }
      }

      super.visitOpen(var1, var2, var3);
   }

   @Override
   public void visitUse(String var1) {
      this.checkVisitEndNotCalled();
      CheckMethodAdapter.checkInternalName(53, var1, "service");
      this.usedServices.checkNameNotAlreadyDeclared(var1);
      super.visitUse(var1);
   }

   @Override
   public void visitProvide(String var1, String... var2) {
      this.checkVisitEndNotCalled();
      CheckMethodAdapter.checkInternalName(53, var1, "service");
      this.providedServices.checkNameNotAlreadyDeclared(var1);
      if (var2 != null && var2.length != 0) {
         for (String var6 : var2) {
            CheckMethodAdapter.checkInternalName(53, var6, "provider");
         }

         super.visitProvide(var1, var2);
      } else {
         throw new IllegalArgumentException("Providers cannot be null or empty");
      }
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

   private static class NameSet {
      private final String type;
      private final HashSet<String> names;

      NameSet(String var1) {
         this.type = var1;
         this.names = new HashSet<>();
      }

      void checkNameNotAlreadyDeclared(String var1) {
         if (!this.names.add(var1)) {
            throw new IllegalArgumentException(stringConcat$0(this.type, var1));
         }
      }
   }
}
