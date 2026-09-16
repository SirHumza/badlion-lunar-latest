package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNSimulator;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ParserATNSimulator;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntegerStack;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ErrorNode;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ErrorNodeImpl;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ParseTreeListener;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.TerminalNode;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.TerminalNodeImpl;
import java.util.ArrayList;
import java.util.List;

public abstract class Parser extends Recognizer<Token, ParserATNSimulator> {
   protected ANTLRErrorStrategy _errHandler = new DefaultErrorStrategy();
   protected TokenStream _input;
   protected final IntegerStack _precedenceStack = new IntegerStack();
   protected ParserRuleContext _ctx;
   protected boolean _buildParseTrees;
   private Parser.TraceListener _tracer;
   protected List<ParseTreeListener> _parseListeners;
   protected int _syntaxErrors;
   protected boolean matchedEOF;

   public Parser(TokenStream var1) {
      this._precedenceStack.push(0);
      this._buildParseTrees = true;
      this.setInputStream(var1);
   }

   public void reset() {
      if (this.getInputStream() != null) {
         this.getInputStream().seek(0);
      }

      this._errHandler.reset(this);
      this._ctx = null;
      this._syntaxErrors = 0;
      this.matchedEOF = false;
      this.setTrace(false);
      this._precedenceStack.clear();
      this._precedenceStack.push(0);
      ATNSimulator var1 = this.getInterpreter();
      if (var1 != null) {
         var1.reset();
      }
   }

   public Token match(int var1) {
      Token var2 = this.getCurrentToken();
      if (var2.getType() == var1) {
         if (var1 == -1) {
            this.matchedEOF = true;
         }

         this._errHandler.reportMatch(this);
         this.consume();
      } else {
         var2 = this._errHandler.recoverInline(this);
         if (this._buildParseTrees && var2.getTokenIndex() == -1) {
            this._ctx.addErrorNode(this.createErrorNode(this._ctx, var2));
         }
      }

      return var2;
   }

   public void addParseListener(ParseTreeListener var1) {
      if (var1 == null) {
         throw new NullPointerException("listener");
      }

      if (this._parseListeners == null) {
         this._parseListeners = new ArrayList<>();
      }

      this._parseListeners.add(var1);
   }

   public void removeParseListener(ParseTreeListener var1) {
      if (this._parseListeners != null && this._parseListeners.remove(var1) && this._parseListeners.isEmpty()) {
         this._parseListeners = null;
      }
   }

   protected void triggerEnterRuleEvent() {
      for (ParseTreeListener var2 : this._parseListeners) {
         var2.enterEveryRule(this._ctx);
         this._ctx.enterRule(var2);
      }
   }

   protected void triggerExitRuleEvent() {
      for (int var1 = this._parseListeners.size() - 1; var1 >= 0; var1--) {
         ParseTreeListener var2 = this._parseListeners.get(var1);
         this._ctx.exitRule(var2);
         var2.exitEveryRule(this._ctx);
      }
   }

   public TokenFactory<?> getTokenFactory() {
      return this._input.getTokenSource().getTokenFactory();
   }

   public TokenStream getInputStream() {
      return this.getTokenStream();
   }

   public final void setInputStream(IntStream var1) {
      this.setTokenStream((TokenStream)var1);
   }

   public TokenStream getTokenStream() {
      return this._input;
   }

   public void setTokenStream(TokenStream var1) {
      this._input = null;
      this.reset();
      this._input = var1;
   }

   public Token getCurrentToken() {
      return this._input.LT(1);
   }

   public void notifyErrorListeners(Token var1, String var2, RecognitionException var3) {
      this._syntaxErrors++;
      int var4 = -1;
      int var5 = -1;
      var4 = var1.getLine();
      var5 = var1.getCharPositionInLine();
      ANTLRErrorListener var6 = this.getErrorListenerDispatch();
      var6.syntaxError(this, var1, var4, var5, var2, var3);
   }

   public Token consume() {
      Token var1 = this.getCurrentToken();
      if (var1.getType() != -1) {
         this.getInputStream().consume();
      }

      boolean var2 = this._parseListeners != null && !this._parseListeners.isEmpty();
      if (this._buildParseTrees || var2) {
         if (this._errHandler.inErrorRecoveryMode(this)) {
            ErrorNode var3 = this._ctx.addErrorNode(this.createErrorNode(this._ctx, var1));
            if (this._parseListeners != null) {
               for (ParseTreeListener var5 : this._parseListeners) {
                  var5.visitErrorNode(var3);
               }
            }
         } else {
            TerminalNode var6 = this._ctx.addChild(this.createTerminalNode(this._ctx, var1));
            if (this._parseListeners != null) {
               for (ParseTreeListener var8 : this._parseListeners) {
                  var8.visitTerminal(var6);
               }
            }
         }
      }

      return var1;
   }

   public TerminalNode createTerminalNode(ParserRuleContext var1, Token var2) {
      return new TerminalNodeImpl(var2);
   }

   public ErrorNode createErrorNode(ParserRuleContext var1, Token var2) {
      return new ErrorNodeImpl(var2);
   }

   protected void addContextToParseTree() {
      ParserRuleContext var1 = (ParserRuleContext)this._ctx.parent;
      if (var1 != null) {
         var1.addChild(this._ctx);
      }
   }

   public void enterRule(ParserRuleContext var1, int var2, int var3) {
      this.setState(var2);
      this._ctx = var1;
      this._ctx.start = this._input.LT(1);
      if (this._buildParseTrees) {
         this.addContextToParseTree();
      }

      if (this._parseListeners != null) {
         this.triggerEnterRuleEvent();
      }
   }

   public void exitRule() {
      if (this.matchedEOF) {
         this._ctx.stop = this._input.LT(1);
      } else {
         this._ctx.stop = this._input.LT(-1);
      }

      if (this._parseListeners != null) {
         this.triggerExitRuleEvent();
      }

      this.setState(this._ctx.invokingState);
      this._ctx = (ParserRuleContext)this._ctx.parent;
   }

   public void enterOuterAlt(ParserRuleContext var1, int var2) {
      var1.setAltNumber(var2);
      if (this._buildParseTrees && this._ctx != var1) {
         ParserRuleContext var3 = (ParserRuleContext)this._ctx.parent;
         if (var3 != null) {
            var3.removeLastChild();
            var3.addChild(var1);
         }
      }

      this._ctx = var1;
   }

   public final int getPrecedence() {
      return this._precedenceStack.isEmpty() ? -1 : this._precedenceStack.peek();
   }

   public void enterRecursionRule(ParserRuleContext var1, int var2, int var3, int var4) {
      this.setState(var2);
      this._precedenceStack.push(var4);
      this._ctx = var1;
      this._ctx.start = this._input.LT(1);
      if (this._parseListeners != null) {
         this.triggerEnterRuleEvent();
      }
   }

   public void pushNewRecursionContext(ParserRuleContext var1, int var2, int var3) {
      ParserRuleContext var4 = this._ctx;
      var4.parent = var1;
      var4.invokingState = var2;
      var4.stop = this._input.LT(-1);
      this._ctx = var1;
      this._ctx.start = var4.start;
      if (this._buildParseTrees) {
         this._ctx.addChild(var4);
      }

      if (this._parseListeners != null) {
         this.triggerEnterRuleEvent();
      }
   }

   public void unrollRecursionContexts(ParserRuleContext var1) {
      this._precedenceStack.pop();
      this._ctx.stop = this._input.LT(-1);
      ParserRuleContext var2 = this._ctx;
      if (this._parseListeners != null) {
         while (this._ctx != var1) {
            this.triggerExitRuleEvent();
            this._ctx = (ParserRuleContext)this._ctx.parent;
         }
      } else {
         this._ctx = var1;
      }

      var2.parent = var1;
      if (this._buildParseTrees && var1 != null) {
         var1.addChild(var2);
      }
   }

   public ParserRuleContext getContext() {
      return this._ctx;
   }

   @Override
   public boolean precpred(RuleContext var1, int var2) {
      return var2 >= this._precedenceStack.peek();
   }

   public IntervalSet getExpectedTokens() {
      return this.getATN().getExpectedTokens(this.getState(), this.getContext());
   }

   public List<String> getRuleInvocationStack() {
      return this.getRuleInvocationStack(this._ctx);
   }

   public List<String> getRuleInvocationStack(RuleContext var1) {
      String[] var2 = this.getRuleNames();
      ArrayList var3 = new ArrayList();

      while (var1 != null) {
         int var4 = var1.getRuleIndex();
         if (var4 < 0) {
            var3.add("n/a");
         } else {
            var3.add(var2[var4]);
         }

         var1 = var1.parent;
      }

      return var3;
   }

   public void setTrace(boolean var1) {
      if (!var1) {
         this.removeParseListener(this._tracer);
         this._tracer = null;
      } else {
         if (this._tracer != null) {
            this.removeParseListener(this._tracer);
         } else {
            this._tracer = new Parser.TraceListener();
         }

         this.addParseListener(this._tracer);
      }
   }

   public class TraceListener implements ParseTreeListener {
      @Override
      public void enterEveryRule(ParserRuleContext var1) {
         System.out.println("enter   " + Parser.this.getRuleNames()[var1.getRuleIndex()] + ", LT(1)=" + Parser.this._input.LT(1).getText());
      }

      @Override
      public void visitTerminal(TerminalNode var1) {
         System.out.println("consume " + var1.getSymbol() + " rule " + Parser.this.getRuleNames()[Parser.this._ctx.getRuleIndex()]);
      }

      @Override
      public void visitErrorNode(ErrorNode var1) {
      }

      @Override
      public void exitEveryRule(ParserRuleContext var1) {
         System.out.println("exit    " + Parser.this.getRuleNames()[var1.getRuleIndex()] + ", LT(1)=" + Parser.this._input.LT(1).getText());
      }
   }
}
