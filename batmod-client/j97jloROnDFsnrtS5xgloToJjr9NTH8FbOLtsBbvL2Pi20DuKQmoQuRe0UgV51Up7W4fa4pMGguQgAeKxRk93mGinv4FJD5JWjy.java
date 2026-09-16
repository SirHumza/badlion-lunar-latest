import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.DatatypeConverter;

public class j97jloROnDFsnrtS5xgloToJjr9NTH8FbOLtsBbvL2Pi20DuKQmoQuRe0UgV51Up7W4fa4pMGguQgAeKxRk93mGinv4FJD5JWjy {
   public static final String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = "https://api.imgur.com/3/image";
   public static final String BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = "https://api.imgur.com/3/album";
   public static final int vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = 3;
   private static final String PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = "d56be5d703108eb";

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0) {
      Pattern var1 = Pattern.compile("link\":\"(.*?)\"");
      Matcher var2 = var1.matcher(var0);
      var2.find();
      return var2.group().replace("link\":\"", "").replace("\"", "").replace("\\/", "/");
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(File var0) {
      HttpURLConnection var1 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         "https://api.imgur.com/3/image"
      );
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, "image=" + BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0)
      );
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(List var0) {
      HttpURLConnection var1 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         "https://api.imgur.com/3/album"
      );
      String var2 = "";

      for (String var4 : var0) {
         if (!var2.equals("")) {
            var2 = var2 + ",";
         }

         var2 = var2 + var4;
      }

      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, "ids=" + var2);
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
   }

   private static String BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(File var0) {
      try {
         byte[] var1 = new byte[(int)var0.length()];
         FileInputStream var2 = new FileInputStream(var0);
         var2.read(var1);
         var2.close();
         return URLEncoder.encode(DatatypeConverter.printBase64Binary(var1), "UTF-8");
      } catch (IOException var3) {
         throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(
            igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x,
            var3
         );
      }
   }

   private static HttpURLConnection BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var0) {
      try {
         HttpURLConnection var1 = (HttpURLConnection)new URL(var0).openConnection();
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setRequestMethod("POST");
         var1.setRequestProperty("Authorization", "Client-ID d56be5d703108eb");
         var1.setReadTimeout(100000);
         var1.connect();
         return var1;
      } catch (UnknownHostException var3) {
         throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(
            igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
            var3
         );
      } catch (IOException var4) {
         throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(
            igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x,
            var4
         );
      }
   }

   private static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(HttpURLConnection var0, String var1) {
      try {
         OutputStreamWriter var2 = new OutputStreamWriter(var0.getOutputStream());
         var2.write(var1);
         var2.flush();
         var2.close();
      } catch (IOException var4) {
         throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(
            igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x,
            var4
         );
      }
   }

   private static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(HttpURLConnection var0) {
      StringBuilder var1 = new StringBuilder();

      try {
         if (var0.getResponseCode()
            != igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
               .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()) {
            throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(var0.getResponseCode());
         }

         BufferedReader var2 = new BufferedReader(new InputStreamReader(var0.getInputStream()));

         String var3;
         while ((var3 = var2.readLine()) != null) {
            var1.append(var3);
         }

         var2.close();
      } catch (IOException var4) {
         throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(
            igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x,
            var4
         );
      }

      if (var1.toString().equals("")) {
         throw new ItUnwUlcyHrkulamurBsueefhn3RJMgT1MsnnxC2MeuwdYhTPDksVzUgwMUtpCGX7c5U4MqzkSwdzoALQNZCpW5EreioRKs6SXXX(
            igSCKCY3aZamYd98bMikLBJA64GrTtXjkqjfMHbA6QPWQQI6FSv9jRycO0VXlhfuYlnPYgxblxmkGvjR4VLX2DdivwtRKimfmZz.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         );
      } else {
         return var1.toString();
      }
   }
}
