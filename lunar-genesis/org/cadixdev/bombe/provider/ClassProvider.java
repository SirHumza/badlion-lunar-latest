package org.cadixdev.bombe.provider;

import java.util.jar.JarFile;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

@FunctionalInterface
public interface ClassProvider {
   static ClassProvider of(ClassLoader var0) {
      return new ClassLoaderClassProvider(var0);
   }

   static ClassProvider of(JarFile var0) {
      return new JarFileClassProvider(var0);
   }

   byte[] get(String var1);

   default ClassNode getAsNode(String var1, int var2) {
      byte[] var3 = this.get(var1);
      if (var3 == null) {
         return null;
      }

      ClassReader var4 = new ClassReader(var3);
      ClassNode var5 = new ClassNode();
      var4.accept(var5, var2);
      return var5;
   }

   default ClassNode getAsNode(String var1) {
      return this.getAsNode(var1, 0);
   }
}
