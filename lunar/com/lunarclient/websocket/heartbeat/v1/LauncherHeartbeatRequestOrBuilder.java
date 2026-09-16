package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LauncherHeartbeatRequestOrBuilder extends MessageOrBuilder {
   @Deprecated
   boolean getFocused();

   @Deprecated
   boolean getGameCurrentlyLaunched();

   List<RunningInstance> getRunningInstancesList();

   RunningInstance getRunningInstances(int var1);

   int getRunningInstancesCount();

   List<? extends RunningInstanceOrBuilder> getRunningInstancesOrBuilderList();

   RunningInstanceOrBuilder getRunningInstancesOrBuilder(int var1);

   List<OpenRenderer> getOpenRenderersList();

   OpenRenderer getOpenRenderers(int var1);

   int getOpenRenderersCount();

   List<? extends OpenRendererOrBuilder> getOpenRenderersOrBuilderList();

   OpenRendererOrBuilder getOpenRenderersOrBuilder(int var1);

   boolean getBadlionConnected();
}
