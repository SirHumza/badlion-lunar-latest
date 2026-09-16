package org.spongepowered.asm.mixin.transformer;

import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.service.ISyntheticClassRegistry;

class SyntheticClassRegistry implements ISyntheticClassRegistry {
   private final Map<String, ISyntheticClassInfo> classes = new HashMap<>();

   @Override
   public ISyntheticClassInfo findSyntheticClass(String var1) {
      return var1 == null ? null : this.classes.get(var1.replace('.', '/'));
   }

   void registerSyntheticClass(ISyntheticClassInfo var1) {
      String var2 = var1.getName();
      ISyntheticClassInfo var3 = this.classes.get(var2);
      if (var3 != null) {
         if (var3 != var1) {
            throw new MixinError(
               "Synthetic class with name " + var2 + " was already registered by " + var3.getMixin() + ". Duplicate being registered by " + var1.getMixin()
            );
         }
      } else {
         this.classes.put(var2, var1);
      }
   }
}
