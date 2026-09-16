package org.cadixdev.bombe.type.signature;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import org.cadixdev.bombe.type.FieldType;

public class FieldSignature extends MemberSignature {
   private final FieldType type;

   public static FieldSignature of(String var0, String var1) {
      return new FieldSignature(var0, FieldType.of(var1));
   }

   public static FieldSignature of(Field var0) {
      return new FieldSignature(var0.getName(), FieldType.of(var0.getType()));
   }

   public FieldSignature(String var1, FieldType var2) {
      super(var1);
      this.type = var2;
   }

   public FieldSignature(String var1) {
      this(var1, null);
   }

   public Optional<FieldType> getType() {
      return Optional.ofNullable(this.type);
   }

   @Override
   public String toJvmsIdentifier() {
      return this.name + "(" + this.type.toString() + ")";
   }

   @Override
   protected StringJoiner buildToString() {
      return super.buildToString().add("type=" + this.type);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof FieldSignature)) {
         return false;
      }

      FieldSignature var2 = (FieldSignature)var1;
      return this.type != null && var2.type != null
         ? Objects.equals(this.name, var2.name) && Objects.equals(this.type, var2.type)
         : Objects.equals(this.name, var2.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.type);
   }
}
