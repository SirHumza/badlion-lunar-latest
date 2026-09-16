package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.util.Bytecode;

public enum MixinInheritanceTracker implements MixinConfig.IListener {
   INSTANCE;

   private final Map<String, List<MixinInfo>> parentMixins = new HashMap<>();

   @Override
   public void onPrepare(MixinInfo var1) {
   }

   @Override
   public void onInit(MixinInfo var1) {
      ClassInfo var2 = var1.getClassInfo();
      assert var2.isMixin();

      for (ClassInfo var3 = var2.getSuperClass(); var3 != null && var3.isMixin(); var3 = var3.getSuperClass()) {
         List var4 = this.parentMixins.get(var3.getName());
         if (var4 == null) {
            this.parentMixins.put(var3.getName(), var4 = new ArrayList());
         }

         var4.add(var1);
      }
   }

   public List<MethodNode> findOverrides(ClassInfo var1, String var2, String var3) {
      return this.findOverrides(var1.getName(), var2, var3);
   }

   public List<MethodNode> findOverrides(String var1, String var2, String var3) {
      List var4 = this.parentMixins.get(var1);
      if (var4 == null) {
         return Collections.emptyList();
      }

      ArrayList var5 = new ArrayList(var4.size());

      for (MixinInfo var7 : var4) {
         MixinInfo.MixinClassNode var8 = var7.getClassNode(6);
         MethodNode var9 = Bytecode.findMethod(var8, var2, var3);
         if (var9 != null && !Bytecode.isStatic(var9)) {
            switch (Bytecode.getVisibility(var9)) {
               case PRIVATE:
                  break;
               case PACKAGE:
                  int var10 = var1.lastIndexOf(47);
                  int var11 = var8.name.lastIndexOf(47);
                  if (var10 == var11 && (var10 <= 0 || var1.regionMatches(0, var8.name, 0, var10 + 1))) {
                     var5.add(var9);
                  }
                  break;
               default:
                  var5.add(var9);
            }
         }
      }

      return var5.isEmpty() ? Collections.emptyList() : var5;
   }
}
