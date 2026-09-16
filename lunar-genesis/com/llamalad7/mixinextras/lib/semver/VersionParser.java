package com.llamalad7.mixinextras.lib.semver;

import com.llamalad7.mixinextras.lib.semver.util.Stream;
import com.llamalad7.mixinextras.lib.semver.util.UnexpectedElementException;
import java.util.ArrayList;
import java.util.EnumSet;

class VersionParser {
   private final boolean isStrictModeOn;
   private final Stream<Character> chars;

   VersionParser(String var1, boolean var2) {
      this.isStrictModeOn = var2;
      if (var1 != null && !var1.isEmpty()) {
         Character[] var3 = new Character[var1.length()];

         for (int var4 = 0; var4 < var1.length(); var4++) {
            var3[var4] = var1.charAt(var4);
         }

         this.chars = new Stream<>(var3);
      } else {
         throw new IllegalArgumentException("Input string is NULL or empty");
      }
   }

   static Version parseValidSemVer(String var0, boolean var1) {
      VersionParser var2 = new VersionParser(var0, var1);
      return var2.parseValidSemVer();
   }

   private Version parseValidSemVer() {
      long[] var1 = this.parseVersionCore();
      String[] var2 = new String[0];
      String[] var3 = new String[0];
      Character var4 = this.consumeNextCharacter(VersionParser.CharType.HYPHEN, VersionParser.CharType.PLUS, VersionParser.CharType.EOI);
      if (VersionParser.CharType.HYPHEN.isMatchedBy(var4)) {
         var2 = this.parsePreRelease();
         var4 = this.consumeNextCharacter(VersionParser.CharType.PLUS, VersionParser.CharType.EOI);
      }

      if (VersionParser.CharType.PLUS.isMatchedBy(var4)) {
         var3 = this.parseBuild();
      }

      this.consumeNextCharacter(VersionParser.CharType.EOI);
      return new Version(var1[0], var1[1], var1[2], var2, var3);
   }

   private long[] parseVersionCore() {
      long var1 = this.numericIdentifier();
      long var3 = 0L;
      if (this.isStrictModeOn || this.chars.positiveLookahead(VersionParser.CharType.DOT)) {
         this.consumeNextCharacter(VersionParser.CharType.DOT);
         var3 = this.numericIdentifier();
      }

      long var5 = 0L;
      if (this.isStrictModeOn || this.chars.positiveLookahead(VersionParser.CharType.DOT)) {
         this.consumeNextCharacter(VersionParser.CharType.DOT);
         var5 = this.numericIdentifier();
      }

      return new long[]{var1, var3, var5};
   }

   private String[] parsePreRelease() {
      this.ensureValidLookahead(VersionParser.CharType.DIGIT, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN);
      ArrayList var1 = new ArrayList();

      while (true) {
         var1.add(this.preReleaseIdentifier());
         if (!this.chars.positiveLookahead(VersionParser.CharType.DOT)) {
            return var1.toArray(new String[0]);
         }

         this.consumeNextCharacter(VersionParser.CharType.DOT);
      }
   }

   private String preReleaseIdentifier() {
      this.checkForEmptyIdentifier();
      VersionParser.CharType var1 = this.nearestCharType(VersionParser.CharType.DOT, VersionParser.CharType.PLUS, VersionParser.CharType.EOI);
      return this.chars.positiveLookaheadBefore(var1, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN)
         ? this.alphanumericIdentifier()
         : String.valueOf(this.numericIdentifier());
   }

   private String[] parseBuild() {
      this.ensureValidLookahead(VersionParser.CharType.DIGIT, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN);
      ArrayList var1 = new ArrayList();

      while (true) {
         var1.add(this.buildIdentifier());
         if (!this.chars.positiveLookahead(VersionParser.CharType.DOT)) {
            return var1.toArray(new String[0]);
         }

         this.consumeNextCharacter(VersionParser.CharType.DOT);
      }
   }

   private String buildIdentifier() {
      this.checkForEmptyIdentifier();
      VersionParser.CharType var1 = this.nearestCharType(VersionParser.CharType.DOT, VersionParser.CharType.EOI);
      return this.chars.positiveLookaheadBefore(var1, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN)
         ? this.alphanumericIdentifier()
         : this.digits();
   }

   private long numericIdentifier() {
      this.checkForLeadingZeroes();

      try {
         return Long.parseLong(this.digits());
      } catch (NumberFormatException var2) {
         throw new ParseException("Numeric identifier overflow");
      }
   }

   private String alphanumericIdentifier() {
      StringBuilder var1 = new StringBuilder();

      do {
         var1.append(this.consumeNextCharacter(VersionParser.CharType.DIGIT, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN));
      } while (this.chars.positiveLookahead(VersionParser.CharType.DIGIT, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN));

      return var1.toString();
   }

   private String digits() {
      StringBuilder var1 = new StringBuilder();

      do {
         var1.append(this.consumeNextCharacter(VersionParser.CharType.DIGIT));
      } while (this.chars.positiveLookahead(VersionParser.CharType.DIGIT));

      return var1.toString();
   }

   private VersionParser.CharType nearestCharType(VersionParser.CharType... var1) {
      for (Character var3 : this.chars) {
         for (VersionParser.CharType var7 : var1) {
            if (var7.isMatchedBy(var3)) {
               return var7;
            }
         }
      }

      return VersionParser.CharType.EOI;
   }

   private void checkForLeadingZeroes() {
      Character var1 = this.chars.lookahead(1);
      Character var2 = this.chars.lookahead(2);
      if (var1 != null && var1 == '0' && VersionParser.CharType.DIGIT.isMatchedBy(var2)) {
         throw new ParseException("Numeric identifier MUST NOT contain leading zeroes");
      }
   }

   private void checkForEmptyIdentifier() {
      Character var1 = this.chars.lookahead(1);
      if (VersionParser.CharType.DOT.isMatchedBy(var1) || VersionParser.CharType.PLUS.isMatchedBy(var1) || VersionParser.CharType.EOI.isMatchedBy(var1)) {
         throw new ParseException(
            "Identifiers MUST NOT be empty",
            new UnexpectedCharacterException(
               var1, this.chars.currentOffset(), VersionParser.CharType.DIGIT, VersionParser.CharType.LETTER, VersionParser.CharType.HYPHEN
            )
         );
      }
   }

   private Character consumeNextCharacter(VersionParser.CharType... var1) {
      try {
         return this.chars.consume(var1);
      } catch (UnexpectedElementException var3) {
         throw new UnexpectedCharacterException(var3);
      }
   }

   private void ensureValidLookahead(VersionParser.CharType... var1) {
      if (!this.chars.positiveLookahead(var1)) {
         throw new UnexpectedCharacterException(this.chars.lookahead(1), this.chars.currentOffset(), var1);
      }
   }

   enum CharType implements Stream.ElementType<Character> {
      DIGIT {
         public boolean isMatchedBy(Character var1) {
            return var1 == null ? false : var1 >= '0' && var1 <= '9';
         }
      },
      LETTER {
         public boolean isMatchedBy(Character var1) {
            return var1 == null ? false : var1 >= 'a' && var1 <= 'z' || var1 >= 'A' && var1 <= 'Z';
         }
      },
      DOT {
         public boolean isMatchedBy(Character var1) {
            return var1 == null ? false : var1 == '.';
         }
      },
      HYPHEN {
         public boolean isMatchedBy(Character var1) {
            return var1 == null ? false : var1 == '-';
         }
      },
      PLUS {
         public boolean isMatchedBy(Character var1) {
            return var1 == null ? false : var1 == '+';
         }
      },
      EOI {
         public boolean isMatchedBy(Character var1) {
            return var1 == null;
         }
      },
      ILLEGAL {
         public boolean isMatchedBy(Character var1) {
            EnumSet var2 = EnumSet.of(ILLEGAL);

            for (VersionParser.CharType var4 : EnumSet.complementOf(var2)) {
               if (var4.isMatchedBy(var1)) {
                  return false;
               }
            }

            return true;
         }
      };

      CharType() {
      }

      static VersionParser.CharType forCharacter(Character var0) {
         for (VersionParser.CharType var4 : values()) {
            if (var4.isMatchedBy(var0)) {
               return var4;
            }
         }

         return null;
      }
   }
}
