package org.yaml.snakeyaml.extensions.compactnotation;

import org.yaml.snakeyaml.LoaderOptions;

public class PackageCompactConstructor extends CompactConstructor {
   private final String packageName;

   public PackageCompactConstructor(String var1) {
      super(new LoaderOptions());
      this.packageName = var1;
   }

   @Override
   protected Class<?> getClassForName(String var1) {
      if (var1.indexOf(46) < 0) {
         try {
            return Class.forName(this.packageName + "." + var1);
         } catch (ClassNotFoundException var3) {
         }
      }

      return super.getClassForName(var1);
   }
}
