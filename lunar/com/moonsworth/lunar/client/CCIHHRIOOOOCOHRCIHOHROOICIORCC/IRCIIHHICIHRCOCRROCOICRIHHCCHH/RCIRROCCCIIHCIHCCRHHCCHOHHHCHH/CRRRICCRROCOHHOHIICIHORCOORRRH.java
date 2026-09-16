package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.gson.JsonPrimitive;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return true;
   }

   @Override
   public JsonPrimitive RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, JsonPrimitive var2) {
      String var3 = var2.getAsString();
      if (!var3.equals("true") && !var3.equals("false")) {
         Integer var4 = Ints.tryParse(var3);
         if (var4 != null) {
            return new JsonPrimitive(var4);
         }

         Float var5 = Floats.tryParse(var3);
         if (var5 != null) {
            return new JsonPrimitive(var5);
         }

         Double var6 = Doubles.tryParse(var3);
         return var6 != null ? new JsonPrimitive(var6) : var2;
      } else {
         return new JsonPrimitive(Boolean.parseBoolean(var3));
      }
   }
}
