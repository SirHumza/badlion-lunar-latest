package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.injector.StackExtension;
import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefUtils;
import com.llamalad7.mixinextras.utils.TargetDecorations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;

public class ShareInfo {
   private int lvtIndex;
   private final ShareType shareType;
   private final Collection<AbstractInsnNode> initialization = new ArrayList<>();

   private ShareInfo(int var1, Type var2) {
      this.lvtIndex = var1;
      this.shareType = new ShareType(var2);
   }

   public int getLvtIndex() {
      return this.lvtIndex;
   }

   public void setLvtIndex(int var1) {
      this.lvtIndex = var1;
   }

   public ShareType getShareType() {
      return this.shareType;
   }

   public void addToLvt(Target var1) {
      this.shareType.addToLvt(var1, this.lvtIndex);
   }

   public InsnList initialize() {
      InsnList var1 = this.shareType.initialize(this.lvtIndex);
      this.initialization.addAll(Arrays.asList(var1.toArray()));
      return var1;
   }

   public AbstractInsnNode load() {
      return new VarInsnNode(25, this.lvtIndex);
   }

   public void stripInitializerFrom(MethodNode var1) {
      this.initialization.forEach(var1.instructions::remove);
   }

   public static ShareInfo getOrCreate(Target var0, AnnotationNode var1, Type var2, IMixinInfo var3, StackExtension var4) {
      if (SugarApplicator.isSugar(var1.desc) && var1.desc.endsWith("Share;")) {
         Type var5 = getInnerType(var2);
         Map var6 = TargetDecorations.getOrPut(var0, "ShareSugar_Infos", HashMap::new);
         ShareInfo.ShareId var7 = getId(var1, var3);
         ShareInfo var8 = (ShareInfo)var6.get(var7);
         if (var8 == null) {
            var8 = new ShareInfo(var0.allocateLocal(), var5);
            var6.put(var7, var8);
            var8.addToLvt(var0);
            var0.insns.insert(var8.initialize());
            if (var4 != null) {
               var4.ensureAtLeast(var5.getSize() + 2);
            }
         } else if (!var5.equals(var8.shareType.getInnerType())) {
            throw new SugarApplicationException(
               String.format("Share id %s in %s was requested for different types %s and %s!", var7, var0, var5, var8.shareType.getInnerType())
            );
         }

         return var8;
      } else {
         return null;
      }
   }

   private static Type getInnerType(Type var0) {
      Type var1 = LocalRefUtils.getTargetType(var0, Type.getType(Object.class));
      if (var1 == var0) {
         throw new SugarApplicationException("@Share parameter must be some variation of LocalRef.");
      } else {
         return var1;
      }
   }

   private static ShareInfo.ShareId getId(AnnotationNode var0, IMixinInfo var1) {
      return new ShareInfo.ShareId(Annotations.getValue(var0, "namespace", var1.getClassName()), Annotations.getValue(var0));
   }

   private static class ShareId {
      private final String namespace;
      private final String id;

      private ShareId(String var1, String var2) {
         this.namespace = var1;
         this.id = var2;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            ShareInfo.ShareId var2 = (ShareInfo.ShareId)var1;
            return Objects.equals(this.namespace, var2.namespace) && Objects.equals(this.id, var2.id);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.namespace, this.id);
      }

      @Override
      public String toString() {
         return this.namespace + ':' + this.id;
      }
   }
}
