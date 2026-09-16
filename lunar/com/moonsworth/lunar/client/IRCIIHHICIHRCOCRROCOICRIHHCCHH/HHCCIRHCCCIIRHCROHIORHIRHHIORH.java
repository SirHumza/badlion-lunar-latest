package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.function.Consumer;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private String ORRHCORRCHOROORHHIORHIOCOICOHC;

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, Consumer<String> var2) {
      JsonObject var3 = com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HCHCHOORHHOHHOCICRHICIRRIOHICR(this.ORRHCORRCHOROORHHIORHIOCOICOHC);
      if (var3.has("exp")) {
         if (System.currentTimeMillis() < var3.get("exp").getAsInt() * 1000L) {
            var2.accept(this.ORRHCORRCHOROORHHIORHIOCOICOHC);
         } else {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2x -> {
               this.ORRHCORRCHOROORHHIORHIOCOICOHC = var2x;
               var2.accept(var2x);
            });
         }
      }
   }

   @Generated
   public void CROCIHOHROHRCOHRHOCHICOCRIIIHO(String var1) {
      this.ORRHCORRCHOROORHHIORHIOCOICOHC = var1;
   }
}
