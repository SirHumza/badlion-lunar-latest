package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.webosr.javascript.FunctionBus;
import java.util.Objects;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends FunctionBus {
   @Override
   protected Object stringToObject(String var1, Class<?> var2) {
      if (!Objects.equals(var1, "null") && !Objects.equals(var1, "undefined")) {
         try {
            return super.stringToObject(var1, var2);
         } catch (Exception var4) {
            return IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var1, var2);
         }
      } else {
         return null;
      }
   }

   @Override
   protected String objectToString(Object var1, Class<?> var2) {
      try {
         return super.objectToString(var1, var2);
      } catch (Exception var4) {
         return IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var1);
      }
   }
}
