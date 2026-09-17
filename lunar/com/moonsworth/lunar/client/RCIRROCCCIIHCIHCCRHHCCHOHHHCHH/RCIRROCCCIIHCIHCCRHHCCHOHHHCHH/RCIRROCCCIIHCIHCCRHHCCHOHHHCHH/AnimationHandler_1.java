package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.module.tntcountdown.TntCountdownModule;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.tntcountdown.v1.SetTntCountdownMessage;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public IRCRRHRCIRHIHIHROHCRRHIIHHHHCH() {
      super("tnt_countdown", "TNT Countdown");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(TntCountdownModule.TNT_TICKS);
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(SetTntCountdownMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         SetTntCountdownMessage.class,
         var0 -> {
            if (var0.hasEntityId()) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRHHORICORICIRHICOHHROHIIHICCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1x = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .ROOCCHROCHIIIROHOCCCCIIICIHOOH();
               ApolloEntity var2 = NetworkTypes.fromProtobuf(var0.getEntityId());
               int var3 = var0.getDurationTicks();
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                  var1x.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.getEntityUuid(), var3);
               } else {
                  var1x.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(var2.getEntityId(), var3);
               }
            }
         }
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRHHORICORICIRHICOHHROHIIHICCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .ROOCCHROCHIIIROHOCCCCIIICIHOOH();
      if (var1.getOption().equals(TntCountdownModule.TNT_TICKS)) {
         var2.OOHCHIOCOOORHOHOCRCOOIICCICIHI(((Number)var1.getValue()).intValue());
      }
   }
}
