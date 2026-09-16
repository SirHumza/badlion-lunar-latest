package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.Nullable;

class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final int ROCRCRHROHROCRIHHRRIRRHCIRIIIR = 75000;
   private static final int IHOOCOHCCRROICIHIIHHCHCRIOCICO = 500;
   private CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHRRCHCCRHRIRRCCHCICIOHRRHRRC = new CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private volatile CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RHROOICIIHOHROOHOICIICIOHICIRC = new CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH IORHRIHHHOIHOCCORCORCRHIORIHRO = new CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private volatile CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH HRHHHRIOOCOORICIICHORHHOOIRRIR = new CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[] COCCRCOCCCHCOICOICHCHICICOIRHR = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[500];

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
   }

   public void IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> var1
   ) {
      int var2 = var1.size();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var3 = this.COCCRCOCCCHCOICOICHCHICICOIRHR;
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1.get(
               var5
            ),
            var4++
         );
      }

      for (int var6 = var4; var6 < var3.length; var6++) {
         var3[var6] = null;
      }

      this.COCCRCOCCCHCOICOICHCHICICOIRHR = var3;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2
   ) {
      CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.HOHRRCHCCRHRIRRCCHCICIOHRRHRRC;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var4 = this.COCCRCOCCCHCOICOICHCHICICOIRHR;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var5 = var3.CRHRRHCCIRHICCCRIRHRHCRIICIICH;
      short[] var6 = var3.COCCCHORHHIOHROICCIHCOIHOROCHI;
      byte[] var7 = var3.HICCHORRCIRRICOHRIIHRROCOICCHH;
      int var8 = 0;
      RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = null;

      for (int var10 = 0; var10 < var4.length; var10++) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = var4[var10];
         if (var11 == null) {
            break;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var12 = var11.bridge$lightOverlayTracker();
         if (var12 == null) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = var11.bridge$origin();
            int var14 = var13.bridge$getX();
            int var15 = var13.bridge$getY();
            int var16 = var13.bridge$getZ();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = var2.bridge$getChunk(
               var14 >> 4, var16 >> 4
            );
            if (var9 == null) {
               var9 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(0, 0, 0);
            }

            for (int var18 = 0; var18 < 4096; var18++) {
               int var19 = var18 >> 8 & 15;
               int var20 = var18 >> 4 & 15;
               int var21 = var18 & 15;
               var9.bridge$setPos(var14 + var19, var15 + var20, var16 + var21);
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 = var17.bridge$getBlockState(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var9
               );
               if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var9, var22
               )) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
                     var9.bridge$setPos(var14 + var19, var15 + var20 + 1, var16 + var21);
                  }

                  int var23 = var17.bridge$getSkyLight(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var9
                  );
                  int var24 = var17.bridge$getBlockLight(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var9
                  );
                  short var25 = (short)((var19 & 15) << 8 | (var20 & 15) << 4 | var21 & 15);
                  byte var26 = (byte)((var24 & 15) << 4 | var23 & 15);
                  var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var13, var8);
                  var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var25, var8);
                  var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var26, var8);
                  var8++;
               }
            }
         } else {
            ShortArrayList var29 = var12.CHOICHHHCCCHCCOCICIHHIOCHRHOOH();
            ByteArrayList var30 = var12.IOHHHRIOHHOIHORHRHIHRIHCICIIHR();
            if (var29 != null && var30 != null) {
               int var31 = var29.size();
               if (var31 > 0) {
                  var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var29.elements(), var8, var31);
                  var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var30.elements(), var8, var31);
                  var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var11.bridge$origin(), var8, var31);
                  var8 += var31;
               }
            }
         }
      }

      for (int var27 = var8; var27 < var5.length; var27++) {
         var5[var27] = null;
      }

      var3.CRHRRHCCIRHICCCRIRHRHCRIICIICH = var5;
      var3.COCCCHORHHIOHROICCIHCOIHOROCHI = var6;
      var3.HICCHORRCIRRICOHRIIHRROCOICCHH = var7;
      var3.ROCHOIHIRHCIIOOIOHCORRHCRRIHRH = var8;
      CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var28 = this.RHROOICIIHOHROOHOICIICIOHICIRC;
      this.RHROOICIIHOHROOHOICIICIOHICIRC = var3;
      this.HOHRRCHCCRHRIRRCCHCICIOHRRHRRC = var28;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1,
      int var2,
      int var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4,
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
      boolean var6,
      boolean var7,
      int var8,
      int var9,
      int var10
   ) {
      CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = this.RHROOICIIHOHROOHOICIICIOHICIRC;
      int var12 = var11.ROCHOIHIRHCIIOOIOHCORRHCRRIHRH;
      if (var12 != 0) {
         CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = this.IORHRIHHHOIHOCCORCORCRHIORIHRO;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var14 = var11.CRHRRHCCIRHICCCRIRHRHCRIICIICH;
         short[] var15 = var11.COCCCHORHHIOHROICCIHCOIHOROCHI;
         byte[] var16 = var11.HICCHORRCIRRICOHRIIHRROCOICCHH;
         int[] var17 = var13.IIRHIHOCHOHHRIIHICROCHHOHOORRR;
         int var18 = 0;
         int var19 = (int)Math.pow(var9 * 8, 2.0);
         int var20 = (int)Math.pow(var9 * 5, 2.0);

         for (int var21 = 0; var21 < var12; var21++) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var22 = var14[var21];
            if (var22 != null) {
               int var23 = var22.bridge$getX();
               int var24 = var22.bridge$getY();
               int var25 = var22.bridge$getZ();
               short var26 = var15[var21];
               int var27 = (var26 >> 8 & 15) + var23;
               int var28 = (var26 >> 4 & 15) + var24;
               int var29 = (var26 & 15) + var25;
               int var30 = var27 - var1;
               int var31 = var28 + 1 - var2;
               int var32 = var29 - var3;
               if (var31 * var31 <= var20 && var30 * var30 + var32 * var32 <= var19) {
                  byte var33 = var16[var21];
                  byte var34 = (byte)(var33 >> 4 & 15);
                  byte var35 = (byte)(var33 & 15);
                  if ((
                        !var6
                           || (
                                 !var7
                                    || com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                                          var34, var35, var10
                                       )
                                       <= var8
                              )
                              && (
                                 var7
                                    || com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                       var34, var35, var10
                                    )
                              )
                     )
                     && (var5 == null || var5.isBlockVisible(var27, var28, var29))) {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var36 = var4.bridge$getBlockAt(
                        var27, var28, var29
                     );
                     if (var36 == null || !var36.bridge$isAir()) {
                        var17 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var21, var18++);
                     }
                  }
               }
            }
         }

         var13.IIRHIHOCHOHHRIIHICROCHHOHOORRR = var17;
         var13.OICOICRIHCRRCIOCOICRROIIIOIRCC = var18;
         var13.HCIHRCCCIOCCHOCHHHOHHRROCRCICC = var11;
         CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var37 = this.HRHHHRIOOCOORICIICHORHHOOIRRIR;
         this.HRHHHRIOOCOORICIICHORHHOOIRRIR = var13;
         this.IORHRIHHHOIHOCCORCORCRHIORIHRO = var37;
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.HRHHHRIOOCOORICIICHORHHOOIRRIR;
      int var5 = var4.OICOICRIHCRRCIOCOICRROIIIOIRCC;
      if (var5 != 0) {
         CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var4.HCIHRCCCIOCCHOCHHHOHHRROCRCICC;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var7 = var6.CRHRRHCCIRHICCCRIRHRHCRIICIICH;
         short[] var8 = var6.COCCCHORHHIOHROICCIHCOIHOROCHI;
         byte[] var9 = var6.HICCHORRCIRRICOHRIIHRROCOICCHH;
         int[] var10 = var4.IIRHIHOCHOHHRIIHICROCHHOHOORRR;
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = var3.RIOORORRHRRHCOOICHHORRRRRRRCOO
            .get();
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var12 = null;
         if (var11
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CROSS
            )
          {
            var12 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var3
            );
         } else if (var11
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OVERLAY
            )
          {
            var12 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var3);
         }

         if (var12 != null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var5, var10, var7, var8, var9, var2);
            var12.end();
         }

         if (var3.OORHRORCRCHRICOIIORIROIHICRIIR.get()) {
            var12 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, var3);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var5, var10, var7, var8, var9, var2);
            var12.end();
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RORCHCIIICOHIRROOORHOCCCCIOCCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      int var2,
      int[] var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var4,
      short[] var5,
      byte[] var6,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7
   ) {
      double var8 = var7.bridge$renderPosX();
      double var10 = var7.bridge$renderPosY();
      double var12 = var7.bridge$renderPosZ();

      for (int var14 = 0; var14 < var2; var14++) {
         int var15 = var3[var14];
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var16 = var4[var15];
         if (var16 != null) {
            int var17 = var16.bridge$getX();
            int var18 = var16.bridge$getY();
            int var19 = var16.bridge$getZ();
            short var20 = var5[var15];
            int var21 = (var20 >> 8 & 15) + var17;
            int var22 = (var20 >> 4 & 15) + var18;
            int var23 = (var20 & 15) + var19;
            byte var24 = var6[var15];
            byte var25 = (byte)(var24 >> 4 & 15);
            byte var26 = (byte)(var24 & 15);
            double var27 = var21 - var8;
            double var29 = var22 + 1.01 - var10;
            double var31 = var23 - var12;
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var27, var29, var31, var25, var26);
         }
      }
   }

   private short[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(short[] var1, short[] var2, int var3, int var4) {
      int var5 = var1.length;
      int var6 = var3 + var4;
      if (var6 > var5) {
         short[] var7 = new short[var6 * 3 / 2];
         System.arraycopy(var1, 0, var7, 0, var5);
         var1 = var7;
      }

      System.arraycopy(var2, 0, var1, var3, var4);
      return var1;
   }

   private byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, byte[] var2, int var3, int var4) {
      int var5 = var1.length;
      int var6 = var3 + var4;
      if (var6 > var5) {
         byte[] var7 = new byte[var6 * 3 / 2];
         System.arraycopy(var1, 0, var7, 0, var5);
         var1 = var7;
      }

      System.arraycopy(var2, 0, var1, var3, var4);
      return var1;
   }

   private short[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(short[] var1, short var2, int var3) {
      int var4 = var1.length;
      if (var3 >= var4) {
         short[] var5 = new short[var4 * 3 / 2];
         System.arraycopy(var1, 0, var5, 0, var4);
         var1 = var5;
      }

      var1[var3] = var2;
      return var1;
   }

   private byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, byte var2, int var3) {
      int var4 = var1.length;
      if (var3 >= var4) {
         byte[] var5 = new byte[var4 * 3 / 2];
         System.arraycopy(var1, 0, var5, 0, var4);
         var1 = var5;
      }

      var1[var3] = var2;
      return var1;
   }

   private int[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var1, int var2, int var3) {
      int var4 = var1.length;
      if (var3 >= var4) {
         int[] var5 = new int[var4 * 3 / 2];
         System.arraycopy(var1, 0, var5, 0, var4);
         var1 = var5;
      }

      var1[var3] = var2;
      return var1;
   }

   private <T> T[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T[] var1, T var2, int var3) {
      int var4 = var1.length;
      if (var3 >= var4) {
         var1 = Arrays.copyOf(var1, var4 * 3 / 2);
      }

      var1[var3] = var2;
      return (T[])var1;
   }

   private <T> T[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T[] var1, T var2, int var3, int var4) {
      int var5 = var1.length;
      int var6 = var3 + var4;
      if (var6 > var5) {
         var1 = Arrays.copyOf(var1, var6 * 3 / 2);
      }

      Arrays.fill(var1, var3, var3 + var4, var2);
      return (T[])var1;
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCIHRCCCIOCCHOCHHHOHHRROCRCICC;
      private int[] IIRHIHOCHOHHRIIHICROCHHOHOORRR = new int[500];
      private int OICOICRIHCRRCIOCOICRROIIIOIRCC = 0;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] CRHRRHCCIRHICCCRIRHRHCRIICIICH = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[75000];
      private short[] COCCCHORHHIOHROICCIHCOIHOROCHI = new short[75000];
      private byte[] HICCHORRCIRRICOHRIIHRROCOICCHH = new byte[75000];
      private int ROCHOIHIRHCIIOOIOHCORRHCRRIHRH = 0;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }
   }

   @FunctionalInterface
   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      boolean isBlockVisible(int var1, int var2, int var3);
   }
}
