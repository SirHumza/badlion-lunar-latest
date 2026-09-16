package org.spongepowered.tools.obfuscation;

public enum SuppressedBy {
   CONSTRAINTS("constraints"),
   VISIBILITY("visibility"),
   TARGET("target"),
   MAPPING("mapping"),
   OVERWRITE("overwrite"),
   DEFAULT_PACKAGE("default-package"),
   PUBLIC_TARGET("public-target"),
   UNRESOLVABLE_TARGET("unresolvable-target"),
   RAW_TYPES("rawtypes");

   private final String token;

   SuppressedBy(String var3) {
      this.token = var3;
   }

   public String getToken() {
      return this.token;
   }
}
