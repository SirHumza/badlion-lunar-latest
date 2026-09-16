package com.lunarclient.apollo.module.transfer;

import com.google.protobuf.ByteString;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.event.ApolloReceivePacketEvent;
import com.lunarclient.apollo.player.AbstractApolloPlayer;
import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.NonNull;

public final class TransferModuleImpl extends TransferModule {
   public TransferModuleImpl() {
      this.handle(ApolloReceivePacketEvent.class, this::onTransferResponse);
   }

   @Override
   public Future<PingResponse> ping(@NonNull ApolloPlayer var1, @NonNull PingRequest var2) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("request is marked non-null but is null");
      }

      List var3 = var2.getServerIps();
      if (var3 != null && !var3.isEmpty()) {
         if (var3.size() > 10) {
            throw new IllegalArgumentException("PingRequest supports up to 10 server IPs, got " + var3.size() + "!");
         }

         com.lunarclient.apollo.transfer.v1.PingRequest var4 = com.lunarclient.apollo.transfer.v1.PingRequest.newBuilder()
            .setRequestId(ByteString.copyFromUtf8(var2.getRequestId().toString()))
            .addAllServerIps(var3)
            .build();
         return ((AbstractApolloPlayer)var1).sendRoundTripPacket(var2, var4);
      } else {
         throw new IllegalArgumentException("PingRequest must contain at least 1 server IP!");
      }
   }

   @Override
   public Future<TransferResponse> transfer(@NonNull ApolloPlayer var1, @NonNull TransferRequest var2) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("request is marked non-null but is null");
      }

      com.lunarclient.apollo.transfer.v1.TransferRequest var3 = com.lunarclient.apollo.transfer.v1.TransferRequest.newBuilder()
         .setRequestId(ByteString.copyFromUtf8(var2.getRequestId().toString()))
         .setServerIp(var2.getServerIp())
         .build();
      return ((AbstractApolloPlayer)var1).sendRoundTripPacket(var2, var3);
   }

   private void onTransferResponse(ApolloReceivePacketEvent var1) {
      var1.unpack(com.lunarclient.apollo.transfer.v1.TransferResponse.class)
         .ifPresent(
            var0 -> {
               TransferResponse var1x = TransferResponse.builder()
                  .packetId(UUID.fromString(var0.getRequestId().toStringUtf8()))
                  .status(TransferResponse.Status.values()[var0.getStatusValue() - 1])
                  .build();
               ApolloManager.getRoundtripManager().handleResponse(var1x);
            }
         );
      var1.unpack(com.lunarclient.apollo.transfer.v1.PingResponse.class)
         .ifPresent(
            var0 -> {
               List var1x = var0.getPingDataList()
                  .stream()
                  .map(
                     var0x -> PingResponse.PingData.builder()
                        .serverIp(var0x.getServerIp())
                        .status(PingResponse.PingData.Status.values()[var0x.getStatusValue() - 1])
                        .pingMillis(var0x.getPing())
                        .build()
                  )
                  .collect(Collectors.toList());
               PingResponse var2 = PingResponse.builder().packetId(UUID.fromString(var0.getRequestId().toStringUtf8())).data(var1x).build();
               ApolloManager.getRoundtripManager().handleResponse(var2);
            }
         );
   }
}
