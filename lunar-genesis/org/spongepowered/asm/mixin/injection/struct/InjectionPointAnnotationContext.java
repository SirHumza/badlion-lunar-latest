package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.asm.IAnnotationHandle;

public class InjectionPointAnnotationContext extends SelectorAnnotationContext implements IInjectionPointContext {
   private IInjectionPointContext parentContext;

   public InjectionPointAnnotationContext(IInjectionPointContext var1, IAnnotationHandle var2, String var3) {
      super(var1, var2, var3);
      this.parentContext = var1;
   }

   public InjectionPointAnnotationContext(IInjectionPointContext var1, AnnotationNode var2, String var3) {
      super(var1, Annotations.handleOf(var2), var3);
      this.parentContext = var1;
   }

   @Override
   public void addMessage(String var1, Object... var2) {
      this.parentContext.addMessage(var1, var2);
   }

   @Override
   public MethodNode getMethod() {
      return this.parentContext.getMethod();
   }

   @Override
   public AnnotationNode getAnnotationNode() {
      return this.parentContext.getAnnotationNode();
   }

   @Override
   public IAnnotationHandle getAnnotation() {
      return this.parentContext.getAnnotation();
   }

   @Override
   public String toString() {
      return String.format("%s->%s(%s)", this.parentContext, this.getSelectorAnnotation(), this.getSelectorCoordinate(false));
   }
}
