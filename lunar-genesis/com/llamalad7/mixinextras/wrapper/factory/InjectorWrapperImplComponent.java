package com.llamalad7.mixinextras.wrapper.factory;

import com.llamalad7.mixinextras.utils.MixinInternals;
import com.llamalad7.mixinextras.wrapper.InjectorWrapperImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;

public class FactoryRedirectWrapperImpl extends InjectorWrapperImpl {
   private final InjectionInfo delegate;
   private final MethodNode handler;

   protected FactoryRedirectWrapperImpl(InjectionInfo var1, MixinTargetContext var2, MethodNode var3, AnnotationNode var4) {
      super(var1, var2, var3, var4, true);
      var3.visibleAnnotations.remove(var4);
      var3.visibleAnnotations.add(Annotations.getValue(var4, "original"));
      this.handler = var3;
      this.delegate = InjectionInfo.parse(var2, var3);
   }

   @Override
   protected InjectionInfo getDelegate() {
      return this.delegate;
   }

   @Override
   protected MethodNode getHandler() {
      return this.handler;
   }

   @Override
   protected void granularInject(InjectorWrapperImpl.HandlerCallCallback var1) {
      HashMap var2 = new HashMap();

      for (Entry var4 : MixinInternals.getTargets(this.delegate).entrySet()) {
         for (InjectionNodes.InjectionNode var6 : (List)var4.getValue()) {
            this.findReplacedNodes((Target)var4.getKey(), var6, var2x -> var2.computeIfAbsent(var6, var0x -> new ArrayList()).add(var2x));
         }
      }

      super.granularInject((var2x, var3, var4x) -> {
         var1.onFound(var2x, var3, var4x);
         List var5 = (List)var2.get(var3);
         if (var5 != null) {
            for (InjectionNodes.InjectionNode var7 : var5) {
               var7.replace(var4x);
            }
         }
      });
   }

   private void findReplacedNodes(Target var1, InjectionNodes.InjectionNode var2, Consumer<InjectionNodes.InjectionNode> var3) {
      if (!var2.isRemoved() && var2.getCurrentTarget().getOpcode() == 187) {
         var3.accept(var2);
         var3.accept(var1.addInjectionNode(var1.findInitNodeFor((TypeInsnNode)var2.getCurrentTarget())));
      }
   }
}
