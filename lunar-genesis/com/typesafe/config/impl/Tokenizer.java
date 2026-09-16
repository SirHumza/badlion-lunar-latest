package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigSyntax;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

final class Tokenizer {
   private static String asString(int var0) {
      if (var0 == 10) {
         return "newline";
      } else if (var0 == 9) {
         return "tab";
      } else if (var0 == -1) {
         return "end of file";
      } else {
         return ConfigImplUtil.isC0Control(var0) ? String.format("control character 0x%x", var0) : String.format("%c", var0);
      }
   }

   static Iterator<Token> tokenize(ConfigOrigin var0, Reader var1, ConfigSyntax var2) {
      return new Tokenizer.TokenIterator(var0, var1, var2 != ConfigSyntax.JSON);
   }

   static String render(Iterator<Token> var0) {
      StringBuilder var1 = new StringBuilder();

      while (var0.hasNext()) {
         var1.append(((Token)var0.next()).tokenText());
      }

      return var1.toString();
   }

   private static class ProblemException extends Exception {
      private static final long serialVersionUID = 1L;
      private final Token problem;

      ProblemException(Token var1) {
         this.problem = var1;
      }

      Token problem() {
         return this.problem;
      }
   }

   private static class TokenIterator implements Iterator<Token> {
      private final SimpleConfigOrigin origin;
      private final Reader input;
      private final LinkedList<Integer> buffer;
      private int lineNumber;
      private ConfigOrigin lineOrigin;
      private final Queue<Token> tokens;
      private final Tokenizer.TokenIterator.WhitespaceSaver whitespaceSaver;
      private final boolean allowComments;
      static final String firstNumberChars = "0123456789-";
      static final String numberChars = "0123456789eE+-.";
      static final String notInUnquotedText = "$\"{}[]:=,+#`^?!@*&\\";

      TokenIterator(ConfigOrigin var1, Reader var2, boolean var3) {
         this.origin = (SimpleConfigOrigin)var1;
         this.input = var2;
         this.allowComments = var3;
         this.buffer = new LinkedList<>();
         this.lineNumber = 1;
         this.lineOrigin = this.origin.withLineNumber(this.lineNumber);
         this.tokens = new LinkedList<>();
         this.tokens.add(Tokens.START);
         this.whitespaceSaver = new Tokenizer.TokenIterator.WhitespaceSaver();
      }

      private int nextCharRaw() {
         if (this.buffer.isEmpty()) {
            try {
               return this.input.read();
            } catch (IOException var2) {
               throw new ConfigException.IO(this.origin, "read error: " + var2.getMessage(), var2);
            }
         } else {
            return this.buffer.pop();
         }
      }

      private void putBack(int var1) {
         if (this.buffer.size() > 2) {
            throw new ConfigException.BugOrBroken("bug: putBack() three times, undesirable look-ahead");
         }

         this.buffer.push(var1);
      }

      static boolean isWhitespace(int var0) {
         return ConfigImplUtil.isWhitespace(var0);
      }

      static boolean isWhitespaceNotNewline(int var0) {
         return var0 != 10 && ConfigImplUtil.isWhitespace(var0);
      }

      private boolean startOfComment(int var1) {
         if (var1 == -1) {
            return false;
         }

         if (this.allowComments) {
            if (var1 == 35) {
               return true;
            } else if (var1 == 47) {
               int var2 = this.nextCharRaw();
               this.putBack(var2);
               return var2 == 47;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }

      private int nextCharAfterWhitespace(Tokenizer.TokenIterator.WhitespaceSaver var1) {
         while (true) {
            int var2 = this.nextCharRaw();
            if (var2 == -1) {
               return -1;
            }

            if (!isWhitespaceNotNewline(var2)) {
               return var2;
            }

            var1.add(var2);
         }
      }

      private Tokenizer.ProblemException problem(String var1) {
         return this.problem("", var1, null);
      }

      private Tokenizer.ProblemException problem(String var1, String var2) {
         return this.problem(var1, var2, null);
      }

      private Tokenizer.ProblemException problem(String var1, String var2, boolean var3) {
         return this.problem(var1, var2, var3, null);
      }

      private Tokenizer.ProblemException problem(String var1, String var2, Throwable var3) {
         return problem(this.lineOrigin, var1, var2, var3);
      }

      private Tokenizer.ProblemException problem(String var1, String var2, boolean var3, Throwable var4) {
         return problem(this.lineOrigin, var1, var2, var3, var4);
      }

      private static Tokenizer.ProblemException problem(ConfigOrigin var0, String var1, String var2, Throwable var3) {
         return problem(var0, var1, var2, false, var3);
      }

      private static Tokenizer.ProblemException problem(ConfigOrigin var0, String var1, String var2, boolean var3, Throwable var4) {
         if (var1 != null && var2 != null) {
            return new Tokenizer.ProblemException(Tokens.newProblem(var0, var1, var2, var3, var4));
         } else {
            throw new ConfigException.BugOrBroken("internal error, creating bad ProblemException");
         }
      }

      private static Tokenizer.ProblemException problem(ConfigOrigin var0, String var1) {
         return problem(var0, "", var1, null);
      }

      private static ConfigOrigin lineOrigin(ConfigOrigin var0, int var1) {
         return ((SimpleConfigOrigin)var0).withLineNumber(var1);
      }

      private Token pullComment(int var1) {
         boolean var2 = false;
         if (var1 == 47) {
            int var3 = this.nextCharRaw();
            if (var3 != 47) {
               throw new ConfigException.BugOrBroken("called pullComment but // not seen");
            }

            var2 = true;
         }

         StringBuilder var5 = new StringBuilder();

         while (true) {
            int var4 = this.nextCharRaw();
            if (var4 == -1 || var4 == 10) {
               this.putBack(var4);
               return var2 ? Tokens.newCommentDoubleSlash(this.lineOrigin, var5.toString()) : Tokens.newCommentHash(this.lineOrigin, var5.toString());
            }

            var5.appendCodePoint(var4);
         }
      }

      private Token pullUnquotedText() {
         ConfigOrigin var1 = this.lineOrigin;
         StringBuilder var2 = new StringBuilder();

         int var3;
         for (var3 = this.nextCharRaw();
            var3 != -1 && "$\"{}[]:=,+#`^?!@*&\\".indexOf(var3) < 0 && !isWhitespace(var3) && !this.startOfComment(var3);
            var3 = this.nextCharRaw()
         ) {
            var2.appendCodePoint(var3);
            if (var2.length() == 4) {
               String var4 = var2.toString();
               if (var4.equals("true")) {
                  return Tokens.newBoolean(var1, true);
               }

               if (var4.equals("null")) {
                  return Tokens.newNull(var1);
               }
            } else if (var2.length() == 5) {
               String var5 = var2.toString();
               if (var5.equals("false")) {
                  return Tokens.newBoolean(var1, false);
               }
            }
         }

         this.putBack(var3);
         String var6 = var2.toString();
         return Tokens.newUnquotedText(var1, var6);
      }

      private Token pullNumber(int var1) {
         StringBuilder var2 = new StringBuilder();
         var2.appendCodePoint(var1);
         boolean var3 = false;

         int var4;
         for (var4 = this.nextCharRaw(); var4 != -1 && "0123456789eE+-.".indexOf(var4) >= 0; var4 = this.nextCharRaw()) {
            if (var4 == 46 || var4 == 101 || var4 == 69) {
               var3 = true;
            }

            var2.appendCodePoint(var4);
         }

         this.putBack(var4);
         String var5 = var2.toString();

         try {
            return var3 ? Tokens.newDouble(this.lineOrigin, Double.parseDouble(var5), var5) : Tokens.newLong(this.lineOrigin, Long.parseLong(var5), var5);
         } catch (NumberFormatException var11) {
            for (char var10 : var5.toCharArray()) {
               if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(var10) >= 0) {
                  throw this.problem(Tokenizer.asString(var10), "Reserved character '" + Tokenizer.asString(var10) + "' is not allowed outside quotes", true);
               }
            }

            return Tokens.newUnquotedText(this.lineOrigin, var5);
         }
      }

      private void pullEscapeSequence(StringBuilder var1, StringBuilder var2) {
         int var3 = this.nextCharRaw();
         if (var3 == -1) {
            throw this.problem("End of input but backslash in string had nothing after it");
         }

         var2.appendCodePoint(92);
         var2.appendCodePoint(var3);
         switch (var3) {
            case 34:
               var1.append('"');
               break;
            case 47:
               var1.append('/');
               break;
            case 92:
               var1.append('\\');
               break;
            case 98:
               var1.append('\b');
               break;
            case 102:
               var1.append('\f');
               break;
            case 110:
               var1.append('\n');
               break;
            case 114:
               var1.append('\r');
               break;
            case 116:
               var1.append('\t');
               break;
            case 117:
               char[] var4 = new char[4];

               for (int var5 = 0; var5 < 4; var5++) {
                  int var6 = this.nextCharRaw();
                  if (var6 == -1) {
                     throw this.problem("End of input but expecting 4 hex digits for \\uXXXX escape");
                  }

                  var4[var5] = (char)var6;
               }

               String var8 = new String(var4);
               var2.append(var4);

               try {
                  var1.appendCodePoint(Integer.parseInt(var8, 16));
                  break;
               } catch (NumberFormatException var7) {
                  throw this.problem(var8, String.format("Malformed hex digits after \\u escape in string: '%s'", var8), var7);
               }
            default:
               throw this.problem(
                  Tokenizer.asString(var3),
                  String.format(
                     "backslash followed by '%s', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)",
                     Tokenizer.asString(var3)
                  )
               );
         }
      }

      private void appendTripleQuotedString(StringBuilder var1, StringBuilder var2) {
         int var3 = 0;

         while (true) {
            int var4 = this.nextCharRaw();
            if (var4 == 34) {
               var3++;
            } else {
               if (var3 >= 3) {
                  var1.setLength(var1.length() - 3);
                  this.putBack(var4);
                  return;
               }

               var3 = 0;
               if (var4 == -1) {
                  throw this.problem("End of input but triple-quoted string was still open");
               }

               if (var4 == 10) {
                  this.lineNumber++;
                  this.lineOrigin = this.origin.withLineNumber(this.lineNumber);
               }
            }

            var1.appendCodePoint(var4);
            var2.appendCodePoint(var4);
         }
      }

      private Token pullQuotedString() {
         StringBuilder var1 = new StringBuilder();
         StringBuilder var2 = new StringBuilder();
         var2.appendCodePoint(34);

         while (true) {
            int var3 = this.nextCharRaw();
            if (var3 == -1) {
               throw this.problem("End of input but string quote was still open");
            }

            if (var3 == 92) {
               this.pullEscapeSequence(var1, var2);
            } else {
               if (var3 == 34) {
                  var2.appendCodePoint(var3);
                  if (var1.length() == 0) {
                     var3 = this.nextCharRaw();
                     if (var3 == 34) {
                        var2.appendCodePoint(var3);
                        this.appendTripleQuotedString(var1, var2);
                     } else {
                        this.putBack(var3);
                     }
                  }

                  return Tokens.newString(this.lineOrigin, var1.toString(), var2.toString());
               }

               if (ConfigImplUtil.isC0Control(var3)) {
                  throw this.problem(
                     Tokenizer.asString(var3), "JSON does not allow unescaped " + Tokenizer.asString(var3) + " in quoted strings, use a backslash escape"
                  );
               }

               var1.appendCodePoint(var3);
               var2.appendCodePoint(var3);
            }
         }
      }

      private Token pullPlusEquals() {
         int var1 = this.nextCharRaw();
         if (var1 != 61) {
            throw this.problem(Tokenizer.asString(var1), "'+' not followed by =, '" + Tokenizer.asString(var1) + "' not allowed after '+'", true);
         } else {
            return Tokens.PLUS_EQUALS;
         }
      }

      private Token pullSubstitution() {
         ConfigOrigin var1 = this.lineOrigin;
         int var2 = this.nextCharRaw();
         if (var2 != 123) {
            throw this.problem(Tokenizer.asString(var2), "'$' not followed by {, '" + Tokenizer.asString(var2) + "' not allowed after '$'", true);
         }

         boolean var3 = false;
         var2 = this.nextCharRaw();
         if (var2 == 63) {
            var3 = true;
         } else {
            this.putBack(var2);
         }

         Tokenizer.TokenIterator.WhitespaceSaver var4 = new Tokenizer.TokenIterator.WhitespaceSaver();
         ArrayList var5 = new ArrayList();

         while (true) {
            Token var6 = this.pullNextToken(var4);
            if (var6 == Tokens.CLOSE_CURLY) {
               return Tokens.newSubstitution(var1, var3, var5);
            }

            if (var6 == Tokens.END) {
               throw problem(var1, "Substitution ${ was not closed with a }");
            }

            Token var7 = var4.check(var6, var1, this.lineNumber);
            if (var7 != null) {
               var5.add(var7);
            }

            var5.add(var6);
         }
      }

      private Token pullNextToken(Tokenizer.TokenIterator.WhitespaceSaver var1) {
         int var2 = this.nextCharAfterWhitespace(var1);
         if (var2 == -1) {
            return Tokens.END;
         }

         if (var2 == 10) {
            Token var4 = Tokens.newLine(this.lineOrigin);
            this.lineNumber++;
            this.lineOrigin = this.origin.withLineNumber(this.lineNumber);
            return var4;
         }

         Token var3;
         if (this.startOfComment(var2)) {
            var3 = this.pullComment(var2);
         } else {
            switch (var2) {
               case 34:
                  var3 = this.pullQuotedString();
                  break;
               case 36:
                  var3 = this.pullSubstitution();
                  break;
               case 43:
                  var3 = this.pullPlusEquals();
                  break;
               case 44:
                  var3 = Tokens.COMMA;
                  break;
               case 58:
                  var3 = Tokens.COLON;
                  break;
               case 61:
                  var3 = Tokens.EQUALS;
                  break;
               case 91:
                  var3 = Tokens.OPEN_SQUARE;
                  break;
               case 93:
                  var3 = Tokens.CLOSE_SQUARE;
                  break;
               case 123:
                  var3 = Tokens.OPEN_CURLY;
                  break;
               case 125:
                  var3 = Tokens.CLOSE_CURLY;
                  break;
               default:
                  var3 = null;
            }

            if (var3 == null) {
               if ("0123456789-".indexOf(var2) >= 0) {
                  var3 = this.pullNumber(var2);
               } else {
                  if ("$\"{}[]:=,+#`^?!@*&\\".indexOf(var2) >= 0) {
                     throw this.problem(Tokenizer.asString(var2), "Reserved character '" + Tokenizer.asString(var2) + "' is not allowed outside quotes", true);
                  }

                  this.putBack(var2);
                  var3 = this.pullUnquotedText();
               }
            }
         }

         if (var3 == null) {
            throw new ConfigException.BugOrBroken("bug: failed to generate next token");
         } else {
            return var3;
         }
      }

      private static boolean isSimpleValue(Token var0) {
         return Tokens.isSubstitution(var0) || Tokens.isUnquotedText(var0) || Tokens.isValue(var0);
      }

      private void queueNextToken() {
         Token var1 = this.pullNextToken(this.whitespaceSaver);
         Token var2 = this.whitespaceSaver.check(var1, this.origin, this.lineNumber);
         if (var2 != null) {
            this.tokens.add(var2);
         }

         this.tokens.add(var1);
      }

      @Override
      public boolean hasNext() {
         return !this.tokens.isEmpty();
      }

      public Token next() {
         Token var1 = this.tokens.remove();
         if (this.tokens.isEmpty() && var1 != Tokens.END) {
            try {
               this.queueNextToken();
            } catch (Tokenizer.ProblemException var3) {
               this.tokens.add(var3.problem());
            }

            if (this.tokens.isEmpty()) {
               throw new ConfigException.BugOrBroken("bug: tokens queue should not be empty here");
            }
         }

         return var1;
      }

      @Override
      public void remove() {
         throw new UnsupportedOperationException("Does not make sense to remove items from token stream");
      }

      private static class WhitespaceSaver {
         private StringBuilder whitespace = new StringBuilder();
         private boolean lastTokenWasSimpleValue = false;

         WhitespaceSaver() {
         }

         void add(int var1) {
            this.whitespace.appendCodePoint(var1);
         }

         Token check(Token var1, ConfigOrigin var2, int var3) {
            return Tokenizer.TokenIterator.isSimpleValue(var1) ? this.nextIsASimpleValue(var2, var3) : this.nextIsNotASimpleValue(var2, var3);
         }

         private Token nextIsNotASimpleValue(ConfigOrigin var1, int var2) {
            this.lastTokenWasSimpleValue = false;
            return this.createWhitespaceTokenFromSaver(var1, var2);
         }

         private Token nextIsASimpleValue(ConfigOrigin var1, int var2) {
            Token var3 = this.createWhitespaceTokenFromSaver(var1, var2);
            if (!this.lastTokenWasSimpleValue) {
               this.lastTokenWasSimpleValue = true;
            }

            return var3;
         }

         private Token createWhitespaceTokenFromSaver(ConfigOrigin var1, int var2) {
            if (this.whitespace.length() > 0) {
               Token var3;
               if (this.lastTokenWasSimpleValue) {
                  var3 = Tokens.newUnquotedText(Tokenizer.TokenIterator.lineOrigin(var1, var2), this.whitespace.toString());
               } else {
                  var3 = Tokens.newIgnoredWhitespace(Tokenizer.TokenIterator.lineOrigin(var1, var2), this.whitespace.toString());
               }

               this.whitespace.setLength(0);
               return var3;
            } else {
               return null;
            }
         }
      }
   }
}
