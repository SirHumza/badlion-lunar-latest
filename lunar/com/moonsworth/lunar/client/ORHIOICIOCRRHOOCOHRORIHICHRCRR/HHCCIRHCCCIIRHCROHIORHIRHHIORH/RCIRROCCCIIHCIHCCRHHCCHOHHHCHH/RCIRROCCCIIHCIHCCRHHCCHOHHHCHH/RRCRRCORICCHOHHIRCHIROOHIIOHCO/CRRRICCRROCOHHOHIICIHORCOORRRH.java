package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.util.List;
import javax.vecmath.Vector3d;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCCHRCHIIOOIRHIHIHCROIRHIIHHOH = com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IORRCOHROOHHORCRCOOIRHRCORHHHH;
   public float RCRHOIIORIHHRICRICRIRHHROCRHIC = 0.0F;
   public float HOCRROOCHIHCOIOHHRRRHCROROCOCR = 1.0F;
   public float radius = 0.01F;
   public boolean HHHOOCCORRIHHHRIHRIOHHRHORROIO;
   public boolean OIHIIROOCHIICHIOHRHHOHIORRCICO;
   private final Vector3d OROIHCCRHRCOORHCIOCCIICCHRHRII = new Vector3d();
   private final Vector3d IORRICIHORHRICCRHHROOOIOHRCIHR = new Vector3d();
   private final RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCHHICORHHHOOHHOORCIROHOICHCRI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
      .IRCIIHHICIHRCOCRROCOICRIHHCCHH(0, 0, 0);

   @Override
   public com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonElement var1, com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (!var1.isJsonObject()) {
         return super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      }

      JsonObject var3 = var1.getAsJsonObject();
      if (var3.has("enabled")) {
         this.OCCHRCHIIOOIRHIHIHCROIRHIIHHOH = var2.IHIRRIIORRHORHRORIHOROIRCORCOO(var3.get("enabled"));
      }

      if (var3.has("collision_drag")) {
         this.RCRHOIIORIHHRICRICRIRHHROCRHIC = var3.get("collision_drag").getAsFloat();
      }

      if (var3.has("coefficient_of_restitution")) {
         this.HOCRROOCHIHCOIOHHRRRHCROROCOCR = var3.get("coefficient_of_restitution").getAsFloat();
      }

      if (var3.has("collision_radius")) {
         this.radius = var3.get("collision_radius").getAsFloat();
      }

      if (var3.has("expire_on_contact")) {
         this.HHHOOCCORRIHHHRIHRIOHHRHORROIO = var3.get("expire_on_contact").getAsBoolean();
      }

      return super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
   }

   @Override
   public JsonElement RCHIIHHHCCIOHHRORHOORICCCRHOOI() {
      JsonObject var1 = new JsonObject();
      if (com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.OCCHRCHIIOOIRHIHIHCROIRHIIHHOH
      )) {
         return var1;
      }

      if (!com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this.OCCHRCHIIOOIRHIHIHCROIRHIIHHOH
      )) {
         var1.add("enabled", this.OCCHRCHIIOOIRHIHIHCROIRHIIHHOH.RCHIIHHHCCIOHHRORHOORICCCRHOOI());
      }

      if (this.RCRHOIIORIHHRICRICRIRHHROCRHIC != 0.0F) {
         var1.addProperty("collision_drag", this.RCRHOIIORIHHRICRICRIRHHROCRHIC);
      }

      if (this.HOCRROOCHIHCOIOHHRRRHCROROCOCR != 1.0F) {
         var1.addProperty("coefficient_of_restitution", this.HOCRROOCHIHCOIOHHRRRHCROROCOCR);
      }

      if (this.radius != 0.01F) {
         var1.addProperty("collision_radius", this.radius);
      }

      if (this.HHHOOCCORRIHHHRIHRIOHHRHORROIO) {
         var1.addProperty("expire_on_contact", true);
      }

      return var1;
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (var1.IHOHRHHCOIHRRCHCOROOOHOIIIIRRI != null) {
         if (!var2.HHOIICHIHIICHHOIROOHIICIHIOHIH
            && !com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.equals(
               this.OCCHRCHIIOOIRHIHIHCROIRHIIHHOH.get(), 0.0
            )) {
            float var3 = this.radius;
            this.OROIHCCRHRCOORHCIOCCIICCHRHRII.set(var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2.CIROOCOOCCIHIIHCCCCCIOIIRHROHH));
            this.IORRICIHORHRICCRHHROOOIOHRCIHR.set(var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1));
            Vector3d var4 = this.OROIHCCRHRCOORHCIOCCIICCHRHRII;
            Vector3d var5 = this.IORRICIHORHRICCRHHROOOIOHRCIHR;
            double var6 = var5.x - var4.x;
            double var8 = var5.y - var4.y;
            double var10 = var5.z - var4.z;
            boolean var12 = Math.abs(var6) > 10.0 || Math.abs(var8) > 10.0 || Math.abs(var10) > 10.0;
            this.OCHHICORHHHOOHHOORCIROHOICHCRI.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var5.x, var5.y, var5.z);
            boolean var13 = var1.IHOHRHHCOIHRRCHCOROOOHOIIIIRRI
               == com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIRHHRHCRRCIOHIHRORHCOIRIIOHHC()
                  .bridge$getWorld();
            if (var13) {
               return;
            }

            if (var12 || !var1.IHOHRHHCOIHRRCHCOROOOHOIIIIRRI.bridge$isBlockLoaded(this.OCHHICORHHHOOHHOORCIROHOICHCRI)) {
               return;
            }

            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.x - var3, var4.y - var3, var4.z - var3, var4.x + var3, var4.y + var3, var4.z + var3);
            double var15 = var8;
            double var17 = var6;
            double var19 = var10;
            List var21 = var1.IHOHRHHCOIHRRCHCOROOOHOIIIIRRI
               .bridge$getCollisionBoxes(var1.OOCCIORCOIOCOHCIIHCRRCCRORHICH, var14.bridge$expand(var6, var8, var10))
               .stream()
               .toList();

            for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var23 : var21) {
               var8 = var23.bridge$calculateYOffset(var14, var8);
            }

            var14 = var14.bridge$offset(0.0, var8, 0.0);

            for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var29 : var21) {
               var6 = var29.bridge$calculateXOffset(var14, var6);
            }

            var14 = var14.bridge$offset(var6, 0.0, 0.0);

            for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var30 : var21) {
               var10 = var30.bridge$calculateZOffset(var14, var10);
            }

            var14 = var14.bridge$offset(0.0, 0.0, var10);
            if (var15 != var8 || var17 != var6 || var19 != var10) {
               if (this.HHHOOCCORRIHHHRIHRIOHHRHORROIO) {
                  var2.HHHOOORIHRCHHRRORRCRICIRCCORIC = true;
                  return;
               }

               if (var2.RCORIICHOOIHHCROOOHRCOCOOROOIO) {
                  var2.RCORIICHOOIHHCROOOHRCOCOOROOIO = false;
                  var2.CIROOCOOCCIHIIHCCCCCIOIIRHROHH.set(var4);
               }

               var5.set(var14.bridge$getMinX() + var3, var14.bridge$getMinY() + var3, var14.bridge$getMinZ() + var3);
               if (var15 != var8) {
                  var2.OCRCOHIHHROOHICRCRHHCOORIOIOII.y = var2.OCRCOHIHHROOHICRCRHHCOORIOIOII.y * -this.HOCRROOCHIHCOIOHHRRRHCROROCOCR;
                  var5.y += var15 < var8 ? var3 : -var3;
               }

               if (var17 != var6) {
                  var2.OCRCOHIHHROOHICRCRHHCOORIOIOII.x = var2.OCRCOHIHHROOHICRCRHHCOORIOIOII.x * -this.HOCRROOCHIHCOIOHHRRRHCROROCOCR;
                  var5.x += var17 < var6 ? var3 : -var3;
               }

               if (var19 != var10) {
                  var2.OCRCOHIHHROOHICRCRHHCOORIOIOII.z = var2.OCRCOHIHHROOHICRCRHHCOORIOIOII.z * -this.HOCRROOCHIHCOIOHHRRRHCROROCOCR;
                  var5.z += var19 < var10 ? var3 : -var3;
               }

               var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.set(var5);
               var2.OCHCICOHRIIRROCRHHCRIRICCHRCIH = var2.OCHCICOHRIIRROCRHHCRIRICCHRCIH + this.RCRHOIIORIHHRICRICRIRHHROCRHIC;
            }
         }
      }
   }

   @Override
   public int IHHCCIORHRCORORHHIOICIRCHCHOHH() {
      return 50;
   }
}
