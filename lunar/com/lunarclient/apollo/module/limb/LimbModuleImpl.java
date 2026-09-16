package com.lunarclient.apollo.module.limb;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.limb.v1.HideArmorPiecesMessage;
import com.lunarclient.apollo.limb.v1.HideBodyPartMessage;
import com.lunarclient.apollo.limb.v1.ResetArmorPiecesMessage;
import com.lunarclient.apollo.limb.v1.ResetBodyPartMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.NonNull;

public final class LimbModuleImpl extends LimbModule {
   @Override
   public void hideArmorPieces(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Collection<ArmorPiece> var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("playerUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("armorPieces is marked non-null but is null");
      }

      Set var4 = var3.stream().map(this::toProtobuf).collect(Collectors.toSet());
      HideArmorPiecesMessage var5 = HideArmorPiecesMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).addAllArmorPieces(var4).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void resetArmorPieces(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Collection<ArmorPiece> var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("playerUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("armorPieces is marked non-null but is null");
      }

      Set var4 = var3.stream().map(this::toProtobuf).collect(Collectors.toSet());
      ResetArmorPiecesMessage var5 = ResetArmorPiecesMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).addAllArmorPieces(var4).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void hideBodyParts(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Collection<BodyPart> var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("playerUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("bodyParts is marked non-null but is null");
      }

      Set var4 = var3.stream().map(this::toProtobuf).collect(Collectors.toSet());
      HideBodyPartMessage var5 = HideBodyPartMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).addAllBodyParts(var4).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void resetBodyParts(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Collection<BodyPart> var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("playerUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("bodyParts is marked non-null but is null");
      }

      Set var4 = var3.stream().map(this::toProtobuf).collect(Collectors.toSet());
      ResetBodyPartMessage var5 = ResetBodyPartMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).addAllBodyParts(var4).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   private com.lunarclient.apollo.limb.v1.ArmorPiece toProtobuf(ArmorPiece var1) {
      return com.lunarclient.apollo.limb.v1.ArmorPiece.forNumber(var1.ordinal() + 1);
   }

   private com.lunarclient.apollo.limb.v1.BodyPart toProtobuf(BodyPart var1) {
      return com.lunarclient.apollo.limb.v1.BodyPart.forNumber(var1.ordinal() + 1);
   }
}
