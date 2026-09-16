package com.moonsworth.lunar.legacy.wrapper.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.base.Preconditions;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH,
   RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final String CCORORCOHHHOIRHOOCIOIHOIIRRRRH;
   private int color;
   private boolean cancelExit;
   private boolean cancelEntry;
   private boolean CCCIICCRIRIRHOHHIHRCOHICOOHCOI;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIROCOIRRHOCIHICHRHROCCROCCCIO;
   private final List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HIRRIICCORCIOIHRIROHRRHCOCICRI = new ArrayList<>(
      4
   );

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, int var2) {
      this.CCORORCOHHHOIRHOOCIOIHOIIRRRRH = var1;
      this.color = var2;
   }

   public boolean isStatic() {
      return this.CIROCOIRRHOCIHICHRHROCCROCCCIO != null;
   }

   @Override
   public void setTransition(double var1, double var3, long var5) {
      Preconditions.checkArgument(!this.isStatic(), "Cannot transition static border");
      super.setTransition(var1, var3, var5);
   }

   @Override
   public void COIOORHCRHCRCOROOHCHIRRIIOIOHR(double var1) {
      super.COIOORHCRHCRCOROOHCHIRRIIOIOHR(var1);
   }

   @Override
   public double minX() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMinX() : super.minX();
   }

   @Override
   public double minZ() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMinZ() : super.minZ();
   }

   @Override
   public double maxX() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMaxX() : super.maxX();
   }

   @Override
   public double maxZ() {
      return this.isStatic() ? this.CIROCOIRRHOCIHICHRHROCCROCCCIO.bridge$getMaxZ() : super.maxZ();
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCCRHRORCCCCHHRCIORHOCHOCCRHRC() {
      if (!this.HIRRIICCORCIOIHRIROHRRHCOCICRI.isEmpty() && this.isStatic()) {
         return this.HIRRIICCORCIOIHRIROHRRHCOCICRI;
      }

      double var1 = this.minX();
      double var3 = this.minZ();
      double var5 = this.maxX();
      double var7 = this.maxZ();
      this.HIRRIICCORCIOIHRIROHRRHCOCICRI.clear();
      this.HIRRIICCORCIOIHRIROHRRHCOCICRI
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var1, -2.1474836E9F, var3, var5, 2.147483647E9, var3)
            )
         );
      this.HIRRIICCORCIOIHRIROHRRHCOCICRI
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var1, -2.1474836E9F, var3, var1, 2.147483647E9, var7)
            )
         );
      this.HIRRIICCORCIOIHRIROHRRHCOCICRI
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var5, -2.1474836E9F, var3, var5, 2.147483647E9, var7)
            )
         );
      this.HIRRIICCORCIOIHRIROHRRHCOCICRI
         .add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new AxisAlignedBB(var1, -2.1474836E9F, var7, var5, 2.147483647E9, var7)
            )
         );
      return this.HIRRIICCORCIOIHRIROHRRHCOCICRI;
   }

   public boolean shouldRender() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HRICIORORHCRHCCCIIIHRRHCICOHOR(this.CCORORCOHHHOIRHOOCIOIHOIIRRRRH);
   }

   @Override
   public boolean contains(double var1, double var3) {
      return super.contains(var1, var3);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, double var3, double var5, double var7, int var9) {
      double var10 = (var5 - var1) / 2.0;
      double var12 = (var7 - var3) / 2.0;
      double var14 = var10 + var12;
      if (var9 != 0 && this.CCCIICCRIRIRHOHHIHRCOHICOOHCOI) {
         this.setTransition(this.getDiameter(), var14, var9 * 50L);
      } else {
         this.COIOORHCRHCRCOROOHCHIRRIIOIOHR(var14);
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(double var1, double var3) {
      this.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var1, var3);
   }

   public double RORIRRHCCIORHCHHIOROHCHHRHIRRR() {
      return this.getCenterX();
   }

   public double OOHHRIOIRIHRHHOCCCCCIHIHCCOOIH() {
      return this.IIHOOIHRIICCRRRCCIIOIIHIRRIICC();
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(double var1) {
      this.COIOORHCRHCRCOROOHCHIRRIIOIOHR(var1);
   }

   public double RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Entity)var1);
   }

   public double CRRRICCRROCOHHOHIICIHORCOORRRH(double var1, double var3) {
      return this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var1, var3);
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
      return this.CCORORCOHHHOIRHOOCIOIHOIIRRRRH;
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
      return this.HIRRIICCORCIOIHRIROHRRHCOCICRI;
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
