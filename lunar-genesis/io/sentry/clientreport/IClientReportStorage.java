package io.sentry.clientreport;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public interface IClientReportStorage {
   void addCount(ClientReportKey var1, Long var2);

   List<DiscardedEvent> resetCountsAndGet();
}
