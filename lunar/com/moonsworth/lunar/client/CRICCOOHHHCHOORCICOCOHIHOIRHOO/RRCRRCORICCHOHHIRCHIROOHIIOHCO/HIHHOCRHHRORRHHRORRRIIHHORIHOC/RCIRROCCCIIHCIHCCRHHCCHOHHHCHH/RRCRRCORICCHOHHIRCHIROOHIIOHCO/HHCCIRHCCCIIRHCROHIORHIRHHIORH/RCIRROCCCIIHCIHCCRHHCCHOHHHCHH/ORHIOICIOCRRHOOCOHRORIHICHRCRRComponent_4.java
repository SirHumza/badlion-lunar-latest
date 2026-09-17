package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   hz22050(22050),
   hz32000(32000),
   hz44100(44100),
   hz48000(48000),
   hz88200(88200),
   hz96000(96000);

   private final int frequency;

   @Override
   public String id() {
      return String.valueOf(this.frequency);
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH valueOf(int var0) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
         if (var4.frequency == var0) {
            return var4;
         }
      }

      return null;
   }

   @Override
   public String toString() {
      return this.frequency + " Hz";
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var3) {
      this.frequency = var3;
   }

   @Generated
   public int getFrequency() {
      return this.frequency;
   }
}
