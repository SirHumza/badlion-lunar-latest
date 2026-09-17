package com.llamalad7.mixinextras.injector.wrapoperation;

import com.llamalad7.mixinextras.injector.MixinExtrasLateInjectionInfo;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import com.llamalad7.mixinextras.utils.MixinExtrasLogger;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.points.BeforeConstant;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;

@InjectionInfo.AnnotationType(WrapOperation.class)
@InjectionInfo.HandlerPrefix("wrapOperation")
public class WrapOperationInjectionInfo extends MixinExtrasLateInjectionInfo {
   private static final MixinExtrasLogger LOGGER = MixinExtrasLogger.get("WrapOperation");

   public WrapOperationInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3, determineAtKey(var1, var2, var3));
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new WrapOperationInjector(this);
   }

   @Override
   public void prepare() {
      super.prepare();
      InjectorUtils.checkForDupedNews(this.targetNodes);

      for (Entry var2 : this.targetNodes.entrySet()) {
         Target var3 = (Target)var2.getKey();
         ListIterator var4 = ((List)var2.getValue()).listIterator();

         while (var4.hasNext()) {
            InjectionNodes.InjectionNode var5 = (InjectionNodes.InjectionNode)var4.next();
            AbstractInsnNode var6 = var5.getCurrentTarget();
            if (var6.getOpcode() == 187) {
               MethodInsnNode var7 = ASMUtils.findInitNodeFor(var3, (TypeInsnNode)var6);
               if (var7 == null) {
                  LOGGER.warn("NEW node {} in {} has no init call?", Bytecode.describeNode(var6), var3);
                  var4.remove();
               } else {
                  var5.decorate("mixinextras_newArgTypes", Type.getArgumentTypes(var7.desc));
               }
            }
         }
      }
   }

   @Override
   protected void parseInjectionPoints(List<AnnotationNode> var1) {
      if (this.atKey.equals("at")) {
         super.parseInjectionPoints(var1);
      } else {
         Type var2 = Type.getReturnType(this.method.desc);

         for (AnnotationNode var4 : var1) {
            this.injectionPoints.add(new BeforeConstant(CompatibilityHelper.getMixin(this), var4, var2.getDescriptor()));
         }
      }
   }

   @Override
   public String getLateInjectionType() {
      return "WrapOperation";
   }

   private static String determineAtKey(MixinTargetContext var0, MethodNode var1, AnnotationNode var2) {
      boolean var3 = Annotations.getValue(var2, "at") != null;
      boolean var4 = Annotations.getValue(var2, "constant") != null;
      if (var3 == var4) {
         throw new IllegalStateException(
            String.format(
               "@WrapOperation injector %s::%s must specify exactly one of `at` and `constant`, got %s.",
               var0.getMixin().getClassName(),
               var1.name,
               var3 ? "both" : "neither"
            )
         );
      } else {
         return var3 ? "at" : "constant";
      }
   }
}
