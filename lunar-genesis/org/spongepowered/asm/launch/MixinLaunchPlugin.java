package org.spongepowered.asm.launch;

import cpw.mods.modlauncher.api.NamedPath;
import cpw.mods.modlauncher.serviceapi.ILaunchPluginService.ITransformerLoader;

public class MixinLaunchPlugin extends MixinLaunchPluginLegacy {
   public void initializeLaunch(ITransformerLoader var1, NamedPath[] var2) {
      this.initializeLaunch(var1);
   }
}
