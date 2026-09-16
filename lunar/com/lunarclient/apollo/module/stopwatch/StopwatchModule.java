package com.lunarclient.apollo.module.stopwatch;

import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Arrays;
import java.util.Collection;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "stopwatch", name = "Stopwatch")
@ApiStatus.NonExtendable
public abstract class StopwatchModule extends ApolloModule {
   @Override
   public Collection<ApolloPlatform.Kind> getSupportedPlatforms() {
      return Arrays.asList(ApolloPlatform.Kind.SERVER, ApolloPlatform.Kind.PROXY);
   }

   public abstract void addStopwatch(Recipients var1, Stopwatch var2);

   public abstract void removeStopwatch(Recipients var1, String var2);

   public abstract void startStopwatch(Recipients var1, String var2);

   public abstract void stopStopwatch(Recipients var1, String var2);

   public abstract void resetStopwatch(Recipients var1, String var2);

   public abstract void resetStopwatches(Recipients var1);

   public abstract void addTimer(Recipients var1, Timer var2);

   public abstract void removeTimer(Recipients var1, String var2);

   public abstract void startTimer(Recipients var1, String var2);

   public abstract void stopTimer(Recipients var1, String var2);

   public abstract void resetTimer(Recipients var1, String var2);

   public abstract void resetTimers(Recipients var1);

   @Deprecated
   public abstract void startStopwatch(Recipients var1);

   @Deprecated
   public abstract void stopStopwatch(Recipients var1);

   @Deprecated
   public abstract void resetStopwatch(Recipients var1);
}
