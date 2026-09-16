package com.github.trilarion.sound.vorbis.jcraft.jogg;

import java.util.logging.Logger;

public class Packet {
   private static final Logger LOG = Logger.getLogger(Packet.class.getName());
   public byte[] packet_base;
   public int packet;
   public int bytes;
   public int b_o_s;
   public int e_o_s;
   public long granulepos;
   public long packetno;
}
