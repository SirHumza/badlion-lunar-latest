package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.conversation.v1.ConversationMessage;
import com.lunarclient.websocket.conversation.v1.ConversationReference;
import com.lunarclient.websocket.conversation.v1.ConversationSender;
import com.lunarclient.websocket.friend.v1.RemoveFriendRequest;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.HIHHOCRHHRORRHHRORRRIIHHORIHOC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH>
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH IICICRCOICOHOHCCIRCIRCOHHOCIIH = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private final Map<com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH, List<com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH>> ICICHCHCHHROOHOCIIHRRRIRIRHCHC = new ConcurrentHashMap<>();
   private final ConcurrentLinkedQueue<Pair<UUID, com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH>> RROCIOHIHCHRROHCRIIRICHHROHIHR = new ConcurrentLinkedQueue<>();

   @Override
   protected Set<com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      return new HashSet<>();
   }

   public com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCHORHIOORICCIRIHRIIHIICORIORO(UUID var1) {
      for (com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var3.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public boolean HRRHRCCOOIOIIIRORIOOORORHOORIH(UUID var1) {
      for (com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var3.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().add(var1);
      this.OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
   }

   public void OCIIROIOORRIOIIIRHIRRCCIIRRROH(UUID var1) {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().removeIf(var1x -> var1x.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1));
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1x -> var1x.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
               .removeFriend(
                  null,
                  RemoveFriendRequest.newBuilder().setFriendUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1)).build(),
                  var0x -> {}
               )
         );
      this.OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
   }

   public int HRHRORCIRICHCCCCCHICOOICIRHRIO(UUID var1) {
      AtomicInteger var2 = new AtomicInteger(0);
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.CCHORHIOORICCIRIHRIIHIICORIORO(var1);
      if (var3 != null && this.ICICHCHCHHROOHOCIIHRRRIRIRHCHC.containsKey(var3)) {
         int var4 = 0;

         for (com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var6 : this.ICICHCHCHHROOHOCIIHRRRIRIRHCHC.get(var3)) {
            if (!var6.HIOIHCRCIHHCIHIHRRCROICIRIIHCR()) {
               var4++;
            }
         }

         var2.addAndGet(var4);
      }

      return var2.get();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationReference var1, ConversationMessage var2) {
      if (var1.getTargetCase() == ConversationReference.TargetCase.FRIEND_UUID) {
         UUID var3 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getFriendUuid());
         com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.CCHORHIOORICCIRIHRIIHIICORIORO(var3);
         if (var4 != null) {
            if (var2.getSender().getSenderCase() == ConversationSender.SenderCase.PLAYER) {
               UUID var5 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getSender().getPlayer().getUuid());
               com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6;
               if (var5.equals(
                  com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                     .RROHIIOHORHICRHIHCCRRRHIHCHRCC()
                     .HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()
               )) {
                  var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().RROHIIOHORHICRHIHCCRRRHIHCHRCC();
               } else {
                  var6 = this.CCHORHIOORICCIRIHRIIHIICORIORO(var5);
               }

               if (var6 != null) {
                  com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var7 = new com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     var6, var2.getContents().getPlainText()
                  );
                  this.ICICHCHCHHROOHOCIIHRRRIRIRHCHC.computeIfAbsent(var4, var0 -> new CopyOnWriteArrayList<>()).add(0, var7);
                  this.RROCIOHIHCHRROHCRIIRICHHROHIHR.add(Pair.of(var3, var7));
                  if (var6 == com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().RROHIIOHORHICRHIHCCRRRHIHCHRCC()) {
                     var7.CRCHORHCICOCRCCHOOCICICRIOCOIC();
                  } else {
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var2.getContents().getPlainText());
                  }

                  this.OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
               }
            }
         }
      }
   }

   public List<com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return this.ICICHCHCHHROOHOCIIHRRRIRIRHCHC.get(var1);
   }

   public void clear() {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().clear();
      this.OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
   }

   public synchronized void OOHHCCRHIRCIHOIOCCIOCCORICCHCI() {
      this.HRRCIHRROHRHCRCHOROCCRRHHOROIO();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      float var2,
      float var3,
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(), var4.CCHCCIHCIORHHICRROIOHIHRHCHORH(), 1.0F);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      float var2,
      float var3,
      UUID var4,
      int var5,
      float var6
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, 6, var5, var6);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      float var2,
      float var3,
      UUID var4,
      int var5,
      int var6,
      float var7
   ) {
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         HIHHOCRHHRORRHHRORRRIIHHORIHOC.IOOCHIRHCRICHIHORCRCHCRHCICROH(var4),
         var5,
         var2 + 1.0F,
         var3 + 1.0F,
         com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(1.0F, 1.0F, 1.0F, var7)
      );
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1, var2 + 1.0F, var3 + 1.0F, var5 * 2, var5 * 2, 4.0F, var6
      );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      UUID var4,
      int var5,
      int var6,
      float var7
   ) {
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1, var2, var3, var5 * 2 + 2, var5 * 2 + 2, var6
      );
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         HIHHOCRHHRORRHHRORRRIIHHORIHOC.IOOCHIRHCRICHIHORCRCHCRHCICROH(var4),
         var5,
         var2 + 1.0F,
         var3 + 1.0F,
         com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(1.0F, 1.0F, 1.0F, var7)
      );
   }

   private void HRRCIHRROHRHCRCHOROCCRRHHOROIO() {
      this.IICICRCOICOHOHCCIRCIRCOHHOCIIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("friends", this.OHHRCRIOOCIORORHIOHRICRHHORCIH());
      JsonArray var1 = new JsonArray();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .OIICRCOIOOHOOHORCRCIOHRCOIIHIC()
         .OHHRCRIOOCIORORHIOHRICRHHORCIH()
         .forEach(var2 -> var1.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.provide(), true)));
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .OIICRCOIOOHOOHORCRCIOHRCOIIHIC()
         .RCHIOIOCHHRROIHHCRRRRCRIHCORHH()
         .forEach(var2 -> var1.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.provide(), false)));
      this.IICICRCOICOHOHCCIRCIRCOHHOCIIH.IIHRRHORCRCROCHHOHORCHCROCIHRO("friendRequests", var1);
   }

   private JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonElement var1, boolean var2) {
      var1.getAsJsonObject().addProperty("inboundRequest", var2);
      return var1;
   }

   @Override
   public JsonElement provide() {
      JsonArray var1 = new JsonArray();
      this.ICICHCHCHHROOHOCIIHRRRIRIRHCHC.forEach((var1x, var2) -> {
         for (com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var2) {
            var1.add(var4.provide());
         }
      });
      this.ICICHCHCHHROOHOCIIHRRRIRIRHCHC.clear();
      return var1;
   }

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      Pair var1 = this.RROCIOHIHCHRROHCRIIRICHHROHIHR.poll();
      if (var1 != null) {
         JsonArray var2 = new JsonArray();
         JsonObject var3 = ((com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1.second())
            .provide()
            .getAsJsonObject();
         var3.addProperty("to", ((UUID)var1.first()).toString());
         var2.add(var3);
         ((com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1.second()).CRCHORHCICOCRCCHOOCICICRIOCOIC();
         return var2;
      } else {
         return null;
      }
   }

   @com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(
      "friends"
   )
   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CHHOIIOICICROCOCIRRHORHRORICHO() {
      return this.IICICRCOICOHOHCCIRCIRCOHHOCIIH;
   }
}
