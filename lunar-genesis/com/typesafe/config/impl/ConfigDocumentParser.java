package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

final class ConfigDocumentParser {
   static ConfigNodeRoot parse(Iterator<Token> var0, ConfigOrigin var1, ConfigParseOptions var2) {
      ConfigSyntax var3 = var2.getSyntax() == null ? ConfigSyntax.CONF : var2.getSyntax();
      ConfigDocumentParser.ParseContext var4 = new ConfigDocumentParser.ParseContext(var3, var1, var0);
      return var4.parse();
   }

   static AbstractConfigNodeValue parseValue(Iterator<Token> var0, ConfigOrigin var1, ConfigParseOptions var2) {
      ConfigSyntax var3 = var2.getSyntax() == null ? ConfigSyntax.CONF : var2.getSyntax();
      ConfigDocumentParser.ParseContext var4 = new ConfigDocumentParser.ParseContext(var3, var1, var0);
      return var4.parseSingleValue();
   }

   private static final class ParseContext {
      private int lineNumber;
      private final Stack<Token> buffer;
      private final Iterator<Token> tokens;
      private final ConfigSyntax flavor;
      private final ConfigOrigin baseOrigin;
      int equalsCount;
      private final String ExpectingClosingParenthesisError = "expecting a close parentheses ')' here, not: ";

      ParseContext(ConfigSyntax var1, ConfigOrigin var2, Iterator<Token> var3) {
         this.lineNumber = 1;
         this.buffer = new Stack<>();
         this.tokens = var3;
         this.flavor = var1;
         this.equalsCount = 0;
         this.baseOrigin = var2;
      }

      private Token popToken() {
         return this.buffer.isEmpty() ? this.tokens.next() : this.buffer.pop();
      }

      private Token nextToken() {
         Token var1 = this.popToken();
         if (this.flavor == ConfigSyntax.JSON) {
            if (Tokens.isUnquotedText(var1) && !isUnquotedWhitespace(var1)) {
               throw this.parseError("Token not allowed in valid JSON: '" + Tokens.getUnquotedText(var1) + "'");
            }

            if (Tokens.isSubstitution(var1)) {
               throw this.parseError("Substitutions (${} syntax) not allowed in JSON");
            }
         }

         return var1;
      }

      private Token nextTokenCollectingWhitespace(Collection<AbstractConfigNode> var1) {
         while (true) {
            Token var2 = this.nextToken();
            if (!Tokens.isIgnoredWhitespace(var2) && !Tokens.isNewline(var2) && !isUnquotedWhitespace(var2)) {
               if (!Tokens.isComment(var2)) {
                  int var3 = var2.lineNumber();
                  if (var3 >= 0) {
                     this.lineNumber = var3;
                  }

                  return var2;
               }

               var1.add(new ConfigNodeComment(var2));
            } else {
               var1.add(new ConfigNodeSingleToken(var2));
               if (Tokens.isNewline(var2)) {
                  this.lineNumber = var2.lineNumber() + 1;
               }
            }
         }
      }

      private void putBack(Token var1) {
         this.buffer.push(var1);
      }

      private boolean checkElementSeparator(Collection<AbstractConfigNode> var1) {
         if (this.flavor == ConfigSyntax.JSON) {
            Token var4 = this.nextTokenCollectingWhitespace(var1);
            if (var4 == Tokens.COMMA) {
               var1.add(new ConfigNodeSingleToken(var4));
               return true;
            } else {
               this.putBack(var4);
               return false;
            }
         } else {
            boolean var2 = false;
            Token var3 = this.nextToken();

            while (true) {
               if (Tokens.isIgnoredWhitespace(var3) || isUnquotedWhitespace(var3)) {
                  var1.add(new ConfigNodeSingleToken(var3));
               } else if (Tokens.isComment(var3)) {
                  var1.add(new ConfigNodeComment(var3));
               } else {
                  if (!Tokens.isNewline(var3)) {
                     if (var3 == Tokens.COMMA) {
                        var1.add(new ConfigNodeSingleToken(var3));
                        return true;
                     }

                     this.putBack(var3);
                     return var2;
                  }

                  var2 = true;
                  this.lineNumber++;
                  var1.add(new ConfigNodeSingleToken(var3));
               }

               var3 = this.nextToken();
            }
         }
      }

      private AbstractConfigNodeValue consolidateValues(Collection<AbstractConfigNode> var1) {
         if (this.flavor == ConfigSyntax.JSON) {
            return null;
         }

         ArrayList var2 = new ArrayList();
         int var3 = 0;
         Token var4 = this.nextTokenCollectingWhitespace(var1);

         while (true) {
            AbstractConfigNodeValue var5 = null;
            if (Tokens.isIgnoredWhitespace(var4)) {
               var2.add(new ConfigNodeSingleToken(var4));
               var4 = this.nextToken();
            } else {
               if (!Tokens.isValue(var4)
                  && !Tokens.isUnquotedText(var4)
                  && !Tokens.isSubstitution(var4)
                  && var4 != Tokens.OPEN_CURLY
                  && var4 != Tokens.OPEN_SQUARE) {
                  this.putBack(var4);
                  if (var3 < 2) {
                     var5 = null;

                     for (AbstractConfigNode var7 : var2) {
                        if (var7 instanceof AbstractConfigNodeValue) {
                           var5 = (AbstractConfigNodeValue)var7;
                        } else if (var5 == null) {
                           var1.add(var7);
                        } else {
                           this.putBack(new ArrayList<>(var7.tokens()).get(0));
                        }
                     }

                     return var5;
                  }

                  for (int var9 = var2.size() - 1; var9 >= 0 && var2.get(var9) instanceof ConfigNodeSingleToken; var9--) {
                     this.putBack(((ConfigNodeSingleToken)var2.get(var9)).token());
                     var2.remove(var9);
                  }

                  return new ConfigNodeConcatenation(var2);
               }

               var5 = this.parseValue(var4);
               var3++;
               if (var5 == null) {
                  throw new ConfigException.BugOrBroken("no value");
               }

               var2.add(var5);
               var4 = this.nextToken();
            }
         }
      }

      private ConfigException parseError(String var1) {
         return this.parseError(var1, null);
      }

      private ConfigException parseError(String var1, Throwable var2) {
         return new ConfigException.Parse(this.baseOrigin.withLineNumber(this.lineNumber), var1, var2);
      }

      private String addQuoteSuggestion(String var1, String var2) {
         return this.addQuoteSuggestion(null, this.equalsCount > 0, var1, var2);
      }

      private String addQuoteSuggestion(Path var1, boolean var2, String var3, String var4) {
         String var5 = var1 != null ? var1.render() : null;
         String var6;
         if (var3.equals(Tokens.END.toString())) {
            if (var5 == null) {
               return var4;
            }

            var6 = var4 + " (if you intended '" + var5 + "' to be part of a value, instead of a key, try adding double quotes around the whole value";
         } else if (var5 != null) {
            var6 = var4 + " (if you intended " + var3 + " to be part of the value for '" + var5 + "', try enclosing the value in double quotes";
         } else {
            var6 = var4 + " (if you intended " + var3 + " to be part of a key or string value, try enclosing the key or value in double quotes";
         }

         return var2 ? var6 + ", or you may be able to rename the file .properties rather than .conf)" : var6 + ")";
      }

      private AbstractConfigNodeValue parseValue(Token var1) {
         AbstractConfigNodeValue var2 = null;
         int var3 = this.equalsCount;
         if (Tokens.isValue(var1) || Tokens.isUnquotedText(var1) || Tokens.isSubstitution(var1)) {
            var2 = new ConfigNodeSimpleValue(var1);
         } else if (var1 == Tokens.OPEN_CURLY) {
            var2 = this.parseObject(true);
         } else {
            if (var1 != Tokens.OPEN_SQUARE) {
               throw this.parseError(this.addQuoteSuggestion(var1.toString(), "Expecting a value but got wrong token: " + var1));
            }

            var2 = this.parseArray();
         }

         if (this.equalsCount != var3) {
            throw new ConfigException.BugOrBroken("Bug in config parser: unbalanced equals count");
         } else {
            return var2;
         }
      }

      private ConfigNodePath parseKey(Token var1) {
         if (this.flavor == ConfigSyntax.JSON) {
            if (Tokens.isValueWithType(var1, ConfigValueType.STRING)) {
               return PathParser.parsePathNodeExpression(Collections.singletonList(var1).iterator(), this.baseOrigin.withLineNumber(this.lineNumber));
            } else {
               throw this.parseError("Expecting close brace } or a field name here, got " + var1);
            }
         } else {
            ArrayList var2 = new ArrayList();

            Token var3;
            for (var3 = var1; Tokens.isValue(var3) || Tokens.isUnquotedText(var3); var3 = this.nextToken()) {
               var2.add(var3);
            }

            if (var2.isEmpty()) {
               throw this.parseError("expecting a close parentheses ')' here, not: " + var3);
            }

            this.putBack(var3);
            return PathParser.parsePathNodeExpression(var2.iterator(), this.baseOrigin.withLineNumber(this.lineNumber));
         }
      }

      private static boolean isIncludeKeyword(Token var0) {
         return Tokens.isUnquotedText(var0) && Tokens.getUnquotedText(var0).equals("include");
      }

      private static boolean isUnquotedWhitespace(Token var0) {
         if (!Tokens.isUnquotedText(var0)) {
            return false;
         }

         String var1 = Tokens.getUnquotedText(var0);

         for (int var2 = 0; var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            if (!ConfigImplUtil.isWhitespace(var3)) {
               return false;
            }
         }

         return true;
      }

      private boolean isKeyValueSeparatorToken(Token var1) {
         return this.flavor == ConfigSyntax.JSON ? var1 == Tokens.COLON : var1 == Tokens.COLON || var1 == Tokens.EQUALS || var1 == Tokens.PLUS_EQUALS;
      }

      private ConfigNodeInclude parseInclude(ArrayList<AbstractConfigNode> var1) {
         Token var2 = this.nextTokenCollectingWhitespace(var1);
         if (Tokens.isUnquotedText(var2)) {
            String var3 = Tokens.getUnquotedText(var2);
            if (var3.startsWith("required(")) {
               String var4 = var3.replaceFirst("required\\(", "");
               if (var4.length() > 0) {
                  this.putBack(Tokens.newUnquotedText(var2.origin(), var4));
               }

               var1.add(new ConfigNodeSingleToken(var2));
               ConfigNodeInclude var5 = this.parseIncludeResource(var1, true);
               var2 = this.nextTokenCollectingWhitespace(var1);
               if (Tokens.isUnquotedText(var2) && Tokens.getUnquotedText(var2).equals(")")) {
                  return var5;
               } else {
                  throw this.parseError("expecting a close parentheses ')' here, not: " + var2);
               }
            } else {
               this.putBack(var2);
               return this.parseIncludeResource(var1, false);
            }
         } else {
            this.putBack(var2);
            return this.parseIncludeResource(var1, false);
         }
      }

      private ConfigNodeInclude parseIncludeResource(ArrayList<AbstractConfigNode> var1, boolean var2) {
         Token var3 = this.nextTokenCollectingWhitespace(var1);
         if (Tokens.isUnquotedText(var3)) {
            String var4 = Tokens.getUnquotedText(var3);
            ConfigIncludeKind var5;
            String var6;
            if (var4.startsWith("url(")) {
               var5 = ConfigIncludeKind.URL;
               var6 = "url(";
            } else if (var4.startsWith("file(")) {
               var5 = ConfigIncludeKind.FILE;
               var6 = "file(";
            } else {
               if (!var4.startsWith("classpath(")) {
                  throw this.parseError(
                     "expecting include parameter to be quoted filename, file(), classpath(), or url(). No spaces are allowed before the open paren. Not expecting: "
                        + var3
                  );
               }

               var5 = ConfigIncludeKind.CLASSPATH;
               var6 = "classpath(";
            }

            String var7 = var4.replaceFirst("[^(]*\\(", "");
            if (var7.length() > 0) {
               this.putBack(Tokens.newUnquotedText(var3.origin(), var7));
            }

            var1.add(new ConfigNodeSingleToken(var3));
            var3 = this.nextTokenCollectingWhitespace(var1);
            if (!Tokens.isValueWithType(var3, ConfigValueType.STRING)) {
               throw this.parseError("expecting include " + var6 + ") parameter to be a quoted string, rather than: " + var3);
            }

            var1.add(new ConfigNodeSimpleValue(var3));
            var3 = this.nextTokenCollectingWhitespace(var1);
            if (Tokens.isUnquotedText(var3) && Tokens.getUnquotedText(var3).startsWith(")")) {
               String var8 = Tokens.getUnquotedText(var3).substring(1);
               if (var8.length() > 0) {
                  this.putBack(Tokens.newUnquotedText(var3.origin(), var8));
               }

               return new ConfigNodeInclude(var1, var5, var2);
            } else {
               throw this.parseError("expecting a close parentheses ')' here, not: " + var3);
            }
         } else if (Tokens.isValueWithType(var3, ConfigValueType.STRING)) {
            var1.add(new ConfigNodeSimpleValue(var3));
            return new ConfigNodeInclude(var1, ConfigIncludeKind.HEURISTIC, var2);
         } else {
            throw this.parseError("include keyword is not followed by a quoted string, but by: " + var3);
         }
      }

      private ConfigNodeComplexValue parseObject(boolean var1) {
         boolean var2 = false;
         Object var3 = null;
         boolean var4 = false;
         ArrayList var5 = new ArrayList();
         HashMap var7 = new HashMap();
         if (var1) {
            var5.add(new ConfigNodeSingleToken(Tokens.OPEN_CURLY));
         }

         while (true) {
            Token var8 = this.nextTokenCollectingWhitespace(var5);
            if (var8 == Tokens.CLOSE_CURLY) {
               if (this.flavor == ConfigSyntax.JSON && var2) {
                  throw this.parseError(this.addQuoteSuggestion(var8.toString(), "expecting a field name after a comma, got a close brace } instead"));
               }

               if (!var1) {
                  throw this.parseError(this.addQuoteSuggestion(var8.toString(), "unbalanced close brace '}' with no open brace"));
               }

               var5.add(new ConfigNodeSingleToken(Tokens.CLOSE_CURLY));
               break;
            }

            if (var8 == Tokens.END && !var1) {
               this.putBack(var8);
               break;
            }

            if (this.flavor != ConfigSyntax.JSON && isIncludeKeyword(var8)) {
               ArrayList var20 = new ArrayList();
               var20.add(new ConfigNodeSingleToken(var8));
               var5.add(this.parseInclude(var20));
               var2 = false;
            } else {
               ArrayList var6 = new ArrayList();
               Token var9 = var8;
               ConfigNodePath var10 = this.parseKey(var9);
               var6.add(var10);
               Token var11 = this.nextTokenCollectingWhitespace(var6);
               boolean var12 = false;
               AbstractConfigNodeValue var13;
               if (this.flavor == ConfigSyntax.CONF && var11 == Tokens.OPEN_CURLY) {
                  var13 = this.parseValue(var11);
               } else {
                  if (!this.isKeyValueSeparatorToken(var11)) {
                     throw this.parseError(this.addQuoteSuggestion(var11.toString(), "Key '" + var10.render() + "' may not be followed by token: " + var11));
                  }

                  var6.add(new ConfigNodeSingleToken(var11));
                  if (var11 == Tokens.EQUALS) {
                     var12 = true;
                     this.equalsCount++;
                  }

                  var13 = this.consolidateValues(var6);
                  if (var13 == null) {
                     var13 = this.parseValue(this.nextTokenCollectingWhitespace(var6));
                  }
               }

               var6.add(var13);
               if (var12) {
                  this.equalsCount--;
               }

               var4 = var12;
               String var14 = var10.value().first();
               Path var15 = var10.value().remainder();
               if (var15 == null) {
                  Boolean var16 = (Boolean)var7.get(var14);
                  if (var16 != null && this.flavor == ConfigSyntax.JSON) {
                     throw this.parseError("JSON does not allow duplicate fields: '" + var14 + "' was already seen");
                  }

                  var7.put(var14, true);
               } else {
                  if (this.flavor == ConfigSyntax.JSON) {
                     throw new ConfigException.BugOrBroken("somehow got multi-element path in JSON mode");
                  }

                  var7.put(var14, true);
               }

               var2 = false;
               var5.add(new ConfigNodeField(var6));
            }

            if (!this.checkElementSeparator(var5)) {
               var8 = this.nextTokenCollectingWhitespace(var5);
               if (var8 == Tokens.CLOSE_CURLY) {
                  if (!var1) {
                     throw this.parseError(this.addQuoteSuggestion((Path)var3, var4, var8.toString(), "unbalanced close brace '}' with no open brace"));
                  }

                  var5.add(new ConfigNodeSingleToken(var8));
               } else {
                  if (var1) {
                     throw this.parseError(this.addQuoteSuggestion((Path)var3, var4, var8.toString(), "Expecting close brace } or a comma, got " + var8));
                  }

                  if (var8 != Tokens.END) {
                     throw this.parseError(this.addQuoteSuggestion((Path)var3, var4, var8.toString(), "Expecting end of input or a comma, got " + var8));
                  }

                  this.putBack(var8);
               }
               break;
            }

            var2 = true;
         }

         return new ConfigNodeObject(var5);
      }

      private ConfigNodeComplexValue parseArray() {
         ArrayList var1 = new ArrayList();
         var1.add(new ConfigNodeSingleToken(Tokens.OPEN_SQUARE));
         AbstractConfigNodeValue var3 = this.consolidateValues(var1);
         if (var3 != null) {
            var1.add(var3);
         } else {
            Token var2 = this.nextTokenCollectingWhitespace(var1);
            if (var2 == Tokens.CLOSE_SQUARE) {
               var1.add(new ConfigNodeSingleToken(var2));
               return new ConfigNodeArray(var1);
            }

            if (!Tokens.isValue(var2)
               && var2 != Tokens.OPEN_CURLY
               && var2 != Tokens.OPEN_SQUARE
               && !Tokens.isUnquotedText(var2)
               && !Tokens.isSubstitution(var2)) {
               throw this.parseError(
                  "List should have ] or a first element after the open [, instead had token: "
                     + var2
                     + " (if you want "
                     + var2
                     + " to be part of a string value, then double-quote it)"
               );
            }

            var3 = this.parseValue(var2);
            var1.add(var3);
         }

         while (this.checkElementSeparator(var1)) {
            var3 = this.consolidateValues(var1);
            if (var3 == null) {
               Token var4 = this.nextTokenCollectingWhitespace(var1);
               if (!Tokens.isValue(var4)
                  && var4 != Tokens.OPEN_CURLY
                  && var4 != Tokens.OPEN_SQUARE
                  && !Tokens.isUnquotedText(var4)
                  && !Tokens.isSubstitution(var4)) {
                  if (this.flavor == ConfigSyntax.JSON || var4 != Tokens.CLOSE_SQUARE) {
                     throw this.parseError(
                        "List should have had new element after a comma, instead had token: "
                           + var4
                           + " (if you want the comma or "
                           + var4
                           + " to be part of a string value, then double-quote it)"
                     );
                  }

                  this.putBack(var4);
               } else {
                  var3 = this.parseValue(var4);
                  var1.add(var3);
               }
            } else {
               var1.add(var3);
            }
         }

         Token var5 = this.nextTokenCollectingWhitespace(var1);
         if (var5 == Tokens.CLOSE_SQUARE) {
            var1.add(new ConfigNodeSingleToken(var5));
            return new ConfigNodeArray(var1);
         } else {
            throw this.parseError(
               "List should have ended with ] or had a comma, instead had token: "
                  + var5
                  + " (if you want "
                  + var5
                  + " to be part of a string value, then double-quote it)"
            );
         }
      }

      ConfigNodeRoot parse() {
         ArrayList var1 = new ArrayList();
         Token var2 = this.nextToken();
         if (var2 != Tokens.START) {
            throw new ConfigException.BugOrBroken("token stream did not begin with START, had " + var2);
         }

         var2 = this.nextTokenCollectingWhitespace(var1);
         ConfigNodeComplexValue var3 = null;
         boolean var4 = false;
         if (var2 != Tokens.OPEN_CURLY && var2 != Tokens.OPEN_SQUARE) {
            if (this.flavor == ConfigSyntax.JSON) {
               if (var2 == Tokens.END) {
                  throw this.parseError("Empty document");
               }

               throw this.parseError("Document must have an object or array at root, unexpected token: " + var2);
            }

            this.putBack(var2);
            var4 = true;
            var3 = this.parseObject(false);
         } else {
            var3 = this.parseValue(var2);
         }

         if (var3 instanceof ConfigNodeObject && var4) {
            var1.addAll(var3.children());
         } else {
            var1.add(var3);
         }

         var2 = this.nextTokenCollectingWhitespace(var1);
         if (var2 == Tokens.END) {
            return var4
               ? new ConfigNodeRoot(Collections.singletonList(new ConfigNodeObject(var1)), this.baseOrigin)
               : new ConfigNodeRoot(var1, this.baseOrigin);
         } else {
            throw this.parseError("Document has trailing tokens after first object or array: " + var2);
         }
      }

      AbstractConfigNodeValue parseSingleValue() {
         Token var1 = this.nextToken();
         if (var1 == Tokens.START) {
            var1 = this.nextToken();
            if (Tokens.isIgnoredWhitespace(var1) || Tokens.isNewline(var1) || isUnquotedWhitespace(var1) || Tokens.isComment(var1)) {
               throw this.parseError("The value from withValueText cannot have leading or trailing newlines, whitespace, or comments");
            }

            if (var1 == Tokens.END) {
               throw this.parseError("Empty value");
            }

            if (this.flavor == ConfigSyntax.JSON) {
               AbstractConfigNodeValue var7 = this.parseValue(var1);
               var1 = this.nextToken();
               if (var1 == Tokens.END) {
                  return var7;
               } else {
                  throw this.parseError(
                     "Parsing JSON and the value set in withValueText was either a concatenation or had trailing whitespace, newlines, or comments"
                  );
               }
            } else {
               this.putBack(var1);
               ArrayList var2 = new ArrayList();
               AbstractConfigNodeValue var3 = this.consolidateValues(var2);
               var1 = this.nextToken();
               if (var1 == Tokens.END) {
                  return var3;
               } else {
                  throw this.parseError("The value from withValueText cannot have leading or trailing newlines, whitespace, or comments");
               }
            }
         } else {
            throw new ConfigException.BugOrBroken("token stream did not begin with START, had " + var1);
         }
      }
   }
}
