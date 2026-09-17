import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.ArrayUtils;

class nsLwiFxhCLL2U3TuGssI5lYsx66WXx40LlLXf4R8lvMGKDGjeW9WIHtDntIrYIeZ7UAfFkKpITYpo5SWmZyhX5gTtDrlAYdJemM
   implements Dkwc9U9HZAGHKB1NBQk1CsHFIgrYnFb3lGaZlogNHLrWqzzgNnAQQw39bNQlh43E3ut9WFnIN02M99ixCIXMUSFDLml3dOpCyBKo {
   private boolean ButtonAction;
   private boolean Spinner;
   private long Checkbox;

   nsLwiFxhCLL2U3TuGssI5lYsx66WXx40LlLXf4R8lvMGKDGjeW9WIHtDntIrYIeZ7UAfFkKpITYpo5SWmZyhX5gTtDrlAYdJemM(
      qA5bWMiRpUjvglK4lkQ6RKDCp5wf7VfTP5AN6Tm3MD05LavLFkrPHSL7rpwxqPxOWip7u6dKCDiLJvjVGbFynPtQ4DV2HS8fdA8h var1,
      fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var2,
      Go8Q4QnWnWN69jeeJFNTCXkOQH15MGJcSX7ytPZxDv87l8N767jT897Tayfk1hYvBZSEIZwFFhM7veSw5gsH2NaNRjDrhFSlYaHx var3
   ) {
      this.CustomSpinner = var1;
      this.BatModClient = var2;
      this.Button = var3;
      this.ButtonAction = false;
      this.Spinner = false;
      this.Checkbox = 0L;
   }

   @Override
   public void BatModClient(
      v482cKTTvJUEsHem8SyO0CETkc7ZE7f1XpwV7G20Tf490QSwVkxq0KQUr2ulkytj98ilsuj9x8OfRyXKj8vnOhPBbulpeZtskVa var1
   ) {
      if (this.Spinner) {
         this.BatModClient
            .BatModClient(
               new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl("Received unrequested status")
            );
      } else {
         this.Spinner = true;
         EejyXTBkg8xmnJ0X6oziu3M7qmkIpJ1l6I8tyO5daUcDp5uyMvgM35dPNrPJY9KsNhKZLzmGY2Tgac5zuMs2RInSS5Mkvox2QNr var2 = var1.BatModClient();
         if (var2.BatModClient() != null) {
            this.Button.ButtonAction = var2.BatModClient()
               .ColorChooser();
         } else {
            this.Button.ButtonAction = "";
         }

         if (var2.CustomSpinner() != null) {
            this.Button.ProgressBar = var2.CustomSpinner()
               .BatModClient();
            this.Button.Checkbox = var2.CustomSpinner()
               .Button();
         } else {
            this.Button.ProgressBar = "Old";
            this.Button.Checkbox = 0;
         }

         if (var2.Button() == null) {
            this.Button.CustomSpinner = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.ColorChooser
               + "???";
         } else {
            this.Button.CustomSpinner = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModProgressBar
               + ""
               + var2.Button()
                  .Button()
               + ""
               + C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.ColorChooser
               + "/"
               + C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModProgressBar
               + var2.Button()
                  .BatModClient();
            if (ArrayUtils.isNotEmpty(
               var2.Button()
                  .CustomSpinner()
            )) {
               StringBuilder var3 = new StringBuilder();

               for (GameProfile var7 : var2.Button()
                  .CustomSpinner()) {
                  if (var3.length() > 0) {
                     var3.append("\n");
                  }

                  var3.append(var7.getName());
               }

               if (var2.Button()
                     .CustomSpinner().length
                  < var2.Button()
                     .Button()) {
                  if (var3.length() > 0) {
                     var3.append("\n");
                  }

                  var3.append("... and ")
                     .append(
                        var2.Button()
                              .Button()
                           - var2.Button()
                              .CustomSpinner().length
                     )
                     .append(" more ...");
               }

               this.Button.ColorChooser = var3.toString();
            }
         }

         if (var2.ButtonAction() != null) {
            String var8 = var2.ButtonAction();
            if (var8.startsWith("data:image/png;base64,")) {
               this.Button
                  .BatModClient(
                     var8.substring("data:image/png;base64,".length())
                  );
            } else {
               qA5bWMiRpUjvglK4lkQ6RKDCp5wf7VfTP5AN6Tm3MD05LavLFkrPHSL7rpwxqPxOWip7u6dKCDiLJvjVGbFynPtQ4DV2HS8fdA8h.CustomSpinner()
                  .error("Invalid server icon (unknown format)");
            }
         } else {
            this.Button
               .BatModClient((String)null);
         }

         this.Checkbox = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
         this.BatModClient
            .BatModClient(
               new UjnH3MFFmv7qDXXtIg17Rocr1mz5IRdFKN87XPv7RX6Z9sBpC1vvDZ3XpLw5xHmM8tgeyvs0rPOWFstM87XhVRXGZKxCR7ctM4B(
                  this.Checkbox
               )
            );
         this.ButtonAction = true;
      }
   }

   @Override
   public void BatModClient(
      JflcTaUjIIzDsszEQ8IRyoNs8TFS5NZ24PPCEciIRy2UvLPC7ONzlf18FwF3crEncncXJDkUUJJpb8rFtkp7EtQ3af6NOyk9e3j4 var1
   ) {
      long var2 = this.Checkbox;
      long var4 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
      this.Button.Spinner = var4
         - var2;
      this.BatModClient
         .BatModClient(
            new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl("Finished")
         );
   }

   @Override
   public void BatModClient(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1
   ) {
      if (!this.ButtonAction) {
         qA5bWMiRpUjvglK4lkQ6RKDCp5wf7VfTP5AN6Tm3MD05LavLFkrPHSL7rpwxqPxOWip7u6dKCDiLJvjVGbFynPtQ4DV2HS8fdA8h.CustomSpinner()
            .error(
               "Can't ping "
                  + this.Button.Button
                  + ": "
                  + var1.BatModProgressBar()
            );
         this.Button.ButtonAction = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Spinner
            + "Can't connect to server.";
         this.Button.CustomSpinner = "";
         qA5bWMiRpUjvglK4lkQ6RKDCp5wf7VfTP5AN6Tm3MD05LavLFkrPHSL7rpwxqPxOWip7u6dKCDiLJvjVGbFynPtQ4DV2HS8fdA8h.BatModClient(
            this.CustomSpinner,
            this.Button
         );
      }
   }
}
