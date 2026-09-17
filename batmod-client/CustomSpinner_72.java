import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ShNpyhA6rWALqAsYlXl7y1cJoZmQVixsS7aogTBXQNpQTboTiSYy04UkJVtvbW0aZKxB3zScvzjgAVvr3oBcv0zg2p93m5qN4X2A {
   public static Properties BatModClient(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var0
   ) {
      String var1 = var0.Button();
      Properties var2 = new Properties();
      String var3 = ".png";
      if (!var1.endsWith(var3)) {
         return var2;
      }

      String var4 = var1.substring(0, var1.length() - var3.length()) + ".properties";

      try {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
            var0.CustomSpinner(), var4
         );
         InputStream var6 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(),
            var5
         );
         if (var6 == null) {
            return var2;
         }

         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ButtonAction(
            "Loading " + var4
         );
         var2.load(var6);
      } catch (FileNotFoundException var7) {
      } catch (IOException var8) {
         var8.printStackTrace();
      }

      return var2;
   }

   public static void BatModClient(Properties var0, float[] var1) {
      for (Object var3 : var0.keySet()) {
         String var4 = (String)var3;
         String var5 = "width.";
         if (var4.startsWith(var5)) {
            String var6 = var4.substring(var5.length());
            int var7 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               var6, -1
            );
            if (var7 >= 0 && var7 < var1.length) {
               String var8 = var0.getProperty(var4);
               float var9 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                  var8, -1.0F
               );
               if (var9 >= 0.0F) {
                  var1[var7] = var9;
               }
            }
         }
      }
   }

   public static float BatModClient(
      Properties var0, String var1, float var2
   ) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         float var4 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var3, Float.MIN_VALUE
         );
         if (var4 == Float.MIN_VALUE) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid value for " + var1 + ": " + var3
            );
            return var2;
         } else {
            return var4;
         }
      }
   }

   public static p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD Button(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var0
   ) {
      if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW()
         )
       {
         return var0;
      }

      if (var0 == null) {
         return var0;
      }

      String var1 = var0.Button();
      String var2 = "textures/";
      String var3 = "mcpatcher/";
      if (!var1.startsWith(var2)) {
         return var0;
      }

      var1 = var1.substring(var2.length());
      var1 = var3 + var1;
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var4 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var0.CustomSpinner(), var1
      );
      return xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(),
            var4
         )
         ? var4
         : var0;
   }
}
