package com.lunarclient.apollo.module.inventory;

import com.google.protobuf.Message;
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.common.button.ApolloButtonTooltip;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.event.packetenrichment.inventory.ApolloPlayerInventoryCloseEvent;
import com.lunarclient.apollo.event.packetenrichment.inventory.ApolloPlayerInventoryOpenEvent;
import com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent;
import com.lunarclient.apollo.event.player.ApolloUnregisterPlayerEvent;
import com.lunarclient.apollo.inventory.v1.DisplayInventoryButtonsMessage;
import com.lunarclient.apollo.inventory.v1.RemoveInventoryButtonMessage;
import com.lunarclient.apollo.inventory.v1.ResetInventoryButtonsMessage;
import com.lunarclient.apollo.inventory.v1.UpdateInventoryButtonMessage;
import com.lunarclient.apollo.module.button.ButtonModuleSupport;
import com.lunarclient.apollo.module.button.ButtonSurface;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.lunarclient.apollo.network.ButtonNetworkTypes;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.option.config.Serializer;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public final class InventoryModuleImpl
   extends InventoryModule
   implements ButtonSurface<InventoryButton, com.lunarclient.apollo.inventory.v1.InventoryButton>,
   Serializer {
   private final ButtonModuleSupport<InventoryButton, com.lunarclient.apollo.inventory.v1.InventoryButton> support = new ButtonModuleSupport<>(
      this, this, InventoryModule.BROADCAST_LIVE_BUTTONS
   );

   public InventoryModuleImpl() {
      this.serializer(InventoryButton.class, new InventoryButtonSerializer());
      this.handle(ApolloRegisterPlayerEvent.class, this::onPlayerRegister);
      this.handle(ApolloPlayerInventoryOpenEvent.class, var1 -> this.support.handleOpen(var1.getPlayer()));
      this.handle(ApolloPlayerInventoryCloseEvent.class, var1 -> this.support.handleClose(var1.getPlayer().getUniqueId()));
      this.handle(ApolloUnregisterPlayerEvent.class, var1 -> this.support.handleUnregister(var1.getPlayer().getUniqueId()));
   }

   @Override
   protected void onEnable() {
      this.support.startBroadcast();
   }

   @Override
   public void displayInventoryButtons(@NonNull Recipients var1, @NonNull Collection<InventoryButton> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttons is marked non-null but is null");
      }

      int var3 = 0;
      int var4 = 0;

      for (InventoryButton var6 : var2) {
         if (var6.getBox() == InventoryButtonBox.LEFT) {
            var3++;
         } else if (var6.getBox() == InventoryButtonBox.RIGHT) {
            var4++;
         }
      }

      if (var3 <= 25 && var4 <= 25) {
         this.support.displayButtons(var1, var2);
      } else {
         throw new IllegalArgumentException("InventoryButton batches support at most 25 buttons per box");
      }
   }

   @Override
   public void displayInventoryButton(@NonNull Recipients var1, @NonNull InventoryButton var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("button is marked non-null but is null");
      }

      this.support.displayButtons(var1, Collections.singleton(var2));
   }

   @Override
   public void removeInventoryButton(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      this.support.removeButton(var1, var2);
   }

   @Override
   public void removeInventoryButton(@NonNull Recipients var1, @NonNull InventoryButton var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("button is marked non-null but is null");
      }

      this.support.removeButton(var1, var2.getId());
   }

   @Override
   public void resetInventoryButtons(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      this.support.resetButtons(var1);
   }

   @Override
   public void updateInventoryButton(@NonNull Recipients var1, @NonNull String var2, @NonNull ApolloButtonContent var3, @Nullable ApolloButtonTooltip var4) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("content is marked non-null but is null");
      }

      this.support.pushUpdate(var1, var2, var3, true, var4);
   }

   @Override
   public void updateInventoryButtonContent(@NonNull Recipients var1, @NonNull String var2, @NonNull ApolloButtonContent var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("content is marked non-null but is null");
      }

      this.support.pushUpdate(var1, var2, var3, false, null);
   }

   @Override
   public void updateInventoryButtonTooltip(@NonNull Recipients var1, @NonNull String var2, @Nullable ApolloButtonTooltip var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      this.support.pushUpdate(var1, var2, null, true, var3);
   }

   private void onPlayerRegister(ApolloRegisterPlayerEvent var1) {
      if (this.isEnabled() && this.getOptions().<Boolean, SimpleOption<Boolean>>get(InventoryModule.SEND_DEFAULT_BUTTONS)) {
         ApolloPlayer var2 = var1.getPlayer();
         List var3 = this.getOptions().get(var2, InventoryModule.DEFAULT_BUTTONS);
         if (var3 != null && !var3.isEmpty()) {
            try {
               this.support.displayButtons(var2, var3);
            } catch (IllegalArgumentException var5) {
               Apollo.getPlatform().getPlatformLogger().warning("Skipping the default inventory buttons: " + var5.getMessage());
            }
         }
      }
   }

   public void validate(InventoryButton var1) {
      ButtonModuleSupport.validateCommon(var1, 92.0F, 166.0F);
      ButtonModuleSupport.requireSet(var1.getInventoryType(), "InventoryButton#inventoryType");
      ButtonModuleSupport.requireSet(var1.getBox(), "InventoryButton#box");
   }

   public com.lunarclient.apollo.inventory.v1.InventoryButton toDisplayElement(InventoryButton var1, @Nullable ApolloPlayer var2) {
      return com.lunarclient.apollo.inventory.v1.InventoryButton.newBuilder()
         .setButton(ButtonNetworkTypes.toProtobuf(var1, var2))
         .setInventoryType(com.lunarclient.apollo.inventory.v1.InventoryType.forNumber(var1.getInventoryType().ordinal() + 1))
         .setBox(com.lunarclient.apollo.inventory.v1.InventoryButtonBox.forNumber(var1.getBox().ordinal() + 1))
         .build();
   }

   @Override
   public Message createDisplay(List<com.lunarclient.apollo.inventory.v1.InventoryButton> var1) {
      return DisplayInventoryButtonsMessage.newBuilder().addAllInventoryButtons(var1).build();
   }

   @Override
   public Message createUpdate(String var1, ButtonUpdate var2) {
      return UpdateInventoryButtonMessage.newBuilder().setId(var1).setUpdate(var2).build();
   }

   @Override
   public Message createRemove(String var1) {
      return RemoveInventoryButtonMessage.newBuilder().setId(var1).build();
   }

   @Override
   public Message createReset() {
      return ResetInventoryButtonsMessage.getDefaultInstance();
   }

   @Override
   public boolean isOpenTrackingActive() {
      PacketEnrichmentModule var1 = Apollo.getModuleManager().getModule(PacketEnrichmentModule.class);
      if (var1 != null && var1.isEnabled()) {
         Options var2 = var1.getOptions();
         return var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_OPEN_PACKET)
            && var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_CLOSE_PACKET)
            && var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_OPEN_EVENT)
            && var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_CLOSE_EVENT);
      } else {
         return false;
      }
   }
}
