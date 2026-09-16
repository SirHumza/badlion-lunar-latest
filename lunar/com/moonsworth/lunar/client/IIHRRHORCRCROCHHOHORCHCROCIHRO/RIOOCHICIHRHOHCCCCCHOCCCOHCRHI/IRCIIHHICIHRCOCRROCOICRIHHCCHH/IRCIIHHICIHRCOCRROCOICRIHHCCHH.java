package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IORRORCRRHRRORHIRHRROHCRRIHRII;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<O extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI<?>>
   extends ICICIOCHHHIHOCHCOHORIHRCOHHOCR<O>
   implements com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH,
   IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   protected final List<ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?>> ORCHCICHHHHHHIOCHHOHHOROHHCHRC;
   protected final List<ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?>> CRHHHRIHCRRRCHHHRRRRCOHOIOICCI;
   protected float height;
   protected String RIROOHORCRIHOHORCORRHRHROHOHOI = "";

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      O var1, com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this((O)var1, var1.getChildren(), var2);
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      O var1,
      Collection<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var2,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      super((O)var1, var3);
      this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC = new ArrayList<>();

      for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI var5 : var2) {
         this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC.add(var5.OCOHORHCROHICRRIHCIHHRRCIHICRI(this));
      }

      this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI = Collections.synchronizedList(new ArrayList<>());
      this.OOHOROCRIHRRCCHRIOHHCHHHIIIOCC();
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         (var1x, var2x) -> {
            for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
               if (var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x)
                  && this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var1x)
                  && var4.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1x, var2x)) {
                  if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2x, true)) {
                     com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
                     this.OOHOROCRIHRRCCHRIOHHCHHHIIIOCC();
                  }

                  return true;
               }
            }

            return false;
         }
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         (var1x, var2x) -> {
            if (this.RIROICHCRROROHCCROOCCCCOCHCCRI(var1x, var2x)) {
               return true;
            }

            for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var4 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
               if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4)
                  && var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x)
                  && var4.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1x, var2x)) {
                  if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2x, false)) {
                     com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
                     this.OOHOROCRIHRRCCHRIOHHCHHHIIIOCC();
                  }

                  return true;
               }
            }

            return false;
         }
      );
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH((var1x, var2x) -> {
         for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var4 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
            if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4) && var4.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1x, var2x) && var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x)) {
               if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2x, true)) {
                  this.OOHOROCRIHRRCCHRIOHHCHHHIIIOCC();
               }

               return true;
            }
         }

         return false;
      });
   }

   protected boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, int var2, boolean var3
   ) {
      return true;
   }

   protected void OOHOROCRIHRRCCHRIOHHCHHHIIIOCC() {
      float var1 = 0.0F;
      boolean var2 = false;
      float var3 = 0.0F;

      for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var5 : this.IOIOOOHHOHIHIORIHCIIORHIHOOCHI()) {
         boolean var6 = var5.CRRIHOOHIRHRHHCROHIHHCICRICIIH();
         float var7 = var5.getHeight();
         if (var7 != 0.0F) {
            if (var6) {
               if (!var2) {
                  var2 = true;
                  var1 = var7;
               } else {
                  var2 = false;
                  var3 += Math.max(var1, var7);
                  var1 = 0.0F;
               }
            } else {
               if (var2) {
                  var2 = false;
                  var3 += var1;
                  var1 = 0.0F;
               }

               var3 += var7;
            }
         }
      }

      if (var2) {
         var3 += var1;
      }

      this.height = var3 + this.HRHOOOCICRRHOOCORRRHIROCRIIIHO();
   }

   protected float IOCHHHCICCHRRIHOIRCRICIHHORRHR() {
      return this.width;
   }

   protected float HRHOOOCICRRHOOCORRRHIROCRIIIHO() {
      return this.height;
   }

   protected boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.OOHOROCRIHRRCCHRIOHHCHHHIIIOCC();
      return true;
   }

   protected boolean RIROICHCRROROHCCROOCCCCOCHCCRI(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, int var2
   ) {
      return var1.ICORIROICCORCRROCRCIRRRHHHOOIR() > this.x
            && var1.ICORIROICCORCRROCRCIRRRHHHOOIR() < this.x + this.IOCHHHCICCHRRIHOIRCRICIHHORRHR()
            && var1.OICOHRRRRCOICCHOIOROHOCOORCHII() > this.y
            && var1.OICOHRRRRCOICCHOIOROHOCOORCHII() < this.y + this.HRHOOOCICRRHOOCORRRHIROCRIIIHO()
         ? this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1)
         : false;
   }

   protected float ROHIOICICOCHCHHCRIROCRRRIORIHR() {
      return 0.0F;
   }

   protected float OIIHHIHCROIROIROIORICRCOICIIOI() {
      return 0.0F;
   }

   protected float HHROHHRHCIHHIIRCHIRRIHRRICCRIO() {
      return 0.0F;
   }

   @Override
   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(float var1, float var2, float var3) {
      super.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1, var2, var3);
      float var4 = 0.0F;
      int var5 = 0;
      float var6 = var2 + this.HRHOOOCICRRHOOCORRRHIROCRIIIHO();

      for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var8 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (!this.RIROOHORCRIHOHORCORRHRHROHOHOI.isBlank() && !this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI.contains(var8)) {
            var8.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1 - var3, var2, var3);
         } else if (!var8.getOption().isHidden()) {
            boolean var9 = var8.CRRIHOOHIRHRHHCROHIHHCICRICIIH();
            float var10 = var9 ? var3 / 2.0F : var3;
            if (var5 == 2) {
               var5 = 0;
               var6 += var4;
               var4 = 0.0F;
            }

            if (!var9) {
               var5 = 0;
               var6 += var4;
               var4 = 0.0F;
            }

            var8.IRRCCOICORICIHCHRHIHIHROIRHOCR(
               var1 + var5 * (var3 / 2.0F) + this.ROHIOICICOCHCHHCRIROCRRRIORIHR(),
               var6 + this.OIIHHIHCROIROIROIORICRCOICIIOI(),
               var10 + this.HHROHHRHCIHHIIRCHIRRIHRRICCRIO()
            );
            if (var8.getHeight() > var4) {
               var4 = var8.getHeight();
            }

            if (!var9) {
               var6 += var4;
               var4 = 0.0F;
            } else {
               var5++;
            }
         }
      }

      this.OOHOROCRIHRRCCHRIOHHCHHHIIIOCC();
   }

   @Override
   public void update() {
      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (var2.RIOIOOOIOOICCIOCICHRROCIIORIHO()) {
            var2.update();
         }
      }
   }

   protected void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var4 : this.IOIOOOHHOHIHIORIHCIIORHIHOOCHI()) {
         if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4)) {
            var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2));
         }
      }
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
   }

   @Override
   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return super.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1)
         && var1.ICORIROICCORCRROCRCIRRRHHHOOIR() < this.x + this.IOCHHHCICCHRRIHOIRCRICIHHORRHR()
         && var1.OICOHRRRRCOICCHOIOROHOCOORCHII() < this.y + this.HRHOOOCICRRHOOCORRRHIROCRIIIHO();
   }

   @Nullable
   @Override
   public ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1)) {
         return this;
      }

      if (!this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1)) {
         return null;
      }

      for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var3 : this.IOIOOOHHOHIHIORIHCIIORHIHOOCHI()) {
         if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)) {
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR var4 = var3.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
      if (var2.ICORIROICCORCRROCRCIRRRHHHOOIR() < this.x + this.IOCHHHCICCHRRIHOIRCRICIHHORRHR()
         && var2.OICOHRRRRCOICCHOIOROHOCOORCHII() < this.y + this.HRHOOOCICRRHOOCORRRHIROCRIIIHO()) {
         super.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var3);
      } else {
         for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var5 : this.IOIOOOHHOHIHIORIHCIIORHIHOOCHI()) {
            if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5) && var5.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2)) {
               var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
            }
         }
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      char var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (var4.RIOIOOOIOOICCIOCICHRROCIIORIHO()) {
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         }
      }
   }

   @Override
   public boolean COCCOIROHORRRHIHICORRHRRORIIIH(int var1) {
      if (super.COCCOIROHORRRHIHICORRHRRORIIIH(var1)) {
         return true;
      }

      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (var3.RIOIOOOIOOICCIOCICHRROCIIORIHO() && var3.COCCOIROHORRRHIHICORRHRRORIIIH(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void close() {
      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (var2.RIOIOOOIOOICCIOCICHRROCIIORIHO()) {
            var2.close();
         }
      }
   }

   protected boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH... var3
   ) {
      List var4 = Arrays.asList(var3);
      boolean var5 = true;

      for (int var6 = this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC.size() - 1; var6 >= 0; var6--) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC
            .get(var6);
         if (var7 == var1) {
            break;
         }

         if (!var4.contains(var7) && var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2)) {
            var5 = false;
            break;
         }
      }

      return var5;
   }

   public boolean RHIICHCRRORRROCHRRHOORCORIOCRH(String var1) {
      boolean var2 = false;
      this.RIROOHORCRIHOHORCORRHRHROHOHOI = var1;
      var1 = var1.toLowerCase();
      if (var1.isBlank()) {
         for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var9 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
            if (var9 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var10) {
               var10.RHIICHCRRORRROCHRRHOORCORIOCRH(var1);
            }
         }

         return false;
      } else {
         this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI.clear();
         if (this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.getOption(), var1)) {
            this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI.addAll(this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC);
            return true;
         }

         for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var4 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
            if (var4 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var5) {
               if (var5.RHIICHCRRORRROCHRRHOORCORIOCRH(var1)) {
                  this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI.add(var4);
                  var2 = true;
               }
            } else if (!(var4 instanceof RIROICHCRROROHCCROOCCCCOCHCCRI)) {
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI var6 = var4.getOption();
               if (this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var1)) {
                  this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI.add(var4);
                  var2 = true;
               }
            }
         }

         return var2;
      }
   }

   private boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, String var2
   ) {
      String var3 = IORRORCRRHRRORHIRHRROHCRRIHRII.RCROOHHCROORIIICHORIHRROIOOHHC(var2);
      String var4 = var1.CHIIRICICCCIIRRRICIICCCIIHHRRO();
      String var5 = var4 + "Description";
      String var6 = var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5);
      if (!var1.getName().toLowerCase().contains(var2) && !var1.getId().toLowerCase().contains(var2)) {
         if (!var5.equals(var6) && var6.toLowerCase().contains(var2)) {
            return true;
         }

         String[] var7 = var1.getName().split(" ");

         for (String var11 : var7) {
            var11 = IORRORCRRHRRORHIRHRROHCRRIHRII.RCROOHHCROORIIICHORIHRROIOOHHC(var11);
            if (var11.startsWith(var3)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public List<ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?>> RCRIOCCCOOIRICRHHCCIRCIOHRRRIO() {
      return this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC;
   }

   public List<ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?>> IOIOOOHHOHIHIORIHCIIORHIHOOCHI() {
      return this.RIROOHORCRIHOHORCORRHRHROHOHOI.isBlank() ? this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC : this.CRHHHRIHCRRRCHHHRRRRCOHOIOICCI;
   }

   @Override
   public boolean IHIOIHORHHIHICORRCRCHCIICIIHIO() {
      boolean var1 = false;

      for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var3 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (var3 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var4) {
            boolean var5 = var4.IHIOIHORHHIHICORRCRCHCIICIIHIO();
            if (var5) {
               var1 = true;
            }
         }

         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var3
         )) {
            var1 = true;
         }
      }

      return var1;
   }

   protected boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> var1) {
      return !var1.RIOIOOOIOOICCIOCICHRROCIIORIHO() || var1.getOption().isHidden();
   }

   @Override
   public boolean isEditing() {
      for (ICICIOCHHHIHOCHCOHORIHRCOHHOCR var2 : this.ORCHCICHHHHHHIOCHHOHHOROHHCHRC) {
         if (var2 instanceof com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var3
            && var3.isEditing()) {
            return true;
         }
      }

      return false;
   }
}
