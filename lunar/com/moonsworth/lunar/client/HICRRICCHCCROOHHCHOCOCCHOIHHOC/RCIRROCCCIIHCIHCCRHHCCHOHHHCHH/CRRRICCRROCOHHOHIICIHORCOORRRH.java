package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import java.time.Instant;
import java.util.function.Consumer;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(String var1) {
      super(var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.XBOX);
   }

   @Override
   public boolean CRHCHHROOCCHRHHOHRCHICCIRRIHRC() {
      return this.getAccessToken() != null && this.IIRCCROHCHOHIHOHCCCOIOOHHICRCC() != null
         ? Instant.now().isBefore(this.IIRCCROHCHOHIHOHCCCOIOOHHICRCC())
         : false;
   }

   @Override
   public long OIOIRCROCCHHCROROOOIRCCIIHCIOR() {
      JsonObject var1 = com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HCHCHOORHHOHHOCICRHICIRRIOHICR(this.getAccessToken());
      return !var1.has("exp") ? 0L : var1.get("exp").getAsInt() * 1000L;
   }

   @Override
   public int RCOROOOICCRIRCIIHHHRHRIRRIOIHC() {
      JsonObject var1 = com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HCHCHOORHHOHHOCICRHICIRRIOHICR(this.getAccessToken());
      return !var1.has("iat") ? 0 : var1.get("iat").getAsInt();
   }

   @Override
   public void OHIIIOHIRIRCCRRIOIICCHHIORRHOH(Consumer<com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH> var1) {
      com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }
}
