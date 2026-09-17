package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import org.joml.Vector3d;
import org.jspecify.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICIORIHOCHCOHRIHIHCHRRCCCHCOCO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionPath"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   public final HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRRCCOHCIHHHRHHRRCHICOHROOIOOC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionCollisionBox"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   public final HICHRCOHCCRHOHCICOOCHOIHCCHIRI IHIRHRICHCHORICRHIORHOHRIOIIOR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionCollisions"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI CIIRRHOICHIIHCHHORIIOICHHOIOCI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionState"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ROOCIIHOIICIIHCIIHHRICHCHORHII = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionTargetPos"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI IICOIOCRRCHOICRRHCCHIHIRHRIIOO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionVelocity"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ROHRCRHORCCHRRCRCHCHOHCHCORRRC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionOnGround"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ROIOHOROCOIRIRRRRRIRIRRIHRRIIH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showCompanionPos"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCICHOCCRIHORROHIOCRROCCIICO, CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1)
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO,
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         )
      );
   }

   @Override
   public String getId() {
      return "COMPANION_DEBUG";
   }

   @OverridingMethodsMustInvokeSuper
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         "companionDebugOptions",
         var1x -> var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(
            this.ICIORIHOCHCOHRIHIHCHRRCCCHCOCO,
            this.IRRCCOHCIHHHRHHRRCHICOHROOIOOC,
            this.IHIRHRICHCHORICRHIORHOHRIOIIOR,
            this.CIIRRHOICHIIHCHHORIIOICHHOIOCI,
            this.ROIOHOROCOIRIRRRRRIRIRRIHRRIIH,
            this.IICOIOCRRCHOICRRHCCHIHIRHRIIOO,
            this.ROHRCRHORCCHRRCRCHCHOHCHCORRRC,
            this.ROOCIIHOIICIIHCIIHHRICHCHORHII,
            IOHHOIIOCRHCHHCRORICCOHOHROOIH.OHCIIRROIRICICHOIORRIIHICCCRCH("whereIsCompanion")
               .CIOORRCRICOIICROHRHRHHOHRCCRII(140.0F)
               .RCIROOOOICRHCCRRCIORHHIRCOIIIC(
                  () -> {
                     for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IOHRIRCHOCIOIOIHIHOCCCHOHOHOCH()
                        .OOIRHRCCRIIHRCOIOCROCORHRRIHRC()
                        .keySet()) {
                        if (var2 instanceof com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
                           && var3.OORHCIORORHOHHROIRROHIIOIHRCHH().equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH())) {
                           HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = var3.HHIRHRHIORICHOHOCOICCRCCIRHIOO();
                           String var4;
                           String var5;
                           if (var6 == null) {
                              var5 = "/minecraft:tp " + var3.bridge$getPosX() + " " + var3.bridge$getPosY() + " " + var3.bridge$getPosZ();
                              var4 = "[" + var3.bridge$getPosX() + ", " + var3.bridge$getPosY() + ", " + var3.bridge$getPosZ() + "]";
                           } else {
                              var5 = "/minecraft:tp " + var6.bridge$getX() + " " + var6.bridge$getY() + " " + var6.bridge$getZ();
                              var4 = "[" + var6.bridge$getX() + ", " + var6.bridge$getY() + ", " + var6.bridge$getZ() + "]";
                           }

                           IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
                              .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 Component.text()
                                    .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("companionIsAt"))
                                    .append(
                                       Component.text()
                                          .content(var4)
                                          .color(NamedTextColor.GRAY)
                                          .hoverEvent(Component.text(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("clickToTeleport"), NamedTextColor.GREEN))
                                          .clickEvent(ClickEvent.runCommand(var5))
                                    )
                                    .build()
                              );
                           return;
                        }
                     }

                     IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
                        .bridge$sendChatMessage(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("companionDoesntExist"));
                  }
               )
         )
      );
   }

   @Override
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCCIRORHIRRORROOOOCCHCRIORHOIC
         )
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR("FX")
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   public List<Component> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      boolean var2
   ) {
      ArrayList var3 = new ArrayList();
      if (var2) {
         var3.add(
            Component.text()
               .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("yourEquippedCosmetic"))
               .append(Component.text(var1.RIHOOCCOHROICCHOIICOICRRHRCHRI().getName(), NamedTextColor.DARK_PURPLE))
               .build()
         );
         var3.add(Component.empty());
      } else {
         Component var4 = var1.OORHCIORORHOHHROIRROHIIOIHRCHH().bridge$getDisplayNameComponent();
         var3.add(Component.empty().append(var4, Component.text(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("theirCompanion"))));
      }

      if (this.CIIRRHOICHIIHCHHORIIOICHHOIOCI.get()) {
         com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var6 = var1.OCHORRRCHIRHRCHHOIHCOOCOCROIOC();
         String var5;
         if (var6 != null) {
            var5 = var6.getId();
         } else {
            var5 = "-";
         }

         var3.add(
            Component.text()
               .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("state"))
               .append(Component.text(var5, NamedTextColor.GRAY))
               .append(Component.text(" (" + var1.OOHOHCRICIRHOHRHIRRROCHHOHIHOO() + ")"))
               .build()
         );
      }

      if (this.ROIOHOROCOIRIRRRRRIRIRRIHRRIIH.get()) {
         var3.add(
            Component.text()
               .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("pos"))
               .append(
                  Component.text(String.format("[%.2f, %.2f, %.2f]", var1.bridge$getPosX(), var1.bridge$getPosY(), var1.bridge$getPosZ()), NamedTextColor.GRAY)
               )
               .build()
         );
      }

      if (this.ROOCIIHOIICIIHCIIHHRICHCHORHII.get()) {
         Vector3d var7 = var1.IICOROICOORCCRRIORRROOOHRRIIRH();
         var3.add(
            Component.text()
               .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("targetPos"))
               .append(Component.text(var7 != null ? "[" + var7.x() + ", " + var7.y() + ", " + var7.z() + "]" : "[]", NamedTextColor.GRAY))
               .build()
         );
      }

      if (this.IICOIOCRRCHOICRRHCCHIHIRHRIIOO.get()) {
         Vector3d var8 = var1.IRIIRROHHRCROORCIOIORRCOOIOOIR();
         var3.add(
            Component.text()
               .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("velocity"))
               .append(Component.text(String.format("[%.2f, %.2f, %.2f]", var8.x(), var8.y(), var8.z()), NamedTextColor.GRAY))
               .build()
         );
      }

      if (this.ROHRCRHORCCHRRCRCHCHOHCHCORRRC.get()) {
         var3.add(
            Component.text()
               .content(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("onGround"))
               .append(
                  var1.HHICIORROHIIIOIICORIRCORICOCOO()
                     ? Component.text(
                        com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OIHORRIHOHRCROIIIIHIOOIIHHORHI,
                        NamedTextColor.GREEN
                     )
                     : Component.text(
                        com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHOCIHCHRORIOOHIHHCCCIIIIHHOCO,
                        NamedTextColor.DARK_RED
                     )
               )
               .build()
         );
      }

      return var3;
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRICCOOHHHCHOORCICOCOHIHOIRHOO<List<Component>> {
      private @Nullable WeakReference<IRCIIHHICIHRCOCRROCOICRIHHCCHH> CCIIORHROCCRHCIIROIRHOIORCCHCI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(0.0F, 0.0F, RRCRRCORICCHOHHIRCHIROOHIIOHCO.TOP_LEFT);
      }

      @Override
      public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH RHRCHCRRICCCOOIHHROROOOICCOHRH() {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHHIHHRICOHICCORICHHICCORCCCOH()
            .HOIHOROOIOOCOIHCRIRIRIRRICIIHC(false)
            .OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(false)
            .IROORIICOORCHOHRHRROCHROORHOHR();
      }

      @Override
      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH HRRIHHICORIHCHICOHCCRCHCHOHRCH() {
         return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(0, 50, 200, 0, 50, 200);
      }

      public @Nullable List<Component> IROCHOHCORHCOCCCOCHORCICRORIIC(boolean var1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() == null) {
            this.CCIIORHROCCRHCIIROIRHOIORCCHCI = null;
         } else {
            if (this.CCIIORHROCCRHCIIROIRHOIORCCHCI == null || this.CCIIORHROCCRHCIIROIRHOIORCCHCI.get() == null) {
               for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IOHRIRCHOCIOIOIHIHOCCCHOHOHOCH()
                  .OOIRHRCCRIIHRCOIOCROCORHRRIHRC()
                  .keySet()) {
                  if (var3 instanceof com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
                     && var4.OORHCIORORHOHHROIRROHIIOIHRCHH().equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH())) {
                     this.CCIIORHROCCRHCIIROIRHOIORCCHCI = new WeakReference<>(var4);
                     break;
                  }
               }
            }

            if (this.CCIIORHROCCRHCIIROIRHOIORCCHCI != null) {
               com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.CCIIORHROCCRHCIIROIRHOIORCCHCI
                  .get();
               if (var5 != null) {
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, true);
               }
            }
         }

         return null;
      }
   }
}
