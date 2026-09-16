package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableMap;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<CORCOCICIRIOHROHROIIOOHICCHCRR> {
   public static final Map<String, String> HROIHCCIHHIOHRCCHOIOHHIICHCCCR = ImmutableMap.builder()
      .put("entityhorse", "horse")
      .put("pigzombie", "zombie_pigman")
      .put("cavespider", "cave_spider")
      .put("lavaslime", "magma_cube")
      .put("enderdragon", "ender_dragon")
      .put("witherboss", "wither")
      .put("mushroomcow", "mooshroom")
      .put("snowman", "snow_golem")
      .put("ozelot", "ocelot")
      .put("villagergolem", "iron_golem")
      .build();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, double var2, double var4, float var6, float var7, CORCOCICIRIOHROHROIIOOHICCHCRR var8
   ) {
      super(var1, var2, var4, var6, var7, var8);
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      float var3,
      float var4,
      float var5
   ) {
      var1.push();
      var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4, var5, 0.0F);
      var1.IIHRRHORCRCROCHHOHORCHCROCIHRO(-var3);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOCCIIIIHIHCORCROIIHCIOIORRHHR(), var2, var1, this.IHIOIOIHRRIRCHOOIIOOICHIROCIHR(), var3);
      var1.pop();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      CRRRICCRROCOHHOHIICIHORCOORRRH var4,
      float var5
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var1.CIOICRHHHIOIRRCHICCHHIHHOROHIR().get();
      boolean var7 = var4 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
      if (!var7 || IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData() == null) {
         if (var6.needsRotation) {
            var3.push();
            var3.IIHRRHORCRCROCHHOHORCHCROCIHRO(var5);
            var3.IIHRRHORCRCROCHHOHORCHCROCIHRO((float)var4.bridge$getRotationYaw());
         }

         float var8 = var1.HICOCHHCCIIIIIHOHRIRRORHCOHCIH().get();
         int var9 = var4.bridge$getSpawnEggColor(0);
         if (var9 == -1) {
            var9 = 0;
         }

         var9 = var9 & 16777215 | (int)(var1.CROHCIOORRCROCHCICHCCRHROCRCOI().get() * 255.0F) << 24;
         int var10 = var4.bridge$getSpawnEggColor(1);
         if (var10 == -1) {
            var10 = 0;
         }

         var10 = var10 & 16777215 | (int)(var1.CROHCIOORRCROCHCICHCCRHROCRCOI().get() * 255.0F) << 24;
         if (var6 == RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIRCLE) {
            if (var1.CHICOCHOHCCHIOHHHOOHRCCHRRORII().get()) {
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3, 0.0, 0.0, var8 + 0.5F, var10);
            }

            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3, 0.0, 0.0, var8, var9);
         } else if (var6 == RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRIANGLE) {
            float var11 = var8 / 5.0F * 8.0F;
            if (var1.CHICOCHOHCCHIOHHHOOHRCCHRRORII().get()) {
               var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var8 + 0.5F, var11 + 0.5F, var10);
            }

            var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var8, var11, var9);
         } else if (var6 == RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HEAD) {
            String var18 = this.IHIOIOIHRRIRCHOOIIOOICHIROCIHR().bridge$getType();
            if (var18 != null || var7) {
               if (!var7
                  && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH()
                  && HROIHCCIHHIOHRCCHOIOHHIICHCCCR.containsKey(var18)) {
                  var18 = HROIHCCIHHIOHRCCHOIOHHIICHCCCR.get(var18);
               }

               RCIROOOOICRHCCRRCIORHHIRCOIIIC var12;
               if (var7) {
                  var12 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4)
                     .bridge$getServerSkinTexture();
               } else {
                  var12 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "mobs/" + var18 + ".png");
               }

               if (var12 != null) {
                  int var13 = 16777215
                     | (int)(
                           RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(
                                 1.0F - (float)Math.abs(var4.bridge$getPosY() - var2.bridge$getPosY()) / 20.0F, 0.0F, 1.0F
                              )
                              * 255.0F
                        )
                        << 24;
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH var14 = var1.HICOCHHCCIIIIIHOHRIRRORHCOHCIH()
                     .RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH);
                  float var15 = var1.HICOCHHCCIIIIIHOHRIRRORHCOHCIH().get() / var14.getMax().floatValue() * 2.0F;
                  var3.push();
                  var3.scale(var15, var15, 1.0F);
                  var3.CRICCOOHHHCHOORCICOCOHIHOIRHOO(-4.0F, -4.0F, 0.0F);
                  if (var7) {
                     RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var12, 0.0F, 0.0F, var13, true);
                  } else {
                     RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var12, -4.0F, -4.0F, 8.0F, 8.0F, 0.0F, 0.0F, 1.0F, 1.0F, var13);
                  }

                  var3.pop();
               }
            }
         }

         if (var6.needsRotation) {
            var3.pop();
         }
      }
   }

   @Nullable
   @Override
   public LinkedHashMap<String, Runnable> IHICOOCCOIHOOCIHOOHHCIIHOHICCI() {
      return null;
   }
}
