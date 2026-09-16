package com.llamalad7.mixinextras.wrapper;

import com.llamalad7.mixinextras.injector.LateApplyingInjectorInfo;
import com.llamalad7.mixinextras.sugar.impl.SingleIterationList;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.MixinInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

public abstract class InjectorWrapperImpl {
   private final InjectionInfo wrapperInfo;
   protected final ClassNode classNode;
   private final boolean useGranularInject;

   protected InjectorWrapperImpl(InjectionInfo var1, MixinTargetContext var2, MethodNode var3, AnnotationNode var4, boolean var5) {
      this.wrapperInfo = var1;
      this.classNode = var2.getTargetClassNode();
      this.useGranularInject = var5;
   }

   public boolean usesGranularInject() {
      return this.useGranularInject;
   }

   protected abstract InjectionInfo getDelegate();

   protected abstract MethodNode getHandler();

   protected boolean isValid() {
      return this.getDelegate().isValid();
   }

   public int getOrder() {
      return CompatibilityHelper.getOrder(this.getDelegate());
   }

   protected void prepare() {
      this.getDelegate().prepare();
      MethodNode var1 = this.getHandler();
      var1.visibleAnnotations.remove(InjectionInfo.getInjectorAnnotation(CompatibilityHelper.getMixin(this.wrapperInfo).getMixin(), var1));
   }

   protected void preInject() {
      CompatibilityHelper.preInject(this.getDelegate());
   }

   protected void doInject() {
      if (this.useGranularInject) {
         this.granularInject((var0, var1, var2) -> {});
      } else {
         if (this.getDelegate() instanceof LateApplyingInjectorInfo) {
            ((LateApplyingInjectorInfo)this.getDelegate()).lateInject();
         } else {
            this.getDelegate().inject();
         }
      }
   }

   protected void granularInject(InjectorWrapperImpl.HandlerCallCallback var1) {
      InjectionInfo var2 = this.getDelegate();
      if (var2 instanceof WrapperInjectionInfo) {
         WrapperInjectionInfo var3 = (WrapperInjectionInfo)var2;
         var3.impl.granularInject(var1);
      } else {
         this.doGranularInject(var1);
      }
   }

   protected void doPostInject(Runnable var1) {
      var1.run();
   }

   protected void addCallbackInvocation(MethodNode var1) {
      this.getDelegate().addCallbackInvocation(var1);
   }

   protected RuntimeException granularInjectNotSupported() {
      return new IllegalStateException(this.getDelegate().getClass() + " does not support granular injection! Please report to LlamaLad7!");
   }

   private void doGranularInject(InjectorWrapperImpl.HandlerCallCallback var1) {
      InjectionInfo var2 = this.getDelegate();
      Map var3 = MixinInternals.getTargets(var2);
      Injector var4 = MixinInternals.getInjector(var2);

      for (Entry var6 : var3.entrySet()) {
         Target var7 = (Target)var6.getKey();
         HashSet var8 = new HashSet<>(this.findHandlerCalls(var7));

         for (InjectionNodes.InjectionNode var10 : (List)var6.getValue()) {
            inject(var4, var7, var10);

            for (MethodInsnNode var12 : this.findHandlerCalls(var7)) {
               if (var8.add(var12)) {
                  var1.onFound(var7, var10, var12);
               }
            }
         }

         postInject(var4, var7, (List<InjectionNodes.InjectionNode>)var6.getValue());
      }

      var3.clear();
   }

   private List<MethodInsnNode> findHandlerCalls(Target var1) {
      MethodNode var2 = this.getHandler();
      ArrayList var3 = new ArrayList();

      for (AbstractInsnNode var5 : var1) {
         if (var5 instanceof MethodInsnNode) {
            MethodInsnNode var6 = (MethodInsnNode)var5;
            if (var6.owner.equals(this.classNode.name) && var6.name.equals(var2.name) && var6.desc.equals(var2.desc)) {
               var3.add(var6);
            }
         }
      }

      return var3;
   }

   private static void inject(Injector var0, Target var1, InjectionNodes.InjectionNode var2) {
      var0.inject(var1, new SingleIterationList<>(Collections.singletonList(var2), 0));
   }

   private static void postInject(Injector var0, Target var1, List<InjectionNodes.InjectionNode> var2) {
      var0.inject(var1, new SingleIterationList<>(var2, 1));
   }

   @FunctionalInterface
   public interface Factory {
      InjectorWrapperImpl create(InjectionInfo var1, MixinTargetContext var2, MethodNode var3, AnnotationNode var4);
   }

   @FunctionalInterface
   public interface HandlerCallCallback {
      void onFound(Target var1, InjectionNodes.InjectionNode var2, MethodInsnNode var3);
   }
}
