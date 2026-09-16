package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public interface IMemoryCollector {
   @Nullable
   MemoryCollectionData collect();
}
