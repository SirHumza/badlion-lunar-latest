package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.util.perf.Profiler;

class MixinCoprocessors extends ArrayList<MixinCoprocessor> {
   private final Profiler profiler = Profiler.getProfiler("mixin");

   MixinCoprocessor.ProcessResult process(String var1, ClassNode var2) {
      Profiler.Section var3 = this.profiler.begin("coprocessor");
      MixinCoprocessor.ProcessResult var4 = MixinCoprocessor.ProcessResult.NONE;

      for (MixinCoprocessor var6 : this) {
         var4 = var6.process(var1, var2).with(var4);
      }

      var3.end();
      return var4;
   }

   public boolean processingCouldTransform(String var1) {
      for (MixinCoprocessor var3 : this) {
         if (var3.couldTransform(var1)) {
            return true;
         }
      }

      return false;
   }

   boolean postProcess(String var1, ClassNode var2) {
      Profiler.Section var3 = this.profiler.begin("coprocessor");
      boolean var4 = false;

      for (MixinCoprocessor var6 : this) {
         var4 |= var6.postProcess(var1, var2);
      }

      var3.end();
      return var4;
   }
}
