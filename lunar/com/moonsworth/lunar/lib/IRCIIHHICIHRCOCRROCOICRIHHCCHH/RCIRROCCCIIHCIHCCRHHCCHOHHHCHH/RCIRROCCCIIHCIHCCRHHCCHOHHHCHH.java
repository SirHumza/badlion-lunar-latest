package com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH environmentVariable() {
      return environmentVariable("");
   }

   static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH environmentVariable(String var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH systemProperty() {
      return systemProperty("");
   }

   static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH systemProperty(String var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   <T> @Nullable T value(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> var1);
}
