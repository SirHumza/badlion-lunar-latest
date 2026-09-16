package com.llamalad7.mixinextras.expression.impl.flow;

import com.llamalad7.mixinextras.expression.impl.flow.expansion.IincExpander;
import com.llamalad7.mixinextras.expression.impl.flow.expansion.StringConcatFactoryExpander;
import com.llamalad7.mixinextras.expression.impl.flow.expansion.UnaryComparisonExpander;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.CallTaggingPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.FlowPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.InstantiationPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.LMFPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.NewArrayPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.SplitNodeRemovalPostProcessor;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.StringConcatPostProcessor;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.Interpreter;
import org.spongepowered.asm.util.asm.ASM;

public class FlowInterpreter extends Interpreter<FlowValue> {
   private final FlowContext context;
   private final Map<AbstractInsnNode, FlowValue> cache = new IdentityHashMap<>();
   private final Map<VarInsnNode, Type> localTypes;
   private final List<FlowPostProcessor> postProcessors;

   protected FlowInterpreter(ClassNode var1, MethodNode var2, FlowContext var3) {
      super(ASM.API_VERSION);
      this.context = var3;
      this.localTypes = LocalsCalculator.getLocalTypes(var1, var2, var3);
      this.postProcessors = Arrays.asList(
         new NewArrayPostProcessor(var2),
         new IincExpander(),
         new UnaryComparisonExpander(),
         new StringConcatFactoryExpander(),
         new InstantiationPostProcessor(),
         new StringConcatPostProcessor(),
         new CallTaggingPostProcessor(var1, var2),
         new LMFPostProcessor(var1),
         new SplitNodeRemovalPostProcessor()
      );
   }

   public static Collection<FlowValue> analyze(ClassNode var0, MethodNode var1, FlowContext var2) {
      FlowInterpreter var3 = new FlowInterpreter(var0, var1, var2);

      try {
         new Analyzer<>(var3).analyze(var0.name, var1);
      } catch (AnalyzerException var5) {
         throw new RuntimeException("Failed to analyze value flow: ", var5);
      }

      return new ArrayList<>(var3.finish());
   }

   public Collection<FlowValue> finish() {
      Set var1 = Collections.newSetFromMap(new IdentityHashMap());
      var1.addAll(this.cache.values());

      for (FlowValue var3 : var1) {
         var3.finish();
      }

      for (FlowValue var11 : var1) {
         var11.onFinished();
      }

      for (FlowPostProcessor var12 : this.postProcessors) {
         final Set var4 = Collections.newSetFromMap(new IdentityHashMap());
         final ArrayList var5 = new ArrayList();
         FlowPostProcessor.OutputSink var6 = new FlowPostProcessor.OutputSink() {
            @Override
            public void markAsSynthetic(FlowValue var1) {
               if (!var1.isComplex()) {
                  var4.add(var1);
               }
            }

            @Override
            public void registerFlow(FlowValue... var1) {
               for (FlowValue var5x : var1) {
                  if (!var5x.isComplex()) {
                     var5.add(var5x);
                  }
               }
            }
         };

         for (FlowValue var8 : var1) {
            var12.process(var8, var6);
         }

         var1.removeAll(var4);

         for (FlowValue var16 : var4) {
            var16.setParents();
         }

         var1.addAll(var5);

         for (FlowValue var17 : var1) {
            var17.finish();
         }

         for (FlowValue var18 : var1) {
            var18.onFinished();
         }
      }

      return var1;
   }

   public FlowValue newValue(Type var1) {
      if (var1 == null) {
         return DummyFlowValue.UNINITIALIZED;
      } else {
         return var1 == Type.VOID_TYPE ? null : new DummyFlowValue(var1);
      }
   }

   public FlowValue newOperation(AbstractInsnNode var1) {
      Type var2 = ExpressionASMUtils.getNewType(var1);
      return this.recordFlow(var2, var1);
   }

   public FlowValue copyOperation(AbstractInsnNode var1, FlowValue var2) {
      switch (var1.getOpcode()) {
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
            this.recordFlow(Type.VOID_TYPE, var1, var2);
            return new DummyFlowValue(var2.getType());
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         default:
            VarInsnNode var3 = (VarInsnNode)var1;
            Type var4 = this.localTypes.get(var3);
            return this.recordFlow(var4, var1);
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
            return var2;
      }
   }

   public FlowValue unaryOperation(AbstractInsnNode var1, FlowValue var2) {
      Type var3 = ExpressionASMUtils.getUnaryType(var1);
      if (var1.getOpcode() == 132) {
         this.recordFlow(Type.VOID_TYPE, var1);
         return new DummyFlowValue(var3);
      } else {
         return this.recordFlow(var3, var1, var2);
      }
   }

   public FlowValue binaryOperation(AbstractInsnNode var1, FlowValue var2, FlowValue var3) {
      if (var1.getOpcode() != 50 && var1.getOpcode() != 51) {
         Type var4 = ExpressionASMUtils.getBinaryType(var1, null);
         return this.recordFlow(var4, var1, var2, var3);
      } else {
         return this.recordComputedFlow(1, var0 -> ExpressionASMUtils.getInnerType(var0[0].getType()), var1, var2, var3);
      }
   }

   public FlowValue ternaryOperation(AbstractInsnNode var1, FlowValue var2, FlowValue var3, FlowValue var4) {
      return this.recordFlow(Type.VOID_TYPE, var1, var2, var3, var4);
   }

   public FlowValue naryOperation(AbstractInsnNode var1, List<? extends FlowValue> var2) {
      if (var1 instanceof MethodInsnNode && Boxing.isBoxing((MethodInsnNode)var1)) {
         return (FlowValue)var2.get(0);
      }

      Type var3 = ExpressionASMUtils.getNaryType(var1);
      return this.recordFlow(var3, var1, var2.toArray(new FlowValue[0]));
   }

   public void returnOperation(AbstractInsnNode var1, FlowValue var2, FlowValue var3) {
   }

   public FlowValue merge(FlowValue var1, FlowValue var2) {
      return var1.mergeWith(var2, this.context);
   }

   private FlowValue recordFlow(Type var1, AbstractInsnNode var2, FlowValue... var3) {
      FlowValue var4 = this.cache.get(var2);
      if (var4 == null) {
         var4 = new FlowValue(var1, var2, var3);
         this.cache.put(var2, var4);
      } else {
         var4.mergeInputs(var3, this.context);
      }

      return var4;
   }

   private FlowValue recordComputedFlow(int var1, Function<FlowValue[], Type> var2, AbstractInsnNode var3, FlowValue... var4) {
      FlowValue var5 = this.cache.get(var3);
      if (var5 == null) {
         var5 = new ComputedFlowValue(var1, var2, var3, var4);
         this.cache.put(var3, var5);
      } else {
         var5.mergeInputs(var4, this.context);
      }

      return var5;
   }
}
