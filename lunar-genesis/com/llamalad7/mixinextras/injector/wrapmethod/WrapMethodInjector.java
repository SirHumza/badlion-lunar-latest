package com.llamalad7.mixinextras.injector.wrapmethod;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.sugar.impl.ShareInfo;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;

public class WrapMethodInjector extends Injector {
   private final Type operationType = MixinExtrasService.getInstance()
      .changePackage(Operation.class, Type.getType(CompatibilityHelper.getAnnotation(this.info).desc), WrapMethod.class);
   private final List<ShareInfo> shares = new ArrayList<>();

   public WrapMethodInjector(InjectionInfo var1) {
      super(var1, "@WrapMethod");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      this.checkTargetModifiers(var1, true);
      this.checkSignature(var1);
      this.info.addCallbackInvocation(this.methodNode);
      WrapMethodApplicatorExtension.offerWrapper(var1, this.methodNode, this.operationType, this.shares);
   }

   private void checkSignature(Target var1) {
      Injector.InjectorData var2 = new Injector.InjectorData(var1, "method wrapper");
      String var3 = String.format("%s %s %s from %s", this.annotationType, var2, this, CompatibilityHelper.getMixin(this.info));
      if (var1.method.name.endsWith("init>")) {
         throw CompatibilityHelper.makeInvalidInjectionException(
            this.info, String.format("%s tried to target %s but targeting initializer methods is not supported!", var3, var1)
         );
      }

      var2.coerceReturnType = this.checkCoerce(-1, var1.returnType, var3, true);

      int var4;
      for (var4 = 0; var4 < var1.arguments.length; var4++) {
         Type var5 = var1.arguments[var4];
         if (var4 >= this.methodArgs.length) {
            throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s targeting %s doesn't have enough parameters!", var3, var1));
         }

         this.checkCoerce(var4, var5, var3, true);
      }

      if (var4 < this.methodArgs.length && this.methodArgs[var4++].equals(this.operationType)) {
         List var9 = Annotations.getValue(CompatibilityHelper.getAnnotation(this.info), "sugars");
         if (var9 != null) {
            for (int var6 = 0; var6 < var4; var6++) {
               AnnotationNode var7 = (AnnotationNode)var9.get(var6);
               if (MixinExtrasService.getInstance().isClassOwned(Type.getType(var7.desc).getClassName())) {
                  throw CompatibilityHelper.makeInvalidInjectionException(
                     this.info, String.format("%s targeting %s has sugar on a non-trailing param which is not allowed!", var3, var1)
                  );
               }
            }
         }

         while (var4 < this.methodArgs.length) {
            ShareInfo var10;
            if (var9 == null
               || (
                     var10 = ShareInfo.getOrCreate(
                        var1, (AnnotationNode)var9.get(var4), this.methodArgs[var4], CompatibilityHelper.getMixin(this.info).getMixin(), null
                     )
                  )
                  == null) {
               throw CompatibilityHelper.makeInvalidInjectionException(
                  this.info, String.format("%s targeting %s has an excess parameter at index %s!", var3, var1, var4)
               );
            }

            this.shares.add(var10);
            var4++;
         }
      } else {
         throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s targeting %s is missing Operation parameter!", var3, var1));
      }
   }
}
