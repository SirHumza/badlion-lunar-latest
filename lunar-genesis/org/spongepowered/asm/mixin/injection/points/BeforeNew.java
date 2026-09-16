package org.spongepowered.asm.mixin.injection.points;

import java.util.ArrayList;
import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorConstructor;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionPointException;
import org.spongepowered.include.com.google.common.base.Strings;

@InjectionPoint.AtCode("NEW")
public class BeforeNew extends InjectionPoint {
   private final String target;
   private final String desc;
   private final int ordinal;

   public BeforeNew(InjectionPointData var1) {
      super(var1);
      this.ordinal = var1.getOrdinal();
      String var2 = Strings.emptyToNull(var1.get("class", var1.get("target", "")).replace('.', '/'));
      ITargetSelector var3 = TargetSelector.parseAndValidate(var2, var1.getContext());
      if (!(var3 instanceof ITargetSelectorConstructor)) {
         throw new InvalidInjectionPointException(var1.getMixin(), "Failed parsing @At(\"NEW\") target descriptor \"%s\" on %s", var2, var1.getDescription());
      }

      ITargetSelectorConstructor var4 = (ITargetSelectorConstructor)var3;
      this.target = var4.toCtorType();
      this.desc = var4.toCtorDesc();
   }

   public boolean hasDescriptor() {
      return this.desc != null;
   }

   public String getDescriptor() {
      return this.desc;
   }

   @Override
   public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
      boolean var4 = false;
      int var5 = 0;
      ArrayList var6 = new ArrayList();
      Collection var7 = this.desc != null ? var6 : var3;

      for (AbstractInsnNode var9 : var2) {
         if (var9 instanceof TypeInsnNode && var9.getOpcode() == 187 && this.matchesOwner((TypeInsnNode)var9)) {
            if (this.ordinal == -1 || this.ordinal == var5) {
               var7.add(var9);
               var4 = this.desc == null;
            }

            var5++;
         }
      }

      if (this.desc != null) {
         for (TypeInsnNode var10 : var6) {
            if (findInitNodeFor(var2, var10, this.desc) != null) {
               var3.add(var10);
               var4 = true;
            }
         }
      }

      return var4;
   }

   public static MethodInsnNode findInitNodeFor(InsnList var0, TypeInsnNode var1, String var2) {
      int var3 = var0.indexOf(var1);
      int var4 = 0;

      for (AbstractInsnNode var6 : var0) {
         if (var6 instanceof MethodInsnNode && var6.getOpcode() == 183) {
            MethodInsnNode var7 = (MethodInsnNode)var6;
            if ("<init>".equals(var7.name)) {
               if (--var4 == 0) {
                  return !var7.owner.equals(var1.desc) || var2 != null && !var7.desc.equals(var2) ? null : var7;
               }
            }
         } else if (var6 instanceof TypeInsnNode && var6.getOpcode() == 187) {
            var4++;
         }
      }

      return null;
   }

   private boolean matchesOwner(TypeInsnNode var1) {
      return this.target == null || this.target.equals(var1.desc);
   }
}
