package org.cadixdev.bombe.analysis;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;

public interface InheritanceProvider {
   Optional<InheritanceProvider.ClassInfo> provide(String var1);

   default Optional<InheritanceProvider.ClassInfo> provide(String var1, Object var2) {
      return this.provide(var1);
   }

   interface ClassInfo {
      String getName();

      default String getPackage() {
         String var1 = this.getName();
         int var2 = var1.lastIndexOf(47);
         return var2 >= 0 ? var1.substring(0, var2) : "";
      }

      boolean isInterface();

      String getSuperName();

      List<String> getInterfaces();

      Map<FieldSignature, InheritanceType> getFields();

      Map<String, InheritanceType> getFieldsByName();

      Map<MethodSignature, InheritanceType> getMethods();

      default Set<InheritanceProvider.ClassInfo> provideParents(InheritanceProvider var1) {
         HashSet var2 = new HashSet();
         this.provideParents(var1, var2);
         return Collections.unmodifiableSet(var2);
      }

      default void provideParents(InheritanceProvider var1, Collection<InheritanceProvider.ClassInfo> var2) {
         var1.provide(this.getSuperName()).ifPresent(var2x -> {
            var2.add(var2x);
            var2x.provideParents(var1, var2);
         });

         for (String var4 : this.getInterfaces()) {
            var1.provide(var4).ifPresent(var2x -> {
               var2.add(var2x);
               var2x.provideParents(var1, var2);
            });
         }
      }

      default boolean hasParent(String var1, InheritanceProvider var2) {
         return this.provideParents(var2).stream().map(InheritanceProvider.ClassInfo::getName).anyMatch(Predicate.isEqual(var1));
      }

      default boolean hasParent(InheritanceProvider.ClassInfo var1, InheritanceProvider var2) {
         return this.provideParents(var2).contains(var1);
      }

      default InheritanceType getField(FieldSignature var1) {
         return !var1.getType().isPresent()
            ? this.getFieldsByName().getOrDefault(var1.getName(), InheritanceType.NONE)
            : this.getFields().getOrDefault(var1, InheritanceType.NONE);
      }

      default InheritanceType getMethod(MethodSignature var1) {
         return this.getMethods().getOrDefault(var1, InheritanceType.NONE);
      }

      default boolean canInherit(InheritanceProvider.ClassInfo var1, FieldSignature var2) {
         return this.getField(var2).canInherit(this, var1);
      }

      default boolean canInherit(InheritanceProvider.ClassInfo var1, MethodSignature var2) {
         return this.getMethod(var2).canInherit(this, var1);
      }

      default boolean overrides(MethodSignature var1, InheritanceProvider.ClassInfo var2) {
         InheritanceType var3 = this.getMethods().getOrDefault(var1, InheritanceType.NONE);
         if (var3 == InheritanceType.NONE) {
            return false;
         }

         InheritanceType var4 = var2.getMethods().getOrDefault(var1, InheritanceType.NONE);
         return var3.compareTo(var4) >= 0 && var4.canInherit(var2, this);
      }

      default InheritanceProvider.ClassInfo lazy() {
         return new LazyInheritanceClassInfo(this);
      }

      abstract class Abstract implements InheritanceProvider.ClassInfo {
         @Override
         public final boolean equals(Object var1) {
            if (this == var1) {
               return true;
            }

            if (!(var1 instanceof InheritanceProvider)) {
               return false;
            }

            InheritanceProvider.ClassInfo var2 = (InheritanceProvider.ClassInfo)var1;
            return Objects.equals(this.getName(), var2.getName());
         }

         @Override
         public final int hashCode() {
            return this.getName().hashCode();
         }

         @Override
         public String toString() {
            return "ClassInfo{name='"
               + this.getName()
               + '\''
               + ", interface="
               + this.isInterface()
               + ", superName='"
               + this.getSuperName()
               + '\''
               + ", interfaces="
               + this.getInterfaces()
               + ", fields="
               + this.getFields()
               + ", methods="
               + this.getMethods()
               + '}';
         }
      }

      class Impl extends InheritanceProvider.ClassInfo.Abstract implements InheritanceProvider.ClassInfo {
         protected final String name;
         protected final boolean isInterface;
         protected final String superName;
         protected final List<String> interfaces;
         protected final Map<FieldSignature, InheritanceType> fields;
         protected final Map<String, InheritanceType> fieldsByName;
         protected final Map<MethodSignature, InheritanceType> methods;
         protected Set<InheritanceProvider.ClassInfo> parents;

         public Impl(
            String var1,
            boolean var2,
            String var3,
            List<String> var4,
            Map<FieldSignature, InheritanceType> var5,
            Map<String, InheritanceType> var6,
            Map<MethodSignature, InheritanceType> var7
         ) {
            this.name = var1;
            this.isInterface = var2;
            this.superName = var3 != null ? var3 : "";
            this.interfaces = Collections.unmodifiableList(var4);
            this.fields = Collections.unmodifiableMap(var5);
            this.fieldsByName = Collections.unmodifiableMap(var6);
            this.methods = Collections.unmodifiableMap(var7);
         }

         @Override
         public String getName() {
            return this.name;
         }

         @Override
         public boolean isInterface() {
            return this.isInterface;
         }

         @Override
         public String getSuperName() {
            return this.superName;
         }

         @Override
         public List<String> getInterfaces() {
            return this.interfaces;
         }

         @Override
         public Map<FieldSignature, InheritanceType> getFields() {
            return this.fields;
         }

         @Override
         public Map<String, InheritanceType> getFieldsByName() {
            return this.fieldsByName;
         }

         @Override
         public Map<MethodSignature, InheritanceType> getMethods() {
            return this.methods;
         }

         @Override
         public Set<InheritanceProvider.ClassInfo> provideParents(InheritanceProvider var1) {
            if (this.parents == null) {
               super.provideParents(var1, this.parents = new HashSet<>());
            }

            return this.parents;
         }

         @Override
         public void provideParents(InheritanceProvider var1, Collection<InheritanceProvider.ClassInfo> var2) {
            var2.addAll(this.provideParents(var1));
         }

         @Override
         public InheritanceProvider.ClassInfo lazy() {
            return this;
         }
      }
   }
}
