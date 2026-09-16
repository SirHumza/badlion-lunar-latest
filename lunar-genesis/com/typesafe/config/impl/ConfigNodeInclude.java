package com.typesafe.config.impl;

import java.util.ArrayList;
import java.util.Collection;

final class ConfigNodeInclude extends AbstractConfigNode {
   private final ArrayList<AbstractConfigNode> children;
   private final ConfigIncludeKind kind;
   private final boolean isRequired;

   ConfigNodeInclude(Collection<AbstractConfigNode> var1, ConfigIncludeKind var2, boolean var3) {
      this.children = new ArrayList<>(var1);
      this.kind = var2;
      this.isRequired = var3;
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

   protected ConfigIncludeKind kind() {
      return this.kind;
   }

   protected boolean isRequired() {
      return this.isRequired;
   }

   protected String name() {
      for (AbstractConfigNode var2 : this.children) {
         if (var2 instanceof ConfigNodeSimpleValue) {
            return (String)Tokens.getValue(((ConfigNodeSimpleValue)var2).token()).unwrapped();
         }
      }

      return null;
   }
}
