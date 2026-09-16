package org.cadixdev.bombe.analysis;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;

public class ReflectionInheritanceProvider implements InheritanceProvider {
   private final ClassLoader classLoader;

   public ReflectionInheritanceProvider(ClassLoader var1) {
      this.classLoader = var1;
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      try {
         return Optional.of(this.provide(Class.forName(var1.replace('/', '.'), false, this.classLoader)));
      } catch (ClassNotFoundException var3) {
         return Optional.empty();
      }
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1, Object var2) {
      return var2 instanceof Class ? Optional.of(this.provide((Class<?>)var2)) : this.provide(var1);
   }

   public InheritanceProvider.ClassInfo provide(Class<?> var1) {
      return new ReflectionInheritanceProvider.ReflectionClassInfo(var1).lazy();
   }

   private static class ReflectionClassInfo extends InheritanceProvider.ClassInfo.Abstract {
      private final Class<?> clazz;

      private ReflectionClassInfo(Class<?> var1) {
         this.clazz = var1;
      }

      private static String getInternalName(Class<?> var0) {
         return var0.getName().replace('.', '/');
      }

      @Override
      public String getName() {
         return getInternalName(this.clazz);
      }

      @Override
      public boolean isInterface() {
         return this.clazz.isInterface();
      }

      @Override
      public String getSuperName() {
         Class var1 = this.clazz.getSuperclass();
         return var1 != null ? getInternalName(var1) : "";
      }

      @Override
      public List<String> getInterfaces() {
         return Collections.unmodifiableList(
            Arrays.stream(this.clazz.getInterfaces()).map(ReflectionInheritanceProvider.ReflectionClassInfo::getInternalName).collect(Collectors.toList())
         );
      }

      @Override
      public Map<FieldSignature, InheritanceType> getFields() {
         return Collections.unmodifiableMap(
            Arrays.stream(this.clazz.getDeclaredFields())
               .collect(Collectors.toMap(FieldSignature::of, var0 -> InheritanceType.fromModifiers(var0.getModifiers())))
         );
      }

      @Override
      public Map<String, InheritanceType> getFieldsByName() {
         return Collections.unmodifiableMap(
            Arrays.stream(this.clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, var0 -> InheritanceType.fromModifiers(var0.getModifiers())))
         );
      }

      @Override
      public Map<MethodSignature, InheritanceType> getMethods() {
         return Collections.unmodifiableMap(
            Arrays.stream(this.clazz.getDeclaredMethods())
               .collect(Collectors.toMap(MethodSignature::of, var0 -> InheritanceType.fromModifiers(var0.getModifiers())))
         );
      }

      private void provideParent(InheritanceProvider var1, Class<?> var2, Collection<InheritanceProvider.ClassInfo> var3) {
         if (var2 != null) {
            InheritanceProvider.ClassInfo var4 = var1.provide(getInternalName(var2), var2).orElse(null);
            if (var4 != null) {
               var4.provideParents(var1, var3);
               var3.add(var4);
            }
         }
      }

      @Override
      public void provideParents(InheritanceProvider var1, Collection<InheritanceProvider.ClassInfo> var2) {
         this.provideParent(var1, this.clazz.getSuperclass(), var2);

         for (Class var6 : this.clazz.getInterfaces()) {
            this.provideParent(var1, var6, var2);
         }
      }
   }
}
