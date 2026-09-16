package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.CHHIICHRIIROIOHIHIIROICOCCROCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.TrayIcon.MessageType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> actions = new ArrayList<>();
   private final Set<String> OHRCCIRRCIIRORHOHCICIOIOOHROIR = new LinkedHashSet<>();
   private int HCRCRROICORROCRCHICRRCICIORRII = -1;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         this::ORHIOICIOCRRHOOCOHRORIHICHRCRR,
         101
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         this::HRCHROOHRIHCRCRHRIIROCIRHOIRHH
      );
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, var1 -> {
         if (!this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.isEmpty()) {
            if (this.mc.bridge$getPlayer() == null) {
               this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.clear();
            } else if (this.HCRCRROICORROCRCHICRRCICIORRII >= 0) {
               this.HCRCRROICORROCRCHICRRCICIORRII--;
            }
         }
      });
   }

   @Override
   public String getId() {
      return "AUTO_TEXT_ACTIONS";
   }

   @Override
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RROHICHROOOOORICCIRCHOOIRCRHIO)
         .HRCHROOHRIHCRCRHRIIROCIRHOIRHH("alert", "alerts", "notification", "notifications")
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   @Override
   public void CCCRRCHRRRHIOIHCIHRHROIROCIRRI() {
      super.CCCRRCHRRRHIOIHCIHRHROIROCIRRI();
      this.actions.clear();
      this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.clear();
      this.IIOHIOCOHICIHOROCIORROORHCCORC();
   }

   private void ORHIOICIOCRRHOOCOHRORIHICHRCRR(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (!var1.isCancelled()) {
         String var2 = var1.OIHOIRRICORHHRHOIOIHORCHOIRCOO();

         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.actions) {
            if (var4.matches(var2)) {
               if (var4.CROHOHHCICHOOCIIIIHRIHHOIHHRIO.get()) {
                  var1.cancel();
               }

               if (var4.HIRCHCHRHIRHROOHIIHHCIROHHHIOC.get()) {
                  this.mc
                     .bridge$getSoundHandler()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIOHIHCORHCIOCCCHHHIRROHORIRR
                     );
               }

               if (!var4.ORCORRIRHHCCIIOOOCOROCCRCIICCO.isHidden() && var4.ORCORRIRHHCCIIOOOCOROCCRCIICCO.get()) {
                  CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("notificationTitle"), var2, MessageType.INFO
                  );
               }

               if (!var4.IOIIIHCRIHIRIHIOIRIROIHIHCOOHH.isHidden() && var4.IOIIIHCRIHIRIHIOIRIROIHIHCOOHH.get()) {
                  this.OCIHRIRRIIHIHORCOOROCHICIRHHHI
                     .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.INFO, this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("notificationTitle"), var2);
               }

               if (var4.RHROROIHROHCHHRRRCRIHCHOIOHCIO.get()) {
                  String var5 = var4.CCRICHIOCIRCRHHORCROIIIHCORIRC.get();
                  if (var5 != null) {
                     var5 = var5.trim();
                     if (!var5.isEmpty()) {
                        var5 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithFormattingCodesFromAmpersand(var5);
                        this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.add(var5);
                     }
                  }
               }
            }
         }
      }
   }

   private void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.isEmpty()) {
         this.HCRCRROICORROCRCHICRRCICIORRII = -1;
      } else {
         String var2 = this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.iterator().next();
         if (this.HCRCRROICORROCRCHICRRCICIORRII == 0) {
            this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.remove(var2);
            this.HCRCRROICORROCRCHICRRCICIORRII = -1;
            if (this.OHRCCIRRCIIRORHOHCICIOIOOHROIR.isEmpty()) {
               return;
            }
         }

         byte var3 = 10;
         byte var4 = 10;
         byte var5 = 40;
         if (this.HCRCRROICORROCRCHICRRCICIORRII == -1) {
            this.HCRCRROICORROCRCHICRRCICIORRII = 60;
         } else if (this.HCRCRROICORROCRCHICRRCICIORRII > 0) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO();
            float var7 = this.HCRCRROICORROCRCHICRRCICIORRII - var6.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR();
            int var8 = 255;
            if (this.HCRCRROICORROCRCHICRRCICIORRII > 50) {
               float var9 = 60.0F - var7;
               var8 = (int)(var9 * 255.0F / 10.0F);
            }

            if (this.HCRCRROICORROCRCHICRRCICIORRII <= 10) {
               var8 = (int)(var7 * 255.0F / 10.0F);
            }

            var8 = Math.min(255, Math.max(var8, 0));
            if (var8 > 8) {
               this.mc.bridge$getGuiIngame().bridge$clearTitle();
               var6.push();
               var6.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                  (float)(var1.HIHOHOHORCOIRRCHOORHORCIORRRHH().ICORIROICCORCRROCRCIRRRHHHOOIR() / 2.0),
                  (float)var1.HIHOHOHORCOIRRCHOORHORCIORRRHH().OICOHRRRRCOICCHOIOROHOCOORCHII() / 2.0F
               );
               var6.scale(4.0F, 4.0F, 4.0F);
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(),
                  var2,
                  -IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var2) / 2.0F,
                  -10.0F,
                  16777215 | var8 << 24 & 0xFF000000,
                  true
               );
               var6.pop();
            }
         }
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.actions) {
         var3.validate();
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3::getDisplayName,
            var2 -> var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var3.HIHRCIHOOIRRIIOICOHHROIHOIIORH,
               var2x -> {
                  var2x.ROHRRRCRRCHRROOOOIOHRCCHRRROOR("triggerSetup");
                  var2x.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.HRCIORHRIOHIIHCRHRCRIICOOHIHHO, var3.IIRCOIHCCRROIORCICROIHCOHHCOHR);
                  var2x.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.OIRIORRIOOHRCHCIIICICRIROOOROI, var3.RCORCRRORIOHCIHHHOIHHHIOOROHOR)
                     .IIHRRHORCRCROCHHOHORCHCROCIHRO(var3.IIRCOIHCCRROIORCICROIHCOHHCOHR::get);
                  var2x.HOCRHCOCIHIOHHCRIOOIHRCCCRIRHR();
                  var2x.ROHRRRCRRCHRROOOOIOHRCCHRRROOR("actionSetup");
                  var2x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var3.RHROROIHROHCHHRRRCRIHCHOIOHCIO, var1xxx -> var1xxx.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.CCRICHIOCIRCRHHORCROIIIHCORIRC)
                  );
                  var2x.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.CROHOHHCICHOOCIIIIHRIHHOIHHRIO, var3.HIRCHCHRHIRHROOHIIHHCIROHHHIOC);
                  var2x.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.IOIIIHCRIHIRIHIOIRIROIHIHCOOHH, var3.ORCORRIRHHCCIIOOOCOROCCRCIICCO)
                     .IIHRRHORCRCROCHHOHORCHCROCIHRO(() -> !CHHIICHRIIROIOHIHIIROICOCCROCI.RHIOHCICICCOCOHRRCICHRCIICHOCC());
                  var2x.HOCRHCOCIHIOHHCRIOOIHRCCCRIRHR();
                  var2x.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     IOHHOIIOCRHCHHCRORICCOHOHROOIH.OHCIIRROIRICICHOIORRIIHICCCRCH("clone")
                        .RCIROOOOICRHCCRRCIORHHIRCOIIIC(
                           () -> {
                              try {
                                 IRCIIHHICIHRCOCRROCOICRIHHCCHH var2xx = var3.OORHHHHOIROHCCHOCRCHHHIHRCRHHH();
                                 var3.HIHRCIHOOIRRIIOICOHHROIHOIIORH.IOOORHIIOIRRCRIHHCHIRCCHCRRCCR(false);
                                 var2xx.HIHRCIHOOIRRIIOICOHHROIHOIIORH.IOOORHIIOIRRCRIHHCHIRCCHCRRCCR(true);
                                 this.actions.add(var2xx);
                              } catch (IOException var3x) {
                                 com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    var3x, "Cloning Text Action"
                                 );
                              }

                              this.IIOHIOCOHICIHOROCIORROORHCCORC();
                           }
                        ),
                     IOHHOIIOCRHCHHCRORICCOHOHROOIH.OHCIIRROIRICICHOIORRIIHICCCRCH("remove").RCIROOOOICRHCCRRCIORHHIRCOIIIC(() -> {
                        this.actions.remove(var3);
                        this.IIOHIOCOHICIHOROCIORROORHCCORC();
                     })
                  );
               }
            )
         );
      }

      var1.HOCRHCOCIHIOHHCRIOOIHRCCCRIRHR();
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(IOHHOIIOCRHCHHCRORICCOHOHROOIH.OHCIIRROIRICICHOIORRIIHICCCRCH("addTrigger").RCIROOOOICRHCCRRCIORHHIRCOIIIC(() -> {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var1x = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
         var1x.HIHRCIHOOIRRIIOICOHHROIHOIIORH.IOOORHIIOIRRCRIHHCHIRCCHCRRCCR(true);
         this.actions.add(var1x);
         this.IIOHIOCOHICIHOROCIORROORHCCORC();
      }));
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      super.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      var1.remove("options");
      JsonArray var2 = new JsonArray();
      this.actions
         .forEach(
            var1x -> {
               JsonObject var2x = new JsonObject();

               try {
                  var1x.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2x);
               } catch (IOException var4) {
                  com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4, "Saving action in Auto Text Actions"
                  );
               }

               var2.add(var2x);
            }
         );
      var1.add("actions", var2);
   }

   @Override
   public void load(JsonObject var1) {
      this.actions.clear();
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2 = this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
      var2.HHCIIIIRHRRCHOOCOIRRIROIOOOOOH().clear();
      var1.remove("options");
      super.load(var1);
      if (var1.has("actions")) {
         for (JsonElement var5 : var1.getAsJsonArray("actions")) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();

            try {
               var6.load(var5.getAsJsonObject());
            } catch (IOException var8) {
               com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var8, "Loading action in Auto Text Actions"
               );
            }

            this.actions.add(var6);
         }
      }

      var2.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this);
   }

   private void IIOHIOCOHICIHOROCIORROORHCCORC() {
      this.ORHHROIRHRHOHCOCORCHROHRICCHOO();
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIHOOOHRRCROHRICOOOOOIHIOOIRHI();
   }
}
