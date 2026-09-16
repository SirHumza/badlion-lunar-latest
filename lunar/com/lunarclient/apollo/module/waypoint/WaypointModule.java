package com.lunarclient.apollo.module.waypoint;

import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.ListOption;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.recipients.Recipients;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "waypoint", name = "Waypoint")
@ApiStatus.NonExtendable
public abstract class WaypointModule extends ApolloModule {
   private static final Waypoint SPAWN_WAYPOINT = Waypoint.builder()
      .name("Spawn")
      .location(ApolloBlockLocation.builder().world("world").x(0).y(100).z(0).build())
      .color(Color.RED)
      .preventRemoval(false)
      .hidden(false)
      .build();
   public static final ListOption<Waypoint> DEFAULT_WAYPOINTS = ((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)Option.list()
                  .comment("Sets the default waypoints to send to the player."))
               .node("default-waypoints"))
            .type(new TypeToken<List<Waypoint>>() {}))
         .defaultValue(new ArrayList<>(Collections.singletonList(SPAWN_WAYPOINT))))
      .build();
   public static final SimpleOption<Boolean> SERVER_HANDLES_WAYPOINTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to let servers handle waypoints, otherwise 'false'."))
                  .node("server-handles-waypoints"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   WaypointModule() {
      this.registerOptions(DEFAULT_WAYPOINTS, SERVER_HANDLES_WAYPOINTS);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void displayWaypoint(Recipients var1, Waypoint var2);

   public abstract void removeWaypoint(Recipients var1, String var2);

   public abstract void removeWaypoint(Recipients var1, Waypoint var2);

   public abstract void resetWaypoints(Recipients var1);

   public abstract void showWaypoint(Recipients var1, String var2);

   public abstract void hideWaypoint(Recipients var1, String var2);
}
