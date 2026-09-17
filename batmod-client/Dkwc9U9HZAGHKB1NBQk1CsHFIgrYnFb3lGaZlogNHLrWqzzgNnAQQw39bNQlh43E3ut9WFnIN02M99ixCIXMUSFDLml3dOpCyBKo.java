import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.ArrayUtils;

class nXIdu9yh5qfnrxP7saVguB5pdLQerMtFdGCsaCBfirUAXuLaLGCM6rkiL20CkyKmWB3qTbZsYieZQog5Wo3lWugqZhFCBB8dkze
   implements Dkwc9U9HZAGHKB1NBQk1CsHFIgrYnFb3lGaZlogNHLrWqzzgNnAQQw39bNQlh43E3ut9WFnIN02M99ixCIXMUSFDLml3dOpCyBKo {
   private boolean Spinner;

   nXIdu9yh5qfnrxP7saVguB5pdLQerMtFdGCsaCBfirUAXuLaLGCM6rkiL20CkyKmWB3qTbZsYieZQog5Wo3lWugqZhFCBB8dkze(
      ZguwaYywrssMS7V7NJ17jJYaQp64M7hHAy9R7GufMjR3ATWet6dc5fIeZY1SyO5nuLWKhgimKxysIFUDCNeyeXzshsgtBQMncTQq var1,
      xdCE0sAo5F6XUqjGuCTeRZ4Pg0CrSlcAEzb5ercgPnZqC05cTAqeLqgrL0vCQqaoSo81QzgmQfbFn9S6BnpBxVoskcu0wfuURTLi var2,
      fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var3,
      String var4
   ) {
      this.ButtonAction = var1;
      this.BatModClient = var2;
      this.Button = var3;
      this.CustomSpinner = var4;
      this.Spinner = false;
   }

   @Override
   public void BatModClient(
      v482cKTTvJUEsHem8SyO0CETkc7ZE7f1XpwV7G20Tf490QSwVkxq0KQUr2ulkytj98ilsuj9x8OfRyXKj8vnOhPBbulpeZtskVa var1
   ) {
      EejyXTBkg8xmnJ0X6oziu3M7qmkIpJ1l6I8tyO5daUcDp5uyMvgM35dPNrPJY9KsNhKZLzmGY2Tgac5zuMs2RInSS5Mkvox2QNr var2 = var1.BatModClient();
      if (var2.Button() != null) {
         this.BatModClient.BatModClient = String.valueOf(
            var2.Button()
               .Button()
         );
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

            this.BatModClient.CustomSpinner = var3.toString();
         }
      } else {
         this.BatModClient.CustomSpinner = "";
      }

      this.Button
         .BatModClient(
            new UjnH3MFFmv7qDXXtIg17Rocr1mz5IRdFKN87XPv7RX6Z9sBpC1vvDZ3XpLw5xHmM8tgeyvs0rPOWFstM87XhVRXGZKxCR7ctM4B(
               rFcfJhwsdtdJXoajv4YJmXp5Ea4hXcxLbUCctkCaUJzBoWwdcffkjNPrGTpF0CT1dRHK9EO4bSzawPgLn2Qb6GvhhZy6N5KqUxjw.Spinner()
            )
         );
      this.Spinner = true;
   }

   @Override
   public void BatModClient(
      JflcTaUjIIzDsszEQ8IRyoNs8TFS5NZ24PPCEciIRy2UvLPC7ONzlf18FwF3crEncncXJDkUUJJpb8rFtkp7EtQ3af6NOyk9e3j4 var1
   ) {
      this.Button
         .BatModClient(
            new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl("Finished")
         );
   }

   @Override
   public void BatModClient(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1
   ) {
      if (!this.Spinner) {
         ZguwaYywrssMS7V7NJ17jJYaQp64M7hHAy9R7GufMjR3ATWet6dc5fIeZY1SyO5nuLWKhgimKxysIFUDCNeyeXzshsgtBQMncTQq.CustomSpinner()
            .error(
               "Can't ping "
                  + this.CustomSpinner
                  + ": "
                  + var1.BatModProgressBar()
            );
      }
   }
}
