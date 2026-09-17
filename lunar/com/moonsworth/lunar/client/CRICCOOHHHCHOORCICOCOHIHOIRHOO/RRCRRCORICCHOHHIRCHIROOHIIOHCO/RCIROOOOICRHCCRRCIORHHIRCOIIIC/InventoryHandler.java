package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIROOOOICRHCCRRCIORHHIRCOIIIC;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.floats.FloatFloatPair;
import java.util.Collection;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final int HOCHRHRIHRHCCORCCIOHOHIRHCHHHC = 16;
   @NotNull
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORCHRRRHHICICICIHIRICOHRHOORHO;
   private final String RHHHROHCOCIHRRRORROICHHRIOHHHC;
   private long count;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(@NotNull RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ORCHRRRHHICICICIHIRICOHRHOORHO = var1;
      this.RHHHROHCOCIHRRRORROICHHRIOHHHC = this.ORCHRRRHHICICICIHIRICOHRHOORHO.toString();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
      float var3,
      float var4,
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
      boolean var6
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
      float var8 = var3;
      float var9 = var4;
      float var10 = 2.0F;
      if (var5 != IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         byte var11 = 8;
         float var12 = var7.OHRCIORHOCHOORCRHHOHRRRCCOICCO();
         float var13 = var12 / 2.0F;
         float var14 = var3;
         float var15 = var4 + 16.0F;
         String var16 = var6 ? this.RHHHROHCOCIHRRRORROICHHRIOHHHC : this.count + " " + this.RHHHROHCOCIHRRRORROICHHRIOHHHC;
         if (var6) {
            switch (var5) {
               case BOTTOM:
                  var8 = var3 + var7.bridge$getStringWidth(var16) / 2.0F - 8.0F;
                  break;
               case TOP:
                  var8 = var3 + var7.bridge$getStringWidth(var16) / 2.0F - 8.0F;
                  var9 = var4 + var12;
                  var15 = var4;
                  break;
               case LEFT:
                  var8 = var3 + var7.bridge$getStringWidth(var16) + var10;
                  var15 = var4 + 8.0F - var13;
                  break;
               case RIGHT:
                  var14 = var3 + 16.0F + var10;
                  var15 = var4 + 8.0F - var13;
                  break;
               default:
                  throw new IllegalStateException("Unknown text side " + var5);
            }
         } else {
            var14 = var3 + 1.0F;
            var15 = var4 + 1.0F;
         }

         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var16, var10 + var14, var10 + var15, -1, false);
      }

      if (var6) {
         var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var0 -> var0.HHIIOHOORHHCCHRHHRCIORCROORCOI()
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var0x -> {
                     var0x.HIOCCRCCCRICORCIIHHRIRROICHRIC();
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROIHROCROORRCCOIRRIHHORCROOORO()
                        .HOORHCHOCROIIROICHOORROHCOOCCI();
                  }
               )
         );
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.ORCHRRRHHICICICIHIRICOHRHOORHO.CCHIRIHIOHIRRIORROIHHRIROOHCOC(),
            (int)(var10 + var8 - 1.0F),
            (int)(var10 + var9 - 1.0F),
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         );
         var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var0 -> var0.HHIIOHOORHHCCHRHHRCIORCROORCOI()
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var0x -> {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROIHROCROORRCCOIRRIHHORCROOORO()
                        .RIOIHHOROOOHRHCIIHOORROCCICIRI();
                     var0x.IHCICHIIIHORHRIICHOHOHHOCHRORO();
                     var0x.ROORHICROORIRHCCOOHORCCICRIORO();
                  }
               )
         );
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var7, (int)(var10 + var8 - 1.0F), (int)(var10 + var9 - 1.0F));
      }
   }

   public FloatFloatPair RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2) {
      float var3 = 2.0F;
      if (var1 == IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         return var2 ? FloatFloatPair.of(16.0F + var3 * 2.0F, 16.0F + var3 * 2.0F) : FloatFloatPair.of(0.0F, 0.0F);
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
      String var5 = var2 ? this.RHHHROHCOCIHRRRORROICHHRIOHHHC : this.count + " " + this.RHHHROHCOCIHRRRORROICHHRIOHHHC;
      float var6 = var4.OHRCIORHOCHOORCRHHOHRRRCCOICCO();
      float var7 = var2 ? 16.0F + var3 : 0.0F;
      float var8;
      if (var1 != IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LEFT
         && var1 != IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIGHT) {
         var7 = var4.bridge$getStringWidth(var5);
         var8 = var2 ? 16.0F + var6 : var6;
      } else {
         if (var2) {
            var7 += var3;
         }

         var7 += var4.bridge$getStringWidth(var5);
         var8 = var2 ? 16.0F : var6;
      }

      return FloatFloatPair.of(var7 + var3 * 2.0F, var8 + var3 * 2.0F);
   }

   public void HCCOCOHORIORORICCRCHRHIOHHCHCH() {
      this.count = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      int var3,
      int var4
   ) {
      var1.push();
      var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(0.0F, 0.0F, 500.0F);
      int var5 = this.count == 0L ? -65536 : -1;
      String var6 = String.valueOf(this.count);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var6, var3 + 19 - 2 - var2.bridge$getStringWidth(var6), var4 + 6 + 3, var5, true);
      var1.pop();
   }

   private long OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == null) {
         return 0L;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.bridge$getInventory();
      return Stream.of(var2.bridge$getMainInventory(), var2.bridge$getArmorInventory(), var2.bridge$getOffhandInventory())
         .flatMap(Collection::stream)
         .filter(var1x -> var1x != null && this.ORCHRRRHHICICICIHIRICOHRHOORHO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1x))
         .mapToLong(IIRHCHHOICHRICOOCRORCCIOOIHOIR::bridge$getStackSize)
         .sum();
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
      NONE("none"),
      TOP("top"),
      BOTTOM("bottom"),
      LEFT("left"),
      RIGHT("right");

      private final String id;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
         this.id = var3;
      }

      @Override
      public String id() {
         return this.id;
      }
   }
}
