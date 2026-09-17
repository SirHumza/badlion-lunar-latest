import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class GuUPWm4ymjlr2nIZGZQa7mjKUA9VobqydTxlBkchoSPSqjknI4A8QCCkErXVlE4rVR7igSUihs9Qc19bgXzKsh2H3lJ9S1jCh5aF {
   public static final String BatModClient = "http://s.optifine.net";
   public static final String Button = "http://optifine.net";

   public static byte[] BatModClient(String var0) {
      HttpURLConnection var1 = null;

      byte[] var2;
      try {
         URL var3 = new URL(var0);
         var1 = (HttpURLConnection)var3.openConnection(
            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
         );
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();
         if (var1.getResponseCode() / 100 != 2) {
            if (var1.getErrorStream() != null) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
                  var1.getErrorStream()
               );
            }

            throw new IOException("HTTP response: " + var1.getResponseCode());
         }

         InputStream var4 = var1.getInputStream();
         byte[] var5 = new byte[var1.getContentLength()];
         int var6 = 0;

         do {
            int var7 = var4.read(var5, var6, var5.length - var6);
            if (var7 < 0) {
               throw new IOException("Input stream closed: " + var0);
            }

            var6 += var7;
         } while (var6 < var5.length);

         var2 = var5;
      } finally {
         if (var1 != null) {
            var1.disconnect();
         }
      }

      return var2;
   }

   public static String BatModClient(String var0, Map var1, byte[] var2) {
      HttpURLConnection var3 = null;

      String var4;
      try {
         URL var5 = new URL(var0);
         var3 = (HttpURLConnection)var5.openConnection(
            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
         );
         var3.setRequestMethod("POST");
         if (var1 != null) {
            for (Object var7 : var1.keySet()) {
               String var8 = "" + var1.get(var7);
               var3.setRequestProperty((String)var7, var8);
            }
         }

         var3.setRequestProperty("Content-Type", "text/plain");
         var3.setRequestProperty("Content-Length", "" + var2.length);
         var3.setRequestProperty("Content-Language", "en-US");
         var3.setUseCaches(false);
         var3.setDoInput(true);
         var3.setDoOutput(true);
         OutputStream var15 = var3.getOutputStream();
         var15.write(var2);
         var15.flush();
         var15.close();
         InputStream var16 = var3.getInputStream();
         InputStreamReader var17 = new InputStreamReader(var16, "ASCII");
         BufferedReader var9 = new BufferedReader(var17);
         StringBuffer var10 = new StringBuffer();

         String var11;
         while ((var11 = var9.readLine()) != null) {
            var10.append(var11);
            var10.append('\r');
         }

         var9.close();
         var4 = var10.toString();
      } finally {
         if (var3 != null) {
            var3.disconnect();
         }
      }

      return var4;
   }
}
