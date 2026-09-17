package com.llamalad7.mixinextras.lib.semver.util;

import java.util.Arrays;

public class UnexpectedElementException extends RuntimeException {
   private final Object unexpected;
   private final int position;
   private final Stream.ElementType<?>[] expected;

   UnexpectedElementException(Object var1, int var2, Stream.ElementType<?>... var3) {
      super(createMessage(var1, var2, var3));
      this.unexpected = var1;
      this.position = var2;
      this.expected = var3;
   }

   public Object getUnexpectedElement() {
      return this.unexpected;
   }

   public int getPosition() {
      return this.position;
   }

   public Stream.ElementType<?>[] getExpectedElementTypes() {
      return this.expected;
   }

   @Override
   public String toString() {
      return this.getMessage();
   }

   private static String createMessage(Object var0, int var1, Stream.ElementType<?>... var2) {
      String var3 = String.format("Unexpected element '%s' at position %d", var0, var1);
      if (var2.length > 0) {
         var3 = var3 + String.format(", expecting %s", Arrays.toString(var2));
      }

      return var3;
   }
}
