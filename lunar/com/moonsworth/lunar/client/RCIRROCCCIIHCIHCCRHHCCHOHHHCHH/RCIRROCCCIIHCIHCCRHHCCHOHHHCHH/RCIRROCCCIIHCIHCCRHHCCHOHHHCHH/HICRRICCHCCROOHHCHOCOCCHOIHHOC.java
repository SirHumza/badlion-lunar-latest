package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.richpresence.v1.OverrideServerRichPresenceMessage;
import com.lunarclient.apollo.richpresence.v1.ResetServerRichPresenceMessage;
import com.lunarclient.common.v1.ServerRichStatus;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Set;

public class HICRRICCHCCROOHHCHOCOCCHOIHHOC
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public HICRRICCHCCROOHHCHOCOCCHOIHHOC() {
      super("rich_presence", "RichPresence");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideServerRichPresenceMessage.class, ResetServerRichPresenceMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OverrideServerRichPresenceMessage.class,
         var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var1x -> {
                  ServerRichStatus var2 = ServerRichStatus.newBuilder()
                     .setSource(ServerRichStatus.Source.SOURCE_APOLLO)
                     .setGameName(var0.getGameName())
                     .setGameVariantName(var0.getGameVariantName())
                     .setGameState(var0.getGameState())
                     .setPlayerState(var0.getPlayerState())
                     .setMapName(var0.getMapName())
                     .setSubServer(var0.getSubServer())
                     .setTeamCurrentSize(var0.getTeamCurrentSize())
                     .setTeamMaxSize(var0.getTeamMaxSize())
                     .build();
                  var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
               }
            )
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ResetServerRichPresenceMessage.class,
         var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(var0x -> var0x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerRichStatus.getDefaultInstance()))
      );
   }
}
