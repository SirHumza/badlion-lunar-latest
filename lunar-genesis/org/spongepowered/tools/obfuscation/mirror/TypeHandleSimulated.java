package org.spongepowered.tools.obfuscation.mirror;

import java.lang.annotation.Annotation;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.SignaturePrinter;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;

public class TypeHandleSimulated extends TypeHandle {
   private final TypeElement simulatedType;

   public TypeHandleSimulated(String var1, TypeMirror var2, ITypeHandleProvider var3) {
      this(TypeUtils.getPackage(var2), var1, var2, var3);
   }

   public TypeHandleSimulated(PackageElement var1, String var2, TypeMirror var3, ITypeHandleProvider var4) {
      super(var1, var2, var4);
      this.simulatedType = (TypeElement)((DeclaredType)var3).asElement();
   }

   @Override
   protected TypeElement getTargetElement() {
      return this.simulatedType;
   }

   @Override
   public boolean isPublic() {
      return true;
   }

   @Override
   public boolean isImaginary() {
      return false;
   }

   @Override
   public boolean isSimulated() {
      return true;
   }

   public AnnotationHandle getAnnotation(Class<? extends Annotation> var1) {
      return null;
   }

   @Override
   public TypeHandle getSuperclass() {
      return null;
   }

   @Override
   public String findDescriptor(ITargetSelectorByName var1) {
      return var1 != null ? var1.getDesc() : null;
   }

   @Override
   public FieldHandle findField(String var1, String var2, boolean var3) {
      return new FieldHandle((String)null, var1, var2);
   }

   @Override
   public MethodHandle findMethod(String var1, String var2, boolean var3) {
      return new MethodHandle(null, var1, var2);
   }

   @Override
   public MappingMethod getMappingMethod(String var1, String var2) {
      String var3 = new SignaturePrinter(var1, var2).setFullyQualified(true).toDescriptor();
      String var4 = TypeUtils.stripGenerics(var3);
      MethodHandle var5 = findMethodRecursive(this, var1, var3, var4, true, this.typeProvider);
      return var5 != null ? var5.asMapping(true) : super.getMappingMethod(var1, var2);
   }

   private static MethodHandle findMethodRecursive(TypeHandle var0, String var1, String var2, String var3, boolean var4, ITypeHandleProvider var5) {
      TypeElement var6 = var0.getTargetElement();
      if (var6 == null) {
         return null;
      }

      MethodHandle var7 = TypeHandle.findMethod(var0, var1, var2, var3, var4);
      if (var7 != null) {
         return var7;
      }

      for (TypeMirror var9 : var6.getInterfaces()) {
         var7 = findMethodRecursive(var9, var1, var2, var3, var4, var5);
         if (var7 != null) {
            return var7;
         }
      }

      TypeMirror var11 = var6.getSuperclass();
      return var11 != null && var11.getKind() != TypeKind.NONE ? findMethodRecursive(var11, var1, var2, var3, var4, var5) : null;
   }

   private static MethodHandle findMethodRecursive(TypeMirror var0, String var1, String var2, String var3, boolean var4, ITypeHandleProvider var5) {
      return !(var0 instanceof DeclaredType) ? null : findMethodRecursive(var5.getTypeHandle(var0), var1, var2, var3, var4, var5);
   }
}
