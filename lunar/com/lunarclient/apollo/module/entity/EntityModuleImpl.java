package com.lunarclient.apollo.module.entity;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.entity.v1.FlipEntityMessage;
import com.lunarclient.apollo.entity.v1.OverrideRainbowSheepMessage;
import com.lunarclient.apollo.entity.v1.ResetFlipedEntityMessage;
import com.lunarclient.apollo.entity.v1.ResetRainbowSheepMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.NonNull;

public final class EntityModuleImpl extends EntityModule {
   @Override
   public void overrideRainbowSheep(@NonNull Recipients var1, @NonNull List<ApolloEntity> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("sheepEntities is marked non-null but is null");
      }

      Set var3 = var2.stream().map(NetworkTypes::toProtobuf).collect(Collectors.toSet());
      OverrideRainbowSheepMessage var4 = OverrideRainbowSheepMessage.newBuilder().addAllEntityIds(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void resetRainbowSheep(@NonNull Recipients var1, @NonNull List<ApolloEntity> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("sheepEntities is marked non-null but is null");
      }

      Set var3 = var2.stream().map(NetworkTypes::toProtobuf).collect(Collectors.toSet());
      ResetRainbowSheepMessage var4 = ResetRainbowSheepMessage.newBuilder().addAllEntityIds(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void flipEntity(@NonNull Recipients var1, @NonNull List<ApolloEntity> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("entities is marked non-null but is null");
      }

      Set var3 = var2.stream().map(NetworkTypes::toProtobuf).collect(Collectors.toSet());
      FlipEntityMessage var4 = FlipEntityMessage.newBuilder().addAllEntityIds(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void resetFlippedEntity(@NonNull Recipients var1, @NonNull List<ApolloEntity> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("entities is marked non-null but is null");
      }

      Set var3 = var2.stream().map(NetworkTypes::toProtobuf).collect(Collectors.toSet());
      ResetFlipedEntityMessage var4 = ResetFlipedEntityMessage.newBuilder().addAllEntityIds(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }
}
