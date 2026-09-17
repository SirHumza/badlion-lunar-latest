package com.moonsworth.lunar.client.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.lunarclient.gameipc.promotion.v1.PromotionType;
import com.lunarclient.websocket.promotion.v1.PendingReward;
import com.lunarclient.websocket.promotion.v1.PendingRewardType;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<PromotionType>
   implements HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH HCCOHIIRRIIICROIOOCHOHCRHIORCR = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private List<PendingReward> CROHOHIOHHCOIICCORRIORCORIICHI = ImmutableList.of();
   private List<PromotionType> OCOHIIROCOCRHRIRHRCIHIHCCOHIHO = ImmutableList.of();

   @Override
   protected Set<PromotionType> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      return new HashSet<>();
   }

   public void RICHHRCCHRIICHROOROCCICOIRRHCR(List<PendingReward> var1) {
      if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PENDING_REWARDS.isEnabled()) {
         this.CROHOHIOHHCOIICCORRIORCORIICHI = var1;
         JsonArray var2 = new JsonArray();
         JsonFormat.Printer var3 = JsonFormat.printer();

         for (PendingReward var5 : var1) {
            try {
               String var6 = var3.print(var5);
               var2.add(JsonParser.parseString(var6));
            } catch (InvalidProtocolBufferException var7) {
               throw new RuntimeException(var7);
            }
         }

         this.HCCOHIIRRIIICROIOOCHOHCRHIORCR.IIHRRHORCRCROCHHOHORCHCROCIHRO("pendingRewards", var2);
      }
   }

   public void IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH(List<PromotionType> var1) {
      this.OCOHIIROCOCRHRIRHRCIHIHCCOHIHO.forEach(this.OHHRCRIOOCIORORHIOHRICRHHORCIH()::remove);
      this.OCOHIIROCOCRHRIRHRCIHIHCCOHIHO = var1;
      this.OCOHIIROCOCRHRIRHRCIHIHCCOHIHO.forEach(this.OHHRCRIOOCIORORHIOHRICRHHORCIH()::add);
      this.ICRRCOIOIOICHCIIHRRCCCRRCOCHRH();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PendingRewardType var1) {
      ArrayList var2 = new ArrayList<>(List.copyOf(this.CROHOHIOHHCOIICCORRIORCORIICHI));
      var2.removeIf(var1x -> var1x.getType() == var1);
      this.RICHHRCCHRIICHROOROCCICOIRRHCR(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PromotionType var1) {
      if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GAME_PROMOTION_CTA
         .isEnabled()) {
         this.OHHRCRIOOCIORORHIOHRICRHHORCIH().add(var1);
         this.ICRRCOIOIOICHCIIHRRCCCRRCOCHRH();
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(PromotionType var1) {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().remove(var1);
      this.ICRRCOIOIOICHCIIHRRCCCRRCOCHRH();
   }

   private void ICRRCOIOIOICHCIIHRRCCCRRCOCHRH() {
      JsonArray var1 = new JsonArray();

      for (PromotionType var3 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         var1.add(var3.name());
      }

      this.HCCOHIIRRIIICROIOOCHOHCRHIORCR.IIHRRHORCRCROCHHOHORCHCROCIHRO("promotions", var1);
   }

   @Generated
   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.HCCOHIIRRIIICROIOOCHOHCRHIORCR;
   }

   @Generated
   public List<PendingReward> CRRHIHOCHRCRCRCOROCCIHHHOORHIC() {
      return this.CROHOHIOHHCOIICCORRIORCORIICHI;
   }
}
