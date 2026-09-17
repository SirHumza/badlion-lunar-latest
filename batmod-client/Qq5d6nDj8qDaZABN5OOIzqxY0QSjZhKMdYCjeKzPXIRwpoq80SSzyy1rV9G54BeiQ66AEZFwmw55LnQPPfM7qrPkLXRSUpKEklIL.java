import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class Qq5d6nDj8qDaZABN5OOIzqxY0QSjZhKMdYCjeKzPXIRwpoq80SSzyy1rV9G54BeiQ66AEZFwmw55LnQPPfM7qrPkLXRSUpKEklIL {
   private static final Splitter Button = Splitter.on('=')
      .limit(2);
   private static final Pattern CustomSpinner = Pattern.compile(
      "%(\\d+\\$)?[\\d\\.]*[df]"
   );
   Map BatModClient = Maps.newHashMap();
   private boolean ButtonAction;

   public synchronized void BatModClient(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var1, List var2
   ) {
      this.BatModClient.clear();

      for (String var4 : var2) {
         String var5 = String.format("lang/%s.lang", var4);

         for (String var7 : var1.BatModClient()) {
            try {
               this.BatModClient(
                  var1.Button(
                     new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(var7, var5)
                  )
               );
            } catch (IOException var9) {
            }
         }
      }

      this.Button();
   }

   public boolean BatModClient() {
      return this.ButtonAction;
   }

   private void Button() {
      this.ButtonAction = false;
      int var1 = 0;
      int var2 = 0;

      for (String var4 : this.BatModClient.values()) {
         int var5 = var4.length();
         var2 += var5;

         for (int var6 = 0; var6 < var5; var6++) {
            if (var4.charAt(var6) >= 256) {
               var1++;
            }
         }
      }

      float var7 = (float)var1 / var2;
      this.ButtonAction = var7 > 0.1;
   }

   private void BatModClient(List var1) {
      for (DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m var3 : var1) {
         InputStream var4 = var3.Button();

         try {
            this.BatModClient(var4);
         } finally {
            IOUtils.closeQuietly(var4);
         }
      }
   }

   private void BatModClient(InputStream var1) {
      for (String var3 : IOUtils.readLines(var1, Charsets.UTF_8)) {
         if (!var3.isEmpty() && var3.charAt(0) != '#') {
            String[] var4 = (String[])Iterables.toArray(
               Button.split(var3), String.class
            );
            if (var4 != null && var4.length == 2) {
               String var5 = var4[0];
               String var6 = CustomSpinner.matcher(var4[1])
                  .replaceAll("%$1s");
               this.BatModClient.put(var5, var6);
            }
         }
      }
   }

   private String BatModClient(String var1) {
      String var2 = (String)this.BatModClient.get(var1);
      return var2 == null ? var1 : var2;
   }

   public String BatModClient(String var1, Object[] var2) {
      String var3 = this.BatModClient(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }
}
