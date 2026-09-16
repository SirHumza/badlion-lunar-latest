package org.spongepowered.tools.obfuscation.mirror;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.StandardLocation;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.collect.ImmutableList;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;

public class TypeHandleASM extends TypeHandle {
   private static final Map<String, TypeHandleASM> cache = new HashMap<>();
   private final ClassNode classNode;

   protected TypeHandleASM(PackageElement var1, String var2, ClassNode var3, ITypeHandleProvider var4) {
      super(var1, var2, var4);
      this.classNode = var3;
   }

   @Override
   public IAnnotationHandle getAnnotation(Class<? extends Annotation> var1) {
      AnnotationNode var2 = Annotations.getVisible(this.classNode, var1);
      if (var2 != null) {
         return Annotations.handleOf(var2);
      }

      AnnotationNode var3 = Annotations.getInvisible(this.classNode, var1);
      return var3 != null ? Annotations.handleOf(var3) : AnnotationHandle.of(null);
   }

   @Override
   public <T extends Element> List<T> getEnclosedElements(ElementKind... var1) {
      return super.getEnclosedElements(var1);
   }

   @Override
   public boolean hasTypeMirror() {
      return false;
   }

   @Override
   public TypeMirror getTypeMirror() {
      return null;
   }

   @Override
   public TypeHandle getSuperclass() {
      return this.classNode.superName == null ? null : this.typeProvider.getTypeHandle(this.classNode.superName);
   }

   @Override
   public List<TypeHandle> getInterfaces() {
      ImmutableList.Builder var1 = ImmutableList.builder();

      for (String var3 : this.classNode.interfaces) {
         TypeHandle var4 = this.typeProvider.getTypeHandle(var3);
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1.build();
   }

   @Override
   public List<MethodHandle> getMethods() {
      ImmutableList.Builder var1 = ImmutableList.builder();

      for (MethodNode var3 : this.classNode.methods) {
         if (!var3.name.startsWith("<") && (var3.access & 4096) == 0) {
            var1.add(new MethodHandleASM(this, var3));
         }
      }

      return var1.build();
   }

   @Override
   public boolean isPublic() {
      return (this.classNode.access & 1) != 0;
   }

   @Override
   public boolean isImaginary() {
      return false;
   }

   @Override
   public boolean isNotInterface() {
      return (this.classNode.access & 512) == 0;
   }

   @Override
   public String findDescriptor(ITargetSelectorByName var1) {
      String var2 = var1.getDesc();
      if (var2 == null) {
         for (MethodNode var4 : this.classNode.methods) {
            if (var4.name.equals(var1.getName())) {
               var2 = var4.desc;
               break;
            }
         }
      }

      return var2;
   }

   @Override
   public FieldHandle findField(String var1, String var2, boolean var3) {
      for (FieldNode var5 : this.classNode.fields) {
         if (compareElement(var5.name, TypeUtils.getJavaSignature(var5.desc), var1, var2, var3)) {
            return new FieldHandleASM(this, var5);
         }
      }

      return null;
   }

   @Override
   public MethodHandle findMethod(String var1, String var2, boolean var3) {
      for (MethodNode var5 : this.classNode.methods) {
         if (compareElement(var5.name, TypeUtils.getJavaSignature(var5.desc), var1, var2, var3)) {
            return new MethodHandleASM(this, var5);
         }
      }

      return null;
   }

   protected static boolean compareElement(String var0, String var1, String var2, String var3, boolean var4) {
      try {
         boolean var5 = var4 ? var2.equals(var0) : var2.equalsIgnoreCase(var0);
         return var5 && (var3.length() == 0 || var3.equals(var1));
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public static TypeHandle of(PackageElement var0, String var1, IMixinAnnotationProcessor var2) {
      String var3 = var0.getQualifiedName() + "." + var1;
      if (cache.containsKey(var3)) {
         return cache.get(var3);
      }

      InputStream var4 = null;

      try {
         Filer var5 = var2.getProcessingEnvironment().getFiler();

         try {
            var4 = var5.getResource(StandardLocation.CLASS_PATH, var0.getQualifiedName(), var1 + ".class").openInputStream();
         } catch (FileNotFoundException var21) {
            var4 = var5.getResource(StandardLocation.PLATFORM_CLASS_PATH, var0.getQualifiedName(), var1 + ".class").openInputStream();
         }

         ClassNode var6 = new ClassNode();
         new ClassReader(var4).accept(var6, 0);
         TypeHandleASM var7 = new TypeHandleASM(var0, var3, var6, var2.getTypeProvider());
         cache.put(var3, var7);
         return var7;
      } catch (FileNotFoundException var22) {
         cache.put(var3, null);
      } catch (Exception var23) {
      } finally {
         if (var4 != null) {
            try {
               var4.close();
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }
      }

      return null;
   }
}
