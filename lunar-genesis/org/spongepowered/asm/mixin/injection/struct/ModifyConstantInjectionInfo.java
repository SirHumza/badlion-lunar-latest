package org.spongepowered.asm.mixin.injection.struct;

import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.invoke.ModifyConstantInjector;
import org.spongepowered.asm.mixin.injection.points.BeforeConstant;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.include.com.google.common.base.Strings;

@InjectionInfo.AnnotationType(ModifyConstant.class)
@InjectionInfo.HandlerPrefix("constant")
@InjectionInfo.InjectorOrder(10000)
public class ModifyConstantInjectionInfo extends InjectionInfo {
   private static final String CONSTANT_ANNOTATION_CLASS = Constant.class.getName().replace('.', '/');

   public ModifyConstantInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3, "constant");
   }

   @Override
   protected void readInjectionPoints() {
      super.readInjectionPoints();
      if (this.injectionPointAnnotations.isEmpty()) {
         AnnotationNode var1 = new AnnotationNode(CONSTANT_ANNOTATION_CLASS);
         var1.visit("log", Boolean.TRUE);
         this.injectionPointAnnotations.add(var1);
      }
   }

   @Override
   protected void parseInjectionPoints(List<AnnotationNode> var1) {
      Type var2 = Type.getReturnType(this.method.desc);

      for (AnnotationNode var4 : var1) {
         this.injectionPoints.add(new BeforeConstant(this.getMixin(), var4, var2.getDescriptor()));
      }
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new ModifyConstantInjector(this);
   }

   @Override
   protected String getDescription() {
      return "Constant modifier method";
   }

   @Override
   public String getSliceId(String var1) {
      return Strings.nullToEmpty(var1);
   }
}
