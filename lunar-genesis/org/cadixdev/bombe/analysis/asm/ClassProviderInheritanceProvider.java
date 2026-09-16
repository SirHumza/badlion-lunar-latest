package org.cadixdev.bombe.analysis.asm;

import java.util.Optional;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.provider.ClassProvider;
import org.objectweb.asm.ClassReader;

public class ClassProviderInheritanceProvider implements InheritanceProvider {
   private final int api;
   private final ClassProvider provider;

   public ClassProviderInheritanceProvider(int var1, ClassProvider var2) {
      this.api = var1;
      this.provider = var2;
   }

   public ClassProviderInheritanceProvider(ClassProvider var1) {
      this(458752, var1);
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      byte[] var2 = this.provider.get(var1);
      if (var2 == null) {
         return Optional.empty();
      }

      ClassReader var3 = new ClassReader(var2);
      InheritanceClassInfoVisitor var4 = new InheritanceClassInfoVisitor(this.api);
      var3.accept(var4, 7);
      return Optional.of(var4.create());
   }
}
