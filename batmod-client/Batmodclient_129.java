import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JsoLQPnXZ20wJEYR3yWRvRpvmxBF3Q7KIrG0csQclsXKVSHkzSrNFF0mtFU9jLWLP564Ipxg4QGafmmtpRHPdn8N2X9pTf2TFEYy
   implements sy5C3QyPppsIEJzXaDkHD0QrWe5XeGnq8z4a40jxlbm5GKMznTY9NLBptOFhHyi0JEvON63B2oak917dPs2T2KZJEkYPtBhldxP,
   xgpbwxfSWg5zurxDBddfJxTd11emu2LZXoNqVWqy5q4i2qYRAggyTUXBWPzlkkny80zxYQDCdwsNqIV88fVxivfrTcWrc1rTjEgB {
   private static final Logger BatModClient = LogManager.getLogger();
   private Map Button = new ConcurrentHashMap();
   private Set CustomSpinner = Collections.newSetFromMap(
      new ConcurrentHashMap()
   );
   private final File ButtonAction;
   private boolean Spinner = false;

   public JsoLQPnXZ20wJEYR3yWRvRpvmxBF3Q7KIrG0csQclsXKVSHkzSrNFF0mtFU9jLWLP564Ipxg4QGafmmtpRHPdn8N2X9pTf2TFEYy(File var1) {
      this.ButtonAction = var1;
   }

   @Override
   public WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1, int var2, int var3
   ) {
      mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH var4 = new mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH(
         var2, var3
      );
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var5 = (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)this.Button
         .get(var4);
      if (var5 == null) {
         DataInputStream var6 = s7aw3BgQtB16AmUgFqDhhy7VB275d1ymeOHxaMA7xFNrhBmt6x4lkiDss6JfxkabFaGgdaKwIUQIrkDmWDPztZyns1OJSnqQAbwR.Button(
            this.ButtonAction, var2, var3
         );
         if (var6 == null) {
            return null;
         }

         var5 = CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
            var6
         );
      }

      return this.BatModClient(var1, var2, var3, var5);
   }

   protected WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      int var2,
      int var3,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4
   ) {
      if (!var4.Button("Level", 10)) {
         BatModClient.error(
            "Chunk file at " + var2 + "," + var3 + " is missing level data, skipping"
         );
         return null;
      }

      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var5 = var4.BatModInstallerMain(
         "Level"
      );
      if (!var5.Button("Sections", 9)) {
         BatModClient.error(
            "Chunk file at " + var2 + "," + var3 + " is missing block data, skipping"
         );
         return null;
      }

      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var6 = this.BatModClient(
         var1, var5
      );
      if (!var6.BatModClient(var2, var3)) {
         BatModClient.error(
            "Chunk file at "
               + var2
               + ","
               + var3
               + " is in the wrong location; relocating. (Expected "
               + var2
               + ", "
               + var3
               + ", got "
               + var6.BatModClient
               + ", "
               + var6.Button
               + ")"
         );
         var5.BatModClient("xPos", var2);
         var5.BatModClient("zPos", var3);
         var6 = this.BatModClient(var1, var5);
      }

      return var6;
   }

   @Override
   public void BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var2
   ) {
      var1.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();

      try {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         var3.BatModClient("Level", var4);
         this.BatModClient(var2, var1, var4);
         this.BatModClient(
            var2.IntegerSpinner(), var3
         );
      } catch (Exception var5) {
         BatModClient.error("Failed to save chunk", var5);
      }
   }

   protected void BatModClient(
      mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2
   ) {
      if (!this.CustomSpinner.contains(var1)) {
         this.Button.put(var1, var2);
      }

      YTF3a6xWDCJ6LsfRxXBlyCu8p3BqL6Codgnk6f0G4dwPyHEhDfSTRqdiWVKymsKXfQpA4h6gnaI2fPM5q4Yh165kf6d9oW41Jodb.BatModClient()
         .BatModClient(this);
   }

   @Override
   public boolean BatModClient() {
      if (this.Button.isEmpty()) {
         if (this.Spinner) {
            BatModClient.info(
               "ThreadedAnvilChunkStorage ({}): All chunks are saved",
               new Object[]{this.ButtonAction.getName()}
            );
         }

         return false;
      } else {
         mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH var1 = (mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH)this.Button
            .keySet()
            .iterator()
            .next();

         boolean var2;
         try {
            this.CustomSpinner.add(var1);
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)this.Button
               .remove(var1);
            if (var3 != null) {
               try {
                  this.Button(var1, var3);
               } catch (Exception var8) {
                  BatModClient.error("Failed to save chunk", var8);
               }
            }

            var2 = true;
         } finally {
            this.CustomSpinner.remove(var1);
         }

         return var2;
      }
   }

   private void Button(
      mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2
   ) {
      DataOutputStream var3 = s7aw3BgQtB16AmUgFqDhhy7VB275d1ymeOHxaMA7xFNrhBmt6x4lkiDss6JfxkabFaGgdaKwIUQIrkDmWDPztZyns1OJSnqQAbwR.CustomSpinner(
         this.ButtonAction,
         var1.BatModClient,
         var1.Button
      );
      CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
         var2, var3
      );
      var3.close();
   }

   @Override
   public void Button(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var2
   ) {
   }

   @Override
   public void Button() {
   }

   @Override
   public void CustomSpinner() {
      try {
         this.Spinner = true;

         while (true) {
            if (this.BatModClient()) {
            }
         }
      } finally {
         this.Spinner = false;
      }
   }

   private void BatModClient(
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3
   ) {
      var3.BatModClient("V", (byte)1);
      var3.BatModClient(
         "xPos", var1.BatModClient
      );
      var3.BatModClient(
         "zPos", var1.Button
      );
      var3.BatModClient(
         "LastUpdate", var2.BatModJson()
      );
      var3.BatModClient(
         "HeightMap", var1.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF()
      );
      var3.BatModClient(
         "TerrainPopulated", var1.Downloader()
      );
      var3.BatModClient(
         "LightPopulated", var1.InstallationLogger()
      );
      var3.BatModClient(
         "InhabitedTime", var1.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY()
      );
      JzObFYEf6Cd7jszpi2nk8oyAwLtbXSBdvHKSk81h3e8z2NLufdyrRSUy8QDlZ7mrMey9LsawQeANEHMyah0sxwlzRqg2UK2l6Nrp[] var4 = var1.Button();
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var5 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();
      boolean var6 = !var2.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN();

      for (JzObFYEf6Cd7jszpi2nk8oyAwLtbXSBdvHKSk81h3e8z2NLufdyrRSUy8QDlZ7mrMey9LsawQeANEHMyah0sxwlzRqg2UK2l6Nrp var10 : var4) {
         if (var10 != null) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var11 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            var11.BatModClient(
               "Y", (byte)(var10.CustomSpinner() >> 4 & 0xFF)
            );
            byte[] var12 = new byte[var10.Spinner().length];
            FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var13 = new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC();
            FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var14 = null;

            for (int var15 = 0;
               var15 < var10.Spinner().length;
               var15++
            ) {
               char var16 = var10.Spinner()[var15];
               int var17 = var15 & 15;
               int var18 = var15 >> 8 & 15;
               int var19 = var15 >> 4 & 15;
               if (var16 >> '\f' != 0) {
                  if (var14 == null) {
                     var14 = new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC();
                  }

                  var14.BatModClient(var17, var18, var19, var16 >> '\f');
               }

               var12[var15] = (byte)(var16 >> 4 & 0xFF);
               var13.BatModClient(var17, var18, var19, var16 & 15);
            }

            var11.BatModClient("Blocks", var12);
            var11.BatModClient(
               "Data", var13.BatModClient()
            );
            if (var14 != null) {
               var11.BatModClient(
                  "Add", var14.BatModClient()
               );
            }

            var11.BatModClient(
               "BlockLight",
               var10.Checkbox()
                  .BatModClient()
            );
            if (var6) {
               var11.BatModClient(
                  "SkyLight",
                  var10.ProgressBar()
                     .BatModClient()
               );
            } else {
               var11.BatModClient(
                  "SkyLight",
                  new byte[var10.Checkbox()
                     .BatModClient().length]
               );
            }

            var5.BatModClient(var11);
         }
      }

      var3.BatModClient("Sections", var5);
      var3.BatModClient(
         "Biomes", var1.TextField()
      );
      var1.ProgressBar(false);
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var20 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (int var21 = 0; var21 < var1.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB().length; var21++) {
         for (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var26 : var1.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()[var21]) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var29 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            if (var26.ButtonAction(var29)) {
               var1.ProgressBar(true);
               var20.BatModClient(var29);
            }
         }
      }

      var3.BatModClient("Entities", var20);
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var22 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var27 : var1.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ()
         .values()) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var30 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         var27.Button(var30);
         var22.BatModClient(var30);
      }

      var3.BatModClient("TileEntities", var22);
      List var25 = var2.BatModClient(var1, false);
      if (var25 != null) {
         long var28 = var2.BatModJson();
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var31 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

         for (c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC var33 : var25) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var34 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var35 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient
               .Button(
                  var33.BatModClient()
               );
            var34.BatModClient(
               "i", var35 == null ? "" : var35.toString()
            );
            var34.BatModClient(
               "x",
               var33.BatModClient
                  .BatModProgressBar()
            );
            var34.BatModClient(
               "y",
               var33.BatModClient
                  .ColorChooser()
            );
            var34.BatModClient(
               "z",
               var33.BatModClient
                  .IntegerSpinner()
            );
            var34.BatModClient(
               "t", (int)(var33.Button - var28)
            );
            var34.BatModClient(
               "p", var33.CustomSpinner
            );
            var31.BatModClient(var34);
         }

         var3.BatModClient("TileTicks", var31);
      }
   }

   private WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2
   ) {
      int var3 = var2.Checkbox("xPos");
      int var4 = var2.Checkbox("zPos");
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var5 = new WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj(
         var1, var3, var4
      );
      var5.BatModClient(
         var2.ColorTextPane("HeightMap")
      );
      var5.ButtonAction(
         var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("TerrainPopulated")
      );
      var5.Spinner(
         var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("LightPopulated")
      );
      var5.CustomSpinner(
         var2.ProgressBar("InhabitedTime")
      );
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var6 = var2.CustomSpinner(
         "Sections", 10
      );
      byte var7 = 16;
      JzObFYEf6Cd7jszpi2nk8oyAwLtbXSBdvHKSk81h3e8z2NLufdyrRSUy8QDlZ7mrMey9LsawQeANEHMyah0sxwlzRqg2UK2l6Nrp[] var8 = new JzObFYEf6Cd7jszpi2nk8oyAwLtbXSBdvHKSk81h3e8z2NLufdyrRSUy8QDlZ7mrMey9LsawQeANEHMyah0sxwlzRqg2UK2l6Nrp[var7];
      boolean var9 = !var1.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN();

      for (int var10 = 0; var10 < var6.Spinner(); var10++) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var11 = var6.Button(
            var10
         );
         byte var12 = var11.ButtonAction("Y");
         JzObFYEf6Cd7jszpi2nk8oyAwLtbXSBdvHKSk81h3e8z2NLufdyrRSUy8QDlZ7mrMey9LsawQeANEHMyah0sxwlzRqg2UK2l6Nrp var13 = new JzObFYEf6Cd7jszpi2nk8oyAwLtbXSBdvHKSk81h3e8z2NLufdyrRSUy8QDlZ7mrMey9LsawQeANEHMyah0sxwlzRqg2UK2l6Nrp(
            var12 << 4, var9
         );
         byte[] var14 = var11.TextField("Blocks");
         FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var15 = new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC(
            var11.TextField("Data")
         );
         FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC var16 = var11.Button(
               "Add", 7
            )
            ? new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC(
               var11.TextField("Add")
            )
            : null;
         char[] var17 = new char[var14.length];

         for (int var18 = 0; var18 < var17.length; var18++) {
            int var19 = var18 & 15;
            int var20 = var18 >> 8 & 15;
            int var21 = var18 >> 4 & 15;
            int var22 = var16 != null
               ? var16.BatModClient(var19, var20, var21)
               : 0;
            var17[var18] = (char)(
               var22 << 12
                  | (var14[var18] & 255) << 4
                  | var15.BatModClient(var19, var20, var21)
            );
         }

         var13.BatModClient(var17);
         var13.BatModClient(
            new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC(
               var11.TextField("BlockLight")
            )
         );
         if (var9) {
            var13.Button(
               new FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC(
                  var11.TextField("SkyLight")
               )
            );
         }

         var13.ButtonAction();
         var8[var12] = var13;
      }

      var5.BatModClient(var8);
      if (var2.Button("Biomes", 7)) {
         var5.BatModClient(
            var2.TextField("Biomes")
         );
      }

      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var23 = var2.CustomSpinner(
         "Entities", 10
      );
      if (var23 != null) {
         for (int var24 = 0; var24 < var23.Spinner(); var24++) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var26 = var23.Button(
               var24
            );
            Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var29 = hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.BatModClient(
               var26, var1
            );
            var5.ProgressBar(true);
            if (var29 != null) {
               var5.BatModClient(var29);
               Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var32 = var29;

               for (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var35 = var26;
                  var35.Button("Riding", 10);
                  var35 = var35.BatModInstallerMain("Riding")
               ) {
                  Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var37 = hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.BatModClient(
                     var35.BatModInstallerMain("Riding"), var1
                  );
                  if (var37 != null) {
                     var5.BatModClient(var37);
                     var32.BatModClient(var37);
                  }

                  var32 = var37;
               }
            }
         }
      }

      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var25 = var2.CustomSpinner(
         "TileEntities", 10
      );
      if (var25 != null) {
         for (int var27 = 0; var27 < var25.Spinner(); var27++) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var30 = var25.Button(
               var27
            );
            gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var33 = gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI.CustomSpinner(
               var30
            );
            if (var33 != null) {
               var5.BatModClient(var33);
            }
         }
      }

      if (var2.Button("TileTicks", 9)) {
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var28 = var2.CustomSpinner(
            "TileTicks", 10
         );
         if (var28 != null) {
            for (int var31 = 0; var31 < var28.Spinner(); var31++) {
               YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var34 = var28.Button(
                  var31
               );
               c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var36;
               if (var34.Button("i", 8)) {
                  var36 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
                     var34.IntegerSpinner("i")
                  );
               } else {
                  var36 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
                     var34.Checkbox("i")
                  );
               }

               var1.Button(
                  new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                     var34.Checkbox("x"),
                     var34.Checkbox("y"),
                     var34.Checkbox("z")
                  ),
                  var36,
                  var34.Checkbox("t"),
                  var34.Checkbox("p")
               );
            }
         }
      }

      return var5;
   }
}
