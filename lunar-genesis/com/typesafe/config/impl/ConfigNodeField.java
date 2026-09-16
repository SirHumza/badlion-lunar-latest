package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class ConfigNodeField extends AbstractConfigNode {
   private final ArrayList<AbstractConfigNode> children;

   public ConfigNodeField(Collection<AbstractConfigNode> var1) {
      this.children = new ArrayList<>(var1);
   }

   @Override
   protected Collection<Token> tokens() {
      ArrayList var1 = new ArrayList();

      for (AbstractConfigNode var3 : this.children) {
         var1.addAll(var3.tokens());
      }

      return var1;
   }

   public ConfigNodeField replaceValue(AbstractConfigNodeValue var1) {
      ArrayList var2 = new ArrayList<>(this.children);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         if (var2.get(var3) instanceof AbstractConfigNodeValue) {
            var2.set(var3, var1);
            return new ConfigNodeField(var2);
         }
      }

      throw new ConfigException.BugOrBroken("Field node doesn't have a value");
   }

   public AbstractConfigNodeValue value() {
      for (int var1 = 0; var1 < this.children.size(); var1++) {
         if (this.children.get(var1) instanceof AbstractConfigNodeValue) {
            return (AbstractConfigNodeValue)this.children.get(var1);
         }
      }

      throw new ConfigException.BugOrBroken("Field node doesn't have a value");
   }

   public ConfigNodePath path() {
      for (int var1 = 0; var1 < this.children.size(); var1++) {
         if (this.children.get(var1) instanceof ConfigNodePath) {
            return (ConfigNodePath)this.children.get(var1);
         }
      }

      throw new ConfigException.BugOrBroken("Field node doesn't have a path");
   }

   protected Token separator() {
      for (AbstractConfigNode var2 : this.children) {
         if (var2 instanceof ConfigNodeSingleToken) {
            Token var3 = ((ConfigNodeSingleToken)var2).token();
            if (var3 == Tokens.PLUS_EQUALS || var3 == Tokens.COLON || var3 == Tokens.EQUALS) {
               return var3;
            }
         }
      }

      return null;
   }

   protected List<String> comments() {
      ArrayList var1 = new ArrayList();

      for (AbstractConfigNode var3 : this.children) {
         if (var3 instanceof ConfigNodeComment) {
            var1.add(((ConfigNodeComment)var3).commentText());
         }
      }

      return var1;
   }
}
