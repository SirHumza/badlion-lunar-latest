package org.spongepowered.asm.launch.platform;

import cpw.mods.modlauncher.Environment;
import cpw.mods.modlauncher.Launcher;
import cpw.mods.modlauncher.api.ILaunchHandlerService;
import cpw.mods.modlauncher.api.IEnvironment.Keys;
import cpw.mods.modlauncher.api.TypesafeMap.Key;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Locale;
import java.util.Optional;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;

public class MixinPlatformAgentMinecraftForge extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent {
   @Override
   public void init() {
   }

   @Override
   public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager var1, IContainerHandle var2) {
      return IMixinPlatformAgent.AcceptResult.REJECTED;
   }

   @Override
   public String getSideName() {
      Environment var1 = Launcher.INSTANCE.environment();
      String var2 = var1.getProperty((Key)Keys.LAUNCHTARGET.get()).orElse("missing").toLowerCase(Locale.ROOT);
      if (var2.contains("server")) {
         return "SERVER";
      }

      if (var2.contains("client")) {
         return "CLIENT";
      }

      Optional var3 = var1.findLaunchHandler(var2);
      if (var3.isPresent()) {
         ILaunchHandlerService var4 = (ILaunchHandlerService)var3.get();

         try {
            Method var5 = var4.getClass().getDeclaredMethod("getDist");
            String var6 = var5.invoke(var4).toString().toLowerCase(Locale.ROOT);
            if (var6.contains("server")) {
               return "SERVER";
            }

            if (var6.contains("client")) {
               return "CLIENT";
            }
         } catch (Exception var7) {
            return null;
         }
      }

      return null;
   }

   @Override
   public Collection<IContainerHandle> getMixinContainers() {
      return null;
   }
}
