package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public interface IHIRRIIORRHORHRORIHOROIRCORCOO extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   void bridge$addMessage(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   );

   void bridge$addMessageWithLunarId(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      boolean var3
   );

   int bridge$addMessageWithLunarId(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   );

   void bridge$deleteMessageByLunarId(int var1, boolean var2);

   default void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1) {
      this.bridge$deleteMessageByLunarId(var1, false);
   }

   @Nullable
   Component bridge$getMessageContentByLunarId(int var1);

   boolean bridge$getChatOpen();

   int bridge$getLunarId();

   void bridge$clearChatMessages();

   void bridge$rescaleChat();

   boolean bridge$messageAddedByApollo();

   @Override
   default Optional<String> RICCICOHIICIIORHCHCRCRHOOOCHIC() {
      return Optional.of("New Chat");
   }
}
