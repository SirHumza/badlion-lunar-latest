package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;
import org.apache.commons.lang3.text.WordUtils;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   THIRD("thirdPerson", 1),
   FORWARD("forward", 2),
   FIRST("firstPerson", 0);

   private String id;
   private int perspective;

   @Override
   public String id() {
      return WordUtils.capitalize(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id));
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, int var4) {
      this.id = var3;
      this.perspective = var4;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public int getPerspective() {
      return this.perspective;
   }
}
