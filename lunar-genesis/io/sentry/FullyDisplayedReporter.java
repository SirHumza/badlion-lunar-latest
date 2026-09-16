package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class FullyDisplayedReporter {
   @NotNull
   private static final FullyDisplayedReporter instance = new FullyDisplayedReporter();
   @NotNull
   private final List<FullyDisplayedReporter.FullyDisplayedReporterListener> listeners = new CopyOnWriteArrayList<>();

   private FullyDisplayedReporter() {
   }

   @NotNull
   public static FullyDisplayedReporter getInstance() {
      return instance;
   }

   public void registerFullyDrawnListener(@NotNull FullyDisplayedReporter.FullyDisplayedReporterListener var1) {
      this.listeners.add(var1);
   }

   public void reportFullyDrawn() {
      Iterator var1 = this.listeners.iterator();
      this.listeners.clear();

      while (var1.hasNext()) {
         ((FullyDisplayedReporter.FullyDisplayedReporterListener)var1.next()).onFullyDrawn();
      }
   }

   @ApiStatus.Internal
   public interface FullyDisplayedReporterListener {
      void onFullyDrawn();
   }
}
