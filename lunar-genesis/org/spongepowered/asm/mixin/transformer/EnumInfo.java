package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Bytecode;

final class EnumInfo implements Comparable<EnumInfo> {
   private final ClassContext enumClass;
   private final ClassContext targetClass;
   private final String description;
   private final List<FieldNode> selfTypedFields;
   private final List<FieldNode> constants;
   private final Set<String> constantNames;
   private final FieldNode valuesField;
   private final MethodNode clinit;
   private final FieldInsnNode valuesAssignment;
   private final String tieBreakString;

   private EnumInfo(ClassContext var1, ClassContext var2, String var3) {
      this.enumClass = var1;
      this.targetClass = var2;
      this.description = var3;
      this.clinit = this.findClinit();
      this.selfTypedFields = this.findSelfTypedFields();
      this.constants = this.findEnumConstants();
      this.constantNames = this.constants.stream().map(var0 -> var0.name).collect(Collectors.toSet());
      this.valuesField = this.findValuesField();
      this.valuesAssignment = this.findValuesAssignment();
      this.tieBreakString = this.constants.isEmpty() ? "" : this.constants.get(0).name;
   }

   public static EnumInfo forTarget(TargetClassContext var0) {
      return new EnumInfo(var0, var0, "target class");
   }

   public static EnumInfo forMixin(MixinTargetContext var0) {
      try {
         return new EnumInfo(var0, var0.getTarget(), "mixin class");
      } catch (EnumInfo.AssumptionViolatedException var2) {
         throw new InvalidMixinException(var0, var2);
      }
   }

   public List<FieldNode> getSelfTypedFields() {
      return this.selfTypedFields;
   }

   public List<FieldNode> getConstants() {
      return this.constants;
   }

   public Set<String> getConstantNames() {
      return this.constantNames;
   }

   public FieldInsnNode getValuesAssignment() {
      return this.valuesAssignment;
   }

   public MethodNode getClinit() {
      return this.clinit;
   }

   public boolean isEnumConstantAssignment(AbstractInsnNode var1) {
      if (!(var1 instanceof FieldInsnNode)) {
         return false;
      }

      FieldInsnNode var2 = (FieldInsnNode)var1;
      return this.constantNames.contains(var2.name) && this.isAssignmentToOurStaticField(var1, var2.name, false);
   }

   public int compareTo(EnumInfo var1) {
      return this.tieBreakString.compareTo(var1.tieBreakString);
   }

   private MethodNode findClinit() {
      MethodNode var1 = Bytecode.findMethod(this.enumClass.getClassNode(), "<clinit>", "()V");
      if (var1 == null) {
         throw assumptionViolated("Failed to find <clinit> in %s", this.description);
      } else {
         return var1;
      }
   }

   private FieldNode findValuesField() {
      ArrayList var1 = new ArrayList();

      for (FieldNode var3 : this.enumClass.getClassNode().fields) {
         if (Bytecode.isEnumValuesArray(var3, this.targetClass.getClassNode())) {
            var1.add(var3);
         }
      }

      if (var1.size() != 1) {
         throw assumptionViolated(
            "Failed to determine enum values array in %s, candidates: %s", this.description, var1.stream().map(var0 -> var0.name).collect(Collectors.toList())
         );
      } else {
         return (FieldNode)var1.get(0);
      }
   }

   private FieldInsnNode findValuesAssignment() {
      FieldInsnNode var1 = null;

      for (AbstractInsnNode var3 : this.clinit.instructions) {
         if (this.isAssignmentToOurStaticField(var3, this.valuesField.name, true)) {
            if (var1 != null) {
               throw assumptionViolated("Duplicate enum values assignment in %s (%s)", this.description, this.valuesField.name);
            }

            var1 = (FieldInsnNode)var3;
         }
      }

      return var1;
   }

   private List<FieldNode> findSelfTypedFields() {
      String var1 = 'L' + this.targetClass.getClassRef() + ';';
      ArrayList var2 = new ArrayList();

      for (FieldNode var4 : this.enumClass.getClassNode().fields) {
         if (var4.desc.equals(var1) && !isStubEnumConstant(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   private List<FieldNode> findEnumConstants() {
      ArrayList var1 = new ArrayList();

      for (FieldNode var3 : this.selfTypedFields) {
         if (Bytecode.isEnumConstant(var3, this.targetClass.getClassNode())) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private boolean isAssignmentToOurStaticField(AbstractInsnNode var1, String var2, boolean var3) {
      if (var1.getOpcode() != 179) {
         return false;
      }

      FieldInsnNode var4 = (FieldInsnNode)var1;

      for (ClassContext var8 : new ClassContext[]{this.enumClass, this.targetClass}) {
         if (var4.owner.equals(var8.getClassRef()) && var4.name.equals(var2) && var4.desc.equals((var3 ? "[L" : "L") + var8.getClassRef() + ';')) {
            return true;
         }
      }

      return false;
   }

   private static boolean isStubEnumConstant(FieldNode var0) {
      return var0.attrs != null && var0.attrs.stream().anyMatch(var0x -> var0x.type.equals("org.spongepowered.asm.mixin.StubEnumConstant"));
   }

   private static EnumInfo.AssumptionViolatedException assumptionViolated(String var0, Object... var1) {
      return new EnumInfo.AssumptionViolatedException(String.format(var0, var1));
   }

   public static final class AssumptionViolatedException extends Exception {
      private AssumptionViolatedException(String var1) {
         super(var1);
      }
   }
}
