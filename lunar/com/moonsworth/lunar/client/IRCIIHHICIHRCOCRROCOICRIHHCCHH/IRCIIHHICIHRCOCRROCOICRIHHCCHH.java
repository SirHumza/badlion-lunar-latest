package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.lunarclient.authenticator.v1.AuthSuccessMessage;
import com.lunarclient.authenticator.v1.ClientboundWebSocketMessage;
import com.lunarclient.authenticator.v1.EncryptionFailMessage;
import com.lunarclient.authenticator.v1.EncryptionRequestMessage;
import com.lunarclient.authenticator.v1.EncryptionResponseMessage;
import com.lunarclient.authenticator.v1.HelloMessage;
import com.lunarclient.authenticator.v1.ServerboundWebSocketMessage;
import com.lunarclient.common.v1.UuidAndUsername;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.SecretKey;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends WebSocketClient {
   private final UuidAndUsername ORCOCHRRIORRRCCROHIRIHHCCROCHO;
   private final String IOIHOCCRCRIRIHCHCCHIICRHRHRCHC;
   private final Consumer<String> HHOORCCOIICCRIROHCIHIORIOIHIRH;
   private boolean success = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(UuidAndUsername var1, String var2, Consumer<String> var3) {
      super(
         URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.HHIICHRCCIOCIOIOHOOHIRRHCOOHCC() + "/game"),
         new Draft_6455(),
         Map.of(
            "Accept",
            "application/x-protobuf",
            "sentry-trace",
            IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CCHHHCROHRCOCHHORCORROCIIOOHOC,
            "User-Agent",
            "Lunar Client " + com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CROIHRIIRROCHORIIRIOCROOORRCCH(),
            "X-Initiator",
            var2
         ),
         30000
      );
      this.ORCOCHRRIORRRCCROHIRIHHCCROCHO = var1;
      this.IOIHOCCRCRIRIHCHCCHIICRHRHRCHC = var2;
      this.HHOORCCOIICCRIROHCIHIORIOIHIRH = var3;
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Authentication", "Instantiate");
   }

   @Override
   public void onOpen(ServerHandshake var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ServerboundWebSocketMessage.newBuilder()
            .setHello(HelloMessage.newBuilder().setIdentity(this.ORCOCHRRIORRRCCROHIRIHHCCROCHO).setInitiator(this.IOIHOCCRCRIRIHCHCCHIICRHRHRCHC).build())
            .build()
      );
   }

   @Override
   public void onMessage(String var1) {
   }

   @Override
   public void onMessage(ByteBuffer var1) {
      ClientboundWebSocketMessage var2;
      try {
         var2 = ClientboundWebSocketMessage.parseFrom(var1);
      } catch (InvalidProtocolBufferException var4) {
         throw new RuntimeException(var4);
      }

      switch (var2.getContentsCase()) {
         case ENCRYPTION_REQUEST:
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getEncryptionRequest());
            break;
         case AUTH_SUCCESS:
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getAuthSuccess());
            break;
         case CONTENTS_NOT_SET:
            throw new IllegalStateException("Invalid websocket message from server");
      }
   }

   @Override
   public void onClose(int var1, String var2, boolean var3) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Auth", "Connection closed (%d, \"%s\")", var1, var2
      );
      if (!this.success) {
         this.HHOORCCOIICCRIROHCIHIORIOIHIRH.accept(null);
      }
   }

   @Override
   public void onError(Exception var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Auth", "Error Connection");
      var1.printStackTrace();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Exception var1, String var2, String var3) {
      if (var3 == null || var3.isEmpty()) {
         var3 = "An unknown error occurred.";
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, var2, var3
         );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Auth", var2);
      var1.printStackTrace();
      this.HOCRHOROHIHRCRHCRIIIHCHRRHOIIC(var2 + " (" + var1.getClass().getSimpleName() + ")");
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Exception var1) {
      if (var1 instanceof InvocationTargetException) {
         Throwable var2 = ((InvocationTargetException)var1).getTargetException();
         if (var2 instanceof Exception) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Exception)var2);
            return;
         }
      }

      IRRCCOICORICIHCHRHIHIHROIRHOCR var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      if (var1 instanceof AuthenticationUnavailableException) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Servers Unavailable", var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups.auth", "servers_unavailable"));
      } else if (var1 instanceof InvalidCredentialsException) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Invalid Session", var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups.auth", "invalid_session"));
      } else if (var1 instanceof AuthenticationException) {
         String var3 = var1.getClass().getSimpleName();
         if (var3.equals("InsufficientPrivilegesException")) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Insufficient Privileges", var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups.auth", "insufficient_privileges"));
            return;
         }

         if (var3.equals("ForcedUsernameChangeException") || var3.equals("UserBannedException")) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "User Banned", var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups.auth", "user_banned"));
            return;
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Authentication Error", var1.getMessage());
      } else {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Internal Error", var1.getMessage());
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EncryptionRequestMessage var1) {
      PublicKey var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getPublicKey().toByteArray()
      );
      byte[] var3 = var1.getRandomBytes().toByteArray();
      SecretKey var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHIOIRRRHROOCCHHHORIROCHIHORRI();
      byte[] var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "", var2, var4
      );
      if (var5 == null) {
         this.HOCRHOROHIHRCRHCRIIIHCHRRHOIIC("No Hash (NullPointerException)");
      } else {
         String var6 = new BigInteger(var5).toString(16);

         try {
            MinecraftSessionService var7 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.COCOCCIORORHIIROHIOIOHIHCRIOOO().createMinecraftSessionService();
            String var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getToken();
            GameProfile var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile();
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
               var7.joinServer(var9.getId(), var8, var6);
            } else {
               var7.getClass().getDeclaredMethod("joinServer", GameProfile.class, String.class, String.class).invoke(var7, var9, var8, var6);
            }
         } catch (Exception var10) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10);
            return;
         }

         byte[] var11 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, var4.getEncoded()
         );
         byte[] var12 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, var3
         );
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            ServerboundWebSocketMessage.newBuilder()
               .setEncryptionResponse(
                  EncryptionResponseMessage.newBuilder().setPublicKey(ByteString.copyFrom(var12)).setSecretKey(ByteString.copyFrom(var11)).build()
               )
               .build()
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AuthSuccessMessage var1) {
      this.success = true;
      this.HHOORCCOIICCRIROHCIHIORIOIHIRH.accept(var1.getJwt());
   }

   private void HOCRHOROHIHRCRHCRIIIHCHRRHOIIC(String var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ServerboundWebSocketMessage.newBuilder().setEncryptionFail(EncryptionFailMessage.newBuilder().setReason(var1).build()).build()
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerboundWebSocketMessage var1) {
      this.send(var1.toByteArray());
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ASSET_SERVER
      )) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Auth", "Sent: %s", var1.getClass().getSimpleName()
         );
      }
   }
}
