package org.spongepowered.asm.transformers;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.service.ILegacyClassTransformer;

public abstract class TreeTransformer implements ILegacyClassTransformer {
   private ClassReader classReader;
   private ClassNode classNode;

   protected final ClassNode readClass(String var1, byte[] var2) {
      return this.readClass(var1, var2, true);
   }

   protected final ClassNode readClass(String var1, byte[] var2, boolean var3) {
      MixinClassReader var4 = new MixinClassReader(var2, var1);
      if (var3) {
         this.classReader = var4;
      }

      ClassNode var5 = new ClassNode();
      var4.accept(var5, 8);
      return var5;
   }

   protected final byte[] writeClass(ClassNode var1) {
      if (this.classReader != null && this.classNode == var1) {
         this.classNode = null;
         MixinClassWriter var3 = new MixinClassWriter(this.classReader, 3);
         this.classReader = null;
         var1.accept(var3);
         return var3.toByteArray();
      } else {
         this.classNode = null;
         MixinClassWriter var2 = new MixinClassWriter(3);
         var1.accept(var2);
         return var2.toByteArray();
      }
   }
}
