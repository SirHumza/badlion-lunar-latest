package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   MONO8(4352, 1, 1),
   MONO16(4353, 1, 2),
   STEREO8(4354, 2, 1),
   STEREO16(4355, 2, 2);

   private final int alFormat;
   private final int channels;
   private final int bytesPerSample;

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getFormat(int var0, int var1) {
      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : values()) {
         if (var5.channels == var0 && var5.bytesPerSample == var1) {
            return var5;
         }
      }

      throw new UnsupportedOperationException("Unsupported audio format with " + var0 + " channels and " + var1 + " bytes per sample.");
   }

   @Generated
   public int getAlFormat() {
      return this.alFormat;
   }

   @Generated
   public int getChannels() {
      return this.channels;
   }

   @Generated
   public int getBytesPerSample() {
      return this.bytesPerSample;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3, int var4, int var5) {
      this.alFormat = var3;
      this.channels = var4;
      this.bytesPerSample = var5;
   }
}
