package com.lunarclient.apollo.module.heightlimit;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent;
import com.lunarclient.apollo.heightlimit.v1.OverrideHeightLimitMessage;
import com.lunarclient.apollo.heightlimit.v1.RemoveHeightLimitMessage;
import com.lunarclient.apollo.heightlimit.v1.ResetHeightLimitsMessage;
import com.lunarclient.apollo.option.config.Serializer;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.util.Ranges;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import lombok.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.configurate.ConfigurationNode;
import org.spongepowered.configurate.serialize.SerializationException;
import org.spongepowered.configurate.serialize.TypeSerializer;

public final class HeightLimitModuleImpl extends HeightLimitModule implements Serializer {
   public HeightLimitModuleImpl() {
      this.serializer(HeightLimit.class, new HeightLimitModuleImpl.HeightLimitSerializer());
      this.handle(ApolloRegisterPlayerEvent.class, this::onPlayerRegister);
   }

   @Override
   public void overrideHeightLimit(@NonNull Recipients var1, @NonNull HeightLimit var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("heightLimit is marked non-null but is null");
      }

      OverrideHeightLimitMessage.Builder var3 = OverrideHeightLimitMessage.newBuilder()
         .setWorld(var2.getWorld())
         .setLimit(Ranges.checkStrictlyPositive(var2.getLimit(), "HeightLimit#limit"));
      Component var4 = var2.getDisplayName();
      if (var4 != null) {
         var3.setDisplayNameAdventureJsonLines(ApolloComponent.toJson(var4));
      }

      OverrideHeightLimitMessage var5 = var3.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void removeHeightLimit(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("world is marked non-null but is null");
      }

      RemoveHeightLimitMessage var3 = RemoveHeightLimitMessage.newBuilder().setWorld(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeHeightLimit(@NonNull Recipients var1, @NonNull HeightLimit var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("heightLimit is marked non-null but is null");
      }

      this.removeHeightLimit(var1, var2.getWorld());
   }

   @Override
   public void resetHeightLimits(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetHeightLimitsMessage var2 = ResetHeightLimitsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private void onPlayerRegister(ApolloRegisterPlayerEvent var1) {
      if (this.isEnabled()) {
         ApolloPlayer var2 = var1.getPlayer();
         List var3 = this.getOptions().get(var2, HeightLimitModule.DEFAULT_HEIGHT_LIMITS);
         if (var3 != null) {
            for (HeightLimit var5 : var3) {
               this.overrideHeightLimit(var2, var5);
            }
         }
      }
   }

   private static final class HeightLimitSerializer implements TypeSerializer<HeightLimit> {
      private HeightLimitSerializer() {
      }

      public HeightLimit deserialize(Type var1, ConfigurationNode var2) {
         HeightLimit.HeightLimitBuilder var3 = HeightLimit.builder()
            .world(this.virtualNode(var2, "world").getString())
            .limit(this.virtualNode(var2, "limit").getInt());
         String var4 = var2.node(new Object[]{"display-name"}).getString();
         if (var4 != null) {
            var3.displayName(ApolloComponent.fromLegacyAmpersand(var4));
         }

         return var3.build();
      }

      public void serialize(Type var1, @Nullable HeightLimit var2, ConfigurationNode var3) {
         if (var2 == null) {
            var3.raw(null);
         } else {
            var3.node(new Object[]{"world"}).set(var2.getWorld());
            var3.node(new Object[]{"limit"}).set(var2.getLimit());
            Component var4 = var2.getDisplayName();
            if (var4 != null) {
               var3.node(new Object[]{"display-name"}).set(ApolloComponent.toLegacyAmpersand(var4));
            }
         }
      }

      private ConfigurationNode virtualNode(ConfigurationNode var1, Object... var2) {
         if (!var1.hasChild(var2)) {
            throw new SerializationException("Required field " + Arrays.toString(var2) + " not found!");
         } else {
            return var1.node(var2);
         }
      }
   }
}
