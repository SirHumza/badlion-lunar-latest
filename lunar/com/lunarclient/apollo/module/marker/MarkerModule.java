package com.lunarclient.apollo.module.marker;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "marker", name = "Marker")
@ApiStatus.NonExtendable
public abstract class MarkerModule extends ApolloModule {
   public abstract void displayMarker(Recipients var1, Marker var2);

   public abstract void removeMarker(Recipients var1, String var2);

   public abstract void removeMarker(Recipients var1, Marker var2);

   public abstract void resetMarkers(Recipients var1);
}
