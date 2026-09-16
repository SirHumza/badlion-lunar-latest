import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OJ2hS3dQ7PMJXfIMXkdJeUZ1pqHqeTHScHmrHbw2KxHAaKueCx8duIGDVQao92NslQdGf3JN3UWIJdtIKGnuuiXwT2gHy19iIiTM {
   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(File var0) {
      ArrayList var1 = new ArrayList();

      try {
         FileInputStream var2;
         try {
            var2 = new FileInputStream(var0);
         } catch (FileNotFoundException var5) {
            Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
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
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
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
