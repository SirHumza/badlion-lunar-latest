package com.llamalad7.mixinextras.expression.impl.point;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.impl.ExpressionParserFacade;
import com.llamalad7.mixinextras.expression.impl.ExpressionService;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.Expression;
import com.llamalad7.mixinextras.expression.impl.flow.ComplexDataException;
import com.llamalad7.mixinextras.expression.impl.flow.FlowInterpreter;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.expansion.InsnExpander;
import com.llamalad7.mixinextras.expression.impl.pool.BytecodeIdentifierPool;
import com.llamalad7.mixinextras.expression.impl.pool.IdentifierPool;
import com.llamalad7.mixinextras.injector.ModifyExpressionValueInjectionInfo;
import com.llamalad7.mixinextras.injector.ModifyReceiverInjectionInfo;
import com.llamalad7.mixinextras.injector.ModifyReturnValueInjectionInfo;
import com.llamalad7.mixinextras.injector.v2.WrapWithConditionInjectionInfo;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationInjectionInfo;
import com.llamalad7.mixinextras.service.MixinExtrasVersion;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import com.llamalad7.mixinextras.utils.MixinConfigUtils;
import com.llamalad7.mixinextras.utils.TargetDecorations;
import com.llamalad7.mixinextras.wrapper.WrapperInjectionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.CallbackInjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.struct.ModifyArgInjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.ModifyArgsInjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.ModifyConstantInjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.ModifyVariableInjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.RedirectInjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;

@InjectionPoint.AtCode("MIXINEXTRAS:EXPRESSION")
public class ExpressionInjectionPoint extends InjectionPoint {
   private static List<Target> CURRENT_TARGETS;
   private static InjectionInfo CURRENT_INFO;
   private final int ordinal;
   private final String id;
   private final boolean isInSlice;
   private boolean initialized;
   private IdentifierPool pool;
   private List<Expression> expressions;
   private ExpressionContext.Type contextType;

   public ExpressionInjectionPoint(InjectionPointData var1) {
      super(var1);
      this.ordinal = var1.getOrdinal();
      this.id = var1.getId() != null ? var1.getId() : "";
      this.isInSlice = var1.get("mixinextras_isInSlice", false);
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      if (var2.size() == 0) {
         return false;
      }

      final Target var4 = this.getTarget(var2);
      if (!this.initialized) {
         this.initialize(var4);
      }

      Collection var5 = TargetDecorations.getOrPut(var4, "ValueFlow", () -> FlowInterpreter.analyze(CURRENT_INFO.getClassNode(), var4.method, null));
      HashSet var6 = new HashSet();
      final IdentityHashMap var7 = new IdentityHashMap();
      final IdentityHashMap var8 = new IdentityHashMap();
      final ArrayList var9 = new ArrayList();
      Expression.OutputSink var10 = new Expression.OutputSink() {
         @Override
         public void capture(FlowValue var1, Expression var2x, ExpressionContext var3x) {
            AbstractInsnNode var4x = var1.getInsn();
            InsnExpander.Expansion var5x = InsnExpander.prepareExpansion(var1, var4, ExpressionInjectionPoint.CURRENT_INFO, var3x);
            AbstractInsnNode var6x;
            BiConsumer var7x;
            BiConsumer var8x;
            if (var5x != null) {
               var6x = var5x.compound;
               var7x = (var1x, var2x) -> var5.decorate(ExpressionInjectionPoint.CURRENT_INFO, var1x, var2x);
               var8x = (var1x, var2x) -> var5.decorateInjectorSpecific(ExpressionInjectionPoint.CURRENT_INFO, var1x, var2x);
            } else {
               var6x = var1.getInsn();
               InjectionNodes.InjectionNode var9x = var4.addInjectionNode(var4x);
               var7x = var9x::decorate;
               var8x = (var1x, var2x) -> InjectorUtils.decorateInjectorSpecific(var9x, ExpressionInjectionPoint.CURRENT_INFO, var1x, var2x);
            }

            Map var13 = (Map)var7.get(var4x);
            if (var13 != null) {
               for (Entry var11 : var13.entrySet()) {
                  var7x.accept((String)var11.getKey(), var11.getValue());
               }
            }

            Map var14 = (Map)var8.get(var4x);
            if (var14 != null) {
               for (Entry var12 : var14.entrySet()) {
                  var8x.accept((String)var12.getKey(), var12.getValue());
               }
            }

            for (Entry var17 : var1.getDecorations().entrySet()) {
               if (((String)var17.getKey()).startsWith("mixinextras_persistent_")) {
                  var7x.accept((String)var17.getKey(), var17.getValue());
               }
            }

            var9.add(var6x);
         }

         @Override
         public void decorate(AbstractInsnNode var1, String var2x, Object var3x) {
            var7.computeIfAbsent(var1, var0 -> new HashMap<>()).put(var2x, var3x);
         }

         @Override
         public void decorateInjectorSpecific(AbstractInsnNode var1, String var2x, Object var3x) {
            var8.computeIfAbsent(var1, var0 -> new HashMap<>()).put(var2x, var3x);
         }
      };
      ExpressionContext var11 = new ExpressionContext(this.pool, var10, var4.classNode, var4.method, this.contextType, false);

      for (Expression var13 : this.expressions) {
         for (FlowValue var15 : var5) {
            try {
               if (var13.matches(var15, var11)) {
                  var6.addAll(var9);
               }
            } catch (ComplexDataException var17) {
            }

            var7.clear();
            var8.clear();
            var9.clear();
         }
      }

      int var18 = 0;
      boolean var19 = false;

      for (AbstractInsnNode var21 : var2) {
         if (var6.contains(var21)) {
            if (this.ordinal < 0 || this.ordinal == var18) {
               var3.add(var21);
               var19 = true;
            }

            var18++;
         }
      }

      return var19;
   }

   private void initialize(Target var1) {
      this.checkDeclaredMinVersion();
      this.initialized = true;
      AnnotationNode var2 = ASMUtils.getRepeatedMEAnnotation(CURRENT_INFO.getMethod(), Definition.class);
      this.pool = new BytecodeIdentifierPool(var1, CURRENT_INFO, var2);
      this.expressions = this.parseExpressions();
      this.contextType = this.selectContextType();
   }

   public static void withContext(InjectionInfo var0, Runnable var1) {
      InjectionInfo var2 = CURRENT_INFO;
      List var3 = CURRENT_TARGETS;

      try {
         CURRENT_INFO = var0;
         CURRENT_TARGETS = CompatibilityHelper.getTargets(var0);
         var1.run();
      } finally {
         CURRENT_INFO = var2;
         CURRENT_TARGETS = var3;
      }
   }

   private Target getTarget(InsnList var1) {
      AbstractInsnNode var2 = var1.getFirst();
      Target var3 = null;

      for (Target var5 : CURRENT_TARGETS) {
         if (var5.method.instructions.contains(var2)) {
            var3 = var5;
            break;
         }
      }

      if (var3 == null) {
         throw new IllegalStateException("Could not find target for " + var1);
      }

      CURRENT_TARGETS.remove(var3);
      CURRENT_TARGETS.add(var3);
      return var3;
   }

   private void checkDeclaredMinVersion() {
      IMixinConfig var1 = CompatibilityHelper.getMixin(CURRENT_INFO).getMixin().getConfig();
      MixinConfigUtils.requireMinVersion(var1, MixinExtrasVersion.V0_5_0_BETA_1, "@Expression");
   }

   private List<Expression> parseExpressions() {
      List var1 = this.getMatchingExpressions(CURRENT_INFO.getMethod());
      return var1.stream().map(ExpressionParserFacade::parse).collect(Collectors.toList());
   }

   private List<String> getMatchingExpressions(MethodNode var1) {
      ArrayList var2 = new ArrayList();
      AnnotationNode var3 = ASMUtils.getRepeatedMEAnnotation(var1, com.llamalad7.mixinextras.expression.Expression.class);

      for (AnnotationNode var5 : Annotations.getValue(var3, "value", true)) {
         if (Annotations.getValue(var5, "id", "").equals(this.id)) {
            var2.addAll(Annotations.getValue(var5, "value", true));
         }
      }

      if (var2.isEmpty()) {
         String var6 = this.id.isEmpty() ? "" : "for id '" + this.id + "' ";
         throw new IllegalStateException("No expression found " + var6 + "on " + CURRENT_INFO);
      } else {
         return var2;
      }
   }

   private ExpressionContext.Type selectContextType() {
      if (this.isInSlice) {
         return ExpressionContext.Type.SLICE;
      }

      InjectionInfo var1 = CURRENT_INFO;

      while (var1 instanceof WrapperInjectionInfo) {
         var1 = ((WrapperInjectionInfo)var1).getDelegate();
      }

      if (var1 instanceof CallbackInjectionInfo) {
         return ExpressionContext.Type.INJECT;
      } else if (var1 instanceof ModifyArgInjectionInfo) {
         return ExpressionContext.Type.MODIFY_ARG;
      } else if (var1 instanceof ModifyArgsInjectionInfo) {
         return ExpressionContext.Type.MODIFY_ARGS;
      } else if (var1 instanceof ModifyConstantInjectionInfo) {
         return ExpressionContext.Type.MODIFY_CONSTANT;
      } else if (var1 instanceof ModifyExpressionValueInjectionInfo) {
         return ExpressionContext.Type.MODIFY_EXPRESSION_VALUE;
      } else if (var1 instanceof ModifyReceiverInjectionInfo) {
         return ExpressionContext.Type.MODIFY_RECEIVER;
      } else if (var1 instanceof ModifyReturnValueInjectionInfo) {
         return ExpressionContext.Type.MODIFY_RETURN_VALUE;
      } else if (var1 instanceof ModifyVariableInjectionInfo) {
         return ExpressionContext.Type.MODIFY_VARIABLE;
      } else if (var1 instanceof RedirectInjectionInfo) {
         return ExpressionContext.Type.REDIRECT;
      } else if (var1 instanceof WrapOperationInjectionInfo) {
         return ExpressionContext.Type.WRAP_OPERATION;
      } else {
         return var1 instanceof WrapWithConditionInjectionInfo ? ExpressionContext.Type.WRAP_WITH_CONDITION : ExpressionContext.Type.CUSTOM;
      }
   }

   static {
      ExpressionService.offerInstance(new RuntimeExpressionService());
   }
}
