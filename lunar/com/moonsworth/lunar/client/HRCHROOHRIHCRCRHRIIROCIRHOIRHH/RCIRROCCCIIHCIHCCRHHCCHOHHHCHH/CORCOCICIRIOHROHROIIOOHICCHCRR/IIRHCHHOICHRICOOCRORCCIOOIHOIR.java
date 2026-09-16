package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import lombok.Generated;
import org.joml.Vector3d;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC ORHRCOIICOCHRIOHRRHOOOHOHORRCI;
   private String category;
   private boolean HOHORIHCIHIOOIORHHIHHHOROCOCIR;
   float volume;
   float pitch;
   float ROORCICOORIIOIHHIHOHHRIICCIHRI;
   float COIRCHHOHRHRICOIRIHRIIHRCCRIOO;
   float IHRRHRRHRRRIIOOORHCRCCHOIHCCOI;

   public Vector3d ROOCCHRHHIIOICICHIIRRHCOCOCIHC() {
      return new Vector3d(this.ROORCICOORIIOIHHIHOHHRIICCIHRI, this.COIRCHHOHRHRICOIRIHRIIHRCCRIOO, this.IHRRHRRHRRRIIOOORHCRCCHOIHCCOI);
   }

   public String getPath() {
      return this.ORHRCOIICOCHRIOHRRHOOOHOHORRCI.bridge$getPath();
   }

   public boolean IRCRIHCRIRIRICRCRCROHORIROOOIO(String var1) {
      return this.getPath().equals(var1);
   }

   @Generated
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, String var2, boolean var3, float var4, float var5, float var6, float var7, float var8
   ) {
      this.ORHRCOIICOCHRIOHRRHOOOHOHORRCI = var1;
      this.category = var2;
      this.HOHORIHCIHIOOIORHHIHHHOROCOCIR = var3;
      this.volume = var4;
      this.pitch = var5;
      this.ROORCICOORIIOIHHIHOHHRIICCIHRI = var6;
      this.COIRCHHOHRHRICOIRIHRIIHRCCRIOO = var7;
      this.IHRRHRRHRRRIIOOORHCRCCHOIHCCOI = var8;
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC HOHHIHRHOHIIHRHCHHIRORRRCOIHCC() {
      return this.ORHRCOIICOCHRIOHRRHOOOHOHORRCI;
   }

   @Generated
   public String getCategory() {
      return this.category;
   }

   @Generated
   public boolean CHOIOCOIICHHRRIIRROOOHHHCHOCOR() {
      return this.HOHORIHCIHIOOIORHHIHHHOROCOCIR;
   }

   @Generated
   public float getVolume() {
      return this.volume;
   }

   @Generated
   public float getPitch() {
      return this.pitch;
   }

   @Generated
   public float HIIRCCHHCIHROHCRICCOCIHRRHCRIH() {
      return this.ROORCICOORIIOIHHIHOHHRIICCIHRI;
   }

   @Generated
   public float CICHIHIRRIRIICHCOCHIIOIIHRHROR() {
      return this.COIRCHHOHRHRICOIRIHRIIHRCCRIOO;
   }

   @Generated
   public float CIROCOHOCRHOHCCRIHIRHOICHRIRIR() {
      return this.IHRRHRRHRRRIIOOORHCRCCHOIHCCOI;
   }
}
