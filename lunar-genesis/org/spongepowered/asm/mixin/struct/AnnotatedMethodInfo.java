package org.spongepowered.asm.mixin.struct;

import java.util.Locale;
import javax.tools.Diagnostic.Kind;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.refmap.IReferenceMapper;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.asm.IAnnotatedElement;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.asm.util.logging.MessageRouter;
import org.spongepowered.include.com.google.common.base.Strings;

public class AnnotatedMethodInfo implements IInjectionPointContext {
   private final IMixinContext context;
   protected final MethodNode method;
   protected final AnnotationNode annotation;
   protected final String annotationType;
   protected final String methodName;

   public AnnotatedMethodInfo(IMixinContext var1, MethodNode var2, AnnotationNode var3) {
      this.context = var1;
      this.method = var2;
      this.annotation = var3;
      this.annotationType = this.annotation != null ? "@" + Annotations.getSimpleName(this.annotation) : "Undecorated method";
      this.methodName = MethodNodeEx.getName(var2);
   }

   @Override
   public final String getElementDescription() {
      return String.format("%s annotation on %s", this.annotationType, this.methodName);
   }

   @Override
   public String remap(String var1) {
      if (this.context != null) {
         IReferenceMapper var2 = this.context.getReferenceMapper();
         return var2 != null ? var2.remap(this.context.getClassRef(), var1) : var1;
      } else {
         return var1;
      }
   }

   @Override
   public ISelectorContext getParent() {
      return null;
   }

   @Override
   public IMixinContext getMixin() {
      return this.context;
   }

   @Override
   public final MethodNode getMethod() {
      return this.method;
   }

   public String getMethodName() {
      return this.method.name;
   }

   @Override
   public AnnotationNode getAnnotationNode() {
      return this.annotation;
   }

   @Override
   public final IAnnotationHandle getAnnotation() {
      return Annotations.handleOf(this.annotation);
   }

   @Override
   public IAnnotationHandle getSelectorAnnotation() {
      return Annotations.handleOf(this.annotation);
   }

   @Override
   public String getSelectorCoordinate(boolean var1) {
      return var1 ? "method" : this.getMethodName().toLowerCase(Locale.ROOT);
   }

   @Override
   public void addMessage(String var1, Object... var2) {
      if (this.context.getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
         MessageRouter.getMessager().printMessage(Kind.WARNING, String.format(var1, var2));
      }
   }

   public static final String getDynamicInfo(Object var0) {
      if (var0 instanceof MethodNode) {
         return getDynamicInfo((MethodNode)var0);
      } else {
         return var0 instanceof IAnnotatedElement ? getDynamicInfo((IAnnotatedElement)var0) : "";
      }
   }

   public static final String getDynamicInfo(MethodNode var0) {
      return getDynamicInfo(Annotations.handleOf(Annotations.getInvisible(var0, Dynamic.class)));
   }

   public static final String getDynamicInfo(IAnnotatedElement var0) {
      return getDynamicInfo(var0.getAnnotation(Dynamic.class));
   }

   private static String getDynamicInfo(IAnnotationHandle var0) {
      if (var0 == null) {
         return "";
      }

      String var1 = Strings.nullToEmpty(var0.getValue());
      Type var2 = var0.getTypeValue("mixin");
      if (var2 != null) {
         var1 = String.format("{%s} %s", var2.getClassName(), var1).trim();
      }

      return var1.length() > 0 ? String.format(" Method is @Dynamic(%s).", var1) : "";
   }
}
