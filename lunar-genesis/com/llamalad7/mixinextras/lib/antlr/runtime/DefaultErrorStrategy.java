package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATN;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNState;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.RuleTransition;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Pair;

public class DefaultErrorStrategy implements ANTLRErrorStrategy {
   protected boolean errorRecoveryMode = false;
   protected int lastErrorIndex = -1;
   protected IntervalSet lastErrorStates;
   protected ParserRuleContext nextTokensContext;
   protected int nextTokensState;

   @Override
   public void reset(Parser var1) {
      this.endErrorCondition(var1);
   }

   protected void beginErrorCondition(Parser var1) {
      this.errorRecoveryMode = true;
   }

   @Override
   public boolean inErrorRecoveryMode(Parser var1) {
      return this.errorRecoveryMode;
   }

   protected void endErrorCondition(Parser var1) {
      this.errorRecoveryMode = false;
      this.lastErrorStates = null;
      this.lastErrorIndex = -1;
   }

   @Override
   public void reportMatch(Parser var1) {
      this.endErrorCondition(var1);
   }

   @Override
   public void reportError(Parser var1, RecognitionException var2) {
      if (!this.inErrorRecoveryMode(var1)) {
         this.beginErrorCondition(var1);
         if (var2 instanceof NoViableAltException) {
            this.reportNoViableAlternative(var1, (NoViableAltException)var2);
         } else if (var2 instanceof InputMismatchException) {
            this.reportInputMismatch(var1, (InputMismatchException)var2);
         } else if (var2 instanceof FailedPredicateException) {
            this.reportFailedPredicate(var1, (FailedPredicateException)var2);
         } else {
            System.err.println("unknown recognition error type: " + var2.getClass().getName());
            var1.notifyErrorListeners(var2.getOffendingToken(), var2.getMessage(), var2);
         }
      }
   }

   @Override
   public void recover(Parser var1, RecognitionException var2) {
      if (this.lastErrorIndex == var1.getInputStream().index() && this.lastErrorStates != null && this.lastErrorStates.contains(var1.getState())) {
         var1.consume();
      }

      this.lastErrorIndex = var1.getInputStream().index();
      if (this.lastErrorStates == null) {
         this.lastErrorStates = new IntervalSet();
      }

      this.lastErrorStates.add(var1.getState());
      IntervalSet var3 = this.getErrorRecoverySet(var1);
      this.consumeUntil(var1, var3);
   }

   @Override
   public void sync(Parser var1) {
      ATNState var2 = var1.getInterpreter().atn.states.get(var1.getState());
      if (!this.inErrorRecoveryMode(var1)) {
         TokenStream var3 = var1.getInputStream();
         int var4 = var3.LA(1);
         IntervalSet var5 = var1.getATN().nextTokens(var2);
         if (var5.contains(var4)) {
            this.nextTokensContext = null;
            this.nextTokensState = -1;
         } else if (var5.contains(-2)) {
            if (this.nextTokensContext == null) {
               this.nextTokensContext = var1.getContext();
               this.nextTokensState = var1.getState();
            }
         } else {
            switch (var2.getStateType()) {
               case 3:
               case 4:
               case 5:
               case 10:
                  if (this.singleTokenDeletion(var1) != null) {
                     return;
                  }

                  throw new InputMismatchException(var1);
               case 9:
               case 11:
                  this.reportUnwantedToken(var1);
                  IntervalSet var6 = var1.getExpectedTokens();
                  IntervalSet var7 = var6.or(this.getErrorRecoverySet(var1));
                  this.consumeUntil(var1, var7);
               case 6:
               case 7:
               case 8:
            }
         }
      }
   }

   protected void reportNoViableAlternative(Parser var1, NoViableAltException var2) {
      TokenStream var3 = var1.getInputStream();
      String var4;
      if (var3 != null) {
         if (var2.getStartToken().getType() == -1) {
            var4 = "<EOF>";
         } else {
            var4 = var3.getText(var2.getStartToken(), var2.getOffendingToken());
         }
      } else {
         var4 = "<unknown input>";
      }

      String var5 = "no viable alternative at input " + this.escapeWSAndQuote(var4);
      var1.notifyErrorListeners(var2.getOffendingToken(), var5, var2);
   }

   protected void reportInputMismatch(Parser var1, InputMismatchException var2) {
      String var3 = "mismatched input "
         + this.getTokenErrorDisplay(var2.getOffendingToken())
         + " expecting "
         + var2.getExpectedTokens().toString(var1.getVocabulary());
      var1.notifyErrorListeners(var2.getOffendingToken(), var3, var2);
   }

   protected void reportFailedPredicate(Parser var1, FailedPredicateException var2) {
      String var3 = var1.getRuleNames()[var1._ctx.getRuleIndex()];
      String var4 = "rule " + var3 + " " + var2.getMessage();
      var1.notifyErrorListeners(var2.getOffendingToken(), var4, var2);
   }

   protected void reportUnwantedToken(Parser var1) {
      if (!this.inErrorRecoveryMode(var1)) {
         this.beginErrorCondition(var1);
         Token var2 = var1.getCurrentToken();
         String var3 = this.getTokenErrorDisplay(var2);
         IntervalSet var4 = this.getExpectedTokens(var1);
         String var5 = "extraneous input " + var3 + " expecting " + var4.toString(var1.getVocabulary());
         var1.notifyErrorListeners(var2, var5, null);
      }
   }

   protected void reportMissingToken(Parser var1) {
      if (!this.inErrorRecoveryMode(var1)) {
         this.beginErrorCondition(var1);
         Token var2 = var1.getCurrentToken();
         IntervalSet var3 = this.getExpectedTokens(var1);
         String var4 = "missing " + var3.toString(var1.getVocabulary()) + " at " + this.getTokenErrorDisplay(var2);
         var1.notifyErrorListeners(var2, var4, null);
      }
   }

   @Override
   public Token recoverInline(Parser var1) {
      Token var2 = this.singleTokenDeletion(var1);
      if (var2 != null) {
         var1.consume();
         return var2;
      }

      if (this.singleTokenInsertion(var1)) {
         return this.getMissingSymbol(var1);
      }

      InputMismatchException var3;
      if (this.nextTokensContext == null) {
         var3 = new InputMismatchException(var1);
      } else {
         var3 = new InputMismatchException(var1, this.nextTokensState, this.nextTokensContext);
      }

      throw var3;
   }

   protected boolean singleTokenInsertion(Parser var1) {
      int var2 = var1.getInputStream().LA(1);
      ATNState var3 = var1.getInterpreter().atn.states.get(var1.getState());
      ATNState var4 = var3.transition(0).target;
      ATN var5 = var1.getInterpreter().atn;
      IntervalSet var6 = var5.nextTokens(var4, var1._ctx);
      if (var6.contains(var2)) {
         this.reportMissingToken(var1);
         return true;
      } else {
         return false;
      }
   }

   protected Token singleTokenDeletion(Parser var1) {
      int var2 = var1.getInputStream().LA(2);
      IntervalSet var3 = this.getExpectedTokens(var1);
      if (var3.contains(var2)) {
         this.reportUnwantedToken(var1);
         var1.consume();
         Token var4 = var1.getCurrentToken();
         this.reportMatch(var1);
         return var4;
      } else {
         return null;
      }
   }

   protected Token getMissingSymbol(Parser var1) {
      Token var2 = var1.getCurrentToken();
      IntervalSet var3 = this.getExpectedTokens(var1);
      int var4 = 0;
      if (!var3.isNil()) {
         var4 = var3.getMinElement();
      }

      String var5;
      if (var4 == -1) {
         var5 = "<missing EOF>";
      } else {
         var5 = "<missing " + var1.getVocabulary().getDisplayName(var4) + ">";
      }

      Token var6 = var2;
      Token var7 = var1.getInputStream().LT(-1);
      if (var6.getType() == -1 && var7 != null) {
         var6 = var7;
      }

      return var1.getTokenFactory()
         .create(new Pair<>(var6.getTokenSource(), var6.getTokenSource().getInputStream()), var4, var5, 0, -1, -1, var6.getLine(), var6.getCharPositionInLine());
   }

   protected IntervalSet getExpectedTokens(Parser var1) {
      return var1.getExpectedTokens();
   }

   protected String getTokenErrorDisplay(Token var1) {
      if (var1 == null) {
         return "<no token>";
      }

      String var2 = this.getSymbolText(var1);
      if (var2 == null) {
         if (this.getSymbolType(var1) == -1) {
            var2 = "<EOF>";
         } else {
            var2 = "<" + this.getSymbolType(var1) + ">";
         }
      }

      return this.escapeWSAndQuote(var2);
   }

   protected String getSymbolText(Token var1) {
      return var1.getText();
   }

   protected int getSymbolType(Token var1) {
      return var1.getType();
   }

   protected String escapeWSAndQuote(String var1) {
      var1 = var1.replace("\n", "\\n");
      var1 = var1.replace("\r", "\\r");
      var1 = var1.replace("\t", "\\t");
      return "'" + var1 + "'";
   }

   protected IntervalSet getErrorRecoverySet(Parser var1) {
      ATN var2 = var1.getInterpreter().atn;
      RuleContext var3 = var1._ctx;
      IntervalSet var4 = new IntervalSet();

      while (var3 != null && var3.invokingState >= 0) {
         ATNState var5 = var2.states.get(var3.invokingState);
         RuleTransition var6 = (RuleTransition)var5.transition(0);
         IntervalSet var7 = var2.nextTokens(var6.followState);
         var4.addAll(var7);
         var3 = var3.parent;
      }

      var4.remove(-2);
      return var4;
   }

   protected void consumeUntil(Parser var1, IntervalSet var2) {
      for (int var3 = var1.getInputStream().LA(1); var3 != -1 && !var2.contains(var3); var3 = var1.getInputStream().LA(1)) {
         var1.consume();
      }
   }
}
