package com.lunarclient.apollo.module.cosmetic;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.cosmetic.v1.DisplaySprayMessage;
import com.lunarclient.apollo.cosmetic.v1.EquipNpcCosmeticsMessage;
import com.lunarclient.apollo.cosmetic.v1.RemoveSprayMessage;
import com.lunarclient.apollo.cosmetic.v1.ResetNpcCosmeticsMessage;
import com.lunarclient.apollo.cosmetic.v1.ResetNpcEmotesMessage;
import com.lunarclient.apollo.cosmetic.v1.ResetSpraysMessage;
import com.lunarclient.apollo.cosmetic.v1.StartNpcEmoteMessage;
import com.lunarclient.apollo.cosmetic.v1.StopNpcEmoteMessage;
import com.lunarclient.apollo.cosmetic.v1.UnequipNpcCosmeticsMessage;
import com.lunarclient.apollo.module.cosmetic.options.BodyOptions;
import com.lunarclient.apollo.module.cosmetic.options.CloakOptions;
import com.lunarclient.apollo.module.cosmetic.options.CosmeticOptions;
import com.lunarclient.apollo.module.cosmetic.options.HatOptions;
import com.lunarclient.apollo.module.cosmetic.options.PetOptions;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.util.Ranges;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public final class CosmeticModuleImpl extends CosmeticModule {
   @Override
   public void equipNpcCosmetics(@NonNull Recipients var1, @NonNull UUID var2, @NonNull List<Cosmetic> var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("npcUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("cosmetics is marked non-null but is null");
      }

      this.equipNpcCosmetics(var1, var2, var3, false);
   }

   @Override
   public void equipNpcCosmetics(@NonNull Recipients var1, @NonNull UUID var2, @NonNull List<Cosmetic> var3, boolean var4) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("npcUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("cosmetics is marked non-null but is null");
      }

      List var5 = var3.stream().map(this::toProtobuf).collect(Collectors.toList());
      EquipNpcCosmeticsMessage var6 = EquipNpcCosmeticsMessage.newBuilder()
         .setNpcUuid(NetworkTypes.toProtobuf(var2))
         .addAllCosmetics(var5)
         .setCopyLocalCosmetics(var4)
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var6);
   }

   @Override
   public void unequipNpcCosmetics(@NonNull Recipients var1, @NonNull UUID var2, @NonNull List<Integer> var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("npcUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("cosmeticIds is marked non-null but is null");
      }

      List var4 = var3.stream().map(var0 -> Ranges.checkStrictlyPositive(var0, "Cosmetic#id")).collect(Collectors.toList());
      UnequipNpcCosmeticsMessage var5 = UnequipNpcCosmeticsMessage.newBuilder().setNpcUuid(NetworkTypes.toProtobuf(var2)).addAllCosmeticIds(var4).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void resetNpcCosmetics(@NonNull Recipients var1, @NonNull UUID var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("npcUuid is marked non-null but is null");
      }

      ResetNpcCosmeticsMessage var3 = ResetNpcCosmeticsMessage.newBuilder().setNpcUuid(NetworkTypes.toProtobuf(var2)).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void startNpcEmote(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Emote var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("npcUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("emote is marked non-null but is null");
      }

      StartNpcEmoteMessage var4 = StartNpcEmoteMessage.newBuilder()
         .setNpcUuid(NetworkTypes.toProtobuf(var2))
         .setEmote(
            com.lunarclient.apollo.cosmetic.v1.Emote.newBuilder()
               .setId(Ranges.checkStrictlyPositive(var3.getId(), "Emote#id"))
               .setMetadata(var3.getMetadata())
               .build()
         )
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void stopNpcEmote(@NonNull Recipients var1, @NonNull UUID var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("npcUuid is marked non-null but is null");
      }

      StopNpcEmoteMessage var3 = StopNpcEmoteMessage.newBuilder().setNpcUuid(NetworkTypes.toProtobuf(var2)).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetNpcEmotes(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetNpcEmotesMessage var2 = ResetNpcEmotesMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void displaySpray(@NonNull Recipients var1, @NonNull Spray var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("spray is marked non-null but is null");
      }

      DisplaySprayMessage var3 = DisplaySprayMessage.newBuilder()
         .setSprayId(Ranges.checkStrictlyPositive(var2.getSprayId(), "Spray#sprayId"))
         .setLocation(NetworkTypes.toProtobuf(var2.getLocation()))
         .setFacing(NetworkTypes.toProtobuf(var2.getFacing()))
         .setRotation(var2.getRotation())
         .setDuration(NetworkTypes.toProtobuf(var2.getDuration()))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeSpray(@NonNull Recipients var1, int var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      RemoveSprayMessage var3 = RemoveSprayMessage.newBuilder().setSprayId(Ranges.checkStrictlyPositive(var2, "Spray#sprayId")).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeSpray(@NonNull Recipients var1, int var2, @Nullable ApolloBlockLocation var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      RemoveSprayMessage.Builder var4 = RemoveSprayMessage.newBuilder().setSprayId(Ranges.checkStrictlyPositive(var2, "Spray#sprayId"));
      if (var3 != null) {
         var4.setLocation(NetworkTypes.toProtobuf(var3));
      }

      RemoveSprayMessage var5 = var4.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void resetSprays(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetSpraysMessage var2 = ResetSpraysMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private com.lunarclient.apollo.cosmetic.v1.Cosmetic toProtobuf(Cosmetic var1) {
      com.lunarclient.apollo.cosmetic.v1.Cosmetic.Builder var2 = com.lunarclient.apollo.cosmetic.v1.Cosmetic.newBuilder()
         .setId(Ranges.checkStrictlyPositive(var1.getId(), "Cosmetic#id"));
      CosmeticOptions var3 = var1.getOptions();
      if (var3 == null) {
         return var2.build();
      }

      if (var3 instanceof HatOptions) {
         HatOptions var4 = (HatOptions)var3;
         var2.setHatOptions(
            com.lunarclient.apollo.cosmetic.v1.HatOptions.newBuilder()
               .setShowOverHelmet(var4.isShowOverHelmet())
               .setShowOverSkinLayer(var4.isShowOverSkinLayer())
               .setHeightOffset(var4.getHeightOffset())
               .build()
         );
      } else if (var3 instanceof CloakOptions) {
         CloakOptions var5 = (CloakOptions)var3;
         var2.setCloakOptions(com.lunarclient.apollo.cosmetic.v1.CloakOptions.newBuilder().setUseClothPhysics(var5.isUseClothPhysics()).build());
      } else if (var3 instanceof PetOptions) {
         PetOptions var6 = (PetOptions)var3;
         var2.setPetOptions(com.lunarclient.apollo.cosmetic.v1.PetOptions.newBuilder().setFlipShoulder(var6.isFlipShoulder()).build());
      } else if (var3 instanceof BodyOptions) {
         BodyOptions var7 = (BodyOptions)var3;
         var2.setBodyOptions(
            com.lunarclient.apollo.cosmetic.v1.BodyOptions.newBuilder()
               .setShowOverChestplate(var7.isShowOverChestplate())
               .setShowOverLeggings(var7.isShowOverLeggings())
               .setShowOverBoots(var7.isShowOverBoots())
               .build()
         );
      }

      return var2.build();
   }
}
