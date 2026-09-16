package com.moonsworth.lunar.client.util.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.common.primitives.Floats;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Objects;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJLoader.CompiledData;
import org.joml.Vector3f;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final CompiledData data;
   private final int[] IOCIIHCOHRCRRROOCCICCIROROOIRH;
   private final Reference2IntOpenHashMap<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CROIRHIHIIICRRRCCIHRHIHHOCCIIR = new Reference2IntOpenHashMap();
   private final ReferenceOpenHashSet<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCHCRHCOCHIROOOIIOOIRHCHCOCORO = new ReferenceOpenHashSet();
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCCICCCHHCCHIHCOROHHIHHCIOCCHI;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICCCOIHRCHOCRRICCHRCOROCOICHOH;
   private int HIICICHIHOROCHCOHRHIIORHCCCCIR = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
      .OCCCCRRCROIRIHRROHCHCHORCOCICC();
   private int IHIRCCOROHHOCHRHHROIIOHCICIHHH = -1;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICHIHCHCCHCOORCOHCRCCOICROHICH;
   private boolean OHHOIIIHHHCRHRIHRRCROCHIORICRH;

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(CompiledData var1) {
      this.IOCIIHCOHRCRRROOCCICCIROROOIRH = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      this.data = var1;
   }

   @Override
   public int ROIOOOICHHICRIIOCCCOHOOOCHOHIR() {
      return (this.data.posData.length + this.data.texData.length + this.data.normData.length + this.data.normData.length + this.data.weightData.length) * 4
         + (this.data.boneIndexData.length + this.data.indexData.length) * 4;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2) {
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2, RHOCHHIRRCHHHOHOIRROIROHHHIHIO var3, int var4
   ) {
      if (this.IOCIIHCOHRCRRROOCCICCIROROOIRH.length != 0) {
         RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = var3.HRICOCOIOCCCICCIORHIIIIOROCOHC();
         int var6 = var2.RCHHCIOCRICRORCCOIOIOIHROHCRCH()
            .orElse(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .OCCCCRRCROIRIHRROHCHCHORCOCICC()
            );
         boolean var7 = CIRHOCROORORRORHHIRHHOIHHIORHH();
         boolean var8 = HOIIOCHOCIHIIRROOCCOCORCIROCRI();
         if (var7 != this.OHHOIIIHHHCRHRIHRRCROCHIORICRH) {
            if (var7) {
               if (this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI != null) {
                  this.ICHIHCHCCHCOORCOHCRCCOICROHICH = this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI;
                  this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI = null;
               }
            } else if (this.ICHIHCHCCHCOORCOHCRCCOICROHICH != null) {
               if (this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI != null) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI);
                  this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI = this.ICHIHCHCCHCOORCOHCRCCOICROHICH;
               }

               this.ICHIHCHCCHCOORCOHCRCCOICROHICH = null;
               this.HIICICHIHOROCHCOHRHIIORHCCCCIR = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .OCCCCRRCROIRIHRROHCHCHORCOCICC();
            } else if (this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI);
               this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI = null;
            }

            if (this.ICCCOIHRCHOCRRICCHRCOROCOICHOH != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICCCOIHRCHOCRRICCHRCOROCOICHOH);
               this.ICCCOIHRCHOCRRICCHRCOROCOICHOH = null;
            }
         }

         if (this.IHIRCCOROHHOCHRHHROIIOHCICIHHH != var4) {
            if (this.ICCCOIHRCHOCRRICCHRCOROCOICHOH != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICCCOIHRCHOCRRICCHRCOROCOICHOH);
               this.ICCCOIHRCHOCRRICCHRCOROCOICHOH = null;
            }

            this.IHIRCCOROHHOCHRHHROIIOHCICIHHH = var4;
         }

         this.OHHOIIIHHHCRHRIHRRCROCHIORICRH = var7;
         boolean var9 = this.HIICICHIHOROCHCOHRHIIORHCCCCIR != var6;
         if (var8) {
            boolean var10 = var1.bridge$getVertexFormatMode()
               == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUADS;
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = var10
               ? this.ICCCOIHRCHOCRRICCHRCOROCOICHOH
               : this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI;
            if (var11 == null || var9) {
               if (var11 != null) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11);
                  if (var10) {
                     this.ICCCOIHRCHOCRRICCHRCOROCOICHOH = null;
                  } else {
                     this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI = null;
                  }
               }

               if (var10) {
                  var11 = var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1,
                     var3x -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOCIIHCOHRCRRROOCCICCIROROOIRH, Objects.requireNonNull(this.data), var3x, var6, var4, true),
                     false
                  );
                  this.ICCCOIHRCHOCRRICCHRCOROCOICHOH = var11;
               } else {
                  var11 = var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1,
                     var2x -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOCIIHCOHRCRRROOCCICCIROROOIRH, Objects.requireNonNull(this.data), var2x, var6, -1, false),
                     false
                  );
                  this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI = var11;
               }

               this.HIICICHIHOROCHCOHRHIIORHCCCCIR = var6;
               if (var11 == null) {
                  throw new RuntimeException("Attempting to render an empty cosmetic!");
               }
            }
         }

         if (this.ICHIHCHCCHCOORCOHCRCCOICROHICH == null && !var8) {
            this.ICHIHCHCCHCOORCOHCRCCOICROHICH = var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1,
               var1x -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.IOCIIHCOHRCRRROOCCICCIROROOIRH,
                  Objects.requireNonNull(this.data),
                  var1x,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .OCCCCRRCROIRIHRROHCHCHORCOCICC(),
                  -1,
                  false
               ),
               false
            );
            if (this.ICHIHCHCCHCOORCOHCRCCOICROHICH == null) {
               throw new RuntimeException("Attempting to render an empty cosmetic!");
            }
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var17;
         if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().IHOCROCOHHORCOIHOCIOICCHOHRRRH()) {
            var17 = var5.RCIHOCCIROCOIOOCCOHICRIIRIIROI().bridge$copy();
            var17.bridge$multiply(var2.CIRRHHHIRCHOHHCRCIHROHHRIOCOHO().bridge$last().bridge$pose());
         } else {
            var17 = var5.RCIHOCCIROCOIOOCCOHICRIIRIIROI();
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 22) {
            if (var1 != null && var2.OIRRROORIIRHHROOCCRIIIRRIOCCCO().isPresent()) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var19 = this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                  var1
               );
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, () -> var19.bridge$draw(var17, var1), var19);
            } else {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var1);
            }
         } else {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var20 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var17
            );
            Vector3f[] var12 = var5.IOHCIORRIOICRRORHROOCCRICHOHRH();
            Vector3f[] var13 = new Vector3f[]{new Vector3f(var12[0]), new Vector3f(var12[1])};
            Vector3f[] var14 = new Vector3f[2];

            for (int var15 = 0; var15 < 2; var15++) {
               Vector3f var16 = var13[var15];
               var14[var15] = new Vector3f(
                  var20.bridge$getTransformX(var16.x, var16.y, var16.z),
                  var20.bridge$getTransformY(var16.x, var16.y, var16.z),
                  var20.bridge$getTransformZ(var16.x, var16.y, var16.z)
               );
            }

            if (var1 != null && var2.OIRRROORIIRHHROOCCRIIIRRIOCCCO().isPresent()) {
               var2.OIRRROORIIRHHROOCCRIIIRRIOCCCO()
                  .orElseThrow()
                  .bridge$renderUnbatchableAfter(var1, () -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var17, var13, var14, var1));
            } else {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var17, var13, var14, var1);
            }
         }
      }
   }

   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.bridge$copy();
      var2.bridge$invert();
      var2.bridge$transpose();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = var2.bridge$truncateToMatrix3f();
      var3.bridge$invert();
      return var3;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 29)
   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      Vector3f[] var3,
      Vector3f[] var4,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var5
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4[0], var4[1]);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var5);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3[0], var3[1]);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var2
   ) {
      this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2).bridge$draw(var1, var2);
   }

   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1
   ) {
      if (HOIIOCHOCIHIIRROOCCOCORCIROCRI()) {
         return var1.bridge$getVertexFormatMode()
               == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUADS
            ? this.ICCCOIHRCHOCRRICCHRCOROCOICHOH
            : this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI;
      } else {
         return this.ICHIHCHCCHCOORCOHCRCCOICROHICH;
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var2,
      Runnable var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      this.CROIRHIHIIICRRRCCIHRHIHHOCCIIR.addTo(var4, 1);
      var1.OIRRROORIIRHHROOCCRIIIRRIOCCCO().orElseThrow().bridge$renderUnbatchableAfter(var2, () -> {
         try {
            var3.run();
         } finally {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4);
         }
      });
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (var1 != null) {
         if (this.CROIRHIHIIICRRRCCIHRHIHHOCCIIR.getInt(var1) > 0) {
            this.RCHCRHCOCHIROOOIIOOIRHCHCOCORO.add(var1);
         } else {
            var1.bridge$close();
         }
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (this.CROIRHIHIIICRRRCCIHRHIHHOCCIIR.addTo(var1, -1) <= 1) {
         this.CROIRHIHIIICRRRCCIHRHIHHOCCIIR.removeInt(var1);
         if (this.RCHCRHCOCHIROOOIIOOIRHCHCOCORO.remove(var1)) {
            var1.bridge$close();
         }
      }
   }

   private static int[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(CompiledData var0) {
      int var11 = 0;
      int var2 = var0.posData.length / 4 / 3;
      float[] var3 = new float[var2];
      int[] var4 = new int[var2];

      for (int var5 = 0; var5 < var2; var4[var5] = var5++) {
         float var6 = 0.0F;

         for (int var7 = 0; var7 < 3; var7++) {
            var11 += 2;
            float var8 = var0.posData[var11++];
            float var9 = var0.posData[var11++];
            float var10 = var8 / var9;
            var6 += var10;
         }

         var6 /= 3.0F;
         var3[var5] = var6;
      }

      IntArrays.mergeSort(var4, (var1, var2x) -> Floats.compare(var3[var1], var3[var2x]));
      return var4;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var0, CompiledData var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2, int var3, int var4, boolean var5) {
      int var6 = var1.posData.length / 4 / 3;
      int var7 = var4 >>> 16 & 0xFF;
      int var8 = var4 >>> 8 & 0xFF;
      int var9 = var4 & 0xFF;
      int var10 = var4 >>> 24;

      for (int var11 = 0; var11 < var6; var11++) {
         int var12 = var0[var11];

         for (int var13 = 0; var13 < 3; var13++) {
            int var14 = var12 * 3 + var13;
            float var15 = var1.posData[var14 * 4];
            float var16 = var1.posData[var14 * 4 + 1];
            float var17 = var1.posData[var14 * 4 + 2];
            float var18 = var1.posData[var14 * 4 + 3];
            float var19 = var1.normData[var14 * 3];
            float var20 = var1.normData[var14 * 3 + 1];
            float var21 = var1.normData[var14 * 3 + 2];
            int var22 = var5 && var13 == 2 ? 2 : 1;

            for (int var23 = 0; var23 < var22; var23++) {
               var2.bridge$vertex(var15 / var18, var16 / var18, var17 / var18)
                  .bridge$color(var7, var8, var9, var10)
                  .bridge$uv(var1.texData[var14 * 2], var1.texData[var14 * 2 + 1])
                  .bridge$overlayCoords(0, 10)
                  .bridge$uv2(var3 & 0xFF, var3 >> 16 & 0xFF)
                  .bridge$normal(var19, var20, var21)
                  .bridge$endVertex();
            }
         }
      }
   }

   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIHICRIICHCHIROIOHRRCHICOCOCO() {
      float var1 = Float.MAX_VALUE;
      float var2 = Float.MAX_VALUE;
      float var3 = Float.MAX_VALUE;
      float var4 = -Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;
      float var6 = -Float.MAX_VALUE;

      for (int var7 = 0; var7 < this.data.posData.length / 4; var7++) {
         float var8 = this.data.posData[var7 * 4 + 3];
         float var9 = this.data.posData[var7 * 4] / var8;
         float var10 = this.data.posData[var7 * 4 + 1] / var8;
         float var11 = this.data.posData[var7 * 4 + 2] / var8;
         if (var9 < var1) {
            var1 = var9;
         }

         if (var9 > var4) {
            var4 = var9;
         }

         if (var10 < var2) {
            var2 = var10;
         }

         if (var10 > var5) {
            var5 = var10;
         }

         if (var11 < var3) {
            var3 = var11;
         }

         if (var11 > var6) {
            var6 = var11;
         }
      }

      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void delete() {
      ObjectIterator var1 = this.RCHCRHCOCHIROOOIIOOIRHCHCOCORO.iterator();

      while (var1.hasNext()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.next();
         var2.bridge$close();
      }

      this.RCHCRHCOCHIROOOIIOOIRHCHCOCORO.clear();
      this.CROIRHIHIIICRRRCCIHRHIHHOCCIIR.clear();
      if (this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI != null) {
         this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI.bridge$close();
         this.RCCICCCHHCCHIHCOROHHIHHCIOCCHI = null;
      }

      if (this.ICCCOIHRCHOCRRICCHRCOROCOICHOH != null) {
         this.ICCCOIHRCHOCRRICCHRCOROCOICHOH.bridge$close();
         this.ICCCOIHRCHOCRRICCHRCOROCOICHOH = null;
      }

      if (this.ICHIHCHCCHCOORCOHCRCCOICROHICH != null) {
         this.ICHIHCHCCHCOORCOHCRCCOICROHICH.bridge$close();
         this.ICHIHCHCCHCOORCOHCRCCOICROHICH = null;
      }
   }

   private static boolean CIRHOCROORORRORHHIRHHOIHHIORHH() {
      return com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         )
         .map(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::lunar$isUsingExtendedVertexFormat
         )
         .orElseGet(
            () -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
               .map(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH::getShaders)
               .map(var0 -> {
                  String var1 = var0.getShaderPack();
                  return var1 != null && !var1.equals(var0.getPackNone());
               })
               .orElse(false)
         );
   }

   private static boolean HOIIOCHOCIHIIRROOCCOCORCIROCRI() {
      return com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         )
         .map(com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::lunar$isRenderingLevel)
         .orElseGet(
            () -> !com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRRHIHROCCROIRRRCRIHCRICORHHHI
         );
   }
}
