package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class PathParser {
   static ConfigOrigin apiOrigin = SimpleConfigOrigin.newSimple("path parameter");

   static ConfigNodePath parsePathNode(String var0) {
      return parsePathNode(var0, ConfigSyntax.CONF);
   }

   static ConfigNodePath parsePathNode(String var0, ConfigSyntax var1) {
      StringReader var2 = new StringReader(var0);

      try {
         Iterator var3 = Tokenizer.tokenize(apiOrigin, var2, var1);
         var3.next();
         return parsePathNodeExpression(var3, apiOrigin, var0, var1);
      } finally {
         var2.close();
      }
   }

   static Path parsePath(String var0) {
      Path var1 = speculativeFastParsePath(var0);
      if (var1 != null) {
         return var1;
      }

      StringReader var2 = new StringReader(var0);

      try {
         Iterator var3 = Tokenizer.tokenize(apiOrigin, var2, ConfigSyntax.CONF);
         var3.next();
         return parsePathExpression(var3, apiOrigin, var0);
      } finally {
         var2.close();
      }
   }

   protected static Path parsePathExpression(Iterator<Token> var0, ConfigOrigin var1) {
      return parsePathExpression(var0, var1, null, null, ConfigSyntax.CONF);
   }

   protected static Path parsePathExpression(Iterator<Token> var0, ConfigOrigin var1, String var2) {
      return parsePathExpression(var0, var1, var2, null, ConfigSyntax.CONF);
   }

   protected static ConfigNodePath parsePathNodeExpression(Iterator<Token> var0, ConfigOrigin var1) {
      return parsePathNodeExpression(var0, var1, null, ConfigSyntax.CONF);
   }

   protected static ConfigNodePath parsePathNodeExpression(Iterator<Token> var0, ConfigOrigin var1, String var2, ConfigSyntax var3) {
      ArrayList var4 = new ArrayList();
      Path var5 = parsePathExpression(var0, var1, var2, var4, var3);
      return new ConfigNodePath(var5, var4);
   }

   protected static Path parsePathExpression(Iterator<Token> var0, ConfigOrigin var1, String var2, ArrayList<Token> var3, ConfigSyntax var4) {
      ArrayList var5 = new ArrayList();
      var5.add(new PathParser.Element("", false));
      if (!var0.hasNext()) {
         throw new ConfigException.BadPath(var1, var2, "Expecting a field name or path here, but got nothing");
      }

      while (var0.hasNext()) {
         Token var6 = (Token)var0.next();
         if (var3 != null) {
            var3.add(var6);
         }

         if (!Tokens.isIgnoredWhitespace(var6)) {
            if (Tokens.isValueWithType(var6, ConfigValueType.STRING)) {
               AbstractConfigValue var7 = Tokens.getValue(var6);
               String var8 = var7.transformToString();
               addPathText(var5, true, var8);
            } else if (var6 != Tokens.END) {
               String var10;
               if (Tokens.isValue(var6)) {
                  AbstractConfigValue var12 = Tokens.getValue(var6);
                  if (var3 != null) {
                     var3.remove(var3.size() - 1);
                     var3.addAll(splitTokenOnPeriod(var6, var4));
                  }

                  var10 = var12.transformToString();
               } else {
                  if (!Tokens.isUnquotedText(var6)) {
                     throw new ConfigException.BadPath(
                        var1, var2, "Token not allowed in path expression: " + var6 + " (you can double-quote this token if you really want it here)"
                     );
                  }

                  if (var3 != null) {
                     var3.remove(var3.size() - 1);
                     var3.addAll(splitTokenOnPeriod(var6, var4));
                  }

                  var10 = Tokens.getUnquotedText(var6);
               }

               addPathText(var5, false, var10);
            }
         }
      }

      PathBuilder var9 = new PathBuilder();

      for (PathParser.Element var13 : var5) {
         if (var13.sb.length() == 0 && !var13.canBeEmpty) {
            throw new ConfigException.BadPath(
               var1, var2, "path has a leading, trailing, or two adjacent period '.' (use quoted \"\" empty string if you want an empty element)"
            );
         }

         var9.appendKey(var13.sb.toString());
      }

      return var9.result();
   }

   private static Collection<Token> splitTokenOnPeriod(Token var0, ConfigSyntax var1) {
      String var2 = var0.tokenText();
      if (var2.equals(".")) {
         return Collections.singletonList(var0);
      }

      String[] var3 = var2.split("\\.");
      ArrayList var4 = new ArrayList();

      for (String var8 : var3) {
         if (var1 == ConfigSyntax.CONF) {
            var4.add(Tokens.newUnquotedText(var0.origin(), var8));
         } else {
            var4.add(Tokens.newString(var0.origin(), var8, "\"" + var8 + "\""));
         }

         var4.add(Tokens.newUnquotedText(var0.origin(), "."));
      }

      if (var2.charAt(var2.length() - 1) != '.') {
         var4.remove(var4.size() - 1);
      }

      return var4;
   }

   private static void addPathText(List<PathParser.Element> var0, boolean var1, String var2) {
      int var3 = var1 ? -1 : var2.indexOf(46);
      PathParser.Element var4 = (PathParser.Element)var0.get(var0.size() - 1);
      if (var3 < 0) {
         var4.sb.append(var2);
         if (var1 && var4.sb.length() == 0) {
            var4.canBeEmpty = true;
         }
      } else {
         var4.sb.append(var2.substring(0, var3));
         var0.add(new PathParser.Element("", false));
         addPathText(var0, false, var2.substring(var3 + 1));
      }
   }

   private static boolean looksUnsafeForFastParser(String var0) {
      boolean var1 = true;
      int var2 = var0.length();
      if (var0.isEmpty()) {
         return true;
      }

      if (var0.charAt(0) == '.') {
         return true;
      }

      if (var0.charAt(var2 - 1) == '.') {
         return true;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && var4 != '_') {
            if (var4 == '.') {
               if (var1) {
                  return true;
               }

               var1 = true;
            } else {
               if (var4 != '-') {
                  return true;
               }

               if (var1) {
                  return true;
               }
            }
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   private static Path fastPathBuild(Path var0, String var1, int var2) {
      int var3 = var1.lastIndexOf(46, var2 - 1);
      ArrayList var4 = new ArrayList();
      var4.add(Tokens.newUnquotedText(null, var1));
      Path var5 = new Path(var1.substring(var3 + 1, var2), var0);
      return var3 < 0 ? var5 : fastPathBuild(var5, var1, var3);
   }

   private static Path speculativeFastParsePath(String var0) {
      String var1 = ConfigImplUtil.unicodeTrim(var0);
      return looksUnsafeForFastParser(var1) ? null : fastPathBuild(null, var1, var1.length());
   }

   static class Element {
      StringBuilder sb;
      boolean canBeEmpty;

      Element(String var1, boolean var2) {
         this.canBeEmpty = var2;
         this.sb = new StringBuilder(var1);
      }

      @Override
      public String toString() {
         return "Element(" + this.sb.toString() + "," + this.canBeEmpty + ")";
      }
   }
}
