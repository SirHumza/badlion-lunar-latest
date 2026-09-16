package io.sentry;

import io.sentry.clientreport.DiscardReason;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Backfillable;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.TransactionEnd;
import io.sentry.metrics.EncodedMetrics;
import io.sentry.metrics.IMetricsClient;
import io.sentry.metrics.NoopMetricsAggregator;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransport;
import io.sentry.transport.RateLimiter;
import io.sentry.util.CheckInUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.Random;
import io.sentry.util.SentryRandom;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public final class SentryClient implements ISentryClient, IMetricsClient {
   static final String SENTRY_PROTOCOL_VERSION = "7";
   private boolean enabled;
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final ITransport transport;
   @NotNull
   private final SentryClient.SortBreadcrumbsByDate sortBreadcrumbsByDate = new SentryClient.SortBreadcrumbsByDate();
   @NotNull
   private final IMetricsAggregator metricsAggregator;

   @Override
   public boolean isEnabled() {
      return this.enabled;
   }

   SentryClient(@NotNull SentryOptions var1) {
      this.options = Objects.requireNonNull(var1, "SentryOptions is required.");
      this.enabled = true;
      ITransportFactory var2 = var1.getTransportFactory();
      if (var2 instanceof NoOpTransportFactory) {
         var2 = new AsyncHttpTransportFactory();
         var1.setTransportFactory(var2);
      }

      RequestDetailsResolver var3 = new RequestDetailsResolver(var1);
      this.transport = var2.create(var1, var3.resolve());
      this.metricsAggregator = var1.isEnableMetrics() ? new MetricsAggregator(var1, this) : NoopMetricsAggregator.getInstance();
   }

   private boolean shouldApplyScopeData(@NotNull SentryBaseEvent var1, @NotNull Hint var2) {
      if (HintUtils.shouldApplyScopeData(var2)) {
         return true;
      }

      this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", var1.getEventId());
      return false;
   }

   private boolean shouldApplyScopeData(@NotNull CheckIn var1, @NotNull Hint var2) {
      if (HintUtils.shouldApplyScopeData(var2)) {
         return true;
      }

      this.options.getLogger().log(SentryLevel.DEBUG, "Check-in was cached so not applying scope: %s", var1.getCheckInId());
      return false;
   }

   @NotNull
   @Override
   public SentryId captureEvent(@NotNull SentryEvent var1, @Nullable IScope var2, @Nullable Hint var3) {
      Objects.requireNonNull(var1, "SentryEvent is required.");
      if (var3 == null) {
         var3 = new Hint();
      }

      if (this.shouldApplyScopeData(var1, var3)) {
         this.addScopeAttachmentsToHint(var2, var3);
      }

      this.options.getLogger().log(SentryLevel.DEBUG, "Capturing event: %s", var1.getEventId());
      if (var1 != null) {
         Throwable var4 = var1.getThrowable();
         if (var4 != null && this.options.containsIgnoredExceptionForType(var4)) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped as the exception %s is ignored", var4.getClass());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
            return SentryId.EMPTY_ID;
         }
      }

      if (this.shouldApplyScopeData(var1, var3)) {
         var1 = this.applyScope(var1, var2, var3);
         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by applyScope");
            return SentryId.EMPTY_ID;
         }
      }

      var1 = this.processEvent(var1, var3, this.options.getEventProcessors());
      if (var1 != null) {
         var1 = this.executeBeforeSend(var1, var3);
         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by beforeSend");
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Error);
         }
      }

      if (var1 == null) {
         return SentryId.EMPTY_ID;
      }

      Session var15 = var2 != null ? var2.withSession(var0 -> {}) : null;
      Session var5 = null;
      if (var1 != null) {
         if (var15 == null || !var15.isTerminated()) {
            var5 = this.updateSessionData(var1, var3, var2);
         }

         if (!this.sample()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event %s was dropped due to sampling decision.", var1.getEventId());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.SAMPLE_RATE, DataCategory.Error);
            var1 = null;
         }
      }

      boolean var6 = this.shouldSendSessionUpdateForDroppedEvent(var15, var5);
      if (var1 == null && !var6) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.");
         return SentryId.EMPTY_ID;
      }

      SentryId var7 = SentryId.EMPTY_ID;
      if (var1 != null && var1.getEventId() != null) {
         var7 = var1.getEventId();
      }

      boolean var8 = HintUtils.hasType(var3, Backfillable.class);
      if (var1 != null && !var8 && (var1.isErrored() || var1.isCrashed())) {
         this.options.getReplayController().captureReplay(var1.isCrashed());
      }

      try {
         TraceContext var9 = null;
         if (var8) {
            if (var1 != null) {
               Baggage var10 = Baggage.fromEvent(var1, this.options);
               var9 = var10.toTraceContext();
            }
         } else if (var2 != null) {
            ITransaction var16 = var2.getTransaction();
            if (var16 != null) {
               var9 = var16.traceContext();
            } else {
               PropagationContext var11 = TracingUtils.maybeUpdateBaggage(var2, this.options);
               var9 = var11.traceContext();
            }
         }

         boolean var17 = var1 != null;
         List var18 = var17 ? this.getAttachments(var3) : null;
         SentryEnvelope var12 = this.buildEnvelope(var1, var18, var5, var9, null);
         var3.clear();
         if (var12 != null) {
            var7 = this.sendEnvelope(var12, var3);
         }
      } catch (IOException | SentryEnvelopeException var13) {
         this.options.getLogger().log(SentryLevel.WARNING, var13, "Capturing event %s failed.", var7);
         var7 = SentryId.EMPTY_ID;
      }

      if (var2 != null) {
         this.finalizeTransaction(var2, var3);
      }

      return var7;
   }

   private void finalizeTransaction(@NotNull IScope var1, @NotNull Hint var2) {
      ITransaction var3 = var1.getTransaction();
      if (var3 != null && HintUtils.hasType(var2, TransactionEnd.class)) {
         Object var4 = HintUtils.getSentrySdkHint(var2);
         if (var4 instanceof DiskFlushNotification) {
            ((DiskFlushNotification)var4).setFlushable(var3.getEventId());
            var3.forceFinish(SpanStatus.ABORTED, false, var2);
         } else {
            var3.forceFinish(SpanStatus.ABORTED, false, null);
         }
      }
   }

   @NotNull
   @Override
   public SentryId captureReplayEvent(@NotNull SentryReplayEvent var1, @Nullable IScope var2, @Nullable Hint var3) {
      Objects.requireNonNull(var1, "SessionReplay is required.");
      if (var3 == null) {
         var3 = new Hint();
      }

      if (this.shouldApplyScopeData(var1, var3)) {
         this.applyScope(var1, var2);
      }

      this.options.getLogger().log(SentryLevel.DEBUG, "Capturing session replay: %s", var1.getEventId());
      SentryId var4 = SentryId.EMPTY_ID;
      if (var1.getEventId() != null) {
         var4 = var1.getEventId();
      }

      var1 = this.processReplayEvent(var1, var3, this.options.getEventProcessors());
      if (var1 != null) {
         var1 = this.executeBeforeSendReplay(var1, var3);
         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by beforeSendReplay");
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Replay);
         }
      }

      if (var1 == null) {
         return SentryId.EMPTY_ID;
      }

      try {
         TraceContext var5 = null;
         if (var2 != null) {
            ITransaction var6 = var2.getTransaction();
            if (var6 != null) {
               var5 = var6.traceContext();
            } else {
               PropagationContext var7 = TracingUtils.maybeUpdateBaggage(var2, this.options);
               var5 = var7.traceContext();
            }
         }

         boolean var10 = HintUtils.hasType(var3, Backfillable.class);
         SentryEnvelope var11 = this.buildEnvelope(var1, var3.getReplayRecording(), var5, var10);
         var3.clear();
         this.transport.send(var11, var3);
      } catch (IOException var8) {
         this.options.getLogger().log(SentryLevel.WARNING, var8, "Capturing event %s failed.", var4);
         var4 = SentryId.EMPTY_ID;
      }

      return var4;
   }

   private void addScopeAttachmentsToHint(@Nullable IScope var1, @NotNull Hint var2) {
      if (var1 != null) {
         var2.addAttachments(var1.getAttachments());
      }
   }

   private boolean shouldSendSessionUpdateForDroppedEvent(@Nullable Session var1, @Nullable Session var2) {
      if (var2 == null) {
         return false;
      }

      if (var1 == null) {
         return true;
      }

      boolean var3 = var2.getStatus() == Session.State.Crashed && var1.getStatus() != Session.State.Crashed;
      return var3 ? true : var2.errorCount() > 0 && var1.errorCount() <= 0;
   }

   @Nullable
   private List<Attachment> getAttachments(@NotNull Hint var1) {
      List var2 = var1.getAttachments();
      Attachment var3 = var1.getScreenshot();
      if (var3 != null) {
         var2.add(var3);
      }

      Attachment var4 = var1.getViewHierarchy();
      if (var4 != null) {
         var2.add(var4);
      }

      Attachment var5 = var1.getThreadDump();
      if (var5 != null) {
         var2.add(var5);
      }

      return var2;
   }

   @Nullable
   private SentryEnvelope buildEnvelope(
      @Nullable SentryBaseEvent var1, @Nullable List<Attachment> var2, @Nullable Session var3, @Nullable TraceContext var4, @Nullable ProfilingTraceData var5
   ) {
      SentryId var6 = null;
      ArrayList var7 = new ArrayList();
      if (var1 != null) {
         SentryEnvelopeItem var8 = SentryEnvelopeItem.fromEvent(this.options.getSerializer(), var1);
         var7.add(var8);
         var6 = var1.getEventId();
      }

      if (var3 != null) {
         SentryEnvelopeItem var11 = SentryEnvelopeItem.fromSession(this.options.getSerializer(), var3);
         var7.add(var11);
      }

      if (var5 != null) {
         SentryEnvelopeItem var12 = SentryEnvelopeItem.fromProfilingTrace(var5, this.options.getMaxTraceFileSize(), this.options.getSerializer());
         var7.add(var12);
         if (var6 == null) {
            var6 = new SentryId(var5.getProfileId());
         }
      }

      if (var2 != null) {
         for (Attachment var9 : var2) {
            SentryEnvelopeItem var10 = SentryEnvelopeItem.fromAttachment(
               this.options.getSerializer(), this.options.getLogger(), var9, this.options.getMaxAttachmentSize()
            );
            var7.add(var10);
         }
      }

      if (!var7.isEmpty()) {
         SentryEnvelopeHeader var14 = new SentryEnvelopeHeader(var6, this.options.getSdkVersion(), var4);
         return new SentryEnvelope(var14, var7);
      } else {
         return null;
      }
   }

   @Nullable
   private SentryEvent processEvent(@NotNull SentryEvent var1, @NotNull Hint var2, @NotNull List<EventProcessor> var3) {
      for (EventProcessor var5 : var3) {
         try {
            boolean var6 = var5 instanceof BackfillingEventProcessor;
            boolean var7 = HintUtils.hasType(var2, Backfillable.class);
            if (var7 && var6) {
               var1 = var5.process(var1, var2);
            } else if (!var7 && !var6) {
               var1 = var5.process(var1, var2);
            }
         } catch (Throwable var8) {
            this.options.getLogger().log(SentryLevel.ERROR, var8, "An exception occurred while processing event by processor: %s", var5.getClass().getName());
         }

         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by a processor: %s", var5.getClass().getName());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
            break;
         }
      }

      return var1;
   }

   @Nullable
   private SentryTransaction processTransaction(@NotNull SentryTransaction var1, @NotNull Hint var2, @NotNull List<EventProcessor> var3) {
      for (EventProcessor var5 : var3) {
         int var6 = var1.getSpans().size();

         try {
            var1 = var5.process(var1, var2);
         } catch (Throwable var9) {
            this.options
               .getLogger()
               .log(SentryLevel.ERROR, var9, "An exception occurred while processing transaction by processor: %s", var5.getClass().getName());
         }

         int var7 = var1 == null ? 0 : var1.getSpans().size();
         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", var5.getClass().getName());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Span, var6 + 1);
            break;
         }

         if (var7 < var6) {
            int var8 = var6 - var7;
            this.options.getLogger().log(SentryLevel.DEBUG, "%d spans were dropped by a processor: %s", var8, var5.getClass().getName());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Span, var8);
         }
      }

      return var1;
   }

   @Nullable
   private SentryReplayEvent processReplayEvent(@NotNull SentryReplayEvent var1, @NotNull Hint var2, @NotNull List<EventProcessor> var3) {
      for (EventProcessor var5 : var3) {
         try {
            var1 = var5.process(var1, var2);
         } catch (Throwable var7) {
            this.options
               .getLogger()
               .log(SentryLevel.ERROR, var7, "An exception occurred while processing replay event by processor: %s", var5.getClass().getName());
         }

         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Replay event was dropped by a processor: %s", var5.getClass().getName());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Replay);
            break;
         }
      }

      return var1;
   }

   @Override
   public void captureUserFeedback(@NotNull UserFeedback var1) {
      Objects.requireNonNull(var1, "SentryEvent is required.");
      if (SentryId.EMPTY_ID.equals(var1.getEventId())) {
         this.options.getLogger().log(SentryLevel.WARNING, "Capturing userFeedback without a Sentry Id.");
      } else {
         this.options.getLogger().log(SentryLevel.DEBUG, "Capturing userFeedback: %s", var1.getEventId());

         try {
            SentryEnvelope var2 = this.buildEnvelope(var1);
            this.sendEnvelope(var2, null);
         } catch (IOException var3) {
            this.options.getLogger().log(SentryLevel.WARNING, var3, "Capturing user feedback %s failed.", var1.getEventId());
         }
      }
   }

   @NotNull
   private SentryEnvelope buildEnvelope(@NotNull UserFeedback var1) {
      ArrayList var2 = new ArrayList();
      SentryEnvelopeItem var3 = SentryEnvelopeItem.fromUserFeedback(this.options.getSerializer(), var1);
      var2.add(var3);
      SentryEnvelopeHeader var4 = new SentryEnvelopeHeader(var1.getEventId(), this.options.getSdkVersion());
      return new SentryEnvelope(var4, var2);
   }

   @NotNull
   private SentryEnvelope buildEnvelope(@NotNull CheckIn var1, @Nullable TraceContext var2) {
      ArrayList var3 = new ArrayList();
      SentryEnvelopeItem var4 = SentryEnvelopeItem.fromCheckIn(this.options.getSerializer(), var1);
      var3.add(var4);
      SentryEnvelopeHeader var5 = new SentryEnvelopeHeader(var1.getCheckInId(), this.options.getSdkVersion(), var2);
      return new SentryEnvelope(var5, var3);
   }

   @NotNull
   private SentryEnvelope buildEnvelope(@NotNull SentryReplayEvent var1, @Nullable ReplayRecording var2, @Nullable TraceContext var3, boolean var4) {
      ArrayList var5 = new ArrayList();
      SentryEnvelopeItem var6 = SentryEnvelopeItem.fromReplay(this.options.getSerializer(), this.options.getLogger(), var1, var2, var4);
      var5.add(var6);
      SentryId var7 = var1.getEventId();
      SentryEnvelopeHeader var8 = new SentryEnvelopeHeader(var7, this.options.getSdkVersion(), var3);
      return new SentryEnvelope(var8, var5);
   }

   @TestOnly
   @Nullable
   Session updateSessionData(@NotNull SentryEvent var1, @NotNull Hint var2, @Nullable IScope var3) {
      Session var4 = null;
      if (HintUtils.shouldApplyScopeData(var2)) {
         if (var3 != null) {
            var4 = var3.withSession(var3x -> {
               if (var3x != null) {
                  Session.State var4x = null;
                  if (var1.isCrashed()) {
                     var4x = Session.State.Crashed;
                  }

                  boolean var5 = false;
                  if (Session.State.Crashed == var4x || var1.isErrored()) {
                     var5 = true;
                  }

                  String var6 = null;
                  if (var1.getRequest() != null && var1.getRequest().getHeaders() != null && var1.getRequest().getHeaders().containsKey("user-agent")) {
                     var6 = var1.getRequest().getHeaders().get("user-agent");
                  }

                  Object var7 = HintUtils.getSentrySdkHint(var2);
                  String var8 = null;
                  if (var7 instanceof AbnormalExit) {
                     var8 = ((AbnormalExit)var7).mechanism();
                     var4x = Session.State.Abnormal;
                  }

                  if (var3x.update(var4x, var6, var5, var8) && var3x.isTerminated()) {
                     var3x.end();
                  }
               } else {
                  this.options.getLogger().log(SentryLevel.INFO, "Session is null on scope.withSession");
               }
            });
         } else {
            this.options.getLogger().log(SentryLevel.INFO, "Scope is null on client.captureEvent");
         }
      }

      return var4;
   }

   @ApiStatus.Internal
   @Override
   public void captureSession(@NotNull Session var1, @Nullable Hint var2) {
      Objects.requireNonNull(var1, "Session is required.");
      if (var1.getRelease() != null && !var1.getRelease().isEmpty()) {
         SentryEnvelope var3;
         try {
            var3 = SentryEnvelope.from(this.options.getSerializer(), var1, this.options.getSdkVersion());
         } catch (IOException var5) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture session.", var5);
            return;
         }

         this.captureEnvelope(var3, var2);
      } else {
         this.options.getLogger().log(SentryLevel.WARNING, "Sessions can't be captured without setting a release.");
      }
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public SentryId captureEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      Objects.requireNonNull(var1, "SentryEnvelope is required.");
      if (var2 == null) {
         var2 = new Hint();
      }

      try {
         var2.clear();
         return this.sendEnvelope(var1, var2);
      } catch (IOException var4) {
         this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope.", var4);
         return SentryId.EMPTY_ID;
      }
   }

   @NotNull
   private SentryId sendEnvelope(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      SentryOptions.BeforeEnvelopeCallback var3 = this.options.getBeforeEnvelopeCallback();
      if (var3 != null) {
         try {
            var3.execute(var1, var2);
         } catch (Throwable var5) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeEnvelope callback threw an exception.", var5);
         }
      }

      if (var2 == null) {
         this.transport.send(var1);
      } else {
         this.transport.send(var1, var2);
      }

      SentryId var4 = var1.getHeader().getEventId();
      return var4 != null ? var4 : SentryId.EMPTY_ID;
   }

   @NotNull
   @Override
   public SentryId captureTransaction(
      @NotNull SentryTransaction var1, @Nullable TraceContext var2, @Nullable IScope var3, @Nullable Hint var4, @Nullable ProfilingTraceData var5
   ) {
      Objects.requireNonNull(var1, "Transaction is required.");
      if (var4 == null) {
         var4 = new Hint();
      }

      if (this.shouldApplyScopeData(var1, var4)) {
         this.addScopeAttachmentsToHint(var3, var4);
      }

      this.options.getLogger().log(SentryLevel.DEBUG, "Capturing transaction: %s", var1.getEventId());
      SentryId var6 = SentryId.EMPTY_ID;
      if (var1.getEventId() != null) {
         var6 = var1.getEventId();
      }

      if (this.shouldApplyScopeData(var1, var4)) {
         var1 = this.applyScope(var1, var3);
         if (var1 != null && var3 != null) {
            var1 = this.processTransaction(var1, var4, var3.getEventProcessors());
         }

         if (var1 == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by applyScope");
         }
      }

      if (var1 != null) {
         var1 = this.processTransaction(var1, var4, this.options.getEventProcessors());
      }

      if (var1 == null) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by Event processors.");
         return SentryId.EMPTY_ID;
      }

      int var7 = var1.getSpans().size();
      var1 = this.executeBeforeSendTransaction(var1, var4);
      int var8 = var1 == null ? 0 : var1.getSpans().size();
      if (var1 == null) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by beforeSendTransaction.");
         this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Transaction);
         this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Span, var7 + 1);
         return SentryId.EMPTY_ID;
      }

      if (var8 < var7) {
         int var9 = var7 - var8;
         this.options.getLogger().log(SentryLevel.DEBUG, "%d spans were dropped by beforeSendTransaction.", var9);
         this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Span, var9);
      }

      try {
         SentryEnvelope var12 = this.buildEnvelope(var1, this.filterForTransaction(this.getAttachments(var4)), null, var2, var5);
         var4.clear();
         if (var12 != null) {
            var6 = this.sendEnvelope(var12, var4);
         }
      } catch (IOException | SentryEnvelopeException var10) {
         this.options.getLogger().log(SentryLevel.WARNING, var10, "Capturing transaction %s failed.", var6);
         var6 = SentryId.EMPTY_ID;
      }

      return var6;
   }

   @ApiStatus.Experimental
   @NotNull
   @Override
   public SentryId captureCheckIn(@NotNull CheckIn var1, @Nullable IScope var2, @Nullable Hint var3) {
      if (var3 == null) {
         var3 = new Hint();
      }

      if (var1.getEnvironment() == null) {
         var1.setEnvironment(this.options.getEnvironment());
      }

      if (var1.getRelease() == null) {
         var1.setRelease(this.options.getRelease());
      }

      if (this.shouldApplyScopeData(var1, var3)) {
         var1 = this.applyScope(var1, var2);
      }

      if (CheckInUtils.isIgnored(this.options.getIgnoredCheckIns(), var1.getMonitorSlug())) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Check-in was dropped as slug %s is ignored", var1.getMonitorSlug());
         return SentryId.EMPTY_ID;
      }

      this.options.getLogger().log(SentryLevel.DEBUG, "Capturing check-in: %s", var1.getCheckInId());
      SentryId var4 = var1.getCheckInId();

      try {
         TraceContext var5 = null;
         if (var2 != null) {
            ITransaction var6 = var2.getTransaction();
            if (var6 != null) {
               var5 = var6.traceContext();
            } else {
               PropagationContext var7 = TracingUtils.maybeUpdateBaggage(var2, this.options);
               var5 = var7.traceContext();
            }
         }

         SentryEnvelope var9 = this.buildEnvelope(var1, var5);
         var3.clear();
         var4 = this.sendEnvelope(var9, var3);
      } catch (IOException var8) {
         this.options.getLogger().log(SentryLevel.WARNING, var8, "Capturing check-in %s failed.", var4);
         var4 = SentryId.EMPTY_ID;
      }

      return var4;
   }

   @Nullable
   private List<Attachment> filterForTransaction(@Nullable List<Attachment> var1) {
      if (var1 == null) {
         return null;
      }

      ArrayList var2 = new ArrayList();

      for (Attachment var4 : var1) {
         if (var4.isAddToTransactions()) {
            var2.add(var4);
         }
      }

      return var2;
   }

   @Nullable
   private SentryEvent applyScope(@NotNull SentryEvent var1, @Nullable IScope var2, @NotNull Hint var3) {
      if (var2 != null) {
         this.applyScope(var1, var2);
         if (var1.getTransaction() == null) {
            var1.setTransaction(var2.getTransactionName());
         }

         if (var1.getFingerprints() == null) {
            var1.setFingerprints(var2.getFingerprint());
         }

         if (var2.getLevel() != null) {
            var1.setLevel(var2.getLevel());
         }

         ISpan var4 = var2.getSpan();
         if (var1.getContexts().getTrace() == null) {
            if (var4 == null) {
               var1.getContexts().setTrace(TransactionContext.fromPropagationContext(var2.getPropagationContext()));
            } else {
               var1.getContexts().setTrace(var4.getSpanContext());
            }
         }

         var1 = this.processEvent(var1, var3, var2.getEventProcessors());
      }

      return var1;
   }

   @NotNull
   private CheckIn applyScope(@NotNull CheckIn var1, @Nullable IScope var2) {
      if (var2 != null) {
         ISpan var3 = var2.getSpan();
         if (var1.getContexts().getTrace() == null) {
            if (var3 == null) {
               var1.getContexts().setTrace(TransactionContext.fromPropagationContext(var2.getPropagationContext()));
            } else {
               var1.getContexts().setTrace(var3.getSpanContext());
            }
         }
      }

      return var1;
   }

   @NotNull
   private SentryReplayEvent applyScope(@NotNull SentryReplayEvent var1, @Nullable IScope var2) {
      if (var2 != null) {
         if (var1.getRequest() == null) {
            var1.setRequest(var2.getRequest());
         }

         if (var1.getUser() == null) {
            var1.setUser(var2.getUser());
         }

         if (var1.getTags() == null) {
            var1.setTags(new HashMap<>(var2.getTags()));
         } else {
            for (Entry var4 : var2.getTags().entrySet()) {
               if (!var1.getTags().containsKey(var4.getKey())) {
                  var1.getTags().put((String)var4.getKey(), (String)var4.getValue());
               }
            }
         }

         Contexts var6 = var1.getContexts();

         for (Entry var5 : new Contexts(var2.getContexts()).entrySet()) {
            if (!var6.containsKey(var5.getKey())) {
               var6.put((String)var5.getKey(), var5.getValue());
            }
         }

         ISpan var8 = var2.getSpan();
         if (var1.getContexts().getTrace() == null) {
            if (var8 == null) {
               var1.getContexts().setTrace(TransactionContext.fromPropagationContext(var2.getPropagationContext()));
            } else {
               var1.getContexts().setTrace(var8.getSpanContext());
            }
         }
      }

      return var1;
   }

   @NotNull
   private <T extends SentryBaseEvent> T applyScope(@NotNull T var1, @Nullable IScope var2) {
      if (var2 != null) {
         if (var1.getRequest() == null) {
            var1.setRequest(var2.getRequest());
         }

         if (var1.getUser() == null) {
            var1.setUser(var2.getUser());
         }

         if (var1.getTags() == null) {
            var1.setTags(new HashMap<>(var2.getTags()));
         } else {
            for (Entry var4 : var2.getTags().entrySet()) {
               if (!var1.getTags().containsKey(var4.getKey())) {
                  var1.getTags().put((String)var4.getKey(), (String)var4.getValue());
               }
            }
         }

         if (var1.getBreadcrumbs() == null) {
            var1.setBreadcrumbs(new ArrayList<>(var2.getBreadcrumbs()));
         } else {
            this.sortBreadcrumbsByDate(var1, var2.getBreadcrumbs());
         }

         if (var1.getExtras() == null) {
            var1.setExtras(new HashMap<>(var2.getExtras()));
         } else {
            for (Entry var8 : var2.getExtras().entrySet()) {
               if (!var1.getExtras().containsKey(var8.getKey())) {
                  var1.getExtras().put((String)var8.getKey(), var8.getValue());
               }
            }
         }

         Contexts var7 = var1.getContexts();

         for (Entry var5 : new Contexts(var2.getContexts()).entrySet()) {
            if (!var7.containsKey(var5.getKey())) {
               var7.put((String)var5.getKey(), var5.getValue());
            }
         }
      }

      return (T)var1;
   }

   private void sortBreadcrumbsByDate(@NotNull SentryBaseEvent var1, @NotNull Collection<Breadcrumb> var2) {
      List var3 = var1.getBreadcrumbs();
      if (var3 != null && !var2.isEmpty()) {
         var3.addAll(var2);
         Collections.sort(var3, this.sortBreadcrumbsByDate);
      }
   }

   @Nullable
   private SentryEvent executeBeforeSend(@NotNull SentryEvent var1, @NotNull Hint var2) {
      SentryOptions.BeforeSendCallback var3 = this.options.getBeforeSend();
      if (var3 != null) {
         try {
            var1 = var3.execute(var1, var2);
         } catch (Throwable var5) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", var5);
            var1 = null;
         }
      }

      return var1;
   }

   @Nullable
   private SentryTransaction executeBeforeSendTransaction(@NotNull SentryTransaction var1, @NotNull Hint var2) {
      SentryOptions.BeforeSendTransactionCallback var3 = this.options.getBeforeSendTransaction();
      if (var3 != null) {
         try {
            var1 = var3.execute(var1, var2);
         } catch (Throwable var5) {
            this.options
               .getLogger()
               .log(SentryLevel.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", var5);
            var1 = null;
         }
      }

      return var1;
   }

   @Nullable
   private SentryReplayEvent executeBeforeSendReplay(@NotNull SentryReplayEvent var1, @NotNull Hint var2) {
      SentryOptions.BeforeSendReplayCallback var3 = this.options.getBeforeSendReplay();
      if (var3 != null) {
         try {
            var1 = var3.execute(var1, var2);
         } catch (Throwable var5) {
            this.options
               .getLogger()
               .log(SentryLevel.ERROR, "The BeforeSendReplay callback threw an exception. It will be added as breadcrumb and continue.", var5);
            var1 = null;
         }
      }

      return var1;
   }

   @Override
   public void close() {
      this.close(false);
   }

   @Override
   public void close(boolean var1) {
      this.options.getLogger().log(SentryLevel.INFO, "Closing SentryClient.");

      try {
         this.metricsAggregator.close();
      } catch (IOException var7) {
         this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the metrics aggregator.", var7);
      }

      try {
         this.flush(var1 ? 0L : this.options.getShutdownTimeoutMillis());
         this.transport.close(var1);
      } catch (IOException var6) {
         this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", var6);
      }

      for (EventProcessor var3 : this.options.getEventProcessors()) {
         if (var3 instanceof Closeable) {
            try {
               ((Closeable)var3).close();
            } catch (IOException var5) {
               this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the event processor {}.", var3, var5);
            }
         }
      }

      this.enabled = false;
   }

   @Override
   public void flush(long var1) {
      this.transport.flush(var1);
   }

   @Nullable
   @Override
   public RateLimiter getRateLimiter() {
      return this.transport.getRateLimiter();
   }

   @Override
   public boolean isHealthy() {
      return this.transport.isHealthy();
   }

   private boolean sample() {
      Random var1 = this.options.getSampleRate() == null ? null : SentryRandom.current();
      if (this.options.getSampleRate() != null && var1 != null) {
         double var2 = this.options.getSampleRate();
         return !(var2 < var1.nextDouble());
      } else {
         return true;
      }
   }

   @NotNull
   @Override
   public IMetricsAggregator getMetricsAggregator() {
      return this.metricsAggregator;
   }

   @NotNull
   @Override
   public SentryId captureMetrics(@NotNull EncodedMetrics var1) {
      SentryEnvelopeItem var2 = SentryEnvelopeItem.fromMetrics(var1);
      SentryEnvelopeHeader var3 = new SentryEnvelopeHeader(new SentryId(), this.options.getSdkVersion(), null);
      SentryEnvelope var4 = new SentryEnvelope(var3, Collections.singleton(var2));
      SentryId var5 = this.captureEnvelope(var4);
      return var5 != null ? var5 : SentryId.EMPTY_ID;
   }

   private static final class SortBreadcrumbsByDate implements Comparator<Breadcrumb> {
      private SortBreadcrumbsByDate() {
      }

      public int compare(@NotNull Breadcrumb var1, @NotNull Breadcrumb var2) {
         return var1.getTimestamp().compareTo(var2.getTimestamp());
      }
   }
}
