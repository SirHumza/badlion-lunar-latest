package shadersmod.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
   extends shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa {
   private static final Pattern ButtonAction = Pattern.compile(
      "^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$"
   );
   private static final Pattern Spinner = Pattern.compile(
      "^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$"
   );

   public GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj(
      String var1, String var2, String var3, String var4
   ) {
      super(var1, var2, var3, new String[]{"true", "false"}, var3, var4);
   }

   @Override
   public String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      return BatModProgressBar(
            this.ButtonAction()
         )
         ? "#define " + this.BatModClient() + " // Shader option ON"
         : "//#define " + this.BatModClient() + " // Shader option OFF";
   }

   @Override
   public String ButtonAction(String var1) {
      return BatModProgressBar(var1)
         ? FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
         : FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
   }

   @Override
   public String Spinner(String var1) {
      return BatModProgressBar(var1) ? "§a" : "§c";
   }

   public static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa BatModClient(
      String var0, String var1
   ) {
      Matcher var2 = ButtonAction.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var4 != null && var4.length() > 0) {
            boolean var6 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               (Object)var3, (Object)"//"
            );
            boolean var7 = !var6;
            var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
               var1, "/shaders/"
            );
            return new shadersmod.client.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj(
               var4, var5, String.valueOf(var7), var1
            );
         } else {
            return null;
         }
      }
   }

   @Override
   public boolean Checkbox(String var1) {
      Matcher var2 = ButtonAction.matcher(var1);
      if (!var2.matches()) {
         return false;
      }

      String var3 = var2.group(2);
      return var3.matches(this.BatModClient());
   }

   @Override
   public boolean aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      return true;
   }

   @Override
   public boolean ProgressBar(String var1) {
      Matcher var2 = Spinner.matcher(var1);
      if (var2.matches()) {
         String var3 = var2.group(2);
         if (var3.equals(this.BatModClient())) {
            return true;
         }
      }

      return false;
   }

   public static boolean BatModProgressBar(String var0) {
      return Boolean.valueOf(var0);
   }
}
