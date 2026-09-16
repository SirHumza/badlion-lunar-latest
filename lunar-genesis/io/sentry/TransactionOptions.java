package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

public final class TransactionOptions extends SpanOptions {
   @ApiStatus.Internal
   public static final long DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION = 30000L;
   @Nullable
   private CustomSamplingContext customSamplingContext = null;
   private boolean bindToScope = false;
   @Nullable
   private SentryDate startTimestamp = null;
   private boolean isAppStartTransaction = false;
   private boolean waitForChildren = false;
   @Nullable
   private Long idleTimeout = null;
   @Nullable
   private Long deadlineTimeout = null;
   @Nullable
   private TransactionFinishedCallback transactionFinishedCallback = null;

   @Nullable
   public CustomSamplingContext getCustomSamplingContext() {
      return this.customSamplingContext;
   }

   public void setCustomSamplingContext(@Nullable CustomSamplingContext var1) {
      this.customSamplingContext = var1;
   }

   public boolean isBindToScope() {
      return this.bindToScope;
   }

   public void setBindToScope(boolean var1) {
      this.bindToScope = var1;
   }

   @Nullable
   public SentryDate getStartTimestamp() {
      return this.startTimestamp;
   }

   public void setStartTimestamp(@Nullable SentryDate var1) {
      this.startTimestamp = var1;
   }

   public boolean isWaitForChildren() {
      return this.waitForChildren;
   }

   public void setWaitForChildren(boolean var1) {
      this.waitForChildren = var1;
   }

   @Nullable
   public Long getIdleTimeout() {
      return this.idleTimeout;
   }

   @ApiStatus.Internal
   public void setDeadlineTimeout(@Nullable Long var1) {
      this.deadlineTimeout = var1;
   }

   @ApiStatus.Internal
   @Nullable
   public Long getDeadlineTimeout() {
      return this.deadlineTimeout;
   }

   public void setIdleTimeout(@Nullable Long var1) {
      this.idleTimeout = var1;
   }

   @Nullable
   public TransactionFinishedCallback getTransactionFinishedCallback() {
      return this.transactionFinishedCallback;
   }

   public void setTransactionFinishedCallback(@Nullable TransactionFinishedCallback var1) {
      this.transactionFinishedCallback = var1;
   }

   @ApiStatus.Internal
   public void setAppStartTransaction(boolean var1) {
      this.isAppStartTransaction = var1;
   }

   @ApiStatus.Internal
   public boolean isAppStartTransaction() {
      return this.isAppStartTransaction;
   }
}
