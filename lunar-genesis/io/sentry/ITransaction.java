package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public interface ITransaction extends ISpan {
   void setName(@NotNull String var1);

   @ApiStatus.Internal
   void setName(@NotNull String var1, @NotNull TransactionNameSource var2);

   @NotNull
   String getName();

   @NotNull
   TransactionNameSource getTransactionNameSource();

   @NotNull
   @TestOnly
   List<Span> getSpans();

   @NotNull
   ISpan startChild(@NotNull String var1, @Nullable String var2, @Nullable SentryDate var3);

   @Nullable
   Boolean isSampled();

   @Nullable
   Boolean isProfileSampled();

   @Nullable
   TracesSamplingDecision getSamplingDecision();

   @Nullable
   Span getLatestActiveSpan();

   @NotNull
   SentryId getEventId();

   void scheduleFinish();

   @ApiStatus.Internal
   void forceFinish(@NotNull SpanStatus var1, boolean var2, @Nullable Hint var3);

   @ApiStatus.Internal
   void finish(@Nullable SpanStatus var1, @Nullable SentryDate var2, boolean var3, @Nullable Hint var4);

   @ApiStatus.Internal
   void setContext(@NotNull String var1, @NotNull Object var2);

   @ApiStatus.Internal
   @NotNull
   Contexts getContexts();
}
