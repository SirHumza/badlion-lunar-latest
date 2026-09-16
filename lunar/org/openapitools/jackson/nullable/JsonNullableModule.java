package org.openapitools.jackson.nullable;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

public class JsonNullableModule extends IHIRRIIORRHORHRORIHOROIRCORCOO {
   private final String NAME = "JsonNullableModule";

   @Override
   public void setupModule(IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new JsonNullableSerializers());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new JsonNullableDeserializers());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new JsonNullableTypeModifier());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new JsonNullableBeanSerializerModifier());
   }

   @Override
   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH version() {
      return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IOIOCCROHROIIHICRCCORIHORRHRHO;
   }

   @Override
   public int hashCode() {
      return "JsonNullableModule".hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public String getModuleName() {
      return "JsonNullableModule";
   }
}
