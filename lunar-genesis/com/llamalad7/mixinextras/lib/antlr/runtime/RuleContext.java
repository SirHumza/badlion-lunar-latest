package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.tree.ParseTree;
import com.llamalad7.mixinextras.lib.antlr.runtime.tree.RuleNode;
import java.util.List;

public class RuleContext implements RuleNode {
   public RuleContext parent;
   public int invokingState = -1;

   public RuleContext() {
   }

   public RuleContext(RuleContext var1, int var2) {
      this.parent = var1;
      this.invokingState = var2;
   }

   public boolean isEmpty() {
      return this.invokingState == -1;
   }

   @Override
   public String getText() {
      if (this.getChildCount() == 0) {
         return "";
      }

      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < this.getChildCount(); var2++) {
         var1.append(this.getChild(var2).getText());
      }

      return var1.toString();
   }

   public int getRuleIndex() {
      return -1;
   }

   public void setAltNumber(int var1) {
   }

   @Override
   public void setParent(RuleContext var1) {
      this.parent = var1;
   }

   public ParseTree getChild(int var1) {
      return null;
   }

   public int getChildCount() {
      return 0;
   }

   @Override
   public String toString() {
      return this.toString((List<String>)null, (RuleContext)null);
   }

   public String toString(List<String> var1, RuleContext var2) {
      StringBuilder var3 = new StringBuilder();
      RuleContext var4 = this;
      var3.append("[");

      for (; var4 != null && var4 != var2; var4 = var4.parent) {
         if (var1 == null) {
            if (!var4.isEmpty()) {
               var3.append(var4.invokingState);
            }
         } else {
            int var5 = var4.getRuleIndex();
            String var6 = var5 >= 0 && var5 < var1.size() ? (String)var1.get(var5) : Integer.toString(var5);
            var3.append(var6);
         }

         if (var4.parent != null && (var1 != null || !var4.parent.isEmpty())) {
            var3.append(" ");
         }
      }

      var3.append("]");
      return var3.toString();
   }
}
