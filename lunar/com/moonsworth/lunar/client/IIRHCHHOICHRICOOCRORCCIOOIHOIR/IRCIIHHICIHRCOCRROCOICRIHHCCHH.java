package com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

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
import com.lunarclient.gameipc.protocol.v1.IPCRpcResponse;
import com.lunarclient.gameipc.protocol.v1.LauncherboundIPCMessage;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.HRHIHIRHRCHHRORRRCORHOCIRHRIOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RpcChannel, Consumer<IPCRpcResponse> {
   private static final RemovalListener<ByteString, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OCOOOOHRCIRIIRIHRIOCICRIRCRHIR = var0 -> {
      if (var0.getCause() != RemovalCause.EXPLICIT) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "IPC",
            "Timeout waiting for response to "
               + ((IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0.getValue()).HRRIHICRHIHCCOIRIOROIHOHRHCOHI
               + " caused by "
               + var0.getCause()
         );
      }
   };
   private final com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRIIICOOICIRCHRRICRCCIRIHRCCHO;
   private final Cache<ByteString, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HHCCOICIHRIHRCHCIICHIOCHHOHORO = CacheBuilder.newBuilder()
      .expireAfterWrite(10L, TimeUnit.MINUTES)
      .removalListener(OCOOOOHRCIRIIRIHRIOCICRIRCRHIR)
      .build();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.HRIIICOOICIRCHRRICRCCIRIHRCCHO = var1;
   }

   @Override
   public void callMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3, Message var4, RpcCallback<Message> var5) {
      if (!this.HRIIICOOICIRCHRRICRCCIRIHRCCHO.isOpen()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.IPC)) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "IPC", "Tried to make request to service (" + var1.getService().getFullName() + ") without an open socket"
            );
         }
      } else {
         ByteString var6 = ByteString.copyFromUtf8(UUID.randomUUID().toString());
         LauncherboundIPCMessage var7 = LauncherboundIPCMessage.newBuilder()
            .setRequestId(var6)
            .setService(var1.getService().getFullName())
            .setMethod(var1.getName())
            .setFullMethod(var1.getFullName())
            .setInputName(var1.getInputType().getName())
            .setInputFullName(var1.getInputType().getFullName())
            .setInput(var3.toByteString())
            .build();
         this.HHCCOICIHRIHRCHCIICHIOCHHOHORO
            .put(var6, new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.getService() + "." + var7.getMethod(), var4, var5));
         this.HRIIICOOICIRCHRRICRCCIRIHRCCHO.send(var7.toByteArray());
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.IPC)) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "IPC", "Request %s for %s.%s", var7.getRequestId(), var7.getService(), var7.getMethod()
            );
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IPCRpcResponse var1) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.HHCCOICIHRIHRCHCIICHIOCHHOHORO
         .getIfPresent(var1.getRequestId());
      if (var2 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "IPC", "Failed to find associated request with ID %s", var1.getRequestId()
         );
      } else {
         this.HHCCOICIHRIHRCHCIICHIOCHHOHORO.invalidate(var1.getRequestId());

         Message var3;
         try {
            var3 = var2.IIOCRCOCCHCIOCCORROCIRHOICIICR.newBuilderForType().mergeFrom(var1.getOutput()).build();
         } catch (InvalidProtocolBufferException var5) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "IPC", "Failed to decode response"
            );
            var5.printStackTrace();
            return;
         }

         HRHIHIRHRCHHRORRRCORHOCIRHRIOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2.IIORORCRIHOHCOHCOCICHICROHICII);
      }
   }

   public void HIIIRHIIHCIOOCCCCRCHRRRHCROOCC() {
      this.HHCCOICIHRIHRCHCIICHIOCHHOHORO.invalidateAll();
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
