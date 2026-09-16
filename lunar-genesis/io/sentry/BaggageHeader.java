package io.sentry;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class BaggageHeader {
   @NotNull
   public static final String BAGGAGE_HEADER = "baggage";
   @NotNull
   private final String value;

   @Nullable
   public static BaggageHeader fromBaggageAndOutgoingHeader(@NotNull Baggage var0, @Nullable List<String> var1) {
      Baggage var2 = Baggage.fromHeader(var1, true, var0.logger);
      String var3 = var0.toHeaderString(var2.getThirdPartyHeader());
      return var3.isEmpty() ? null : new BaggageHeader(var3);
   }

   public BaggageHeader(@NotNull String var1) {
      this.value = var1;
   }

   @NotNull
   public String getName() {
      return "baggage";
   }

   @NotNull
   public String getValue() {
      return this.value;
   }
}
