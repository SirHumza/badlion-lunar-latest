import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F {
   private static final Pattern BatModClient = Pattern.compile(
      "(?i)\\u00A7[0-9A-FK-OR]"
   );

   public static String BatModClient(int var0) {
      int var1 = var0 / 20;
      int var2 = var1 / 60;
      var1 %= 60;
      return var1 < 10 ? var2 + ":0" + var1 : var2 + ":" + var1;
   }

   public static String BatModClient(String var0) {
      return BatModClient.matcher(var0).replaceAll("");
   }

   public static boolean Button(String var0) {
      return StringUtils.isEmpty(var0);
   }
}
