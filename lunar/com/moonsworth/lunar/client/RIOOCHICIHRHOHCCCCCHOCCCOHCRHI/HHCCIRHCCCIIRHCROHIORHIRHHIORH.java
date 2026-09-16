package com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import mchorse.emoticons.morph.Morph;
import mchorse.emoticons.morph.MorphConfiguration;
import mchorse.emoticons.morph.MorphEntry;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final int IHOCICIRHOICCHICOORORCRHHCCRIH;
   private final List<Morph> morphs;
   private final Map<Morph, HRCHROOHRIHCRCRHRIIROCIRHOIRHH> OORHCIORORHOHHROIRROHIIOIHRCHH;
   private int time;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(MorphConfiguration var1, String var2, int var3) {
      MorphEntry var4 = (MorphEntry)var1.morphs().get(var2);
      if (var4 == null) {
         throw new IllegalArgumentException("No morph is available with name " + var2 + " in the morph configuration.");
      }

      this.IHOCICIRHOICCHICOORORCRHHCCRIH = var3;
      this.morphs = Collections.unmodifiableList(var4.getMorphs());
      this.OORHCIORORHOHHROIRROHIIOIHRCHH = new HashMap<>();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var2
   ) {
      if (this.morphs == null) {
         this.OORHCIORORHOHHROIRROHIIOIHRCHH.clear();
      } else {
         for (Morph var4 : this.morphs) {
            Objects.requireNonNull(var4);
            boolean var5 = var1 >= var4.getStart() && var1 < var4.getLength() + var4.getStart();
            if (!var5) {
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH var6 = this.OORHCIORORHOHHROIRROHIIOIHRCHH.get(var4);
               if (var6 != null) {
                  var6.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR();
                  if (!var6.CRICCIOICHOOOOCOHROROORIORHRHI()) {
                     this.OORHCIORORHOHHROIRROHIIOIHRCHH.remove(var4);
                  }
               }
            } else {
               this.OORHCIORORHOHHROIRROHIIOIHRCHH
                  .computeIfAbsent(var4, var2x -> Objects.requireNonNull(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2)));
            }
         }
      }
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(Consumer<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1) {
      this.OORHCIORORHOHHROIRROHIIOIHRCHH.values().forEach(var1);
   }

   public boolean OIRCHHRRCCROHIOROCRCCIIIHHOCHC() {
      return !this.OORHCIORORHOHHROIRROHIIOIHRCHH.isEmpty();
   }

   public void update(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.time++, var1);
      this.time = this.time % this.IHOCICIRHOICCHICOORORCRHHCCRIH;
   }
}
