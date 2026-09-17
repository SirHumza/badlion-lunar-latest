import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 {
   protected static final List BatModClient = new ArrayList();
   private final String Button;
   private final String CustomSpinner;
   private final boolean ButtonAction;
   private final Color Spinner;

   public static void BatModClient() {
      nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.Button(
         BatModClient.Button
            ? "http://localhost:8080/groups"
            : "https://api.batmod.com/groups",
         var0 -> {
            for (JsonElement var3 : (JsonArray)var0) {
               JsonObject var4 = (JsonObject)var3;
               if (var4.has("identifier") && var4.has("display_name") && var4.has("staff")) {
                  String var5 = var4.get("identifier").getAsString();
                  String var6 = var4.get("display_name").getAsString();
                  boolean var7 = var4.get("staff").getAsBoolean();
                  new CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0(
                     var5, var6, var7, var4.has("color") ? new Color(var4.get("color").getAsInt()) : null
                  );
               }
            }

            s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj.BatModClient();
         }
      );
   }

   public static CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0[] Button() {
      return BatModClient.toArray(
         new CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0[0]
      );
   }

   public static String[] CustomSpinner() {
      return BatModClient.stream()
         .map(
            CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0::ButtonAction
         )
         .toArray(String[]::new);
   }

   public static CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 BatModClient(
      String var0
   ) {
      return BatModClient.stream()
         .filter(var1 -> var1.ButtonAction().equalsIgnoreCase(var0))
         .findFirst()
         .orElse(null);
   }

   private CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0(
      String var1, String var2, boolean var3, Color var4
   ) {
      this.Button = var1;
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
      this.Spinner = var4;
      BatModClient.add(this);
   }

   public String ButtonAction() {
      return this.Button;
   }

   public String Spinner() {
      return this.CustomSpinner;
   }

   public boolean Checkbox() {
      return this.ButtonAction;
   }

   public Color ProgressBar() {
      return this.Spinner;
   }

   @Override
   public String toString() {
      return this.Button;
   }
}
