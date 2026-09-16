package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.IntConsumer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements Callable<String> {
   private static final HttpClient CRHICRIICIRRCIRICHHCCRICCIIHOH = HttpClient.newBuilder().build();
   private final Path path;
   private final String IRROHIROIHHCOHRIOOOCHHCICRHHOH;
   @Nullable
   private final UUID HOHHHIIOIHICHOOHRCRICIIHHCOHHI;
   private IntConsumer CHRIIIORCIRCOIOCCIORHCIHHHIHRO;
   private final String ICIOOOHCCCHOROORCRIIIRORIORIHR;
   private final String OHICOCCRRHIORRRHOIOHRIRHHOCCOI;

   public String HOCOCORRHOOIOCICRICHRIHRHHCOOC() {
      try {
         JsonObject var1 = new JsonObject();
         byte[] var2 = Files.readAllBytes(this.path);
         var1.addProperty("imageBase64", Base64.getEncoder().encodeToString(var2));
         if (this.HOHHHIIOIHICHOOHRCRICIIHHCOHHI != null) {
            var1.addProperty("localId", this.HOHHHIIOIHICHOOHRCRICIIHHCOHHI.toString());
         }

         if (this.ICIOOOHCCCHOROORCRIIIRORIORIHR != null) {
            var1.addProperty("title", this.ICIOOOHCCCHOROORCRIIIRORIORIHR);
         }

         if (this.OHICOCCRRHIORRRHOIOHRIRHHOCCOI != null) {
            var1.addProperty("privacy", this.OHICOCCRRHIORRRHOIOHRIRHHOCCOI);
         }

         byte[] var3 = var1.toString().getBytes(StandardCharsets.UTF_8);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x -> {
            int var4x = (int)((float)var2x / var3.length * 100.0F);
            if (this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO != null) {
               this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO.accept(var4x);
            }
         });
         HttpRequest var5 = HttpRequest.newBuilder()
            .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/game/screenshot/upload"))
            .POST(BodyPublishers.ofInputStream(() -> var4))
            .header("Content-Type", "application/json")
            .header("Authorization", this.IRROHIROIHHCOHRIOOOCHHCICRHHOH)
            .build();
         HttpResponse var6 = CRHICRIICIRRCIRICHHCCRICCIIHOH.send(var5, BodyHandlers.ofString());
         JsonObject var7 = JsonParser.parseString((String)var6.body()).getAsJsonObject();
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO();
         if (var6.statusCode() == 200) {
            return var7.get("link").getAsString();
         } else if (var6.statusCode() == 403) {
            String var9 = var7.get("code").getAsString();
            var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Error while uploading screenshot", var9);
            throw new RuntimeException("Error code " + var9 + " from API.");
         } else {
            var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Error while uploading screenshot", "HTTP Status " + var6.statusCode());
            throw new RuntimeException("HTTP status " + var6.statusCode() + " from API.");
         }
      } catch (IOException | InterruptedException var10) {
         throw new RuntimeException("Failed to upload screenshot to Lunar Client backend", var10);
      }
   }

   @Generated
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Path var1, String var2, @Nullable UUID var3, IntConsumer var4, String var5, String var6) {
      this.path = var1;
      this.IRROHIROIHHCOHRIOOOCHHCICRHHOH = var2;
      this.HOHHHIIOIHICHOOHRCRICIIHHCOHHI = var3;
      this.CHRIIIORCIRCOIOCCIORHCIHHHIHRO = var4;
      this.ICIOOOHCCCHOROORCRIIIRORIORIHR = var5;
      this.OHICOCCRRHIORRRHOIOHRIRHHOCCOI = var6;
   }
}
