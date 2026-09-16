package io.sentry;

import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

final class RequestDetailsResolver {
   private static final String USER_AGENT = "User-Agent";
   private static final String SENTRY_AUTH = "X-Sentry-Auth";
   @NotNull
   private final SentryOptions options;

   public RequestDetailsResolver(@NotNull SentryOptions var1) {
      this.options = Objects.requireNonNull(var1, "options is required");
   }

   @NotNull
   RequestDetails resolve() {
      Dsn var1 = this.options.retrieveParsedDsn();
      URI var2 = var1.getSentryUri();
      String var3 = var2.resolve(var2.getPath() + "/envelope/").toString();
      String var4 = var1.getPublicKey();
      String var5 = var1.getSecretKey();
      String var6 = "Sentry sentry_version=7,sentry_client="
         + this.options.getSentryClientName()
         + ",sentry_key="
         + var4
         + (var5 != null && var5.length() > 0 ? ",sentry_secret=" + var5 : "");
      String var7 = this.options.getSentryClientName();
      HashMap var8 = new HashMap();
      var8.put("User-Agent", var7);
      var8.put("X-Sentry-Auth", var6);
      return new RequestDetails(var3, var8);
   }
}
