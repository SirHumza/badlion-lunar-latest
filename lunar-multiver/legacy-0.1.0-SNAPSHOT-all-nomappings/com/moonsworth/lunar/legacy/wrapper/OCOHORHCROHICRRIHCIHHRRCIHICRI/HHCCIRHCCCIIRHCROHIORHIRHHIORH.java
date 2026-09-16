package com.moonsworth.lunar.legacy.wrapper.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration.State;
import java.lang.ref.Cleaner;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.BlendState;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Cleaner HORHRCCOIRCIHOIIHOCRRRORIHOICC = Cleaner.create();
   private final FloatBuffer COIRRIIICHHCCOHIOHRIRICCRRHIOC = BufferUtils.createFloatBuffer(16);
   private final Matrix4f ICROCIHCRIIRCOICIHCIORRHHIHRIR = new Matrix4f();
   private float yaw;
   private float pitch;
   private final Set<CRRRICCRROCOHHOHIICIHORCOORRRH> IRHORCCCHHHCHCIHIOORICRIHCIOOR = Collections.newSetFromMap(new WeakHashMap<>());
   private final Set<Integer> CIRRCRORRHRIICIHRHOROOIHCICIOR = ConcurrentHashMap.newKeySet();
   private int HROIROORICICCICHCOROIOOOHHIOCH = -1;
   private int HIROCOIORHCIRICCOICOCRHIIHRCHH = -1;

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Component var1,
      boolean var2,
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      int var4,
      int var5,
      boolean var6
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
      float var8 = var7.OIIOHIHCORHCIOCCCHHHIRROHORIRR();
      boolean var9 = var7.isEnabled() && (Boolean)var7.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get();
      byte var10 = 0;
      if (RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var1).equals("deadmau5")) {
         var10 = -10;
      }

      ByteBuffer var11;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var11 = Tessellator.INSTANCE.buffer$v1_8.byteBuffer$v1_8;
      } else {
         var11 = Tessellator.INSTANCE.byteBuffer$v1_7;
      }

      var11.position(0);
      var11.limit(var11.capacity());
      FloatBuffer var12 = var11.asFloatBuffer();
      int var13 = (int)(
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(var1, IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getFontRenderer()) / 2.0F
      );
      int var14 = var13 + 1 + (var2 ? 6 : 0);
      int var15 = OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(0.0F, 0.0F, 0.0F, var8);
      float var16 = Float.intBitsToFloat(Integer.reverseBytes(var15 << 8 | var15 >>> 24));
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, -var14, -1 + var10, 0.0F, 0.0F, 0.0F, var16);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, -var14, 8 + var10, 0.0F, 0.0F, 0.0F, var16);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var14, 8 + var10, 0.0F, 0.0F, 0.0F, var16);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var14, -1 + var10, 0.0F, 0.0F, 0.0F, var16);
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(0, 4, null);
      List var18 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var12, (-(var13 * 2) + (var2 ? 12 : 0)) / 2, var10, var1, var9, var5, 32, false, var6
      );
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var19 = null;
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var20 = null;
      if (var2) {
         int var21 = OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(
            var3.HIIORICOHRICICIHHHHOIOIIRIIRCO(), var3.HCHCICROIICOIOCCOCIHHCHCIOIROR(), var3.CRCHRIRHHRIICORCOHRCCOHRROIRRO(), 1.0F
         );
         int var22 = var12.position() / 6;
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, (-(var13 * 2) + 12) / 2.0F - 12.0F, var10 - 1.5F, 0.0F, 10.0F, 10.0F, var21);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getTextureManager()
            .bridge$getTexture(CORCOCICIRIOHROHROIIOOHICCHCRR.RROCCHRRRCOHCROHIRHRHCOCOHCRRC);
         var19 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var22, 4, CORCOCICIRIOHROHROIIOOHICCHCRR.RROCCHRRRCOHCROHIRHRHCOCOHCRRC);
         if (var3.HIRROCORCHCHRORRHRIHCIHIHCCHIC()) {
            int var23 = var12.position() / 6;
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var12, (-(var13 * 2) + 12) / 2.0F - 12.0F + 7.25F, var10 - 1.5F + 1.5F, -1.0F, 3.0F, 3.0F, var3.COHORRCHIRRRCHICOCRHOOCHIRIIRC()
            );
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getTextureManager()
               .bridge$getTexture(CORCOCICIRIOHROHROIIOOHICCHCRR.IIIOCOHOOIRRRROCCHORHHICCIIRIH);
            var20 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, 4, CORCOCICIRIOHROHROIIOOHICCHCRR.IIIOCOHOOIRRRROCCHORHHICCIIRIH);
         }
      }

      List var25 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var12, (-(var13 * 2) + (var2 ? 12 : 0)) / 2, var10, var1, var9, var5, 255, true, var6
      );
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32888);
      GL11.glEnableClientState(32886);
      GL11.glVertexPointer(3, 5126, 24, var11);
      var11.position(12);
      GL11.glTexCoordPointer(2, 5126, 24, var11);
      var11.position(20);
      GL11.glColorPointer(4, 5121, 24, var11);

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var31 : var18) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var31);
      }

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var32 : var25) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var32);
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
         .IRRCCOICORICIHCHRHIHIHROIRHOCR(var4);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL14.glBlendFuncSeparate(770, 771, 1, 0);
      this.CIIOIOOROIHRCRORHICOOHHIHIHRHR();
      GL11.glDrawArrays(7, var17.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var17.count());

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var33 : var18) {
         if (var33.IOOOIRHOHCOIIOCOCROCCOHCOOORHR() == null) {
            this.CIIOIOOROIHRCRORHICOOHHIHIHRHR();
            GL11.glDrawArrays(7, var33.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var33.count());
         } else {
            int var24 = ((IIHRRHORCRCROCHHOHORCHCROCIHRO)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getTextureManager()
                  .bridge$getTexture(var33.IOOOIRHOHCOIIOCOCROCCOHCOOORHR()))
               .lunar$getHandle();
            GL11.glBindTexture(3553, var24);
            GL11.glDrawArrays(7, var33.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var33.count());
         }
      }

      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      if (var19 != null) {
         int var29 = ((IIHRRHORCRCROCHHOHORCHCROCIHRO)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getTextureManager()
               .bridge$getTexture(var19.IOOOIRHOHCOIIOCOCROCCOHCOOORHR()))
            .lunar$getHandle();
         GL11.glBindTexture(3553, var29);
         GL11.glDrawArrays(7, var19.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var19.count());
         if (var20 != null) {
            int var34 = ((IIHRRHORCRCROCHHOHORCHCROCIHRO)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getTextureManager()
                  .bridge$getTexture(var20.IOOOIRHOHCOIIOCOCROCCOHCOOORHR()))
               .lunar$getHandle();
            GL11.glBindTexture(3553, var34);
            GL11.glDrawArrays(7, var20.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var20.count());
         }
      }

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var35 : var25) {
         if (var35.IOOOIRHOHCOIIOCOCROCCOHCOOORHR() == null) {
            this.CIIOIOOROIHRCRORHICOOHHIHIHRHR();
            GL11.glDrawArrays(7, var35.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var35.count());
         } else {
            int var36 = ((IIHRRHORCRCROCHHOHORCHCROCIHRO)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getTextureManager()
                  .bridge$getTexture(var35.IOOOIRHOHCOIIOCOCROCCOHCOOORHR()))
               .lunar$getHandle();
            GL11.glBindTexture(3553, var36);
            GL11.glDrawArrays(7, var35.CHIOIOICOICRHRIOHRORICCRCOCCRI(), var35.count());
         }
      }

      GL11.glEnable(2896);
      GL11.glDisable(3042);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
         .RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var4);
      GL11.glDisableClientState(32884);
      GL11.glDisableClientState(32888);
      GL11.glDisableClientState(32886);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FloatBuffer var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.put(var2);
      var1.put(var3);
      var1.put(var4);
      var1.put(var5);
      var1.put(var6);
      var1.put(var7);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FloatBuffer var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = Float.intBitsToFloat(Integer.reverseBytes(var7 << 8 | var7 >>> 24));
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, 0.0F, 0.0F, var8);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3 + var6, var4, 0.0F, 1.0F, var8);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + var5, var3 + var6, var4, 1.0F, 1.0F, var8);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + var5, var3, var4, 1.0F, 0.0F, var8);
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Component var1,
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      CRRRICCRROCOHHOHIICIHORCOORRRH var3,
      int var4,
      boolean var5,
      boolean var6
   ) {
      if (var3.HICHOOCCCCCCIRCHHORRHIOCRROCRR != -1) {
         this.CIRRCRORRHRIICIHRHOROOIHCICIOR.remove(var3.HICHOOCCCCCCIRCHHORRHIOCRROCRR);
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
            .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3.HICHOOCCCCCCIRCHHORRHIOCRROCRR, 1);
      }

      int var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
         .IOOHCHIHOOIROCCIRCCORRRHCCHHRO();
      var3.HICHOOCCCCCCIRCHHORRHIOCRROCRR = var7;
      var3.HCCOCOIOORRIRIOIIROCHOOCRIRCOR = var1;
      this.IRHORCCCHHHCHCIHIOORICRIHCIOOR.add(var3);
      HORHRCCOIRCIHOIIHOCRRRORIHOICC.register(
         var3,
         () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$submit(
               () -> {
                  if (this.CIRRCRORRHRIICIHRHOROOIHCICIOR.remove(var7)) {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
                        .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
                        .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var7, 1);
                  }
               }
            )
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var6, var2, var7, var4, var5);
      return var7;
   }

   private void HOROHCCOCIHCICOOOIIRIIOHHOCROO() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getEntityRenderDispatcher();
      float var2 = (float)var1.bridge$playerViewX();
      float var3 = (float)var1.bridge$playerViewY();
      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIIOORORHHCCHICIRRROIHICRCOOCR
         )
       {
         var3 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.playerViewY;
         var2 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.playerViewX;
      }

      if (-var3 != this.yaw || var2 != this.pitch) {
         Matrix4f var4 = this.ICROCIHCRIIRCOICIHCIORRHHIHRIR;
         var4.identity();
         var4.rotateY((float)Math.toRadians(-var3));
         var4.rotateX((float)Math.toRadians(var2));
         var4.scale(-0.02666667F, -0.02666667F, 0.02666667F);
         var4.get(this.COIRRIIICHHCCOHIOHRIRICCRRHIOC);
         this.pitch = var2;
         this.yaw = -var3;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.COIRRIIICHHCCOHIOHRIRICCRRHIOC);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Component var1,
      double var2,
      double var4,
      double var6,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var8,
      boolean var9
   ) {
      if (!(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
         .IOCHCOORIOHORRIOIHRCORCHCIHHIH()
         .get()) {
         return false;
      } else if (var8 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var10
         && var10.bridge$getDisplayNameComponent() != var1) {
         return false;
      } else if (!(var8 instanceof com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var25)) {
         return false;
      } else {
         UUID var11 = var8.bridge$getUniqueID();
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
            .get(var11);
         boolean var13 = var8 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            && var9
            && var12 != null;
         boolean var14 = var13
            && var12.RROOHCOHROIIROCRCRICHOHHCCOOCR() != null
            && (
               var12.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                  || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                     .ICCIOIOHCRHRCOOOIICCIOHRICCHOC()
                     .get()
            );
         if (var14) {
            return false;
         }

         boolean var15 = var13
            && (
               var12.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                  || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                     .IHCRIIHRIHIRIHCORRHOCIHORHCOHR()
                     .get()
            );
         CRRRICCRROCOHHOHIICIHORCOORRRH var16 = var25.lunar$getCache();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC.CRRRICCRROCOHHOHIICIHORCOORRRH var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOHCCHIIRCOHRROCRRRRHCIIHRRORC();
         var1 = var17.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1);
         if (var1.decorations().get(TextDecoration.OBFUSCATED) == State.TRUE) {
            return false;
         }

         boolean var18 = false;
         byte var19 = -1;
         boolean var20 = false;
         if (var16.CROIOOOCIHORRCRCHCCRHRIOORHIIC != var15) {
            var18 = true;
            var16.CROIOOOCIHORRCRCHCCRHRIOORHIIC = var15;
         }

         int var21;
         if (var16.HCCOCOIOORRIRIOIIROCHOOCRIRCOR == var1 && var16.HICHOOCCCCCCIRCHHORRHIOCRROCRR != -1 && !var18) {
            var21 = var16.HICHOOCCCCCCIRCHHORRHIOCRROCRR;
         } else {
            var21 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var12, var16, var19, var20, var15);
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var22 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .COIIIOIIOHICCOCIOROOHIIHHIOIOR();
         var22.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
         var22.bridge$translate((float)var2, (float)var4, (float)var6);
         this.HOROHCCOCIHCICOOOIIRIIOHHOCROO();
         var22.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var21);
         var22.HROOORICCCOROOORORCORRHRHORIRC();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.CORRIROICCIOICRIOCHRCCHIOOIORO();
         }

         HICHRCOHCCRHOHCICOOCHOIHCCHIRI var23 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH;
         var23.lighting = true;
         var23.CRHIHIOIHCCCCOOIHRICCIOHHCHRRC = true;
         var23.ROROCROHRIRHOIHHIOOHRCOCIHOIIR = false;
         var23.OCOOORIHHCIRCICRIIORIIRRRHHHOH = 770;
         var23.IOHCHICCOIOHHCHICIHICCCRIHRIRR = 771;
         var23.IORROIRCOCRICCRCCOORHOIIHRRHIO = 1;
         var23.CIOIICCRCICRRROORCIIIIRHRCIIRC = 0;
         return true;
      }
   }

   public void free() {
      this.IRHORCCCHHHCHCIHIOORICRIHCIOOR
         .forEach(
            var0 -> {
               if (var0.HICHOOCCCCCCIRCHHORRHIOCRROCRR != -1) {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
                     .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
                     .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0.HICHOOCCCCCCIRCHHORRHIOCRROCRR, 1);
                  var0.HICHOOCCCCCCIRCHHORRHIOCRROCRR = -1;
               }
            }
         );
      this.IRHORCCCHHHCHCIHIOORICRIHCIOOR.clear();
      this.CIRRCRORRHRIICIHRHOROOIHCICIOR.clear();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   private void CORRIROICCIOICRIOCHRCCHIOOIORO() {
      GlStateManager.resetColor();
      GlStateManager.textureState[0].textureName = 0;
      GlStateManager.textureState[0].texture2DState.currentState = true;
      GlStateManager.lightingState.currentState = true;
      GlStateManager.depthState.maskEnabled = true;
      GlStateManager.depthState.depthTest.currentState = true;
      BlendState var1 = GlStateManager.blendState;
      var1.blend.currentState = false;
      var1.srcFactor = 770;
      var1.dstFactor = 771;
      var1.srcFactorAlpha = 1;
      var1.dstFactorAlpha = 0;
   }

   public void CIIOIOOROIHRCRORHICOOHHIHIHRHR() {
      if (this.HROIROORICICCICHCOROIOOOHHIOCH == -1) {
         this.HROIROORICICCICHCOROIOOOHHIOCH = GL11.glGenTextures();
         GL11.glBindTexture(3553, this.HROIROORICICCICHCOROIOOOHHIOCH);
         IntBuffer var1 = BufferUtils.createIntBuffer(1);
         var1.put(0, -1);
         GL11.glTexImage2D(3553, 0, 32856, 1, 1, 0, 6408, 5121, var1);
      } else {
         GL11.glBindTexture(3553, this.HROIROORICICCICHCOROIOOOHHIOCH);
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0) {
      if (var0.IOOOIRHOHCOIIOCOCROCCOHCOOORHR() != null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$getTexture(var0.IOOOIRHOHCOIIOCOCROCCOHCOOORHR());
      }
   }
}
