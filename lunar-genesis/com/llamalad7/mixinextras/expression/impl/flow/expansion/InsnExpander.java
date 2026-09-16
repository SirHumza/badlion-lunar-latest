package com.llamalad7.mixinextras.expression.impl.flow.expansion;

import com.llamalad7.mixinextras.expression.impl.ExpressionService;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.FlowPostProcessor;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public abstract class InsnExpander implements FlowPostProcessor {
   private static final String INSN_COMPONENT = "expandedInsnComponent";
   private static final String EXPANSION = "expansion";
   private final Map<AbstractInsnNode, InsnExpander.Expansion> expansions = new IdentityHashMap<>();

   @Override
   public abstract void process(FlowValue var1, FlowPostProcessor.OutputSink var2);

   public abstract void expand(Target var1, InjectionNodes.InjectionNode var2, InsnExpander.Expansion var3);

   protected final void registerComponent(FlowValue var1, InsnExpander.InsnComponent var2, AbstractInsnNode var3) {
      var1.decorate("expandedInsnComponent", var2);
      this.expansions.computeIfAbsent(var3, var1x -> new InsnExpander.Expansion(var1x));
      var1.decorate("expansion", this.expansions.get(var3));
   }

   protected final void expandInsn(Target var1, InjectionNodes.InjectionNode var2, AbstractInsnNode... var3) {
      InsnList var4 = new InsnList();

      for (AbstractInsnNode var8 : var3) {
         var4.add(var8);
      }

      AbstractInsnNode var9 = var2.getCurrentTarget();
      var1.insns.insert(var9, var4);
      var1.replaceNode(var9, dummyInsn());
   }

   protected static InsnNode dummyInsn() {
      return new InsnNode(0);
   }

   public static InsnExpander.Expansion prepareExpansion(FlowValue var0, Target var1, InjectionInfo var2, ExpressionContext var3) {
      if (!hasExpansion(var0)) {
         return null;
      }

      checkSupportsExpansion(var2, var3.type);
      InsnExpander.Expansion var4 = var0.getDecoration("expansion");
      AbstractInsnNode var5 = var4.compound;
      InjectionNodes.InjectionNode var6 = var1.addInjectionNode(var5);
      if (!var6.hasDecoration("mixinextras_expansionInfo")) {
         var6.decorate("mixinextras_expansionInfo", var4);
      }

      var4.registerInterest(var2, var0.getDecoration("expandedInsnComponent"));
      return var4;
   }

   public static InjectionNodes.InjectionNode doExpansion(InjectionNodes.InjectionNode var0, Target var1, InjectionInfo var2) {
      InsnExpander.Expansion var3 = var0.getDecoration("mixinextras_expansionInfo");
      if (var3 == null) {
         return var0;
      }

      var3.doExpansion(var1, var0);
      return var1.addInjectionNode(var3.getTargetInsn(var2));
   }

   private static void checkSupportsExpansion(InjectionInfo var0, ExpressionContext.Type var1) {
      switch (var1) {
         case SLICE:
         case INJECT:
         case MODIFY_VARIABLE:
            return;
         case MODIFY_EXPRESSION_VALUE:
         case WRAP_OPERATION:
            return;
         default:
            throw ExpressionService.getInstance()
               .makeInvalidInjectionException(var0, String.format("Expression context type %s does not support compound instructions!", var1));
      }
   }

   public static AbstractInsnNode getRepresentative(FlowValue var0) {
      InsnExpander.Expansion var1 = var0.getDecoration("expansion");
      return var1 != null ? var1.compound : var0.getInsn();
   }

   public static boolean hasExpansion(FlowValue var0) {
      return var0.hasDecoration("expansion");
   }

   public static void addExpansionStep(FlowValue var0, Consumer<InjectionNodes.InjectionNode> var1) {
      InsnExpander.Expansion var2 = var0.getDecoration("expansion");
      var2.addExpansionStep(var0.getDecoration("expandedInsnComponent"), var1);
   }

   public class Expansion {
      private final Map<InjectionInfo, InsnExpander.InsnComponent> interests = new IdentityHashMap<>();
      private final Map<InsnExpander.InsnComponent, List<Consumer<InjectionNodes.InjectionNode>>> expansionSteps = new HashMap<>();
      private final Map<InsnExpander.InsnComponent, AbstractInsnNode> expandedInsns = new HashMap<>();
      private boolean expanded = false;
      public final AbstractInsnNode compound;

      public Expansion(AbstractInsnNode var2) {
         this.compound = var2;
      }

      public void registerInterest(InjectionInfo var1, InsnExpander.InsnComponent var2) {
         if (this.interests.put(var1, var2) != null) {
            throw new UnsupportedOperationException("The same injector should not target multiple parts of a compound instruction!");
         }
      }

      public void decorate(InjectionInfo var1, String var2, Object var3) {
         this.addExpansionStep(this.interests.get(var1), var2x -> var2x.decorate(var2, var3));
      }

      public void decorateInjectorSpecific(InjectionInfo var1, String var2, Object var3) {
         this.addExpansionStep(this.interests.get(var1), var3x -> ExpressionService.getInstance().decorateInjectorSpecific(var3x, var1, var2, var3));
      }

      public Set<InsnExpander.InsnComponent> registeredInterests() {
         return new HashSet<>(this.interests.values());
      }

      void addExpansionStep(InsnExpander.InsnComponent var1, Consumer<InjectionNodes.InjectionNode> var2) {
         this.expansionSteps.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
      }

      void doExpansion(Target var1, InjectionNodes.InjectionNode var2) {
         if (!this.expanded) {
            this.expanded = true;
            InsnExpander.this.expand(var1, var2, this);

            for (Entry var4 : this.expansionSteps.entrySet()) {
               InjectionNodes.InjectionNode var5 = var1.addInjectionNode(this.expandedInsns.get(var4.getKey()));

               for (Consumer var7 : (List)var4.getValue()) {
                  var7.accept(var5);
               }
            }

            this.expansionSteps.clear();
         }
      }

      AbstractInsnNode getTargetInsn(InjectionInfo var1) {
         return this.expandedInsns.get(this.interests.get(var1));
      }

      protected AbstractInsnNode registerInsn(InsnExpander.InsnComponent var1, AbstractInsnNode var2) {
         this.expandedInsns.put(var1, var2);
         return var2;
      }
   }

   public interface InsnComponent {
   }
}
