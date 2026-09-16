package com.llamalad7.mixinextras.lib.antlr.runtime.tree;

import com.llamalad7.mixinextras.lib.antlr.runtime.RuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.Token;

public class TerminalNodeImpl implements TerminalNode {
   public Token symbol;
   public ParseTree parent;

   public TerminalNodeImpl(Token var1) {
      this.symbol = var1;
   }

   @Override
   public Token getSymbol() {
      return this.symbol;
   }

   @Override
   public void setParent(RuleContext var1) {
      this.parent = var1;
   }

   @Override
   public String getText() {
      return this.symbol.getText();
   }

   @Override
   public String toString() {
      return this.symbol.getType() == -1 ? "<EOF>" : this.symbol.getText();
   }
}
