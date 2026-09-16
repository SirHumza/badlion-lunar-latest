package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ModuleVisitor;

public class ModuleNode extends ModuleVisitor {
   public String name;
   public int access;
   public String version;
   public String mainClass;
   public List<String> packages;
   public List<ModuleRequireNode> requires;
   public List<ModuleExportNode> exports;
   public List<ModuleOpenNode> opens;
   public List<String> uses;
   public List<ModuleProvideNode> provides;

   public ModuleNode(String var1, int var2, String var3) {
      super(589824);
      if (this.getClass() != ModuleNode.class) {
         throw new IllegalStateException();
      }

      this.name = var1;
      this.access = var2;
      this.version = var3;
   }

   public ModuleNode(
      int var1,
      String var2,
      int var3,
      String var4,
      List<ModuleRequireNode> var5,
      List<ModuleExportNode> var6,
      List<ModuleOpenNode> var7,
      List<String> var8,
      List<ModuleProvideNode> var9
   ) {
      super(var1);
      this.name = var2;
      this.access = var3;
      this.version = var4;
      this.requires = var5;
      this.exports = var6;
      this.opens = var7;
      this.uses = var8;
      this.provides = var9;
   }

   @Override
   public void visitMainClass(String var1) {
      this.mainClass = var1;
   }

   @Override
   public void visitPackage(String var1) {
      if (this.packages == null) {
         this.packages = new ArrayList<>(5);
      }

      this.packages.add(var1);
   }

   @Override
   public void visitRequire(String var1, int var2, String var3) {
      if (this.requires == null) {
         this.requires = new ArrayList<>(5);
      }

      this.requires.add(new ModuleRequireNode(var1, var2, var3));
   }

   @Override
   public void visitExport(String var1, int var2, String... var3) {
      if (this.exports == null) {
         this.exports = new ArrayList<>(5);
      }

      this.exports.add(new ModuleExportNode(var1, var2, Util.asArrayList(var3)));
   }

   @Override
   public void visitOpen(String var1, int var2, String... var3) {
      if (this.opens == null) {
         this.opens = new ArrayList<>(5);
      }

      this.opens.add(new ModuleOpenNode(var1, var2, Util.asArrayList(var3)));
   }

   @Override
   public void visitUse(String var1) {
      if (this.uses == null) {
         this.uses = new ArrayList<>(5);
      }

      this.uses.add(var1);
   }

   @Override
   public void visitProvide(String var1, String... var2) {
      if (this.provides == null) {
         this.provides = new ArrayList<>(5);
      }

      this.provides.add(new ModuleProvideNode(var1, Util.asArrayList(var2)));
   }

   @Override
   public void visitEnd() {
   }

   public void accept(ClassVisitor var1) {
      ModuleVisitor var2 = var1.visitModule(this.name, this.access, this.version);
      if (var2 != null) {
         if (this.mainClass != null) {
            var2.visitMainClass(this.mainClass);
         }

         if (this.packages != null) {
            int var3 = 0;

            for (int var4 = this.packages.size(); var3 < var4; var3++) {
               var2.visitPackage(this.packages.get(var3));
            }
         }

         if (this.requires != null) {
            int var5 = 0;

            for (int var10 = this.requires.size(); var5 < var10; var5++) {
               this.requires.get(var5).accept(var2);
            }
         }

         if (this.exports != null) {
            int var6 = 0;

            for (int var11 = this.exports.size(); var6 < var11; var6++) {
               this.exports.get(var6).accept(var2);
            }
         }

         if (this.opens != null) {
            int var7 = 0;

            for (int var12 = this.opens.size(); var7 < var12; var7++) {
               this.opens.get(var7).accept(var2);
            }
         }

         if (this.uses != null) {
            int var8 = 0;

            for (int var13 = this.uses.size(); var8 < var13; var8++) {
               var2.visitUse(this.uses.get(var8));
            }
         }

         if (this.provides != null) {
            int var9 = 0;

            for (int var14 = this.provides.size(); var9 < var14; var9++) {
               this.provides.get(var9).accept(var2);
            }
         }
      }
   }
}
