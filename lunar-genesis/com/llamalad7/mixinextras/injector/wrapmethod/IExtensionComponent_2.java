package com.llamalad7.mixinextras.injector.wrapmethod;

import com.llamalad7.mixinextras.sugar.impl.ShareInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;

public class WrapMethodApplicatorExtension implements IExtension {
   private static final Map<ClassNode, Map<MethodNode, WrapMethodStage>> wrappers = new HashMap<>();

   static void offerWrapper(Target var0, MethodNode var1, Type var2, List<ShareInfo> var3) {
      Map var4 = wrappers.computeIfAbsent(var0.classNode, var0x -> new LinkedHashMap<>());
      WrapMethodStage var5 = var4.computeIfAbsent(var0.method, WrapMethodStage.Vanilla::new);
      var4.put(var0.method, new WrapMethodStage.Wrapper(var5, var1, var2, var3));
   }

   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return true;
   }

   @Override
   public void preApply(ITargetClassContext var1) {
   }

   @Override
   public void postApply(ITargetClassContext var1) {
      ClassNode var2 = var1.getClassNode();
      Map var3 = wrappers.get(var2);
      if (var3 != null) {
         for (WrapMethodStage var5 : var3.values()) {
            var5.apply(var2, new LinkedHashSet<>());
         }

         wrappers.remove(var2);
      }
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
   }
}
