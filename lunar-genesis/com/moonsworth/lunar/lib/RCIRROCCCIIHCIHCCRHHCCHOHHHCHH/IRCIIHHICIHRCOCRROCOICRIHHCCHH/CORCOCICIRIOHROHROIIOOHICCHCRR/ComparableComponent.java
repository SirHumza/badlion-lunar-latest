package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements Comparable<IRCIIHHICIHRCOCRROCOICRIHHCCHH<T>> {
   protected final Type HCHORIICCCHIHRIOHIIRRRRCHRCOIR;

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      Type var1 = this.getClass().getGenericSuperclass();
      if (var1 instanceof Class) {
         throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
      }

      this.HCHORIICCCHIHRIOHIIRRRRCHRCOIR = ((ParameterizedType)var1).getActualTypeArguments()[0];
   }

   public Type getType() {
      return this.HCHORIICCCHIHRIOHIIRRRRCHRCOIR;
   }

   public int HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var1) {
      return 0;
   }
}
