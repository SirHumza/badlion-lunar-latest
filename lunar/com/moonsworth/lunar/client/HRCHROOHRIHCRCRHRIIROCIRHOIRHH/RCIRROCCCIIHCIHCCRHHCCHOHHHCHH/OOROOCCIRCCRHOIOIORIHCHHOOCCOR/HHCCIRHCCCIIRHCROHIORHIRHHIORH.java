package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private String channel;
   private byte[] data;

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = var0.bridge$id();
      String var2 = var1.bridge$getPath();
      if (!var1.bridge$getDomain().equals("minecraft")) {
         var2 = var1.bridge$getDomain() + ":" + var1.bridge$getPath();
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = var0.bridge$getBufferData();
      byte[] var4 = new byte[var3.bridge$readableBytes()];
      var3.bridge$readBytes(var4);
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var4);
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, byte[] var2) {
      this.channel = var1;
      this.data = var2;
   }

   @Generated
   public String HIOCCRHOROOHCHHHICHOCRCIHHOHOR() {
      return this.channel;
   }

   @Generated
   public byte[] getData() {
      return this.data;
   }
}
