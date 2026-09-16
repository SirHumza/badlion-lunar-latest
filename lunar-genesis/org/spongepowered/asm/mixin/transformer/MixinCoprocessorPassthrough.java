package org.spongepowered.asm.mixin.transformer;

import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;

class MixinCoprocessorPassthrough extends MixinCoprocessor {
   private final Set<String> loadable = new HashSet<>();

   @Override
   String getName() {
      return "passthrough";
   }

   @Override
   public void onPrepare(MixinInfo var1) {
      if (var1.isLoadable()) {
         this.registerLoadable(var1.getClassName());
      }
   }

   void registerLoadable(String var1) {
      this.loadable.add(var1);
   }

   @Override
   MixinCoprocessor.ProcessResult process(String var1, ClassNode var2) {
      return this.loadable.contains(var1) ? MixinCoprocessor.ProcessResult.PASSTHROUGH_NONE : MixinCoprocessor.ProcessResult.NONE;
   }

   @Override
   public boolean couldTransform(String var1) {
      return false;
   }
}
