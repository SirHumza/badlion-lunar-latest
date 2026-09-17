package com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.hostedworld.v1.ListHostedWorldsRequest;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Thread {
   @Override
   public void run() {
      try {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OCICRRCHRIRORHIRHIHOIRCCIHCHRH(true);

         while (
            !this.isInterrupted()
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen() instanceof RIROICHCRROROHCCROOCCCCOCHCCRI
         ) {
            CHICHCHCHRHRRRCHIHCOOIHCCCRHCH();

            try {
               Thread.sleep(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().getMultiplayerRefreshIntervalSeconds()
                     * 1000L
               );
            } catch (InterruptedException var2) {
            }
         }
      } catch (Throwable var3) {
         throw var3;
      }
   }

   public static void CHICHCHCHRHRRRCHIHCOOIHCCCRHCH() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var0 -> var0.IRROIHHOOHCIOHICHHROOOCOCHCCOI()
               .listHostedWorlds(
                  null,
                  ListHostedWorldsRequest.newBuilder().build(),
                  var0x -> {
                     if (!var0x.getHostedWorldsList()
                        .equals(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().IIOCRICIRCCIIOHHOHHHCRROHHOCRI()
                        )) {
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .CCRHICOCOHIIRIHCOCIRCHHROHCCRR()
                           .ROCRHIOCHIIOCROIHHOHHROCHCIHCH(var0x.getHostedWorldsList());
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OCICRRCHRIRORHIRHIHOIRCCIHCHRH(true);
                     }
                  }
               )
         );
   }
}
