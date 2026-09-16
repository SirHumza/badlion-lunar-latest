package org.spongepowered.asm.launch;

import java.io.File;
import java.util.List;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.platform.CommandLineOptions;

public class MixinTweaker implements ITweaker {
   public MixinTweaker() {
      MixinBootstrap.start();
   }

   @Override
   public final void acceptOptions(List<String> var1, File var2, File var3, String var4) {
      MixinBootstrap.doInit(CommandLineOptions.ofArgs(var1));
   }

   @Override
   public final void injectIntoClassLoader(LaunchClassLoader var1) {
      MixinBootstrap.inject();
   }

   @Override
   public String getLaunchTarget() {
      return MixinBootstrap.getPlatform().getLaunchTarget();
   }

   @Override
   public String[] getLaunchArguments() {
      return new String[0];
   }
}
