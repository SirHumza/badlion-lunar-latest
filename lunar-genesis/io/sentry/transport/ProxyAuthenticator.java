package io.sentry.transport;

import io.sentry.util.Objects;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.Authenticator.RequestorType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ProxyAuthenticator extends Authenticator {
   @NotNull
   private final String user;
   @NotNull
   private final String password;

   ProxyAuthenticator(@NotNull String var1, @NotNull String var2) {
      this.user = Objects.requireNonNull(var1, "user is required");
      this.password = Objects.requireNonNull(var2, "password is required");
   }

   @Nullable
   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return this.getRequestorType() == RequestorType.PROXY ? new PasswordAuthentication(this.user, this.password.toCharArray()) : null;
   }

   @NotNull
   String getUser() {
      return this.user;
   }

   @NotNull
   String getPassword() {
      return this.password;
   }
}
