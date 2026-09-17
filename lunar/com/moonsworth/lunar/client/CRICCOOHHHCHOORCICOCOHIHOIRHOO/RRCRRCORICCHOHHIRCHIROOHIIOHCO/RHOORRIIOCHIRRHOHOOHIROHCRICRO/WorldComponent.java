package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOORRIIOCHIRRHOHOOHIROHCRICRO;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.mumble.LinkData;
import com.moonsworth.lunar.client.mumble.MumbleLink;
import com.moonsworth.lunar.client.mumble.MumbleVec;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.util.Locale;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String CHCRIIHRRICHIHCCORICIOOCIIHORC = "mumbleLinkEnabledPopup";
   private static final String OCHROHCRICRCCIRRRHRRRRORRHIHRR = "mumbleLinkDisabledPopup";
   private static final String OHIICHCOCCOOOIIIRIRIHCCCIRORCH = "mumbleLinkUnsupportedPopup";
   private static final String ICCCICHCHIIHICHHOHIHCOOOCROHHC = "mumbleLinkErrorPopup";
   private MumbleLink ICCOHHOHICIIHRHOIIICRICCOIOICI;
   private boolean OICIIROIORRRHOCOHCRRRCRIROCHIR = false;
   private boolean OHRIOOOCRICRIIHCCIOCHHHRHRHHOC = false;
   private boolean ICHIOOCRRCCCIHIOOCOOOCIICIRIOO = false;
   private final JsonObject RRCICOOIIHRHRROHIHCRRCIHIOOOHC = this.RRRRHICICRCIORIHCRROOHOOORIHIH();
   private final JsonObject HCIHROOOCRCORIROICRHIRHCOHCCIC = new JsonObject();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super(false);
      this.handle(
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
         var1 -> {
            if (this.OICIIROIORRRHOCOHCRRRCRIROCHIR
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$isRemote()) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .CIICCRHHHOHOIOHCHRHOORCICRCORC(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("mumbleLinkEnabledPopup"));
            }
         }
      );
      this.handle(
         IOIICIRIICICIIOORHCIIIIRRIHRHI.class,
         var1 -> {
            if (this.ICCOHHOHICIIHRHOIIICRICCOIOICI != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$isRemote()) {
               if (!this.OICIIROIORRRHOCOHCRRRCRIROCHIR && !this.OHRIOOOCRICRIIHCCIOCHHHRHRHHOC) {
                  this.HHIOOOOOOCHRCRORHOHCCCHHCRRRHO();
               } else {
                  if (this.OHRIOOOCRICRIIHCCIOCHHHRHRHHOC) {
                     return;
                  }

                  HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
                  float var3 = 1.0F;
                  float var4 = 1.0F;
                  float var5 = 1.0F;
                  float var6 = 1.0F;
                  float var7 = 1.0F;
                  float var8 = 1.0F;
                  float var9 = 1.0F;
                  float var10 = 1.0F;
                  float var11 = 1.0F;
                  float var12 = 1.0F;
                  float var13 = 1.0F;
                  float var14 = 1.0F;
                  MumbleVec var15 = new MumbleVec(
                     var2.RCRCIHCOCOOORIRCOHHOIOHROOOHOC().bridge$xCoord(),
                     var2.RCRCIHCOCOOORIRCOHHOIOHROOOHOC().bridge$yCoord(),
                     var2.RCRCIHCOCOOORIRCOHHOIOHROOOHOC().bridge$zCoord()
                  );
                  MumbleVec var16 = this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var2);
                  MumbleVec var17 = new MumbleVec(var2.bridge$getPosX(), (float)var2.bridge$getPosZ(), (float)var2.bridge$getPosY());
                  MumbleVec var18 = new MumbleVec(var15.xCoord * var3, (float)var15.zCoord * var5, (float)var15.yCoord * var4);
                  MumbleVec var19 = new MumbleVec(var16.xCoord * var9, (float)var16.zCoord * var11, (float)var16.yCoord * var10);
                  MumbleVec var20 = new MumbleVec(var2.bridge$getPosX(), (float)var2.bridge$getPosZ(), (float)var2.bridge$getPosY());
                  MumbleVec var21 = new MumbleVec(var15.xCoord * var6, (float)var15.zCoord * var8, (float)var15.yCoord * var7);
                  MumbleVec var22 = new MumbleVec(var16.xCoord * var12, (float)var16.zCoord * var14, (float)var16.yCoord * var13);
                  LinkData var23 = new LinkData(
                     this.IRCIICRCORIOICRIOHRHRICCOOIIRR().toString(), this.RRCICOOIIHRHRROHIHCRRCIHIOOOHC.toString(), var18, var19, var17, var20, var21, var22
                  );
                  this.ICCOHHOHICIIHRHOIIICRICCOIOICI.update(var23);
               }
            }
         }
      );
   }

   @Override
   public String getId() {
      return "MUMBLE_LINK";
   }

   private JsonObject IRCIICRCORIOICRIOHRHRICCOOIIRR() {
      JsonArray var1 = new JsonArray();
      var1.add(new JsonPrimitive(IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$getWorldInfo().bridge$getSpawnX()));
      var1.add(new JsonPrimitive(IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$getWorldInfo().bridge$getSpawnY()));
      var1.add(new JsonPrimitive(IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$getWorldInfo().bridge$getSpawnZ()));
      this.HCIHROOOCRCORIROICRHIRHCOHCCIC.addProperty("name", IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName());
      this.HCIHROOOCRCORIROICRHIRHCOHCCIC.add("worldSpawn", var1);
      if (IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI().getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
         this.HCIHROOOCRCORIROICRHIRHCOHCCIC
            .addProperty("dimension", IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getDimensionName());
      } else {
         this.HCIHROOOCRCORIROICRHIRHCOHCCIC.addProperty("dimension", IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getDimension());
      }

      return this.HCIHROOOCRCORIROICRHIRHCOHCCIC;
   }

   private JsonObject RRRRHICICRCIORIHCRROOHOOORIHIH() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("domain", "AllTalk");
      return var1;
   }

   private MumbleVec HHRIICOIOORCHCOIICOOIHIRHHICRI(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      float var2 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(-var1.bridge$getRotationYaw() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(-var1.bridge$getRotationYaw() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var4 = -RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((-var1.bridge$getRotationPitch() + 90.0) * (float) (Math.PI / 180.0));
      float var5 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((-var1.bridge$getRotationPitch() + 90.0) * (float) (Math.PI / 180.0));
      return new MumbleVec(var3 * var4, var5, var2 * var4);
   }

   @Override
   public void COIHORRCHRRCHOCIRHHRRIOIHRIHCC(boolean var1) {
      boolean var2 = this.ICHIOOCRRCCCIHIOOCOOOCIICIRIOO != var1;
      this.ICHIOOCRRCCCIHIOOCOOOCIICIRIOO = var1;
      if (!IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIOCHICRIOCICHRCOOCOROIHIIHCHO.toLowerCase(Locale.ROOT).contains("win")) {
         if (var2 && var1) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .CIICCRHHHOHOIOHCHRHOORCICRCORC(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("mumbleLinkUnsupportedPopup"));
         }

         this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOCHHHIIRIHOIRHHICHICCRIHOIOHC)
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this,
               com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_INTERNAL,
               false
            );
      } else if (var2) {
         if (var1) {
            if (this.ICCOHHOHICIIHRHOIIICRICCOIOICI == null) {
               this.ICCOHHOHICIIHRHOIIICRICCOIOICI = new MumbleLink();
            }

            if (this.ICCOHHOHICIIHRHOIIICRICCOIOICI.isLoaded()) {
               this.HHIOOOOOOCHRCRORHOHCCCHHCRRRHO();
            } else {
               this.OHRIOOOCRICRIIHCCIOCHHHRHRHHOC = true;
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .CIICCRHHHOHOIOHCHRHOORCICRCORC(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("mumbleLinkErrorPopup"));
            }
         } else {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .CIICCRHHHOHOIOHCHRHOORCICRCORC(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("mumbleLinkDisabledPopup"));
         }
      }
   }

   public void HHIOOOOOOCHRCRORHOHCCCHHCRRRHO() {
      if (!this.OICIIROIORRRHOCOHCRRRCRIROCHIR) {
         try {
            this.OICIIROIORRRHOCOHCRRRCRIROCHIR = this.ICCOHHOHICIIHRHOIIICRICCOIOICI.init() >= 0;
         } catch (Throwable var2) {
            this.OHRIOOOCRICRIIHCCIOCHHHRHRHHOC = true;
            this.OICIIROIORRRHOCOHCRRRCRIROCHIR = false;
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .CIICCRHHHOHOIOHCHRHOORCICRCORC(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("mumbleLinkErrorPopup"));
            var2.printStackTrace();
         }
      }

      if (this.OICIIROIORRRHOCOHCRRRCRIROCHIR) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .CIICCRHHHOHOIOHCHRHOORCICRCORC(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("mumbleLinkEnabledPopup"));
      }
   }

   @Override
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RROHICHROOOOORICCIRCHOOIRCRHIO
         )
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   @Override
   public boolean HOCIIHOCHHORRHHOIOOHOCIRCOOIHR() {
      return false;
   }
}
