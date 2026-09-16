package com.moonsworth.lunar.legacy.wrapper.util;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.HRCOCHHHCCIORCORCHIOOOCCCCHICH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.FloatBuffer;
import java.util.UUID;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   private final float[] RIHCCHCOOOCHRCRHIRHCCRORROROCO;
   private final Vector3f[] HOHOHCOHOCCHHICHCCHIHHHOHIOHIO;
   private int OCIHRHRHIOOOHCCHICHRCIOCHCOCRH;

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      float var0, float var1, float var2, int var3, int var4, int var5, int var6, int var7
   ) {
      Vector3f var8 = new Vector3f(var0 - var3, var1 - var4, var2 - var5);
      Vector3f var9 = new Vector3f(var0 + var3, var1 + var4, var2 + var5);
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var9, var8, var6, var7);
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR HCHOOCHIOICRRHHIHHHICIRCIOICRI(int var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(0.0F, 16.0F, -1.0F, 10, 16, 1, var0, var1);
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Vector3f var1, Vector3f var2, int var3, int var4) {
      Vector3f var5 = var1.sub(var2, new Vector3f());
      var5.x /= 2.0F;
      var5.y /= 2.0F;
      var5.z /= 2.0F;
      float var6 = var5.x;
      float var7 = var5.y;
      float var8 = var5.z;
      this.HOHOHCOHOCCHHICHCCHIHHHOHIOHIO = HRCOCHHHCCIORCORCHIOOOCCCCHICH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH = -1;
      FloatBuffer var9 = FloatBuffer.allocate(48);
      var9.put(HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((int)var8, (int)var8, var3, var4, (int)var6, (int)var7, 1));
      var9.put(HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((int)(var8 + var6), 0, var3, var4, (int)var6, (int)var8, 1));
      var9.put(HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((int)var8, 0, var3, var4, (int)var6, (int)var8, 1));
      var9.put(HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((int)(var6 + var8), (int)var8, var3, var4, (int)var8, (int)var7, 1));
      var9.put(HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(0, (int)var8, var3, var4, 1, (int)var7, 1));
      var9.put(HRCOCHHHCCIORCORCHIOOOCCCCHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((int)(var6 + var8 + var8), (int)var8, var3, var4, (int)var6, (int)var7, 1));
      this.RIHCCHCOOOCHRCRHIRHCCRORROROCO = var9.array();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, float var2, RCIROOOOICRHCCRRCIORHHIRCOIIIC var3, UUID var4) {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OHOCOOCOORHRROCRIRIHIHRHOCIORH
         .get(var3);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var6 = var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var5
      );
      if (!var6.CRHOOHHCIOOCCHRCRICCIICIOHHCRR()) {
         if (this.RIHCCHCOOOCHRCRHIRHCCRORROROCO != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RROIIICIHOROCICRICHOOROIROHIRH()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRRHROIIIOCCCRHICROHIRHRRCOROH(),
                  var2x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, var2, var2x::HHRCRHRHOCCROOHHORCOOCIRCCHCIR, true),
                  var4,
                  var3
               );
            boolean var7 = var1.HOORIORICHOORIIRRRCOHCIRIICOCI();
            var1.IIHHIIIHCRHCCROOHHRROORCORCCCC();
            if (this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH == -1) {
               this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH = GL11.glGenLists(1);
               if (var6 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
                  )
                {
                  GL11.glNewList(this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH, 4864);
               } else {
                  GL11.glNewList(this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH, 4865);
               }

               var6.HICHHHOOCRROHCCCCOOHOCHHOIOHCR();
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  (var1x, var2x, var3x, var4x, var5x, var6x, var7x, var8x) -> var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3x, var4x, var5x)
                     .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1x, var2x)
                     .HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var6x, var7x, var8x)
                     .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC(),
                  var2,
                  null,
                  false
               );
               if (var6 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8
                  )
                {
                  var8.CHICOOOCIRRROHOHIIRCCORHIRCOHC();
                  GL11.glEndList();
                  var5.bridge$setupRenderState();
                  GL11.glCallList(this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH);
                  var5.bridge$clearRenderState();
               } else {
                  var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BATCHED
                  );
                  GL11.glEndList();
               }
            } else if (var6 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
               )
             {
               var5.bridge$setupRenderState();
               GL11.glCallList(this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH);
               var5.bridge$clearRenderState();
            } else {
               GL11.glCallList(this.OCIHRHRHIOOOHCCHICHRCIOCHCOCRH);
            }

            if (!var7) {
               var1.ORHHHHORORCIROIRRICCHOOOICCCHC();
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, float var2, Runnable var3, boolean var4) {
      byte var5 = 0;
      byte var6 = 0;

      for (byte var7 = 0; var7 < this.HOHOHCOHOCCHHICHCCHIHHHOHIOHIO.length; var7 += 4) {
         Vector3f var8 = this.HOHOHCOHOCCHHICHCCHIHHHOHIOHIO[var7];
         Vector3f var9 = this.HOHOHCOHOCCHHICHCCHIHHHOHIOHIO[var7 + 1];
         Vector3f var10 = this.HOHOHCOHOCCHHICHCCHIHHHOHIOHIO[var7 + 2];
         Vector3f var11 = this.HOHOHCOHOCCHHICHCCHIHHHOHIOHIO[var7 + 3];
         float var12 = HRCOCHHHCCIORCORCHIOOOCCCCHICH.CCIRHIIOORHOHHOCOIIHRHHOCOCHHH[var6];
         float var13 = HRCOCHHHCCIORCORCHIOOOCCCCHICH.CCIRHIIOORHOHHOCOIIHRHHOCOCHHH[var6 + 1];
         float var14 = HRCOCHHHCCIORCORCHIOOOCCCCHICH.CCIRHIIOORHOHHOCOIIHRHHOCOCHHH[var6 + 2];
         var1.vertex(
            this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5],
            this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 1],
            var8.x() * var2,
            var8.y() * var2,
            var8.z() * var2,
            var12,
            var13,
            var14
         );
         if (var4) {
            var1.vertex(
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 6],
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 7],
               var11.x() * var2,
               var11.y() * var2,
               var11.z() * var2,
               var12,
               var13,
               var14
            );
            var1.vertex(
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 2],
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 3],
               var9.x() * var2,
               var9.y() * var2,
               var9.z() * var2,
               var12,
               var13,
               var14
            );
            var1.vertex(
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 4],
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 5],
               var10.x() * var2,
               var10.y() * var2,
               var10.z() * var2,
               var12,
               var13,
               var14
            );
         } else {
            var1.vertex(
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 2],
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 3],
               var9.x() * var2,
               var9.y() * var2,
               var9.z() * var2,
               var12,
               var13,
               var14
            );
            var1.vertex(
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 4],
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 5],
               var10.x() * var2,
               var10.y() * var2,
               var10.z() * var2,
               var12,
               var13,
               var14
            );
            var1.vertex(
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 6],
               this.RIHCCHCOOOCHRCRHIRHCCRORROROCO[var5 + 7],
               var11.x() * var2,
               var11.y() * var2,
               var11.z() * var2,
               var12,
               var13,
               var14
            );
         }

         if (var3 != null) {
            var3.run();
         }

         if (var5 + 2 < this.RIHCCHCOOOCHRCRHIRHCCRORROROCO.length) {
            var5 += 8;
         }

         var6 += 3;
      }
   }

   @FunctionalInterface
   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      void vertex(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8);
   }
}
