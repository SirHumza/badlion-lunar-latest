import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD {
   protected final String BatModClient;
   protected final String Button;

   protected p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(int var1, String... var2) {
      this.BatModClient = StringUtils.isEmpty(var2[0])
         ? "minecraft"
         : var2[0].toLowerCase();
      this.Button = var2[1];
      Validate.notNull(this.Button);
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(String var1) {
      this(0, Button(var1));
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(String var1, String var2) {
      this(0, var1, var2);
   }

   protected static String[] Button(String var0) {
      String[] var1 = new String[]{null, var0};
      int var2 = var0.indexOf(58);
      if (var2 >= 0) {
         var1[1] = var0.substring(var2 + 1, var0.length());
         if (var2 > 1) {
            var1[0] = var0.substring(0, var2);
         }
      }

      return var1;
   }

   public String Button() {
      return this.Button;
   }

   public String CustomSpinner() {
      return this.BatModClient;
   }

   @Override
   public String toString() {
      return this.BatModClient
         + ':'
         + this.Button;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)) {
         return false;
      }

      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var1;
      return this.BatModClient
            .equals(var2.BatModClient)
         && this.Button
            .equals(var2.Button);
   }

   @Override
   public int hashCode() {
      return 31 * this.BatModClient.hashCode()
         + this.Button.hashCode();
   }
}
