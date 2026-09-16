package org.spongepowered.asm.launch.platform;

public class MixinPlatformAgentDefault extends MixinPlatformAgentAbstract {
   @Override
   public void prepare() {
      String var1 = this.handle.getAttribute("MixinCompatibilityLevel");
      if (var1 != null) {
         this.manager.setCompatibilityLevel(var1);
      }

      String var2 = this.handle.getAttribute("MixinConfigs");
      if (var2 != null) {
         for (String var6 : var2.split(",")) {
            this.manager.addConfig(var6.trim(), this.handle);
         }
      }

      String var8 = this.handle.getAttribute("MixinTokenProviders");
      if (var8 != null) {
         for (String var7 : var8.split(",")) {
            this.manager.addTokenProvider(var7.trim());
         }
      }

      String var10 = this.handle.getAttribute("MixinConnector");
      if (var10 != null) {
         this.manager.addConnector(var10.trim());
      }
   }
}
