package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.border.v1.DisplayBorderMessage;
import com.lunarclient.apollo.border.v1.RemoveBorderMessage;
import com.lunarclient.apollo.border.v1.ResetBordersMessage;
import com.lunarclient.apollo.common.v1.Cuboid2D;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Set;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      super("border", "Border");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(DisplayBorderMessage.class, RemoveBorderMessage.class, ResetBordersMessage.class);
   }

   @Override
   protected void onEnable() {
      this.CIHCOCORRRORHOHRIHRCIOOIHRIHHR();
   }

   @Override
   protected void onDisable() {
      this.CIHCOCORRRORHOHRIHRCIOOIHRIHHR();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayBorderMessage.class,
         var0 -> {
            if (var0.hasBounds()) {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1x = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .RCROOHHCROORIIICHORIHRROIOOHHC();
               String var2 = var0.getId();
               Cuboid2D var3 = var0.getBounds();
               double var4 = var3.getMinX();
               double var6 = var3.getMinZ();
               double var8 = var3.getMaxX() + 1.0;
               double var10 = var3.getMaxZ() + 1.0;
               if (var4 > var8) {
                  double var12 = var4;
                  var4 = var8;
                  var8 = var12;
               }

               if (var6 > var10) {
                  double var25 = var6;
                  var6 = var10;
                  var10 = var25;
               }

               boolean var26 = var0.getCancelEntry();
               boolean var13 = var0.getCancelExit();
               boolean var14 = var0.getCanShrinkOrExpand();
               int var15 = var0.getColor().getColor();
               if (var1x.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().containsKey(var2)) {
                  var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4, var6, var8, var10, var0.getDurationTicks(), var26, var13, var15);
               } else {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH var16 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.getWorld(), var15);
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
                  int var18 = var17 == null ? 0 : var17.bridge$getMinBuildHeight();
                  int var19 = var17 == null ? 256 : var17.bridge$getMaxBuildHeight();
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var20 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var18, var6, var8, var19, var10);
                  double var21 = (var20.bridge$getMaxX() - var20.bridge$getMinX()) / 2.0;
                  double var23 = (var20.bridge$getMaxZ() - var20.bridge$getMinZ()) / 2.0;
                  var16.CRRRICCRROCOHHOHIICIHORCOORRRH(var21 + var23);
                  var16.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var20.bridge$getMinX() + var21, var20.bridge$getMinZ() + var23);
                  var16.IOIICIRIICICIIOORHCIIIIRRIHRHI(var26);
                  var16.HHRIICOIOORCHCOIICOOIHIRHHICRI(var13);
                  var16.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var14);
                  var16.CORCOCICIRIOHROHROIIOOHICCHCRR(var15);
                  if (!var14) {
                     var16.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var20);
                  }

                  var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var16);
               }
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RemoveBorderMessage.class,
         var0 -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .RCROOHHCROORIIICHORIHRROIOOHHC()
            .IOIIIIICOHIIHHIIOOHHIORIHRIHHH(var0.getId())
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetBordersMessage.class, var1x -> this.CIHCOCORRRORHOHRIHRCIOOIHRIHHR());
   }

   private void CIHCOCORRRORHOHRIHRCIOOIHRIHHR() {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().RCROOHHCROORIIICHORIHRROIOOHHC().clear();
   }
}
