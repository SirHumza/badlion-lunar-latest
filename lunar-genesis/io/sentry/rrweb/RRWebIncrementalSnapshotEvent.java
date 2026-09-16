package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;

public abstract class RRWebIncrementalSnapshotEvent extends RRWebEvent {
   private RRWebIncrementalSnapshotEvent.IncrementalSource source;

   public RRWebIncrementalSnapshotEvent(@NotNull RRWebIncrementalSnapshotEvent.IncrementalSource var1) {
      super(RRWebEventType.IncrementalSnapshot);
      this.source = var1;
   }

   public RRWebIncrementalSnapshotEvent.IncrementalSource getSource() {
      return this.source;
   }

   public void setSource(RRWebIncrementalSnapshotEvent.IncrementalSource var1) {
      this.source = var1;
   }

   public static final class Deserializer {
      public boolean deserializeValue(@NotNull RRWebIncrementalSnapshotEvent var1, @NotNull String var2, @NotNull ObjectReader var3, @NotNull ILogger var4) {
         if (var2.equals("source")) {
            var1.source = Objects.requireNonNull(var3.nextOrNull(var4, new RRWebIncrementalSnapshotEvent.IncrementalSource.Deserializer()), "");
            return true;
         } else {
            return false;
         }
      }
   }

   public enum IncrementalSource implements JsonSerializable {
      Mutation,
      MouseMove,
      MouseInteraction,
      Scroll,
      ViewportResize,
      Input,
      TouchMove,
      MediaInteraction,
      StyleSheetRule,
      CanvasMutation,
      Font,
      Log,
      Drag,
      StyleDeclaration,
      Selection,
      AdoptedStyleSheet,
      CustomElement;

      @Override
      public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
         var1.value(this.ordinal());
      }

      public static final class Deserializer implements JsonDeserializer<RRWebIncrementalSnapshotEvent.IncrementalSource> {
         @NotNull
         public RRWebIncrementalSnapshotEvent.IncrementalSource deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
            return RRWebIncrementalSnapshotEvent.IncrementalSource.values()[var1.nextInt()];
         }
      }
   }

   public static final class JsonKeys {
      public static final String SOURCE = "source";
   }

   public static final class Serializer {
      public void serialize(@NotNull RRWebIncrementalSnapshotEvent var1, @NotNull ObjectWriter var2, @NotNull ILogger var3) {
         var2.name("source").value(var3, var1.source);
      }
   }
}
