package com.llamalad7.mixinextras.lib.antlr.runtime;

import java.util.Arrays;

public class VocabularyImpl implements Vocabulary {
   private static final String[] EMPTY_NAMES = new String[0];
   public static final VocabularyImpl EMPTY_VOCABULARY = new VocabularyImpl(EMPTY_NAMES, EMPTY_NAMES, EMPTY_NAMES);
   private final String[] literalNames;
   private final String[] symbolicNames;
   private final String[] displayNames;
   private final int maxTokenType;

   public VocabularyImpl(String[] var1, String[] var2) {
      this(var1, var2, null);
   }

   public VocabularyImpl(String[] var1, String[] var2, String[] var3) {
      this.literalNames = var1 != null ? var1 : EMPTY_NAMES;
      this.symbolicNames = var2 != null ? var2 : EMPTY_NAMES;
      this.displayNames = var3 != null ? var3 : EMPTY_NAMES;
      this.maxTokenType = Math.max(this.displayNames.length, Math.max(this.literalNames.length, this.symbolicNames.length)) - 1;
   }

   public static Vocabulary fromTokenNames(String[] var0) {
      if (var0 != null && var0.length != 0) {
         String[] var1 = Arrays.copyOf(var0, var0.length);
         String[] var2 = Arrays.copyOf(var0, var0.length);

         for (int var3 = 0; var3 < var0.length; var3++) {
            String var4 = var0[var3];
            if (var4 != null) {
               if (!var4.isEmpty()) {
                  char var5 = var4.charAt(0);
                  if (var5 == '\'') {
                     var2[var3] = null;
                     continue;
                  }

                  if (Character.isUpperCase(var5)) {
                     var1[var3] = null;
                     continue;
                  }
               }

               var1[var3] = null;
               var2[var3] = null;
            }
         }

         return new VocabularyImpl(var1, var2, var0);
      } else {
         return EMPTY_VOCABULARY;
      }
   }

   @Override
   public String getLiteralName(int var1) {
      return var1 >= 0 && var1 < this.literalNames.length ? this.literalNames[var1] : null;
   }

   @Override
   public String getSymbolicName(int var1) {
      if (var1 >= 0 && var1 < this.symbolicNames.length) {
         return this.symbolicNames[var1];
      } else {
         return var1 == -1 ? "EOF" : null;
      }
   }

   @Override
   public String getDisplayName(int var1) {
      if (var1 >= 0 && var1 < this.displayNames.length) {
         String var2 = this.displayNames[var1];
         if (var2 != null) {
            return var2;
         }
      }

      String var4 = this.getLiteralName(var1);
      if (var4 != null) {
         return var4;
      }

      String var3 = this.getSymbolicName(var1);
      return var3 != null ? var3 : Integer.toString(var1);
   }
}
