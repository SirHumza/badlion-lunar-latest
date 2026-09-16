package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Pair;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ATNDeserializer {
   public static final int SERIALIZED_VERSION = 4;
   private final ATNDeserializationOptions deserializationOptions;

   public ATNDeserializer() {
      this(ATNDeserializationOptions.getDefaultOptions());
   }

   public ATNDeserializer(ATNDeserializationOptions var1) {
      if (var1 == null) {
         var1 = ATNDeserializationOptions.getDefaultOptions();
      }

      this.deserializationOptions = var1;
   }

   public ATN deserialize(char[] var1) {
      return this.deserialize(decodeIntsEncodedAs16BitWords(var1));
   }

   public ATN deserialize(int[] var1) {
      int var2 = 0;
      int var3 = var1[var2++];
      if (var3 != SERIALIZED_VERSION) {
         String var40 = String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", var3, SERIALIZED_VERSION);
         throw new UnsupportedOperationException(new InvalidClassException(ATN.class.getName(), var40));
      }

      ATNType var4 = ATNType.values()[var1[var2++]];
      int var5 = var1[var2++];
      ATN var6 = new ATN(var4, var5);
      ArrayList var7 = new ArrayList();
      ArrayList var8 = new ArrayList();
      int var9 = var1[var2++];

      for (int var10 = 0; var10 < var9; var10++) {
         int var11 = var1[var2++];
         if (var11 == 0) {
            var6.addState(null);
         } else {
            int var12 = var1[var2++];
            ATNState var13 = this.stateFactory(var11, var12);
            if (var11 == 12) {
               int var14 = var1[var2++];
               var7.add(new Pair<>((LoopEndState)var13, var14));
            } else if (var13 instanceof BlockStartState) {
               int var55 = var1[var2++];
               var8.add(new Pair<>((BlockStartState)var13, var55));
            }

            var6.addState(var13);
         }
      }

      for (Pair var44 : var7) {
         ((LoopEndState)var44.a).loopBackState = var6.states.get((Integer)var44.b);
      }

      for (Pair var45 : var8) {
         ((BlockStartState)var45.a).endState = (BlockEndState)var6.states.get((Integer)var45.b);
      }

      int var43 = var1[var2++];

      for (int var46 = 0; var46 < var43; var46++) {
         int var48 = var1[var2++];
         ((DecisionState)var6.states.get(var48)).nonGreedy = true;
      }

      int var47 = var1[var2++];

      for (int var49 = 0; var49 < var47; var49++) {
         int var51 = var1[var2++];
         ((RuleStartState)var6.states.get(var51)).isLeftRecursiveRule = true;
      }

      int var50 = var1[var2++];
      if (var6.grammarType == ATNType.LEXER) {
         var6.ruleToTokenType = new int[var50];
      }

      var6.ruleToStartState = new RuleStartState[var50];

      for (int var52 = 0; var52 < var50; var52++) {
         int var56 = var1[var2++];
         RuleStartState var15 = (RuleStartState)var6.states.get(var56);
         var6.ruleToStartState[var52] = var15;
         if (var6.grammarType == ATNType.LEXER) {
            int var16 = var1[var2++];
            var6.ruleToTokenType[var52] = var16;
         }
      }

      var6.ruleToStopState = new RuleStopState[var50];

      for (ATNState var57 : var6.states) {
         if (var57 instanceof RuleStopState) {
            RuleStopState var60 = (RuleStopState)var57;
            var6.ruleToStopState[var57.ruleIndex] = var60;
            var6.ruleToStartState[var57.ruleIndex].stopState = var60;
         }
      }

      int var54 = var1[var2++];

      for (int var58 = 0; var58 < var54; var58++) {
         int var61 = var1[var2++];
         var6.modeToStartState.add((TokensStartState)var6.states.get(var61));
      }

      ArrayList var59 = new ArrayList();
      var2 = this.deserializeSets(var1, var2, var59);
      int var62 = var1[var2++];

      for (int var63 = 0; var63 < var62; var63++) {
         int var17 = var1[var2];
         int var18 = var1[var2 + 1];
         int var19 = var1[var2 + 2];
         int var20 = var1[var2 + 3];
         int var21 = var1[var2 + 4];
         int var22 = var1[var2 + 5];
         Transition var23 = this.edgeFactory(var6, var19, var17, var18, var20, var21, var22, var59);
         ATNState var24 = var6.states.get(var17);
         var24.addTransition(var23);
         var2 += 6;
      }

      for (ATNState var67 : var6.states) {
         for (int var73 = 0; var73 < var67.getNumberOfTransitions(); var73++) {
            Transition var79 = var67.transition(var73);
            if (var79 instanceof RuleTransition) {
               RuleTransition var85 = (RuleTransition)var79;
               int var90 = -1;
               if (var6.ruleToStartState[var85.target.ruleIndex].isLeftRecursiveRule && var85.precedence == 0) {
                  var90 = var85.target.ruleIndex;
               }

               EpsilonTransition var93 = new EpsilonTransition(var85.followState, var90);
               var6.ruleToStopState[var85.target.ruleIndex].addTransition(var93);
            }
         }
      }

      for (ATNState var68 : var6.states) {
         if (var68 instanceof BlockStartState) {
            if (((BlockStartState)var68).endState == null) {
               throw new IllegalStateException();
            }

            if (((BlockStartState)var68).endState.startState != null) {
               throw new IllegalStateException();
            }

            ((BlockStartState)var68).endState.startState = (BlockStartState)var68;
         }

         if (var68 instanceof PlusLoopbackState) {
            PlusLoopbackState var75 = (PlusLoopbackState)var68;

            for (int var81 = 0; var81 < var75.getNumberOfTransitions(); var81++) {
               ATNState var87 = var75.transition(var81).target;
               if (var87 instanceof PlusBlockStartState) {
                  ((PlusBlockStartState)var87).loopBackState = var75;
               }
            }
         } else if (var68 instanceof StarLoopbackState) {
            StarLoopbackState var74 = (StarLoopbackState)var68;

            for (int var80 = 0; var80 < var74.getNumberOfTransitions(); var80++) {
               ATNState var86 = var74.transition(var80).target;
               if (var86 instanceof StarLoopEntryState) {
                  ((StarLoopEntryState)var86).loopBackState = var74;
               }
            }
         }
      }

      int var66 = var1[var2++];

      for (int var69 = 1; var69 <= var66; var69++) {
         int var76 = var1[var2++];
         DecisionState var82 = (DecisionState)var6.states.get(var76);
         var6.decisionToState.add(var82);
         var82.decision = var69 - 1;
      }

      if (var6.grammarType == ATNType.LEXER) {
         var6.lexerActions = new LexerAction[var1[var2++]];

         for (int var70 = 0; var70 < var6.lexerActions.length; var70++) {
            LexerActionType var77 = LexerActionType.values()[var1[var2++]];
            int var83 = var1[var2++];
            int var88 = var1[var2++];
            LexerAction var91 = this.lexerActionFactory(var77, var83, var88);
            var6.lexerActions[var70] = var91;
         }
      }

      this.markPrecedenceDecisions(var6);
      if (this.deserializationOptions.isVerifyATN()) {
         this.verifyATN(var6);
      }

      if (this.deserializationOptions.isGenerateRuleBypassTransitions() && var6.grammarType == ATNType.PARSER) {
         var6.ruleToTokenType = new int[var6.ruleToStartState.length];

         for (int var71 = 0; var71 < var6.ruleToStartState.length; var71++) {
            var6.ruleToTokenType[var71] = var6.maxTokenType + var71 + 1;
         }

         for (int var72 = 0; var72 < var6.ruleToStartState.length; var72++) {
            BasicBlockStartState var78 = new BasicBlockStartState();
            var78.ruleIndex = var72;
            var6.addState(var78);
            BlockEndState var84 = new BlockEndState();
            var84.ruleIndex = var72;
            var6.addState(var84);
            var78.endState = var84;
            var6.defineDecisionState(var78);
            var84.startState = var78;
            Transition var92 = null;
            ATNState var89;
            if (!var6.ruleToStartState[var72].isLeftRecursiveRule) {
               var89 = var6.ruleToStopState[var72];
            } else {
               var89 = null;

               for (ATNState var98 : var6.states) {
                  if (var98.ruleIndex == var72 && var98 instanceof StarLoopEntryState) {
                     ATNState var100 = var98.transition(var98.getNumberOfTransitions() - 1).target;
                     if (var100 instanceof LoopEndState && var100.epsilonOnlyTransitions && var100.transition(0).target instanceof RuleStopState) {
                        var89 = var98;
                        break;
                     }
                  }
               }

               if (var89 == null) {
                  throw new UnsupportedOperationException("Couldn't identify final state of the precedence rule prefix section.");
               }

               var92 = ((StarLoopEntryState)var89).loopBackState.transition(0);
            }

            for (ATNState var99 : var6.states) {
               for (Transition var25 : var99.transitions) {
                  if (var25 != var92 && var25.target == var89) {
                     var25.target = var84;
                  }
               }
            }

            while (var6.ruleToStartState[var72].getNumberOfTransitions() > 0) {
               Transition var96 = var6.ruleToStartState[var72].removeTransition(var6.ruleToStartState[var72].getNumberOfTransitions() - 1);
               var78.addTransition(var96);
            }

            var6.ruleToStartState[var72].addTransition(new EpsilonTransition(var78));
            var84.addTransition(new EpsilonTransition(var89));
            BasicState var97 = new BasicState();
            var6.addState(var97);
            var97.addTransition(new AtomTransition(var84, var6.ruleToTokenType[var72]));
            var78.addTransition(new EpsilonTransition(var97));
         }

         if (this.deserializationOptions.isVerifyATN()) {
            this.verifyATN(var6);
         }
      }

      return var6;
   }

   private int deserializeSets(int[] var1, int var2, List<IntervalSet> var3) {
      int var4 = var1[var2++];

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1[var2];
         var2++;
         IntervalSet var7 = new IntervalSet();
         var3.add(var7);
         boolean var8 = var1[var2++] != 0;
         if (var8) {
            var7.add(-1);
         }

         for (int var9 = 0; var9 < var6; var9++) {
            int var10 = var1[var2++];
            int var11 = var1[var2++];
            var7.add(var10, var11);
         }
      }

      return var2;
   }

   protected void markPrecedenceDecisions(ATN var1) {
      for (ATNState var3 : var1.states) {
         if (var3 instanceof StarLoopEntryState && var1.ruleToStartState[var3.ruleIndex].isLeftRecursiveRule) {
            ATNState var4 = var3.transition(var3.getNumberOfTransitions() - 1).target;
            if (var4 instanceof LoopEndState && var4.epsilonOnlyTransitions && var4.transition(0).target instanceof RuleStopState) {
               ((StarLoopEntryState)var3).isPrecedenceDecision = true;
            }
         }
      }
   }

   protected void verifyATN(ATN var1) {
      for (ATNState var3 : var1.states) {
         if (var3 != null) {
            this.checkCondition(var3.onlyHasEpsilonTransitions() || var3.getNumberOfTransitions() <= 1);
            if (var3 instanceof PlusBlockStartState) {
               this.checkCondition(((PlusBlockStartState)var3).loopBackState != null);
            }

            if (var3 instanceof StarLoopEntryState) {
               StarLoopEntryState var4 = (StarLoopEntryState)var3;
               this.checkCondition(var4.loopBackState != null);
               this.checkCondition(var4.getNumberOfTransitions() == 2);
               if (var4.transition(0).target instanceof StarBlockStartState) {
                  this.checkCondition(var4.transition(1).target instanceof LoopEndState);
                  this.checkCondition(!var4.nonGreedy);
               } else {
                  if (!(var4.transition(0).target instanceof LoopEndState)) {
                     throw new IllegalStateException();
                  }

                  this.checkCondition(var4.transition(1).target instanceof StarBlockStartState);
                  this.checkCondition(var4.nonGreedy);
               }
            }

            if (var3 instanceof StarLoopbackState) {
               this.checkCondition(var3.getNumberOfTransitions() == 1);
               this.checkCondition(var3.transition(0).target instanceof StarLoopEntryState);
            }

            if (var3 instanceof LoopEndState) {
               this.checkCondition(((LoopEndState)var3).loopBackState != null);
            }

            if (var3 instanceof RuleStartState) {
               this.checkCondition(((RuleStartState)var3).stopState != null);
            }

            if (var3 instanceof BlockStartState) {
               this.checkCondition(((BlockStartState)var3).endState != null);
            }

            if (var3 instanceof BlockEndState) {
               this.checkCondition(((BlockEndState)var3).startState != null);
            }

            if (var3 instanceof DecisionState) {
               DecisionState var5 = (DecisionState)var3;
               this.checkCondition(var5.getNumberOfTransitions() <= 1 || var5.decision >= 0);
            } else {
               this.checkCondition(var3.getNumberOfTransitions() <= 1 || var3 instanceof RuleStopState);
            }
         }
      }
   }

   protected void checkCondition(boolean var1) {
      this.checkCondition(var1, null);
   }

   protected void checkCondition(boolean var1, String var2) {
      if (!var1) {
         throw new IllegalStateException(var2);
      }
   }

   protected Transition edgeFactory(ATN var1, int var2, int var3, int var4, int var5, int var6, int var7, List<IntervalSet> var8) {
      ATNState var9 = var1.states.get(var4);
      switch (var2) {
         case 1:
            return new EpsilonTransition(var9);
         case 2:
            if (var7 != 0) {
               return new RangeTransition(var9, -1, var6);
            }

            return new RangeTransition(var9, var5, var6);
         case 3:
            return new RuleTransition((RuleStartState)var1.states.get(var5), var6, var7, var9);
         case 4:
            return new PredicateTransition(var9, var5, var6, var7 != 0);
         case 5:
            if (var7 != 0) {
               return new AtomTransition(var9, -1);
            }

            return new AtomTransition(var9, var5);
         case 6:
            return new ActionTransition(var9, var5, var6, var7 != 0);
         case 7:
            return new SetTransition(var9, (IntervalSet)var8.get(var5));
         case 8:
            return new NotSetTransition(var9, (IntervalSet)var8.get(var5));
         case 9:
            return new WildcardTransition(var9);
         case 10:
            return new PrecedencePredicateTransition(var9, var5);
         default:
            throw new IllegalArgumentException("The specified transition type is not valid.");
      }
   }

   protected ATNState stateFactory(int var1, int var2) {
      ATNState var3;
      switch (var1) {
         case 0:
            return null;
         case 1:
            var3 = new BasicState();
            break;
         case 2:
            var3 = new RuleStartState();
            break;
         case 3:
            var3 = new BasicBlockStartState();
            break;
         case 4:
            var3 = new PlusBlockStartState();
            break;
         case 5:
            var3 = new StarBlockStartState();
            break;
         case 6:
            var3 = new TokensStartState();
            break;
         case 7:
            var3 = new RuleStopState();
            break;
         case 8:
            var3 = new BlockEndState();
            break;
         case 9:
            var3 = new StarLoopbackState();
            break;
         case 10:
            var3 = new StarLoopEntryState();
            break;
         case 11:
            var3 = new PlusLoopbackState();
            break;
         case 12:
            var3 = new LoopEndState();
            break;
         default:
            String var4 = String.format(Locale.getDefault(), "The specified state type %d is not valid.", var1);
            throw new IllegalArgumentException(var4);
      }

      var3.ruleIndex = var2;
      return var3;
   }

   protected LexerAction lexerActionFactory(LexerActionType var1, int var2, int var3) {
      switch (var1) {
         case CHANNEL:
            return new LexerChannelAction(var2);
         case CUSTOM:
            return new LexerCustomAction(var2, var3);
         case MODE:
            return new LexerModeAction(var2);
         case MORE:
            return LexerMoreAction.INSTANCE;
         case POP_MODE:
            return LexerPopModeAction.INSTANCE;
         case PUSH_MODE:
            return new LexerPushModeAction(var2);
         case SKIP:
            return LexerSkipAction.INSTANCE;
         case TYPE:
            return new LexerTypeAction(var2);
         default:
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %s is not valid.", var1));
      }
   }

   public static int[] decodeIntsEncodedAs16BitWords(char[] var0) {
      return decodeIntsEncodedAs16BitWords(var0, false);
   }

   public static int[] decodeIntsEncodedAs16BitWords(char[] var0, boolean var1) {
      int[] var2 = new int[var0.length];
      int var3 = 0;
      int var4 = 0;

      while (var3 < var0.length) {
         char var5 = var0[var3++];
         if ((var5 & '耀') == 0) {
            var2[var4++] = var5;
         } else {
            char var6 = var0[var3++];
            if (var5 == '\uffff' && var6 == '\uffff') {
               var2[var4++] = -1;
            } else {
               var2[var4++] = (var5 & 32767) << 16 | var6 & '\uffff';
            }
         }
      }

      return var1 ? Arrays.copyOf(var2, var4) : var2;
   }
}
