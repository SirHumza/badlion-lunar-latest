package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   SMALL("crosshairGridSmall", 7),
   MEDIUM("crosshairGridMedium", 15),
   BIG("crosshairGridBig", 31),
   HUGE("crosshairGridHuge", 63);

   private final String id;
   private final int gridSize;

   public static com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromGridLength(
      int var0
   ) {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
         if (var0 <= var4.gridSize) {
            return var4;
         }
      }

      throw new IllegalArgumentException(String.format("Invalid crosshair grid %d * %d", var0, var0));
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   public int size() {
      return this.gridSize;
   }

   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH smaller() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1 = values();
      int var2 = Math.max(0, this.ordinal() - 1);
      return var1[var2];
   }

   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bigger() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1 = values();
      int var2 = Math.min(var1.length - 1, this.ordinal() + 1);
      return var1[var2];
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, int var4) {
      this.id = var3;
      this.gridSize = var4;
   }
}
