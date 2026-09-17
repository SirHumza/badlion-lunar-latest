package com.llamalad7.mixinextras.expression.impl.pool;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;

public class BytecodeIdentifierPool extends IdentifierPool {
   public BytecodeIdentifierPool(Target var1, InjectionInfo var2, AnnotationNode var3) {
      for (AnnotationNode var5 : Annotations.getValue(var3, "value", true)) {
         this.parseEntry(var5, var1, var2);
      }
   }

   private void parseEntry(AnnotationNode var1, Target var2, InjectionInfo var3) {
      String var4 = Annotations.getValue(var1, "id");

      for (String var6 : Annotations.getValue(var1, "method", true)) {
         this.addMember(var4, new MethodDef(var6, var3));
      }

      for (String var10 : Annotations.getValue(var1, "field", true)) {
         this.addMember(var4, new FieldDef(var10, var3));
      }

      for (Type var11 : Annotations.getValue(var1, "type", true)) {
         this.addType(var4, new ExactTypeDef(var11));
      }

      for (AnnotationNode var12 : Annotations.getValue(var1, "local", true)) {
         this.addMember(var4, new LocalDef(var12, var3, var2));
      }
   }
}
