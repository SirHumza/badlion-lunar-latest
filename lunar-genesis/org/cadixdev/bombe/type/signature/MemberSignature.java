package org.cadixdev.bombe.type.signature;

import java.util.StringJoiner;

public abstract class MemberSignature {
   protected final String name;

   protected MemberSignature(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public abstract String toJvmsIdentifier();

   protected StringJoiner buildToString() {
      return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}").add("name=" + this.name);
   }

   @Override
   public final String toString() {
      return this.buildToString().toString();
   }
}
