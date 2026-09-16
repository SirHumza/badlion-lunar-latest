package io.sentry;

import io.sentry.util.Objects;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class Dsn {
   @NotNull
   private final String projectId;
   @Nullable
   private final String path;
   @Nullable
   private final String secretKey;
   @NotNull
   private final String publicKey;
   @NotNull
   private final URI sentryUri;

   @NotNull
   public String getProjectId() {
      return this.projectId;
   }

   @Nullable
   public String getPath() {
      return this.path;
   }

   @Nullable
   public String getSecretKey() {
      return this.secretKey;
   }

   @NotNull
   public String getPublicKey() {
      return this.publicKey;
   }

   @NotNull
   URI getSentryUri() {
      return this.sentryUri;
   }

   Dsn(@Nullable String var1) {
      try {
         Objects.requireNonNull(var1, "The DSN is required.");
         URI var2 = new URI(var1).normalize();
         String var3 = var2.getScheme();
         if (!"http".equalsIgnoreCase(var3) && !"https".equalsIgnoreCase(var3)) {
            throw new IllegalArgumentException("Invalid DSN scheme: " + var3);
         }

         String var4 = var2.getUserInfo();
         if (var4 != null && !var4.isEmpty()) {
            String[] var5 = var4.split(":", -1);
            this.publicKey = var5[0];
            if (this.publicKey != null && !this.publicKey.isEmpty()) {
               this.secretKey = var5.length > 1 ? var5[1] : null;
               String var6 = var2.getPath();
               if (var6.endsWith("/")) {
                  var6 = var6.substring(0, var6.length() - 1);
               }

               int var7 = var6.lastIndexOf("/") + 1;
               String var8 = var6.substring(0, var7);
               if (!var8.endsWith("/")) {
                  var8 = var8 + "/";
               }

               this.path = var8;
               this.projectId = var6.substring(var7);
               if (this.projectId.isEmpty()) {
                  throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
               }

               this.sentryUri = new URI(var3, null, var2.getHost(), var2.getPort(), var8 + "api/" + this.projectId, null, null);
            } else {
               throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
         } else {
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
         }
      } catch (Throwable var9) {
         throw new IllegalArgumentException(var9);
      }
   }
}
