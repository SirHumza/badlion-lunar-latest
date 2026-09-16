package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;

final class ConfigNodePath extends AbstractConfigNode {
   private final Path path;
   final ArrayList<Token> tokens;

   ConfigNodePath(Path var1, Collection<Token> var2) {
      this.path = var1;
      this.tokens = new ArrayList<>(var2);
   }

   @Override
   protected Collection<Token> tokens() {
      return this.tokens;
   }

   protected Path value() {
      return this.path;
   }

   protected ConfigNodePath subPath(int var1) {
      int var2 = 0;
      ArrayList var3 = new ArrayList<>(this.tokens);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         if (Tokens.isUnquotedText((Token)var3.get(var4)) && ((Token)var3.get(var4)).tokenText().equals(".")) {
            var2++;
         }

         if (var2 == var1) {
            return new ConfigNodePath(this.path.subPath(var1), var3.subList(var4 + 1, var3.size()));
         }
      }

      throw new ConfigException.BugOrBroken("Tried to remove too many elements from a Path node");
   }

   protected ConfigNodePath first() {
      ArrayList var1 = new ArrayList<>(this.tokens);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (Tokens.isUnquotedText((Token)var1.get(var2)) && ((Token)var1.get(var2)).tokenText().equals(".")) {
            return new ConfigNodePath(this.path.subPath(0, 1), var1.subList(0, var2));
         }
      }

      return this;
   }
}
