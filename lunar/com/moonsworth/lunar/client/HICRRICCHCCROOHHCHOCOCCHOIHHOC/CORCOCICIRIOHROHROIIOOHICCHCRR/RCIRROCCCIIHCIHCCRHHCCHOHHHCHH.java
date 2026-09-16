package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.RHCHRCOCCOIIIHCHRHIRCORHRHRICR;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;
import java.util.function.Consumer;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final URI IRHCRRHORROOHHRCHRROICRROIIOIO;

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, boolean var1, boolean var2, Runnable var3, Consumer<String> var4) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.IRIIRHOOOCCHRORRIRIHIHHOORRCOC(), var0.getUrl(), var1, var2, var3, var4);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, String var1, boolean var2, boolean var3, Runnable var4, Consumer<String> var5
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .ICRIOCOOICRIIIRIHIRIOIHCOHHIIC();
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = var6.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var7 == null) {
         System.out.println("Cannot change skin: no account selected.");
      } else {
         String var8 = var7.getAccessToken();
         if (var8 != null && var7.CRHCHHROOCCHRHHOHRCHICCIRRIHRC()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var0, var1, var2, var3, var4, var5);
         } else {
            System.out.println("Cannot change skin: access token is not valid.");
         }
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, byte[] var1, boolean var2, Consumer<JsonObject> var3, Consumer<String> var4
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .ICRIOCOOICRIIIRIHIRIOIHCOHHIIC();
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var5.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var6 == null) {
         System.out.println("Cannot change skin: no account selected.");
      } else {
         String var7 = var6.getAccessToken();
         if (var7 != null && var6.CRHCHHROOCCHRHHOHRCHICCIRRIHRC()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var0, var1, var2, var3, var4);
         } else {
            System.out.println("Cannot change skin: access token is not valid.");
         }
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, String var2, boolean var3, boolean var4, Runnable var5, Consumer<String> var6
   ) {
      try {
         Builder var7 = HttpRequest.newBuilder();
         var7.uri(IRHCRRHORROOHHRCHRROICRROIIOIO);
         var7.header("Authorization", "Bearer " + var0);
         if (var4) {
            byte[] var8 = CORCOCICIRIOHROHROIIOOHICCHCRR.ICRCIIIHROCRHOHHHHRCCCOOCICHOO(var2);
            if (var8 == null) {
               var6.accept("Invalid skin URL. Please provide a direct link to the skin's image.");
               return;
            }

            String var9 = RHCHRCOCCOIIIHCHRHIRCORHRHRICR.IHOIORORRHCRHIIOOCRIRCRRICIIIC();
            var7.header("Content-Type", "multipart/form-data; boundary=" + var9 + "; charset=utf-8");
            var7.POST(
               RHCHRCOCCOIIIHCHRHIRCORHRHRICR.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  var9,
                  Map.of("variant", var1.getName(), "file", new RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("skin.png", "image/png", var8))
               )
            );
         } else {
            var7.header("Content-Type", "application/json; charset=utf-8");
            var7.POST(RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Map.of("variant", var1.getName(), "url", var2)));
         }

         HttpRequest var12 = var7.build();
         HttpClient var13 = HttpClient.newBuilder().build();
         Consumer var10 = var2x -> {
            String var3x = (String)var2x.body();
            if (var2x.statusCode() != 200) {
               if (var2x.statusCode() == 429) {
                  var6.accept("Rate limited by Mojang. Please try again later.");
               } else {
                  try {
                     JsonElement var8x = new JsonParser().parse(new StringReader((String)var2x.body()));
                     String var10x = var8x.getAsJsonObject().get("errorMessage").getAsString();
                     if (var10x.equals("Could not read image data.") || var10x.equals("Invalid skin image")) {
                        var6.accept("Invalid skin URL. Please provide a direct link to the skin's image.");
                        return;
                     }
                  } catch (Exception var7x) {
                     var7x.printStackTrace();
                  }

                  String var9x = "";
                  if (!var3x.isEmpty()) {
                     var9x = " (body: " + var3x + ")";
                  }

                  var6.accept("Non-200 status code " + var2x.statusCode() + " received from server" + var9x);
               }
            } else {
               if (!var3x.isEmpty()) {
                  try {
                     JsonElement var4x = new JsonParser().parse(new StringReader((String)var2x.body()));
                     if (var4x.isJsonObject()) {
                        JsonElement var5x = var4x.getAsJsonObject().get("message");
                        if (var5x != null && var5x.isJsonPrimitive()) {
                           var6.accept(var5x.getAsString());
                           return;
                        }
                     }
                  } catch (Exception var6x) {
                     var6.accept("Unexpected exception: " + var6x.getMessage());
                     return;
                  }
               }

               var5.run();
            }
         };
         if (var3) {
            var13.sendAsync(var12, BodyHandlers.ofString()).thenAccept(var10);
         } else {
            var10.accept(var13.send(var12, BodyHandlers.ofString()));
         }
      } catch (Exception var11) {
         var11.printStackTrace();
         var6.accept("Unexpected error: " + var11.getMessage());
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, byte[] var2, boolean var3, Consumer<JsonObject> var4, Consumer<String> var5
   ) {
      try {
         Builder var6 = HttpRequest.newBuilder();
         var6.uri(IRHCRRHORROOHHRCHRROICRROIIOIO);
         var6.header("Authorization", "Bearer " + var0);
         if (var2 == null) {
            var5.accept("Invalid skin URL. Please provide a direct link to the skin's image.");
            return;
         }

         String var7 = RHCHRCOCCOIIIHCHRHIRCORHRHRICR.IHOIORORRHCRHIIOOCRIRCRRICIIIC();
         var6.header("Content-Type", "multipart/form-data; boundary=" + var7 + "; charset=utf-8");
         var6.POST(
            RHCHRCOCCOIIIHCHRHIRCORHRHRICR.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var7,
               Map.of("variant", var1.getName(), "file", new RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("skin.png", "image/png", var2))
            )
         );
         HttpRequest var8 = var6.build();
         HttpClient var9 = HttpClient.newBuilder().build();
         Consumer var10 = var2x -> {
            String var3x = (String)var2x.body();
            if (var2x.statusCode() != 200) {
               if (var2x.statusCode() == 429) {
                  var5.accept("Rate limited by Mojang. Please try again later.");
               } else {
                  try {
                     JsonElement var8x = new JsonParser().parse(new StringReader((String)var2x.body()));
                     String var10x = var8x.getAsJsonObject().get("errorMessage").getAsString();
                     if (var10x.equals("Could not read image data.") || var10x.equals("Invalid skin image")) {
                        var5.accept("Invalid skin URL. Please provide a direct link to the skin's image.");
                        return;
                     }
                  } catch (Exception var7x) {
                     var7x.printStackTrace();
                  }

                  String var9x = "";
                  if (!var3x.isEmpty()) {
                     var9x = " (body: " + var3x + ")";
                  }

                  var5.accept("Non-200 status code " + var2x.statusCode() + " received from server" + var9x);
               }
            } else {
               if (!var3x.isEmpty()) {
                  try {
                     JsonElement var4x = new JsonParser().parse(new StringReader((String)var2x.body()));
                     if (var4x.isJsonObject()) {
                        JsonElement var5x = var4x.getAsJsonObject().get("message");
                        if (var5x != null && var5x.isJsonPrimitive()) {
                           var5.accept(var5x.getAsString());
                           return;
                        }

                        var4.accept(var4x.getAsJsonObject());
                     }
                  } catch (Exception var6x) {
                     var5.accept("Unexpected exception: " + var6x.getMessage());
                  }
               }
            }
         };
         if (var3) {
            var9.sendAsync(var8, BodyHandlers.ofString()).thenAccept(var10);
         } else {
            var10.accept(var9.send(var8, BodyHandlers.ofString()));
         }
      } catch (Exception var11) {
         var11.printStackTrace();
         var5.accept("Unexpected error: " + var11.getMessage());
      }
   }

   static {
      try {
         IRHCRRHORROOHHRCHRROICRROIIOIO = new URI("https://api.minecraftservices.com/minecraft/profile/skins");
      } catch (URISyntaxException var1) {
         throw new AssertionError(var1);
      }
   }
}
