package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import java.util.Locale;
import lombok.Generated;
import org.apache.commons.lang3.text.WordUtils;

public enum CORCOCICIRIOHROHROIIOOHICCHCRR implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   ALWAYS("always"),
   SKYBLOCK_ONLY("skyBlockOnly"),
   NEVER("never");

   private final String id;

   @Override
   public String id() {
      return WordUtils.capitalize(this.name().toLowerCase(Locale.ROOT).replace("_", " "));
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   CORCOCICIRIOHROHROIIOOHICCHCRR(String var3) {
      this.id = var3;
   }
}
