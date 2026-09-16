package com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.vecmath.Matrix4f;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;
import mchorse.emoticons.common.emotes.Emote;
import mchorse.emoticons.morph.Morph;
import mchorse.emoticons.morph.MorphConfiguration;
import mchorse.emoticons.morph.MorphEntry;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   private final MorphConfiguration COHHOOHCOCHHRRCCORICRCORRCHCOC;
   private MorphEntry RORIICRHIRIORIICRHCCROHCCCHHCH;
   private com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO ROHHRCRHROICORRORIRIOHRHHOHCHC;
   private int OOCHIRIROOICOCOOHHOHCICHRHIRHO;
   private List<Morph> morphs;
   private final Map<Morph, HRCHROOHRIHCRCRHRIIROCIRHOIRHH> OICOOOCHCRRIRCCOOCCCOICHRCHHHO;
   private final List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> IHOHIHCIHCRORIRHOCIOIIRRRHCOCH;
   private final List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(MorphConfiguration var1) {
      this.COHHOOHCOCHHRRCCORICRCORRCHCOC = var1;
      this.RORIICRHIRIORIICRHCCROHCCCHHCH = null;
      this.ROHHRCRHROICORRORIRIOHRHHOHCHC = null;
      this.OOCHIRIROOICOCOOHHOHCICHRHIRHO = Integer.MAX_VALUE;
      this.morphs = null;
      this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO = new HashMap<>();
      this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH = new ArrayList<>();
      this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO = new ArrayList<>();
   }

   private void reset() {
      this.morphs = null;
      this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.clear();
      this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.forEach(HRCHROOHRIHCRCRHRIIROCIRHOIRHH::ROHOCRIOIOHRICRRHCRCRRRIOCOCRR);
      this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.forEach(HRCHROOHRIHCRCRHRIIROCIRHOIRHH::ROHOCRIOIOHRICRRHCRCRRRIOCOCRR);
      this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.clear();
   }

   private void CROCOHCOIHHHCHOOHOOIHHHICHOHOI() {
      this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.values().forEach(var1 -> {
         var1.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR();
         this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.add(var1);
      });
      this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.clear();
      this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.forEach(var1 -> {
         var1.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR();
         this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.add(var1);
      });
      this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.clear();
      this.morphs = null;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var2
   ) {
      this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.removeIf(var0 -> !var0.CRICCIOICHOOOOCOHROROORIORHRHI());
      this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.removeIf(var0 -> !var0.CRICCIOICHOOOOCOHROROORIORHRHI());
      if (this.ROHHRCRHROICORRORIRIOHRHHOHCHC == null) {
         this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.clear();
      } else if (this.OOCHIRIROOICOCOOHHOHCICHRHIRHO != Integer.MAX_VALUE) {
         com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.ROHHRCRHROICORRORIRIOHRHHOHCHC);
         var3.running = true;
         var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
         var3.RRCICHROCCCCORRIHIORROCRCIRIRR.set(var2.bridge$getPosX(), var2.bridge$getPosY(), var2.bridge$getPosZ());
         this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.add(var3);
      }

      if (this.morphs == null) {
         this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.clear();
      } else {
         for (Morph var4 : this.morphs) {
            Objects.requireNonNull(var4);
            boolean var5 = var1 >= var4.getStart() && var1 < var4.getLength() + var4.getStart();
            if (!var5) {
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH var6 = this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.get(var4);
               if (var6 != null) {
                  var6.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR();
                  if (!var6.CRICCIOICHOOOOCOHROROORIORHRHI()) {
                     this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.remove(var4);
                  }
               }
            } else {
               this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO
                  .computeIfAbsent(var4, var2x -> Objects.requireNonNull(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2)));
            }
         }
      }
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(Consumer<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1) {
      this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.values().forEach(var1);
      this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.forEach(var1);
      this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.forEach(var1);
   }

   public boolean OIRCHHRRCCROHIOROCRCCIIIHHOCHC() {
      return !this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.isEmpty() || !this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.isEmpty() || !this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.isEmpty();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      EmoteController var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var2
   ) {
      Emote var3 = var1.getEmote();
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .CIOCCHHOHRIOIRHOHOORIOHRHCROOR()
         .get()) {
         var3 = null;
      }

      if (var3 == null) {
         this.OOCHIRIROOICOCOOHHOHCICHRHIRHO = Integer.MAX_VALUE;
         this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.forEach(HRCHROOHRIHCRCRHRIIROCIRHOIRHH::ROHOCRIOIOHRICRRHCRCRRRIOCOCRR);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Integer.MAX_VALUE, var2);
         if (this.IHOHIHCIHCRORIRHOCIOIIRRRHCOCH.isEmpty() && this.OICOOOCHCRRIRCCOOCCCOICHRCHHHO.isEmpty() && this.CHRCIOOHCIOOIRCHOIOOIIOHRCCCRO.isEmpty()) {
            this.morphs = null;
            this.RORIICRHIRIORIICRHCCROHCCCHHCH = null;
            this.ROHHRCRHROICORRORIRIOHRHHOHCHC = null;
         }
      } else {
         int var4 = var3.looping && var3.duration > 0 ? var1.emoteTimer % var3.duration : var1.emoteTimer;
         int var5 = var3.looping && var3.duration > 0 && this.OOCHIRIROOICOCOOHHOHCICHRHIRHO != Integer.MAX_VALUE
            ? this.OOCHIRIROOICOCOOHHOHCICHRHIRHO % var3.duration
            : this.OOCHIRIROOICOCOOHHOHCICHRHIRHO;
         if (var1.emoteTimer < this.OOCHIRIROOICOCOOHHOHCICHRHIRHO) {
            this.RORIICRHIRIORIICRHCCROHCCCHHCH = null;
            this.ROHHRCRHROICORRORIRIOHRHHOHCHC = null;
            this.reset();
         } else if (var4 < var5) {
            this.RORIICRHIRIORIICRHCCROHCCCHHCH = null;
            this.ROHHRCRHROICORRORIRIOHRHHOHCHC = null;
            this.CROCOHCOIHHHCHOOHOOIHHHICHOHOI();
         }

         this.OOCHIRIROOICOCOOHHOHCICHRHIRHO = var1.emoteTimer;
         MorphEntry var6 = (MorphEntry)this.COHHOOHCOCHHRRCCORICRCORRCHCOC.morphs().get(var3.morph);
         com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .RCRHICHHOOHCRHHCCCHCHIIRRHHRRH()
            .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var3.particleEffect);
         if (var6 != this.RORIICRHIRIORIICRHCCROHCCCHHCH || var7 != this.ROHHRCRHROICORRORIRIOHRHHOHCHC) {
            this.RORIICRHIRIORIICRHCCROHCCCHHCH = var6;
            this.ROHHRCRHROICORRORIRIOHRHHOHCHC = var7;
            if (this.RORIICRHIRIORIICRHCCROHCCCHHCH == null) {
               this.morphs = Collections.emptyList();
            } else {
               this.morphs = Collections.unmodifiableList(this.RORIICRHIRIORIICRHCCROHCCCHHCH.getMorphs());
            }
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      Matrix4f var2,
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      float var4
   ) {
      this.CORCOCICIRIOHROHROIIOOHICCHCRR(
         var4x -> {
            Matrix4f var5 = new Matrix4f(var2);
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RCRHICHHOOHCRHHCCCHCHIIRRHHRRH()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1, var3, var4x, var4);
         }
      );
   }
}
