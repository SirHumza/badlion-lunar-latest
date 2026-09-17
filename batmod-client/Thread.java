import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class EP7jCWbPCaQx4b1LyT9OPTRVDAmXyFyObv3ai9XLFf8TYGP5ADUjXLRHEvRHqRCXtNY4Epii5xzZi01CRq3fUy3VH5JHbBS5DavZ extends Thread {
   @Override
   public void run() {
      HttpURLConnection var1 = null;

      try {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            "Checking for new version"
         );
         URL var2 = new URL("http://optifine.net/version/1.8.8/HD_U.txt");
         var1 = (HttpURLConnection)var2.openConnection();
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae()
            .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ) {
            var1.setRequestProperty("OF-MC-Version", "1.8.8");
            var1.setRequestProperty(
               "OF-MC-Brand",
               ""
                  + HJ6qzi5iWIx6tixqqhRDiujyhYJXQCSYWOIW7fqyAndn4g1FWeDQqrIM1I3ZAHFhS91KuZ6uKGSNjfGoaOVNDDkyJM2WYqK8SFJ8.BatModClient()
            );
            var1.setRequestProperty("OF-Edition", "HD_U");
            var1.setRequestProperty("OF-Release", "H8");
            var1.setRequestProperty("OF-Java-Version", "" + System.getProperty("java.version"));
            var1.setRequestProperty(
               "OF-CpuCount",
               ""
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX()
            );
            var1.setRequestProperty(
               "OF-OpenGL-Version",
               ""
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Checkbox
            );
            var1.setRequestProperty(
               "OF-OpenGL-Vendor",
               ""
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModProgressBar
            );
         }

         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();

         try {
            InputStream var3 = var1.getInputStream();
            String var4 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               var3
            );
            var3.close();
            String[] var5 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               var4, "\n\r"
            );
            if (var5.length < 1) {
               return;
            }

            String var6 = var5[0].trim();
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               "Version found: " + var6
            );
            if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                  var6, "H8"
               )
               > 0) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Checkbox(
                  var6
               );
               return;
            }
         } finally {
            if (var1 != null) {
               var1.disconnect();
            }
         }
      } catch (Exception var11) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var11.getClass().getName() + ": " + var11.getMessage()
         );
      }
   }
}
