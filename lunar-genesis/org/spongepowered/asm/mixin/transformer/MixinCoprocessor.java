package org.spongepowered.asm.mixin.transformer;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.service.MixinService;

abstract class MixinCoprocessor implements MixinConfig.IListener {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private boolean willLogUnimplementedCouldTransform = true;

   abstract String getName();

   @Override
   public void onPrepare(MixinInfo var1) {
   }

   @Override
   public void onInit(MixinInfo var1) {
   }

   MixinCoprocessor.ProcessResult process(String var1, ClassNode var2) {
      return MixinCoprocessor.ProcessResult.NONE;
   }

   public boolean couldTransform(String var1) {
      if (this.willLogUnimplementedCouldTransform) {
         this.willLogUnimplementedCouldTransform = false;
         logger.error(
            "MixinCoprocessor {} ({}) does not implement couldTransform, which may lead to unnecessary transformation",
            this.getName(),
            this.getClass().getName()
         );
      }

      return true;
   }

   boolean postProcess(String var1, ClassNode var2) {
      return false;
   }

   enum ProcessResult {
      NONE(false, false),
      TRANSFORMED(false, true),
      PASSTHROUGH_NONE(true, false),
      PASSTHROUGH_TRANSFORMED(true, true);

      private boolean passthrough;
      private boolean transformed;

      ProcessResult(boolean var3, boolean var4) {
         this.passthrough = var3;
         this.transformed = var4;
      }

      boolean isPassthrough() {
         return this.passthrough;
      }

      boolean isTransformed() {
         return this.transformed;
      }

      MixinCoprocessor.ProcessResult with(MixinCoprocessor.ProcessResult var1) {
         return var1 == this ? this : of(this.passthrough || var1.passthrough, this.transformed || var1.transformed);
      }

      static MixinCoprocessor.ProcessResult of(boolean var0, boolean var1) {
         if (var0) {
            return var1 ? PASSTHROUGH_TRANSFORMED : PASSTHROUGH_NONE;
         } else {
            return var1 ? TRANSFORMED : NONE;
         }
      }
   }
}
