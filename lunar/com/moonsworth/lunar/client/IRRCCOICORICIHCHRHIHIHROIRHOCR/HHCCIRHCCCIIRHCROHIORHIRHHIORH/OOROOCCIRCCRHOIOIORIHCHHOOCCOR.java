package com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.Collections;
import lombok.Generated;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private ImmutableList<Component> OIHRHOHOOIOHHOHHHICHORIHIOIHHI = ImmutableList.of();
   private ImmutableList<String> HRRROHHHIRCHIIIHHCRIICHOHOOCOO = ImmutableList.of();
   private ImmutableList<String> HHCIORIHCROHOIHICCOROCROHIHROR = ImmutableList.of();

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, this::CRRRICCRROCOHHOHIICIHORCOORRRH, 200);
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1) {
      ImmutableList var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.HHHCIHORICHROCOCRRRCCCICOCOORI());
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      UnmodifiableIterator var5 = var2.iterator();

      while (var5.hasNext()) {
         Component var6 = (Component)var5.next();
         var3.add(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var6));
         var4.add(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var6));
      }

      this.OIHRHOHOOIOHHOHHHICHORIHIOIHHI = var2;
      this.HRRROHHHIRCHIIIHHCRIICHOHOOCOO = ImmutableList.copyOf(var3);
      this.HHCIORIHCROHOIHICCOROCROHIHROR = ImmutableList.copyOf(var4);
   }

   private static ImmutableList<Component> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var0
   ) {
      ArrayList var1 = new ArrayList();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var0.bridge$getObjectiveInDisplaySlot(
         1
      );

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var0.bridge$getSortedScores(
         var2
      )) {
         String var6 = var5.bridge$getPlayerName();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = var0.bridge$getPlayersTeam(
            var6
         );
         if (var7 != null) {
            var1.add(var7.bridge$getPrefixAndSuffix());
         }
      }

      Collections.reverse(var1);
      return ImmutableList.copyOf(var1);
   }

   @Override
   protected void onEnable() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (var1 != null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.bridge$getScoreBoard();
         if (var2 != null) {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, () -> new IOIICIRIICICIIOORHCIIIIRRIHRHI(var2));
         }
      }
   }

   @Generated
   public ImmutableList<Component> IORHOIRCHCRCCIOORRCCIROIRORROO() {
      return this.OIHRHOHOOIOHHOHHHICHORIHIOIHHI;
   }

   @Generated
   public ImmutableList<String> IRHHRCCHCIOOOIRHHCHROHROHOHCII() {
      return this.HRRROHHHIRCHIIIHHCRIICHOHOOCOO;
   }

   @Generated
   public ImmutableList<String> OHHHIOIIROCIOOCHOCHRIOOCHHRRRI() {
      return this.HHCIORIHCROHOIHICCOROCROHIHROR;
   }
}
