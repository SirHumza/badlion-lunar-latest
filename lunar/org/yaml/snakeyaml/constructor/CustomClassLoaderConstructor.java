package org.yaml.snakeyaml.constructor;

import org.yaml.snakeyaml.LoaderOptions;

public class CustomClassLoaderConstructor extends Constructor {
   private final ClassLoader loader;

   public CustomClassLoaderConstructor(ClassLoader var1, LoaderOptions var2) {
      this(Object.class, var1, var2);
   }

   public CustomClassLoaderConstructor(Class<? extends Object> var1, ClassLoader var2, LoaderOptions var3) {
      super(var1, var3);
      if (var2 == null) {
         throw new NullPointerException("Loader must be provided.");
      }

      this.loader = var2;
   }

   @Override
   protected Class<?> getClassForName(String var1) {
      return Class.forName(var1, true, this.loader);
   }
}
