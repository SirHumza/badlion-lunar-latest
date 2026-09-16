package org.openapitools.jackson.nullable;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI;

public class JsonNullableSerializer extends IHCRORHRORIICHRHRCHRRIRRHHOCOO<JsonNullable<?>> {
   private static final long serialVersionUID = 1L;

   protected JsonNullableSerializer(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1, boolean var2, CORCOCICIRIOHROHROIIOOHICCHCRR var3, RHOCHHIRRCHHHOHOIRROIROHHHIHIO<Object> var4
   ) {
      super(var1, var2, var3, var4);
   }

   protected JsonNullableSerializer(
      JsonNullableSerializer var1,
      CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      CORCOCICIRIOHROHROIIOOHICCHCRR var3,
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> var4,
      RIROICHCRROROHCCROOCCCCOCHCCRI var5,
      Object var6
   ) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   @Override
   protected IHCRORHRORIICHRHRCHRRIRRHHOCOO<JsonNullable<?>> withResolved(
      CRRRICCRROCOHHOHIICIHORCOORRRH var1, CORCOCICIRIOHROHROIIOOHICCHCRR var2, RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> var3, RIROICHCRROROHCCROOCCCCOCHCCRI var4
   ) {
      return new JsonNullableSerializer(this, var1, var2, var3, var4, this._suppressableValue);
   }

   @Override
   public IHCRORHRORIICHRHRCHRRIRRHHOCOO<JsonNullable<?>> withContentInclusion(Object var1, boolean var2) {
      return new JsonNullableSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, var1);
   }

   protected boolean _isValuePresent(JsonNullable<?> var1) {
      return var1.isPresent();
   }

   protected Object _getReferenced(JsonNullable<?> var1) {
      return var1.get();
   }

   protected Object _getReferencedIfPresent(JsonNullable<?> var1) {
      return var1.isPresent() ? var1.get() : null;
   }
}
