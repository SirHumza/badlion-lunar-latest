package org.cadixdev.lorenz.asm;

import java.util.Objects;
import java.util.Optional;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.jar.FieldTypeProvider;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class AsmFieldTypeProvider implements FieldTypeProvider {
   private final ClassProvider classProvider;

   public AsmFieldTypeProvider(ClassProvider var1) {
      this.classProvider = var1;
   }

   @Override
   public Optional<FieldType> provide(FieldMapping var1) {
      String var2 = var1.getParent().getFullObfuscatedName();
      ClassNode var3 = this.classProvider.getAsNode(var2);
      if (var3 == null) {
         return Optional.empty();
      } else {
         Optional var4 = var3.fields.stream().filter(var1x -> Objects.equals(var1x.name, var1.getObfuscatedName())).findAny();
         if (var4.isPresent()) {
            FieldType var5 = FieldType.of(((FieldNode)var4.get()).desc);
            return Optional.of(var5);
         } else {
            return Optional.empty();
         }
      }
   }
}
