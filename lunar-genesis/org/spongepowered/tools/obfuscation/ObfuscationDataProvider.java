package org.spongepowered.tools.obfuscation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

public class ObfuscationDataProvider implements IObfuscationDataProvider {
   private final IMixinAnnotationProcessor ap;
   private final List<ObfuscationEnvironment> environments;

   public ObfuscationDataProvider(IMixinAnnotationProcessor var1, List<ObfuscationEnvironment> var2) {
      this.ap = var1;
      this.environments = var2;
   }

   @Override
   public <T> ObfuscationData<T> getObfEntryRecursive(ITargetSelectorRemappable var1) {
      ObfuscationData var2 = this.getObfClass(var1.getOwner());
      ObfuscationData var3 = this.getObfEntry(var1);

      try {
         if (var3.isEmpty()) {
            var3 = this.getObfEntryRecursive(var1, new HashSet<>());
         }

         return !var3.isEmpty() ? applyParents(var2, var3) : var3;
      } catch (Exception var5) {
         var5.printStackTrace();
         return this.getObfEntry(var1);
      }
   }

   private <T> ObfuscationData<T> getObfEntryRecursive(ITargetSelectorRemappable var1, Set<String> var2) {
      TypeHandle var3 = this.ap.getTypeProvider().getTypeHandle(var1.getOwner());
      if (var3 != null && var2.add(var3.toString())) {
         TypeHandle var5 = var3.getSuperclass();

         for (TypeHandle var7 : var3.getInterfaces()) {
            ObfuscationData var4 = this.getObfEntryUsing(var1, var7);
            if (!var4.isEmpty()) {
               return var4;
            }

            var4 = this.getObfEntryRecursive(var1.move(var7.getName()), var2);
            if (!var4.isEmpty()) {
               return var4;
            }
         }

         if (var5 != null) {
            ObfuscationData var9 = this.getObfEntryUsing(var1, var5);
            return !var9.isEmpty() ? var9 : this.getObfEntryRecursive(var1.move(var5.getName()), var2);
         } else {
            return new ObfuscationData<>();
         }
      } else {
         return new ObfuscationData<>();
      }
   }

   private <T> ObfuscationData<T> getObfEntryUsing(ITargetSelectorRemappable var1, TypeHandle var2) {
      return var2 == null ? new ObfuscationData<>() : this.getObfEntry(var1.move(var2.getName()));
   }

   @Override
   public <T> ObfuscationData<T> getObfEntry(ITargetSelectorRemappable var1) {
      return (ObfuscationData<T>)(var1.isField() ? this.getObfField(var1) : this.getObfMethod(var1.asMethodMapping()));
   }

   @Override
   public <T> ObfuscationData<T> getObfEntry(IMapping<T> var1) {
      if (var1 != null) {
         if (var1.getType() == IMapping.Type.FIELD) {
            return (ObfuscationData<T>)this.getObfField((MappingField)var1);
         }

         if (var1.getType() == IMapping.Type.METHOD) {
            return (ObfuscationData<T>)this.getObfMethod((MappingMethod)var1);
         }
      }

      return new ObfuscationData<>();
   }

   @Override
   public ObfuscationData<MappingMethod> getObfMethodRecursive(ITargetSelectorRemappable var1) {
      return this.getObfEntryRecursive(var1);
   }

   @Override
   public ObfuscationData<MappingMethod> getObfMethod(ITargetSelectorRemappable var1) {
      return this.getRemappedMethod(var1, var1.isConstructor());
   }

   @Override
   public ObfuscationData<MappingMethod> getRemappedMethod(ITargetSelectorRemappable var1) {
      return this.getRemappedMethod(var1, true);
   }

   private ObfuscationData<MappingMethod> getRemappedMethod(ITargetSelectorRemappable var1, boolean var2) {
      ObfuscationData var3 = new ObfuscationData();

      for (ObfuscationEnvironment var5 : this.environments) {
         MappingMethod var6 = var5.getObfMethod(var1);
         if (var6 != null) {
            var3.put(var5.getType(), var6);
         }
      }

      return var3.isEmpty() && var2 ? this.remapDescriptor(var3, var1) : var3;
   }

   @Override
   public ObfuscationData<MappingMethod> getObfMethod(MappingMethod var1) {
      return this.getRemappedMethod(var1, var1.isConstructor());
   }

   @Override
   public ObfuscationData<MappingMethod> getRemappedMethod(MappingMethod var1) {
      return this.getRemappedMethod(var1, true);
   }

   private ObfuscationData<MappingMethod> getRemappedMethod(MappingMethod var1, boolean var2) {
      ObfuscationData var3 = new ObfuscationData();

      for (ObfuscationEnvironment var5 : this.environments) {
         MappingMethod var6 = var5.getObfMethod(var1);
         if (var6 != null) {
            var3.put(var5.getType(), var6);
         }
      }

      return var3.isEmpty() && var2 ? this.remapDescriptor(var3, new MemberInfo(var1)) : var3;
   }

   public ObfuscationData<MappingMethod> remapDescriptor(ObfuscationData<MappingMethod> var1, ITargetSelectorRemappable var2) {
      for (ObfuscationEnvironment var4 : this.environments) {
         ITargetSelectorRemappable var5 = var4.remapDescriptor(var2);
         if (var5 != null) {
            var1.put(var4.getType(), var5.asMethodMapping());
         }
      }

      return var1;
   }

   @Override
   public ObfuscationData<MappingField> getObfFieldRecursive(ITargetSelectorRemappable var1) {
      return this.getObfEntryRecursive(var1);
   }

   @Override
   public ObfuscationData<MappingField> getObfField(ITargetSelectorRemappable var1) {
      return this.getObfField(var1.asFieldMapping());
   }

   @Override
   public ObfuscationData<MappingField> getObfField(MappingField var1) {
      ObfuscationData var2 = new ObfuscationData();

      for (ObfuscationEnvironment var4 : this.environments) {
         MappingField var5 = var4.getObfField(var1);
         if (var5 != null) {
            if (var5.getDesc() == null && var1.getDesc() != null) {
               var5 = var5.transform(var4.remapDescriptor(var1.getDesc()));
            }

            var2.put(var4.getType(), var5);
         }
      }

      return var2;
   }

   @Override
   public ObfuscationData<String> getObfClass(TypeHandle var1) {
      return this.getObfClass(var1.getName());
   }

   @Override
   public ObfuscationData<String> getObfClass(String var1) {
      ObfuscationData var2 = new ObfuscationData<>(var1);

      for (ObfuscationEnvironment var4 : this.environments) {
         String var5 = var4.getObfClass(var1);
         if (var5 != null) {
            var2.put(var4.getType(), var5);
         }
      }

      return var2;
   }

   private static <T> ObfuscationData<T> applyParents(ObfuscationData<String> var0, ObfuscationData<T> var1) {
      for (ObfuscationType var3 : var1) {
         String var4 = (String)var0.get(var3);
         Object var5 = var1.get(var3);
         var1.put(var3, MemberInfo.fromMapping((IMapping<?>)var5).move(var4).asMapping());
      }

      return var1;
   }
}
