package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.network.play.server.SPacketEntity;
import net.minecraft.network.play.server.SPacketEntity.S15PacketEntityRelMove;
import net.minecraft.network.play.server.SPacketEntity.S17PacketEntityLookMove;

public class CIOHHCORHRCCRICCCORIHCRHCCCRRR
   extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR {
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var1
   ) {
      super(SPacketEntity.class, var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Supplier<Object[]> var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      Object var3 = null;
      if (var2 instanceof S15PacketEntityRelMove) {
         var3 = new S15PacketEntityRelMove();
      }

      if (var2 instanceof S17PacketEntityLookMove) {
         var3 = new S17PacketEntityLookMove();
      }

      if (var3 == null) {
         return null;
      }

      SPacketEntity var4 = (SPacketEntity)var2;
      ((SPacketEntity)var3).entityId = var4.entityId;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         ((SPacketEntity)var3).field_149072_b$v1_7 = (byte)(-var4.field_149072_b$v1_7);
         ((SPacketEntity)var3).field_149073_c$v1_7 = (byte)(-var4.field_149073_c$v1_7);
         ((SPacketEntity)var3).field_149070_d$v1_7 = (byte)(-var4.field_149070_d$v1_7);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         ((SPacketEntity)var3).posX$v1_8 = (byte)(-var4.posX$v1_8);
         ((SPacketEntity)var3).posY$v1_8 = (byte)(-var4.posY$v1_8);
         ((SPacketEntity)var3).posZ$v1_8 = (byte)(-var4.posZ$v1_8);
      } else {
         ((SPacketEntity)var3).posX$v1_12 = (byte)(-var4.posX$v1_12);
         ((SPacketEntity)var3).posY$v1_12 = (byte)(-var4.posY$v1_12);
         ((SPacketEntity)var3).posZ$v1_12 = (byte)(-var4.posZ$v1_12);
      }

      ((SPacketEntity)var3).yaw = (byte)(-var4.yaw);
      ((SPacketEntity)var3).pitch = (byte)(-var4.pitch);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         ((SPacketEntity)var3).onGround$v1_8 = var4.onGround$v1_8;
      }

      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3;
   }
}
