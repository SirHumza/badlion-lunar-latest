import com.mojang.authlib.GameProfile;
import java.util.List;

public class eEpbCsVA6hZaXnm8JYB7lPvkPMZfXKizwUQeMtUgMBSZ1jKZIUW5HgcA3I7hJwD5yvOegOlByx4TTfbLRyjSn9UhWbNHpbmjJsXN
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "whitelist";
   }

   @Override
   public int BatModClient() {
      return 3;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.whitelist.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 1) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.whitelist.usage");
      }

      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var3 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ();
      if (var2[0].equals("on")) {
         var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .Button(true);
         BatModClient(var1, this, "commands.whitelist.enabled");
      } else if (var2[0].equals("off")) {
         var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .Button(false);
         BatModClient(var1, this, "commands.whitelist.disabled");
      } else if (var2[0].equals("list")) {
         var1.BatModClient(
            new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "commands.whitelist.list",
               var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
                  .ColorTextPane().length,
               var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
                  .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ().length
            )
         );
         String[] var4 = var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .ColorTextPane();
         var1.BatModClient(
            new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
               BatModClient(var4)
            )
         );
      } else if (var2[0].equals("add")) {
         if (var2.length < 2) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.whitelist.add.usage");
         }

         GameProfile var5 = var3.H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr()
            .BatModClient(var2[1]);
         if (var5 == null) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.whitelist.add.failed", var2[1]
            );
         }

         var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .Checkbox(var5);
         BatModClient(
            var1, this, "commands.whitelist.add.success", var2[1]
         );
      } else if (var2[0].equals("remove")) {
         if (var2.length < 2) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.whitelist.remove.usage");
         }

         GameProfile var6 = var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .TextField()
            .BatModClient(var2[1]);
         if (var6 == null) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.whitelist.remove.failed", var2[1]
            );
         }

         var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .ProgressBar(var6);
         BatModClient(
            var1, this, "commands.whitelist.remove.success", var2[1]
         );
      } else if (var2[0].equals("reload")) {
         var3.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN();
         BatModClient(var1, this, "commands.whitelist.reloaded");
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      if (var2.length == 1) {
         return BatModClient(
            var2, "on", "off", "list", "add", "remove", "reload"
         );
      }

      if (var2.length == 2) {
         if (var2[0].equals("remove")) {
            return BatModClient(
               var2,
               TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                  .AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
                  .ColorTextPane()
            );
         }

         if (var2[0].equals("add")) {
            return BatModClient(
               var2,
               TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                  .H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr()
                  .BatModClient()
            );
         }
      }

      return null;
   }
}
