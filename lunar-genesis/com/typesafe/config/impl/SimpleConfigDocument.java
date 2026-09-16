package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.parser.ConfigDocument;
import java.io.StringReader;
import java.util.Iterator;

final class SimpleConfigDocument implements ConfigDocument {
   private ConfigNodeRoot configNodeTree;
   private ConfigParseOptions parseOptions;

   SimpleConfigDocument(ConfigNodeRoot var1, ConfigParseOptions var2) {
      this.configNodeTree = var1;
      this.parseOptions = var2;
   }

   @Override
   public ConfigDocument withValueText(String var1, String var2) {
      if (var2 == null) {
         throw new ConfigException.BugOrBroken("null value for " + var1 + " passed to withValueText");
      }

      SimpleConfigOrigin var3 = SimpleConfigOrigin.newSimple("single value parsing");
      StringReader var4 = new StringReader(var2);
      Iterator var5 = Tokenizer.tokenize(var3, var4, this.parseOptions.getSyntax());
      AbstractConfigNodeValue var6 = ConfigDocumentParser.parseValue(var5, var3, this.parseOptions);
      var4.close();
      return new SimpleConfigDocument(this.configNodeTree.setValue(var1, var6, this.parseOptions.getSyntax()), this.parseOptions);
   }

   @Override
   public ConfigDocument withValue(String var1, ConfigValue var2) {
      if (var2 == null) {
         throw new ConfigException.BugOrBroken("null value for " + var1 + " passed to withValue");
      }

      ConfigRenderOptions var3 = ConfigRenderOptions.defaults();
      var3 = var3.setOriginComments(false);
      return this.withValueText(var1, var2.render(var3).trim());
   }

   @Override
   public ConfigDocument withoutPath(String var1) {
      return new SimpleConfigDocument(this.configNodeTree.setValue(var1, null, this.parseOptions.getSyntax()), this.parseOptions);
   }

   @Override
   public boolean hasPath(String var1) {
      return this.configNodeTree.hasValue(var1);
   }

   @Override
   public String render() {
      return this.configNodeTree.render();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof ConfigDocument && this.render().equals(((ConfigDocument)var1).render());
   }

   @Override
   public int hashCode() {
      return this.render().hashCode();
   }
}
