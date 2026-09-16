package com.moonsworth.lunar.legacy.wrapper.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.border.WorldBorder;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends WorldBorder
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final String CCICCRIIHOCRHRCOHIHRCCCICIRHHI;
   private int color;
   private boolean cancelExit;
   private boolean cancelEntry;
   private boolean CCCIICCRIRIRHOHHIHRCOHICOOHCOI;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIROCOIRRHOCIHICHRHROCCROCCCIO;
   private final List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CRCCROCROIOOIHHHHOHIHIHRCHCCOC = new ArrayList<>(
      4
   );

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2) {
      this.CCICCRIIHOCRHRCOHIHRCCCICIRHHI = var1;
      this.color = var2;
      this.addListener(new IRCIIHHICIHRCOCRROCOICRIHHCCHH());
   }

   public boolean isStatic() {
      return this.CIROCOIRRHOCIHICHRHROCCROCCCIO != null;
   }

   public void setTransition(double var1, double var3, long var5) {
      Preconditions.checkArgument(!this.isStatic(), "Cannot transition static border");
      super.setTransition(var1, var3, var5);
   }

   public double minX() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMinX() : super.minX();
   }

   public double minZ() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMinZ() : super.minZ();
   }

   public double maxX() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMaxX() : super.maxX();
   }

   public double maxZ() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMaxZ() : super.maxZ();
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCCRHRORCCCCHHRCIORHOCHOCCRHRC() {
      if (!this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC.isEmpty() && this.isStatic()) {
         return this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC;
      }

      double var1 = this.minX();
      double var3 = this.minZ();
      double var5 = this.maxX();
      double var7 = this.maxZ();
      this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC.clear();
      this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var1, -2.1474836E9F, var3, var5, 2.147483647E9, var3)
            )
         );
      this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var1, -2.1474836E9F, var3, var1, 2.147483647E9, var7)
            )
         );
      this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var5, -2.1474836E9F, var3, var5, 2.147483647E9, var7)
            )
         );
      this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var1, -2.1474836E9F, var7, var5, 2.147483647E9, var7)
            )
         );
      return this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC;
   }

   public boolean shouldRender() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HRICIORORHCRHCCCIIIHRRHCICOHOR(this.CCICCRIIHOCRHRCOHIHRCCCICIRHHI);
   }

   public boolean contains(double var1, double var3) {
      return this.contains(new BlockPos(var1, 100.0, var3));
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, double var3, double var5, double var7, int var9) {
      double var10 = (var5 - var1) / 2.0;
      double var12 = (var7 - var3) / 2.0;
      double var14 = var10 + var12;
      if (var9 != 0 && this.CCCIICCRIRIRHOHHIHRCOHICOOHCOI) {
         this.setTransition(this.getDiameter(), var14, var9 * 50L);
      } else {
         this.setTransition(var14);
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(double var1) {
      this.setTransition(var1);
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(double var1, double var3) {
      this.setCenter(var1, var3);
   }

   public double RORIRRHCCIORHCHHIOROHCHHRHIRRR() {
      return this.getCenterX();
   }

   public double OOHHRIOIRIHRHHOCCCCCIHIHCCOOIH() {
      return this.getCenterZ();
   }

   public double RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this.getClosestDistance((Entity)var1);
   }

   public double CRRRICCRROCOHHOHIICIHORCOORRRH(double var1, double var3) {
      return this.getClosestDistance(var1, var3);
   }

   public double IHOIOOCOIHCOICCHCROOCHOIRORHHH() {
      return this.minX();
   }

   public double IRIHOCHHIIOCRROOHRRCCOOCCCIOOR() {
      return this.minZ();
   }

   public double HORIHOCOIORHOOROIROICICICRHHHR() {
      return this.maxX();
   }

   public double CHCICOOHOICHHROOIRICCHHHHOHIOR() {
      return this.maxZ();
   }

   @Generated
   public String getWorld() {
      return this.CCICCRIIHOCRHRCOHIHRCCCICIRHHI;
   }

   @Generated
   public int getColor() {
      return this.color;
   }

   @Generated
   public boolean isCancelExit() {
      return this.cancelExit;
   }

   @Generated
   public boolean isCancelEntry() {
      return this.cancelEntry;
   }

   @Generated
   public boolean RHRCROHCICCIOCHORIIOOHCRRHROCR() {
      return this.CCCIICCRIRIRHOHHIHRCOHICOOHCOI;
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHOCCHRRICROOOOHRIHIHIOCHIRHRH() {
      return this.CIROCOIRRHOCIHICHRHROCCROCCCIO;
   }

   @Generated
   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RRHCOORROORICOCRRHORRIICRCRRRH() {
      return this.CRCCROCROIOOIHHHHOHIHIHRCHCCOC;
   }

   @Generated
   public void CORCOCICIRIOHROHROIIOOHICCHCRR(int var1) {
      this.color = var1;
   }

   @Generated
   public void HHRIICOIOORCHCOIICOOIHIRHHICRI(boolean var1) {
      this.cancelExit = var1;
   }

   @Generated
   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(boolean var1) {
      this.cancelEntry = var1;
   }

   @Generated
   public void ORHIOICIOCRRHOOCOHRORIHICHRCRR(boolean var1) {
      this.CCCIICCRIRIRHOHHIHRCOHICOOHCOI = var1;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.CIROCOIRRHOCIHICHRHROCCROCCCIO = var1;
   }
}
