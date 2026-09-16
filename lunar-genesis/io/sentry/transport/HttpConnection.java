package io.sentry.transport;

import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

final class HttpConnection {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   @Nullable
   private final Proxy proxy;
   @NotNull
   private final RequestDetails requestDetails;
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final RateLimiter rateLimiter;

   public HttpConnection(@NotNull SentryOptions var1, @NotNull RequestDetails var2, @NotNull RateLimiter var3) {
      this(var1, var2, AuthenticatorWrapper.getInstance(), var3);
   }

   HttpConnection(@NotNull SentryOptions var1, @NotNull RequestDetails var2, @NotNull AuthenticatorWrapper var3, @NotNull RateLimiter var4) {
      this.requestDetails = var2;
      this.options = var1;
      this.rateLimiter = var4;
      this.proxy = this.resolveProxy(var1.getProxy());
      if (this.proxy != null && var1.getProxy() != null) {
         String var5 = var1.getProxy().getUser();
         String var6 = var1.getProxy().getPass();
         if (var5 != null && var6 != null) {
            var3.setDefault(new ProxyAuthenticator(var5, var6));
         }
      }
   }

   @Nullable
   private Proxy resolveProxy(@Nullable SentryOptions.Proxy var1) {
      Proxy var2 = null;
      if (var1 != null) {
         String var3 = var1.getPort();
         String var4 = var1.getHost();
         if (var3 != null && var4 != null) {
            try {
               Type var5;
               if (var1.getType() != null) {
                  var5 = var1.getType();
               } else {
                  var5 = Type.HTTP;
               }

               InetSocketAddress var6 = new InetSocketAddress(var4, Integer.parseInt(var3));
               var2 = new Proxy(var5, var6);
            } catch (NumberFormatException var7) {
               this.options.getLogger().log(SentryLevel.ERROR, var7, "Failed to parse Sentry Proxy port: " + var1.getPort() + ". Proxy is ignored");
            }
         }
      }

      return var2;
   }

   @NotNull
   HttpURLConnection open() {
      return (HttpURLConnection)(this.proxy == null ? this.requestDetails.getUrl().openConnection() : this.requestDetails.getUrl().openConnection(this.proxy));
   }

   @NotNull
   private HttpURLConnection createConnection() {
      HttpURLConnection var1 = this.open();

      for (Entry var3 : this.requestDetails.getHeaders().entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

      var1.setRequestMethod("POST");
      var1.setDoOutput(true);
      var1.setRequestProperty("Content-Encoding", "gzip");
      var1.setRequestProperty("Content-Type", "application/x-sentry-envelope");
      var1.setRequestProperty("Accept", "application/json");
      var1.setRequestProperty("Connection", "close");
      var1.setConnectTimeout(this.options.getConnectionTimeoutMillis());
      var1.setReadTimeout(this.options.getReadTimeoutMillis());
      SSLSocketFactory var4 = this.options.getSslSocketFactory();
      if (var1 instanceof HttpsURLConnection && var4 != null) {
         ((HttpsURLConnection)var1).setSSLSocketFactory(var4);
      }

      var1.connect();
      return var1;
   }

   @NotNull
   public TransportResult send(@NotNull SentryEnvelope var1) {
      HttpURLConnection var2 = this.createConnection();

      try {
         OutputStream var4 = var2.getOutputStream();

         try {
            GZIPOutputStream var5 = new GZIPOutputStream(var4);

            try {
               this.options.getSerializer().serialize(var1, var5);
            } catch (Throwable var17) {
               try {
                  var5.close();
               } catch (Throwable var16) {
                  var17.addSuppressed(var16);
               }

               throw var17;
            }

            var5.close();
         } catch (Throwable var18) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var15) {
                  var18.addSuppressed(var15);
               }
            }

            throw var18;
         }

         if (var4 != null) {
            var4.close();
         }
      } catch (Throwable var19) {
         this.options.getLogger().log(SentryLevel.ERROR, var19, "An exception occurred while submitting the envelope to the Sentry server.");
      } finally {
         TransportResult var3 = this.readAndLog(var2);
      }

      Object var21;
      return (TransportResult)var21;
   }

   @NotNull
   private TransportResult readAndLog(@NotNull HttpURLConnection var1) {
      try {
         int var2 = var1.getResponseCode();
         this.updateRetryAfterLimits(var1, var2);
         if (!this.isSuccessfulResponseCode(var2)) {
            this.options.getLogger().log(SentryLevel.ERROR, "Request failed, API returned %s", var2);
            if (this.options.isDebug()) {
               String var3 = this.getErrorMessageFromStream(var1);
               this.options.getLogger().log(SentryLevel.ERROR, "%s", var3);
            }

            return TransportResult.error(var2);
         }

         this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.");
         return TransportResult.success();
      } catch (IOException var7) {
         this.options.getLogger().log(SentryLevel.ERROR, var7, "Error reading and logging the response stream");
      } finally {
         this.closeAndDisconnect(var1);
      }

      return TransportResult.error();
   }

   public void updateRetryAfterLimits(@NotNull HttpURLConnection var1, int var2) {
      String var3 = var1.getHeaderField("Retry-After");
      String var4 = var1.getHeaderField("X-Sentry-Rate-Limits");
      this.rateLimiter.updateRetryAfterLimits(var4, var3, var2);
   }

   private void closeAndDisconnect(@NotNull HttpURLConnection var1) {
      try {
         var1.getInputStream().close();
      } catch (IOException var6) {
      } finally {
         var1.disconnect();
      }
   }

   @NotNull
   private String getErrorMessageFromStream(@NotNull HttpURLConnection var1) {
      try {
         InputStream var2 = var1.getErrorStream();

         String var7;
         try {
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2, UTF_8));

            try {
               StringBuilder var4 = new StringBuilder();

               String var5;
               for (boolean var6 = true; (var5 = var3.readLine()) != null; var6 = false) {
                  if (!var6) {
                     var4.append("\n");
                  }

                  var4.append(var5);
               }

               var7 = var4.toString();
            } catch (Throwable var10) {
               try {
                  var3.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }

               throw var10;
            }

            var3.close();
         } catch (Throwable var11) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var8) {
                  var11.addSuppressed(var8);
               }
            }

            throw var11;
         }

         if (var2 != null) {
            var2.close();
         }

         return var7;
      } catch (IOException var12) {
         return "Failed to obtain error message while analyzing send failure.";
      }
   }

   private boolean isSuccessfulResponseCode(int var1) {
      return var1 == 200;
   }

   @TestOnly
   @Nullable
   Proxy getProxy() {
      return this.proxy;
   }
}
