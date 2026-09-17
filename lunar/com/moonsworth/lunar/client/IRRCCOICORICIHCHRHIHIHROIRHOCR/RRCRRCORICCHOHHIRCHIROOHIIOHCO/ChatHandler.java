package com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.serializer.legacy.LegacyComponentSerializer;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Pattern COCHCHIICCCHOICOHRICICCIIHCICH = Pattern.compile(
      "^Party Finder > ([a-zA-Z_0-9]+) joined the dungeon group! \\([a-zA-Z]+ Level [0-9]+\\)$"
   );
   private static final Pattern HIIHHOCORIIOCHRCRCRHRHICHICORR = Pattern.compile("^You have joined (?:\\[(?<rank>[^]]+)] )?(?<name>\\w+)'s? party!$");
   private static final Component IHHIOCRROICIHRHICIICOIIOHROORO = Component.text(
      "-----------------------------------------------------", NamedTextColor.BLUE, TextDecoration.STRIKETHROUGH
   );
   private static final Pattern OCROHORORRCHRRRCHCHRRHRCHHHOOO = Pattern.compile("(?i)§.");
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH HIROIORICOCCCRIOCOOIICICHOORRI = null;
   private boolean CCORIIOIOIIOHRIIHICOCCCIRRRHOI = false;
   private int ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR = 0;

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      this.handle(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class, this::CRRRICCRROCOHHOHIICIHORCOORRRH);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         this::CORCOCICIRIOHROHROIIOOHICCHCRR
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         this::OCOHORHCROHICRRIHCIHHRRCIHICRI,
         Integer.MAX_VALUE
      );
   }

   @Override
   public void onEnable() {
      if (!com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
      )) {
         this.HIROIORICOCCCRIOCOOIICICHOORRI = null;
      } else if (!this.CCORIIOIOIIOHRIIHICOCCCIRRRHOI) {
         this.CCORIIOIOIIOHRIIHICOCCCIRRRHOI = true;
         this.HIROIORICOCCCRIOCOOIICICHOORRI = null;
         this.CRIORHIHRRIHCHRRHIHCORRHHICOCR();
      }

      this.ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR = 0;
   }

   @Override
   public void onDisable() {
      this.HIROIORICOCCCRIOCOOIICICHOORRI = null;
      this.CCORIIOIOIIOHRIIHICOCCCIRRRHOI = false;
      this.ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR = 0;
   }

   @Override
   protected boolean isEnabled() {
      return com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
      );
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(RICRIRRCOHRCOCRRHHCRHRROOIOHHR var1) {
      this.onEnable();
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      this.onDisable();
   }

   private void OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (this.ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR > 0) {
         if (IHHIOCRROICIHRHICIICOIIOHROORO.equals(var1.OIOORCCOCHRRIRRORRICOCOCROICII())) {
            this.ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR--;
         }

         if (this.ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR != 2) {
            var1.setCancelled(true);
         }
      }

      this.HIROIORICOCCCRIOCOOIICICHOORRI = this.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1);
   }

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      String var2 = LegacyComponentSerializer.legacySection().serialize(var1.OIOORCCOCHRRIRRORRICOCOCROICII());
      String var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
         var1.HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO()
      );
      if (!var2.startsWith("§cYou are not currently in a party")
         && !var2.startsWith("§eYou left the party.")
         && !var2.startsWith("§You have been kicked from the party")
         && !var2.startsWith("§cThe party was disbanded")
         && !var3.equals("The party was disbanded because all invites expired and the party was empty")
         && !var2.endsWith("§ehas disbanded the party!")) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.HIROIORICOCCCRIOCOOIICICHOORRI == null
            ? new HHCCIRHCCCIIRHCROHIORHIRHHIORH()
            : this.HIROIORICOCCCRIOCOOIICICHOORRI;
         if (var3.startsWith("Party Leader: ")) {
            String[] var5 = var3.replace("Party Leader: ", "").split(" ");
            String var6 = null;

            for (String var10 : var5) {
               if (!var10.equals("●") && !var10.startsWith("[")) {
                  var6 = var10;
               }
            }

            if (var6 != null) {
               var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(var6);
               var4.ROCIIOIHHRIICIRIHOOHCCCOOIORHI = var6;
            }
         }

         if (var3.startsWith("Party Leader: ") || var3.startsWith("Party Members: ") || var3.startsWith("Party Moderators: ")) {
            String[] var11 = var3.replace("Party Leader: ", "").replace("Party Members: ", "").replace("Party Moderators: ", "").split(" ");

            for (String var31 : var11) {
               var31 = var31.replace(",", "");
               if (!var31.equals("●") && !var31.startsWith("[")) {
                  var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(var31);
               }
            }
         }

         if (var3.startsWith("The party was transferred to ")) {
            String[] var12 = var3.replace("The party was transferred to ", "").split(" by ");
            String[] var15 = var12[0].split(" ");
            var4.ROCIIOIHHRIICIRIHOOHCCCOOIORHI = var15[var15.length - 1];
         }

         Matcher var13 = HIIHHOCORIIOCHRCRCRHRHICHICORR.matcher(var3);
         if (var13.matches()) {
            String var19 = var13.group("name");
            var4.ROCIIOIHHRIICIRIHOOHCCCOOIORHI = var19;
            var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.clear();
            var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName());
            var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(var19);
            return var4;
         }

         if (var2.startsWith("§eYou'll be partying with:")) {
            String[] var18 = var3.replace("You'll be partying with: ", "").split(" ");

            for (String var34 : var18) {
               var34 = var34.replace(",", "");
               if (!var34.equals("●") && !var34.startsWith("[")) {
                  var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(var34);
               }
            }

            return var4;
         } else {
            String var16 = null;
            boolean var21 = false;
            if (var2.startsWith("Party Finder §r§f> ") && var2.contains("§r§ejoined the ")) {
               String[] var24 = var2.split(" ");
               var16 = OOCCCCORORRRIOIHRRIIRCCICHHOOC(var24[3]);
               var21 = true;
            }

            if (var2.endsWith(" §ejoined the party.")) {
               String[] var25 = var2.split(" §ejoined the party.");
               var16 = OOCCCCORORRRIOIHRRIIRCCICHHOOC(var25[0]);
               var21 = true;
            }

            if (var2.endsWith(" §ehas left the party.")) {
               String[] var26 = var2.split(" §ehas left the party.");
               var16 = OOCCCCORORRRIOIHRRIIRCCICHHOOC(var26[0]);
               var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.remove(var16);
               var21 = false;
            }

            if (var2.endsWith(" §ehas been removed from the party.")) {
               String[] var27 = var2.split(" §ehas been removed from the party.");
               var16 = OOCCCCORORRRIOIHRRIIRCCICHHOOC(var27[0]);
               var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.remove(var16);
               var21 = false;
            }

            if (var2.endsWith(" §ewas removed from your party because they disconnected")) {
               String[] var28 = var2.split(" §ewas removed from your party because they disconnected");
               var16 = OOCCCCORORRRIOIHRRIIRCCICHHOOC(var28[0]);
               var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.remove(var16);
               var21 = false;
            }

            if (var16 == null) {
               Matcher var29 = COCHCHIICCCHOICOHRICICCIIHCICH.matcher(var3);
               if (var29.matches()) {
                  var16 = var29.group(1);
                  var21 = true;
                  if (var16.equalsIgnoreCase(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName())) {
                     this.CRIORHIHRRIHCHRRHIHCORRHHICOCR();
                     return var4;
                  }
               }
            }

            if (var16 != null) {
               var16 = var16.trim();
               if (var16.contains("] ")) {
                  var16 = var16.split(" ")[1];
               }

               if (var4.ROCIIOIHHRIICIRIHOOHCCCOOIORHI == null) {
                  if (!var21) {
                     return var4;
                  }

                  var4.ROCIIOIHHRIICIRIHOOHCCCOOIORHI = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName();
                  var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.clear();
                  var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName());
               }

               if (var21) {
                  var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.add(var16);
               } else {
                  var4.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.remove(var16);
               }
            }

            return var4;
         }
      } else {
         if (this.HIROIORICOCCCRIOCOOIICICHOORRI != null) {
            this.HIROIORICOCCCRIOCOOIICICHOORRI.ROCIIOIHHRIICIRIHOOHCCCOOIORHI = null;
            this.HIROIORICOCCCRIOCOOIICICHOORRI.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.clear();
         }

         return null;
      }
   }

   private static String OOCCCCORORRRIOIHRRIIRCCICHHOOC(String var0) {
      return var0 == null ? null : OCROHORORRCHRRRCHCHRRHRCHHHOOO.matcher(var0).replaceAll("");
   }

   private void CRIORHIHRRIHCHRRHIHCORRHHICOCR() {
      ORCOCORROHIROCCIORORRRRCHIOOCH.RHHHOORICOOIRHCRIOIRRIHHIIOIRI().schedule(() -> ORCOCORROHIROCCIORORRRRCHIOOCH.RCCCROCHCICCROHCOCCRRROCIIHCCH(() -> {
         if (this.HIROIORICOCCCRIOCOOIICICHOORRI != null) {
            this.HIROIORICOCCCRIOCOOIICICHOORRI.HIHRCRCIHCIOHCRHRHHHOOCHIHRIOI.clear();
         }

         this.ROCCIRHIRHIRRCCIRHRRCIIHHIHCCR = 2;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$sendChatMessage("/party list");
      }), 500L, TimeUnit.MILLISECONDS);
   }

   public Optional<HHCCIRHCCCIIRHCROHIORHIRHHIORH> HRCOOHCRCHOCHOIHIHHHCRHOCCOHRR() {
      return !com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
         )
         ? Optional.empty()
         : Optional.ofNullable(this.HIROIORICOCCCRIOCOOIICICHOORRI);
   }
}
