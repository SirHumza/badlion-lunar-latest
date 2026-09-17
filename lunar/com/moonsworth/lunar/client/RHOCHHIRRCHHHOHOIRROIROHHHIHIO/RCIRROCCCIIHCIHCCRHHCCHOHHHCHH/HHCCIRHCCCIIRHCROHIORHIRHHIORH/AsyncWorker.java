package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Math;
import org.joml.Vector3d;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH,
   com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO HIHRHRRHICCIHCCOCRCHIORORCIRIH;
   private final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HCRIROROOHOIIOIIRIIRICCRIHHIOH;
   @NotNull
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHICICCIIIOIRRRHRRCOIHHIIOCOCO;
   private final com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHROCRCCCOOOCIOCIHIRRCHIRCIICH;
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCRIHIOOOORICIRCIRORCIRIRHIRCI;
   private final Vector3d RCORIOICIRORRHRCHOOOIHCCRRCCCI = new Vector3d();
   private final Vector3d OCICCHRIIRHCOIHROCOHICCIROOOOI = new Vector3d();
   private final Vector3d ROIOHHIHOHHRRRCHCHCOHHHHORRRCR = new Vector3d();
   private final Random CCCHOHCIHHCRIRRHHCRHROIOIIICHI;
   private float yaw;
   private float HRIROIRRIRIICOHCHORRCICROHIOCI;
   private float RCCRIOOCCCORROICHOIOOCROROHRCO;
   @Nullable
   private Vector3d COCROORHIICCORRHHCOROHRHCHHRIR = null;
   private float OHCOIHRHHCHRRRIORRRORCCRHOHICH = Float.MAX_VALUE;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH OOCIIICCCOOIORHHRHRCRRIRRICOIC;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIHCHIRORROOHHCIRRCHRICOCRRIOC;
   private double IHIHRRRCCROIRRCCCIIHIHIOIRIOHC;
   private int RORICICCCRHICHICIOOOOOCCIIHHIO;
   private float fallDistance;
   private boolean onGround;
   private int RHIIOIRRRIOCOCOIRRHRHCROHCRHCH;
   private boolean RIORROOOCOICHCOIHRROOOIRIIIORI = true;
   private int OIRIOOHIRRHCCOHHOOORRIRCRIRORC;
   @Nullable
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIROOCIHOICOHHOHHHOOCIIHHRCRRR;
   @Nullable
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORHIHRHOCCOROCOICOHORCHIRORIIC;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      @NotNull RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3,
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4,
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5
   ) {
      this.HIHRHRRHICCIHCCOCRCHIORORCIRIH = var2;
      this.HCRIROROOHOIIOIIRIIRICCRIHHIOH = var3;
      this.HHICICCIIIOIRRRHRRCOIHHIIOCOCO = var1;
      this.IHROCRCCCOOOCIOCIHIRRCHIRCIICH = var4;
      this.OCRIHIOOOORICIRCIRORCIRIRHIRCI = var5;
      this.CCCHOHCIHHCRIRRHHCRHROIOIIICHI = new Random(0L);
      this.ROORHICROORIRHCCOOHORCCICRIORO(true);
   }

   public void ROORHICROORIRHCCOOHORCCICRIORO(boolean var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (var2 != null) {
         long var3 = var2.bridge$getGameTime() >> 7;
         if (!var1 && var3 % 10L != 5L) {
            return;
         }

         this.CCCHOHCIHHCRIRRHHCRHROIOIIICHI
            .setSeed(Objects.hash(this.HCRIROROOHOIIOIIRIIRICCRIHHIOH.RCOCIIHHOIHOOCCCIICCRHHRRCCCCH(), var3, this.HHICICCIIIOIRRRHRRCOIHHIIOCOCO.hashCode()));
      } else if (var1) {
         this.CCCHOHCIHHCRIRRHHCRHROIOIIICHI.setSeed(ThreadLocalRandom.current().nextLong());
      }
   }

   public void IOIIOCROCRROCOIHIOHHORCCHICRIO() {
      this.fallDistance = 0.0F;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (this.RIORROOOCOICHCOIHRROOOIRIIIORI) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$getGameTime() % 4L == 0L
            && this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH(), this.HHICICCIIIOIRRRHRRCOIHHIIOCOCO, 0, 4, 2
            )) {
            this.RIORROOOCOICHCOIHRROOOIRIIIORI = false;
         }
      } else {
         this.RORICICCCRHICHICIOOOOOCCIIHHIO++;
         this.ROORHICROORIRHCCOOHORCCICRIORO(false);
         if (this.RHIIOIRRRIOCOCOIRRHRHCROHCRHCH > 0) {
            this.RHIIOIRRRIOCOCOIRRHRHCROHCRHCH--;
         }

         this.HRIROIRRIRIICOHCHORRCICROHIOCI = this.yaw;
         if (this.OHCOIHRHHCHRRRIORRRORCCRHOHICH != Float.MAX_VALUE) {
            float var2 = wrapDegrees(this.OHCOIHRHHCHRRRIORRRORCCRHOHICH - this.yaw);
            if (Math.abs(var2) > 0.001F) {
               float var3 = java.lang.Math.copySign(this.RCCRIOOCCCORROICHOIOOCROROHRCO, var2);
               if (Math.abs(var3) >= Math.abs(var2)) {
                  this.yaw = wrapDegrees(this.OHCOIHRHHCHRRRIORRRORCCRHOHICH);
                  this.OHCOIHRHHCHRRRIORRRORCCRHOHICH = Float.MAX_VALUE;
               } else {
                  this.yaw = wrapDegrees(this.yaw + var3);
               }
            } else {
               this.yaw = wrapDegrees(this.OHCOIHRHHCHRRRIORRRORCCRHOHICH);
               this.OHCOIHRHHCHRRRIORRRORCCRHOHICH = Float.MAX_VALUE;
            }
         }

         if (this.COCROORHIICCORRHHCOROHRHCHHRIR != null) {
            Vector3d var42 = new Vector3d(this.COCROORHIICCORRHHCOROHRHCHHRIR).sub(this.RCORIOICIRORRHRCHOOOIHCCRRCCCI);
            if (this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.OOOIHIIHORIOCOHCROHICCHHHRROOI()) {
               double var44 = Math.sqrt(var42.x * var42.x + var42.z * var42.z);
               if (var44 > 0.1) {
                  this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.x = var42.x / var44 * this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC;
                  this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.z = var42.z / var44 * this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC;
               } else if (var44 <= 1.0E-5) {
                  this.COCROORHIICCORRHHCOROHRHCHHRIR = null;
               }
            } else {
               this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.set(var42.normalize().mul(this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC));
            }
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var43 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
         if (var43 == null || !var43.bridge$isBlockLoaded(this.OOCIIICCCOOIORHHRHRCRRIRRICOIC)) {
            this.RIORROOOCOICHCOIHRROOOIRIIIORI = true;
         }

         if (!this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.OOOIHIIHORIOCOHCROHICCHHHRROOI()) {
            this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR);
            this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.set(0.0);
         } else {
            switch (this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.RRIRORCCIORRHCOCCRHCOOCROOCHHR()) {
               case GROUND:
                  if (!this.CCIOIIHRIOHRCHOHRICHRIIOORIIHI()) {
                     this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.y -= 0.08;
                  } else {
                     this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var43);
                  }
                  break;
               case FLYING:
                  if (this.CCIOIIHRIOHRCHOHRICHRIIOORIIHI()) {
                     this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var43);
                  }
            }

            Vector3d var45 = this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR;
            double var4 = var45.lengthSquared();
            if (var4 > 1.0E-6 || this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.lengthSquared() - var4 < 1.0E-6) {
               if (var43 == null) {
                  this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var45);
               } else {
                  double var6 = var45.x;
                  double var8 = var45.y;
                  double var10 = var45.z;
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = this.OIIHICRIICHCHIROIOHRRCHICOCOCO();
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = var12.bridge$expand(
                     var6, var8, var10
                  );
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5) {
                     var13 = var13.bridge$expand(0.0, -1.0, 0.0);
                     if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
                        var13 = var13.RRCRRCORICCHOHHIRCHIROOHIIOHCO(0.5);
                     }
                  }

                  List var14 = var43.bridge$getBlockCollisionBoxes(null, var13);
                  double var15 = var6;
                  double var17 = var8;
                  double var19 = var10;

                  for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 : var14) {
                     var8 = var22.bridge$calculateYOffset(var12, var8);
                  }

                  var12 = var12.bridge$offset(0.0, var8, 0.0);

                  for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var52 : var14) {
                     var6 = var52.bridge$calculateXOffset(var12, var6);
                  }

                  var12 = var12.bridge$offset(var6, 0.0, 0.0);

                  for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var53 : var14) {
                     var10 = var53.bridge$calculateZOffset(var12, var10);
                  }

                  var12 = var12.bridge$offset(0.0, 0.0, var10);
                  double var51 = this.bridge$getWidth() * 0.5;
                  double var23 = var12.bridge$getMinX() + var51;
                  double var25 = var12.bridge$getMinY();
                  double var27 = var12.bridge$getMinZ() + var51;
                  this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var23, var25, var27);
                  boolean var29 = var17 != var8;
                  boolean var30 = var15 != var6 || var19 != var10;
                  if (var29) {
                     this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.y = 0.0;
                     this.onGround = var17 <= 0.0;
                     if (this.onGround) {
                        this.IOIIOCROCRROCOIHIOHHORCCHICRIO();
                     }
                  } else {
                     this.onGround = false;
                     if (var8 < 0.0) {
                        this.fallDistance += (float)(-var8);
                     }
                  }

                  if (var30 && this.COCROORHIICCORRHHCOROHRHCHHRIR != null) {
                     if (this.RHIIOIRRRIOCOCOIRRHRHCROHCRHCH != 0
                        || !this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.HROHHHHORCCRIIIOOCOCCOICRCIORI()
                        || !(this.COCROORHIICCORRHHCOROHRHCHHRIR.y >= this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y + 0.1)
                        || !this.onGround && !this.CCIOIIHRIOHRCHOHRICHRIIOORIIHI()) {
                        if (this.RIIRRIORRHICOCCIHOHHCIRRHOORHR() > 0.0F && this.onGround) {
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var31 = var12.bridge$expand(
                              this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.x, this.RIIRRIORRHICOCCIHOHHCIRRHOORHR(), this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.z
                           );
                           List var32 = var43.bridge$getBlockCollisionBoxes(null, var31);
                           float[] var33 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var31, var32, this.RIIRRIORRHICOCCIHOHHCIRRHOORHR());

                           for (float var37 : var33) {
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var38 = var12.bridge$offset(
                                 this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.x, var37, this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.z
                              );
                              boolean var39 = true;

                              for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var41 : var32) {
                                 if (var38.bridge$intersectsWith(var41)) {
                                    var39 = false;
                                    break;
                                 }
                              }

                              if (var39) {
                                 this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                                    this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x + this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.x,
                                    this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y + var37,
                                    this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z + this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.z
                                 );
                                 break;
                              }
                           }
                        }
                     } else {
                        this.IOCCIORICRHHIHCRCRHOHRRRIIICHO();
                     }
                  }

                  if (var15 != var6) {
                     this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.x = 0.0;
                  }

                  if (var19 != var10) {
                     this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.z = 0.0;
                  }
               }
            }

            this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.mul(this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.OOHCHROIHROOOHOCHCHOHCIIOOHOCC());
            if (this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.length() <= 1.0E-5) {
               this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.set(0.0);
            }
         }
      }
   }

   private float[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2,
      float var3
   ) {
      FloatArraySet var4 = new FloatArraySet(2);

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var2) {
         float var7 = (float)(var6.bridge$getMaxY() - var1.bridge$getMinY());
         if (var7 > 0.0F && var7 <= var3) {
            var4.add(var7);
         }
      }

      return var4.toFloatArray();
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      if (var1 != null
         && this.OOCIIICCCOOIORHHRHRCRRIRRICOIC != null
         && var1.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.OOCIIICCCOOIORHHRHRCRRIRRICOIC.bridge$above()).bridge$isWater()) {
         this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.y += 0.02;
      } else if (this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y - (int)this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y <= 1.0F - this.bridge$getEyeHeight()) {
         this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.y += 0.005;
      }
   }

   public void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(float var1) {
      this.OHCOIHRHHCHRRRIORRRORCCRHOHICH = wrapDegrees(var1);
   }

   public void RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(double var1, double var3, double var5) {
      if (this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x != var1
         || this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y != var3
         || this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z != var5
         || this.OOCIIICCCOOIORHHRHRCRRIRRICOIC == null) {
         this.OCICCHRIIRHCOIHROCOHICCIROOOOI.set(this.RCORIOICIRORRHRCHOOOIHCCRRCCCI);
         this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.set(var1, var3, var5);
         this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, var3, var5);
      } else if (this.OCICCHRIIRHCOIHROCOHICCIROOOOI.x != var1
         || this.OCICCHRIIRHCOIHROCOHICCIROOOOI.y != var3
         || this.OCICCHRIIRHCOIHROCOHICCIROOOOI.z != var5) {
         this.OCICCHRIIRHCOIHROCOHICCIROOOOI.set(var1, var3, var5);
      }
   }

   public void setPos(double var1, double var3, double var5) {
      if (this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x != var1
         || this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y != var3
         || this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z != var5
         || this.OOCIIICCCOOIORHHRHRCRRIRRICOIC == null) {
         this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.set(var1, var3, var5);
         this.OCICCHRIIRHCOIHROCOHICCIROOOOI.set(this.RCORIOICIRORRHRCHOOOIHCCRRCCCI);
         this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, var3, var5);
      }
   }

   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(double var1, double var3, double var5) {
      this.setPos(this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x + var1, this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y + var3, this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z + var5);
   }

   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Vector3d var1) {
      this.setPos(
         this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x + var1.x, this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y + var1.y, this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z + var1.z
      );
   }

   private void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(double var1, double var3, double var5) {
      int var7 = (int)Math.floor(var1);
      int var8 = (int)Math.floor(var3);
      int var9 = (int)Math.floor(var5);
      if (this.OOCIIICCCOOIORHHRHRCRRIRRICOIC == null
         || var7 != this.OOCIIICCCOOIORHHRHRCRRIRRICOIC.bridge$getX()
         || var8 != this.OOCIIICCCOOIORHHRHRCRRIRRICOIC.bridge$getY()
         || var9 != this.OOCIIICCCOOIORHHRHRCRRIRRICOIC.bridge$getZ()) {
         this.OOCIIICCCOOIORHHRHRCRRIRRICOIC = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var8, var9);
         this.OIHCHIRORROOHHCIRRCHRICOCRRIOC = null;
      }
   }

   @Override
   public float bridge$ageInTicks() {
      return this.RORICICCCRHICHICIOOOOOCCIIHHIO;
   }

   public double RCRHHOICCRHCOHCOOCCROOCHCIRHIR() {
      return this.OCICCHRIIRHCOIHROCOHICCIROOOOI.x;
   }

   public double HHRIICIORCHIRROIROOCORIOORIRCH() {
      return this.OCICCHRIIRHCOIHROCOHICCIROOOOI.y;
   }

   public double CIICHHRHIOHORCCRIHCOHOOIRIRCCC() {
      return this.OCICCHRIIRHCOIHROCOHICCIROOOOI.z;
   }

   @Override
   public double bridge$getPosX() {
      return this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x;
   }

   @Override
   public double bridge$getPosY() {
      return this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.y;
   }

   @Override
   public double bridge$getPosZ() {
      return this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z;
   }

   @Override
   public double bridge$getMotionX() {
      return this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.x;
   }

   @Override
   public double bridge$getMotionY() {
      return this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.y;
   }

   @Override
   public double bridge$getMotionZ() {
      return this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.z;
   }

   public float getYaw() {
      return this.yaw;
   }

   public float getPitch() {
      return 0.0F;
   }

   @Override
   public float bridge$getEyeHeight() {
      return this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.RIOCHCICOIHOCCRIRRCHIIHCHIIIOO();
   }

   @Override
   public double bridge$distanceToCameraSq() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.IHRHHIOIIICOROOORIOHCIROIRCOHH()
            .bridge$getCamera()
            .orElse(null);
         if (var1 != null) {
            return this.getDistanceSq(var1.bridge$getPosX(), var1.bridge$getPosY(), var1.bridge$getPosZ());
         }
      }

      return this.COOCCHICCCIIICRHIOCOCIOOORCOCC(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
   }

   @Nullable
   @Override
   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getPassengerOffset(@Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return null;
   }

   @Override
   public boolean bridge$isInvisible() {
      return this.RIORROOOCOICHCOIHRROOOIRIIIORI || this.HHICICCIIIOIRRRHRRCOIHHIIOCOCO.bridge$isInvisible();
   }

   @Override
   public float bridge$getWidth() {
      return this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.IIOOHOCOROOHHOOOOOICIIOROOIHHO();
   }

   @Override
   public float bridge$getHeight() {
      return this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.ICHIRIORCRORCCRIIRCOIRIOHRRCRC();
   }

   @Override
   public boolean bridge$isVisiblyCrouching() {
      return false;
   }

   @Override
   public boolean bridge$isDiscrete() {
      return false;
   }

   @Nullable
   @Override
   public Component bridge$getCustomName() {
      return null;
   }

   @Nullable
   @Override
   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getNameTagAttachment() {
      return null;
   }

   @Nullable
   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH HHIRHRHIORICHOHOCOICCRCCIRHIOO() {
      return this.OOCIIICCCOOIORHHRHRCRRIRRICOIC;
   }

   private boolean RHIRCCRHHRRRRRRORRRHCRORHRHCII() {
      if (this.OIHCHIRORROOHHCIRRCHRICOCRRIOC == null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
         if (var1 == null || this.OOCIIICCCOOIORHHRHRCRRIRRICOIC == null) {
            return true;
         }

         this.OIHCHIRORROOHHCIRRCHRICOCRRIOC = var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(this.OOCIIICCCOOIORHHRHRCRRIRRICOIC);
      }

      return false;
   }

   @Override
   public boolean bridge$isOnFire() {
      return this.RHIRCCRHHRRRRRRORRRHCRORHRHCII() ? false : this.OIHCHIRORROOHHCIRRCHRICOCRRIOC.bridge$getBlock().bridge$isFire();
   }

   @Override
   public int bridge$getEntityId() {
      return this instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var1 ? var1.bridge$getEntityId() : -1;
   }

   @Override
   public boolean isInWater() {
      return this.RHIRCCRHHRRRRRRORRRHCRORHRHCII() ? false : this.OIHCHIRORROOHHCIRRCHRICOCRRIOC.bridge$getBlock().bridge$isWater();
   }

   @Override
   public boolean CCIOIIHRIOHRCHOHRICHRIIOORIIHI() {
      if (this.RHIRCCRHHRRRRRRORRRHCRORHRHCII()) {
         return false;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.OIHCHIRORROOHHCIRRCHRICOCRRIOC
         .bridge$getBlock();
      return var1.bridge$isWater() || var1.bridge$isBubbleColumn();
   }

   @Override
   public boolean HHICIORROHIIIOIICORIRCORICOCOO() {
      return this.onGround;
   }

   public void IOCCIORICRHHIHCRCRHOHRRRIIICHO() {
      if (this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.OOOIHIIHORIOCOHCROHICCHHHRROOI()) {
         this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.y = this.CCIOIIHRIOHRCHOHRICHRIIOORIIHI() ? 0.2 : 0.6;
         this.onGround = false;
         this.IOIIOCROCRROCOIHIOHHORCCHICRIO();
         this.RHIIOIRRRIOCOCOIRRHRHCROHCRHCH = 20;
      }
   }

   @Override
   public float RIIRRIORRHICOCCIHOHHCIRRHOORHR() {
      return this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.OHHCCHIRIHROOOOICRHICCRORRRRCR();
   }

   @Override
   public float RRHOIHCOCIOIOIHORHORCORCIICCCH() {
      return this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.HCORHHOCHOHHIRRHIROIRIHRIICOHI();
   }

   @Override
   public double CCCOCOORHCOCCRIOOOIIORROCCCOOH() {
      return this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC;
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(Vector3d var1) {
      this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1.x, var1.z);
   }

   public void RHOCHHIRRCHHHOHOIRROIROHHHIHIO(double var1, double var3) {
      double var5 = this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.x() - var1;
      double var7 = this.RCORIOICIRORRHRCHOOOIHCCRRCCCI.z() - var3;
      double var9 = wrapDegrees((float)Math.toDegrees(Math.atan2(var7, var5)) + 90.0F);
      this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI((float)(360.0 - var9));
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return !var1.bridge$isChunkLoaded(var2.bridge$getX() >> 4, var2.bridge$getZ() >> 4)
         ? false
         : var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(var2).bridge$getBlock().bridge$isAir();
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3,
      int var4,
      int var5,
      int var6
   ) {
      boolean var7 = var3.bridge$getUniqueID().getLeastSignificantBits() == 0L;
      if ((var7 || var3.bridge$isOnGround())
         && (
            this.OCRIHIOOOORICIRCIRORCIRIRHIRCI.RRIRORCCIORRHCOCCRHCOOCROOCHHR() == RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FLYING
               || !var3.bridge$isFlying()
         )) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = var3.bridge$getBlockPos();

         for (int var9 = 0; var9 < 6; var9++) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this, var1, var8, var4, var5, var6
            );
            if (var10 != null && this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var10)) {
               this.setPos(var10.bridge$getX() + 0.5, var10.bridge$getY(), var10.bridge$getZ() + 0.5);
               this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR.set(0.0);
               this.COCROORHIICCORRHHCOROHRHCHHRIR = null;
               return true;
            }
         }
      }

      return false;
   }

   public double COOCCHICCCIIICRHIOCOCIOOORCOCC(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      double var2 = this.bridge$getPosX() - var1.bridge$getPosX();
      double var4 = this.bridge$getPosY() - var1.bridge$getPosY();
      double var6 = this.bridge$getPosZ() - var1.bridge$getPosZ();
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double getDistanceSq(double var1, double var3, double var5) {
      double var7 = this.bridge$getPosX() - var1;
      double var9 = this.bridge$getPosY() - var3;
      double var11 = this.bridge$getPosZ() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public static float wrapDegrees(float var0) {
      return ((var0 + 180.0F) % 360.0F + 360.0F) % 360.0F - 180.0F;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO IRIROICIRIHIROHOHOOROCRHRICOOC() {
      return this.HIHRHRRHICCIHCCOCRCHIORORCIRIH;
   }

   @Generated
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIHOOCCOHROICCHOIICOICRRHRCHRI() {
      return this.HCRIROROOHOIIOIIRIIRICCRIHHIOH;
   }

   @NotNull
   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OORHCIORORHOHHROIRROHIIOIHRCHH() {
      return this.HHICICCIIIOIRRRHRRCOIHHIIOCOCO;
   }

   @Generated
   public com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIHIIRROOHIHHRHOCHOIOIHIHIIORR() {
      return this.IHROCRCCCOOOCIOCIHIRRCHIRCIICH;
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CICIOHCIHROROIHOIOOCHHIRCRHORC() {
      return this.OCRIHIOOOORICIRCIRORCIRIRHIRCI;
   }

   @Generated
   public Vector3d IRIIRROHHRCROORCIOIORRCOOIOOIR() {
      return this.ROIOHHIHOHHRRRCHCHCOHHHHORRRCR;
   }

   @Generated
   @Override
   public Random HIOIOIRRCIOIOOCRHIRHIRHHCROORO() {
      return this.CCCHOHCIHHCRIRRHHCRHROIOIIICHI;
   }

   @Generated
   public float COIIOIIICCRIROCOIRRIOIROOOOIRR() {
      return this.HRIROIRRIRIICOHCHORRCICROHIOCI;
   }

   @Generated
   public float RROOHHCCIHOCROHHHICCIIICRCOIHH() {
      return this.RCCRIOOCCCORROICHOIOOCROROHRCO;
   }

   @Generated
   public void OCIOROHIHRROROOIRRHRRCCHHRRRHI(float var1) {
      this.RCCRIOOCCCORROICHOIOOCROROHRCO = var1;
   }

   @Generated
   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable Vector3d var1) {
      this.COCROORHIICCORRHHCOROHRHCHHRIR = var1;
   }

   @Nullable
   @Generated
   public Vector3d IICOROICOORCCRRIORRROOOHRRIIRH() {
      return this.COCROORHIICCORRHHCOROHRHCHHRIR;
   }

   @Generated
   public void RHRCRCIOIOICRHRCCROIICCRRCOOOI(float var1) {
      this.OHCOIHRHHCHRRRIORRRORCCRHOHICH = var1;
   }

   @Generated
   public float IRCOCHIORRIIIIORROIRHRRRHCHHHH() {
      return this.OHCOIHRHHCHRRRIORRRORCCRHOHICH;
   }

   @Generated
   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(double var1) {
      this.IHIHRRRCCROIRRCCCIIHIHIOIRIOHC = var1;
   }

   @Generated
   public float CROOOHCOOCOOCRRIOOROHRRCIHORCC() {
      return this.fallDistance;
   }

   @Generated
   public int OOHOHCRICIRHOHRHIRRROCHHOHIHOO() {
      return this.OIRIOOHIRRHCCOHHOOORRIRCRIRORC;
   }

   @Generated
   public void IOICHOCIHIIRROOHHRIHOCHOROOCCI(int var1) {
      this.OIRIOOHIRRHCCOHHOOORRIRCRIRORC = var1;
   }

   @Nullable
   @Generated
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI OCHORRRCHIRHRCHHOIHCOOCOCROIOC() {
      return this.RIROOCIHOICOHHOHHHOOCIIHHRCRRR;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      this.RIROOCIHOICOHHOHHHOOCIIHHRCRRR = var1;
   }

   @Nullable
   @Generated
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HROCIHRIOCRCRHCCCHRHRCRCRHHRCH() {
      return this.ORHIHRHOCCOROCOICOHORCHIRORIIC;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      this.ORHIHRHOCCOROCOICOHORCHIRORIIC = var1;
   }
}
