package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends InputStream {
   private final SeekableByteChannel OCHRRCHORCRROCHRIICRHIORIIORCI;
   private final ByteBuffer IRRCIOHOHCRICCIROOIOHOOICCHRHH = ByteBuffer.allocate(1);

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SeekableByteChannel var1) {
      this.OCHRRCHORCRROCHRIICRHIORIIORCI = var1;
   }

   @Override
   public int available() {
      return (int)Math.min(this.OCHRRCHORCRROCHRIICRHIORIIORCI.size() - this.OCHRRCHORCRROCHRIICRHIORIIORCI.position(), 2147483647L);
   }

   @Override
   public int read() {
      this.IRRCIOHOHCRICCIROOIOHOOICCHRHH.clear();
      int var1 = this.OCHRRCHORCRROCHRIICRHIORIIORCI.read(this.IRRCIOHOHCRICCIROOIOHOOICCHRHH);
      if (var1 == -1) {
         return -1;
      }

      this.IRRCIOHOHCRICCIROOIOHOOICCHRHH.flip();
      return this.IRRCIOHOHCRICCIROOIOHOOICCHRHH.get() & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      ByteBuffer var4 = ByteBuffer.wrap(var1, var2, var3);
      return this.OCHRRCHORCRROCHRIICRHIORIIORCI.read(var4);
   }

   @Override
   public void close() {
      this.OCHRRCHORCRROCHRIICRHIORIIORCI.close();
   }
}
