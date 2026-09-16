package com.llamalad7.mixinextras.expression.impl.flow.expansion;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.FlowPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.StringConcatInfo;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class StringConcatFactoryExpander extends InsnExpander {
   private static final String STRING_CONCAT_FACTORY = "java/lang/invoke/StringConcatFactory";
   private static final Type STRING_BUILDER = Type.getType(StringBuilder.class);
   private static final Type STRING = Type.getType(String.class);

   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      AbstractInsnNode var3 = var1.getInsn();
      List var4 = this.parseConcat(var3);
      if (var4 != null) {
         FlowValue var5 = null;
         FlowValue var6 = null;
         ArrayList var7 = new ArrayList();
         int var8 = 0;
         int var9 = 1;

         for (int var10 = 0; var10 < var4.size(); var10++) {
            StringConcatFactoryExpander.ConcatPart var11 = (StringConcatFactoryExpander.ConcatPart)var4.get(var10);
            FlowValue var12;
            if (var11 instanceof StringConcatFactoryExpander.ConcatPart.Argument) {
               var12 = this.unwrapConcatArgument(var1.getInput(var8++), var2);
            } else {
               Object var13;
               if (var11 instanceof StringConcatFactoryExpander.ConcatPart.PooledConstant) {
                  var13 = ((StringConcatFactoryExpander.ConcatPart.PooledConstant)var11).value;
               } else {
                  var13 = ((StringConcatFactoryExpander.ConcatPart.TemplateString)var11).value;
               }

               LdcInsnNode var14 = new LdcInsnNode(var13);
               var12 = new FlowValue(ExpressionASMUtils.getNewType(var14), var14);
               this.registerComponent(var12, var11, var3);
               var2.registerFlow(var12);
            }

            if (var10 == 0) {
               var6 = var12;
               var5 = var12;
            } else {
               InsnNode var15 = dummyInsn();
               FlowValue[] var16 = new FlowValue[]{var5, var12};
               if (var10 == var4.size() - 1) {
                  var1.setInsn(var15);
                  var1.setParents(var16);
                  this.registerComponent(var1, StringConcatFactoryExpander.Component.TO_STRING, var3);
               } else {
                  var5 = new FlowValue(STRING_BUILDER, var15, var16);
                  this.registerComponent(var5, new StringConcatFactoryExpander.PartialResult(var9++), var3);
                  var2.registerFlow(var5);
                  var7.add(var5);
               }
            }
         }

         this.decorateConcat(var6, var7, var1);
      }
   }

   private void decorateConcat(FlowValue var1, List<FlowValue> var2, FlowValue var3) {
      boolean var4 = true;

      for (FlowValue var6 : var2) {
         var6.decorate("stringConcatInfo", new StringConcatInfo(var4, true, var1, null));
         var4 = false;
      }

      var3.decorate("stringConcatInfo", new StringConcatInfo(var4, false, var1, null));
   }

   private FlowValue unwrapConcatArgument(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      if (!var1.isComplex() && this.isStringValueOf(var1.getInsn())) {
         var2.markAsSynthetic(var1);
         return var1.getInput(0);
      } else {
         return var1;
      }
   }

   private boolean isStringValueOf(AbstractInsnNode var1) {
      if (var1.getOpcode() != 184) {
         return false;
      }

      MethodInsnNode var2 = (MethodInsnNode)var1;
      return var2.owner.equals(STRING.getInternalName()) && var2.name.equals("valueOf") && var2.desc.equals("(Ljava/lang/Object;)Ljava/lang/String;");
   }

   @Override
   public void expand(Target var1, InjectionNodes.InjectionNode var2, InsnExpander.Expansion var3) {
      InvokeDynamicInsnNode var4 = (InvokeDynamicInsnNode)var2.getCurrentTarget();
      Set var5 = var3.registeredInterests();
      if (var5.size() == 1 && var5.iterator().next() == StringConcatFactoryExpander.Component.TO_STRING) {
         var3.registerInsn(StringConcatFactoryExpander.Component.TO_STRING, var2.getCurrentTarget());
      } else {
         ArrayList var6 = new ArrayList();
         Type[] var7 = Type.getArgumentTypes(var4.desc);
         int[] var8 = this.storeArgs(var1, var7, var6::add);
         var6.add(this.makeNewBuilder());
         var6.add(new InsnNode(89));
         var1.method.maxStack += 2;
         var6.add(this.makeBuilderInit());
         int var9 = 0;
         int var10 = 0;

         for (StringConcatFactoryExpander.ConcatPart var12 : this.parseConcat(var4)) {
            Type var13;
            if (var12 instanceof StringConcatFactoryExpander.ConcatPart.Argument) {
               int var14 = var9++;
               var13 = var7[var14];
               var6.add(new VarInsnNode(var13.getOpcode(21), var8[var14]));
            } else {
               Object var16;
               if (var12 instanceof StringConcatFactoryExpander.ConcatPart.PooledConstant) {
                  var16 = ((StringConcatFactoryExpander.ConcatPart.PooledConstant)var12).value;
               } else {
                  var16 = ((StringConcatFactoryExpander.ConcatPart.TemplateString)var12).value;
               }

               AbstractInsnNode var15 = var3.registerInsn(var12, new LdcInsnNode(var16));
               var13 = ExpressionASMUtils.getNewType(var15);
               var1.method.maxStack = var1.method.maxStack + var13.getSize();
               var6.add(var15);
            }

            var6.add(var3.registerInsn(new StringConcatFactoryExpander.PartialResult(var10++), this.makeAppendCall(var13)));
         }

         var6.add(var3.registerInsn(StringConcatFactoryExpander.Component.TO_STRING, this.makeToStringCall()));
         this.expandInsn(var1, var2, var6.toArray(new AbstractInsnNode[0]));
      }
   }

   private List<StringConcatFactoryExpander.ConcatPart> parseConcat(AbstractInsnNode var1) {
      if (!(var1 instanceof InvokeDynamicInsnNode)) {
         return null;
      } else {
         InvokeDynamicInsnNode var2 = (InvokeDynamicInsnNode)var1;
         if (!var2.bsm.getOwner().equals("java/lang/invoke/StringConcatFactory")) {
            return null;
         } else if (var2.bsm.getName().equals("makeConcat")) {
            int var3 = Type.getArgumentTypes(var2.desc).length;
            return this.parseConcatWithConstants(new Object[]{StringUtils.repeat('\u0001', var3)});
         } else {
            return var2.bsm.getName().equals("makeConcatWithConstants") ? this.parseConcatWithConstants(var2.bsmArgs) : null;
         }
      }
   }

   private AbstractInsnNode makeNewBuilder() {
      return new TypeInsnNode(187, STRING_BUILDER.getInternalName());
   }

   private AbstractInsnNode makeBuilderInit() {
      return new MethodInsnNode(183, STRING_BUILDER.getInternalName(), "<init>", "()V", false);
   }

   private AbstractInsnNode makeAppendCall(Type var1) {
      if (var1.getSort() == 10) {
         var1 = ExpressionASMUtils.OBJECT_TYPE;
      }

      return new MethodInsnNode(182, STRING_BUILDER.getInternalName(), "append", Type.getMethodDescriptor(STRING_BUILDER, var1), false);
   }

   private AbstractInsnNode makeToStringCall() {
      return new MethodInsnNode(182, STRING_BUILDER.getInternalName(), "toString", Type.getMethodDescriptor(STRING), false);
   }

   private List<StringConcatFactoryExpander.ConcatPart> parseConcatWithConstants(Object[] var1) {
      String var2 = (String)var1[0];
      ArrayList var3 = new ArrayList();
      int var4 = 0;
      int var5 = 1;
      StringBuilder var6 = null;

      for (int var7 = 0; var7 < var2.length(); var7++) {
         char var8 = var2.charAt(var7);
         if ((var8 == 1 || var8 == 2) && var6 != null) {
            var3.add(new StringConcatFactoryExpander.ConcatPart.TemplateString(var4++, var6.toString()));
            var6 = null;
         }

         switch (var8) {
            case '\u0001':
               var3.add(new StringConcatFactoryExpander.ConcatPart.Argument(var4++));
               break;
            case '\u0002':
               var3.add(new StringConcatFactoryExpander.ConcatPart.PooledConstant(var4++, var1[var5++]));
               break;
            default:
               if (var6 == null) {
                  var6 = new StringBuilder();
               }

               var6.append(var8);
         }
      }

      if (var6 != null) {
         var3.add(new StringConcatFactoryExpander.ConcatPart.TemplateString(var4, var6.toString()));
      }

      return var3;
   }

   private int[] storeArgs(Target var1, Type[] var2, Consumer<AbstractInsnNode> var3) {
      int[] var4 = new int[var2.length];

      for (int var5 = var2.length - 1; var5 >= 0; var5--) {
         Type var6 = var2[var5];
         int var7 = var1.allocateLocals(var6.getSize());
         var1.addLocalVariable(var7, "concatTemp" + var7, var6.getDescriptor());
         var4[var5] = var7;
         var3.accept(new VarInsnNode(var6.getOpcode(54), var7));
      }

      return var4;
   }

   private enum Component implements InsnExpander.InsnComponent {
      TO_STRING;
   }

   private abstract static class ConcatPart implements InsnExpander.InsnComponent {
      private final int id;

      private ConcatPart(int var1) {
         this.id = var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            StringConcatFactoryExpander.ConcatPart var2 = (StringConcatFactoryExpander.ConcatPart)var1;
            return this.id == var2.id;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.getClass(), this.id);
      }

      public static class Argument extends StringConcatFactoryExpander.ConcatPart {
         public Argument(int var1) {
            super(var1);
         }
      }

      public static class PooledConstant extends StringConcatFactoryExpander.ConcatPart {
         public final Object value;

         public PooledConstant(int var1, Object var2) {
            super(var1);
            this.value = var2;
         }
      }

      public static class TemplateString extends StringConcatFactoryExpander.ConcatPart {
         public final String value;

         public TemplateString(int var1, String var2) {
            super(var1);
            this.value = var2;
         }
      }
   }

   private static class PartialResult implements InsnExpander.InsnComponent {
      public final int finishedParts;

      private PartialResult(int var1) {
         this.finishedParts = var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            StringConcatFactoryExpander.PartialResult var2 = (StringConcatFactoryExpander.PartialResult)var1;
            return this.finishedParts == var2.finishedParts;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.getClass(), this.finishedParts);
      }
   }
}
