package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class NoOpClientReportRecorder implements IClientReportRecorder {
   @Override
   public void recordLostEnvelope(@NotNull DiscardReason var1, @Nullable SentryEnvelope var2) {
   }

   @Override
   public void recordLostEnvelopeItem(@NotNull DiscardReason var1, @Nullable SentryEnvelopeItem var2) {
   }

   @Override
   public void recordLostEvent(@NotNull DiscardReason var1, @NotNull DataCategory var2) {
   }

   @Override
   public void recordLostEvent(@NotNull DiscardReason var1, @NotNull DataCategory var2, long var3) {
   }

   @NotNull
   @Override
   public SentryEnvelope attachReportToEnvelope(@NotNull SentryEnvelope var1) {
      return var1;
   }
}
