package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI OHHOIHOCCCOOOCRRHHROROOHIOROHO;
   private double x;
   private double y;
   private double z;
   private List<Component> lines;
   private @Nullable Component OHORHOOIHCIIRHCCIRRIRHCCIIRHCO;

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(Component var1) {
      if (!this.lines.isEmpty() && this.OHORHOOIHCIIRHCCIRRIRHCCIIRHCO != null) {
         int var2 = Math.max(0, this.lines.indexOf(this.OHORHOOIHCIIRHCCIRRIRHCCIIRHCO));
         this.lines.set(var2, var1);
         this.OHORHOOIHCIIRHCCIRRIRHCCIIRHCO = var1;
      }
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI CCCHCRRRIRRHICOOIOCHCHRCRICHOC() {
      return this.OHHOIHOCCCOOOCRRHHROROOHIOROHO;
   }

   @Generated
   public double getX() {
      return this.x;
   }

   @Generated
   public double getY() {
      return this.y;
   }

   @Generated
   public double getZ() {
      return this.z;
   }

   @Generated
   public List<Component> getLines() {
      return this.lines;
   }

   @Generated
   public @Nullable Component CCROCCHOCHCIRCIHROHHICIHIICROH() {
      return this.OHORHOOIHCIIRHCCIRRIRHCCIIRHCO;
   }

   @Generated
   public IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      double var2,
      double var4,
      double var6,
      List<Component> var8,
      @Nullable Component var9
   ) {
      this.OHHOIHOCCCOOOCRRHHROROOHIOROHO = var1;
      this.x = var2;
      this.y = var4;
      this.z = var6;
      this.lines = var8;
      this.OHORHOOIHCIIRHCCIRRIRHCCIIRHCO = var9;
   }

   @Generated
   public void setX(double var1) {
      this.x = var1;
   }

   @Generated
   public void setY(double var1) {
      this.y = var1;
   }

   @Generated
   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(double var1) {
      this.z = var1;
   }

   @Generated
   public void RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(List<Component> var1) {
      this.lines = var1;
   }
}
