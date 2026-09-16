package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.nickhider.v1.OverrideNickHiderMessage;
import com.lunarclient.apollo.nickhider.v1.ResetNickHiderMessage;
import java.util.Set;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI() {
      super("nick_hider", "NickHider");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideNickHiderMessage.class, ResetNickHiderMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OverrideNickHiderMessage.class,
         var0 -> {
            String var1x = var0.getNick();
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOHCCHIIRCOHRROCRRRRHCIIHRRORC();
            if (var2.RHIRIIORHCHHOIOROHORCOHIIIOOCH(var1x)) {
               var2.RIORIIRCCCOCIHCHOIICORIOROOHRC(var1x);
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ResetNickHiderMessage.class,
         var0 -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOHCCHIIRCOHRROCRRRRHCIIHRRORC()
            .IHHIRCCOHROOHRRICRHOIOHIRHCOOH()
      );
   }
}
