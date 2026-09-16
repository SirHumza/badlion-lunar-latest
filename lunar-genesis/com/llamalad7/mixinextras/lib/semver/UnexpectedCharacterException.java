package com.llamalad7.mixinextras.lib.semver;

import com.llamalad7.mixinextras.lib.semver.util.UnexpectedElementException;
import java.util.Arrays;

public class UnexpectedCharacterException extends ParseException {
   private final Character unexpected;
   private final int position;
   private final VersionParser.CharType[] expected;

   UnexpectedCharacterException(UnexpectedElementException var1) {
      this((Character)var1.getUnexpectedElement(), var1.getPosition(), (VersionParser.CharType[])var1.getExpectedElementTypes());
   }

   UnexpectedCharacterException(Character var1, int var2, VersionParser.CharType... var3) {
      super(createMessage(var1, var2, var3));
      this.unexpected = var1;
      this.position = var2;
      this.expected = var3;
   }

   @Override
   public String toString() {
      return this.getMessage();
   }

   private static String createMessage(Character var0, int var1, VersionParser.CharType... var2) {
      String var3 = String.format("Unexpected character %s(%s) at position %d", VersionParser.CharType.forCharacter(var0), var0, var1);
      if (var2.length > 0) {
         var3 = var3 + String.format(", expecting %s", Arrays.toString(var2));
      }

      return var3;
   }
}
