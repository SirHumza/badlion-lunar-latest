package com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Objects;
import java.util.Optional;
import java.util.jar.JarFile;
import lombok.Generated;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.bombe.provider.JarFileClassProvider;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.jar.FieldTypeProvider;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements FieldTypeProvider {
   private final ClassProvider IRCIIROCCOIRCRCRHHCRRCRIIRHOCC;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH IIOOIIRRCHCRCCCCHOIHHRCHCOHOCO;

   public Optional<FieldType> provide(FieldMapping var1) {
      String var2 = ((ClassMapping)var1.getParent()).getFullObfuscatedName();
      ClassNode var3 = this.IRCIIROCCOIRCRCRHHCRRCRIIRHOCC.getAsNode(this.IIOOIIRRCHCRCCCCHOIHHRCHCOHOCO.unmap(var2));
      if (var3 == null) {
         return Optional.empty();
      } else {
         Optional var4 = var3.fields.stream().filter(var1x -> Objects.equals(var1x.name, var1.getObfuscatedName())).findAny();
         if (var4.isPresent()) {
            FieldType var5 = this.IIOOIIRRCHCRCCCCHOIHHRCHCOHOCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FieldType.of(((FieldNode)var4.get()).desc));
            return Optional.of(var5);
         } else {
            return Optional.empty();
         }
      }
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      try {
         JarFile var2 = new JarFile(var0.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH().toFile());
         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(new JarFileClassProvider(var2), var1);
      } catch (Throwable var3) {
         throw var3;
      }
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(ClassProvider var1, CRRRICCRROCOHHOHIICIHORCOORRRH var2) {
      this.IRCIIROCCOIRCRCRHHCRRCRIIRHOCC = var1;
      this.IIOOIIRRCHCRCCCCHOIHHRCHCOHOCO = var2;
   }
}
