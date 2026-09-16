package org.spongepowered.asm.mixin.extensibility;

import java.util.List;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;

public interface IMixinConfigPlugin {
   default void onLoad(String var1) {
   }

   default String getRefMapperConfig() {
      return null;
   }

   default boolean shouldApplyMixin(String var1, String var2) {
      return true;
   }

   default void acceptTargets(Set<String> var1, Set<String> var2) {
   }

   default List<String> getMixins() {
      return null;
   }

   default void preApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   default void postApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }
}
