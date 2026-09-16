package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR;

import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.UUID;
import java.util.function.IntConsumer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends Thread {
   private final Path CHRCHRHCCIROCCOCOIOIHICRIIICOO;
   @Nullable
   private final UUID CCRHHCCRRRCIIIHROIIROCIROCIICI;
   private final boolean RHHROCIIHCHOCROHRCOHCCRCHOOICI;
   private final boolean RROCROIOCIHCCHIICIOICOIOICICOR;
   private final String HHORIIRRCCCCCCHCCHCHOHRIOCHIOI;
   private final IntConsumer CHRIIIORCIRCOIOCCIORHCIHHHIHRO;
   private final String CICCIOHRHHHIHIHRHIOIIIHRRCRHOC;
   private final String HIRIRIOORHCRHHHROHIIRRIRIORCHH;

   @Override
   public void run() {
      try {
         if (this.RROCROIOCIHCCHIICIOICOIOICICOR) {
            boolean var6 = IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, this.CHRCHRHCCIROCCOCOIOIHICRIIICOO);
            String var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IIRIRICCICRCRHRIRHOOIIHOOHOCRH()
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6 ? "copiedScreenshot" : "copyFailed");
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$submit(
                  () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$getGuiIngame()
                     .bridge$getChatGUI()
                     .bridge$addMessage(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .CCRIHCIIOOIOHIRCCHIICCRHIROORC(var8)
                     )
               );
            return;
         }

         String var1 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               this.CHRCHRHCCIROCCOCOIOIHICRIIICOO,
               this.HHORIIRRCCCCCCHCCHCHOHRIOCHIOI,
               this.CCRHHCCRRRCIIIHROIIROCIROCIICI,
               this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO,
               this.CICCIOHRHHHIHIHRHIOIIIHRRCRHOC,
               this.HIRIRIOORHCRHHHROHIIRRIRIORCHH
            )
            .HOCOCORRHOOIOCICRICHRIHRHHCOOC();
         if (this.RHHROCIIHCHOCROHRCOHCCRCHOOICI) {
            String var2 = "Look what I am up to %F0%9F%91%80";
            var2 = var2.replace(" ", "%20");
            String var3 = "https://twitter.com/intent/tweet?url=" + URLEncoder.encode(var1, StandardCharsets.UTF_8) + "&via=LunarClient&text=" + var2;
            URI var4 = new URI(var3);
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$submit(
                  () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$displayScreen(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var3, var4, false)
                     )
               );
            return;
         }

         com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1, OpenUrlRequest.Initiator.INITIATOR_SCREENSHOT_UPLOAD
         );
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CORCOCICIRIOHROHROIIOOHICCHCRR.INFO,
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "screenshotOpened"
               )
            );
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$submit(() -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(null));
      } catch (Exception var5) {
         if (this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO != null) {
            this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO.accept(100);
         }

         var5.printStackTrace();
      }
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(Path var1, @Nullable UUID var2, boolean var3, boolean var4, String var5, IntConsumer var6, String var7, String var8) {
      this.CHRCHRHCCIROCCOCOIOIHICRIIICOO = var1;
      this.CCRHHCCRRRCIIIHROIIROCIROCIICI = var2;
      this.RHHROCIIHCHOCROHRCOHCCRCHOOICI = var3;
      this.RROCROIOCIHCCHIICIOICOIOICICOR = var4;
      this.HHORIIRRCCCCCCHCCHCHOHRIOCHIOI = var5;
      this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO = var6;
      this.CICCIOHRHHHIHIHRHIOIIIHRRCRHOC = var7;
      this.HIRIRIOORHCRHHHROHIIRRIRIORCHH = var8;
   }
}
