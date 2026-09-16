package com.lunarclient.apollo.module.marker;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.marker.v1.BlockTarget;
import com.lunarclient.apollo.marker.v1.DangerMarker;
import com.lunarclient.apollo.marker.v1.DisplayMarkerMessage;
import com.lunarclient.apollo.marker.v1.EntityTarget;
import com.lunarclient.apollo.marker.v1.InfoMarker;
import com.lunarclient.apollo.marker.v1.InterestMarker;
import com.lunarclient.apollo.marker.v1.ItemTarget;
import com.lunarclient.apollo.marker.v1.MarkerDescriptionDisplay;
import com.lunarclient.apollo.marker.v1.MarkerDisplayCondition;
import com.lunarclient.apollo.marker.v1.MarkerOwnerDisplay;
import com.lunarclient.apollo.marker.v1.MarkerTarget;
import com.lunarclient.apollo.marker.v1.NormalMarker;
import com.lunarclient.apollo.marker.v1.PlayerTarget;
import com.lunarclient.apollo.marker.v1.RemoveMarkerMessage;
import com.lunarclient.apollo.marker.v1.ResetMarkersMessage;
import com.lunarclient.apollo.module.marker.display.MarkerFlag;
import com.lunarclient.apollo.module.marker.target.BlockMarkerTarget;
import com.lunarclient.apollo.module.marker.target.EntityMarkerTarget;
import com.lunarclient.apollo.module.marker.target.ItemMarkerTarget;
import com.lunarclient.apollo.module.marker.target.PlayerMarkerTarget;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.util.Ranges;
import java.awt.Color;
import java.time.Duration;
import lombok.NonNull;

public final class MarkerModuleImpl extends MarkerModule {
   @Override
   public void displayMarker(@NonNull Recipients var1, @NonNull Marker var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("marker is marked non-null but is null");
      }

      DisplayMarkerMessage var3 = this.toProtobuf(var2);
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeMarker(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("markerId is marked non-null but is null");
      }

      RemoveMarkerMessage var3 = RemoveMarkerMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeMarker(@NonNull Recipients var1, @NonNull Marker var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("marker is marked non-null but is null");
      }

      this.removeMarker(var1, var2.getId());
   }

   @Override
   public void resetMarkers(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetMarkersMessage var2 = ResetMarkersMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private DisplayMarkerMessage toProtobuf(Marker var1) {
      DisplayMarkerMessage.Builder var2 = DisplayMarkerMessage.newBuilder()
         .setId(var1.getId())
         .setLocation(NetworkTypes.toProtobuf(var1.getLocation()))
         .setOwnerId(NetworkTypes.toProtobuf(var1.getOwnerId()))
         .setOwnerName(var1.getOwnerName())
         .setInGameNotification(var1.isInGameNotification())
         .setChatNotify(var1.isChatNotify())
         .setMiddleClickRemove(var1.isMiddleClickRemove());
      this.applyFlag(var2, var1.getFlag(), var1.getColor());
      var2.setTarget(this.toProtobuf(var1.getTarget()));
      Duration var3 = var1.getDuration();
      if (var3 != null) {
         var2.setDuration(NetworkTypes.toProtobuf(var3));
      }

      MarkerStyle var4 = var1.getStyle();
      if (var4 != null) {
         var2.setStyle(this.toProtobuf(var4));
      }

      return var2.build();
   }

   private void applyFlag(DisplayMarkerMessage.Builder var1, MarkerFlag var2, Color var3) {
      com.lunarclient.apollo.common.v1.Color var4 = var3 == null ? null : NetworkTypes.toProtobuf(var3);
      com.lunarclient.apollo.marker.v1.MarkerFlag.Builder var5 = com.lunarclient.apollo.marker.v1.MarkerFlag.newBuilder();
      switch (var2) {
         case NORMAL:
            NormalMarker.Builder var9 = NormalMarker.newBuilder();
            if (var4 != null) {
               var9.setColor(var4);
            }

            var5.setNormal(var9.build());
            break;
         case DANGER:
            DangerMarker.Builder var8 = DangerMarker.newBuilder();
            if (var4 != null) {
               var8.setColor(var4);
            }

            var5.setDanger(var8.build());
            break;
         case INFO:
            InfoMarker.Builder var7 = InfoMarker.newBuilder();
            if (var4 != null) {
               var7.setColor(var4);
            }

            var5.setInfo(var7.build());
            break;
         case INTEREST:
            InterestMarker.Builder var6 = InterestMarker.newBuilder();
            if (var4 != null) {
               var6.setColor(var4);
            }

            var5.setInterest(var6.build());
            break;
         default:
            throw new IllegalArgumentException("Unknown marker flag: " + var2);
      }

      var1.setFlag(var5.build());
   }

   private MarkerTarget toProtobuf(com.lunarclient.apollo.module.marker.target.MarkerTarget var1) {
      MarkerTarget.Builder var2 = MarkerTarget.newBuilder();
      if (var1 instanceof ItemMarkerTarget) {
         var2.setItem(ItemTarget.newBuilder().setItemStack(NetworkTypes.toProtobuf(((ItemMarkerTarget)var1).getItemStack())).build());
      } else if (var1 instanceof BlockMarkerTarget) {
         var2.setBlock(BlockTarget.newBuilder().setItemStack(NetworkTypes.toProtobuf(((BlockMarkerTarget)var1).getItemStack())).build());
      } else if (var1 instanceof EntityMarkerTarget) {
         var2.setEntity(EntityTarget.newBuilder().setEntityType(((EntityMarkerTarget)var1).getEntityType()).build());
      } else {
         if (!(var1 instanceof PlayerMarkerTarget)) {
            throw new IllegalArgumentException("Unknown marker target type: " + var1.getClass().getName());
         }

         PlayerMarkerTarget var3 = (PlayerMarkerTarget)var1;
         var2.setPlayer(PlayerTarget.newBuilder().setUuid(NetworkTypes.toProtobuf(var3.getPlayerId())).setName(var3.getPlayerName()).build());
      }

      return var2.build();
   }

   private com.lunarclient.apollo.marker.v1.MarkerStyle toProtobuf(MarkerStyle var1) {
      return com.lunarclient.apollo.marker.v1.MarkerStyle.newBuilder()
         .setScale(Ranges.checkRange(var1.getScale(), 0.5F, 2.0F, "MarkerStyle#scale"))
         .setAnimateMarkerOnHover(var1.isAnimateMarkerOnHover())
         .setCompactMode(var1.isCompactMode())
         .setTextShadow(var1.isTextShadow())
         .setOwnerSuffix(var1.getOwnerSuffix())
         .setOwnerDisplay(this.toProtobuf(var1.getOwnerDisplay()))
         .setShowOwner(this.toProtobuf(var1.getShowOwner()))
         .setShowCoordinates(this.toProtobuf(var1.getShowCoordinates()))
         .setShowDistance(this.toProtobuf(var1.getShowDistance()))
         .setShowDescription(this.toProtobuf(var1.getShowDescription()))
         .setDescriptionDisplay(this.toProtobuf(var1.getDescriptionDisplay()))
         .build();
   }

   private MarkerDisplayCondition toProtobuf(com.lunarclient.apollo.module.marker.display.MarkerDisplayCondition var1) {
      return MarkerDisplayCondition.forNumber(var1.ordinal() + 1);
   }

   private MarkerOwnerDisplay toProtobuf(com.lunarclient.apollo.module.marker.display.MarkerOwnerDisplay var1) {
      return MarkerOwnerDisplay.forNumber(var1.ordinal() + 1);
   }

   private MarkerDescriptionDisplay toProtobuf(com.lunarclient.apollo.module.marker.display.MarkerDescriptionDisplay var1) {
      return MarkerDescriptionDisplay.forNumber(var1.ordinal() + 1);
   }
}
