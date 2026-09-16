package com.typesafe.config.impl;

import com.typesafe.config.ConfigSyntax;
import java.util.ArrayList;
import java.util.Collection;

final class ConfigNodeObject extends ConfigNodeComplexValue {
   ConfigNodeObject(Collection<AbstractConfigNode> var1) {
      super(var1);
   }

   protected ConfigNodeObject newNode(Collection<AbstractConfigNode> var1) {
      return new ConfigNodeObject(var1);
   }

   public boolean hasValue(Path var1) {
      for (AbstractConfigNode var3 : this.children) {
         if (var3 instanceof ConfigNodeField) {
            ConfigNodeField var4 = (ConfigNodeField)var3;
            Path var5 = var4.path().value();
            if (var5.equals(var1) || var5.startsWith(var1)) {
               return true;
            }

            if (var1.startsWith(var5) && var4.value() instanceof ConfigNodeObject) {
               ConfigNodeObject var6 = (ConfigNodeObject)var4.value();
               Path var7 = var1.subPath(var5.length());
               if (var6.hasValue(var7)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   protected ConfigNodeObject changeValueOnPath(Path var1, AbstractConfigNodeValue var2, ConfigSyntax var3) {
      ArrayList var4 = new ArrayList<>(super.children);
      boolean var5 = false;
      AbstractConfigNodeValue var6 = var2;

      for (int var7 = var4.size() - 1; var7 >= 0; var7--) {
         if (var4.get(var7) instanceof ConfigNodeSingleToken) {
            Token var12 = ((ConfigNodeSingleToken)var4.get(var7)).token();
            if (var3 == ConfigSyntax.JSON && !var5 && var12 == Tokens.COMMA) {
               var4.remove(var7);
            }
         } else if (var4.get(var7) instanceof ConfigNodeField) {
            ConfigNodeField var8 = (ConfigNodeField)var4.get(var7);
            Path var9 = var8.path().value();
            if ((var6 != null || !var9.equals(var1)) && (!var9.startsWith(var1) || var9.equals(var1))) {
               if (var9.equals(var1)) {
                  var5 = true;
                  AbstractConfigNode var16 = var7 - 1 > 0 ? (AbstractConfigNode)var4.get(var7 - 1) : null;
                  AbstractConfigNodeValue var15;
                  if (var2 instanceof ConfigNodeComplexValue
                     && var16 instanceof ConfigNodeSingleToken
                     && Tokens.isIgnoredWhitespace(((ConfigNodeSingleToken)var16).token())) {
                     var15 = ((ConfigNodeComplexValue)var2).indentText(var16);
                  } else {
                     var15 = var2;
                  }

                  var4.set(var7, var8.replaceValue(var15));
                  var6 = null;
               } else if (var1.startsWith(var9)) {
                  var5 = true;
                  if (var8.value() instanceof ConfigNodeObject) {
                     Path var14 = var1.subPath(var9.length());
                     var4.set(var7, var8.replaceValue(((ConfigNodeObject)var8.value()).changeValueOnPath(var14, var6, var3)));
                     if (var6 != null && !var8.equals(super.children.get(var7))) {
                        var6 = null;
                     }
                  }
               } else {
                  var5 = true;
               }
            } else {
               var4.remove(var7);

               for (int var10 = var7; var10 < var4.size() && var4.get(var10) instanceof ConfigNodeSingleToken; var10++) {
                  Token var11 = ((ConfigNodeSingleToken)var4.get(var10)).token();
                  if (!Tokens.isIgnoredWhitespace(var11) && var11 != Tokens.COMMA) {
                     break;
                  }

                  var4.remove(var10);
                  var10--;
               }
            }
         }
      }

      return new ConfigNodeObject(var4);
   }

   public ConfigNodeObject setValueOnPath(String var1, AbstractConfigNodeValue var2) {
      return this.setValueOnPath(var1, var2, ConfigSyntax.CONF);
   }

   public ConfigNodeObject setValueOnPath(String var1, AbstractConfigNodeValue var2, ConfigSyntax var3) {
      ConfigNodePath var4 = PathParser.parsePathNode(var1, var3);
      return this.setValueOnPath(var4, var2, var3);
   }

   private ConfigNodeObject setValueOnPath(ConfigNodePath var1, AbstractConfigNodeValue var2, ConfigSyntax var3) {
      ConfigNodeObject var4 = this.changeValueOnPath(var1.value(), var2, var3);
      return !var4.hasValue(var1.value()) ? var4.addValueOnPath(var1, var2, var3) : var4;
   }

   private Collection<AbstractConfigNode> indentation() {
      boolean var1 = false;
      ArrayList var2 = new ArrayList();
      if (this.children.isEmpty()) {
         return var2;
      }

      for (int var3 = 0; var3 < this.children.size(); var3++) {
         if (!var1) {
            if (this.children.get(var3) instanceof ConfigNodeSingleToken && Tokens.isNewline(((ConfigNodeSingleToken)this.children.get(var3)).token())) {
               var1 = true;
               var2.add(new ConfigNodeSingleToken(Tokens.newLine(null)));
            }
         } else if (this.children.get(var3) instanceof ConfigNodeSingleToken
            && Tokens.isIgnoredWhitespace(((ConfigNodeSingleToken)this.children.get(var3)).token())
            && var3 + 1 < this.children.size()
            && (this.children.get(var3 + 1) instanceof ConfigNodeField || this.children.get(var3 + 1) instanceof ConfigNodeInclude)) {
            var2.add(this.children.get(var3));
            return var2;
         }
      }

      if (var2.isEmpty()) {
         var2.add(new ConfigNodeSingleToken(Tokens.newIgnoredWhitespace(null, " ")));
      } else {
         AbstractConfigNode var6 = this.children.get(this.children.size() - 1);
         if (var6 instanceof ConfigNodeSingleToken && ((ConfigNodeSingleToken)var6).token() == Tokens.CLOSE_CURLY) {
            AbstractConfigNode var4 = this.children.get(this.children.size() - 2);
            String var5 = "";
            if (var4 instanceof ConfigNodeSingleToken && Tokens.isIgnoredWhitespace(((ConfigNodeSingleToken)var4).token())) {
               var5 = ((ConfigNodeSingleToken)var4).token().tokenText();
            }

            var5 = var5 + "  ";
            var2.add(new ConfigNodeSingleToken(Tokens.newIgnoredWhitespace(null, var5)));
            return var2;
         }
      }

      return var2;
   }

   protected ConfigNodeObject addValueOnPath(ConfigNodePath var1, AbstractConfigNodeValue var2, ConfigSyntax var3) {
      Path var4 = var1.value();
      ArrayList var5 = new ArrayList<>(super.children);
      ArrayList var6 = new ArrayList<>(this.indentation());
      AbstractConfigNodeValue var7;
      if (var2 instanceof ConfigNodeComplexValue && !var6.isEmpty()) {
         var7 = ((ConfigNodeComplexValue)var2).indentText((AbstractConfigNode)var6.get(var6.size() - 1));
      } else {
         var7 = var2;
      }

      boolean var8 = var6.size() <= 0 || !(var6.get(0) instanceof ConfigNodeSingleToken) || !Tokens.isNewline(((ConfigNodeSingleToken)var6.get(0)).token());
      if (var4.length() > 1) {
         for (int var9 = super.children.size() - 1; var9 >= 0; var9--) {
            if (super.children.get(var9) instanceof ConfigNodeField) {
               ConfigNodeField var10 = (ConfigNodeField)super.children.get(var9);
               Path var11 = var10.path().value();
               if (var4.startsWith(var11) && var10.value() instanceof ConfigNodeObject) {
                  ConfigNodePath var12 = var1.subPath(var11.length());
                  ConfigNodeObject var13 = (ConfigNodeObject)var10.value();
                  var5.set(var9, var10.replaceValue(var13.addValueOnPath(var12, var2, var3)));
                  return new ConfigNodeObject(var5);
               }
            }
         }
      }

      boolean var14 = !super.children.isEmpty()
         && super.children.get(0) instanceof ConfigNodeSingleToken
         && ((ConfigNodeSingleToken)super.children.get(0)).token() == Tokens.OPEN_CURLY;
      ArrayList var15 = new ArrayList();
      var15.addAll(var6);
      var15.add(var1.first());
      var15.add(new ConfigNodeSingleToken(Tokens.newIgnoredWhitespace(null, " ")));
      var15.add(new ConfigNodeSingleToken(Tokens.COLON));
      var15.add(new ConfigNodeSingleToken(Tokens.newIgnoredWhitespace(null, " ")));
      if (var4.length() == 1) {
         var15.add(var7);
      } else {
         ArrayList var16 = new ArrayList();
         var16.add(new ConfigNodeSingleToken(Tokens.OPEN_CURLY));
         if (var6.isEmpty()) {
            var16.add(new ConfigNodeSingleToken(Tokens.newLine(null)));
         }

         var16.addAll(var6);
         var16.add(new ConfigNodeSingleToken(Tokens.CLOSE_CURLY));
         ConfigNodeObject var18 = new ConfigNodeObject(var16);
         var15.add(var18.addValueOnPath(var1.subPath(1), var7, var3));
      }

      if (var3 == ConfigSyntax.JSON || var14 || var8) {
         for (int var17 = var5.size() - 1; var17 >= 0; var17--) {
            if ((var3 == ConfigSyntax.JSON || var8) && var5.get(var17) instanceof ConfigNodeField) {
               if (var17 + 1 >= var5.size()
                  || !(var5.get(var17 + 1) instanceof ConfigNodeSingleToken)
                  || ((ConfigNodeSingleToken)var5.get(var17 + 1)).token() != Tokens.COMMA) {
                  var5.add(var17 + 1, new ConfigNodeSingleToken(Tokens.COMMA));
               }
               break;
            }

            if (var14 && var5.get(var17) instanceof ConfigNodeSingleToken && ((ConfigNodeSingleToken)var5.get(var17)).token == Tokens.CLOSE_CURLY) {
               AbstractConfigNode var19 = (AbstractConfigNode)var5.get(var17 - 1);
               if (var19 instanceof ConfigNodeSingleToken && Tokens.isNewline(((ConfigNodeSingleToken)var19).token())) {
                  var5.add(var17 - 1, new ConfigNodeField(var15));
                  var17--;
               } else if (var19 instanceof ConfigNodeSingleToken && Tokens.isIgnoredWhitespace(((ConfigNodeSingleToken)var19).token())) {
                  AbstractConfigNode var20 = (AbstractConfigNode)var5.get(var17 - 2);
                  if (var8) {
                     var5.add(var17 - 1, new ConfigNodeField(var15));
                     var17--;
                  } else if (var20 instanceof ConfigNodeSingleToken && Tokens.isNewline(((ConfigNodeSingleToken)var20).token())) {
                     var5.add(var17 - 2, new ConfigNodeField(var15));
                     var17 -= 2;
                  } else {
                     var5.add(var17, new ConfigNodeField(var15));
                  }
               } else {
                  var5.add(var17, new ConfigNodeField(var15));
               }
            }
         }
      }

      if (!var14) {
         if (!var5.isEmpty()
            && var5.get(var5.size() - 1) instanceof ConfigNodeSingleToken
            && Tokens.isNewline(((ConfigNodeSingleToken)var5.get(var5.size() - 1)).token())) {
            var5.add(var5.size() - 1, new ConfigNodeField(var15));
         } else {
            var5.add(new ConfigNodeField(var15));
         }
      }

      return new ConfigNodeObject(var5);
   }

   public ConfigNodeObject removeValueOnPath(String var1, ConfigSyntax var2) {
      Path var3 = PathParser.parsePathNode(var1, var2).value();
      return this.changeValueOnPath(var3, null, var2);
   }
}
