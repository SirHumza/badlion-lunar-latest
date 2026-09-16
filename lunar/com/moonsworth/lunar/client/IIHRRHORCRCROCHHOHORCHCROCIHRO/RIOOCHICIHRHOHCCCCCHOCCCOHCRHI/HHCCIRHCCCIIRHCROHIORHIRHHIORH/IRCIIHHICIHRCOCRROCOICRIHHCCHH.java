package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final char OCHRIRIICHCOCRCOROHHORRCIRROHI = '§';
   private static final Pattern RCCHORRHIORICCRHRRIOCCIRCCHOOO = Pattern.compile("(?i)§[0-9A-FR]");
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC IOIHIORCHIHOOHIHIRHOHIRHRCIOIO;
   private boolean CCICCRCCCOCIIHRCHICRCHHRROCOIR = false;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC OCHRCIHOHOHROORCHHOOICRHRCOHCH;
   private boolean RIIIHOCCICRHHRORIRRCIHORHIOROH = false;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC OHROHRHHICIIOCIOORHIHOCRHCRORR;
   private boolean CCHOHIIHOCOIRROIHHOORIIOHIIROC = false;
   private final int[] colorCode = new int[32];
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] ORRCRCICROCORRCRCHCIIHCHHORROR = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[256];
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] IRHRRCORCHORCIOOOOROCIRCHRRRCR = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[256];
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] HOHHORCOCRCICICIRRCIIOHOCIIHOR = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[256];
   private Function<Float, Integer> HRHOICRIOOCOIOIIHICRCOOCCRHCHR = null;
   private boolean shadow = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, float var2) {
      super(var1, var2);
      String var3 = var1.bridge$getPath();
      var3 = var3.substring(var3.indexOf(47) + 1, var3.indexOf(46));
      this.IOIHIORCHIHOOHIHIRHOHIRHRCIOIO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", var3 + "-cfont_bold-" + (int)var2);
      this.OCHRCIHOHOHROORCHHOOICRHRCOHCH = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", var3 + "-cfont_italic-" + (int)var2);
      this.OHROHRHHICIIOCIOORHIHOCRHCRORR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", var3 + "-cfont_italic_bold-" + (int)var2);
   }

   @Override
   public boolean HICCORIOHCOHCRRHHCIOIIIRCCROOC() {
      if (this.COICIHIIHRRCCRRICOCRCHRROOICRC != null) {
         return true;
      }

      super.HICCORIOHCOHCRRHHCIOIIIRCCROOC();
      this.HOCCOIIIHRROIHOHIOHRCIOHOOCORI();
      this.OHHIRCCICCRRCHCHOORHHIOORHRIRO();
      return true;
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, double var3, double var5, int var7, int var8) {
      float var9 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3 + 1.0, var5 + 1.0, var8, false);
      return Math.max(var9, this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var5, var7, false));
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, double var3, double var5, int var7) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var5, var7, false);
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, double var3, double var5, int var7, boolean var8) {
      float var9 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 + 1.0, var5 + 1.0, var7, true, var8);
      return Math.max(var9, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var5, var7, false, var8));
   }

   public float RRCRRCORICCHOHHIRCHIROOHIIOHCO(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, float var3, float var4, int var5) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var4, var5, false);
   }

   public float RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, float var3, float var4, int var5) {
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2, var3 - this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var2) / 2.0F, var4, var5);
   }

   public float HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, float var3, float var4, int var5) {
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2, var3 - this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var2) / 2.0F, var4, var5);
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, double var3, double var5, Function<Float, Integer> var7, boolean var8
   ) {
      this.HRHOICRIOOCOIOIIHICRCOOCCRHCHR = var7;
      int var9 = (Integer)var7.apply((float)(var3 + var5));
      if (var8) {
         this.shadow = true;
         int var10 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCRICHOCHHHCRCORROOIHCROOIICOC(var9);
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3 + 1.0, var5 + 1.0, var10, false);
      }

      this.shadow = false;
      float var11 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var5, var9, false);
      this.HRHOICRIOOCOIOIIHICRCOOCCRHCHR = null;
      return var11;
   }

   public float IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, double var3, double var5, int var7, boolean var8) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var5, var7, var8, false);
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var10;
      if (var9) {
         var10 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1.IRCRHHCRHIIIHROOCORCHHHRIIROIR());
      } else {
         var10 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1);
      }

      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var2, var3, var5, var7, var8);
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      double var3,
      double var5,
      int var7,
      int var8
   ) {
      float var9 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 + 1.0, var5 + 1.0, var8, false);
      return Math.max(var9, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var5, var7, false));
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      double var3,
      double var5,
      int var7
   ) {
      float var8 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 + 1.0, var5 + 1.0, var7, true);
      return Math.max(var8, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var5, var7, false));
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      float var3,
      float var4,
      int var5
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, var5, false);
   }

   public float IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      float var3,
      float var4,
      int var5
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 - this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var2) / 2.0F, var4, var5);
   }

   public float HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      float var3,
      float var4,
      int var5
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 - this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var2) / 2.0F, var4, var5);
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      double var3,
      double var5,
      Function<Float, Integer> var7,
      boolean var8
   ) {
      this.HRHOICRIOOCOIOIIHICRCOOCCRHCHR = var7;
      int var9 = (Integer)var7.apply((float)(var3 + var5));
      if (var8) {
         this.shadow = true;
         int var10 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCRICHOCHHHCRCORROOIHCROOIICOC(var9);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 + 1.0, var5 + 1.0, var10, false);
      }

      this.shadow = false;
      float var11 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var5, var9, false);
      this.HRHOICRIOOCOIOIIHICRCOOCCRHCHR = null;
      return var11;
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      double var3,
      double var5,
      int var7,
      boolean var8
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var2, var3, var5, var7, var8);
   }

   public float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2, double var3, double var5, int var7, boolean var8) {
      var3 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(
         --var3
      );
      var5 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(
         var5
      );
      if (var2 == null) {
         return 0.0F;
      }

      if (var7 == 553648127) {
         var7 = 16777215;
      }

      if ((var7 & -67108864) == 0) {
         var7 |= -16777216;
      }

      if (var8) {
         var7 = (var7 & 16579836) >> 2 | var7 & 0xFF000000;
      }

      int var9 = var7 & 0xFF000000;
      double var10 = var3;
      this.rendered = new boolean[var2.length()];
      this.remaining = var2.length();
      var5 *= 2.0;
      var1.push();
      var1.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(0.5F, 0.5F);
      ArrayList var12 = new ArrayList();
      HashMap var13 = new HashMap();

      while (this.remaining >= 0) {
         if (this.remaining == 0) {
            this.remaining = -1;
         }

         int var14 = var7 | var9;
         var3 = var10 * 2.0;
         int var15 = var2.length();
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var16 = this.CRIHIHRHRRCRICOOHHOROIIIICCROH;
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var17 = this.RICOIRORIICHHCIOCOCOHIHCIRIHOH;
         boolean var18 = false;
         boolean var19 = false;
         boolean var20 = false;
         boolean var21 = false;
         boolean var22 = false;

         for (this.index = 0; this.index < var15; this.index++) {
            char var23 = var2.charAt(this.index);
            if (var23 == 167 && this.index < var15) {
               int var34 = 21;

               try {
                  var34 = "0123456789abcdefklmnor".indexOf(Character.toLowerCase(var2.charAt(this.index + 1)));
               } catch (Exception var26) {
                  var26.printStackTrace();
               }

               if (var34 >= 16) {
                  if (var34 == 16) {
                     var18 = true;
                  } else if (var34 == 17) {
                     var19 = true;
                     if (var20) {
                        var16 = this.CCHOHIIHOCOIRROIHHOORIIOHIIROC ? this.OHROHRHHICIIOCIOORHIHOCRHCRORR : var16;
                        var17 = this.HOHHORCOCRCICICIRRCIIOHOCIIHOR;
                     } else {
                        var16 = this.CCICCRCCCOCIIHRCHICRCHHRROCOIR ? this.IOIHIORCHIHOOHIHIRHOHIRHRCIOIO : var16;
                        var17 = this.ORRCRCICROCORRCRCHCIIHCHHORROR;
                     }
                  } else if (var34 == 18) {
                     var21 = true;
                  } else if (var34 == 19) {
                     var22 = true;
                  } else if (var34 == 20) {
                     var20 = true;
                     if (var19) {
                        var16 = this.CCHOHIIHOCOIRROIHHOORIIOHIIROC ? this.OHROHRHHICIIOCIOORHIHOCRHCRORR : var16;
                        var17 = this.HOHHORCOCRCICICIRRCIIOHOCIIHOR;
                     } else {
                        var16 = this.RIIIHOCCICRHHRORIRRCIHORHIOROH ? this.OCHRCIHOHOHROORCHHOOICRHRCOHCH : var16;
                        var17 = this.IRHRRCORCHORCIOOOOROCIRCHRRRCR;
                     }
                  } else if (var34 == 21) {
                     var19 = false;
                     var20 = false;
                     var18 = false;
                     var22 = false;
                     var21 = false;
                     var14 = var7 | var9;
                     var16 = this.CRIHIHRHRRCRICOOHHOROIIIICCROH;
                     var17 = this.RICOIRORIICHHCIOCOCOHIHCIRIHOH;
                  }
               } else {
                  var19 = false;
                  var20 = false;
                  var18 = false;
                  var22 = false;
                  var21 = false;
                  var16 = this.CRIHIHRHRRCRICOOHHOROIIIICCROH;
                  var17 = this.RICOIRORIICHHCIOCOCOHIHCIRIHOH;
                  if (var34 < 0 || var34 > 15) {
                     var34 = 15;
                  }

                  if (var8) {
                     var34 += 16;
                  }

                  var14 = this.colorCode[var34] | var9;
               }

               this.markRendered();
               this.index++;
               this.markRendered();
            } else if (var23 < var17.length && var23 >= 0) {
               int var24 = this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var3, var5);
               if (var24 != -1) {
                  var14 = var24 | var9;
               }

               if (this.remaining == -1) {
                  if (var21) {
                     var12.add(
                        new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           var3, var5, var17[var23], true, var14
                        )
                     );
                  }

                  if (var22) {
                     var12.add(
                        new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           var3, var5, var17[var23], false, var14
                        )
                     );
                  }
               } else if (!this.rendered[this.index]) {
                  var13.computeIfAbsent(var16, var0 -> new ArrayList<>())
                     .add(
                        new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           (float)var3, (float)var5, var23, var14
                        )
                     );
                  this.rendered[this.index] = true;
                  this.remaining--;
               }

               var3 += var17[var23].width - 8 + this.RCOCRCOCHHRCIHCOIIIROIIOOHIOOC;
            } else {
               this.markRendered();
            }
         }
      }

      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var13, this.OCICHRHROHIORCRRRIHHHHCIHIHIOH);
      var1.IOCCCRIHOCHRCHRHCRHROIRIRHHHIR(var12);
      var1.pop();
      return (float)(var10 + (var3 / 2.0 - var10));
   }

   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] RHOORRIIOCHIRRHOHOOHIROHCRICRO(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1
   ) {
      if (var1 == this.CRIHIHRHRRCRICOOHHOROIIIICCROH) {
         return this.RICOIRORIICHHCIOCOCOHIHCIRIHOH;
      } else if (var1 == this.IOIHIORCHIHOOHIHIRHOHIRHRCIOIO) {
         return this.ORRCRCICROCORRCRCHCIIHCHHORROR;
      } else if (var1 == this.OCHRCIHOHOHROORCHHOOICRHRCOHCH) {
         return this.IRHRRCORCHORCIOOOOROCIRCHRRRCR;
      } else if (var1 == this.OHROHRHHICIIOCIOORHIHOCRHCRORR) {
         return this.HOHHORCOCRCICICIRRCIIOHOCIIHOR;
      } else {
         throw new IllegalArgumentException("Unrecognized resource id: " + var1);
      }
   }

   private int OHHRIOHROOIHOROCIRHCHORIHRRRRI(double var1, double var3) {
      if (this.HRHOICRIOOCOIOIIHICRCOOCCRHCHR == null) {
         return -1;
      }

      int var5 = this.HRHOICRIOOCOIOIIHICRCOOCCRHCHR.apply((float)(var1 + var3));
      if (this.shadow) {
         var5 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCRICHOCHHHCRCORROOIHCROOIICOC(var5);
      }

      return var5;
   }

   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, double var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, false);
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, double var2, boolean var4) {
      StringBuilder var5 = new StringBuilder();
      float var6 = 0.0F;
      int var7 = var4 ? var1.length() - 1 : 0;
      int var8 = var4 ? -1 : 1;
      boolean var9 = false;
      boolean var10 = false;

      for (int var11 = var7; var11 >= 0 && var11 < var1.length() && var6 < (float)var2; var11 += var8) {
         char var12 = var1.charAt(var11);
         double var13 = this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(String.valueOf(var12));
         if (var9) {
            var9 = false;
            if (var12 == 'l' || var12 == 'L') {
               var10 = true;
            } else if (var12 == 'r' || var12 == 'R') {
               var10 = false;
            }
         } else if (var13 < 0.0) {
            var9 = true;
         } else {
            var6 = (float)(var6 + var13);
            if (var10) {
               var6++;
            }
         }

         if (var6 > (float)var2) {
            break;
         }

         if (var4) {
            var5.insert(0, var12);
         } else {
            var5.append(var12);
         }
      }

      return var5.toString();
   }

   @Override
   public float IOOOHRRHCHICHHHCRIRHIICORRCIRO(String var1) {
      if (var1 == null) {
         return 0.0F;
      }

      int var2 = 0;
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.RICOIRORIICHHCIOCOCOHIHCIRIHOH;
      boolean var4 = false;
      boolean var5 = false;
      int var6 = var1.length();

      for (int var7 = 0; var7 < var6; var7++) {
         char var8 = var1.charAt(var7);
         if (var8 == 167 && var7 < var6) {
            int var10 = "0123456789abcdefklmnor".indexOf(var8);
            if (var10 < 16) {
               var4 = false;
               var5 = false;
            } else if (var10 == 17) {
               var4 = true;
               if (var5) {
                  var3 = this.HOHHORCOCRCICICIRRCIIOHOCIIHOR;
               } else {
                  var3 = this.ORRCRCICROCORRCRCHCIIHCHHORROR;
               }
            } else if (var10 == 20) {
               var5 = true;
               if (var4) {
                  var3 = this.HOHHORCOCRCICICIRRCIIOHOCIIHOR;
               } else {
                  var3 = this.IRHRRCORCHORCIOOOOROCIRCHRRRCR;
               }
            } else if (var10 == 21) {
               var4 = false;
               var5 = false;
               var3 = this.RICOIRORIICHHCIOCOCOHIHCIRIHOH;
            }

            var7++;
         } else if (var8 < var3.length && var8 >= 0) {
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = var3[var8];
            if (var9 != null) {
               var2 += var9.width - 8 + this.RCOCRCOCHHRCIHCOIIIROIIOOHIOOC;
            }
         }
      }

      return var2 / 2.0F;
   }

   private void OHHIRCCICCRRCHCHOORHHIOORHRIRO() {
      this.CCICCRCCCOCIIHRCHICRCHHRROCOIR = false;
      this.RIIIHOCCICRHHRORIRRCIHORHIOROH = false;
      this.CCHOHIIHOCOIRROIHHOORIIOHIIROC = false;
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$deleteTexture(this.IOIHIORCHIHOOHIHIRHOHIRHRCIOIO);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$deleteTexture(this.OCHRCIHOHOHROORCHHOOICRHRCOHCH);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$deleteTexture(this.OHROHRHHICIIOCIOORHIHOCRHCRORR);
      Font var1 = this.COICIHIIHRRCCRRICOCRCHRROOICRC.deriveFont(1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.IOIHIORCHIHOOHIHIRHOHIRHRCIOIO, var1, this.antiAlias, this.RORIOOOCOHCHOCOOHROIOROIIRRORC, this.ORRCRCICROCORRCRCHCIIHCHHORROR, false
         )
         .thenAccept(var1x -> this.CCICCRCCCOCIIHRCHICRCHHRROCOIR = true);
      Font var2 = this.COICIHIIHRRCCRRICOCRCHRROOICRC.deriveFont(2);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.OCHRCIHOHOHROORCHHOOICRHRCOHCH, var2, this.antiAlias, this.RORIOOOCOHCHOCOOHROIOROIIRRORC, this.IRHRRCORCHORCIOOOOROCIRCHRRRCR, false
         )
         .thenAccept(var1x -> this.RIIIHOCCICRHHRORIRRCIHORHIOROH = true);
      Font var3 = this.COICIHIIHRRCCRRICOCRCHRROOICRC.deriveFont(3);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.OHROHRHHICIIOCIOORHIHOCRHCRORR, var3, this.antiAlias, this.RORIOOOCOHCHOCOOHROIOROIIRRORC, this.HOHHORCOCRCICICIRRCIIOHOCIIHOR, false
         )
         .thenAccept(var1x -> this.CCHOHIIHOCOIRROIHHOORIIOHIIROC = true);
   }

   public List<String> HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, double var2) {
      ArrayList var4 = new ArrayList();
      if (!(this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var1) > var2) && !var1.contains("\n")) {
         var4.add(var1);
      } else {
         String[] var5 = var1.split("\n");
         String var6 = "";
         String var7 = "";

         for (String var12 : var5) {
            if (var12.isEmpty()) {
               var4.add(var12);
            }

            String[] var13 = var12.split(" ");

            for (String var17 : var13) {
               if (this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var6 + var17 + " ") < var2) {
                  var6 = var6 + var17 + " ";
               } else {
                  var4.add(var6);
                  var6 = var7 + var17 + " ";
               }

               Matcher var18 = RCCHORRHIORICCRHRRIOCCIRCCHOOO.matcher(var17);
               String var19 = "";

               while (var18.find()) {
                  var19 = var18.group();
               }

               if (!var19.isEmpty()) {
                  var7 = var19;
               }
            }

            float var8;
            if (!var6.isEmpty() && (var8 = this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var6)) > 0.0F) {
               if (var8 < var2) {
                  var4.add(var6);
               } else {
                  var4.addAll(this.CRRRICCRROCOHHOHIICIHORCOORRRH(var6, var2));
               }

               var6 = "";
            }
         }
      }

      return var4;
   }

   public List<String> CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, double var2) {
      ArrayList var4 = new ArrayList();
      StringBuilder var5 = new StringBuilder();
      char var6 = 'F';
      char[] var7 = var1.toCharArray();

      for (int var8 = 0; var8 < var7.length; var8++) {
         char var9 = var7[var8];
         if (var9 == 167 && var8 < var7.length - 1) {
            var6 = var7[var8 + 1];
         }

         if (this.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var5.toString() + var9) < var2) {
            var5.append(var9);
         } else {
            var4.add(var5.toString());
            var5 = new StringBuilder("§" + var6 + var9);
         }
      }

      if (!var5.isEmpty()) {
         var4.add(var5.toString());
      }

      return var4;
   }

   private void HOCCOIIIHRROIHOHIOHRCIOHOOCORI() {
      for (int var1 = 0; var1 < 32; var1++) {
         int var2 = (var1 >> 3 & 1) * 85;
         int var3 = (var1 >> 2 & 1) * 170 + var2;
         int var4 = (var1 >> 1 & 1) * 170 + var2;
         int var5 = (var1 & 1) * 170 + var2;
         if (var1 == 6) {
            var3 += 85;
         }

         if (var1 >= 16) {
            var3 /= 4;
            var4 /= 4;
            var5 /= 4;
         }

         this.colorCode[var1] = (var3 & 0xFF) << 16 | (var4 & 0xFF) << 8 | var5 & 0xFF;
      }
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final double OIIHIOCOHRHICIOIRHCRRCCRHRCHCO;
      private final double HOIRHIOIICRCRIICOHCCRORHRHRCIO;
      private final com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCRHRIHOIOHRRROHRHCORCRHIOCCCR;
      private final boolean OCHOIHIIRCOICHCHIOOOCRORIRCIIO;
      private final int CHHHIHRICOCHHOOORHICHOHHIHRCIH;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         double var1,
         double var3,
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
         boolean var6,
         int var7
      ) {
         this.OIIHIOCOHRHICIOIRHCRRCCRHRCHCO = var1;
         this.HOIRHIOIICRCRIICOHCCRORHRHRCIO = var3;
         this.OCRHRIHOIOHRRROHRHCORCRHIOCCCR = var5;
         this.OCHOIHIIRCOICHCHIOOOCRORIRCIIO = var6;
         this.CHHHIHRICOCHHOOORHICHOHHIHRCIH = var7;
      }

      public double ICORIROICCORCRROCRCIRRRHHHOOIR() {
         return this.OIIHIOCOHRHICIOIRHCRRCCRHRCHCO;
      }

      public double OICOHRRRRCOICCHOIOROHOCOORCHII() {
         return this.HOIRHIOIICRCRIICOHCCRORHRHRCIO;
      }

      public com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCRRRHIIOHIIIORRCRHOCORCCHOHRH() {
         return this.OCRHRIHOIOHRRROHRHCORCRHIOCCCR;
      }

      public boolean IRRHHCIIHCICIRRHCCOHRRCRHICRHC() {
         return this.OCHOIHIIRCOICHCHIOOOCRORIRCIIO;
      }

      public int HICHRICIIOOIHIIRHCCOHOHICHHOCC() {
         return this.CHHHIHRICOCHHOOORHICHOHHIHRCIH;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final float ORCHHOCOOIOORCRRHRCHIRIRCCRCIH;
      private final float CORRHOOHOHCHOCCHORRCCOIORCIIRC;
      private final char IIHOHORHHRICRHOHROORHHRHRCHCRC;
      private final int IIIIHROCRCRCCRRIHIORIICRIRRCOR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var1, float var2, char var3, int var4) {
         this.ORCHHOCOOIOORCRRHRCHIRIRCCRCIH = var1;
         this.CORRHOOHOHCHOCCHORRCCOIORCIIRC = var2;
         this.IIHOHORHHRICRHOHROORHHRHRCHCRC = var3;
         this.IIIIHROCRCRCCRRIHIORIICRIRRCOR = var4;
      }

      public float x() {
         return this.ORCHHOCOOIOORCRRHRCHIRIRCCRCIH;
      }

      public float y() {
         return this.CORRHOOHOHCHOCCHORRCCOIORCIIRC;
      }

      public char character() {
         return this.IIHOHORHHRICRHOHROORHHRHRCHCRC;
      }

      public int HICHRICIIOOIHIIRHCCOHOHICHHOCC() {
         return this.IIIIHROCRCRCCRRIHIORIICRIRRCOR;
      }
   }
}
