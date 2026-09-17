package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.websocket.serverdiscovery.v1.ServerGameType;

public record RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
   @SerializedName("name")
   private final String ORIHIHRRRHIOCORIRCIIIIIIRHHCHH;
   @SerializedName("icon")
   private final int OCOOOIHOORRCCHORRORIICOOCCOIHO;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, int var2) {
      this.ORIHIHRRRHIOCORIRCIIIIIIRHHCHH = var1;
      this.OCOOOIHOORRCCHORRORIICOOCCOIHO = var2;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerGameType var0) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0.getName(), ICOIRHOIORIIOIOHIOCRIIORHRRRRR(var0.getEmoji()));
   }

   static int ICOIRHOIORIIOIOHIOCRIIORHRRRRR(String var0) {
      try {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.valueOf(var0).ordinal();
      } catch (IllegalArgumentException var2) {
         return 0;
      }
   }

   @SerializedName("name")
   public String name() {
      return this.ORIHIHRRRHIOCORIRCIIIIIIRHHCHH;
   }

   @SerializedName("icon")
   public int HOHHHIOHRHROCRICIROHICICCORHRO() {
      return this.OCOOOIHOORRCCHORRORIICOOCCOIHO;
   }
}
