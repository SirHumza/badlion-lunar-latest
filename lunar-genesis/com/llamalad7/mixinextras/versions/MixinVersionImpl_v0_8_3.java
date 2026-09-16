package com.llamalad7.mixinextras.versions;

import com.llamalad7.mixinextras.utils.MixinInternals_v0_8_3;
import java.util.Collection;
import java.util.stream.Collectors;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

public class MixinVersionImpl_v0_8_3 extends MixinVersionImpl_v0_8 {
   @Override
   public IMixinContext getMixin(InjectionInfo var1) {
      return var1.getMixin();
   }

   @Override
   public void preInject(InjectionInfo var1) {
      var1.preInject();
   }

   @Override
   public AnnotationNode getAnnotation(InjectionInfo var1) {
      return var1.getAnnotationNode();
   }

   @Override
   public Collection<Target> getTargets(InjectionInfo var1) {
      MixinTargetContext var2 = (MixinTargetContext)MixinVersion.getInstance().getMixin(var1);
      return MixinInternals_v0_8_3.getTargets(var1).stream().map(var2::getTargetMethod).collect(Collectors.toList());
   }

   @Override
   public MemberInfo parseMemberInfo(String var1, InjectionInfo var2) {
      return MemberInfo.parse(var1, var2);
   }
}
