package com.typesafe.config.impl;

import java.util.Collection;
import java.util.Collections;

class ConfigNodeSingleToken extends AbstractConfigNode {
   final Token token;

   ConfigNodeSingleToken(Token var1) {
      this.token = var1;
   }

   @Override
   protected Collection<Token> tokens() {
      return Collections.singletonList(this.token);
   }

   protected Token token() {
      return this.token;
   }
}
