package org.spongepowered.asm.mixin.injection.code;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelectors;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.util.Annotations;

public class InjectorTarget {
   private final ISliceContext context;
   private final Map<String, InsnListReadOnly> cache = new HashMap<>();
   private final Target target;
   private final TargetSelectors.SelectedMethod selectedMethod;
   private final String mergedBy;
   private final int mergedPriority;

   public InjectorTarget(ISliceContext var1, Target var2, TargetSelectors.SelectedMethod var3) {
      this.context = var1;
      this.target = var2;
      this.selectedMethod = var3;
      AnnotationNode var4 = Annotations.getVisible(var2.method, MixinMerged.class);
      this.mergedBy = Annotations.getValue(var4, "mixin");
      this.mergedPriority = Annotations.getValue(var4, "priority", 1000);
   }

   @Override
   public String toString() {
      return this.target.toString();
   }

   public InjectionNodes.InjectionNode addInjectionNode(AbstractInsnNode var1) {
      return this.target.addInjectionNode(var1);
   }

   public InjectionNodes.InjectionNode getInjectionNode(AbstractInsnNode var1) {
      return this.target.getInjectionNode(var1);
   }

   public String getName() {
      return this.target.getName();
   }

   public String getDesc() {
      return this.target.getDesc();
   }

   public String getSignature() {
      return this.target.getSignature();
   }

   public Target getTarget() {
      return this.target;
   }

   public MethodNode getMethod() {
      return this.target.method;
   }

   public TargetSelectors.SelectedMethod getSelectedMethod() {
      return this.selectedMethod;
   }

   public boolean isMerged() {
      return this.mergedBy != null;
   }

   public String getMergedBy() {
      return this.mergedBy;
   }

   public int getMergedPriority() {
      return this.mergedPriority;
   }

   public InsnList getSlice(String var1) {
      InsnListReadOnly var2 = this.cache.get(var1);
      if (var2 == null) {
         MethodSlice var3 = this.context.getSlice(var1);
         if (var3 != null) {
            var2 = var3.getSlice(this.target);
         } else {
            var2 = new InsnListEx(this.target);
         }

         this.cache.put(var1, var2);
      }

      return var2;
   }

   public InsnList getSlice(InjectionPoint var1) {
      return this.getSlice(var1.getSlice());
   }

   public void dispose() {
      for (InsnListReadOnly var2 : this.cache.values()) {
         var2.dispose();
      }

      this.cache.clear();
   }
}
