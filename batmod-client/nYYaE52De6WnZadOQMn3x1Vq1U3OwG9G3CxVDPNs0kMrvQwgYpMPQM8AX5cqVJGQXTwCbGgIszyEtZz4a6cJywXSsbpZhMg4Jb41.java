import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public final class nYYaE52De6WnZadOQMn3x1Vq1U3OwG9G3CxVDPNs0kMrvQwgYpMPQM8AX5cqVJGQXTwCbGgIszyEtZz4a6cJywXSsbpZhMg4Jb41 {
   public static GameProfile BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0
   ) {
      String var1 = null;
      String var2 = null;
      if (var0.Button("Name", 8)) {
         var1 = var0.IntegerSpinner("Name");
      }

      if (var0.Button("Id", 8)) {
         var2 = var0.IntegerSpinner("Id");
      }

      if (fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F.Button(
            var1
         )
         && fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F.Button(
            var2
         )) {
         return null;
      }

      UUID var3;
      try {
         var3 = UUID.fromString(var2);
      } catch (Throwable var12) {
         var3 = null;
      }

      GameProfile var4 = new GameProfile(var3, var1);
      if (var0.Button("Properties", 10)) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var5 = var0.BatModInstallerMain(
            "Properties"
         );

         for (String var7 : var5.Spinner()) {
            fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var8 = var5.CustomSpinner(
               var7, 10
            );

            for (int var9 = 0; var9 < var8.Spinner(); var9++) {
               YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var10 = var8.Button(
                  var9
               );
               String var11 = var10.IntegerSpinner("Value");
               if (var10.Button("Signature", 8)) {
                  var4.getProperties()
                     .put(
                        var7,
                        new Property(
                           var7, var11, var10.IntegerSpinner("Signature")
                        )
                     );
               } else {
                  var4.getProperties().put(var7, new Property(var7, var11));
               }
            }
         }
      }

      return var4;
   }

   public static YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0, GameProfile var1
   ) {
      if (!fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F.Button(
         var1.getName()
      )) {
         var0.BatModClient("Name", var1.getName());
      }

      if (var1.getId() != null) {
         var0.BatModClient("Id", var1.getId().toString());
      }

      if (!var1.getProperties().isEmpty()) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();

         for (String var4 : var1.getProperties().keySet()) {
            fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var5 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

            for (Property var7 : var1.getProperties().get(var4)) {
               YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var8 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
               var8.BatModClient("Value", var7.getValue());
               if (var7.hasSignature()) {
                  var8.BatModClient("Signature", var7.getSignature());
               }

               var5.BatModClient(var8);
            }

            var2.BatModClient(var4, var5);
         }

         var0.BatModClient("Properties", var2);
      }

      return var0;
   }

   public static boolean BatModClient(
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var0,
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var1,
      boolean var2
   ) {
      if (var0 == var1) {
         return true;
      }

      if (var0 == null) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!var0.getClass().equals(var1.getClass())) {
         return false;
      }

      if (var0 instanceof YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var9 = (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)var0;
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var10 = (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)var1;

         for (String var12 : var9.Spinner()) {
            NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var13 = var9.BatModClient(
               var12
            );
            if (!BatModClient(
               var13, var10.BatModClient(var12), var2
            )) {
               return false;
            }
         }

         return true;
      } else if (var0 instanceof fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ && var2) {
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var3 = (fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ)var0;
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var4 = (fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ)var1;
         if (var3.Spinner() == 0) {
            return var4.Spinner() == 0;
         }

         for (int var5 = 0; var5 < var3.Spinner(); var5++) {
            NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var6 = var3.ProgressBar(
               var5
            );
            boolean var7 = false;

            for (int var8 = 0; var8 < var4.Spinner(); var8++) {
               if (BatModClient(
                  var6, var4.ProgressBar(var8), var2
               )) {
                  var7 = true;
                  break;
               }
            }

            if (!var7) {
               return false;
            }
         }

         return true;
      } else {
         return var0.equals(var1);
      }
   }
}
