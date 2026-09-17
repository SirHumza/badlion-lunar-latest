import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

public class afjezsdVksWiy0jQvw1umUEyrWmQZvrg1rm7hSgs8cZb7fZaoUPrFm8cfEoFJ28FH4ZVBhfvXC5skIoqxaAlmlkrTtUIrJJNUIT7
   implements oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr {
   public static final Set BatModClient = ImmutableSet.of(
      "minecraft", "realms"
   );
   private final Map Button;
   private static final String CustomSpinner = "CL_00001073";

   public afjezsdVksWiy0jQvw1umUEyrWmQZvrg1rm7hSgs8cZb7fZaoUPrFm8cfEoFJ28FH4ZVBhfvXC5skIoqxaAlmlkrTtUIrJJNUIT7(Map var1) {
      this.Button = var1;
   }

   @Override
   public InputStream BatModClient(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      InputStream var2 = this.ButtonAction(var1);
      if (var2 != null) {
         return var2;
      } else {
         InputStream var3 = this.CustomSpinner(var1);
         if (var3 != null) {
            return var3;
         } else {
            throw new FileNotFoundException(var1.Button());
         }
      }
   }

   public InputStream CustomSpinner(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      File var2 = (File)this.Button.get(var1.toString());
      return var2 != null && var2.isFile() ? new FileInputStream(var2) : null;
   }

   private InputStream ButtonAction(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      String var2 = "/assets/"
         + var1.CustomSpinner()
         + "/"
         + var1.Button();
      InputStream var3 = VuM1rPDwhaSV9KF2NDvJztVDGnc23vdBR5Lsz7iL8NAJMGfzmAPTNcpMdgwOxXvdkVzSEJjIcI8UJGsbkIWT6tzq3Gb5OXaxfcvt.BatModClient(
         var2
      );
      return var3 != null
         ? var3
         : afjezsdVksWiy0jQvw1umUEyrWmQZvrg1rm7hSgs8cZb7fZaoUPrFm8cfEoFJ28FH4ZVBhfvXC5skIoqxaAlmlkrTtUIrJJNUIT7.class
            .getResourceAsStream(
               "/assets/"
                  + var1.CustomSpinner()
                  + "/"
                  + var1.Button()
            );
   }

   @Override
   public boolean Button(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return this.ButtonAction(var1) != null
         || this.Button.containsKey(var1.toString());
   }

   @Override
   public Set CustomSpinner() {
      return BatModClient;
   }

   @Override
   public GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr BatModClient(
      hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo var1, String var2
   ) {
      try {
         FileInputStream var3 = new FileInputStream(
            (File)this.Button.get("pack.mcmeta")
         );
         return js8IhP7JieBz8pRpMyza2AHRscWcsir5ONrBljFoJMl6PtgMlsk34luC3IRado0LemsX3zBSzRCMdozHX5n0pZFPO1B4GZIBv1Rh.BatModClient(
            var1, var3, var2
         );
      } catch (RuntimeException var4) {
         return null;
      } catch (FileNotFoundException var5) {
         return null;
      }
   }

   @Override
   public BufferedImage BatModClient() {
      return oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         afjezsdVksWiy0jQvw1umUEyrWmQZvrg1rm7hSgs8cZb7fZaoUPrFm8cfEoFJ28FH4ZVBhfvXC5skIoqxaAlmlkrTtUIrJJNUIT7.class
            .getResourceAsStream(
               "/"
                  + new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("pack.png")
                     .Button()
            )
      );
   }

   @Override
   public String Button() {
      return "Default";
   }
}
