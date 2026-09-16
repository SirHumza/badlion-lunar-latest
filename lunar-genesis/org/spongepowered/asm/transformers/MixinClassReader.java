package org.spongepowered.asm.transformers;

import org.objectweb.asm.ClassReader;
import org.spongepowered.asm.util.asm.ASM;

public class MixinClassReader extends ClassReader {
   public MixinClassReader(byte[] var1, String var2) {
      super(checkClassVersion(var1, var2));
   }

   private static byte[] checkClassVersion(byte[] var0, String var1) {
      short var2 = (short)((var0[6] & 255) << 8 | var0[7] & 0xFF);
      if (var2 > ASM.getMaxSupportedClassVersionMajor()) {
         throw new IllegalArgumentException(
            String.format(
               "Class file major version %d is not supported by active ASM (version %d.%d supports class version %d), reading %s",
               var2,
               ASM.getApiVersionMajor(),
               ASM.getApiVersionMinor(),
               ASM.getMaxSupportedClassVersionMajor(),
               var1
            )
         );
      } else {
         return var0;
      }
   }
}
