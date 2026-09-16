package com.lunarclient.apollo.module.stopwatch;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.location.HudPosition;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.stopwatch.v1.AddStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.AddTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.RemoveStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.RemoveTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetStopwatchesMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetTimersMessage;
import com.lunarclient.apollo.stopwatch.v1.StartStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.StartTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.StopStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.StopTimerMessage;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.Color;
import lombok.NonNull;

public final class StopwatchModuleImpl extends StopwatchModule {
   @Override
   public void startStopwatch(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      StartStopwatchMessage var2 = StartStopwatchMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void stopStopwatch(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      StopStopwatchMessage var2 = StopStopwatchMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void resetStopwatch(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetStopwatchMessage var2 = ResetStopwatchMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void addStopwatch(@NonNull Recipients var1, @NonNull Stopwatch var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("stopwatch is marked non-null but is null");
      }

      AddStopwatchMessage.Builder var3 = AddStopwatchMessage.newBuilder()
         .setId(var2.getId())
         .setName(var2.getName())
         .setResetOnStart(var2.isResetOnStart())
         .setPreventModification(var2.isPreventModification())
         .setHideWhenStopped(var2.isHideWhenStopped());
      String var4 = var2.getDisplayFormat();
      if (var4 != null) {
         var3.setDisplayFormat(var4);
      }

      Color var5 = var2.getTextColor();
      if (var5 != null) {
         var3.setTextColor(NetworkTypes.toProtobuf(var5));
      }

      HudPosition var6 = var2.getHudPosition();
      if (var6 != null) {
         var3.setHudPosition(NetworkTypes.toProtobuf(var6));
      }

      AddStopwatchMessage var7 = var3.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var7);
   }

   @Override
   public void removeStopwatch(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      RemoveStopwatchMessage var3 = RemoveStopwatchMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void startStopwatch(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      StartStopwatchMessage var3 = StartStopwatchMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void stopStopwatch(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      StopStopwatchMessage var3 = StopStopwatchMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetStopwatch(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      ResetStopwatchMessage var3 = ResetStopwatchMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetStopwatches(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetStopwatchesMessage var2 = ResetStopwatchesMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void addTimer(@NonNull Recipients var1, @NonNull Timer var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("timer is marked non-null but is null");
      }

      AddTimerMessage.Builder var3 = AddTimerMessage.newBuilder()
         .setId(var2.getId())
         .setName(var2.getName())
         .setDuration(NetworkTypes.toProtobuf(var2.getDuration()))
         .setLoop(var2.isLoop())
         .setPreventModification(var2.isPreventModification())
         .setHideWhenStopped(var2.isHideWhenStopped())
         .setInGameNotification(var2.isInGameNotification());
      String var4 = var2.getDisplayFormat();
      if (var4 != null) {
         var3.setDisplayFormat(var4);
      }

      Component var5 = var2.getTitleText();
      if (var5 != null) {
         var3.setTitleTextAdventureJsonLines(ApolloComponent.toJson(var5));
      }

      Color var6 = var2.getTextColor();
      if (var6 != null) {
         var3.setTextColor(NetworkTypes.toProtobuf(var6));
      }

      HudPosition var7 = var2.getHudPosition();
      if (var7 != null) {
         var3.setHudPosition(NetworkTypes.toProtobuf(var7));
      }

      AddTimerMessage var8 = var3.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var8);
   }

   @Override
   public void removeTimer(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      RemoveTimerMessage var3 = RemoveTimerMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void startTimer(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      StartTimerMessage var3 = StartTimerMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void stopTimer(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      StopTimerMessage var3 = StopTimerMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetTimer(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      ResetTimerMessage var3 = ResetTimerMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetTimers(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetTimersMessage var2 = ResetTimersMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
