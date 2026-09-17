import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public enum C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr {
   BatModClient("BLACK", '0', 0),
   Button("DARK_BLUE", '1', 1),
   CustomSpinner("DARK_GREEN", '2', 2),
   ButtonAction("DARK_AQUA", '3', 3),
   Spinner("DARK_RED", '4', 4),
   Checkbox("DARK_PURPLE", '5', 5),
   ProgressBar("GOLD", '6', 6),
   BatModProgressBar("GRAY", '7', 7),
   ColorChooser("DARK_GRAY", '8', 8),
   IntegerSpinner("BLUE", '9', 9),
   TextField("GREEN", 'a', 10),
   ColorTextPane("AQUA", 'b', 11),
   BatModInstallerMain("RED", 'c', 12),
   aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("LIGHT_PURPLE", 'd', 13),
   LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN("YELLOW", 'e', 14),
   G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr("WHITE", 'f', 15),
   iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF("OBFUSCATED", 'k', true),
   bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ("BOLD", 'l', true),
   RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB("STRIKETHROUGH", 'm', true),
   Downloader("UNDERLINE", 'n', true),
   InstallationLogger("ITALIC", 'o', true),
   RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM("RESET", 'r', -1);

   private static final Map K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = Maps.newHashMap();
   private static final Pattern ExitCode = Pattern.compile(
      "(?i)" + String.valueOf('§') + "[0-9A-FK-OR]"
   );
   private final String BatModJson;
   private final char z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP;
   private final boolean LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
   private final String xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
   private final int o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;

   private static String CustomSpinner(String var0) {
      return var0.toLowerCase().replaceAll("[^a-z]", "");
   }

   C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr(String var3, char var4, int var5) {
      this(var3, var4, false, var5);
   }

   C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr(String var3, char var4, boolean var5) {
      this(var3, var4, var5, -1);
   }

   C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr(String var3, char var4, boolean var5, int var6) {
      this.BatModJson = var3;
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = var4;
      this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = var5;
      this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = var6;
      this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = "§" + var4;
   }

   public int BatModClient() {
      return this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
   }

   public boolean Button() {
      return this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
   }

   public boolean CustomSpinner() {
      return !this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
         && this != RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
   }

   public String ButtonAction() {
      return this.name().toLowerCase();
   }

   @Override
   public String toString() {
      return this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
   }

   public static String BatModClient(String var0) {
      return var0 == null
         ? null
         : ExitCode.matcher(var0).replaceAll("");
   }

   public static C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr Button(
      String var0
   ) {
      return var0 == null
         ? null
         : (C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr)K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY.get(
            CustomSpinner(var0)
         );
   }

   public static C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr BatModClient(
      int var0
   ) {
      if (var0 < 0) {
         return RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
      }

      for (C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr var4 : values()) {
         if (var4.BatModClient() == var0) {
            return var4;
         }
      }

      return null;
   }

   public static Collection BatModClient(boolean var0, boolean var1) {
      ArrayList var2 = Lists.newArrayList();

      for (C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr var6 : values()) {
         if ((!var6.CustomSpinner() || var0)
            && (!var6.Button() || var1)) {
            var2.add(var6.ButtonAction());
         }
      }

      return var2;
   }

   static {
      for (C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr var3 : values()) {
         K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY.put(
            CustomSpinner(
               var3.BatModJson
            ),
            var3
         );
      }
   }
}
