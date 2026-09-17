package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.objects.Object2DoubleOpenHashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.Nullable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH<ID, Context> extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<ID, Context, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<ID>> {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      super(var1);
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<ID> HIIIIOHCIORHHCRCIOCRRIIOCOIRHO() {
      return new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
         this.OOHCCRCRRORIICIICRRRHOIOHIOHRO()
      );
   }

   protected int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1
      );
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable Context var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      double var3,
      double var5,
      double var7,
      long var9
   ) {
      if (!this.IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1)) {
         if (!this.RCHICRHOICCIICRORRHIRRHOCIRCOO.isEmpty()) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = this.HHOOICHICHHOIIRIIOOCHOOHICHRIO
               .RHRIRHHIOCCHRIOHCIOHOCOIOHHIOI();
            if (var11 != null) {
               var2.bridge$pushPose();
               RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
                  .HRICOCOIOCCCICCIORHIIIIOROCOHC();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var12 = var13.RCIHOCCIROCOIOOCCOHICRIIRIIROI()
                  .bridge$copy();
               var12.bridge$multiply(var2.bridge$last().bridge$pose());
               CRHROHHHCIHHCOHCOORCRIHHIICROR var14 = this.HHOOICHICHHOIIRIIOOCHOOHICHRIO.HIOCRIRHCICROIHOHOCCRIRHRHICOR();
               if (var14 != null) {
                  com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = this.OOHCCRCRRORIICIICRRRHOIOHIOHRO();
                  Object var16 = var15.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var14);
                  this.CRCHCHIICCCOCOCIICRHIHRICCHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, (ID)var16);
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$getLevelRenderer();
                  int var18 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13);
                  HashSet var19 = new HashSet();

                  for (Entry var21 : this.COCCRHRCOHCOOOIHCIRRHROOCIHRHO.entrySet()) {
                     Object var22 = var21.getKey();
                     com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var23 = (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var21.getValue();
                     if (var23 == null) {
                        this.CRCHCHIICCCOCOCIICRHIHRICCHCHH.IHIIIRHOOCHRCCCCIORIROCOIRRHCC((ID)var22);
                     } else if (!this.CRCHCHIICCCOCOCIICRHIHRICCHCHH.HRRHRCCOOIOIIIRORIOOORORHOORIH((ID)var22)) {
                        if (var17 != null && var23.ICIRICHHROHIROORIHROCHHCIRCHRI()) {
                           if (var15.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var16, var23.RIORHRCCRHRCRCOIOCHCHIIRHIIIRR())) {
                              var19.add(var22);
                              continue;
                           }

                           if (this.CRCHCHIICCCOCOCIICRHIHRICCHCHH
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 (ID)var22, var5x -> var15.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var16, var23.RIORHRCCRHRCRCOIOCHCHIIRHIIIRR(), var18)
                              )) {
                              continue;
                           }
                        }

                        if (!this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((ID)var22, (ID)var16)) {
                           this.CRCHCHIICCCOCOCIICRHIHRICCHCHH.IHIIIRHOOCHRCCCCIORIROCOIRRHCC((ID)var22);
                        } else {
                           var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23);
                        }
                     }
                  }

                  Object2DoubleOpenHashMap var33 = new Object2DoubleOpenHashMap();
                  boolean var34 = this.IHOIOCORCICORROIHRHIORRIHRICCO();

                  for (Entry var36 : this.RCHICRHOICCIICRORRHIRRHOCIRCOO.entrySet()) {
                     IRRCCOICORICIHCHRHIHIHROIRHOCR var24 = (IRRCCOICORICIHCHRHIHIHROIRHOCR)var36.getKey();
                     boolean var25 = true;
                     Map var26 = (Map)var36.getValue();

                     for (Object var28 : this.CRCHCHIICCCOCOCIICRHIHRICCHCHH) {
                        if (!var19.contains(var28)) {
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var29 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var26.get(
                              var28
                           );
                           if (var29 != null) {
                              RORCHCIIICOHIRROOORHOCCCCIOCCI var30 = var15.IIOCHOIICCIORCOROIROHICCHIOHIC(var28);
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var31 = var12.bridge$copy();
                              if (var34) {
                                 com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    var24,
                                    this.HHOOICHICHHOIIRIIOOCHOOHICHRIO.HRRRCROORHIIROROORICHCOHOOIHCO() ? var14 : null,
                                    var30,
                                    var29,
                                    () -> var33.computeIfAbsent(var28, var2xx -> {
                                       RORCHCIIICOHIRROOORHOCCCCIOCCI var3xx = var15.IOIOHIORIROHRRCOOOHCROHORCOIIH(var2xx);
                                       return var14.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var3xx.bridge$getX(), var3xx.bridge$getY(), var3xx.bridge$getZ());
                                    }),
                                    var9,
                                    false,
                                    true
                                 );
                              }

                              com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 var3, var5, var7, var30, var31
                              );
                              if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 22) {
                                 var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    this.IHIRCORCCOCRCHRHIOIIRIOOROCCII(),
                                    var24,
                                    () -> com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                       var31, var24, var29
                                    ),
                                    var25
                                 );
                              } else {
                                 com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var32 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                                    var31
                                 );
                                 var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    this.IHIRCORCCOCRCHRHIOIIRIOOROCCII(),
                                    var24,
                                    () -> com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                       var32, var31, var24, var29
                                    ),
                                    var25
                                 );
                              }

                              if (var25) {
                                 var25 = false;
                              }
                           }
                        }
                     }
                  }

                  var2.bridge$popPose();
                  this.CRCHCHIICCCOCOCIICRHIHRICCHCHH.IHCHCOCCRRRCCHHCRHRRRHOIOROHCO();
               }
            }
         }
      }
   }
}
