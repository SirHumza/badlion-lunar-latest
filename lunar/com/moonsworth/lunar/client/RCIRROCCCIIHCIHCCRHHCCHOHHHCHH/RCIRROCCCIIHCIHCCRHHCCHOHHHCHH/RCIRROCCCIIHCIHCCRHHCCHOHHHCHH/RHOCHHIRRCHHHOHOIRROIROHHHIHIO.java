package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.notification.v1.DisplayNotificationMessage;
import com.lunarclient.apollo.notification.v1.ResetNotificationsMessage;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Set;

public class RHOCHHIRRCHHHOHOIRROIROHHHIHIO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO() {
      super("notification", "Notification");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(ResetNotificationsMessage.class);
   }

   @Override
   protected void onEnable() {
      this.OIRHRHICOHCCROHOHRIICRCRCRRRHI();
   }

   @Override
   protected void onDisable() {
      this.OIRHRHICOHCCROHOHRIICRCRCRRRHI();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayNotificationMessage.class,
         var1x -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
               .RIRCCOHORCCOCIOHOROCROIICCRRRC()
               .get()) {
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO();
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
               Component var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
                  var1x.getTitleAdventureJsonLines()
               );
               Component var5 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
                  var1x.getDescriptionAdventureJsonLines()
               );
               String var6 = var1x.getResourceLocation();
               long var7 = NetworkTypes.fromProtobuf(var1x.getDisplayTime()).toMillis();
               String var9 = var4 != null
                  ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContentForRendering(
                     var4
                  )
                  : var1x.getTitle();
               String var10 = var5 != null
                  ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContentForRendering(
                     var5
                  )
                  : var1x.getDescription();
               if (var4 != null && var5 != null) {
                  var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.getId(), "DisplayNotificationMessage");
               } else {
                  var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.getId(), "DisplayNotificationMessage-Deprecated");
               }

               if (var6.isEmpty()) {
                  var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.INFO,
                        var9,
                        var10
                     )
                     .ORCOCORROHIROCCIORORRRRCHIOOCH(var7);
               } else {
                  RCIROOOOICRHCCRRCIORHHIRCOIIIC var11;
                  try {
                     var11 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var6);
                  } catch (Exception var13) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        "Failed to create resource location: " + var6
                     );
                     var13.printStackTrace();
                     return;
                  }

                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var12 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var11, var9, var10
                  );
                  if (var1x.hasDisplayTime()) {
                     var12.ORCOCORROHIROCCIORORRRRCHIOOCH(var7);
                  }
               }
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetNotificationsMessage.class, var1x -> this.OIRHRHICOHCCROHOHRIICRCRCRRRHI());
   }

   private void OIRHRHICOHCCROHOHRIICRCRCRRRHI() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IHCHHRRIIIORORCHIICIIOORCOIOIO().HORCIOCCROCOHCIICCICRIHIIICHIR();
   }
}
