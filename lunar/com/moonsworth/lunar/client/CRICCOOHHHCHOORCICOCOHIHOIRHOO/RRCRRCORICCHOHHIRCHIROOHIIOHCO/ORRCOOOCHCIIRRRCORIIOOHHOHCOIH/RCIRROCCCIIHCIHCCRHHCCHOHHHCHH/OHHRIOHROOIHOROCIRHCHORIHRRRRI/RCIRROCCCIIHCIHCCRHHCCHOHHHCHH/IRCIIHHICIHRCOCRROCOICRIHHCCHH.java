package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import javax.annotation.Nullable;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final String HIHHHHIORROHHCOCHOROIRRIRROCCH;
   private final Component HCORIHIRHOCCOIOHCCCCROIHHOIOOO;
   private final String OROOCCICIRIIIOOOHIOOIRRIHCRIOC;
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH CRHHORCRHCCICIHHCCOROHIOOCHICC;
   private boolean completed;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Component var2, String var3, HHCCIRHCCCIIRHCROHIORHIRHHIORH var4, boolean var5) {
      this.HIHHHHIORROHHCOCHOROIRRIRROCCH = var1;
      this.HCORIHIRHOCCOIOHCCCCROIHHOIOOO = var2;
      this.OROOCCICIRIIIOOOHIOOIRRIHCRIOC = var3;
      this.CRHHORCRHCCICIHHCCOROHIOOCHICC = var4;
      this.completed = var5;
   }

   public boolean hasDescription() {
      return !this.OROOCCICIRIIIOOOHIOOIRRIHCRIOC.isEmpty();
   }

   @Nullable
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH OOCHRIIIRIHRRCRIORHCROIIHCRRIC(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         String var1 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(var0.bridge$getDisplayName()).trim();
         if (var1.isEmpty()) {
            return null;
         }

         HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = null;
         boolean var3 = false;
         TextComponent.Builder var4 = Component.text();
         StringBuilder var5 = new StringBuilder();

         for (Component var7 : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(
            var0
         )) {
            String var8 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var7)
               .trim();
            if (!var8.isEmpty()) {
               HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.fromLoreLine(var8);
               if (var9 != null) {
                  var2 = var9;
               } else if (!var8.equalsIgnoreCase("COMPLETE") && !var8.equalsIgnoreCase("INCOMPLETE")) {
                  if (!var5.isEmpty()) {
                     var4.append(Component.space());
                     var5.append(' ');
                  }

                  var4.append(var7);
                  var5.append(var8);
               } else {
                  var3 = var8.equalsIgnoreCase("COMPLETE");
               }
            }
         }

         return var2 == null ? null : new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var4.build(), var5.toString(), var2, var3);
      } else {
         return null;
      }
   }

   @Generated
   public String getName() {
      return this.HIHHHHIORROHHCOCHOROIRRIRROCCH;
   }

   @Generated
   public Component HIOIORCRHOHHORIIIOCIIORHCCHRIH() {
      return this.HCORIHIRHOCCOIOHCCCCROIHHOIOOO;
   }

   @Generated
   public String ORRROOICHICCCHRIRROHOROIOCOCHC() {
      return this.OROOCCICIRIIIOOOHIOOIRRIHCRIOC;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH getDifficulty() {
      return this.CRHHORCRHCCICIHHCCOROHIOOCHICC;
   }

   @Generated
   public boolean OROHIHCCRHRHOOHIOHHOICHIOHIOCO() {
      return this.completed;
   }

   @Generated
   public void OHIIIOHIRIRCCRRIOIICCHHIORRHOH(boolean var1) {
      this.completed = var1;
   }
}
