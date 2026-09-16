package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.module.title.TitleModule;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.title.v1.DisplayTitleMessage;
import com.lunarclient.apollo.title.v1.ResetTitlesMessage;
import com.lunarclient.apollo.title.v1.TitleType;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.title.Title;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ICICIOCHHHIHOCHCOHORIHRCOHHOCR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public ICICIOCHHHIHOCHCOHORIHRCOHHOCR() {
      super("title", "Title");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(TitleModule.CLEAR_TITLE_ON_SERVER_SWITCH);
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(DisplayTitleMessage.class, ResetTitlesMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayTitleMessage.class,
         var0 -> {
            TitleType var1x = var0.getTitleType();
            Component var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
               var0.getAdventureJsonMessage()
            );
            if (var2 != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getGuiIngame()
                  .bridge$displayTitle(
                     var1x == TitleType.TITLE_TYPE_TITLE ? var2 : null,
                     var1x == TitleType.TITLE_TYPE_SUBTITLE ? var2 : null,
                     Title.Times.times(
                        NetworkTypes.fromProtobuf(var0.getFadeInTime()),
                        NetworkTypes.fromProtobuf(var0.getDisplayTime()),
                        NetworkTypes.fromProtobuf(var0.getFadeOutTime())
                     ),
                     var0.getScale(),
                     var0.getInterpolationScale(),
                     var0.getInterpolationRate()
                  );
               if (var1x == TitleType.TITLE_TYPE_TITLE) {
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
                        () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI(
                           var2,
                           com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.APOLLO
                        )
                     );
               }
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetTitlesMessage.class, var1x -> this.OIHOOCROOCOOIORCHRRIOCRHRICORO());
   }

   private void OIHOOCROOCOOIORCHRRIOCRHRICORO() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGuiIngame().bridge$clearTitle();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1
   ) {
      if (this.getOptions().<Boolean, SimpleOption<Boolean>>get(TitleModule.CLEAR_TITLE_ON_SERVER_SWITCH)) {
         this.OIHOOCROOCOOIORCHRRIOCRHRICORO();
      }
   }
}
