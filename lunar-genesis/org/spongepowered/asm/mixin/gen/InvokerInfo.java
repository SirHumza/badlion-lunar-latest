package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.mixin.injection.selectors.ElementNode;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.MethodNodeEx;

class InvokerInfo extends AccessorInfo {
   InvokerInfo(MixinTargetContext var1, MethodNode var2) {
      super(var1, var2, Invoker.class);
   }

   @Override
   protected AccessorInfo.AccessorType initType() {
      if (this.specifiedName != null) {
         String var4 = this.mixin.getReferenceMapper().remap(this.mixin.getClassRef(), this.specifiedName);
         return this.initType(var4.replace('.', '/'), this.mixin.getTargetClassRef());
      }

      AccessorInfo.AccessorName var1 = AccessorInfo.AccessorName.of(MethodNodeEx.getName(this.method), false);
      if (var1 != null) {
         for (String var3 : AccessorInfo.AccessorType.OBJECT_FACTORY.getExpectedPrefixes()) {
            if (var3.equals(var1.prefix)) {
               return this.initType(var1.name, this.mixin.getTargetClassInfo().getSimpleName());
            }
         }
      }

      return AccessorInfo.AccessorType.METHOD_PROXY;
   }

   private AccessorInfo.AccessorType initType(String var1, String var2) {
      if (!"<init>".equals(var1) && !var2.equals(var1)) {
         return AccessorInfo.AccessorType.METHOD_PROXY;
      } else if (!this.returnType.equals(this.mixin.getTargetClassInfo().getType())) {
         throw new InvalidAccessorException(
            this.mixin,
            String.format(
               "%s appears to have an invalid return type. %s requires matching return type. Found %s expected %s",
               this,
               AccessorInfo.AccessorType.OBJECT_FACTORY,
               Bytecode.getSimpleName(this.returnType),
               this.mixin.getTargetClassInfo().getSimpleName()
            )
         );
      } else if (!this.isStatic) {
         throw new InvalidAccessorException(
            this.mixin, String.format("%s for %s must be static", this, AccessorInfo.AccessorType.OBJECT_FACTORY, Bytecode.getSimpleName(this.returnType))
         );
      } else {
         return AccessorInfo.AccessorType.OBJECT_FACTORY;
      }
   }

   @Override
   protected Type initTargetFieldType() {
      return null;
   }

   @Override
   protected ITargetSelector initTarget() {
      return this.type == AccessorInfo.AccessorType.OBJECT_FACTORY
         ? new MemberInfo("<init>", null, Bytecode.changeDescriptorReturnType(this.method.desc, "V"))
         : new MemberInfo(this.getTargetName(this.specifiedName), null, this.method.desc);
   }

   @Override
   public void locate() {
      this.targetMethod = this.findTargetMethod();
      this.annotation.visit("target", this.targetMethod.name + this.targetMethod.desc);
   }

   private MethodNode findTargetMethod() {
      TargetSelector.Result var1 = TargetSelector.run(this.target.configure(ITargetSelector.Configure.ORPHAN), ElementNode.methodList(this.classNode));

      try {
         return (MethodNode)var1.getSingleResult(true);
      } catch (IllegalStateException var5) {
         String var3 = String.format("%s matching %s in %s for %s", var5.getMessage(), this.target, this.classNode.name, this);
         if (this.type == AccessorInfo.AccessorType.METHOD_PROXY && this.specifiedName != null && this.target instanceof ITargetSelectorByName) {
            String var4 = ((ITargetSelectorByName)this.target).getName();
            if (var4 != null && (var4.contains(".") || var4.contains("/"))) {
               throw new InvalidAccessorException(this, "Invalid factory invoker failed to match the target class. " + var3);
            }
         }

         throw new InvalidAccessorException(this, var3);
      }
   }
}
