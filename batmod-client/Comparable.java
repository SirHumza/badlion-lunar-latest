import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AwZD3372Wu7ynyN9PkJbp3BxZY2JDnGv2ej0SXXPTftJXoZP36SrvOQoWAHzWcgLpyTl7aUXh6qUKil0mggc2ytkvJKFWQRHmjro implements Comparable {
   private final String BatModClient;
   private final String Button;
   private final String CustomSpinner;
   private final boolean ButtonAction;
   private final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD Spinner;
   private List Checkbox = new ArrayList();

   public AwZD3372Wu7ynyN9PkJbp3BxZY2JDnGv2ej0SXXPTftJXoZP36SrvOQoWAHzWcgLpyTl7aUXh6qUKil0mggc2ytkvJKFWQRHmjro(
      String var1, String var2, String var3, boolean var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      String var5 = this.BatModClient
         .substring(this.BatModClient.indexOf("_") + 1)
         .toLowerCase(Locale.ROOT);
      if (this.BatModClient.equals("sr_SP")) {
         var5 = "rs";
      }

      if (this.BatModClient.equals("en_PT")) {
         var5 = "pirate";
      }

      this.Spinner = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "batmod/flags/" + var5 + ".png"
      );
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
         .BatModClient(
            this.Spinner,
            new qHELC04VlnVcd80WVzOLVDZ5wgLMhtOULCiFdFuPPnMrmESeYtQhr1wVPqKmzqUuMGchXpqO2UIT88sH2l19iD0HrNpRhzXR6erB(
               this.Spinner
            )
         );

      for (NH6Z9w17OZ4tCqdtH18E2MG2pmxLsV38k540qSU7ey57EMgHaEba3BsUtrDQ2hQTfA7Iy3kuIWGBRL3gi27KLghrZMgBsA5XLj var9 : NH6Z9w17OZ4tCqdtH18E2MG2pmxLsV38k540qSU7ey57EMgHaEba3BsUtrDQ2hQTfA7Iy3kuIWGBRL3gi27KLghrZMgBsA5XLj.values()) {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var10 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
            var9.Button()
               + "/"
               + this.BatModClient
               + "."
               + var9.CustomSpinner()
         );
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY()
            .Button(var10)) {
            this.Checkbox.add(var9);
         } else {
            for (oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr var14 : xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf()) {
               if (var14.Button(var10)) {
                  this.Checkbox.add(var9);
                  break;
               }
            }
         }
      }
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.ButtonAction;
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD CustomSpinner() {
      return this.Spinner;
   }

   public List ButtonAction() {
      return this.Checkbox;
   }

   @Override
   public String toString() {
      return String.format(
         "%s (%s)",
         this.CustomSpinner,
         this.Button
      );
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : (
            !(var1 instanceof AwZD3372Wu7ynyN9PkJbp3BxZY2JDnGv2ej0SXXPTftJXoZP36SrvOQoWAHzWcgLpyTl7aUXh6qUKil0mggc2ytkvJKFWQRHmjro)
               ? false
               : this.BatModClient
                  .equals(
                     ((AwZD3372Wu7ynyN9PkJbp3BxZY2JDnGv2ej0SXXPTftJXoZP36SrvOQoWAHzWcgLpyTl7aUXh6qUKil0mggc2ytkvJKFWQRHmjro)var1).BatModClient
                  )
         );
   }

   @Override
   public int hashCode() {
      return this.BatModClient.hashCode();
   }

   public int BatModClient(
      AwZD3372Wu7ynyN9PkJbp3BxZY2JDnGv2ej0SXXPTftJXoZP36SrvOQoWAHzWcgLpyTl7aUXh6qUKil0mggc2ytkvJKFWQRHmjro var1
   ) {
      return this.BatModClient
         .compareTo(var1.BatModClient);
   }
}
