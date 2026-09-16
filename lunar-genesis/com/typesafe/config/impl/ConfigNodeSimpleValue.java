package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class ConfigNodeSimpleValue extends AbstractConfigNodeValue {
   final Token token;

   ConfigNodeSimpleValue(Token var1) {
      this.token = var1;
   }

   @Override
   protected Collection<Token> tokens() {
      return Collections.singletonList(this.token);
   }

   protected Token token() {
      return this.token;
   }

   protected AbstractConfigValue value() {
      if (Tokens.isValue(this.token)) {
         return Tokens.getValue(this.token);
      } else if (Tokens.isUnquotedText(this.token)) {
         return new ConfigString.Unquoted(this.token.origin(), Tokens.getUnquotedText(this.token));
      } else if (Tokens.isSubstitution(this.token)) {
         List var1 = Tokens.getSubstitutionPathExpression(this.token);
         Path var2 = PathParser.parsePathExpression(var1.iterator(), this.token.origin());
         boolean var3 = Tokens.getSubstitutionOptional(this.token);
         return new ConfigReference(this.token.origin(), new SubstitutionExpression(var2, var3));
      } else {
         throw new ConfigException.BugOrBroken("ConfigNodeSimpleValue did not contain a valid value token");
      }
   }
}
