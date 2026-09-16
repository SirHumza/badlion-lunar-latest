package com.moonsworth.lunar.lib.adventure.text.serializer.legacy;

import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class CharacterAndFormatSet {
   static final CharacterAndFormatSet DEFAULT = of(CharacterAndFormat.defaults());
   final List<TextFormat> formats;
   final List<TextColor> colors;
   final String characters;

   static CharacterAndFormatSet of(List<CharacterAndFormat> var0) {
      int var1 = var0.size();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList(var1);
      StringBuilder var4 = new StringBuilder(var1);

      for (int var5 = 0; var5 < var1; var5++) {
         CharacterAndFormat var6 = (CharacterAndFormat)var0.get(var5);
         char var7 = var6.character();
         TextFormat var8 = var6.format();
         boolean var9 = var8 instanceof TextColor;
         var4.append(var7);
         var3.add(var8);
         if (var9) {
            var2.add((TextColor)var8);
         }

         if (var6.caseInsensitive()) {
            boolean var10 = false;
            if (Character.isUpperCase(var7)) {
               var4.append(Character.toLowerCase(var7));
               var10 = true;
            } else if (Character.isLowerCase(var7)) {
               var4.append(Character.toUpperCase(var7));
               var10 = true;
            }

            if (var10) {
               var3.add(var8);
               if (var9) {
                  var2.add((TextColor)var8);
               }
            }
         }
      }

      if (var3.size() != var4.length()) {
         throw new IllegalStateException("formats length differs from characters length");
      } else {
         return new CharacterAndFormatSet(Collections.unmodifiableList(var3), Collections.unmodifiableList(var2), var4.toString());
      }
   }

   CharacterAndFormatSet(List<TextFormat> var1, List<TextColor> var2, String var3) {
      this.formats = var1;
      this.colors = var2;
      this.characters = var3;
   }
}
