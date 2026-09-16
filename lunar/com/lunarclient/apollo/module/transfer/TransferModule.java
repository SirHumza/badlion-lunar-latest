package com.lunarclient.apollo.module.transfer;

import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "transfer", name = "Transfer")
@ApiStatus.NonExtendable
public abstract class TransferModule extends ApolloModule {
   public static final int MAX_PINGS_PER_PACKET = 10;

   @Override
   public Collection<ApolloPlatform.Kind> getSupportedPlatforms() {
      return Arrays.asList(ApolloPlatform.Kind.SERVER, ApolloPlatform.Kind.PROXY);
   }

   public Future<PingResponse> ping(ApolloPlayer var1, List<String> var2) {
      return this.ping(var1, PingRequest.builder().serverIps(var2).build());
   }

   public Future<TransferResponse> transfer(ApolloPlayer var1, String var2) {
      return this.transfer(var1, TransferRequest.builder().serverIp(var2).build());
   }

   public abstract Future<PingResponse> ping(ApolloPlayer var1, PingRequest var2);

   public abstract Future<TransferResponse> transfer(ApolloPlayer var1, TransferRequest var2);
}
