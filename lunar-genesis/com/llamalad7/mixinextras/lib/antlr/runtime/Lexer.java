package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.LexerATNSimulator;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntegerStack;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Pair;
import java.util.EmptyStackException;

public abstract class Lexer extends Recognizer<Integer, LexerATNSimulator> implements TokenSource {
   public CharStream _input;
   protected Pair<TokenSource, CharStream> _tokenFactorySourcePair;
   protected TokenFactory<?> _factory = CommonTokenFactory.DEFAULT;
   public Token _token;
   public int _tokenStartCharIndex = -1;
   public int _tokenStartLine;
   public int _tokenStartCharPositionInLine;
   public boolean _hitEOF;
   public int _channel;
   public int _type;
   public final IntegerStack _modeStack = new IntegerStack();
   public int _mode = 0;
   public String _text;

   public Lexer(CharStream var1) {
      this._input = var1;
      this._tokenFactorySourcePair = new Pair<>(this, var1);
   }

   @Override
   public Token nextToken() {
      if (this._input == null) {
         throw new IllegalStateException("nextToken requires a non-null input stream.");
      }

      int var1 = this._input.mark();

      try {
         label89:
         while (!this._hitEOF) {
            this._token = null;
            this._channel = 0;
            this._tokenStartCharIndex = this._input.index();
            this._tokenStartCharPositionInLine = this.getInterpreter().getCharPositionInLine();
            this._tokenStartLine = this.getInterpreter().getLine();
            this._text = null;

            do {
               this._type = 0;

               int var2;
               try {
                  var2 = this.getInterpreter().match(this._input, this._mode);
               } catch (LexerNoViableAltException var7) {
                  this.notifyListeners(var7);
                  this.recover(var7);
                  var2 = -3;
               }

               if (this._input.LA(1) == -1) {
                  this._hitEOF = true;
               }

               if (this._type == 0) {
                  this._type = var2;
               }

               if (this._type == -3) {
                  continue label89;
               }
            } while (this._type == -2);

            if (this._token == null) {
               this.emit();
            }

            return this._token;
         }

         this.emitEOF();
         return this._token;
      } finally {
         this._input.release(var1);
      }
   }

   public void skip() {
      this._type = -3;
   }

   public void more() {
      this._type = -2;
   }

   public void mode(int var1) {
      this._mode = var1;
   }

   public void pushMode(int var1) {
      this._modeStack.push(this._mode);
      this.mode(var1);
   }

   public int popMode() {
      if (this._modeStack.isEmpty()) {
         throw new EmptyStackException();
      }

      this.mode(this._modeStack.pop());
      return this._mode;
   }

   @Override
   public TokenFactory<? extends Token> getTokenFactory() {
      return (TokenFactory<? extends Token>)this._factory;
   }

   @Override
   public CharStream getInputStream() {
      return this._input;
   }

   public void emit(Token var1) {
      this._token = var1;
   }

   public Token emit() {
      Token var1 = this._factory
         .create(
            this._tokenFactorySourcePair,
            this._type,
            this._text,
            this._channel,
            this._tokenStartCharIndex,
            this.getCharIndex() - 1,
            this._tokenStartLine,
            this._tokenStartCharPositionInLine
         );
      this.emit(var1);
      return var1;
   }

   public Token emitEOF() {
      int var1 = this.getCharPositionInLine();
      int var2 = this.getLine();
      Token var3 = this._factory.create(this._tokenFactorySourcePair, -1, null, 0, this._input.index(), this._input.index() - 1, var2, var1);
      this.emit(var3);
      return var3;
   }

   @Override
   public int getLine() {
      return this.getInterpreter().getLine();
   }

   @Override
   public int getCharPositionInLine() {
      return this.getInterpreter().getCharPositionInLine();
   }

   public int getCharIndex() {
      return this._input.index();
   }

   public String getText() {
      return this._text != null ? this._text : this.getInterpreter().getText(this._input);
   }

   public void setText(String var1) {
      this._text = var1;
   }

   public void setType(int var1) {
      this._type = var1;
   }

   public void setChannel(int var1) {
      this._channel = var1;
   }

   @Deprecated
   @Override
   public String[] getTokenNames() {
      return null;
   }

   public void recover(LexerNoViableAltException var1) {
      if (this._input.LA(1) != -1) {
         this.getInterpreter().consume(this._input);
      }
   }

   public void notifyListeners(LexerNoViableAltException var1) {
      String var2 = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
      String var3 = "token recognition error at: '" + this.getErrorDisplay(var2) + "'";
      ANTLRErrorListener var4 = this.getErrorListenerDispatch();
      var4.syntaxError(this, null, this._tokenStartLine, this._tokenStartCharPositionInLine, var3, var1);
   }

   public String getErrorDisplay(String var1) {
      StringBuilder var2 = new StringBuilder();

      for (char var6 : var1.toCharArray()) {
         var2.append(this.getErrorDisplay(var6));
      }

      return var2.toString();
   }

   public String getErrorDisplay(int var1) {
      String var2 = String.valueOf((char)var1);
      switch (var1) {
         case -1:
            var2 = "<EOF>";
            break;
         case 9:
            var2 = "\\t";
            break;
         case 10:
            var2 = "\\n";
            break;
         case 13:
            var2 = "\\r";
      }

      return var2;
   }
}
