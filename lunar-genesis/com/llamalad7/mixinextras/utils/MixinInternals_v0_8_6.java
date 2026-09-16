package com.llamalad7.mixinextras.utils;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelectors;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;

public class MixinInternals_v0_8_6 {
   private static final InternalField<InjectionInfo, TargetSelectors> INJECTION_INFO_SELECTED_TARGETS = InternalField.of(InjectionInfo.class, "targets");

   public static Collection<MethodNode> getTargets(InjectionInfo var0) {
      Iterable var1 = INJECTION_INFO_SELECTED_TARGETS.get(var0);
      return StreamSupport.<TargetSelectors.SelectedMethod>stream(var1.spliterator(), false)
         .map(TargetSelectors.SelectedMethod::getMethod)
         .collect(Collectors.toList());
   }
}
