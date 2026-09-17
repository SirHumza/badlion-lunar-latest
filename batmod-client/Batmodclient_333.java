import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ThuXyhn53FyQiu1vn10BDJeqKFHS7yTe0rQwrFOGdNMCaW96rETSBsMNE8IJyVFB9hEQu6R51C2FrbhizUlicPrnPVZIMNosm2zZ {
   private String ButtonAction = null;
   public static final String BatModClient = "items";
   public static final String Button = "type";
   public static final String CustomSpinner = "active";

   public ThuXyhn53FyQiu1vn10BDJeqKFHS7yTe0rQwrFOGdNMCaW96rETSBsMNE8IJyVFB9hEQu6R51C2FrbhizUlicPrnPVZIMNosm2zZ(String var1) {
      this.ButtonAction = var1;
   }

   public iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7 BatModClient(
      JsonElement var1
   ) {
      if (var1 == null) {
         throw new JsonParseException(
            "JSON object is null, player: " + this.ButtonAction
         );
      }

      JsonObject var2 = (JsonObject)var1;
      iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7 var3 = new iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7();
      JsonArray var4 = (JsonArray)var2.get("items");
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            JsonObject var6 = (JsonObject)var4.get(var5);
            boolean var7 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
               var6, "active", true
            );
            if (var7) {
               String var8 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
                  var6, "type"
               );
               if (var8 == null) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "Item type is null, player: " + this.ButtonAction
                  );
               } else {
                  String var9 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
                     var6, "model"
                  );
                  if (var9 == null) {
                     var9 = "items/" + var8 + "/model.cfg";
                  }

                  F5Fxq7djvstYgSRcTf3OuTSPndiILGcmglS92PpOgZrvlWIHvBVSOR4jwLBwUZPLGGRlx8dO7EPXq48BhgkvFcbJnLxnyCaSTVSN var10 = this.Button(
                     var9
                  );
                  if (var10 != null) {
                     if (!var10.ButtonAction()) {
                        String var11 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
                           var6, "texture"
                        );
                        if (var11 == null) {
                           var11 = "items/"
                              + var8
                              + "/users/"
                              + this.ButtonAction
                              + ".png";
                        }

                        BufferedImage var12 = this.BatModClient(var11);
                        if (var12 == null) {
                           continue;
                        }

                        var10.BatModClient(var12);
                        p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var13 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                           "optifine.net", var11
                        );
                        var10.BatModClient(var13);
                     }

                     var3.BatModClient(var10);
                  }
               }
            }
         }
      }

      return var3;
   }

   private BufferedImage BatModClient(String var1) {
      String var2 = "http://s.optifine.net/" + var1;

      try {
         byte[] var3 = QdFJdTbsip6sIUUjRRAxFKmfwHsbVLWFqIqv1LERwxDfHgbwWeoBHKL8QicPuCXNemGR7PbVM6eJYir41Ezbn2tAWBjpFSeaRDch.Button(
            var2,
            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
         );
         return ImageIO.read(new ByteArrayInputStream(var3));
      } catch (IOException var5) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Error loading item texture " + var1 + ": " + var5.getClass().getName() + ": " + var5.getMessage()
         );
         return null;
      }
   }

   private F5Fxq7djvstYgSRcTf3OuTSPndiILGcmglS92PpOgZrvlWIHvBVSOR4jwLBwUZPLGGRlx8dO7EPXq48BhgkvFcbJnLxnyCaSTVSN Button(
      String var1
   ) {
      String var2 = "http://s.optifine.net/" + var1;

      try {
         byte[] var3 = QdFJdTbsip6sIUUjRRAxFKmfwHsbVLWFqIqv1LERwxDfHgbwWeoBHKL8QicPuCXNemGR7PbVM6eJYir41Ezbn2tAWBjpFSeaRDch.Button(
            var2,
            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
         );
         String var4 = new String(var3, "ASCII");
         JsonParser var5 = new JsonParser();
         JsonObject var6 = (JsonObject)var5.parse(var4);
         new necTxSslRIC0LgqOCIha96RjBpZFogxFxbxp3m5XTC7YCqJlg9ndqZIVmvOWMFj6woicu8JRg7DW8TuHyqou1Z9lHRBqrvB0WsQ1();
         return necTxSslRIC0LgqOCIha96RjBpZFogxFxbxp3m5XTC7YCqJlg9ndqZIVmvOWMFj6woicu8JRg7DW8TuHyqou1Z9lHRBqrvB0WsQ1.BatModClient(
            var6
         );
      } catch (Exception var9) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Error loading item model " + var1 + ": " + var9.getClass().getName() + ": " + var9.getMessage()
         );
         return null;
      }
   }
}
