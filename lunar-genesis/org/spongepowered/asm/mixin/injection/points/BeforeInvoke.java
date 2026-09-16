package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import java.util.Locale;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ElementNode;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.throwables.SelectorConstraintException;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.service.MixinService;

@InjectionPoint.AtCode("INVOKE")
public class BeforeInvoke extends InjectionPoint {
   protected final ITargetSelector target;
   @Deprecated
   protected final boolean allowPermissive = false;
   protected final int ordinal;
   protected final String className;
   protected final IInjectionPointContext context;
   protected final IMixinContext mixin;
   protected final ILogger logger = MixinService.getService().getLogger("mixin");
   private boolean log = false;

   public BeforeInvoke(InjectionPointData var1) {
      super(var1);
      this.target = var1.getTarget();
      this.ordinal = var1.getOrdinal();
      this.log = var1.get("log", false);
      this.className = this.getClassName();
      this.context = var1.getContext();
      this.mixin = var1.getMixin();
   }

   private String getClassName() {
      InjectionPoint.AtCode var1 = this.getClass().getAnnotation(InjectionPoint.AtCode.class);
      return String.format("@At(%s)", var1 != null ? var1.value() : this.getClass().getSimpleName().toUpperCase(Locale.ROOT));
   }

   public BeforeInvoke setLogging(boolean var1) {
      this.log = var1;
      return this;
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      this.log("{}->{} is searching for an injection point in method with descriptor {}", this.context, this.className, var1);
      return this.find(var1, var2, var3, this.target, BeforeInvoke.SearchType.STRICT);
   }

   protected boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3, ITargetSelector var4, BeforeInvoke.SearchType var5) {
      if (var4 == null) {
         return false;
      }

      ITargetSelector var6 = var4.configure(ITargetSelector.Configure.SELECT_INSTRUCTION);
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      for (AbstractInsnNode var11 : var2) {
         if (this.matchesInsn(var11)) {
            MemberInfo var12 = new MemberInfo(var11);
            this.log("{}->{} is considering {}", this.context, this.className, var12);
            if (var6.match(ElementNode.of(var11)).isExactMatch()) {
               this.log("{}->{} > found a matching insn, checking preconditions...", this.context, this.className);
               if (++var9 > var6.getMaxMatchCount()) {
                  break;
               }

               if (this.matchesOrdinal(var7)) {
                  this.log("{}->{} > > > found a matching insn at ordinal {}", this.context, this.className, var7);
                  if (this.addInsn(var2, var3, var11)) {
                     var8++;
                  }
               }

               var7++;
            }
         }

         this.inspectInsn(var1, var2, var11);
      }

      if (var9 < var6.getMinMatchCount()) {
         throw new SelectorConstraintException(
            var6, String.format("%s did not match the required number of targets (required=%d, matched=%d)", var6, var4.getMinMatchCount(), var9)
         );
      } else {
         return var8 > 0;
      }
   }

   protected boolean addInsn(InsnList var1, Collection<AbstractInsnNode> var2, AbstractInsnNode var3) {
      var2.add(var3);
      return true;
   }

   protected boolean matchesInsn(AbstractInsnNode var1) {
      return var1 instanceof MethodInsnNode;
   }

   protected void inspectInsn(String var1, InsnList var2, AbstractInsnNode var3) {
   }

   protected boolean matchesOrdinal(int var1) {
      this.log("{}->{} > > comparing target ordinal {} with current ordinal {}", this.context, this.className, this.ordinal, var1);
      return this.ordinal == -1 || this.ordinal == var1;
   }

   protected void log(String var1, Object... var2) {
      if (this.log) {
         this.logger.info(var1, var2);
      }
   }

   @Deprecated
   public enum SearchType {
      STRICT,
      PERMISSIVE;
   }
}
