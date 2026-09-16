package org.cadixdev.bombe.analysis.asm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.analysis.InheritanceType;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

class InheritanceClassInfoVisitor extends ClassVisitor {
   private String name;
   private boolean isInterface;
   private String superName;
   private List<String> interfaces = Collections.emptyList();
   private final Map<FieldSignature, InheritanceType> fields = new HashMap<>();
   private final Map<String, InheritanceType> fieldsByName = new HashMap<>();
   private final Map<MethodSignature, InheritanceType> methods = new HashMap<>();

   InheritanceClassInfoVisitor(int var1) {
      super(var1);
   }

   InheritanceProvider.ClassInfo create() {
      return new InheritanceProvider.ClassInfo.Impl(this.name, this.isInterface, this.superName, this.interfaces, this.fields, this.fieldsByName, this.methods);
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.name = var3;
      this.isInterface = (var2 & 512) != 0;
      this.superName = var5;
      this.interfaces = Arrays.asList(var6);
   }

   @Override
   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      InheritanceType var6 = InheritanceType.fromModifiers(var1);
      this.fields.put(FieldSignature.of(var2, var3), var6);
      this.fieldsByName.put(var2, var6);
      return null;
   }

   @Override
   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      this.methods.put(MethodSignature.of(var2, var3), InheritanceType.fromModifiers(var1));
      return null;
   }
}
