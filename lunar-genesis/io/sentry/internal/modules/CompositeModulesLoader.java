package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Experimental
@ApiStatus.Internal
public final class CompositeModulesLoader extends ModulesLoader {
   private final List<IModulesLoader> loaders;

   public CompositeModulesLoader(@NotNull List<IModulesLoader> var1, @NotNull ILogger var2) {
      super(var2);
      this.loaders = var1;
   }

   @Override
   protected Map<String, String> loadModules() {
      TreeMap var1 = new TreeMap();

      for (IModulesLoader var3 : this.loaders) {
         Map var4 = var3.getOrLoadModules();
         if (var4 != null) {
            var1.putAll(var4);
         }
      }

      return var1;
   }
}
