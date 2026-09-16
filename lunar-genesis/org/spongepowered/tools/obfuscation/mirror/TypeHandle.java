package org.spongepowered.tools.obfuscation.mirror;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.collect.ImmutableList;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;
import org.spongepowered.tools.obfuscation.mirror.mapping.MappingMethodResolvable;

public class TypeHandle {
   private final String name;
   private final PackageElement pkg;
   private final TypeElement element;
   protected final ITypeHandleProvider typeProvider;
   private TypeReference reference;

   public TypeHandle(PackageElement var1, String var2, ITypeHandleProvider var3) {
      this.name = var2.replace('.', '/');
      this.pkg = var1;
      this.element = null;
      this.typeProvider = var3;
   }

   public TypeHandle(TypeElement var1, ITypeHandleProvider var2) {
      this.pkg = TypeUtils.getPackage(var1);
      this.name = TypeUtils.getInternalName(var1);
      this.element = var1;
      this.typeProvider = var2;
   }

   public TypeHandle(DeclaredType var1, ITypeHandleProvider var2) {
      this((TypeElement)var1.asElement(), var2);
   }

   @Override
   public final String toString() {
      return this.name.replace('/', '.');
   }

   public final String getName() {
      return this.name;
   }

   public final String getSimpleName() {
      return Bytecode.getSimpleName(this.name);
   }

   public final PackageElement getPackage() {
      return this.pkg;
   }

   public final TypeElement getElement() {
      return this.element;
   }

   protected TypeElement getTargetElement() {
      return this.element;
   }

   public IAnnotationHandle getAnnotation(Class<? extends Annotation> var1) {
      return AnnotationHandle.of(this.getTargetElement(), var1);
   }

   protected final List<? extends Element> getEnclosedElements() {
      return getEnclosedElements(this.getTargetElement());
   }

   protected <T extends Element> List<T> getEnclosedElements(ElementKind... var1) {
      return getEnclosedElements(this.getTargetElement(), var1);
   }

   public boolean hasTypeMirror() {
      return this.getTargetElement() != null;
   }

   public TypeMirror getTypeMirror() {
      return this.getTargetElement() != null ? this.getTargetElement().asType() : null;
   }

   public TypeHandle getSuperclass() {
      TypeElement var1 = this.getTargetElement();
      if (var1 == null) {
         return null;
      }

      TypeMirror var2 = var1.getSuperclass();
      return var2 != null && var2.getKind() != TypeKind.NONE ? this.typeProvider.getTypeHandle(var2) : null;
   }

   public List<TypeHandle> getInterfaces() {
      if (this.getTargetElement() == null) {
         return Collections.emptyList();
      }

      ImmutableList.Builder var1 = ImmutableList.builder();

      for (TypeMirror var3 : this.getTargetElement().getInterfaces()) {
         var1.add(this.typeProvider.getTypeHandle(var3));
      }

      return var1.build();
   }

   public List<MethodHandle> getMethods() {
      ArrayList var1 = new ArrayList();

      for (ExecutableElement var3 : this.getEnclosedElements(ElementKind.METHOD)) {
         MethodHandle var4 = new MethodHandle(this, var3);
         var1.add(var4);
      }

      return var1;
   }

   public boolean isPublic() {
      TypeElement var1 = this.getTargetElement();
      if (var1 != null && var1.getModifiers().contains(Modifier.PUBLIC)) {
         for (Element var2 = var1.getEnclosingElement(); var2 != null && var2.getKind() != ElementKind.PACKAGE; var2 = var2.getEnclosingElement()) {
            if (!var2.getModifiers().contains(Modifier.PUBLIC)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean isImaginary() {
      return this.getTargetElement() == null;
   }

   public boolean isSimulated() {
      return false;
   }

   public boolean isNotInterface() {
      TypeElement var1 = this.getTargetElement();
      return var1 != null && !var1.getKind().isInterface();
   }

   public boolean isSuperTypeOf(TypeHandle var1) {
      ArrayList var2 = new ArrayList();
      if (var1.getSuperclass() != null) {
         var2.add(var1.getSuperclass());
      }

      var2.addAll(var1.getInterfaces());

      for (TypeHandle var4 : var2) {
         if (this.name.equals(var4.name) || this.isSuperTypeOf(var4)) {
            return true;
         }
      }

      return false;
   }

   public final TypeReference getReference() {
      if (this.reference == null) {
         this.reference = new TypeReference(this);
      }

      return this.reference;
   }

   public MappingMethod getMappingMethod(String var1, String var2) {
      return new MappingMethodResolvable(this, var1, var2);
   }

   public String findDescriptor(ITargetSelectorByName var1) {
      String var2 = var1.getDesc();
      if (var2 == null) {
         for (ExecutableElement var4 : this.getEnclosedElements(ElementKind.METHOD)) {
            if (var4.getSimpleName().toString().equals(var1.getName())) {
               var2 = TypeUtils.getDescriptor(var4);
               break;
            }
         }
      }

      return var2;
   }

   public final FieldHandle findField(VariableElement var1) {
      return this.findField(var1, true);
   }

   public final FieldHandle findField(VariableElement var1, boolean var2) {
      return this.findField(var1.getSimpleName().toString(), TypeUtils.getTypeName(var1.asType()), var2);
   }

   public final FieldHandle findField(String var1, String var2) {
      return this.findField(var1, var2, true);
   }

   public FieldHandle findField(String var1, String var2, boolean var3) {
      String var4 = TypeUtils.stripGenerics(var2);

      for (VariableElement var6 : this.getEnclosedElements(ElementKind.FIELD)) {
         if (compareElement(var6, var1, var2, var3)) {
            return new FieldHandle(this.getTargetElement(), var6);
         }

         if (compareElement(var6, var1, var4, var3)) {
            return new FieldHandle(this.getTargetElement(), var6, true);
         }
      }

      return null;
   }

   public final MethodHandle findMethod(ExecutableElement var1) {
      return this.findMethod(var1, true);
   }

   public final MethodHandle findMethod(ExecutableElement var1, boolean var2) {
      return this.findMethod(var1.getSimpleName().toString(), TypeUtils.getJavaSignature(var1), var2);
   }

   public final MethodHandle findMethod(String var1, String var2) {
      return this.findMethod(var1, var2, true);
   }

   public MethodHandle findMethod(String var1, String var2, boolean var3) {
      String var4 = TypeUtils.stripGenerics(var2);
      return findMethod(this, var1, var2, var4, var3);
   }

   protected static MethodHandle findMethod(TypeHandle var0, String var1, String var2, String var3, boolean var4) {
      for (ExecutableElement var6 : getEnclosedElements(var0.getTargetElement(), ElementKind.CONSTRUCTOR, ElementKind.METHOD)) {
         if (compareElement(var6, var1, var2, var4) || compareElement(var6, var1, var3, var4)) {
            return new MethodHandle(var0, var6);
         }
      }

      return null;
   }

   protected static boolean compareElement(Element var0, String var1, String var2, boolean var3) {
      try {
         String var4 = var0.getSimpleName().toString();
         String var5 = TypeUtils.getJavaSignature(var0);
         String var6 = TypeUtils.stripGenerics(var5);
         boolean var7 = var3 ? var1.equals(var4) : var1.equalsIgnoreCase(var4);
         return var7 && (var2.length() == 0 || var2.equals(var5) || var2.equals(var6));
      } catch (NullPointerException var8) {
         return false;
      }
   }

   protected static <T extends Element> List<T> getEnclosedElements(TypeElement var0, ElementKind... var1) {
      if (var1 != null && var1.length >= 1) {
         if (var0 == null) {
            return Collections.emptyList();
         }

         ImmutableList.Builder var2 = ImmutableList.builder();

         for (Element var4 : var0.getEnclosedElements()) {
            for (ElementKind var8 : var1) {
               if (var4.getKind() == var8) {
                  var2.add(var4);
                  break;
               }
            }
         }

         return var2.build();
      } else {
         return (List<T>)getEnclosedElements(var0);
      }
   }

   protected static List<? extends Element> getEnclosedElements(TypeElement var0) {
      return var0 != null ? var0.getEnclosedElements() : Collections.emptyList();
   }
}
