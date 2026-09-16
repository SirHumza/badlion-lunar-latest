package org.spongepowered.asm.mixin.injection.selectors;

public enum MatchResult {
   NONE,
   WEAK,
   MATCH,
   EXACT_MATCH;

   public boolean isAtLeast(MatchResult var1) {
      return var1 == null || var1.ordinal() <= this.ordinal();
   }

   public boolean isMatch() {
      return this.ordinal() >= MATCH.ordinal();
   }

   public boolean isExactMatch() {
      return this == EXACT_MATCH;
   }
}
