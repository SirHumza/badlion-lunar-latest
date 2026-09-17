import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class fhUNcgqDLtxK1xGlUm1ohyk6lMVrtgVvOwfUHy5FA08kkHlvCHCqgVpmYdsiohftukBLHh0X90eEdYeJS5L5eRuYdQiX56BPOsMI
   implements DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m {
   private final Map BatModClient = Maps.newHashMap();
   private final String Button;
   private final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD CustomSpinner;
   private final InputStream ButtonAction;
   private final InputStream Spinner;
   private final hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo Checkbox;
   private boolean ProgressBar;
   private JsonObject BatModProgressBar;

   public fhUNcgqDLtxK1xGlUm1ohyk6lMVrtgVvOwfUHy5FA08kkHlvCHCqgVpmYdsiohftukBLHh0X90eEdYeJS5L5eRuYdQiX56BPOsMI(
      String var1,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2,
      InputStream var3,
      InputStream var4,
      hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo var5
   ) {
      this.Button = var1;
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
      this.Spinner = var4;
      this.Checkbox = var5;
   }

   @Override
   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient() {
      return this.CustomSpinner;
   }

   @Override
   public InputStream Button() {
      return this.ButtonAction;
   }

   @Override
   public boolean CustomSpinner() {
      return this.Spinner != null;
   }

   @Override
   public GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr BatModClient(
      String var1
   ) {
      if (!this.CustomSpinner()) {
         return (GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr)null;
      }

      if (this.BatModProgressBar == null
         && !this.ProgressBar) {
         this.ProgressBar = true;
         BufferedReader var2 = null;

         try {
            var2 = new BufferedReader(
               new InputStreamReader(this.Spinner)
            );
            this.BatModProgressBar = new JsonParser()
               .parse(var2)
               .getAsJsonObject();
         } finally {
            IOUtils.closeQuietly(var2);
         }
      }

      GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr var6 = (GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr)this.BatModClient
         .get(var1);
      if (var6 == null) {
         var6 = this.Checkbox
            .BatModClient(
               var1, this.BatModProgressBar
            );
      }

      return var6;
   }

   @Override
   public String ButtonAction() {
      return this.Button;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof fhUNcgqDLtxK1xGlUm1ohyk6lMVrtgVvOwfUHy5FA08kkHlvCHCqgVpmYdsiohftukBLHh0X90eEdYeJS5L5eRuYdQiX56BPOsMI)) {
         return false;
      }

      fhUNcgqDLtxK1xGlUm1ohyk6lMVrtgVvOwfUHy5FA08kkHlvCHCqgVpmYdsiohftukBLHh0X90eEdYeJS5L5eRuYdQiX56BPOsMI var2 = (fhUNcgqDLtxK1xGlUm1ohyk6lMVrtgVvOwfUHy5FA08kkHlvCHCqgVpmYdsiohftukBLHh0X90eEdYeJS5L5eRuYdQiX56BPOsMI)var1;
      if (this.CustomSpinner != null) {
         if (!this.CustomSpinner
            .equals(var2.CustomSpinner)) {
            return false;
         }
      } else if (var2.CustomSpinner != null) {
         return false;
      }

      if (this.Button != null) {
         if (!this.Button
            .equals(var2.Button)) {
            return false;
         }
      } else if (var2.Button != null) {
         return false;
      }

      return true;
   }

   @Override
   public int hashCode() {
      int var1 = this.Button != null
         ? this.Button.hashCode()
         : 0;
      return 31 * var1
         + (
            this.CustomSpinner != null
               ? this.CustomSpinner.hashCode()
               : 0
         );
   }
}
