package io.sentry;

import io.sentry.util.Platform;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SpotlightIntegration implements Integration, SentryOptions.BeforeEnvelopeCallback, Closeable {
   @Nullable
   private SentryOptions options;
   @NotNull
   private ILogger logger = NoOpLogger.getInstance();
   @NotNull
   private ISentryExecutorService executorService = NoOpSentryExecutorService.getInstance();

   @Override
   public void register(@NotNull IHub var1, @NotNull SentryOptions var2) {
      this.options = var2;
      this.logger = var2.getLogger();
      if (var2.getBeforeEnvelopeCallback() == null && var2.isEnableSpotlight()) {
         this.executorService = new SentryExecutorService();
         var2.setBeforeEnvelopeCallback(this);
         this.logger.log(SentryLevel.DEBUG, "SpotlightIntegration enabled.");
      } else {
         this.logger.log(SentryLevel.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.");
      }
   }

   @Override
   public void execute(@NotNull SentryEnvelope var1, @Nullable Hint var2) {
      try {
         this.executorService.submit(() -> this.sendEnvelope(var1));
      } catch (RejectedExecutionException var4) {
         this.logger.log(SentryLevel.WARNING, "Spotlight envelope submission rejected.", var4);
      }
   }

   private void sendEnvelope(@NotNull SentryEnvelope var1) {
      try {
         if (this.options == null) {
            throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
         }

         String var2 = this.getSpotlightConnectionUrl();
         HttpURLConnection var3 = this.createConnection(var2);

         try {
            OutputStream var4 = var3.getOutputStream();

            try {
               GZIPOutputStream var5 = new GZIPOutputStream(var4);

               try {
                  this.options.getSerializer().serialize(var1, var5);
               } catch (Throwable var19) {
                  try {
                     var5.close();
                  } catch (Throwable var18) {
                     var19.addSuppressed(var18);
                  }

                  throw var19;
               }

               var5.close();
            } catch (Throwable var20) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var17) {
                     var20.addSuppressed(var17);
                  }
               }

               throw var20;
            }

            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var21) {
            this.logger.log(SentryLevel.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", var21);
         } finally {
            int var9 = var3.getResponseCode();
            this.logger.log(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", var9);
            this.closeAndDisconnect(var3);
         }
      } catch (Exception var23) {
         this.logger.log(SentryLevel.ERROR, "An exception occurred while creating the connection to spotlight.", var23);
      }
   }

   @TestOnly
   public String getSpotlightConnectionUrl() {
      if (this.options != null && this.options.getSpotlightConnectionUrl() != null) {
         return this.options.getSpotlightConnectionUrl();
      } else {
         return Platform.isAndroid() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
      }
   }

   @NotNull
   private HttpURLConnection createConnection(@NotNull String var1) {
      HttpURLConnection var2 = (HttpURLConnection)URI.create(var1).toURL().openConnection();
      var2.setReadTimeout(1000);
      var2.setConnectTimeout(1000);
      var2.setRequestMethod("POST");
      var2.setDoOutput(true);
      var2.setRequestProperty("Content-Encoding", "gzip");
      var2.setRequestProperty("Content-Type", "application/x-sentry-envelope");
      var2.setRequestProperty("Accept", "application/json");
      var2.setRequestProperty("Connection", "close");
      var2.connect();
      return var2;
   }

   private void closeAndDisconnect(@NotNull HttpURLConnection var1) {
      try {
         var1.getInputStream().close();
      } catch (IOException var6) {
      } finally {
         var1.disconnect();
      }
   }

   @Override
   public void close() {
      this.executorService.close(0L);
      if (this.options != null && this.options.getBeforeEnvelopeCallback() == this) {
         this.options.setBeforeEnvelopeCallback(null);
      }
   }
}
