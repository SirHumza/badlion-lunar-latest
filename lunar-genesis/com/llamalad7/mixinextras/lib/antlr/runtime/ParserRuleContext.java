package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ErrorNode;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ParseTree;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ParseTreeListener;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParserRuleContext extends RuleContext {
   public static final ParserRuleContext EMPTY = new ParserRuleContext();
   public List<ParseTree> children;
   public Token start;
   public Token stop;
   public RecognitionException exception;

   public ParserRuleContext() {
   }

   public void copyFrom(ParserRuleContext var1) {
      this.parent = var1.parent;
      this.invokingState = var1.invokingState;
      this.start = var1.start;
      this.stop = var1.stop;
      if (var1.children != null) {
         this.children = new ArrayList<>();

         for (ParseTree var3 : var1.children) {
            if (var3 instanceof ErrorNode) {
               this.addChild((ErrorNode)var3);
            }
         }
      }
   }

   public ParserRuleContext(ParserRuleContext var1, int var2) {
      super(var1, var2);
   }

   public void enterRule(ParseTreeListener var1) {
   }

   public void exitRule(ParseTreeListener var1) {
   }

   public <T extends ParseTree> T addAnyChild(T var1) {
      if (this.children == null) {
         this.children = new ArrayList<>();
      }

      this.children.add(var1);
      return (T)var1;
   }

   public RuleContext addChild(RuleContext var1) {
      return this.addAnyChild(var1);
   }

   public TerminalNode addChild(TerminalNode var1) {
      var1.setParent(this);
      return this.addAnyChild(var1);
   }

   public ErrorNode addErrorNode(ErrorNode var1) {
      var1.setParent(this);
      return this.addAnyChild(var1);
   }

   public void removeLastChild() {
      if (this.children != null) {
         this.children.remove(this.children.size() - 1);
      }
   }

   @Override
   public ParseTree getChild(int var1) {
      return this.children != null && var1 >= 0 && var1 < this.children.size() ? this.children.get(var1) : null;
   }

   public <T extends ParseTree> T getChild(Class<? extends T> var1, int var2) {
      if (this.children != null && var2 >= 0 && var2 < this.children.size()) {
         int var3 = -1;

         for (ParseTree var5 : this.children) {
            if (var1.isInstance(var5)) {
               if (++var3 == var2) {
                  return (T)var1.cast(var5);
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public <T extends ParserRuleContext> T getRuleContext(Class<? extends T> var1, int var2) {
      return this.getChild(var1, var2);
   }

   public <T extends ParserRuleContext> List<T> getRuleContexts(Class<? extends T> var1) {
      if (this.children == null) {
         return Collections.emptyList();
      }

      ArrayList var2 = null;

      for (ParseTree var4 : this.children) {
         if (var1.isInstance(var4)) {
            if (var2 == null) {
               var2 = new ArrayList();
            }

            var2.add((ParserRuleContext)var1.cast(var4));
         }
      }

      return var2 == null ? Collections.emptyList() : var2;
   }

   @Override
   public int getChildCount() {
      return this.children != null ? this.children.size() : 0;
   }
}
