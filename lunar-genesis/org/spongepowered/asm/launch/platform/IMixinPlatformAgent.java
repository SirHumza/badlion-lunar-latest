package org.spongepowered.asm.launch.platform;

import org.spongepowered.asm.launch.platform.container.IContainerHandle;

public interface IMixinPlatformAgent {
   IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager var1, IContainerHandle var2);

   String getPhaseProvider();

   void prepare();

   void initPrimaryContainer();

   void inject();

   enum AcceptResult {
      ACCEPTED,
      REJECTED,
      INVALID;
   }
}
