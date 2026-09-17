import java.util.HashMap;
import java.util.Map;

public class sBE7jOXHSlxIg0i9OICYcexr4cCNWgttN1wH1F7jRlc3dPXF7iJUPUWLuzrvtkUJhNoHjZuSaJvbAYidecx3bjZ1pXAHsEa1IWg {
   private static Map BatModClient = null;

   public static void BatModClient(
      OUbGU3dbnTgCgq6s9tkqNXorWUrBQ8c80Lbe1cwHxjA76evmQbcl5lHEVftF7vobDP6x2WB97FfcQzLbl4Pi0waiWVyIKUj36UPN var0,
      Lmd6XQJiXBh6sFHh0cwNH24TrP1ExbExBOkmmKSK3KyeuuXoRly1rbhzaNdZCuDnQjZvoKmXi8rP4mwYvlBfcsOByD6dTTcy7PE var1,
      float var2,
      float var3
   ) {
      iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7 var4 = BatModClient(
         var1
      );
      if (var4 != null) {
         var4.BatModClient(var0, var1, var2, var3);
      }
   }

   public static synchronized iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7 BatModClient(
      Lmd6XQJiXBh6sFHh0cwNH24TrP1ExbExBOkmmKSK3KyeuuXoRly1rbhzaNdZCuDnQjZvoKmXi8rP4mwYvlBfcsOByD6dTTcy7PE var0
   ) {
      String var1 = var0.ColorTextPane();
      if (var1 == null) {
         return null;
      }

      iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7 var2 = (iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7)BatModClient()
         .get(var1);
      if (var2 == null) {
         var2 = new iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7();
         BatModClient().put(var1, var2);
         xWcYMoMqr5I48JhkHxELamyE79Vx0Hz6k4NhvNiRnPv23RGG7OoDRzpejFaIJbVIhKCRu87sD4NlI15iTVUrMPczOGnQcLu0quNE var3 = new xWcYMoMqr5I48JhkHxELamyE79Vx0Hz6k4NhvNiRnPv23RGG7OoDRzpejFaIJbVIhKCRu87sD4NlI15iTVUrMPczOGnQcLu0quNE(
            var1
         );
         String var4 = "http://s.optifine.net/users/" + var1 + ".cfg";
         ptw2s8XcwIazbMpbP0Gra2iiAUx8RXAn42QPFXL2yPssYxX7tSoESxsUUAGWRgLaZQi3zUbCdrV7U2p1OwHd2UgPDcMOAkc0NogP var5 = new ptw2s8XcwIazbMpbP0Gra2iiAUx8RXAn42QPFXL2yPssYxX7tSoESxsUUAGWRgLaZQi3zUbCdrV7U2p1OwHd2UgPDcMOAkc0NogP(
            var4, var3
         );
         var5.start();
      }

      return var2;
   }

   public static synchronized void BatModClient(
      String var0, iBH5mqzNoqmrWJFgCCenTjsmTq1xbXbrP9DU1dizdWfpypskRVCIo5MgKQqVYpvbu3aaYQmuC5fcQ0GOCnyAjnVTFERGJQOFZNE7 var1
   ) {
      BatModClient().put(var0, var1);
   }

   private static Map BatModClient() {
      if (BatModClient == null) {
         BatModClient = new HashMap();
      }

      return BatModClient;
   }
}
