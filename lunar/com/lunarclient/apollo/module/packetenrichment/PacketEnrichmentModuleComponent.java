package com.lunarclient.apollo.module.packetenrichment;

import com.lunarclient.apollo.event.ApolloReceivePacketEvent;
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.event.packetenrichment.chat.ApolloPlayerChatCloseEvent;
import com.lunarclient.apollo.event.packetenrichment.chat.ApolloPlayerChatOpenEvent;
import com.lunarclient.apollo.event.packetenrichment.inventory.ApolloPlayerInventoryCloseEvent;
import com.lunarclient.apollo.event.packetenrichment.inventory.ApolloPlayerInventoryOpenEvent;
import com.lunarclient.apollo.event.packetenrichment.melee.ApolloPlayerAttackEvent;
import com.lunarclient.apollo.event.packetenrichment.world.ApolloPlayerUseItemBucketEvent;
import com.lunarclient.apollo.event.packetenrichment.world.ApolloPlayerUseItemEvent;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.packetenrichment.v1.PlayerAttackMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerChatCloseMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerChatOpenMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerInventoryCloseMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerInventoryOpenMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerUseItemBucketMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerUseItemMessage;

public final class PacketEnrichmentImpl extends PacketEnrichmentModule {
   public PacketEnrichmentImpl() {
      this.handle(ApolloReceivePacketEvent.class, this::onReceivePacket);
   }

   private void onReceivePacket(ApolloReceivePacketEvent var1) {
      if (this.isEnabled()) {
         Options var2 = this.getOptions();
         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_ATTACK_EVENT)) {
            var1.unpack(PlayerAttackMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerAttackEvent var2x = new ApolloPlayerAttackEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getTargetInfo()),
                        NetworkTypes.fromProtobuf(var1x.getAttackerInfo()),
                        var1x.getDistance()
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }

         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_CHAT_OPEN_EVENT)) {
            var1.unpack(PlayerChatOpenMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerChatOpenEvent var2x = new ApolloPlayerChatOpenEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getPlayerInfo())
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }

         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_CHAT_CLOSE_EVENT)) {
            var1.unpack(PlayerChatCloseMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerChatCloseEvent var2x = new ApolloPlayerChatCloseEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getPlayerInfo())
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }

         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_OPEN_EVENT)) {
            var1.unpack(PlayerInventoryOpenMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerInventoryOpenEvent var2x = new ApolloPlayerInventoryOpenEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getPlayerInfo())
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }

         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_CLOSE_EVENT)) {
            var1.unpack(PlayerInventoryCloseMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerInventoryCloseEvent var2x = new ApolloPlayerInventoryCloseEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getPlayerInfo())
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }

         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_USE_ITEM_EVENT)) {
            var1.unpack(PlayerUseItemMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerUseItemEvent var2x = new ApolloPlayerUseItemEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getPlayerInfo()),
                        var1x.getMainHand()
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }

         if (var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_USE_ITEM_BUCKET_EVENT)) {
            var1.unpack(PlayerUseItemBucketMessage.class)
               .ifPresent(
                  var1x -> {
                     ApolloPlayerUseItemBucketEvent var2x = new ApolloPlayerUseItemBucketEvent(
                        var1.getPlayer(),
                        NetworkTypes.fromProtobuf(var1x.getPacketInfo().getInstantiationTime()),
                        NetworkTypes.fromProtobuf(var1x.getPlayerInfo()),
                        NetworkTypes.fromProtobuf(var1x.getRayTraceResult())
                     );
                     EventBus.EventResult var3 = EventBus.getBus().post(var2x);

                     for (Throwable var5 : var3.getThrowing()) {
                        var5.printStackTrace();
                     }
                  }
               );
         }
      }
   }
}
