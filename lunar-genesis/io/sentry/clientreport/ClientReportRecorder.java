package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.DateUtils;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ClientReportRecorder implements IClientReportRecorder {
   @NotNull
   private final IClientReportStorage storage;
   @NotNull
   private final SentryOptions options;

   public ClientReportRecorder(@NotNull SentryOptions var1) {
      this.options = var1;
      this.storage = new AtomicClientReportStorage();
   }

   @NotNull
   @Override
   public SentryEnvelope attachReportToEnvelope(@NotNull SentryEnvelope var1) {
      ClientReport var2 = this.resetCountsAndGenerateClientReport();
      if (var2 == null) {
         return var1;
      }

      try {
         this.options.getLogger().log(SentryLevel.DEBUG, "Attaching client report to envelope.");
         ArrayList var3 = new ArrayList();

         for (SentryEnvelopeItem var5 : var1.getItems()) {
            var3.add(var5);
         }

         var3.add(SentryEnvelopeItem.fromClientReport(this.options.getSerializer(), var2));
         return new SentryEnvelope(var1.getHeader(), var3);
      } catch (Throwable var6) {
         this.options.getLogger().log(SentryLevel.ERROR, var6, "Unable to attach client report to envelope.");
         return var1;
      }
   }

   @Override
   public void recordLostEnvelope(@NotNull DiscardReason var1, @Nullable SentryEnvelope var2) {
      if (var2 != null) {
         try {
            for (SentryEnvelopeItem var4 : var2.getItems()) {
               this.recordLostEnvelopeItem(var1, var4);
            }
         } catch (Throwable var5) {
            this.options.getLogger().log(SentryLevel.ERROR, var5, "Unable to record lost envelope.");
         }
      }
   }

   @Override
   public void recordLostEnvelopeItem(@NotNull DiscardReason var1, @Nullable SentryEnvelopeItem var2) {
      if (var2 != null) {
         try {
            SentryItemType var3 = var2.getHeader().getType();
            if (SentryItemType.ClientReport.equals(var3)) {
               try {
                  ClientReport var4 = var2.getClientReport(this.options.getSerializer());
                  this.restoreCountsFromClientReport(var4);
               } catch (Exception var7) {
                  this.options.getLogger().log(SentryLevel.ERROR, "Unable to restore counts from previous client report.");
               }
            } else {
               DataCategory var9 = this.categoryFromItemType(var3);
               if (var9.equals(DataCategory.Transaction)) {
                  SentryTransaction var5 = var2.getTransaction(this.options.getSerializer());
                  if (var5 != null) {
                     List var6 = var5.getSpans();
                     this.recordLostEventInternal(var1.getReason(), DataCategory.Span.getCategory(), var6.size() + 1L);
                  }
               }

               this.recordLostEventInternal(var1.getReason(), var9.getCategory(), 1L);
            }
         } catch (Throwable var8) {
            this.options.getLogger().log(SentryLevel.ERROR, var8, "Unable to record lost envelope item.");
         }
      }
   }

   @Override
   public void recordLostEvent(@NotNull DiscardReason var1, @NotNull DataCategory var2) {
      this.recordLostEvent(var1, var2, 1L);
   }

   @Override
   public void recordLostEvent(@NotNull DiscardReason var1, @NotNull DataCategory var2, long var3) {
      try {
         this.recordLostEventInternal(var1.getReason(), var2.getCategory(), var3);
      } catch (Throwable var6) {
         this.options.getLogger().log(SentryLevel.ERROR, var6, "Unable to record lost event.");
      }
   }

   private void recordLostEventInternal(@NotNull String var1, @NotNull String var2, @NotNull Long var3) {
      ClientReportKey var4 = new ClientReportKey(var1, var2);
      this.storage.addCount(var4, var3);
   }

   @Nullable
   ClientReport resetCountsAndGenerateClientReport() {
      Date var1 = DateUtils.getCurrentDateTime();
      List var2 = this.storage.resetCountsAndGet();
      return var2.isEmpty() ? null : new ClientReport(var1, var2);
   }

   private void restoreCountsFromClientReport(@Nullable ClientReport var1) {
      if (var1 != null) {
         for (DiscardedEvent var3 : var1.getDiscardedEvents()) {
            this.recordLostEventInternal(var3.getReason(), var3.getCategory(), var3.getQuantity());
         }
      }
   }

   private DataCategory categoryFromItemType(SentryItemType var1) {
      if (SentryItemType.Event.equals(var1)) {
         return DataCategory.Error;
      } else if (SentryItemType.Session.equals(var1)) {
         return DataCategory.Session;
      } else if (SentryItemType.Transaction.equals(var1)) {
         return DataCategory.Transaction;
      } else if (SentryItemType.UserFeedback.equals(var1)) {
         return DataCategory.UserReport;
      } else if (SentryItemType.Profile.equals(var1)) {
         return DataCategory.Profile;
      } else if (SentryItemType.Statsd.equals(var1)) {
         return DataCategory.MetricBucket;
      } else if (SentryItemType.Attachment.equals(var1)) {
         return DataCategory.Attachment;
      } else if (SentryItemType.CheckIn.equals(var1)) {
         return DataCategory.Monitor;
      } else {
         return SentryItemType.ReplayVideo.equals(var1) ? DataCategory.Replay : DataCategory.Default;
      }
   }
}
