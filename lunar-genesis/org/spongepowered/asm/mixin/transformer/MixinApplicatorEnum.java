package org.spongepowered.asm.mixin.transformer;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.MixinIntrinsics;
import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.struct.Clinit;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.include.com.google.common.collect.ArrayListMultimap;

class MixinApplicatorEnum extends MixinApplicatorStandard {
   private final Map<IMixinInfo, EnumInfo> extensionInfos = new HashMap<>();
   private EnumInfo targetInfo;
   private int ordinalShift;
   private FieldNode insertionPoint;

   MixinApplicatorEnum(TargetClassContext var1) {
      super(var1);
   }

   @Override
   protected void preApply(IActivityContext.IActivity var1, List<MixinTargetContext> var2) {
      this.gatherEnumExtensions(var2);
      this.sortEnumExtensions(var2);
      super.preApply(var1, var2);
      if (!this.extensionInfos.isEmpty()) {
         this.prepareTargetInfo(var2);
         this.checkUniqueEnumConstants(var2);
         this.permitEnumSubclasses(var2);
         this.replaceValueOf();
      }
   }

   private void gatherEnumExtensions(List<MixinTargetContext> var1) {
      Iterator var2 = var1.iterator();

      while (var2.hasNext()) {
         MixinTargetContext var3 = (MixinTargetContext)var2.next();
         if (var3.getClassInfo().isEnum()) {
            try {
               this.extensionInfos.put(var3.getInfo(), EnumInfo.forMixin(var3));
            } catch (InvalidMixinException var5) {
               if (var3.isRequired()) {
                  throw var5;
               }

               this.context.addSuppressed(var5);
               var2.remove();
            }
         }
      }
   }

   private void sortEnumExtensions(List<MixinTargetContext> var1) {
      Comparator var2 = Comparator.comparing(var1x -> this.extensionInfos.get(var1x.getInfo()), Comparator.nullsLast(Comparator.naturalOrder()));
      var1.sort(Comparator.comparing(MixinTargetContext::getPriority).thenComparing(var2));
   }

   private void prepareTargetInfo(List<MixinTargetContext> var1) {
      try {
         this.targetInfo = EnumInfo.forTarget(this.context);
         List var7 = this.targetInfo.getConstants();
         this.ordinalShift = var7.size();
         if (!var7.isEmpty()) {
            this.insertionPoint = (FieldNode)var7.get(var7.size() - 1);
         }
      } catch (EnumInfo.AssumptionViolatedException var6) {
         EnumInfo.AssumptionViolatedException var2 = var6;
         Iterator var3 = var1.iterator();

         while (var3.hasNext()) {
            MixinTargetContext var4 = (MixinTargetContext)var3.next();
            if (var4.getClassInfo().isEnum()) {
               InvalidMixinException var5 = new InvalidMixinException(var4, var2);
               if (var4.isRequired()) {
                  throw var5;
               }

               this.context.addSuppressed(var5);
               var3.remove();
            }
         }
      }
   }

   private void checkUniqueEnumConstants(List<MixinTargetContext> var1) {
      ArrayListMultimap var2 = ArrayListMultimap.create();

      for (FieldNode var4 : this.targetInfo.getSelfTypedFields()) {
         var2.put(var4.name, null);
      }

      for (MixinTargetContext var13 : var1) {
         for (FieldNode var6 : var13.getFields()) {
            if (var6.desc.equals('L' + this.targetClass.name + ';')) {
               var2.put(var6.name, var13);
            }
         }
      }

      Iterator var12 = var1.iterator();

      while (var12.hasNext()) {
         MixinTargetContext var14 = (MixinTargetContext)var12.next();
         EnumInfo var15 = this.extensionInfos.get(var14.getInfo());
         if (var15 != null) {
            for (FieldNode var7 : var15.getConstants()) {
               Collection var8 = var2.get(var7.name);
               if (var8.size() >= 2) {
                  List var9 = var8.stream()
                     .filter(var1x -> var1x != var14)
                     .map(var0 -> var0 == null ? "target class" : var0.toString())
                     .collect(Collectors.toList());
                  InvalidMixinException var10 = new InvalidMixinException(
                     var14, String.format("Added enum constant %s conflicts with field declared in %s", var7.name, var9)
                  );
                  if (var14.isRequired()) {
                     throw var10;
                  }

                  this.context.addSuppressed(var10);
                  var12.remove();
                  this.extensionInfos.remove(var14.getInfo());
                  break;
               }
            }
         }
      }
   }

   private void permitEnumSubclasses(List<MixinTargetContext> var1) {
      boolean var2;
      if (Bytecode.hasFlag(this.targetClass, 16)) {
         var2 = false;
      } else {
         if (this.targetClass.permittedSubclasses == null || this.targetClass.permittedSubclasses.isEmpty()) {
            return;
         }

         var2 = true;
      }

      for (MixinTargetContext var4 : var1) {
         if (var4.getClassInfo().isEnum() && !var4.getClassInfo().isFinal()) {
            if (!var2) {
               this.targetClass.access &= -17;
               return;
            }

            for (Entry var6 : var4.getInnerClasses().entrySet()) {
               ClassInfo var7 = ClassInfo.forName((String)var6.getKey());
               if (var7.getSuperName().equals(var4.getClassRef())) {
                  this.targetClass.permittedSubclasses.add((String)var6.getValue());
               }
            }
         }
      }
   }

   private void replaceValueOf() {
      String var1 = "(Ljava/lang/String;)L" + this.targetClass.name + ';';
      MethodNode var2 = Bytecode.findMethod(this.targetClass, "valueOf", var1);
      this.targetClass.methods.remove(var2);
      MethodNode var3 = new MethodNode(9, "valueOf", var1, null, null);
      this.targetClass.methods.add(var3);
      var3.visitLdcInsn(Type.getObjectType(this.targetClass.name));
      var3.visitVarInsn(25, 0);
      var3.visitMethodInsn(184, Type.getInternalName(Enum.class), "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
      var3.visitTypeInsn(192, this.targetClass.name);
      var3.visitInsn(176);
      var3.visitMaxs(2, 1);
   }

   @Override
   protected void applyNormalMethod(MixinTargetContext var1, MethodNode var2) {
      if (var1.getClassInfo().isEnum() && "<init>".equals(var2.name) && Bytecode.hasFlag(var2, 4096)) {
         var1.transformMethod(var2);
         super.mergeMethod(var1, var2);
      } else {
         super.applyNormalMethod(var1, var2);
      }
   }

   @Override
   protected void mergeNormalField(MixinTargetContext var1, FieldNode var2, int var3) {
      if (var1.getClassInfo().isEnum()) {
         if (Bytecode.isEnumConstant(var2, this.targetClass)) {
            return;
         }

         if (Bytecode.isEnumValuesArray(var2, this.targetClass)) {
            return;
         }
      }

      super.mergeNormalField(var1, var2, var3);
   }

   @Override
   protected void applyFields(MixinTargetContext var1) {
      super.applyFields(var1);
      EnumInfo var2 = this.extensionInfos.get(var1.getInfo());
      if (var2 != null) {
         this.applyEnumFields(var2, var1);
      }
   }

   private void applyEnumFields(EnumInfo var1, MixinTargetContext var2) {
      this.targetClass.fields.removeAll(var1.getConstants().stream().map(this::findTargetField).filter(Objects::nonNull).collect(Collectors.toSet()));
      List var3 = this.targetClass.fields;
      int var4 = this.insertionPoint == null ? 0 : var3.lastIndexOf(this.insertionPoint) + 1;

      for (FieldNode var6 : var1.getConstants()) {
         super.mergeNormalField(var2, var6, var4++);
         this.insertionPoint = var6;
      }
   }

   @Override
   protected Clinit prepareOrCreateClinit() {
      return this.targetInfo == null ? super.prepareOrCreateClinit() : new MixinApplicatorEnum.EnumClinit();
   }

   private class EnumClinit extends Clinit {
      public EnumClinit() {
         this(MixinApplicatorEnum.this.context.getTargetMethod(MixinApplicatorEnum.this.targetInfo.getClinit()));
      }

      private EnumClinit(Target var2) {
         super(var2.method, Clinit.prepareClinit(var2.method, var2));
      }

      @Override
      protected void appendInsns(IMixinInfo var1, MethodNode var2, Map<LabelNode, LabelNode> var3) {
         EnumInfo var4 = MixinApplicatorEnum.this.extensionInfos.get(var1);
         if (var4 == null) {
            super.appendInsns(var1, var2, var3);
         } else {
            this.spliceEnumClinit(var1, var4, var3);
         }
      }

      private void spliceEnumClinit(IMixinInfo var1, EnumInfo var2, Map<LabelNode, LabelNode> var3) {
         HashSet var4 = new HashSet<>(var2.getConstantNames());
         InsnList var5 = this.clinit.instructions;
         FieldInsnNode var6 = MixinApplicatorEnum.this.targetInfo.getValuesAssignment();
         InsnList var7 = var2.getClinit().instructions;
         Integer var8 = null;

         for (AbstractInsnNode var9 = var7.getFirst(); var9 != var2.getValuesAssignment(); var9 = var9.getNext()) {
            if (var8 == null) {
               if (!var4.isEmpty()) {
                  Object var10 = Bytecode.getConstant(var9);
                  if (var10 instanceof Integer) {
                     var8 = (Integer)var10 + MixinApplicatorEnum.this.ordinalShift;
                     var5.insertBefore(var6, Bytecode.loadIntConstant(var8));
                     continue;
                  }
               }
            } else if (this.isCurrentOrdinalCall(var9)) {
               var5.insertBefore(var6, Bytecode.loadIntConstant(var8));
               continue;
            }

            var5.insertBefore(var6, var9.clone(var3));
            if (var2.isEnumConstantAssignment(var9)) {
               String var12 = ((FieldInsnNode)var9).name;
               if (!var4.remove(var12)) {
                  throw new InvalidMixinException(var1, "Duplicate assignment to enum constant " + var12);
               }

               var8 = null;
            }
         }

         if (!var4.isEmpty()) {
            throw new InvalidMixinException(var1, "Enum constants not assigned: " + var4);
         }

         var7.insertBefore(var6, this.concatEnumValues());

         for (AbstractInsnNode var11 = var2.getValuesAssignment().getNext(); var11 != null; var11 = var11.getNext()) {
            if (var11.getOpcode() != 177) {
               var5.insertBefore(this.finalReturn, var11.clone(var3));
            }
         }

         MixinApplicatorEnum.this.ordinalShift += var2.getConstants().size();
      }

      private InsnList concatEnumValues() {
         InsnList var1 = new InsnList();
         var1.add(
            new MethodInsnNode(184, Type.getInternalName(MixinHooks.class), "concatEnumValues", "([Ljava/lang/Enum;[Ljava/lang/Enum;)[Ljava/lang/Enum;", false)
         );
         var1.add(new TypeInsnNode(192, "[L" + MixinApplicatorEnum.this.targetClass.name + ';'));
         return var1;
      }

      private boolean isCurrentOrdinalCall(AbstractInsnNode var1) {
         if (var1.getOpcode() != 184) {
            return false;
         }

         MethodInsnNode var2 = (MethodInsnNode)var1;
         return var2.owner.equals(Type.getInternalName(MixinIntrinsics.class)) && var2.name.equals("currentEnumOrdinal");
      }
   }
}
