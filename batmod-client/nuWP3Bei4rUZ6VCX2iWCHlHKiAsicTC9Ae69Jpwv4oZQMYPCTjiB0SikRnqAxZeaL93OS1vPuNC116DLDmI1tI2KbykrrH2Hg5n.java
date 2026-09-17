import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n {
   public static final String BatModClient = "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0";

   public static String BatModClient(HttpResponse var0) {
      if (var0.getEntity() != null && var0.getEntity().getContent() != null) {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(var0.getEntity().getContent(), StandardCharsets.UTF_8));
         StringBuilder var2 = new StringBuilder();

         String var3;
         while ((var3 = var1.readLine()) != null) {
            var2.append(var3);
            var2.append("\n");
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static void BatModClient(
      String var0, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var1
   ) {
      BatModClient(var0, null, var1);
   }

   public static void BatModClient(
      String var0, JsonObject var1, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var2
   ) {
      HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn.Button(
         () -> {
            try {
               var2.call(BatModClient(var0, var1));
            } catch (IOException var4) {
               BatModJson.Button(
                  "Could not fetch: " + var0
               );
            }
         }
      );
   }

   public static String BatModClient(String var0) {
      return BatModClient(
         CustomSpinner(var0, null)
      );
   }

   public static String BatModClient(String var0, JsonObject var1) {
      return BatModClient(
         CustomSpinner(var0, var1)
      );
   }

   public static void Button(
      String var0, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var1
   ) {
      Button(var0, null, var1);
   }

   public static void Button(
      String var0, JsonObject var1, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var2
   ) {
      BatModClient(var0, var1, (JsonObject)null, var2);
   }

   public static void BatModClient(
      String var0, JsonObject var1, JsonObject var2, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var3
   ) {
      HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn.Button(
         () -> {
            try {
               var3.call(BatModClient(var0, var1, var2));
            } catch (IOException var5) {
               BatModJson.Button(
                  "Could not fetch: " + var0
               );
            }
         }
      );
   }

   public static JsonElement Button(String var0) {
      return Button(var0, (JsonObject)null);
   }

   public static JsonElement Button(String var0, JsonObject var1) {
      return BatModClient(var0, var1, (JsonObject)null);
   }

   public static JsonElement BatModClient(
      String var0, JsonObject var1, JsonObject var2
   ) {
      return new JsonParser()
         .parse(
            BatModClient(
               Button(var0, var1, var2)
            )
         );
   }

   public static HttpResponse CustomSpinner(String var0) {
      return CustomSpinner(var0, null);
   }

   public static HttpResponse CustomSpinner(String var0, JsonObject var1) {
      return Button(var0, var1, (JsonObject)null);
   }

   public static HttpResponse Button(
      String var0, JsonObject var1, JsonObject var2
   ) {
      if (var2 != null) {
         var0 = var0 + BatModClient(var2);
      }

      CloseableHttpClient var3 = HttpClients.createDefault();
      HttpGet var4 = new HttpGet(var0);
      if (var1 != null) {
         for (Entry var6 : var1.entrySet()) {
            var4.setHeader((String)var6.getKey(), ((JsonElement)var6.getValue()).toString().replace("\"", ""));
         }
      }

      var4.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
      return var3.execute(var4);
   }

   public static void CustomSpinner(
      String var0, JsonObject var1, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var2
   ) {
      BatModClient(
         var0, var1, null, ContentType.APPLICATION_FORM_URLENCODED, var2
      );
   }

   public static void BatModClient(
      String var0, JsonObject var1, ContentType var2, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var3
   ) {
      BatModClient(var0, var1, null, var2, var3);
   }

   public static void Button(
      String var0, JsonObject var1, JsonObject var2, QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var3
   ) {
      BatModClient(
         var0, var1, var2, ContentType.APPLICATION_FORM_URLENCODED, var3
      );
   }

   public static void BatModClient(
      String var0,
      JsonObject var1,
      JsonObject var2,
      ContentType var3,
      QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var4
   ) {
      HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn.Button(
         () -> {
            try {
               var4.call(BatModClient(var0, var1, var2, var3));
            } catch (IOException var6) {
               BatModJson.Button(
                  "Could not fetch: " + var0
               );
            }
         }
      );
   }

   public static HttpResponse ButtonAction(String var0, JsonObject var1) {
      return BatModClient(
         var0, var1, null, ContentType.APPLICATION_FORM_URLENCODED
      );
   }

   public static HttpResponse BatModClient(
      String var0, JsonObject var1, ContentType var2
   ) {
      return BatModClient(var0, var1, null, var2);
   }

   public static HttpResponse CustomSpinner(
      String var0, JsonObject var1, JsonObject var2
   ) {
      return BatModClient(
         var0, var1, var2, ContentType.APPLICATION_FORM_URLENCODED
      );
   }

   public static HttpResponse BatModClient(
      String var0, JsonObject var1, JsonObject var2, ContentType var3
   ) {
      CloseableHttpClient var4 = HttpClients.createDefault();
      HttpPost var5 = new HttpPost(var0);
      if (var1 != null) {
         for (Entry var7 : var1.entrySet()) {
            var5.setHeader((String)var7.getKey(), ((JsonElement)var7.getValue()).toString().replace("\"", ""));
         }
      }

      if (var2 != null) {
         if (var3 == ContentType.APPLICATION_FORM_URLENCODED) {
            var5.setEntity(
               new StringEntity(BatModClient(var2).substring(1), var3)
            );
         } else if (var3 == ContentType.APPLICATION_JSON) {
            var5.setEntity(new StringEntity(var2.toString(), var3));
         }
      }

      var5.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
      return var4.execute(var5);
   }

   public static String BatModClient(JsonObject var0) {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : var0.entrySet()) {
         var1.append(var1.length() > 0 ? "&" : "?");
         var1.append((String)var3.getKey()).append("=").append(((JsonElement)var3.getValue()).toString().replace("\"", ""));
      }

      return var1.toString();
   }

   public static Map ButtonAction(String var0) {
      try {
         HashMap var1 = new HashMap();
         String[] var2 = var0.split("\\?");
         if (var2.length > 1) {
            String var3 = var2[1];

            for (String var7 : var3.split("&")) {
               String[] var8 = var7.split("=");
               String var9 = URLDecoder.decode(var8[0], "UTF-8");
               String var10 = "";
               if (var8.length > 1) {
                  var10 = URLDecoder.decode(var8[1], "UTF-8");
               }

               List var11 = var1.computeIfAbsent(var9, var0x -> new ArrayList());
               var11.add(var10);
            }
         }

         return var1;
      } catch (UnsupportedEncodingException var12) {
         throw new AssertionError(var12);
      }
   }
}
