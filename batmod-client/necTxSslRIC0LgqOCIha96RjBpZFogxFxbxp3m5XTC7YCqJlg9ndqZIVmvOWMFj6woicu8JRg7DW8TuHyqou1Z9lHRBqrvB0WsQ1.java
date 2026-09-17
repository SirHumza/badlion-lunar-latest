import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class necTxSslRIC0LgqOCIha96RjBpZFogxFxbxp3m5XTC7YCqJlg9ndqZIVmvOWMFj6woicu8JRg7DW8TuHyqou1Z9lHRBqrvB0WsQ1 {
   private static JsonParser K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = new JsonParser();
   public static final String BatModClient = "type";
   public static final String Button = "textureSize";
   public static final String CustomSpinner = "usePlayerTexture";
   public static final String ButtonAction = "models";
   public static final String Spinner = "id";
   public static final String Checkbox = "baseId";
   public static final String ProgressBar = "type";
   public static final String BatModProgressBar = "attachTo";
   public static final String ColorChooser = "invertAxis";
   public static final String IntegerSpinner = "mirrorTexture";
   public static final String TextField = "translate";
   public static final String ColorTextPane = "rotate";
   public static final String BatModInstallerMain = "scale";
   public static final String aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = "boxes";
   public static final String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = "sprites";
   public static final String G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = "submodel";
   public static final String iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = "submodels";
   public static final String bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = "textureOffset";
   public static final String RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = "coordinates";
   public static final String Downloader = "sizeAdd";
   public static final String InstallationLogger = "PlayerItem";
   public static final String RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = "ModelBox";

   public static F5Fxq7djvstYgSRcTf3OuTSPndiILGcmglS92PpOgZrvlWIHvBVSOR4jwLBwUZPLGGRlx8dO7EPXq48BhgkvFcbJnLxnyCaSTVSN BatModClient(
      JsonObject var0
   ) {
      String var1 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
         var0, "type"
      );
      if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         (Object)var1, (Object)"PlayerItem"
      )) {
         throw new JsonParseException("Unknown model type: " + var1);
      }

      int[] var2 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.Button(
         var0.get("textureSize"), 2
      );
      BatModClient(var2, "Missing texture size");
      Dimension var3 = new Dimension(var2[0], var2[1]);
      boolean var4 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
         var0, "usePlayerTexture", false
      );
      JsonArray var5 = (JsonArray)var0.get("models");
      BatModClient(var5, "Missing elements");
      HashMap var6 = new HashMap();
      ArrayList var7 = new ArrayList();
      new ArrayList();

      for (int var8 = 0; var8 < var5.size(); var8++) {
         JsonObject var9 = (JsonObject)var5.get(var8);
         String var10 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
            var9, "baseId"
         );
         if (var10 != null) {
            JsonObject var11 = (JsonObject)var6.get(var10);
            if (var11 == null) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                  "BaseID not found: " + var10
               );
               continue;
            }

            for (Entry var13 : var11.entrySet()) {
               if (!var9.has((String)var13.getKey())) {
                  var9.add((String)var13.getKey(), (JsonElement)var13.getValue());
               }
            }
         }

         String var15 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
            var9, "id"
         );
         if (var15 != null) {
            if (!var6.containsKey(var15)) {
               var6.put(var15, var9);
            } else {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                  "Duplicate model ID: " + var15
               );
            }
         }

         WrdqhdT15oav9wqPJAztcuilhwhSccBnaj5vKeZwkcGpFsGVvmhJAQ6qBc1W8m6KVKnuhzIV1XmNvwTvmKRn05S98XHTV25lPbCd var16 = BatModClient(
            var9, var3
         );
         if (var16 != null) {
            var7.add(var16);
         }
      }

      WrdqhdT15oav9wqPJAztcuilhwhSccBnaj5vKeZwkcGpFsGVvmhJAQ6qBc1W8m6KVKnuhzIV1XmNvwTvmKRn05S98XHTV25lPbCd[] var14 = var7.toArray(
         new WrdqhdT15oav9wqPJAztcuilhwhSccBnaj5vKeZwkcGpFsGVvmhJAQ6qBc1W8m6KVKnuhzIV1XmNvwTvmKRn05S98XHTV25lPbCd[var7.size()]
      );
      return new F5Fxq7djvstYgSRcTf3OuTSPndiILGcmglS92PpOgZrvlWIHvBVSOR4jwLBwUZPLGGRlx8dO7EPXq48BhgkvFcbJnLxnyCaSTVSN(var3, var4, var14);
   }

   private static void BatModClient(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   private static p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient(
      String var0
   ) {
      int var1 = var0.indexOf(58);
      if (var1 < 0) {
         return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(var0);
      }

      String var2 = var0.substring(0, var1);
      String var3 = var0.substring(var1 + 1);
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(var2, var3);
   }

   private static int Button(String var0) {
      if (var0 == null) {
         return 0;
      }

      if (var0.equals("body")) {
         return 0;
      }

      if (var0.equals("head")) {
         return 1;
      }

      if (var0.equals("leftArm")) {
         return 2;
      }

      if (var0.equals("rightArm")) {
         return 3;
      }

      if (var0.equals("leftLeg")) {
         return 4;
      }

      if (var0.equals("rightLeg")) {
         return 5;
      }

      if (var0.equals("cape")) {
         return 6;
      }

      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
         "Unknown attachModel: " + var0
      );
      return 0;
   }

   private static WrdqhdT15oav9wqPJAztcuilhwhSccBnaj5vKeZwkcGpFsGVvmhJAQ6qBc1W8m6KVKnuhzIV1XmNvwTvmKRn05S98XHTV25lPbCd BatModClient(
      JsonObject var0, Dimension var1
   ) {
      String var2 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
         var0, "type"
      );
      if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         (Object)var2, (Object)"ModelBox"
      )) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Unknown model type: " + var2
         );
         return null;
      } else {
         String var3 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
            var0, "attachTo"
         );
         int var4 = Button(var3);
         float var5 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
            var0, "scale", 1.0F
         );
         AOWSWvOLqOtMYgaet5x8uqCumJeLPsOjcMBzKCh9eKbclOS8yBMR5CbSkRqCitQS8XhccetpKivG2hQG71Esw1MIyWze94ZZuPo3 var6 = new AOWSWvOLqOtMYgaet5x8uqCumJeLPsOjcMBzKCh9eKbclOS8yBMR5CbSkRqCitQS8XhccetpKivG2hQG71Esw1MIyWze94ZZuPo3();
         var6.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = var1.width;
         var6.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = var1.height;
         orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ var7 = BatModClient(
            var0, var6
         );
         return new WrdqhdT15oav9wqPJAztcuilhwhSccBnaj5vKeZwkcGpFsGVvmhJAQ6qBc1W8m6KVKnuhzIV1XmNvwTvmKRn05S98XHTV25lPbCd(var4, var5, var7);
      }
   }

   private static orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ BatModClient(
      JsonObject var0, rCD7WGVYuaDgkyxX5HnTPZPTl19Au1ut70AdWgxLRpbXE7ztuHEXpeI54o8dhdIBdD70MCu42UtZceYA5L1de2Hp9uJ6TulRBQwY var1
   ) {
      orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ var2 = new orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ(
         var1
      );
      String var3 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
            var0, "invertAxis", ""
         )
         .toLowerCase();
      boolean var4 = var3.contains("x");
      boolean var5 = var3.contains("y");
      boolean var6 = var3.contains("z");
      float[] var7 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
         var0.get("translate"), 3, new float[3]
      );
      if (var4) {
         var7[0] = -var7[0];
      }

      if (var5) {
         var7[1] = -var7[1];
      }

      if (var6) {
         var7[2] = -var7[2];
      }

      float[] var8 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
         var0.get("rotate"), 3, new float[3]
      );

      for (int var9 = 0; var9 < var8.length; var9++) {
         var8[var9] = var8[var9] / 180.0F * (float) Math.PI;
      }

      if (var4) {
         var8[0] = -var8[0];
      }

      if (var5) {
         var8[1] = -var8[1];
      }

      if (var6) {
         var8[2] = -var8[2];
      }

      var2.BatModClient(var7[0], var7[1], var7[2]);
      var2.BatModProgressBar = var8[0];
      var2.ColorChooser = var8[1];
      var2.IntegerSpinner = var8[2];
      String var19 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
            var0, "mirrorTexture", ""
         )
         .toLowerCase();
      boolean var10 = var19.contains("u");
      boolean var11 = var19.contains("v");
      if (var10) {
         var2.TextField = true;
      }

      if (var11) {
         var2.InstallationLogger = true;
      }

      JsonArray var12 = var0.getAsJsonArray("boxes");
      if (var12 != null) {
         for (int var13 = 0; var13 < var12.size(); var13++) {
            JsonObject var14 = var12.get(var13).getAsJsonObject();
            int[] var15 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.Button(
               var14.get("textureOffset"), 2
            );
            if (var15 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var16 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
               var14.get("coordinates"), 6
            );
            if (var16 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var4) {
               var16[0] = -var16[0] - var16[3];
            }

            if (var5) {
               var16[1] = -var16[1] - var16[4];
            }

            if (var6) {
               var16[2] = -var16[2] - var16[5];
            }

            float var17 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
               var14, "sizeAdd", 0.0F
            );
            var2.BatModClient(var15[0], var15[1]);
            var2.BatModClient(
               var16[0], var16[1], var16[2], (int)var16[3], (int)var16[4], (int)var16[5], var17
            );
         }
      }

      JsonArray var20 = var0.getAsJsonArray("sprites");
      if (var20 != null) {
         for (int var21 = 0; var21 < var20.size(); var21++) {
            JsonObject var23 = var20.get(var21).getAsJsonObject();
            int[] var26 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.Button(
               var23.get("textureOffset"), 2
            );
            if (var26 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var28 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
               var23.get("coordinates"), 6
            );
            if (var28 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var4) {
               var28[0] = -var28[0] - var28[3];
            }

            if (var5) {
               var28[1] = -var28[1] - var28[4];
            }

            if (var6) {
               var28[2] = -var28[2] - var28[5];
            }

            float var18 = OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI.BatModClient(
               var23, "sizeAdd", 0.0F
            );
            var2.BatModClient(var26[0], var26[1]);
            var2.Button(
               var28[0], var28[1], var28[2], (int)var28[3], (int)var28[4], (int)var28[5], var18
            );
         }
      }

      JsonObject var22 = (JsonObject)var0.get("submodel");
      if (var22 != null) {
         orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ var24 = BatModClient(
            var22, var1
         );
         var2.BatModClient(var24);
      }

      JsonArray var25 = (JsonArray)var0.get("submodels");
      if (var25 != null) {
         for (int var27 = 0; var27 < var25.size(); var27++) {
            JsonObject var29 = (JsonObject)var25.get(var27);
            orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ var30 = BatModClient(
               var29, var1
            );
            var2.BatModClient(var30);
         }
      }

      return var2;
   }
}
