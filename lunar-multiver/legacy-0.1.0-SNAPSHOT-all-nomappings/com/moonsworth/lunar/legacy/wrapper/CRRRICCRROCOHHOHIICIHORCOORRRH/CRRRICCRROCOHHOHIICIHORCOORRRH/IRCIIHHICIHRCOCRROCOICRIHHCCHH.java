package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import io.netty.channel.SimpleChannelInboundHandler;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.NetworkManager_v1_12;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.NetworkManager_v1_8;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static SimpleChannelInboundHandler OOORHIHCCRIHRRROHIROOHRCOIHIHI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      } else {
         return (SimpleChannelInboundHandler)(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH()
            : new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   public static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends NetworkManager_v1_8 {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(EnumPacketDirection.SERVERBOUND);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends NetworkManager_v1_7 {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends NetworkManager_v1_12 {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(EnumPacketDirection.SERVERBOUND);
      }
   }
}
