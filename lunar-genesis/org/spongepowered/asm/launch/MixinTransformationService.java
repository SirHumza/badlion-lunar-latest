package org.spongepowered.asm.launch;

import cpw.mods.jarhandling.JarMetadata;
import cpw.mods.jarhandling.SecureJar;
import cpw.mods.jarhandling.VirtualJar;
import cpw.mods.modlauncher.api.IModuleLayerManager;
import cpw.mods.modlauncher.api.IModuleLayerManager.Layer;
import cpw.mods.modlauncher.api.ITransformationService.Resource;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.include.com.google.common.collect.ImmutableList;
import org.spongepowered.include.com.google.common.collect.ImmutableSet;

public class MixinTransformationService extends MixinTransformationServiceAbstract {
   public List<Resource> completeScan(IModuleLayerManager var1) {
      try {
         Path var2 = Path.of(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
         if (this.detectVirtualJar(var1)) {
            try {
               return ImmutableList.of(this.createVirtualJar(var2));
            } catch (URISyntaxException var4) {
               throw new RuntimeException(var4);
            }
         } else {
            try {
               return ImmutableList.of(this.createShim(var2));
            } catch (URISyntaxException var5) {
               throw new RuntimeException(var5);
            }
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
         return super.completeScan(var1);
      }
   }

   private boolean detectVirtualJar(IModuleLayerManager var1) {
      try {
         MixinService.getService().getClassProvider().findClass("cpw.mods.jarhandling.VirtualJar", false);
         return true;
      } catch (ClassNotFoundException var3) {
         return false;
      }
   }

   private Resource createVirtualJar(Path var1) {
      VirtualJar var2 = new VirtualJar("mixin_synthetic", var1, new String[]{"org.spongepowered.asm.synthetic", "org.spongepowered.asm.synthetic.args"});
      return new Resource(Layer.GAME, ImmutableList.of(var2));
   }

   private Resource createShim(Path var1) {
      Path var2 = var1.resolve("mixin_synthetic");
      ImmutableSet var3 = ImmutableSet.of("org.spongepowered.asm.synthetic", "org.spongepowered.asm.synthetic.args");
      SecureJar var4 = SecureJar.from(var2x -> JarMetadata.fromFileName(var2, var3, ImmutableList.of()), new Path[]{var1});
      return new Resource(Layer.GAME, ImmutableList.of(var4));
   }
}
