package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.paynow.v1.OpenPayNowEmbeddedCheckoutMessage;
import com.moonsworth.lunar.client.util.OCOROCROIRCHIHIHHOOIRIIIRRCRHI;
import java.util.Set;

public class RICRIRRCOHRCOCRRHHCRHRROOIOHHR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR() {
      super("pay_now", "PayNow");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OpenPayNowEmbeddedCheckoutMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OpenPayNowEmbeddedCheckoutMessage.class, var0 -> OCOROCROIRCHIHIHHOOIRIIIRRCRHI.HHCCIRORCRCHOIOHRRIRRRIORRCRRR(var0.getCheckoutToken())
      );
   }
}
