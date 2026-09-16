package com.lunarclient.apollo.api;

import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.api.request.DownloadFileRequest;
import com.lunarclient.apollo.api.response.DownloadFileResponse;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.async.future.UncertainFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.Nullable;

public final class ApolloHttpManager {
   private final ExecutorService requestExecutor = Executors.newSingleThreadExecutor();

   public <T extends ApiResponse> Future<T> request(ApiRequest<T> var1) {
      UncertainFuture var2 = new UncertainFuture();
      ApiRequestType var3 = var1.getType();
      Type var4 = var1.getResponseType();
      this.requestExecutor.submit(() -> {
         try {
            URL var4x = new URL("https://" + var1.getService().getUrl() + var1.getRoute());
            HttpURLConnection var5 = (HttpURLConnection)var4x.openConnection();
            var5.setRequestProperty("Content-Type", "application/json");
            var5.setRequestMethod(var3.name());
            var5.setConnectTimeout(5000);
            var5.setReadTimeout(5000);

            try {
               if (var3 == ApiRequestType.POST) {
                  var5.setDoOutput(true);

                  try (OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream())) {
                     ApolloManager.GSON.toJson(var1, var6);
                  }
               }

               int var86 = var5.getResponseCode();
               if (var86 != 200) {
                  StringBuilder var89 = new StringBuilder();

                  String var88;
                  try (BufferedReader var91 = new BufferedReader(new InputStreamReader(var5.getErrorStream()))) {
                     while ((var88 = var91.readLine()) != null) {
                        var89.append(var88);
                     }
                  }

                  var2.handleFailure(new Throwable(String.format("Failed to send %s with output %s", var4.getTypeName(), var89)));
                  return;
               }

               String var8;
               ApiResponse var87;
               try (BufferedReader var9 = new BufferedReader(new InputStreamReader(var5.getInputStream()))) {
                  var8 = var9.readLine();
                  var87 = ApolloManager.GSON.fromJson(var8, var4);
               }

               if (var87 != null) {
                  var2.handleSuccess(var87);
                  return;
               }

               Throwable var90 = new Throwable(String.format("Failed to parse %s with output %s", var4.getTypeName(), var8));
               var2.handleFailure(var90);
            } catch (IOException var83) {
               if (!(var83 instanceof UnknownHostException)) {
                  handleError("Failed to parse request!", var83, var1);
                  return;
               }

               return;
            } finally {
               var5.disconnect();
            }
         } catch (Throwable var85) {
            if (!(var85 instanceof UnknownHostException)) {
               handleError("Failed to open connection!", var85, var1);
            }
         }
      });
      return var2;
   }

   public Future<DownloadFileResponse> download(DownloadFileRequest var1) {
      UncertainFuture var2 = new UncertainFuture();
      String var3 = var1.getUrl();
      this.requestExecutor.submit(() -> {
         try {
            InputStream var3x = new URL(var3).openStream();
            Files.copy(var3x, var1.getTarget(), StandardCopyOption.REPLACE_EXISTING);
            var2.handleSuccess(new DownloadFileResponse());
         } catch (Throwable var4) {
            var2.handleFailure(new Throwable(String.format("Failed to download file %s", var3)));
            var4.printStackTrace();
         }
      });
      return var2;
   }

   public static void handleError(String var0, Throwable var1, @Nullable ApiRequest<?> var2) {
      Logger var3 = Apollo.getPlatform().getPlatformLogger();
      if (var2 == null) {
         var3.log(Level.SEVERE, var0, var1);
      } else {
         var3.severe(var0);
         var3.log(Level.SEVERE, String.format("%s (%s) [%s]: %s", var2.getClass().getSimpleName(), var2.getRoute(), var2.getType(), var2), var1);
      }
   }
}
