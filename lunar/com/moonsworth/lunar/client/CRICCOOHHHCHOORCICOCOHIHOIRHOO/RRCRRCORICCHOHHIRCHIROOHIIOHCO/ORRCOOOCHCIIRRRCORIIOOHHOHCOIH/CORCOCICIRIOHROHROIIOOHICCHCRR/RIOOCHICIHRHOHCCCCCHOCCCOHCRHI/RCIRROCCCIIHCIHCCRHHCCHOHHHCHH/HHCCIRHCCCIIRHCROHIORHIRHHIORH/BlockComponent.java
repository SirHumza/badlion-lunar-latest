package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import lombok.Generated;

public enum HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   FOUR_BY_FOUR(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(22, 22, 22, 22), 4, 4),
   FOUR_BY_FIVE(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(11, 11, 22, 22), 4, 5),
   FIVE_BY_FIVE(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(11, 11, 11, 11), 5, 5),
   FIVE_BY_SIX(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(5, 7, 16, 16), 5, 6),
   SIX_BY_FIVE(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(16, 16, 5, 7), 6, 5),
   SIX_BY_SIX(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(5, 7, 5, 7), 6, 6);

   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH mapMargins;
   private final int roomWidth;
   private final int roomHeight;
   private final int blockWidth;
   private final int blockHeight;

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3, int var4, int var5) {
      this.mapMargins = var3;
      this.roomWidth = var4;
      this.roomHeight = var5;
      this.blockWidth = var4 * 32 - 2;
      this.blockHeight = var5 * 32 - 2;
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH getByDungeonMap(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      if (var0 == null) {
         return null;
      }

      byte[] var1 = var0.bridge$getColors();
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var2 == 0 && var1[var4] == 30) {
            var2 = var4;
         } else if (var2 != 0 && var1[var4] == 0) {
            var3 = var4 - var2;
            break;
         }
      }

      int var6 = var2 % 128;
      int var5 = var2 / 128;
      if (var3 == 18) {
         if (var6 % 2 == 0) {
            return var5 % 2 == 0 ? FOUR_BY_FOUR : FOUR_BY_FIVE;
         } else {
            return var5 % 2 == 0 ? null : FIVE_BY_FIVE;
         }
      } else if (var3 == 16) {
         if (var6 % 2 == 0) {
            return var5 % 2 == 0 ? null : FIVE_BY_SIX;
         } else {
            return var5 % 2 == 0 ? SIX_BY_FIVE : SIX_BY_SIX;
         }
      } else {
         return null;
      }
   }

   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getMapMargins() {
      return this.mapMargins;
   }

   @Generated
   public int getRoomWidth() {
      return this.roomWidth;
   }

   @Generated
   public int getRoomHeight() {
      return this.roomHeight;
   }

   @Generated
   public int getBlockWidth() {
      return this.blockWidth;
   }

   @Generated
   public int getBlockHeight() {
      return this.blockHeight;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final int top;
      private final int RIHOCRROROHROCRROOHICOCCCIHICO;
      private final int left;
      private final int OOOHIHRHIOHIOCIHHHRCCROOOCHHHI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3, int var4) {
         this.top = var1;
         this.RIHOCRROROHROCRROOHICOCCCIHICO = var2;
         this.left = var3;
         this.OOOHIHRHIOHIOCIHHHRCCROOOCHHHI = var4;
      }

      public int CRHIRIHIRHRCCHOOOOIOCHHORRHOCH() {
         return this.top;
      }

      public int RROHHORCIRICHOHHHCOCHRRHCIRHRH() {
         return this.RIHOCRROROHROCRROOHICOCCCIHICO;
      }

      public int HOIROCIOCICRRHICCCRCOCCRICIOCO() {
         return this.left;
      }

      public int RICOICRIORIHCRCRORCRCRHCRHCIRI() {
         return this.OOOHIHRHIOHIOCIHHHRCCROOOCHHHI;
      }
   }
}
