package io.sentry.clientreport;

import io.sentry.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
final class ClientReportKey {
   @NotNull
   private final String reason;
   @NotNull
   private final String category;

   ClientReportKey(@NotNull String var1, @NotNull String var2) {
      this.reason = var1;
      this.category = var2;
   }

   @NotNull
   public String getReason() {
      return this.reason;
   }

   @NotNull
   public String getCategory() {
      return this.category;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ClientReportKey)) {
         return false;
      }

      ClientReportKey var2 = (ClientReportKey)var1;
      return Objects.equals(this.getReason(), var2.getReason()) && Objects.equals(this.getCategory(), var2.getCategory());
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.getReason(), this.getCategory());
   }
}
