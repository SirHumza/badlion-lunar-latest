package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> expressions = new ArrayList<>();

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      super(var1);
   }

   @Override
   public double get() {
      double var1 = 0.0;

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.expressions) {
         var1 = var4.get();
      }

      return var1;
   }

   @Override
   public String toString() {
      StringJoiner var1 = new StringJoiner("; ");

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.expressions) {
         var1.add(var3.toString());
      }

      return var1.toString();
   }
}
