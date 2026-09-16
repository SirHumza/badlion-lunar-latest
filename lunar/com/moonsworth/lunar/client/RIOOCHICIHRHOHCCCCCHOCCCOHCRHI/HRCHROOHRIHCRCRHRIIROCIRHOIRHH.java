package com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector4f;
import mchorse.emoticons.morph.Morph;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   String HCHHCROHOOIIICIIOOIHOIRHOIOCRI();

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCORORHIHRHRIOOHOORHCCORCIHHII();

   void ROHCIRRIRIRRHHCOOHHIRORRIHOORR();

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector4f var1, Matrix3f var2);

   void reset(boolean var1);

   void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH HCHOOIOHICCRIOIICHCHOIIRRRIHCI();

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   );

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
   }

   void ROHOCRIOIOHRICRRHCRCRRRIOCOCRR();

   boolean CRICCIOICHOOOOCOHROROORIORHRHI();

   RRCRRCORICCHOHHIRCHIROOHIIOHCO CCHRCOHOCCROCHIOHRHICIIRCRCICC();

   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Morph var0, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1
   ) {
      String var2 = var0.getMorphNbt().bridge$getString("Name");
      if ("snowstorm".equals(var2)) {
         String var9 = var0.getMorphNbt().bridge$getString("Scheme");
         if (var9 != null && !var9.isEmpty()) {
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RCRHICHHOOHCRHHCCCHCHIIRRHHRRH()
               .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .get(var9);
            com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
            float var6 = var1.bridge$getScale();
            var4.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5);
            var4.bone = var0.getBone();
            var4.RICOOIOCCOHHROOIOHHIHIIOCROCHI = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0);
            var4.running = true;
            var4.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
            var4.setScale(var6);
            var4.RRCICHROCCCCORRIHIORROCRCIRIRR.set(var1.bridge$getPosX(), var1.bridge$getPosY(), var1.bridge$getPosZ());
            Matrix4f var7 = new Matrix4f();
            var7.setIdentity();
            var7.rotY((float)Math.toRadians(180.0F - (var1.bridge$getBodyRot() - 180.0F)));
            Matrix3f var8 = new Matrix3f();
            var8.m00 = var7.m00;
            var8.m01 = var7.m01;
            var8.m02 = var7.m02;
            var8.m10 = var7.m10;
            var8.m11 = var7.m11;
            var8.m12 = var7.m12;
            var8.m20 = var7.m20;
            var8.m21 = var7.m21;
            var8.m22 = var7.m22;
            var4.HOCCHIRRRORRRRORCRHHHOHOOHOOOI.set(var8);
            return var4;
         } else {
            throw new IllegalArgumentException("configuration.json is corrupt; snowstorm morph " + var0 + " is missing a Scheme");
         }
      } else if ("block".equals(var2)) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
         var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
         return var3;
      } else {
         throw new IllegalArgumentException("Unknown morph type " + var2);
      }
   }

   default double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2 = this.OHHROORCIRIRORCHOOOHOCCHHHHCHH();
      double var3 = var2.bridge$getX() - var1.bridge$getPosX();
      double var5 = var2.bridge$getY() - var1.bridge$getPosY();
      double var7 = var2.bridge$getZ() - var1.bridge$getPosZ();
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   RORCHCIIICOHIRROOORHOCCCCIOCCI OHHROORCIRIRORCHOOOHOCCHHHHCHH();
}
