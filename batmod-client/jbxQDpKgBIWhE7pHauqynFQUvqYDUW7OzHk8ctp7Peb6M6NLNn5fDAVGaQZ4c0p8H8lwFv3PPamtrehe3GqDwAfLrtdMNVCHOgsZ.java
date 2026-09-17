import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;

public class jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ {
   private final dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK BatModClient;
   private final String Button;
   private final List CustomSpinner = Lists.newArrayList();
   private StackTraceElement[] ButtonAction = new StackTraceElement[0];

   public jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ(
      dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK var1, String var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public static String BatModClient(
      double var0, double var2, double var4
   ) {
      return String.format(
         "%.2f,%.2f,%.2f - %s",
         var0,
         var2,
         var4,
         BatModClient(
            new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var0, var2, var4)
         )
      );
   }

   public static String BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var0
   ) {
      int var1 = var0.BatModProgressBar();
      int var2 = var0.ColorChooser();
      int var3 = var0.IntegerSpinner();
      StringBuilder var4 = new StringBuilder();

      try {
         var4.append(String.format("World: (%d,%d,%d)", var1, var2, var3));
      } catch (Throwable var17) {
         var4.append("(Error finding world loc)");
      }

      var4.append(", ");

      try {
         int var5 = var1 >> 4;
         int var6 = var3 >> 4;
         int var7 = var1 & 15;
         int var8 = var2 >> 4;
         int var9 = var3 & 15;
         int var10 = var5 << 4;
         int var11 = var6 << 4;
         int var12 = (var5 + 1 << 4) - 1;
         int var13 = (var6 + 1 << 4) - 1;
         var4.append(
            String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", var7, var8, var9, var5, var6, var10, var11, var12, var13)
         );
      } catch (Throwable var16) {
         var4.append("(Error finding chunk loc)");
      }

      var4.append(", ");

      try {
         int var18 = var1 >> 9;
         int var19 = var3 >> 9;
         int var20 = var18 << 5;
         int var21 = var19 << 5;
         int var22 = (var18 + 1 << 5) - 1;
         int var23 = (var19 + 1 << 5) - 1;
         int var24 = var18 << 9;
         int var25 = var19 << 9;
         int var26 = (var18 + 1 << 9) - 1;
         int var14 = (var19 + 1 << 9) - 1;
         var4.append(
            String.format(
               "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)",
               var18,
               var19,
               var20,
               var21,
               var22,
               var23,
               var24,
               var25,
               var26,
               var14
            )
         );
      } catch (Throwable var15) {
         var4.append("(Error finding world loc)");
      }

      return var4.toString();
   }

   public void BatModClient(String var1, Callable var2) {
      try {
         this.BatModClient(var1, var2.call());
      } catch (Throwable var4) {
         this.BatModClient(var1, var4);
      }
   }

   public void BatModClient(String var1, Object var2) {
      this.CustomSpinner
         .add(new A93dHZtg3GtHS5VErCikRQs9u6gXMlCMY90mQUis2rh0uu0AXFO8ivgHi5tNOzHxjsD7r1CPXrQLYbRuXZ74NZuQxJm1OdtjNDjp(var1, var2));
   }

   public void BatModClient(String var1, Throwable var2) {
      this.BatModClient(var1, (Object)var2);
   }

   public int BatModClient(int var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      if (var2.length <= 0) {
         return 0;
      }

      this.ButtonAction = new StackTraceElement[var2.length - 3 - var1];
      System.arraycopy(
         var2,
         3 + var1,
         this.ButtonAction,
         0,
         this.ButtonAction.length
      );
      return this.ButtonAction.length;
   }

   public boolean BatModClient(
      StackTraceElement var1, StackTraceElement var2
   ) {
      if (this.ButtonAction.length != 0 && var1 != null) {
         StackTraceElement var3 = this.ButtonAction[0];
         if (var3.isNativeMethod() == var1.isNativeMethod()
            && var3.getClassName().equals(var1.getClassName())
            && var3.getFileName().equals(var1.getFileName())
            && var3.getMethodName().equals(var1.getMethodName())) {
            if (var2 != null != this.ButtonAction.length > 1) {
               return false;
            }

            if (var2 != null && !this.ButtonAction[1].equals(var2)) {
               return false;
            }

            this.ButtonAction[0] = var1;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void Button(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.ButtonAction.length
         - var1];
      System.arraycopy(this.ButtonAction, 0, var2, 0, var2.length);
      this.ButtonAction = var2;
   }

   public void BatModClient(StringBuilder var1) {
      var1.append("-- ").append(this.Button).append(" --\n");
      var1.append("Details:");

      for (A93dHZtg3GtHS5VErCikRQs9u6gXMlCMY90mQUis2rh0uu0AXFO8ivgHi5tNOzHxjsD7r1CPXrQLYbRuXZ74NZuQxJm1OdtjNDjp var3 : this.CustomSpinner) {
         var1.append("\n\t");
         var1.append(var3.BatModClient());
         var1.append(": ");
         var1.append(var3.Button());
      }

      if (this.ButtonAction != null
         && this.ButtonAction.length > 0) {
         var1.append("\nStacktrace:");

         for (StackTraceElement var5 : this.ButtonAction) {
            var1.append("\n\tat ");
            var1.append(var5.toString());
         }
      }
   }

   public StackTraceElement[] BatModClient() {
      return this.ButtonAction;
   }

   public static void BatModClient(
      jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var0,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var2,
      int var3
   ) {
      int var4 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
         var2
      );
      var0.BatModClient(
         "Block type", new RUqpPuiYUdoWB50NKqbP5mQn84urg4mEnxrUlKLuAcv9wNH9Ma2US0JDYRTkQYU76ulqRvR7lKNep6RPsREDUM1riOGgUZZBbqwm(var4, var2)
      );
      var0.BatModClient(
         "Block data value", new WNHuXIUQBrTQCXOi4Cw7REu7R5XcMtbbuG294knglxy19rcDZMdUlD7u49VnJHLEK7I7zWAjLib1hVrZLfiM2Nnc60JTwSZzXE5Q(var3)
      );
      var0.BatModClient(
         "Block location", new blg190SykCdVOgz0OwFOGMaFAl9Z9BPLddt3SAXYNvIf3BVdH5DkdOwI3Yf3E5BP9dK8BLYkpmuhWglBpLvgggEikejwHslD42Iv(var1)
      );
   }

   public static void BatModClient(
      jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var0,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var2
   ) {
      var0.BatModClient(
         "Block", new IwdGciISnz5AbZMJAOfdwPtbneKlS1Zd2i3zdeL9KIbS9ghlrE8wUr6VcrvCDXuhQDDKdmmLLaPvxfPjd6yzKgp6Xmy4m23o6i34(var2)
      );
      var0.BatModClient(
         "Block location", new kwQYopyYoOb3m7SMaEhylOa0CW7129q9C6SH17n8h5kKzC3LIHTnZvdLhGA2H6bLtilnmrgt72zc0oAk6hpnzrvAcbVG8mIPMDTY(var1)
      );
   }
}
