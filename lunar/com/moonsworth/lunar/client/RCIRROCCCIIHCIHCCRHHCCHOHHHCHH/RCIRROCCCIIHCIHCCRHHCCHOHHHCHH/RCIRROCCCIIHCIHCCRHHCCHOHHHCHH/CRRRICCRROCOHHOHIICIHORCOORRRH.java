package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.chat.v1.ChatButton;
import com.lunarclient.apollo.chat.v1.DisplayChatButtonsMessage;
import com.lunarclient.apollo.chat.v1.DisplayLiveChatMessageMessage;
import com.lunarclient.apollo.chat.v1.RemoveChatButtonMessage;
import com.lunarclient.apollo.chat.v1.RemoveLiveChatMessageMessage;
import com.lunarclient.apollo.chat.v1.ResetChatButtonsMessage;
import com.lunarclient.apollo.chat.v1.UpdateChatButtonMessage;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final int OIRCHHRRCCROHIOROCRCCIIIHHOCHC = 320;
   public static final int CHHHRIIIIIRRHHICIRHCOCHIOHCRHR = 20;
   private static final int HCHROROOIIORIORRIOHOIROCHORCRO = 2;
   private static final int OORRIHOOCIIOHROHCIIRCROOHIIRCH = 16;
   private static final int COCHRHOIROOOHHROCCIICHCOCOCCHH = 25;
   private static final int OOCIIHHOHROOROHHCCRCIIHOICCIHC = 100;
   private final Map<String, com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CROCOHCOIHHHCHOOHOOIHHHICHOHOI = new LinkedHashMap<>();

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      super("chat", "Chat");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(
         DisplayLiveChatMessageMessage.class,
         RemoveLiveChatMessageMessage.class,
         DisplayChatButtonsMessage.class,
         RemoveChatButtonMessage.class,
         ResetChatButtonsMessage.class,
         UpdateChatButtonMessage.class
      );
   }

   @Override
   protected void onDisable() {
      this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.clear();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayLiveChatMessageMessage.class,
         var0 -> {
            Component var1x = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
               var0.getAdventureJsonLines()
            );
            if (var1x != null) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getGuiIngame()
                  .bridge$getChatGUI();
               int var3 = var0.getMessageId();
               var2.bridge$deleteMessageByLunarId(var3, true);
               var2.bridge$addMessageWithLunarId(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var1x), var3, true
               );
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RemoveLiveChatMessageMessage.class,
         var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getGuiIngame()
            .bridge$getChatGUI()
            .bridge$deleteMessageByLunarId(var0.getMessageId(), true)
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DisplayChatButtonsMessage.class, var1x -> {
         if (this.isEnabled()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveChatButtonMessage.class, var1x -> {
         if (this.isEnabled()) {
            this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.remove(var1x.getId());
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetChatButtonsMessage.class, var1x -> {
         if (this.isEnabled()) {
            this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.clear();
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         UpdateChatButtonMessage.class,
         var1x -> {
            if (this.isEnabled()) {
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI
                  .get(var1x.getId());
               if (var2 != null) {
                  var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getUpdate());
               }
            }
         }
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DisplayChatButtonsMessage var1) {
      int var2 = 0;
      int var3 = 0;

      for (ChatButton var5 : var1.getChatButtonsList()) {
         if (!var5.hasButton()) {
            var2++;
         } else {
            String var6 = var5.getButton().getId();
            int var7 = this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.size() - (this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.containsKey(var6) ? 1 : 0);
            if (var7 < 25 && var3 < 100) {
               var3++;
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var5.getButton(), 320.0F, 20.0F
               );
               if (var8 == null) {
                  var2++;
               } else {
                  this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.put(var8.getId(), var8);
               }
            } else {
               var2++;
            }
         }
      }

      if (var2 > 0) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Apollo", "Dropped " + var2 + " invalid or over-cap chat buttons"
         );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         var1.IIHROCHHOHOCHRHOOICIHHRIRIHIRC()
      );
      if (var2 != null) {
         boolean var3 = var2.bridge$isSuggestionOverlayVisible();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RRROIRCCCRHRROHRIORCCIIOORRRHH();
         boolean var5 = var4 != null && var4.isEnabled();
         boolean var6 = var5 && var4.IHROCRCOICICCOIICHCOCCOIIRHCIC();
         if (!this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.isEmpty()) {
            float var7 = 2.0F;
            float var8 = var2.bridge$getHeight() - 16 - 20;
            if (var6) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO(), var7, var8);
            }

            double var9 = var1.RRRCORIOCCCIOIIHRRCRHIHOROHRCR().ICORIROICCORCRROCRCIRRRHHHOOIR();
            double var11 = var1.RRRCORIOCCCIOIIHRRCRHIHOROHRCR().OICOHRRRRCOICCHOIOROHOCOORCHII();

            for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 : this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI
               .values()) {
               boolean var15 = !var3 && var14.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var8, var9, var11);
               var14.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO(), var7, var8, var15);
            }

            for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 : this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI
               .values()) {
               var17.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO(), var7, var8);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         var1.IIHROCHHOHOCHRHOOICIHHRIRIHIRC()
      );
      if (var2 != null && !this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.isEmpty()) {
         if (!var2.bridge$isSuggestionOverlayVisible()) {
            float var3 = 2.0F;
            float var4 = var2.bridge$getHeight() - 16 - 20;
            double var5 = var1.RRRCORIOCCCIOIIHRRCRHIHOROHRCR().ICORIROICCORCRROCRCIRRRHHHOOIR();
            double var7 = var1.RRRCORIOCCCIOIIHRRCRHIHOROHRCR().OICOHRRRRCOICCHOIOROHOCOORCHII();
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = null;

            for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 : this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI
               .values()) {
               if (var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var4, var5, var7)) {
                  var9 = var11;
               }
            }

            if (var9 != null) {
               var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO(), (int)var5, (int)var7);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      if (var1.OCOHRCHROROIRROIRICOOOICRHICCR()
         == com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLICK) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var1.IIHROCHHOHOCHRHOOICIHHRIRIHIRC()
         );
         if (var2 != null && !this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.isEmpty()) {
            if (!var2.bridge$isSuggestionOverlayVisible()) {
               float var3 = 2.0F;
               float var4 = var2.bridge$getHeight() - 16 - 20;
               double var5 = var1.RRRCORIOCCCIOIIHRRCRHIHOROHRCR().ICORIROICCORCRROCRCIRRRHHHOOIR();
               double var7 = var1.RRRCORIOCCCIOIIHRRCRHIHOROHRCR().OICOHRRRRCOICCHOIOROHOCOORCHII();
               ArrayList var9 = new ArrayList<>(this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.values());

               for (int var10 = var9.size() - 1; var10 >= 0; var10--) {
                  com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var9.get(
                     var10
                  );
                  if (var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var4, var5, var7)) {
                     var1.setCancelled(true);
                     if (var1.OOHCRRRICCHRROOHIHHIORHICHHHHI() != 0) {
                        return;
                     }

                     if (var11.getRunCommand() != null) {
                        com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
                        com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                           this.getId(), var11.getRunCommand()
                        );
                     } else if (var11.getOpenUrl() != null) {
                        com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
                        com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR(
                           this.getId(), var11.getOpenUrl()
                        );
                     } else if (var11.getClientAction() != null) {
                        com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
                        com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           this.getId(), var11.getClientAction()
                        );
                     }

                     return;
                  }
               }
            }
         }
      }
   }

   public boolean CRRHROCCRRCHROHHICCIHRCOIHIROR() {
      return this.isEnabled()
         && !this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI.isEmpty()
         && this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen()) != null;
   }

   @Nullable
   private HICHRCOHCCRHOHCICOOCHOIHCCHIRI OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var1
   ) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .OHCRRRCHHCHRRIRIORRRIRIHORHRIO()
         .get()) {
         return null;
      } else {
         return var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2
               && !var2.bridge$isBedChat()
            ? var2
            : null;
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3
   ) {
      int var4 = Math.round(var2);
      int var5 = Math.round(var3);
      int var6 = var4 + 320;
      int var7 = var5 + 20;
      int var8 = -43691;
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var6, var5 + 1, var8);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var7 - 1, var6, var7, var8);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5 + 1, var4 + 1, var7 - 1, var8);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6 - 1, var5 + 1, var6, var7 - 1, var8);
   }
}
