package shadersmod.client;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
   extends shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa {
   private static final Pattern ButtonAction = Pattern.compile(
      "^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$"
   );

   public f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(
      String var1, String var2, String var3, String[] var4, String var5
   ) {
      super(var1, var2, var3, var4, var3, var5);
      this.Button(
         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr().length > 1
      );
   }

   @Override
   public String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      return "#define "
         + this.BatModClient()
         + " "
         + this.ButtonAction()
         + " // Shader option "
         + this.ButtonAction();
   }

   @Override
   public String Spinner(String var1) {
      return "§a";
   }

   @Override
   public boolean Checkbox(String var1) {
      Matcher var2 = ButtonAction.matcher(var1);
      if (!var2.matches()) {
         return false;
      }

      String var3 = var2.group(1);
      return var3.matches(this.BatModClient());
   }

   public static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa BatModClient(
      String var0, String var1
   ) {
      Matcher var2 = ButtonAction.matcher(var0);
      if (!var2.matches()) {
         return null;
      }

      String var3 = var2.group(1);
      String var4 = var2.group(2);
      String var5 = var2.group(3);
      String var6 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.CustomSpinner(
         var5, "[", "]"
      );
      if (var6 != null && var6.length() > 0) {
         var5 = var5.replace(var6, "").trim();
      }

      String[] var7 = Button(var4, var6);
      if (var3 != null && var3.length() > 0) {
         var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
            var1, "/shaders/"
         );
         return new shadersmod.client.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(
            var3, var5, var4, var7, var1
         );
      } else {
         return null;
      }
   }

   public static String[] Button(String var0, String var1) {
      String[] var2 = new String[]{var0};
      if (var1 == null) {
         return var2;
      }

      var1 = var1.trim();
      var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
         var1, "["
      );
      var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.Spinner(
         var1, "]"
      );
      var1 = var1.trim();
      if (var1.length() <= 0) {
         return var2;
      }

      String[] var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var1, " "
      );
      if (var3.length <= 0) {
         return var2;
      }

      if (!Arrays.asList(var3).contains(var0)) {
         var3 = (String[])xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var3, var0, 0
         );
      }

      return var3;
   }
}
