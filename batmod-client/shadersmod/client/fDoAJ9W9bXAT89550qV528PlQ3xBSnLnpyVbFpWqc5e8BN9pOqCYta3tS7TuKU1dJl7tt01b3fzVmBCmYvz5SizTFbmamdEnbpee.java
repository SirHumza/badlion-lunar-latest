package shadersmod.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
   extends shadersmod.client.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb {
   private String ButtonAction = null;
   private static final Pattern Spinner = Pattern.compile(
      "^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$"
   );

   public fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee(
      String var1, String var2, String var3, String var4, String[] var5, String var6
   ) {
      super(var1, var3, var4, var5, var6);
      this.ButtonAction = var2;
   }

   @Override
   public String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      return "const "
         + this.ButtonAction
         + " "
         + this.BatModClient()
         + " = "
         + this.ButtonAction()
         + "; // Shader option "
         + this.ButtonAction();
   }

   @Override
   public boolean Checkbox(String var1) {
      Matcher var2 = Spinner.matcher(var1);
      if (!var2.matches()) {
         return false;
      }

      String var3 = var2.group(2);
      return var3.matches(this.BatModClient());
   }

   public static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa CustomSpinner(
      String var0, String var1
   ) {
      Matcher var2 = Spinner.matcher(var0);
      if (!var2.matches()) {
         return null;
      }

      String var3 = var2.group(1);
      String var4 = var2.group(2);
      String var5 = var2.group(3);
      String var6 = var2.group(4);
      String var7 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.CustomSpinner(
         var6, "[", "]"
      );
      if (var7 != null && var7.length() > 0) {
         var6 = var6.replace(var7, "").trim();
      }

      String[] var8 = Button(var5, var7);
      if (var4 != null && var4.length() > 0) {
         var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
            var1, "/shaders/"
         );
         return new shadersmod.client.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee(
            var4, var3, var6, var5, var8, var1
         );
      } else {
         return null;
      }
   }
}
