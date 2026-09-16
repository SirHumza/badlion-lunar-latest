package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface TransactionFinishedCallback {
   void execute(@NotNull ITransaction var1);
}
