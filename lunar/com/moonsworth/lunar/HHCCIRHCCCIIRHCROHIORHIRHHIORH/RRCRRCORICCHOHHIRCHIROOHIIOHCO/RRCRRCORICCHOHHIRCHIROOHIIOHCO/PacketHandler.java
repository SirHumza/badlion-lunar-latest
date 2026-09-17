package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.List;
import java.util.UUID;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   void bridge$addToSendQueue(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   String bridge$getRegisterPacketName();

   String bridge$getLCChannelName();

   void bridge$quit();

   void bridge$transferQuit();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getNetworkManager();

   List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getPlayerInfoMap();

   List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getSortedPlayerInfoMap();

   CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getPlayerInfo(UUID var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 15)
   byte[] bridge$serializeMessageSignatureCache();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 15)
   void bridge$deserializeMessageSignatureCache(byte[] var1);

   String bridge$getServerBrand();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 35)
   default void bridge$setClientLoaded(boolean var1) {
   }
}
