package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.analysis.InheritanceType;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements InheritanceProvider {
   private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH CHROCCRRCRCRCIIROIROIHIHHRIOCO;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.CHROCCRRCRCRCIIROIROIHIHHRIOCO = var1;
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      if (var1.startsWith("[")) {
         return Optional.empty();
      }

      try {
         ClassNode var2 = this.CHROCCRRCRCRCIIROIROIHIHHRIOCO.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, true);
         if (var2 != null) {
            InheritanceProvider.ClassInfo var3 = OCOHORHCROHICRRIHCIHHRRCIHICRI(var2);
            return Optional.of(var3);
         }
      } catch (Exception var4) {
      }

      return Optional.empty();
   }

   public static InheritanceProvider.ClassInfo OCOHORHCROHICRRIHCIHHRRCIHICRI(ClassNode var0) {
      HashMap var1 = new HashMap();
      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();

      for (FieldNode var5 : var0.fields) {
         InheritanceType var6 = InheritanceType.fromModifiers(var5.access);
         var1.put(FieldSignature.of(var5.name, var5.desc), var6);
         var2.put(var5.name, var6);
      }

      for (MethodNode var8 : var0.methods) {
         InheritanceType var9 = InheritanceType.fromModifiers(var8.access);
         var3.put(MethodSignature.of(var8.name, var8.desc), var9);
      }

      return new InheritanceProvider.ClassInfo.Impl(var0.name, (var0.access & 512) != 0, var0.superName, var0.interfaces, var1, var2, var3) {
         @Override
         public synchronized Set<InheritanceProvider.ClassInfo> provideParents(InheritanceProvider var1) {
            return super.provideParents(var1);
         }
      };
   }
}
