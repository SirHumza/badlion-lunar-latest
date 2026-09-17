import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class zjWzRP3AxPeE17fCkVkiYXl2etu9y2YqFfZlsEnVBoYLcOsespyLIJ6aqzEuA7vmUjjxFb44YmeLj7fkLMA4tM1xuJnFIu8WjV1 {
   private static final Pattern BatModClient = Pattern.compile(
      "%(\\d+\\$)?[\\d\\.]*[df]"
   );
   private static final Splitter Button = Splitter.on('=')
      .limit(2);
   private static zjWzRP3AxPeE17fCkVkiYXl2etu9y2YqFfZlsEnVBoYLcOsespyLIJ6aqzEuA7vmUjjxFb44YmeLj7fkLMA4tM1xuJnFIu8WjV1 CustomSpinner = new zjWzRP3AxPeE17fCkVkiYXl2etu9y2YqFfZlsEnVBoYLcOsespyLIJ6aqzEuA7vmUjjxFb44YmeLj7fkLMA4tM1xuJnFIu8WjV1();
   private final Map ButtonAction = Maps.newHashMap();
   private long Spinner;

   public zjWzRP3AxPeE17fCkVkiYXl2etu9y2YqFfZlsEnVBoYLcOsespyLIJ6aqzEuA7vmUjjxFb44YmeLj7fkLMA4tM1xuJnFIu8WjV1() {
      try {
         InputStream var1 = zjWzRP3AxPeE17fCkVkiYXl2etu9y2YqFfZlsEnVBoYLcOsespyLIJ6aqzEuA7vmUjjxFb44YmeLj7fkLMA4tM1xuJnFIu8WjV1.class
            .getResourceAsStream("/assets/minecraft/lang/en_US.lang");

         for (String var3 : IOUtils.readLines(var1, Charsets.UTF_8)) {
            if (!var3.isEmpty() && var3.charAt(0) != '#') {
               String[] var4 = (String[])Iterables.toArray(
                  Button.split(var3), String.class
               );
               if (var4 != null && var4.length == 2) {
                  String var5 = var4[0];
                  String var6 = BatModClient.matcher(var4[1])
                     .replaceAll("%$1s");
                  this.ButtonAction.put(var5, var6);
               }
            }
         }

         this.Spinner = System.currentTimeMillis();
      } catch (IOException var7) {
      }
   }

   static zjWzRP3AxPeE17fCkVkiYXl2etu9y2YqFfZlsEnVBoYLcOsespyLIJ6aqzEuA7vmUjjxFb44YmeLj7fkLMA4tM1xuJnFIu8WjV1 BatModClient() {
      return CustomSpinner;
   }

   public static synchronized void BatModClient(Map var0) {
      CustomSpinner.ButtonAction
         .clear();
      CustomSpinner.ButtonAction
         .putAll(var0);
      CustomSpinner.Spinner = System.currentTimeMillis();
   }

   public synchronized String BatModClient(String var1) {
      return this.CustomSpinner(var1);
   }

   public synchronized String BatModClient(String var1, Object... var2) {
      String var3 = this.CustomSpinner(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   private String CustomSpinner(String var1) {
      String var2 = (String)this.ButtonAction.get(var1);
      return var2 == null ? var1 : var2;
   }

   public synchronized boolean Button(String var1) {
      return this.ButtonAction.containsKey(var1);
   }

   public long Button() {
      return this.Spinner;
   }
}
