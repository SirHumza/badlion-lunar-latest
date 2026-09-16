package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Packet {
   private final Runnable runnable;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1) {
      this.runnable = var1;
   }

   public void readPacketData(PacketBuffer var1) {
   }

   public void writePacketData(PacketBuffer var1) {
   }

   public void processPacket(INetHandler var1) {
      this.runnable.run();
   }
}
