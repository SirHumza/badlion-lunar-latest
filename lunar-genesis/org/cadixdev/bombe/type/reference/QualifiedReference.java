package org.cadixdev.bombe.type.reference;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class QualifiedReference {
   protected static final char JVMS_COMPONENT_JOINER = '.';
   protected final QualifiedReference.Type type;

   public QualifiedReference(QualifiedReference.Type var1) {
      this.type = var1;
   }

   public QualifiedReference.Type getType() {
      return this.type;
   }

   public abstract String toJvmsIdentifier();

   protected StringJoiner buildToString() {
      return new StringJoiner("{type=" + this.type.name());
   }

   @Override
   public String toString() {
      return this.buildToString().add("}").toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof QualifiedReference)) {
         return false;
      }

      QualifiedReference var2 = (QualifiedReference)var1;
      return Objects.equals(this.type, var2.type);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type);
   }

   public enum Type {
      TOP_LEVEL_CLASS,
      INNER_CLASS,
      FIELD,
      METHOD,
      METHOD_PARAMETER;
   }
}
