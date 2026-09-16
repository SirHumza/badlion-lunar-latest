package com.typesafe.config.impl;

import java.util.ArrayList;
import java.util.Collection;

abstract class ConfigNodeComplexValue extends AbstractConfigNodeValue {
   protected final ArrayList<AbstractConfigNode> children;

   ConfigNodeComplexValue(Collection<AbstractConfigNode> var1) {
      this.children = new ArrayList<>(var1);
   }

   public final Collection<AbstractConfigNode> children() {
      return this.children;
   }

   @Override
   protected Collection<Token> tokens() {
      ArrayList var1 = new ArrayList();

      for (AbstractConfigNode var3 : this.children) {
         var1.addAll(var3.tokens());
      }

      return var1;
   }

   protected ConfigNodeComplexValue indentText(AbstractConfigNode var1) {
      ArrayList var2 = new ArrayList<>(this.children);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         AbstractConfigNode var4 = (AbstractConfigNode)var2.get(var3);
         if (var4 instanceof ConfigNodeSingleToken && Tokens.isNewline(((ConfigNodeSingleToken)var4).token())) {
            var2.add(var3 + 1, var1);
            var3++;
         } else if (var4 instanceof ConfigNodeField) {
            AbstractConfigNodeValue var5 = ((ConfigNodeField)var4).value();
            if (var5 instanceof ConfigNodeComplexValue) {
               var2.set(var3, ((ConfigNodeField)var4).replaceValue(((ConfigNodeComplexValue)var5).indentText(var1)));
            }
         } else if (var4 instanceof ConfigNodeComplexValue) {
            var2.set(var3, ((ConfigNodeComplexValue)var4).indentText(var1));
         }
      }

      return this.newNode(var2);
   }

   abstract ConfigNodeComplexValue newNode(Collection<AbstractConfigNode> var1);
}
