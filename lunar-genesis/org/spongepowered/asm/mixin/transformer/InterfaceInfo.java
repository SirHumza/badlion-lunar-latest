package org.spongepowered.asm.mixin.transformer;

import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.transformer.meta.MixinRenamed;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Annotations;

final class InterfaceInfo {
   private final MixinInfo mixin;
   private final String prefix;
   private final Type iface;
   private final boolean unique;
   private Set<String> methods;

   private InterfaceInfo(MixinInfo var1, String var2, Type var3, boolean var4) {
      if (var2 != null && var2.length() >= 2 && var2.endsWith("$")) {
         this.mixin = var1;
         this.prefix = var2;
         this.iface = var3;
         this.unique = var4;
      } else {
         throw new InvalidMixinException(var1, String.format("Prefix %s for iface %s is not valid", var2, var3.toString()));
      }
   }

   private void initMethods() {
      this.methods = new HashSet<>();
      this.readInterface(this.iface.getInternalName());
   }

   private void readInterface(String var1) {
      ClassInfo var2 = ClassInfo.forName(var1);

      for (ClassInfo.Method var4 : var2.getMethods()) {
         this.methods.add(var4.toString());
      }

      for (String var6 : var2.getInterfaces()) {
         this.readInterface(var6);
      }
   }

   public String getName() {
      return this.iface.getClassName();
   }

   public String getInternalName() {
      return this.iface.getInternalName();
   }

   public boolean renameMethod(MethodNode var1) {
      if (this.methods == null) {
         this.initMethods();
      }

      if (!var1.name.startsWith(this.prefix)) {
         if (this.methods.contains(var1.name + var1.desc)) {
            this.decorateUniqueMethod(var1);
         }

         return false;
      } else {
         String var2 = var1.name.substring(this.prefix.length());
         String var3 = var2 + var1.desc;
         if (!this.methods.contains(var3)) {
            throw new InvalidMixinException(this.mixin, String.format("%s does not exist in target interface %s", var2, this.getName()));
         }

         if ((var1.access & 1) == 0) {
            throw new InvalidMixinException(this.mixin, String.format("%s cannot implement %s because it is not visible", var2, this.getName()));
         }

         Annotations.setVisible(var1, MixinRenamed.class, "originalName", var1.name, "isInterfaceMember", true);
         this.decorateUniqueMethod(var1);
         var1.name = var2;
         return true;
      }
   }

   private void decorateUniqueMethod(MethodNode var1) {
      if (this.unique) {
         if (Annotations.getVisible(var1, Unique.class) == null) {
            Annotations.setVisible(var1, Unique.class);
            this.mixin.getClassInfo().findMethod(var1).setUnique(true);
         }
      }
   }

   static InterfaceInfo fromAnnotation(MixinInfo var0, AnnotationNode var1) {
      String var2 = Annotations.getValue(var1, "prefix");
      Type var3 = Annotations.getValue(var1, "iface");
      Boolean var4 = Annotations.getValue(var1, "unique");
      if (var2 != null && var3 != null) {
         return new InterfaceInfo(var0, var2, var3, var4 != null && var4);
      } else {
         throw new InvalidMixinException(var0, String.format("@Interface annotation on %s is missing a required parameter", var0));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         InterfaceInfo var2 = (InterfaceInfo)var1;
         return this.mixin.equals(var2.mixin) && this.prefix.equals(var2.prefix) && this.iface.equals(var2.iface);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.mixin.hashCode();
      var1 = 31 * var1 + this.prefix.hashCode();
      return 31 * var1 + this.iface.hashCode();
   }
}
