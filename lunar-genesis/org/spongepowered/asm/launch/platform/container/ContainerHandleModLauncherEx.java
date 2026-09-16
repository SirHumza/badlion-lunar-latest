package org.spongepowered.asm.launch.platform.container;

import cpw.mods.jarhandling.SecureJar;

public class ContainerHandleModLauncherEx extends ContainerHandleModLauncher {
   public ContainerHandleModLauncherEx(String var1) {
      super(var1);
   }

   @Override
   public void addResource(Object var1) {
      if (var1 instanceof SecureJar) {
         this.add(new ContainerHandleModLauncherEx.SecureJarResource((SecureJar)var1));
      } else {
         super.addResource(var1);
      }
   }

   static class SecureJarResource extends ContainerHandleURI {
      private SecureJar jar;

      public SecureJarResource(SecureJar var1) {
         super(var1.getPrimaryPath().toUri());
         this.jar = var1;
      }

      @Override
      public String getId() {
         String var1 = this.jar.name();
         int var2 = var1.lastIndexOf(46);
         if (var2 > 0) {
            var1 = var1.substring(0, var2);
         }

         return var1;
      }

      @Override
      public String getDescription() {
         return this.jar.getRootPath().toAbsolutePath().toString();
      }

      public String getName() {
         return this.jar.name();
      }

      @Override
      public String toString() {
         return String.format("SecureJarResource(%s)", this.getName());
      }
   }
}
