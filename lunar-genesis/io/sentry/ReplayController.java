package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public interface ReplayController {
   void start();

   void stop();

   void pause();

   void resume();

   boolean isRecording();

   void captureReplay(@Nullable Boolean var1);

   @NotNull
   SentryId getReplayId();

   void setBreadcrumbConverter(@NotNull ReplayBreadcrumbConverter var1);

   @NotNull
   ReplayBreadcrumbConverter getBreadcrumbConverter();
}
