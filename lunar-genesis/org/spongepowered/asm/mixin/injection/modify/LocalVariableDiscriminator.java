package org.spongepowered.asm.mixin.injection.modify;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Locals;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

public class LocalVariableDiscriminator {
   private final boolean argsOnly;
   private final int ordinal;
   private final int index;
   private final Set<String> names;
   private final boolean print;

   public LocalVariableDiscriminator(boolean var1, int var2, int var3, Set<String> var4, boolean var5) {
      this.argsOnly = var1;
      this.ordinal = var2;
      this.index = var3;
      this.names = Collections.unmodifiableSet(var4);
      this.print = var5;
   }

   public boolean isArgsOnly() {
      return this.argsOnly;
   }

   public int getOrdinal() {
      return this.ordinal;
   }

   public int getIndex() {
      return this.index;
   }

   public Set<String> getNames() {
      return this.names;
   }

   public boolean hasNames() {
      return !this.names.isEmpty();
   }

   public boolean printLVT() {
      return this.print;
   }

   @Override
   public String toString() {
      return String.format("ordinal=%d index=%d", this.ordinal, this.index);
   }

   public String toString(LocalVariableDiscriminator.Context var1) {
      String var2 = SignaturePrinter.getTypeName(var1.returnType, false, false);
      return this.isImplicit(var1) ? "implicit " + var2 : String.format("explicit %s at ordinal=%d index=%d", var2, this.ordinal, this.index);
   }

   protected boolean isImplicit(LocalVariableDiscriminator.Context var1) {
      return this.ordinal < 0 && this.index < var1.baseArgIndex && this.names.isEmpty();
   }

   public int findLocal(LocalVariableDiscriminator.Context var1) {
      return this.isImplicit(var1) ? this.findImplicitLocal(var1) : this.findExplicitLocal(var1);
   }

   private int findImplicitLocal(LocalVariableDiscriminator.Context var1) {
      int var2 = 0;
      int var3 = 0;

      for (int var4 = var1.baseArgIndex; var4 < var1.locals.length; var4++) {
         LocalVariableDiscriminator.Context.Local var5 = var1.locals[var4];
         if (var5 != null && var5.type.equals(var1.returnType)) {
            var3++;
            var2 = var4;
         }
      }

      if (var3 == 1) {
         return var2;
      } else {
         throw new InvalidImplicitDiscriminatorException("Found " + var3 + " candidate variables but exactly 1 is required.");
      }
   }

   private int findExplicitLocal(LocalVariableDiscriminator.Context var1) {
      for (int var2 = var1.baseArgIndex; var2 < var1.locals.length; var2++) {
         LocalVariableDiscriminator.Context.Local var3 = var1.locals[var2];
         if (var3 != null && var3.type.equals(var1.returnType)) {
            if (this.ordinal > -1) {
               if (this.ordinal == var3.getOrdinal()) {
                  return var2;
               }
            } else if (this.index >= var1.baseArgIndex) {
               if (this.index == var2) {
                  return var2;
               }
            } else if (this.names.contains(var3.name)) {
               return var2;
            }
         }
      }

      return -1;
   }

   public static LocalVariableDiscriminator parse(AnnotationNode var0) {
      boolean var1 = Annotations.getValue(var0, "argsOnly", Boolean.FALSE);
      int var2 = Annotations.getValue(var0, "ordinal", -1);
      int var3 = Annotations.getValue(var0, "index", -1);
      boolean var4 = Annotations.getValue(var0, "print", Boolean.FALSE);
      HashSet var5 = new HashSet();
      List var6 = Annotations.getValue(var0, "name", (List)null);
      if (var6 != null) {
         var5.addAll(var6);
      }

      return new LocalVariableDiscriminator(var1, var2, var3, var5, var4);
   }

   public static class Context implements PrettyPrinter.IPrettyPrintable {
      final InjectionInfo info;
      final Target target;
      final Type returnType;
      final AbstractInsnNode node;
      final int baseArgIndex;
      final LocalVariableDiscriminator.Context.Local[] locals;
      private final boolean isStatic;

      public Context(InjectionInfo var1, Type var2, boolean var3, Target var4, AbstractInsnNode var5) {
         this.info = var1;
         this.isStatic = Bytecode.isStatic(var4.method);
         this.returnType = var2;
         this.target = var4;
         this.node = var5;
         this.baseArgIndex = this.isStatic ? 0 : 1;
         this.locals = this.initLocals(var4, var3, var5);
         this.initOrdinals();
      }

      private LocalVariableDiscriminator.Context.Local[] initLocals(Target var1, boolean var2, AbstractInsnNode var3) {
         if (!var2) {
            LocalVariableNode[] var4 = Locals.getLocalsAt(var1.classNode, var1.method, var3, FabricUtil.getCompatibility(this.info));
            if (var4 != null) {
               return this.getLocals(var4);
            }
         }

         int var7 = FabricUtil.getCompatibility(this.info);
         boolean var5 = var7 < 17000;
         LocalVariableNode[] var6 = Locals.getInitialMethodLocals(var1.method, var1.classNode, var7, var5);
         return this.getLocals(var6);
      }

      private LocalVariableDiscriminator.Context.Local[] getLocals(LocalVariableNode[] var1) {
         LocalVariableDiscriminator.Context.Local[] var2 = new LocalVariableDiscriminator.Context.Local[var1.length];

         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var1[var3] != null) {
               var2[var3] = new LocalVariableDiscriminator.Context.Local(var1[var3].name, Type.getType(var1[var3].desc));
            }
         }

         return var2;
      }

      private void initOrdinals() {
         HashMap var1 = new HashMap();

         for (int var2 = 0; var2 < this.locals.length; var2++) {
            Integer var3 = 0;
            if (this.locals[var2] != null) {
               var3 = (Integer)var1.get(this.locals[var2].type);
               Integer var5;
               var1.put(this.locals[var2].type, var5 = var3 == null ? 0 : var3 + 1);
               this.locals[var2].setOrdinal(var5);
            }
         }
      }

      public int getCandidateCount() {
         int var1 = 0;

         for (int var2 = this.baseArgIndex; var2 < this.locals.length; var2++) {
            if (this.locals[var2] != null && this.returnType.equals(this.locals[var2].type)) {
               var1++;
            }
         }

         return var1;
      }

      @Override
      public void print(PrettyPrinter var1) {
         var1.add("%5s  %7s  %30s  %-50s  %s", "INDEX", "ORDINAL", "TYPE", "NAME", "CANDIDATE");

         for (int var2 = this.baseArgIndex; var2 < this.locals.length; var2++) {
            LocalVariableDiscriminator.Context.Local var3 = this.locals[var2];
            if (var3 != null) {
               Type var4 = var3.type;
               String var5 = var3.name;
               int var6 = var3.getOrdinal();
               String var7 = this.returnType.equals(var4) ? "YES" : "-";
               var1.add("[%3d]    [%3d]  %30s  %-50s  %s", var2, var6, SignaturePrinter.getTypeName(var4, false), var5, var7);
            } else if (var2 > 0) {
               LocalVariableDiscriminator.Context.Local var8 = this.locals[var2 - 1];
               boolean var9 = var8 != null && var8.type != null && var8.type.getSize() > 1;
               var1.add("[%3d]           %30s", var2, var9 ? "<top>" : "-");
            }
         }
      }

      public class Local {
         private int ord = -1;
         final String name;
         final Type type;

         public Local(String var2, Type var3) {
            this.name = var2;
            this.type = var3;
         }

         @Override
         public String toString() {
            return String.format("Local[ordinal=%d, name=%s, type=%s]", this.ord, this.name, this.type);
         }

         void setOrdinal(int var1) {
            if (this.ord > -1 && this.ord != var1) {
               throw new IllegalStateException("Attempted to reset ordinal for computed local");
            }

            this.ord = var1;
         }

         int getOrdinal() {
            return this.ord;
         }
      }
   }
}
