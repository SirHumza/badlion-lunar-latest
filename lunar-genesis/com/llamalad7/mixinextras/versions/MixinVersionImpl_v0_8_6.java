package com.llamalad7.mixinextras.versions;

import com.llamalad7.mixinextras.utils.MixinInternals_v0_8_6;
import java.util.Collection;
import java.util.stream.Collectors;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

public class MixinVersionImpl_v0_8_6 extends MixinVersionImpl_v0_8_4 {
   @Override
   public Collection<Target> getTargets(InjectionInfo var1) {
      MixinTargetContext var2 = (MixinTargetContext)MixinVersion.getInstance().getMixin(var1);
      return MixinInternals_v0_8_6.getTargets(var1).stream().map(var2::getTargetMethod).collect(Collectors.toList());
   }
}
