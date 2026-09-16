package org.openapitools.jackson.nullable;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

public class JsonNullableDeserializer extends ORHIOICIOCRRHOOCOHRORIHICHRCRR<JsonNullable<Object>> {
   private static final long serialVersionUID = 1L;
   private boolean isStringDeserializer = false;

   public JsonNullableDeserializer(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, HHRIICOIOORCHCOIICOOIHIRHHICRI var2, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3, CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var4
   ) {
      super(var1, var2, var3, var4);
      if (var1 instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI && ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1).ROIRRRIHROCRRIIIICORRRIRHROCCO() != null) {
         this.isStringDeserializer = ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1).ROIRRRIHROCRRIIIICORRRIRHROCCO().IROCHOHCORHCOCCCOCHORCICRORIIC(String.class);
      }
   }

   public JsonNullable<Object> deserialize(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = var1.RCICCOICCHHORCCIROCIIRHHIIICOH();
      if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING && !this.isStringDeserializer) {
         String var4 = var1.getText().trim();
         if (var4.isEmpty()) {
            return JsonNullable.undefined();
         }
      }

      return (JsonNullable<Object>)super.deserialize(var1, var2);
   }

   public JsonNullableDeserializer withResolved(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1, CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var2) {
      return new JsonNullableDeserializer(this._fullType, this._valueInstantiator, var1, var2);
   }

   @Override
   public Object getAbsentValue(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return JsonNullable.undefined();
   }

   public JsonNullable<Object> getNullValue(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return JsonNullable.of(null);
   }

   @Override
   public Object getEmptyValue(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return JsonNullable.undefined();
   }

   public JsonNullable<Object> referenceValue(Object var1) {
      return JsonNullable.of(var1);
   }

   public Object getReferenced(JsonNullable<Object> var1) {
      return var1.get();
   }

   public JsonNullable<Object> updateReference(JsonNullable<Object> var1, Object var2) {
      return JsonNullable.of(var2);
   }

   @Override
   public Boolean supportsUpdate(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return Boolean.TRUE;
   }
}
