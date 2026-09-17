package com.lunarclient.apollo.roundtrip;

import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Range;

public class ApolloRequest<T extends ApolloResponse> {
   public static final long TIMEOUT = 5000L;
   private final UUID requestId = UUID.randomUUID();
   private final @Range(from = 0L, to = Long.MAX_VALUE) long sentTime = System.currentTimeMillis();

   public long getTimeoutMillis() {
      return 5000L;
   }

   @Generated
   public long getSentTime() {
      return this.sentTime;
   }

   @Generated
   public UUID getRequestId() {
      return this.requestId;
   }
}
