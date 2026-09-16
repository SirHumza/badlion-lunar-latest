package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.launchwrapper.IClassTransformer;
import org.spongepowered.asm.service.ILegacyClassTransformer;
import org.spongepowered.asm.service.MixinService;

public final class Proxy implements IClassTransformer, ILegacyClassTransformer {
   private static List<Proxy> proxies = new ArrayList<>();
   private static MixinTransformer transformer = new MixinTransformer();
   private boolean isActive = true;

   public Proxy() {
      for (Proxy var2 : proxies) {
         var2.isActive = false;
      }

      proxies.add(this);
      MixinService.getService().getLogger("mixin").debug("Adding new mixin transformer proxy #{}", proxies.size());
   }

   @Override
   public byte[] transform(String var1, String var2, byte[] var3) {
      return this.isActive ? transformer.transformClassBytes(var1, var2, var3) : var3;
   }

   @Override
   public String getName() {
      return this.getClass().getName();
   }

   @Override
   public boolean isDelegationExcluded() {
      return true;
   }

   @Override
   public byte[] transformClassBytes(String var1, String var2, byte[] var3) {
      return this.isActive ? transformer.transformClassBytes(var1, var2, var3) : var3;
   }
}
