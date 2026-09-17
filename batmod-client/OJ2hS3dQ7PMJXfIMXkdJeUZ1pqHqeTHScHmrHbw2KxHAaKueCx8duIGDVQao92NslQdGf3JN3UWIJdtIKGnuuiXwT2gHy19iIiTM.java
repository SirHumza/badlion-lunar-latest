import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OJ2hS3dQ7PMJXfIMXkdJeUZ1pqHqeTHScHmrHbw2KxHAaKueCx8duIGDVQao92NslQdGf3JN3UWIJdtIKGnuuiXwT2gHy19iIiTM {
   public static String BatModClient(File var0) {
      ArrayList var1 = new ArrayList();

      try {
         FileInputStream var2;
         try {
            var2 = new FileInputStream(var0);
         } catch (FileNotFoundException var5) {
            BatModClient.CustomSpinner(
               "File '" + var0.getAbsolutePath() + "' was not found"
            );
            var5.printStackTrace();
            return null;
         }

         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2));

         String var4;
         while ((var4 = var3.readLine()) != null) {
            var1.add(var4);
         }

         var3.close();
      } catch (Exception var6) {
         BatModClient.CustomSpinner(
            "Failed to read content from '" + var0.getAbsolutePath() + "'"
         );
         var6.printStackTrace();
      }

      StringBuilder var7 = new StringBuilder();

      for (int var8 = 0; var8 < var1.size(); var8++) {
         var7.append((String)var1.get(var8));
         if (var8 != var1.size() - 1) {
            var7.append(System.getProperty("line.separator"));
         }
      }

      return var7.toString();
   }
}
