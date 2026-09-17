package com.moonsworth.lunar.client.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;
import org.json.JSONObject;

public final class RHCHRCOCCOIIIHCHRHIRCORHRHRICR {
   public static final int IHIIHORCROHOOCHOOOHRCRHIRIICOO = 10;

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Builder var1, Consumer<JsonObject> var2) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, null);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Builder var1, Consumer<JsonObject> var2, Consumer<Throwable> var3) {
      try {
         URI var4 = new URI(var0);
         var1.uri(var4).timeout(Duration.ofSeconds(10L));
         HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(10L))
            .build()
            .sendAsync(var1.build(), BodyHandlers.ofString())
            .orTimeout(10L, TimeUnit.SECONDS)
            .handleAsync((var2x, var3x) -> {
               if (var3x != null) {
                  if (var3 != null) {
                     var3.accept(var3x);
                  }
               } else {
                  JsonElement var4x = new JsonParser().parse((String)var2x.body());
                  if (var4x.isJsonObject()) {
                     try {
                        var2.accept(var4x.getAsJsonObject());
                     } catch (Exception var6) {
                        if (var3 != null) {
                           var3.accept(var6);
                        }
                     }
                  } else if (var3 != null) {
                     var3.accept(new NullPointerException("object was not a JsonObject"));
                  }
               }

               return null;
            });
      } catch (Exception var5) {
         if (var3 != null) {
            var3.accept(var5);
         }
      }
   }

   public static BodyPublisher RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Map<Object, Object> var0) {
      return BodyPublishers.ofString(new JSONObject(var0).toString());
   }

   public static BodyPublisher IHCRORHRORIICHRHRCHRRIRRHHOCOO(Map<Object, Object> var0) {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : var0.entrySet()) {
         if (var1.length() > 0) {
            var1.append("&");
         }

         var1.append(URLEncoder.encode(var3.getKey().toString(), StandardCharsets.UTF_8));
         var1.append("=");
         var1.append(URLEncoder.encode(var3.getValue().toString(), StandardCharsets.UTF_8));
      }

      return BodyPublishers.ofString(var1.toString());
   }

   public static BodyPublisher CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, Map<Object, Object> var1) {
      ArrayList var2 = new ArrayList();

      for (Entry var4 : var1.entrySet()) {
         StringBuilder var5 = new StringBuilder();
         var5.append("\r\n--").append(var0).append("\r\n");
         var5.append("Content-Disposition: form-data; name=\"").append(var4.getKey()).append("\"");
         if (var4.getValue() instanceof RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6) {
            var5.append("; filename=\"").append(var6.filename()).append("\"\r\n");
            var5.append("Content-Type: ").append(var6.COOOIOCROCIHRROHRIOHCICROIRRHO()).append("\r\n\r\n");
            var2.add(var5.toString().getBytes(StandardCharsets.UTF_8));
            var2.add(var6.RIHHCROROROHHROICCIRHOICCOOIHC());
         } else {
            var5.append("\r\n\r\n");
            var5.append(var4.getValue());
            var2.add(var5.toString().getBytes(StandardCharsets.UTF_8));
         }
      }

      var2.add(("\r\n--" + var0 + "--\r\n").getBytes(StandardCharsets.UTF_8));
      return BodyPublishers.ofByteArrays(var2);
   }

   public static String IHOIORORRHCRHIIOOCRIRCRRICIIIC() {
      return UUID.randomUUID().toString();
   }

   public static String HOOCOOIRHCHIICICHOICHCOIRICIHI(String var0) {
      return !var0.startsWith("http://") && !var0.startsWith("https://") ? "http://" + var0 : var0;
   }

   public static String HORHRIOCOOOORHCRIHHORCRIRCOOCI(String var0) {
      return var0.startsWith("wss://") ? var0 : "wss://" + var0;
   }

   @Generated
   private RHCHRCOCCOIIIHCHRHIRCORHRHRICR() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String filename;
      private final String CHCOORIRHHCRCOIOCRCIIRHCIRCRRC;
      private final byte[] COOORRRRHHORRROHRHIOIHRRCHRORI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, byte[] var3) {
         this.filename = var1;
         this.CHCOORIRHHCRCOIOCRCIIRHCIRCRRC = var2;
         this.COOORRRRHHORRROHRHIOIHRRCHRORI = var3;
      }

      public String COOOIOCROCIHRROHRIOHCICROIRRHO() {
         return this.CHCOORIRHHCRCOIOCRCIIRHCIRCRRC;
      }

      public byte[] RIHHCROROROHHROICCIRHOICCOOIHC() {
         return this.COOORRRRHHORRROHRHIOIHRRCHRORI;
      }
   }
}
