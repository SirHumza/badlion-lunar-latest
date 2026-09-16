package com.lunarclient.apollo.module.waypoint;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.config.Serializer;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.util.Ranges;
import com.lunarclient.apollo.waypoint.v1.DisplayWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.HideWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.RemoveWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.ResetWaypointsMessage;
import com.lunarclient.apollo.waypoint.v1.ShowWaypointMessage;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import lombok.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.configurate.ConfigurationNode;
import org.spongepowered.configurate.serialize.SerializationException;
import org.spongepowered.configurate.serialize.TypeSerializer;

public final class WaypointModuleImpl extends WaypointModule implements Serializer {
   public WaypointModuleImpl() {
      this.serializer(Waypoint.class, new WaypointModuleImpl.WaypointSerializer());
      this.handle(ApolloRegisterPlayerEvent.class, this::onPlayerRegister);
   }

   @Override
   public void displayWaypoint(@NonNull Recipients var1, @NonNull Waypoint var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("waypoint is marked non-null but is null");
      }

      DisplayWaypointMessage var3 = this.toProtobuf(var2);
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeWaypoint(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("waypointName is marked non-null but is null");
      }

      RemoveWaypointMessage var3 = RemoveWaypointMessage.newBuilder().setName(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeWaypoint(@NonNull Recipients var1, @NonNull Waypoint var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("waypoint is marked non-null but is null");
      }

      this.removeWaypoint(var1, var2.getName());
   }

   @Override
   public void resetWaypoints(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetWaypointsMessage var2 = ResetWaypointsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void showWaypoint(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("waypointName is marked non-null but is null");
      }

      ShowWaypointMessage var3 = ShowWaypointMessage.newBuilder().setName(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void hideWaypoint(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("waypointName is marked non-null but is null");
      }

      HideWaypointMessage var3 = HideWaypointMessage.newBuilder().setName(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   private void onPlayerRegister(ApolloRegisterPlayerEvent var1) {
      if (this.isEnabled()) {
         ApolloPlayer var2 = var1.getPlayer();
         List var3 = this.getOptions().get(var2, WaypointModule.DEFAULT_WAYPOINTS);
         if (var3 != null) {
            for (Waypoint var5 : var3) {
               ApolloManager.getNetworkManager().sendPacket(var2, this.toProtobuf(var5));
            }
         }
      }
   }

   private DisplayWaypointMessage toProtobuf(Waypoint var1) {
      DisplayWaypointMessage.Builder var2 = DisplayWaypointMessage.newBuilder()
         .setName(var1.getName())
         .setLocation(NetworkTypes.toProtobuf(var1.getLocation()))
         .setColor(NetworkTypes.toProtobuf(var1.getColor()))
         .setPreventRemoval(var1.isPreventRemoval())
         .setHidden(var1.isHidden())
         .setShowBeam(var1.isShowBeam())
         .setHighlightBlock(var1.isHighlightBlock());
      float var3 = var1.getHighlightBlockLineWidth();
      if (var3 != 0.0F) {
         var2.setHighlightBlockLineWidth(Ranges.checkRange(var3, 1.5F, 7.5F, "Waypoint#highlightBlockLineWidth"));
      }

      WaypointTextStyle var4 = var1.getTextStyle();
      if (var4 != null) {
         var2.setStyle(this.toProtobuf(var4));
      }

      return var2.build();
   }

   private com.lunarclient.apollo.waypoint.v1.WaypointTextStyle toProtobuf(WaypointTextStyle var1) {
      return com.lunarclient.apollo.waypoint.v1.WaypointTextStyle.newBuilder()
         .setShowText(var1.isShowText())
         .setOnlyShowTextWhenLookingNear(var1.isOnlyShowTextWhenLookingNear())
         .setShowIcons(var1.isShowIcons())
         .setTextIconScale(Ranges.checkRange(var1.getTextIconScale(), 0.1F, 3.0F, "WaypointTextStyle#textIconScale"))
         .setLabelScale(Ranges.checkRange(var1.getLabelScale(), 0.1F, 2.0F, "WaypointTextStyle#labelScale"))
         .setBoxPadding(Ranges.checkRange(var1.getBoxPadding(), 1.0F, 8.0F, "WaypointTextStyle#boxPadding"))
         .setBoxBorders(var1.isBoxBorders())
         .setTextShadow(var1.isTextShadow())
         .setShowDistance(var1.isShowDistance())
         .build();
   }

   private static final class WaypointSerializer implements TypeSerializer<Waypoint> {
      private WaypointSerializer() {
      }

      public Waypoint deserialize(Type var1, ConfigurationNode var2) {
         Waypoint.WaypointBuilder var3 = Waypoint.builder()
            .name(this.virtualNode(var2, "name").getString())
            .location(
               ApolloBlockLocation.builder()
                  .world(this.virtualNode(var2, "location", "world").getString())
                  .x(this.virtualNode(var2, "location", "x").getInt())
                  .y(this.virtualNode(var2, "location", "y").getInt())
                  .z(this.virtualNode(var2, "location", "z").getInt())
                  .build()
            )
            .color(Color.decode(var2.node(new Object[]{"color"}).getString("#FFFFFF")))
            .preventRemoval(var2.node(new Object[]{"prevent-removal"}).getBoolean())
            .hidden(var2.node(new Object[]{"hidden"}).getBoolean());
         if (var2.hasChild(new Object[]{"show-beam"})) {
            var3.showBeam(var2.node(new Object[]{"show-beam"}).getBoolean(true));
         }

         if (var2.hasChild(new Object[]{"highlight-block"})) {
            var3.highlightBlock(var2.node(new Object[]{"highlight-block"}).getBoolean(true));
         }

         if (var2.hasChild(new Object[]{"highlight-block-line-width"})) {
            var3.highlightBlockLineWidth((float)var2.node(new Object[]{"highlight-block-line-width"}).getDouble(4.0));
         }

         if (var2.hasChild(new Object[]{"style"})) {
            var3.textStyle(this.readStyle(var2.node(new Object[]{"style"})));
         }

         return var3.build();
      }

      public void serialize(Type var1, @Nullable Waypoint var2, ConfigurationNode var3) {
         if (var2 == null) {
            var3.raw(null);
         } else {
            var3.node(new Object[]{"name"}).set(var2.getName());
            var3.node(new Object[]{"location", "world"}).set(var2.getLocation().getWorld());
            var3.node(new Object[]{"location", "x"}).set(var2.getLocation().getX());
            var3.node(new Object[]{"location", "y"}).set(var2.getLocation().getY());
            var3.node(new Object[]{"location", "z"}).set(var2.getLocation().getZ());
            var3.node(new Object[]{"color"}).set(String.format("#%06X", 16777215 & var2.getColor().getRGB()));
            var3.node(new Object[]{"prevent-removal"}).set(var2.isPreventRemoval());
            var3.node(new Object[]{"hidden"}).set(var2.isHidden());
            var3.node(new Object[]{"show-beam"}).set(var2.isShowBeam());
            var3.node(new Object[]{"highlight-block"}).set(var2.isHighlightBlock());
            var3.node(new Object[]{"highlight-block-line-width"}).set(var2.getHighlightBlockLineWidth());
            if (var2.getTextStyle() != null) {
               this.writeStyle(var3.node(new Object[]{"style"}), var2.getTextStyle());
            }
         }
      }

      private WaypointTextStyle readStyle(ConfigurationNode var1) {
         WaypointTextStyle.WaypointTextStyleBuilder var2 = WaypointTextStyle.builder();
         if (var1.hasChild(new Object[]{"show-text"})) {
            var2.showText(var1.node(new Object[]{"show-text"}).getBoolean(true));
         }

         if (var1.hasChild(new Object[]{"only-show-text-when-looking-near"})) {
            var2.onlyShowTextWhenLookingNear(var1.node(new Object[]{"only-show-text-when-looking-near"}).getBoolean(false));
         }

         if (var1.hasChild(new Object[]{"show-icons"})) {
            var2.showIcons(var1.node(new Object[]{"show-icons"}).getBoolean(false));
         }

         if (var1.hasChild(new Object[]{"text-icon-scale"})) {
            var2.textIconScale(var1.node(new Object[]{"text-icon-scale"}).getFloat(1.5F));
         }

         if (var1.hasChild(new Object[]{"label-scale"})) {
            var2.labelScale(var1.node(new Object[]{"label-scale"}).getFloat(1.0F));
         }

         if (var1.hasChild(new Object[]{"box-padding"})) {
            var2.boxPadding(var1.node(new Object[]{"box-padding"}).getFloat(4.0F));
         }

         if (var1.hasChild(new Object[]{"box-borders"})) {
            var2.boxBorders(var1.node(new Object[]{"box-borders"}).getBoolean(true));
         }

         if (var1.hasChild(new Object[]{"text-shadow"})) {
            var2.textShadow(var1.node(new Object[]{"text-shadow"}).getBoolean(false));
         }

         if (var1.hasChild(new Object[]{"show-distance"})) {
            var2.showDistance(var1.node(new Object[]{"show-distance"}).getBoolean(true));
         }

         return var2.build();
      }

      private void writeStyle(ConfigurationNode var1, WaypointTextStyle var2) {
         var1.node(new Object[]{"show-text"}).set(var2.isShowText());
         var1.node(new Object[]{"only-show-text-when-looking-near"}).set(var2.isOnlyShowTextWhenLookingNear());
         var1.node(new Object[]{"show-icons"}).set(var2.isShowIcons());
         var1.node(new Object[]{"text-icon-scale"}).set(var2.getTextIconScale());
         var1.node(new Object[]{"label-scale"}).set(var2.getLabelScale());
         var1.node(new Object[]{"box-padding"}).set(var2.getBoxPadding());
         var1.node(new Object[]{"box-borders"}).set(var2.isBoxBorders());
         var1.node(new Object[]{"text-shadow"}).set(var2.isTextShadow());
         var1.node(new Object[]{"show-distance"}).set(var2.isShowDistance());
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
