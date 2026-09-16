package org.objectweb.asm.commons;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

public final class ModuleResolutionAttribute extends Attribute {
   public static final int RESOLUTION_DO_NOT_RESOLVE_BY_DEFAULT = 1;
   public static final int RESOLUTION_WARN_DEPRECATED = 2;
   public static final int RESOLUTION_WARN_DEPRECATED_FOR_REMOVAL = 4;
   public static final int RESOLUTION_WARN_INCUBATING = 8;
   public int resolution;

   public ModuleResolutionAttribute(int var1) {
      super("ModuleResolution");
      this.resolution = var1;
   }

   public ModuleResolutionAttribute() {
      this(0);
   }

   @Override
   protected Attribute read(ClassReader var1, int var2, int var3, char[] var4, int var5, Label[] var6) {
      return new ModuleResolutionAttribute(var1.readUnsignedShort(var2));
   }

   @Override
   protected ByteVector write(ClassWriter var1, byte[] var2, int var3, int var4, int var5) {
      ByteVector var6 = new ByteVector();
      var6.putShort(this.resolution);
      return var6;
   }
}
