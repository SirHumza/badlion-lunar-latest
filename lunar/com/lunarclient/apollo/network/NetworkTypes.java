package com.lunarclient.apollo.network;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.common.icon.AdvancedResourceLocationIcon;
import com.lunarclient.apollo.common.icon.CustomModelData;
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.icon.ResourceLocationIcon;
import com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.common.location.ApolloPlayerLocation;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.Cuboid2D;
import com.lunarclient.apollo.common.v1.Cuboid3D;
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.PlayerLocation;
import com.lunarclient.apollo.common.v1.Profile;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.hud.v1.HudPosition;
import com.lunarclient.apollo.module.packetenrichment.raytrace.BlockHitResult;
import com.lunarclient.apollo.module.packetenrichment.raytrace.Direction;
import com.lunarclient.apollo.module.packetenrichment.raytrace.EntityHitResult;
import com.lunarclient.apollo.module.packetenrichment.raytrace.MissResult;
import com.lunarclient.apollo.packetenrichment.v1.BlockHit;
import com.lunarclient.apollo.packetenrichment.v1.EntityHit;
import com.lunarclient.apollo.packetenrichment.v1.Miss;
import com.lunarclient.apollo.packetenrichment.v1.PlayerInfo;
import com.lunarclient.apollo.packetenrichment.v1.RayTraceResult;
import com.lunarclient.apollo.util.Ranges;
import java.util.UUID;

public final class NetworkTypes {
   public static EntityId toProtobuf(ApolloEntity var0) {
      return EntityId.newBuilder().setEntityId(var0.getEntityId()).setEntityUuid(toProtobuf(var0.getEntityUuid())).build();
   }

   public static ApolloEntity fromProtobuf(EntityId var0) {
      return new ApolloEntity(var0.getEntityId(), fromProtobuf(var0.getEntityUuid()));
   }

   public static Uuid toProtobuf(UUID var0) {
      return Uuid.newBuilder().setHigh64(var0.getMostSignificantBits()).setLow64(var0.getLeastSignificantBits()).build();
   }

   public static UUID fromProtobuf(Uuid var0) {
      return new UUID(var0.getHigh64(), var0.getLow64());
   }

   public static Color toProtobuf(java.awt.Color var0) {
      return Color.newBuilder().setColor(var0.getRGB()).build();
   }

   public static java.awt.Color fromProtobuf(Color var0) {
      return new java.awt.Color(var0.getColor());
   }

   public static HudPosition toProtobuf(com.lunarclient.apollo.common.location.HudPosition var0) {
      return HudPosition.newBuilder().setX(var0.getX()).setY(var0.getY()).build();
   }

   public static com.lunarclient.apollo.common.location.HudPosition fromProtobuf(HudPosition var0) {
      return com.lunarclient.apollo.common.location.HudPosition.builder().x(var0.getX()).y(var0.getY()).build();
   }

   public static Duration toProtobuf(java.time.Duration var0) {
      return Duration.newBuilder().setSeconds(var0.getSeconds()).setNanos(var0.getNano()).build();
   }

   public static java.time.Duration fromProtobuf(Duration var0) {
      return java.time.Duration.ofSeconds(var0.getSeconds()).withNanos(var0.getNanos());
   }

   public static Timestamp toProtobuf(long var0) {
      return Timestamp.newBuilder().setSeconds(var0 / 1000L).setNanos((int)(var0 % 1000L * 1000000L)).build();
   }

   public static long fromProtobuf(Timestamp var0) {
      return var0.getSeconds() * 1000L + var0.getNanos() / 1000000;
   }

   public static PlayerInfo toProtobuf(com.lunarclient.apollo.module.packetenrichment.PlayerInfo var0) {
      return PlayerInfo.newBuilder()
         .setPlayerUuid(toProtobuf(var0.getPlayerUuid()))
         .setLocation(toProtobuf(var0.getLocation()))
         .setSprinting(var0.isSprinting())
         .setSneaking(var0.isSneaking())
         .setJumping(var0.isJumping())
         .setForwardSpeed(var0.getForwardSpeed())
         .setStrafeSpeed(var0.getStrafeSpeed())
         .build();
   }

   public static com.lunarclient.apollo.module.packetenrichment.PlayerInfo fromProtobuf(PlayerInfo var0) {
      return com.lunarclient.apollo.module.packetenrichment.PlayerInfo.builder()
         .playerUuid(fromProtobuf(var0.getPlayerUuid()))
         .location(fromProtobuf(var0.getLocation()))
         .sneaking(var0.getSneaking())
         .sprinting(var0.getSprinting())
         .jumping(var0.getJumping())
         .forwardSpeed(var0.getForwardSpeed())
         .strafeSpeed(var0.getStrafeSpeed())
         .build();
   }

   public static RayTraceResult toProtobuf(com.lunarclient.apollo.module.packetenrichment.raytrace.RayTraceResult var0) {
      RayTraceResult.Builder var1 = RayTraceResult.newBuilder();
      if (var0 instanceof BlockHitResult) {
         BlockHitResult var2 = (BlockHitResult)var0;
         BlockHit var3 = BlockHit.newBuilder()
            .setHitLocation(toProtobuf(var2.getHitLocation()))
            .setBlockLocation(toProtobuf(var2.getBlockLocation()))
            .setDirection(toProtobuf(var2.getDirection()))
            .build();
         var1.setBlock(var3);
      } else if (var0 instanceof EntityHitResult) {
         EntityHitResult var4 = (EntityHitResult)var0;
         EntityHit var5 = EntityHit.newBuilder().setHitLocation(toProtobuf(var4.getHitLocation())).setEntityId(toProtobuf(var4.getEntityId())).build();
         var1.setEntity(var5);
      } else {
         var1.setMiss(Miss.getDefaultInstance());
      }

      return var1.build();
   }

   public static com.lunarclient.apollo.module.packetenrichment.raytrace.RayTraceResult fromProtobuf(RayTraceResult var0) {
      if (var0.hasBlock()) {
         BlockHit var2 = var0.getBlock();
         return BlockHitResult.builder()
            .hitLocation(fromProtobuf(var2.getHitLocation()))
            .blockLocation(fromProtobuf(var2.getBlockLocation()))
            .direction(Direction.values()[var2.getDirectionValue() - 1])
            .build();
      } else if (var0.hasEntity()) {
         EntityHit var1 = var0.getEntity();
         return EntityHitResult.builder().hitLocation(fromProtobuf(var1.getHitLocation())).entityId(fromProtobuf(var1.getEntityId())).build();
      } else {
         return new MissResult();
      }
   }

   public static com.lunarclient.apollo.packetenrichment.v1.Direction toProtobuf(Direction var0) {
      return com.lunarclient.apollo.packetenrichment.v1.Direction.forNumber(var0.ordinal() + 1);
   }

   public static Location toProtobuf(ApolloLocation var0) {
      return Location.newBuilder().setWorld(var0.getWorld()).setX(var0.getX()).setY(var0.getY()).setZ(var0.getZ()).build();
   }

   public static ApolloLocation fromProtobuf(Location var0) {
      return ApolloLocation.builder().world(var0.getWorld()).x(var0.getX()).y(var0.getY()).z(var0.getZ()).build();
   }

   public static BlockLocation toProtobuf(ApolloBlockLocation var0) {
      return BlockLocation.newBuilder().setWorld(var0.getWorld()).setX(var0.getX()).setY(var0.getY()).setZ(var0.getZ()).build();
   }

   public static ApolloBlockLocation fromProtobuf(BlockLocation var0) {
      return ApolloBlockLocation.builder().world(var0.getWorld()).x(var0.getX()).y(var0.getY()).z(var0.getZ()).build();
   }

   public static PlayerLocation toProtobuf(ApolloPlayerLocation var0) {
      return PlayerLocation.newBuilder().setLocation(toProtobuf(var0.getLocation())).setYaw(var0.getYaw()).setPitch(var0.getPitch()).build();
   }

   public static ApolloPlayerLocation fromProtobuf(PlayerLocation var0) {
      return ApolloPlayerLocation.builder().location(fromProtobuf(var0.getLocation())).yaw(var0.getYaw()).pitch(var0.getPitch()).build();
   }

   public static Cuboid2D toProtobuf(com.lunarclient.apollo.common.cuboid.Cuboid2D var0) {
      return Cuboid2D.newBuilder().setMinX(var0.getMinX()).setMinZ(var0.getMinZ()).setMaxX(var0.getMaxX()).setMaxZ(var0.getMaxZ()).build();
   }

   public static com.lunarclient.apollo.common.cuboid.Cuboid2D fromProtobuf(Cuboid2D var0) {
      return com.lunarclient.apollo.common.cuboid.Cuboid2D.builder()
         .minX(var0.getMinX())
         .minZ(var0.getMinZ())
         .maxX(var0.getMaxX())
         .maxZ(var0.getMaxZ())
         .build();
   }

   public static Cuboid3D toProtobuf(com.lunarclient.apollo.common.cuboid.Cuboid3D var0) {
      return Cuboid3D.newBuilder()
         .setMinX(var0.getMinX())
         .setMinY(var0.getMinY())
         .setMinZ(var0.getMinZ())
         .setMaxX(var0.getMaxX())
         .setMaxY(var0.getMaxY())
         .setMaxZ(var0.getMaxZ())
         .build();
   }

   public static com.lunarclient.apollo.common.cuboid.Cuboid3D fromProtobuf(Cuboid3D var0) {
      return com.lunarclient.apollo.common.cuboid.Cuboid3D.builder()
         .minX(var0.getMinX())
         .minY(var0.getMinY())
         .minZ(var0.getMinZ())
         .maxX(var0.getMaxX())
         .maxY(var0.getMaxY())
         .maxZ(var0.getMaxZ())
         .build();
   }

   public static Icon toProtobuf(com.lunarclient.apollo.common.icon.Icon var0) {
      Icon.Builder var1 = Icon.newBuilder();
      if (var0 instanceof ItemStackIcon) {
         var1.setItemStack(toProtobuf((ItemStackIcon)var0));
      } else if (var0 instanceof ResourceLocationIcon) {
         var1.setResourceLocation(toProtobuf((ResourceLocationIcon)var0));
      } else if (var0 instanceof SimpleResourceLocationIcon) {
         var1.setSimpleResourceLocation(toProtobuf((SimpleResourceLocationIcon)var0));
      } else {
         if (!(var0 instanceof AdvancedResourceLocationIcon)) {
            throw new IllegalArgumentException("Unknown icon type: " + var0.getClass().getName());
         }

         var1.setAdvancedResourceLocation(toProtobuf((AdvancedResourceLocationIcon)var0));
      }

      return var1.build();
   }

   public static com.lunarclient.apollo.common.icon.Icon fromProtobuf(Icon var0) {
      if (var0.hasItemStack()) {
         return fromProtobuf(var0.getItemStack());
      } else if (var0.hasResourceLocation()) {
         return fromProtobuf(var0.getResourceLocation());
      } else if (var0.hasSimpleResourceLocation()) {
         return fromProtobuf(var0.getSimpleResourceLocation());
      } else if (var0.hasAdvancedResourceLocation()) {
         return fromProtobuf(var0.getAdvancedResourceLocation());
      } else {
         throw new IllegalArgumentException("Unknown icon proto type");
      }
   }

   public static com.lunarclient.apollo.common.v1.ItemStackIcon toProtobuf(ItemStackIcon var0) {
      com.lunarclient.apollo.common.v1.ItemStackIcon.Builder var1 = com.lunarclient.apollo.common.v1.ItemStackIcon.newBuilder()
         .setItemId(var0.getItemId())
         .setCustomModelData(var0.getCustomModelData());
      CustomModelData var2 = var0.getCustomModelDataObject();
      if (var2 != null) {
         var1.setCustomModelDataObject(toProtobuf(var2));
      }

      if (var0.getItemName() != null) {
         var1.setItemName(var0.getItemName());
      }

      if (var0.getProfile() != null) {
         var1.setProfile(toProtobuf(var0.getProfile()));
      }

      if (var0.getPotion() != null) {
         var1.setPotion(var0.getPotion());
      }

      return var1.build();
   }

   public static ItemStackIcon fromProtobuf(com.lunarclient.apollo.common.v1.ItemStackIcon var0) {
      ItemStackIcon.ItemStackIconBuilder var1 = ItemStackIcon.builder()
         .itemName(var0.getItemName())
         .itemId(var0.getItemId())
         .customModelData(var0.getCustomModelData());
      if (var0.hasCustomModelDataObject()) {
         var1.customModelDataObject(fromProtobuf(var0.getCustomModelDataObject()));
      }

      if (var0.hasProfile()) {
         var1.profile(fromProtobuf(var0.getProfile()));
      }

      if (!var0.getPotion().isEmpty()) {
         var1.potion(var0.getPotion());
      }

      return var1.build();
   }

   public static com.lunarclient.apollo.common.v1.CustomModelData toProtobuf(CustomModelData var0) {
      return com.lunarclient.apollo.common.v1.CustomModelData.newBuilder()
         .addAllFloats(var0.getFloats())
         .addAllFlags(var0.getFlags())
         .addAllStrings(var0.getStrings())
         .addAllColors(var0.getColors())
         .build();
   }

   public static CustomModelData fromProtobuf(com.lunarclient.apollo.common.v1.CustomModelData var0) {
      return CustomModelData.builder()
         .floats(var0.getFloatsList())
         .flags(var0.getFlagsList())
         .strings(var0.getStringsList())
         .colors(var0.getColorsList())
         .build();
   }

   public static Profile toProtobuf(com.lunarclient.apollo.common.profile.Profile var0) {
      Profile.Builder var1 = Profile.newBuilder().setTexture(var0.getTexture()).setSignature(var0.getSignature());
      if (var0.getId() != null) {
         var1.setId(toProtobuf(var0.getId()));
      }

      return var1.build();
   }

   public static com.lunarclient.apollo.common.profile.Profile fromProtobuf(Profile var0) {
      com.lunarclient.apollo.common.profile.Profile.ProfileBuilder var1 = com.lunarclient.apollo.common.profile.Profile.builder()
         .texture(var0.getTexture())
         .signature(var0.getSignature());
      if (var0.hasId()) {
         var1.id(fromProtobuf(var0.getId()));
      }

      return var1.build();
   }

   public static com.lunarclient.apollo.common.v1.ResourceLocationIcon toProtobuf(ResourceLocationIcon var0) {
      return com.lunarclient.apollo.common.v1.ResourceLocationIcon.newBuilder().setResourceLocation(var0.getResourceLocation()).build();
   }

   public static ResourceLocationIcon fromProtobuf(com.lunarclient.apollo.common.v1.ResourceLocationIcon var0) {
      return ResourceLocationIcon.builder().resourceLocation(var0.getResourceLocation()).build();
   }

   public static com.lunarclient.apollo.common.v1.SimpleResourceLocationIcon toProtobuf(SimpleResourceLocationIcon var0) {
      return com.lunarclient.apollo.common.v1.SimpleResourceLocationIcon.newBuilder()
         .setResourceLocation(var0.getResourceLocation())
         .setSize(Ranges.checkPositive(var0.getSize(), "SimpleResourceLocationIcon#size"))
         .build();
   }

   public static SimpleResourceLocationIcon fromProtobuf(com.lunarclient.apollo.common.v1.SimpleResourceLocationIcon var0) {
      return SimpleResourceLocationIcon.builder().resourceLocation(var0.getResourceLocation()).size(var0.getSize()).build();
   }

   public static com.lunarclient.apollo.common.v1.AdvancedResourceLocationIcon toProtobuf(AdvancedResourceLocationIcon var0) {
      return com.lunarclient.apollo.common.v1.AdvancedResourceLocationIcon.newBuilder()
         .setResourceLocation(var0.getResourceLocation())
         .setWidth(Ranges.checkPositive(var0.getWidth(), "AdvancedResourceLocationIcon#width"))
         .setHeight(Ranges.checkPositive(var0.getHeight(), "AdvancedResourceLocationIcon#height"))
         .setMinU(Ranges.checkRange(var0.getMinU(), 0.0F, 1.0F, "AdvancedResourceLocationIcon#minU"))
         .setMaxU(Ranges.checkRange(var0.getMaxU(), 0.0F, 1.0F, "AdvancedResourceLocationIcon#maxU"))
         .setMinV(Ranges.checkRange(var0.getMinV(), 0.0F, 1.0F, "AdvancedResourceLocationIcon#minV"))
         .setMaxV(Ranges.checkRange(var0.getMaxV(), 0.0F, 1.0F, "AdvancedResourceLocationIcon#maxV"))
         .build();
   }

   public static AdvancedResourceLocationIcon fromProtobuf(com.lunarclient.apollo.common.v1.AdvancedResourceLocationIcon var0) {
      return AdvancedResourceLocationIcon.builder()
         .resourceLocation(var0.getResourceLocation())
         .width(var0.getWidth())
         .height(var0.getHeight())
         .minU(var0.getMinU())
         .maxU(var0.getMaxU())
         .minV(var0.getMinV())
         .maxV(var0.getMaxV())
         .build();
   }

   private NetworkTypes() {
   }
}
