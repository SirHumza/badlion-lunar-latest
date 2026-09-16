package com.typesafe.config.impl;

import java.util.Collection;

enum ResolveStatus {
   UNRESOLVED,
   RESOLVED;

   static final ResolveStatus fromValues(Collection<? extends AbstractConfigValue> var0) {
      for (AbstractConfigValue var2 : var0) {
         if (var2.resolveStatus() == UNRESOLVED) {
            return UNRESOLVED;
         }
      }

      return RESOLVED;
   }

   static final ResolveStatus fromBoolean(boolean var0) {
      return var0 ? RESOLVED : UNRESOLVED;
   }
}
