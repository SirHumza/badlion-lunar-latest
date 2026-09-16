package org.objectweb.asm.commons;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

public final class ModuleTargetAttribute extends Attribute {
   public String platform;

   public ModuleTargetAttribute(String var1) {
      super("ModuleTarget");
      this.platform = var1;
   }

   public ModuleTargetAttribute() {
      this(null);
   }

   @Override
   protected Attribute read(ClassReader var1, int var2, int var3, char[] var4, int var5, Label[] var6) {
      return new ModuleTargetAttribute(var1.readUTF8(var2, var4));
   }

   @Override
   protected ByteVector write(ClassWriter var1, byte[] var2, int var3, int var4, int var5) {
      ByteVector var6 = new ByteVector();
      var6.putShort(this.platform == null ? 0 : var1.newUTF8(this.platform));
      return var6;
   }
}
