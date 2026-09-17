package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IROCHOHCORHCOCCCOCHORCICRORIIC;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.title.Title;
import java.util.HashSet;
import java.util.Set;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final Set<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ICOORRHOOCCROHIHIHIROROCIOHCCO = new HashSet<>();

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ICOORRHOOCCROHIHIHIROROCIOHCCO.add(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Title var2,
      int var3,
      float var4,
      float var5,
      float var6,
      float var7,
      boolean var8,
      boolean var9,
      boolean var10
   ) {
      if (var2 != null) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var12 = var11.bridge$getGuiIngame();
         float var13 = var3 - var1.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR();
         int var14 = 255;
         if (!var8) {
            Title.Times var15 = var2.times();
            int var16 = (int)(var15.fadeIn().toMillis() / 50L);
            int var17 = (int)(var15.stay().toMillis() / 50L);
            int var18 = (int)(var15.fadeOut().toMillis() / 50L);
            if (var3 > var18 + var17) {
               float var19 = var16 + var17 + var18 - var13;
               var14 = (int)(var19 * 255.0F / var16);
            }

            if (var3 <= var18) {
               var14 = (int)(var13 * 255.0F / var18);
            }

            var14 = com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(
               var14, 0, 255
            );
         }

         if (var14 > 8) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var23 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
            var1.push();
            var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4 + var6 / 2.0F, var5 + var7 / 2.0F, 0.0F);
            float var24 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(
                  var2.subtitle(), var23
               )
               / 2.0F;
            var1.scale(2.0F, 2.0F, 2.0F);
            float var26 = 1.0F;
            if (!var8 && var2.equals(var12.bridge$getTitle())) {
               var26 = var12.bridge$getTitleScale();
            }

            var1.scale(var26, var26, var26);
            int var27 = var14 << 24 & 0xFF000000;
            if (var10) {
               int var28 = 16777215;

               for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var21 : this.ICOORRHOOCCROHIHIHIROROCIOHCCO) {
                  Integer var22 = var21.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var2.subtitle());
                  if (var22 != null) {
                     var28 = var22;
                     break;
                  }
               }

               var28 &= 16777215;
               Component var32 = var2.subtitle();
               if (var28 != 16777215) {
                  var32 = Component.text(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var32)
                     )
                  );
               }

               if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH()) {
                  var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var32, -var24, 7.0F, var28 | var27, true);
               } else {
                  if (var28 == 16777215) {
                     var28 = var2.subtitle().colorIfAbsent(NamedTextColor.WHITE).color().value();
                  }

                  var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var32, -var24, 7.0F, var28 | var27, true);
               }
            }

            if (var9) {
               var1.scale(2.0F, 2.0F, 2.0F);
               var24 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(
                     var2.title(), var23
                  )
                  / 2.0F;
               int var30 = 16777215;

               for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var35 : this.ICOORRHOOCCROHIHIHIROROCIOHCCO) {
                  Integer var36 = var35.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.title(), null);
                  if (var36 != null) {
                     var30 = var36;
                     break;
                  }
               }

               var30 &= 16777215;
               Component var34 = var2.title();
               if (var30 != 16777215) {
                  var34 = Component.text(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var34)
                     )
                  );
               }

               if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH()) {
                  var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var34, -var24, -8.75F, var30 | var27, true);
               } else {
                  if (var30 == 16777215) {
                     var30 = var2.title().colorIfAbsent(NamedTextColor.WHITE).color().value();
                  }

                  var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var34, -var24, -8.75F, var30 | var27, true);
               }
            }

            var1.pop();
         }
      }
   }
}
