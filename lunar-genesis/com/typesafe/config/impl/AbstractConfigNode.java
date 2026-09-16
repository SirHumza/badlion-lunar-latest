package com.typesafe.config.impl;

import com.typesafe.config.parser.ConfigNode;
import java.util.Collection;

abstract class AbstractConfigNode implements ConfigNode {
   abstract Collection<Token> tokens();

   @Override
   public final String render() {
      StringBuilder var1 = new StringBuilder();

      for (Token var4 : this.tokens()) {
         var1.append(var4.tokenText());
      }

      return var1.toString();
   }

   @Override
   public final boolean equals(Object var1) {
      return var1 instanceof AbstractConfigNode && this.render().equals(((AbstractConfigNode)var1).render());
   }

   @Override
   public final int hashCode() {
      return this.render().hashCode();
   }
}
