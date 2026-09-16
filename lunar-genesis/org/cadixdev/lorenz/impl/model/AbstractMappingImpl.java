package org.cadixdev.lorenz.impl.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ExtensionKey;
import org.cadixdev.lorenz.model.Mapping;

public abstract class AbstractMappingImpl<M extends Mapping, P> implements Mapping<M, P> {
   private final MappingSet mappings;
   private final Map<ExtensionKey<?>, Object> data = new HashMap<>();
   private final String obfuscatedName;
   private String deobfuscatedName;

   protected AbstractMappingImpl(MappingSet var1, String var2, String var3) {
      this.mappings = var1;
      this.obfuscatedName = var2;
      this.deobfuscatedName = var3;
   }

   @Override
   public String getObfuscatedName() {
      return this.obfuscatedName;
   }

   @Override
   public String getDeobfuscatedName() {
      return this.deobfuscatedName;
   }

   @Override
   public M setDeobfuscatedName(String var1) {
      this.deobfuscatedName = var1;
      return (M)this;
   }

   @Override
   public boolean hasDeobfuscatedName() {
      return !Objects.equals(this.obfuscatedName, this.deobfuscatedName);
   }

   @Override
   public MappingSet getMappings() {
      return this.mappings;
   }

   @Override
   public <T> Optional<T> get(ExtensionKey<T> var1) {
      return Optional.ofNullable(this.data.get(var1)).map(var1::cast);
   }

   @Override
   public <T> void set(ExtensionKey<T> var1, T var2) {
      this.data.put(var1, var2);
   }

   protected StringJoiner buildToString() {
      return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}")
         .add("obfuscatedName=" + this.obfuscatedName)
         .add("deobfuscatedName=" + this.deobfuscatedName);
   }

   @Override
   public String toString() {
      return this.buildToString().toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Mapping)) {
         return false;
      }

      Mapping var2 = (Mapping)var1;
      return Objects.equals(this.obfuscatedName, var2.getObfuscatedName()) && Objects.equals(this.deobfuscatedName, var2.getDeobfuscatedName());
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.obfuscatedName, this.deobfuscatedName);
   }
}
