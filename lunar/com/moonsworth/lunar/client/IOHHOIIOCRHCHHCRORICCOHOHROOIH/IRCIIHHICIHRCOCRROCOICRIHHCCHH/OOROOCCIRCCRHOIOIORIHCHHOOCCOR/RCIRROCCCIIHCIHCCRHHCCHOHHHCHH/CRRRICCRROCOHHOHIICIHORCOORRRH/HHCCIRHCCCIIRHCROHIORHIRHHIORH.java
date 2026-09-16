package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.conversation.v1.ConversationImage;
import com.lunarclient.websocket.conversation.v1.ConversationReference;
import com.lunarclient.websocket.conversation.v1.GetUploadUrlsRequest;
import com.lunarclient.websocket.conversation.v1.GetUploadUrlsResponse;
import com.lunarclient.websocket.conversation.v1.PresignedUpload;
import com.lunarclient.websocket.conversation.v1.UpdateConversationIconRequest;
import com.lunarclient.websocket.conversation.v1.UploadRequestItem;
import com.lunarclient.websocket.conversation.v1.UploadUsage;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OOCHRIIIRIHRRCRIORHCROIIHCRRIC;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lombok.Generated;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final long CHHOCRCCICROHROHRHOIOCIHICRCII = 5242880L;
   private static final int IHICICIRRCRHROIHROIICHICROOICH = 10;
   private static final ConcurrentHashMap<UUID, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OOCCRRHHRIHOHRCOHHIROCOHCICHIR = new ConcurrentHashMap<>();
   private static final ConcurrentHashMap<UUID, List<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> HHCCHIOHOHHRHRHHIROCIORIHIHIHH = new ConcurrentHashMap<>();
   private static final String CIRRHHIRHROIRROHHIRRHOIIIHIRCR = "conversation:iconPicked";
   private static final String CCCRIRRCCOHCCOOCICCOCCRHRCCOOC = "conversation:iconUpload";
   private static final String IHOOHIRRHIRCOOCCIIHCRCHCOCHOOO = "conversation:chatImagesPicked";
   private static final String HIOCHHICRRHOIIOCCHIHROOICOOCOH = "conversation:chatImagesUploaded";

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, ConversationReference var1) {
      if (var1 == null) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconPicked", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("INVALID_CONVERSATION"));
      } else {
         ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(() -> HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(var0));
      }
   }

   private static void HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(UUID var0) {
      File var1 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Select Group Icon", null, "Image Files", "png", "jpg", "jpeg", "gif", "webp"
      );
      if (var1 == null) {
         CIOORRCRICOIICROHRHRHHOHRCCRII(var0);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconPicked", IOHCRCIIRCHHORROIORRRRHOHIRHHI());
      } else {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0, "conversation:iconPicked");
         if (var2 == null) {
            CIOORRCRICOIICROHRHRHHOHRCCRII(var0);
         } else {
            OOCCRRHHRIHOHRCOHHIROCOHCICHIR.put(var0, var2);
            JsonObject var3 = new JsonObject();
            var3.addProperty("success", true);
            var3.addProperty("dataUrl", RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2));
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconPicked", var3);
         }
      }
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var0, ConversationReference var1) {
      if (var1 == null) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconUpload", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("INVALID_CONVERSATION"));
      } else {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = OOCCRRHHRIHOHRCOHHIROCOHCICHIR.get(var0);
         if (var2 == null) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconUpload", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("NO_PENDING_ICON"));
         } else {
            ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(() -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2));
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, ConversationReference var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      GetUploadUrlsRequest var3 = GetUploadUrlsRequest.newBuilder()
         .setConversationReference(var1)
         .setUsage(UploadUsage.UPLOAD_USAGE_CONVERSATION_ICON)
         .addItems(
            UploadRequestItem.newBuilder()
               .setContentType(var2.RROOIHHICOCCRIOIHHHROCRIICOIRC)
               .setExpectedSizeBytes(var2.IRRHHCHRRORCOCOOCOROCRCRRCICOH.length)
               .build()
         )
         .build();
      GetUploadUrlsResponse var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0, "conversation:iconUpload");
      if (var4 != null) {
         if (var4.getStatus() == GetUploadUrlsResponse.Status.STATUS_OK && var4.getUploadsCount() != 0) {
            PresignedUpload var5 = var4.getUploads(0);

            try {
               if (!RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var2)) {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconUpload", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("FILE_UPLOAD_FAILED"));
                  return;
               }
            } catch (Exception var9) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Conversation", "Group icon upload failed: " + var9.getMessage()
               );
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconUpload", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("FILE_UPLOAD_FAILED"));
               return;
            }

            CIOORRCRICOIICROHRHRHHOHRCCRII(var0);
            String var6 = var5.getFinishedUrl();
            UpdateConversationIconRequest var7 = UpdateConversationIconRequest.newBuilder()
               .setConversationReference(var1)
               .setImage(ConversationImage.newBuilder().setUrl(var6).build())
               .build();
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var0x -> {});
            JsonObject var8 = new JsonObject();
            var8.addProperty("success", true);
            var8.addProperty("iconUrl", var6);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconUpload", var8);
         } else {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:iconUpload", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UPLOAD_URLS_FAILED"));
         }
      }
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(UUID var0, ConversationReference var1) {
      if (var1 == null) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesPicked", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("INVALID_CONVERSATION"));
      } else {
         ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(() -> RCHHHORIRORROOHRRHHIIIOIROHHCC(var0));
      }
   }

   private static void RCHHHORIRORROOHRRHHIIIOIROHHCC(UUID var0) {
      File[] var1 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Select Images", null, "Image Files", "png", "jpg", "jpeg", "gif", "webp"
      );
      if (var1 != null && var1.length != 0) {
         ArrayList var2 = new ArrayList();
         JsonArray var3 = new JsonArray();

         for (File var7 : var1) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var0, "conversation:chatImagesPicked");
            if (var8 == null) {
               CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(var0);
               return;
            }

            var2.add(var8);
            var3.add(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8));
         }

         HHCCHIOHOHHRHRHHIROCIORIHIHIHH.put(var0, var2);
         JsonObject var9 = new JsonObject();
         var9.addProperty("success", true);
         var9.add("dataUrls", var3);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesPicked", var9);
      } else {
         CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(var0);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesPicked", IOHCRCIIRCHHORROIORRRRHOHIRHHI());
      }
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(UUID var0, ConversationReference var1) {
      if (var1 == null) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("INVALID_CONVERSATION"));
      } else {
         List var2 = HHCCHIOHOHHRHRHHIROCIORIHIHIHH.get(var0);
         if (var2 != null && !var2.isEmpty()) {
            ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
               () -> {
                  try {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
                  } catch (Exception var4) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "Conversation", "Failed to upload pending chat images: " + var4.getMessage()
                     );
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UNEXPECTED_ERROR"));
                  }
               }
            );
         } else {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("NO_PENDING_IMAGES"));
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      UUID var0, ConversationReference var1, List<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      GetUploadUrlsRequest.Builder var3 = GetUploadUrlsRequest.newBuilder().setConversationReference(var1).setUsage(UploadUsage.UPLOAD_USAGE_CHAT);

      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var2) {
         var3.addItems(
            UploadRequestItem.newBuilder()
               .setContentType(var5.RROOIHHICOCCRIOIHHHROCRIICOIRC)
               .setExpectedSizeBytes(var5.IRRHHCHRRORCOCOOCOROCRCRRCICOH.length)
               .build()
         );
      }

      GetUploadUrlsResponse var11 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.build(), var0, "conversation:chatImagesUploaded");
      if (var11 != null) {
         if (var11.getStatus() == GetUploadUrlsResponse.Status.STATUS_OK && var11.getUploadsCount() >= var2.size()) {
            JsonArray var12 = new JsonArray();

            for (int var6 = 0; var6 < var2.size(); var6++) {
               PresignedUpload var7 = var11.getUploads(var6);
               HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get(
                  var6
               );

               try {
                  if (!RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var8)) {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("FILE_UPLOAD_FAILED"));
                     return;
                  }
               } catch (Exception var10) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     "Conversation", "Failed to upload pending chat images: " + var10.getMessage()
                  );
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("FILE_UPLOAD_FAILED"));
                  return;
               }

               var12.add(var7.getFinishedUrl());
            }

            CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(var0);
            JsonObject var13 = new JsonObject();
            var13.addProperty("success", true);
            var13.add("cdnUrls", var12);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", var13);
         } else {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, "conversation:chatImagesUploaded", OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UPLOAD_URLS_FAILED"));
         }
      }
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PresignedUpload var0, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      byte[] var2 = var1.IRRHHCHRRORCOCOOCOROCRCRRCICOH;
      String var3 = var1.RROOIHHICOCCRIOIHHHROCRIICOIRC;
      HttpURLConnection var4 = (HttpURLConnection)new URL(var0.getUploadUrl()).openConnection();
      var4.setRequestMethod("PUT");
      var4.setDoOutput(true);
      var4.setRequestProperty("Content-Type", var3);
      var4.setRequestProperty("Content-Length", String.valueOf(var2.length));

      for (Entry var6 : var0.getRequiredHeadersMap().entrySet()) {
         var4.setRequestProperty((String)var6.getKey(), (String)var6.getValue());
      }

      try (OutputStream var10 = var4.getOutputStream()) {
         var10.write(var2);
      }

      int var11 = var4.getResponseCode();
      var4.disconnect();
      return var11 >= 200 && var11 < 300;
   }

   private static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var0, UUID var1, String var2) {
      if (var0.length() > 5242880L) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("FILE_TOO_LARGE"));
         return null;
      }

      String var3 = OOCHRIIIRIHRRCRIORHCROIIHCRRIC.RROHIIOHORHICRHIHCCRRRHIHCHRCC(var0.getName());
      if (var3 == null) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UNSUPPORTED_FILE_TYPE"));
         return null;
      }

      try {
         byte[] var4 = Files.readAllBytes(var0.toPath());
         return new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
      } catch (IOException var5) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("FILE_READ_FAILED"));
         return null;
      }
   }

   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0) {
      return "data:" + var0.RROOIHHICOCCRIOIHHHROCRIICOIRC + ";base64," + Base64.getEncoder().encodeToString(var0.IRRHHCHRRORCOCOOCOROCRCRRCICOH);
   }

   private static GetUploadUrlsResponse RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GetUploadUrlsRequest var0, UUID var1, String var2) {
      CompletableFuture var3 = new CompletableFuture();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IORIICHCCOROCHIIIICCCOCIHCHHHO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3::complete);

      try {
         return (GetUploadUrlsResponse)var3.get(10L, TimeUnit.SECONDS);
      } catch (TimeoutException var5) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Conversation", "Timed out waiting for upload URLs: " + var5.getMessage()
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UPLOAD_URLS_TIMEOUT"));
         return null;
      } catch (InterruptedException var6) {
         Thread.currentThread().interrupt();
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Conversation", "Interrupted while waiting for upload URLs: " + var6.getMessage()
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UPLOAD_URLS_FAILED"));
         return null;
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Conversation", "Failed waiting for upload URLs: " + var7.getMessage()
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, OCORCOCOOHHOOOHOHCRHIHHIHOIHIO("UPLOAD_URLS_FAILED"));
         return null;
      }
   }

   private static void CIOORRCRICOIICROHRHRHHOHRCCRII(UUID var0) {
      OOCCRRHHRIHOHRCOHHIROCOHCICHIR.remove(var0);
   }

   private static void CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(UUID var0) {
      HHCCHIOHOHHRHRHHIROCIORIHIHIHH.remove(var0);
   }

   private static JsonObject OCORCOCOOHHOOOHOHCRHIHHIHOIHIO(String var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty("success", false);
      var1.addProperty("error", var0);
      return var1;
   }

   private static JsonObject IOHCRCIIRCHHORROIORRRRHOHIRHHI() {
      JsonObject var0 = new JsonObject();
      var0.addProperty("success", false);
      var0.addProperty("cancelled", true);
      return var0;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var0, String var1, JsonObject var2) {
      var2.addProperty("conversationId", var0.toString());
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
               .COIHRHIHIHIIRCCOHOIHHOOIRRCOII()
               .HHIICHIOCCIICOCROHHHOCIRCOHROO(),
            var1,
            var2
         );
   }

   @Generated
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final byte[] IRRHHCHRRORCOCOOCOROCRCRRCICOH;
      private final String RROOIHHICOCCRIOIHHHROCRIICOIRC;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, String var2) {
         this.IRRHHCHRRORCOCOOCOROCRCRRCICOH = var1;
         this.RROOIHHICOCCRIOIHHHROCRIICOIRC = var2;
      }

      public byte[] bytes() {
         return this.IRRHHCHRRORCOCOOCOROCRCRRCICOH;
      }

      public String COOOIOCROCIHRROHRIOHCICROIRRHO() {
         return this.RROOIHHICOCCRIOIHHHROCRIICOIRC;
      }
   }
}
