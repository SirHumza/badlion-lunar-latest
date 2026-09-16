package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigValueType;
import java.util.List;

final class Tokens {
   static final Token START = Token.newWithoutOrigin(TokenType.START, "start of file", "");
   static final Token END = Token.newWithoutOrigin(TokenType.END, "end of file", "");
   static final Token COMMA = Token.newWithoutOrigin(TokenType.COMMA, "','", ",");
   static final Token EQUALS = Token.newWithoutOrigin(TokenType.EQUALS, "'='", "=");
   static final Token COLON = Token.newWithoutOrigin(TokenType.COLON, "':'", ":");
   static final Token OPEN_CURLY = Token.newWithoutOrigin(TokenType.OPEN_CURLY, "'{'", "{");
   static final Token CLOSE_CURLY = Token.newWithoutOrigin(TokenType.CLOSE_CURLY, "'}'", "}");
   static final Token OPEN_SQUARE = Token.newWithoutOrigin(TokenType.OPEN_SQUARE, "'['", "[");
   static final Token CLOSE_SQUARE = Token.newWithoutOrigin(TokenType.CLOSE_SQUARE, "']'", "]");
   static final Token PLUS_EQUALS = Token.newWithoutOrigin(TokenType.PLUS_EQUALS, "'+='", "+=");

   static boolean isValue(Token var0) {
      return var0 instanceof Tokens.Value;
   }

   static AbstractConfigValue getValue(Token var0) {
      if (var0 instanceof Tokens.Value) {
         return ((Tokens.Value)var0).value();
      } else {
         throw new ConfigException.BugOrBroken("tried to get value of non-value token " + var0);
      }
   }

   static boolean isValueWithType(Token var0, ConfigValueType var1) {
      return isValue(var0) && getValue(var0).valueType() == var1;
   }

   static boolean isNewline(Token var0) {
      return var0 instanceof Tokens.Line;
   }

   static boolean isProblem(Token var0) {
      return var0 instanceof Tokens.Problem;
   }

   static String getProblemWhat(Token var0) {
      if (var0 instanceof Tokens.Problem) {
         return ((Tokens.Problem)var0).what();
      } else {
         throw new ConfigException.BugOrBroken("tried to get problem what from " + var0);
      }
   }

   static String getProblemMessage(Token var0) {
      if (var0 instanceof Tokens.Problem) {
         return ((Tokens.Problem)var0).message();
      } else {
         throw new ConfigException.BugOrBroken("tried to get problem message from " + var0);
      }
   }

   static boolean getProblemSuggestQuotes(Token var0) {
      if (var0 instanceof Tokens.Problem) {
         return ((Tokens.Problem)var0).suggestQuotes();
      } else {
         throw new ConfigException.BugOrBroken("tried to get problem suggestQuotes from " + var0);
      }
   }

   static Throwable getProblemCause(Token var0) {
      if (var0 instanceof Tokens.Problem) {
         return ((Tokens.Problem)var0).cause();
      } else {
         throw new ConfigException.BugOrBroken("tried to get problem cause from " + var0);
      }
   }

   static boolean isComment(Token var0) {
      return var0 instanceof Tokens.Comment;
   }

   static String getCommentText(Token var0) {
      if (var0 instanceof Tokens.Comment) {
         return ((Tokens.Comment)var0).text();
      } else {
         throw new ConfigException.BugOrBroken("tried to get comment text from " + var0);
      }
   }

   static boolean isUnquotedText(Token var0) {
      return var0 instanceof Tokens.UnquotedText;
   }

   static String getUnquotedText(Token var0) {
      if (var0 instanceof Tokens.UnquotedText) {
         return ((Tokens.UnquotedText)var0).value();
      } else {
         throw new ConfigException.BugOrBroken("tried to get unquoted text from " + var0);
      }
   }

   static boolean isIgnoredWhitespace(Token var0) {
      return var0 instanceof Tokens.IgnoredWhitespace;
   }

   static boolean isSubstitution(Token var0) {
      return var0 instanceof Tokens.Substitution;
   }

   static List<Token> getSubstitutionPathExpression(Token var0) {
      if (var0 instanceof Tokens.Substitution) {
         return ((Tokens.Substitution)var0).value();
      } else {
         throw new ConfigException.BugOrBroken("tried to get substitution from " + var0);
      }
   }

   static boolean getSubstitutionOptional(Token var0) {
      if (var0 instanceof Tokens.Substitution) {
         return ((Tokens.Substitution)var0).optional();
      } else {
         throw new ConfigException.BugOrBroken("tried to get substitution optionality from " + var0);
      }
   }

   static Token newLine(ConfigOrigin var0) {
      return new Tokens.Line(var0);
   }

   static Token newProblem(ConfigOrigin var0, String var1, String var2, boolean var3, Throwable var4) {
      return new Tokens.Problem(var0, var1, var2, var3, var4);
   }

   static Token newCommentDoubleSlash(ConfigOrigin var0, String var1) {
      return new Tokens.Comment.DoubleSlashComment(var0, var1);
   }

   static Token newCommentHash(ConfigOrigin var0, String var1) {
      return new Tokens.Comment.HashComment(var0, var1);
   }

   static Token newUnquotedText(ConfigOrigin var0, String var1) {
      return new Tokens.UnquotedText(var0, var1);
   }

   static Token newIgnoredWhitespace(ConfigOrigin var0, String var1) {
      return new Tokens.IgnoredWhitespace(var0, var1);
   }

   static Token newSubstitution(ConfigOrigin var0, boolean var1, List<Token> var2) {
      return new Tokens.Substitution(var0, var1, var2);
   }

   static Token newValue(AbstractConfigValue var0) {
      return new Tokens.Value(var0);
   }

   static Token newValue(AbstractConfigValue var0, String var1) {
      return new Tokens.Value(var0, var1);
   }

   static Token newString(ConfigOrigin var0, String var1, String var2) {
      return newValue(new ConfigString.Quoted(var0, var1), var2);
   }

   static Token newInt(ConfigOrigin var0, int var1, String var2) {
      return newValue(ConfigNumber.newNumber(var0, var1, var2), var2);
   }

   static Token newDouble(ConfigOrigin var0, double var1, String var3) {
      return newValue(ConfigNumber.newNumber(var0, var1, var3), var3);
   }

   static Token newLong(ConfigOrigin var0, long var1, String var3) {
      return newValue(ConfigNumber.newNumber(var0, var1, var3), var3);
   }

   static Token newNull(ConfigOrigin var0) {
      return newValue(new ConfigNull(var0), "null");
   }

   static Token newBoolean(ConfigOrigin var0, boolean var1) {
      return newValue(new ConfigBoolean(var0, var1), "" + var1);
   }

   private abstract static class Comment extends Token {
      private final String text;

      Comment(ConfigOrigin var1, String var2) {
         super(TokenType.COMMENT, var1);
         this.text = var2;
      }

      String text() {
         return this.text;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("'#");
         var1.append(this.text);
         var1.append("' (COMMENT)");
         return var1.toString();
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.Comment;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1) && ((Tokens.Comment)var1).text.equals(this.text);
      }

      @Override
      public int hashCode() {
         int var1 = 41 * (41 + super.hashCode());
         return 41 * (var1 + this.text.hashCode());
      }

      static final class DoubleSlashComment extends Tokens.Comment {
         DoubleSlashComment(ConfigOrigin var1, String var2) {
            super(var1, var2);
         }

         @Override
         public String tokenText() {
            return "//" + super.text;
         }
      }

      static final class HashComment extends Tokens.Comment {
         HashComment(ConfigOrigin var1, String var2) {
            super(var1, var2);
         }

         @Override
         public String tokenText() {
            return "#" + super.text;
         }
      }
   }

   private static class IgnoredWhitespace extends Token {
      private final String value;

      IgnoredWhitespace(ConfigOrigin var1, String var2) {
         super(TokenType.IGNORED_WHITESPACE, var1);
         this.value = var2;
      }

      @Override
      public String toString() {
         return "'" + this.value + "' (WHITESPACE)";
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.IgnoredWhitespace;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1) && ((Tokens.IgnoredWhitespace)var1).value.equals(this.value);
      }

      @Override
      public int hashCode() {
         return 41 * (41 + super.hashCode()) + this.value.hashCode();
      }

      @Override
      public String tokenText() {
         return this.value;
      }
   }

   private static class Line extends Token {
      Line(ConfigOrigin var1) {
         super(TokenType.NEWLINE, var1);
      }

      @Override
      public String toString() {
         return "'\\n'@" + this.lineNumber();
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.Line;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1) && ((Tokens.Line)var1).lineNumber() == this.lineNumber();
      }

      @Override
      public int hashCode() {
         return 41 * (41 + super.hashCode()) + this.lineNumber();
      }

      @Override
      public String tokenText() {
         return "\n";
      }
   }

   private static class Problem extends Token {
      private final String what;
      private final String message;
      private final boolean suggestQuotes;
      private final Throwable cause;

      Problem(ConfigOrigin var1, String var2, String var3, boolean var4, Throwable var5) {
         super(TokenType.PROBLEM, var1);
         this.what = var2;
         this.message = var3;
         this.suggestQuotes = var4;
         this.cause = var5;
      }

      String what() {
         return this.what;
      }

      String message() {
         return this.message;
      }

      boolean suggestQuotes() {
         return this.suggestQuotes;
      }

      Throwable cause() {
         return this.cause;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append('\'');
         var1.append(this.what);
         var1.append('\'');
         var1.append(" (");
         var1.append(this.message);
         var1.append(")");
         return var1.toString();
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.Problem;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1)
            && ((Tokens.Problem)var1).what.equals(this.what)
            && ((Tokens.Problem)var1).message.equals(this.message)
            && ((Tokens.Problem)var1).suggestQuotes == this.suggestQuotes
            && ConfigImplUtil.equalsHandlingNull(((Tokens.Problem)var1).cause, this.cause);
      }

      @Override
      public int hashCode() {
         int var1 = 41 * (41 + super.hashCode());
         var1 = 41 * (var1 + this.what.hashCode());
         var1 = 41 * (var1 + this.message.hashCode());
         var1 = 41 * (var1 + Boolean.valueOf(this.suggestQuotes).hashCode());
         if (this.cause != null) {
            var1 = 41 * (var1 + this.cause.hashCode());
         }

         return var1;
      }
   }

   private static class Substitution extends Token {
      private final boolean optional;
      private final List<Token> value;

      Substitution(ConfigOrigin var1, boolean var2, List<Token> var3) {
         super(TokenType.SUBSTITUTION, var1);
         this.optional = var2;
         this.value = var3;
      }

      boolean optional() {
         return this.optional;
      }

      List<Token> value() {
         return this.value;
      }

      @Override
      public String tokenText() {
         return "${" + (this.optional ? "?" : "") + Tokenizer.render(this.value.iterator()) + "}";
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder();

         for (Token var3 : this.value) {
            var1.append(var3.toString());
         }

         return "'${" + var1.toString() + "}'";
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.Substitution;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1) && ((Tokens.Substitution)var1).value.equals(this.value);
      }

      @Override
      public int hashCode() {
         return 41 * (41 + super.hashCode()) + this.value.hashCode();
      }
   }

   private static class UnquotedText extends Token {
      private final String value;

      UnquotedText(ConfigOrigin var1, String var2) {
         super(TokenType.UNQUOTED_TEXT, var1);
         this.value = var2;
      }

      String value() {
         return this.value;
      }

      @Override
      public String toString() {
         return "'" + this.value + "'";
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.UnquotedText;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1) && ((Tokens.UnquotedText)var1).value.equals(this.value);
      }

      @Override
      public int hashCode() {
         return 41 * (41 + super.hashCode()) + this.value.hashCode();
      }

      @Override
      public String tokenText() {
         return this.value;
      }
   }

   private static class Value extends Token {
      private final AbstractConfigValue value;

      Value(AbstractConfigValue var1) {
         this(var1, null);
      }

      Value(AbstractConfigValue var1, String var2) {
         super(TokenType.VALUE, var1.origin(), var2);
         this.value = var1;
      }

      AbstractConfigValue value() {
         return this.value;
      }

      @Override
      public String toString() {
         return this.value().resolveStatus() == ResolveStatus.RESOLVED
            ? "'" + this.value().unwrapped() + "' (" + this.value.valueType().name() + ")"
            : "'<unresolved value>' (" + this.value.valueType().name() + ")";
      }

      @Override
      protected boolean canEqual(Object var1) {
         return var1 instanceof Tokens.Value;
      }

      @Override
      public boolean equals(Object var1) {
         return super.equals(var1) && ((Tokens.Value)var1).value.equals(this.value);
      }

      @Override
      public int hashCode() {
         return 41 * (41 + super.hashCode()) + this.value.hashCode();
      }
   }
}
