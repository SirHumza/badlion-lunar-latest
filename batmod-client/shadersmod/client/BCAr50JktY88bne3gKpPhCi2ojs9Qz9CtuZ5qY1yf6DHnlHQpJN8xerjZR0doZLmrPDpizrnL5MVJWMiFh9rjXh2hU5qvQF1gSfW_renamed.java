package shadersmod.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Button {
   private static shadersmod.client.BatModClient[][] BatModClient = (shadersmod.client.BatModClient[][])null;

   public static int BatModClient(int var0, int var1) {
      if (BatModClient == null) {
         return var0;
      }

      if (var0 >= 0 && var0 < BatModClient.length) {
         shadersmod.client.BatModClient[] var2 = BatModClient[var0];
         if (var2 == null) {
            return var0;
         }

         for (int var3 = 0; var3 < var2.length; var3++) {
            shadersmod.client.BatModClient var4 = var2[var3];
            if (var4.BatModClient(var0, var1)) {
               return var4.BatModClient();
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static void BatModClient(
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var0
   ) {
      BatModClient();
      String var1 = "/shaders/block.properties";

      try {
         InputStream var2 = var0.BatModClient(var1);
         if (var2 == null) {
            return;
         }

         ItUocnb3mBtOF3Fvd87YtWlM9qriD2buTI6LZwbobQytrYrfs9NmlL8Vt8BBDyqn2ShOjqOBXnbAG8lQ33xoYSx81GChEFxCC3w3 var3 = new ItUocnb3mBtOF3Fvd87YtWlM9qriD2buTI6LZwbobQytrYrfs9NmlL8Vt8BBDyqn2ShOjqOBXnbAG8lQ33xoYSx81GChEFxCC3w3();
         var3.load(var2);
         var2.close();
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            "[Shaders] Parsing block mappings: " + var1
         );
         ArrayList var4 = new ArrayList();
         dCwDAAXl6wq2u1wZDfNeMusgX51e7h45lpzpVPSImSau0fbkor33y4akJwhNR7XmSHxqVZ9mp4GAK97bNNg2AOvnXpyl9t672Jo7 var5 = new dCwDAAXl6wq2u1wZDfNeMusgX51e7h45lpzpVPSImSau0fbkor33y4akJwhNR7XmSHxqVZ9mp4GAK97bNNg2AOvnXpyl9t672Jo7(
            "Shaders"
         );

         for (Object var7 : var3.keySet()) {
            String var8 = (String)var7;
            String var9 = var3.getProperty(var8);
            String var10 = "block.";
            if (!var8.startsWith(var10)) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                  "[Shaders] Invalid block ID: " + var8
               );
            } else {
               String var11 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
                  var8, var10
               );
               int var12 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                  var11, -1
               );
               if (var12 < 0) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Invalid block ID: " + var8
                  );
               } else {
                  Umd3g6jjuX9LQ0mgFholTA8SrXI9yt2Xf8JgsaV6ASACwTjY2rWb0Rv2DTNvoOWn2MjziKhWqaqOP8OFj0wysjWuowgbHAqkPZEu[] var13 = var5.CustomSpinner(
                     var9
                  );
                  if (var13 != null && var13.length >= 1) {
                     shadersmod.client.BatModClient var14 = new shadersmod.client.BatModClient(
                        var12, var13
                     );
                     BatModClient(var4, var14);
                  } else {
                     xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                        "[Shaders] Invalid block ID mapping: " + var8 + "=" + var9
                     );
                  }
               }
            }
         }

         if (var4.size() <= 0) {
            return;
         }

         BatModClient = BatModClient(
            var4
         );
      } catch (IOException var15) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "[Shaders] Error reading: " + var1
         );
      }
   }

   private static void BatModClient(
      List var0, shadersmod.client.BatModClient var1
   ) {
      int[] var2 = var1.Button();

      for (int var3 = 0; var3 < var2.length; var3++) {
         int var4 = var2[var3];

         while (var4 >= var0.size()) {
            var0.add(null);
         }

         List var5 = (List)var0.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            var0.set(var4, var5);
         }

         var5.add(var1);
      }
   }

   private static shadersmod.client.BatModClient[][] BatModClient(
      List var0
   ) {
      shadersmod.client.BatModClient[][] var1 = new shadersmod.client.BatModClient[var0.size()][];

      for (int var2 = 0; var2 < var1.length; var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            var1[var2] = var3.toArray(
               new shadersmod.client.BatModClient[var3.size()]
            );
         }
      }

      return var1;
   }

   public static void BatModClient() {
      BatModClient = (shadersmod.client.BatModClient[][])null;
   }
}
