package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTransformerError;
import org.spongepowered.asm.util.asm.ClassNodeAdapter;

class MixinCoprocessorNestHost extends MixinCoprocessor {
   private final Map<String, Set<String>> nestHosts = new HashMap<>();

   void registerNestMember(String var1, String var2) {
      Set var3 = this.nestHosts.get(var1);
      if (var3 == null) {
         this.nestHosts.put(var1, var3 = new HashSet());
      }

      var3.add(var2);
   }

   @Override
   String getName() {
      return "nesthost";
   }

   @Override
   boolean postProcess(String var1, ClassNode var2) {
      if (!this.nestHosts.containsKey(var1)) {
         return false;
      }

      Set var3 = this.nestHosts.get(var1);
      if (MixinEnvironment.getCompatibilityLevel().supports(8) && !var3.isEmpty()) {
         String var4 = ClassNodeAdapter.getNestHostClass(var2);
         if (var4 != null) {
            throw new MixinTransformerError(String.format("Nest host candidate %s is a nest member", var2.name));
         }

         List var5 = ClassNodeAdapter.getNestMembers(var2);
         if (var5 == null) {
            var5 = new ArrayList(var3);
         } else {
            LinkedHashSet var6 = new LinkedHashSet(var5);
            var6.addAll(var3);
            var5.clear();
            var5.addAll(var6);
         }

         ClassNodeAdapter.setNestMembers(var2, var5);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean couldTransform(String var1) {
      return this.nestHosts.containsKey(var1);
   }
}
