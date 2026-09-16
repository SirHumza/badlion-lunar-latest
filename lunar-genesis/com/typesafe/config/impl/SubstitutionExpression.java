package com.typesafe.config.impl;

final class SubstitutionExpression {
   private final Path path;
   private final boolean optional;

   SubstitutionExpression(Path var1, boolean var2) {
      this.path = var1;
      this.optional = var2;
   }

   Path path() {
      return this.path;
   }

   boolean optional() {
      return this.optional;
   }

   SubstitutionExpression changePath(Path var1) {
      return var1 == this.path ? this : new SubstitutionExpression(var1, this.optional);
   }

   @Override
   public String toString() {
      return "${" + (this.optional ? "?" : "") + this.path.render() + "}";
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof SubstitutionExpression)) {
         return false;
      }

      SubstitutionExpression var2 = (SubstitutionExpression)var1;
      return var2.path.equals(this.path) && var2.optional == this.optional;
   }

   @Override
   public int hashCode() {
      int var1 = 41 * (41 + this.path.hashCode());
      return 41 * (var1 + (this.optional ? 1 : 0));
   }
}
