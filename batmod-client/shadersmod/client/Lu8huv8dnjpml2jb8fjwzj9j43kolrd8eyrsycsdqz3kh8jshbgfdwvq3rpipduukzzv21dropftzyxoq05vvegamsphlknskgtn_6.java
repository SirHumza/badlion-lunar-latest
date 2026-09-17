package shadersmod.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
   extends shadersmod.client.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj {
   private static final Pattern ButtonAction = Pattern.compile(
      "^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$"
   );

   public OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF(
      String var1, String var2, String var3, String var4
   ) {
      super(var1, var2, var3, var4);
   }

   @Override
   public String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      return "const bool "
         + this.BatModClient()
         + " = "
         + this.ButtonAction()
         + "; // Shader option "
         + this.ButtonAction();
   }

   public static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa Button(
      String var0, String var1
   ) {
      Matcher var2 = ButtonAction.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var3 != null && var3.length() > 0) {
            var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
               var1, "/shaders/"
            );
            shadersmod.client.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF var6 = new shadersmod.client.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF(
               var3, var5, var4, var1
            );
            var6.Button(false);
            return var6;
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

      String var3 = var2.group(1);
      return var3.matches(this.BatModClient());
   }

   @Override
   public boolean aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      return false;
   }
}
