import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class js8IhP7JieBz8pRpMyza2AHRscWcsir5ONrBljFoJMl6PtgMlsk34luC3IRado0LemsX3zBSzRCMdozHX5n0pZFPO1B4GZIBv1Rh
   implements oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr {
   private static final Logger Button = LogManager.getLogger();
   public final File BatModClient;
   private static final String CustomSpinner = "CL_00001072";

   public js8IhP7JieBz8pRpMyza2AHRscWcsir5ONrBljFoJMl6PtgMlsk34luC3IRado0LemsX3zBSzRCMdozHX5n0pZFPO1B4GZIBv1Rh(File var1) {
      this.BatModClient = var1;
   }

   private static String CustomSpinner(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var0
   ) {
      return String.format(
         "%s/%s/%s",
         "assets",
         var0.CustomSpinner(),
         var0.Button()
      );
   }

   protected static String BatModClient(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   @Override
   public InputStream BatModClient(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return this.BatModClient(
         CustomSpinner(var1)
      );
   }

   @Override
   public boolean Button(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return this.Button(
         CustomSpinner(var1)
      );
   }

   protected abstract InputStream BatModClient(String var1);

   protected abstract boolean Button(String var1);

   protected void CustomSpinner(String var1) {
      Button.warn(
         "ResourcePack: ignored non-lowercase namespace: {} in {}",
         new Object[]{var1, this.BatModClient}
      );
   }

   @Override
   public GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr BatModClient(
      hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo var1, String var2
   ) {
      return BatModClient(
         var1, this.BatModClient("pack.mcmeta"), var2
      );
   }

   static GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr BatModClient(
      hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo var0, InputStream var1, String var2
   ) {
      JsonObject var3 = null;
      BufferedReader var4 = null;

      try {
         var4 = new BufferedReader(new InputStreamReader(var1, Charsets.UTF_8));
         var3 = new JsonParser().parse(var4).getAsJsonObject();
      } catch (RuntimeException var9) {
         throw new JsonParseException(var9);
      } finally {
         IOUtils.closeQuietly(var4);
      }

      return var0.BatModClient(var2, var3);
   }

   @Override
   public BufferedImage BatModClient() {
      return oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
         this.BatModClient("pack.png")
      );
   }

   @Override
   public String Button() {
      return this.BatModClient.getName();
   }
}
