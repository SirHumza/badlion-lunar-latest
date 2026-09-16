package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.tebex.v1.OpenTebexEmbeddedCheckoutMessage;
import com.moonsworth.lunar.client.util.OCOROCROIRCHIHIHHOOIRIIIRRCRHI;
import java.util.Set;

public class IHCRORHRORIICHRHRCHRRIRRHHOCOO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public IHCRORHRORIICHRHRCHRRIRRHHOCOO() {
      super("tebex", "Tebex");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OpenTebexEmbeddedCheckoutMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OpenTebexEmbeddedCheckoutMessage.class, var0 -> OCOROCROIRCHIHIHHOOIRIIIRRCRHI.OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(var0.getBasketIdent(), var0.getLocale())
      );
   }
}
