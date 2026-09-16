package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalCause;
import com.google.common.cache.RemovalListener;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.lunarclient.websocket.protocol.v1.ServerboundWebSocketMessage;
import com.lunarclient.websocket.protocol.v1.WebSocketRpcResponse;
import com.moonsworth.lunar.client.util.HRHIHIRHRCHHRORRRCORHOCIRHRIOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import lombok.Generated;

public final class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements RpcChannel, Consumer<WebSocketRpcResponse> {
   private static final RemovalListener<ByteString, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HOHORCIHRHCIRHIHHRCHIIOHORHCRH = var0 -> {
      if (var0.getCause() != RemovalCause.EXPLICIT) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Assets",
            "Timeout waiting for response to "
               + ((CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0.getValue()).HRRIHICRHIHCCOIRIOROIHOHRHCOHI
               + " caused by "
               + var0.getCause()
         );
      }
   };
   private final com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COORORIOCRROOOCIORRCHRHRCRHRCR;
   private final AtomicInteger ICRCIIIHROCRHOHHHHRCCCOOCICHOO;
   private final Cache<ByteString, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ICIHOIHROICHIHRIIOOCHOCCOHRIRR = CacheBuilder.newBuilder()
      .expireAfterWrite(1L, TimeUnit.MINUTES)
      .removalListener(HOHORCIHRHCIRHIHHRCHIIOHORHCRH)
      .build();

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.COORORIOCRROOOCIORRCHRHRCRHRCR = var1;
      this.ICRCIIIHROCRHOHHHHRCCCOOCICHOO = new AtomicInteger(1);
   }

   @Override
   public void callMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3, Message var4, RpcCallback<Message> var5) {
      if (!this.COORORIOCRROOOCIORRCHRHRCRHRCR.isOpen()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Assets", "Tried to make a request without an open socket"
         );
      } else {
         int var6 = this.ICRCIIIHROCRHOHHHHRCCCOOCICHOO.getAndIncrement();
         ByteString var7 = ByteString.copyFromUtf8(Integer.toString(var6));
         ServerboundWebSocketMessage var8 = ServerboundWebSocketMessage.newBuilder()
            .setRequestId(var7)
            .setService(var1.getService().getFullName())
            .setMethod(var1.getName())
            .setInput(var3.toByteString())
            .build();
         this.ICIHOIHROICHIHRIIOOCHOCCOHRIRR
            .put(var7, new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8.getService() + "." + var8.getMethod(), var4, var5));
         this.COORORIOCRROOOCIORRCHRHRCRHRCR.send(var8.toByteArray());
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ASSET_SERVER
         )) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "Assets", "Request %s for %s.%s", var8.getRequestId(), var8.getService(), var8.getMethod()
            );
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(WebSocketRpcResponse var1) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.ICIHOIHROICHIHRIIOOCHOCCOHRIRR
         .getIfPresent(var1.getRequestId());
      if (var2 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Assets", "Failed to find associated request with ID %s", var1.getRequestId()
         );
      } else {
         this.ICIHOIHROICHIHRIIOOCHOCCOHRIRR.invalidate(var1.getRequestId());

         Message var3;
         try {
            var3 = var2.IIOCRCOCCHCIOCCORROCIRHOICIICR.newBuilderForType().mergeFrom(var1.getOutput()).build();
         } catch (InvalidProtocolBufferException var5) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Assets", "Failed to decode response"
            );
            var5.printStackTrace();
            return;
         }

         HRHIHIRHRCHHRORRRCORHOCIRHRIOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2.IIORORCRIHOHCOHCOCICHICROHICII);
      }
   }

   public void HIIIRHIIHCIOOCCCCRCHRRRHCROOCC() {
      this.ICIHOIHROICHIHRIIOOCHOCCOHRIRR.invalidateAll();
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private String HRRIHICRHIHCCOIRIOROIHOHRHCOHI;
      private Message IIOCRCOCCHCIOCCORROCIRHOICIICR;
      private RpcCallback<Message> IIORORCRIHOHCOHCOCICHICROHICII;

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Message var2, RpcCallback<Message> var3) {
         this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI = var1;
         this.IIOCRCOCCHCIOCCORROCIRHOICIICR = var2;
         this.IIORORCRIHOHCOHCOCICHICROHICII = var3;
      }
   }
}
