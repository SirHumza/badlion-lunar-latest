package org.spongepowered.asm.lib.tree;

import java.util.Collections;
import java.util.List;
import org.spongepowered.asm.lib.ClassVisitor;
import org.spongepowered.asm.mixin.throwables.CompanionPluginError;

public class ClassNode extends ClassVisitor {
   public final int version;
   public final int access;
   public final String name;
   public final String signature;
   public final String superName;
   public final List<String> interfaces;
   public final String sourceFile;
   public final String sourceDebug;
   public final String outerClass;
   public final String outerMethod;
   public final String outerMethodDesc;

   public ClassNode(org.objectweb.asm.tree.ClassNode var1) {
      this.version = var1.version;
      this.access = var1.access;
      this.name = var1.name;
      this.signature = var1.signature;
      this.superName = var1.superName;
      this.interfaces = Collections.unmodifiableList(var1.interfaces);
      this.sourceFile = var1.sourceFile;
      this.sourceDebug = var1.sourceDebug;
      this.outerClass = var1.outerClass;
      this.outerMethod = var1.outerMethod;
      this.outerMethodDesc = var1.outerMethodDesc;
   }

   public void check(int var1) {
      throw new CompanionPluginError("ClassNode.check");
   }

   public void accept(ClassVisitor var1) {
      throw new CompanionPluginError("ClassNode.accept");
   }
}
