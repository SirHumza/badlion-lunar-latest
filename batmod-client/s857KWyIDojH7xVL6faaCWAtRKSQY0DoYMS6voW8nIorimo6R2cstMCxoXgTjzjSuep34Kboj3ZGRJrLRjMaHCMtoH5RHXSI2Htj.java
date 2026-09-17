import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj {
   protected static final List BatModClient = new ArrayList();
   private final String Button;
   private final String CustomSpinner;
   private final CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 ButtonAction;
   private final Color Spinner;

   static void BatModClient() {
      nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.Button(
         BatModClient.Button
            ? "http://localhost:8080/roles"
            : "https://api.batmod.com/roles",
         var0 -> {
            for (JsonElement var3 : (JsonArray)var0) {
               JsonObject var4 = (JsonObject)var3;
               if (var4.has("identifier") && var4.has("display_name") && var4.has("group") && var4.has("color")) {
                  String var5 = var4.get("identifier").getAsString();
                  String var6 = var4.get("display_name").getAsString();
                  String var7 = var4.get("group").getAsString();
                  int var8 = var4.get("color").getAsInt();
                  CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 var9 = CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0.BatModClient(
                     var7
                  );
                  if (var9 != null) {
                     new s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj(var5, var6, var9, new Color(var8));
                  }
               }
            }
         }
      );
   }

   public static s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj[] Button() {
      return BatModClient.toArray(
         new s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj[0]
      );
   }

   public static String[] CustomSpinner() {
      return BatModClient.stream()
         .map(
            s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj::ButtonAction
         )
         .toArray(String[]::new);
   }

   public static s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj BatModClient(
      String var0
   ) {
      return BatModClient.stream()
         .filter(var1 -> var1.ButtonAction().equalsIgnoreCase(var0))
         .findFirst()
         .orElse(null);
   }

   private s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj(
      String var1, String var2, CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 var3, Color var4
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

   public CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 Checkbox() {
      return this.ButtonAction;
   }

   public Color ProgressBar() {
      return this.Spinner;
   }

   public String BatModProgressBar() {
      return "§fBAT§lMOD §r§l" + this.Spinner();
   }

   @Override
   public String toString() {
      return this.Button;
   }
}
