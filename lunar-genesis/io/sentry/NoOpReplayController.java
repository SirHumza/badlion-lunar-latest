package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpReplayController implements ReplayController {
   private static final NoOpReplayController instance = new NoOpReplayController();

   public static NoOpReplayController getInstance() {
      return instance;
   }

   private NoOpReplayController() {
   }

   @Override
   public void start() {
   }

   @Override
   public void stop() {
   }

   @Override
   public void pause() {
   }

   @Override
   public void resume() {
   }

   @Override
   public boolean isRecording() {
      return false;
   }

   @Override
   public void captureReplay(@Nullable Boolean var1) {
   }

   @NotNull
   @Override
   public SentryId getReplayId() {
      return SentryId.EMPTY_ID;
   }

   @Override
   public void setBreadcrumbConverter(@NotNull ReplayBreadcrumbConverter var1) {
   }

   @NotNull
   @Override
   public ReplayBreadcrumbConverter getBreadcrumbConverter() {
      return NoOpReplayBreadcrumbConverter.getInstance();
   }
}
