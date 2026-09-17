package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import java.util.UUID;
import lombok.Generated;

public enum RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   NETWORK("levelHeadSourceNetwork", "NETWORK", 25, 50),
   BEDWARS("levelHeadSourceBedWars", "BEDWARS", 25, 50),
   SKYWARS("levelHeadSourceSkyWars", "SKYWARS", 12, 30);

   private final String id;
   private final String queryParam;
   private final int randomLevelMin;
   private final int randomLevelMax;
   private String nametagPrefix;

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var3, String var4, int var5, int var6) {
      this.id = var3;
      this.queryParam = var4;
      this.randomLevelMin = var5;
      this.randomLevelMax = var6;
      this.updateNametagPrefixLang();
   }

   public void updateNametagPrefixLang() {
      this.nametagPrefix = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("settings", this.id + "Prefix");
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   public int generateRandomLevelForNicked(UUID var1) {
      int var2 = this.randomLevelMax - this.randomLevelMin;
      return this.randomFromUuid(var1, var2) + this.randomLevelMin;
   }

   private int randomFromUuid(UUID var1, int var2) {
      long var3 = var1.getMostSignificantBits() ^ var1.getLeastSignificantBits();
      var3 = var3 < 0L ? -var3 : var3;
      return (int)(var3 % var2);
   }

   @Generated
   public String getQueryParam() {
      return this.queryParam;
   }

   @Generated
   public String getNametagPrefix() {
      return this.nametagPrefix;
   }
}
