package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   SMALL("small", 1),
   NORMAL("normal", 2),
   LARGE("large", 3),
   AUTO("auto", 4);

   private final String id;
   private final int scale;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, int var4) {
      this.id = var3;
      this.scale = var4;
   }

   @Generated
   public int getScale() {
      return this.scale;
   }
}
