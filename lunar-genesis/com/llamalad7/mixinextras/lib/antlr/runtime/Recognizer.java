package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATN;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNSimulator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Recognizer<Symbol, ATNInterpreter extends ATNSimulator> {
   private static final Map<Vocabulary, Map<String, Integer>> tokenTypeMapCache = new WeakHashMap<>();
   private static final Map<String[], Map<String, Integer>> ruleIndexMapCache = new WeakHashMap<>();
   private List<ANTLRErrorListener> _listeners = new CopyOnWriteArrayList<ANTLRErrorListener>() {
      {
         this.add(ConsoleErrorListener.INSTANCE);
      }
   };
   protected ATNInterpreter _interp;
   private int _stateNumber = -1;

   @Deprecated
   public abstract String[] getTokenNames();

   public abstract String[] getRuleNames();

   public Vocabulary getVocabulary() {
      return VocabularyImpl.fromTokenNames(this.getTokenNames());
   }

   public abstract ATN getATN();

   public ATNInterpreter getInterpreter() {
      return this._interp;
   }

   public void addErrorListener(ANTLRErrorListener var1) {
      if (var1 == null) {
         throw new NullPointerException("listener cannot be null.");
      }

      this._listeners.add(var1);
   }

   public void removeErrorListeners() {
      this._listeners.clear();
   }

   public List<? extends ANTLRErrorListener> getErrorListeners() {
      return this._listeners;
   }

   public ANTLRErrorListener getErrorListenerDispatch() {
      return new ProxyErrorListener(this.getErrorListeners());
   }

   public boolean sempred(RuleContext var1, int var2, int var3) {
      return true;
   }

   public boolean precpred(RuleContext var1, int var2) {
      return true;
   }

   public void action(RuleContext var1, int var2, int var3) {
   }

   public final int getState() {
      return this._stateNumber;
   }

   public final void setState(int var1) {
      this._stateNumber = var1;
   }
}
