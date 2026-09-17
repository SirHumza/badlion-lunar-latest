import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class O0Lad1hAOHNJ5NfiQgxwVmZZKugltriiy1EGbdw3J43QdK7TOZAfY96BBekzgHil1HLaQ1Dq0IhTBnAOtXqScS7sXfbu25sSIBSV
   extends lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C {
   public static final SimpleDateFormat BatModClient = new SimpleDateFormat(
      "yyyy-MM-dd HH:mm:ss Z"
   );
   protected final Date Button;
   protected final String CustomSpinner;
   protected final Date ButtonAction;
   protected final String Spinner;

   public O0Lad1hAOHNJ5NfiQgxwVmZZKugltriiy1EGbdw3J43QdK7TOZAfY96BBekzgHil1HLaQ1Dq0IhTBnAOtXqScS7sXfbu25sSIBSV(
      Object var1, Date var2, String var3, Date var4, String var5
   ) {
      super(var1);
      this.Button = var2 == null ? new Date() : var2;
      this.CustomSpinner = var3 == null ? "(Unknown)" : var3;
      this.ButtonAction = var4;
      this.Spinner = var5 == null
         ? "Banned by an operator."
         : var5;
   }

   protected O0Lad1hAOHNJ5NfiQgxwVmZZKugltriiy1EGbdw3J43QdK7TOZAfY96BBekzgHil1HLaQ1Dq0IhTBnAOtXqScS7sXfbu25sSIBSV(Object var1, JsonObject var2) {
      super(var1, var2);

      Date var3;
      try {
         var3 = var2.has("created")
            ? BatModClient.parse(var2.get("created").getAsString())
            : new Date();
      } catch (ParseException var7) {
         var3 = new Date();
      }

      this.Button = var3;
      this.CustomSpinner = var2.has("source")
         ? var2.get("source").getAsString()
         : "(Unknown)";

      Date var4;
      try {
         var4 = var2.has("expires")
            ? BatModClient.parse(var2.get("expires").getAsString())
            : null;
      } catch (ParseException var6) {
         var4 = null;
      }

      this.ButtonAction = var4;
      this.Spinner = var2.has("reason")
         ? var2.get("reason").getAsString()
         : "Banned by an operator.";
   }

   public Date BatModClient() {
      return this.ButtonAction;
   }

   public String Button() {
      return this.Spinner;
   }

   @Override
   boolean CustomSpinner() {
      return this.ButtonAction == null
         ? false
         : this.ButtonAction.before(new Date());
   }

   @Override
   protected void BatModClient(JsonObject var1) {
      var1.addProperty(
         "created",
         BatModClient.format(
            this.Button
         )
      );
      var1.addProperty("source", this.CustomSpinner);
      var1.addProperty(
         "expires",
         this.ButtonAction == null
            ? "forever"
            : BatModClient.format(
               this.ButtonAction
            )
      );
      var1.addProperty("reason", this.Spinner);
   }
}
