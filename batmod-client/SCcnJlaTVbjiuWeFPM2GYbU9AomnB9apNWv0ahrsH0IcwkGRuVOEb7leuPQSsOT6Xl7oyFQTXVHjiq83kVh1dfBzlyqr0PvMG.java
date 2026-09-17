import com.google.gson.JsonParseException;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class SCcnJlaTVbjiuWeFPM2GYbU9AomnB9apNWv0ahrsH0IcwkGRuVOEb7leuPQSsOT6Xl7oyFQTXVHjiq83kVh1dfBzlyqr0PvMG
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "tellraw";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.tellraw.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 2) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.tellraw.usage");
      }

      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var3 = BatModClient(
         var1, var2[0]
      );
      String var4 = BatModClient(var2, 1);

      try {
         WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var5 = nMK8kAcK1E9JGdO8NcNynr3pQa53houHGTxyYWhful1qkKBREVWm9tMddCyyPojSsrXSOoQhgceK0oqnECW6Gh5SeiFl65AYu3z.BatModClient(
            var4
         );
         var3.BatModClient(
            HL6xPhSONRrHkumWMekPrPdF8FyKyvNfUK1ACMIAbtdhGAj814VWFp9eTg8lZWlW2slDvGflqEJUzrTglfkVvbF3aS0GhiuJ9P6j.BatModClient(
               var1, var5, var3
            )
         );
      } catch (JsonParseException var7) {
         Throwable var6 = ExceptionUtils.getRootCause(var7);
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.tellraw.jsonException", var6 == null ? "" : var6.getMessage()
         );
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(
            var2,
            TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
         )
         : null;
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var2 == 0;
   }
}
