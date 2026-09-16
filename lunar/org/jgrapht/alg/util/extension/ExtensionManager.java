package org.jgrapht.alg.util.extension;

import java.util.HashMap;
import java.util.Map;

public class ExtensionManager<T, B extends Extension> {
   private ExtensionFactory<B> extensionFactory;
   private Map<T, B> originalToExtensionMap = new HashMap<>();

   public ExtensionManager(ExtensionFactory<B> var1) {
      this.extensionFactory = var1;
   }

   public B createExtension() {
      return this.extensionFactory.create();
   }

   public B getExtension(T var1) {
      if (this.originalToExtensionMap.containsKey(var1)) {
         return this.originalToExtensionMap.get(var1);
      }

      Extension var2 = this.createExtension();
      this.originalToExtensionMap.put((T)var1, (B)var2);
      return (B)var2;
   }
}
