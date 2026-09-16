package org.spongepowered.tools.obfuscation.mirror;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import org.objectweb.asm.Type;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public final class AnnotationHandle implements IAnnotationHandle {
   public static final AnnotationHandle MISSING = new AnnotationHandle(null);
   private final AnnotationMirror annotation;

   private AnnotationHandle(AnnotationMirror var1) {
      this.annotation = var1;
   }

   public AnnotationMirror asMirror() {
      return this.annotation;
   }

   @Override
   public boolean exists() {
      return this.annotation != null;
   }

   @Override
   public String getDesc() {
      return this.annotation == null ? "java/lang/Annotation" : TypeUtils.getInternalName(this.annotation.getAnnotationType());
   }

   @Override
   public String toString() {
      return this.annotation == null ? "@{UnknownAnnotation}" : "@" + this.annotation.getAnnotationType().asElement().getSimpleName();
   }

   @Override
   public <T> T getValue(String var1, T var2) {
      if (this.annotation == null) {
         return (T)var2;
      } else {
         AnnotationValue var3 = this.getAnnotationValue(var1);
         if (var2 instanceof Enum && var3 != null) {
            VariableElement var4 = (VariableElement)var3.getValue();
            return (T)(var4 == null ? var2 : Enum.valueOf((Class<T>)var2.getClass(), var4.getSimpleName().toString()));
         } else {
            return (T)(var3 != null ? var3.getValue() : var2);
         }
      }
   }

   @Override
   public <T> T getValue() {
      return this.getValue("value", null);
   }

   @Override
   public <T> T getValue(String var1) {
      return this.getValue(var1, null);
   }

   @Override
   public boolean getBoolean(String var1, boolean var2) {
      return this.getValue(var1, var2);
   }

   @Override
   public IAnnotationHandle getAnnotation(String var1) {
      Object var2 = this.getValue(var1);
      if (var2 instanceof AnnotationMirror) {
         return of((AnnotationMirror)var2);
      }

      if (var2 instanceof AnnotationValue) {
         Object var3 = ((AnnotationValue)var2).getValue();
         if (var3 instanceof AnnotationMirror) {
            return of((AnnotationMirror)var3);
         }
      }

      return null;
   }

   @Override
   public <T> List<T> getList() {
      return this.getList("value");
   }

   @Override
   public <T> List<T> getList(String var1) {
      List var2 = this.getValue(var1, Collections.emptyList());
      return unwrapAnnotationValueList(var2);
   }

   @Override
   public List<IAnnotationHandle> getAnnotationList(String var1) {
      Object var2 = this.getValue(var1, null);
      if (var2 == null) {
         return Collections.emptyList();
      }

      if (var2 instanceof AnnotationMirror) {
         return ImmutableList.of(of((AnnotationMirror)var2));
      }

      List var3 = (List)var2;
      ArrayList var4 = new ArrayList(var3.size());

      for (AnnotationValue var6 : var3) {
         var4.add(new AnnotationHandle((AnnotationMirror)var6.getValue()));
      }

      return Collections.unmodifiableList(var4);
   }

   @Override
   public Type getTypeValue(String var1) {
      TypeMirror var2 = this.getValue(var1);
      return var2 == null ? Type.VOID_TYPE : Type.getType(TypeUtils.getInternalName(var2));
   }

   @Override
   public List<Type> getTypeList(String var1) {
      List var2 = this.getList(var1);
      ListIterator var3 = var2.listIterator();

      while (var3.hasNext()) {
         Object var4 = var3.next();
         if (var4 instanceof TypeMirror) {
            var3.set(Type.getType(TypeUtils.getInternalName((TypeMirror)var4)));
         }
      }

      return var2;
   }

   protected AnnotationValue getAnnotationValue(String var1) {
      for (ExecutableElement var3 : this.annotation.getElementValues().keySet()) {
         if (var3.getSimpleName().contentEquals(var1)) {
            return this.annotation.getElementValues().get(var3);
         }
      }

      return null;
   }

   protected static <T> List<T> unwrapAnnotationValueList(List<AnnotationValue> var0) {
      if (var0 == null) {
         return Collections.emptyList();
      }

      ArrayList var1 = new ArrayList(var0.size());

      for (AnnotationValue var3 : var0) {
         var1.add(var3.getValue());
      }

      return var1;
   }

   protected static AnnotationMirror getAnnotation(Element var0, Class<? extends Annotation> var1) {
      if (var0 == null) {
         return null;
      }

      List var2 = var0.getAnnotationMirrors();
      if (var2 == null) {
         return null;
      }

      for (AnnotationMirror var4 : var2) {
         Element var5 = var4.getAnnotationType().asElement();
         if (var5 instanceof TypeElement) {
            TypeElement var6 = (TypeElement)var5;
            if (var6.getQualifiedName().contentEquals(var1.getName())) {
               return var4;
            }
         }
      }

      return null;
   }

   public static AnnotationMirror asMirror(IAnnotationHandle var0) {
      return var0 instanceof AnnotationHandle ? ((AnnotationHandle)var0).asMirror() : null;
   }

   public static AnnotationHandle of(AnnotationMirror var0) {
      return new AnnotationHandle(var0);
   }

   public static AnnotationHandle of(Element var0, Class<? extends Annotation> var1) {
      return new AnnotationHandle(getAnnotation(var0, var1));
   }
}
