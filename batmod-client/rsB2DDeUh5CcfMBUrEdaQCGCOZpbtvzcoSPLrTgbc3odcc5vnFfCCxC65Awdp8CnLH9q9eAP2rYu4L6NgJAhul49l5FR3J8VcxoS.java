public class rsB2DDeUh5CcfMBUrEdaQCGCOZpbtvzcoSPLrTgbc3odcc5vnFfCCxC65Awdp8CnLH9q9eAP2rYu4L6NgJAhul49l5FR3J8VcxoS {
   public static HTiR0ICbrKJcUn6NaW29MKQj54BwrLQYaGDASPtIsl5yVCIaq3MHvmPb7c7sLBu9nCDenGO3NlprjP8ZvTWhFloq0sUdlCueZNj0 BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0
   ) {
      int var1 = var0.Checkbox("xPos");
      int var2 = var0.Checkbox("zPos");
      HTiR0ICbrKJcUn6NaW29MKQj54BwrLQYaGDASPtIsl5yVCIaq3MHvmPb7c7sLBu9nCDenGO3NlprjP8ZvTWhFloq0sUdlCueZNj0 var3 = new HTiR0ICbrKJcUn6NaW29MKQj54BwrLQYaGDASPtIsl5yVCIaq3MHvmPb7c7sLBu9nCDenGO3NlprjP8ZvTWhFloq0sUdlCueZNj0(
         var1, var2
      );
      var3.ProgressBar = var0.TextField(
         "Blocks"
      );
      var3.Checkbox = new hJiHEWTeE7VZQBF8v6uTUZhLe0vrKDIoUd825LDJ0J6um2BgJR1YwbJxpMfUw1XP1ZPXVlIlHDaCxJynAqp2wWF6E1sH8u88w6k7(
         var0.TextField("Data"), 7
      );
      var3.Spinner = new hJiHEWTeE7VZQBF8v6uTUZhLe0vrKDIoUd825LDJ0J6um2BgJR1YwbJxpMfUw1XP1ZPXVlIlHDaCxJynAqp2wWF6E1sH8u88w6k7(
         var0.TextField("SkyLight"), 7
      );
      var3.ButtonAction = new hJiHEWTeE7VZQBF8v6uTUZhLe0vrKDIoUd825LDJ0J6um2BgJR1YwbJxpMfUw1XP1ZPXVlIlHDaCxJynAqp2wWF6E1sH8u88w6k7(
         var0.TextField("BlockLight"), 7
      );
      var3.CustomSpinner = var0.TextField(
         "HeightMap"
      );
      var3.Button = var0.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
         "TerrainPopulated"
      );
      var3.BatModProgressBar = var0.CustomSpinner(
         "Entities", 10
      );
      var3.ColorChooser = var0.CustomSpinner(
         "TileEntities", 10
      );
      var3.IntegerSpinner = var0.CustomSpinner(
         "TileTicks", 10
      );

      try {
         var3.BatModClient = var0.ProgressBar(
            "LastUpdate"
         );
      } catch (ClassCastException var5) {
         var3.BatModClient = var0.Checkbox(
            "LastUpdate"
         );
      }

      return var3;
   }

   public static void BatModClient(
      HTiR0ICbrKJcUn6NaW29MKQj54BwrLQYaGDASPtIsl5yVCIaq3MHvmPb7c7sLBu9nCDenGO3NlprjP8ZvTWhFloq0sUdlCueZNj0 var0,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1,
      pILNzvgLvLbBWKXpQKyfFwjirRDEbEwtHRF0ZnjbGGMkru4aQlS6UTsobitfDbZjdpuO1y9wPvFxzatxP3ABbZjNtPg2RuthlfMi var2
   ) {
      var1.BatModClient(
         "xPos", var0.TextField
      );
      var1.BatModClient(
         "zPos", var0.ColorTextPane
      );
      var1.BatModClient(
         "LastUpdate", var0.BatModClient
      );
      int[] var3 = new int[var0.CustomSpinner.length];

      for (int var4 = 0; var4 < var0.CustomSpinner.length; var4++) {
         var3[var4] = var0.CustomSpinner[var4];
      }

      var1.BatModClient("HeightMap", var3);
      var1.BatModClient(
         "TerrainPopulated", var0.Button
      );
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var16 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (int var5 = 0; var5 < 8; var5++) {
         boolean var6 = true;

         for (int var7 = 0; var7 < 16 && var6; var7++) {
            for (int var8 = 0; var8 < 16 && var6; var8++) {
               for (int var9 = 0; var9 < 16; var9++) {
                  int var10 = var7 << 11 | var9 << 7 | var8 + (var5 << 4);
                  byte var11 = var0.ProgressBar[var10];
                  if (var11 != 0) {
                     var6 = false;
                     break;
                  }
               }
            }
         }

         if (!var6) {
            byte[] var19 = new byte[4096];
            FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var21 = new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC();
            FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var23 = new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC();
            FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var24 = new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC();

            for (int var25 = 0; var25 < 16; var25++) {
               for (int var12 = 0; var12 < 16; var12++) {
                  for (int var13 = 0; var13 < 16; var13++) {
                     int var14 = var25 << 11 | var13 << 7 | var12 + (var5 << 4);
                     byte var15 = var0.ProgressBar[var14];
                     var19[var12 << 8 | var13 << 4 | var25] = (byte)(var15 & 0xFF);
                     var21.BatModClient(
                        var25,
                        var12,
                        var13,
                        var0.Checkbox
                           .BatModClient(
                              var25, var12 + (var5 << 4), var13
                           )
                     );
                     var23.BatModClient(
                        var25,
                        var12,
                        var13,
                        var0.Spinner
                           .BatModClient(
                              var25, var12 + (var5 << 4), var13
                           )
                     );
                     var24.BatModClient(
                        var25,
                        var12,
                        var13,
                        var0.ButtonAction
                           .BatModClient(
                              var25, var12 + (var5 << 4), var13
                           )
                     );
                  }
               }
            }

            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var26 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            var26.BatModClient("Y", (byte)(var5 & 0xFF));
            var26.BatModClient("Blocks", var19);
            var26.BatModClient(
               "Data", var21.BatModClient()
            );
            var26.BatModClient(
               "SkyLight", var23.BatModClient()
            );
            var26.BatModClient(
               "BlockLight", var24.BatModClient()
            );
            var16.BatModClient(var26);
         }
      }

      var1.BatModClient("Sections", var16);
      byte[] var17 = new byte[256];
      ylSfcWKRkKAdTzwagatDMI4oqlbFRATxQqPDJvnC4xsn2r5CgY7jERHfJfBxgspEAOCvnOSkRVNZgXroLW2VBLJuYJlwrHgVPIyS var18 = new ylSfcWKRkKAdTzwagatDMI4oqlbFRATxQqPDJvnC4xsn2r5CgY7jERHfJfBxgspEAOCvnOSkRVNZgXroLW2VBLJuYJlwrHgVPIyS();

      for (int var20 = 0; var20 < 16; var20++) {
         for (int var22 = 0; var22 < 16; var22++) {
            var18.Button(
               var0.TextField << 4 | var20,
               0,
               var0.ColorTextPane << 4 | var22
            );
            var17[var22 << 4 | var20] = (byte)(
               var2.BatModClient(
                        var18,
                        Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj
                     )
                     .BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv
                  & 0xFF
            );
         }
      }

      var1.BatModClient("Biomes", var17);
      var1.BatModClient(
         "Entities", var0.BatModProgressBar
      );
      var1.BatModClient(
         "TileEntities", var0.ColorChooser
      );
      if (var0.IntegerSpinner != null) {
         var1.BatModClient(
            "TileTicks", var0.IntegerSpinner
         );
      }
   }
}
