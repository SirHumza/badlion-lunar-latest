package io.sentry;

import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SamplingContext {
   @NotNull
   private final TransactionContext transactionContext;
   @Nullable
   private final CustomSamplingContext customSamplingContext;

   public SamplingContext(@NotNull TransactionContext var1, @Nullable CustomSamplingContext var2) {
      this.transactionContext = Objects.requireNonNull(var1, "transactionContexts is required");
      this.customSamplingContext = var2;
   }

   @Nullable
   public CustomSamplingContext getCustomSamplingContext() {
      return this.customSamplingContext;
   }

   @NotNull
   public TransactionContext getTransactionContext() {
      return this.transactionContext;
   }
}
