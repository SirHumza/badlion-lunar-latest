package com.lunarclient.apollo;

import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.stats.ApolloStats;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface ApolloPlatform {
   ApolloPlatform.Kind getKind();

   ApolloPlatform.Platform getPlatform();

   Options getOptions();

   String getApolloVersion();

   Logger getPlatformLogger();

   ApolloStats getStats();

   Object getPlugin();

   ApolloPlatform.Scheduler getScheduler();

   enum Kind {
      SERVER,
      PROXY;
   }

   enum Platform {
      BUKKIT,
      FOLIA,
      MINESTOM,
      BUNGEE,
      VELOCITY;
   }

   interface Scheduler {
      void scheduleAsyncRepeating(Runnable var1, long var2, long var4, TimeUnit var6);
   }
}
