import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class wp17RUSTFSrpab6wLPpMGlvADv1leJqVyusXSgqHA4lBtde1uUoqnPVH8mI9NDqXkaqbjTOctNyAeio01XfVHVHxrdEueDo8d31G {
   private static final Logger BatModClient = LogManager.getLogger();
   private static Map Button = Maps.newHashMap();
   private static Map CustomSpinner = Maps.newHashMap();
   private static Map ButtonAction = Maps.newHashMap();
   private static Map Spinner = Maps.newHashMap();

   private static void Button(Class var0, String var1) {
      Button.put(var1, var0);
      CustomSpinner.put(var0, var1);
   }

   static void BatModClient(Class var0, String var1) {
      ButtonAction.put(var1, var0);
      Spinner.put(var0, var1);
   }

   public static String BatModClient(
      lmGpsHWfgruU6R0D9ud0H5Jp2r9xkezQ8UkI9FCTC83XJ7VxWqi0MyTqquqseEc7buI8NDQigAt0sAauOiFXoiCCZ13l7ZRiEMA7 var0
   ) {
      return (String)CustomSpinner.get(var0.getClass());
   }

   public static String BatModClient(
      KCdrkA63YhnRraqSAws7gkxCys1y3ePF1IrSmiJ5tkgPmwtlhLLWBhA4ovJ61fgp97eJeAA7RYKpI8NehcV0EWNoy2jqC6i30u18 var0
   ) {
      return (String)Spinner.get(var0.getClass());
   }

   public static lmGpsHWfgruU6R0D9ud0H5Jp2r9xkezQ8UkI9FCTC83XJ7VxWqi0MyTqquqseEc7buI8NDQigAt0sAauOiFXoiCCZ13l7ZRiEMA7 BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      lmGpsHWfgruU6R0D9ud0H5Jp2r9xkezQ8UkI9FCTC83XJ7VxWqi0MyTqquqseEc7buI8NDQigAt0sAauOiFXoiCCZ13l7ZRiEMA7 var2 = null;

      try {
         Class var3 = (Class)Button.get(
            var0.IntegerSpinner("id")
         );
         if (var3 != null) {
            var2 = (lmGpsHWfgruU6R0D9ud0H5Jp2r9xkezQ8UkI9FCTC83XJ7VxWqi0MyTqquqseEc7buI8NDQigAt0sAauOiFXoiCCZ13l7ZRiEMA7)var3.newInstance();
         }
      } catch (Exception var4) {
         BatModClient.warn(
            "Failed Start with id " + var0.IntegerSpinner("id")
         );
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.BatModClient(var1, var0);
      } else {
         BatModClient.warn(
            "Skipping Structure with id " + var0.IntegerSpinner("id")
         );
      }

      return var2;
   }

   public static KCdrkA63YhnRraqSAws7gkxCys1y3ePF1IrSmiJ5tkgPmwtlhLLWBhA4ovJ61fgp97eJeAA7RYKpI8NehcV0EWNoy2jqC6i30u18 Button(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1
   ) {
      KCdrkA63YhnRraqSAws7gkxCys1y3ePF1IrSmiJ5tkgPmwtlhLLWBhA4ovJ61fgp97eJeAA7RYKpI8NehcV0EWNoy2jqC6i30u18 var2 = null;

      try {
         Class var3 = (Class)ButtonAction.get(
            var0.IntegerSpinner("id")
         );
         if (var3 != null) {
            var2 = (KCdrkA63YhnRraqSAws7gkxCys1y3ePF1IrSmiJ5tkgPmwtlhLLWBhA4ovJ61fgp97eJeAA7RYKpI8NehcV0EWNoy2jqC6i30u18)var3.newInstance();
         }
      } catch (Exception var4) {
         BatModClient.warn(
            "Failed Piece with id " + var0.IntegerSpinner("id")
         );
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.BatModClient(var1, var0);
      } else {
         BatModClient.warn(
            "Skipping Piece with id " + var0.IntegerSpinner("id")
         );
      }

      return var2;
   }

   static {
      Button(
         BdDErMOSLQyfA8iu2vGN04QNbOYdbSBsEwKnmZbjP4Sv409rKlS4jFIAm9w3Csz3lMxoy8Io4DT2PAxW2QF8nnmVyM8bcwPeeZst.class, "Mineshaft"
      );
      Button(
         gV8J6qlVcCfVfQAs3EMclBWoOH2Wuq2ZNIaiR51jibUEu5HQOBpKh4wRVtnG7MpUmL2e2HW4FNKCQHY3nZ9K9qkorOCAuFKM8qso.class, "Village"
      );
      Button(
         EioAcK62GSc4TCiUjIC5C1dCzC8j0LGsuVzbShylez7CgXWKwxapxk0pJZ7En74OUZoFmI9iDFoYPEFti4xCM08C3FxrEdJTE8Z1.class, "Fortress"
      );
      Button(
         rplfVwpNxUL6LE2p5oXqJpBfBTbqU1Zylq6RIGsGjCTVDbxFTd1FM1UvcI2xC7ZPgpRxCxQOnRlOAuFIhuZItgRh5l4nIokaHE6K.class, "Stronghold"
      );
      Button(
         M31qdYHwtVZlWiTDwAR8CW2EXOGuWgLdlPti9u0utMhCyjdFB9txXebLWPw0TvGCLYbImI7BjjRY5NXiCmZY1IYlxsWaooRBouzE.class, "Temple"
      );
      Button(
         BbCCYnq031kONMXvKfkkyNcqluA3zAJMqYuz1WhEGwes8usoSKq2y80VBgPNnUVUwchAwmV4DSU33CfNSTMVbyKjQ5nxzuGNrcOj.class, "Monument"
      );
      jMVQJESzrLSrnRkVxkrngpDjkfP0WDOAiYKLG5qPEw3ALcte1BWN2a31p7dgynjcAAeJ9GxG9beYVjkXtpwBpLgKDa54Dtttw6p.BatModClient();
      OFJ2rFjtdOsyu3ZxtjOcFKdOp4r2dzKkv9LduQytp1FTtxTlP1KFmQ75FXuMhukv4TSRpEl8SR9oBzGyyTYH4rIlA6UnZjRElHnu.BatModClient();
      azDHNhxTfTZ8ivmreEdh9BAFsabOtQGFaSdz5QZmdRDVwF8FRm7uSTmBedStCicaCZRQYJMyx7zNLlnJ9pTLt9tWGYueN62A0iX7.BatModClient();
      b3jPXUNGT3z08Ci6jojax2TlqIlNO8vzrpBdCBak6FBKB7d0ecZX1P1TlxHbZmTBuGprhZXKzSPwiDfNo4AGJoEtFdeN3zNszvBC.BatModClient();
      HmZb1gtCiLvuHiSN8JEK2yqmv6pgksH1awshmSiGauIcvEQGaAxeFquq1U3Ym6CF0Q8Gi0wRmv9Jew3BNkBHxaEBTbIQBNUiePC.BatModClient();
      x8Gbd244ONUGca1BEHnq0wszSSegxb6clIuOoeO1modL7ST5Yh6JFQil6aVSllxkHWcdfnLpY4XLOnHCPBeVolyeS5W0JHhftJFE.BatModClient();
   }
}
