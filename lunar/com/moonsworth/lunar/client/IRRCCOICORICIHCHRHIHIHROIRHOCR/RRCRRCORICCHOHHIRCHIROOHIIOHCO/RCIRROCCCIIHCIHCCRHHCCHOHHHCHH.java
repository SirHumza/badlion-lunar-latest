package com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.util.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import javax.annotation.Nullable;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

@RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @SerializedName("server")
   @NotNull
   public final String IHRRHOIOOCRCCCRHCOIORCRHHHOOHC;
   @SerializedName("gametype")
   @NotNull
   public final String HRCOCIRHOIRHCHRCOHHIROHIORRRIH;
   @Nullable
   @SerializedName("mode")
   public final String CIOCCCICHORIOIRROOOCCCRHHORRRI;
   @Nullable
   @SerializedName("map")
   public final String CHCCORCICOHOCHICRHIRORIORHOICC;
   @Nullable
   @SerializedName("lobbyname")
   public final String IIRHOORIIRHOIRHHIROICCHROHHHHR;
   @SerializedName("skyBlockLocation")
   @NotNull
   public final CRRRICCRROCOHHOHIICIHORCOORRRH CRIRCOIIOHIIOORRCIHOROHCOROCOO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      this.IHRRHOIOOCRCCCRHCOIORCRHHHOOHC = var1.server;
      this.HRCOCIRHOIRHCHRCOHHIROHIORRRIH = var1.HRCOCIRHOIRHCHRCOHHIROHIORRRIH;
      this.CIOCCCICHORIOIRROOOCCCRHHORRRI = var1.mode;
      this.CHCCORCICOHOCHICRHIRORIORHOICC = var1.IHRHHHCRHIIIIROOOCHICOHRIRRCHI;
      this.IIRHOORIIRHOIRHHIROICCHROHHHHR = var1.IIRHOORIIRHOIRHHIROICCHROHHHHR;
      this.CRIRCOIIOHIIOORRCIHOROHCOROCOO = var2;
   }

   public boolean CHICHOOHORHIRICCCRHCHCIOHOCHHI() {
      return this.IIRHOORIIRHOIRHHIROICCHROHHHHR != null;
   }

   public boolean CHIOCRCHIHICOHCOHCHIRORRIOCIRH() {
      return this.IHRRHOIOOCRCCCRHCOIORCRHHHOOHC.isEmpty() && this.HRCOCIRHOIRHCHRCOHHIROHIORRRIH.isEmpty();
   }

   @Generated
   @Override
   public String toString() {
      return "HypixelLocation(server="
         + this.IHRRHOIOOCRCCCRHCOIORCRHHHOOHC
         + ", gametype="
         + this.HRCOCIRHOIRHCHRCOHHIROHIORRRIH
         + ", mode="
         + this.CIOCCCICHORIOIRROOOCCCRHHORRRI
         + ", map="
         + this.CHCCORCICOHOCHICRHIRORIORHOICC
         + ", lobbyname="
         + this.IIRHOORIIRHOIRHHIROICCHROHHHHR
         + ", skyBlockLocation="
         + this.CRIRCOIIOHIIOORRCIHOROHCOROCOO
         + ")";
   }
}
